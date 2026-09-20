package defpackage;

/* renamed from: iz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iz8 extends nl8 {
    private static final iz8 zzj;
    private static volatile rm8 zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        iz8 iz8 = new iz8();
        zzj = iz8;
        nl8.o(iz8.class, iz8);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new iz8();
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
                synchronized (iz8.class) {
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
}
