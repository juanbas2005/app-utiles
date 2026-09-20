package defpackage;

import java.util.List;

/* renamed from: z69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z69 extends nl8 {
    private static final z69 zzg;
    private static volatile rm8 zzh;
    private int zzb;
    private zl8 zze = um8.A;
    private String zzf = "";

    static {
        z69 z69 = new z69();
        zzg = z69;
        nl8.o(z69.class, z69);
    }

    public static z69 u() {
        return zzg;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new z69();
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
                synchronized (z69.class) {
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

    public final List t() {
        return this.zze;
    }

    public final void v(String str) {
        zl8 zl8 = this.zze;
        if (!((qk8) zl8).w) {
            this.zze = hl6.r(zl8);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
