package defpackage;

/* renamed from: m29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m29 extends nl8 {
    private static final m29 zzk;
    private static volatile rm8 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        m29 m29 = new m29();
        zzk = m29;
        nl8.o(m29.class, m29);
    }

    public static l29 E() {
        return (l29) zzk.j();
    }

    public final boolean A() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final float B() {
        return this.zzi;
    }

    public final boolean C() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final double D() {
        return this.zzj;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -9;
        this.zzh = 0;
    }

    public final /* synthetic */ void L(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new m29();
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
                synchronized (m29.class) {
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

    public final long u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long z() {
        return this.zzh;
    }
}
