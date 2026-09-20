package defpackage;

/* renamed from: mj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mj6 implements sr2 {
    public final /* synthetic */ nz3 A;
    public final /* synthetic */ tt2 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ zc9 z;

    public /* synthetic */ mj6(tt2 tt2, int i, int i2, zc9 zc9, nz3 nz3) {
        this.w = tt2;
        this.x = i;
        this.y = i2;
        this.z = zc9;
        this.A = nz3;
    }

    public final Object b() {
        boolean z2;
        tt2 tt2 = this.w;
        bg7 bg7 = (bg7) tt2.e;
        int intValue = ((Number) this.A.getValue()).intValue();
        zc9 zc9 = this.z;
        boolean z3 = zc9.x;
        if (zc9.b() == fc1.w) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = this.x;
        long j = bg7.j(i);
        pn4 pn4 = bg7.b;
        int i2 = lg7.c;
        int i3 = (int) (j >> 32);
        int d = pn4.d(i3);
        int i4 = pn4.f;
        if (d != intValue) {
            if (intValue >= i4) {
                i3 = bg7.g(i4 - 1);
            } else {
                i3 = bg7.g(intValue);
            }
        }
        int i5 = (int) (j & 4294967295L);
        if (pn4.d(i5) != intValue) {
            if (intValue >= i4) {
                i5 = pn4.c(i4 - 1, false);
            } else {
                i5 = pn4.c(intValue, false);
            }
        }
        int i6 = this.y;
        if (i3 == i6) {
            return tt2.b(i5);
        }
        if (i5 == i6) {
            return tt2.b(i3);
        }
        if (!(z3 ^ z2) ? i >= i3 : i > i5) {
            i3 = i5;
        }
        return tt2.b(i3);
    }
}
