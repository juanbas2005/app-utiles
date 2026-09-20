package defpackage;

/* renamed from: ad4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ad4 extends wx3 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad4(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.x = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public final Object b() {
        int i = this.x;
        vs7 vs7 = vs7.a;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i) {
            case b85.b /*0*/:
                gs2 gs2 = (gs2) obj3;
                dd4 dd4 = (dd4) ((h06) obj2).w;
                k23 k23 = (k23) obj;
                tp4 tp4 = dd4.I;
                if (tp4 == null) {
                    long[] jArr = bg6.a;
                    tp4 = new tp4();
                    dd4.I = tp4;
                }
                Object g = tp4.g(k23);
                if (g == null) {
                    g = new yc4(dd4);
                    tp4.m(k23, g);
                }
                yc4 yc4 = (yc4) g;
                yc4.w = false;
                gs2.H(yc4, k23);
                return vs7;
            default:
                a1 a1Var = (a1) obj3;
                a1Var.removeOnAttachStateChangeListener((fg) obj2);
                i35.g(a1Var).a.remove((kj6) obj);
                return vs7;
        }
    }
}
