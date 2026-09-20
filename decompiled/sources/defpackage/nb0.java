package defpackage;

/* renamed from: nb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nb0 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ oh4 z;

    public /* synthetic */ nb0(eh5 eh5, gh4 gh4, oh4 oh4, int i, int i2, ob0 ob0) {
        this.A = eh5;
        this.B = gh4;
        this.z = oh4;
        this.x = i;
        this.y = i2;
        this.C = ob0;
    }

    public final Object y(Object obj) {
        ba6 ba6;
        int i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.C;
        oh4 oh4 = this.z;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (i2) {
            case b85.b:
                mb0.b((dh5) obj, (eh5) obj4, (gh4) obj3, oh4.getLayoutDirection(), this.x, this.y, ((ob0) obj2).a);
                return vs7;
            default:
                eh5[] eh5Arr = (eh5[]) obj4;
                au0 au0 = (au0) obj3;
                int[] iArr = (int[]) obj2;
                dh5 dh5 = (dh5) obj;
                int length = eh5Arr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    eh5 eh5 = eh5Arr[i3];
                    int i5 = i4 + 1;
                    eh5.getClass();
                    Object B2 = eh5.B();
                    ie1 ie1 = null;
                    if (B2 instanceof ba6) {
                        ba6 = (ba6) B2;
                    } else {
                        ba6 = null;
                    }
                    ey3 layoutDirection = oh4.getLayoutDirection();
                    if (ba6 != null) {
                        ie1 = ba6.c;
                    }
                    ie1 ie12 = ie1;
                    int i6 = this.x;
                    if (ie12 != null) {
                        i = ie12.o(i6, eh5.w, layoutDirection, eh5, this.y);
                    } else {
                        i = au0.b.a(eh5.w, i6, layoutDirection);
                    }
                    dh5.g(eh5, i, iArr[i4], 0.0f);
                    i3++;
                    i4 = i5;
                }
                return vs7;
        }
    }

    public /* synthetic */ nb0(eh5[] eh5Arr, au0 au0, int i, int i2, oh4 oh4, int[] iArr) {
        this.A = eh5Arr;
        this.B = au0;
        this.x = i;
        this.y = i2;
        this.z = oh4;
        this.C = iArr;
    }
}
