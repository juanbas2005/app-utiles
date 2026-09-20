package defpackage;

/* renamed from: k5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k5 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ eh5 x;
    public final /* synthetic */ int y;

    public /* synthetic */ k5(int i, int i2, eh5 eh5) {
        this.w = i2;
        this.x = eh5;
        this.y = i;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.y;
        eh5 eh5 = this.x;
        dh5 dh5 = (dh5) obj;
        switch (i) {
            case b85.b:
                dh5.g(eh5, -i2, 0, 0.0f);
                return vs7;
            default:
                dh5.g(eh5, 0, -i2, 0.0f);
                return vs7;
        }
    }
}
