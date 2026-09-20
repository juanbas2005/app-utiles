package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: ht7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ht7 extends RippleDrawable {
    public final boolean w;
    public jt0 x;
    public boolean y;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ht7(boolean z) {
        super(r0, (Drawable) null, r2);
        ColorDrawable colorDrawable;
        ColorStateList valueOf = ColorStateList.valueOf(-16777216);
        if (z) {
            colorDrawable = new ColorDrawable(-1);
        } else {
            colorDrawable = null;
        }
        this.w = z;
    }

    public final Rect getDirtyBounds() {
        if (!this.w) {
            this.y = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.y = false;
        return dirtyBounds;
    }

    public final boolean isProjected() {
        return this.y;
    }
}
