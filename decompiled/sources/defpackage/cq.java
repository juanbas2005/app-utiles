package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: cq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cq {
    public final TextView a;
    public w70 b;
    public w70 c;
    public w70 d;
    public w70 e;
    public w70 f;
    public w70 g;
    public w70 h;
    public final lq i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public cq(TextView textView) {
        this.a = textView;
        this.i = new lq(textView);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [w70, java.lang.Object] */
    public static w70 c(Context context, yo yoVar, int i2) {
        ColorStateList f2;
        synchronized (yoVar) {
            f2 = yoVar.a.f(context, i2);
        }
        if (f2 == null) {
            return null;
        }
        ? obj = new Object();
        obj.b = true;
        obj.c = f2;
        return obj;
    }

    public final void a(Drawable drawable, w70 w70) {
        if (drawable != null && w70 != null) {
            yo.e(drawable, w70, this.a.getDrawableState());
        }
    }

    public final void b() {
        w70 w70 = this.b;
        TextView textView = this.a;
        if (!(w70 == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public final ColorStateList d() {
        w70 w70 = this.h;
        if (w70 != null) {
            return (ColorStateList) w70.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        w70 w70 = this.h;
        if (w70 != null) {
            return (PorterDuff.Mode) w70.d;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:218:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i2) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        float f2;
        float f3;
        float f4;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i3;
        int i4;
        float f5;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6 = i2;
        TextView textView = this.a;
        Context context = textView.getContext();
        yo a2 = yo.a();
        int[] iArr = qv5.h;
        cf4 w = cf4.w(context, attributeSet, iArr, i6);
        int i7 = i6;
        AttributeSet attributeSet2 = attributeSet;
        e58.l(textView, textView.getContext(), iArr, attributeSet2, (TypedArray) w.y, i7);
        AttributeSet attributeSet3 = attributeSet2;
        int i8 = i7;
        TextView textView2 = textView;
        TypedArray typedArray = (TypedArray) w.y;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        w.A();
        boolean z3 = textView2.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = qv5.v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            cf4 cf4 = new cf4(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z = false;
            } else {
                z = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m(context, cf4);
            if (obtainStyledAttributes.hasValue(15)) {
                str = obtainStyledAttributes.getString(15);
            } else {
                str = null;
            }
            if (Build.VERSION.SDK_INT < 26 || !obtainStyledAttributes.hasValue(13)) {
                str2 = null;
            } else {
                str2 = obtainStyledAttributes.getString(13);
            }
            cf4.A();
        } else {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet3, iArr2, i8, 0);
        cf4 cf42 = new cf4(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z = obtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z4 = z;
        if (obtainStyledAttributes2.hasValue(15)) {
            str = obtainStyledAttributes2.getString(15);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str2 = obtainStyledAttributes2.getString(13);
        }
        if (i9 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView2.setTextSize(0, 0.0f);
        }
        m(context, cf42);
        cf42.A();
        if (!z3 && z2) {
            textView2.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView2.setTypeface(typeface, this.j);
            } else {
                textView2.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            aq.d(textView2, str2);
        }
        if (str != null) {
            zp.b(textView2, zp.a(str));
        }
        lq lqVar = this.i;
        Context context2 = lqVar.j;
        int[] iArr3 = qv5.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet3, iArr3, i8, 0);
        TextView textView3 = lqVar.i;
        e58.l(textView3, textView3.getContext(), iArr3, attributeSet3, obtainStyledAttributes3, i8);
        if (obtainStyledAttributes3.hasValue(5)) {
            lqVar.a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f2 = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f3 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f4 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f4 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = obtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                lqVar.f = lq.b(iArr4);
                lqVar.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!lqVar.j()) {
            lqVar.a = 0;
        } else if (lqVar.a == 1) {
            if (!lqVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (f3 == -1.0f) {
                    i5 = 2;
                    f3 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (f4 == -1.0f) {
                    f4 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                float f6 = f4;
                if (f2 == -1.0f) {
                    f2 = 1.0f;
                }
                lqVar.k(f3, f6, f2);
            }
            lqVar.h();
        }
        if (o68.c && lqVar.a != 0) {
            int[] iArr5 = lqVar.f;
            if (iArr5.length > 0) {
                if (((float) aq.a(textView2)) != -1.0f) {
                    aq.b(textView2, Math.round(lqVar.d), Math.round(lqVar.e), Math.round(lqVar.c), 0);
                } else {
                    aq.c(textView2, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet3, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a2.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a2.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a2.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a2.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a2.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a2.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = textView2.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            Drawable[] compoundDrawablesRelative2 = textView2.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView2.getCompoundDrawables();
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = ag8.r(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView2.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView2.setCompoundDrawableTintMode(sz1.b(obtainStyledAttributes4.getInt(12, -1), (PorterDuff.Mode) null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i3 = -1;
                f5 = (float) obtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i11 = peekValue.data;
                int i12 = i11 & 15;
                f5 = TypedValue.complexToFloat(i11);
                i4 = i12;
                i3 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i3) {
                    za5.z(textView2, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i3) {
                    za5.A(textView2, dimensionPixelSize2);
                }
                if (f5 != -1.0f) {
                    return;
                }
                if (i4 == i3) {
                    za5.B(textView2, (int) f5);
                    return;
                } else if (Build.VERSION.SDK_INT >= 34) {
                    l4.m(textView2, i4, f5);
                    return;
                } else {
                    za5.B(textView2, Math.round(TypedValue.applyDimension(i4, f5, textView2.getResources().getDisplayMetrics())));
                    return;
                }
            }
        } else {
            i3 = -1;
            f5 = -1.0f;
        }
        i4 = i3;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
        }
        if (dimensionPixelSize2 != i3) {
        }
        if (f5 != -1.0f) {
        }
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, qv5.v);
        cf4 cf4 = new cf4(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, cf4);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            aq.d(textView, string);
        }
        cf4.A();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i2, int i3, int i4, int i5) {
        lq lqVar = this.i;
        if (lqVar.j()) {
            DisplayMetrics displayMetrics = lqVar.j.getResources().getDisplayMetrics();
            lqVar.k(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (lqVar.h()) {
                lqVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i2) {
        lq lqVar = this.i;
        if (lqVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = lqVar.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                lqVar.f = lq.b(iArr2);
                if (!lqVar.i()) {
                    ta1.h("None of the preset sizes is valid: ", Arrays.toString(iArr));
                    return;
                }
            } else {
                lqVar.g = false;
            }
            if (lqVar.h()) {
                lqVar.a();
            }
        }
    }

    public final void j(int i2) {
        lq lqVar = this.i;
        if (!lqVar.j()) {
            return;
        }
        if (i2 == 0) {
            lqVar.a = 0;
            lqVar.d = -1.0f;
            lqVar.e = -1.0f;
            lqVar.c = -1.0f;
            lqVar.f = new int[0];
            lqVar.b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = lqVar.j.getResources().getDisplayMetrics();
            lqVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (lqVar.h()) {
                lqVar.a();
            }
        } else {
            h.q(hl6.k(i2, "Unknown auto-size text type: "));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [w70, java.lang.Object] */
    public final void k(ColorStateList colorStateList) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        w70 w70 = this.h;
        w70.c = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        w70.b = z;
        this.b = w70;
        this.c = w70;
        this.d = w70;
        this.e = w70;
        this.f = w70;
        this.g = w70;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [w70, java.lang.Object] */
    public final void l(PorterDuff.Mode mode) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        w70 w70 = this.h;
        w70.d = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        w70.a = z;
        this.b = w70;
        this.c = w70;
        this.d = w70;
        this.e = w70;
        this.f = w70;
        this.g = w70;
    }

    public final void m(Context context, cf4 cf4) {
        String string;
        boolean z;
        boolean z2;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) cf4.y;
        this.j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.k = i4;
            if (i4 != -1) {
                this.j &= 2;
            }
        }
        int i5 = 10;
        boolean z3 = false;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.l = null;
            if (typedArray.hasValue(12)) {
                i5 = 12;
            }
            int i6 = this.k;
            int i7 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface m2 = cf4.m(i5, this.j, new xp(this, i6, i7, new WeakReference(this.a)));
                    if (m2 != null) {
                        if (i3 < 28 || this.k == -1) {
                            this.l = m2;
                        } else {
                            Typeface create = Typeface.create(m2, 0);
                            int i8 = this.k;
                            if ((this.j & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.l = bq.a(create, i8, z2);
                        }
                    }
                    if (this.l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(string, this.j);
                    return;
                }
                Typeface create2 = Typeface.create(string, 0);
                int i9 = this.k;
                if ((this.j & 2) != 0) {
                    z3 = true;
                }
                this.l = bq.a(create2, i9, z3);
            }
        } else if (typedArray.hasValue(1)) {
            this.m = false;
            int i10 = typedArray.getInt(1, 1);
            if (i10 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.l = Typeface.SERIF;
            } else if (i10 == 3) {
                this.l = Typeface.MONOSPACE;
            }
        }
    }
}
