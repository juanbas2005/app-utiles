package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: lq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lq2 {
    public static final zt6 b = new zt6(0);
    public final /* synthetic */ rq2 a;

    public lq2(rq2 rq2) {
        this.a = rq2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        zt6 zt6 = b;
        zt6 zt62 = (zt6) zt6.get(classLoader);
        if (zt62 == null) {
            zt62 = new zt6(0);
            zt6.put(classLoader, zt62);
        }
        Class cls = (Class) zt62.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        zt62.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(f21.h("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new RuntimeException(f21.h("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    public final bq2 a(String str) {
        try {
            return (bq2) c(this.a.w.M.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e) {
            throw new RuntimeException(f21.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(f21.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(f21.h("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(f21.h("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
