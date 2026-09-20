package defpackage;

/* renamed from: zx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zx8 extends nl8 {
    private static final zx8 zzg;
    private static volatile rm8 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    /* JADX WARNING: type inference failed for: r0v0, types: [nl8, zx8] */
    static {
        ? nl8 = new nl8();
        zzg = nl8;
        nl8.o(zx8.class, nl8);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            kk8 kk8 = kk8.f;
            return new vm8(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", kk8, "zzf", kk8});
        } else if (i2 == 3) {
            return new nl8();
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
                synchronized (zx8.class) {
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

    public final int t() {
        int L = i95.L(this.zze);
        if (L == 0) {
            return 1;
        }
        return L;
    }

    public final int u() {
        int L = i95.L(this.zzf);
        if (L == 0) {
            return 1;
        }
        return L;
    }
}
