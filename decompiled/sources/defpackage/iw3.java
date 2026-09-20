package defpackage;

/* renamed from: iw3  reason: default package */
public final class iw3 implements sr2 {
    public final /* synthetic */ int w;
    public final jw3 x;

    public /* synthetic */ iw3(jw3 jw3, int i) {
        this.w = i;
        this.x = jw3;
    }

    public final Object b() {
        switch (this.w) {
            case b85.b:
                jw3 jw3 = this.x;
                yu3 yu3 = jw3.Q().A.i;
                if (yu3 == null) {
                    return new in1(jw3.Q());
                }
                return new ew3(jw3, yu3, jw3.Q().a().size(), qr3.z, (vp7) jw3.Q().E.getValue());
            default:
                return hj8.q(this.x, false);
        }
    }
}
