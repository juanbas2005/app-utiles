package defpackage;

/* renamed from: s76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s76 extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ t76 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s76(t76 t76, int i) {
        super(1);
        this.x = i;
        this.y = t76;
    }

    public final Object y(Object obj) {
        int i = this.x;
        t76 t76 = this.y;
        switch (i) {
            case b85.b:
                return Double.valueOf(t76.n.b(z65.n(((Number) obj).doubleValue(), (double) t76.e, (double) t76.f)));
            default:
                return Double.valueOf(z65.n(t76.k.b(((Number) obj).doubleValue()), (double) t76.e, (double) t76.f));
        }
    }
}
