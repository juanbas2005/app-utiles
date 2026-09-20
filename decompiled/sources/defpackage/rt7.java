package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: rt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rt7 {
    public final Unsafe a;

    public rt7(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z);

    public abstract void k(Object obj, long j, byte b);

    public abstract void l(Object obj, long j, double d);

    public abstract void m(Object obj, long j, float f);

    public final void n(int i, long j, Object obj) {
        this.a.putInt(obj, j, i);
    }

    public final void o(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            return true;
        } catch (Throwable th) {
            tt7.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
