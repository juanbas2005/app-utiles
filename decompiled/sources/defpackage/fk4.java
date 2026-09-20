package defpackage;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fk4 {
    public static final Charset b = Charset.forName("UTF-8");
    public final md2 a;

    public fk4(md2 md2) {
        this.a = md2;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                ji8 ji8 = u86.a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new k10(string2, string3, string4, string5, j));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(u86.a.u(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), (Throwable) null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            String absolutePath = file.getAbsolutePath();
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + absolutePath + "\nReason: " + str, (Throwable) null);
        }
    }

    public final Map c(String str, boolean z) {
        File file;
        FileInputStream fileInputStream;
        Exception e;
        md2 md2 = this.a;
        if (z) {
            file = md2.c(str, "internal-keys");
        } else {
            file = md2.c(str, "keys");
        }
        if (!file.exists() || file.length() == 0) {
            g(file, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                HashMap a2 = a(su0.P(fileInputStream));
                su0.h(fileInputStream, "Failed to close user metadata file.");
                return a2;
            } catch (Exception e2) {
                e = e2;
                try {
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    f(file);
                    su0.h(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    su0.h(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            f(file);
            su0.h(fileInputStream, "Failed to close user metadata file.");
            return Collections.EMPTY_MAP;
        } catch (Throwable th2) {
            th = th2;
            su0.h(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File c = this.a.c(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            String y = b81.y("No userId set for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", y, (Throwable) null);
            }
            f(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                JSONObject jSONObject = new JSONObject(su0.P(fileInputStream));
                if (!jSONObject.isNull("userId")) {
                    str2 = jSONObject.optString("userId", (String) null);
                } else {
                    str2 = null;
                }
                String str3 = "Loaded userId " + str2 + " for session " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str3, (Throwable) null);
                }
                su0.h(fileInputStream, "Failed to close user metadata file.");
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    f(c);
                    su0.h(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    su0.h(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            f(c);
            su0.h(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            su0.h(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void h(String str, Map map, boolean z) {
        File file;
        BufferedWriter bufferedWriter;
        Exception e;
        md2 md2 = this.a;
        if (z) {
            file = md2.c(str, "internal-keys");
        } else {
            file = md2.c(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            String jSONObject = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), b));
            try {
                bufferedWriter.write(jSONObject);
                bufferedWriter.flush();
                su0.h(bufferedWriter, "Failed to close key/value metadata file.");
            } catch (Exception e2) {
                e = e2;
                try {
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(file);
                    su0.h(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    su0.h(bufferedWriter2, "Failed to close key/value metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(file);
            su0.h(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            su0.h(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void i(String str, List list) {
        Exception e;
        BufferedWriter bufferedWriter;
        File c = this.a.c(str, "rollouts-state");
        if (list.isEmpty()) {
            g(c, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            String e2 = e(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
            try {
                bufferedWriter.write(e2);
                bufferedWriter.flush();
                su0.h(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e3) {
                e = e3;
                try {
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    f(c);
                    su0.h(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    su0.h(bufferedWriter2, "Failed to close rollouts state file.");
                    throw th;
                }
            }
        } catch (Exception e4) {
            bufferedWriter = null;
            e = e4;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            f(c);
            su0.h(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            su0.h(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }
}
