package defpackage;

/* renamed from: yx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yx8 extends nl8 {
    private static final yx8 zzh;
    private static volatile rm8 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARNING: type inference failed for: r0v0, types: [yx8, nl8] */
    static {
        ? nl8 = new nl8();
        zzh = nl8;
        nl8.o(yx8.class, nl8);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", kk8.f, "zzf", kk8.e, "zzg", kk8.g});
        } else if (i2 == 3) {
            return new nl8();
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
                synchronized (yx8.class) {
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

    public final int t() {
        int L = i95.L(this.zze);
        if (L == 0) {
            return 1;
        }
        return L;
    }

    public final int u() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 0;
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

    public final int v() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 0;
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
}
