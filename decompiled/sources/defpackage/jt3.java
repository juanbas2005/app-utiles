package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jt3 {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public jt3(int i) {
        this.c = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        boolean z;
        String a2 = a(this.c, "com.crashlytics.version-control-info");
        if (this.a.size() >= this.b) {
            if (!this.a.containsKey(a2)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.b, (Throwable) null);
                return false;
            }
        }
        String a3 = a(this.c, str);
        String str2 = (String) this.a.get(a2);
        if (str2 != null) {
            z = str2.equals(a3);
        } else if (a3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        this.a.put(a2, a3);
        return true;
    }

    public final synchronized void c(Map map) {
        String str;
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (str2 != null) {
                    String a2 = a(this.c, str2);
                    if (this.a.size() >= this.b) {
                        if (!this.a.containsKey(a2)) {
                            i++;
                        }
                    }
                    String str3 = (String) entry.getValue();
                    HashMap hashMap = this.a;
                    if (str3 == null) {
                        str = "";
                    } else {
                        str = a(this.c, str3);
                    }
                    hashMap.put(a2, str);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b, (Throwable) null);
            }
        } finally {
            while (true) {
            }
        }
    }
}
