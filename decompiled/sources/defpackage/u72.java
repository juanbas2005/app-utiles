package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: u72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u72 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public u72(Context context, String str, qa qaVar, boolean z, boolean z2) {
        context.getClass();
        qaVar.getClass();
        this.c = context;
        this.d = str;
        this.e = qaVar;
        this.a = z;
        this.b = z2;
    }

    public static IOException a(u72 u72, boolean z, IOException iOException, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iOException != null) {
            u72.k(iOException);
        }
        if (z3) {
            h72 h72 = ((dx5) u72.c).A;
            if (iOException != null) {
                h72.getClass();
            } else {
                h72.getClass();
            }
        }
        if (z2) {
            h72 h722 = ((dx5) u72.c).A;
            if (iOException != null) {
                h722.getClass();
            } else {
                h722.getClass();
            }
        }
        dx5 dx5 = (dx5) u72.c;
        if (!z3 || z) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 || z) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z3 || !z) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z2 || !z) {
            z7 = false;
        } else {
            z7 = true;
        }
        return dx5.i(u72, z4, z5, z7, z6, iOException);
    }

    public static void c(Object obj, ArrayList arrayList, b0 b0Var) {
        arrayList.add(obj);
        Iterable<Object> iterable = (Iterable) b0Var.y(obj);
        if (iterable != null) {
            for (Object c2 : iterable) {
                c(c2, arrayList, b0Var);
            }
        }
    }

    public static po4 f(zw3 zw3) {
        fu6 fu6;
        ql4 ql4;
        vp2 vp2;
        fu6 fu62;
        ql4 ql42;
        vp2 vp22;
        String str = tj3.a;
        zw3.getClass();
        zg2 p = rc9.p(zw3);
        if (p == null || (fu6 = rc9.x0(p)) == null) {
            fu6 = rc9.s(zw3);
            fu6.getClass();
        }
        v62 v62 = iq7.a;
        vq0 u = fu6.L().u();
        if (u instanceof ql4) {
            ql4 = (ql4) u;
        } else {
            ql4 = null;
        }
        if (ql4 != null) {
            vp2 = rs1.f(ql4);
        } else {
            vp2 = null;
        }
        if (tj3.k.containsKey(vp2)) {
            return po4.w;
        }
        zg2 p2 = rc9.p(zw3);
        if (p2 == null || (fu62 = rc9.e1(p2)) == null) {
            fu62 = rc9.s(zw3);
            fu62.getClass();
        }
        vq0 u2 = fu62.L().u();
        if (u2 instanceof ql4) {
            ql42 = (ql4) u2;
        } else {
            ql42 = null;
        }
        if (ql42 != null) {
            vp22 = rs1.f(ql42);
        } else {
            vp22 = null;
        }
        if (tj3.j.containsKey(vp22)) {
            return po4.x;
        }
        return null;
    }

    public static s15 g(zw3 zw3) {
        fu6 fu6;
        fu6 fu62;
        zw3.getClass();
        zg2 p = rc9.p(zw3);
        if (p == null || (fu6 = rc9.x0(p)) == null) {
            fu6 = rc9.s(zw3);
            fu6.getClass();
        }
        if (rc9.n0(fu6)) {
            return s15.x;
        }
        zg2 p2 = rc9.p(zw3);
        if (p2 == null || (fu62 = rc9.e1(p2)) == null) {
            fu62 = rc9.s(zw3);
            fu62.getClass();
        }
        if (!rc9.n0(fu62)) {
            return s15.y;
        }
        return null;
    }

    public s72 b(kd6 kd6, boolean z) {
        kd6.getClass();
        this.a = z;
        f56 f56 = (f56) kd6.A;
        f56.getClass();
        long a2 = f56.a();
        ((dx5) this.c).A.getClass();
        return new s72(this, ((w72) this.e).j(kd6, a2), a2, false);
    }

    public xc8 d(sp7 sp7) {
        List list;
        s15 s15;
        sp7.getClass();
        if (!(sp7 instanceof q14)) {
            return null;
        }
        List<zw3> upperBounds = ((qp7) sp7).getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return null;
        }
        for (zw3 j0 : upperBounds) {
            if (!rc9.j0(j0)) {
                ArrayList arrayList = new ArrayList();
                for (Object next : upperBounds) {
                    if (g((zw3) next) != null) {
                        arrayList.add(next);
                    }
                }
                nz3 y = rg3.y(i44.x, new f3(upperBounds, this));
                boolean isEmpty = arrayList.isEmpty();
                s15 s152 = s15.w;
                boolean z = true;
                if (!isEmpty) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            ((zw3) it.next()).getClass();
                            list = upperBounds;
                        }
                    }
                    return new xc8(s152, false);
                } else if (((List) y.getValue()).isEmpty()) {
                    return null;
                } else {
                    List list2 = (List) y.getValue();
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        if (it2.hasNext()) {
                            ((zw3) it2.next()).getClass();
                            list = (List) y.getValue();
                        }
                    }
                    return new xc8(s152, true);
                }
                if (list == null || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!rc9.p0((zw3) it3.next())) {
                                s15 = s15.y;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                s15 = s15.x;
                if (list == upperBounds) {
                    z = false;
                }
                return new xc8(s15, z);
            }
        }
        return null;
    }

    public ex5 e() {
        ex5 ex5;
        v72 i = ((w72) this.e).i();
        if (i instanceof ex5) {
            ex5 = (ex5) i;
        } else {
            ex5 = null;
        }
        if (ex5 != null) {
            return ex5;
        }
        h.s("no connection for CONNECT tunnels");
        return null;
    }

    public ox5 h(a66 a66) {
        u72 u72;
        try {
            String f = a66.B.f("Content-Type");
            if (f == null) {
                f = null;
            }
            long d2 = ((w72) this.e).d(a66);
            u72 = this;
            try {
                return new ox5(f, d2, new zw5(new t72(u72, ((w72) this.e).a(a66), d2, false)));
            } catch (IOException e2) {
                e = e2;
                IOException iOException = e;
                ((dx5) u72.c).A.getClass();
                u72.k(iOException);
                throw iOException;
            }
        } catch (IOException e3) {
            e = e3;
            u72 = this;
            IOException iOException2 = e;
            ((dx5) u72.c).A.getClass();
            u72.k(iOException2);
            throw iOException2;
        }
    }

    public z56 i(boolean z) {
        try {
            z56 f = ((w72) this.e).f(z);
            if (f == null) {
                return f;
            }
            f.n = this;
            return f;
        } catch (IOException e2) {
            ((dx5) this.c).A.getClass();
            k(e2);
            throw e2;
        }
    }

    public ArrayList j(zw3 zw3) {
        am6 am6 = (am6) this.d;
        lm lmVar = ((pj3) am6.x).q;
        zw3.getClass();
        g3 g3Var = new g3(zw3, lm.b(lmVar, (ak3) ((nz3) am6.z).getValue(), ((vw3) zw3).getAnnotations()), (sp7) null);
        b0 b0Var = new b0(3, this);
        ArrayList arrayList = new ArrayList(1);
        c(g3Var, arrayList, b0Var);
        return arrayList;
    }

    public void k(IOException iOException) {
        this.b = true;
        ((w72) this.e).i().f((dx5) this.c, iOException);
    }

    public wr0 l() {
        dx5 dx5 = (dx5) this.c;
        if (!dx5.G) {
            dx5.G = true;
            dx5.B.i();
            synchronized (dx5) {
                if (dx5.O == null) {
                    throw new IllegalStateException("Check failed.");
                } else if (dx5.K || dx5.L) {
                    throw new IllegalStateException("Check failed.");
                } else if (dx5.I) {
                    throw new IllegalStateException("Check failed.");
                } else if (dx5.J) {
                    dx5.J = false;
                    dx5.K = true;
                    dx5.L = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            v72 i = ((w72) this.e).i();
            i.getClass();
            ex5 ex5 = (ex5) i;
            ex5.e.setSoTimeout(0);
            ex5.e();
            return new wr0(this);
        }
        h.s("Check failed.");
        return null;
    }

    public u72(dx5 dx5, x72 x72, w72 w72) {
        x72.getClass();
        this.c = dx5;
        this.d = x72;
        this.e = w72;
    }

    public u72(ql qlVar, boolean z, am6 am6, jm jmVar, boolean z2) {
        am6.getClass();
        this.c = qlVar;
        this.a = z;
        this.d = am6;
        this.e = jmVar;
        this.b = z2;
    }
}
