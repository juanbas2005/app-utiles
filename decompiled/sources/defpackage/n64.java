package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: n64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n64 implements LineHeightSpan {
    public final float A;
    public final int B;
    public int C = Integer.MIN_VALUE;
    public int D = Integer.MIN_VALUE;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;
    public int G;
    public int H;
    public final float w;
    public final int x;
    public final boolean y;
    public final boolean z;

    public n64(float f, int i, boolean z2, boolean z3, float f2, int i2) {
        this.w = f;
        this.x = i;
        this.y = z2;
        this.z = z3;
        this.A = f2;
        this.B = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            zb3.b("topRatio should be in [0..1] range or -1");
        }
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        double ceil;
        int i7;
        int i8;
        int i9 = fontMetricsInt.descent;
        int i10 = fontMetricsInt.ascent;
        if (i9 - i10 > 0) {
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 == this.x) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i11 = this.B;
            boolean z4 = this.z;
            boolean z5 = this.y;
            if (!z2 || !z3 || !z5 || !z4 || i11 == 2) {
                if (this.C == Integer.MIN_VALUE) {
                    int i12 = i9 - i10;
                    int ceil2 = (int) ((float) Math.ceil((double) this.w));
                    int i13 = ceil2 - i12;
                    if (i11 != 1 || i13 > 0) {
                        float f = this.A;
                        if (f == -1.0f) {
                            f = Math.abs((float) fontMetricsInt.ascent) / ((float) (fontMetricsInt.descent - fontMetricsInt.ascent));
                        }
                        if (i13 <= 0) {
                            ceil = Math.ceil((double) (((float) i13) * f));
                        } else {
                            ceil = Math.ceil((double) ((1.0f - f) * ((float) i13)));
                        }
                        int i14 = (int) ((float) ceil);
                        int i15 = fontMetricsInt.descent;
                        int i16 = i14 + i15;
                        this.E = i16;
                        int i17 = i16 - ceil2;
                        this.D = i17;
                        if (i11 == 0 || i13 >= 0) {
                            if (z5) {
                                i17 = fontMetricsInt.ascent;
                            }
                            this.C = i17;
                            if (z4) {
                                i16 = i15;
                            }
                            this.F = i16;
                            this.G = fontMetricsInt.ascent - i17;
                            this.H = i16 - i15;
                        } else if (i11 == 2) {
                            int i18 = fontMetricsInt.ascent;
                            if (z5) {
                                i7 = Math.max(i18, i17);
                            } else {
                                i7 = Math.min(i18, i17);
                            }
                            this.C = i7;
                            int i19 = fontMetricsInt.descent;
                            int i20 = this.E;
                            if (z4) {
                                i8 = Math.min(i19, i20);
                            } else {
                                i8 = Math.max(i19, i20);
                            }
                            this.F = i8;
                            this.G = 0;
                            this.H = 0;
                        }
                    } else {
                        int i21 = fontMetricsInt.ascent;
                        this.D = i21;
                        int i22 = fontMetricsInt.descent;
                        this.E = i22;
                        this.C = i21;
                        this.F = i22;
                        this.G = 0;
                        this.H = 0;
                    }
                }
                if (z2) {
                    i5 = this.C;
                } else {
                    i5 = this.D;
                }
                fontMetricsInt.ascent = i5;
                if (z3) {
                    i6 = this.F;
                } else {
                    i6 = this.E;
                }
                fontMetricsInt.descent = i6;
            }
        }
    }
}
