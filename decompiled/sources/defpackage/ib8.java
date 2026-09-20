package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;

/* renamed from: ib8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ib8 {
    public static final WeakHashMap w = new WeakHashMap();
    public final nj a;
    public final nj b;
    public final nj c;
    public final nj d;
    public final nj e;
    public final nj f;
    public final nj g;
    public final nj h;
    public final nj i;
    public final d28 j;
    public final ed5 k = u55.p((Object) null);
    public final ss7 l;
    public final d28 m;
    public final d28 n;
    public final d28 o;
    public final d28 p;
    public final d28 q;
    public final d28 r;
    public final d28 s;
    public final boolean t;
    public int u;
    public final ed3 v;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public ib8(View view) {
        View view2;
        Boolean bool;
        Boolean bool2;
        boolean z;
        nj d2 = n63.d(4, "captionBar");
        this.a = d2;
        nj d3 = n63.d(128, "displayCutout");
        this.b = d3;
        nj d4 = n63.d(8, "ime");
        this.c = d4;
        nj d5 = n63.d(32, "mandatorySystemGestures");
        this.d = d5;
        nj d6 = n63.d(2, "navigationBars");
        this.e = d6;
        nj d7 = n63.d(1, "statusBars");
        this.f = d7;
        nj d8 = n63.d(519, "systemBars");
        this.g = d8;
        nj d9 = n63.d(16, "systemGestures");
        this.h = d9;
        nj d10 = n63.d(64, "tappableElement");
        this.i = d10;
        d28 d28 = new d28(new jd3(0, 0, 0, 0), "waterfall");
        this.j = d28;
        ss7 ss7 = new ss7(new ss7(d8, d4), d3);
        this.l = ss7;
        new ss7(ss7, new ss7(new ss7(new ss7(d10, d5), d9), d28));
        this.m = n63.f(4, "captionBarIgnoringVisibility");
        this.n = n63.f(2, "navigationBarsIgnoringVisibility");
        this.o = n63.f(1, "statusBarsIgnoringVisibility");
        this.p = n63.f(519, "systemBarsIgnoringVisibility");
        this.q = n63.f(64, "tappableElementIgnoringVisibility");
        this.r = new d28(new jd3(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new d28(new jd3(0, 0, 0, 0), "imeAnimationSource");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            bool = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            bool = null;
        }
        if (bool instanceof Boolean) {
            bool2 = bool;
        } else {
            bool2 = null;
        }
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.t = z;
        this.v = new ed3(this);
        WeakHashMap weakHashMap = e58.a;
        db8 a2 = x48.a(view);
        if (a2 != null) {
            za8 za8 = a2.a;
            d2.f(za8.t(4));
            d3.f(za8.t(128));
            d4.f(za8.t(8));
            d5.f(za8.t(32));
            d6.f(za8.t(2));
            d7.f(za8.t(1));
            d8.f(za8.t(519));
            d9.f(za8.t(16));
            d10.f(za8.t(64));
        }
    }

    public static void b(ib8 ib8, db8 db8) {
        ad3 ad3;
        Path path;
        boolean z = false;
        ib8.a.g(db8, 0);
        ib8.c.g(db8, 0);
        ib8.b.g(db8, 0);
        ib8.e.g(db8, 0);
        ib8.f.g(db8, 0);
        ib8.g.g(db8, 0);
        ib8.h.g(db8, 0);
        ib8.i.g(db8, 0);
        ib8.d.g(db8, 0);
        ib8.m.f(i75.o(db8.a.i(4)));
        ib8.n.f(i75.o(db8.a.i(2)));
        ib8.o.f(i75.o(db8.a.i(1)));
        ib8.p.f(i75.o(db8.a.i(519)));
        ib8.q.f(i75.o(db8.a.i(64)));
        bw1 g2 = db8.a.g();
        d28 d28 = ib8.j;
        if (g2 != null) {
            ad3 = g2.a();
        } else {
            ad3 = ad3.e;
        }
        d28.f(i75.o(ad3));
        eh ehVar = null;
        if (g2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                path = hn.b(g2.a);
            } else {
                path = null;
            }
            if (path != null) {
                ehVar = new eh(path);
            }
        }
        ib8.k.setValue(ehVar);
        synchronized (nx6.c) {
            up4 up4 = nx6.j.h;
            if (up4 != null && up4.h()) {
                z = true;
            }
        }
        if (z) {
            nx6.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            ed3 ed3 = this.v;
            ed3.z = false;
            ed3.A = false;
            ed3.B = null;
            WeakHashMap weakHashMap = e58.a;
            w48.c(view, ed3);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(ed3);
            e58.o(view, ed3);
        }
        this.u++;
    }
}
