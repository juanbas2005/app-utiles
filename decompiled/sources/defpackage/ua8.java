package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: ua8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ua8 extends ta8 {
    public ad3 s = null;
    public ad3 t = null;
    public ad3 u = null;

    public ua8(db8 db8, WindowInsets windowInsets) {
        super(db8, windowInsets);
    }

    public ad3 j() {
        if (this.t == null) {
            this.t = ad3.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.t;
    }

    public ad3 l() {
        if (this.s == null) {
            this.s = ad3.c(this.c.getSystemGestureInsets());
        }
        return this.s;
    }

    public ad3 n() {
        if (this.u == null) {
            this.u = ad3.c(this.c.getTappableElementInsets());
        }
        return this.u;
    }

    public db8 q(int i, int i2, int i3, int i4) {
        return db8.g((View) null, this.c.inset(i, i2, i3, i4));
    }

    public void x(ad3 ad3) {
    }
}
