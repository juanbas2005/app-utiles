package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: mj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mj7 implements rj4 {
    public ti4 w;
    public yi4 x;
    public final /* synthetic */ Toolbar y;

    public mj7(Toolbar toolbar) {
        this.y = toolbar;
    }

    public final boolean c(i67 i67) {
        return false;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(yi4 yi4) {
        Toolbar toolbar = this.y;
        View view = toolbar.E;
        if (view instanceof ys0) {
            ((aj4) ((ys0) view)).w.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.E);
        toolbar.removeView(toolbar.D);
        toolbar.E = null;
        ArrayList arrayList = toolbar.d0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.x = null;
        toolbar.requestLayout();
        yi4.C = false;
        yi4.n.p(false);
        toolbar.t();
        return true;
    }

    public final boolean h(yi4 yi4) {
        Toolbar toolbar = this.y;
        toolbar.c();
        ViewParent parent = toolbar.D.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.D);
            }
            toolbar.addView(toolbar.D);
        }
        View actionView = yi4.getActionView();
        toolbar.E = actionView;
        this.x = yi4;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.E);
            }
            nj7 h = Toolbar.h();
            h.a = (toolbar.J & 112) | 8388611;
            h.b = 2;
            toolbar.E.setLayoutParams(h);
            toolbar.addView(toolbar.E);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((nj7) childAt.getLayoutParams()).b == 2 || childAt == toolbar.w)) {
                toolbar.removeViewAt(childCount);
                toolbar.d0.add(childAt);
            }
        }
        toolbar.requestLayout();
        yi4.C = true;
        yi4.n.p(false);
        View view = toolbar.E;
        if (view instanceof ys0) {
            ((aj4) ((ys0) view)).w.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    public final void i() {
        if (this.x != null) {
            ti4 ti4 = this.w;
            if (ti4 != null) {
                int size = ti4.f.size();
                int i = 0;
                while (i < size) {
                    if (this.w.getItem(i) != this.x) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            e(this.x);
        }
    }

    public final void k(Context context, ti4 ti4) {
        yi4 yi4;
        ti4 ti42 = this.w;
        if (!(ti42 == null || (yi4 = this.x) == null)) {
            ti42.d(yi4);
        }
        this.w = ti4;
    }

    public final void a(ti4 ti4, boolean z) {
    }
}
