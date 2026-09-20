package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: dd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dd1 extends ug4 {
    public static final /* synthetic */ int d0 = 0;
    public cd1 c0;

    public final void f(Canvas canvas) {
        if (this.c0.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        cd1 cd1 = this.c0;
        if (i >= 26) {
            canvas.clipOutRect(cd1.r);
        } else {
            canvas.clipRect(cd1.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    public final Drawable mutate() {
        this.c0 = new cd1(this.c0);
        return this;
    }

    public final void t(float f, float f2, float f3, float f4) {
        RectF rectF = this.c0.r;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
