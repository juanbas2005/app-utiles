package defpackage;

/* renamed from: q76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class q76 implements ex1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ double x;

    public /* synthetic */ q76(double d, int i) {
        this.w = i;
        this.x = d;
    }

    public final double b(double d) {
        switch (this.w) {
            case b85.b:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, 1.0d / this.x);
            default:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, this.x);
        }
    }
}
