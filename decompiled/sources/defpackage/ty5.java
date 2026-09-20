package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: ty5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ty5 {
    public uy5 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(lz5 lz5) {
        RecyclerView recyclerView;
        int i = lz5.j;
        if (!lz5.f() && (i & 4) == 0 && (recyclerView = lz5.r) != null) {
            recyclerView.F(lz5);
        }
    }

    public abstract boolean a(lz5 lz5, lz5 lz52, dv5 dv5, dv5 dv52);

    public final void c(lz5 lz5) {
        uy5 uy5 = this.a;
        if (uy5 != null) {
            RecyclerView recyclerView = (RecyclerView) uy5.x;
            boolean z = true;
            lz5.n(true);
            View view = lz5.a;
            if (lz5.h != null && lz5.i == null) {
                lz5.h = null;
            }
            lz5.i = null;
            if ((lz5.j & 16) == 0) {
                dz5 dz5 = recyclerView.x;
                recyclerView.a0();
                wr0 wr0 = recyclerView.A;
                cp0 cp0 = (cp0) wr0.y;
                ay4 ay4 = (ay4) wr0.x;
                int indexOfChild = ((RecyclerView) ay4.x).indexOfChild(view);
                if (indexOfChild == -1) {
                    wr0.i0(view);
                } else if (cp0.d(indexOfChild)) {
                    cp0.i(indexOfChild);
                    wr0.i0(view);
                    ay4.v(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    lz5 I = RecyclerView.I(view);
                    dz5.k(I);
                    dz5.h(I);
                }
                recyclerView.b0(!z);
                if (!z && lz5.j()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(lz5 lz5);

    public abstract void e();

    public abstract boolean f();
}
