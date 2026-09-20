package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: s28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s28 extends v28 {
    public ig d;
    public float e;
    public ig f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    public final boolean a() {
        if (this.f.i() || this.d.i()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public final boolean b(int[] iArr) {
        boolean z;
        ig igVar;
        ig igVar2 = this.f;
        boolean z2 = true;
        if (igVar2.i()) {
            ColorStateList colorStateList = (ColorStateList) igVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != igVar2.b) {
                igVar2.b = colorForState;
                z = true;
                igVar = this.d;
                if (igVar.i()) {
                    ColorStateList colorStateList2 = (ColorStateList) igVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != igVar.b) {
                        igVar.b = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        igVar = this.d;
        if (igVar.i()) {
        }
        z2 = false;
        return z | z2;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i2) {
        this.f.b = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.g = f2;
    }

    public void setStrokeColor(int i2) {
        this.d.b = i2;
    }

    public void setStrokeWidth(float f2) {
        this.e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
