package defpackage;

import java.util.List;

/* renamed from: v29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v29 extends nl8 {
    private static final v29 zzg;
    private static volatile rm8 zzh;
    private int zzb;
    private zl8 zze = um8.A;
    private o29 zzf;

    static {
        v29 v29 = new v29();
        zzg = v29;
        nl8.o(v29.class, v29);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", x29.class, "zzf"});
        } else if (i2 == 3) {
            return new v29();
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
                synchronized (v29.class) {
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

    public final o29 u() {
        o29 o29 = this.zzf;
        if (o29 == null) {
            return o29.v();
        }
        return o29;
    }
}
