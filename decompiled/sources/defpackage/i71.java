package defpackage;

/* renamed from: i71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class i71 implements gs2 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;

    public /* synthetic */ i71(h06 h06, boolean z) {
        this.y = h06;
        this.x = z;
    }

    public final Object H(Object obj, Object obj2) {
        tr8 tr8;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.y;
        boolean z = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                pv8.j((ze7) obj3, z, (yt2) obj, b85.v(1));
                return vs7;
            case 1:
                h06 h06 = (h06) obj3;
                e81 e81 = (e81) obj;
                c81 c81 = (c81) obj2;
                if (!(c81 instanceof tr8)) {
                    return e81.X(c81);
                }
                z53 z53 = tr8.y;
                c81 a0 = ((e81) h06.w).a0(z53);
                if (a0 == null) {
                    if (z) {
                        tr8 = new tr8(((tr8) c81).x, sp8.a);
                    } else {
                        tr8 = (tr8) c81;
                    }
                    return e81.X(tr8);
                }
                h06.w = ((e81) h06.w).L(z53);
                tr8 tr82 = (tr8) a0.a0(z53);
                return e81.X(new tr8(((tr8) c81).x, sp8.a));
            default:
                ((Integer) obj2).getClass();
                ed1.e(z, (gs2) obj3, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ i71(ze7 ze7, boolean z, int i) {
        this.y = ze7;
        this.x = z;
    }

    public /* synthetic */ i71(boolean z, gs2 gs2, int i) {
        this.x = z;
        this.y = gs2;
    }
}
