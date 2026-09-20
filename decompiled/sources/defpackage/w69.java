package defpackage;

/* renamed from: w69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w69 extends nl8 {
    private static final w69 zzg;
    private static volatile rm8 zzh;
    private int zzb;
    private p69 zze;
    private q69 zzf;

    /* JADX WARNING: type inference failed for: r0v0, types: [nl8, w69] */
    static {
        ? nl8 = new nl8();
        zzg = nl8;
        nl8.o(w69.class, nl8);
    }

    public static w69 v(byte[] bArr, gl8 gl8) {
        return (w69) nl8.e(zzg, bArr, gl8);
    }

    public static v69 w() {
        return (v69) zzg.j();
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
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
                synchronized (w69.class) {
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

    public final p69 t() {
        p69 p69 = this.zze;
        if (p69 == null) {
            return p69.H();
        }
        return p69;
    }

    public final q69 u() {
        q69 q69 = this.zzf;
        if (q69 == null) {
            return q69.t();
        }
        return q69;
    }

    public final /* synthetic */ void x(p69 p69) {
        this.zze = p69;
        this.zzb |= 1;
    }
}
