package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: jn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jn8 {
    public static final Unsafe a;
    public static final Class b = Memory.class;
    public static final in8 c;
    public static final boolean d;
    public static final long e = ((long) p(byte[].class));
    public static final boolean f;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x013c  */
    static {
        boolean z;
        Field a2;
        in8 in8;
        Class<Class> cls = Class.class;
        Unsafe l = l();
        a = l;
        int i = rk8.a;
        Class cls2 = Long.TYPE;
        boolean m = m(cls2);
        Class cls3 = Integer.TYPE;
        boolean m2 = m(cls3);
        in8 in82 = null;
        if (l != null) {
            if (m) {
                in82 = new in8(l);
            } else if (m2) {
                in82 = new in8(l);
            }
        }
        c = in82;
        Class<jn8> cls4 = jn8.class;
        Class<Field> cls5 = Field.class;
        Class<Object> cls6 = Object.class;
        if (in82 != null) {
            try {
                Class<?> cls7 = ((Unsafe) in82.w).getClass();
                cls7.getMethod("objectFieldOffset", new Class[]{cls5});
                cls7.getMethod("getLong", new Class[]{cls6, cls2});
                a();
            } catch (Throwable th) {
                Logger.getLogger(cls4.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        in8 in83 = c;
        boolean z2 = true;
        if (in83 != null) {
            try {
                Class<?> cls8 = ((Unsafe) in83.w).getClass();
                cls8.getMethod("objectFieldOffset", new Class[]{cls5});
                cls8.getMethod("arrayBaseOffset", new Class[]{cls});
                cls8.getMethod("arrayIndexScale", new Class[]{cls});
                cls8.getMethod("getInt", new Class[]{cls6, cls2});
                cls8.getMethod("putInt", new Class[]{cls6, cls2, cls3});
                cls8.getMethod("getLong", new Class[]{cls6, cls2});
                cls8.getMethod("putLong", new Class[]{cls6, cls2, cls2});
                cls8.getMethod("getObject", new Class[]{cls6, cls2});
                cls8.getMethod("putObject", new Class[]{cls6, cls2, cls6});
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(cls4.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
            d = z;
            Class<boolean[]> cls9 = boolean[].class;
            p(cls9);
            q(cls9);
            Class<int[]> cls10 = int[].class;
            p(cls10);
            q(cls10);
            Class<long[]> cls11 = long[].class;
            p(cls11);
            q(cls11);
            Class<float[]> cls12 = float[].class;
            p(cls12);
            q(cls12);
            Class<double[]> cls13 = double[].class;
            p(cls13);
            q(cls13);
            Class<Object[]> cls14 = Object[].class;
            p(cls14);
            q(cls14);
            a2 = a();
            if (!(a2 == null || (in8 = c) == null)) {
                ((Unsafe) in8.w).objectFieldOffset(a2);
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                z2 = false;
            }
            f = z2;
        }
        z = false;
        d = z;
        Class<boolean[]> cls92 = boolean[].class;
        p(cls92);
        q(cls92);
        Class<int[]> cls102 = int[].class;
        p(cls102);
        q(cls102);
        Class<long[]> cls112 = long[].class;
        p(cls112);
        q(cls112);
        Class<float[]> cls122 = float[].class;
        p(cls122);
        q(cls122);
        Class<double[]> cls132 = double[].class;
        p(cls132);
        q(cls132);
        Class<Object[]> cls142 = Object[].class;
        p(cls142);
        q(cls142);
        a2 = a();
        ((Unsafe) in8.w).objectFieldOffset(a2);
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f = z2;
    }

    public static Field a() {
        Field field;
        Field field2;
        int i = rk8.a;
        Class<Buffer> cls = Buffer.class;
        try {
            field = cls.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void b(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.w;
        long j2 = -4 & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.w;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static Object d(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(long j, Object obj) {
        return ((Unsafe) c.w).getInt(obj, j);
    }

    public static void f(int i, long j, Object obj) {
        ((Unsafe) c.w).putInt(obj, j, i);
    }

    public static long g(long j, Object obj) {
        return ((Unsafe) c.w).getLong(obj, j);
    }

    public static void h(Object obj, long j, long j2) {
        ((Unsafe) c.w).putLong(obj, j, j2);
    }

    public static Object i(long j, Object obj) {
        return ((Unsafe) c.w).getObject(obj, j);
    }

    public static void j(Object obj, long j, Object obj2) {
        ((Unsafe) c.w).putObject(obj, j, obj2);
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.U0(bArr, e + j, b2);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new Object());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(jn8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean m(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = rk8.a;
        try {
            Class cls3 = b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean n(long j, Object obj) {
        if (((byte) ((((Unsafe) c.w).getInt(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean o(long j, Object obj) {
        if (((byte) ((((Unsafe) c.w).getInt(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static int p(Class cls) {
        if (d) {
            return ((Unsafe) c.w).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void q(Class cls) {
        if (d) {
            ((Unsafe) c.w).arrayIndexScale(cls);
        }
    }
}
