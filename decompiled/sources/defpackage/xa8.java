package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: xa8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class xa8 extends wa8 {
    public static final db8 w = db8.g((View) null, WindowInsets.CONSUMED);

    public xa8(db8 db8, WindowInsets windowInsets) {
        super(db8, windowInsets);
    }

    public ad3 h(int i) {
        return ad3.c(this.c.getInsets(cb8.a(i)));
    }

    public ad3 i(int i) {
        return ad3.c(this.c.getInsetsIgnoringVisibility(cb8.a(i)));
    }

    public boolean t(int i) {
        return this.c.isVisible(cb8.a(i));
    }

    public void o(View view) {
    }
}
