package defpackage;

import java.util.List;

/* renamed from: vn3  reason: default package */
public final class vn3 implements sr2 {
    public final /* synthetic */ int w;
    public final xn3 x;

    public /* synthetic */ vn3(xn3 xn3, int i) {
        this.w = i;
        this.x = xn3;
    }

    public final Object b() {
        int i = this.w;
        xn3 xn3 = this.x;
        switch (i) {
            case b85.b:
                List D = sg3.D(om.a(xn3.w.z, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                if (D.isEmpty()) {
                    return me6.x;
                }
                return new tm(0, D);
            default:
                return xn3.w.z.e();
        }
    }
}
