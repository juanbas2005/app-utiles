package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: q68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q68 {
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
