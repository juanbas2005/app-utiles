package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: t28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t28 extends u28 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARNING: type inference failed for: r5v5, types: [s28, v28] */
    public t28(t28 t28, js jsVar) {
        v28 v28;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = t28.c;
        this.d = t28.d;
        this.e = t28.e;
        this.f = t28.f;
        this.g = t28.g;
        this.h = t28.h;
        this.i = t28.i;
        String str = t28.k;
        this.k = str;
        if (str != null) {
            jsVar.put(str, this);
        }
        matrix.set(t28.j);
        ArrayList arrayList = t28.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof t28) {
                this.b.add(new t28((t28) obj, jsVar));
            } else {
                if (obj instanceof s28) {
                    s28 s28 = (s28) obj;
                    ? v282 = new v28(s28);
                    v282.e = 0.0f;
                    v282.g = 1.0f;
                    v282.h = 1.0f;
                    v282.i = 0.0f;
                    v282.j = 1.0f;
                    v282.k = 0.0f;
                    v282.l = Paint.Cap.BUTT;
                    v282.m = Paint.Join.MITER;
                    v282.n = 4.0f;
                    v282.d = s28.d;
                    v282.e = s28.e;
                    v282.g = s28.g;
                    v282.f = s28.f;
                    v282.c = s28.c;
                    v282.h = s28.h;
                    v282.i = s28.i;
                    v282.j = s28.j;
                    v282.k = s28.k;
                    v282.l = s28.l;
                    v282.m = s28.m;
                    v282.n = s28.n;
                    v28 = v282;
                } else if (obj instanceof r28) {
                    v28 = new v28((r28) obj);
                } else {
                    h.s("Unknown object in the tree!");
                    throw null;
                }
                this.b.add(v28);
                String str2 = v28.b;
                if (str2 != null) {
                    jsVar.put(str2, v28);
                }
            }
        }
    }

    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((u28) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return z;
            }
            z |= ((u28) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    public t28() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
