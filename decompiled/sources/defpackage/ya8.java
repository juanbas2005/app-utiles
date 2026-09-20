package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* renamed from: ya8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ya8 extends xa8 {
    public ya8(db8 db8, WindowInsets windowInsets) {
        super(db8, windowInsets);
    }

    public List<Rect> e(int i) {
        return this.c.getBoundingRects(cb8.a(i));
    }

    public List<Rect> f(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(cb8.a(i));
    }

    public void p() {
    }
}
