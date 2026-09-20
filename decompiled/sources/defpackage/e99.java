package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e99 extends nl8 {
    private static final e99 zzl;
    private static volatile rm8 zzm;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private zl8 zzg = um8.A;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        e99 e99 = new e99();
        zzl = e99;
        nl8.o(e99.class, e99);
    }

    public static e99 v(InputStream inputStream, gl8 gl8) {
        e99 e99 = zzl;
        yk8 h = yk8.h(inputStream, 4096);
        nl8 i = e99.i();
        try {
            wm8 a = tm8.c.a(i.getClass());
            tt2 tt2 = h.c;
            if (tt2 == null) {
                tt2 = new tt2(h);
            }
            a.c(i, tt2, gl8);
            a.f(i);
            nl8.r(i);
            return (e99) i;
        } catch (zzaeh e) {
            if (e.w) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (zzafy e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaeh) {
                throw ((zzaeh) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaeh) {
                throw ((zzaeh) e4.getCause());
            }
            throw e4;
        }
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", kk8.b, "zzi", "zzk", "zzj"});
        } else if (i2 == 3) {
            return new e99();
        } else {
            if (i2 == 4) {
                return new ll8(zzl);
            }
            if (i2 == 5) {
                return zzl;
            }
            if (i2 == 6) {
                rm8 rm82 = zzm;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (e99.class) {
                    try {
                        rm8 = zzm;
                        if (rm8 == null) {
                            rm8 = new ml8(zzl);
                            zzm = rm8;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rm8;
            }
            throw null;
        }
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzf;
    }
}
