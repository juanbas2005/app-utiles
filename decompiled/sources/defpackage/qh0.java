package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: qh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh0 {
    public static final qh0 a = new Object();

    public final void a(View view, float[] fArr, Matrix matrix, int[] iArr) {
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate((float) (iArr[0] - i), (float) (iArr[1] - i2));
        sg3.U(matrix, fArr);
    }
}
