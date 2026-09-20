package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: yq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yq6 extends cr6 {
    public final ar6 c;
    public final float d;
    public final float e;

    public yq6(ar6 ar6, float f, float f2) {
        this.c = ar6;
        this.d = f;
        this.e = f2;
    }

    public final void a(Matrix matrix, nq6 nq6, int i, Canvas canvas) {
        nq6 nq62 = nq6;
        int i2 = i;
        Canvas canvas2 = canvas;
        ar6 ar6 = this.c;
        float f = ar6.c;
        float f2 = this.e;
        float f3 = ar6.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        nq62.getClass();
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int i3 = nq62.f;
        int[] iArr = nq6.i;
        iArr[0] = i3;
        iArr[1] = nq62.e;
        iArr[2] = nq62.d;
        Paint paint = nq62.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, nq6.j, Shader.TileMode.CLAMP));
        canvas2.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas2.restore();
    }

    public final float b() {
        ar6 ar6 = this.c;
        return (float) Math.toDegrees(Math.atan((double) ((ar6.c - this.e) / (ar6.b - this.d))));
    }
}
