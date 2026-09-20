package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: st7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class st7 {
    public static final Unsafe a;
    public static final Class b = fd.a;
    public static final qt7 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f = ((long) c(byte[].class));
    public static final boolean g;

    static {
        boolean z;
        boolean z2;
        Unsafe j = j();
        a = j;
        boolean f2 = f(Long.TYPE);
        boolean f3 = f(Integer.TYPE);
        boolean z3 = true;
        qt7 qt7 = null;
        if (j != null) {
            if (!fd.a()) {
                qt7 = new qt7(j);
            } else if (f2) {
                qt7 = new mt7(j, 1);
            } else if (f3) {
                qt7 = new mt7(j, 0);
            }
        }
        c = qt7;
        if (qt7 == null) {
            z = false;
        } else {
            z = qt7.s();
        }
        d = z;
        if (qt7 == null) {
            z2 = false;
        } else {
            z2 = qt7.r();
        }
        e = z2;
        Class<boolean[]> cls = boolean[].class;
        c(cls);
        d(cls);
        Class<int[]> cls2 = int[].class;
        c(cls2);
        d(cls2);
        Class<long[]> cls3 = long[].class;
        c(cls3);
        d(cls3);
        Class<float[]> cls4 = float[].class;
        c(cls4);
        d(cls4);
        Class<double[]> cls5 = double[].class;
        c(cls5);
        d(cls5);
        Class<Object[]> cls6 = Object[].class;
        c(cls6);
        d(cls6);
        Field e2 = e();
        if (!(e2 == null || qt7 == null)) {
            qt7.j(e2);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z3 = false;
        }
        g = z3;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(st7.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        if (fd.a()) {
            try {
                field2 = cls.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!fd.a()) {
            return false;
        }
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

    public static byte g(byte[] bArr, long j) {
        return c.d(f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((c.g(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.g(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.l(bArr, f + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = -4 & j;
        int g2 = c.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(((255 & b2) << i) | (g2 & (~(255 << i))), j2, obj);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        n(((255 & b2) << i) | (c.g(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void n(int i, long j, Object obj) {
        c.o(i, j, obj);
    }

    public static void o(Object obj, long j, Object obj2) {
        c.q(obj, j, obj2);
    }
}
