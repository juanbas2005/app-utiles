package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: xy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xy5 {
    public wr0 a;
    public RecyclerView b;
    public final kg5 c;
    public final kg5 d;
    public w64 e;
    public boolean f = false;
    public boolean g = false;
    public final boolean h = true;
    public final boolean i = true;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public xy5() {
        rg4 rg4 = new rg4(4, (Object) this);
        ay4 ay4 = new ay4(5, this);
        this.c = new kg5((q48) rg4);
        this.d = new kg5((q48) ay4);
    }

    public static int A(View view) {
        Rect rect = ((yy5) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((yy5) view.getLayoutParams()).a.b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [wy5, java.lang.Object] */
    public static wy5 I(Context context, AttributeSet attributeSet, int i2, int i3) {
        ? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nv5.a, i2, i3);
        obj.a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i2) {
                return true;
            }
            return false;
        } else if (size >= i2) {
            return true;
        } else {
            return false;
        }
    }

    public static void N(View view, int i2, int i3, int i4, int i5) {
        yy5 yy5 = (yy5) view.getLayoutParams();
        Rect rect = yy5.b;
        view.layout(i2 + rect.left + yy5.leftMargin, i3 + rect.top + yy5.topMargin, (i4 - rect.right) - yy5.rightMargin, (i5 - rect.bottom) - yy5.bottomMargin);
    }

    public static int g(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i3, i4));
        }
        if (mode != 1073741824) {
            return Math.max(i3, i4);
        }
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r6 == 1073741824) goto L_0x0022;
     */
    public static int w(boolean z, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, i2 - i4);
        if (z) {
            if (i5 < 0) {
                if (i5 == -1) {
                    if (i3 != Integer.MIN_VALUE) {
                        if (i3 != 0) {
                        }
                    }
                    i5 = max;
                    return View.MeasureSpec.makeMeasureSpec(i5, i3);
                }
                i3 = 0;
                i5 = 0;
                return View.MeasureSpec.makeMeasureSpec(i5, i3);
            }
        } else if (i5 < 0) {
            if (i5 != -1) {
                if (i5 == -2) {
                    if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                        i5 = max;
                        i3 = Integer.MIN_VALUE;
                    } else {
                        i5 = max;
                        i3 = 0;
                    }
                    return View.MeasureSpec.makeMeasureSpec(i5, i3);
                }
                i3 = 0;
                i5 = 0;
                return View.MeasureSpec.makeMeasureSpec(i5, i3);
            }
            i5 = max;
            return View.MeasureSpec.makeMeasureSpec(i5, i3);
        }
        i3 = 1073741824;
        return View.MeasureSpec.makeMeasureSpec(i5, i3);
    }

    public static int z(View view) {
        Rect rect = ((yy5) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        py5 py5;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            py5 = recyclerView.getAdapter();
        } else {
            py5 = null;
        }
        if (py5 != null) {
            return py5.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = e58.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(dz5 dz5, iz5 iz5) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((yy5) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.b.F;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int F = recyclerView.A.F();
            for (int i3 = 0; i3 < F; i3++) {
                recyclerView.A.E(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void P(int i2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int F = recyclerView.A.F();
            for (int i3 = 0; i3 < F; i3++) {
                recyclerView.A.E(i3).offsetTopAndBottom(i2);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i2, dz5 dz5, iz5 iz5);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        dz5 dz5 = recyclerView.x;
        iz5 iz5 = recyclerView.z0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            py5 py5 = this.b.G;
            if (py5 != null) {
                accessibilityEvent.setItemCount(py5.a());
            }
        }
    }

    public final void W(View view, c5 c5Var) {
        lz5 I = RecyclerView.I(view);
        if (I != null && !I.h()) {
            wr0 wr0 = this.a;
            if (!((ArrayList) wr0.z).contains(I.a)) {
                RecyclerView recyclerView = this.b;
                V(recyclerView.x, recyclerView.z0, view, c5Var);
            }
        }
    }

    public final void b(View view, int i2, boolean z) {
        int i3;
        lz5 I = RecyclerView.I(view);
        if (z || I.h()) {
            zt6 zt6 = (zt6) this.b.B.x;
            m58 m58 = (m58) zt6.get(I);
            if (m58 == null) {
                m58 = m58.a();
                zt6.put(I, m58);
            }
            m58.a |= 1;
        } else {
            this.b.B.M(I);
        }
        yy5 yy5 = (yy5) view.getLayoutParams();
        if (I.p() || I.i()) {
            if (I.i()) {
                I.n.k(I);
            } else {
                I.j &= -33;
            }
            this.a.n(view, i2, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            wr0 wr0 = this.a;
            int i4 = -1;
            if (parent == recyclerView) {
                cp0 cp0 = (cp0) wr0.y;
                int indexOfChild = ((RecyclerView) ((ay4) wr0.x).x).indexOfChild(view);
                if (indexOfChild != -1 && !cp0.d(indexOfChild)) {
                    i3 = indexOfChild - cp0.b(indexOfChild);
                } else {
                    i3 = -1;
                }
                if (i2 == -1) {
                    i2 = this.a.F();
                }
                if (i3 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.y());
                } else if (i3 != i2) {
                    xy5 xy5 = this.b.H;
                    View u = xy5.u(i3);
                    if (u != null) {
                        xy5.u(i3);
                        xy5.a.y(i3);
                        yy5 yy52 = (yy5) u.getLayoutParams();
                        lz5 I2 = RecyclerView.I(u);
                        boolean h2 = I2.h();
                        RecyclerView recyclerView2 = xy5.b;
                        if (h2) {
                            zt6 zt62 = (zt6) recyclerView2.B.x;
                            m58 m582 = (m58) zt62.get(I2);
                            if (m582 == null) {
                                m582 = m58.a();
                                zt62.put(I2, m582);
                            }
                            m582.a = 1 | m582.a;
                        } else {
                            recyclerView2.B.M(I2);
                        }
                        xy5.a.n(u, i2, yy52, I2.h());
                    } else {
                        RecyclerView recyclerView3 = xy5.b;
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i3 + recyclerView3.toString());
                    }
                }
            } else {
                wr0.m(view, i2, false);
                yy5.c = true;
                w64 w64 = this.e;
                if (w64 != null && w64.e) {
                    w64.b.getClass();
                    lz5 I3 = RecyclerView.I(view);
                    if (I3 != null) {
                        i4 = I3.b();
                    }
                    if (i4 == w64.a) {
                        w64.f = view;
                    }
                }
            }
        }
        if (yy5.d) {
            I.a.invalidate();
            yy5.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(dz5 dz5, iz5 iz5);

    public abstract boolean d();

    public abstract void d0(iz5 iz5);

    public abstract boolean e();

    public boolean f(yy5 yy5) {
        if (yy5 != null) {
            return true;
        }
        return false;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(dz5 dz5) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.I(u(v)).o()) {
                View u = u(v);
                k0(v);
                dz5.g(u);
            }
        }
    }

    public final void i0(dz5 dz5) {
        ArrayList arrayList;
        int size = dz5.a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = dz5.a;
            if (i2 < 0) {
                break;
            }
            View view = ((lz5) arrayList.get(i2)).a;
            lz5 I = RecyclerView.I(view);
            if (!I.o()) {
                I.n(false);
                if (I.j()) {
                    this.b.removeDetachedView(view, false);
                }
                ty5 ty5 = this.b.h0;
                if (ty5 != null) {
                    ty5.d(I);
                }
                I.n(true);
                lz5 I2 = RecyclerView.I(view);
                I2.n = null;
                I2.o = false;
                I2.j &= -33;
                dz5.h(I2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = dz5.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(iz5 iz5);

    public final void j0(View view, dz5 dz5) {
        wr0 wr0 = this.a;
        ay4 ay4 = (ay4) wr0.x;
        int indexOfChild = ((RecyclerView) ay4.x).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((cp0) wr0.y).i(indexOfChild)) {
                wr0.i0(view);
            }
            ay4.v(indexOfChild);
        }
        dz5.g(view);
    }

    public abstract int k(iz5 iz5);

    public final void k0(int i2) {
        if (u(i2) != null) {
            wr0 wr0 = this.a;
            int K = wr0.K(i2);
            ay4 ay4 = (ay4) wr0.x;
            View childAt = ((RecyclerView) ay4.x).getChildAt(K);
            if (childAt != null) {
                if (((cp0) wr0.y).i(K)) {
                    wr0.i0(childAt);
                }
                ay4.v(K);
            }
        }
    }

    public abstract int l(iz5 iz5);

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L_0x00ae;
     */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int E = E();
        int G = G();
        int F = this.n - F();
        int D = this.o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - E;
        int min = Math.min(0, i2);
        int i3 = top - G;
        int min2 = Math.min(0, i3);
        int i4 = width - F;
        int max = Math.max(0, i4);
        int max2 = Math.max(0, height - D);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i2, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i4);
        }
        if (min2 == 0) {
            min2 = Math.min(i3, max2);
        }
        int[] iArr = {max, min2};
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E2 = E();
                int G2 = G();
                int F2 = this.n - F();
                int D2 = this.o - D();
                Rect rect2 = this.b.D;
                y(focusedChild, rect2);
                if (rect2.left - i5 < F2) {
                    if (rect2.right - i5 > E2) {
                        if (rect2.top - i6 < D2) {
                        }
                    }
                }
            }
            return false;
        }
        if (!(i5 == 0 && i6 == 0)) {
            if (z) {
                recyclerView.scrollBy(i5, i6);
                return true;
            }
            recyclerView.Z(i5, i6, false);
            return true;
        }
        return false;
    }

    public abstract int m(iz5 iz5);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(iz5 iz5);

    public abstract int n0(int i2, dz5 dz5, iz5 iz5);

    public abstract int o(iz5 iz5);

    public abstract void o0(int i2);

    public final void p(dz5 dz5) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            lz5 I = RecyclerView.I(u);
            if (!I.o()) {
                if (!I.f() || I.h() || this.b.G.b) {
                    u(v);
                    this.a.y(v);
                    dz5.i(u);
                    this.b.B.M(I);
                } else {
                    k0(v);
                    dz5.h(I);
                }
            }
        }
    }

    public abstract int p0(int i2, dz5 dz5, iz5 iz5);

    public View q(int i2) {
        int v = v();
        for (int i3 = 0; i3 < v; i3++) {
            View u = u(i3);
            lz5 I = RecyclerView.I(u);
            if (I != null && I.b() == i2 && !I.o() && (this.b.z0.g || !I.h())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract yy5 r();

    public final void r0(int i2, int i3) {
        this.n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.S0;
        }
        this.o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.S0;
        }
    }

    public yy5 s(Context context, AttributeSet attributeSet) {
        return new yy5(context, attributeSet);
    }

    public void s0(Rect rect, int i2, int i3) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = e58.a;
        this.b.setMeasuredDimension(g(i2, F, recyclerView.getMinimumWidth()), g(i3, D, this.b.getMinimumHeight()));
    }

    public yy5 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof yy5) {
            return new yy5((yy5) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new yy5((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new yy5(layoutParams);
    }

    public final void t0(int i2, int i3) {
        int v = v();
        if (v == 0) {
            this.b.n(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < v; i8++) {
            View u = u(i8);
            Rect rect = this.b.D;
            y(u, rect);
            int i9 = rect.left;
            if (i9 < i7) {
                i7 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i5) {
                i5 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i6) {
                i6 = i12;
            }
        }
        this.b.D.set(i7, i5, i4, i6);
        s0(this.b.D, i2, i3);
    }

    public final View u(int i2) {
        wr0 wr0 = this.a;
        if (wr0 != null) {
            return wr0.E(i2);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.A;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int v() {
        wr0 wr0 = this.a;
        if (wr0 != null) {
            return wr0.F();
        }
        return 0;
    }

    public final boolean v0(View view, int i2, int i3, yy5 yy5) {
        if (view.isLayoutRequested() || !this.h || !M(view.getWidth(), i2, yy5.width) || !M(view.getHeight(), i3, yy5.height)) {
            return true;
        }
        return false;
    }

    public boolean w0() {
        return false;
    }

    public int x(dz5 dz5, iz5 iz5) {
        return -1;
    }

    public final boolean x0(View view, int i2, int i3, yy5 yy5) {
        if (!this.h || !M(view.getMeasuredWidth(), i2, yy5.width) || !M(view.getMeasuredHeight(), i3, yy5.height)) {
            return true;
        }
        return false;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.S0;
        yy5 yy5 = (yy5) view.getLayoutParams();
        Rect rect2 = yy5.b;
        rect.set((view.getLeft() - rect2.left) - yy5.leftMargin, (view.getTop() - rect2.top) - yy5.topMargin, view.getRight() + rect2.right + yy5.rightMargin, view.getBottom() + rect2.bottom + yy5.bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i2);

    public final void z0(w64 w64) {
        w64 w642 = this.e;
        if (!(w642 == null || w64 == w642 || !w642.e)) {
            w642.i();
        }
        this.e = w64;
        RecyclerView recyclerView = this.b;
        kz5 kz5 = recyclerView.w0;
        kz5.C.removeCallbacks(kz5);
        kz5.y.abortAnimation();
        if (w64.h) {
            Log.w("RecyclerView", "An instance of " + w64.getClass().getSimpleName() + " was started more than once. Each instance of" + w64.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        w64.b = recyclerView;
        w64.c = this;
        int i2 = w64.a;
        if (i2 != -1) {
            recyclerView.z0.a = i2;
            w64.e = true;
            w64.d = true;
            w64.f = recyclerView.H.q(i2);
            w64.b.w0.a();
            w64.h = true;
            return;
        }
        h.q("Invalid target position");
    }

    public void Q() {
    }

    public void Y() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i2) {
    }

    public void X(int i2, int i3) {
    }

    public void Z(int i2, int i3) {
    }

    public void a0(int i2, int i3) {
    }

    public void b0(int i2, int i3) {
    }

    public void i(int i2, tt2 tt2) {
    }

    public void V(dz5 dz5, iz5 iz5, View view, c5 c5Var) {
    }

    public void h(int i2, int i3, iz5 iz5, tt2 tt2) {
    }
}
