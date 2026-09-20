package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ActionBarOverlayLayout extends ViewGroup implements ey4, fy4 {
    public static final int[] b0 = {R.attr.actionBarSize, 16842841};
    public static final db8 c0;
    public static final Rect d0 = new Rect();
    public sk1 A;
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final Rect I = new Rect();
    public final Rect J = new Rect();
    public final Rect K = new Rect();
    public final Rect L = new Rect();
    public db8 M;
    public db8 N;
    public db8 O;
    public db8 P;
    public u7 Q;
    public OverScroller R;
    public ViewPropertyAnimator S;
    public final s7 T;
    public final t7 U;
    public final t7 V;
    public final dv5 W;
    public final w7 a0;
    public int w;
    public int x = 0;
    public ContentFrameLayout y;
    public ActionBarContainer z;

    static {
        qa8 qa8;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            qa8 = new pa8();
        } else if (i >= 35) {
            qa8 = new oa8();
        } else if (i >= 34) {
            qa8 = new na8();
        } else if (i >= 31) {
            qa8 = new ma8();
        } else if (i >= 30) {
            qa8 = new la8();
        } else if (i >= 29) {
            qa8 = new ka8();
        } else {
            qa8 = new ia8();
        }
        qa8.h(ad3.b(0, 1, 0, 1));
        c0 = qa8.b();
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [w7, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        db8 db8 = db8.b;
        this.M = db8;
        this.N = db8;
        this.O = db8;
        this.P = db8;
        this.T = new s7(0, (Object) this);
        this.U = new t7(this, 0);
        this.V = new t7(this, 1);
        i(context);
        this.W = new dv5(7, (byte) 0);
        ? view = new View(context);
        view.setWillNotDraw(true);
        this.a0 = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        int i;
        v7 v7Var = (v7) view.getLayoutParams();
        int i2 = v7Var.leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            v7Var.leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = v7Var.topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            v7Var.topMargin = i5;
            z3 = true;
        }
        int i6 = v7Var.rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            v7Var.rightMargin = i7;
            z3 = true;
        }
        if (!z2 || v7Var.bottomMargin == (i = rect.bottom)) {
            return z3;
        }
        v7Var.bottomMargin = i;
        return true;
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(view, i, i2, i3, i4, i5);
    }

    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final boolean c(View view, View view2, int i, int i2) {
        if (i2 != 0 || !onStartNestedScroll(view, view2, i)) {
            return false;
        }
        return true;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v7;
    }

    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.B != null) {
            if (this.z.getVisibility() == 0) {
                i = (int) (this.z.getTranslationY() + ((float) this.z.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.B.setBounds(0, i, getWidth(), this.B.getIntrinsicHeight() + i);
            this.B.draw(canvas);
        }
    }

    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.z;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        dv5 dv5 = this.W;
        return dv5.c | dv5.b;
    }

    public CharSequence getTitle() {
        k();
        return ((sj7) this.A).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.U);
        removeCallbacks(this.V);
        ViewPropertyAnimator viewPropertyAnimator = this.S;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(b0);
        boolean z2 = false;
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.B = drawable;
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        this.R = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((sj7) this.A).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((sj7) this.A).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public final void k() {
        sk1 sk1;
        if (this.y == null) {
            this.y = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.z = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof sk1) {
                sk1 = (sk1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                sk1 = ((Toolbar) findViewById).getWrapper();
            } else {
                h.s("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                return;
            }
            this.A = sk1;
        }
    }

    public final void l(Menu menu, qj4 qj4) {
        k();
        sj7 sj7 = (sj7) this.A;
        Toolbar toolbar = sj7.a;
        if (sj7.m == null) {
            sj7.m = new d8(toolbar.getContext());
        }
        d8 d8Var = sj7.m;
        d8Var.A = qj4;
        ti4 ti4 = (ti4) menu;
        if (ti4 != null || toolbar.w != null) {
            toolbar.f();
            ti4 ti42 = toolbar.w.L;
            if (ti42 != ti4) {
                if (ti42 != null) {
                    ti42.r(toolbar.j0);
                    ti42.r(toolbar.k0);
                }
                if (toolbar.k0 == null) {
                    toolbar.k0 = new mj7(toolbar);
                }
                d8Var.M = true;
                Context context = toolbar.F;
                if (ti4 != null) {
                    ti4.b(d8Var, context);
                    ti4.b(toolbar.k0, toolbar.F);
                } else {
                    d8Var.k(context, (ti4) null);
                    toolbar.k0.k(toolbar.F, (ti4) null);
                    d8Var.i();
                    toolbar.k0.i();
                }
                toolbar.w.setPopupTheme(toolbar.G);
                toolbar.w.setPresenter(d8Var);
                toolbar.j0 = d8Var;
                toolbar.t();
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        db8 g = db8.g(this, windowInsets);
        boolean g2 = g(this.z, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = e58.a;
        Rect rect = this.I;
        w48.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        za8 za8 = g.a;
        db8 q = za8.q(i, i2, i3, i4);
        this.M = q;
        boolean z2 = true;
        if (!this.N.equals(q)) {
            this.N = this.M;
            g2 = true;
        }
        Rect rect2 = this.J;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z2 = g2;
        }
        if (z2) {
            requestLayout();
        }
        return za8.a().a.c().a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = e58.a;
        requestApplyInsets();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                v7 v7Var = (v7) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = v7Var.leftMargin + paddingLeft;
                int i7 = v7Var.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125  */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        qa8 qa8;
        k();
        int i4 = i;
        int i5 = i2;
        measureChildWithMargins(this.z, i4, 0, i5, 0);
        v7 v7Var = (v7) this.z.getLayoutParams();
        int max = Math.max(0, this.z.getMeasuredWidth() + v7Var.leftMargin + v7Var.rightMargin);
        int max2 = Math.max(0, this.z.getMeasuredHeight() + v7Var.topMargin + v7Var.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.z.getMeasuredState());
        WeakHashMap weakHashMap = e58.a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i3 = this.w;
            if (this.D && this.z.getTabContainer() != null) {
                i3 += this.w;
            }
        } else {
            i3 = this.z.getVisibility() != 8 ? this.z.getMeasuredHeight() : 0;
        }
        Rect rect = this.I;
        Rect rect2 = this.K;
        rect2.set(rect);
        this.O = this.M;
        if (!this.C && !z2) {
            w7 w7Var = this.a0;
            db8 db8 = c0;
            Rect rect3 = this.L;
            w48.b(w7Var, db8, rect3);
            if (!rect3.equals(d0)) {
                rect2.top += i3;
                rect2.bottom = rect2.bottom;
                this.O = this.O.a.q(0, i3, 0, 0);
                g(this.y, rect2, true);
                if (!this.P.equals(this.O)) {
                    db8 db82 = this.O;
                    this.P = db82;
                    e58.b(this.y, db82);
                }
                measureChildWithMargins(this.y, i4, 0, i5, 0);
                v7 v7Var2 = (v7) this.y.getLayoutParams();
                int max3 = Math.max(max, this.y.getMeasuredWidth() + v7Var2.leftMargin + v7Var2.rightMargin);
                int max4 = Math.max(max2, this.y.getMeasuredHeight() + v7Var2.topMargin + v7Var2.bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.y.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
            }
        }
        ad3 b = ad3.b(this.O.b(), this.O.d() + i3, this.O.c(), this.O.a());
        db8 db83 = this.O;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 36) {
            qa8 = new pa8(db83);
        } else if (i6 >= 35) {
            qa8 = new oa8(db83);
        } else if (i6 >= 34) {
            qa8 = new na8(db83);
        } else if (i6 >= 31) {
            qa8 = new ma8(db83);
        } else if (i6 >= 30) {
            qa8 = new la8(db83);
        } else if (i6 >= 29) {
            qa8 = new ka8(db83);
        } else {
            qa8 = new ia8(db83);
        }
        qa8.h(b);
        this.O = qa8.b();
        g(this.y, rect2, true);
        if (!this.P.equals(this.O)) {
        }
        measureChildWithMargins(this.y, i4, 0, i5, 0);
        v7 v7Var22 = (v7) this.y.getLayoutParams();
        int max32 = Math.max(max, this.y.getMeasuredWidth() + v7Var22.leftMargin + v7Var22.rightMargin);
        int max42 = Math.max(max2, this.y.getMeasuredHeight() + v7Var22.topMargin + v7Var22.bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.y.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i4, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i5, combineMeasuredStates22 << 16));
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.E || !z2) {
            return false;
        }
        this.R.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.R.getFinalY() > this.z.getHeight()) {
            h();
            this.V.run();
        } else {
            h();
            this.U.run();
        }
        this.F = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.G + i2;
        this.G = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = (defpackage.u98) r0;
     */
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        u98 u98;
        d68 d68;
        this.W.b = i;
        this.G = getActionBarHideOffset();
        h();
        u7 u7Var = this.Q;
        if (u7Var != null && (d68 = u98.t) != null) {
            d68.a();
            u98.t = null;
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.z.getVisibility() != 0) {
            return false;
        }
        return this.E;
    }

    public final void onStopNestedScroll(View view) {
        if (this.E && !this.F) {
            if (this.G <= this.z.getHeight()) {
                h();
                postDelayed(this.U, 600);
                return;
            }
            h();
            postDelayed(this.V, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z2;
        boolean z3;
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.H ^ i;
        this.H = i;
        if ((i & 4) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u7 u7Var = this.Q;
        if (u7Var != null) {
            u98 u98 = (u98) u7Var;
            u98.o = !z3;
            if (z2 || !z3) {
                if (u98.q) {
                    u98.q = false;
                    u98.e(true);
                }
            } else if (!u98.q) {
                u98.q = true;
                u98.e(true);
            }
        }
        if ((i2 & 256) != 0 && this.Q != null) {
            WeakHashMap weakHashMap = e58.a;
            requestApplyInsets();
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.x = i;
        u7 u7Var = this.Q;
        if (u7Var != null) {
            ((u98) u7Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.z.setTranslationY((float) (-Math.max(0, Math.min(i, this.z.getHeight()))));
    }

    public void setActionBarVisibilityCallback(u7 u7Var) {
        this.Q = u7Var;
        if (getWindowToken() != null) {
            ((u98) this.Q).n = this.x;
            int i = this.H;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = e58.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.D = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.E) {
            this.E = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        Drawable drawable;
        k();
        sj7 sj7 = (sj7) this.A;
        if (i != 0) {
            drawable = rc9.N(sj7.a.getContext(), i);
        } else {
            drawable = null;
        }
        sj7.d = drawable;
        sj7.c();
    }

    public void setLogo(int i) {
        Drawable drawable;
        k();
        sj7 sj7 = (sj7) this.A;
        if (i != 0) {
            drawable = rc9.N(sj7.a.getContext(), i);
        } else {
            drawable = null;
        }
        sj7.e = drawable;
        sj7.c();
    }

    public void setOverlayMode(boolean z2) {
        this.C = z2;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((sj7) this.A).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        sj7 sj7 = (sj7) this.A;
        if (!sj7.g) {
            Toolbar toolbar = sj7.a;
            sj7.h = charSequence;
            if ((sj7.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (sj7.g) {
                    e58.n(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        sj7 sj7 = (sj7) this.A;
        sj7.d = drawable;
        sj7.c();
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void f(View view, int i, int i2, int[] iArr, int i3) {
    }
}
