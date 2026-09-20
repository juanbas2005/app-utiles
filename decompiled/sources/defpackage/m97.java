package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: m97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m97 extends t75 {
    public int c;
    public int d = -1;
    public final /* synthetic */ SwipeDismissBehavior e;

    public m97(SwipeDismissBehavior swipeDismissBehavior) {
        this.e = swipeDismissBehavior;
    }

    public final void A(View view, int i) {
        this.d = i;
        this.c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.e;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    public final void C(View view, int i, int i2) {
        SwipeDismissBehavior swipeDismissBehavior = this.e;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.e;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.f;
        float abs = (float) Math.abs(i - this.c);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.c) >= java.lang.Math.round(((float) r9.getWidth()) * 0.5f)) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    public final void D(View view, float f, float f2) {
        int i;
        int i2;
        boolean z;
        this.d = -1;
        int width = view.getWidth();
        int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        boolean z2 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.e;
        if (i3 != 0) {
            if (view.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i4 = swipeDismissBehavior.d;
            if (i4 != 2) {
                if (i4 == 0) {
                    i = this.c;
                    if (swipeDismissBehavior.a.o(i, view.getTop())) {
                        view.postOnAnimation(new nt2(swipeDismissBehavior, view, z2));
                        return;
                    }
                    return;
                }
                i = this.c;
                if (swipeDismissBehavior.a.o(i, view.getTop())) {
                }
            }
        }
        if (f < 0.0f || view.getLeft() < (i2 = this.c)) {
            i = this.c - width;
        } else {
            i = i2 + width;
        }
        z2 = true;
        if (swipeDismissBehavior.a.o(i, view.getTop())) {
        }
    }

    public final boolean K(View view, int i) {
        int i2 = this.d;
        if ((i2 == -1 || i2 == i) && this.e.r(view)) {
            return true;
        }
        return false;
    }

    public final int g(View view, int i) {
        boolean z;
        int i2;
        int i3;
        if (view.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.e.d;
        if (i4 == 0) {
            i3 = this.c;
            if (z) {
                i3 -= view.getWidth();
                i2 = this.c;
            } else {
                i2 = view.getWidth() + i3;
            }
        } else {
            int i5 = this.c;
            if (i4 != 1) {
                i3 = i5 - view.getWidth();
                i2 = this.c + view.getWidth();
            } else if (z) {
                i2 = view.getWidth() + i5;
                i3 = i5;
            } else {
                i3 = i5 - view.getWidth();
                i2 = this.c;
            }
        }
        return Math.min(Math.max(i3, i), i2);
    }

    public final int h(View view, int i) {
        return view.getTop();
    }

    public final int t(View view) {
        return view.getWidth();
    }

    public final void B(int i) {
    }
}
