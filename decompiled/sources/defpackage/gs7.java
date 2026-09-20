package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: gs7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gs7 implements kr {
    public final Object w;
    public final ArrayList x = new ArrayList();
    public Object y;

    public gs7(uy3 uy3) {
        this.w = uy3;
        this.y = uy3;
    }

    public final void a() {
        this.x.clear();
        this.y = this.w;
        ((uy3) this.w).T();
    }

    public final void b(int i, Object obj) {
        ((uy3) this.y).B(i, (uy3) obj);
    }

    public final void c(Object obj) {
        this.x.add(this.y);
        this.y = obj;
    }

    public final void e() {
        ny5 rectManager;
        md autofillManager;
        ny5 rectManager2;
        uy3 uy3 = (uy3) this.y;
        o00 o00 = uy3.a0;
        if (!uy3.J()) {
            yb3.a("onReuse is only expected on attached node");
        }
        iz3 iz3 = uy3.c0;
        if (iz3 != null) {
            iz3.i(false);
        }
        uy3.O = false;
        if (uy3.j0) {
            uy3.j0 = false;
        } else {
            ll4 ll4 = (ib7) uy3.a0.f;
            for (ll4 ll42 = ll4; ll42 != null; ll42 = ll42.A) {
                if (ll42.J) {
                    ll42.Q0();
                }
            }
            for (ll4 ll43 = ll4; ll43 != null; ll43 = ll43.A) {
                if (ll43.J) {
                    ll43.S0();
                }
            }
            while (ll4 != null) {
                if (ll4.J) {
                    ll4.M0();
                }
                ll4 = ll4.A;
            }
        }
        int i = uy3.x;
        p95 p95 = uy3.J;
        if (!(p95 == null || (rectManager2 = ((je) p95).getRectManager()) == null)) {
            rectManager2.i(uy3);
        }
        uy3.x = ck6.a.addAndGet(1);
        p95 p952 = uy3.J;
        if (p952 != null) {
            je jeVar = (je) p952;
            jeVar.getLayoutNodes().g(i);
            jeVar.getLayoutNodes().i(uy3.x, uy3);
        }
        for (ll4 ll44 = (ll4) o00.g; ll44 != null; ll44 = ll44.B) {
            ll44.L0();
        }
        o00.g();
        if (o00.f(8)) {
            uy3.H();
        }
        uy3.a0(uy3);
        p95 p953 = uy3.J;
        if (p953 != null) {
            je jeVar2 = (je) p953;
            if (je.d() && (autofillManager = jeVar2.getAutofillManager()) != null) {
                je jeVar3 = autofillManager.y;
                kg5 kg5 = autofillManager.w;
                zo4 zo4 = autofillManager.D;
                if (zo4.f(i)) {
                    kg5.B(jeVar3, i, false);
                }
                ak6 x2 = uy3.x();
                if (x2 != null && x2.w.b(jk6.r)) {
                    zo4.a(uy3.x);
                    kg5.B(jeVar3, uy3.x, true);
                }
            }
        }
        p95 p954 = uy3.J;
        if (p954 != null && (rectManager = ((je) p954).getRectManager()) != null) {
            rectManager.h(uy3);
        }
    }

    public final void f(int i, int i2, int i3) {
        ((uy3) this.y).N(i, i2, i3);
    }

    public final void g(int i, int i2) {
        ((uy3) this.y).U(i, i2);
    }

    public final void i() {
        ArrayList arrayList = this.x;
        this.y = arrayList.remove(arrayList.size() - 1);
    }

    public final /* bridge */ /* synthetic */ void k(int i, Object obj) {
        uy3 uy3 = (uy3) obj;
    }

    public final void l() {
        lp4 lp4;
        md autofillManager;
        Object[] objArr;
        p95 p95 = ((uy3) this.w).J;
        if (p95 != null) {
            je jeVar = (je) p95;
            if (jeVar.h0) {
                cy6 cy6 = jeVar.getSnapshotObserver().a;
                synchronized (cy6.h) {
                    try {
                        eq4 eq4 = (eq4) cy6.g;
                        int i = eq4.y;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            objArr = eq4.w;
                            if (i2 >= i) {
                                break;
                            }
                            by6 by6 = (by6) objArr[i2];
                            by6.d();
                            if (!by6.f.j()) {
                                i3++;
                            } else if (i3 > 0) {
                                Object[] objArr2 = eq4.w;
                                objArr2[i2 - i3] = objArr2[i2];
                            }
                            i2++;
                        }
                        int i4 = i - i3;
                        Arrays.fill(objArr, i4, i, (Object) null);
                        eq4.y = i4;
                    } finally {
                    }
                }
                jeVar.h0 = false;
            }
            if (je.d() && (autofillManager = jeVar.getAutofillManager()) != null) {
                zo4 zo4 = autofillManager.D;
                if (zo4.d == 0 && autofillManager.E) {
                    autofillManager.w.w().commit();
                    autofillManager.E = false;
                }
                if (zo4.d != 0) {
                    autofillManager.E = true;
                }
            }
            while (jeVar.J0.i() && jeVar.J0.f(0) != null) {
                int i5 = jeVar.J0.b;
                int i6 = 0;
                while (true) {
                    lp4 = jeVar.J0;
                    if (i6 >= i5) {
                        break;
                    }
                    sr2 sr2 = (sr2) lp4.f(i6);
                    jeVar.J0.n(i6, (Object) null);
                    if (sr2 != null) {
                        sr2.b();
                    }
                    i6++;
                }
                lp4.l(0, i5);
            }
        }
    }

    public final Object m() {
        return this.y;
    }
}
