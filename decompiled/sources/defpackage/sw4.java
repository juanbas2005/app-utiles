package defpackage;

/* renamed from: sw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sw4 implements vr2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ eh5 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ eh5 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ float I;
    public final /* synthetic */ int J;
    public final /* synthetic */ eh5 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ float y;
    public final /* synthetic */ eh5 z;

    public /* synthetic */ sw4(eh5 eh5, boolean z2, float f, eh5 eh52, int i, float f2, float f3, eh5 eh53, int i2, float f4, eh5 eh54, int i3, float f5, int i4) {
        this.w = eh5;
        this.x = z2;
        this.y = f;
        this.z = eh52;
        this.A = i;
        this.B = f2;
        this.C = f3;
        this.D = eh53;
        this.E = i2;
        this.F = f4;
        this.G = eh54;
        this.H = i3;
        this.I = f5;
        this.J = i4;
    }

    public final Object y(Object obj) {
        dh5 dh5 = (dh5) obj;
        eh5 eh5 = this.w;
        float f = this.C;
        float f2 = this.F;
        if (eh5 != null) {
            dh5.k(dh5, eh5, (this.J - eh5.w) / 2, dh4.C((f2 - (dh5.b() * ww4.e)) + f));
        }
        if (this.x || this.y != 0.0f) {
            dh5.k(dh5, this.z, this.A, dh4.C(this.B + f));
        }
        dh5.k(dh5, this.D, this.E, dh4.C(f2 + f));
        dh5.k(dh5, this.G, this.H, dh4.C(this.I + f));
        return vs7.a;
    }
}
