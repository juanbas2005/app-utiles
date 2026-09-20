package defpackage;

/* renamed from: sx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sx8 extends nl8 {
    private static final sx8 zzi;
    private static volatile rm8 zzj;
    private int zzb;
    private xx8 zze;
    private ux8 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        sx8 sx8 = new sx8();
        zzi = sx8;
        nl8.o(sx8.class, sx8);
    }

    public static sx8 B() {
        return zzi;
    }

    public final String A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new sx8();
        } else {
            if (i2 == 4) {
                return new ll8(zzi);
            }
            if (i2 == 5) {
                return zzi;
            }
            if (i2 == 6) {
                rm8 rm82 = zzj;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (sx8.class) {
                    try {
                        rm8 = zzj;
                        if (rm8 == null) {
                            rm8 = new ml8(zzi);
                            zzj = rm8;
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

    public final xx8 u() {
        xx8 xx8 = this.zze;
        if (xx8 == null) {
            return xx8.A();
        }
        return xx8;
    }

    public final boolean v() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final ux8 w() {
        ux8 ux8 = this.zzf;
        if (ux8 == null) {
            return ux8.C();
        }
        return ux8;
    }

    public final boolean x() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }
}
