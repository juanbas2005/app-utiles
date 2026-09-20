package defpackage;

/* renamed from: r76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r76 implements ex1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ll7 x;

    public /* synthetic */ r76(ll7 ll7, int i) {
        this.w = i;
        this.x = ll7;
    }

    public final double b(double d) {
        double d2 = d;
        int i = this.w;
        ll7 ll7 = this.x;
        switch (i) {
            case b85.b:
                float[] fArr = vt0.a;
                return vt0.a(ll7, d2);
            case 1:
                float[] fArr2 = vt0.a;
                return vt0.c(ll7, d2);
            case 2:
                double d3 = ll7.b;
                double d4 = ll7.c;
                double d5 = ll7.d;
                double d6 = ll7.e;
                double d7 = ll7.a;
                if (d2 >= d6) {
                    return Math.pow((d3 * d2) + d4, d7);
                }
                return d5 * d2;
            case 3:
                double d8 = ll7.b;
                double d9 = ll7.c;
                double d10 = ll7.d;
                double d11 = ll7.e;
                double d12 = ll7.f;
                double d13 = ll7.g;
                double d14 = d8;
                double d15 = ll7.a;
                if (d2 >= d11) {
                    return Math.pow((d14 * d2) + d9, d15) + d12;
                }
                return (d10 * d2) + d13;
            case 4:
                float[] fArr3 = vt0.a;
                return vt0.b(ll7, d2);
            case 5:
                float[] fArr4 = vt0.a;
                return vt0.d(ll7, d2);
            case 6:
                double d16 = ll7.b;
                double d17 = ll7.c;
                double d18 = ll7.d;
                double d19 = ll7.e;
                double d20 = ll7.a;
                if (d2 >= d19 * d18) {
                    return (Math.pow(d2, 1.0d / d20) - d17) / d16;
                }
                return d2 / d18;
            default:
                double d21 = ll7.b;
                double d22 = ll7.c;
                double d23 = ll7.d;
                double d24 = ll7.e;
                double d25 = ll7.f;
                double d26 = ll7.g;
                double d27 = ll7.a;
                if (d2 >= d24 * d23) {
                    return (Math.pow(d2 - d25, 1.0d / d27) - d22) / d21;
                }
                return (d2 - d26) / d23;
        }
    }
}
