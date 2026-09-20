package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: ez1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ez1 extends ViewGroup {
    public final void a(qk0 qk0, View view, long j) {
        super.drawChild(pd.a(qk0), view, j);
    }

    public int getChildCount() {
        return 0;
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void forceLayout() {
    }

    public final void requestLayout() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
