package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ActionMenuView extends r64 implements si4, tj4 {
    public ti4 L;
    public Context M;
    public int N = 0;
    public boolean O;
    public d8 P;
    public br4 Q;
    public boolean R;
    public int S;
    public final int T;
    public final int U;
    public g8 V;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.T = (int) (56.0f * f);
        this.U = (int) (f * 4.0f);
        this.M = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f8, android.widget.LinearLayout$LayoutParams] */
    public static f8 j() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.a = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [f8, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static f8 k(ViewGroup.LayoutParams layoutParams) {
        f8 f8Var;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof f8) {
            f8 f8Var2 = (f8) layoutParams;
            ? layoutParams2 = new LinearLayout.LayoutParams(f8Var2);
            layoutParams2.a = f8Var2.a;
            f8Var = layoutParams2;
        } else {
            f8Var = new LinearLayout.LayoutParams(layoutParams);
        }
        if (f8Var.gravity <= 0) {
            f8Var.gravity = 16;
        }
        return f8Var;
    }

    public final boolean a(yi4 yi4) {
        return this.L.q(yi4, (rj4) null, 0);
    }

    public final void b(ti4 ti4) {
        this.L = ti4;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f8;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final /* bridge */ /* synthetic */ q64 f() {
        return j();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q64] */
    public final q64 g(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.L == null) {
            Context context = getContext();
            ti4 ti4 = new ti4(context);
            this.L = ti4;
            ti4.e = new ji8(3, (Object) this);
            d8 d8Var = new d8(context);
            this.P = d8Var;
            d8Var.H = true;
            d8Var.I = true;
            d8Var.A = new g22(19);
            this.L.b(d8Var, this.M);
            d8 d8Var2 = this.P;
            d8Var2.D = this;
            this.L = d8Var2.y;
        }
        return this.L;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        d8 d8Var = this.P;
        c8 c8Var = d8Var.E;
        if (c8Var != null) {
            return c8Var.getDrawable();
        }
        if (d8Var.G) {
            return d8Var.F;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.N;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ q64 h(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof e8)) {
            z = ((e8) childAt).a();
        }
        if (i <= 0 || !(childAt2 instanceof e8)) {
            return z;
        }
        return ((e8) childAt2).b() | z;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d8 d8Var = this.P;
        if (d8Var != null) {
            d8Var.i();
            if (this.P.j()) {
                this.P.g();
                this.P.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d8 d8Var = this.P;
        if (d8Var != null) {
            d8Var.g();
            a8 a8Var = d8Var.P;
            if (a8Var != null && a8Var.b()) {
                a8Var.i.dismiss();
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        if (!this.R) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = o68.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f8 f8Var = (f8) childAt.getLayoutParams();
                if (f8Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i6 = getPaddingLeft() + f8Var.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - f8Var.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + f8Var.leftMargin) + f8Var.rightMargin;
                    l(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (z2) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                f8 f8Var2 = (f8) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !f8Var2.a) {
                    int i18 = width - f8Var2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + f8Var2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            f8 f8Var3 = (f8) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !f8Var3.a) {
                int i21 = paddingLeft + f8Var3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + f8Var3.rightMargin + max + i21;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        ActionMenuItemView actionMenuItemView;
        boolean z6;
        int i9;
        boolean z7;
        ti4 ti4;
        boolean z8 = this.R;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.R = z;
        if (z8 != z) {
            this.S = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.R || (ti4 = this.L) == null || size == this.S)) {
            this.S = size;
            ti4.p(true);
        }
        int childCount = getChildCount();
        if (!this.R || childCount <= 0) {
            int i10 = i2;
            for (int i11 = 0; i11 < childCount; i11++) {
                f8 f8Var = (f8) getChildAt(i11).getLayoutParams();
                f8Var.rightMargin = 0;
                f8Var.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.T;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z9 = false;
        int i21 = 0;
        long j = 0;
        while (true) {
            i3 = this.U;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i16;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z10) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                f8 f8Var2 = (f8) childAt.getLayoutParams();
                f8Var2.f = false;
                f8Var2.c = 0;
                f8Var2.b = 0;
                f8Var2.d = false;
                f8Var2.leftMargin = 0;
                f8Var2.rightMargin = 0;
                if (!z10 || TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                f8Var2.e = z5;
                if (f8Var2.a) {
                    i8 = 1;
                } else {
                    i8 = i14;
                }
                boolean z11 = z10;
                f8 f8Var3 = (f8) childAt.getLayoutParams();
                int i24 = i14;
                i7 = i16;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i23, View.MeasureSpec.getMode(childMeasureSpec));
                if (z11) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                boolean z12 = z6;
                if (i8 <= 0 || (z6 && i8 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i8, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i9++;
                    }
                    if (z12 && i9 < 2) {
                        i9 = 2;
                    }
                }
                if (f8Var3.a || !z12) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                f8Var3.d = z7;
                f8Var3.b = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i7, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i9);
                if (f8Var2.d) {
                    i21++;
                }
                if (f8Var2.a) {
                    z9 = true;
                }
                i14 = i24 - i9;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j |= (long) (1 << i20);
                }
            }
            i20++;
            size3 = i22;
            paddingBottom = i23;
            i16 = i7;
        }
        int i25 = size3;
        int i26 = i14;
        int i27 = i16;
        if (!z9 || i18 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i28 = i26;
        boolean z13 = false;
        while (true) {
            if (i21 <= 0 || i28 <= 0) {
                i4 = i17;
            } else {
                int i29 = Integer.MAX_VALUE;
                long j2 = 0;
                int i30 = 0;
                int i31 = 0;
                while (i31 < childCount2) {
                    int i32 = i17;
                    f8 f8Var4 = (f8) getChildAt(i31).getLayoutParams();
                    boolean z14 = z2;
                    if (f8Var4.d) {
                        int i33 = f8Var4.b;
                        if (i33 < i29) {
                            j2 = 1 << i31;
                            i29 = i33;
                            i30 = 1;
                        } else if (i33 == i29) {
                            j2 |= 1 << i31;
                            i30++;
                        }
                    }
                    i31++;
                    z2 = z14;
                    i17 = i32;
                }
                i4 = i17;
                boolean z15 = z2;
                j |= j2;
                if (i30 > i28) {
                    break;
                }
                int i34 = i29 + 1;
                int i35 = 0;
                while (i35 < childCount2) {
                    View childAt2 = getChildAt(i35);
                    f8 f8Var5 = (f8) childAt2.getLayoutParams();
                    boolean z16 = z9;
                    long j3 = (long) (1 << i35);
                    if ((j2 & j3) != 0) {
                        if (!z15 || !f8Var5.e) {
                            z4 = true;
                        } else {
                            z4 = true;
                            if (i28 == 1) {
                                childAt2.setPadding(i3 + i27, 0, i3, 0);
                            }
                        }
                        f8Var5.b += z4 ? 1 : 0;
                        f8Var5.f = z4;
                        i28--;
                    } else if (f8Var5.b == i34) {
                        j |= j3;
                    }
                    i35++;
                    z9 = z16;
                }
                z2 = z15;
                i17 = i4;
                z13 = true;
            }
        }
        i4 = i17;
        if (z9 || i18 != 1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i28 > 0 && j != 0 && (i28 < i18 - 1 || z3 || i19 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z3) {
                if ((j & 1) != 0 && !((f8) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((f8) getChildAt(i36).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i6 = (int) (((float) (i28 * i27)) / bitCount);
            } else {
                i6 = 0;
            }
            boolean z17 = z13;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    f8 f8Var6 = (f8) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        f8Var6.c = i6;
                        f8Var6.f = true;
                        if (i37 == 0 && !f8Var6.e) {
                            f8Var6.leftMargin = (-i6) / 2;
                        }
                        z17 = true;
                    } else if (f8Var6.a) {
                        f8Var6.c = i6;
                        f8Var6.f = true;
                        f8Var6.rightMargin = (-i6) / 2;
                        z17 = true;
                    } else {
                        if (i37 != 0) {
                            f8Var6.leftMargin = i6 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            f8Var6.rightMargin = i6 / 2;
                        }
                    }
                }
            }
            z13 = z17;
        }
        if (z13) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                f8 f8Var7 = (f8) childAt4.getLayoutParams();
                if (f8Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((f8Var7.b * i27) + f8Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i4;
        } else {
            i5 = i25;
        }
        setMeasuredDimension(i12, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.P.M = z;
    }

    public void setOnMenuItemClickListener(g8 g8Var) {
        this.V = g8Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        d8 d8Var = this.P;
        c8 c8Var = d8Var.E;
        if (c8Var != null) {
            c8Var.setImageDrawable(drawable);
            return;
        }
        d8Var.G = true;
        d8Var.F = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.O = z;
    }

    public void setPopupTheme(int i) {
        if (this.N != i) {
            this.N = i;
            if (i == 0) {
                this.M = getContext();
            } else {
                this.M = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(d8 d8Var) {
        this.P = d8Var;
        d8Var.D = this;
        this.L = d8Var.y;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
