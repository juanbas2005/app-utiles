package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: n21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n21 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public n21(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            return false;
        }
        if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
            return true;
        }
        return false;
    }

    public final void b(g31 g31, m60 m60) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        boolean z7;
        int i6;
        boolean z8;
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        int i8;
        boolean z13;
        boolean z14;
        int i9;
        g31 g312 = g31;
        m60 m602 = m60;
        if (g312 != null) {
            h21 h21 = g312.J;
            h21 h212 = g312.H;
            if (g312.f0 == 8) {
                m602.e = 0;
                m602.f = 0;
                m602.g = 0;
            } else if (g312.S != null) {
                int i10 = m602.a;
                int i11 = m602.b;
                int i12 = m602.c;
                int i13 = m602.d;
                int i14 = this.b + this.c;
                int i15 = this.d;
                View view = g312.e0;
                int B = b81.B(i10);
                if (B == 0) {
                    i = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (B == 1) {
                    i = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
                } else if (B == 2) {
                    i = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
                    if (g312.q == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    int i16 = m602.j;
                    if (i16 == 1 || i16 == 2) {
                        if (view.getMeasuredHeight() == g312.k()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (m602.j == 2 || !z13 || ((z13 && z14) || g312.x())) {
                            i = View.MeasureSpec.makeMeasureSpec(g312.n(), 1073741824);
                        }
                    }
                } else if (B != 3) {
                    i = 0;
                } else {
                    int i17 = this.f;
                    if (h212 != null) {
                        i9 = h212.g;
                    } else {
                        i9 = 0;
                    }
                    if (h21 != null) {
                        i9 += h21.g;
                    }
                    i = ViewGroup.getChildMeasureSpec(i17, i15 + i9, -1);
                }
                int B2 = b81.B(i11);
                if (B2 == 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else if (B2 == 1) {
                    i2 = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
                } else if (B2 == 2) {
                    i2 = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
                    if (g312.r == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i18 = m602.j;
                    if (i18 == 1 || i18 == 2) {
                        if (view.getMeasuredWidth() == g312.n()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (m602.j == 2 || !z11 || ((z11 && z12) || g312.y())) {
                            i2 = View.MeasureSpec.makeMeasureSpec(g312.k(), 1073741824);
                        }
                    }
                } else if (B2 != 3) {
                    i2 = 0;
                } else {
                    int i19 = this.g;
                    if (h212 != null) {
                        i8 = g312.I.g;
                    } else {
                        i8 = 0;
                    }
                    if (h21 != null) {
                        i8 += g312.K.g;
                    }
                    i2 = ViewGroup.getChildMeasureSpec(i19, i14 + i8, -1);
                }
                h31 h31 = (h31) g312.S;
                ConstraintLayout constraintLayout = this.h;
                if (h31 == null || !rc9.I(constraintLayout.E, 256) || view.getMeasuredWidth() != g312.n() || view.getMeasuredWidth() >= h31.n() || view.getMeasuredHeight() != g312.k() || view.getMeasuredHeight() >= h31.k() || view.getBaseline() != g312.Z || g312.w() || !a(g312.F, i, g312.n()) || !a(g312.G, i2, g312.k())) {
                    if (i10 == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i11 == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i11 == 4 || i11 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i10 == 4 || i10 == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z || g312.V <= 0.0f) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z2 || g312.V <= 0.0f) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (view != null) {
                        m21 m21 = (m21) view.getLayoutParams();
                        int i20 = m602.j;
                        if (i20 == 1 || i20 == 2 || !z || g312.q != 0 || !z2 || g312.r != 0) {
                            if (!(view instanceof w68) || !(g312 instanceof ei2)) {
                                view.measure(i, i2);
                            } else {
                                ((w68) view).j((ei2) g312, i, i2);
                            }
                            g312.F = i;
                            g312.G = i2;
                            g312.g = false;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline = view.getBaseline();
                            int i21 = g312.t;
                            if (i21 > 0) {
                                i3 = Math.max(i21, measuredWidth);
                            } else {
                                i3 = measuredWidth;
                            }
                            int i22 = g312.u;
                            if (i22 > 0) {
                                i3 = Math.min(i22, i3);
                            }
                            int i23 = g312.w;
                            if (i23 > 0) {
                                i4 = Math.max(i23, measuredHeight);
                            } else {
                                i4 = measuredHeight;
                            }
                            int i24 = i2;
                            int i25 = g312.x;
                            if (i25 > 0) {
                                i4 = Math.min(i25, i4);
                            }
                            if (!rc9.I(constraintLayout.E, 1)) {
                                if (z5 && z3) {
                                    i3 = (int) ((((float) i4) * g312.V) + 0.5f);
                                } else if (z6 && z4) {
                                    i4 = (int) ((((float) i3) / g312.V) + 0.5f);
                                }
                            }
                            if (measuredWidth == i3 && measuredHeight == i4) {
                                i5 = baseline;
                                i6 = -1;
                                z7 = false;
                            } else {
                                if (measuredWidth != i3) {
                                    i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                }
                                if (measuredHeight != i4) {
                                    i7 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                } else {
                                    i7 = i24;
                                }
                                view.measure(i, i7);
                                g312.F = i;
                                g312.G = i7;
                                z7 = false;
                                g312.g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                i5 = view.getBaseline();
                                i3 = measuredWidth2;
                                i4 = measuredHeight2;
                                i6 = -1;
                            }
                        } else {
                            i6 = -1;
                            z7 = false;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        if (i5 != i6) {
                            z8 = true;
                        } else {
                            z8 = z7;
                        }
                        if (i3 == m602.c && i4 == m602.d) {
                            z9 = z7;
                        } else {
                            z9 = true;
                        }
                        m602.i = z9;
                        if (m21.b0) {
                            z10 = true;
                        } else {
                            z10 = z8;
                        }
                        if (!(!z10 || i5 == -1 || g312.Z == i5)) {
                            m602.i = true;
                        }
                        m602.e = i3;
                        m602.f = i4;
                        m602.h = z10;
                        m602.g = i5;
                        return;
                    }
                    return;
                }
                m602.e = g312.n();
                m602.f = g312.k();
                m602.g = g312.Z;
            }
        }
    }
}
