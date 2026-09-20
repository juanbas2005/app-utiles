package defpackage;

/* renamed from: q69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q69 extends nl8 {
    private static final q69 zzo;
    private static volatile rm8 zzp;
    private int zzb;
    private vk8 zze = vk8.x;
    private boolean zzf;
    private String zzg = "";
    private zl8 zzh;
    private zl8 zzi;
    private ul8 zzj;
    private t69 zzk;
    private boolean zzl;
    private boolean zzm;
    private n69 zzn;

    static {
        q69 q69 = new q69();
        zzo = q69;
        nl8.o(q69.class, q69);
    }

    public q69() {
        um8 um8 = um8.A;
        this.zzh = um8;
        this.zzi = um8;
        this.zzj = ol8.A;
    }

    public static q69 t() {
        return zzo;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", kk8.b, "zzk", "zzl", "zzm", "zzn"});
        } else if (i2 == 3) {
            return new q69();
        } else {
            if (i2 == 4) {
                return new ll8(zzo);
            }
            if (i2 == 5) {
                return zzo;
            }
            if (i2 == 6) {
                rm8 rm82 = zzp;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (q69.class) {
                    try {
                        rm8 = zzp;
                        if (rm8 == null) {
                            rm8 = new ml8(zzo);
                            zzp = rm8;
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
