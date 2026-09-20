package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: cj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cj4 extends f1 implements MenuItem {
    public final g87 c;
    public Method d;

    public cj4(Context context, g87 g87) {
        super(context);
        if (g87 != null) {
            this.c = g87;
        } else {
            h.q("Wrapped Object can not be null.");
            throw null;
        }
    }

    public final boolean collapseActionView() {
        return this.c.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.c.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        zi4 b = this.c.b();
        if (b != null) {
            return b.b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.c.getActionView();
        if (actionView instanceof aj4) {
            return (View) ((aj4) actionView).w;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.c.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.c.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.c.getContentDescription();
    }

    public final int getGroupId() {
        return this.c.getGroupId();
    }

    public final Drawable getIcon() {
        return this.c.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.c.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.c.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.c.getIntent();
    }

    public final int getItemId() {
        return this.c.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.c.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.c.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.c.getNumericShortcut();
    }

    public final int getOrder() {
        return this.c.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.c.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.c.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.c.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.c.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.c.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.c.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.c.isCheckable();
    }

    public final boolean isChecked() {
        return this.c.isChecked();
    }

    public final boolean isEnabled() {
        return this.c.isEnabled();
    }

    public final boolean isVisible() {
        return this.c.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        zi4 zi4 = new zi4(this, actionProvider);
        if (actionProvider == null) {
            zi4 = null;
        }
        this.c.a(zi4);
        return this;
    }

    public final MenuItem setActionView(int i) {
        g87 g87 = this.c;
        g87.setActionView(i);
        View actionView = g87.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            g87.setActionView(new aj4(actionView));
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.c.setAlphabeticShortcut(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.c.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.c.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.c.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.c.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.c.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.c.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.c.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.c.setNumericShortcut(c2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        bj4 bj4;
        if (onActionExpandListener != null) {
            bj4 = new bj4(this, onActionExpandListener);
        } else {
            bj4 = null;
        }
        this.c.setOnActionExpandListener(bj4);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        d87 d87;
        if (onMenuItemClickListener != null) {
            d87 = new d87(this, onMenuItemClickListener);
        } else {
            d87 = null;
        }
        this.c.setOnMenuItemClickListener(d87);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.c.setShortcut(c2, c3);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.c.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.c.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.c.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.c.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.c.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.c.setVisible(z);
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.c.setAlphabeticShortcut(c2, i);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.c.setIcon(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        this.c.setNumericShortcut(c2, i);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.c.setShortcut(c2, c3, i, i2);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.c.setTitle(i);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new aj4(view);
        }
        this.c.setActionView(view);
        return this;
    }
}
