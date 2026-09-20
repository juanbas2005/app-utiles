package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: z74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z74 implements rj4, AdapterView.OnItemClickListener {
    public qj4 A;
    public y74 B;
    public Context w;
    public LayoutInflater x;
    public ti4 y;
    public ExpandedMenuView z;

    public z74(ContextWrapper contextWrapper) {
        this.w = contextWrapper;
        this.x = LayoutInflater.from(contextWrapper);
    }

    public final void a(ti4 ti4, boolean z2) {
        qj4 qj4 = this.A;
        if (qj4 != null) {
            qj4.a(ti4, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [vi4, android.content.DialogInterface$OnClickListener, java.lang.Object, qj4, android.content.DialogInterface$OnDismissListener] */
    public final boolean c(i67 i67) {
        boolean hasVisibleItems = i67.hasVisibleItems();
        Context context = i67.a;
        if (!hasVisibleItems) {
            return false;
        }
        ? obj = new Object();
        obj.w = i67;
        qa qaVar = new qa(context);
        ma maVar = (ma) qaVar.y;
        z74 z74 = new z74(maVar.a);
        obj.y = z74;
        z74.A = obj;
        i67.b(z74, context);
        z74 z742 = obj.y;
        if (z742.B == null) {
            z742.B = new y74(z742);
        }
        maVar.g = z742.B;
        maVar.h = obj;
        View view = i67.o;
        if (view != null) {
            maVar.e = view;
        } else {
            maVar.c = i67.n;
            maVar.d = i67.m;
        }
        maVar.f = obj;
        ra e = qaVar.e();
        obj.x = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.x.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.x.show();
        qj4 qj4 = this.A;
        if (qj4 == null) {
            return true;
        }
        qj4.m(i67);
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(yi4 yi4) {
        return false;
    }

    public final void f(qj4 qj4) {
        throw null;
    }

    public final boolean h(yi4 yi4) {
        return false;
    }

    public final void i() {
        y74 y74 = this.B;
        if (y74 != null) {
            y74.notifyDataSetChanged();
        }
    }

    public final void k(Context context, ti4 ti4) {
        if (this.w != null) {
            this.w = context;
            if (this.x == null) {
                this.x = LayoutInflater.from(context);
            }
        }
        this.y = ti4;
        y74 y74 = this.B;
        if (y74 != null) {
            y74.notifyDataSetChanged();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.y.q(this.B.getItem(i), this, 0);
    }
}
