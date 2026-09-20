package defpackage;

/* renamed from: ik7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ik7 implements vr2 {
    public final /* synthetic */ eh5 A;
    public final /* synthetic */ long B;
    public final /* synthetic */ int C;
    public final /* synthetic */ jk7 D;
    public final /* synthetic */ eh5 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ eh5 z;

    public /* synthetic */ ik7(eh5 eh5, int i, int i2, eh5 eh52, eh5 eh53, long j, int i3, jk7 jk7, int i4, int i5) {
        this.w = eh5;
        this.x = i;
        this.y = i2;
        this.z = eh52;
        this.A = eh53;
        this.B = j;
        this.C = i3;
        this.D = jk7;
    }

    public final Object y(Object obj) {
        int h;
        dh5 dh5 = (dh5) obj;
        eh5 eh5 = this.w;
        int i = eh5.x;
        int i2 = this.y;
        int i3 = this.x;
        dh5.k(dh5, eh5, i3, (i2 - i) / 2);
        int max = Math.max(dh5.r0(vn.b), eh5.w);
        eh5 eh52 = this.A;
        int i4 = eh52.w;
        g80 g80 = this.D.b;
        eh5 eh53 = this.z;
        int i5 = eh53.w;
        long j = this.B;
        int a = g80.a(i5, k31.h(j), ey3.w);
        if (a < max) {
            h = max - a;
        } else {
            if (eh53.w + a > k31.h(j) - i4) {
                h = (k31.h(j) - i4) - (eh53.w + a);
            }
            dh5.k(dh5, eh53, a, (i2 - eh53.x) / 2);
            dh5.k(dh5, eh52, (k31.h(j) - eh52.w) - this.C, (i2 - eh52.x) / 2);
            return vs7.a;
        }
        a += h + i3;
        dh5.k(dh5, eh53, a, (i2 - eh53.x) / 2);
        dh5.k(dh5, eh52, (k31.h(j) - eh52.w) - this.C, (i2 - eh52.x) / 2);
        return vs7.a;
    }
}
