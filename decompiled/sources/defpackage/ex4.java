package defpackage;

/* renamed from: ex4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ex4 implements vr2 {
    public final /* synthetic */ ib A;
    public final /* synthetic */ int B;
    public final /* synthetic */ eh5 C;
    public final /* synthetic */ a37 D;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ eh5 x;
    public final /* synthetic */ eh5 y;
    public final /* synthetic */ int z;

    public /* synthetic */ ex4(boolean z2, eh5 eh5, eh5 eh52, int i, ib ibVar, int i2, eh5 eh53, a37 a37) {
        this.w = z2;
        this.x = eh5;
        this.y = eh52;
        this.z = i;
        this.A = ibVar;
        this.B = i2;
        this.C = eh53;
        this.D = a37;
    }

    public final Object y(Object obj) {
        int i;
        dh5 dh5 = (dh5) obj;
        boolean z2 = this.w;
        eh5 eh5 = this.x;
        eh5 eh52 = this.y;
        a37 a37 = this.D;
        if (z2) {
            dh5.k(dh5, eh5, 0, 0);
            int h = (int) (fx4.h(a37) * ((float) eh52.x));
            int i2 = this.z;
            dh5.k(dh5, eh52, 0, i2 - h);
            g80 g80 = xb4.K;
            ib ibVar = this.A;
            boolean e = sg3.e(ibVar, g80);
            eh5 eh53 = this.C;
            if (e) {
                i = dh5.r0(16.0f);
            } else {
                boolean e2 = sg3.e(ibVar, xb4.L);
                int i3 = this.B;
                if (e2) {
                    i = (i3 - eh53.w) / 2;
                } else {
                    i = (i3 - eh53.w) - dh5.r0(16.0f);
                }
            }
            dh5.k(dh5, eh53, i, ((i2 - eh53.x) - dh5.r0(16.0f)) - ((int) (((Number) a37.getValue()).floatValue() * ((float) eh52.x))));
        } else {
            dh5.k(dh5, eh52, (int) (0.0f - ((1.0f - fx4.h(a37)) * ((float) eh52.w))), 0);
            dh5.k(dh5, eh5, (int) (((Number) a37.getValue()).floatValue() * ((float) eh52.w)), 0);
        }
        return vs7.a;
    }
}
