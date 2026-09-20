package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ms1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ms1 implements os1 {
    public static final ms1 c;
    public static final ms1 d;
    public static final ms1 e;
    public final ps1 a;
    public final z97 b = new z97(new k3(15, this));

    static {
        ps1 ps1 = new ps1();
        g42 g42 = g42.w;
        ps1.b(g42);
        ps1.a = true;
        new ms1(ps1);
        ps1 ps12 = new ps1();
        ps12.c(false);
        ps12.a = true;
        new ms1(ps12);
        ps1 ps13 = new ps1();
        ps13.c(false);
        ps13.b(g42);
        ps13.a = true;
        new ms1(ps13);
        ps1 ps14 = new ps1();
        ps14.c(false);
        ps14.b(g42);
        ps14.e(true);
        ps14.a = true;
        new ms1(ps14);
        ps1 ps15 = new ps1();
        ps15.b(g42);
        xq0 xq0 = xq0.c;
        ps15.j(xq0);
        qc5 qc5 = qc5.x;
        ps15.i(qc5);
        ps15.a = true;
        new ms1(ps15);
        ps1 ps16 = new ps1();
        ps16.c(false);
        ps16.b(g42);
        ps16.j(xq0);
        ps16.k(true);
        ps16.i(qc5.y);
        ps16.h(true);
        ps16.g(true);
        ps16.e(true);
        ps16.a(true);
        ps16.a = true;
        new ms1(ps16);
        ps1 ps17 = new ps1();
        ps17.b(ns1.x);
        ps17.a = true;
        c = new ms1(ps17);
        ps1 ps18 = new ps1();
        ps18.b(ns1.y);
        ps18.a = true;
        new ms1(ps18);
        ps1 ps19 = new ps1();
        ps19.j(xq0);
        ps19.i(qc5);
        ps19.a = true;
        d = new ms1(ps19);
        ps1 ps110 = new ps1();
        ps110.f(true);
        ps110.j(xq0.b);
        ps110.b(ns1.y);
        ps110.a = true;
        e = new ms1(ps110);
        ps1 ps111 = new ps1();
        ps111.d(n46.x);
        ps111.b(ns1.y);
        ps111.a = true;
        new ms1(ps111);
    }

    public ms1(ps1 ps1) {
        this.a = ps1;
    }

    public static void O(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean a0(vw3 vw3) {
        if (!ag8.A(vw3)) {
            return false;
        }
        List<xp7> G = vw3.G();
        if (G != null && G.isEmpty()) {
            return true;
        }
        for (xp7 c2 : G) {
            if (c2.c()) {
                return false;
            }
        }
        return true;
    }

    public static final void l(ms1 ms1, cr5 cr5, StringBuilder sb) {
        boolean z;
        boolean z2;
        ps1 ps1 = ms1.a;
        if (!ps1.A()) {
            if (!ps1.z()) {
                List h0 = cr5.h0();
                h0.getClass();
                ms1.u(sb, h0);
                if (ps1.u().contains(ns1.C)) {
                    ms1.q(sb, cr5, (mm) null);
                    lc2 f0 = cr5.f0();
                    if (f0 != null) {
                        ms1.q(sb, f0, mm.FIELD);
                    }
                    lc2 c0 = cr5.c0();
                    if (c0 != null) {
                        ms1.q(sb, c0, mm.PROPERTY_DELEGATE_FIELD);
                    }
                    if (ps1.w() == br5.x) {
                        fr5 c2 = cr5.c();
                        if (c2 != null) {
                            ms1.q(sb, c2, mm.PROPERTY_GETTER);
                        }
                        jr5 d2 = cr5.d();
                        if (d2 != null) {
                            ms1.q(sb, d2, mm.PROPERTY_SETTER);
                            List S = d2.S();
                            S.getClass();
                            h28 h28 = (h28) dt0.Q0(S);
                            h28.getClass();
                            ms1.q(sb, h28, mm.SETTER_PARAMETER);
                        }
                    }
                }
                us1 f = cr5.f();
                f.getClass();
                ms1.Y(f, sb);
                if (!ps1.u().contains(ns1.J) || !cr5.B()) {
                    z = false;
                } else {
                    z = true;
                }
                ms1.F(sb, z, "const");
                ms1.C(cr5, sb);
                ms1.E(cr5, sb);
                ms1.K(cr5, sb);
                if (!ps1.u().contains(ns1.K) || !cr5.i0()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ms1.F(sb, z2, "lateinit");
                ms1.B(cr5, sb);
            }
            ms1.V(cr5, sb, false);
            List typeParameters = cr5.getTypeParameters();
            typeParameters.getClass();
            ms1.U(sb, typeParameters, true);
            ms1.M(cr5, sb);
        }
        ms1.H(cr5, sb, true);
        sb.append(": ");
        vw3 b2 = cr5.b();
        b2.getClass();
        sb.append(ms1.P(b2));
        ms1.N(cr5, sb);
        ms1.z(cr5, sb);
        List typeParameters2 = cr5.getTypeParameters();
        typeParameters2.getClass();
        ms1.Z(sb, typeParameters2);
    }

    public static fl4 n(zh4 zh4) {
        ql4 ql4;
        boolean z = zh4 instanceof ql4;
        fl4 fl4 = fl4.A;
        iq0 iq0 = iq0.x;
        fl4 fl42 = fl4.x;
        if (!z) {
            vj1 r = zh4.r();
            if (r instanceof ql4) {
                ql4 = (ql4) r;
            } else {
                ql4 = null;
            }
            if (ql4 == null || !(zh4 instanceof ri0)) {
                return fl42;
            }
            ri0 ri0 = (ri0) zh4;
            Collection s = ri0.s();
            s.getClass();
            boolean isEmpty = s.isEmpty();
            fl4 fl43 = fl4.z;
            if (!isEmpty && ql4.o() != fl42) {
                return fl43;
            }
            if (ql4.v() != iq0 || sg3.e(ri0.f(), vs1.a)) {
                return fl42;
            }
            if (ri0.o() == fl4) {
                return fl4;
            }
            return fl43;
        } else if (((ql4) zh4).v() == iq0) {
            return fl4;
        } else {
            return fl42;
        }
    }

    public final String A(String str) {
        ps1 ps1 = this.a;
        int ordinal = ps1.B().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                h.c();
                return null;
            } else if (!ps1.n()) {
                return f21.h("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void B(ri0 ri0, StringBuilder sb) {
        ps1 ps1 = this.a;
        if (ps1.u().contains(ns1.E) && ps1.D() && ri0.u() != 1) {
            sb.append("/*");
            sb.append(gw8.N(b81.A(ri0.u())));
            sb.append("*/ ");
        }
    }

    public final void C(zh4 zh4, StringBuilder sb) {
        boolean z;
        F(sb, zh4.m(), "external");
        ps1 ps1 = this.a;
        boolean z2 = false;
        if (!ps1.u().contains(ns1.H) || !zh4.H()) {
            z = false;
        } else {
            z = true;
        }
        F(sb, z, "expect");
        if (ps1.u().contains(ns1.I) && zh4.s0()) {
            z2 = true;
        }
        F(sb, z2, "actual");
    }

    public final void D(fl4 fl4, StringBuilder sb, fl4 fl42) {
        ps1 ps1 = this.a;
        jz0 jz0 = ps1.p;
        yr3 yr3 = ps1.Z[14];
        jz0.getClass();
        yr3.getClass();
        if (((Boolean) jz0.x).booleanValue() || fl4 != fl42) {
            F(sb, ps1.u().contains(ns1.A), gw8.N(fl4.name()));
        }
    }

    public final void E(ri0 ri0, StringBuilder sb) {
        if (rs1.q(ri0) && ri0.o() == fl4.x) {
            return;
        }
        if (this.a.v() != f95.w || ri0.o() != fl4.z || ri0.s().isEmpty()) {
            fl4 o = ri0.o();
            o.getClass();
            D(o, sb, n(ri0));
        }
    }

    public final void F(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(A(str));
            sb.append(" ");
        }
    }

    public final String G(uq4 uq4, boolean z) {
        String m = m(h49.L(uq4));
        ps1 ps1 = this.a;
        if (!ps1.n() || ps1.B() != n46.x || !z) {
            return m;
        }
        return f21.h("<b>", m, "</b>");
    }

    public final void H(vj1 vj1, StringBuilder sb, boolean z) {
        uq4 name = vj1.getName();
        name.getClass();
        sb.append(G(name, z));
    }

    public final void I(StringBuilder sb, vw3 vw3) {
        t tVar;
        du7 n0 = vw3.n0();
        if (n0 instanceof t) {
            tVar = (t) n0;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            fu6 fu6 = tVar.y;
            fu6 fu62 = tVar.x;
            ps1 ps1 = this.a;
            jz0 jz0 = ps1.R;
            yr3[] yr3Arr = ps1.Z;
            yr3 yr3 = yr3Arr[42];
            jz0.getClass();
            yr3.getClass();
            boolean booleanValue = ((Boolean) jz0.x).booleanValue();
            l46 l46 = n46.x;
            if (booleanValue) {
                J(sb, fu62);
                jz0 jz02 = ps1.S;
                yr3 yr32 = yr3Arr[43];
                jz02.getClass();
                yr32.getClass();
                if (((Boolean) jz02.x).booleanValue()) {
                    if (ps1.B() == l46) {
                        sb.append("<font color=\"808080\"><i>");
                    }
                    sb.append(" /* ");
                    sb.append("from: ");
                    J(sb, fu6);
                    sb.append(" */");
                    if (ps1.B() == l46) {
                        sb.append("</i></font>");
                        return;
                    }
                    return;
                }
                return;
            }
            J(sb, fu6);
            jz0 jz03 = ps1.Q;
            yr3 yr33 = yr3Arr[41];
            jz03.getClass();
            yr33.getClass();
            if (((Boolean) jz03.x).booleanValue()) {
                if (ps1.B() == l46) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("= ");
                J(sb, fu62);
                sb.append(" */");
                if (ps1.B() == l46) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        J(sb, vw3);
    }

    public final void J(StringBuilder sb, vw3 vw3) {
        boolean z;
        boolean z2;
        String str;
        uq4 uq4;
        boolean z3;
        StringBuilder sb2 = sb;
        vw3 vw32 = vw3;
        ps1 ps1 = this.a;
        if ((vw32 instanceof l44) && ps1.p()) {
            ib4 ib4 = ((l44) vw32).z;
            if (ib4.y == jb4.w || ib4.y == jb4.x) {
                sb2.append("<Not computed yet>");
                return;
            }
        }
        du7 n0 = vw32.n0();
        if (n0 instanceof zg2) {
            sb2.append(((zg2) n0).x0(this, this));
        } else if (n0 instanceof fu6) {
            fu6 fu6 = (fu6) n0;
            if (fu6.equals(iq7.b) || fu6.L() == iq7.a.x) {
                sb2.append("???");
                return;
            }
            wo7 L = fu6.L();
            if ((L instanceof w62) && ((w62) L).w == x62.F) {
                jz0 jz0 = ps1.t;
                yr3 yr3 = ps1.Z[18];
                jz0.getClass();
                yr3.getClass();
                if (((Boolean) jz0.x).booleanValue()) {
                    wo7 L2 = fu6.L();
                    L2.getClass();
                    sb2.append(w(((w62) L2).x[0]));
                    return;
                }
                sb2.append("???");
            } else if (gr8.N(fu6)) {
                v(sb2, fu6);
            } else if (a0(fu6)) {
                int length = sb2.length();
                ((ms1) this.b.getValue()).q(sb2, fu6, (mm) null);
                if (sb2.length() != length) {
                    z = true;
                } else {
                    z = false;
                }
                vw3 w = ag8.w(fu6);
                List s = ag8.s(fu6);
                boolean B = ag8.B(fu6);
                boolean Q = fu6.Q();
                if (Q || (z && w != null)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (B) {
                        sb2.insert(length, '(');
                    } else {
                        if (z) {
                            rd3.C(d57.J0(sb2));
                            if (sb2.charAt(sb2.length() - 2) != ')') {
                                sb2.insert(sb2.length() - 1, "()");
                            }
                        }
                        sb2.append("(");
                    }
                }
                F(sb2, B, "suspend");
                if (!s.isEmpty()) {
                    sb2.append("context(");
                    for (vw3 I : s.subList(0, s.size() - 1)) {
                        I(sb2, I);
                        sb2.append(", ");
                    }
                    I(sb2, (vw3) dt0.G0(s));
                    sb2.append(") ");
                }
                if (w != null) {
                    if ((!a0(w) || w.Q()) && !ag8.B(w) && w.getAnnotations().isEmpty() && !(w instanceof qo1)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        sb2.append("(");
                    }
                    I(sb2, w);
                    if (z3) {
                        sb2.append(")");
                    }
                    sb2.append(".");
                }
                sb2.append("(");
                if (!ag8.A(fu6) || fu6.getAnnotations().m(m27.p) == null || fu6.G().size() > 1) {
                    int i = 0;
                    for (xp7 xp7 : ag8.y(fu6)) {
                        int i2 = i + 1;
                        if (i > 0) {
                            sb2.append(", ");
                        }
                        jz0 jz02 = ps1.U;
                        yr3 yr32 = ps1.Z[45];
                        jz02.getClass();
                        yr32.getClass();
                        if (((Boolean) jz02.x).booleanValue()) {
                            vw3 b2 = xp7.b();
                            b2.getClass();
                            uq4 = ag8.p(b2);
                        } else {
                            uq4 = null;
                        }
                        if (uq4 != null) {
                            sb2.append(G(uq4, false));
                            sb2.append(": ");
                        }
                        xp7.getClass();
                        StringBuilder sb3 = new StringBuilder();
                        dt0.D0(sg3.D(xp7), sb3, ", ", (String) null, (String) null, new ls1(this, 0), 60);
                        sb2.append(sb3.toString());
                        i = i2;
                    }
                } else {
                    sb2.append("???");
                }
                sb2.append(") ");
                int ordinal = ps1.B().ordinal();
                if (ordinal == 0) {
                    str = m("->");
                } else if (ordinal == 1) {
                    str = "&rarr;";
                } else {
                    h.c();
                    return;
                }
                sb2.append(str);
                sb2.append(" ");
                ag8.A(fu6);
                vw3 b3 = ((xp7) dt0.G0(fu6.G())).b();
                b3.getClass();
                I(sb2, b3);
                if (z2) {
                    sb2.append(")");
                }
                if (Q) {
                    sb2.append("?");
                }
            } else {
                v(sb2, fu6);
            }
        } else {
            h.c();
        }
    }

    public final void K(ri0 ri0, StringBuilder sb) {
        ps1 ps1 = this.a;
        if (ps1.u().contains(ns1.B) && !ri0.s().isEmpty() && ps1.v() != f95.x) {
            F(sb, true, "override");
            if (ps1.D()) {
                sb.append("/*");
                sb.append(ri0.s().size());
                sb.append("*/ ");
            }
        }
    }

    public final void L(StringBuilder sb, cf4 cf4) {
        cf4 cf42 = (cf4) cf4.z;
        wq0 wq0 = (wq0) cf4.x;
        if (cf42 != null) {
            L(sb, cf42);
            sb.append('.');
            uq4 name = wq0.getName();
            name.getClass();
            sb.append(G(name, false));
        } else {
            wo7 n = wq0.n();
            n.getClass();
            sb.append(R(n));
        }
        sb.append(Q((List) cf4.y));
    }

    public final void M(ri0 ri0, StringBuilder sb) {
        qz3 b0 = ri0.b0();
        if (b0 != null) {
            q(sb, b0, mm.RECEIVER);
            vw3 b2 = b0.b();
            b2.getClass();
            sb.append(y(b2, false));
            sb.append(".");
        }
    }

    public final void N(ri0 ri0, StringBuilder sb) {
        qz3 b0;
        jz0 jz0 = this.a.F;
        yr3 yr3 = ps1.Z[30];
        jz0.getClass();
        yr3.getClass();
        if (((Boolean) jz0.x).booleanValue() && (b0 = ri0.b0()) != null) {
            sb.append(" on ");
            vw3 b2 = b0.b();
            b2.getClass();
            sb.append(P(b2));
        }
    }

    public final String P(vw3 vw3) {
        vw3.getClass();
        StringBuilder sb = new StringBuilder();
        jz0 jz0 = this.a.y;
        yr3 yr3 = ps1.Z[23];
        jz0.getClass();
        yr3.getClass();
        I(sb, (vw3) ((vr2) jz0.x).y(vw3));
        return sb.toString();
    }

    public final String Q(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m("<"));
        dt0.D0(list, sb, ", ", (String) null, (String) null, new ls1(this, 0), 60);
        sb.append(m(">"));
        return sb.toString();
    }

    public final String R(wo7 wo7) {
        wo7.getClass();
        vq0 u = wo7.u();
        if ((u instanceof qp7) || (u instanceof ql4) || (u instanceof ut1)) {
            u.getClass();
            if (z62.f(u)) {
                return u.n().toString();
            }
            return this.a.o().b(u, this);
        } else if (u != null) {
            ku4.x("Unexpected classifier: ", u.getClass());
            return null;
        } else if (wo7 instanceof gg3) {
            return ((gg3) wo7).b(v61.L);
        } else {
            return wo7.toString();
        }
    }

    public final void S(qp7 qp7, StringBuilder sb, boolean z) {
        boolean z2;
        if (z) {
            sb.append(m("<"));
        }
        if (this.a.D()) {
            sb.append("/*");
            sb.append(qp7.getIndex());
            sb.append("*/ ");
        }
        F(sb, qp7.D(), "reified");
        String str = qp7.I().w;
        boolean z3 = true;
        if (str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        F(sb, z2, str);
        q(sb, qp7, (mm) null);
        H(qp7, sb, z);
        int size = qp7.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            vw3 vw3 = (vw3) qp7.getUpperBounds().iterator().next();
            if (vw3 == null) {
                fv3.a(141);
                throw null;
            } else if (!fv3.y(vw3) || !vw3.Q()) {
                sb.append(" : ");
                sb.append(P(vw3));
            }
        } else if (z) {
            for (vw3 vw32 : qp7.getUpperBounds()) {
                if (vw32 == null) {
                    fv3.a(141);
                    throw null;
                } else if (!fv3.y(vw32) || !vw32.Q()) {
                    if (z3) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(P(vw32));
                    z3 = false;
                }
            }
        }
        if (z) {
            sb.append(m(">"));
        }
    }

    public final void T(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S((qp7) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void U(StringBuilder sb, List list, boolean z) {
        if (!this.a.E() && !list.isEmpty()) {
            sb.append(m("<"));
            T(sb, list);
            sb.append(m(">"));
            if (z) {
                sb.append(" ");
            }
        }
    }

    public final void V(i28 i28, StringBuilder sb, boolean z) {
        String str;
        if (z || !(i28 instanceof h28)) {
            if (i28.a0()) {
                str = "var";
            } else {
                str = "val";
            }
            sb.append(A(str));
            sb.append(" ");
        }
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [pi0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void W(h28 h28, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        vw3 b2;
        vw3 vw3;
        vw3 vw32;
        boolean z4;
        if (z2) {
            sb.append(A("value-parameter"));
            sb.append(" ");
        }
        ps1 ps1 = this.a;
        if (ps1.D()) {
            sb.append("/*");
            sb.append(h28.B);
            sb.append("*/ ");
        }
        wp0 wp0 = null;
        q(sb, h28, (mm) null);
        F(sb, h28.D, "crossinline");
        F(sb, h28.E, "noinline");
        jz0 jz0 = ps1.r;
        yr3[] yr3Arr = ps1.Z;
        yr3 yr3 = yr3Arr[16];
        jz0.getClass();
        yr3.getClass();
        boolean z5 = false;
        if (((Boolean) jz0.x).booleanValue()) {
            ? h1 = h28.r();
            if (h1 instanceof wp0) {
                wp0 = h1;
            }
            if (wp0 != null && wp0.Z) {
                z3 = true;
                if (z3) {
                    jz0 jz02 = ps1.s;
                    yr3 yr32 = yr3Arr[17];
                    jz02.getClass();
                    yr32.getClass();
                    F(sb, ((Boolean) jz02.x).booleanValue(), "actual");
                }
                b2 = h28.b();
                b2.getClass();
                vw3 = h28.F;
                if (vw3 != null) {
                    vw32 = b2;
                } else {
                    vw32 = vw3;
                }
                if (vw3 != null) {
                    z5 = true;
                }
                F(sb, z5, "vararg");
                if (z3 || (z2 && !ps1.A())) {
                    V(h28, sb, z3);
                }
                if (z) {
                    H(h28, sb, z2);
                    sb.append(": ");
                }
                sb.append(P(vw32));
                z(h28, sb);
                if (ps1.D() && vw3 != null) {
                    sb.append(" /*");
                    sb.append(P(b2));
                    sb.append("*/");
                }
                if (ps1.q() == null) {
                    if (ps1.p()) {
                        z4 = h28.g1();
                    } else {
                        z4 = ts1.a(h28);
                    }
                    if (z4) {
                        StringBuilder sb2 = new StringBuilder(" = ");
                        vr2 q = ps1.q();
                        q.getClass();
                        sb2.append((String) q.y(h28));
                        sb.append(sb2.toString());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (z3) {
        }
        b2 = h28.b();
        b2.getClass();
        vw3 = h28.F;
        if (vw3 != null) {
        }
        if (vw3 != null) {
        }
        F(sb, z5, "vararg");
        V(h28, sb, z3);
        if (z) {
        }
        sb.append(P(vw32));
        z(h28, sb);
        sb.append(" /*");
        sb.append(P(b2));
        sb.append("*/");
        if (ps1.q() == null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r11 == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    public final void X(StringBuilder sb, List list, boolean z) {
        boolean z2;
        Iterator it;
        ps1 ps1 = this.a;
        jz0 jz0 = ps1.E;
        yr3 yr3 = ps1.Z[29];
        jz0.getClass();
        yr3.getClass();
        int ordinal = ((qc5) jz0.x).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    h.c();
                    return;
                }
            }
            z2 = false;
            int size = list.size();
            ps1.C().getClass();
            sb.getClass();
            sb.append("(");
            it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                h28 h28 = (h28) it.next();
                ps1.C().getClass();
                h28.getClass();
                W(h28, z2, sb, false);
                ps1.C().getClass();
                if (i != size - 1) {
                    sb.append(", ");
                }
                i = i2;
            }
            ps1.C().getClass();
            sb.append(")");
        }
        z2 = true;
        int size2 = list.size();
        ps1.C().getClass();
        sb.getClass();
        sb.append("(");
        it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
        }
        ps1.C().getClass();
        sb.append(")");
    }

    public final boolean Y(us1 us1, StringBuilder sb) {
        ps1 ps1 = this.a;
        if (!ps1.u().contains(ns1.z)) {
            return false;
        }
        jz0 jz0 = ps1.n;
        yr3 yr3 = ps1.Z[12];
        jz0.getClass();
        yr3.getClass();
        if (((Boolean) jz0.x).booleanValue()) {
            us1 = vs1.g(us1.a.l());
        }
        if (!ps1.x() && sg3.e(us1, vs1.j)) {
            return false;
        }
        sb.append(A(us1.a.d()));
        sb.append(" ");
        return true;
    }

    public final void Z(StringBuilder sb, List list) {
        if (!this.a.E()) {
            ArrayList arrayList = new ArrayList(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qp7 qp7 = (qp7) it.next();
                List upperBounds = qp7.getUpperBounds();
                upperBounds.getClass();
                for (vw3 vw3 : dt0.s0(1, upperBounds)) {
                    StringBuilder sb2 = new StringBuilder();
                    uq4 name = qp7.getName();
                    name.getClass();
                    sb2.append(G(name, false));
                    sb2.append(" : ");
                    vw3.getClass();
                    sb2.append(P(vw3));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(A("where"));
                sb.append(" ");
                dt0.D0(arrayList, sb, ", ", (String) null, (String) null, (vr2) null, 124);
            }
        }
    }

    public final void a(boolean z) {
        this.a.a(true);
    }

    public final void b(Set set) {
        set.getClass();
        this.a.b(set);
    }

    public final void c(boolean z) {
        this.a.c(false);
    }

    public final void d(n46 n46) {
        this.a.d(n46);
    }

    public final void e(boolean z) {
        this.a.e(true);
    }

    public final void f(boolean z) {
        this.a.f(true);
    }

    public final void g(boolean z) {
        this.a.g(true);
    }

    public final void h(boolean z) {
        this.a.h(true);
    }

    public final void i(qc5 qc5) {
        this.a.i(qc5);
    }

    public final void j(xq0 xq0) {
        this.a.j(xq0);
    }

    public final void k(boolean z) {
        this.a.k(true);
    }

    public final String m(String str) {
        return this.a.B().a(str);
    }

    public final String o(vj1 vj1) {
        vj1 r;
        String str;
        String str2;
        vj1.getClass();
        StringBuilder sb = new StringBuilder();
        vj1.P(new ns8(19, (Object) this), sb);
        ps1 ps1 = this.a;
        jz0 jz0 = ps1.c;
        yr3[] yr3Arr = ps1.Z;
        yr3Arr[1].getClass();
        if (((Boolean) jz0.x).booleanValue() && !(vj1 instanceof x95) && !(vj1 instanceof v34) && (r = vj1.r()) != null && !(r instanceof sl4)) {
            sb.append(" ");
            int ordinal = ps1.B().ordinal();
            if (ordinal == 0) {
                str = "defined in";
            } else if (ordinal == 1) {
                str = "<i>defined in</i>";
            } else {
                h.c();
                return null;
            }
            sb.append(str);
            sb.append(" ");
            vp2 f = rs1.f(r);
            f.getClass();
            if (f.c()) {
                str2 = "root package";
            } else {
                str2 = m(z65.N(vp2.f(f)));
            }
            sb.append(str2);
            jz0 jz02 = ps1.d;
            yr3Arr[2].getClass();
            if (((Boolean) jz02.x).booleanValue() && (r instanceof x95) && (vj1 instanceof xj1)) {
                ((xj1) vj1).e().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final String p(fm fmVar, mm mmVar) {
        ql4 ql4;
        String str;
        wp0 p0;
        List S;
        fmVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (mmVar != null) {
            sb.append(mmVar.w + ':');
        }
        vw3 b2 = fmVar.b();
        sb.append(P(b2));
        ps1 ps1 = this.a;
        if (ps1.m().w) {
            Map g = fmVar.g();
            jz0 jz0 = ps1.I;
            yr3 yr3 = ps1.Z[33];
            jz0.getClass();
            yr3.getClass();
            a42 a42 = null;
            if (((Boolean) jz0.x).booleanValue()) {
                ql4 = ts1.d(fmVar);
            } else {
                ql4 = null;
            }
            if (!(ql4 == null || (p0 = ql4.p0()) == null || (S = p0.S()) == null)) {
                ArrayList arrayList = new ArrayList();
                for (Object next : S) {
                    if (((h28) next).g1()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((h28) it.next()).getName());
                }
                a42 = arrayList2;
            }
            if (a42 == null) {
                a42 = a42.w;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : a42) {
                if (!g.containsKey((uq4) next2)) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(et0.e0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((uq4) it2.next()).b() + " = ...");
            }
            Iterable<Map.Entry> entrySet = g.entrySet();
            ArrayList arrayList5 = new ArrayList(et0.e0(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                uq4 uq4 = (uq4) entry.getKey();
                e21 e21 = (e21) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uq4.b());
                sb2.append(" = ");
                if (!a42.contains(uq4)) {
                    str = t(e21);
                } else {
                    str = "...";
                }
                sb2.append(str);
                arrayList5.add(sb2.toString());
            }
            List T0 = dt0.T0(dt0.M0(arrayList4, arrayList5));
            if (ps1.m().x || !T0.isEmpty()) {
                dt0.D0(T0, sb, ", ", "(", ")", (vr2) null, 112);
            }
        }
        if (ps1.D() && (gr8.N(b2) || (b2.L().u() instanceof r05))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void q(StringBuilder sb, ql qlVar, mm mmVar) {
        Set set;
        ps1 ps1 = this.a;
        if (ps1.u().contains(ns1.C)) {
            if (qlVar instanceof vw3) {
                set = ps1.s();
            } else {
                jz0 jz0 = ps1.K;
                yr3 yr3 = ps1.Z[35];
                jz0.getClass();
                yr3.getClass();
                set = (Set) jz0.x;
            }
            jz0 jz02 = ps1.M;
            yr3 yr32 = ps1.Z[37];
            jz02.getClass();
            yr32.getClass();
            vr2 vr2 = (vr2) jz02.x;
            for (fm fmVar : qlVar.getAnnotations()) {
                if (!dt0.q0(set, fmVar.f()) && !sg3.e(fmVar.f(), m27.r)) {
                    if (vr2 == null || ((Boolean) vr2.y(fmVar)).booleanValue()) {
                        sb.append(p(fmVar, mmVar));
                        jz0 jz03 = ps1.J;
                        yr3 yr33 = ps1.Z[34];
                        jz03.getClass();
                        yr33.getClass();
                        if (((Boolean) jz03.x).booleanValue()) {
                            sb.append(10);
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
        }
    }

    public final void s(wq0 wq0, StringBuilder sb) {
        List u0 = wq0.u0();
        u0.getClass();
        List parameters = wq0.n().getParameters();
        parameters.getClass();
        if (this.a.D() && wq0.p() && parameters.size() > u0.size()) {
            sb.append(" /*captured type parameters: ");
            T(sb, parameters.subList(u0.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String t(e21 e21) {
        jz0 jz0 = this.a.v;
        yr3 yr3 = ps1.Z[20];
        jz0.getClass();
        yr3.getClass();
        vr2 vr2 = (vr2) jz0.x;
        if (vr2 != null) {
            return (String) vr2.y(e21);
        }
        if (e21 instanceof ps) {
            ArrayList arrayList = new ArrayList();
            for (e21 t : (Iterable) ((ps) e21).a) {
                String t2 = t(t);
                if (t2 != null) {
                    arrayList.add(t2);
                }
            }
            return dt0.E0(arrayList, ", ", "{", "}", (vr2) null, 56);
        } else if (e21 instanceof pm) {
            return d57.R0(p((fm) ((pm) e21).a, (mm) null), "@");
        } else {
            if (!(e21 instanceof sq3)) {
                return e21.toString();
            }
            rq3 rq3 = (rq3) ((sq3) e21).a;
            if (rq3 instanceof pq3) {
                return ((pq3) rq3).a + "::class";
            } else if (rq3 instanceof qq3) {
                jq0 jq0 = ((qq3) rq3).a;
                String str = jq0.a.a().a.a;
                int i = jq0.b;
                for (int i2 = 0; i2 < i; i2++) {
                    str = pb4.h('>', "kotlin.Array<", str);
                }
                return b81.n(str, "::class");
            } else {
                h.c();
                return null;
            }
        }
    }

    public final void u(StringBuilder sb, List list) {
        if (!list.isEmpty()) {
            sb.append("context(");
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                vw3 b2 = ((qz3) it.next()).b();
                b2.getClass();
                sb.append(y(b2, true));
                if (i == list.size() - 1) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i = i2;
            }
        }
    }

    public final void v(StringBuilder sb, fu6 fu6) {
        wq0 wq0;
        q(sb, fu6, (mm) null);
        if (gr8.N(fu6)) {
            boolean z = fu6 instanceof v62;
            ps1 ps1 = this.a;
            if (z && ((v62) fu6).z.x) {
                jz0 jz0 = ps1.W;
                yr3 yr3 = ps1.Z[47];
                jz0.getClass();
                yr3.getClass();
                if (((Boolean) jz0.x).booleanValue()) {
                    z62 z62 = z62.a;
                    if (z) {
                        boolean z2 = ((v62) fu6).z.x;
                    }
                    wo7 L = fu6.L();
                    L.getClass();
                    sb.append(w(((w62) L).x[0]));
                }
            }
            if (z) {
                jz0 jz02 = ps1.Y;
                yr3 yr32 = ps1.Z[49];
                jz02.getClass();
                yr32.getClass();
                if (!((Boolean) jz02.x).booleanValue()) {
                    sb.append(((v62) fu6).D);
                    sb.append(Q(fu6.G()));
                }
            }
            sb.append(fu6.L().toString());
            sb.append(Q(fu6.G()));
        } else {
            wo7 L2 = fu6.L();
            vq0 u = fu6.L().u();
            if (u instanceof wq0) {
                wq0 = (wq0) u;
            } else {
                wq0 = null;
            }
            cf4 e2 = ya5.e(fu6, wq0, 0);
            if (e2 == null) {
                sb.append(R(L2));
                sb.append(Q(fu6.G()));
            } else {
                L(sb, e2);
            }
        }
        if (fu6.Q()) {
            sb.append("?");
        }
        if (fu6 instanceof qo1) {
            sb.append(" & Any");
        }
    }

    public final String w(String str) {
        int ordinal = this.a.B().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return f21.h("<font color=red><b>", str, "</b></font>");
        }
        h.c();
        return null;
    }

    public final String x(String str, String str2, fv3 fv3) {
        String str3 = str2;
        fv3 fv32 = fv3;
        str.getClass();
        str2.getClass();
        if (!z65.S(str, str2)) {
            String M = z65.M(str, str2, new ks1(this, fv32, 0), new ks1(this, fv32, 1), new o0(1, this, ms1.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 3));
            if (M != null) {
                return M;
            }
            return "(" + str + ".." + str2 + ')';
        } else if (k57.u0(str2, "(", false)) {
            return f21.h("(", str, ")!");
        } else {
            return str.concat("!");
        }
    }

    public final String y(vw3 vw3, boolean z) {
        String P = P(vw3);
        if ((!a0(vw3) || iq7.e(vw3)) && !(vw3 instanceof qo1) && (!z || vw3.getAnnotations().isEmpty())) {
            return P;
        }
        return pb4.h(')', "(", P);
    }

    public final void z(i28 i28, StringBuilder sb) {
        e21 O;
        String t;
        jz0 jz0 = this.a.u;
        yr3 yr3 = ps1.Z[19];
        jz0.getClass();
        yr3.getClass();
        if (((Boolean) jz0.x).booleanValue() && (O = i28.O()) != null && (t = t(O)) != null) {
            sb.append(" = ");
            sb.append(m(t));
        }
    }
}
