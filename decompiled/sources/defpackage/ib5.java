package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ib5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ib5 extends zy5 {
    public RecyclerView a;
    public final ex6 b = new ex6(this);
    public a85 c;
    public a85 d;

    public static int b(View view, t22 t22) {
        return ((t22.e(view) / 2) + t22.g(view)) - ((t22.n() / 2) + t22.m());
    }

    public static View c(xy5 xy5, t22 t22) {
        int v = xy5.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int n = (t22.n() / 2) + t22.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = xy5.u(i2);
            int abs = Math.abs(((t22.e(u) / 2) + t22.g(u)) - n);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(xy5 xy5, View view) {
        int[] iArr = new int[2];
        if (xy5.d()) {
            iArr[0] = b(view, d(xy5));
        } else {
            iArr[0] = 0;
        }
        if (xy5.e()) {
            iArr[1] = b(view, e(xy5));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final t22 d(xy5 xy5) {
        a85 a85 = this.d;
        if (a85 == null || ((xy5) a85.b) != xy5) {
            this.d = new a85(xy5, 0);
        }
        return this.d;
    }

    public final t22 e(xy5 xy5) {
        a85 a85 = this.c;
        if (a85 == null || ((xy5) a85.b) != xy5) {
            this.c = new a85(xy5, 1);
        }
        return this.c;
    }

    public final void f() {
        xy5 layoutManager;
        View view;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a2 = a(layoutManager, view);
                int i = a2[0];
                if (i != 0 || a2[1] != 0) {
                    this.a.Z(i, a2[1], false);
                }
            }
        }
    }
}
