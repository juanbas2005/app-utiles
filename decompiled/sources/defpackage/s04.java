package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: s04  reason: default package */
public final class s04 implements sr2 {
    public final /* synthetic */ int w;
    public final t04 x;

    public /* synthetic */ s04(t04 t04, int i) {
        this.w = i;
        this.x = t04;
    }

    public final Object b() {
        ql4 ql4;
        yb5 yb5;
        int i = this.w;
        t04 t04 = this.x;
        switch (i) {
            case b85.b:
                return m06.a(kl8.u(kl8.p(t04.b.a))).a();
            case 1:
                up2 f = t04.f();
                n06 n06 = t04.b;
                am6 am6 = t04.a;
                if (f == null) {
                    return z62.c(x62.a0, n06.toString());
                }
                pj3 pj3 = (pj3) am6.x;
                sl4 sl4 = pj3.o;
                fv3 g = sl4.g();
                g.getClass();
                String str = tj3.a;
                gq0 g2 = tj3.g(f);
                if (g2 != null) {
                    ql4 = g.j(g2.a());
                } else {
                    ql4 = null;
                }
                if (ql4 == null) {
                    x06 x06 = new x06(kl8.u(kl8.p(n06.a)));
                    rg4 rg4 = pj3.k;
                    rg4.getClass();
                    ns8 ns8 = (ns8) rg4.x;
                    if (ns8 != null) {
                        ql4 = ns8.U(x06);
                        if (ql4 == null) {
                            ql4 = r16.B(sl4, new gq0(f.b(), f.a.g()), pj3.d.c().l);
                        }
                    } else {
                        sg3.a0("resolver");
                        throw null;
                    }
                }
                return ql4.g0();
            default:
                ArrayList b = t04.b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    o06 o06 = (o06) it.next();
                    uq4 uq4 = o06.a;
                    if (uq4 == null) {
                        uq4 = nn3.b;
                    }
                    e21 a = t04.a(o06);
                    if (a != null) {
                        yb5 = new yb5(uq4, a);
                    } else {
                        yb5 = null;
                    }
                    if (yb5 != null) {
                        arrayList.add(yb5);
                    }
                }
                return sf4.a0(arrayList);
        }
    }
}
