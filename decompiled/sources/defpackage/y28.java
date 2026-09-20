package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: y28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y28 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public y28(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        z28 z28 = new z28();
        z28.w = (VectorDrawable) this.a.newDrawable();
        return z28;
    }

    public final Drawable newDrawable(Resources resources) {
        z28 z28 = new z28();
        z28.w = (VectorDrawable) this.a.newDrawable(resources);
        return z28;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        z28 z28 = new z28();
        z28.w = (VectorDrawable) this.a.newDrawable(resources, theme);
        return z28;
    }
}
