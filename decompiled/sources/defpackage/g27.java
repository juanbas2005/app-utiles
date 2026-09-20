package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: g27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g27 extends h8 implements ri4 {
    public ActionBarContextView A;
    public qc3 B;
    public WeakReference C;
    public boolean D;
    public ti4 E;
    public Context z;

    public final void b() {
        if (!this.D) {
            this.D = true;
            this.B.G(this);
        }
    }

    public final View c() {
        WeakReference weakReference = this.C;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final ti4 e() {
        return this.E;
    }

    public final MenuInflater f() {
        return new f87(this.A.getContext());
    }

    public final boolean g(ti4 ti4, MenuItem menuItem) {
        return ((am6) this.B.x).N(this, menuItem);
    }

    public final CharSequence h() {
        return this.A.getSubtitle();
    }

    public final CharSequence i() {
        return this.A.getTitle();
    }

    public final void j() {
        this.B.H(this, this.E);
    }

    public final boolean k() {
        return this.A.O;
    }

    public final void m(View view) {
        WeakReference weakReference;
        this.A.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.C = weakReference;
    }

    public final void n(int i) {
        o(this.z.getString(i));
    }

    public final void o(CharSequence charSequence) {
        this.A.setSubtitle(charSequence);
    }

    public final void p(int i) {
        q(this.z.getString(i));
    }

    public final void q(CharSequence charSequence) {
        this.A.setTitle(charSequence);
    }

    public final void r(boolean z2) {
        this.x = z2;
        this.A.setTitleOptional(z2);
    }

    public final void s(ti4 ti4) {
        j();
        d8 d8Var = this.A.z;
        if (d8Var != null) {
            d8Var.l();
        }
    }
}
