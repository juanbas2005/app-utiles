package defpackage;

import java.lang.reflect.Type;

/* renamed from: gr1  reason: default package */
public final class gr1 implements sr2 {
    public final /* synthetic */ int w;
    public final ir1 x;

    public /* synthetic */ gr1(ir1 ir1, int i) {
        this.w = i;
        this.x = ir1;
    }

    public final Object b() {
        oq3 oq3;
        int i = this.w;
        ir1 ir1 = this.x;
        switch (i) {
            case b85.b:
                return g18.d(ir1.F());
            default:
                pc5 F = ir1.F();
                vq1 vq1 = ir1.w;
                if (!(F instanceof qz3) || !sg3.e(g18.h(vq1), F) || (vq1.w.d == null && vq1.R().u() != 2)) {
                    return (Type) vq1.n().a().get(ir1.x);
                }
                yq3 B = vq1.B();
                if (B instanceof oq3) {
                    oq3 = (oq3) B;
                } else {
                    oq3 = null;
                }
                if (oq3 != null) {
                    return kl8.u(oq3);
                }
                rf2.x("Cannot determine receiver Java type of inherited declaration: ", F);
                return null;
        }
    }
}
