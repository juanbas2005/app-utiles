package defpackage;

import java.util.List;

/* renamed from: i29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i29 extends nl8 {
    private static final i29 zzg;
    private static volatile rm8 zzh;
    private int zzb;
    private int zze;
    private yl8 zzf = dm8.A;

    static {
        i29 i29 = new i29();
        zzg = i29;
        nl8.o(i29.class, i29);
    }

    public static h29 y() {
        return (h29) zzg.j();
    }

    public final void A(List list) {
        yl8 yl8 = this.zzf;
        if (!((qk8) yl8).w) {
            dm8 dm8 = (dm8) yl8;
            int i = dm8.y;
            this.zzf = dm8.t(i + i);
        }
        pk8.d(list, this.zzf);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new i29();
        } else {
            if (i2 == 4) {
                return new ll8(zzg);
            }
            if (i2 == 5) {
                return zzg;
            }
            if (i2 == 6) {
                rm8 rm82 = zzh;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (i29.class) {
                    try {
                        rm8 = zzh;
                        if (rm8 == null) {
                            rm8 = new ml8(zzg);
                            zzh = rm8;
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

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int u() {
        return this.zze;
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return ((dm8) this.zzf).size();
    }

    public final long x(int i) {
        return ((dm8) this.zzf).f(i);
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
