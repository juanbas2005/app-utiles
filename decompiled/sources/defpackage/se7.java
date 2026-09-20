package defpackage;

/* renamed from: se7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class se7 {
    public static final kg5 g = gl0.Z(new ha7(9), new of6(12));
    public final ad5 a;
    public final ad5 b = new ad5(0.0f);
    public final bd5 c = new bd5(0);
    public ly5 d = ly5.e;
    public long e = lg7.b;
    public final ed5 f;

    public se7(z75 z75, float f2) {
        this.a = new ad5(f2);
        this.f = new ed5(z75, g22.K);
    }

    public final void a(z75 z75, ly5 ly5, int i, int i2) {
        boolean z;
        float f2;
        float f3;
        int i3;
        float f4 = (float) (i2 - i);
        this.b.e(f4);
        float f5 = ly5.a;
        float f6 = ly5.b;
        ly5 ly52 = this.d;
        int i4 = (f5 > ly52.a ? 1 : (f5 == ly52.a ? 0 : -1));
        ad5 ad5 = this.a;
        if (!(i4 == 0 && f6 == ly52.b)) {
            if (z75 == z75.w) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f5 = f6;
            }
            if (z) {
                f2 = ly5.d;
            } else {
                f2 = ly5.c;
            }
            float d2 = ad5.d();
            float f7 = (float) i;
            float f8 = d2 + f7;
            if (f2 > f8 || (f5 < d2 && f2 - f5 > f7)) {
                f3 = f2 - f8;
            } else if (i3 >= 0 || f2 - f5 > f7) {
                f3 = 0.0f;
            } else {
                f3 = f5 - d2;
            }
            ad5.e(ad5.d() + f3);
            this.d = ly5;
        }
        ad5.e(z65.o(ad5.d(), 0.0f, f4));
        this.c.e(i);
    }
}
