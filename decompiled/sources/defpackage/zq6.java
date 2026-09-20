package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: zq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zq6 extends br6 {
    public static final RectF h = new RectF();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    public zq6(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f2 = this.d;
        float f3 = this.e;
        RectF rectF = h;
        rectF.set(this.b, this.c, f2, f3);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
