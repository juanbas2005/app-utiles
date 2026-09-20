package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* renamed from: r64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class r64 extends ViewGroup {
    public int A = 8388659;
    public int B;
    public float C;
    public boolean D;
    public int[] E;
    public int[] F;
    public Drawable G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean w = true;
    public int x = -1;
    public int y = 0;
    public int z;

    public r64(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        int[] iArr = qv5.n;
        cf4 w2 = cf4.w(context, attributeSet, iArr, 0);
        e58.l(this, context, iArr, attributeSet, (TypedArray) w2.y, 0);
        TypedArray typedArray = (TypedArray) w2.y;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.C = typedArray.getFloat(4, -1.0f);
        this.x = typedArray.getInt(3, -1);
        this.D = typedArray.getBoolean(7, false);
        setDividerDrawable(w2.i(5));
        this.J = typedArray.getInt(8, 0);
        this.K = typedArray.getDimensionPixelSize(6, 0);
        w2.A();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q64;
    }

    public final void d(Canvas canvas, int i) {
        this.G.setBounds(getPaddingLeft() + this.K, i, (getWidth() - getPaddingRight()) - this.K, this.I + i);
        this.G.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.G.setBounds(i, getPaddingTop() + this.K, this.H + i, (getHeight() - getPaddingBottom()) - this.K);
        this.G.draw(canvas);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.widget.LinearLayout$LayoutParams, q64] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.widget.LinearLayout$LayoutParams, q64] */
    /* renamed from: f */
    public q64 generateDefaultLayoutParams() {
        int i = this.z;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q64] */
    /* renamed from: g */
    public q64 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i;
        if (this.x < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.x;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.y;
                if (this.z == 1 && (i = this.A & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.B) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.B;
                    }
                }
                return i3 + ((q64) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.x == 0) {
                return -1;
            } else {
                rf2.r("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                return 0;
            }
        } else {
            rf2.r("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.x;
    }

    public Drawable getDividerDrawable() {
        return this.G;
    }

    public int getDividerPadding() {
        return this.K;
    }

    public int getDividerWidth() {
        return this.H;
    }

    public int getGravity() {
        return this.A;
    }

    public int getOrientation() {
        return this.z;
    }

    public int getShowDividers() {
        return this.J;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.C;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, q64] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, q64] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.widget.LinearLayout$LayoutParams, q64] */
    /* renamed from: h */
    public q64 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof q64) {
            return new LinearLayout.LayoutParams((q64) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i != 0) {
            int childCount = getChildCount();
            int i2 = this.J;
            if (i != childCount) {
                if ((i2 & 2) != 0) {
                    for (int i3 = i - 1; i3 >= 0; i3--) {
                        if (getChildAt(i3).getVisibility() != 8) {
                            return true;
                        }
                    }
                }
                return false;
            } else if ((i2 & 4) != 0) {
                return true;
            } else {
                return false;
            }
        } else if ((this.J & 1) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void onDraw(Canvas canvas) {
        boolean z2;
        int i;
        int left;
        int i2;
        int i3;
        int i4;
        if (this.G != null) {
            int i5 = 0;
            if (this.z == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !i(i5))) {
                        d(canvas, (childAt.getTop() - ((q64) childAt.getLayoutParams()).topMargin) - this.I);
                    }
                    i5++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i4 = (getHeight() - getPaddingBottom()) - this.I;
                    } else {
                        i4 = childAt2.getBottom() + ((q64) childAt2.getLayoutParams()).bottomMargin;
                    }
                    d(canvas, i4);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z3 = o68.a;
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !i(i5))) {
                    q64 q64 = (q64) childAt3.getLayoutParams();
                    if (z2) {
                        i3 = childAt3.getRight() + q64.rightMargin;
                    } else {
                        i3 = (childAt3.getLeft() - q64.leftMargin) - this.H;
                    }
                    e(canvas, i3);
                }
                i5++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    q64 q642 = (q64) childAt4.getLayoutParams();
                    if (z2) {
                        left = childAt4.getLeft() - q642.leftMargin;
                        i2 = this.H;
                    } else {
                        i = childAt4.getRight() + q642.rightMargin;
                        e(canvas, i);
                    }
                } else if (z2) {
                    i = getPaddingLeft();
                    e(canvas, i);
                } else {
                    left = getWidth() - getPaddingRight();
                    i2 = this.H;
                }
                i = left - i2;
                e(canvas, i);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a9  */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        char c2 = 2;
        if (this.z == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i3 - i;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.A;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            if (i23 == 16) {
                i16 = getPaddingTop() + (((i4 - i2) - this.B) / 2);
            } else if (i23 != 80) {
                i16 = getPaddingTop();
            } else {
                i16 = ((getPaddingTop() + i4) - i2) - this.B;
            }
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt == null || childAt.getVisibility() == i20) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    q64 q64 = (q64) childAt.getLayoutParams();
                    c = c2;
                    int i26 = q64.gravity;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i18 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + q64.leftMargin;
                        i19 = q64.rightMargin;
                    } else if (absoluteGravity != 5) {
                        i17 = q64.leftMargin + paddingLeft;
                        if (i(i25)) {
                            i16 += this.I;
                        }
                        int i27 = i16 + q64.topMargin;
                        childAt.layout(i17, i27, measuredWidth + i17, i27 + measuredHeight);
                        i16 = measuredHeight + q64.bottomMargin + i27;
                    } else {
                        i18 = paddingRight - measuredWidth;
                        i19 = q64.rightMargin;
                    }
                    i17 = i18 - i19;
                    if (i(i25)) {
                    }
                    int i272 = i16 + q64.topMargin;
                    childAt.layout(i17, i272, measuredWidth + i17, i272 + measuredHeight);
                    i16 = measuredHeight + q64.bottomMargin + i272;
                }
                i25++;
                c2 = c;
                i20 = 8;
            }
            return;
        }
        boolean z4 = o68.a;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int paddingTop = getPaddingTop();
        int i28 = i4 - i2;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.A;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z5 = this.w;
        int[] iArr = this.E;
        int[] iArr2 = this.F;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        if (absoluteGravity2 == 1) {
            i5 = getPaddingLeft() + (((i3 - i) - this.B) / 2);
        } else if (absoluteGravity2 != 5) {
            i5 = getPaddingLeft();
        } else {
            i5 = ((getPaddingLeft() + i3) - i) - this.B;
        }
        if (z3) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = 1;
            i7 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i6 * i32) + i7;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    q64 q642 = (q64) childAt2.getLayoutParams();
                    int i34 = i5;
                    if (z5) {
                        i9 = paddingTop;
                        if (q642.height != -1) {
                            i10 = childAt2.getBaseline();
                            i11 = q642.gravity;
                            if (i11 < 0) {
                                i11 = i31;
                            }
                            i12 = i11 & 112;
                            int i35 = measuredWidth2;
                            if (i12 == 16) {
                                if (i12 == 48) {
                                    i13 = i9 + q642.topMargin;
                                    if (i10 != -1) {
                                        i13 = (iArr[1] - i10) + i13;
                                    }
                                } else if (i12 != 80) {
                                    i13 = i9;
                                } else {
                                    i13 = (paddingBottom - measuredHeight2) - q642.bottomMargin;
                                    if (i10 != -1) {
                                        i15 = iArr2[2] - (childAt2.getMeasuredHeight() - i10);
                                    }
                                }
                                if (i(i33)) {
                                    i14 = i34 + this.H;
                                } else {
                                    i14 = i34;
                                }
                                int i36 = i14 + q642.leftMargin;
                                childAt2.layout(i36, i13, i36 + i35, i13 + measuredHeight2);
                                i5 = i35 + q642.rightMargin + i36;
                                i32++;
                                i7 = i8;
                                paddingTop = i9;
                            } else {
                                i13 = ((paddingBottom2 - measuredHeight2) / 2) + i9 + q642.topMargin;
                                i15 = q642.bottomMargin;
                            }
                            i13 -= i15;
                            if (i(i33)) {
                            }
                            int i362 = i14 + q642.leftMargin;
                            childAt2.layout(i362, i13, i362 + i35, i13 + measuredHeight2);
                            i5 = i35 + q642.rightMargin + i362;
                            i32++;
                            i7 = i8;
                            paddingTop = i9;
                        }
                    } else {
                        i9 = paddingTop;
                    }
                    i10 = -1;
                    i11 = q642.gravity;
                    if (i11 < 0) {
                    }
                    i12 = i11 & 112;
                    int i352 = measuredWidth2;
                    if (i12 == 16) {
                    }
                    i13 -= i15;
                    if (i(i33)) {
                    }
                    int i3622 = i14 + q642.leftMargin;
                    childAt2.layout(i3622, i13, i3622 + i352, i13 + measuredHeight2);
                    i5 = i352 + q642.rightMargin + i3622;
                    i32++;
                    i7 = i8;
                    paddingTop = i9;
                } else {
                    int i37 = i5;
                }
            }
            i9 = paddingTop;
            i32++;
            i7 = i8;
            paddingTop = i9;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:217:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x076f  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0791  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146  */
    public void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int baseline;
        int i10;
        boolean z5;
        boolean z6;
        int i11;
        int[] iArr;
        int[] iArr2;
        int i12;
        View view;
        q64 q64;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z7;
        boolean z8;
        boolean z9;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22;
        int i23;
        boolean z11;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z12;
        boolean z13;
        int i27;
        int i28;
        int i29;
        r64 r64 = this;
        int i30 = -2;
        int i31 = 0;
        int i32 = 1073741824;
        int i33 = 8;
        if (r64.z == 1) {
            r64.B = 0;
            int virtualChildCount = r64.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i34 = r64.x;
            boolean z14 = r64.D;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            boolean z15 = false;
            int i38 = 0;
            boolean z16 = false;
            boolean z17 = true;
            float f = 0.0f;
            int i39 = 0;
            while (i35 < virtualChildCount) {
                int i40 = mode;
                View childAt = r64.getChildAt(i35);
                if (childAt == null) {
                    r64.B = r64.B;
                } else if (childAt.getVisibility() != i33) {
                    if (r64.i(i35)) {
                        r64.B += r64.I;
                    }
                    q64 q642 = (q64) childAt.getLayoutParams();
                    float f2 = q642.weight;
                    f += f2;
                    if (mode2 == i32 && q642.height == 0 && f2 > 0.0f) {
                        int i41 = r64.B;
                        r64.B = Math.max(i41, q642.topMargin + i41 + q642.bottomMargin);
                        view2 = childAt;
                        i23 = mode2;
                        i26 = i34;
                        z11 = z14;
                        i24 = i35;
                        z15 = true;
                        i25 = i40;
                        int i42 = i;
                        int i43 = i2;
                    } else {
                        if (q642.height != 0 || f2 <= 0.0f) {
                            i27 = Integer.MIN_VALUE;
                        } else {
                            q642.height = i30;
                            i27 = 0;
                        }
                        if (f == 0.0f) {
                            i28 = i35;
                            i29 = r64.B;
                        } else {
                            i28 = i35;
                            i29 = 0;
                        }
                        i23 = mode2;
                        z11 = z14;
                        i26 = i34;
                        i24 = i28;
                        i25 = i40;
                        r64.measureChildWithMargins(childAt, i, 0, i2, i29);
                        if (i27 != Integer.MIN_VALUE) {
                            q642.height = i27;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i44 = r64.B;
                        view2 = childAt;
                        r64.B = Math.max(i44, i44 + measuredHeight + q642.topMargin + q642.bottomMargin);
                        if (z11) {
                            i39 = Math.max(measuredHeight, i39);
                        }
                    }
                    if (i26 >= 0 && i26 == i24 + 1) {
                        r64.y = r64.B;
                    }
                    if (i24 >= i26 || q642.weight <= 0.0f) {
                        if (i25 == 1073741824 || q642.width != -1) {
                            z12 = false;
                        } else {
                            z12 = true;
                            z16 = true;
                        }
                        int i45 = q642.leftMargin + q642.rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i45;
                        i31 = Math.max(i31, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z18 = z12;
                        int combineMeasuredStates = View.combineMeasuredStates(i38, measuredState);
                        if (z17) {
                            i38 = combineMeasuredStates;
                            if (q642.width == -1) {
                                z13 = true;
                                if (q642.weight <= 0.0f) {
                                    if (!z18) {
                                        i45 = measuredWidth;
                                    }
                                    i37 = Math.max(i37, i45);
                                } else {
                                    if (!z18) {
                                        i45 = measuredWidth;
                                    }
                                    i36 = Math.max(i36, i45);
                                }
                                z17 = z13;
                                i35 = i24 + 1;
                                i34 = i26;
                                mode = i25;
                                z14 = z11;
                                mode2 = i23;
                                i30 = -2;
                                i32 = 1073741824;
                                i33 = 8;
                            }
                        } else {
                            i38 = combineMeasuredStates;
                        }
                        z13 = false;
                        if (q642.weight <= 0.0f) {
                        }
                        z17 = z13;
                        i35 = i24 + 1;
                        i34 = i26;
                        mode = i25;
                        z14 = z11;
                        mode2 = i23;
                        i30 = -2;
                        i32 = 1073741824;
                        i33 = 8;
                    } else {
                        rf2.r("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        return;
                    }
                }
                i23 = mode2;
                i26 = i34;
                z11 = z14;
                i24 = i35;
                i25 = i40;
                int i46 = i;
                int i47 = i2;
                i35 = i24 + 1;
                i34 = i26;
                mode = i25;
                z14 = z11;
                mode2 = i23;
                i30 = -2;
                i32 = 1073741824;
                i33 = 8;
            }
            int i48 = mode;
            int i49 = mode2;
            boolean z19 = z14;
            int i50 = i38;
            int i51 = i;
            int i52 = i2;
            if (r64.B > 0 && r64.i(virtualChildCount)) {
                r64.B += r64.I;
            }
            int i53 = i49;
            if (z19 && (i53 == Integer.MIN_VALUE || i53 == 0)) {
                r64.B = 0;
                for (int i54 = 0; i54 < virtualChildCount; i54++) {
                    View childAt2 = r64.getChildAt(i54);
                    if (childAt2 == null) {
                        r64.B = r64.B;
                    } else if (childAt2.getVisibility() != 8) {
                        q64 q643 = (q64) childAt2.getLayoutParams();
                        int i55 = r64.B;
                        r64.B = Math.max(i55, i55 + i39 + q643.topMargin + q643.bottomMargin);
                    }
                }
            }
            int paddingBottom = r64.getPaddingBottom() + r64.getPaddingTop() + r64.B;
            r64.B = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, r64.getSuggestedMinimumHeight()), i52, 0);
            int i56 = (resolveSizeAndState & 16777215) - r64.B;
            if (z15 || (i56 != 0 && f > 0.0f)) {
                float f3 = r64.C;
                if (f3 > 0.0f) {
                    f = f3;
                }
                r64.B = 0;
                int i57 = i50;
                int i58 = 0;
                while (i58 < virtualChildCount) {
                    View childAt3 = r64.getChildAt(i58);
                    if (childAt3.getVisibility() == 8) {
                        i20 = i58;
                    } else {
                        q64 q644 = (q64) childAt3.getLayoutParams();
                        float f4 = q644.weight;
                        if (f4 > 0.0f) {
                            int i59 = (int) ((((float) i56) * f4) / f);
                            f -= f4;
                            i56 -= i59;
                            i20 = i58;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i51, r64.getPaddingRight() + r64.getPaddingLeft() + q644.leftMargin + q644.rightMargin, q644.width);
                            if (q644.height == 0) {
                                i22 = 1073741824;
                                if (i53 == 1073741824) {
                                    if (i59 <= 0) {
                                        i59 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i59, 1073741824));
                                    i57 = View.combineMeasuredStates(i57, childAt3.getMeasuredState() & -256);
                                }
                            } else {
                                i22 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i59;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i22));
                            i57 = View.combineMeasuredStates(i57, childAt3.getMeasuredState() & -256);
                        } else {
                            i20 = i58;
                        }
                        int i60 = q644.leftMargin + q644.rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i60;
                        i31 = Math.max(i31, measuredWidth2);
                        if (i48 != 1073741824) {
                            int i61 = i60;
                            i21 = -1;
                            if (q644.width == -1) {
                                measuredWidth2 = i61;
                            }
                        } else {
                            i21 = -1;
                        }
                        i36 = Math.max(i36, measuredWidth2);
                        if (!z17 || q644.width != i21) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i62 = r64.B;
                        r64.B = Math.max(i62, childAt3.getMeasuredHeight() + i62 + q644.topMargin + q644.bottomMargin);
                        z17 = z10;
                    }
                    i58 = i20 + 1;
                }
                r64.B = r64.getPaddingBottom() + r64.getPaddingTop() + r64.B;
                i50 = i57;
            } else {
                i36 = Math.max(i36, i37);
                if (z19 && i53 != 1073741824) {
                    for (int i63 = 0; i63 < virtualChildCount; i63++) {
                        View childAt4 = r64.getChildAt(i63);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((q64) childAt4.getLayoutParams()).weight <= 0.0f)) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                        }
                    }
                }
            }
            if (z17 || i48 == 1073741824) {
                i36 = i31;
            }
            r64.setMeasuredDimension(View.resolveSizeAndState(Math.max(r64.getPaddingRight() + r64.getPaddingLeft() + i36, r64.getSuggestedMinimumWidth()), i51, i50), resolveSizeAndState);
            if (z16) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r64.getMeasuredWidth(), 1073741824);
                int i64 = 0;
                while (i64 < virtualChildCount) {
                    View childAt5 = r64.getChildAt(i64);
                    if (childAt5.getVisibility() != 8) {
                        q64 q645 = (q64) childAt5.getLayoutParams();
                        if (q645.width == -1) {
                            int i65 = q645.height;
                            q645.height = childAt5.getMeasuredHeight();
                            r64.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i52, 0);
                            q645.height = i65;
                        }
                    }
                    i64++;
                    i52 = i2;
                }
                return;
            }
            return;
        }
        int i66 = i;
        r64.B = 0;
        int virtualChildCount2 = r64.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i66);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (r64.E == null || r64.F == null) {
            r64.E = new int[4];
            r64.F = new int[4];
        }
        int[] iArr3 = r64.E;
        int[] iArr4 = r64.F;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z20 = r64.w;
        boolean z21 = r64.D;
        if (mode3 == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f5 = 0.0f;
        boolean z22 = true;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        boolean z23 = false;
        boolean z24 = false;
        while (i67 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = r64.getChildAt(i67);
            if (childAt6 == null) {
                r64.B = r64.B;
                i11 = i67;
                i12 = i69;
                iArr2 = iArr3;
                iArr = iArr4;
                z6 = z20;
                z5 = z21;
                int i73 = i2;
            } else {
                int i74 = i68;
                if (childAt6.getVisibility() == 8) {
                    i66 = i;
                    i11 = i67;
                    i12 = i69;
                    iArr = iArr4;
                    z6 = z20;
                    z5 = z21;
                    i68 = i74;
                    int i75 = i2;
                    iArr2 = iArr3;
                } else {
                    if (r64.i(i67)) {
                        r64.B += r64.H;
                    }
                    q64 q646 = (q64) childAt6.getLayoutParams();
                    float f6 = q646.weight;
                    f5 += f6;
                    int i76 = i67;
                    if (mode3 == 1073741824 && q646.width == 0 && f6 > 0.0f) {
                        int i77 = r64.B;
                        int i78 = q646.leftMargin;
                        if (z2) {
                            r64.B = i78 + q646.rightMargin + i77;
                        } else {
                            r64.B = Math.max(i77, i77 + i78 + q646.rightMargin);
                        }
                        if (z20) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z6 = z20;
                            z5 = z21;
                            i13 = i74;
                            i11 = i76;
                            q64 = q646;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i66 = i;
                            i15 = i69;
                            i14 = i70;
                            int i79 = i2;
                        } else {
                            view = childAt6;
                            z6 = z20;
                            z5 = z21;
                            z24 = true;
                            i13 = i74;
                            i11 = i76;
                            i16 = 1073741824;
                            q64 = q646;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i66 = i;
                            i15 = i69;
                            i14 = i70;
                            int i80 = i2;
                            if (mode4 == i16 || q64.height != -1) {
                                z7 = false;
                            } else {
                                z7 = true;
                                z23 = true;
                            }
                            int i81 = q64.topMargin + q64.bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i81;
                            i72 = View.combineMeasuredStates(i72, view.getMeasuredState());
                            if (!z6) {
                                int baseline2 = view.getBaseline();
                                z8 = z7;
                                if (baseline2 != -1) {
                                    int i82 = q64.gravity;
                                    if (i82 < 0) {
                                        i82 = r64.A;
                                    }
                                    int i83 = (((i82 & 112) >> 4) & -2) >> 1;
                                    iArr2[i83] = Math.max(iArr2[i83], baseline2);
                                    iArr[i83] = Math.max(iArr[i83], measuredHeight3 - baseline2);
                                }
                            } else {
                                z8 = z7;
                            }
                            int max = Math.max(i13, measuredHeight3);
                            if (!z22 || q64.height != -1) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (q64.weight <= 0.0f) {
                                if (!z8) {
                                    i81 = measuredHeight3;
                                }
                                i70 = Math.max(i14, i81);
                                i17 = i15;
                            } else {
                                if (!z8) {
                                    i81 = measuredHeight3;
                                }
                                i17 = Math.max(i15, i81);
                                i70 = i14;
                            }
                            int i84 = i17;
                            i68 = max;
                            i12 = i84;
                            z22 = z9;
                        }
                    } else {
                        if (q646.width != 0 || f6 <= 0.0f) {
                            i18 = Integer.MIN_VALUE;
                        } else {
                            q646.width = -2;
                            i18 = 0;
                        }
                        if (f5 == 0.0f) {
                            i19 = r64.B;
                        } else {
                            i19 = 0;
                        }
                        int i85 = i76;
                        iArr = iArr4;
                        i14 = i70;
                        i11 = i85;
                        z6 = z20;
                        z5 = z21;
                        int i86 = i18;
                        q64 = q646;
                        View view3 = childAt6;
                        i13 = i74;
                        i66 = i;
                        iArr2 = iArr3;
                        i15 = i69;
                        r64.measureChildWithMargins(view3, i66, i19, i2, 0);
                        if (i86 != Integer.MIN_VALUE) {
                            q64.width = i86;
                        }
                        int measuredWidth3 = view3.getMeasuredWidth();
                        int i87 = r64.B;
                        int i88 = q64.leftMargin;
                        if (z2) {
                            view = view3;
                            r64.B = i88 + measuredWidth3 + q64.rightMargin + i87;
                        } else {
                            view = view3;
                            r64.B = Math.max(i87, i87 + measuredWidth3 + i88 + q64.rightMargin);
                        }
                        if (z5) {
                            i71 = Math.max(measuredWidth3, i71);
                        }
                    }
                    i16 = 1073741824;
                    if (mode4 == i16 || q64.height != -1) {
                    }
                    int i812 = q64.topMargin + q64.bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i812;
                    i72 = View.combineMeasuredStates(i72, view.getMeasuredState());
                    if (!z6) {
                    }
                    int max2 = Math.max(i13, measuredHeight32);
                    if (!z22 || q64.height != -1) {
                    }
                    if (q64.weight <= 0.0f) {
                    }
                    int i842 = i17;
                    i68 = max2;
                    i12 = i842;
                    z22 = z9;
                }
            }
            i69 = i12;
            i67 = i11 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z20 = z6;
            z21 = z5;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z25 = z20;
        boolean z26 = z21;
        int i89 = i68;
        int i90 = i69;
        int i91 = i70;
        int i92 = i2;
        if (r64.B > 0 && r64.i(virtualChildCount2)) {
            r64.B += r64.H;
        }
        int i93 = iArr5[1];
        if (i93 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
            i3 = i89;
        } else {
            i3 = Math.max(i89, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i93, iArr5[c3]))));
        }
        if (z26 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            r64.B = 0;
            for (int i94 = 0; i94 < virtualChildCount2; i94++) {
                View childAt7 = r64.getChildAt(i94);
                if (childAt7 == null) {
                    r64.B = r64.B;
                } else if (childAt7.getVisibility() != 8) {
                    q64 q647 = (q64) childAt7.getLayoutParams();
                    int i95 = r64.B;
                    if (z2) {
                        r64.B = q647.leftMargin + i71 + q647.rightMargin + i95;
                    } else {
                        r64.B = Math.max(i95, i95 + i71 + q647.leftMargin + q647.rightMargin);
                    }
                }
            }
        }
        int paddingRight = r64.getPaddingRight() + r64.getPaddingLeft() + r64.B;
        r64.B = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, r64.getSuggestedMinimumWidth()), i66, 0);
        int i96 = (resolveSizeAndState2 & 16777215) - r64.B;
        if (z24 || (i96 != 0 && f5 > 0.0f)) {
            float f7 = r64.C;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            r64.B = 0;
            int i97 = -1;
            int i98 = 0;
            while (i98 < virtualChildCount2) {
                View childAt8 = r64.getChildAt(i98);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i8 = resolveSizeAndState2;
                } else {
                    q64 q648 = (q64) childAt8.getLayoutParams();
                    float f8 = q648.weight;
                    if (f8 > 0.0f) {
                        int i99 = (int) ((((float) i96) * f8) / f5);
                        f5 -= f8;
                        i96 -= i99;
                        i8 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i92, r64.getPaddingBottom() + r64.getPaddingTop() + q648.topMargin + q648.bottomMargin, q648.height);
                        if (q648.width == 0) {
                            i10 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i99 <= 0) {
                                    i99 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i99, 1073741824), childMeasureSpec2);
                                i72 = View.combineMeasuredStates(i72, childAt8.getMeasuredState() & -16777216);
                            }
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i99;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i10), childMeasureSpec2);
                        i72 = View.combineMeasuredStates(i72, childAt8.getMeasuredState() & -16777216);
                    } else {
                        i8 = resolveSizeAndState2;
                    }
                    int i100 = r64.B;
                    if (z2) {
                        r64.B = childAt8.getMeasuredWidth() + q648.leftMargin + q648.rightMargin + i100;
                    } else {
                        r64.B = Math.max(i100, childAt8.getMeasuredWidth() + i100 + q648.leftMargin + q648.rightMargin);
                    }
                    if (mode4 == 1073741824 || q648.height != -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    int i101 = q648.topMargin + q648.bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i101;
                    i97 = Math.max(i97, measuredHeight4);
                    if (!z3) {
                        i101 = measuredHeight4;
                    }
                    int max3 = Math.max(i90, i101);
                    if (z22) {
                        i9 = -1;
                        if (q648.height == -1) {
                            z4 = true;
                            if (z25 && (baseline = childAt8.getBaseline()) != i9) {
                                int i102 = q648.gravity;
                                if (i102 < 0) {
                                    i102 = r64.A;
                                }
                                int i103 = (((i102 & 112) >> 4) & -2) >> 1;
                                iArr5[i103] = Math.max(iArr5[i103], baseline);
                                iArr6[i103] = Math.max(iArr6[i103], measuredHeight4 - baseline);
                            }
                            z22 = z4;
                            i90 = max3;
                        }
                    } else {
                        i9 = -1;
                    }
                    z4 = false;
                    if (z25 || (baseline = childAt8.getBaseline()) != i9) {
                    }
                    z22 = z4;
                    i90 = max3;
                }
                i98++;
                resolveSizeAndState2 = i8;
            }
            i4 = resolveSizeAndState2;
            i6 = -16777216;
            r64.B = r64.getPaddingRight() + r64.getPaddingLeft() + r64.B;
            int i104 = iArr5[1];
            if (i104 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                i97 = Math.max(i97, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i104, iArr5[c3]))));
            }
            i7 = i90;
        } else {
            i7 = Math.max(i90, i91);
            if (z26 && mode3 != 1073741824) {
                for (int i105 = 0; i105 < virtualChildCount2; i105++) {
                    View childAt9 = r64.getChildAt(i105);
                    if (!(childAt9 == null || childAt9.getVisibility() == 8 || ((q64) childAt9.getLayoutParams()).weight <= 0.0f)) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i71, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = resolveSizeAndState2;
            i6 = -16777216;
            i5 = 0;
        }
        if (!z22 && mode4 != 1073741824) {
            i3 = i7;
        }
        r64.setMeasuredDimension(i4 | (i72 & i6), View.resolveSizeAndState(Math.max(r64.getPaddingBottom() + r64.getPaddingTop() + i3, r64.getSuggestedMinimumHeight()), i92, i72 << 16));
        if (z23) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(r64.getMeasuredHeight(), 1073741824);
            int i106 = i5;
            while (i106 < virtualChildCount2) {
                View childAt10 = r64.getChildAt(i106);
                if (childAt10.getVisibility() != 8) {
                    q64 q649 = (q64) childAt10.getLayoutParams();
                    if (q649.height == -1) {
                        int i107 = q649.width;
                        q649.width = childAt10.getMeasuredWidth();
                        r64.measureChildWithMargins(childAt10, i66, 0, makeMeasureSpec3, 0);
                        q649.width = i107;
                    }
                }
                i106++;
                r64 = this;
                i66 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.w = z2;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            int childCount = getChildCount();
            throw new IllegalArgumentException("base aligned child index out of range (0, " + childCount + ")");
        }
        this.x = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.G) {
            this.G = drawable;
            boolean z2 = false;
            if (drawable != null) {
                this.H = drawable.getIntrinsicWidth();
                this.I = drawable.getIntrinsicHeight();
            } else {
                this.H = 0;
                this.I = 0;
            }
            if (drawable == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.K = i;
    }

    public void setGravity(int i) {
        if (this.A != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A;
        if ((8388615 & i3) != i2) {
            this.A = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.D = z2;
    }

    public void setOrientation(int i) {
        if (this.z != i) {
            this.z = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.J) {
            requestLayout();
        }
        this.J = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A;
        if ((i3 & 112) != i2) {
            this.A = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.C = Math.max(0.0f, f);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
