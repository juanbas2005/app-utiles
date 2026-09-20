package defpackage;

import java.util.List;

/* renamed from: ox8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ox8 extends nl8 {
    private static final ox8 zzm;
    private static volatile rm8 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zl8 zzg = um8.A;
    private boolean zzh;
    private ux8 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        ox8 ox8 = new ox8();
        zzm = ox8;
        nl8.o(ox8.class, ox8);
    }

    public static mx8 F() {
        return (mx8) zzm.j();
    }

    public final ux8 A() {
        ux8 ux8 = this.zzi;
        if (ux8 == null) {
            return ux8.C();
        }
        return ux8;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        return this.zzl;
    }

    public final /* synthetic */ void G(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void H(int i, sx8 sx8) {
        zl8 zl8 = this.zzg;
        if (!((qk8) zl8).w) {
            this.zzg = hl6.r(zl8);
        }
        this.zzg.set(i, sx8);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", sx8.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new ox8();
        } else {
            if (i2 == 4) {
                return new ll8(zzm);
            }
            if (i2 == 5) {
                return zzm;
            }
            if (i2 == 6) {
                rm8 rm82 = zzn;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (ox8.class) {
                    try {
                        rm8 = zzn;
                        if (rm8 == null) {
                            rm8 = new ml8(zzm);
                            zzn = rm8;
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

    public final String v() {
        return this.zzf;
    }

    public final List w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final sx8 y(int i) {
        return (sx8) this.zzg.get(i);
    }

    public final boolean z() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }
}
