package defpackage;

/* renamed from: k29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k29 extends nl8 {
    private static final k29 zzh;
    private static volatile rm8 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARNING: type inference failed for: r0v0, types: [k29, nl8] */
    static {
        ? nl8 = new nl8();
        zzh = nl8;
        nl8.o(k29.class, nl8);
    }

    public static j29 u() {
        return (j29) zzh.j();
    }

    public static k29 v() {
        return zzh;
    }

    public final /* synthetic */ void A(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", kk8.o, "zzf", kk8.m, "zzg", kk8.n});
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
                synchronized (k29.class) {
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
        int c = hl6.c(this.zzf);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    public final void w(int i) {
        this.zzf = hl6.e(i);
        this.zzb |= 2;
    }

    public final int x() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
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

    public final int y() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            if (i2 != 5) {
                                i = 0;
                            } else {
                                i = 6;
                            }
                        }
                    }
                }
                i = i3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void z(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
