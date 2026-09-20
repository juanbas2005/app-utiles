package defpackage;

import java.util.List;

/* renamed from: vs2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vs2 extends vv2 {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs2(kb4 kb4, j0 j0Var, int i) {
        super(kb4, j0Var);
        this.e = i;
    }

    public final List h() {
        int i = this.e;
        a42 a42 = a42.w;
        switch (i) {
            case b85.b:
                ss2 ss2 = (ss2) this.b;
                ht2 ht2 = ss2.C;
                if (sg3.e(ht2, dt2.d)) {
                    return sg3.D(pd8.m(ss2, false));
                }
                if (sg3.e(ht2, gt2.d)) {
                    return sg3.D(pd8.m(ss2, true));
                }
                return a42;
            default:
                return a42;
        }
    }
}
