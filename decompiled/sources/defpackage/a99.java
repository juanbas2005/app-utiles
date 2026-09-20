package defpackage;

import java.util.List;

/* renamed from: a99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a99 extends nl8 {
    private static final a99 zze;
    private static volatile rm8 zzf;
    private zl8 zzb = um8.A;

    static {
        a99 a99 = new a99();
        zze = a99;
        nl8.o(a99.class, a99);
    }

    public static a99 u(byte[] bArr, gl8 gl8) {
        return (a99) nl8.e(zze, bArr, gl8);
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        } else if (i2 == 3) {
            return new a99();
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
                synchronized (a99.class) {
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
}
