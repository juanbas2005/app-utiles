package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: uf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uf7 implements ck5 {
    public final View a;
    public final wr0 b;
    public final sf7 c;
    public boolean d;
    public vr2 e = xc4.P;
    public vr2 f = xc4.Q;
    public hf7 g = new hf7(4, lg7.b, "");
    public c93 h = c93.g;
    public final ArrayList i = new ArrayList();
    public final nz3 j = rg3.y(i44.x, new kh(16, this));
    public Rect k;
    public final sc1 l;
    public final eq4 m;
    public y0 n;

    public uf7(View view, je jeVar) {
        wr0 wr0 = new wr0(view);
        sf7 sf7 = new sf7(view);
        this.a = view;
        this.b = wr0;
        this.c = sf7;
        this.l = new sc1(jeVar, wr0);
        this.m = new eq4(new tf7[16]);
    }

    public final void a() {
        i(tf7.w);
    }

    public final void b() {
        i(tf7.y);
    }

    public final void c() {
        this.d = false;
        this.e = xc4.R;
        this.f = xc4.S;
        this.k = null;
        i(tf7.x);
    }

    public final void d(hf7 hf7, v35 v35, bg7 bg7, st6 st6, ly5 ly5, ly5 ly52) {
        sc1 sc1 = this.l;
        synchronized (sc1.c) {
            try {
                sc1.j = hf7;
                sc1.l = v35;
                sc1.k = bg7;
                sc1.m = st6;
                sc1.n = ly5;
                sc1.o = ly52;
                if (!sc1.e) {
                    if (sc1.d) {
                    }
                }
                sc1.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(hf7 hf7, hf7 hf72) {
        boolean z;
        int i2;
        int i3;
        int i4;
        if (!lg7.b(this.g.b, hf72.b) || !sg3.e(this.g.c, hf72.c)) {
            z = true;
        } else {
            z = false;
        }
        this.g = hf72;
        int size = this.i.size();
        for (int i5 = 0; i5 < size; i5++) {
            iy5 iy5 = (iy5) ((WeakReference) this.i.get(i5)).get();
            if (iy5 != null) {
                iy5.d = hf72;
            }
        }
        sc1 sc1 = this.l;
        synchronized (sc1.c) {
            try {
                sc1.j = null;
                sc1.l = null;
                sc1.k = null;
                sc1.m = ce.R;
                sc1.n = null;
                sc1.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i6 = -1;
        if (sg3.e(hf7, hf72)) {
            if (z) {
                wr0 wr0 = this.b;
                int f2 = lg7.f(hf72.b);
                int e2 = lg7.e(hf72.b);
                lg7 lg7 = this.g.c;
                if (lg7 != null) {
                    i4 = lg7.f(lg7.a);
                } else {
                    i4 = -1;
                }
                lg7 lg72 = this.g.c;
                if (lg72 != null) {
                    i6 = lg7.e(lg72.a);
                }
                ((InputMethodManager) ((nz3) wr0.y).getValue()).updateSelection((View) wr0.x, f2, e2, i4, i6);
            }
        } else if (hf7 == null || (sg3.e(hf7.a.x, hf72.a.x) && (!lg7.b(hf7.b, hf72.b) || sg3.e(hf7.c, hf72.c)))) {
            int size2 = this.i.size();
            for (int i7 = 0; i7 < size2; i7++) {
                iy5 iy52 = (iy5) ((WeakReference) this.i.get(i7)).get();
                if (iy52 != null) {
                    hf7 hf73 = this.g;
                    wr0 wr02 = this.b;
                    if (iy52.h) {
                        iy52.d = hf73;
                        if (iy52.f) {
                            ((InputMethodManager) ((nz3) wr02.y).getValue()).updateExtractedText((View) wr02.x, iy52.e, pd8.K(hf73));
                        }
                        lg7 lg73 = hf73.c;
                        long j2 = hf73.b;
                        if (lg73 != null) {
                            i2 = lg7.f(lg73.a);
                        } else {
                            i2 = -1;
                        }
                        lg7 lg74 = hf73.c;
                        if (lg74 != null) {
                            i3 = lg7.e(lg74.a);
                        } else {
                            i3 = -1;
                        }
                        ((InputMethodManager) ((nz3) wr02.y).getValue()).updateSelection((View) wr02.x, lg7.f(j2), lg7.e(j2), i2, i3);
                    }
                }
            }
        } else {
            wr0 wr03 = this.b;
            ((InputMethodManager) ((nz3) wr03.y).getValue()).restartInput((View) wr03.x);
        }
    }

    public final void f() {
        i(tf7.z);
    }

    public final void g(hf7 hf7, c93 c93, h17 h17, j71 j71) {
        this.d = true;
        this.g = hf7;
        this.h = c93;
        this.e = h17;
        this.f = j71;
        i(tf7.w);
    }

    public final void h(ly5 ly5) {
        Rect rect;
        this.k = new Rect(dh4.C(ly5.a), dh4.C(ly5.b), dh4.C(ly5.c), dh4.C(ly5.d));
        if (this.i.isEmpty() && (rect = this.k) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void i(tf7 tf7) {
        this.m.b(tf7);
        if (this.n == null) {
            y0 y0Var = new y0(25, this);
            this.c.execute(y0Var);
            this.n = y0Var;
        }
    }
}
