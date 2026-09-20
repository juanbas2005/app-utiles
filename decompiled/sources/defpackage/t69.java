package defpackage;

/* renamed from: t69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t69 extends nl8 {
    private static final t69 zzg;
    private static volatile rm8 zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        t69 t69 = new t69();
        zzg = t69;
        nl8.o(t69.class, t69);
    }

    public static t69 v() {
        return zzg;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new t69();
        } else {
            if (i2 == 4) {
                return new ll8(zzg);
            }
            if (i2 == 5) {
                return zzg;
            }
            if (i2 == 6) {
                rm8 rm82 = zzh;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (t69.class) {
                    try {
                        rm8 = zzh;
                        if (rm8 == null) {
                            rm8 = new ml8(zzg);
                            zzh = rm8;
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
        return this.zze;
    }

    public final long u() {
        return this.zzf;
    }
}
