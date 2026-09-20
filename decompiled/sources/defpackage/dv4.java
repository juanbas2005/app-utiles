package defpackage;

/* renamed from: dv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dv4 implements vr2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ eh5 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ float D;
    public final /* synthetic */ eh5 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ eh5 w;
    public final /* synthetic */ eh5 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ float z;

    public /* synthetic */ dv4(eh5 eh5, float f, eh5 eh52, int i, float f2, float f3, eh5 eh53, int i2, float f4, eh5 eh54, int i3, float f5, int i4) {
        this.w = eh5;
        this.x = eh52;
        this.y = i;
        this.z = f2;
        this.A = f3;
        this.B = eh53;
        this.C = i2;
        this.D = f4;
        this.E = eh54;
        this.F = i3;
        this.G = f5;
        this.H = i4;
    }

    public final Object y(Object obj) {
        dh5 dh5 = (dh5) obj;
        eh5 eh5 = this.w;
        float f = this.A;
        float f2 = this.D;
        if (eh5 != null) {
            dh5.k(dh5, eh5, (this.H - eh5.w) / 2, dh4.C((f2 - ((float) dh5.r0(hv4.e))) + f));
        }
        dh5.k(dh5, this.x, this.y, dh4.C(this.z + f));
        dh5.k(dh5, this.B, this.C, dh4.C(f2 + f));
        dh5.k(dh5, this.E, this.F, dh4.C(this.G + f));
        return vs7.a;
    }
}
