package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: u68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u68 extends t68 {
    public final void C(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public final void G(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public final void H(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public final void I(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void J(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    public final float s(View view) {
        return view.getTransitionAlpha();
    }
}
