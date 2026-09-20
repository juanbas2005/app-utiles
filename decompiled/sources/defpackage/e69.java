package defpackage;

/* renamed from: e69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e69 {
    public static final e69 b = new e69(p36.D);
    public final v93 a;

    static {
        int i = v93.B;
    }

    public e69(v93 v93) {
        this.a = v93;
    }

    public static e69 a(yk8 yk8) {
        String str;
        long j;
        d69 d69;
        int G = yk8.G();
        if (G >= 0) {
            int i = v93.B;
            u93 u93 = new u93();
            long j2 = 0;
            for (int i2 = 0; i2 < G; i2++) {
                long H = yk8.H();
                int i3 = (int) H;
                long j3 = H >>> 3;
                if (j3 == 0) {
                    j = 0;
                    str = yk8.w();
                } else {
                    long j4 = j3 + j2;
                    if (j4 <= 2305843009213693951L) {
                        str = null;
                        j = j4;
                    } else {
                        zz8.b("Flag name larger than max size");
                        return null;
                    }
                }
                int i4 = i3 & 7;
                if (i4 == 0 || i4 == 1) {
                    d69 = new d69(j, str, i4, 0, (Object) null);
                } else if (i4 == 2) {
                    d69 = new d69(j, str, i4, yk8.H(), (Object) null);
                } else if (i4 == 3) {
                    d69 = new d69(j, str, i4, Double.doubleToRawLongBits(yk8.o()), (Object) null);
                } else if (i4 == 4) {
                    d69 = new d69(j, str, i4, 0, yk8.w());
                } else if (i4 == 5) {
                    d69 = new d69(j, str, i4, 0, yk8.z());
                } else {
                    zz8.b(hl6.p(new StringBuilder(String.valueOf(i4).length() + 23), "Unrecognized flag type ", i4));
                    return null;
                }
                long j5 = d69.w;
                if (j5 != 0) {
                    j2 = j5;
                }
                u93.a(d69);
            }
            return new e69(u93.e());
        }
        zz8.b("Negative number of flags");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e69)) {
            return false;
        }
        return this.a.equals(((e69) obj).a);
    }

    public final int hashCode() {
        v93 v93 = this.a;
        v93.getClass();
        return za5.t(v93);
    }
}
