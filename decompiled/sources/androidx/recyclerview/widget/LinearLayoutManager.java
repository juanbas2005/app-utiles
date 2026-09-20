package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class LinearLayoutManager extends xy5 implements hz5 {
    public final s64 A = new s64();
    public final t64 B = new Object();
    public final int C = 2;
    public final int[] D = new int[2];
    public int p = 1;
    public u64 q;
    public t22 r;
    public boolean s;
    public final boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public final boolean w = true;
    public int x = -1;
    public int y = Integer.MIN_VALUE;
    public v64 z = null;

    /* JADX WARNING: type inference failed for: r1v2, types: [t64, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        wy5 I = xy5.I(context, attributeSet, i, i2);
        a1(I.a);
        boolean z2 = I.c;
        c((String) null);
        if (z2 != this.t) {
            this.t = z2;
            m0();
        }
        b1(I.d);
    }

    public boolean A0() {
        if (this.z == null && this.s == this.v) {
            return true;
        }
        return false;
    }

    public void B0(iz5 iz5, int[] iArr) {
        int i;
        int i2;
        if (iz5.a != -1) {
            i = this.r.n();
        } else {
            i = 0;
        }
        if (this.q.f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void C0(iz5 iz5, u64 u64, tt2 tt2) {
        int i = u64.d;
        if (i >= 0 && i < iz5.b()) {
            tt2.a(i, Math.max(0, u64.g));
        }
    }

    public final int D0(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        H0();
        t22 t22 = this.r;
        boolean z2 = !this.w;
        return p25.e(iz5, t22, K0(z2), J0(z2), this, this.w);
    }

    public final int E0(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        H0();
        t22 t22 = this.r;
        boolean z2 = !this.w;
        return p25.f(iz5, t22, K0(z2), J0(z2), this, this.w, this.u);
    }

    public final int F0(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        H0();
        t22 t22 = this.r;
        boolean z2 = !this.w;
        return p25.g(iz5, t22, K0(z2), J0(z2), this, this.w);
    }

    public final int G0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.p != 1 && T0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.p != 1 && T0()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [u64, java.lang.Object] */
    public final void H0() {
        if (this.q == null) {
            ? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.q = obj;
        }
    }

    public final int I0(dz5 dz5, u64 u64, iz5 iz5, boolean z2) {
        int i;
        int i2 = u64.c;
        int i3 = u64.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                u64.g = i3 + i2;
            }
            W0(dz5, u64);
        }
        int i4 = u64.c + u64.h;
        while (true) {
            if ((!u64.l && i4 <= 0) || (i = u64.d) < 0 || i >= iz5.b()) {
                break;
            }
            t64 t64 = this.B;
            t64.a = 0;
            t64.b = false;
            t64.c = false;
            t64.d = false;
            U0(dz5, iz5, u64, t64);
            if (!t64.b) {
                int i5 = u64.b;
                int i6 = t64.a;
                u64.b = (u64.f * i6) + i5;
                if (!t64.c || u64.k != null || !iz5.g) {
                    u64.c -= i6;
                    i4 -= i6;
                }
                int i7 = u64.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    u64.g = i8;
                    int i9 = u64.c;
                    if (i9 < 0) {
                        u64.g = i8 + i9;
                    }
                    W0(dz5, u64);
                }
                if (z2 && t64.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - u64.c;
    }

    public final View J0(boolean z2) {
        if (this.u) {
            return N0(0, v(), z2);
        }
        return N0(v() - 1, -1, z2);
    }

    public final View K0(boolean z2) {
        if (this.u) {
            return N0(v() - 1, -1, z2);
        }
        return N0(0, v(), z2);
    }

    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return xy5.H(N0);
    }

    public final View M0(int i, int i2) {
        int i3;
        int i4;
        H0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.g(u(i)) < this.r.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.p == 0) {
            return this.c.o(i, i2, i4, i3);
        }
        return this.d.o(i, i2, i4, i3);
    }

    public final View N0(int i, int i2, boolean z2) {
        int i3;
        H0();
        if (z2) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.p == 0) {
            return this.c.o(i, i2, i3, 320);
        }
        return this.d.o(i, i2, i3, 320);
    }

    public View O0(dz5 dz5, iz5 iz5, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        H0();
        int v2 = v();
        if (z3) {
            i3 = v() - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = v2;
            i3 = 0;
            i = 1;
        }
        int b = iz5.b();
        int m = this.r.m();
        int i4 = this.r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View u2 = u(i3);
            int H = xy5.H(u2);
            int g = this.r.g(u2);
            int d = this.r.d(u2);
            if (H >= 0 && H < b) {
                if (!((yy5) u2.getLayoutParams()).a.h()) {
                    if (d > m || g >= m) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (g < i4 || d <= i4) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z4 && !z5) {
                        return u2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                    } else if (!z4) {
                        if (view != null) {
                        }
                        view = u2;
                    }
                    view2 = u2;
                } else if (view3 == null) {
                    view3 = u2;
                }
            }
            i3 += i;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int P0(int i, dz5 dz5, iz5 iz5, boolean z2) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -Z0(-i3, dz5, iz5);
        int i5 = i + i4;
        if (!z2 || (i2 = this.r.i() - i5) <= 0) {
            return i4;
        }
        this.r.q(i2);
        return i2 + i4;
    }

    public final int Q0(int i, dz5 dz5, iz5 iz5, boolean z2) {
        int m;
        int m2 = i - this.r.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -Z0(m2, dz5, iz5);
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.q(-m);
        return i2 - m;
    }

    public final View R0() {
        int i;
        if (this.u) {
            i = 0;
        } else {
            i = v() - 1;
        }
        return u(i);
    }

    public final View S0() {
        int i;
        if (this.u) {
            i = v() - 1;
        } else {
            i = 0;
        }
        return u(i);
    }

    public View T(View view, int i, dz5 dz5, iz5 iz5) {
        int G0;
        View view2;
        View view3;
        Y0();
        if (!(v() == 0 || (G0 = G0(i)) == Integer.MIN_VALUE)) {
            H0();
            c1(G0, (int) (((float) this.r.n()) * 0.33333334f), false, iz5);
            u64 u64 = this.q;
            u64.g = Integer.MIN_VALUE;
            u64.a = false;
            I0(dz5, u64, iz5, true);
            boolean z2 = this.u;
            if (G0 == -1) {
                if (z2) {
                    view2 = M0(v() - 1, -1);
                } else {
                    view2 = M0(0, v());
                }
            } else if (z2) {
                view2 = M0(0, v());
            } else {
                view2 = M0(v() - 1, -1);
            }
            if (G0 == -1) {
                view3 = S0();
            } else {
                view3 = R0();
            }
            if (!view3.hasFocusable()) {
                return view2;
            }
            if (view2 == null) {
                return null;
            }
            return view3;
        }
        return null;
    }

    public final boolean T0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        int i;
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            if (N0 == null) {
                i = -1;
            } else {
                i = xy5.H(N0);
            }
            accessibilityEvent.setFromIndex(i);
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(dz5 dz5, iz5 iz5, u64 u64, t64 t64) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        View b = u64.b(dz5);
        if (b == null) {
            t64.b = true;
            return;
        }
        yy5 yy5 = (yy5) b.getLayoutParams();
        List list = u64.k;
        boolean z4 = this.u;
        int i5 = u64.f;
        if (list == null) {
            if (i5 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 == z3) {
                b(b, -1, false);
            } else {
                b(b, 0, false);
            }
        } else {
            if (i5 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z4 == z2) {
                b(b, -1, true);
            } else {
                b(b, 0, true);
            }
        }
        yy5 yy52 = (yy5) b.getLayoutParams();
        Rect J = this.b.J(b);
        int i6 = J.left + J.right;
        int i7 = J.top + J.bottom;
        int w2 = xy5.w(d(), this.n, this.l, F() + E() + yy52.leftMargin + yy52.rightMargin + i6, yy52.width);
        int w3 = xy5.w(e(), this.o, this.m, D() + G() + yy52.topMargin + yy52.bottomMargin + i7, yy52.height);
        if (v0(b, w2, w3, yy52)) {
            b.measure(w2, w3);
        }
        t64.a = this.r.e(b);
        if (this.p == 1) {
            if (T0()) {
                i4 = this.n - F();
                i2 = i4 - this.r.f(b);
            } else {
                int E = E();
                int i8 = E;
                i4 = this.r.f(b) + E;
                i2 = i8;
            }
            int i9 = u64.f;
            i = u64.b;
            int i10 = t64.a;
            if (i9 == -1) {
                int i11 = i - i10;
                i3 = i;
                i = i11;
            } else {
                i3 = i10 + i;
            }
        } else {
            int G = G();
            int f = this.r.f(b) + G;
            int i12 = u64.f;
            int i13 = u64.b;
            int i14 = t64.a;
            if (i12 == -1) {
                int i15 = i13 - i14;
                int i16 = G;
                i4 = i13;
                i = i16;
                i3 = f;
                i2 = i15;
            } else {
                int i17 = i13 + i14;
                i3 = f;
                i2 = i13;
                i = G;
                i4 = i17;
            }
        }
        xy5.N(b, i2, i, i4, i3);
        if (yy5.a.h() || yy5.a.k()) {
            t64.c = true;
        }
        t64.d = b.hasFocusable();
    }

    public final void W0(dz5 dz5, u64 u64) {
        if (u64.a && !u64.l) {
            int i = u64.g;
            int i2 = u64.i;
            if (u64.f == -1) {
                int v2 = v();
                if (i >= 0) {
                    int h = (this.r.h() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < v2; i3++) {
                            View u2 = u(i3);
                            if (this.r.g(u2) < h || this.r.p(u2) < h) {
                                X0(dz5, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = v2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View u3 = u(i5);
                        if (this.r.g(u3) < h || this.r.p(u3) < h) {
                            X0(dz5, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int v3 = v();
                if (this.u) {
                    int i7 = v3 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View u4 = u(i8);
                        if (this.r.d(u4) > i6 || this.r.o(u4) > i6) {
                            X0(dz5, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < v3; i9++) {
                    View u5 = u(i9);
                    if (this.r.d(u5) > i6 || this.r.o(u5) > i6) {
                        X0(dz5, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void X0(dz5 dz5, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View u2 = u(i3);
                    k0(i3);
                    dz5.g(u2);
                }
                return;
            }
            while (i > i2) {
                View u3 = u(i);
                k0(i);
                dz5.g(u3);
                i--;
            }
        }
    }

    public final void Y0() {
        if (this.p == 1 || !T0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Z0(int i, dz5 dz5, iz5 iz5) {
        int i2;
        if (!(v() == 0 || i == 0)) {
            H0();
            this.q.a = true;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int abs = Math.abs(i);
            c1(i2, abs, true, iz5);
            u64 u64 = this.q;
            int I0 = I0(dz5, u64, iz5, false) + u64.g;
            if (I0 >= 0) {
                if (abs > I0) {
                    i = i2 * I0;
                }
                this.r.q(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < xy5.H(u(0))) {
            z2 = true;
        }
        if (z2 != this.u) {
            i2 = -1;
        }
        if (this.p == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public final void a1(int i) {
        if (i == 0 || i == 1) {
            c((String) null);
            if (i != this.p || this.r == null) {
                t22 b = t22.b(this, i);
                this.r = b;
                this.A.a = b;
                this.p = i;
                m0();
                return;
            }
            return;
        }
        h.q(hl6.k(i, "invalid orientation:"));
    }

    public void b1(boolean z2) {
        c((String) null);
        if (this.v != z2) {
            this.v = z2;
            m0();
        }
    }

    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public void c0(dz5 dz5, iz5 iz5) {
        View view;
        int i;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        List list;
        boolean z4;
        int i4;
        int i5;
        int P0;
        int i6;
        View q2;
        int g;
        int i7;
        int i8;
        View view2;
        View O0;
        boolean z5;
        boolean z6;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        int i11;
        int i12;
        int i13;
        dz5 dz52 = dz5;
        iz5 iz52 = iz5;
        int i14 = -1;
        if (!(this.z == null && this.x == -1) && iz52.b() == 0) {
            h0(dz5);
            return;
        }
        v64 v64 = this.z;
        if (v64 != null && (i13 = v64.w) >= 0) {
            this.x = i13;
        }
        H0();
        boolean z9 = false;
        this.q.a = false;
        Y0();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.z).contains(view)) {
            view = null;
        }
        s64 s64 = this.A;
        if (!s64.e || this.x != -1 || this.z != null) {
            s64.c();
            s64.d = this.u ^ this.v;
            if (!iz52.g && (i10 = this.x) != -1) {
                if (i10 < 0 || i10 >= iz52.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i15 = this.x;
                    s64.b = i15;
                    v64 v642 = this.z;
                    if (v642 == null || v642.w < 0) {
                        if (this.y == Integer.MIN_VALUE) {
                            View q3 = q(i15);
                            if (q3 == null) {
                                if (v() > 0) {
                                    if (this.x < xy5.H(u(0))) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7 == this.u) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    s64.d = z8;
                                }
                                s64.a();
                            } else if (this.r.e(q3) > this.r.n()) {
                                s64.a();
                            } else {
                                int g2 = this.r.g(q3) - this.r.m();
                                t22 t22 = this.r;
                                if (g2 < 0) {
                                    s64.c = t22.m();
                                    s64.d = false;
                                } else if (t22.i() - this.r.d(q3) < 0) {
                                    s64.c = this.r.i();
                                    s64.d = true;
                                } else {
                                    boolean z10 = s64.d;
                                    t22 t222 = this.r;
                                    if (z10) {
                                        int d = t222.d(q3);
                                        t22 t223 = this.r;
                                        if (Integer.MIN_VALUE == t223.a) {
                                            i12 = 0;
                                        } else {
                                            i12 = t223.n() - t223.a;
                                        }
                                        i11 = i12 + d;
                                    } else {
                                        i11 = t222.g(q3);
                                    }
                                    s64.c = i11;
                                }
                            }
                        } else {
                            boolean z11 = this.u;
                            s64.d = z11;
                            t22 t224 = this.r;
                            if (z11) {
                                s64.c = t224.i() - this.y;
                            } else {
                                s64.c = t224.m() + this.y;
                            }
                        }
                        s64.e = true;
                    } else {
                        boolean z12 = v642.y;
                        s64.d = z12;
                        t22 t225 = this.r;
                        if (z12) {
                            s64.c = t225.i() - this.z.x;
                        } else {
                            s64.c = t225.m() + this.z.x;
                        }
                        s64.e = true;
                    }
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.z).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    yy5 yy5 = (yy5) view2.getLayoutParams();
                    if (!yy5.a.h() && yy5.a.b() >= 0 && yy5.a.b() < iz52.b()) {
                        s64.b(view2, xy5.H(view2));
                        s64.e = true;
                    }
                }
                boolean z13 = this.s;
                boolean z14 = this.v;
                if (z13 == z14 && (O0 = O0(dz52, iz52, s64.d, z14)) != null) {
                    int H = xy5.H(O0);
                    boolean z15 = s64.d;
                    t22 t226 = s64.a;
                    if (z15) {
                        int d2 = t226.d(O0);
                        t22 t227 = s64.a;
                        if (Integer.MIN_VALUE == t227.a) {
                            i9 = 0;
                        } else {
                            i9 = t227.n() - t227.a;
                        }
                        s64.c = i9 + d2;
                    } else {
                        s64.c = t226.g(O0);
                    }
                    s64.b = H;
                    if (!iz52.g && A0()) {
                        int g3 = this.r.g(O0);
                        int d3 = this.r.d(O0);
                        int m = this.r.m();
                        int i16 = this.r.i();
                        if (d3 > m || g3 >= m) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (g3 < i16 || d3 <= i16) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z5 || z6) {
                            if (s64.d) {
                                m = i16;
                            }
                            s64.c = m;
                        }
                    }
                    s64.e = true;
                }
            }
            s64.a();
            if (this.v) {
                i8 = iz52.b() - 1;
            } else {
                i8 = 0;
            }
            s64.b = i8;
            s64.e = true;
        } else if (view != null && (this.r.g(view) >= this.r.i() || this.r.d(view) <= this.r.m())) {
            s64.b(view, xy5.H(view));
        }
        u64 u64 = this.q;
        if (u64.j >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        u64.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(iz52, iArr);
        int m2 = this.r.m() + Math.max(0, iArr[0]);
        int j = this.r.j() + Math.max(0, iArr[1]);
        if (!(!iz52.g || (i6 = this.x) == -1 || this.y == Integer.MIN_VALUE || (q2 = q(i6)) == null)) {
            boolean z16 = this.u;
            t22 t228 = this.r;
            if (z16) {
                i7 = t228.i() - this.r.d(q2);
                g = this.y;
            } else {
                g = t228.g(q2) - this.r.m();
                i7 = this.y;
            }
            int i17 = i7 - g;
            if (i17 > 0) {
                m2 += i17;
            } else {
                j -= i17;
            }
        }
        boolean z17 = s64.d;
        boolean z18 = this.u;
        if (!z17 ? !z18 : z18) {
            i14 = 1;
        }
        V0(dz52, iz52, s64, i14);
        p(dz5);
        u64 u642 = this.q;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        u642.l = z2;
        this.q.getClass();
        this.q.i = 0;
        boolean z19 = s64.d;
        int i18 = s64.b;
        if (z19) {
            e1(i18, s64.c);
            u64 u643 = this.q;
            u643.h = m2;
            I0(dz52, u643, iz52, false);
            u64 u644 = this.q;
            i3 = u644.b;
            int i19 = u644.d;
            int i20 = u644.c;
            if (i20 > 0) {
                j += i20;
            }
            d1(s64.b, s64.c);
            u64 u645 = this.q;
            u645.h = j;
            u645.d += u645.e;
            I0(dz52, u645, iz52, false);
            u64 u646 = this.q;
            i2 = u646.b;
            int i21 = u646.c;
            if (i21 > 0) {
                e1(i19, i3);
                u64 u647 = this.q;
                u647.h = i21;
                I0(dz52, u647, iz52, false);
                i3 = this.q.b;
            }
        } else {
            d1(i18, s64.c);
            u64 u648 = this.q;
            u648.h = j;
            I0(dz52, u648, iz52, false);
            u64 u649 = this.q;
            i2 = u649.b;
            int i22 = u649.d;
            int i23 = u649.c;
            if (i23 > 0) {
                m2 += i23;
            }
            e1(s64.b, s64.c);
            u64 u6410 = this.q;
            u6410.h = m2;
            u6410.d += u6410.e;
            I0(dz52, u6410, iz52, false);
            u64 u6411 = this.q;
            int i24 = u6411.b;
            int i25 = u6411.c;
            if (i25 > 0) {
                d1(i22, i2);
                u64 u6412 = this.q;
                u6412.h = i25;
                I0(dz52, u6412, iz52, false);
                i2 = this.q.b;
            }
            i3 = i24;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int P02 = P0(i2, dz52, iz52, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                P0 = Q0(i4, dz52, iz52, false);
            } else {
                int Q0 = Q0(i3, dz52, iz52, true);
                i4 = i3 + Q0;
                i5 = i2 + Q0;
                P0 = P0(i5, dz52, iz52, false);
            }
            i3 = i4 + P0;
            i2 = i5 + P0;
        }
        if (iz52.k && v() != 0 && !iz52.g && A0()) {
            List list2 = dz52.d;
            int size = list2.size();
            int H2 = xy5.H(u(0));
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i26 < size) {
                lz5 lz5 = (lz5) list2.get(i26);
                boolean h = lz5.h();
                View view3 = lz5.a;
                if (!h) {
                    if (lz5.b() < H2) {
                        z4 = true;
                    } else {
                        z4 = z9;
                    }
                    boolean z20 = this.u;
                    t22 t229 = this.r;
                    if (z4 != z20) {
                        i27 += t229.e(view3);
                    } else {
                        i28 += t229.e(view3);
                    }
                }
                i26++;
                z9 = false;
            }
            this.q.k = list2;
            if (i27 > 0) {
                e1(xy5.H(S0()), i3);
                u64 u6413 = this.q;
                u6413.h = i27;
                z3 = false;
                u6413.c = 0;
                u6413.a((View) null);
                I0(dz52, this.q, iz52, false);
            } else {
                z3 = false;
            }
            if (i28 > 0) {
                d1(xy5.H(R0()), i2);
                u64 u6414 = this.q;
                u6414.h = i28;
                u6414.c = z3 ? 1 : 0;
                list = null;
                u6414.a((View) null);
                I0(dz52, this.q, iz52, z3);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!iz52.g) {
            t22 t2210 = this.r;
            t2210.a = t2210.n();
        } else {
            s64.c();
        }
        this.s = this.v;
    }

    public final void c1(int i, int i2, boolean z2, iz5 iz5) {
        boolean z3;
        int i3;
        int i4;
        u64 u64 = this.q;
        boolean z4 = false;
        int i5 = 1;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u64.l = z3;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(iz5, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z4 = true;
        }
        u64 u642 = this.q;
        if (z4) {
            i3 = max2;
        } else {
            i3 = max;
        }
        u642.h = i3;
        if (!z4) {
            max = max2;
        }
        u642.i = max;
        if (z4) {
            u642.h = this.r.j() + i3;
            View R0 = R0();
            u64 u643 = this.q;
            if (this.u) {
                i5 = -1;
            }
            u643.e = i5;
            int H = xy5.H(R0);
            u64 u644 = this.q;
            u643.d = H + u644.e;
            u644.b = this.r.d(R0);
            i4 = this.r.d(R0) - this.r.i();
        } else {
            View S0 = S0();
            u64 u645 = this.q;
            u645.h = this.r.m() + u645.h;
            u64 u646 = this.q;
            if (!this.u) {
                i5 = -1;
            }
            u646.e = i5;
            int H2 = xy5.H(S0);
            u64 u647 = this.q;
            u646.d = H2 + u647.e;
            u647.b = this.r.g(S0);
            i4 = (-this.r.g(S0)) + this.r.m();
        }
        u64 u648 = this.q;
        u648.c = i2;
        if (z2) {
            u648.c = i2 - i4;
        }
        u648.g = i4;
    }

    public final boolean d() {
        if (this.p == 0) {
            return true;
        }
        return false;
    }

    public void d0(iz5 iz5) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i, int i2) {
        int i3;
        this.q.c = this.r.i() - i2;
        u64 u64 = this.q;
        if (this.u) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        u64.e = i3;
        u64.d = i;
        u64.f = 1;
        u64.b = i2;
        u64.g = Integer.MIN_VALUE;
    }

    public final boolean e() {
        if (this.p == 1) {
            return true;
        }
        return false;
    }

    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof v64) {
            v64 v64 = (v64) parcelable;
            this.z = v64;
            if (this.x != -1) {
                v64.w = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i2) {
        int i3;
        this.q.c = i2 - this.r.m();
        u64 u64 = this.q;
        u64.d = i;
        if (this.u) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        u64.e = i3;
        u64.f = -1;
        u64.b = i2;
        u64.g = Integer.MIN_VALUE;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, v64, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.os.Parcelable, v64, java.lang.Object] */
    public final Parcelable f0() {
        v64 v64 = this.z;
        if (v64 != null) {
            ? obj = new Object();
            obj.w = v64.w;
            obj.x = v64.x;
            obj.y = v64.y;
            return obj;
        }
        ? obj2 = new Object();
        if (v() > 0) {
            H0();
            boolean z2 = this.s ^ this.u;
            obj2.y = z2;
            if (z2) {
                View R0 = R0();
                obj2.x = this.r.i() - this.r.d(R0);
                obj2.w = xy5.H(R0);
                return obj2;
            }
            View S0 = S0();
            obj2.w = xy5.H(S0);
            obj2.x = this.r.g(S0) - this.r.m();
            return obj2;
        }
        obj2.w = -1;
        return obj2;
    }

    public final void h(int i, int i2, iz5 iz5, tt2 tt2) {
        int i3;
        if (this.p != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            H0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            c1(i3, Math.abs(i), true, iz5);
            C0(iz5, this.q, tt2);
        }
    }

    public final void i(int i, tt2 tt2) {
        int i2;
        boolean z2;
        v64 v64 = this.z;
        int i3 = -1;
        if (v64 == null || (i2 = v64.w) < 0) {
            Y0();
            z2 = this.u;
            i2 = this.x;
            if (i2 == -1) {
                if (z2) {
                    i2 = i - 1;
                } else {
                    i2 = 0;
                }
            }
        } else {
            z2 = v64.y;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            tt2.a(i2, 0);
            i2 += i3;
        }
    }

    public final int j(iz5 iz5) {
        return D0(iz5);
    }

    public int k(iz5 iz5) {
        return E0(iz5);
    }

    public int l(iz5 iz5) {
        return F0(iz5);
    }

    public final int m(iz5 iz5) {
        return D0(iz5);
    }

    public int n(iz5 iz5) {
        return E0(iz5);
    }

    public int n0(int i, dz5 dz5, iz5 iz5) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, dz5, iz5);
    }

    public int o(iz5 iz5) {
        return F0(iz5);
    }

    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        v64 v64 = this.z;
        if (v64 != null) {
            v64.w = -1;
        }
        m0();
    }

    public int p0(int i, dz5 dz5, iz5 iz5) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, dz5, iz5);
    }

    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H = i - xy5.H(u(0));
        if (H >= 0 && H < v2) {
            View u2 = u(H);
            if (xy5.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    public yy5 r() {
        return new yy5(-2, -2);
    }

    public final boolean w0() {
        if (!(this.m == 1073741824 || this.l == 1073741824)) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void y0(RecyclerView recyclerView, int i) {
        w64 w64 = new w64(recyclerView.getContext());
        w64.a = i;
        z0(w64);
    }

    public final void S(RecyclerView recyclerView) {
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [t64, java.lang.Object] */
    public LinearLayoutManager(int i) {
        a1(i);
        c((String) null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    public void V0(dz5 dz5, iz5 iz5, s64 s64, int i) {
    }
}
