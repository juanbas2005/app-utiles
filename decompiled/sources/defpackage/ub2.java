package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ub2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ub2 extends az5 {
    public final /* synthetic */ wb2 a;

    public ub2(wb2 wb2) {
        this.a = wb2;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        wb2 wb2 = this.a;
        int i3 = wb2.a;
        int computeVerticalScrollRange = wb2.s.computeVerticalScrollRange();
        int i4 = wb2.r;
        if (computeVerticalScrollRange - i4 <= 0 || i4 < i3) {
            z = false;
        } else {
            z = true;
        }
        wb2.t = z;
        int computeHorizontalScrollRange = wb2.s.computeHorizontalScrollRange();
        int i5 = wb2.q;
        if (computeHorizontalScrollRange - i5 <= 0 || i5 < i3) {
            z2 = false;
        } else {
            z2 = true;
        }
        wb2.u = z2;
        boolean z3 = wb2.t;
        if (z3 || z2) {
            if (z3) {
                float f = (float) i4;
                wb2.l = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                wb2.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (wb2.u) {
                float f2 = (float) computeHorizontalScrollOffset;
                float f3 = (float) i5;
                wb2.o = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                wb2.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = wb2.v;
            if (i6 == 0 || i6 == 1) {
                wb2.f(1);
            }
        } else if (wb2.v != 0) {
            wb2.f(0);
        }
    }
}
