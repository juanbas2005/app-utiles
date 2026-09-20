package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: i52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i52 {
    public static final lo7 a = new lo7(ce.U, ce.V);
    public static final x17 b = kl8.M(0.0f, 400.0f, (Object) null, 5);
    public static final x17 c = kl8.M(0.0f, 400.0f, (Object) null, 5);
    public static final x17 d = kl8.M(0.0f, 400.0f, new oe3(4294967297L), 1);
    public static final x17 e = kl8.M(0.0f, 400.0f, new we3(4294967297L), 1);

    static {
        Map map = l78.a;
    }

    public static final void a(mm7 mm7, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        yt2.g0(-1186853286);
        if (yt2.g(mm7)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            ed5 ed5 = mm7.e;
            ed5 ed52 = mm7.d;
            if (ed5.getValue() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sg3.e(mm7.a.H0(), ed52.getValue()) && !z2) {
                sr2.b();
            }
            Object Q = yt2.Q();
            Object obj = ay0.a;
            Object obj2 = Q;
            if (Q == obj) {
                boolean[] zArr = {z2};
                yt2.o0(zArr);
                obj2 = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj2;
            Object Q2 = yt2.Q();
            if (Q2 == obj) {
                Q2 = new Object[1];
                yt2.o0(Q2);
            }
            Object[] objArr = (Object[]) Q2;
            if (!sg3.e(objArr[0], ed52.getValue())) {
                if (!z2 && !zArr2[0]) {
                    sr2.b();
                }
                objArr[0] = ed52.getValue();
            }
            zArr2[0] = z2;
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new af(mm7, sr2, i);
        }
    }

    public static n52 b(je2 je2, g80 g80, int i) {
        i80 i80;
        g80 g802 = xb4.M;
        if ((i & 1) != 0) {
            Map map = l78.a;
            je2 = kl8.M(0.0f, 400.0f, new we3(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            g80 = g802;
        }
        if (sg3.e(g80, xb4.K)) {
            i80 = xb4.B;
        } else if (sg3.e(g80, g802)) {
            i80 = xb4.D;
        } else {
            i80 = xb4.C;
        }
        return c(i80, je2, new xc4(1, 21));
    }

    public static final n52 c(jb jbVar, je2 je2, vr2 vr2) {
        return new n52(new nm7((gb2) null, (dv6) null, new cn0(jbVar, je2, vr2), (xf6) null, (LinkedHashMap) null, 123));
    }

    public static n52 d(je2 je2, int i) {
        i80 i80;
        h80 h80 = xb4.J;
        if ((i & 1) != 0) {
            Map map = l78.a;
            je2 = kl8.M(0.0f, 400.0f, new we3(4294967297L), 1);
        }
        if (sg3.e(h80, xb4.H)) {
            i80 = xb4.z;
        } else if (sg3.e(h80, h80)) {
            i80 = xb4.F;
        } else {
            i80 = xb4.C;
        }
        return c(i80, je2, new xc4(1, 22));
    }

    public static n52 e(je2 je2, int i) {
        if ((i & 1) != 0) {
            je2 = kl8.M(0.0f, 400.0f, (Object) null, 5);
        }
        return new n52(new nm7(new gb2(0.0f, je2), (dv6) null, (cn0) null, (xf6) null, (LinkedHashMap) null, 126));
    }

    public static x82 f(je2 je2, int i) {
        if ((i & 1) != 0) {
            je2 = kl8.M(0.0f, 400.0f, (Object) null, 5);
        }
        return new x82(new nm7(new gb2(0.0f, je2), (dv6) null, (cn0) null, (xf6) null, (LinkedHashMap) null, 126));
    }

    public static x82 g(je2 je2, g80 g80, int i) {
        i80 i80;
        g80 g802 = xb4.M;
        if ((i & 1) != 0) {
            Map map = l78.a;
            je2 = kl8.M(0.0f, 400.0f, new we3(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            g80 = g802;
        }
        if (sg3.e(g80, xb4.K)) {
            i80 = xb4.B;
        } else if (sg3.e(g80, g802)) {
            i80 = xb4.D;
        } else {
            i80 = xb4.C;
        }
        return h(i80, je2, new xc4(1, 23));
    }

    public static final x82 h(jb jbVar, je2 je2, vr2 vr2) {
        return new x82(new nm7((gb2) null, (dv6) null, new cn0(jbVar, je2, vr2), (xf6) null, (LinkedHashMap) null, 123));
    }

    public static x82 i(je2 je2, int i) {
        i80 i80;
        h80 h80 = xb4.J;
        if ((i & 1) != 0) {
            Map map = l78.a;
            je2 = kl8.M(0.0f, 400.0f, new we3(4294967297L), 1);
        }
        if (sg3.e(h80, xb4.H)) {
            i80 = xb4.z;
        } else if (sg3.e(h80, h80)) {
            i80 = xb4.F;
        } else {
            i80 = xb4.C;
        }
        return h(i80, je2, new xc4(1, 24));
    }

    public static final n52 j(je2 je2, vr2 vr2) {
        return new n52(new nm7((gb2) null, new dv6(je2, new h52(0, vr2)), (cn0) null, (xf6) null, (LinkedHashMap) null, 125));
    }

    public static final x82 k(je2 je2, vr2 vr2) {
        return new x82(new nm7((gb2) null, new dv6(je2, new h52(1, vr2)), (cn0) null, (xf6) null, (LinkedHashMap) null, 125));
    }
}
