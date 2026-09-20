package defpackage;

/* renamed from: q19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q19 extends nl8 {
    private static final q19 zzh;
    private static volatile rm8 zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private g09 zzg;

    static {
        q19 q19 = new q19();
        zzh = q19;
        nl8.o(q19.class, q19);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new q19();
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
                synchronized (q19.class) {
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
}
