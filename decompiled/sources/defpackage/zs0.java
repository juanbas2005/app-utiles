package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: zs0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zs0 {
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public final boolean E = true;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;
    public final TextInputLayout a;
    public float a0;
    public float b;
    public float b0;
    public final Rect c;
    public float c0;
    public final Rect d;
    public CharSequence d0;
    public final RectF e;
    public int e0 = 1;
    public int f = 16;
    public int f0 = 1;
    public int g = 16;
    public final float g0 = 1.0f;
    public float h = 15.0f;
    public final int h0 = 1;
    public float i = 15.0f;
    public int i0 = -1;
    public ColorStateList j;
    public int j0 = -1;
    public ColorStateList k;
    public boolean k0;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public hk0 z;

    public zs0(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f2, int i2, int i3) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), Math.round((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), Math.round((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), Math.round((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    public static float h(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return jl.a(f2, f3, f4);
    }

    public final void b() {
        float f2 = this.b;
        Rect rect = this.c;
        Rect rect2 = this.d;
        float h2 = h((float) rect.left, (float) rect2.left, f2, this.Q);
        RectF rectF = this.e;
        rectF.left = h2;
        rectF.top = h(this.m, this.n, f2, this.Q);
        rectF.right = h((float) rect.right, (float) rect2.right, f2, this.Q);
        rectF.bottom = h((float) rect.bottom, (float) rect2.bottom, f2, this.Q);
        this.q = h(this.o, this.p, f2, this.Q);
        this.r = h(this.m, this.n, f2, this.Q);
        d(f2, false);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.postInvalidateOnAnimation();
        sb2 sb2 = jl.b;
        this.b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f2, sb2);
        textInputLayout.postInvalidateOnAnimation();
        this.c0 = h(1.0f, 0.0f, f2, sb2);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f2, g(colorStateList2), g(this.k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f3 = this.W;
        float f4 = this.X;
        if (f3 != f4) {
            textPaint.setLetterSpacing(h(f4, f3, f2, sb2));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.H = jl.a(0.0f, this.S, f2);
        this.I = jl.a(0.0f, this.T, f2);
        this.J = jl.a(0.0f, this.U, f2);
        int a2 = a(f2, 0, g(this.V));
        this.K = a2;
        textPaint.setShadowLayer(this.H, this.I, this.J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        v70 v70;
        boolean z2 = true;
        if (this.a.getLayoutDirection() != 1) {
            z2 = false;
        }
        if (!this.E) {
            return z2;
        }
        if (z2) {
            v70 = vd7.d;
        } else {
            v70 = vd7.c;
        }
        return v70.c(charSequence.length(), charSequence);
    }

    public final void d(float f2, boolean z2) {
        Typeface typeface;
        float f3;
        float f4;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        float f5;
        float f6 = f2;
        if (this.B != null) {
            float width = (float) this.d.width();
            float width2 = (float) this.c.width();
            float f7 = 1.0f;
            if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
                if (o()) {
                    f4 = this.i;
                } else {
                    f4 = this.h;
                }
                if (o()) {
                    f3 = this.W;
                } else {
                    f3 = this.X;
                }
                if (o()) {
                    f5 = 1.0f;
                } else {
                    f5 = h(this.h, this.i, f6, this.R) / this.h;
                }
                this.F = f5;
                if (!o()) {
                    width = width2;
                }
                typeface = this.s;
                width2 = width;
            } else {
                f4 = this.h;
                float f8 = this.X;
                typeface = this.v;
                if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.h, this.i, f6, this.R) / this.h;
                }
                float f9 = this.i / this.h;
                float f10 = width2 * f9;
                if (!z2 && f10 > width && o()) {
                    width2 = Math.min(width / f9, width2);
                }
                f3 = f8;
            }
            if (f6 < 0.5f) {
                i2 = this.e0;
            } else {
                i2 = this.f0;
            }
            int i4 = (width2 > 0.0f ? 1 : (width2 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.O;
            boolean z9 = false;
            if (i4 > 0) {
                if (this.G != f4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.Y != f3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.y != typeface) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                StaticLayout staticLayout = this.Z;
                if (staticLayout == null || width2 == ((float) staticLayout.getWidth())) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (this.L != i2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z3 || z4 || z6 || z5 || z7 || this.N) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.G = f4;
                this.Y = f3;
                this.y = typeface;
                this.N = false;
                this.L = i2;
                if (this.F != 1.0f) {
                    z9 = true;
                }
                textPaint.setLinearText(z9);
                z9 = z8;
            }
            if (this.C == null || z9) {
                textPaint.setTextSize(this.G);
                textPaint.setTypeface(this.y);
                textPaint.setLetterSpacing(this.Y);
                boolean c2 = c(this.B);
                this.D = c2;
                if ((this.e0 > 1 || this.f0 > 1) && !c2) {
                    i3 = i2;
                } else {
                    i3 = 1;
                }
                CharSequence charSequence = this.B;
                if (!o()) {
                    f7 = this.F;
                }
                StaticLayout e2 = e(i3, textPaint, charSequence, width2 * f7, this.D);
                this.Z = e2;
                this.C = e2.getText();
            }
        }
    }

    public final StaticLayout e(int i2, TextPaint textPaint, CharSequence charSequence, float f2, boolean z2) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        if (i2 == 1) {
            try {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
            }
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z3 = this.D;
                if (absoluteGravity != 5) {
                    if (z3) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                } else if (z3) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        r37 r37 = new r37(charSequence, textPaint, (int) f2);
        r37.l = this.A;
        r37.k = z2;
        r37.e = alignment;
        r37.j = false;
        r37.f = i2;
        float f3 = this.g0;
        r37.g = 0.0f;
        r37.h = f3;
        r37.i = this.h0;
        r37.m = null;
        staticLayout = r37.a();
        staticLayout.getClass();
        return staticLayout;
    }

    public final float f() {
        int i2 = this.i0;
        if (i2 != -1) {
            return (float) i2;
        }
        float f2 = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f2);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.u;
            if (typeface != null) {
                this.t = c35.n(configuration, typeface);
            }
            Typeface typeface2 = this.x;
            if (typeface2 != null) {
                this.w = c35.n(configuration, typeface2);
            }
            Typeface typeface3 = this.t;
            if (typeface3 == null) {
                typeface3 = this.u;
            }
            this.s = typeface3;
            Typeface typeface4 = this.w;
            if (typeface4 == null) {
                typeface4 = this.x;
            }
            this.v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z2) {
        float f2;
        float f3;
        int i2;
        TextInputLayout textInputLayout = this.a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z2) {
            d(1.0f, z2);
            CharSequence charSequence = this.C;
            TextPaint textPaint = this.O;
            if (!(charSequence == null || this.Z == null)) {
                boolean o2 = o();
                CharSequence charSequence2 = this.C;
                if (o2) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint, (float) this.Z.getWidth(), this.A);
                }
                this.d0 = charSequence2;
            }
            CharSequence charSequence3 = this.d0;
            float f4 = 0.0f;
            if (charSequence3 != null) {
                this.a0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.a0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.D ? 1 : 0);
            int i3 = absoluteGravity & 112;
            Rect rect = this.d;
            if (i3 == 48) {
                this.n = (float) rect.top;
            } else if (i3 != 80) {
                this.n = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.n = textPaint.ascent() + ((float) rect.bottom);
            }
            int i4 = absoluteGravity & 8388615;
            if (i4 == 1) {
                this.p = ((float) rect.centerX()) - (this.a0 / 2.0f);
            } else if (i4 != 5) {
                this.p = (float) rect.left;
            } else {
                this.p = ((float) rect.right) - this.a0;
            }
            if (this.a0 <= ((float) rect.width())) {
                float f5 = this.p;
                float max = Math.max(0.0f, ((float) rect.left) - f5) + f5;
                this.p = max;
                this.p = Math.min(0.0f, ((float) rect.right) - (this.a0 + max)) + max;
            }
            float f6 = this.i;
            TextPaint textPaint2 = this.P;
            textPaint2.setTextSize(f6);
            textPaint2.setTypeface(this.s);
            textPaint2.setLetterSpacing(this.W);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= ((float) rect.height())) {
                float f7 = this.n;
                float max2 = Math.max(0.0f, ((float) rect.top) - f7) + f7;
                this.n = max2;
                this.n = Math.min(0.0f, ((float) rect.bottom) - (f() + max2)) + max2;
            }
            d(0.0f, z2);
            StaticLayout staticLayout = this.Z;
            if (staticLayout != null) {
                f2 = (float) staticLayout.getHeight();
            } else {
                f2 = 0.0f;
            }
            StaticLayout staticLayout2 = this.Z;
            if (staticLayout2 == null || this.e0 <= 1) {
                CharSequence charSequence4 = this.C;
                if (charSequence4 != null) {
                    f3 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = (float) staticLayout2.getWidth();
            }
            StaticLayout staticLayout3 = this.Z;
            if (staticLayout3 != null) {
                i2 = staticLayout3.getLineCount();
            } else {
                i2 = 0;
            }
            this.l = i2;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0);
            int i5 = absoluteGravity2 & 112;
            Rect rect2 = this.c;
            if (i5 == 48) {
                this.m = (float) rect2.top;
            } else if (i5 != 80) {
                this.m = ((float) rect2.centerY()) - (f2 / 2.0f);
            } else {
                float f8 = ((float) rect2.bottom) - f2;
                if (this.k0) {
                    f4 = textPaint.descent();
                }
                this.m = f8 + f4;
            }
            int i6 = absoluteGravity2 & 8388615;
            if (i6 == 1) {
                this.o = ((float) rect2.centerX()) - (f3 / 2.0f);
            } else if (i6 != 5) {
                this.o = (float) rect2.left;
            } else {
                this.o = ((float) rect2.right) - f3;
            }
            d(this.b, false);
            textInputLayout.postInvalidateOnAnimation();
            b();
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.k != colorStateList || this.j != colorStateList) {
            this.k = colorStateList;
            this.j = colorStateList;
            j(false);
        }
    }

    public final boolean l(Typeface typeface) {
        hk0 hk0 = this.z;
        if (hk0 != null) {
            hk0.e = true;
        }
        if (this.u == typeface) {
            return false;
        }
        this.u = typeface;
        Typeface n2 = c35.n(this.a.getContext().getResources().getConfiguration(), typeface);
        this.t = n2;
        if (n2 == null) {
            n2 = this.u;
        }
        this.s = n2;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r3 > 1.0f) goto L_0x0005;
     */
    public final void m(float f2) {
        float f3 = 0.0f;
        if (f2 >= 0.0f) {
            f3 = 1.0f;
        }
        f2 = f3;
        if (f2 != this.b) {
            this.b = f2;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z2;
        boolean l2 = l(typeface);
        if (this.x != typeface) {
            this.x = typeface;
            Typeface n2 = c35.n(this.a.getContext().getResources().getConfiguration(), typeface);
            this.w = n2;
            if (n2 == null) {
                n2 = this.x;
            }
            this.v = n2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (l2 || z2) {
            j(false);
        }
    }

    public final boolean o() {
        if (this.f0 == 1) {
            return true;
        }
        return false;
    }
}
