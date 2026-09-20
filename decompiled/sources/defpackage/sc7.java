package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;

/* renamed from: sc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sc7 {
    public final ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final ColorStateList k;
    public float l;
    public final int m;
    public boolean n = false;
    public boolean o = false;
    public Typeface p;

    public sc7(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, qv5.v);
        this.l = obtainStyledAttributes.getDimension(0, 0.0f);
        int i3 = 3;
        this.k = t49.L(context, obtainStyledAttributes, 3);
        t49.L(context, obtainStyledAttributes, 4);
        t49.L(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int i4 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.m = obtainStyledAttributes.getResourceId(i4, 0);
        this.b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = t49.L(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, ov5.t);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = obtainStyledAttributes2.getString(!obtainStyledAttributes2.hasValue(3) ? 1 : i3);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.p;
        int i2 = this.d;
        if (typeface == null && (str = this.b) != null) {
            this.p = Typeface.create(str, i2);
        }
        if (this.p == null) {
            int i3 = this.e;
            if (i3 == 1) {
                this.p = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.p = Typeface.SERIF;
            } else if (i3 != 3) {
                this.p = Typeface.DEFAULT;
            } else {
                this.p = Typeface.MONOSPACE;
            }
            this.p = Typeface.create(this.p, i2);
        }
    }

    public final void b(Context context, t35 t35) {
        if (!c(context)) {
            a();
        }
        int i2 = this.m;
        if (i2 == 0) {
            this.n = true;
        }
        if (this.n) {
            t35.z(this.p, true);
            return;
        }
        try {
            qc7 qc7 = new qc7(this, t35);
            ThreadLocal threadLocal = x56.a;
            if (context.isRestricted()) {
                qc7.h(-4);
                return;
            }
            x56.a(context, i2, new TypedValue(), 0, qc7, false, false);
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            t35.y(1);
        } catch (Exception e2) {
            Exception exc = e2;
            Log.d("TextAppearance", "Error loading font " + this.b, exc);
            this.n = true;
            t35.y(-3);
        }
    }

    public final boolean c(Context context) {
        Typeface typeface;
        Context context2;
        String str;
        Typeface create;
        if (this.n) {
            return true;
        }
        int i2 = this.m;
        if (i2 != 0) {
            ThreadLocal threadLocal = x56.a;
            Typeface typeface2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typeface = null;
            } else {
                context2 = context;
                typeface = x56.a(context2, i2, new TypedValue(), 0, (b85) null, false, true);
            }
            if (typeface != null) {
                this.p = typeface;
                this.n = true;
                return true;
            }
            if (!this.o) {
                this.o = true;
                Resources resources = context2.getResources();
                int i3 = this.m;
                if (i3 != 0 && resources.getResourceTypeName(i3).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i3);
                        while (true) {
                            if (xml.getEventType() != 1) {
                                if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                    TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), lv5.b);
                                    str = obtainAttributes.getString(7);
                                    obtainAttributes.recycle();
                                    break;
                                }
                                xml.next();
                            } else {
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    if (!(str == null || (create = Typeface.create(str, 0)) == Typeface.DEFAULT)) {
                        typeface2 = Typeface.create(create, this.d);
                    }
                }
                str = null;
                typeface2 = Typeface.create(create, this.d);
            }
            if (typeface2 != null) {
                this.p = typeface2;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, t35 t35) {
        int i2;
        int i3;
        e(context, textPaint, t35);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        ColorStateList colorStateList2 = this.a;
        if (colorStateList2 != null) {
            i3 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i3 = 0;
        }
        textPaint.setShadowLayer(this.h, this.f, this.g, i3);
    }

    public final void e(Context context, TextPaint textPaint, t35 t35) {
        Typeface typeface;
        if (!c(context) || !this.n || (typeface = this.p) == null) {
            a();
            f(context, textPaint, this.p);
            b(context, new rc7(this, context, textPaint, t35));
            return;
        }
        f(context, textPaint, typeface);
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f2;
        Typeface n2 = c35.n(context.getResources().getConfiguration(), typeface);
        if (n2 != null) {
            typeface = n2;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.d;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i2 & 2) != 0) {
            f2 = -0.25f;
        } else {
            f2 = 0.0f;
        }
        textPaint.setTextSkewX(f2);
        textPaint.setTextSize(this.l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
