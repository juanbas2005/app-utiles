package defpackage;

/* renamed from: gx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gx8 extends nl8 {
    private static final gx8 zzi;
    private static volatile rm8 zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private String zzg = "";
    private long zzh;

    static {
        gx8 gx8 = new gx8();
        zzi = gx8;
        nl8.o(gx8.class, gx8);
    }

    public static ex8 t() {
        return (ex8) zzi.j();
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new gx8();
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
                synchronized (gx8.class) {
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

    public final /* synthetic */ void u(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void v() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
