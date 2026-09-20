package defpackage;

/* renamed from: n69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n69 extends nl8 {
    private static final n69 zzf;
    private static volatile rm8 zzg;
    private int zzb;
    private boolean zze;

    /* JADX WARNING: type inference failed for: r0v0, types: [n69, nl8] */
    static {
        ? nl8 = new nl8();
        zzf = nl8;
        nl8.o(n69.class, nl8);
    }

    public static n69 u() {
        return zzf;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        } else if (i2 == 3) {
            return new nl8();
        } else {
            if (i2 == 4) {
                return new ll8(zzf);
            }
            if (i2 == 5) {
                return zzf;
            }
            if (i2 == 6) {
                rm8 rm82 = zzg;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (n69.class) {
                    try {
                        rm8 = zzg;
                        if (rm8 == null) {
                            rm8 = new ml8(zzf);
                            zzg = rm8;
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
        return this.zze;
    }
}
