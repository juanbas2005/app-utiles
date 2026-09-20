package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: cd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cd1 extends sg4 {
    public final RectF r;

    public cd1(cd1 cd1) {
        super((sg4) cd1);
        this.r = cd1.r;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dd1, ug4, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable() {
        ? ug4 = new ug4((sg4) this);
        ug4.c0 = this;
        ug4.invalidateSelf();
        return ug4;
    }

    public cd1(rq6 rq6, RectF rectF) {
        super(rq6);
        this.r = rectF;
    }
}
