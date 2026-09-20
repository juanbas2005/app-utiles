package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: t98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t98 extends h8 implements ri4 {
    public final ti4 A;
    public qc3 B;
    public WeakReference C;
    public final /* synthetic */ u98 D;
    public final Context z;

    public t98(u98 u98, Context context, qc3 qc3) {
        this.D = u98;
        this.z = context;
        this.B = qc3;
        ti4 ti4 = new ti4(context);
        ti4.l = 1;
        this.A = ti4;
        ti4.e = this;
    }

    public final void b() {
        u98 u98 = this.D;
        if (u98.i == this) {
            boolean z2 = u98.p;
            boolean z3 = u98.q;
            if (z2 || z3) {
                u98.j = this;
                u98.k = this.B;
            } else {
                this.B.G(this);
            }
            this.B = null;
            u98.a(false);
            ActionBarContextView actionBarContextView = u98.f;
            if (actionBarContextView.G == null) {
                actionBarContextView.e();
            }
            u98.c.setHideOnContentScrollEnabled(u98.v);
            u98.i = null;
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
        return this.A;
    }

    public final MenuInflater f() {
        return new f87(this.z);
    }

    public final boolean g(ti4 ti4, MenuItem menuItem) {
        qc3 qc3 = this.B;
        if (qc3 != null) {
            return ((am6) qc3.x).N(this, menuItem);
        }
        return false;
    }

    public final CharSequence h() {
        return this.D.f.getSubtitle();
    }

    public final CharSequence i() {
        return this.D.f.getTitle();
    }

    public final void j() {
        if (this.D.i == this) {
            ti4 ti4 = this.A;
            ti4.w();
            try {
                this.B.H(this, ti4);
            } finally {
                ti4.v();
            }
        }
    }

    public final boolean k() {
        return this.D.f.O;
    }

    public final void m(View view) {
        this.D.f.setCustomView(view);
        this.C = new WeakReference(view);
    }

    public final void n(int i) {
        o(this.D.a.getResources().getString(i));
    }

    public final void o(CharSequence charSequence) {
        this.D.f.setSubtitle(charSequence);
    }

    public final void p(int i) {
        q(this.D.a.getResources().getString(i));
    }

    public final void q(CharSequence charSequence) {
        this.D.f.setTitle(charSequence);
    }

    public final void r(boolean z2) {
        this.x = z2;
        this.D.f.setTitleOptional(z2);
    }

    public final void s(ti4 ti4) {
        if (this.B != null) {
            j();
            d8 d8Var = this.D.f.z;
            if (d8Var != null) {
                d8Var.l();
            }
        }
    }
}
