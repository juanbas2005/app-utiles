package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: tj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tj extends Animatable2.AnimationCallback {
    public final /* synthetic */ lg4 a;

    public tj(lg4 lg4) {
        this.a = lg4;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.K;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public final void onAnimationStart(Drawable drawable) {
        this.a.a(drawable);
    }
}
