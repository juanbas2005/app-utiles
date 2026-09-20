package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: yi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yi4 implements g87 {
    public zi4 A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i = 4096;
    public char j;
    public int k = 4096;
    public Drawable l;
    public int m = 0;
    public final ti4 n;
    public i67 o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public int y;
    public View z;

    public yi4(ti4 ti4, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.n = ti4;
        this.a = i3;
        this.b = i2;
        this.c = i4;
        this.d = i5;
        this.e = charSequence;
        this.y = i6;
    }

    public static void c(int i2, int i3, String str, StringBuilder sb) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final g87 a(zi4 zi4) {
        this.z = null;
        this.A = zi4;
        this.n.p(true);
        zi4 zi42 = this.A;
        if (zi42 != null) {
            zi42.a = new wv2(25, this);
            zi42.b.setVisibilityListener(zi42);
        }
        return this;
    }

    public final zi4 b() {
        return this.A;
    }

    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.v) {
                drawable.setTintMode(this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        zi4 zi4;
        if ((this.y & 8) != 0) {
            if (this.z == null && (zi4 = this.A) != null) {
                this.z = zi4.b.onCreateActionView(this);
            }
            if (this.z != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        int i2 = this.x;
        if (z2) {
            this.x = i2 | 32;
        } else {
            this.x = i2 & -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        zi4 zi4 = this.A;
        if (zi4 == null) {
            return null;
        }
        View onCreateActionView = zi4.b.onCreateActionView(this);
        this.z = onCreateActionView;
        return onCreateActionView;
    }

    public final int getAlphabeticModifiers() {
        return this.k;
    }

    public final char getAlphabeticShortcut() {
        return this.j;
    }

    public final CharSequence getContentDescription() {
        return this.q;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.m;
        if (i2 == 0) {
            return null;
        }
        Drawable N = rc9.N(this.n.a, i2);
        this.m = 0;
        this.l = N;
        return d(N);
    }

    public final ColorStateList getIconTintList() {
        return this.s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public final Intent getIntent() {
        return this.g;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.i;
    }

    public final char getNumericShortcut() {
        return this.h;
    }

    public final int getOrder() {
        return this.c;
    }

    public final SubMenu getSubMenu() {
        return this.o;
    }

    public final CharSequence getTitle() {
        return this.e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.e;
    }

    public final CharSequence getTooltipText() {
        return this.r;
    }

    public final boolean hasSubMenu() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        if ((this.x & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.x & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.x & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        zi4 zi4 = this.A;
        if (zi4 == null || !zi4.b.overridesItemVisibility()) {
            if ((this.x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.x & 8) != 0 || !this.A.b.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(int i2) {
        int i3;
        ti4 ti4 = this.n;
        Context context = ti4.a;
        View inflate = LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.a) > 0) {
            inflate.setId(i3);
        }
        ti4.k = true;
        ti4.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.j == c2 && this.k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        boolean z3 = z2 | (i2 & true);
        this.x = z3 ? 1 : 0;
        if (i2 != z3) {
            this.n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        boolean z3;
        int i2;
        int i3 = this.x;
        int i4 = i3 & 4;
        int i5 = 2;
        ti4 ti4 = this.n;
        if (i4 != 0) {
            ArrayList arrayList = ti4.f;
            int size = arrayList.size();
            ti4.w();
            for (int i6 = 0; i6 < size; i6++) {
                yi4 yi4 = (yi4) arrayList.get(i6);
                if (yi4.b == this.b && (yi4.x & 4) != 0 && yi4.isCheckable()) {
                    if (yi4 == this) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i7 = yi4.x;
                    int i8 = i7 & -3;
                    if (z3) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    int i9 = i2 | i8;
                    yi4.x = i9;
                    if (i7 != i9) {
                        yi4.n.p(false);
                    }
                }
            }
            ti4.v();
            return this;
        }
        int i10 = i3 & -3;
        if (!z2) {
            i5 = 0;
        }
        int i11 = i10 | i5;
        this.x = i11;
        if (i3 != i11) {
            ti4.p(false);
        }
        return this;
    }

    public final g87 setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        int i2 = this.x;
        if (z2) {
            this.x = i2 | 16;
        } else {
            this.x = i2 & -17;
        }
        this.n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.l = null;
        this.m = i2;
        this.w = true;
        this.n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.h == c2 && this.i == i2) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.n.p(false);
        return this;
    }

    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.y = i2;
            ti4 ti4 = this.n;
            ti4.k = true;
            ti4.p(true);
            return;
        }
        h.q("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        i67 i67 = this.o;
        if (i67 != null) {
            i67.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    public final g87 setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        int i2;
        int i3 = this.x;
        int i4 = i3 & -9;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int i5 = i2 | i4;
        this.x = i5;
        if (i3 != i5) {
            ti4 ti4 = this.n;
            ti4.h = true;
            ti4.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.p(false);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.n.a.getString(i2));
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    public final MenuItem setActionView(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        ti4 ti4 = this.n;
        ti4.k = true;
        ti4.p(true);
        return this;
    }
}
