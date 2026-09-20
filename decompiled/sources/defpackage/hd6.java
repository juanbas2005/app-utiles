package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* renamed from: hd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hd6 extends z65 {
    public final /* synthetic */ int c = 1;
    public float d;
    public final float e;
    public final /* synthetic */ kd6 f;
    public final Object g;

    public hd6(kd6 kd6, float f2, float f3) {
        this.f = kd6;
        this.g = new RectF();
        this.d = f2;
        this.e = f3;
    }

    public final void K(String str) {
        String str2;
        int i = this.c;
        Object obj = this.g;
        kd6 kd6 = this.f;
        switch (i) {
            case b85.b:
                if (kd6.N0()) {
                    Path path = new Path();
                    str2 = str;
                    ((id6) kd6.z).d.getTextPath(str2, 0, str.length(), this.d, this.e, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.d = ((id6) kd6.z).d.measureText(str2) + this.d;
                return;
            default:
                if (kd6.N0()) {
                    Rect rect = new Rect();
                    ((id6) kd6.z).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.d, this.e);
                    ((RectF) obj).union(rectF);
                }
                this.d = ((id6) kd6.z).d.measureText(str) + this.d;
                return;
        }
    }

    public final boolean t(wc6 wc6) {
        switch (this.c) {
            case b85.b:
                if (!(wc6 instanceof xc6)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(wc6 instanceof xc6)) {
                    return true;
                }
                xc6 xc6 = (xc6) wc6;
                jc6 B = wc6.a.B(xc6.n);
                if (B == null) {
                    kd6.O("TextPath path reference '%s' not found", xc6.n);
                    return false;
                }
                vb6 vb6 = (vb6) B;
                ed6 ed6 = new ed6(vb6.o);
                Matrix matrix = vb6.n;
                Path path = ed6.a;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.g).union(rectF);
                return false;
        }
    }

    public hd6(kd6 kd6, float f2, float f3, Path path) {
        this.f = kd6;
        this.d = f2;
        this.e = f3;
        this.g = path;
    }
}
