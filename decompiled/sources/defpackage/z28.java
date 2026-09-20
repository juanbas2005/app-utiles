package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: z28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z28 extends q28 {
    public static final PorterDuff.Mode F = PorterDuff.Mode.SRC_IN;
    public boolean A;
    public boolean B = true;
    public final float[] C = new float[9];
    public final Matrix D = new Matrix();
    public final Rect E = new Rect();
    public x28 x;
    public PorterDuffColorFilter y;
    public ColorFilter z;

    /* JADX WARNING: type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, x28] */
    public z28() {
        ? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = F;
        constantState.b = new w28();
        this.x = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.w;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.E;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.z;
            if (colorFilter == null) {
                colorFilter = this.y;
            }
            Matrix matrix = this.D;
            canvas2.getMatrix(matrix);
            float[] fArr = this.C;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas2.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas2.translate((float) rect.width(), 0.0f);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                x28 x28 = this.x;
                Bitmap bitmap = x28.f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == x28.f.getHeight())) {
                    x28.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    x28.k = true;
                }
                boolean z2 = this.B;
                x28 x282 = this.x;
                if (!z2) {
                    x282.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(x282.f);
                    w28 w28 = x282.b;
                    w28.a(w28.g, w28.p, canvas3, min, min2);
                } else {
                    int i = min;
                    int i2 = min2;
                    if (!(!x282.k && x282.g == x282.c && x282.h == x282.d && x282.j == x282.e && x282.i == x282.b.getRootAlpha())) {
                        x28 x283 = this.x;
                        x283.f.eraseColor(0);
                        Canvas canvas4 = new Canvas(x283.f);
                        w28 w282 = x283.b;
                        w282.a(w282.g, w28.p, canvas4, i, i2);
                        x28 x284 = this.x;
                        x284.g = x284.c;
                        x284.h = x284.d;
                        x284.i = x284.b.getRootAlpha();
                        x284.j = x284.e;
                        x284.k = false;
                    }
                }
                x28 x285 = this.x;
                if (x285.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (x285.l == null) {
                        Paint paint2 = new Paint();
                        x285.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    x285.l.setAlpha(x285.b.getRootAlpha());
                    x285.l.setColorFilter(colorFilter);
                    paint = x285.l;
                }
                canvas2.drawBitmap(x285.f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.x.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.x.getChangingConfigurations() | super.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.z;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.w != null) {
            return new y28(this.w.getConstantState());
        }
        this.x.a = getChangingConfigurations();
        return this.x;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.x.b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.x.b.h;
    }

    public final int getOpacity() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARNING: type inference failed for: r6v15, types: [s28, java.lang.Object, v28] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Paint.Cap cap;
        int i8;
        Paint.Join join;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        x28 x28 = this.x;
        x28.b = new w28();
        TypedArray v = p25.v(resources2, theme2, attributeSet2, gl0.a);
        x28 x282 = this.x;
        w28 w28 = x282.b;
        if (!p25.r(xmlPullParser2, "tintMode")) {
            i = -1;
        } else {
            i = v.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i9 = 3;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case h75.g:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        x282.d = mode;
        ColorStateList m = p25.m(v, xmlPullParser2, theme2);
        if (m != null) {
            x282.c = m;
        }
        boolean z2 = x282.e;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = v.getBoolean(5, z2);
        }
        x282.e = z2;
        float f = w28.j;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = v.getFloat(7, f);
        }
        w28.j = f;
        float f2 = w28.k;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = v.getFloat(8, f2);
        }
        w28.k = f2;
        if (w28.j <= 0.0f) {
            throw new XmlPullParserException(v.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            w28.h = v.getDimension(3, w28.h);
            int i10 = 2;
            float dimension = v.getDimension(2, w28.i);
            w28.i = dimension;
            if (w28.h <= 0.0f) {
                throw new XmlPullParserException(v.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = w28.getAlpha();
                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = v.getFloat(4, alpha);
                }
                w28.setAlpha(alpha);
                String string = v.getString(0);
                if (string != null) {
                    w28.m = string;
                    w28.o.put(string, w28);
                }
                v.recycle();
                x28.a = getChangingConfigurations();
                int i11 = 1;
                x28.k = true;
                x28 x283 = this.x;
                w28 w282 = x283.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                t28 t28 = w282.g;
                js jsVar = w282.o;
                arrayDeque.push(t28);
                int eventType = xmlPullParser2.getEventType();
                int depth = xmlPullParser2.getDepth() + 1;
                boolean z3 = true;
                while (eventType != i11 && (xmlPullParser2.getDepth() >= depth || eventType != i9)) {
                    if (eventType == i10) {
                        String name = xmlPullParser2.getName();
                        t28 t282 = (t28) arrayDeque.peek();
                        i2 = depth;
                        if ("path".equals(name)) {
                            ? v28 = new v28();
                            v28.e = 0.0f;
                            v28.g = 1.0f;
                            v28.h = 1.0f;
                            v28.i = 0.0f;
                            v28.j = 1.0f;
                            v28.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            v28.l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            v28.m = join2;
                            Paint.Join join3 = join2;
                            v28.n = 4.0f;
                            TypedArray v2 = p25.v(resources2, theme2, attributeSet2, gl0.c);
                            if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                Paint.Cap cap3 = cap2;
                                String string2 = v2.getString(0);
                                if (string2 != null) {
                                    v28.b = string2;
                                }
                                String string3 = v2.getString(2);
                                if (string3 != null) {
                                    v28.a = l55.i(string3);
                                }
                                v28.f = p25.n(v2, xmlPullParser2, theme2, "fillColor", 1);
                                float f3 = v28.h;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = v2.getFloat(12, f3);
                                }
                                v28.h = f3;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                    i7 = v2.getInt(8, -1);
                                } else {
                                    i7 = -1;
                                }
                                Paint.Cap cap4 = v28.l;
                                if (i7 != 0) {
                                    Paint.Cap cap5 = cap4;
                                    if (i7 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (i7 != 2) {
                                        cap = cap5;
                                    } else {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                } else {
                                    cap = cap3;
                                }
                                v28.l = cap;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                    i8 = v2.getInt(9, -1);
                                } else {
                                    i8 = -1;
                                }
                                Paint.Join join4 = v28.m;
                                if (i8 != 0) {
                                    Paint.Join join5 = join4;
                                    if (i8 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (i8 != 2) {
                                        join = join5;
                                    } else {
                                        join = Paint.Join.BEVEL;
                                    }
                                } else {
                                    join = join3;
                                }
                                v28.m = join;
                                float f4 = v28.n;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = v2.getFloat(10, f4);
                                }
                                v28.n = f4;
                                v28.d = p25.n(v2, xmlPullParser2, theme2, "strokeColor", 3);
                                float f5 = v28.g;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = v2.getFloat(11, f5);
                                }
                                v28.g = f5;
                                float f6 = v28.e;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = v2.getFloat(4, f6);
                                }
                                v28.e = f6;
                                float f7 = v28.j;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = v2.getFloat(6, f7);
                                }
                                v28.j = f7;
                                float f8 = v28.k;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = v2.getFloat(7, f8);
                                }
                                v28.k = f8;
                                float f9 = v28.i;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = v2.getFloat(5, f9);
                                }
                                v28.i = f9;
                                int i12 = v28.c;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i12 = v2.getInt(13, i12);
                                }
                                v28.c = i12;
                            }
                            v2.recycle();
                            t282.b.add(v28);
                            if (v28.getPathName() != null) {
                                jsVar.put(v28.getPathName(), v28);
                            }
                            x283.a = x283.a;
                            i5 = 1;
                            z3 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                v28 v282 = new v28();
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray v3 = p25.v(resources2, theme2, attributeSet2, gl0.d);
                                    String string4 = v3.getString(0);
                                    if (string4 != null) {
                                        v282.b = string4;
                                    }
                                    String string5 = v3.getString(1);
                                    if (string5 != null) {
                                        v282.a = l55.i(string5);
                                    }
                                    if (!p25.r(xmlPullParser2, "fillType")) {
                                        i6 = 0;
                                    } else {
                                        i6 = v3.getInt(2, 0);
                                    }
                                    v282.c = i6;
                                    v3.recycle();
                                }
                                t282.b.add(v282);
                                if (v282.getPathName() != null) {
                                    jsVar.put(v282.getPathName(), v282);
                                }
                                x283.a = x283.a;
                            } else if ("group".equals(name)) {
                                t28 t283 = new t28();
                                TypedArray v4 = p25.v(resources2, theme2, attributeSet2, gl0.b);
                                float f10 = t283.c;
                                if (p25.r(xmlPullParser2, "rotation")) {
                                    f10 = v4.getFloat(5, f10);
                                }
                                t283.c = f10;
                                i5 = 1;
                                t283.d = v4.getFloat(1, t283.d);
                                t283.e = v4.getFloat(2, t283.e);
                                float f11 = t283.f;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = v4.getFloat(3, f11);
                                }
                                t283.f = f11;
                                float f12 = t283.g;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = v4.getFloat(4, f12);
                                }
                                t283.g = f12;
                                float f13 = t283.h;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = v4.getFloat(6, f13);
                                }
                                t283.h = f13;
                                float f14 = t283.i;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = v4.getFloat(7, f14);
                                }
                                t283.i = f14;
                                String string6 = v4.getString(0);
                                if (string6 != null) {
                                    t283.k = string6;
                                }
                                t283.c();
                                v4.recycle();
                                t282.b.add(t283);
                                arrayDeque.push(t283);
                                if (t283.getGroupName() != null) {
                                    jsVar.put(t283.getGroupName(), t283);
                                }
                                x283.a = x283.a;
                            }
                            i5 = 1;
                        }
                        i3 = i5;
                        i4 = 3;
                    } else {
                        i2 = depth;
                        i4 = i9;
                        i3 = 1;
                        if (eventType == i4 && "group".equals(xmlPullParser2.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser2.next();
                    i9 = i4;
                    i11 = i3;
                    depth = i2;
                    i10 = 2;
                }
                if (!z3) {
                    this.y = a(x28.c, x28.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(v.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(v.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.x.e;
    }

    public final boolean isStateful() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        x28 x28 = this.x;
        if (x28 == null) {
            return false;
        }
        w28 w28 = x28.b;
        if (w28.n == null) {
            w28.n = Boolean.valueOf(w28.g.a());
        }
        if (w28.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.x.c;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, x28] */
    public final Drawable mutate() {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.A && super.mutate() == this) {
            x28 x28 = this.x;
            ? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = F;
            if (x28 != null) {
                constantState.a = x28.a;
                w28 w28 = new w28(x28.b);
                constantState.b = w28;
                if (x28.b.e != null) {
                    w28.e = new Paint(x28.b.e);
                }
                if (x28.b.d != null) {
                    constantState.b.d = new Paint(x28.b.d);
                }
                constantState.c = x28.c;
                constantState.d = x28.d;
                constantState.e = x28.e;
            }
            this.x = constantState;
            this.A = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        x28 x28 = this.x;
        ColorStateList colorStateList = x28.c;
        if (colorStateList == null || (mode = x28.d) == null) {
            z2 = false;
        } else {
            this.y = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        w28 w28 = x28.b;
        if (w28.n == null) {
            w28.n = Boolean.valueOf(w28.g.a());
        }
        if (w28.n.booleanValue()) {
            boolean b = x28.b.g.b(iArr);
            x28.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.x.b.getRootAlpha() != i) {
            this.x.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.x.e = z2;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.z = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        x28 x28 = this.x;
        if (x28.c != colorStateList) {
            x28.c = colorStateList;
            this.y = a(colorStateList, x28.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        x28 x28 = this.x;
        if (x28.d != mode) {
            x28.d = mode;
            this.y = a(x28.c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        return super.setVisible(z2, z3);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public z28(x28 x28) {
        this.x = x28;
        this.y = a(x28.c, x28.d);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }
}
