package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue A;
    public TypedValue B;
    public final Rect C = new Rect();
    public p41 D;
    public TypedValue w;
    public TypedValue x;
    public TypedValue y;
    public TypedValue z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.A == null) {
            this.A = new TypedValue();
        }
        return this.A;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.B == null) {
            this.B = new TypedValue();
        }
        return this.B;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.y == null) {
            this.y = new TypedValue();
        }
        return this.y;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.z == null) {
            this.z = new TypedValue();
        }
        return this.z;
    }

    public TypedValue getMinWidthMajor() {
        if (this.w == null) {
            this.w = new TypedValue();
        }
        return this.w;
    }

    public TypedValue getMinWidthMinor() {
        if (this.x == null) {
            this.x = new TypedValue();
        }
        return this.x;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p41 p41 = this.D;
        if (p41 != null) {
            p41.getClass();
        }
    }

    public final void onDetachedFromWindow() {
        d8 d8Var;
        super.onDetachedFromWindow();
        p41 p41 = this.D;
        if (p41 != null) {
            wo woVar = (wo) ((ns8) p41).x;
            ActionBarOverlayLayout actionBarOverlayLayout = woVar.M;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((sj7) actionBarOverlayLayout.A).a.w;
                if (!(actionMenuView == null || (d8Var = actionMenuView.P) == null)) {
                    d8Var.g();
                    a8 a8Var = d8Var.P;
                    if (a8Var != null && a8Var.b()) {
                        a8Var.i.dismiss();
                    }
                }
            }
            if (woVar.R != null) {
                woVar.H.getDecorView().removeCallbacks(woVar.S);
                if (woVar.R.isShowing()) {
                    try {
                        woVar.R.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                woVar.R = null;
            }
            c68 c68 = woVar.T;
            if (c68 != null) {
                c68.b();
            }
            ti4 ti4 = woVar.B(0).h;
            if (ti4 != null) {
                ti4.c(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int measuredWidth;
        TypedValue typedValue;
        int i5;
        int i6;
        float fraction;
        TypedValue typedValue2;
        int i7;
        int i8;
        float fraction2;
        TypedValue typedValue3;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z4 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z2 = true;
        } else {
            z2 = false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.C;
        if (mode == Integer.MIN_VALUE) {
            if (z2) {
                typedValue3 = this.z;
            } else {
                typedValue3 = this.y;
            }
            if (!(typedValue3 == null || (i9 = typedValue3.type) == 0)) {
                if (i9 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i9 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction((float) i11, (float) i11);
                } else {
                    i10 = 0;
                    if (i10 > 0) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z3 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z2) {
                                typedValue2 = this.A;
                            } else {
                                typedValue2 = this.B;
                            }
                            if (!(typedValue2 == null || (i7 = typedValue2.type) == 0)) {
                                if (i7 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i7 == 6) {
                                    int i12 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction((float) i12, (float) i12);
                                } else {
                                    i8 = 0;
                                    if (i8 > 0) {
                                        i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                        super.onMeasure(i3, i4);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z3 && mode == Integer.MIN_VALUE) {
                                            if (z2) {
                                                typedValue = this.x;
                                            } else {
                                                typedValue = this.w;
                                            }
                                            if (!(typedValue == null || (i5 = typedValue.type) == 0)) {
                                                if (i5 == 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i5 == 6) {
                                                    int i13 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction((float) i13, (float) i13);
                                                } else {
                                                    i6 = 0;
                                                    if (i6 > 0) {
                                                        i6 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i6) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                                                        if (!z4) {
                                                            super.onMeasure(makeMeasureSpec, i4);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                i6 = (int) fraction;
                                                if (i6 > 0) {
                                                }
                                                if (measuredWidth < i6) {
                                                }
                                            }
                                        }
                                        z4 = false;
                                        if (!z4) {
                                        }
                                    }
                                }
                                i8 = (int) fraction2;
                                if (i8 > 0) {
                                }
                            }
                        }
                        i4 = i2;
                        super.onMeasure(i3, i4);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (z2) {
                        }
                        if (i5 == 5) {
                        }
                        i6 = (int) fraction;
                        if (i6 > 0) {
                        }
                        if (measuredWidth < i6) {
                        }
                        z4 = false;
                        if (!z4) {
                        }
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                }
            }
        }
        i3 = i;
        z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2) {
        }
        if (i5 == 5) {
        }
        i6 = (int) fraction;
        if (i6 > 0) {
        }
        if (measuredWidth < i6) {
        }
        z4 = false;
        if (!z4) {
        }
    }

    public void setAttachListener(p41 p41) {
        this.D = p41;
    }
}
