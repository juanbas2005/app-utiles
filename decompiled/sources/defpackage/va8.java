package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: va8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class va8 extends ua8 {
    public static final db8 v = db8.g((View) null, WindowInsets.CONSUMED);

    public va8(db8 db8, WindowInsets windowInsets) {
        super(db8, windowInsets);
    }

    public ad3 h(int i) {
        return ad3.c(this.c.getInsets(bb8.a(i)));
    }

    public ad3 i(int i) {
        return ad3.c(this.c.getInsetsIgnoringVisibility(bb8.a(i)));
    }

    public boolean t(int i) {
        return this.c.isVisible(bb8.a(i));
    }

    public final void d(View view) {
    }
}
