package defpackage;

import java.util.List;

/* renamed from: ci4  reason: default package */
public final class ci4 implements sr2 {
    public final ei4 w;
    public final boolean x;
    public final qs5 y;

    public ci4(ei4 ei4, boolean z, qs5 qs5) {
        this.w = ei4;
        this.x = z;
        this.y = qs5;
    }

    public final Object b() {
        List list;
        ei4 ei4 = this.w;
        z00 z00 = ei4.a;
        st5 a = ei4.a((vj1) z00.c);
        if (a != null) {
            ws1 ws1 = (ws1) z00.a;
            boolean z = this.x;
            qs5 qs5 = this.y;
            if (z) {
                list = dt0.b1(ws1.e.f(a, qs5));
            } else {
                list = dt0.b1(ws1.e.o(a, qs5));
            }
        } else {
            list = null;
        }
        if (list == null) {
            return a42.w;
        }
        return list;
    }
}
