package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: x7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x7 implements g87 {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;

    public final g87 a(zi4 zi4) {
        throw new UnsupportedOperationException();
    }

    public final zi4 b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        if (this.n || this.o) {
            this.h = drawable;
            Drawable mutate = drawable.mutate();
            this.h = mutate;
            if (this.n) {
                mutate.setTintList(this.l);
            }
            if (this.o) {
                this.h.setTintMode(this.m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.g;
    }

    public final char getAlphabeticShortcut() {
        return this.f;
    }

    public final CharSequence getContentDescription() {
        return this.j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.h;
    }

    public final ColorStateList getIconTintList() {
        return this.l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public final Intent getIntent() {
        return this.c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.e;
    }

    public final char getNumericShortcut() {
        return this.d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.a;
    }

    public final CharSequence getTooltipText() {
        return this.k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        if ((this.p & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.p & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.p & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.p & 8) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.p = z | (this.p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        int i2;
        int i3 = this.p & -3;
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.p = i2 | i3;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final g87 m82setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        int i2;
        int i3 = this.p & -17;
        if (z) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        this.p = i2 | i3;
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.h = this.i.getDrawable(i2);
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        this.f = Character.toLowerCase(c3);
        this.g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.a = this.i.getResources().getString(i2);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final g87 m83setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.p & 8;
        if (z) {
            i2 = 0;
        }
        this.p = i3 | i2;
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f = Character.toLowerCase(c3);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i2) {
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
