package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: pg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pg {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<d45> cls = d45.class;
        Package packageR = cls.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(cls.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(i33.class.getName(), "okhttp.Http2");
        linkedHashMap.put(bc7.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = sf4.b0(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) b.get(str);
        if (str3 == null) {
            str3 = d57.i1(23, str);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int F0 = d57.F0(str2, 10, i2, 4);
                if (F0 == -1) {
                    F0 = length;
                }
                while (true) {
                    min = Math.min(F0, i2 + 4000);
                    Log.println(i, str3, str2.substring(i2, min));
                    if (min >= F0) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(qg.a);
        }
    }
}
