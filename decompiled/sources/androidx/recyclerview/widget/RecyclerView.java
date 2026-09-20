package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class RecyclerView extends ViewGroup {
    public static final int[] S0 = {16843830};
    public static final Class[] T0;
    public static final oy5 U0 = new oy5(0);
    public final wr0 A;
    public az5 A0;
    public final kg5 B;
    public ArrayList B0;
    public boolean C;
    public boolean C0;
    public final Rect D;
    public boolean D0;
    public final Rect E;
    public final uy5 E0;
    public final RectF F;
    public boolean F0;
    public py5 G;
    public nz5 G0;
    public xy5 H;
    public final int[] H0;
    public final ArrayList I;
    public dy4 I0;
    public final ArrayList J;
    public final int[] J0;
    public final ArrayList K;
    public final int[] K0;
    public wb2 L;
    public final int[] L0;
    public boolean M;
    public final ArrayList M0;
    public boolean N;
    public final ge N0;
    public boolean O;
    public boolean O0;
    public int P;
    public int P0;
    public boolean Q;
    public int Q0;
    public boolean R;
    public final rg4 R0;
    public boolean S;
    public int T;
    public final AccessibilityManager U;
    public boolean V;
    public boolean W;
    public int a0;
    public int b0;
    public sy5 c0;
    public EdgeEffect d0;
    public EdgeEffect e0;
    public EdgeEffect f0;
    public EdgeEffect g0;
    public ty5 h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public zy5 q0;
    public final int r0;
    public final int s0;
    public final float t0;
    public final float u0;
    public boolean v0;
    public final z53 w;
    public final kz5 w0;
    public final dz5 x;
    public eu2 x0;
    public fz5 y;
    public final tt2 y0;
    public final o9 z;
    public final iz5 z0;

    static {
        Class cls = Integer.TYPE;
        T0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, sy5] */
    /* JADX WARNING: type inference failed for: r0v10, types: [ty5, java.lang.Object, jm1] */
    /* JADX WARNING: type inference failed for: r3v16, types: [iz5, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f;
        float f2;
        boolean z2;
        int i2;
        TypedArray typedArray;
        char c;
        char c2;
        AttributeSet attributeSet2;
        int i3;
        Context context2;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context3 = context;
        AttributeSet attributeSet3 = attributeSet;
        int i4 = i;
        this.w = new z53(this);
        this.x = new dz5(this);
        this.B = new kg5(29);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new RectF();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.P = 0;
        this.V = false;
        this.W = false;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = new Object();
        ? obj = new Object();
        obj.a = null;
        obj.b = new ArrayList();
        obj.c = 120;
        obj.d = 120;
        obj.e = 250;
        obj.f = 250;
        obj.g = true;
        obj.h = new ArrayList();
        obj.i = new ArrayList();
        obj.j = new ArrayList();
        obj.k = new ArrayList();
        obj.l = new ArrayList();
        obj.m = new ArrayList();
        obj.n = new ArrayList();
        obj.o = new ArrayList();
        obj.p = new ArrayList();
        obj.q = new ArrayList();
        obj.r = new ArrayList();
        this.h0 = obj;
        this.i0 = 0;
        this.j0 = -1;
        this.t0 = Float.MIN_VALUE;
        this.u0 = Float.MIN_VALUE;
        this.v0 = true;
        this.w0 = new kz5(this);
        this.y0 = new tt2(1);
        ? obj2 = new Object();
        obj2.a = -1;
        obj2.b = 0;
        obj2.c = 0;
        obj2.d = 1;
        obj2.e = 0;
        obj2.f = false;
        obj2.g = false;
        obj2.h = false;
        obj2.i = false;
        obj2.j = false;
        obj2.k = false;
        this.z0 = obj2;
        this.C0 = false;
        this.D0 = false;
        uy5 uy5 = new uy5(0, (Object) this);
        this.E0 = uy5;
        this.F0 = false;
        this.H0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new int[2];
        this.M0 = new ArrayList();
        this.N0 = new ge(11, (Object) this);
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = new rg4(3, (Object) this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context3);
        this.p0 = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = h58.a;
            f = an.f(viewConfiguration);
        } else {
            f = h58.a(viewConfiguration, context3);
        }
        this.t0 = f;
        if (i5 >= 26) {
            f2 = an.g(viewConfiguration);
        } else {
            f2 = h58.a(viewConfiguration, context3);
        }
        this.u0 = f2;
        this.r0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s0 = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        this.h0.a = uy5;
        this.z = new o9(new br4(7, (Object) this));
        this.A = new wr0(new ay4(4, this));
        WeakHashMap weakHashMap = e58.a;
        if (i5 >= 26) {
            i2 = y48.a(this);
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i5 >= 26) {
            y48.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.U = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new nz5(this));
        int[] iArr = nv5.a;
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet3, iArr, i4, 0);
        e58.l(this, context3, iArr, attributeSet3, obtainStyledAttributes, i4);
        TypedArray typedArray2 = obtainStyledAttributes;
        String string = typedArray2.getString(8);
        if (typedArray2.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.C = typedArray2.getBoolean(1, true);
        if (typedArray2.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray2.getDrawable(6);
            Drawable drawable = typedArray2.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray2.getDrawable(4);
            Drawable drawable2 = typedArray2.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                h.q("Trying to set fast scroller without both required drawables.".concat(y()));
                throw null;
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range);
            c2 = 2;
            int i6 = dimensionPixelSize;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.fastscroll_margin);
            int i7 = i6;
            context2 = context;
            typedArray = typedArray2;
            c = 3;
            int i8 = dimensionPixelSize2;
            attributeSet2 = attributeSet;
            i3 = i;
            new wb2(this, stateListDrawable, drawable, stateListDrawable2, drawable2, i7, i8, dimensionPixelOffset);
        } else {
            attributeSet2 = attributeSet;
            typedArray = typedArray2;
            c2 = 2;
            c = 3;
            context2 = context;
            i3 = i;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context2.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context2.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(xy5.class);
                    try {
                        constructor = asSubclass.getConstructor(T0);
                        objArr = new Object[4];
                        objArr[0] = context2;
                        objArr[1] = attributeSet2;
                        objArr[c2] = Integer.valueOf(i3);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        noSuchMethodException = e;
                        constructor = asSubclass.getConstructor((Class[]) null);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((xy5) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                } catch (ClassNotFoundException e3) {
                    ku4.h(attributeSet2.getPositionDescription(), ": Unable to find LayoutManager ", str, e3);
                    throw null;
                } catch (InvocationTargetException e4) {
                    ku4.h(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e4);
                    throw null;
                } catch (InstantiationException e5) {
                    ku4.h(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e5);
                    throw null;
                } catch (IllegalAccessException e6) {
                    ku4.h(attributeSet2.getPositionDescription(), ": Cannot access non-public constructor ", str, e6);
                    throw null;
                } catch (ClassCastException e7) {
                    ku4.h(attributeSet2.getPositionDescription(), ": Class is not a LayoutManager ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = S0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i3, 0);
        e58.l(this, context2, iArr2, attributeSet2, obtainStyledAttributes2, i3);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static lz5 I(View view) {
        if (view == null) {
            return null;
        }
        return ((yy5) view.getLayoutParams()).a;
    }

    private dy4 getScrollingChildHelper() {
        if (this.I0 == null) {
            this.I0 = new dy4(this);
        }
        return this.I0;
    }

    public static void j(lz5 lz5) {
        WeakReference weakReference = lz5.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != lz5.a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            lz5.b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wb2 wb2 = (wb2) arrayList.get(i);
            int i2 = wb2.v;
            if (i2 == 1) {
                boolean d = wb2.d(motionEvent.getX(), motionEvent.getY());
                boolean c = wb2.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c)) {
                    if (c) {
                        wb2.w = 1;
                        wb2.p = (float) ((int) motionEvent.getX());
                    } else if (d) {
                        wb2.w = 2;
                        wb2.m = (float) ((int) motionEvent.getY());
                    }
                    wb2.f(2);
                }
            } else if (i2 != 2) {
                continue;
            }
            if (action != 3) {
                this.L = wb2;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        wr0 wr0 = this.A;
        int F2 = wr0.F();
        if (F2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < F2; i3++) {
            lz5 I2 = I(wr0.E(i3));
            if (!I2.o()) {
                int b = I2.b();
                if (b < i) {
                    i = b;
                }
                if (b > i2) {
                    i2 = b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final lz5 E(int i) {
        lz5 lz5 = null;
        if (this.V) {
            return null;
        }
        wr0 wr0 = this.A;
        int N2 = wr0.N();
        for (int i2 = 0; i2 < N2; i2++) {
            lz5 I2 = I(wr0.M(i2));
            if (I2 != null && !I2.h() && F(I2) == i) {
                if (!((ArrayList) wr0.z).contains(I2.a)) {
                    return I2;
                }
                lz5 = I2;
            }
        }
        return lz5;
    }

    public final int F(lz5 lz5) {
        if ((lz5.j & 524) == 0 && lz5.e()) {
            int i = lz5.c;
            ArrayList arrayList = (ArrayList) this.z.y;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                n9 n9Var = (n9) arrayList.get(i2);
                int i3 = n9Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = n9Var.b;
                        if (i4 <= i) {
                            int i5 = n9Var.c;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = n9Var.b;
                        if (i6 == i) {
                            i = n9Var.c;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (n9Var.c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (n9Var.b <= i) {
                    i += n9Var.c;
                }
            }
            return i;
        }
        return -1;
    }

    public final long G(lz5 lz5) {
        if (this.G.b) {
            return lz5.e;
        }
        return (long) lz5.c;
    }

    public final lz5 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        ta1.i("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect J(View view) {
        yy5 yy5 = (yy5) view.getLayoutParams();
        boolean z2 = yy5.c;
        Rect rect = yy5.b;
        if (!z2 || (this.z0.g && (yy5.a.k() || yy5.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.D;
            rect2.set(0, 0, 0, 0);
            ((vy5) arrayList.get(i)).getClass();
            ((yy5) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        yy5.c = false;
        return rect;
    }

    public final boolean K() {
        if (!this.O || this.V || this.z.C()) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (this.a0 > 0) {
            return true;
        }
        return false;
    }

    public final void M(int i) {
        if (this.H != null) {
            setScrollState(2);
            this.H.o0(i);
            awakenScrollBars();
        }
    }

    public final void N() {
        wr0 wr0 = this.A;
        int N2 = wr0.N();
        for (int i = 0; i < N2; i++) {
            ((yy5) wr0.M(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.x.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yy5 yy5 = (yy5) ((lz5) arrayList.get(i2)).a.getLayoutParams();
            if (yy5 != null) {
                yy5.c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        wr0 wr0 = this.A;
        int N2 = wr0.N();
        for (int i4 = 0; i4 < N2; i4++) {
            lz5 I2 = I(wr0.M(i4));
            if (I2 != null && !I2.o()) {
                int i5 = I2.c;
                iz5 iz5 = this.z0;
                if (i5 >= i3) {
                    I2.l(-i2, z2);
                    iz5.f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.l(-i2, z2);
                    I2.c = i - 1;
                    iz5.f = true;
                }
            }
        }
        dz5 dz5 = this.x;
        ArrayList arrayList = dz5.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lz5 lz5 = (lz5) arrayList.get(size);
            if (lz5 != null) {
                int i6 = lz5.c;
                if (i6 >= i3) {
                    lz5.l(-i2, z2);
                } else if (i6 >= i) {
                    lz5.a(8);
                    dz5.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.a0++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.a0 - 1;
        this.a0 = i2;
        if (i2 < 1) {
            this.a0 = 0;
            if (z2) {
                int i3 = this.T;
                this.T = 0;
                if (!(i3 == 0 || (accessibilityManager = this.U) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.M0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    lz5 lz5 = (lz5) arrayList.get(size);
                    if (lz5.a.getParent() == this && !lz5.o() && (i = lz5.q) != -1) {
                        View view = lz5.a;
                        WeakHashMap weakHashMap = e58.a;
                        view.setImportantForAccessibility(i);
                        lz5.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.j0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.j0 = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.n0 = x2;
            this.l0 = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.o0 = y2;
            this.m0 = y2;
        }
    }

    public final void S() {
        if (!this.F0 && this.M) {
            WeakHashMap weakHashMap = e58.a;
            postOnAnimation(this.N0);
            this.F0 = true;
        }
    }

    public final void T(lz5 lz5, dv5 dv5) {
        lz5.j &= -8193;
        boolean z2 = this.z0.h;
        kg5 kg5 = this.B;
        if (z2 && lz5.k() && !lz5.h() && !lz5.o()) {
            ((vc4) kg5.y).e(G(lz5), lz5);
        }
        zt6 zt6 = (zt6) kg5.x;
        m58 m58 = (m58) zt6.get(lz5);
        if (m58 == null) {
            m58 = m58.a();
            zt6.put(lz5, m58);
        }
        m58.b = dv5;
        m58.a |= 4;
    }

    public final void U(View view, View view2) {
        View view3;
        boolean z2;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof yy5) {
            yy5 yy5 = (yy5) layoutParams;
            if (!yy5.c) {
                Rect rect2 = yy5.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        xy5 xy5 = this.H;
        boolean z3 = !this.O;
        if (view2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        xy5.l0(this, view, this.D, z3, z2);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.d0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.d0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.e0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.g0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.g0.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = e58.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e1  */
    public final boolean W(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        int i8 = i;
        int i9 = i2;
        m();
        py5 py5 = this.G;
        int[] iArr = this.L0;
        if (py5 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            X(i8, i9, iArr);
            i7 = iArr[0];
            i6 = iArr[1];
            i5 = i8 - i7;
            i4 = i9 - i6;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.J.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i7, i6, i5, i4, this.J0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i5 - i10;
        int i12 = iArr[1];
        int i13 = i4 - i12;
        if (i10 == 0 && i12 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i14 = this.n0;
        int[] iArr2 = this.J0;
        int i15 = iArr2[0];
        this.n0 = i14 - i15;
        int i16 = this.o0;
        int i17 = iArr2[1];
        this.o0 = i16 - i17;
        int[] iArr3 = this.K0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z3 = true;
            } else {
                float x2 = motionEvent.getX();
                float f = (float) i11;
                float y2 = motionEvent.getY();
                float f2 = (float) i13;
                if (f < 0.0f) {
                    v();
                    z3 = true;
                    this.d0.onPull((-f) / ((float) getWidth()), 1.0f - (y2 / ((float) getHeight())));
                } else {
                    z3 = true;
                    if (f > 0.0f) {
                        w();
                        this.f0.onPull(f / ((float) getWidth()), y2 / ((float) getHeight()));
                    } else {
                        z4 = false;
                        if (f2 >= 0.0f) {
                            x();
                            this.e0.onPull((-f2) / ((float) getHeight()), x2 / ((float) getWidth()));
                        } else {
                            if (f2 > 0.0f) {
                                u();
                                this.g0.onPull(f2 / ((float) getHeight()), 1.0f - (x2 / ((float) getWidth())));
                            }
                            if (!(!z4 && f == 0.0f && f2 == 0.0f)) {
                                WeakHashMap weakHashMap = e58.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z4 = z3;
                        WeakHashMap weakHashMap2 = e58.a;
                        postInvalidateOnAnimation();
                    }
                }
                z4 = z3;
                if (f2 >= 0.0f) {
                }
                z4 = z3;
                WeakHashMap weakHashMap22 = e58.a;
                postInvalidateOnAnimation();
            }
            l(i, i2);
        } else {
            z3 = true;
        }
        if (!(i7 == 0 && i6 == 0)) {
            t(i7, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z2 && i7 == 0 && i6 == 0) {
            return false;
        }
        return z3;
    }

    public final void X(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        lz5 lz5;
        a0();
        P();
        int i5 = uk7.a;
        Trace.beginSection("RV Scroll");
        iz5 iz5 = this.z0;
        z(iz5);
        dz5 dz5 = this.x;
        if (i != 0) {
            i3 = this.H.n0(i, dz5, iz5);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.H.p0(i2, dz5, iz5);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        wr0 wr0 = this.A;
        int F2 = wr0.F();
        for (int i6 = 0; i6 < F2; i6++) {
            View E2 = wr0.E(i6);
            lz5 H2 = H(E2);
            if (!(H2 == null || (lz5 = H2.i) == null)) {
                View view = lz5.a;
                int left = E2.getLeft();
                int top = E2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void Y(int i) {
        w64 w64;
        if (!this.R) {
            setScrollState(0);
            kz5 kz5 = this.w0;
            kz5.C.removeCallbacks(kz5);
            kz5.y.abortAnimation();
            xy5 xy5 = this.H;
            if (!(xy5 == null || (w64 = xy5.e) == null)) {
                w64.i();
            }
            xy5 xy52 = this.H;
            if (xy52 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            xy52.o0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        xy5 xy5 = this.H;
        if (xy5 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.R) {
            int i3 = 0;
            if (!xy5.d()) {
                i = 0;
            }
            if (!this.H.e()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z2) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().g(i3, 1);
                }
                this.w0.b(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void a0() {
        int i = this.P + 1;
        this.P = i;
        if (i == 1 && !this.R) {
            this.Q = false;
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        xy5 xy5 = this.H;
        if (xy5 != null) {
            xy5.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.P < 1) {
            this.P = 1;
        }
        if (!z2 && !this.R) {
            this.Q = false;
        }
        if (this.P == 1) {
            if (z2 && this.Q && !this.R && this.H != null && this.G != null) {
                o();
            }
            if (!this.R) {
                this.Q = false;
            }
        }
        this.P--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof yy5) || !this.H.f((yy5) layoutParams)) {
            return false;
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        xy5 xy5 = this.H;
        if (xy5 != null && xy5.d()) {
            return this.H.j(this.z0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        xy5 xy5 = this.H;
        if (xy5 != null && xy5.d()) {
            return this.H.k(this.z0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        xy5 xy5 = this.H;
        if (xy5 != null && xy5.d()) {
            return this.H.l(this.z0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        xy5 xy5 = this.H;
        if (xy5 != null && xy5.e()) {
            return this.H.m(this.z0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        xy5 xy5 = this.H;
        if (xy5 != null && xy5.e()) {
            return this.H.n(this.z0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        xy5 xy5 = this.H;
        if (xy5 != null && xy5.e()) {
            return this.H.o(this.z0);
        }
        return 0;
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().a(f, f2, z2);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        super.draw(canvas);
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((vy5) arrayList.get(i3)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.d0;
        boolean z6 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            if (this.C) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), 0.0f);
            EdgeEffect edgeEffect2 = this.d0;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.C) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.e0;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.C) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i, (float) (-width));
            EdgeEffect edgeEffect6 = this.f0;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.g0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.C) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.g0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z2 |= z5;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.h0 == null || arrayList.size() <= 0 || !this.h0.f()) {
            z6 = z2;
        }
        if (z6) {
            WeakHashMap weakHashMap = e58.a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void f(lz5 lz5) {
        boolean z2;
        View view = lz5.a;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x.k(H(view));
        boolean j = lz5.j();
        wr0 wr0 = this.A;
        if (j) {
            wr0.n(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            wr0.m(view, -1, true);
        } else {
            int indexOfChild = ((RecyclerView) ((ay4) wr0.x).x).indexOfChild(view);
            if (indexOfChild >= 0) {
                ((cp0) wr0.y).l(indexOfChild);
                wr0.R(view);
                return;
            }
            kj6.o("view is not a child, cannot hide ", view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0162, code lost:
        if (r16 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0180, code lost:
        if (r5 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0183, code lost:
        if (r16 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0186, code lost:
        if (r5 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018e, code lost:
        if ((r5 * r6) <= 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0196, code lost:
        if ((r5 * r6) >= 0) goto L_0x0199;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca A[ADDED_TO_REGION] */
    public final View focusSearch(View view, int i) {
        boolean z2;
        View view2;
        int i2;
        int i3;
        char c;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        View view3 = view;
        int i6 = i;
        this.H.getClass();
        if (this.G == null || this.H == null || L() || this.R) {
            z2 = false;
        } else {
            z2 = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        iz5 iz5 = this.z0;
        dz5 dz5 = this.x;
        if (!z2 || !(i6 == 2 || i6 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view3, i6);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
                if (view2 == null || view2.hasFocusable()) {
                    if (!(view2 == null || view2 == this || view2 == view3 || A(view2) == null)) {
                        if (!(view3 == null || A(view) == null)) {
                            int width = view3.getWidth();
                            int height = view3.getHeight();
                            Rect rect = this.D;
                            rect.set(0, 0, width, height);
                            int width2 = view2.getWidth();
                            int height2 = view2.getHeight();
                            Rect rect2 = this.E;
                            rect2.set(0, 0, width2, height2);
                            offsetDescendantRectToMyCoords(view3, rect);
                            offsetDescendantRectToMyCoords(view2, rect2);
                            if (this.H.C() == 1) {
                                i2 = -1;
                            } else {
                                i2 = 1;
                            }
                            int i7 = rect.left;
                            int i8 = rect2.left;
                            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                                i3 = 1;
                            } else {
                                int i9 = rect.right;
                                int i10 = rect2.right;
                                if ((i9 > i10 || i7 >= i10) && i7 > i8) {
                                    i3 = -1;
                                } else {
                                    i3 = 0;
                                }
                            }
                            int i11 = rect.top;
                            int i12 = rect2.top;
                            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                                c = 1;
                            } else {
                                int i13 = rect.bottom;
                                int i14 = rect2.bottom;
                                if ((i13 > i14 || i11 >= i14) && i11 > i12) {
                                    c = 65535;
                                } else {
                                    c = 0;
                                }
                            }
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 17) {
                                        if (i6 != 33) {
                                            if (i6 != 66) {
                                                if (i6 != 130) {
                                                    throw new IllegalArgumentException("Invalid direction: " + i6 + y());
                                                }
                                            }
                                        }
                                    }
                                } else if (c <= 0) {
                                    if (c == 0) {
                                    }
                                }
                            } else if (c >= 0) {
                                if (c == 0) {
                                }
                            }
                        }
                        return view2;
                    }
                    return super.focusSearch(view, i);
                } else if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                } else {
                    U(view2, (View) null);
                    return view3;
                }
            } else {
                m();
                if (A(view) != null) {
                    a0();
                    view2 = this.H.T(view3, i6, dz5, iz5);
                    b0(false);
                    if (view2 == null || view2.hasFocusable()) {
                    }
                }
            }
        } else {
            if (this.H.e()) {
                if (i6 == 2) {
                    i5 = 130;
                } else {
                    i5 = 33;
                }
                if (instance.findNextFocus(this, view3, i5) == null) {
                    z3 = true;
                    if (!z3 && this.H.d()) {
                        if (this.H.C() != 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i6 != 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!(z4 ^ z5)) {
                            i4 = 66;
                        } else {
                            i4 = 17;
                        }
                        if (instance.findNextFocus(this, view3, i4) != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        m();
                        if (A(view) != null) {
                            a0();
                            this.H.T(view3, i6, dz5, iz5);
                            b0(false);
                        }
                    }
                    view2 = instance.findNextFocus(this, view3, i6);
                    if (view2 == null || view2.hasFocusable()) {
                    }
                }
            }
            z3 = false;
            if (this.H.C() != 1) {
            }
            if (i6 != 2) {
            }
            if (!(z4 ^ z5)) {
            }
            if (instance.findNextFocus(this, view3, i4) != null) {
            }
            if (z3) {
            }
            view2 = instance.findNextFocus(this, view3, i6);
            if (view2 == null || view2.hasFocusable()) {
            }
        }
        return null;
    }

    public final void g(vy5 vy5) {
        xy5 xy5 = this.H;
        if (xy5 != null) {
            xy5.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.J;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(vy5);
        N();
        requestLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        xy5 xy5 = this.H;
        if (xy5 != null) {
            return xy5.r();
        }
        h.s("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        xy5 xy5 = this.H;
        if (xy5 != null) {
            return xy5.s(getContext(), attributeSet);
        }
        h.s("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public py5 getAdapter() {
        return this.G;
    }

    public int getBaseline() {
        xy5 xy5 = this.H;
        if (xy5 == null) {
            return super.getBaseline();
        }
        xy5.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.C;
    }

    public nz5 getCompatAccessibilityDelegate() {
        return this.G0;
    }

    public sy5 getEdgeEffectFactory() {
        return this.c0;
    }

    public ty5 getItemAnimator() {
        return this.h0;
    }

    public int getItemDecorationCount() {
        return this.J.size();
    }

    public xy5 getLayoutManager() {
        return this.H;
    }

    public int getMaxFlingVelocity() {
        return this.s0;
    }

    public int getMinFlingVelocity() {
        return this.r0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public zy5 getOnFlingListener() {
        return this.q0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.v0;
    }

    public cz5 getRecycledViewPool() {
        return this.x.c();
    }

    public int getScrollState() {
        return this.i0;
    }

    public final void h(az5 az5) {
        if (this.B0 == null) {
            this.B0 = new ArrayList();
        }
        this.B0.add(az5);
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                h.s("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(y()));
            } else {
                h.s(str);
            }
        } else if (this.b0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(y()));
        }
    }

    public final boolean isAttachedToWindow() {
        return this.M;
    }

    public final boolean isLayoutSuppressed() {
        return this.R;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        wr0 wr0 = this.A;
        int N2 = wr0.N();
        for (int i = 0; i < N2; i++) {
            lz5 I2 = I(wr0.M(i));
            if (!I2.o()) {
                I2.d = -1;
                I2.g = -1;
            }
        }
        dz5 dz5 = this.x;
        ArrayList arrayList = dz5.a;
        ArrayList arrayList2 = dz5.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            lz5 lz5 = (lz5) arrayList2.get(i2);
            lz5.d = -1;
            lz5.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            lz5 lz52 = (lz5) arrayList.get(i3);
            lz52.d = -1;
            lz52.g = -1;
        }
        ArrayList arrayList3 = dz5.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                lz5 lz53 = (lz5) dz5.b.get(i4);
                lz53.d = -1;
                lz53.g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.d0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.d0.onRelease();
            z2 = this.d0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f0.onRelease();
            z2 |= this.f0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.e0.onRelease();
            z2 |= this.e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.g0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.g0.onRelease();
            z2 |= this.g0.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = e58.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.O || this.V) {
            int i = uk7.a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        o9 o9Var = this.z;
        if (o9Var.C()) {
            o9Var.getClass();
            if (o9Var.C()) {
                int i2 = uk7.a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = e58.a;
        setMeasuredDimension(xy5.g(i, paddingRight, getMinimumWidth()), xy5.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034a, code lost:
        if (((java.util.ArrayList) r7.z).contains(getFocusedChild()) == false) goto L_0x0404;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03ed  */
    public final void o() {
        boolean z2;
        boolean z3;
        lz5 lz5;
        View findViewById;
        boolean z4;
        zt6 zt6;
        dv5 dv5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this.G == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.H == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            iz5 iz5 = this.z0;
            byte b = 0;
            iz5.i = false;
            boolean z9 = true;
            if (!this.O0 || (this.P0 == getWidth() && this.Q0 == getHeight())) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.P0 = 0;
            this.Q0 = 0;
            this.O0 = false;
            if (iz5.d == 1) {
                p();
                this.H.q0(this);
                q();
            } else {
                o9 o9Var = this.z;
                if ((((ArrayList) o9Var.z).isEmpty() || ((ArrayList) o9Var.y).isEmpty()) && !z2 && this.H.n == getWidth() && this.H.o == getHeight()) {
                    this.H.q0(this);
                } else {
                    this.H.q0(this);
                    q();
                }
            }
            iz5.a(4);
            a0();
            P();
            iz5.d = 1;
            boolean z10 = iz5.j;
            wr0 wr0 = this.A;
            dz5 dz5 = this.x;
            kg5 kg5 = this.B;
            if (z10) {
                int F2 = wr0.F() - 1;
                while (F2 >= 0) {
                    lz5 I2 = I(wr0.E(F2));
                    if (I2.o()) {
                        z6 = z9;
                    } else {
                        long G2 = G(I2);
                        this.h0.getClass();
                        dv5 dv52 = new dv5(8, b);
                        dv52.a(I2);
                        z6 = z9;
                        zt6 zt62 = (zt6) kg5.x;
                        lz5 lz52 = (lz5) ((vc4) kg5.y).b(G2);
                        if (lz52 == null || lz52.o()) {
                            kg5.f(I2, dv52);
                        } else {
                            m58 m58 = (m58) zt62.get(lz52);
                            if (m58 == null || (m58.a & 1) == 0) {
                                z7 = false;
                            } else {
                                z7 = z6;
                            }
                            m58 m582 = (m58) zt62.get(I2);
                            if (m582 == null || (m582.a & 1) == 0) {
                                z8 = false;
                            } else {
                                z8 = z6;
                            }
                            if (!z7 || lz52 != I2) {
                                boolean z11 = z7;
                                dv5 I3 = kg5.I(lz52, 4);
                                kg5.f(I2, dv52);
                                dv5 I4 = kg5.I(I2, 8);
                                if (I3 == null) {
                                    int F3 = wr0.F();
                                    for (int i = 0; i < F3; i++) {
                                        lz5 I5 = I(wr0.E(i));
                                        if (I5 != I2 && G(I5) == G2) {
                                            py5 py5 = this.G;
                                            if (py5 == null || !py5.b) {
                                                StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                                sb.append(I5);
                                                sb.append(" \n View Holder 2:");
                                                sb.append(I2);
                                                rf2.m(sb, y());
                                                return;
                                            }
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                            sb2.append(I5);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(I2);
                                            rf2.m(sb2, y());
                                            return;
                                        }
                                    }
                                    Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + lz52 + " cannot be found but it is necessary for " + I2 + y());
                                } else {
                                    lz52.n(false);
                                    if (z11) {
                                        f(lz52);
                                    }
                                    if (lz52 != I2) {
                                        if (z8) {
                                            f(I2);
                                        }
                                        lz52.h = I2;
                                        f(lz52);
                                        dz5.k(lz52);
                                        I2.n(false);
                                        I2.i = lz52;
                                    }
                                    if (this.h0.a(lz52, I2, I3, I4)) {
                                        S();
                                    }
                                }
                            } else {
                                kg5.f(I2, dv52);
                            }
                        }
                    }
                    F2--;
                    z9 = z6;
                    b = 0;
                }
                z3 = z9;
                zt6 zt63 = (zt6) kg5.x;
                int i2 = zt63.y - 1;
                while (i2 >= 0) {
                    lz5 lz53 = (lz5) zt63.g(i2);
                    m58 m583 = (m58) zt63.h(i2);
                    int i3 = m583.a;
                    int i4 = i3 & 3;
                    rg4 rg4 = this.R0;
                    if (i4 == 3) {
                        RecyclerView recyclerView = (RecyclerView) rg4.x;
                        recyclerView.H.j0(lz53.a, recyclerView.x);
                    } else if ((i3 & 1) != 0) {
                        dv5 dv53 = m583.b;
                        if (dv53 == null) {
                            RecyclerView recyclerView2 = (RecyclerView) rg4.x;
                            recyclerView2.H.j0(lz53.a, recyclerView2.x);
                        } else {
                            rg4.o(lz53, dv53, m583.c);
                        }
                    } else if ((i3 & 14) == 14) {
                        rg4.n(lz53, m583.b, m583.c);
                    } else if ((i3 & 12) == 12) {
                        dv5 dv54 = m583.b;
                        dv5 dv55 = m583.c;
                        rg4.getClass();
                        lz53.n(false);
                        RecyclerView recyclerView3 = (RecyclerView) rg4.x;
                        boolean z12 = recyclerView3.V;
                        ty5 ty5 = recyclerView3.h0;
                        if (!z12) {
                            jm1 jm1 = (jm1) ty5;
                            jm1.getClass();
                            int i5 = dv54.b;
                            int i6 = dv55.b;
                            if (i5 == i6) {
                                zt6 = zt63;
                                if (dv54.c == dv55.c) {
                                    jm1.c(lz53);
                                    z5 = false;
                                    if (z5) {
                                        recyclerView3.S();
                                    }
                                    dv5 = null;
                                    m583.a = 0;
                                    m583.b = dv5;
                                    m583.c = dv5;
                                    m58.d.c(m583);
                                    i2--;
                                    zt63 = zt6;
                                }
                            } else {
                                zt6 = zt63;
                            }
                            jm1 jm12 = jm1;
                            z5 = jm12.g(lz53, i5, dv54.c, i6, dv55.c);
                            if (z5) {
                            }
                            dv5 = null;
                            m583.a = 0;
                            m583.b = dv5;
                            m583.c = dv5;
                            m58.d.c(m583);
                            i2--;
                            zt63 = zt6;
                        } else if (ty5.a(lz53, lz53, dv54, dv55)) {
                            recyclerView3.S();
                        }
                    } else {
                        zt6 = zt63;
                        if ((i3 & 4) != 0) {
                            dv5 = null;
                            rg4.o(lz53, m583.b, (dv5) null);
                        } else {
                            dv5 = null;
                            if ((i3 & 8) != 0) {
                                rg4.n(lz53, m583.b, m583.c);
                            }
                        }
                        m583.a = 0;
                        m583.b = dv5;
                        m583.c = dv5;
                        m58.d.c(m583);
                        i2--;
                        zt63 = zt6;
                    }
                    zt6 = zt63;
                    dv5 = null;
                    m583.a = 0;
                    m583.b = dv5;
                    m583.c = dv5;
                    m58.d.c(m583);
                    i2--;
                    zt63 = zt6;
                }
            } else {
                z3 = true;
            }
            View view = null;
            this.H.i0(dz5);
            iz5.b = iz5.e;
            this.V = false;
            this.W = false;
            iz5.j = false;
            iz5.k = false;
            this.H.f = false;
            ArrayList arrayList = dz5.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            xy5 xy5 = this.H;
            if (xy5.k) {
                xy5.j = 0;
                xy5.k = false;
                dz5.l();
            }
            this.H.d0(iz5);
            ? r2 = z3;
            Q(r2);
            b0(false);
            ((zt6) kg5.x).clear();
            ((vc4) kg5.y).a();
            int[] iArr = this.H0;
            int i7 = iArr[0];
            int i8 = iArr[r2];
            C(iArr);
            if (!(iArr[0] == i7 && iArr[r2] == i8)) {
                t(0, 0);
            }
            if (this.v0 && this.G != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                if (!isFocused()) {
                }
                long j = iz5.m;
                if (j == -1 || !(z4 = this.G.b) || !z4) {
                    lz5 = null;
                } else {
                    int N2 = wr0.N();
                    lz5 = null;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= N2) {
                            break;
                        }
                        lz5 I6 = I(wr0.M(i9));
                        if (I6 != null && !I6.h() && I6.e == j) {
                            if (!((ArrayList) wr0.z).contains(I6.a)) {
                                lz5 = I6;
                                break;
                            }
                            lz5 = I6;
                        }
                        i9++;
                    }
                }
                if (lz5 != null) {
                    View view2 = lz5.a;
                    if (!((ArrayList) wr0.z).contains(view2) && view2.hasFocusable()) {
                        view = view2;
                        if (view != null) {
                            int i10 = iz5.n;
                            if (!(((long) i10) == -1 || (findViewById = view.findViewById(i10)) == null || !findViewById.isFocusable())) {
                                view = findViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
                if (wr0.F() > 0) {
                    int i11 = iz5.l;
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    int b2 = iz5.b();
                    int i12 = i11;
                    while (true) {
                        if (i12 >= b2) {
                            break;
                        }
                        lz5 E2 = E(i12);
                        if (E2 == null) {
                            break;
                        }
                        View view3 = E2.a;
                        if (view3.hasFocusable()) {
                            view = view3;
                            break;
                        }
                        i12++;
                    }
                    int min = Math.min(b2, i11) - 1;
                    while (true) {
                        if (min < 0) {
                            break;
                        }
                        lz5 E3 = E(min);
                        if (E3 == null) {
                            break;
                        }
                        View view4 = E3.a;
                        if (view4.hasFocusable()) {
                            view = view4;
                            break;
                        }
                        min--;
                    }
                }
                if (view != null) {
                }
            }
            iz5.m = -1;
            iz5.l = -1;
            iz5.n = -1;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [eu2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r1 >= 30.0f) goto L_0x005f;
     */
    public final void onAttachedToWindow() {
        boolean z2;
        float f;
        super.onAttachedToWindow();
        this.a0 = 0;
        this.M = true;
        if (!this.O || isLayoutRequested()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.O = z2;
        xy5 xy5 = this.H;
        if (xy5 != null) {
            xy5.g = true;
            xy5.R(this);
        }
        this.F0 = false;
        ThreadLocal threadLocal = eu2.A;
        eu2 eu2 = (eu2) threadLocal.get();
        this.x0 = eu2;
        if (eu2 == null) {
            ? obj = new Object();
            obj.w = new ArrayList();
            obj.z = new ArrayList();
            this.x0 = obj;
            WeakHashMap weakHashMap = e58.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            eu2 eu22 = this.x0;
            eu22.y = (long) (1.0E9f / f);
            threadLocal.set(eu22);
        }
        this.x0.w.add(this);
    }

    public final void onDetachedFromWindow() {
        w64 w64;
        super.onDetachedFromWindow();
        ty5 ty5 = this.h0;
        if (ty5 != null) {
            ty5.e();
        }
        setScrollState(0);
        kz5 kz5 = this.w0;
        kz5.C.removeCallbacks(kz5);
        kz5.y.abortAnimation();
        xy5 xy5 = this.H;
        if (!(xy5 == null || (w64 = xy5.e) == null)) {
            w64.i();
        }
        this.M = false;
        xy5 xy52 = this.H;
        if (xy52 != null) {
            xy52.g = false;
            xy52.S(this);
        }
        this.M0.clear();
        removeCallbacks(this.N0);
        this.B.getClass();
        do {
        } while (m58.d.a() != null);
        eu2 eu2 = this.x0;
        if (eu2 != null) {
            eu2.w.remove(this);
            this.x0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vy5) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        xy5 xy5;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.H != null && !this.R && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.H.e()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.H.d()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        int i5 = (int) (f * this.t0);
                        int i6 = (int) (f2 * this.u0);
                        xy5 = this.H;
                        if (xy5 != null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        } else if (!this.R) {
                            int[] iArr = this.L0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = xy5.d();
                            boolean e = this.H.e();
                            if (e) {
                                z2 = d | true;
                            } else {
                                z2 = d;
                            }
                            getScrollingChildHelper().g(z2 ? 1 : 0, 1);
                            if (d) {
                                i = i5;
                            } else {
                                i = 0;
                            }
                            if (e) {
                                i2 = i6;
                            } else {
                                i2 = 0;
                            }
                            if (r(i, i2, 1, this.L0, this.J0)) {
                                i5 -= iArr[0];
                                i6 -= iArr[1];
                            }
                            if (d) {
                                i3 = i5;
                            } else {
                                i3 = 0;
                            }
                            if (e) {
                                i4 = i6;
                            } else {
                                i4 = 0;
                            }
                            W(i3, i4, motionEvent, 1);
                            eu2 eu2 = this.x0;
                            if (!(eu2 == null || (i5 == 0 && i6 == 0))) {
                                eu2.a(this, i5, i6);
                            }
                            c0(1);
                        }
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.H.e()) {
                        f2 = -axisValue;
                    } else if (this.H.d()) {
                        f = axisValue;
                        f2 = 0.0f;
                        int i52 = (int) (f * this.t0);
                        int i62 = (int) (f2 * this.u0);
                        xy5 = this.H;
                        if (xy5 != null) {
                        }
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                int i522 = (int) (f * this.t0);
                int i622 = (int) (f2 * this.u0);
                xy5 = this.H;
                if (xy5 != null) {
                }
            }
            f = 0.0f;
            int i5222 = (int) (f * this.t0);
            int i6222 = (int) (f2 * this.u0);
            xy5 = this.H;
            if (xy5 != null) {
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.R) {
            this.L = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            xy5 xy5 = this.H;
            if (xy5 != null) {
                boolean d = xy5.d();
                boolean e = this.H.e();
                if (this.k0 == null) {
                    this.k0 = VelocityTracker.obtain();
                }
                this.k0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.S) {
                        this.S = false;
                    }
                    this.j0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.n0 = x2;
                    this.l0 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.o0 = y2;
                    this.m0 = y2;
                    if (this.i0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.K0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    if (e) {
                        d |= true;
                    }
                    getScrollingChildHelper().g(d ? 1 : 0, 0);
                } else if (actionMasked == 1) {
                    this.k0.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.j0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.j0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.i0 != 1) {
                        int i = x3 - this.l0;
                        int i2 = y3 - this.m0;
                        if (!d || Math.abs(i) <= this.p0) {
                            z2 = false;
                        } else {
                            this.n0 = x3;
                            z2 = true;
                        }
                        if (e && Math.abs(i2) > this.p0) {
                            this.o0 = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.j0 = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.n0 = x4;
                    this.l0 = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.o0 = y4;
                    this.m0 = y4;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.i0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = uk7.a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.O = true;
    }

    public final void onMeasure(int i, int i2) {
        xy5 xy5 = this.H;
        if (xy5 == null) {
            n(i, i2);
            return;
        }
        boolean L2 = xy5.L();
        boolean z2 = false;
        iz5 iz5 = this.z0;
        if (L2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.H.b.n(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.O0 = z2;
            if (!z2 && this.G != null) {
                if (iz5.d == 1) {
                    p();
                }
                this.H.r0(i, i2);
                iz5.i = true;
                q();
                this.H.t0(i, i2);
                if (this.H.w0()) {
                    this.H.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    iz5.i = true;
                    q();
                    this.H.t0(i, i2);
                }
                this.P0 = getMeasuredWidth();
                this.Q0 = getMeasuredHeight();
            }
        } else if (this.N) {
            this.H.b.n(i, i2);
        } else if (iz5.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            py5 py5 = this.G;
            if (py5 != null) {
                iz5.e = py5.a();
            } else {
                iz5.e = 0;
            }
            a0();
            this.H.b.n(i, i2);
            b0(false);
            iz5.g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fz5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fz5 fz5 = (fz5) parcelable;
        this.y = fz5;
        super.onRestoreInstanceState(fz5.w);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [fz5, android.os.Parcelable, x] */
    public final Parcelable onSaveInstanceState() {
        ? xVar = new x(super.onSaveInstanceState());
        fz5 fz5 = this.y;
        if (fz5 != null) {
            xVar.y = fz5.y;
            return xVar;
        }
        xy5 xy5 = this.H;
        if (xy5 != null) {
            xVar.y = xy5.f0();
            return xVar;
        }
        xVar.y = null;
        return xVar;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.g0 = null;
            this.e0 = null;
            this.f0 = null;
            this.d0 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0402, code lost:
        if (r2 < r5) goto L_0x0350;
     */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x020d  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        int minFlingVelocity;
        boolean z4;
        float f3;
        hb5 hb5;
        t22 t22;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        PointF a;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z7;
        MotionEvent motionEvent2 = motionEvent;
        if (!this.R && !this.S) {
            wb2 wb2 = this.L;
            if (wb2 != null) {
                int i10 = wb2.b;
                if (wb2.v != 0) {
                    if (motionEvent2.getAction() == 0) {
                        boolean d = wb2.d(motionEvent2.getX(), motionEvent2.getY());
                        boolean c = wb2.c(motionEvent2.getX(), motionEvent2.getY());
                        if (d || c) {
                            if (c) {
                                wb2.w = 1;
                                wb2.p = (float) ((int) motionEvent2.getX());
                            } else if (d) {
                                wb2.w = 2;
                                wb2.m = (float) ((int) motionEvent2.getY());
                            }
                            wb2.f(2);
                        }
                    } else if (motionEvent2.getAction() == 1 && wb2.v == 2) {
                        wb2.m = 0.0f;
                        wb2.p = 0.0f;
                        wb2.f(1);
                        wb2.w = 0;
                    } else if (motionEvent2.getAction() == 2 && wb2.v == 2) {
                        wb2.g();
                        if (wb2.w == 1) {
                            float x2 = motionEvent2.getX();
                            int[] iArr = wb2.y;
                            iArr[0] = i10;
                            int i11 = wb2.q - i10;
                            iArr[1] = i11;
                            float max = Math.max((float) i10, Math.min((float) i11, x2));
                            if (Math.abs(((float) wb2.o) - max) >= 2.0f) {
                                int e = wb2.e(wb2.p, max, iArr, wb2.s.computeHorizontalScrollRange(), wb2.s.computeHorizontalScrollOffset(), wb2.q);
                                if (e != 0) {
                                    wb2.s.scrollBy(e, 0);
                                }
                                wb2.p = max;
                            }
                        }
                        if (wb2.w == 2) {
                            float y2 = motionEvent2.getY();
                            int[] iArr2 = wb2.x;
                            iArr2[0] = i10;
                            int i12 = wb2.r - i10;
                            iArr2[1] = i12;
                            float max2 = Math.max((float) i10, Math.min((float) i12, y2));
                            if (Math.abs(((float) wb2.l) - max2) >= 2.0f) {
                                int e2 = wb2.e(wb2.m, max2, iArr2, wb2.s.computeVerticalScrollRange(), wb2.s.computeVerticalScrollOffset(), wb2.r);
                                if (e2 != 0) {
                                    wb2.s.scrollBy(0, e2);
                                }
                                wb2.m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent2.getAction();
                if (action == 3 || action == 1) {
                    this.L = null;
                }
                z2 = true;
            } else if (motionEvent2.getAction() == 0) {
                z2 = false;
            } else {
                z2 = B(motionEvent);
            }
            if (z2) {
                V();
                setScrollState(0);
                return true;
            }
            xy5 xy5 = this.H;
            if (xy5 != null) {
                boolean d2 = xy5.d();
                boolean e3 = this.H.e();
                if (this.k0 == null) {
                    this.k0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent2.getActionMasked();
                int actionIndex = motionEvent2.getActionIndex();
                int[] iArr3 = this.K0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent2);
                obtain.offsetLocation((float) iArr3[0], (float) iArr3[1]);
                if (actionMasked == 0) {
                    this.j0 = motionEvent2.getPointerId(0);
                    int x3 = (int) (motionEvent2.getX() + 0.5f);
                    this.n0 = x3;
                    this.l0 = x3;
                    int y3 = (int) (motionEvent2.getY() + 0.5f);
                    this.o0 = y3;
                    this.m0 = y3;
                    if (e3) {
                        d2 |= true;
                    }
                    getScrollingChildHelper().g(d2 ? 1 : 0, 0);
                } else if (actionMasked == 1) {
                    this.k0.addMovement(obtain);
                    VelocityTracker velocityTracker = this.k0;
                    int i13 = this.s0;
                    velocityTracker.computeCurrentVelocity(1000, (float) i13);
                    if (d2) {
                        f = -this.k0.getXVelocity(this.j0);
                    } else {
                        f = 0.0f;
                    }
                    if (e3) {
                        f2 = -this.k0.getYVelocity(this.j0);
                    } else {
                        f2 = 0.0f;
                    }
                    if (f == 0.0f && f2 == 0.0f) {
                        i = 0;
                    } else {
                        int i14 = (int) f;
                        int i15 = (int) f2;
                        xy5 xy52 = this.H;
                        if (xy52 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.R) {
                            boolean d3 = xy52.d();
                            boolean e4 = this.H.e();
                            int i16 = this.r0;
                            if (!d3 || Math.abs(i14) < i16) {
                                i14 = 0;
                            }
                            if (!e4 || Math.abs(i15) < i16) {
                                i15 = 0;
                            }
                            if (!(i14 == 0 && i15 == 0)) {
                                float f4 = (float) i14;
                                float f5 = (float) i15;
                                if (!dispatchNestedPreFling(f4, f5)) {
                                    if (d3 || e4) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    dispatchNestedFling(f4, f5, z3);
                                    zy5 zy5 = this.q0;
                                    if (zy5 != null) {
                                        ib5 ib5 = (ib5) zy5;
                                        xy5 layoutManager = ib5.a.getLayoutManager();
                                        if (!(layoutManager == null || ib5.a.getAdapter() == null || ((Math.abs(i15) <= (minFlingVelocity = ib5.a.getMinFlingVelocity()) && Math.abs(i14) <= minFlingVelocity) || !z4))) {
                                            if (!((z4 = layoutManager instanceof hz5))) {
                                                f3 = 0.0f;
                                                hb5 = null;
                                            } else {
                                                f3 = 0.0f;
                                                hb5 = new hb5(ib5, ib5.a.getContext());
                                            }
                                            if (hb5 != null) {
                                                int B2 = layoutManager.B();
                                                if (B2 != 0) {
                                                    if (layoutManager.e()) {
                                                        t22 = ib5.e(layoutManager);
                                                    } else if (layoutManager.d()) {
                                                        t22 = ib5.d(layoutManager);
                                                    } else {
                                                        t22 = null;
                                                    }
                                                    if (t22 != null) {
                                                        int v = layoutManager.v();
                                                        boolean z8 = z4;
                                                        int i17 = Integer.MIN_VALUE;
                                                        int i18 = Integer.MAX_VALUE;
                                                        View view = null;
                                                        View view2 = null;
                                                        i2 = 1;
                                                        int i19 = 0;
                                                        while (i19 < v) {
                                                            int i20 = v;
                                                            View u = layoutManager.u(i19);
                                                            if (u == null) {
                                                                i5 = i19;
                                                            } else {
                                                                i5 = i19;
                                                                int b = ib5.b(u, t22);
                                                                if (b <= 0 && b > i17) {
                                                                    view2 = u;
                                                                    i17 = b;
                                                                }
                                                                if (b >= 0 && b < i18) {
                                                                    view = u;
                                                                    i18 = b;
                                                                }
                                                            }
                                                            i19 = i5 + 1;
                                                            v = i20;
                                                        }
                                                        if (!layoutManager.d() ? i15 <= 0 : i14 <= 0) {
                                                            z5 = false;
                                                        } else {
                                                            z5 = true;
                                                        }
                                                        if (z5 && view != null) {
                                                            i4 = xy5.H(view);
                                                            if (i4 != -1) {
                                                            }
                                                            if (z3) {
                                                            }
                                                        } else if (z5 || view2 == null) {
                                                            if (z5) {
                                                                view = view2;
                                                            }
                                                            if (view != null) {
                                                                int H2 = xy5.H(view);
                                                                int B3 = layoutManager.B();
                                                                if (!z8 || (a = ((hz5) layoutManager).a(B3 - 1)) == null || (a.x >= f3 && a.y >= f3)) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = true;
                                                                }
                                                                if (z6 == z5) {
                                                                    i3 = -1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                                i4 = i3 + H2;
                                                                if (i4 >= 0) {
                                                                }
                                                            }
                                                            i4 = -1;
                                                            if (i4 != -1) {
                                                                hb5.a = i4;
                                                                layoutManager.z0(hb5);
                                                                V();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z3) {
                                                                if (e4) {
                                                                    d3 |= true;
                                                                }
                                                                getScrollingChildHelper().g(d3 ? 1 : 0, i2);
                                                                int i21 = -i13;
                                                                int max3 = Math.max(i21, Math.min(i14, i13));
                                                                int max4 = Math.max(i21, Math.min(i15, i13));
                                                                kz5 kz5 = this.w0;
                                                                RecyclerView recyclerView = kz5.C;
                                                                recyclerView.setScrollState(2);
                                                                kz5.x = 0;
                                                                kz5.w = 0;
                                                                Interpolator interpolator = kz5.z;
                                                                oy5 oy5 = U0;
                                                                if (interpolator != oy5) {
                                                                    kz5.z = oy5;
                                                                    kz5.y = new OverScroller(recyclerView.getContext(), oy5);
                                                                }
                                                                kz5.y.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                kz5.a();
                                                                V();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        } else {
                                                            i4 = xy5.H(view2);
                                                            if (i4 != -1) {
                                                            }
                                                            if (z3) {
                                                            }
                                                        }
                                                    }
                                                }
                                                i2 = 1;
                                                i4 = -1;
                                                if (i4 != -1) {
                                                }
                                                if (z3) {
                                                }
                                            }
                                        }
                                    }
                                    i2 = 1;
                                    if (z3) {
                                    }
                                }
                            }
                        }
                        i = 0;
                    }
                    setScrollState(i);
                    V();
                    obtain.recycle();
                    return true;
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent2.findPointerIndex(this.j0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.j0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x4 = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
                    int i22 = this.n0 - x4;
                    int i23 = this.o0 - y4;
                    if (this.i0 != 1) {
                        if (d2) {
                            int i24 = this.p0;
                            if (i22 > 0) {
                                i22 = Math.max(0, i22 - i24);
                            } else {
                                i22 = Math.min(0, i22 + i24);
                            }
                            if (i22 != 0) {
                                z7 = true;
                                if (e3) {
                                    int i25 = this.p0;
                                    if (i23 > 0) {
                                        i23 = Math.max(0, i23 - i25);
                                    } else {
                                        i23 = Math.min(0, i23 + i25);
                                    }
                                    if (i23 != 0) {
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    setScrollState(1);
                                }
                            }
                        }
                        z7 = false;
                        if (e3) {
                        }
                        if (z7) {
                        }
                    }
                    int i26 = i22;
                    int i27 = i23;
                    if (this.i0 == 1) {
                        int[] iArr4 = this.L0;
                        iArr4[0] = 0;
                        iArr4[1] = 0;
                        if (d2) {
                            i6 = i26;
                        } else {
                            i6 = 0;
                        }
                        if (e3) {
                            i7 = i27;
                        } else {
                            i7 = 0;
                        }
                        boolean r = r(i6, i7, 0, iArr4, this.J0);
                        int[] iArr5 = this.J0;
                        if (r) {
                            i26 -= iArr4[0];
                            i27 -= iArr4[1];
                            iArr3[0] = iArr3[0] + iArr5[0];
                            iArr3[1] = iArr3[1] + iArr5[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i28 = i27;
                        this.n0 = x4 - iArr5[0];
                        this.o0 = y4 - iArr5[1];
                        if (d2) {
                            i8 = i26;
                        } else {
                            i8 = 0;
                        }
                        if (e3) {
                            i9 = i28;
                        } else {
                            i9 = 0;
                        }
                        if (W(i8, i9, motionEvent2, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        eu2 eu2 = this.x0;
                        if (!(eu2 == null || (i26 == 0 && i28 == 0))) {
                            eu2.a(this, i26, i28);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.j0 = motionEvent2.getPointerId(actionIndex);
                    int x5 = (int) (motionEvent2.getX(actionIndex) + 0.5f);
                    this.n0 = x5;
                    this.l0 = x5;
                    int y5 = (int) (motionEvent2.getY(actionIndex) + 0.5f);
                    this.o0 = y5;
                    this.m0 = y5;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                this.k0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:262:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0242 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a1  */
    public final void p() {
        boolean z2;
        zt6 zt6;
        vc4 vc4;
        boolean z3;
        boolean z4;
        boolean z5;
        View view;
        lz5 lz5;
        boolean z6;
        boolean z7;
        zt6 zt62;
        vc4 vc42;
        int i;
        View view2;
        View A2;
        boolean z8;
        char c;
        boolean z9;
        boolean z10;
        zt6 zt63;
        vc4 vc43;
        int i2;
        boolean z11;
        boolean z12;
        boolean z13;
        n9 n9Var;
        boolean z14;
        n9 n9Var2;
        int i3;
        int i4;
        n9 n9Var3;
        iz5 iz5 = this.z0;
        int i5 = 1;
        iz5.a(1);
        z(iz5);
        int i6 = 0;
        iz5.i = false;
        a0();
        kg5 kg5 = this.B;
        zt6 zt64 = (zt6) kg5.x;
        ((zt6) kg5.x).clear();
        vc4 vc44 = (vc4) kg5.y;
        vc44.a();
        P();
        boolean z15 = this.V;
        o9 o9Var = this.z;
        if (z15) {
            o9Var.J((ArrayList) o9Var.y);
            o9Var.J((ArrayList) o9Var.z);
            if (this.W) {
                this.H.Y();
            }
        }
        if (this.h0 == null || !this.H.A0()) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i7 = -1;
        int i8 = 8;
        if (z2) {
            ml5 ml5 = (ml5) o9Var.x;
            br4 br4 = (br4) o9Var.A;
            wv2 wv2 = (wv2) o9Var.B;
            ArrayList arrayList = (ArrayList) o9Var.y;
            wv2.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                int i9 = i6;
                while (true) {
                    if (size < 0) {
                        size = i7;
                        break;
                    }
                    if (((n9) arrayList.get(size)).a != i8) {
                        i9 = i5;
                    } else if (i9 != 0) {
                        break;
                    }
                    size--;
                }
                if (size == i7) {
                    break;
                }
                int i10 = size + 1;
                o9 o9Var2 = (o9) wv2.x;
                ml5 ml52 = (ml5) o9Var2.x;
                n9 n9Var4 = (n9) arrayList.get(size);
                n9 n9Var5 = (n9) arrayList.get(i10);
                wv2 wv22 = wv2;
                int i11 = n9Var5.a;
                if (i11 == i5) {
                    vc43 = vc44;
                    zt63 = zt64;
                    int i12 = n9Var4.c;
                    int i13 = n9Var5.b;
                    if (i12 < i13) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    int i14 = n9Var4.b;
                    if (i14 < i13) {
                        i2++;
                    }
                    if (i13 <= i14) {
                        n9Var4.b = i14 + n9Var5.c;
                    }
                    int i15 = n9Var5.b;
                    if (i15 <= i12) {
                        n9Var4.c = i12 + n9Var5.c;
                    }
                    n9Var5.b = i15 + i2;
                    arrayList.set(size, n9Var5);
                    arrayList.set(i10, n9Var4);
                } else if (i11 == 2) {
                    vc43 = vc44;
                    zt63 = zt64;
                    int i16 = n9Var4.b;
                    int i17 = n9Var4.c;
                    int i18 = n9Var5.b;
                    if (i16 < i17) {
                        if (i18 == i16 && n9Var5.c == i17 - i16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z11 = false;
                    } else {
                        if (i18 == i17 + 1 && n9Var5.c == i16 - i17) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z11 = true;
                    }
                    if (i17 < i18) {
                        n9Var5.b = i18 - 1;
                        z13 = z12;
                    } else {
                        z13 = z12;
                        int i19 = n9Var5.c;
                        if (i17 < i18 + i19) {
                            n9Var5.c = i19 - 1;
                            n9Var4.a = 2;
                            n9Var4.c = 1;
                            if (n9Var5.c == 0) {
                                arrayList.remove(i10);
                                ml52.c(n9Var5);
                            }
                        }
                    }
                    int i20 = n9Var4.b;
                    int i21 = n9Var5.b;
                    if (i20 <= i21) {
                        n9Var5.b = i21 + 1;
                    } else {
                        int i22 = i21 + n9Var5.c;
                        if (i20 < i22) {
                            n9Var = o9Var2.H(2, i20 + 1, i22 - i20);
                            n9Var5.c = n9Var4.b - n9Var5.b;
                            if (!z13) {
                                arrayList.set(size, n9Var5);
                                arrayList.remove(i10);
                                ml52.c(n9Var4);
                            } else {
                                if (z11) {
                                    if (n9Var != null) {
                                        int i23 = n9Var4.b;
                                        if (i23 > n9Var.b) {
                                            n9Var4.b = i23 - n9Var.c;
                                        }
                                        int i24 = n9Var4.c;
                                        if (i24 > n9Var.b) {
                                            n9Var4.c = i24 - n9Var.c;
                                        }
                                    }
                                    int i25 = n9Var4.b;
                                    if (i25 > n9Var5.b) {
                                        n9Var4.b = i25 - n9Var5.c;
                                    }
                                    int i26 = n9Var4.c;
                                    if (i26 > n9Var5.b) {
                                        n9Var4.c = i26 - n9Var5.c;
                                    }
                                } else {
                                    if (n9Var != null) {
                                        int i27 = n9Var4.b;
                                        if (i27 >= n9Var.b) {
                                            n9Var4.b = i27 - n9Var.c;
                                        }
                                        int i28 = n9Var4.c;
                                        if (i28 >= n9Var.b) {
                                            n9Var4.c = i28 - n9Var.c;
                                        }
                                    }
                                    int i29 = n9Var4.b;
                                    if (i29 >= n9Var5.b) {
                                        n9Var4.b = i29 - n9Var5.c;
                                    }
                                    int i30 = n9Var4.c;
                                    if (i30 >= n9Var5.b) {
                                        n9Var4.c = i30 - n9Var5.c;
                                    }
                                }
                                arrayList.set(size, n9Var5);
                                if (n9Var4.b != n9Var4.c) {
                                    arrayList.set(i10, n9Var4);
                                } else {
                                    arrayList.remove(i10);
                                }
                                if (n9Var != null) {
                                    arrayList.add(size, n9Var);
                                }
                            }
                        }
                    }
                    n9Var = null;
                    if (!z13) {
                    }
                } else if (i11 != 4) {
                    vc43 = vc44;
                    zt63 = zt64;
                } else {
                    int i31 = n9Var4.c;
                    int i32 = n9Var5.b;
                    if (i31 < i32) {
                        n9Var5.b = i32 - 1;
                    } else {
                        int i33 = i32;
                        int i34 = n9Var5.c;
                        if (i31 < i33 + i34) {
                            n9Var5.c = i34 - 1;
                            vc43 = vc44;
                            n9Var2 = o9Var2.H(4, n9Var4.b, 1);
                            i3 = n9Var4.b;
                            i4 = n9Var5.b;
                            if (i3 > i4) {
                                n9Var5.b = i4 + 1;
                            } else {
                                int i35 = i4 + n9Var5.c;
                                if (i3 < i35) {
                                    int i36 = i35 - i3;
                                    zt63 = zt64;
                                    n9Var3 = o9Var2.H(4, i3 + 1, i36);
                                    n9Var5.c -= i36;
                                    arrayList.set(i10, n9Var4);
                                    if (n9Var5.c > 0) {
                                        arrayList.set(size, n9Var5);
                                    } else {
                                        arrayList.remove(size);
                                        ml52.c(n9Var5);
                                    }
                                    if (n9Var2 != null) {
                                        arrayList.add(size, n9Var2);
                                    }
                                    if (n9Var3 != null) {
                                        arrayList.add(size, n9Var3);
                                    }
                                }
                            }
                            zt63 = zt64;
                            n9Var3 = null;
                            arrayList.set(i10, n9Var4);
                            if (n9Var5.c > 0) {
                            }
                            if (n9Var2 != null) {
                            }
                            if (n9Var3 != null) {
                            }
                        }
                    }
                    vc43 = vc44;
                    n9Var2 = null;
                    i3 = n9Var4.b;
                    i4 = n9Var5.b;
                    if (i3 > i4) {
                    }
                    zt63 = zt64;
                    n9Var3 = null;
                    arrayList.set(i10, n9Var4);
                    if (n9Var5.c > 0) {
                    }
                    if (n9Var2 != null) {
                    }
                    if (n9Var3 != null) {
                    }
                }
                wv2 = wv22;
                vc44 = vc43;
                zt64 = zt63;
                i5 = 1;
                i6 = 0;
                i7 = -1;
                i8 = 8;
            }
            vc4 = vc44;
            zt6 = zt64;
            int size2 = arrayList.size();
            for (int i37 = 0; i37 < size2; i37++) {
                n9 n9Var6 = (n9) arrayList.get(i37);
                int i38 = n9Var6.a;
                if (i38 == 1) {
                    o9Var.I(n9Var6);
                } else if (i38 == 2) {
                    int i39 = n9Var6.b;
                    int i40 = n9Var6.c + i39;
                    int i41 = i39;
                    char c2 = 65535;
                    int i42 = 0;
                    while (i41 < i40) {
                        if (br4.A(i41) != null || o9Var.q(i41)) {
                            if (c2 == 0) {
                                o9Var.t(o9Var.H(2, i39, i42));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c = 1;
                        } else {
                            if (c2 == 1) {
                                o9Var.I(o9Var.H(2, i39, i42));
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            c = 0;
                        }
                        if (z9) {
                            i41 -= i42;
                            i40 -= i42;
                            i42 = 1;
                        } else {
                            i42++;
                        }
                        i41++;
                        c2 = c;
                    }
                    if (i42 != n9Var6.c) {
                        ml5.c(n9Var6);
                        n9Var6 = o9Var.H(2, i39, i42);
                    }
                    if (c2 == 0) {
                        o9Var.t(n9Var6);
                    } else {
                        o9Var.I(n9Var6);
                    }
                } else if (i38 == 4) {
                    int i43 = n9Var6.b;
                    int i44 = n9Var6.c + i43;
                    int i45 = i43;
                    char c3 = 65535;
                    int i46 = 0;
                    while (i43 < i44) {
                        if (br4.A(i43) != null || o9Var.q(i43)) {
                            if (c3 == 0) {
                                o9Var.t(o9Var.H(4, i45, i46));
                                i45 = i43;
                                i46 = 0;
                            }
                            c3 = 1;
                        } else {
                            if (c3 == 1) {
                                o9Var.I(o9Var.H(4, i45, i46));
                                i45 = i43;
                                i46 = 0;
                            }
                            c3 = 0;
                        }
                        i46++;
                        i43++;
                    }
                    if (i46 != n9Var6.c) {
                        ml5.c(n9Var6);
                        n9Var6 = o9Var.H(4, i45, i46);
                    }
                    if (c3 == 0) {
                        o9Var.t(n9Var6);
                    } else {
                        o9Var.I(n9Var6);
                    }
                } else if (i38 == 8) {
                    o9Var.I(n9Var6);
                }
            }
            arrayList.clear();
        } else {
            vc4 = vc44;
            zt6 = zt64;
            o9Var.r();
        }
        if (this.C0 || this.D0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.O || this.h0 == null || ((!(z8 = this.V) && !z3 && !this.H.f) || (z8 && !this.G.b))) {
            z4 = false;
        } else {
            z4 = true;
        }
        iz5.j = z4;
        if (!z4 || !z3 || this.V || this.h0 == null || !this.H.A0()) {
            z5 = false;
        } else {
            z5 = true;
        }
        iz5.k = z5;
        if (!this.v0 || !hasFocus() || this.G == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view == null || (A2 = A(view)) == null) {
            lz5 = null;
        } else {
            lz5 = H(A2);
        }
        long j = -1;
        if (lz5 == null) {
            iz5.m = -1;
            iz5.l = -1;
            iz5.n = -1;
        } else {
            if (this.G.b) {
                j = lz5.e;
            }
            iz5.m = j;
            if (!this.V) {
                if (lz5.h()) {
                    i = lz5.d;
                } else {
                    RecyclerView recyclerView = lz5.r;
                    if (recyclerView != null) {
                        i = recyclerView.F(lz5);
                    }
                }
                iz5.l = i;
                view2 = lz5.a;
                int id = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        id = view2.getId();
                    }
                }
                iz5.n = id;
            }
            i = -1;
            iz5.l = i;
            view2 = lz5.a;
            int id2 = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
            }
            iz5.n = id2;
        }
        if (!iz5.j || !this.D0) {
            z6 = false;
        } else {
            z6 = true;
        }
        iz5.h = z6;
        this.D0 = false;
        this.C0 = false;
        iz5.g = iz5.k;
        iz5.e = this.G.a();
        C(this.H0);
        boolean z16 = iz5.j;
        wr0 wr0 = this.A;
        if (z16) {
            int F2 = wr0.F();
            int i47 = 0;
            while (i47 < F2) {
                lz5 I2 = I(wr0.E(i47));
                if (I2.o() || (I2.f() && !this.G.b)) {
                    vc42 = vc4;
                    zt62 = zt6;
                } else {
                    ty5 ty5 = this.h0;
                    ty5.b(I2);
                    I2.c();
                    ty5.getClass();
                    dv5 dv5 = new dv5(8, (byte) 0);
                    dv5.a(I2);
                    zt62 = zt6;
                    m58 m58 = (m58) zt62.get(I2);
                    if (m58 == null) {
                        m58 = m58.a();
                        zt62.put(I2, m58);
                    }
                    m58.b = dv5;
                    m58.a |= 4;
                    if (!iz5.h || !I2.k() || I2.h() || I2.o() || I2.f()) {
                        vc42 = vc4;
                    } else {
                        vc42 = vc4;
                        vc42.e(G(I2), I2);
                    }
                }
                i47++;
                vc4 = vc42;
                zt6 = zt62;
            }
        }
        zt6 zt65 = zt6;
        if (iz5.k) {
            int N2 = wr0.N();
            for (int i48 = 0; i48 < N2; i48++) {
                lz5 I3 = I(wr0.M(i48));
                if (!I3.o()) {
                    if (I3.d == -1) {
                        I3.d = I3.c;
                    }
                }
            }
            boolean z17 = iz5.f;
            iz5.f = false;
            this.H.c0(this.x, iz5);
            iz5.f = z17;
            for (int i49 = 0; i49 < wr0.F(); i49++) {
                lz5 I4 = I(wr0.E(i49));
                if (!I4.o()) {
                    m58 m582 = (m58) zt65.get(I4);
                    if (m582 != null) {
                        if ((m582.a & 4) != 0) {
                        }
                    }
                    ty5.b(I4);
                    if ((I4.j & 8192) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    ty5 ty52 = this.h0;
                    I4.c();
                    ty52.getClass();
                    dv5 dv52 = new dv5(8, (byte) 0);
                    dv52.a(I4);
                    if (z7) {
                        T(I4, dv52);
                    } else {
                        m58 m583 = (m58) zt65.get(I4);
                        if (m583 == null) {
                            m583 = m58.a();
                            zt65.put(I4, m583);
                        }
                        m583.a |= 2;
                        m583.b = dv52;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        iz5.d = 2;
    }

    public final void q() {
        boolean z2;
        a0();
        P();
        iz5 iz5 = this.z0;
        iz5.a(6);
        this.z.r();
        iz5.e = this.G.a();
        iz5.c = 0;
        if (this.y != null) {
            py5 py5 = this.G;
            int B2 = b81.B(py5.c);
            if (B2 == 1 ? py5.a() > 0 : B2 != 2) {
                Parcelable parcelable = this.y.y;
                if (parcelable != null) {
                    this.H.e0(parcelable);
                }
                this.y = null;
            }
        }
        iz5.g = false;
        this.H.c0(this.x, iz5);
        iz5.f = false;
        if (!iz5.j || this.h0 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        iz5.j = z2;
        iz5.d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void removeDetachedView(View view, boolean z2) {
        lz5 I2 = I(view);
        if (I2 != null) {
            if (I2.j()) {
                I2.j &= -257;
            } else if (!I2.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(I2);
                h.n(sb, y());
                return;
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    public final void requestChildFocus(View view, View view2) {
        w64 w64 = this.H.e;
        if ((w64 == null || !w64.e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.H.l0(this, view, rect, z2, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wb2) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        if (this.P != 0 || this.R) {
            this.Q = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void scrollBy(int i, int i2) {
        xy5 xy5 = this.H;
        if (xy5 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.R) {
            boolean d = xy5.d();
            boolean e = this.H.e();
            if (d || e) {
                if (!d) {
                    i = 0;
                }
                if (!e) {
                    i2 = 0;
                }
                W(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (L()) {
            int i2 = 0;
            if (accessibilityEvent != null) {
                i = accessibilityEvent.getContentChangeTypes();
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.T |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(nz5 nz5) {
        this.G0 = nz5;
        e58.m(this, nz5);
    }

    public void setAdapter(py5 py5) {
        setLayoutFrozen(false);
        py5 py52 = this.G;
        z53 z53 = this.w;
        if (py52 != null) {
            py52.a.unregisterObserver(z53);
            this.G.getClass();
        }
        ty5 ty5 = this.h0;
        if (ty5 != null) {
            ty5.e();
        }
        xy5 xy5 = this.H;
        dz5 dz5 = this.x;
        if (xy5 != null) {
            xy5.h0(dz5);
            this.H.i0(dz5);
        }
        dz5.a.clear();
        dz5.e();
        o9 o9Var = this.z;
        o9Var.J((ArrayList) o9Var.y);
        o9Var.J((ArrayList) o9Var.z);
        py5 py53 = this.G;
        this.G = py5;
        if (py5 != null) {
            py5.a.registerObserver(z53);
        }
        xy5 xy52 = this.H;
        if (xy52 != null) {
            xy52.Q();
        }
        py5 py54 = this.G;
        dz5.a.clear();
        dz5.e();
        cz5 c = dz5.c();
        if (py53 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((bz5) sparseArray.valueAt(i)).a.clear();
            }
        }
        if (py54 != null) {
            c.b++;
        }
        this.z0.f = true;
        this.W |= false;
        this.V = true;
        wr0 wr0 = this.A;
        int N2 = wr0.N();
        for (int i2 = 0; i2 < N2; i2++) {
            lz5 I2 = I(wr0.M(i2));
            if (I2 != null && !I2.o()) {
                I2.a(6);
            }
        }
        N();
        ArrayList arrayList = dz5.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            lz5 lz5 = (lz5) arrayList.get(i3);
            if (lz5 != null) {
                lz5.a(6);
                lz5.a(1024);
            }
        }
        py5 py55 = dz5.h.G;
        if (py55 == null || !py55.b) {
            dz5.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ry5 ry5) {
        if (ry5 != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.C) {
            this.g0 = null;
            this.e0 = null;
            this.f0 = null;
            this.d0 = null;
        }
        this.C = z2;
        super.setClipToPadding(z2);
        if (this.O) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(sy5 sy5) {
        sy5.getClass();
        this.c0 = sy5;
        this.g0 = null;
        this.e0 = null;
        this.f0 = null;
        this.d0 = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.N = z2;
    }

    public void setItemAnimator(ty5 ty5) {
        ty5 ty52 = this.h0;
        if (ty52 != null) {
            ty52.e();
            this.h0.a = null;
        }
        this.h0 = ty5;
        if (ty5 != null) {
            ty5.a = this.E0;
        }
    }

    public void setItemViewCacheSize(int i) {
        dz5 dz5 = this.x;
        dz5.e = i;
        dz5.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(xy5 xy5) {
        RecyclerView recyclerView;
        w64 w64;
        if (xy5 != this.H) {
            setScrollState(0);
            kz5 kz5 = this.w0;
            kz5.C.removeCallbacks(kz5);
            kz5.y.abortAnimation();
            xy5 xy52 = this.H;
            if (!(xy52 == null || (w64 = xy52.e) == null)) {
                w64.i();
            }
            xy5 xy53 = this.H;
            dz5 dz5 = this.x;
            if (xy53 != null) {
                ty5 ty5 = this.h0;
                if (ty5 != null) {
                    ty5.e();
                }
                this.H.h0(dz5);
                this.H.i0(dz5);
                dz5.a.clear();
                dz5.e();
                if (this.M) {
                    xy5 xy54 = this.H;
                    xy54.g = false;
                    xy54.S(this);
                }
                this.H.u0((RecyclerView) null);
                this.H = null;
            } else {
                dz5.a.clear();
                dz5.e();
            }
            wr0 wr0 = this.A;
            ((cp0) wr0.y).k();
            ArrayList arrayList = (ArrayList) wr0.z;
            int size = arrayList.size() - 1;
            while (true) {
                recyclerView = (RecyclerView) ((ay4) wr0.x).x;
                if (size < 0) {
                    break;
                }
                lz5 I2 = I((View) arrayList.get(size));
                if (I2 != null) {
                    int i = I2.p;
                    if (recyclerView.L()) {
                        I2.q = i;
                        recyclerView.M0.add(I2);
                    } else {
                        View view = I2.a;
                        WeakHashMap weakHashMap = e58.a;
                        view.setImportantForAccessibility(i);
                    }
                    I2.p = 0;
                }
                arrayList.remove(size);
                size--;
            }
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                I(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.H = xy5;
            if (xy5 != null) {
                if (xy5.b == null) {
                    xy5.u0(this);
                    if (this.M) {
                        xy5 xy55 = this.H;
                        xy55.g = true;
                        xy55.R(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(xy5);
                    String y2 = xy5.b.y();
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(y2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            dz5.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
        } else {
            h.q("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        dy4 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = e58.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(zy5 zy5) {
        this.q0 = zy5;
    }

    @Deprecated
    public void setOnScrollListener(az5 az5) {
        this.A0 = az5;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.v0 = z2;
    }

    public void setRecycledViewPool(cz5 cz5) {
        dz5 dz5 = this.x;
        cz5 cz52 = dz5.g;
        if (cz52 != null) {
            cz52.b--;
        }
        dz5.g = cz5;
        if (cz5 != null && dz5.h.getAdapter() != null) {
            dz5.g.b++;
        }
    }

    public void setScrollState(int i) {
        w64 w64;
        if (i != this.i0) {
            this.i0 = i;
            if (i != 2) {
                kz5 kz5 = this.w0;
                kz5.C.removeCallbacks(kz5);
                kz5.y.abortAnimation();
                xy5 xy5 = this.H;
                if (!(xy5 == null || (w64 = xy5.e) == null)) {
                    w64.i();
                }
            }
            xy5 xy52 = this.H;
            if (xy52 != null) {
                xy52.g0(i);
            }
            az5 az5 = this.A0;
            if (az5 != null) {
                az5.a(i);
            }
            ArrayList arrayList = this.B0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((az5) this.B0.get(size)).a(i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.p0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.p0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(jz5 jz5) {
        this.x.getClass();
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z2) {
        w64 w64;
        if (z2 != this.R) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.R = false;
                if (!(!this.Q || this.H == null || this.G == null)) {
                    requestLayout();
                }
                this.Q = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.R = true;
            this.S = true;
            setScrollState(0);
            kz5 kz5 = this.w0;
            kz5.C.removeCallbacks(kz5);
            kz5.y.abortAnimation();
            xy5 xy5 = this.H;
            if (xy5 != null && (w64 = xy5.e) != null) {
                w64.i();
            }
        }
    }

    public final void t(int i, int i2) {
        this.b0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        az5 az5 = this.A0;
        if (az5 != null) {
            az5.b(this, i, i2);
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((az5) this.B0.get(size)).b(this, i, i2);
            }
        }
        this.b0--;
    }

    public final void u() {
        if (this.g0 == null) {
            this.c0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.g0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void v() {
        if (this.d0 == null) {
            this.c0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.d0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void w() {
        if (this.f0 == null) {
            this.c0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void x() {
        if (this.e0 == null) {
            this.c0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.e0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.G + ", layout:" + this.H + ", context:" + getContext();
    }

    public final void z(iz5 iz5) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.w0.y;
            overScroller.getFinalX();
            overScroller.getCurrX();
            iz5.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        iz5.getClass();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        xy5 xy5 = this.H;
        if (xy5 != null) {
            return xy5.t(layoutParams);
        }
        h.s("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(ez5 ez5) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }
}
