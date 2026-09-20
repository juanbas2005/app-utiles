package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: mz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mz5 extends k4 {
    public final WeakHashMap A = new WeakHashMap();
    public final nz5 z;

    public mz5(nz5 nz5) {
        this.z = nz5;
    }

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            return k4Var.a(view, accessibilityEvent);
        }
        return this.w.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final f96 b(View view) {
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            return k4Var.b(view);
        }
        return super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            k4Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, c5 c5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        nz5 nz5 = this.z;
        RecyclerView recyclerView = nz5.z;
        RecyclerView recyclerView2 = nz5.z;
        boolean K = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.w;
        if (K || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, c5Var);
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            k4Var.d(view, c5Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            k4Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        k4 k4Var = (k4) this.A.get(viewGroup);
        if (k4Var != null) {
            return k4Var.f(viewGroup, view, accessibilityEvent);
        }
        return this.w.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        nz5 nz5 = this.z;
        RecyclerView recyclerView = nz5.z;
        RecyclerView recyclerView2 = nz5.z;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            if (k4Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        dz5 dz5 = recyclerView2.getLayoutManager().b.x;
        return false;
    }

    public final void h(View view, int i) {
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            k4Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        k4 k4Var = (k4) this.A.get(view);
        if (k4Var != null) {
            k4Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
