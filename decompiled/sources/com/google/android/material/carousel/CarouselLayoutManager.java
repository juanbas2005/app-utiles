package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class CarouselLayoutManager extends xy5 implements hz5 {
    public final pj p;
    public xl0 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new vl0();
        this.r = new tl0(this);
        this.p = new pj(4);
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.b);
            obtainStyledAttributes.getInt(0, 0);
            m0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final float B0(float f, float f2) {
        if (D0()) {
            return f - f2;
        }
        return f + f2;
    }

    public final boolean C0() {
        if (this.q.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        if (!C0() || C() != 1) {
            return false;
        }
        return true;
    }

    public final void E0(int i) {
        wl0 wl0;
        if (i == 0 || i == 1) {
            c((String) null);
            xl0 xl0 = this.q;
            if (xl0 == null || i != xl0.a) {
                if (i == 0) {
                    wl0 = new wl0(this, 1);
                } else if (i == 1) {
                    wl0 = new wl0(this, 0);
                } else {
                    h.q("invalid orientation");
                    return;
                }
                this.q = wl0;
                m0();
                return;
            }
            return;
        }
        h.q(hl6.k(i, "invalid orientation:"));
    }

    public final boolean L() {
        return true;
    }

    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        pj pjVar = this.p;
        float f = pjVar.w;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        pjVar.w = f;
        float f2 = pjVar.x;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        pjVar.x = f2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r7 == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (D0() != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r7 == 1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (D0() != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    public final View T(View view, int i, dz5 dz5, iz5 iz5) {
        boolean z;
        if (v() != 0) {
            int i2 = this.q.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                                }
                            } else if (i2 == 0) {
                            }
                        }
                    } else if (i2 == 0) {
                    }
                    z = true;
                    if (!z) {
                        int i3 = 0;
                        if (z) {
                            if (xy5.H(view) != 0) {
                                int H = xy5.H(u(0)) - 1;
                                if (H < 0 || H >= B()) {
                                    if (D0()) {
                                        i3 = v() - 1;
                                    }
                                    return u(i3);
                                }
                                this.q.d();
                                throw null;
                            }
                        } else if (xy5.H(view) != B() - 1) {
                            int H2 = xy5.H(u(v() - 1)) + 1;
                            if (H2 < 0 || H2 >= B()) {
                                if (!D0()) {
                                    i3 = v() - 1;
                                }
                                return u(i3);
                            }
                            this.q.d();
                            throw null;
                        }
                    }
                }
                z = true;
                if (!z) {
                }
            }
            z = true;
            if (!z) {
            }
        }
        return null;
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(xy5.H(u(0)));
            accessibilityEvent.setToIndex(xy5.H(u(v() - 1)));
        }
    }

    public final void X(int i, int i2) {
        B();
    }

    public final void Y() {
        B();
    }

    public final PointF a(int i) {
        return null;
    }

    public final void a0(int i, int i2) {
        B();
    }

    public final void c0(dz5 dz5, iz5 iz5) {
        int i;
        if (iz5.b() > 0) {
            if (C0()) {
                i = this.n;
            } else {
                i = this.o;
            }
            if (((float) i) > 0.0f) {
                D0();
                dz5.d(0);
                h.s("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(dz5);
    }

    public final boolean d() {
        return C0();
    }

    public final void d0(iz5 iz5) {
        if (v() != 0) {
            xy5.H(u(0));
        }
    }

    public final boolean e() {
        return !C0();
    }

    public final int j(iz5 iz5) {
        v();
        return 0;
    }

    public final int k(iz5 iz5) {
        return 0;
    }

    public final int l(iz5 iz5) {
        return 0;
    }

    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    public final int m(iz5 iz5) {
        v();
        return 0;
    }

    public final int n(iz5 iz5) {
        return 0;
    }

    public final int n0(int i, dz5 dz5, iz5 iz5) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        dz5.d(0);
        h.s("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    public final int o(iz5 iz5) {
        return 0;
    }

    public final int p0(int i, dz5 dz5, iz5 iz5) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        dz5.d(0);
        h.s("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    public final yy5 r() {
        return new yy5(-2, -2);
    }

    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    public final void y0(RecyclerView recyclerView, int i) {
        ul0 ul0 = new ul0(this, recyclerView.getContext());
        ul0.a = i;
        z0(ul0);
    }

    public final void o0(int i) {
    }

    public CarouselLayoutManager() {
        pj pjVar = new pj(4);
        new vl0();
        this.r = new tl0(this);
        this.p = pjVar;
        m0();
        E0(0);
    }
}
