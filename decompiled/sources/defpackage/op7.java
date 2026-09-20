package defpackage;

/* renamed from: op7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class op7 {
    public static final op7 i = new op7(new op7((op7) null, 2047), 2012);
    public final boolean a;
    public final boolean b;
    public final op7 c;
    public final boolean d;
    public final op7 e;
    public final op7 f;
    public final boolean g;
    public final boolean h;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ op7(op7 op7, int i2) {
        this(r4, r5, r6, true, r6, r6, r10, r11);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        op7 op72 = (i2 & 32) != 0 ? null : op7;
        if ((i2 & 512) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i2 & 1024) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
    }

    public op7(boolean z, boolean z2, op7 op7, boolean z3, op7 op72, op7 op73, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = op7;
        this.d = z3;
        this.e = op72;
        this.f = op73;
        this.g = z4;
        this.h = z5;
    }
}
