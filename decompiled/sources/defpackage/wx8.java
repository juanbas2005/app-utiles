package defpackage;

/* renamed from: wx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wx8 extends nl8 {
    private static final wx8 zzk;
    private static volatile rm8 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private sx8 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        wx8 wx8 = new wx8();
        zzk = wx8;
        nl8.o(wx8.class, wx8);
    }

    public static vx8 B() {
        return (vx8) zzk.j();
    }

    public final boolean A() {
        return this.zzj;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new wx8();
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
                synchronized (wx8.class) {
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

    public final int u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final sx8 w() {
        sx8 sx8 = this.zzg;
        if (sx8 == null) {
            return sx8.B();
        }
        return sx8;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }
}
