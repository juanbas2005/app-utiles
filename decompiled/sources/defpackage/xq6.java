package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: xq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xq6 extends cr6 {
    public final zq6 c;

    public xq6(zq6 zq6) {
        this.c = zq6;
    }

    public final void a(Matrix matrix, nq6 nq6, int i, Canvas canvas) {
        boolean z;
        nq6 nq62 = nq6;
        int i2 = i;
        Canvas canvas2 = canvas;
        zq6 zq6 = this.c;
        float f = zq6.f;
        float f2 = zq6.g;
        RectF rectF = new RectF(zq6.b, zq6.c, zq6.d, zq6.e);
        Paint paint = nq62.b;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = nq62.g;
        int[] iArr = nq6.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = nq62.f;
            iArr[2] = nq62.e;
            iArr[3] = nq62.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i2);
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = nq62.d;
            iArr[2] = nq62.e;
            iArr[3] = nq62.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i2) / width);
            float[] fArr = nq6.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
            canvas2.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, nq62.h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
