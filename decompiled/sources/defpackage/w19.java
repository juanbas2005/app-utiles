package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: w19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w19 extends nl8 {
    private static final w19 zzi;
    private static volatile rm8 zzj;
    private int zzb;
    private zl8 zze = um8.A;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        w19 w19 = new w19();
        zzi = w19;
        nl8.o(w19.class, w19);
    }

    public static s19 A() {
        return (s19) zzi.j();
    }

    public static s19 B(w19 w19) {
        ll8 j = zzi.j();
        j.e(w19);
        return (s19) j;
    }

    public final /* synthetic */ void C(int i, b29 b29) {
        I();
        this.zze.set(i, b29);
    }

    public final /* synthetic */ void D(b29 b29) {
        I();
        this.zze.add(b29);
    }

    public final /* synthetic */ void E(ArrayList arrayList) {
        I();
        pk8.d(arrayList, this.zze);
    }

    public final void F() {
        this.zze = um8.A;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void I() {
        zl8 zl8 = this.zze;
        if (!((qk8) zl8).w) {
            this.zze = hl6.r(zl8);
        }
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", b29.class, "zzf", "zzg", "zzh", kk8.k});
        } else if (i2 == 3) {
            return new w19();
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
                synchronized (w19.class) {
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

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final b29 v(int i) {
        return (b29) this.zze.get(i);
    }

    public final boolean w() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String z() {
        return this.zzg;
    }
}
