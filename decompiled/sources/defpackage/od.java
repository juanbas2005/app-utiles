package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: od  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class od implements qk0 {
    public Canvas a = pd.a;
    public Rect b;
    public Rect c;

    public final void a(float f, float f2, float f3, float f4, kb9 kb9) {
        this.a.drawRect(f, f2, f3, f4, dh4.q(kb9));
    }

    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    public final void c(hg hgVar, long j, long j2, long j3, kb9 kb9) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap h = rg3.h(hgVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(h, rect, rect2, (Paint) kb9.y);
    }

    public final void d(float f) {
        this.a.rotate(f);
    }

    public final void e(long j, long j2, kb9 kb9) {
        Canvas canvas = this.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        canvas.drawLine(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) kb9.y);
    }

    public final void f(eh ehVar, kb9 kb9) {
        Canvas canvas = this.a;
        if (ehVar instanceof eh) {
            canvas.drawPath(ehVar.a, dh4.q(kb9));
        } else {
            kj6.n("Unable to obtain android.graphics.Path");
        }
    }

    public final void g(ly5 ly5, kb9 kb9) {
        this.a.saveLayer(ly5.a, ly5.b, ly5.c, ly5.d, (Paint) kb9.y, 31);
    }

    public final void h() {
        this.a.save();
    }

    public final void i() {
        pv8.A(this.a, false);
    }

    public final void j(float[] fArr) {
        if (!x91.D(fArr)) {
            Matrix matrix = new Matrix();
            sg3.T(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    public final void k(eh ehVar) {
        Canvas canvas = this.a;
        if (ehVar instanceof eh) {
            canvas.clipPath(ehVar.a, Region.Op.INTERSECT);
        } else {
            kj6.n("Unable to obtain android.graphics.Path");
        }
    }

    public final void l(float f, float f2, float f3, float f4, float f5, float f6, kb9 kb9) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) kb9.y);
    }

    public final void m(hg hgVar, long j, kb9 kb9) {
        this.a.drawBitmap(rg3.h(hgVar), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), dh4.q(kb9));
    }

    public final void n(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    public final void p() {
        this.a.restore();
    }

    public final void r(float f, long j, kb9 kb9) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) kb9.y);
    }

    public final void s(float f, float f2, float f3, float f4, float f5, float f6, kb9 kb9) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) kb9.y);
    }

    public final void t() {
        pv8.A(this.a, true);
    }
}
