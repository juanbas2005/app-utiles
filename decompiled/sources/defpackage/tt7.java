package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: tt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tt7 {
    public static final Unsafe a;
    public static final Class b = gd.a;
    public static final rt7 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f = ((long) e(byte[].class));
    public static final boolean g;

    static {
        boolean z;
        boolean z2;
        Unsafe i = i();
        a = i;
        boolean h = h(Long.TYPE);
        boolean h2 = h(Integer.TYPE);
        boolean z3 = true;
        rt7 rt7 = null;
        if (i != null) {
            if (!gd.a()) {
                rt7 = new rt7(i);
            } else if (h) {
                rt7 = new nt7(i, 1);
            } else if (h2) {
                rt7 = new nt7(i, 0);
            }
        }
        c = rt7;
        if (rt7 == null) {
            z = false;
        } else {
            z = rt7.r();
        }
        d = z;
        if (rt7 == null) {
            z2 = false;
        } else {
            z2 = rt7.q();
        }
        e = z2;
        Class<boolean[]> cls = boolean[].class;
        e(cls);
        f(cls);
        Class<int[]> cls2 = int[].class;
        e(cls2);
        f(cls2);
        Class<long[]> cls3 = long[].class;
        e(cls3);
        f(cls3);
        Class<float[]> cls4 = float[].class;
        e(cls4);
        f(cls4);
        Class<double[]> cls5 = double[].class;
        e(cls5);
        f(cls5);
        Class<Object[]> cls6 = Object[].class;
        e(cls6);
        f(cls6);
        Field g2 = g();
        if (!(g2 == null || rt7 == null)) {
            rt7.i(g2);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z3 = false;
        }
        g = z3;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(tt7.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        if (((byte) ((c.f(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(long j, Object obj) {
        if (((byte) ((c.f(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static Object d(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        if (gd.a()) {
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

    public static boolean h(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!gd.a()) {
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

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        c.k(bArr, f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = -4 & j;
        int f2 = c.f(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(((255 & b2) << i) | (f2 & (~(255 << i))), j2, obj);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m(((255 & b2) << i) | (c.f(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void m(int i, long j, Object obj) {
        c.n(i, j, obj);
    }

    public static void n(Object obj, long j, long j2) {
        c.o(obj, j, j2);
    }

    public static void o(Object obj, long j, Object obj2) {
        c.p(obj, j, obj2);
    }
}
