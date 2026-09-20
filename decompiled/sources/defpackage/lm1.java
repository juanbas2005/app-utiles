package defpackage;

/* renamed from: lm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lm1 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(m34 m34, boolean z) {
        if (z) {
            return ((n34) dt0.G0(m34.k)).a + 1;
        }
        return ((n34) dt0.w0(m34.k)).a - 1;
    }

    public static int b(d04 d04, boolean z) {
        int i;
        int i2;
        z75 z75 = z75.w;
        if (z) {
            e04 e04 = (e04) dt0.G0(d04.m);
            if (d04.q == z75) {
                i2 = e04.s;
            } else {
                i2 = e04.t;
            }
            return i2 + 1;
        }
        e04 e042 = (e04) dt0.w0(d04.m);
        if (d04.q == z75) {
            i = e042.s;
        } else {
            i = e042.t;
        }
        return i - 1;
    }
}
