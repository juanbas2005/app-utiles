package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ActionBarContextView extends ViewGroup {
    public int A;
    public c68 B;
    public boolean C;
    public boolean D;
    public CharSequence E;
    public CharSequence F;
    public View G;
    public View H;
    public View I;
    public LinearLayout J;
    public TextView K;
    public TextView L;
    public final int M;
    public final int N;
    public boolean O;
    public final int P;
    public final v w;
    public final Context x;
    public ActionMenuView y;
    public d8 z;

    /* JADX WARNING: type inference failed for: r1v0, types: [v, java.lang.Object] */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        ? obj = new Object();
        obj.c = this;
        obj.b = false;
        this.w = obj;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.x = context;
        } else {
            this.x = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv5.d, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = rc9.N(context, resourceId);
        }
        setBackground(drawable);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(4, 0);
        this.A = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.P = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z2) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(h8 h8Var) {
        View view = this.G;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.P, this, false);
            this.G = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.G);
        }
        View findViewById = this.G.findViewById(R.id.action_mode_close_button);
        this.H = findViewById;
        findViewById.setOnClickListener(new r7(0, h8Var));
        ti4 e = h8Var.e();
        d8 d8Var = this.z;
        if (d8Var != null) {
            d8Var.g();
            a8 a8Var = d8Var.P;
            if (a8Var != null && a8Var.b()) {
                a8Var.i.dismiss();
            }
        }
        d8 d8Var2 = new d8(getContext());
        this.z = d8Var2;
        d8Var2.H = true;
        d8Var2.I = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e.b(this.z, this.x);
        d8 d8Var3 = this.z;
        tj4 tj4 = d8Var3.D;
        if (tj4 == null) {
            tj4 tj42 = (tj4) d8Var3.z.inflate(d8Var3.B, this, false);
            d8Var3.D = tj42;
            tj42.b(d8Var3.y);
            d8Var3.i();
        }
        tj4 tj43 = d8Var3.D;
        if (tj4 != tj43) {
            ((ActionMenuView) tj43).setPresenter(d8Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) tj43;
        this.y = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.y, layoutParams);
    }

    public final void d() {
        int i;
        if (this.J == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.J = linearLayout;
            this.K = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.L = (TextView) this.J.findViewById(R.id.action_bar_subtitle);
            int i2 = this.M;
            if (i2 != 0) {
                this.K.setTextAppearance(getContext(), i2);
            }
            int i3 = this.N;
            if (i3 != 0) {
                this.L.setTextAppearance(getContext(), i3);
            }
        }
        this.K.setText(this.E);
        this.L.setText(this.F);
        boolean isEmpty = TextUtils.isEmpty(this.E);
        boolean isEmpty2 = TextUtils.isEmpty(this.F);
        TextView textView = this.L;
        int i4 = 8;
        if (!isEmpty2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.J;
        if (!isEmpty || !isEmpty2) {
            i4 = 0;
        }
        linearLayout2.setVisibility(i4);
        if (this.J.getParent() == null) {
            addView(this.J);
        }
    }

    public final void e() {
        removeAllViews();
        this.I = null;
        this.y = null;
        this.z = null;
        View view = this.H;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.B != null) {
            return this.w.a;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.A;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    /* renamed from: h */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            c68 c68 = this.B;
            if (c68 != null) {
                c68.b();
            }
            super.setVisibility(i);
        }
    }

    public final c68 i(long j, int i) {
        c68 c68 = this.B;
        if (c68 != null) {
            c68.b();
        }
        v vVar = this.w;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            c68 a = e58.a(this);
            a.a(1.0f);
            a.c(j);
            ((ActionBarContextView) vVar.c).B = a;
            vVar.a = i;
            a.d(vVar);
            return a;
        }
        c68 a2 = e58.a(this);
        a2.a(0.0f);
        a2.c(j);
        ((ActionBarContextView) vVar.c).B = a2;
        vVar.a = i;
        a2.d(vVar);
        return a2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, qv5.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        d8 d8Var = this.z;
        if (d8Var != null) {
            Configuration configuration2 = d8Var.x.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else if (i2 >= 360) {
                i = 3;
            } else {
                i = 2;
            }
            d8Var.L = i;
            ti4 ti4 = d8Var.y;
            if (ti4 != null) {
                ti4.p(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d8 d8Var = this.z;
        if (d8Var != null) {
            d8Var.g();
            a8 a8Var = this.z.P;
            if (a8Var != null && a8Var.b()) {
                a8Var.i.dismiss();
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4 = o68.a;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.G;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            if (z3) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (z3) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            if (z3) {
                i9 = i5 - i7;
            } else {
                i9 = i5 + i7;
            }
            int g = g(this.G, i9, paddingTop, paddingTop2, z3) + i9;
            if (z3) {
                i10 = g - i8;
            } else {
                i10 = g + i8;
            }
            i5 = i10;
        }
        LinearLayout linearLayout = this.J;
        if (!(linearLayout == null || this.I != null || linearLayout.getVisibility() == 8)) {
            i5 += g(this.J, i5, paddingTop, paddingTop2, z3);
        }
        View view2 = this.I;
        if (view2 != null) {
            g(view2, i5, paddingTop, paddingTop2, z3);
        }
        if (z3) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.y;
        if (actionMenuView != null) {
            g(actionMenuView, i6, paddingTop, paddingTop2, !z3);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            h.s(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i6 = this.A;
            if (i6 <= 0) {
                i6 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i6 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.G;
            if (view != null) {
                int f = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
                paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.y;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.y, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.J;
            if (linearLayout != null && this.I == null) {
                if (this.O) {
                    this.J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.J.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.J;
                    if (z2) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.I;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width;
                if (i8 != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i7 = Math.min(i9, i7);
                }
                this.I.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
            }
            if (this.A <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i6);
        } else {
            h.s(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.A = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        if (!(view == null || (linearLayout = this.J) == null)) {
            removeView(linearLayout);
            this.J = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.F = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.E = charSequence;
        d();
        e58.n(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.O) {
            requestLayout();
        }
        this.O = z2;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
