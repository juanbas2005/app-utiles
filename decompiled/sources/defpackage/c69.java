package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: c69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c69 extends nl8 {
    private static final c69 zzj;
    private static volatile rm8 zzk;
    private int zzb;
    private String zze = "";
    private vk8 zzf = vk8.x;
    private String zzg = "";
    private long zzh;
    private hm8 zzi = hm8.x;

    static {
        c69 c69 = new c69();
        zzj = c69;
        nl8.o(c69.class, c69);
    }

    public static c69 A() {
        return zzj;
    }

    public static c69 z(yk8 yk8, gl8 gl8) {
        nl8 i = zzj.i();
        try {
            wm8 a = tm8.c.a(i.getClass());
            tt2 tt2 = yk8.c;
            if (tt2 == null) {
                tt2 = new tt2(yk8);
            }
            a.c(i, tt2, gl8);
            a.f(i);
            nl8.r(i);
            return (c69) i;
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
            return new vm8(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", b69.a});
        } else if (i2 == 3) {
            return new c69();
        } else {
            if (i2 == 4) {
                return new ll8(zzj);
            }
            if (i2 == 5) {
                return zzj;
            }
            if (i2 == 6) {
                rm8 rm82 = zzk;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (c69.class) {
                    try {
                        rm8 = zzk;
                        if (rm8 == null) {
                            rm8 = new ml8(zzj);
                            zzk = rm8;
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

    public final vk8 u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }

    public final int x() {
        return this.zzi.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
