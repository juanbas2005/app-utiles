package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: eh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eh {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public eh(Path path) {
        this.a = path;
    }

    public static void a(eh ehVar, eh ehVar2) {
        Path path = ehVar.a;
        if (ehVar2 instanceof eh) {
            path.addPath(ehVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            kj6.n("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(eh ehVar, ly5 ly5) {
        ehVar.getClass();
        float f = ly5.a;
        float f2 = ly5.d;
        float f3 = ly5.c;
        float f4 = ly5.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            gh.b("Invalid rectangle, make sure no value is NaN");
        }
        if (ehVar.b == null) {
            ehVar.b = new RectF();
        }
        RectF rectF = ehVar.b;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = ehVar.a;
        RectF rectF2 = ehVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(eh ehVar, l96 l96) {
        if (ehVar.b == null) {
            ehVar.b = new RectF();
        }
        RectF rectF = ehVar.b;
        rectF.getClass();
        float f = l96.a;
        long j = l96.h;
        long j2 = l96.g;
        long j3 = l96.f;
        long j4 = l96.e;
        rectF.set(f, l96.b, l96.c, l96.d);
        if (ehVar.c == null) {
            ehVar.c = new float[8];
        }
        float[] fArr = ehVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = ehVar.a;
        RectF rectF2 = ehVar.b;
        rectF2.getClass();
        float[] fArr2 = ehVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final ly5 d() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new ly5(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(eh ehVar, eh ehVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (ehVar instanceof eh) {
            Path path = ehVar.a;
            if (ehVar2 instanceof eh) {
                return this.a.op(path, ehVar2.a, op);
            }
            kj6.n("Unable to obtain android.graphics.Path");
            return false;
        }
        kj6.n("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h() {
        this.a.rewind();
    }

    public final void i(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
