package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f29 extends nl8 {
    private static final f29 zzh;
    private static volatile rm8 zzi;
    private yl8 zzb;
    private yl8 zze;
    private zl8 zzf;
    private zl8 zzg;

    static {
        f29 f29 = new f29();
        zzh = f29;
        nl8.o(f29.class, f29);
    }

    public f29() {
        dm8 dm8 = dm8.A;
        this.zzb = dm8;
        this.zze = dm8;
        um8 um8 = um8.A;
        this.zzf = um8;
        this.zzg = um8;
    }

    public static e29 B() {
        return (e29) zzh.j();
    }

    public static f29 C() {
        return zzh;
    }

    public final int A() {
        return this.zzg.size();
    }

    public final void D(Iterable iterable) {
        yl8 yl8 = this.zzb;
        if (!((qk8) yl8).w) {
            dm8 dm8 = (dm8) yl8;
            int i = dm8.y;
            this.zzb = dm8.t(i + i);
        }
        pk8.d(iterable, this.zzb);
    }

    public final void E() {
        this.zzb = dm8.A;
    }

    public final void F(List list) {
        yl8 yl8 = this.zze;
        if (!((qk8) yl8).w) {
            dm8 dm8 = (dm8) yl8;
            int i = dm8.y;
            this.zze = dm8.t(i + i);
        }
        pk8.d(list, this.zze);
    }

    public final void G() {
        this.zze = dm8.A;
    }

    public final void H(ArrayList arrayList) {
        zl8 zl8 = this.zzf;
        if (!((qk8) zl8).w) {
            this.zzf = hl6.r(zl8);
        }
        pk8.d(arrayList, this.zzf);
    }

    public final void I() {
        this.zzf = um8.A;
    }

    public final void J(Iterable iterable) {
        zl8 zl8 = this.zzg;
        if (!((qk8) zl8).w) {
            this.zzg = hl6.r(zl8);
        }
        pk8.d(iterable, this.zzg);
    }

    public final void K() {
        this.zzg = um8.A;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", e19.class, "zzg", i29.class});
        } else if (i2 == 3) {
            return new f29();
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
                synchronized (f29.class) {
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

    public final List t() {
        return this.zzb;
    }

    public final int u() {
        return ((dm8) this.zzb).size();
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return ((dm8) this.zze).size();
    }

    public final zl8 x() {
        return this.zzf;
    }

    public final int y() {
        return this.zzf.size();
    }

    public final zl8 z() {
        return this.zzg;
    }
}
