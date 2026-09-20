package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* renamed from: lg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lg4 {
    public tj a;
    public final /* synthetic */ ng4 b;

    public lg4(ng4 ng4) {
        this.b = ng4;
    }

    public final void a(Drawable drawable) {
        ng4 ng4 = this.b;
        ColorStateList colorStateList = ng4.K;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(ng4.O, colorStateList.getDefaultColor()));
        }
    }
}
