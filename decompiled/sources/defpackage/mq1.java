package defpackage;

/* renamed from: mq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mq1 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mq1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.w = i2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.x = i;
    }

    public final Object y(Object obj) {
        int i;
        boolean z2;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        bg7 bg7 = null;
        int i3 = this.x;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i2) {
            case b85.b:
                te3 te3 = (te3) obj3;
                hp4 hp4 = (hp4) obj2;
                if (obj == ((oq1) obj4)) {
                    h.s("A derived state calculation cannot read itself");
                    return null;
                } else if (!(obj instanceof n37)) {
                    return vs7;
                } else {
                    int i4 = te3.a - i3;
                    int d = hp4.d(obj);
                    if (d >= 0) {
                        i = hp4.c[d];
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    hp4.g(Math.min(i4, i), obj);
                    return vs7;
                }
            default:
                l23 l23 = (l23) obj4;
                oh4 oh4 = (oh4) obj3;
                eh5 eh5 = (eh5) obj2;
                dh5 dh5 = (dh5) obj;
                int i5 = l23.x;
                se7 se7 = l23.w;
                tl7 tl7 = l23.y;
                cg7 cg7 = (cg7) l23.z.b();
                if (cg7 != null) {
                    bg7 = cg7.a;
                }
                bg7 bg72 = bg7;
                if (oh4.getLayoutDirection() == ey3.x) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                se7.a(z75.x, h75.c(dh5, i5, tl7, bg72, z2, eh5.w), i3, eh5.w);
                dh5.k(dh5, eh5, Math.round(-se7.a.d()), 0);
                return vs7;
        }
    }
}
