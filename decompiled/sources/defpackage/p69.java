package defpackage;

import java.util.List;

/* renamed from: p69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p69 extends nl8 {
    private static final vl8 zzl = new nx8(3);
    private static final p69 zzq;
    private static volatile rm8 zzr;
    private int zzb;
    private vk8 zze = vk8.x;
    private boolean zzf;
    private String zzg = "";
    private long zzh;
    private zl8 zzi;
    private zl8 zzj;
    private ul8 zzk;
    private t69 zzm;
    private boolean zzn;
    private boolean zzo;
    private n69 zzp;

    static {
        p69 p69 = new p69();
        zzq = p69;
        nl8.o(p69.class, p69);
    }

    public p69() {
        um8 um8 = um8.A;
        this.zzi = um8;
        this.zzj = um8;
        this.zzk = ol8.A;
    }

    public static o69 G() {
        return (o69) zzq.j();
    }

    public static p69 H() {
        return zzq;
    }

    public final List A() {
        return new wl8(this.zzk, zzl);
    }

    public final boolean B() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final t69 C() {
        t69 t69 = this.zzm;
        if (t69 == null) {
            return t69.v();
        }
        return t69;
    }

    public final boolean D() {
        return this.zzn;
    }

    public final boolean E() {
        return this.zzo;
    }

    public final n69 F() {
        n69 n69 = this.zzp;
        if (n69 == null) {
            return n69.u();
        }
        return n69;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", kk8.b, "zzm", "zzn", "zzo", "zzp"});
        } else if (i2 == 3) {
            return new p69();
        } else {
            if (i2 == 4) {
                return new ll8(zzq);
            }
            if (i2 == 5) {
                return zzq;
            }
            if (i2 == 6) {
                rm8 rm82 = zzr;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (p69.class) {
                    try {
                        rm8 = zzr;
                        if (rm8 == null) {
                            rm8 = new ml8(zzq);
                            zzr = rm8;
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

    public final vk8 u() {
        return this.zze;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final zl8 y() {
        return this.zzi;
    }

    public final zl8 z() {
        return this.zzj;
    }
}
