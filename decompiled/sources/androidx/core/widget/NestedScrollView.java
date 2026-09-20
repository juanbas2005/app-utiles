package androidx.core.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class NestedScrollView extends FrameLayout implements fy4 {
    public static final float b0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final gg4 c0 = new gg4(3);
    public static final int[] d0 = {16843130};
    public final EdgeEffect A;
    public final EdgeEffect B;
    public ah6 C;
    public int D;
    public boolean E = true;
    public boolean F = false;
    public View G = null;
    public boolean H = false;
    public VelocityTracker I;
    public boolean J;
    public boolean K = true;
    public final int L;
    public final int M;
    public final int N;
    public int O = -1;
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public int R;
    public int S;
    public cy4 T;
    public final dv5 U;
    public final dy4 V;
    public float W;
    public final zu1 a0 = new zu1(getContext(), new ay4(0, this));
    public final float w;
    public long x;
    public final Rect y = new Rect();
    public final OverScroller z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            edgeEffect = u12.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.A = edgeEffect;
        if (i >= 31) {
            edgeEffect2 = u12.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.B = edgeEffect2;
        this.w = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.z = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.L = viewConfiguration.getScaledTouchSlop();
        this.M = viewConfiguration.getScaledMinimumFlingVelocity();
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d0, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.U = new dv5(7, (byte) 0);
        this.V = new dy4(this);
        setNestedScrollingEnabled(true);
        e58.m(this, c0);
    }

    private ah6 getScrollFeedbackProvider() {
        if (this.C == null) {
            this.C = new ah6(this);
        }
        return this.C;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !l((View) parent, nestedScrollView)) {
            return false;
        }
        return true;
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(i4, i5, iArr);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            h.s("ScrollView can host only one direct child");
        }
    }

    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        n(i4, i5, (int[]) null);
    }

    public final boolean c(View view, View view2, int i, int i2) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ef  */
    public final void computeScroll() {
        int round;
        int i;
        OverScroller overScroller = this.z;
        if (!overScroller.isFinished()) {
            overScroller.computeScrollOffset();
            int currY = overScroller.getCurrY();
            int i2 = currY - this.S;
            int height = getHeight();
            EdgeEffect edgeEffect = this.A;
            EdgeEffect edgeEffect2 = this.B;
            if (i2 <= 0 || fd1.I(edgeEffect) == 0.0f) {
                if (i2 < 0 && fd1.I(edgeEffect2) != 0.0f) {
                    float f = (float) height;
                    round = Math.round(fd1.U(edgeEffect2, (((float) i2) * 4.0f) / f, 0.5f) * (f / 4.0f));
                    if (round != i2) {
                        edgeEffect2.finish();
                    }
                }
                int i3 = i2;
                this.S = currY;
                int[] iArr = this.Q;
                iArr[1] = 0;
                this.V.c(0, i3, 1, iArr, (int[]) null);
                int[] iArr2 = iArr;
                i = i3 - iArr2[1];
                int scrollRange = getScrollRange();
                if (Build.VERSION.SDK_INT >= 35) {
                    l22.a(this, Math.abs(overScroller.getCurrVelocity()));
                }
                if (i != 0) {
                    int scrollY = getScrollY();
                    p(i, getScrollX(), scrollY, scrollRange);
                    int scrollY2 = getScrollY() - scrollY;
                    int i4 = i - scrollY2;
                    iArr2[1] = 0;
                    this.V.d(0, scrollY2, 0, i4, this.P, 1, iArr2);
                    i = i4 - iArr2[1];
                }
                if (i != 0) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        if (i < 0) {
                            if (edgeEffect.isFinished()) {
                                edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                            }
                        } else if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    }
                    overScroller.abortAnimation();
                    w(1);
                }
                if (overScroller.isFinished()) {
                    postInvalidateOnAnimation();
                    return;
                } else {
                    w(1);
                    return;
                }
            } else {
                round = Math.round(fd1.U(edgeEffect, (((float) (-i2)) * 4.0f) / ((float) height), 0.5f) * (((float) (-height)) / 4.0f));
                if (round != i2) {
                    edgeEffect.finish();
                }
            }
            i2 -= round;
            int i32 = i2;
            this.S = currY;
            int[] iArr3 = this.Q;
            iArr3[1] = 0;
            this.V.c(0, i32, 1, iArr3, (int[]) null);
            int[] iArr22 = iArr3;
            i = i32 - iArr22[1];
            int scrollRange2 = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
            }
            if (i != 0) {
            }
            if (i != 0) {
            }
            if (overScroller.isFinished()) {
            }
        }
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    public final void d(View view, View view2, int i, int i2) {
        dv5 dv5 = this.U;
        if (i2 == 1) {
            dv5.c = i;
        } else {
            dv5.b = i;
        }
        this.V.g(2, i2);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || i(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return this.V.a(f, f2, z2);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.V.b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.V.c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.V.d(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i = 0;
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.B;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(View view, int i) {
        dv5 dv5 = this.U;
        if (i == 1) {
            dv5.c = 0;
        } else {
            dv5.b = 0;
        }
        w(i);
    }

    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        this.V.c(i, i2, i3, iArr, (int[]) null);
    }

    public final boolean g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, (MotionEvent) null, 0, 1, true);
        } else {
            Rect rect = this.y;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, (MotionEvent) null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        dv5 dv5 = this.U;
        return dv5.c | dv5.b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.W == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.W = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                h.s("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
        }
        return this.W;
    }

    public final int h(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.V.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.y.setEmpty();
        int i = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode == 62) {
                                if (keyEvent.isShiftPressed()) {
                                    i = 33;
                                }
                                q(i);
                                return false;
                            } else if (keyCode == 92) {
                                return k(33);
                            } else {
                                if (keyCode == 93) {
                                    return k(130);
                                }
                                if (keyCode == 122) {
                                    q(33);
                                    return false;
                                } else if (keyCode == 123) {
                                    q(130);
                                    return false;
                                }
                            }
                        } else if (keyEvent.isAltPressed()) {
                            return k(130);
                        } else {
                            return g(130);
                        }
                    } else if (keyEvent.isAltPressed()) {
                        return k(33);
                    } else {
                        return g(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.V.d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.z.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.V.g(2, 1);
            this.S = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                l22.a(this, Math.abs(this.z.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i) {
        boolean z2;
        int childCount;
        if (i == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.y;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i2) {
        Rect rect = this.y;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i < getScrollY() || rect.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.V.d(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.D = (int) motionEvent.getY(i);
            this.O = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d9, code lost:
        if (r8 >= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        if (r7 >= 0) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a5  */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float f;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        long j;
        int i4;
        float f7;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        MotionEvent motionEvent2 = motionEvent;
        if (motionEvent2.getAction() != 8 || this.H) {
            return false;
        }
        if ((motionEvent2.getSource() & 2) == 2) {
            float axisValue = motionEvent2.getAxisValue(9);
            i = (int) motionEvent2.getX();
            float f8 = axisValue;
            i2 = 9;
            f = f8;
        } else if ((motionEvent2.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent2.getAxisValue(26);
            i = getWidth() / 2;
            f = axisValue2;
            i2 = 26;
        } else {
            f = 0.0f;
            i2 = 0;
            i = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (getVerticalScrollFactorCompat() * f);
        if ((motionEvent2.getSource() & 8194) == 8194) {
            z2 = true;
        } else {
            z2 = false;
        }
        s(-verticalScrollFactorCompat, i2, motionEvent2, i, 1, z2);
        if (i2 != 0) {
            zu1 zu1 = this.a0;
            NestedScrollView nestedScrollView = (NestedScrollView) zu1.b.x;
            int[] iArr = zu1.h;
            int source = motionEvent2.getSource();
            int deviceId = motionEvent2.getDeviceId();
            if (zu1.f == source && zu1.g == deviceId && zu1.e == i2) {
                z4 = false;
                z3 = true;
                i3 = 0;
            } else {
                Context context = zu1.a;
                z3 = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent2.getDeviceId();
                int source2 = motionEvent2.getSource();
                i3 = 0;
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    Method method = h58.a;
                    i5 = l4.h(viewConfiguration, deviceId2, i2, source2);
                } else {
                    Method method2 = h58.a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (!(device == null || device.getMotionRange(i2, source2) == null)) {
                        Resources resources = context.getResources();
                        if (source2 == 4194304 && i2 == 26) {
                            i8 = resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                        } else {
                            i8 = -1;
                        }
                        Objects.requireNonNull(viewConfiguration);
                        if (i8 == -1) {
                            i5 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (i8 != 0) {
                            i5 = resources.getDimensionPixelSize(i8);
                        }
                    }
                    i5 = Integer.MAX_VALUE;
                }
                iArr[0] = i5;
                int deviceId3 = motionEvent2.getDeviceId();
                int source3 = motionEvent2.getSource();
                if (i9 >= 34) {
                    i6 = l4.g(viewConfiguration, deviceId3, i2, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (!(device2 == null || device2.getMotionRange(i2, source3) == null)) {
                        Resources resources2 = context.getResources();
                        if (source3 == 4194304 && i2 == 26) {
                            i7 = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                        } else {
                            i7 = -1;
                        }
                        Objects.requireNonNull(viewConfiguration);
                        if (i7 == -1) {
                            i6 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (i7 != 0) {
                            i6 = resources2.getDimensionPixelSize(i7);
                        }
                    }
                    i6 = Integer.MIN_VALUE;
                }
                iArr[1] = i6;
                zu1.f = source;
                zu1.g = deviceId;
                zu1.e = i2;
                z4 = true;
            }
            int i10 = iArr[i3];
            VelocityTracker velocityTracker = zu1.c;
            if (i10 != Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    zu1.c = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker2 = zu1.c;
                Map map = a48.a;
                velocityTracker2.addMovement(motionEvent2);
                if (Build.VERSION.SDK_INT < 34 && motionEvent2.getSource() == 4194304) {
                    Map map2 = a48.a;
                    if (!map2.containsKey(velocityTracker2)) {
                        map2.put(velocityTracker2, new b48());
                    }
                    b48 b48 = (b48) map2.get(velocityTracker2);
                    long[] jArr = b48.b;
                    long eventTime = motionEvent2.getEventTime();
                    if (b48.d != 0 && eventTime - jArr[b48.e] > 40) {
                        b48.d = i3;
                        b48.c = 0.0f;
                    }
                    int i11 = (b48.e + 1) % 20;
                    b48.e = i11;
                    int i12 = b48.d;
                    if (i12 != 20) {
                        b48.d = i12 + 1;
                    }
                    b48.a[i11] = motionEvent2.getAxisValue(26);
                    jArr[b48.e] = eventTime;
                }
                float f9 = Float.MAX_VALUE;
                velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
                b48 b482 = (b48) a48.a.get(velocityTracker2);
                if (b482 != null) {
                    float[] fArr = b482.a;
                    long[] jArr2 = b482.b;
                    int i13 = b482.d;
                    if (i13 < 2) {
                        f4 = Float.MAX_VALUE;
                    } else {
                        int i14 = b482.e;
                        int i15 = ((i14 + 20) - (i13 - 1)) % 20;
                        long j2 = jArr2[i14];
                        while (true) {
                            j = jArr2[i15];
                            int i16 = ((j2 - j) > 100 ? 1 : ((j2 - j) == 100 ? 0 : -1));
                            f4 = f9;
                            i4 = b482.d;
                            if (i16 <= 0) {
                                break;
                            }
                            b482.d = i4 - 1;
                            i15 = (i15 + 1) % 20;
                            f9 = f4;
                        }
                        if (i4 >= 2) {
                            if (i4 == 2) {
                                int i17 = (i15 + 1) % 20;
                                long j3 = jArr2[i17];
                                if (j != j3) {
                                    f5 = fArr[i17] / ((float) (j3 - j));
                                    z5 = z4;
                                }
                            } else {
                                float f10 = 0.0f;
                                int i18 = 0;
                                int i19 = 0;
                                while (true) {
                                    f7 = 1.0f;
                                    if (i18 >= b482.d - 1) {
                                        break;
                                    }
                                    int i20 = i18 + i15;
                                    long j4 = jArr2[i20 % 20];
                                    int i21 = (i20 + 1) % 20;
                                    if (jArr2[i21] == j4) {
                                        z6 = z4;
                                    } else {
                                        i19++;
                                        if (f10 < 0.0f) {
                                            f7 = -1.0f;
                                        }
                                        float f11 = f10;
                                        z6 = z4;
                                        float sqrt = f7 * ((float) Math.sqrt((double) (2.0f * Math.abs(f10))));
                                        float f12 = fArr[i21] / ((float) (jArr2[i21] - j4));
                                        f10 = (Math.abs(f12) * (f12 - sqrt)) + f11;
                                        if (i19 == z3) {
                                            f10 *= 0.5f;
                                        }
                                    }
                                    i18++;
                                    z4 = z6;
                                    z3 = true;
                                }
                                float f13 = f10;
                                z5 = z4;
                                if (f13 < 0.0f) {
                                    f7 = -1.0f;
                                }
                                f5 = ((float) Math.sqrt((double) (Math.abs(f13) * 2.0f))) * f7;
                            }
                            f6 = f5 * 1000.0f;
                            b482.c = f6;
                            if (f6 >= (-Math.abs(f4))) {
                                b482.c = -Math.abs(f4);
                            } else if (b482.c > Math.abs(f4)) {
                                b482.c = Math.abs(f4);
                            }
                        }
                    }
                    z5 = z4;
                    f5 = 0.0f;
                    f6 = f5 * 1000.0f;
                    b482.c = f6;
                    if (f6 >= (-Math.abs(f4))) {
                    }
                } else {
                    z5 = z4;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    f2 = l4.d(velocityTracker2, i2);
                } else if (i2 == 0) {
                    f2 = velocityTracker2.getXVelocity();
                } else if (i2 == 1) {
                    f2 = velocityTracker2.getYVelocity();
                } else {
                    b48 b483 = (b48) a48.a.get(velocityTracker2);
                    if (b483 == null || i2 != 26) {
                        f2 = 0.0f;
                    } else {
                        f2 = b483.c;
                    }
                }
                float f14 = f2 * (-nestedScrollView.getVerticalScrollFactorCompat());
                float signum = Math.signum(f14);
                if (z5 || !(signum == Math.signum(zu1.d) || signum == 0.0f)) {
                    nestedScrollView.z.abortAnimation();
                }
                if (Math.abs(f14) >= ((float) iArr[0])) {
                    int i22 = iArr[1];
                    float max = Math.max((float) (-i22), Math.min(f14, (float) i22));
                    if (max == 0.0f) {
                        f3 = 0.0f;
                    } else {
                        nestedScrollView.z.abortAnimation();
                        nestedScrollView.j((int) max);
                        f3 = max;
                    }
                    zu1.d = f3;
                    return true;
                }
            } else if (velocityTracker == null) {
                return z3;
            } else {
                velocityTracker.recycle();
                zu1.c = null;
                return z3;
            }
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.H) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.O;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.D) > this.L && (2 & getNestedScrollAxes()) == 0) {
                                this.H = true;
                                this.D = y2;
                                if (this.I == null) {
                                    this.I = VelocityTracker.obtain();
                                }
                                this.I.addMovement(motionEvent);
                                this.R = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.H = false;
            this.O = -1;
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.I = null;
            }
            if (this.z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.z;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.D = y3;
                    this.O = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.I;
                    if (velocityTracker2 == null) {
                        this.I = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.I.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!v(motionEvent) && overScroller.isFinished()) {
                        z2 = false;
                    }
                    this.H = z2;
                    this.V.g(2, 0);
                }
            }
            if (!v(motionEvent) && overScroller.isFinished()) {
                z2 = false;
            }
            this.H = z2;
            VelocityTracker velocityTracker3 = this.I;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.I = null;
            }
        }
        return this.H;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z2, i, i2, i3, i4);
        int i6 = 0;
        this.E = false;
        View view = this.G;
        if (view != null && l(view, this)) {
            View view2 = this.G;
            Rect rect = this.y;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.G = null;
        if (!this.F) {
            if (this.T != null) {
                scrollTo(getScrollX(), this.T.w);
                this.T = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.F = true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.J && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.V.b(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.V.c(i, i2, 0, iArr, (int[]) null);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(i4, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        super.scrollTo(i, i2);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && m(view, 0, getHeight())) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof cy4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cy4 cy4 = (cy4) parcelable;
        super.onRestoreInstanceState(cy4.getSuperState());
        this.T = cy4;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, cy4] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.w = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i4)) {
            Rect rect = this.y;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h = h(rect);
            if (h == 0) {
                return;
            }
            if (this.K) {
                u(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int round;
        int i;
        int i2;
        ViewParent parent2;
        float U2;
        MotionEvent motionEvent2 = motionEvent;
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent2.getActionMasked();
        if (actionMasked == 0) {
            this.R = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent2);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.R);
        dy4 dy4 = this.V;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.A;
            EdgeEffect edgeEffect2 = this.B;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.I;
                velocityTracker.computeCurrentVelocity(1000, (float) this.N);
                int yVelocity = (int) velocityTracker.getYVelocity(this.O);
                if (Math.abs(yVelocity) < this.M) {
                    if (this.z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                } else if (fd1.I(edgeEffect) != 0.0f) {
                    if (t(edgeEffect, yVelocity)) {
                        edgeEffect.onAbsorb(yVelocity);
                    } else {
                        j(-yVelocity);
                    }
                } else if (fd1.I(edgeEffect2) != 0.0f) {
                    int i3 = -yVelocity;
                    if (t(edgeEffect2, i3)) {
                        edgeEffect2.onAbsorb(i3);
                    } else {
                        j(i3);
                    }
                } else {
                    int i4 = -yVelocity;
                    float f2 = (float) i4;
                    if (!dy4.b(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        j(i4);
                    }
                }
                this.O = -1;
                this.H = false;
                VelocityTracker velocityTracker2 = this.I;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.I = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.O);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.O + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i5 = this.D - y2;
                    float x2 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i5) / ((float) getHeight());
                    if (fd1.I(edgeEffect) != 0.0f) {
                        U2 = -fd1.U(edgeEffect, -height, x2);
                        if (fd1.I(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (fd1.I(edgeEffect2) != 0.0f) {
                            U2 = fd1.U(edgeEffect2, height, 1.0f - x2);
                            if (fd1.I(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f * ((float) getHeight()));
                        if (round != 0) {
                            invalidate();
                        }
                        i = i5 - round;
                        if (!this.H && Math.abs(i) > (i2 = this.L)) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.H = true;
                            i = i <= 0 ? i - i2 : i + i2;
                        }
                        if (this.H) {
                            int s = s(i, 1, motionEvent2, (int) motionEvent2.getX(findPointerIndex), 0, false);
                            this.D = y2 - s;
                            this.R += s;
                        }
                    }
                    f = U2;
                    round = Math.round(f * ((float) getHeight()));
                    if (round != 0) {
                    }
                    i = i5 - round;
                    parent2 = getParent();
                    if (parent2 != null) {
                    }
                    this.H = true;
                    if (i <= 0) {
                    }
                    if (this.H) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.H && getChildCount() > 0) {
                    if (this.z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.O = -1;
                this.H = false;
                VelocityTracker velocityTracker3 = this.I;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.I = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent2.getActionIndex();
                this.D = (int) motionEvent2.getY(actionIndex);
                this.O = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.D = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.O));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.H && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.z;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                w(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.D = (int) motionEvent2.getY();
            this.O = pointerId;
            dy4.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.I;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z2 = false;
        } else {
            i5 = 0;
            z2 = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else if (i7 < 0) {
            i6 = 0;
        } else {
            i6 = i7;
            z3 = false;
            if (z3 && !this.V.f(1)) {
                this.z.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            if (!z2 || z3) {
                return true;
            }
            return false;
        }
        z3 = true;
        this.z.springBack(i5, i6, 0, 0, 0, getScrollRange());
        super.scrollTo(i5, i6);
        if (!z2) {
        }
        return true;
    }

    public final void q(int i) {
        boolean z2;
        if (i == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.y;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        r(i, i2, i3);
    }

    public final boolean r(int i, int i2, int i3) {
        boolean z2;
        View view;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        if (i5 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z6 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view3 = focusables.get(i9);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i6 < bottom && top < i7) {
                if (i6 >= top || bottom >= i7) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (view2 == null) {
                    view2 = view3;
                    z6 = z4;
                } else {
                    if ((!z2 || top >= view2.getTop()) && (z2 || bottom <= view2.getBottom())) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z6) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view2 = view3;
                        z6 = true;
                    } else if (!z5) {
                    }
                    view2 = view3;
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i6 < scrollY || i7 > i8) {
            if (z2) {
                i4 = i6 - scrollY;
            } else {
                i4 = i7 - i8;
            }
            s(i4, -1, (MotionEvent) null, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z3;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.E) {
            Rect rect = this.y;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        } else {
            this.G = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        boolean z3;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        if (h != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                scrollBy(0, h);
                return z3;
            }
            u(0, h, false);
        }
        return z3;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.I) != null) {
            velocityTracker.recycle();
            this.I = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        this.E = true;
        super.requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0129  */
    public final int s(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        dy4 dy4 = this.V;
        if (i9 == 1) {
            dy4.g(2, i9);
        }
        boolean c = this.V.c(0, i, i9, this.Q, this.P);
        int[] iArr = this.P;
        int[] iArr2 = this.Q;
        if (c) {
            i6 = i - iArr2[1];
            i5 = iArr[1];
        } else {
            i6 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!p(i6, 0, scrollY, scrollRange) || dy4.f(i9)) {
            z4 = false;
        } else {
            z4 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        if (!(motionEvent == null || scrollY2 == 0)) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i7, scrollY2);
        }
        iArr2[1] = 0;
        int i10 = scrollY;
        int i11 = i10;
        int[] iArr3 = iArr2;
        int i12 = scrollRange;
        this.V.d(0, scrollY2, 0, i6 - scrollY2, this.P, i9, iArr3);
        int i13 = i5 + iArr[1];
        int i14 = i6 - iArr3[1];
        int i15 = i11 + i14;
        EdgeEffect edgeEffect = this.B;
        EdgeEffect edgeEffect2 = this.A;
        if (i15 < 0) {
            if (z3) {
                fd1.U(edgeEffect2, ((float) (-i14)) / ((float) getHeight()), ((float) i8) / ((float) getWidth()));
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i7, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i15 > i12 && z3) {
            fd1.U(edgeEffect, ((float) i14) / ((float) getHeight()), 1.0f - (((float) i8) / ((float) getWidth())));
            if (motionEvent != null) {
                z5 = false;
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i7, false);
            } else {
                z5 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z6 = z5;
            } else {
                z6 = z4;
            }
            if (z6 && i9 == 0 && (velocityTracker = this.I) != null) {
                velocityTracker.clear();
            }
            if (i9 == 1) {
                w(i9);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i13;
        }
        z5 = false;
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
        }
        velocityTracker.clear();
        if (i9 == 1) {
        }
        return i13;
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.J) {
            this.J = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        dy4 dy4 = this.V;
        if (dy4.d) {
            ViewGroup viewGroup = dy4.c;
            WeakHashMap weakHashMap = e58.a;
            viewGroup.stopNestedScroll();
        }
        dy4.d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.K = z2;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return this.V.g(i, 0);
    }

    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float I2 = fd1.I(edgeEffect) * ((float) getHeight());
        float f = this.w * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) b0;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < I2) {
            return true;
        }
        return false;
    }

    public final void u(int i, int i2, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.x > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                int scrollX = getScrollX();
                OverScroller overScroller = this.z;
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z2) {
                    this.V.g(2, 1);
                } else {
                    w(1);
                }
                this.S = getScrollY();
                postInvalidateOnAnimation();
            } else {
                OverScroller overScroller2 = this.z;
                if (!overScroller2.isFinished()) {
                    overScroller2.abortAnimation();
                    w(1);
                }
                scrollBy(i, i2);
            }
            this.x = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.A;
        if (fd1.I(edgeEffect) != 0.0f) {
            fd1.U(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (fd1.I(edgeEffect2) == 0.0f) {
            return z2;
        }
        fd1.U(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void w(int i) {
        this.V.h(i);
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            h.s("ScrollView can host only one direct child");
        }
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            h.s("ScrollView can host only one direct child");
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            h.s("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(by4 by4) {
    }
}
