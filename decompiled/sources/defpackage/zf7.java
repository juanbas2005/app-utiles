package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: zf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zf7 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public xs0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final n64[] o;
    public final Rect p = new Rect();
    public o9 q;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01bf  */
    public zf7(CharSequence charSequence, float f2, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, boolean z, int i4, int i5, int i6, int i7, int i8, int i9, jy3 jy3) {
        Layout.Alignment alignment;
        boolean z2;
        int i10;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout staticLayout;
        boolean z3;
        boolean z4;
        n64[] n64Arr;
        boolean z5;
        int i11;
        boolean z6;
        long j2;
        char c2;
        int i12;
        int i13;
        long j3;
        long j4;
        int i14;
        Layout layout;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z7;
        int i15;
        boolean z8;
        int i16;
        int i17;
        boolean z9;
        int topPadding;
        int i18;
        n64 n64;
        n64 n642;
        boolean z10;
        CharSequence charSequence2 = charSequence;
        float f3 = f2;
        int i19 = i2;
        boolean z11 = z;
        TextPaint textPaint2 = textPaint;
        this.a = textPaint2;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        this.b = truncateAt2;
        this.c = z11;
        int length = charSequence2.length();
        TextDirectionHeuristic b2 = dg7.b(i3);
        Layout.Alignment alignment2 = ic7.a;
        if (i19 == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i19 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i19 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i19 == 3) {
            alignment = ic7.a;
        } else if (i19 != 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = ic7.b;
        }
        if (!(charSequence2 instanceof Spanned) || ((Spanned) charSequence2).nextSpanTransition(-1, length, i60.class) >= length) {
            z2 = false;
        } else {
            z2 = true;
        }
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = jy3.a();
            double d2 = (double) f3;
            int ceil = (int) ((float) Math.ceil(d2));
            if (a2 == null || jy3.c() > f3 || z2) {
                this.l = false;
                i10 = i4;
                textDirectionHeuristic = b2;
                staticLayout = jb5.d(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment, i10, truncateAt, (int) ((float) Math.ceil(d2)), i9, z, i5, i6, i7, i8);
            } else {
                this.l = true;
                if (ceil < 0) {
                    zb3.a("negative width");
                }
                if (ceil < 0) {
                    zb3.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    staticLayout = v4.f(charSequence2, textPaint2, ceil, alignment, a2, z11, truncateAt2, ceil);
                } else {
                    Layout.Alignment alignment3 = alignment;
                    int i20 = ceil;
                    Layout.Alignment alignment4 = alignment3;
                    int i21 = i20;
                    staticLayout = new BoringLayout(charSequence, textPaint, i21, alignment4, 1.0f, 0.0f, a2, z, truncateAt, i20);
                }
                i10 = i4;
                textDirectionHeuristic = b2;
            }
            this.f = staticLayout;
            Trace.endSection();
            int min = Math.min(staticLayout.getLineCount(), i10);
            this.g = min;
            int i22 = min - 1;
            if (min >= i10 && (staticLayout.getEllipsisCount(i22) > 0 || staticLayout.getLineEnd(i22) != charSequence.length())) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.d = z3;
            if (staticLayout.getText() instanceof Spanned) {
                CharSequence text = staticLayout.getText();
                text.getClass();
                Class<n64> cls = n64.class;
                if (b85.l((Spanned) text, cls) || staticLayout.getText().length() <= 0) {
                    CharSequence text2 = staticLayout.getText();
                    text2.getClass();
                    z4 = false;
                    n64Arr = (n64[]) ((Spanned) text2).getSpans(0, staticLayout.getText().length(), cls);
                    this.o = n64Arr;
                    if (n64Arr == null || (n642 = (n64) qs.X0(n64Arr)) == null) {
                        i11 = 2;
                        z5 = z4;
                    } else {
                        if (n642.y) {
                            i11 = 2;
                            if (n642.B == 2) {
                                z10 = true;
                                z5 = z10;
                            }
                        } else {
                            i11 = 2;
                        }
                        z10 = z4;
                        z5 = z10;
                    }
                    if (n64Arr == null || (n64 = (n64) qs.X0(n64Arr)) == null || !n64.z || n64.B != i11) {
                        z6 = z4;
                    } else {
                        z6 = true;
                    }
                    if (z5 || !z6) {
                        long j5 = dg7.b;
                        if (z) {
                            if (this.l) {
                                BoringLayout boringLayout = (BoringLayout) staticLayout;
                                i12 = 33;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    z9 = boringLayout.isFallbackLineSpacingEnabled();
                                    if (z9) {
                                        c2 = ' ';
                                        j2 = 4294967295L;
                                        i13 = 1;
                                    } else {
                                        TextPaint paint = staticLayout.getPaint();
                                        CharSequence text3 = staticLayout.getText();
                                        c2 = ' ';
                                        Rect j6 = ub5.j(paint, text3, staticLayout.getLineStart(z4), staticLayout.getLineEnd(z4));
                                        int lineAscent = staticLayout.getLineAscent(z4);
                                        j2 = 4294967295L;
                                        int i23 = j6.top;
                                        if (i23 < lineAscent) {
                                            topPadding = lineAscent - i23;
                                        } else {
                                            topPadding = staticLayout.getTopPadding();
                                        }
                                        i13 = 1;
                                        j6 = min != 1 ? ub5.j(paint, text3, staticLayout.getLineStart(i22), staticLayout.getLineEnd(i22)) : j6;
                                        int lineDescent = staticLayout.getLineDescent(i22);
                                        int i24 = j6.bottom;
                                        if (i24 > lineDescent) {
                                            i18 = i24 - lineDescent;
                                        } else {
                                            i18 = staticLayout.getBottomPadding();
                                        }
                                        if (!(topPadding == 0 && i18 == 0)) {
                                            j5 = dg7.a(topPadding, i18);
                                        }
                                    }
                                }
                            } else {
                                i12 = 33;
                                StaticLayout staticLayout2 = staticLayout;
                                int i25 = Build.VERSION.SDK_INT;
                                if (i25 >= 33) {
                                    z9 = staticLayout2.isFallbackLineSpacingEnabled();
                                } else if (i25 >= 28) {
                                    z9 = true;
                                }
                                if (z9) {
                                }
                            }
                            z9 = z4;
                            if (z9) {
                            }
                        } else {
                            c2 = ' ';
                            j2 = 4294967295L;
                            i13 = 1;
                            i12 = 33;
                        }
                        if (!z5) {
                            i16 = z4;
                        } else {
                            i16 = (int) (j5 >> c2);
                        }
                        if (!z6) {
                            i17 = z4;
                        } else {
                            i17 = (int) (j5 & j2);
                        }
                        j3 = dg7.a(i16, i17);
                    } else {
                        j3 = dg7.b;
                        c2 = ' ';
                        j2 = 4294967295L;
                        i13 = 1;
                        i12 = 33;
                    }
                    if (n64Arr == null) {
                        int length2 = n64Arr.length;
                        boolean z12 = z4;
                        int i26 = z12;
                        for (int i27 = i26; i27 < length2; i27++) {
                            n64 n643 = n64Arr[i27];
                            int i28 = n643.G;
                            z12 = i28 < 0 ? Math.max(z12, Math.abs(i28)) : z12;
                            int i29 = n643.H;
                            if (i29 < 0) {
                                i26 = Math.max(z12, Math.abs(i29));
                            }
                        }
                        if (z12 == 0 && i26 == 0) {
                            j4 = dg7.b;
                        } else {
                            j4 = dg7.a((int) z12, i26);
                        }
                    } else {
                        j4 = dg7.b;
                    }
                    this.h = Math.max((int) (j3 >> c2), (int) (j4 >> c2));
                    this.i = Math.max((int) (j3 & j2), (int) (j4 & j2));
                    TextPaint textPaint3 = this.a;
                    n64[] n64Arr2 = this.o;
                    i14 = this.g - i13;
                    layout = this.f;
                    if (layout.getLineStart(i14) == layout.getLineEnd(i14) || n64Arr2 == null || n64Arr2.length == 0) {
                        z7 = z4;
                        fontMetricsInt = null;
                    } else {
                        SpannableString spannableString = new SpannableString("​");
                        n64 n644 = (n64) qs.W0(n64Arr2);
                        int length3 = spannableString.length();
                        if (i14 == 0 || !n644.z) {
                            z8 = n644.z;
                        } else {
                            z8 = z4;
                        }
                        spannableString.setSpan(new n64(n644.w, length3, z8, n644.z, n644.A, n644.B), z4 ? 1 : 0, spannableString.length(), i12);
                        z7 = z4;
                        StaticLayout d3 = jb5.d(spannableString, textPaint3, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, cy3.a, Integer.MAX_VALUE, (TextUtils.TruncateAt) null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                        fontMetricsInt = new Paint.FontMetricsInt();
                        fontMetricsInt.ascent = d3.getLineAscent(z7 ? 1 : 0);
                        fontMetricsInt.descent = d3.getLineDescent(z7);
                        fontMetricsInt.top = d3.getLineTop(z7);
                        fontMetricsInt.bottom = d3.getLineBottom(z7);
                    }
                    if (fontMetricsInt == null) {
                        i15 = fontMetricsInt.bottom - ((int) h(i22));
                    } else {
                        i15 = z7;
                    }
                    this.n = i15;
                    this.m = fontMetricsInt;
                    Layout layout2 = this.f;
                    this.j = rj1.r(layout2, i22, layout2.getPaint());
                    Layout layout3 = this.f;
                    this.k = rj1.s(layout3, i22, layout3.getPaint());
                }
            }
            n64Arr = null;
            z4 = false;
            this.o = n64Arr;
            if (n64Arr == null || (n642 = (n64) qs.X0(n64Arr)) == null) {
            }
            if (n64Arr == null || (n64 = (n64) qs.X0(n64Arr)) == null || !n64.z || n64.B != i11) {
            }
            if (z5) {
            }
            long j52 = dg7.b;
            if (z) {
            }
            if (!z5) {
            }
            if (!z6) {
            }
            j3 = dg7.a(i16, i17);
            if (n64Arr == null) {
            }
            this.h = Math.max((int) (j3 >> c2), (int) (j4 >> c2));
            this.i = Math.max((int) (j3 & j2), (int) (j4 & j2));
            TextPaint textPaint32 = this.a;
            n64[] n64Arr22 = this.o;
            i14 = this.g - i13;
            layout = this.f;
            if (layout.getLineStart(i14) == layout.getLineEnd(i14)) {
            }
            z7 = z4;
            fontMetricsInt = null;
            if (fontMetricsInt == null) {
            }
            this.n = i15;
            this.m = fontMetricsInt;
            Layout layout22 = this.f;
            this.j = rj1.r(layout22, i22, layout22.getPaint());
            Layout layout32 = this.f;
            this.k = rj1.s(layout32, i22, layout32.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        int i2;
        boolean z = this.d;
        Layout layout = this.f;
        if (z) {
            i2 = layout.getLineBottom(this.g - 1);
        } else {
            i2 = layout.getHeight();
        }
        return i2 + this.h + this.i + this.n;
    }

    public final float b(int i2) {
        if (i2 == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final o9 c() {
        o9 o9Var = this.q;
        if (o9Var != null) {
            return o9Var;
        }
        o9 o9Var2 = new o9(this.f);
        this.q = o9Var2;
        return o9Var2;
    }

    public final float d(int i2) {
        float f2;
        Paint.FontMetricsInt fontMetricsInt;
        float f3 = (float) this.h;
        if (i2 != this.g - 1 || (fontMetricsInt = this.m) == null) {
            f2 = (float) this.f.getLineBaseline(i2);
        } else {
            f2 = i(i2) - ((float) fontMetricsInt.ascent);
        }
        return f3 + f2;
    }

    public final float e(int i2) {
        int i3;
        Paint.FontMetricsInt fontMetricsInt;
        int i4 = this.g;
        int i5 = i4 - 1;
        Layout layout = this.f;
        if (i2 == i5 && (fontMetricsInt = this.m) != null) {
            return ((float) layout.getLineBottom(i2 - 1)) + ((float) fontMetricsInt.bottom);
        }
        float lineBottom = ((float) this.h) + ((float) layout.getLineBottom(i2));
        if (i2 == i4 - 1) {
            i3 = this.i;
        } else {
            i3 = 0;
        }
        return lineBottom + ((float) i3);
    }

    public final int f(int i2) {
        ThreadLocal threadLocal = dg7.a;
        Layout layout = this.f;
        if (layout.getEllipsisCount(i2) <= 0 || this.b != TextUtils.TruncateAt.END) {
            return layout.getLineEnd(i2);
        }
        return layout.getText().length();
    }

    public final int g(int i2) {
        int i3 = this.g;
        if (i3 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i2);
        int i4 = i3 - 1;
        if (lineForOffset > i4) {
            return i4;
        }
        return lineForOffset;
    }

    public final float h(int i2) {
        return e(i2) - i(i2);
    }

    public final float i(int i2) {
        int i3;
        float lineTop = (float) this.f.getLineTop(i2);
        if (i2 == 0) {
            i3 = 0;
        } else {
            i3 = this.h;
        }
        return lineTop + ((float) i3);
    }

    public final float j(int i2, boolean z) {
        return b(g(i2)) + c().z(i2, true, z);
    }

    public final float k(int i2, boolean z) {
        return b(g(i2)) + c().z(i2, false, z);
    }

    public final xs0 l() {
        xs0 xs0 = this.e;
        if (xs0 != null) {
            return xs0;
        }
        Layout layout = this.f;
        xs0 xs02 = new xs0(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = xs02;
        return xs02;
    }
}
