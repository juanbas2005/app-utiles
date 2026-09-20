package defpackage;

/* renamed from: u59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u59 extends nl8 {
    private static final u59 zzl;
    private static volatile rm8 zzm;
    private int zzb;
    private String zze = "";
    private vk8 zzf = vk8.x;
    private String zzg = "";
    private zl8 zzh;
    private zl8 zzi;
    private boolean zzj;
    private long zzk;

    static {
        u59 u59 = new u59();
        zzl = u59;
        nl8.o(u59.class, u59);
    }

    public u59() {
        um8 um8 = um8.A;
        this.zzh = um8;
        this.zzi = um8;
    }

    public static t59 z() {
        return (t59) zzl.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void B(uk8 uk8) {
        uk8.getClass();
        this.zzb |= 2;
        this.zzf = uk8;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void D(x59 x59) {
        zl8 zl8 = this.zzh;
        if (!((qk8) zl8).w) {
            this.zzh = hl6.r(zl8);
        }
        this.zzh.add(x59);
    }

    public final void E(String str) {
        str.getClass();
        zl8 zl8 = this.zzi;
        if (!((qk8) zl8).w) {
            this.zzi = hl6.r(zl8);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", x59.class, "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new u59();
        } else {
            if (i2 == 4) {
                return new ll8(zzl);
            }
            if (i2 == 5) {
                return zzl;
            }
            if (i2 == 6) {
                rm8 rm82 = zzm;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (u59.class) {
                    try {
                        rm8 = zzm;
                        if (rm8 == null) {
                            rm8 = new ml8(zzl);
                            zzm = rm8;
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

    public final boolean u() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final vk8 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final zl8 x() {
        return this.zzh;
    }

    public final long y() {
        return this.zzk;
    }
}
