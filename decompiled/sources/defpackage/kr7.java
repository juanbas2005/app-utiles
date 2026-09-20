package defpackage;

/* renamed from: kr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kr7 extends af3 {
    public final /* synthetic */ int b = 0;

    public kr7(byte b2) {
        super(Byte.valueOf(b2));
    }

    public final vw3 a(sl4 sl4) {
        fu6 g0;
        fu6 g02;
        fu6 g03;
        fu6 g04;
        int i = this.b;
        x62 x62 = x62.V;
        sl4.getClass();
        switch (i) {
            case b85.b:
                ql4 y = r16.y(sl4, m27.S);
                if (y == null || (g0 = y.g0()) == null) {
                    return z62.c(x62, "UByte");
                }
                return g0;
            case 1:
                ql4 y2 = r16.y(sl4, m27.U);
                if (y2 == null || (g02 = y2.g0()) == null) {
                    return z62.c(x62, "UInt");
                }
                return g02;
            case 2:
                ql4 y3 = r16.y(sl4, m27.V);
                if (y3 == null || (g03 = y3.g0()) == null) {
                    return z62.c(x62, "ULong");
                }
                return g03;
            default:
                ql4 y4 = r16.y(sl4, m27.T);
                if (y4 == null || (g04 = y4.g0()) == null) {
                    return z62.c(x62, "UShort");
                }
                return g04;
        }
    }

    public final String toString() {
        int i = this.b;
        Object obj = this.a;
        switch (i) {
            case b85.b:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public kr7(short s) {
        super(Short.valueOf(s));
    }

    public kr7(int i) {
        super(Integer.valueOf(i));
    }

    public kr7(long j) {
        super(Long.valueOf(j));
    }
}
