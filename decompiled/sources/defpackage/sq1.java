package defpackage;

/* renamed from: sq1  reason: default package */
public final class sq1 implements sr2 {
    public final /* synthetic */ int w;
    public final vq1 x;

    public /* synthetic */ sq1(vq1 vq1, int i) {
        this.w = i;
        this.x = vq1;
    }

    public final Object b() {
        int i = this.w;
        vq1 vq1 = this.x;
        switch (i) {
            case b85.b:
                return g18.d(vq1.R());
            case 1:
                return vq1.P(true);
            default:
                if (r16.Z(vq1)) {
                    return vq1.P(false);
                }
                return vq1.a();
        }
    }
}
