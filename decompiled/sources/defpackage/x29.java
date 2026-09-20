package defpackage;

import java.util.List;

/* renamed from: x29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x29 extends nl8 {
    private static final x29 zzk;
    private static volatile rm8 zzl;
    private int zzb;
    private int zze;
    private zl8 zzf = um8.A;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        x29 x29 = new x29();
        zzk = x29;
        nl8.o(x29.class, x29);
    }

    public final double A() {
        return this.zzj;
    }

    public final int B() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", kk8.p, "zzf", x29.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new x29();
        } else {
            if (i2 == 4) {
                return new ll8(zzk);
            }
            if (i2 == 5) {
                return zzk;
            }
            if (i2 == 6) {
                rm8 rm82 = zzl;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (x29.class) {
                    try {
                        rm8 = zzl;
                        if (rm8 == null) {
                            rm8 = new ml8(zzk);
                            zzl = rm8;
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
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzh;
    }

    public final boolean x() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }
}
