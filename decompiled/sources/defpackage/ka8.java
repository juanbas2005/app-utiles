package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: ka8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ka8 extends qa8 {
    public final WindowInsets.Builder e;

    public ka8(db8 db8) {
        super(db8);
        WindowInsets.Builder builder;
        WindowInsets f = db8.f();
        if (f != null) {
            builder = ja8.c(f);
        } else {
            builder = g07.k();
        }
        this.e = builder;
    }

    public db8 b() {
        a();
        db8 g = db8.g((View) null, this.e.build());
        ad3[] ad3Arr = this.b;
        za8 za8 = g.a;
        za8.v(ad3Arr);
        za8.u((ew1) null);
        za8.z(this.c);
        za8.A(this.d);
        return g;
    }

    public void e(ad3 ad3) {
        this.e.setMandatorySystemGestureInsets(ad3.d());
    }

    public void f(ad3 ad3) {
        this.e.setStableInsets(ad3.d());
    }

    public void g(ad3 ad3) {
        this.e.setSystemGestureInsets(ad3.d());
    }

    public void h(ad3 ad3) {
        this.e.setSystemWindowInsets(ad3.d());
    }

    public void i(ad3 ad3) {
        this.e.setTappableElementInsets(ad3.d());
    }

    public ka8() {
        this.e = g07.k();
    }
}
