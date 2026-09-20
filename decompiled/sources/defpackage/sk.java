package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: sk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sk extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public sk(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        tk tkVar = new tk((Context) null);
        Drawable newDrawable = this.a.newDrawable();
        tkVar.w = newDrawable;
        newDrawable.setCallback(tkVar.B);
        return tkVar;
    }

    public final Drawable newDrawable(Resources resources) {
        tk tkVar = new tk((Context) null);
        Drawable newDrawable = this.a.newDrawable(resources);
        tkVar.w = newDrawable;
        newDrawable.setCallback(tkVar.B);
        return tkVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        tk tkVar = new tk((Context) null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        tkVar.w = newDrawable;
        newDrawable.setCallback(tkVar.B);
        return tkVar;
    }
}
