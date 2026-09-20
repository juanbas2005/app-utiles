package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AlertDialogLayout extends r64 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = e58.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i3 - i;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i11 = gravity & 112;
        int i12 = gravity & 8388615;
        if (i11 == 16) {
            i5 = (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        } else if (i11 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - measuredHeight;
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            i6 = 0;
        } else {
            i6 = dividerDrawable.getIntrinsicHeight();
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                q64 q64 = (q64) childAt.getLayoutParams();
                int i14 = q64.gravity;
                if (i14 < 0) {
                    i14 = i12;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + q64.leftMargin;
                    i9 = q64.rightMargin;
                } else if (absoluteGravity != 5) {
                    i7 = q64.leftMargin + paddingLeft;
                    if (i(i13)) {
                        i5 += i6;
                    }
                    int i15 = i5 + q64.topMargin;
                    childAt.layout(i7, i15, measuredWidth + i7, i15 + measuredHeight2);
                    i5 = measuredHeight2 + q64.bottomMargin + i15;
                } else {
                    i8 = paddingRight - measuredWidth;
                    i9 = q64.rightMargin;
                }
                i7 = i8 - i9;
                if (i(i13)) {
                }
                int i152 = i5 + q64.topMargin;
                childAt.layout(i7, i152, measuredWidth + i7, i152 + measuredHeight2);
                i5 = measuredHeight2 + q64.bottomMargin + i152;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AlertDialogLayout alertDialogLayout = this;
        int i8 = i;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = alertDialogLayout.getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i8);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i8, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i8, 0);
            i5 = j(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingBottom += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i7 = 0;
            } else {
                i7 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i8, i7);
            i6 = view3.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i10 = size - paddingBottom;
        if (view2 != null) {
            int i11 = paddingBottom - i5;
            int min = Math.min(i10, i4);
            if (min > 0) {
                i10 -= min;
                i5 += min;
            }
            view2.measure(i8, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingBottom = i11 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            view3.measure(i8, View.MeasureSpec.makeMeasureSpec(i6 + i10, mode));
            paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = alertDialogLayout.getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                i12 = Math.max(i12, childAt2.getMeasuredWidth());
            }
        }
        int i14 = i2;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i12, i8, i3), View.resolveSizeAndState(paddingBottom, i14, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i15 = 0;
            while (i15 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i15);
                if (childAt3.getVisibility() != 8) {
                    q64 q64 = (q64) childAt3.getLayoutParams();
                    if (q64.width == -1) {
                        int i16 = q64.height;
                        q64.height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i14, 0);
                        q64.height = i16;
                    }
                }
                i15++;
                alertDialogLayout = this;
                i14 = i2;
            }
        }
    }
}
