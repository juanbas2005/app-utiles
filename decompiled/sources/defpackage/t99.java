package defpackage;

/* renamed from: t99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t99 extends nl8 {
    private static final t99 zzj;
    private static volatile rm8 zzk;
    private int zzb;
    private String zze = "";
    private vk8 zzf = vk8.x;
    private String zzg = "";
    private long zzh;
    private zl8 zzi = um8.A;

    static {
        t99 t99 = new t99();
        zzj = t99;
        nl8.o(t99.class, t99);
    }

    public static t99 A() {
        return zzj;
    }

    public static s99 z() {
        return (s99) zzj.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(vk8 vk8) {
        vk8.getClass();
        this.zzb |= 2;
        this.zzf = vk8;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void F(v99 v99) {
        zl8 zl8 = this.zzi;
        if (!((qk8) zl8).w) {
            this.zzi = hl6.r(zl8);
        }
        this.zzi.add(v99);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", v99.class});
        } else if (i2 == 3) {
            return new t99();
        } else {
            if (i2 == 4) {
                return new ll8(zzj);
            }
            if (i2 == 5) {
                return zzj;
            }
            if (i2 == 6) {
                rm8 rm82 = zzk;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (t99.class) {
                    try {
                        rm8 = zzk;
                        if (rm8 == null) {
                            rm8 = new ml8(zzj);
                            zzk = rm8;
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

    public final vk8 u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }

    public final zl8 x() {
        return this.zzi;
    }

    public final int y() {
        return this.zzi.size();
    }
}
