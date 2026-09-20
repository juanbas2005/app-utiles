package defpackage;

/* renamed from: x59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x59 extends nl8 {
    private static final x59 zzh;
    private static volatile rm8 zzi;
    private int zzb;
    private int zze = 0;
    private Object zzf;
    private String zzg = "";

    static {
        x59 x59 = new x59();
        zzh = x59;
        nl8.o(x59.class, x59);
    }

    public static x59 A() {
        return zzh;
    }

    public static w59 z() {
        return (w59) zzh.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void D(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void E(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void G(uk8 uk8) {
        uk8.getClass();
        this.zze = 5;
        this.zzf = uk8;
    }

    public final int H() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        } else if (i2 == 3) {
            return new x59();
        } else {
            if (i2 == 4) {
                return new ll8(zzh);
            }
            if (i2 == 5) {
                return zzh;
            }
            if (i2 == 6) {
                rm8 rm82 = zzi;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (x59.class) {
                    try {
                        rm8 = zzi;
                        if (rm8 == null) {
                            rm8 = new ml8(zzh);
                            zzi = rm8;
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

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0;
    }

    public final boolean v() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double w() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String x() {
        if (this.zze == 4) {
            return (String) this.zzf;
        }
        return "";
    }

    public final vk8 y() {
        if (this.zze == 5) {
            return (vk8) this.zzf;
        }
        return vk8.x;
    }
}
