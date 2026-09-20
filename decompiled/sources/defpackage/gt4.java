package defpackage;

/* renamed from: gt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gt4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ht4 x;

    public /* synthetic */ gt4(ht4 ht4, int i) {
        this.w = i;
        this.x = ht4;
    }

    public final Object y(Object obj) {
        boolean containsKey;
        int i = this.w;
        ht4 ht4 = this.x;
        qt4 qt4 = (qt4) obj;
        switch (i) {
            case b85.b:
                qt4.getClass();
                containsKey = ht4.l.containsKey(Integer.valueOf(qt4.x.a));
                break;
            default:
                qt4.getClass();
                containsKey = ht4.l.containsKey(Integer.valueOf(qt4.x.a));
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
