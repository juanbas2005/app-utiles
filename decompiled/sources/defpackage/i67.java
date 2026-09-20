package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: i67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i67 extends ti4 implements SubMenu {
    public final yi4 A;
    public final ti4 z;

    public i67(Context context, ti4 ti4, yi4 yi4) {
        super(context);
        this.z = ti4;
        this.A = yi4;
    }

    public final boolean d(yi4 yi4) {
        return this.z.d(yi4);
    }

    public final boolean e(ti4 ti4, MenuItem menuItem) {
        if (super.e(ti4, menuItem) || this.z.e(ti4, menuItem)) {
            return true;
        }
        return false;
    }

    public final boolean f(yi4 yi4) {
        return this.z.f(yi4);
    }

    public final MenuItem getItem() {
        return this.A;
    }

    public final String j() {
        int i;
        yi4 yi4 = this.A;
        if (yi4 != null) {
            i = yi4.a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return hl6.k(i, "android:menu:actionviewstates:");
    }

    public final ti4 k() {
        return this.z.k();
    }

    public final boolean m() {
        return this.z.m();
    }

    public final boolean n() {
        return this.z.n();
    }

    public final boolean o() {
        return this.z.o();
    }

    public final void setGroupDividerEnabled(boolean z2) {
        this.z.setGroupDividerEnabled(z2);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z2) {
        this.z.setQwertyMode(z2);
    }

    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        u(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        u(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }
}
