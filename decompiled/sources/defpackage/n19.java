package defpackage;

import java.util.ArrayList;

/* renamed from: n19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n19 extends nl8 {
    private static final n19 zzk;
    private static volatile rm8 zzl;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    private zl8 zzj = um8.A;

    static {
        n19 n19 = new n19();
        zzk = n19;
        nl8.o(n19.class, n19);
    }

    public static l19 F() {
        return (l19) zzk.j();
    }

    public final float A() {
        return this.zzh;
    }

    public final boolean B() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final double C() {
        return this.zzi;
    }

    public final zl8 D() {
        return this.zzj;
    }

    public final int E() {
        return this.zzj.size();
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -5;
        this.zzg = 0;
    }

    public final /* synthetic */ void L(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void N(n19 n19) {
        zl8 zl8 = this.zzj;
        if (!((qk8) zl8).w) {
            this.zzj = hl6.r(zl8);
        }
        this.zzj.add(n19);
    }

    public final void O(ArrayList arrayList) {
        zl8 zl8 = this.zzj;
        if (!((qk8) zl8).w) {
            this.zzj = hl6.r(zl8);
        }
        pk8.d(arrayList, this.zzj);
    }

    public final void P() {
        this.zzj = um8.A;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", n19.class});
        } else if (i2 == 3) {
            return new n19();
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
                synchronized (n19.class) {
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

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }
}
