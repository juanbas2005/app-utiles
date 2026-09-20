package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class CoordinatorLayout extends ViewGroup implements ey4, fy4 {
    public static final String P;
    public static final Class[] Q = {Context.class, AttributeSet.class};
    public static final ThreadLocal R = new ThreadLocal();
    public static final a91 S = new a91(11);
    public static final nl5 T = new nl5();
    public final int[] A = new int[2];
    public final int[] B = new int[2];
    public boolean C;
    public boolean D;
    public final int[] E;
    public View F;
    public View G;
    public a71 H;
    public boolean I;
    public db8 J;
    public boolean K;
    public Drawable L;
    public ViewGroup.OnHierarchyChangeListener M;
    public f96 N;
    public final dv5 O;
    public final ArrayList w = new ArrayList();
    public final am6 x = new am6(10);
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        P = str;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.O = new dv5(7, (byte) 0);
        int[] iArr = kv5.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.E = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.E;
                iArr2[i] = (int) (((float) iArr2[i]) * f);
            }
        }
        this.L = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new y61(this));
        WeakHashMap weakHashMap = e58.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) T.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i, Rect rect, Rect rect2, z61 z61, int i2, int i3) {
        int i4;
        int i5;
        int i6 = z61.c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = z61.d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, i);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int i10 = absoluteGravity2 & 7;
        int i11 = absoluteGravity2 & 112;
        if (i10 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i10 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i11 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i11 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i8 == 1) {
            i4 -= i2 / 2;
        } else if (i8 != 5) {
            i4 -= i2;
        }
        if (i9 == 16) {
            i5 -= i3 / 2;
        } else if (i9 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    public static z61 n(View view) {
        z61 z61 = (z61) view.getLayoutParams();
        if (!z61.b) {
            x61 x61 = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                x61 = (x61) cls.getAnnotation(x61.class);
                if (x61 != null) {
                    break;
                }
            }
            if (x61 != null) {
                try {
                    w61 w61 = (w61) x61.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    w61 w612 = z61.a;
                    if (w612 != w61) {
                        if (w612 != null) {
                            w612.e();
                        }
                        z61.a = w61;
                        z61.b = true;
                        if (w61 != null) {
                            w61.c(z61);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + x61.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            z61.b = true;
        }
        return z61;
    }

    public static void u(View view, int i) {
        z61 z61 = (z61) view.getLayoutParams();
        int i2 = z61.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = e58.a;
            view.offsetLeftAndRight(i - i2);
            z61.i = i;
        }
    }

    public static void v(View view, int i) {
        z61 z61 = (z61) view.getLayoutParams();
        int i2 = z61.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = e58.a;
            view.offsetTopAndBottom(i - i2);
            z61.j = i;
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        w61 w61;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i5;
            } else {
                z61 z61 = (z61) childAt.getLayoutParams();
                if (z61.a(i5) && (w61 = z61.a) != null) {
                    int[] iArr2 = this.A;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    w61.k(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        i6 = Math.max(i6, iArr2[0]);
                    } else {
                        i6 = Math.min(i6, iArr2[0]);
                    }
                    if (i4 > 0) {
                        i7 = Math.max(i7, iArr2[1]);
                    } else {
                        i7 = Math.min(i7, iArr2[1]);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            p(1);
        }
    }

    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, 0, this.B);
    }

    public final boolean c(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                z61 z61 = (z61) childAt.getLayoutParams();
                w61 w61 = z61.a;
                if (w61 != null) {
                    boolean o = w61.o(childAt, i, i2);
                    z2 |= o;
                    if (i2 == 0) {
                        z61.m = o;
                    } else if (i2 == 1) {
                        z61.n = o;
                    }
                } else if (i2 == 0) {
                    z61.m = false;
                } else if (i2 == 1) {
                    z61.n = false;
                }
            }
        }
        return z2;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof z61) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void d(View view, View view2, int i, int i2) {
        dv5 dv5 = this.O;
        if (i2 == 1) {
            dv5.c = i;
        } else {
            dv5.b = i;
        }
        this.G = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((z61) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        w61 w61 = ((z61) view.getLayoutParams()).a;
        if (w61 != null) {
            w61.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.L;
        if (drawable == null || !drawable.isStateful()) {
            z2 = false;
        } else {
            z2 = drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e(View view, int i) {
        dv5 dv5 = this.O;
        if (i == 1) {
            dv5.c = 0;
        } else {
            dv5.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            z61 z61 = (z61) childAt.getLayoutParams();
            if (z61.a(i)) {
                w61 w61 = z61.a;
                if (w61 != null) {
                    w61.p(childAt, view, i);
                }
                if (i == 0) {
                    z61.m = false;
                } else if (i == 1) {
                    z61.n = false;
                }
            }
        }
        this.G = null;
    }

    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        w61 w61;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                z61 z61 = (z61) childAt.getLayoutParams();
                int i7 = i3;
                if (z61.a(i7) && (w61 = z61.a) != null) {
                    int[] iArr2 = this.A;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    w61.j(this, childAt, view, i, i2, iArr2, i7);
                    if (i > 0) {
                        min = Math.max(i4, iArr2[0]);
                    } else {
                        min = Math.min(i4, iArr2[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr2[1]);
                    } else {
                        min2 = Math.min(i5, iArr2[1]);
                    }
                    i5 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new z61();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof z61) {
            return new z61((z61) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new z61((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new z61(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.w);
    }

    public final db8 getLastWindowInsets() {
        return this.J;
    }

    public int getNestedScrollAxes() {
        dv5 dv5 = this.O;
        return dv5.c | dv5.b;
    }

    public Drawable getStatusBarBackground() {
        return this.L;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(z61 z61, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + z61.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - z61.rightMargin));
        int max2 = Math.max(getPaddingTop() + z61.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - z61.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        zt6 zt6 = (zt6) this.x.y;
        int i = zt6.y;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) zt6.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(zt6.g(i2));
            }
        }
        ArrayList arrayList3 = this.z;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = l58.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = l58.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        l58.a(this, view, matrix);
        ThreadLocal threadLocal3 = l58.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.E;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i, int i2) {
        nl5 nl5 = T;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            nl5.c(g);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.I) {
            if (this.H == null) {
                this.H = new a71(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.H);
        }
        if (this.J == null) {
            WeakHashMap weakHashMap = e58.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.D = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.I && this.H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.H);
        }
        View view = this.G;
        if (view != null) {
            e(view, 0);
        }
        this.D = false;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.K && this.L != null) {
            db8 db8 = this.J;
            if (db8 != null) {
                i = db8.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.L.setBounds(0, 0, getWidth(), i);
                this.L.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r;
        }
        t(true);
        return r;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        w61 w61;
        WeakHashMap weakHashMap = e58.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((w61 = ((z61) view.getLayoutParams()).a) == null || !w61.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0189  */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        w61 w61;
        int i12;
        int i13;
        View view;
        int i14;
        int i15;
        int i16;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i17 = 0;
        loop0:
        while (true) {
            if (i17 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i17);
            zt6 zt6 = (zt6) coordinatorLayout.x.y;
            int i18 = zt6.y;
            for (int i19 = 0; i19 < i18; i19++) {
                ArrayList arrayList2 = (ArrayList) zt6.j(i19);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i17++;
        }
        if (z2 != coordinatorLayout.I) {
            boolean z6 = coordinatorLayout.D;
            if (z2) {
                if (z6) {
                    if (coordinatorLayout.H == null) {
                        coordinatorLayout.H = new a71(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.H);
                }
                coordinatorLayout.I = true;
            } else {
                if (z6 && coordinatorLayout.H != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.H);
                }
                coordinatorLayout.I = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = e58.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        if (layoutDirection == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.J == null || !coordinatorLayout.getFitsSystemWindows()) {
            z4 = false;
        } else {
            z4 = true;
        }
        ArrayList arrayList3 = coordinatorLayout.w;
        int size3 = arrayList3.size();
        int i22 = 0;
        int i23 = 0;
        while (i22 < size3) {
            View view2 = (View) arrayList3.get(i22);
            int i24 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i3 = size3;
                i6 = i22;
                i5 = paddingLeft;
                suggestedMinimumWidth = i24;
                z5 = false;
                i4 = paddingRight;
            } else {
                z61 z61 = (z61) view2.getLayoutParams();
                int i25 = z61.e;
                if (i25 < 0 || mode == 0) {
                    i7 = suggestedMinimumHeight;
                } else {
                    int m = coordinatorLayout.m(i25);
                    int i26 = z61.c;
                    if (i26 == 0) {
                        i26 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, layoutDirection) & 7;
                    i7 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        i16 = Math.max(0, (size - paddingRight) - m);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        i16 = Math.max(0, m - paddingLeft);
                    }
                    int i27 = size3;
                    i8 = i16;
                    i9 = i27;
                    if (!z4 || view2.getFitsSystemWindows()) {
                        i3 = i9;
                        i10 = i;
                        i11 = i2;
                    } else {
                        i3 = i9;
                        int c = coordinatorLayout.J.c() + coordinatorLayout.J.b();
                        int a = coordinatorLayout.J.a() + coordinatorLayout.J.d();
                        i10 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i11 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                    }
                    w61 = z61.a;
                    if (w61 == null) {
                        z5 = false;
                        i5 = paddingLeft;
                        i13 = i24;
                        i4 = paddingRight;
                        i12 = i7;
                        arrayList = arrayList3;
                        int i28 = i10;
                        View view3 = view2;
                        i6 = i22;
                        int i29 = i11;
                        boolean h = w61.h(this, view3, i28, i8, i29);
                        view = view3;
                        i10 = i28;
                        i15 = i8;
                        i14 = i29;
                        if (h) {
                            coordinatorLayout = this;
                            int max = Math.max(i13, view.getMeasuredWidth() + i20 + z61.leftMargin + z61.rightMargin);
                            int max2 = Math.max(i12, view.getMeasuredHeight() + i21 + z61.topMargin + z61.bottomMargin);
                            i23 = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumWidth = max;
                            suggestedMinimumHeight = max2;
                        }
                    } else {
                        i5 = paddingLeft;
                        i13 = i24;
                        z5 = false;
                        i4 = paddingRight;
                        i12 = i7;
                        arrayList = arrayList3;
                        i15 = i8;
                        i14 = i11;
                        view = view2;
                        i6 = i22;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i10, i15, i14, 0);
                    int max3 = Math.max(i13, view.getMeasuredWidth() + i20 + z61.leftMargin + z61.rightMargin);
                    int max22 = Math.max(i12, view.getMeasuredHeight() + i21 + z61.topMargin + z61.bottomMargin);
                    i23 = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumWidth = max3;
                    suggestedMinimumHeight = max22;
                }
                i9 = size3;
                i8 = 0;
                if (!z4 || view2.getFitsSystemWindows()) {
                }
                w61 = z61.a;
                if (w61 == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i10, i15, i14, 0);
                int max32 = Math.max(i13, view.getMeasuredWidth() + i20 + z61.leftMargin + z61.rightMargin);
                int max222 = Math.max(i12, view.getMeasuredHeight() + i21 + z61.topMargin + z61.bottomMargin);
                i23 = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumWidth = max32;
                suggestedMinimumHeight = max222;
            }
            i22 = i6 + 1;
            paddingLeft = i5;
            paddingRight = i4;
            size3 = i3;
            arrayList3 = arrayList;
            boolean z7 = z5;
        }
        int i30 = i23;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, -16777216 & i30), View.resolveSizeAndState(suggestedMinimumHeight, i2, i30 << 16));
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                z61 z61 = (z61) childAt.getLayoutParams();
                if (z61.a(0)) {
                    w61 w61 = z61.a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        w61 w61;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                z61 z61 = (z61) childAt.getLayoutParams();
                if (z61.a(0) && (w61 = z61.a) != null) {
                    z2 |= w61.i(view);
                }
            }
        }
        return z2;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        b(view, i, i2, i3, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof b71)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b71 b71 = (b71) parcelable;
        super.onRestoreInstanceState(b71.w);
        SparseArray sparseArray = b71.y;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            w61 w61 = n(childAt).a;
            if (!(id == -1 || w61 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                w61.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, x, b71] */
    public final Parcelable onSaveInstanceState() {
        Parcelable n;
        ? xVar = new x(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            w61 w61 = ((z61) childAt.getLayoutParams()).a;
            if (!(id == -1 || w61 == null || (n = w61.n(childAt)) == null)) {
                sparseArray.append(id, n);
            }
        }
        xVar.y = sparseArray;
        return xVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3 = motionEvent;
        int actionMasked = motionEvent3.getActionMasked();
        if (this.F == null) {
            z3 = r(motionEvent3, 1);
        } else {
            z3 = false;
            w61 w61 = ((z61) this.F.getLayoutParams()).a;
            if (w61 != null) {
                z2 = w61.q(this.F, motionEvent3);
                motionEvent2 = null;
                if (this.F != null) {
                    z2 |= super.onTouchEvent(motionEvent);
                } else if (z3) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    super.onTouchEvent(motionEvent2);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                if (actionMasked == 1 && actionMasked == 3) {
                    return z2;
                }
                t(false);
                return z2;
            }
        }
        z2 = false;
        motionEvent2 = null;
        if (this.F != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1 && actionMasked == 3) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b6 A[EDGE_INSN: B:118:0x02b6->B:111:0x02b6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0270  */
    public final void p(int i) {
        int i2;
        ArrayList arrayList;
        Rect rect;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        Rect rect2;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        View view;
        z61 z61;
        boolean z4;
        w61 w61;
        int i14 = i;
        WeakHashMap weakHashMap = e58.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.w;
        int size = arrayList3.size();
        Rect g = g();
        Rect g2 = g();
        Rect g3 = g();
        int i15 = 0;
        while (true) {
            nl5 nl5 = T;
            if (i15 < size) {
                View view2 = (View) arrayList3.get(i15);
                z61 z612 = (z61) view2.getLayoutParams();
                if (i14 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i3 = size;
                    rect = g3;
                    i2 = i15;
                } else {
                    int i16 = 0;
                    while (i16 < i15) {
                        if (z612.l == ((View) arrayList3.get(i16))) {
                            z61 z613 = (z61) view2.getLayoutParams();
                            if (z613.k != null) {
                                Rect g4 = g();
                                Rect g5 = g();
                                z61 z614 = z612;
                                Rect g6 = g();
                                int i17 = layoutDirection;
                                k(z613.k, g4);
                                i(view2, g5, false);
                                int i18 = i16;
                                z61 z615 = z613;
                                int measuredWidth = view2.getMeasuredWidth();
                                View view3 = view2;
                                Rect rect3 = g4;
                                int measuredHeight = view3.getMeasuredHeight();
                                z61 z616 = z614;
                                arrayList2 = arrayList3;
                                z61 = z616;
                                int i19 = i17;
                                i13 = i18;
                                layoutDirection = i19;
                                i11 = i15;
                                view = view3;
                                l(layoutDirection, rect3, g6, z615, measuredWidth, measuredHeight);
                                i12 = size;
                                rect2 = g3;
                                if (g6.left == g5.left && g6.top == g5.top) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                h(z615, g6, measuredWidth, measuredHeight);
                                int i20 = g6.left - g5.left;
                                int i21 = g6.top - g5.top;
                                if (i20 != 0) {
                                    WeakHashMap weakHashMap2 = e58.a;
                                    view.offsetLeftAndRight(i20);
                                }
                                if (i21 != 0) {
                                    WeakHashMap weakHashMap3 = e58.a;
                                    view.offsetTopAndBottom(i21);
                                }
                                if (z4 && (w61 = z615.a) != null) {
                                    w61.d(this, view, z615.k);
                                }
                                rect3.setEmpty();
                                nl5.c(rect3);
                                g5.setEmpty();
                                nl5.c(g5);
                                g6.setEmpty();
                                nl5.c(g6);
                                i16 = i13 + 1;
                                z612 = z61;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i12;
                                i15 = i11;
                                g3 = rect2;
                            }
                        }
                        arrayList2 = arrayList3;
                        z61 = z612;
                        i13 = i16;
                        i12 = size;
                        rect2 = g3;
                        i11 = i15;
                        view = view2;
                        i16 = i13 + 1;
                        z612 = z61;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i12;
                        i15 = i11;
                        g3 = rect2;
                    }
                    ArrayList arrayList4 = arrayList3;
                    z61 z617 = z612;
                    int i22 = size;
                    Rect rect4 = g3;
                    i2 = i15;
                    View view4 = view2;
                    i(view4, g2, true);
                    if (z617.g != 0 && !g2.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(z617.g, layoutDirection);
                        int i23 = absoluteGravity & 112;
                        if (i23 == 48) {
                            g.top = Math.max(g.top, g2.bottom);
                        } else if (i23 == 80) {
                            g.bottom = Math.max(g.bottom, getHeight() - g2.top);
                        }
                        int i24 = absoluteGravity & 7;
                        if (i24 == 3) {
                            g.left = Math.max(g.left, g2.right);
                        } else if (i24 == 5) {
                            g.right = Math.max(g.right, getWidth() - g2.left);
                        }
                    }
                    if (z617.h != 0 && view4.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = e58.a;
                        if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                            z61 z618 = (z61) view4.getLayoutParams();
                            w61 w612 = z618.a;
                            Rect g7 = g();
                            Rect g8 = g();
                            g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                            if (w612 == null || !w612.a(view4)) {
                                g7.set(g8);
                            } else if (!g8.contains(g7)) {
                                String shortString = g7.toShortString();
                                String shortString2 = g8.toShortString();
                                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + shortString + " | Bounds:" + shortString2);
                            }
                            g8.setEmpty();
                            nl5.c(g8);
                            if (!g7.isEmpty()) {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(z618.h, layoutDirection);
                                if ((absoluteGravity2 & 48) != 48 || (i9 = (g7.top - z618.topMargin) - z618.j) >= (i10 = g.top)) {
                                    z2 = false;
                                } else {
                                    v(view4, i10 - i9);
                                    z2 = true;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g7.bottom) - z618.bottomMargin) + z618.j) < (i8 = g.bottom)) {
                                    v(view4, height - i8);
                                    z2 = true;
                                }
                                if (!z2) {
                                    v(view4, 0);
                                }
                                if ((absoluteGravity2 & 3) != 3 || (i6 = (g7.left - z618.leftMargin) - z618.i) >= (i7 = g.left)) {
                                    z3 = false;
                                } else {
                                    u(view4, i7 - i6);
                                    z3 = true;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g7.right) - z618.rightMargin) + z618.i) < (i5 = g.right)) {
                                    u(view4, width - i5);
                                    z3 = true;
                                }
                                if (!z3) {
                                    u(view4, 0);
                                }
                                g7.setEmpty();
                                nl5.c(g7);
                                if (i14 == 2) {
                                    rect = rect4;
                                    rect.set(((z61) view4.getLayoutParams()).o);
                                    if (rect.equals(g2)) {
                                        arrayList = arrayList4;
                                        i3 = i22;
                                    } else {
                                        ((z61) view4.getLayoutParams()).o.set(g2);
                                    }
                                } else {
                                    rect = rect4;
                                }
                                i4 = i2 + 1;
                                i3 = i22;
                                while (true) {
                                    arrayList = arrayList4;
                                    if (i4 < i3) {
                                        break;
                                    }
                                    View view5 = (View) arrayList.get(i4);
                                    w61 w613 = ((z61) view5.getLayoutParams()).a;
                                    if (w613 != null) {
                                        w613.b(view5);
                                    }
                                    i4++;
                                    arrayList4 = arrayList;
                                }
                            } else {
                                g7.setEmpty();
                                nl5.c(g7);
                            }
                        }
                    }
                    if (i14 == 2) {
                    }
                    i4 = i2 + 1;
                    i3 = i22;
                    while (true) {
                        arrayList = arrayList4;
                        if (i4 < i3) {
                        }
                        i4++;
                        arrayList4 = arrayList;
                    }
                }
                i15 = i2 + 1;
                size = i3;
                g3 = rect;
                arrayList3 = arrayList;
            } else {
                Rect rect5 = g3;
                g.setEmpty();
                nl5.c(g);
                g2.setEmpty();
                nl5.c(g2);
                rect5.setEmpty();
                nl5.c(rect5);
                return;
            }
        }
    }

    public final void q(View view, int i) {
        int i2;
        z61 z61 = (z61) view.getLayoutParams();
        View view2 = z61.k;
        if (view2 != null || z61.f == -1) {
            nl5 nl5 = T;
            if (view2 != null) {
                Rect g = g();
                Rect g2 = g();
                try {
                    k(view2, g);
                    z61 z612 = (z61) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i, g, g2, z612, measuredWidth, measuredHeight);
                    h(z612, g2, measuredWidth, measuredHeight);
                    view.layout(g2.left, g2.top, g2.right, g2.bottom);
                    g.setEmpty();
                    nl5.c(g);
                    g2.setEmpty();
                    nl5.c(g2);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    g.setEmpty();
                    nl5.c(g);
                    g2.setEmpty();
                    nl5.c(g2);
                    throw th2;
                }
            } else {
                int i3 = i;
                int i4 = z61.e;
                if (i4 >= 0) {
                    z61 z613 = (z61) view.getLayoutParams();
                    int i5 = z613.c;
                    if (i5 == 0) {
                        i5 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i5, i3);
                    int i6 = absoluteGravity & 7;
                    int i7 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i3 == 1) {
                        i4 = width - i4;
                    }
                    int m = m(i4) - measuredWidth2;
                    if (i6 == 1) {
                        m += measuredWidth2 / 2;
                    } else if (i6 == 5) {
                        m += measuredWidth2;
                    }
                    if (i7 == 16) {
                        i2 = measuredHeight2 / 2;
                    } else if (i7 != 80) {
                        i2 = 0;
                    } else {
                        i2 = measuredHeight2;
                    }
                    int max = Math.max(getPaddingLeft() + z613.leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - z613.rightMargin));
                    int max2 = Math.max(getPaddingTop() + z613.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - z613.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                z61 z614 = (z61) view.getLayoutParams();
                Rect g3 = g();
                g3.set(getPaddingLeft() + z614.leftMargin, getPaddingTop() + z614.topMargin, (getWidth() - getPaddingRight()) - z614.rightMargin, (getHeight() - getPaddingBottom()) - z614.bottomMargin);
                if (this.J != null) {
                    WeakHashMap weakHashMap = e58.a;
                    if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        g3.left = this.J.b() + g3.left;
                        g3.top = this.J.d() + g3.top;
                        g3.right -= this.J.c();
                        g3.bottom -= this.J.a();
                    }
                }
                Rect g4 = g();
                int i8 = z614.c;
                if ((i8 & 7) == 0) {
                    i8 |= 8388611;
                }
                if ((i8 & 112) == 0) {
                    i8 |= 48;
                }
                Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), g3, g4, i3);
                view.layout(g4.left, g4.top, g4.right, g4.bottom);
                g3.setEmpty();
                nl5.c(g3);
                g4.setEmpty();
                nl5.c(g4);
            }
        } else {
            h.s("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i;
        int actionMasked = motionEvent2.getActionMasked();
        ArrayList arrayList = this.y;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i4);
            } else {
                i2 = i4;
            }
            arrayList.add(getChildAt(i2));
        }
        a91 a91 = S;
        if (a91 != null) {
            Collections.sort(arrayList, a91);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            w61 w61 = ((z61) view.getLayoutParams()).a;
            if (z2 && actionMasked != 0) {
                if (w61 != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i3 == 0) {
                        w61.f(this, view, motionEvent3);
                    } else if (i3 == 1) {
                        w61.q(view, motionEvent3);
                    }
                }
            } else if (!z2 && w61 != null) {
                if (i3 == 0) {
                    z2 = w61.f(this, view, motionEvent2);
                } else if (i3 == 1) {
                    z2 = w61.q(view, motionEvent2);
                }
                if (z2) {
                    this.F = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        w61 w61 = ((z61) view.getLayoutParams()).a;
        if (w61 != null) {
            w61.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.C) {
            t(false);
            this.C = true;
        }
    }

    public final void s() {
        ArrayList arrayList = this.w;
        arrayList.clear();
        am6 am6 = this.x;
        zt6 zt6 = (zt6) am6.y;
        ml5 ml5 = (ml5) am6.x;
        zt6 zt62 = (zt6) am6.y;
        int i = zt6.y;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) zt6.j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                ml5.c(arrayList2);
            }
        }
        zt6.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            z61 n = n(childAt);
            int i4 = n.f;
            if (i4 == -1) {
                n.l = null;
                n.k = null;
            } else {
                View view = n.k;
                if (view != null && view.getId() == i4) {
                    View view2 = n.k;
                    ViewParent parent = view2.getParent();
                    while (parent != this) {
                        if (parent == null || parent == childAt) {
                            n.l = null;
                            n.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        }
                    }
                    n.l = view2;
                }
                View findViewById = findViewById(i4);
                n.k = findViewById;
                if (findViewById != null) {
                    if (findViewById != this) {
                        ViewParent parent2 = findViewById.getParent();
                        while (true) {
                            if (parent2 == this || parent2 == null) {
                                n.l = findViewById;
                            } else if (parent2 != childAt) {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                                parent2 = parent2.getParent();
                            } else if (isInEditMode()) {
                                n.l = null;
                                n.k = null;
                            } else {
                                h.s("Anchor must not be a descendant of the anchored view");
                                return;
                            }
                        }
                    } else if (isInEditMode()) {
                        n.l = null;
                        n.k = null;
                    } else {
                        h.s("View can not be anchored to the the parent CoordinatorLayout");
                        return;
                    }
                } else if (isInEditMode()) {
                    n.l = null;
                    n.k = null;
                } else {
                    ku4.A("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i4), " to anchor view ", childAt);
                    return;
                }
            }
            if (!zt62.containsKey(childAt)) {
                zt62.put(childAt, (Object) null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != n.l) {
                        WeakHashMap weakHashMap = e58.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((z61) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            w61 w61 = n.a;
                            if (w61 != null) {
                                w61.b(childAt);
                            }
                        }
                    }
                    if (!zt62.containsKey(childAt2) && !zt62.containsKey(childAt2)) {
                        zt62.put(childAt2, (Object) null);
                    }
                    if (!zt62.containsKey(childAt2) || !zt62.containsKey(childAt)) {
                        h.q("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) zt62.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) ml5.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        zt62.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) am6.z;
        arrayList4.clear();
        HashSet hashSet = (HashSet) am6.A;
        hashSet.clear();
        int i6 = zt62.y;
        for (int i7 = 0; i7 < i6; i7++) {
            am6.r(zt62.g(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.M = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.L = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.L.setState(getDrawableState());
                }
                Drawable drawable4 = this.L;
                WeakHashMap weakHashMap = e58.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.L;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.L.setCallback(this);
            }
            WeakHashMap weakHashMap2 = e58.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i) {
        boolean z2;
        super.setVisibility(i);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.L;
        if (drawable != null && drawable.isVisible() != z2) {
            this.L.setVisible(z2, false);
        }
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            w61 w61 = ((z61) childAt.getLayoutParams()).a;
            if (w61 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    w61.f(this, childAt, obtain);
                } else {
                    w61.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((z61) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.F = null;
        this.C = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.L) {
            return true;
        }
        return false;
    }

    public final void w() {
        WeakHashMap weakHashMap = e58.a;
        if (getFitsSystemWindows()) {
            if (this.N == null) {
                this.N = new f96(13, (Object) this);
            }
            w48.c(this, this.N);
            setSystemUiVisibility(1280);
            return;
        }
        w48.c(this, (l45) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new z61(getContext(), attributeSet);
    }
}
