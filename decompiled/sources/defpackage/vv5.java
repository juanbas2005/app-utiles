package defpackage;

/* renamed from: vv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vv5 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ a37 x;
    public final /* synthetic */ a37 y;

    public /* synthetic */ vv5(a37 a37, a37 a372, int i) {
        this.w = i;
        this.x = a37;
        this.y = a372;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        a37 a37 = this.y;
        a37 a372 = this.x;
        switch (i) {
            case b85.b:
                hz1 hz1 = (hz1) obj;
                float e0 = hz1.e0(2.0f);
                float f = e0 / 2.0f;
                hz1.k0(hz1, ((jt0) a372.getValue()).a, hz1.e0(kl8.p / 2.0f) - f, 0, new l57(e0, 0.0f, 0, 0, 30), 108);
                if (lx1.a(((lx1) a37.getValue()).w, 0.0f) > 0) {
                    hz1.k0(hz1, ((jt0) a372.getValue()).a, hz1.e0(((lx1) a37.getValue()).w) - f, 0, rd2.a, 108);
                }
                return vs7;
            default:
                l76 l76 = (l76) obj;
                l76.l(((Number) a372.getValue()).floatValue());
                l76.m(((Number) a372.getValue()).floatValue());
                l76.c(((Number) a37.getValue()).floatValue());
                return vs7;
        }
    }
}
