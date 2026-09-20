package defpackage;

import java.lang.reflect.Method;

/* renamed from: cl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cl8 {
    public static final Method a;

    static {
        Class<String> cls = String.class;
        Method method = null;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            method = cls2.getMethod("get", new Class[]{cls, cls});
            cls2.getMethod("getInt", new Class[]{cls, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Boolean.TYPE});
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            a = method;
            throw th;
        }
        a = method;
    }
}
