package defpackage;

import java.util.List;

/* renamed from: kx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kx8 extends nl8 {
    private static final kx8 zzj;
    private static volatile rm8 zzk;
    private int zzb;
    private int zze;
    private zl8 zzf;
    private zl8 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        kx8 kx8 = new kx8();
        zzj = kx8;
        nl8.o(kx8.class, kx8);
    }

    public kx8() {
        um8 um8 = um8.A;
        this.zzf = um8;
        this.zzg = um8;
    }

    public final ox8 A(int i) {
        return (ox8) this.zzg.get(i);
    }

    public final void B(int i, wx8 wx8) {
        zl8 zl8 = this.zzf;
        if (!((qk8) zl8).w) {
            this.zzf = hl6.r(zl8);
        }
        this.zzf.set(i, wx8);
    }

    public final void C(int i, ox8 ox8) {
        zl8 zl8 = this.zzg;
        if (!((qk8) zl8).w) {
            this.zzg = hl6.r(zl8);
        }
        this.zzg.set(i, ox8);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", wx8.class, "zzg", ox8.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new kx8();
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
                synchronized (kx8.class) {
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
        return this.zzf.size();
    }

    public final wx8 x(int i) {
        return (wx8) this.zzf.get(i);
    }

    public final zl8 y() {
        return this.zzg;
    }

    public final int z() {
        return this.zzg.size();
    }
}
