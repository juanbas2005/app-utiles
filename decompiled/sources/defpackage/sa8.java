package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: sa8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class sa8 extends ra8 {
    public ad3 r = null;

    public sa8(db8 db8, WindowInsets windowInsets) {
        super(db8, windowInsets);
    }

    public db8 b() {
        return db8.g((View) null, this.c.consumeStableInsets());
    }

    public db8 c() {
        return db8.g((View) null, this.c.consumeSystemWindowInsets());
    }

    public final ad3 k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = ad3.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    public boolean r() {
        return this.c.isConsumed();
    }

    public void x(ad3 ad3) {
        this.r = ad3;
    }
}
