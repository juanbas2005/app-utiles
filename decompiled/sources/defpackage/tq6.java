package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* renamed from: tq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tq6 {
    public final dr6[] a = new dr6[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final dr6 g = new dr6();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public tq6() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new dr6();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void a(rq6 rq6, float[] fArr, float f2, RectF rectF, ns8 ns8, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i2;
        dr6[] dr6Arr;
        Matrix[] matrixArr2;
        ? r16;
        float f3;
        g22 g22;
        boolean z;
        z71 z71;
        h49 h49;
        int i3;
        rq6 rq62 = rq6;
        RectF rectF2 = rectF;
        ns8 ns82 = ns8;
        Path path2 = path;
        path2.rewind();
        Path path3 = this.e;
        path3.rewind();
        Path path4 = this.f;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            i2 = 4;
            dr6Arr = this.a;
            matrixArr2 = this.b;
            r16 = 0;
            if (i4 >= 4) {
                break;
            }
            if (fArr != null) {
                z71 = new up0(fArr[i4]);
            } else if (i4 == 1) {
                z71 = rq62.g;
            } else if (i4 == 2) {
                z71 = rq62.h;
            } else if (i4 != 3) {
                z71 = rq62.f;
            } else {
                z71 = rq62.e;
            }
            if (i4 == 1) {
                h49 = rq62.c;
            } else if (i4 == 2) {
                h49 = rq62.d;
            } else if (i4 != 3) {
                h49 = rq62.b;
            } else {
                h49 = rq62.a;
            }
            dr6 dr6 = dr6Arr[i4];
            h49.getClass();
            h49.A(dr6, f2, z71.a(rectF2));
            int i5 = i4 + 1;
            float f4 = (float) ((i5 % 4) * 90);
            matrixArr2[i4].reset();
            PointF pointF = this.d;
            if (i4 == 1) {
                i3 = i4;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i4 == 2) {
                i3 = i4;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i4 != 3) {
                i3 = i4;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                i3 = i4;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f4);
            dr6 dr62 = dr6Arr[i3];
            fArr2[0] = dr62.b;
            fArr2[1] = dr62.c;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i3].preRotate(f4);
            i4 = i5;
        }
        int i6 = 0;
        while (i6 < i2) {
            dr6 dr63 = dr6Arr[i6];
            dr63.getClass();
            fArr2[r16] = 0.0f;
            fArr2[1] = dr63.a;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path2.moveTo(fArr2[r16], fArr2[1]);
            } else {
                path2.lineTo(fArr2[r16], fArr2[1]);
            }
            dr6Arr[i6].b(matrixArr2[i6], path2);
            if (ns82 != null) {
                dr6 dr64 = dr6Arr[i6];
                Matrix matrix = matrixArr2[i6];
                ug4 ug4 = (ug4) ns82.x;
                f3 = 0.0f;
                BitSet bitSet = ug4.A;
                dr64.getClass();
                bitSet.set(i6, r16);
                cr6[] cr6Arr = ug4.y;
                dr64.a(dr64.e);
                cr6Arr[i6] = new wq6(new ArrayList(dr64.g), new Matrix(matrix));
            } else {
                f3 = 0.0f;
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            dr6 dr65 = dr6Arr[i6];
            fArr2[0] = dr65.b;
            fArr2[1] = dr65.c;
            matrixArr2[i6].mapPoints(fArr2);
            dr6 dr66 = dr6Arr[i8];
            dr66.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f3;
            fArr3[1] = dr66.a;
            matrixArr2[i8].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            dr6[] dr6Arr2 = dr6Arr;
            float max = Math.max(((float) Math.hypot((double) (fArr2[0] - fArr3[0]), (double) (fArr2[1] - fArr3[1]))) - 0.001f, f3);
            dr6 dr67 = dr6Arr2[i6];
            fArr2[0] = dr67.b;
            fArr2[1] = dr67.c;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            dr6 dr68 = this.g;
            dr68.d(0.0f, 270.0f, 0.0f);
            if (i6 == 1) {
                g22 = rq62.k;
            } else if (i6 == 2) {
                g22 = rq62.l;
            } else if (i6 != 3) {
                g22 = rq62.j;
            } else {
                g22 = rq62.i;
            }
            g22.getClass();
            dr68.c(max, 0.0f);
            Path path5 = this.j;
            path5.reset();
            dr68.b(matrixArr3[i6], path5);
            if (!this.l || (!b(path5, i6) && !b(path5, i8))) {
                dr68.b(matrixArr3[i6], path2);
            } else {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = dr68.a;
                matrixArr3[i6].mapPoints(fArr2);
                path3.moveTo(fArr2[0], fArr2[1]);
                dr68.b(matrixArr3[i6], path3);
            }
            if (ns82 != null) {
                Matrix matrix2 = matrixArr3[i6];
                ug4 ug42 = (ug4) ns82.x;
                z = false;
                ug42.A.set(i6 + 4, false);
                cr6[] cr6Arr2 = ug42.z;
                dr68.a(dr68.e);
                cr6Arr2[i6] = new wq6(new ArrayList(dr68.g), new Matrix(matrix2));
            } else {
                z = false;
            }
            matrixArr = matrixArr3;
            i6 = i7;
            r16 = z;
            dr6Arr = dr6Arr2;
            i2 = 4;
            RectF rectF3 = rectF;
        }
        path2.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.k;
        path2.reset();
        this.a[i2].b(this.b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}
