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
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class StaggeredGridLayoutManager extends xy5 implements hz5 {
    public int A = Integer.MIN_VALUE;
    public final kg5 B;
    public final int C;
    public boolean D;
    public boolean E;
    public f27 F;
    public final Rect G;
    public final c27 H;
    public final boolean I;
    public int[] J;
    public final ge K;
    public final int p = -1;
    public final kd4[] q;
    public final t22 r;
    public final t22 s;
    public final int t;
    public int u;
    public final kz3 v;
    public boolean w = false;
    public boolean x = false;
    public final BitSet y;
    public int z = -1;

    /* JADX WARNING: type inference failed for: r6v3, types: [kz3, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        kg5 kg5 = new kg5(19, false);
        this.B = kg5;
        this.C = 2;
        this.G = new Rect();
        this.H = new c27(this);
        this.I = true;
        this.K = new ge(13, (Object) this);
        wy5 I2 = xy5.I(context, attributeSet, i, i2);
        int i3 = I2.a;
        if (i3 == 0 || i3 == 1) {
            c((String) null);
            if (i3 != this.t) {
                this.t = i3;
                t22 t22 = this.r;
                this.r = this.s;
                this.s = t22;
                m0();
            }
            int i4 = I2.b;
            c((String) null);
            if (i4 != this.p) {
                kg5.g();
                m0();
                this.p = i4;
                this.y = new BitSet(this.p);
                this.q = new kd4[this.p];
                for (int i5 = 0; i5 < this.p; i5++) {
                    this.q[i5] = new kd4(this, i5);
                }
                m0();
            }
            boolean z2 = I2.c;
            c((String) null);
            f27 f27 = this.F;
            if (!(f27 == null || f27.D == z2)) {
                f27.D = z2;
            }
            this.w = z2;
            m0();
            ? obj = new Object();
            obj.a = true;
            obj.f = 0;
            obj.g = 0;
            this.v = obj;
            this.r = t22.b(this, this.t);
            this.s = t22.b(this, 1 - this.t);
            return;
        }
        h.q("invalid orientation.");
        throw null;
    }

    public static int b1(int i, int i2, int i3) {
        int mode;
        if ((i2 != 0 || i3 != 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public final boolean A0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        int i;
        if (!(v() == 0 || this.C == 0 || !this.g)) {
            if (this.x) {
                i = J0();
                I0();
            } else {
                i = I0();
                J0();
            }
            if (i == 0 && N0() != null) {
                this.B.g();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return p25.f(iz5, this.r, F0(z2), E0(z2), this, this.I, this.x);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0270  */
    public final int D0(dz5 dz5, kz3 kz3, iz5 iz5) {
        int i;
        kd4[] kd4Arr;
        int i2;
        int i3;
        int i4;
        BitSet bitSet;
        kd4[] kd4Arr2;
        int i5;
        kd4 kd4;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        BitSet bitSet2;
        int i10;
        int i11;
        dz5 dz52 = dz5;
        kz3 kz32 = kz3;
        BitSet bitSet3 = this.y;
        int i12 = this.p;
        bitSet3.set(0, i12, true);
        kz3 kz33 = this.v;
        if (kz33.i) {
            if (kz32.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (kz32.e == 1) {
            i = kz32.g + kz32.b;
        } else {
            i = kz32.f - kz32.b;
        }
        int i13 = kz32.e;
        int i14 = 0;
        while (true) {
            kd4Arr = this.q;
            if (i14 >= i12) {
                break;
            }
            if (!((ArrayList) kd4Arr[i14].f).isEmpty()) {
                a1(kd4Arr[i14], i13, i);
            }
            i14++;
        }
        boolean z3 = this.x;
        t22 t22 = this.r;
        if (z3) {
            i2 = t22.i();
        } else {
            i2 = t22.m();
        }
        boolean z4 = false;
        while (true) {
            int i15 = kz32.c;
            if (i15 >= 0 && i15 < iz5.b() && (kz33.i || !bitSet3.isEmpty())) {
                View d = dz52.d(kz32.c);
                kz32.c += kz32.d;
                d27 d27 = (d27) d.getLayoutParams();
                int b = d27.a.b();
                kg5 kg5 = this.B;
                int[] iArr = (int[]) kg5.x;
                if (iArr == null || b >= iArr.length) {
                    i4 = -1;
                } else {
                    i4 = iArr[b];
                }
                if (i4 == -1) {
                    if (R0(kz32.e)) {
                        i5 = i12;
                        i10 = i12 - 1;
                        i12 = -1;
                        i11 = -1;
                    } else {
                        i5 = i12;
                        i11 = 1;
                        i10 = 0;
                    }
                    kd4 kd42 = null;
                    int i16 = i11;
                    if (kz32.e == 1) {
                        int m = t22.m();
                        kd4Arr2 = kd4Arr;
                        int i17 = i10;
                        int i18 = Integer.MAX_VALUE;
                        while (i17 != i12) {
                            int i19 = i17;
                            kd4 kd43 = kd4Arr2[i19];
                            BitSet bitSet4 = bitSet3;
                            int i20 = kd43.i(m);
                            if (i20 < i18) {
                                i18 = i20;
                                kd42 = kd43;
                            }
                            i17 = i19 + i16;
                            bitSet3 = bitSet4;
                        }
                        bitSet = bitSet3;
                    } else {
                        bitSet = bitSet3;
                        kd4Arr2 = kd4Arr;
                        int i21 = t22.i();
                        int i22 = i10;
                        int i23 = Integer.MIN_VALUE;
                        while (i22 != i12) {
                            kd4 kd44 = kd4Arr2[i22];
                            int i24 = i12;
                            int k = kd44.k(i21);
                            if (k > i23) {
                                i23 = k;
                                kd42 = kd44;
                            }
                            i22 += i16;
                            i12 = i24;
                        }
                    }
                    kd4 = kd42;
                    kg5.m(b);
                    ((int[]) kg5.x)[b] = kd4.e;
                } else {
                    bitSet = bitSet3;
                    i5 = i12;
                    kd4Arr2 = kd4Arr;
                    kd4 = kd4Arr2[i4];
                }
                d27.e = kd4;
                if (kz32.e == 1) {
                    z2 = false;
                    b(d, -1, false);
                } else {
                    z2 = false;
                    b(d, 0, false);
                }
                int i25 = this.t;
                if (i25 == 1) {
                    P0(d, xy5.w(z2, this.u, this.l, z2 ? 1 : 0, d27.width), xy5.w(true, this.o, this.m, D() + G(), d27.height));
                } else {
                    P0(d, xy5.w(true, this.n, this.l, F() + E(), d27.width), xy5.w(false, this.u, this.m, 0, d27.height));
                }
                if (kz32.e == 1) {
                    i7 = kd4.i(i2);
                    i6 = t22.e(d) + i7;
                } else {
                    i6 = kd4.k(i2);
                    i7 = i6 - t22.e(d);
                }
                int i26 = kz32.e;
                kd4 kd45 = d27.e;
                if (i26 == 1) {
                    kd45.getClass();
                    d27 d272 = (d27) d.getLayoutParams();
                    d272.e = kd45;
                    ArrayList arrayList = (ArrayList) kd45.f;
                    arrayList.add(d);
                    kd45.c = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        kd45.b = Integer.MIN_VALUE;
                    }
                    if (d272.a.h() || d272.a.k()) {
                        kd45.d = ((StaggeredGridLayoutManager) kd45.g).r.e(d) + kd45.d;
                    }
                } else {
                    kd45.getClass();
                    d27 d273 = (d27) d.getLayoutParams();
                    d273.e = kd45;
                    ArrayList arrayList2 = (ArrayList) kd45.f;
                    arrayList2.add(0, d);
                    kd45.b = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        kd45.c = Integer.MIN_VALUE;
                    }
                    if (d273.a.h() || d273.a.k()) {
                        kd45.d = ((StaggeredGridLayoutManager) kd45.g).r.e(d) + kd45.d;
                    }
                }
                boolean O0 = O0();
                t22 t222 = this.s;
                if (!O0 || i25 != 1) {
                    int m2 = (kd4.e * this.u) + t222.m();
                    int e = t222.e(d) + m2;
                    i8 = m2;
                    i9 = e;
                } else {
                    i9 = t222.i() - (((i5 - 1) - kd4.e) * this.u);
                    i8 = i9 - t222.e(d);
                }
                z4 = true;
                if (i25 == 1) {
                    xy5.N(d, i8, i7, i9, i6);
                } else {
                    xy5.N(d, i7, i8, i6, i9);
                }
                a1(kd4, kz33.e, i);
                dz52 = dz5;
                T0(dz52, kz33);
                if (!kz33.h || !d.hasFocusable()) {
                    bitSet2 = bitSet;
                } else {
                    bitSet2 = bitSet;
                    bitSet2.set(kd4.e, false);
                }
                bitSet3 = bitSet2;
                i12 = i5;
                kd4Arr = kd4Arr2;
            } else if (!z4) {
                T0(dz52, kz33);
            }
        }
        if (!z4) {
        }
        if (kz33.e == -1) {
            i3 = t22.m() - L0(t22.m());
        } else {
            i3 = K0(t22.i()) - t22.i();
        }
        if (i3 > 0) {
            return Math.min(kz32.b, i3);
        }
        return 0;
    }

    public final View E0(boolean z2) {
        t22 t22 = this.r;
        int m = t22.m();
        int i = t22.i();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int g = t22.g(u2);
            int d = t22.d(u2);
            if (d > m && g < i) {
                if (d <= i || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z2) {
        t22 t22 = this.r;
        int m = t22.m();
        int i = t22.i();
        int v2 = v();
        View view = null;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            int g = t22.g(u2);
            if (t22.d(u2) > m && g < i) {
                if (g >= m || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void G0(dz5 dz5, iz5 iz5, boolean z2) {
        int i;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (i = this.r.i() - K0) > 0) {
            int i2 = i - (-X0(-i, dz5, iz5));
            if (z2 && i2 > 0) {
                this.r.q(i2);
            }
        }
    }

    public final void H0(dz5 dz5, iz5 iz5, boolean z2) {
        int m;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (m = L0 - this.r.m()) > 0) {
            int X0 = m - X0(m, dz5, iz5);
            if (z2 && X0 > 0) {
                this.r.q(-X0);
            }
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return xy5.H(u(0));
    }

    public final int J0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return xy5.H(u(v2 - 1));
    }

    public final int K0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final boolean L() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final int L0(int i) {
        int k = this.q[0].k(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int k2 = this.q[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    public final void M0(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        kg5 kg5;
        int i7;
        ArrayList arrayList;
        int i8;
        e27 e27;
        if (this.x) {
            i4 = J0();
        } else {
            i4 = I0();
        }
        if (i3 != 8) {
            i6 = i + i2;
        } else if (i < i2) {
            i6 = i2 + 1;
        } else {
            i6 = i + 1;
            i5 = i2;
            kg5 = this.B;
            int[] iArr = (int[]) kg5.x;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) kg5.y;
                if (arrayList != null) {
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            e27 = (e27) ((ArrayList) kg5.y).get(size);
                            if (e27.w == i5) {
                                break;
                            }
                            size--;
                        }
                    }
                    e27 = null;
                    if (e27 != null) {
                        ((ArrayList) kg5.y).remove(e27);
                    }
                    int size2 = ((ArrayList) kg5.y).size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size2) {
                            i9 = -1;
                            break;
                        } else if (((e27) ((ArrayList) kg5.y).get(i9)).w >= i5) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (i9 != -1) {
                        ((ArrayList) kg5.y).remove(i9);
                        i8 = ((e27) ((ArrayList) kg5.y).get(i9)).w;
                        int[] iArr2 = (int[]) kg5.x;
                        if (i8 == -1) {
                            Arrays.fill(iArr2, i5, iArr2.length, -1);
                            int length = ((int[]) kg5.x).length;
                        } else {
                            Arrays.fill((int[]) kg5.x, i5, Math.min(i8 + 1, iArr2.length), -1);
                        }
                    }
                }
                i8 = -1;
                int[] iArr22 = (int[]) kg5.x;
                if (i8 == -1) {
                }
            }
            if (i3 != 1) {
                kg5.C(i, i2);
            } else if (i3 == 2) {
                kg5.D(i, i2);
            } else if (i3 == 8) {
                kg5.D(i, 1);
                kg5.C(i2, 1);
            }
            if (i6 <= i4) {
                if (this.x) {
                    i7 = I0();
                } else {
                    i7 = J0();
                }
                if (i5 <= i7) {
                    m0();
                    return;
                }
                return;
            }
            return;
        }
        i5 = i;
        kg5 = this.B;
        int[] iArr3 = (int[]) kg5.x;
        arrayList = (ArrayList) kg5.y;
        if (arrayList != null) {
        }
        i8 = -1;
        int[] iArr222 = (int[]) kg5.x;
        if (i8 == -1) {
        }
        if (i3 != 1) {
        }
        if (i6 <= i4) {
        }
    }

    public final View N0() {
        char c;
        boolean z2;
        boolean z3;
        int v2 = v();
        int i = v2 - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        int i3 = -1;
        if (this.t != 1 || !O0()) {
            c = 65535;
        } else {
            c = 1;
        }
        if (this.x) {
            v2 = -1;
        } else {
            i = 0;
        }
        if (i < v2) {
            i3 = 1;
        }
        while (i != v2) {
            View u2 = u(i);
            d27 d27 = (d27) u2.getLayoutParams();
            boolean z4 = bitSet.get(d27.e.e);
            t22 t22 = this.r;
            if (z4) {
                kd4 kd4 = d27.e;
                if (this.x) {
                    int i4 = kd4.c;
                    if (i4 == Integer.MIN_VALUE) {
                        kd4.a();
                        i4 = kd4.c;
                    }
                    if (i4 < t22.i()) {
                        ((d27) ((View) b81.k(1, (ArrayList) kd4.f)).getLayoutParams()).getClass();
                        return u2;
                    }
                } else {
                    int i5 = kd4.b;
                    ArrayList arrayList = (ArrayList) kd4.f;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        kd4.b = ((StaggeredGridLayoutManager) kd4.g).r.g(view);
                        ((d27) view.getLayoutParams()).getClass();
                        i5 = kd4.b;
                    }
                    if (i5 > t22.m()) {
                        ((d27) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                }
                bitSet.clear(d27.e.e);
            }
            i += i3;
            if (i != v2) {
                View u3 = u(i);
                if (this.x) {
                    int d = t22.d(u2);
                    int d2 = t22.d(u3);
                    if (d < d2) {
                        return u2;
                    }
                    if (d != d2) {
                        continue;
                    }
                } else {
                    int g = t22.g(u2);
                    int g2 = t22.g(u3);
                    if (g > g2) {
                        return u2;
                    }
                    if (g != g2) {
                        continue;
                    }
                }
                if (d27.e.e - ((d27) u3.getLayoutParams()).e.e < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 != z3) {
                    return u2;
                }
            }
        }
        return null;
    }

    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            kd4 kd4 = this.q[i2];
            int i3 = kd4.b;
            if (i3 != Integer.MIN_VALUE) {
                kd4.b = i3 + i;
            }
            int i4 = kd4.c;
            if (i4 != Integer.MIN_VALUE) {
                kd4.c = i4 + i;
            }
        }
    }

    public final boolean O0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            kd4 kd4 = this.q[i2];
            int i3 = kd4.b;
            if (i3 != Integer.MIN_VALUE) {
                kd4.b = i3 + i;
            }
            int i4 = kd4.c;
            if (i4 != Integer.MIN_VALUE) {
                kd4.c = i4 + i;
            }
        }
    }

    public final void P0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        d27 d27 = (d27) view.getLayoutParams();
        int b1 = b1(i, d27.leftMargin + rect.left, d27.rightMargin + rect.right);
        int b12 = b1(i2, d27.topMargin + rect.top, d27.bottomMargin + rect.bottom);
        if (v0(view, b1, b12, d27)) {
            view.measure(b1, b12);
        }
    }

    public final void Q() {
        this.B.g();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0179, code lost:
        if (r0.x != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0187, code lost:
        if (r4 != r0.x) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    public final void Q0(dz5 dz5, iz5 iz5, boolean z2) {
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        f27 f27;
        int i2;
        boolean z6;
        int i3;
        int i4;
        int i5;
        boolean z7;
        int i6;
        int i7;
        int m;
        dz5 dz52 = dz5;
        iz5 iz52 = iz5;
        f27 f272 = this.F;
        c27 c27 = this.H;
        if (!(f272 == null && this.z == -1) && iz52.b() == 0) {
            h0(dz5);
            c27.a();
            return;
        }
        boolean z8 = c27.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c27.g;
        if (z8 && this.z == -1 && this.F == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        kd4[] kd4Arr = this.q;
        int i8 = this.p;
        kg5 kg5 = this.B;
        if (z3) {
            c27.a();
            f27 f273 = this.F;
            t22 t22 = this.r;
            if (f273 != null) {
                int i9 = f273.y;
                if (i9 > 0) {
                    if (i9 == i8) {
                        for (int i10 = 0; i10 < i8; i10++) {
                            kd4Arr[i10].b();
                            f27 f274 = this.F;
                            int i11 = f274.z[i10];
                            if (i11 != Integer.MIN_VALUE) {
                                if (f274.E) {
                                    m = t22.i();
                                } else {
                                    m = t22.m();
                                }
                                i11 += m;
                            }
                            kd4 kd4 = kd4Arr[i10];
                            kd4.b = i11;
                            kd4.c = i11;
                        }
                    } else {
                        f273.z = null;
                        f273.y = 0;
                        f273.A = 0;
                        f273.B = null;
                        f273.C = null;
                        f273.w = f273.x;
                    }
                }
                f27 f275 = this.F;
                this.E = f275.F;
                boolean z9 = f275.D;
                c((String) null);
                f27 f276 = this.F;
                if (!(f276 == null || f276.D == z9)) {
                    f276.D = z9;
                }
                this.w = z9;
                m0();
                W0();
                f27 f277 = this.F;
                int i12 = f277.w;
                if (i12 != -1) {
                    this.z = i12;
                    c27.c = f277.E;
                } else {
                    c27.c = this.x;
                }
                if (f277.A > 1) {
                    kg5.x = f277.B;
                    kg5.y = f277.C;
                }
            } else {
                W0();
                c27.c = this.x;
            }
            if (!iz52.g && (i4 = this.z) != -1) {
                if (i4 < 0 || i4 >= iz52.b()) {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    f27 f278 = this.F;
                    if (f278 == null || f278.w == -1 || f278.y < 1) {
                        View q2 = q(this.z);
                        if (q2 != null) {
                            if (this.x) {
                                i6 = J0();
                            } else {
                                i6 = I0();
                            }
                            c27.a = i6;
                            if (this.A != Integer.MIN_VALUE) {
                                if (c27.c) {
                                    c27.b = (t22.i() - this.A) - t22.d(q2);
                                } else {
                                    c27.b = (t22.m() + this.A) - t22.g(q2);
                                }
                            } else if (t22.e(q2) > t22.n()) {
                                if (c27.c) {
                                    i7 = t22.i();
                                } else {
                                    i7 = t22.m();
                                }
                                c27.b = i7;
                            } else {
                                int g = t22.g(q2) - t22.m();
                                if (g < 0) {
                                    c27.b = -g;
                                } else {
                                    int i13 = t22.i() - t22.d(q2);
                                    if (i13 < 0) {
                                        c27.b = i13;
                                    } else {
                                        c27.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                            z6 = true;
                            c27.e = z6;
                        } else {
                            int i14 = this.z;
                            c27.a = i14;
                            int i15 = this.A;
                            if (i15 == Integer.MIN_VALUE) {
                                if (v() != 0) {
                                    if (i14 < I0()) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                }
                                boolean z10 = false;
                                c27.c = z10;
                                t22 t222 = staggeredGridLayoutManager.r;
                                if (z10) {
                                    i5 = t222.i();
                                } else {
                                    i5 = t222.m();
                                }
                                c27.b = i5;
                            } else {
                                boolean z11 = c27.c;
                                t22 t223 = staggeredGridLayoutManager.r;
                                if (z11) {
                                    c27.b = t223.i() - i15;
                                } else {
                                    c27.b = t223.m() + i15;
                                }
                            }
                            z6 = true;
                            c27.d = true;
                            c27.e = z6;
                        }
                    } else {
                        c27.b = Integer.MIN_VALUE;
                        c27.a = this.z;
                        z6 = true;
                        c27.e = z6;
                    }
                }
            }
            if (!this.D) {
                int b = iz52.b();
                int v2 = v();
                int i16 = 0;
                while (true) {
                    if (i16 < v2) {
                        int H2 = xy5.H(u(i16));
                        if (H2 >= 0 && H2 < b) {
                            i3 = H2;
                            break;
                        }
                        i16++;
                    } else {
                        break;
                    }
                }
            } else {
                int b2 = iz52.b();
                int v3 = v() - 1;
                while (true) {
                    if (v3 >= 0) {
                        i3 = xy5.H(u(v3));
                        if (i3 >= 0 && i3 < b2) {
                            break;
                        }
                        v3--;
                    } else {
                        break;
                    }
                }
            }
            i3 = 0;
            c27.a = i3;
            c27.b = Integer.MIN_VALUE;
            z6 = true;
            c27.e = z6;
        }
        if (this.F == null && this.z == -1 && (c27.c != this.D || O0() != this.E)) {
            kg5.g();
            i = 1;
            c27.d = true;
        } else {
            i = 1;
        }
        if (v() > 0 && ((f27 = this.F) == null || f27.y < i)) {
            if (c27.d) {
                for (int i17 = 0; i17 < i8; i17++) {
                    kd4Arr[i17].b();
                    int i18 = c27.b;
                    if (i18 != Integer.MIN_VALUE) {
                        kd4 kd42 = kd4Arr[i17];
                        kd42.b = i18;
                        kd42.c = i18;
                    }
                }
            } else if (z3 || c27.f == null) {
                for (int i19 = 0; i19 < i8; i19++) {
                    kd4 kd43 = kd4Arr[i19];
                    boolean z12 = this.x;
                    int i20 = c27.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) kd43.g;
                    if (z12) {
                        i2 = kd43.i(Integer.MIN_VALUE);
                    } else {
                        i2 = kd43.k(Integer.MIN_VALUE);
                    }
                    kd43.b();
                    if (i2 != Integer.MIN_VALUE && ((!z12 || i2 >= staggeredGridLayoutManager2.r.i()) && (z12 || i2 <= staggeredGridLayoutManager2.r.m()))) {
                        if (i20 != Integer.MIN_VALUE) {
                            i2 += i20;
                        }
                        kd43.c = i2;
                        kd43.b = i2;
                    }
                }
                int length = kd4Arr.length;
                int[] iArr = c27.f;
                if (iArr == null || iArr.length < length) {
                    c27.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    c27.f[i21] = kd4Arr[i21].k(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < i8; i22++) {
                    kd4 kd44 = kd4Arr[i22];
                    kd44.b();
                    int i23 = c27.f[i22];
                    kd44.b = i23;
                    kd44.c = i23;
                }
            }
        }
        p(dz5);
        kz3 kz3 = this.v;
        kz3.a = false;
        t22 t224 = this.s;
        int n = t224.n();
        this.u = n / i8;
        View.MeasureSpec.makeMeasureSpec(n, t224.k());
        Z0(c27.a, iz52);
        if (c27.c) {
            Y0(-1);
            D0(dz52, kz3, iz52);
            Y0(1);
            kz3.c = c27.a + kz3.d;
            D0(dz52, kz3, iz52);
        } else {
            Y0(1);
            D0(dz52, kz3, iz52);
            Y0(-1);
            kz3.c = c27.a + kz3.d;
            D0(dz52, kz3, iz52);
        }
        if (t224.k() != 1073741824) {
            int v4 = v();
            float f = 0.0f;
            for (int i24 = 0; i24 < v4; i24++) {
                View u2 = u(i24);
                float e = (float) t224.e(u2);
                if (e >= f) {
                    ((d27) u2.getLayoutParams()).getClass();
                    f = Math.max(f, e);
                }
            }
            int i25 = this.u;
            int round = Math.round(f * ((float) i8));
            if (t224.k() == Integer.MIN_VALUE) {
                round = Math.min(round, t224.n());
            }
            this.u = round / i8;
            View.MeasureSpec.makeMeasureSpec(round, t224.k());
            if (this.u != i25) {
                for (int i26 = 0; i26 < v4; i26++) {
                    View u3 = u(i26);
                    d27 d27 = (d27) u3.getLayoutParams();
                    d27.getClass();
                    boolean O0 = O0();
                    int i27 = this.t;
                    if (!O0 || i27 != 1) {
                        int i28 = d27.e.e;
                        int i29 = this.u * i28;
                        int i30 = i28 * i25;
                        if (i27 == 1) {
                            u3.offsetLeftAndRight(i29 - i30);
                        } else {
                            u3.offsetTopAndBottom(i29 - i30);
                        }
                    } else {
                        int i31 = -((i8 - 1) - d27.e.e);
                        u3.offsetLeftAndRight((this.u * i31) - (i31 * i25));
                    }
                }
            }
        }
        if (v() <= 0) {
            z4 = true;
        } else if (this.x) {
            z4 = true;
            G0(dz52, iz52, true);
            H0(dz52, iz52, false);
        } else {
            z4 = true;
            H0(dz52, iz52, true);
            G0(dz52, iz52, false);
        }
        if (z2 && !iz52.g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (B0()) {
                z5 = z4;
                if (iz52.g) {
                    c27.a();
                }
                this.D = c27.c;
                this.E = O0();
                if (!z5) {
                    c27.a();
                    Q0(dz52, iz52, false);
                    return;
                }
                return;
            }
        }
        z5 = false;
        if (iz52.g) {
        }
        this.D = c27.c;
        this.E = O0();
        if (!z5) {
        }
    }

    public final boolean R0(int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.t == 0) {
            if (i == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != this.x) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == this.x) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == O0()) {
            return true;
        }
        return false;
    }

    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i, iz5 iz5) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = J0();
            i2 = 1;
        } else {
            i3 = I0();
            i2 = -1;
        }
        kz3 kz3 = this.v;
        kz3.a = true;
        Z0(i3, iz5);
        Y0(i2);
        kz3.c = i3 + kz3.d;
        kz3.b = Math.abs(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r0 == 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r0 == 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (O0() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (O0() == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    public final View T(View view, int i, dz5 dz5, iz5 iz5) {
        View view2;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.a.z).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                W0();
                int i7 = this.t;
                if (i == 1) {
                    if (i7 != 1) {
                    }
                    i2 = -1;
                    if (i2 != Integer.MIN_VALUE) {
                    }
                } else if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i == 66) {
                            }
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                    if (i2 != Integer.MIN_VALUE) {
                        d27 d27 = (d27) view2.getLayoutParams();
                        d27.getClass();
                        kd4 kd4 = d27.e;
                        if (i2 == 1) {
                            i3 = J0();
                        } else {
                            i3 = I0();
                        }
                        Z0(i3, iz5);
                        Y0(i2);
                        kz3 kz3 = this.v;
                        kz3.c = kz3.d + i3;
                        kz3.b = (int) (((float) this.r.n()) * 0.33333334f);
                        kz3.h = true;
                        kz3.a = false;
                        D0(dz5, kz3, iz5);
                        this.D = this.x;
                        View j = kd4.j(i3, i2);
                        if (j != null && j != view2) {
                            return j;
                        }
                        boolean R0 = R0(i2);
                        kd4[] kd4Arr = this.q;
                        int i8 = this.p;
                        if (R0) {
                            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                                View j2 = kd4Arr[i9].j(i3, i2);
                                if (j2 != null && j2 != view2) {
                                    return j2;
                                }
                            }
                        } else {
                            for (int i10 = 0; i10 < i8; i10++) {
                                View j3 = kd4Arr[i10].j(i3, i2);
                                if (j3 != null && j3 != view2) {
                                    return j3;
                                }
                            }
                        }
                        boolean z4 = !this.w;
                        if (i2 == -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z4 == z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            i4 = kd4.e();
                        } else {
                            i4 = kd4.f();
                        }
                        View q2 = q(i4);
                        if (q2 != null && q2 != view2) {
                            return q2;
                        }
                        if (R0(i2)) {
                            for (int i11 = i8 - 1; i11 >= 0; i11--) {
                                if (i11 != kd4.e) {
                                    if (z3) {
                                        i6 = kd4Arr[i11].e();
                                    } else {
                                        i6 = kd4Arr[i11].f();
                                    }
                                    View q3 = q(i6);
                                    if (!(q3 == null || q3 == view2)) {
                                        return q3;
                                    }
                                }
                            }
                        } else {
                            for (int i12 = 0; i12 < i8; i12++) {
                                if (z3) {
                                    i5 = kd4Arr[i12].e();
                                } else {
                                    i5 = kd4Arr[i12].f();
                                }
                                View q4 = q(i5);
                                if (q4 != null && q4 != view2) {
                                    return q4;
                                }
                            }
                        }
                    }
                } else if (i7 != 1) {
                }
                i2 = 1;
                if (i2 != Integer.MIN_VALUE) {
                }
            }
        }
        return null;
    }

    public final void T0(dz5 dz5, kz3 kz3) {
        if (kz3.a && !kz3.i) {
            int i = kz3.b;
            int i2 = kz3.e;
            if (i != 0) {
                int i3 = this.p;
                kd4[] kd4Arr = this.q;
                int i4 = 1;
                if (i2 == -1) {
                    int i5 = kz3.f;
                    int k = kd4Arr[0].k(i5);
                    while (i4 < i3) {
                        int k2 = kd4Arr[i4].k(i5);
                        if (k2 > k) {
                            k = k2;
                        }
                        i4++;
                    }
                    int i6 = i5 - k;
                    int i7 = kz3.g;
                    if (i6 >= 0) {
                        i7 -= Math.min(i6, kz3.b);
                    }
                    U0(dz5, i7);
                    return;
                }
                int i8 = kz3.g;
                int i9 = kd4Arr[0].i(i8);
                while (i4 < i3) {
                    int i10 = kd4Arr[i4].i(i8);
                    if (i10 < i9) {
                        i9 = i10;
                    }
                    i4++;
                }
                int i11 = i9 - kz3.g;
                int i12 = kz3.f;
                if (i11 >= 0) {
                    i12 += Math.min(i11, kz3.b);
                }
                V0(dz5, i12);
            } else if (i2 == -1) {
                U0(dz5, kz3.g);
            } else {
                V0(dz5, kz3.f);
            }
        }
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 != null && E0 != null) {
                int H2 = xy5.H(F0);
                int H3 = xy5.H(E0);
                if (H2 < H3) {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H3);
                    return;
                }
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    public final void U0(dz5 dz5, int i) {
        int v2 = v() - 1;
        while (v2 >= 0) {
            View u2 = u(v2);
            t22 t22 = this.r;
            if (t22.g(u2) >= i && t22.p(u2) >= i) {
                d27 d27 = (d27) u2.getLayoutParams();
                d27.getClass();
                if (((ArrayList) d27.e.f).size() != 1) {
                    kd4 kd4 = d27.e;
                    ArrayList arrayList = (ArrayList) kd4.f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    d27 d272 = (d27) view.getLayoutParams();
                    d272.e = null;
                    if (d272.a.h() || d272.a.k()) {
                        kd4.d -= ((StaggeredGridLayoutManager) kd4.g).r.e(view);
                    }
                    if (size == 1) {
                        kd4.b = Integer.MIN_VALUE;
                    }
                    kd4.c = Integer.MIN_VALUE;
                    j0(u2, dz5);
                    v2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void V0(dz5 dz5, int i) {
        while (v() > 0) {
            View u2 = u(0);
            t22 t22 = this.r;
            if (t22.d(u2) <= i && t22.o(u2) <= i) {
                d27 d27 = (d27) u2.getLayoutParams();
                d27.getClass();
                if (((ArrayList) d27.e.f).size() != 1) {
                    kd4 kd4 = d27.e;
                    ArrayList arrayList = (ArrayList) kd4.f;
                    View view = (View) arrayList.remove(0);
                    d27 d272 = (d27) view.getLayoutParams();
                    d272.e = null;
                    if (arrayList.size() == 0) {
                        kd4.c = Integer.MIN_VALUE;
                    }
                    if (d272.a.h() || d272.a.k()) {
                        kd4.d -= ((StaggeredGridLayoutManager) kd4.g).r.e(view);
                    }
                    kd4.b = Integer.MIN_VALUE;
                    j0(u2, dz5);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void W0() {
        if (this.t == 1 || !O0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    public final void X(int i, int i2) {
        M0(i, i2, 1);
    }

    public final int X0(int i, dz5 dz5, iz5 iz5) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, iz5);
        kz3 kz3 = this.v;
        int D0 = D0(dz5, kz3, iz5);
        if (kz3.b >= D0) {
            if (i < 0) {
                i = -D0;
            } else {
                i = D0;
            }
        }
        this.r.q(-i);
        this.D = this.x;
        kz3.b = 0;
        T0(dz5, kz3);
        return i;
    }

    public final void Y() {
        this.B.g();
        m0();
    }

    public final void Y0(int i) {
        boolean z2;
        kz3 kz3 = this.v;
        kz3.e = i;
        boolean z3 = this.x;
        int i2 = 1;
        if (i == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 != z2) {
            i2 = -1;
        }
        kz3.d = i2;
    }

    public final void Z(int i, int i2) {
        M0(i, i2, 8);
    }

    public final void Z0(int i, iz5 iz5) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        kz3 kz3 = this.v;
        boolean z3 = false;
        kz3.b = 0;
        kz3.c = i;
        w64 w64 = this.e;
        t22 t22 = this.r;
        if (w64 == null || !w64.e || (i4 = iz5.a) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            boolean z4 = this.x;
            if (i4 < i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z4 == z2) {
                i3 = t22.n();
                i2 = 0;
            } else {
                i2 = t22.n();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.C) {
            kz3.g = t22.h() + i3;
            kz3.f = -i2;
        } else {
            kz3.f = t22.m() - i2;
            kz3.g = t22.i() + i3;
        }
        kz3.h = false;
        kz3.a = true;
        if (t22.k() == 0 && t22.h() == 0) {
            z3 = true;
        }
        kz3.i = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r4 != r3.x) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.x != false) goto L_0x000c;
     */
    public final PointF a(int i) {
        boolean z2;
        int i2 = -1;
        if (v() != 0) {
            if (i < I0()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        i2 = 1;
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = (float) i2;
        return pointF;
    }

    public final void a0(int i, int i2) {
        M0(i, i2, 2);
    }

    public final void a1(kd4 kd4, int i, int i2) {
        int i3 = kd4.d;
        int i4 = kd4.e;
        BitSet bitSet = this.y;
        if (i == -1) {
            int i5 = kd4.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) kd4.f).get(0);
                kd4.b = ((StaggeredGridLayoutManager) kd4.g).r.g(view);
                ((d27) view.getLayoutParams()).getClass();
                i5 = kd4.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = kd4.c;
        if (i6 == Integer.MIN_VALUE) {
            kd4.a();
            i6 = kd4.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    public final void b0(int i, int i2) {
        M0(i, i2, 4);
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c0(dz5 dz5, iz5 iz5) {
        Q0(dz5, iz5, true);
    }

    public final boolean d() {
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    public final void d0(iz5 iz5) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final boolean e() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof f27) {
            f27 f27 = (f27) parcelable;
            this.F = f27;
            if (this.z != -1) {
                f27.w = -1;
                f27.x = -1;
                f27.z = null;
                f27.y = 0;
                f27.A = 0;
                f27.B = null;
                f27.C = null;
            }
            m0();
        }
    }

    public final boolean f(yy5 yy5) {
        return yy5 instanceof d27;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, f27] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.os.Parcelable, java.lang.Object, f27] */
    public final Parcelable f0() {
        int i;
        View view;
        int i2;
        int m;
        int[] iArr;
        f27 f27 = this.F;
        if (f27 != null) {
            ? obj = new Object();
            obj.y = f27.y;
            obj.w = f27.w;
            obj.x = f27.x;
            obj.z = f27.z;
            obj.A = f27.A;
            obj.B = f27.B;
            obj.D = f27.D;
            obj.E = f27.E;
            obj.F = f27.F;
            obj.C = f27.C;
            return obj;
        }
        ? obj2 = new Object();
        obj2.D = this.w;
        obj2.E = this.D;
        obj2.F = this.E;
        kg5 kg5 = this.B;
        if (kg5 == null || (iArr = (int[]) kg5.x) == null) {
            obj2.A = 0;
        } else {
            obj2.B = iArr;
            obj2.A = iArr.length;
            obj2.C = (ArrayList) kg5.y;
        }
        int i3 = -1;
        if (v() > 0) {
            if (this.D) {
                i = J0();
            } else {
                i = I0();
            }
            obj2.w = i;
            if (this.x) {
                view = E0(true);
            } else {
                view = F0(true);
            }
            if (view != null) {
                i3 = xy5.H(view);
            }
            obj2.x = i3;
            int i4 = this.p;
            obj2.y = i4;
            obj2.z = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                boolean z2 = this.D;
                t22 t22 = this.r;
                kd4[] kd4Arr = this.q;
                if (z2) {
                    i2 = kd4Arr[i5].i(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        m = t22.i();
                    } else {
                        obj2.z[i5] = i2;
                    }
                } else {
                    i2 = kd4Arr[i5].k(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        m = t22.m();
                    } else {
                        obj2.z[i5] = i2;
                    }
                }
                i2 -= m;
                obj2.z[i5] = i2;
            }
            return obj2;
        }
        obj2.w = -1;
        obj2.x = -1;
        obj2.y = 0;
        return obj2;
    }

    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    public final void h(int i, int i2, iz5 iz5, tt2 tt2) {
        kz3 kz3;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            S0(i, iz5);
            int[] iArr = this.J;
            int i4 = this.p;
            if (iArr == null || iArr.length < i4) {
                this.J = new int[i4];
            }
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                kz3 = this.v;
                if (i6 >= i4) {
                    break;
                }
                int i8 = kz3.d;
                kd4[] kd4Arr = this.q;
                if (i8 == -1) {
                    int i9 = kz3.f;
                    i3 = i9 - kd4Arr[i6].k(i9);
                } else {
                    i3 = kd4Arr[i6].i(kz3.g) - kz3.g;
                }
                if (i3 >= 0) {
                    this.J[i7] = i3;
                    i7++;
                }
                i6++;
            }
            Arrays.sort(this.J, 0, i7);
            while (i5 < i7) {
                int i10 = kz3.c;
                if (i10 >= 0 && i10 < iz5.b()) {
                    tt2.a(kz3.c, this.J[i5]);
                    kz3.c += kz3.d;
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public final int j(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return p25.e(iz5, this.r, F0(z2), E0(z2), this, this.I);
    }

    public final int k(iz5 iz5) {
        return C0(iz5);
    }

    public final int l(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return p25.g(iz5, this.r, F0(z2), E0(z2), this, this.I);
    }

    public final int m(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return p25.e(iz5, this.r, F0(z2), E0(z2), this, this.I);
    }

    public final int n(iz5 iz5) {
        return C0(iz5);
    }

    public final int n0(int i, dz5 dz5, iz5 iz5) {
        return X0(i, dz5, iz5);
    }

    public final int o(iz5 iz5) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return p25.g(iz5, this.r, F0(z2), E0(z2), this, this.I);
    }

    public final void o0(int i) {
        f27 f27 = this.F;
        if (!(f27 == null || f27.w == i)) {
            f27.z = null;
            f27.y = 0;
            f27.w = -1;
            f27.x = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    public final int p0(int i, dz5 dz5, iz5 iz5) {
        return X0(i, dz5, iz5);
    }

    public final yy5 r() {
        if (this.t == 0) {
            return new yy5(-2, -1);
        }
        return new yy5(-1, -2);
    }

    public final yy5 s(Context context, AttributeSet attributeSet) {
        return new yy5(context, attributeSet);
    }

    public final void s0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int F2 = F() + E();
        int D2 = D() + G();
        int i5 = this.t;
        int i6 = this.p;
        if (i5 == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = e58.a;
            i4 = xy5.g(i2, height, recyclerView.getMinimumHeight());
            i3 = xy5.g(i, (this.u * i6) + F2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = e58.a;
            i3 = xy5.g(i, width, recyclerView2.getMinimumWidth());
            i4 = xy5.g(i2, (this.u * i6) + D2, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    public final yy5 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new yy5((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new yy5(layoutParams);
    }

    public final void y0(RecyclerView recyclerView, int i) {
        w64 w64 = new w64(recyclerView.getContext());
        w64.a = i;
        z0(w64);
    }
}
