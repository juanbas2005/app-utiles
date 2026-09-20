package defpackage;

import java.util.List;

/* renamed from: ry8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ry8 extends nl8 {
    private static final ry8 zzj;
    private static volatile rm8 zzk;
    private int zzb;
    private zl8 zze;
    private zl8 zzf;
    private zl8 zzg;
    private boolean zzh;
    private zl8 zzi;

    static {
        ry8 ry8 = new ry8();
        zzj = ry8;
        nl8.o(ry8.class, ry8);
    }

    public ry8() {
        um8 um8 = um8.A;
        this.zze = um8;
        this.zzf = um8;
        this.zzg = um8;
        this.zzi = um8;
    }

    public static ry8 z() {
        return zzj;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", yx8.class, "zzf", zx8.class, "zzg", ky8.class, "zzh", "zzi", yx8.class});
        } else if (i2 == 3) {
            return new ry8();
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
                synchronized (ry8.class) {
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

    public final List t() {
        return this.zze;
    }

    public final List u() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final zl8 y() {
        return this.zzi;
    }
}
