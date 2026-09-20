package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: ao  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ao {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ao() {
        this.b = new k23[32];
        this.c = new float[32];
        this.d = new byte[32];
        up4 up4 = cg6.a;
        this.e = new up4();
        this.f = new up4();
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((w70) this.d) != null) {
                if (((w70) this.f) == null) {
                    this.f = new Object();
                }
                w70 w70 = (w70) this.f;
                w70.c = null;
                w70.b = false;
                w70.d = null;
                w70.a = false;
                WeakHashMap weakHashMap = e58.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    w70.b = true;
                    w70.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    w70.a = true;
                    w70.d = backgroundTintMode;
                }
                if (w70.b || w70.a) {
                    yo.e(background, w70, view.getDrawableState());
                    return;
                }
            }
            w70 w702 = (w70) this.e;
            if (w702 != null) {
                yo.e(background, w702, view.getDrawableState());
                return;
            }
            w70 w703 = (w70) this.d;
            if (w703 != null) {
                yo.e(background, w703, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        w70 w70 = (w70) this.e;
        if (w70 != null) {
            return (ColorStateList) w70.c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        w70 w70 = (w70) this.e;
        if (w70 != null) {
            return (PorterDuff.Mode) w70.d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = qv5.y;
        cf4 w = cf4.w(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) w.y;
        View view2 = (View) this.b;
        e58.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) w.y, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                yo yoVar = (yo) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (yoVar) {
                    f2 = yoVar.a.f(context2, i2);
                }
                if (f2 != null) {
                    i(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(w.g(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(sz1.b(typedArray.getInt(2, -1), (PorterDuff.Mode) null));
            }
            w.A();
        } catch (Throwable th) {
            Throwable th2 = th;
            w.A();
            throw th2;
        }
    }

    public pt4 e(String str) {
        nt4 nt4;
        str.getClass();
        z97 z97 = (z97) this.f;
        if (z97 == null || (nt4 = (nt4) z97.getValue()) == null) {
            return null;
        }
        int i = qt4.A;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle d2 = nt4.d(parse, (LinkedHashMap) this.d);
        if (d2 == null) {
            return null;
        }
        return new pt4((qt4) this.b, d2, nt4.l, nt4.b(parse), false);
    }

    public void f() {
        this.a = -1;
        i((ColorStateList) null);
        a();
    }

    public void g(int i) {
        ColorStateList colorStateList;
        this.a = i;
        yo yoVar = (yo) this.c;
        if (yoVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (yoVar) {
                colorStateList = yoVar.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        i(colorStateList);
        a();
    }

    public void h(k23 k23) {
        int c1 = qs.c1(k23, (k23[]) this.b);
        if (c1 >= 0) {
            k23[] k23Arr = (k23[]) this.b;
            int i = c1 + 1;
            qs.K0(c1, i, this.a, k23Arr, k23Arr);
            int i2 = this.a;
            ((k23[]) this.b)[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            System.arraycopy(fArr, i, fArr, c1, i2 - i);
            byte[] bArr = (byte[]) this.d;
            qs.I0(c1, i, this.a, bArr, bArr);
            this.a--;
        }
    }

    public void i(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((w70) this.d) == null) {
                this.d = new Object();
            }
            w70 w70 = (w70) this.d;
            w70.c = colorStateList;
            w70.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void j(ColorStateList colorStateList) {
        if (((w70) this.e) == null) {
            this.e = new Object();
        }
        w70 w70 = (w70) this.e;
        w70.c = colorStateList;
        w70.b = true;
        a();
    }

    public void k(PorterDuff.Mode mode) {
        if (((w70) this.e) == null) {
            this.e = new Object();
        }
        w70 w70 = (w70) this.e;
        w70.d = mode;
        w70.a = true;
        a();
    }

    public ao(View view) {
        this.a = -1;
        this.b = view;
        this.c = yo.a();
    }
}
