package defpackage;

import java.util.List;

/* renamed from: o29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o29 extends nl8 {
    private static final o29 zze;
    private static volatile rm8 zzf;
    private zl8 zzb = um8.A;

    static {
        o29 o29 = new o29();
        zze = o29;
        nl8.o(o29.class, o29);
    }

    public static o29 v() {
        return zze;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", q29.class});
        } else if (i2 == 3) {
            return new o29();
        } else {
            if (i2 == 4) {
                return new ll8(zze);
            }
            if (i2 == 5) {
                return zze;
            }
            if (i2 == 6) {
                rm8 rm82 = zzf;
                if (rm82 != null) {
                    return rm82;
                }
                synchronized (o29.class) {
                    try {
                        rm8 = zzf;
                        if (rm8 == null) {
                            rm8 = new ml8(zze);
                            zzf = rm8;
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
        return this.zzb.size();
    }
}
