package defpackage;

/* renamed from: n09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n09 extends nl8 {
    private static final n09 zzi;
    private static volatile rm8 zzj;
    private int zzb;
    private int zze;
    private f29 zzf;
    private f29 zzg;
    private boolean zzh;

    /* JADX WARNING: type inference failed for: r0v0, types: [n09, nl8] */
    static {
        ? nl8 = new nl8();
        zzi = nl8;
        nl8.o(n09.class, nl8);
    }

    public static m09 A() {
        return (m09) zzi.j();
    }

    public final /* synthetic */ void B(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void C(f29 f29) {
        this.zzf = f29;
        this.zzb |= 2;
    }

    public final /* synthetic */ void D(f29 f29) {
        this.zzg = f29;
        this.zzb |= 4;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new nl8();
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
                synchronized (n09.class) {
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

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int u() {
        return this.zze;
    }

    public final f29 v() {
        f29 f29 = this.zzf;
        if (f29 == null) {
            return f29.C();
        }
        return f29;
    }

    public final boolean w() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final f29 x() {
        f29 f29 = this.zzg;
        if (f29 == null) {
            return f29.C();
        }
        return f29;
    }

    public final boolean y() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        return this.zzh;
    }
}
