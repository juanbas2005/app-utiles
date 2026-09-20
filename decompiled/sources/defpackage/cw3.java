package defpackage;

/* renamed from: cw3  reason: default package */
public final class cw3 implements sr2 {
    public final /* synthetic */ int w = 1;
    public final dw3 x;
    public final yq3 y;

    public cw3(yq3 yq3, dw3 dw3) {
        this.y = yq3;
        this.x = dw3;
    }

    public final Object b() {
        oq3 oq3;
        int i = this.w;
        vp7 vp7 = null;
        yq3 yq3 = this.y;
        dw3 dw3 = this.x;
        switch (i) {
            case b85.b:
                if (yq3 instanceof oq3) {
                    oq3 = (oq3) yq3;
                } else {
                    oq3 = null;
                }
                if (oq3 != null) {
                    vp7 = ((kq3) oq3.y.getValue()).d();
                }
                vp7 vp72 = vp7.d;
                return aa5.f(dw3.D.c, vp7, dw3, m06.d(yq3.b()));
            default:
                uu3 uu3 = dw3.D.h;
                if (uu3 != null) {
                    return pd8.M(uu3, m06.d(yq3.b()), dw3.U(), new xo3(5, dw3), 4);
                }
                sg3.a0("returnType");
                throw null;
        }
    }

    public cw3(dw3 dw3, yq3 yq3) {
        this.x = dw3;
        this.y = yq3;
    }
}
