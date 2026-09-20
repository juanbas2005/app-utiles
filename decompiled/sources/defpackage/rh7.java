package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: rh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rh7 {
    public static final Object a;

    static {
        Object obj;
        Method method = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            obj = null;
        }
        a = obj;
        Class<Throwable> cls = Throwable.class;
        if (obj != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod("getStackTraceElement", new Class[]{cls, Integer.TYPE});
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
        }
        if (obj != null) {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod("getStackTraceDepth", new Class[]{cls});
            } catch (ThreadDeath e3) {
                throw e3;
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused3) {
                return;
            } catch (Throwable unused4) {
            }
            if (method != null) {
                method.invoke(obj, new Object[]{new Throwable()});
            }
        }
    }
}
