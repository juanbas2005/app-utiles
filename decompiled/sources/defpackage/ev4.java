package defpackage;

/* renamed from: ev4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ev4 implements vr2 {
    public final /* synthetic */ eh5 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ eh5 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int w;
    public final /* synthetic */ eh5 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ ev4(eh5 eh5, int i, int i2, eh5 eh52, int i3, int i4, eh5 eh53, int i5, int i6) {
        this.w = 1;
        this.x = eh5;
        this.y = i;
        this.z = i2;
        this.A = eh52;
        this.B = i3;
        this.C = i4;
        this.D = eh53;
        this.E = i5;
        this.F = i6;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.F;
        int i3 = this.E;
        int i4 = this.C;
        int i5 = this.B;
        eh5 eh5 = this.D;
        int i6 = this.z;
        int i7 = this.y;
        eh5 eh52 = this.A;
        eh5 eh53 = this.x;
        dh5 dh5 = (dh5) obj;
        switch (i) {
            case b85.b:
                if (eh53 != null) {
                    dh5.k(dh5, eh53, (i3 - eh53.w) / 2, (i2 - eh53.x) / 2);
                }
                dh5.k(dh5, eh52, i7, i6);
                dh5.k(dh5, eh5, i5, i4);
                return vs7;
            case 1:
                dh5.k(dh5, eh53, i7, i6);
                dh5.k(dh5, eh52, i5, i4);
                dh5.k(dh5, eh5, i3, i2);
                return vs7;
            default:
                if (eh53 != null) {
                    dh5.k(dh5, eh53, (i3 - eh53.w) / 2, (i2 - eh53.x) / 2);
                }
                dh5.k(dh5, eh52, i7, i6);
                dh5.k(dh5, eh5, i5, i4);
                return vs7;
        }
    }

    public /* synthetic */ ev4(eh5 eh5, eh5 eh52, int i, int i2, eh5 eh53, int i3, int i4, int i5, int i6, int i7) {
        this.w = i7;
        this.x = eh5;
        this.A = eh52;
        this.y = i;
        this.z = i2;
        this.D = eh53;
        this.B = i3;
        this.C = i4;
        this.E = i5;
        this.F = i6;
    }
}
