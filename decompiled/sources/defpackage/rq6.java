package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: rq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rq6 {
    public h49 a = new Object();
    public h49 b = new Object();
    public h49 c = new Object();
    public h49 d = new Object();
    public z71 e = new a0(0.0f);
    public z71 f = new a0(0.0f);
    public z71 g = new a0(0.0f);
    public z71 h = new a0(0.0f);
    public g22 i = new g22(0);
    public g22 j = new g22(0);
    public g22 k = new g22(0);
    public g22 l = new g22(0);

    public static qq6 a(Context context, int i2, int i3, a0 a0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i3, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ov5.y);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            z71 c2 = c(obtainStyledAttributes, 5, a0Var);
            z71 c3 = c(obtainStyledAttributes, 8, c2);
            z71 c4 = c(obtainStyledAttributes, 9, c2);
            z71 c5 = c(obtainStyledAttributes, 7, c2);
            z71 c6 = c(obtainStyledAttributes, 6, c2);
            qq6 qq6 = new qq6();
            qq6.a = rc9.B(i5);
            qq6.e = c3;
            qq6.b = rc9.B(i6);
            qq6.f = c4;
            qq6.c = rc9.B(i7);
            qq6.g = c5;
            qq6.d = rc9.B(i8);
            qq6.h = c6;
            return qq6;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static qq6 b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a0 a0Var = new a0(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.r, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, a0Var);
    }

    public static z71 c(TypedArray typedArray, int i2, z71 z71) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                return new a0((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new q36(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return z71;
    }

    public final boolean d() {
        if (!(this.b instanceof r96) || !(this.a instanceof r96) || !(this.c instanceof r96) || !(this.d instanceof r96)) {
            return false;
        }
        return true;
    }

    public final boolean e(RectF rectF) {
        boolean z;
        boolean z2;
        Class<g22> cls = g22.class;
        if (!this.l.getClass().equals(cls) || !this.j.getClass().equals(cls) || !this.i.getClass().equals(cls) || !this.k.getClass().equals(cls)) {
            z = false;
        } else {
            z = true;
        }
        float a2 = this.e.a(rectF);
        if (this.f.a(rectF) == a2 && this.h.a(rectF) == a2 && this.g.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || !d()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qq6, java.lang.Object] */
    public final qq6 f() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
