package defpackage;

import java.util.List;

/* renamed from: bz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bz8 extends nl8 {
    private static final bz8 zzw;
    private static volatile rm8 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zl8 zzh;
    private zl8 zzi;
    private zl8 zzj;
    private String zzk;
    private boolean zzl;
    private zl8 zzm;
    private zl8 zzn;
    private String zzo;
    private String zzp;
    private ry8 zzq;
    private iz8 zzr;
    private sz8 zzs;
    private jz8 zzt;
    private ez8 zzu;
    private ul8 zzv;

    static {
        bz8 bz8 = new bz8();
        zzw = bz8;
        nl8.o(bz8.class, bz8);
    }

    public bz8() {
        um8 um8 = um8.A;
        this.zzh = um8;
        this.zzi = um8;
        this.zzj = um8;
        this.zzk = "";
        this.zzm = um8;
        this.zzn = um8;
        this.zzo = "";
        this.zzp = "";
        this.zzv = ol8.A;
    }

    public static yy8 K() {
        return (yy8) zzw.j();
    }

    public static bz8 L() {
        return zzw;
    }

    public final List A() {
        return this.zzj;
    }

    public final zl8 B() {
        return this.zzm;
    }

    public final int C() {
        return this.zzm.size();
    }

    public final zl8 D() {
        return this.zzn;
    }

    public final String E() {
        return this.zzo;
    }

    public final boolean F() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final ry8 G() {
        ry8 ry8 = this.zzq;
        if (ry8 == null) {
            return ry8.z();
        }
        return ry8;
    }

    public final boolean H() {
        if ((this.zzb & 512) != 0) {
            return true;
        }
        return false;
    }

    public final sz8 I() {
        sz8 sz8 = this.zzs;
        if (sz8 == null) {
            return sz8.v();
        }
        return sz8;
    }

    public final ul8 J() {
        return this.zzv;
    }

    public final void M(int i, xy8 xy8) {
        zl8 zl8 = this.zzi;
        if (!((qk8) zl8).w) {
            this.zzi = hl6.r(zl8);
        }
        this.zzi.set(i, xy8);
    }

    public final void N() {
        this.zzj = um8.A;
    }

    public final void O() {
        this.zzm = um8.A;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", oz8.class, "zzi", xy8.class, "zzj", kx8.class, "zzk", "zzl", "zzm", v29.class, "zzn", ty8.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        } else if (i2 == 3) {
            return new bz8();
        } else {
            if (i2 == 4) {
                return new ll8(zzw);
            }
            if (i2 == 5) {
                return zzw;
            }
            if (i2 == 6) {
                rm8 rm82 = zzx;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (bz8.class) {
                    try {
                        rm8 = zzx;
                        if (rm8 == null) {
                            rm8 = new ml8(zzw);
                            zzx = rm8;
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

    public final long u() {
        return this.zze;
    }

    public final boolean v() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzf;
    }

    public final zl8 x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final xy8 z(int i) {
        return (xy8) this.zzi.get(i);
    }
}
