package defpackage;

/* renamed from: d79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d79 extends nl8 {
    private static final d79 zze;
    private static volatile rm8 zzf;
    private hm8 zzb = hm8.x;

    static {
        d79 d79 = new d79();
        zze = d79;
        nl8.o(d79.class, d79);
    }

    public static d79 u() {
        return zze;
    }

    public final Object s(int i) {
        rm8 rm8;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vm8(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", a79.a});
        } else if (i2 == 3) {
            return new d79();
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
                synchronized (d79.class) {
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

    public final z69 t(String str, z69 z69) {
        str.getClass();
        z69 z692 = (z69) this.zzb.get(str);
        if (z692 != null) {
            return z692;
        }
        return z69;
    }

    public final hm8 v() {
        hm8 hm8 = this.zzb;
        if (!hm8.w) {
            this.zzb = hm8.a();
        }
        return this.zzb;
    }
}
