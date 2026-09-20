package defpackage;

/* renamed from: e19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e19 extends nl8 {
    private static final e19 zzg;
    private static volatile rm8 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    /* JADX WARNING: type inference failed for: r0v0, types: [nl8, e19] */
    static {
        ? nl8 = new nl8();
        zzg = nl8;
        nl8.o(e19.class, nl8);
    }

    public static b19 x() {
        return (b19) zzg.j();
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
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
                synchronized (e19.class) {
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

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int u() {
        return this.zze;
    }

    public final boolean v() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final long w() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void z(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }
}
