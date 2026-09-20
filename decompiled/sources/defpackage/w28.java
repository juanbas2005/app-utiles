package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: w28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w28 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final t28 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final js o;

    /* JADX WARNING: type inference failed for: r0v4, types: [js, zt6] */
    public w28(w28 w28) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        ? zt6 = new zt6(0);
        this.o = zt6;
        this.g = new t28(w28.g, zt6);
        this.a = new Path(w28.a);
        this.b = new Path(w28.b);
        this.h = w28.h;
        this.i = w28.i;
        this.j = w28.j;
        this.k = w28.k;
        this.l = w28.l;
        this.m = w28.m;
        String str = w28.m;
        if (str != null) {
            zt6.put(str, this);
        }
        this.n = w28.n;
    }

    public final void a(t28 t28, Matrix matrix, Canvas canvas, int i2, int i3) {
        int i4;
        float f2;
        float f3;
        int i5;
        Path.FillType fillType;
        float f4;
        Path.FillType fillType2;
        t28 t282 = t28;
        Matrix matrix2 = t282.a;
        ArrayList arrayList = t282.b;
        matrix2.set(matrix);
        Matrix matrix3 = t282.a;
        matrix3.preConcat(t282.j);
        canvas.save();
        char c2 = 0;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            u28 u28 = (u28) arrayList.get(i6);
            if (u28 instanceof t28) {
                a((t28) u28, matrix3, canvas, i2, i3);
            } else {
                Canvas canvas2 = canvas;
                if (u28 instanceof v28) {
                    v28 v28 = (v28) u28;
                    float f5 = ((float) i2) / this.j;
                    float f6 = ((float) i3) / this.k;
                    float min = Math.min(f5, f6);
                    Matrix matrix4 = this.c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f5, f6);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float f7 = min;
                    char c3 = c2;
                    i4 = i6;
                    float f8 = (fArr[c3] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[c2], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    if (max > 0.0f) {
                        f2 = Math.abs(f8) / max;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f2 != 0.0f) {
                        Path path = this.a;
                        path.reset();
                        xe5[] xe5Arr = v28.a;
                        if (xe5Arr != null) {
                            xe5.b(xe5Arr, path);
                        }
                        Path path2 = this.b;
                        path2.reset();
                        if (v28 instanceof r28) {
                            if (v28.c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix4);
                            canvas2.clipPath(path2);
                        } else {
                            s28 s28 = (s28) v28;
                            float f9 = s28.i;
                            if (!(f9 == 0.0f && s28.j == 1.0f)) {
                                float f10 = s28.k;
                                float f11 = (f9 + f10) % 1.0f;
                                float f12 = (s28.j + f10) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(path, c3);
                                float length = this.f.getLength();
                                float f13 = f11 * length;
                                float f14 = f12 * length;
                                path.reset();
                                int i7 = (f13 > f14 ? 1 : (f13 == f14 ? 0 : -1));
                                PathMeasure pathMeasure = this.f;
                                if (i7 > 0) {
                                    pathMeasure.getSegment(f13, length, path, true);
                                    f4 = 0.0f;
                                    this.f.getSegment(0.0f, f14, path, true);
                                } else {
                                    f4 = 0.0f;
                                    pathMeasure.getSegment(f13, f14, path, true);
                                }
                                path.rLineTo(f4, f4);
                            }
                            path2.addPath(path, matrix4);
                            ig igVar = s28.f;
                            if (((Shader) igVar.c) == null && igVar.b == 0) {
                                f3 = 255.0f;
                                i5 = 16777215;
                            } else {
                                if (this.e == null) {
                                    i5 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i5 = 16777215;
                                }
                                Paint paint2 = this.e;
                                Shader shader = (Shader) igVar.c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(s28.h * 255.0f));
                                    f3 = 255.0f;
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i8 = igVar.b;
                                    float f15 = s28.h;
                                    PorterDuff.Mode mode = z28.F;
                                    f3 = 255.0f;
                                    paint2.setColor((i8 & i5) | (((int) (((float) Color.alpha(i8)) * f15)) << 24));
                                }
                                paint2.setColorFilter((ColorFilter) null);
                                if (s28.c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas2.drawPath(path2, paint2);
                            }
                            ig igVar2 = s28.d;
                            if (((Shader) igVar2.c) != null || igVar2.b != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = s28.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = s28.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(s28.n);
                                Shader shader2 = (Shader) igVar2.c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(s28.g * f3));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i9 = igVar2.b;
                                    float f16 = s28.g;
                                    PorterDuff.Mode mode2 = z28.F;
                                    paint4.setColor((i9 & i5) | (((int) (((float) Color.alpha(i9)) * f16)) << 24));
                                }
                                paint4.setColorFilter((ColorFilter) null);
                                paint4.setStrokeWidth(s28.e * f7 * f2);
                                canvas2.drawPath(path2, paint4);
                            }
                        }
                    }
                    i6 = i4 + 1;
                    c2 = 0;
                } else {
                    int i10 = i2;
                }
            }
            int i11 = i3;
            i4 = i6;
            i6 = i4 + 1;
            c2 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.l = i2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [js, zt6] */
    public w28() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new zt6(0);
        this.g = new t28();
        this.a = new Path();
        this.b = new Path();
    }
}
