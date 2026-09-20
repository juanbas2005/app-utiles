package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public final hv2 K = new hv2(2);
    public final Rect L = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1(xy5.I(context, attributeSet, i, i2).b);
    }

    public final boolean A0() {
        if (this.z != null || this.E) {
            return false;
        }
        return true;
    }

    public final void C0(iz5 iz5, u64 u64, tt2 tt2) {
        int i = this.F;
        for (int i2 = 0; i2 < this.F && (r3 = u64.d) >= 0 && r3 < iz5.b() && i > 0; i2++) {
            tt2.a(u64.d, Math.max(0, u64.g));
            this.K.getClass();
            i--;
            u64.d += u64.e;
        }
    }

    public final int J(dz5 dz5, iz5 iz5) {
        if (this.p == 0) {
            return this.F;
        }
        if (iz5.b() < 1) {
            return 0;
        }
        return i1(iz5.b() - 1, dz5, iz5) + 1;
    }

    public final View O0(dz5 dz5, iz5 iz5, boolean z, boolean z2) {
        int i;
        int i2;
        int v = v();
        int i3 = 1;
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
        }
        int b = iz5.b();
        H0();
        int m = this.r.m();
        int i4 = this.r.i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int H2 = xy5.H(u);
            if (H2 >= 0 && H2 < b && j1(H2, dz5, iz5) == 0) {
                if (((yy5) u.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = u;
                    }
                } else if (this.r.g(u) < i4 && this.r.d(u) >= m) {
                    return u;
                } else {
                    if (view == null) {
                        view = u;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e2, code lost:
        if (r13 == r10) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
        if (r13 == r9) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (((java.util.ArrayList) r0.a.z).contains(r3) != false) goto L_0x0023;
     */
    public final View T(View view, int i, dz5 dz5, iz5 iz5) {
        View view2;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View view3;
        int i5;
        View view4;
        int i6;
        boolean z3;
        boolean z4;
        dz5 dz52 = dz5;
        iz5 iz52 = iz5;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            View view5 = view;
        } else {
            view2 = recyclerView.A(view);
            if (view2 != null) {
            }
        }
        view2 = null;
        if (view2 != null) {
            qx2 qx2 = (qx2) view2.getLayoutParams();
            int i7 = qx2.e;
            int i8 = qx2.f + i7;
            if (super.T(view, i, dz5, iz5) != null) {
                if (G0(i) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.u) {
                    i4 = v() - 1;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i3 = v();
                    i2 = 1;
                    i4 = 0;
                }
                if (this.p != 1 || !T0()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i1 = i1(i4, dz52, iz52);
                View view6 = null;
                int i9 = -1;
                int i10 = -1;
                int i11 = 0;
                int i12 = i4;
                int i13 = 0;
                View view7 = null;
                while (true) {
                    view3 = view7;
                    if (i12 == i3) {
                        break;
                    }
                    int i14 = i1(i12, dz52, iz52);
                    View u = u(i12);
                    if (u == view2) {
                        break;
                    }
                    if (!u.hasFocusable() || i14 == i1) {
                        qx2 qx22 = (qx2) u.getLayoutParams();
                        int i15 = qx22.e;
                        view4 = view2;
                        int i16 = qx22.f + i15;
                        if (u.hasFocusable() && i15 == i7 && i16 == i8) {
                            return u;
                        }
                        if ((!u.hasFocusable() || view6 != null) && (u.hasFocusable() || view3 != null)) {
                            i5 = i3;
                            int min = Math.min(i16, i8) - Math.max(i15, i7);
                            if (u.hasFocusable()) {
                                if (min <= i11) {
                                    if (min == i11) {
                                        if (i15 > i10) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                }
                                i6 = i11;
                            } else if (view6 == null) {
                                i6 = i11;
                                if (!this.c.A(u) || !this.d.A(u)) {
                                    if (min <= i13) {
                                        if (min == i13) {
                                            if (i15 > i9) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        }
                                    }
                                }
                            }
                            i6 = i11;
                        } else {
                            i6 = i11;
                            i5 = i3;
                        }
                        boolean hasFocusable = u.hasFocusable();
                        int i17 = qx22.e;
                        if (hasFocusable) {
                            i11 = Math.min(i16, i8) - Math.max(i15, i7);
                            view6 = u;
                            i10 = i17;
                            view7 = view3;
                        } else {
                            i13 = Math.min(i16, i8) - Math.max(i15, i7);
                            i9 = i17;
                            i11 = i6;
                            view7 = u;
                        }
                        i12 += i2;
                        dz52 = dz5;
                        iz52 = iz5;
                        view2 = view4;
                        i3 = i5;
                    } else if (view6 != null) {
                        break;
                    } else {
                        view4 = view2;
                        i6 = i11;
                        i5 = i3;
                    }
                    view7 = view3;
                    i11 = i6;
                    i12 += i2;
                    dz52 = dz5;
                    iz52 = iz5;
                    view2 = view4;
                    i3 = i5;
                }
                if (view6 != null) {
                    return view6;
                }
                return view3;
            }
        }
        return null;
    }

    public final void U0(dz5 dz5, iz5 iz5, u64 u64, t64 t64) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        View b;
        dz5 dz52 = dz5;
        iz5 iz52 = iz5;
        u64 u642 = u64;
        t64 t642 = t64;
        int l = this.r.l();
        if (l != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (v() > 0) {
            i = this.G[this.F];
        } else {
            i = 0;
        }
        if (z) {
            n1();
        }
        if (u642.e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i10 = this.F;
        if (!z2) {
            i10 = j1(u642.d, dz52, iz52) + k1(u642.d, dz52, iz52);
        }
        int i11 = 0;
        while (i11 < this.F && (r14 = u642.d) >= 0 && r14 < iz52.b() && i10 > 0) {
            int i12 = u642.d;
            int k1 = k1(i12, dz52, iz52);
            if (k1 <= this.F) {
                i10 -= k1;
                if (i10 < 0 || (b = u642.b(dz52)) == null) {
                    break;
                }
                this.H[i11] = b;
                i11++;
            } else {
                h.q(hl6.n(pb4.p("Item at position ", i12, " requires ", k1, " spans but GridLayoutManager has only "), this.F, " spans."));
                return;
            }
        }
        if (i11 == 0) {
            t642.b = true;
            return;
        }
        if (z2) {
            i2 = 1;
            i3 = i11;
            i4 = 0;
        } else {
            i4 = i11 - 1;
            i3 = -1;
            i2 = -1;
        }
        int i13 = 0;
        while (i4 != i3) {
            View view = this.H[i4];
            qx2 qx2 = (qx2) view.getLayoutParams();
            int k12 = k1(xy5.H(view), dz52, iz52);
            qx2.f = k12;
            qx2.e = i13;
            i13 += k12;
            i4 += i2;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.H[i15];
            if (u642.k != null) {
                z3 = false;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                z3 = false;
                b(view2, -1, false);
            } else {
                z3 = false;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(z3 ? 1 : 0, z3, z3, z3);
            } else {
                rect.set(recyclerView.J(view2));
            }
            l1(view2, l, z3);
            int e = this.r.e(view2);
            if (e > i14) {
                i14 = e;
            }
            float f2 = (((float) this.r.f(view2)) * 1.0f) / ((float) ((qx2) view2.getLayoutParams()).f);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            f1(Math.max(Math.round(f * ((float) this.F)), i));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.H[i16];
                l1(view3, 1073741824, true);
                int e2 = this.r.e(view3);
                if (e2 > i14) {
                    i14 = e2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.H[i17];
            if (this.r.e(view4) != i14) {
                qx2 qx22 = (qx2) view4.getLayoutParams();
                Rect rect2 = qx22.b;
                int i18 = rect2.top + rect2.bottom + qx22.topMargin + qx22.bottomMargin;
                int i19 = rect2.left + rect2.right + qx22.leftMargin + qx22.rightMargin;
                int h1 = h1(qx22.e, qx22.f);
                if (this.p == 1) {
                    i9 = xy5.w(false, h1, 1073741824, i19, qx22.width);
                    i8 = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    i8 = xy5.w(false, h1, 1073741824, i18, qx22.height);
                    i9 = makeMeasureSpec;
                }
                if (x0(view4, i9, i8, (yy5) view4.getLayoutParams())) {
                    view4.measure(i9, i8);
                }
            }
        }
        t642.a = i14;
        int i20 = this.p;
        int i21 = u642.f;
        int i22 = u642.b;
        if (i20 != 1) {
            if (i21 == -1) {
                i7 = i22 - i14;
                i5 = 0;
                i6 = i22;
            } else {
                i6 = i22 + i14;
                i5 = 0;
                i7 = i22;
            }
            i22 = i5;
        } else if (i21 == -1) {
            i5 = i22 - i14;
            i7 = 0;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = i22;
            i22 += i14;
            i7 = 0;
        }
        int i23 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i23 < i11) {
                View view5 = viewArr[i23];
                qx2 qx23 = (qx2) view5.getLayoutParams();
                if (this.p != 1) {
                    i5 = G() + this.G[qx23.e];
                    i22 = this.r.f(view5) + i5;
                } else if (T0()) {
                    int E2 = E() + this.G[this.F - qx23.e];
                    i6 = E2;
                    i7 = E2 - this.r.f(view5);
                } else {
                    i7 = E() + this.G[qx23.e];
                    i6 = this.r.f(view5) + i7;
                }
                xy5.N(view5, i7, i5, i6, i22);
                if (qx23.a.h() || qx23.a.k()) {
                    t642.c = true;
                }
                t642.d = view5.hasFocusable() | t642.d;
                i23++;
            } else {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
        }
    }

    public final void V(dz5 dz5, iz5 iz5, View view, c5 c5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof qx2)) {
            W(view, c5Var);
            return;
        }
        qx2 qx2 = (qx2) layoutParams;
        int i1 = i1(qx2.a.b(), dz5, iz5);
        int i = this.p;
        int i2 = qx2.e;
        int i3 = qx2.f;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i1, 1, false, false));
            return;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, 1, i2, i3, false, false));
    }

    public final void V0(dz5 dz5, iz5 iz5, s64 s64, int i) {
        boolean z;
        n1();
        if (iz5.b() > 0 && !iz5.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int j1 = j1(s64.b, dz5, iz5);
            if (z) {
                while (j1 > 0) {
                    int i2 = s64.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    s64.b = i3;
                    j1 = j1(i3, dz5, iz5);
                }
            } else {
                int b = iz5.b() - 1;
                int i4 = s64.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int j12 = j1(i5, dz5, iz5);
                    if (j12 <= j1) {
                        break;
                    }
                    i4 = i5;
                    j1 = j12;
                }
                s64.b = i4;
            }
        }
        g1();
    }

    public final void X(int i, int i2) {
        hv2 hv2 = this.K;
        hv2.S0();
        ((SparseIntArray) hv2.x).clear();
    }

    public final void Y() {
        hv2 hv2 = this.K;
        hv2.S0();
        ((SparseIntArray) hv2.x).clear();
    }

    public final void Z(int i, int i2) {
        hv2 hv2 = this.K;
        hv2.S0();
        ((SparseIntArray) hv2.x).clear();
    }

    public final void a0(int i, int i2) {
        hv2 hv2 = this.K;
        hv2.S0();
        ((SparseIntArray) hv2.x).clear();
    }

    public final void b0(int i, int i2) {
        hv2 hv2 = this.K;
        hv2.S0();
        ((SparseIntArray) hv2.x).clear();
    }

    public final void b1(boolean z) {
        if (!z) {
            super.b1(false);
        } else {
            kj6.n("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    public final void c0(dz5 dz5, iz5 iz5) {
        boolean z = iz5.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                qx2 qx2 = (qx2) u(i).getLayoutParams();
                int b = qx2.a.b();
                sparseIntArray2.put(b, qx2.f);
                sparseIntArray.put(b, qx2.e);
            }
        }
        super.c0(dz5, iz5);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void d0(iz5 iz5) {
        super.d0(iz5);
        this.E = false;
    }

    public final boolean f(yy5 yy5) {
        return yy5 instanceof qx2;
    }

    public final void f1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i, int i2) {
        if (this.p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int i1(int i, dz5 dz5, iz5 iz5) {
        boolean z = iz5.g;
        hv2 hv2 = this.K;
        if (!z) {
            int i2 = this.F;
            hv2.getClass();
            return hv2.P0(i, i2);
        }
        int b = dz5.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        int i3 = this.F;
        hv2.getClass();
        return hv2.P0(b, i3);
    }

    public final int j1(int i, dz5 dz5, iz5 iz5) {
        boolean z = iz5.g;
        hv2 hv2 = this.K;
        if (!z) {
            int i2 = this.F;
            hv2.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = dz5.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        int i4 = this.F;
        hv2.getClass();
        return b % i4;
    }

    public final int k(iz5 iz5) {
        return E0(iz5);
    }

    public final int k1(int i, dz5 dz5, iz5 iz5) {
        boolean z = iz5.g;
        hv2 hv2 = this.K;
        if (!z) {
            hv2.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (dz5.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        hv2.getClass();
        return 1;
    }

    public final int l(iz5 iz5) {
        return F0(iz5);
    }

    public final void l1(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        qx2 qx2 = (qx2) view.getLayoutParams();
        Rect rect = qx2.b;
        int i4 = rect.top + rect.bottom + qx2.topMargin + qx2.bottomMargin;
        int i5 = rect.left + rect.right + qx2.leftMargin + qx2.rightMargin;
        int h1 = h1(qx2.e, qx2.f);
        if (this.p == 1) {
            i2 = xy5.w(false, h1, i, i5, qx2.width);
            i3 = xy5.w(true, this.r.n(), this.m, i4, qx2.height);
        } else {
            int w = xy5.w(false, h1, i, i4, qx2.height);
            int w2 = xy5.w(true, this.r.n(), this.l, i5, qx2.width);
            i3 = w;
            i2 = w2;
        }
        yy5 yy5 = (yy5) view.getLayoutParams();
        if (z) {
            z2 = x0(view, i2, i3, yy5);
        } else {
            z2 = v0(view, i2, i3, yy5);
        }
        if (z2) {
            view.measure(i2, i3);
        }
    }

    public final void m1(int i) {
        if (i != this.F) {
            this.E = true;
            if (i >= 1) {
                this.F = i;
                this.K.S0();
                m0();
                return;
            }
            h.q(hl6.k(i, "Span count should be at least 1. Provided "));
        }
    }

    public final int n(iz5 iz5) {
        return E0(iz5);
    }

    public final int n0(int i, dz5 dz5, iz5 iz5) {
        n1();
        g1();
        return super.n0(i, dz5, iz5);
    }

    public final void n1() {
        int D;
        int G2;
        if (this.p == 1) {
            D = this.n - F();
            G2 = E();
        } else {
            D = this.o - D();
            G2 = G();
        }
        f1(D - G2);
    }

    public final int o(iz5 iz5) {
        return F0(iz5);
    }

    public final int p0(int i, dz5 dz5, iz5 iz5) {
        n1();
        g1();
        return super.p0(i, dz5, iz5);
    }

    public final yy5 r() {
        if (this.p == 0) {
            return new qx2(-2, -1);
        }
        return new qx2(-1, -2);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [yy5, qx2] */
    public final yy5 s(Context context, AttributeSet attributeSet) {
        ? yy5 = new yy5(context, attributeSet);
        yy5.e = -1;
        yy5.f = 0;
        return yy5;
    }

    public final void s0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.G == null) {
            super.s0(rect, i, i2);
        }
        int F2 = F() + E();
        int D = D() + G();
        if (this.p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = e58.a;
            i4 = xy5.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            i3 = xy5.g(i, iArr[iArr.length - 1] + F2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = e58.a;
            i3 = xy5.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            i4 = xy5.g(i2, iArr2[iArr2.length - 1] + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [yy5, qx2] */
    /* JADX WARNING: type inference failed for: r2v3, types: [yy5, qx2] */
    public final yy5 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? yy5 = new yy5((ViewGroup.MarginLayoutParams) layoutParams);
            yy5.e = -1;
            yy5.f = 0;
            return yy5;
        }
        ? yy52 = new yy5(layoutParams);
        yy52.e = -1;
        yy52.f = 0;
        return yy52;
    }

    public final int x(dz5 dz5, iz5 iz5) {
        if (this.p == 1) {
            return this.F;
        }
        if (iz5.b() < 1) {
            return 0;
        }
        return i1(iz5.b() - 1, dz5, iz5) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        m1(i);
    }
}
