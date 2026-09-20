package defpackage;

import java.util.List;

/* renamed from: h19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h19 extends nl8 {
    private static final h19 zzm;
    private static volatile rm8 zzn;
    private int zzb;
    private zl8 zze = um8.A;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        h19 h19 = new h19();
        zzm = h19;
        nl8.o(h19.class, h19);
    }

    public static f19 J() {
        return (f19) zzm.j();
    }

    public final long A() {
        return this.zzg;
    }

    public final boolean B() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int E() {
        return this.zzi;
    }

    public final boolean F() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final long G() {
        return this.zzk;
    }

    public final boolean H() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final long I() {
        return this.zzl;
    }

    public final /* synthetic */ void K(int i, n19 n19) {
        u();
        this.zze.set(i, n19);
    }

    public final /* synthetic */ void L(n19 n19) {
        n19.getClass();
        u();
        this.zze.add(n19);
    }

    public final /* synthetic */ void M(Iterable iterable) {
        u();
        pk8.d(iterable, this.zze);
    }

    public final void N() {
        this.zze = um8.A;
    }

    public final /* synthetic */ void O(int i) {
        u();
        this.zze.remove(i);
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void T(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", n19.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new h19();
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
                synchronized (h19.class) {
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

    public final /* synthetic */ void t(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void u() {
        zl8 zl8 = this.zze;
        if (!((qk8) zl8).w) {
            this.zze = hl6.r(zl8);
        }
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return this.zze.size();
    }

    public final n19 x(int i) {
        return (n19) this.zze.get(i);
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }
}
