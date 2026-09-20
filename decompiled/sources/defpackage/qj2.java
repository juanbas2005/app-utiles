package defpackage;

/* renamed from: qj2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qj2 implements vr2 {
    public final /* synthetic */ eh5[] A;
    public final /* synthetic */ rj2 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ ey3 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int[] F;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ qj2(int[] iArr, int i, int i2, int i3, eh5[] eh5Arr, rj2 rj2, int i4, ey3 ey3, int i5, int[] iArr2) {
        this.w = iArr;
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = eh5Arr;
        this.B = rj2;
        this.C = i4;
        this.D = ey3;
        this.E = i5;
        this.F = iArr2;
    }

    public final Object y(Object obj) {
        int i;
        ba6 ba6;
        ie1 ie1;
        dh5 dh5 = (dh5) obj;
        int[] iArr = this.w;
        if (iArr != null) {
            i = iArr[this.x];
        } else {
            i = 0;
        }
        int i2 = this.y;
        for (int i3 = i2; i3 < this.z; i3++) {
            eh5 eh5 = this.A[i3];
            eh5.getClass();
            Object B2 = eh5.B();
            if (B2 instanceof ba6) {
                ba6 = (ba6) B2;
            } else {
                ba6 = null;
            }
            if (ba6 == null || (ie1 = ba6.c) == null) {
                ie1 = this.B.d;
            }
            ie1 ie12 = ie1;
            int Z = eh5.Z();
            dh5.g(eh5, this.F[i3 - i2], ie12.o(this.C, Z, this.D, eh5, this.E) + i, 0.0f);
        }
        return vs7.a;
    }
}
