package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nz5 extends k4 {
    public final mz5 A;
    public final RecyclerView z;

    public nz5(RecyclerView recyclerView) {
        this.z = recyclerView;
        mz5 mz5 = this.A;
        if (mz5 != null) {
            this.A = mz5;
        } else {
            this.A = new mz5(this);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.z.K()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(accessibilityEvent);
            }
        }
    }

    public final void d(View view, c5 c5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        this.w.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.z;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            xy5 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            dz5 dz5 = recyclerView2.x;
            iz5 iz5 = recyclerView2.z0;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
                c5Var.a(8192);
                c5Var.k(true);
            }
            if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
                c5Var.a(4096);
                c5Var.k(true);
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(dz5, iz5), layoutManager.x(dz5, iz5), false, 0));
        }
    }

    public final boolean g(View view, int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.z;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            xy5 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            dz5 dz5 = recyclerView2.x;
            if (i != 4096) {
                if (i != 8192) {
                    i3 = 0;
                    i2 = 0;
                } else {
                    if (recyclerView2.canScrollVertically(-1)) {
                        i3 = -((layoutManager.o - layoutManager.G()) - layoutManager.D());
                    } else {
                        i3 = 0;
                    }
                    if (layoutManager.b.canScrollHorizontally(-1)) {
                        i2 = -((layoutManager.n - layoutManager.E()) - layoutManager.F());
                    }
                }
                if (!(i3 == 0 && i2 == 0)) {
                    layoutManager.b.Z(i2, i3, true);
                    return true;
                }
            } else {
                if (recyclerView2.canScrollVertically(1)) {
                    i4 = (layoutManager.o - layoutManager.G()) - layoutManager.D();
                } else {
                    i4 = 0;
                }
                if (layoutManager.b.canScrollHorizontally(1)) {
                    i2 = (layoutManager.n - layoutManager.E()) - layoutManager.F();
                    layoutManager.b.Z(i2, i3, true);
                    return true;
                }
            }
            i2 = 0;
            layoutManager.b.Z(i2, i3, true);
            return true;
        }
        return false;
    }
}
