package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* renamed from: tu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tu1 extends a1 implements l45 {
    public final Window F;
    public final ed5 G = u55.p(gw0.a);
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;

    public tu1(Context context, Window window) {
        super(context);
        this.F = window;
        WeakHashMap weakHashMap = e58.a;
        w48.c(this, this);
        e58.o(this, new su1(this));
    }

    public final void a(int i, yt2 yt2) {
        int i2;
        boolean z;
        yt2.g0(1735448596);
        if (yt2.i(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            ((gs2) this.G.getValue()).H(yt2, 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new z0(this, i, 6);
        }
    }

    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
            int paddingBottom = (((i6 - measuredHeight) - (getPaddingBottom() + paddingTop)) / 2) + getPaddingTop();
            childAt.layout(paddingLeft, paddingBottom, measuredWidth + paddingLeft, measuredHeight + paddingBottom);
        }
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.K;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    public final void h(int i, int i2) {
        int i3;
        int paddingBottom;
        int i4;
        int i5;
        int mode;
        int i6;
        int i7 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Window window = this.F;
        if (mode2 == Integer.MIN_VALUE && !this.H && window.getAttributes().height == -2) {
            if (this.I) {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 < 30) {
                    i3 = zm.a.a(window);
                } else if (i8 < 32) {
                    i3 = en.a.a(window);
                }
            } else {
                i3 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            paddingBottom = getPaddingBottom() + getPaddingTop();
            i4 = size - paddingRight;
            if (i4 < 0) {
                i4 = 0;
            }
            i5 = i3 - paddingBottom;
            if (i5 >= 0) {
                i7 = i5;
            }
            mode = View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            }
            childAt.measure(i, i2);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            if (mode2 != Integer.MIN_VALUE) {
                i6 = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
            } else if (mode2 != 1073741824) {
                i6 = childAt.getMeasuredHeight() + paddingBottom;
            } else {
                i6 = size2;
            }
            setMeasuredDimension(size, i6);
            if (!this.I && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (!this.H) {
                    window.setLayout(-1, -1);
                    return;
                }
                return;
            }
            return;
        }
        i3 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        paddingBottom = getPaddingBottom() + getPaddingTop();
        i4 = size - paddingRight2;
        if (i4 < 0) {
        }
        i5 = i3 - paddingBottom;
        if (i5 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode != Integer.MIN_VALUE) {
        }
        if (mode2 != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, i6);
        if (!this.I || childAt.getMeasuredHeight() + paddingBottom > size2 || window.getAttributes().height == -2) {
        }
    }

    public final db8 i(View view, db8 db8) {
        if (!this.I) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (!(max == 0 && max2 == 0 && max3 == 0 && max4 == 0)) {
                return db8.a.q(max, max2, max3, max4);
            }
        }
        return db8;
    }
}
