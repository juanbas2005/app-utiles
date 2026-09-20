package defpackage;

/* renamed from: v26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class v26 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ Long y;
    public final /* synthetic */ aq4 z;

    public /* synthetic */ v26(gs2 gs2, Long l, aq4 aq4, int i) {
        this.w = i;
        this.x = gs2;
        this.y = l;
        this.z = aq4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.z;
        Long l = this.y;
        gs2 gs2 = this.x;
        Long l2 = (Long) obj;
        switch (i) {
            case b85.b:
                gs2.H(l2, l);
                aq4.setValue(Boolean.FALSE);
                return vs7;
            default:
                gs2.H(l, l2);
                aq4.setValue(Boolean.FALSE);
                return vs7;
        }
    }
}
