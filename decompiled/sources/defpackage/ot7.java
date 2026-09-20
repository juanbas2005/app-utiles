package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: ot7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ot7 extends qt7 {
    public final boolean c(long j, Object obj) {
        return this.a.getBoolean(obj, j);
    }

    public final byte d(long j, Object obj) {
        return this.a.getByte(obj, j);
    }

    public final double e(long j, Object obj) {
        return this.a.getDouble(obj, j);
    }

    public final float f(long j, Object obj) {
        return this.a.getFloat(obj, j);
    }

    public final void k(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public final void l(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    public final void m(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public final void n(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public final boolean r() {
        Class<Object> cls = Object.class;
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls2 = this.a.getClass();
            Class cls3 = Long.TYPE;
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            st7.a(th);
            return false;
        }
    }

    public final boolean s() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                if (st7.e() != null) {
                    try {
                        Class<?> cls4 = this.a.getClass();
                        cls4.getMethod("getByte", new Class[]{cls3});
                        cls4.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                        cls4.getMethod("getInt", new Class[]{cls3});
                        cls4.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                        cls4.getMethod("getLong", new Class[]{cls3});
                        cls4.getMethod("putLong", new Class[]{cls3, cls3});
                        cls4.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                        cls4.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                        return true;
                    } catch (Throwable th) {
                        st7.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                st7.a(th2);
            }
        }
        return false;
    }
}
