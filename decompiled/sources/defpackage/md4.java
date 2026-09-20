package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: md4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class md4 {
    public long a;
    public final Object b;
    public final Object c;

    public md4(uq8 uq8, String str, long j) {
        this.c = uq8;
        z65.h(str);
        this.b = str;
        this.a = uq8.z1("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1);
    }

    public static String b(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static md4 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new md4(0, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new md4(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public void a(long j, long j2) {
        ((z38) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((z38) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public List d() {
        List list;
        uq8 uq8 = (uq8) this.c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.b;
        Cursor cursor = null;
        try {
            cursor = uq8.T1().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.a)}, (String) null, (String) null, "rowid", "1000");
            if (cursor.moveToFirst()) {
                do {
                    boolean z = false;
                    long j = cursor.getLong(0);
                    long j2 = cursor.getLong(3);
                    if (cursor.getLong(5) == 1) {
                        z = true;
                    }
                    long j3 = cursor.getLong(6);
                    byte[] blob = cursor.getBlob(4);
                    long j4 = j3;
                    if (j > this.a) {
                        this.a = j;
                    }
                    try {
                        f19 f19 = (f19) y89.N1(h19.J(), blob);
                        String string = cursor.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        f19.n(string);
                        long j5 = cursor.getLong(2);
                        f19.b();
                        ((h19) f19.x).Q(j5);
                        f19.b();
                        ((h19) f19.x).t(j4);
                        arrayList.add(new oq8(j, j2, z, (h19) f19.d()));
                    } catch (IOException e) {
                        pz8 pz8 = ((y19) uq8.w).B;
                        y19.g(pz8);
                        pz8.B.c(pz8.k1(str), e, "Data loss. Failed to merge raw event. appId");
                    }
                } while (cursor.moveToNext());
                list = arrayList;
            } else {
                list = Collections.EMPTY_LIST;
            }
        } catch (SQLiteException e2) {
            pz8 pz82 = ((y19) uq8.w).B;
            y19.g(pz82);
            pz82.B.c(pz8.k1(str), e2, "Data loss. Error querying raw events batch. appId");
            list = arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public md4(uq8 uq8, String str) {
        this.c = uq8;
        z65.h(str);
        this.b = str;
        this.a = -1;
    }

    public md4() {
        this.b = new z38();
        this.c = new z38();
    }

    public md4(long j, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
