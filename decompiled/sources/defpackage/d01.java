package defpackage;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d01  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d01 {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();

    public d01(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [c01, java.lang.Object] */
    public final c01 a() {
        ? obj;
        synchronized (this.c) {
            int i = this.a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.a.getLong("backoff_end_time_in_millis", -1));
            obj = new Object();
            obj.a = i;
            obj.b = date;
        }
        return obj;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [c01, java.lang.Object] */
    public final c01 c() {
        ? obj;
        synchronized (this.d) {
            int i = this.a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1));
            obj = new Object();
            obj.a = i;
            obj.b = date;
        }
        return obj;
    }

    public final void d(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
