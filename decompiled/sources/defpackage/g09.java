package defpackage;

/* renamed from: g09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g09 extends nl8 {
    private static final g09 zzl;
    private static volatile rm8 zzm;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        g09 g09 = new g09();
        zzl = g09;
        nl8.o(g09.class, g09);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new g09();
        } else {
            if (i2 == 4) {
                return new ll8(zzl);
            }
            if (i2 == 5) {
                return zzl;
            }
            if (i2 == 6) {
                rm8 rm82 = zzm;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (g09.class) {
                    try {
                        rm8 = zzm;
                        if (rm8 == null) {
                            rm8 = new ml8(zzl);
                            zzm = rm8;
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
}
