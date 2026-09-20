package defpackage;

/* renamed from: v99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v99 extends nl8 {
    private static final v99 zzh;
    private static volatile rm8 zzi;
    private int zzb;
    private int zze = 0;
    private Object zzf;
    private String zzg = "";

    static {
        v99 v99 = new v99();
        zzh = v99;
        nl8.o(v99.class, v99);
    }

    public static u99 z() {
        return (u99) zzh.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void B(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void C(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void D(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void F(vk8 vk8) {
        vk8.getClass();
        this.zze = 6;
        this.zzf = vk8;
    }

    public final int G() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return 0;
        }
        return 5;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        } else if (i2 == 3) {
            return new v99();
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
                synchronized (v99.class) {
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
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0;
    }

    public final boolean v() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double w() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String x() {
        if (this.zze == 5) {
            return (String) this.zzf;
        }
        return "";
    }

    public final vk8 y() {
        if (this.zze == 6) {
            return (vk8) this.zzf;
        }
        return vk8.x;
    }
}
