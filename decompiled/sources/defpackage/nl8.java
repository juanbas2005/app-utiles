package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: nl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nl8 extends pk8 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected en8 zzc = en8.f;

    public nl8() {
        this.zza = 0;
    }

    public static nl8 e(nl8 nl8, byte[] bArr, gl8 gl8) {
        int length = bArr.length;
        if (length != 0) {
            nl8 i = nl8.i();
            try {
                wm8 a = tm8.c.a(i.getClass());
                a.i(i, bArr, 0, length, new mj2(gl8));
                a.f(i);
                nl8 = i;
            } catch (zzaeh e) {
                zzaeh zzaeh = e;
                if (zzaeh.w) {
                    throw new IOException(zzaeh.getMessage(), zzaeh);
                }
                throw zzaeh;
            } catch (zzafy e2) {
                throw e2.a();
            } catch (IOException e3) {
                IOException iOException = e3;
                if (iOException.getCause() instanceof zzaeh) {
                    throw ((zzaeh) iOException.getCause());
                }
                throw new IOException(iOException.getMessage(), iOException);
            } catch (IndexOutOfBoundsException unused) {
                zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        r(nl8);
        return nl8;
    }

    public static nl8 n(Class cls) {
        Map map = zze;
        nl8 nl8 = (nl8) map.get(cls);
        if (nl8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                nl8 = (nl8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (nl8 != null) {
            return nl8;
        }
        nl8 nl82 = (nl8) ((nl8) jn8.d(cls)).s(6);
        if (nl82 != null) {
            map.put(cls, nl82);
            return nl82;
        }
        throw new IllegalStateException();
    }

    public static void o(Class cls, nl8 nl8) {
        nl8.h();
        zze.put(cls, nl8);
    }

    public static Object p(Method method, nl8 nl8, Object... objArr) {
        try {
            return method.invoke(nl8, objArr);
        } catch (IllegalAccessException e) {
            ku4.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (!(cause instanceof Error)) {
                ku4.o("Unexpected exception thrown by generated accessor method.", cause);
                return null;
            } else {
                throw ((Error) cause);
            }
        }
    }

    public static final boolean q(nl8 nl8, boolean z) {
        byte byteValue = ((Byte) nl8.s(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = tm8.c.a(nl8.getClass()).e(nl8);
        if (z) {
            nl8.s(2);
        }
        return e;
    }

    public static void r(nl8 nl8) {
        if (nl8 != null && !q(nl8, true)) {
            throw new zzafy().a();
        }
    }

    public final int c(wm8 wm8) {
        if (g()) {
            int d = wm8.d(this);
            if (d >= 0) {
                return d;
            }
            kj6.h(String.valueOf(d).length() + 42, d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = wm8.d(this);
        if (d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | d2;
            return d2;
        }
        kj6.h(String.valueOf(d2).length() + 42, d2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return tm8.c.a(getClass()).j(this, (nl8) obj);
    }

    public final void f(fl8 fl8) {
        wm8 a = tm8.c.a(getClass());
        br4 br4 = fl8.a;
        if (br4 == null) {
            br4 = new br4(fl8);
        }
        a.h(this, br4);
    }

    public final boolean g() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            return tm8.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int g = tm8.c.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public final nl8 i() {
        return (nl8) s(4);
    }

    public final ll8 j() {
        return (ll8) s(5);
    }

    public final ll8 k() {
        ll8 ll8 = (ll8) s(5);
        ll8.e(this);
        return ll8;
    }

    public final void l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int m() {
        if (g()) {
            int d = tm8.c.a(getClass()).d(this);
            if (d >= 0) {
                return d;
            }
            kj6.h(String.valueOf(d).length() + 42, d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = tm8.c.a(getClass()).d(this);
        if (d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | d2;
            return d2;
        }
        kj6.h(String.valueOf(d2).length() + 42, d2);
        return 0;
    }

    public abstract Object s(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = nm8.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        nm8.b(this, sb, 0);
        return sb.toString();
    }
}
