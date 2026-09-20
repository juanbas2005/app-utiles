package defpackage;

/* renamed from: e09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e09 extends nl8 {
    private static final e09 zzp;
    private static volatile rm8 zzq;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private long zzl;
    private hm8 zzm;
    private hm8 zzn;
    private String zzo = "";

    static {
        e09 e09 = new e09();
        zzp = e09;
        nl8.o(e09.class, e09);
    }

    public e09() {
        hm8 hm8 = hm8.x;
        this.zzm = hm8;
        this.zzn = hm8;
    }

    public static uz8 Y() {
        return (uz8) zzp.j();
    }

    public static e09 Z() {
        return zzp;
    }

    public final /* synthetic */ void A() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    public final hm8 C() {
        hm8 hm8 = this.zzm;
        if (!hm8.w) {
            this.zzm = hm8.a();
        }
        return this.zzm;
    }

    public final hm8 D() {
        hm8 hm8 = this.zzn;
        if (!hm8.w) {
            this.zzn = hm8.a();
        }
        return this.zzn;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean G() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long N() {
        return this.zzh;
    }

    public final boolean O() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String R() {
        return this.zzj;
    }

    public final boolean S() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final String T() {
        return this.zzk;
    }

    public final boolean U() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final long V() {
        return this.zzl;
    }

    public final boolean W() {
        if ((this.zzb & 256) != 0) {
            return true;
        }
        return false;
    }

    public final String X() {
        return this.zzo;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void d0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void e0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", wz8.a, "zzn", yz8.a, "zzo"});
        } else if (i2 == 3) {
            return new e09();
        } else {
            if (i2 == 4) {
                return new ll8(zzp);
            }
            if (i2 == 5) {
                return zzp;
            }
            if (i2 == 6) {
                rm8 rm82 = zzq;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (e09.class) {
                    try {
                        rm8 = zzq;
                        if (rm8 == null) {
                            rm8 = new ml8(zzp);
                            zzq = rm8;
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

    public final /* synthetic */ void t() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }
}
