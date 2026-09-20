package defpackage;

/* renamed from: ne7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ne7 implements vr2 {
    public final /* synthetic */ ze7 A;
    public final /* synthetic */ v35 B;
    public final /* synthetic */ u44 w;
    public final /* synthetic */ ok2 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ ne7(u44 u44, ok2 ok2, boolean z2, boolean z3, ze7 ze7, v35 v35) {
        this.w = u44;
        this.x = ok2;
        this.y = z2;
        this.z = z3;
        this.A = ze7;
        this.B = v35;
    }

    public final Object y(Object obj) {
        gy6 gy6;
        l35 l35 = (l35) obj;
        u44 u44 = this.w;
        if (!u44.b()) {
            ok2.a(this.x);
        } else if (!this.y && (gy6 = u44.c) != null) {
            ((ip1) gy6).b();
        }
        if (u44.b() && this.z) {
            if (u44.a() != ey2.x) {
                cg7 d = u44.d();
                if (d != null) {
                    long j = l35.a;
                    jz0 jz0 = u44.d;
                    j71 j71 = u44.v;
                    int h = this.B.h(d.b(true, j));
                    j71.y(hf7.a((hf7) jz0.x, (vl) null, i95.a(h, h), 5));
                    if (u44.a.a.x.length() > 0) {
                        u44.k.setValue(ey2.y);
                    }
                }
            } else {
                this.A.g(l35);
            }
        }
        return vs7.a;
    }
}
