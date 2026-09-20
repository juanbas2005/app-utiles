package defpackage;

/* renamed from: ux8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ux8 extends nl8 {
    private static final ux8 zzj;
    private static volatile rm8 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        ux8 ux8 = new ux8();
        zzj = ux8;
        nl8.o(ux8.class, ux8);
    }

    public static ux8 C() {
        return zzj;
    }

    public final boolean A() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String B() {
        return this.zzi;
    }

    public final int D() {
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
            return new vm8(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", kk8.c, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new ux8();
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
                synchronized (ux8.class) {
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

    public final boolean u() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
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

    public final String z() {
        return this.zzh;
    }
}
