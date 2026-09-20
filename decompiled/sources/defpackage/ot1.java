package defpackage;

/* renamed from: ot1  reason: default package */
public final class ot1 implements sr2 {
    public final /* synthetic */ int w;
    public final pt1 x;
    public final qt1 y;

    public /* synthetic */ ot1(pt1 pt1, qt1 qt1, int i) {
        this.w = i;
        this.x = pt1;
        this.y = qt1;
    }

    public final Object b() {
        int i = this.w;
        qt1 qt1 = this.y;
        pt1 pt1 = this.x;
        switch (i) {
            case b85.b:
                return wn6.o(pt1.a.keySet(), qt1.o());
            default:
                return wn6.o(pt1.b.keySet(), qt1.p());
        }
    }
}
