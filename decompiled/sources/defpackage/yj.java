package defpackage;

/* renamed from: yj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yj extends wx3 implements hs2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(int i, Object obj) {
        super(3);
        this.x = i;
        this.y = obj;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.x;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                eh5 y2 = ((gh4) obj2).y(((k31) obj3).a);
                return ((oh4) obj).d0(y2.w, y2.x, b42.w, new lh(5, y2, (k51) obj4));
            default:
                yt2 yt2 = ((cv6) obj).a;
                yt2 yt22 = (yt2) obj2;
                ((Number) obj3).intValue();
                int hashCode = Long.hashCode(yt22.T);
                ml4 E = gw8.E(yt22, (ml4) obj4);
                yt2.f0(509942095);
                ux0.d.getClass();
                g75.Q(tx0.d, yt2, E);
                g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                yt2.r(false);
                return vs7.a;
        }
    }
}
