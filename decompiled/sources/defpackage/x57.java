package defpackage;

/* renamed from: x57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class x57 implements vr2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ y57 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ eh5 y;
    public final /* synthetic */ float z;

    public /* synthetic */ x57(y57 y57, long j, eh5 eh5, float f, float f2, float f3, float f4) {
        this.w = y57;
        this.x = j;
        this.y = eh5;
        this.z = f;
        this.A = f2;
        this.B = f3;
        this.C = f4;
    }

    public final Object y(Object obj) {
        int i;
        int i2;
        dh5 dh5 = (dh5) obj;
        y57 y57 = this.w;
        z57 a1 = y57.a1(y57, 12);
        boolean v = a1.v((byte) 13);
        long j = this.x;
        y57 y572 = y57;
        eh5 eh5 = this.y;
        if (v || !a1.v((byte) 15)) {
            i = Math.round(this.A);
        } else {
            i = (k31.h(j) - eh5.w) - Math.round(this.z);
        }
        if (!a1.v((byte) 16) || a1.v((byte) 14)) {
            i2 = Math.round(this.C);
        } else {
            i2 = (k31.g(j) - eh5.x) - Math.round(this.B);
        }
        if ((a1.r() & 4) != 0) {
            ay5 ay5 = y572.W;
            if (ay5 == null) {
                ay5 = new ay5(18, (Object) y572);
                y572.W = ay5;
            }
            dh5.n(dh5, eh5, i, i2, ay5, 4);
        } else {
            dh5.g(eh5, i, i2, 0.0f);
        }
        return vs7.a;
    }
}
