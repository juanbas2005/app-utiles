package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: su1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class su1 extends us0 {
    public final /* synthetic */ tu1 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public su1(tu1 tu1) {
        super(1);
        this.y = tu1;
    }

    public final db8 f(db8 db8, List list) {
        tu1 tu1 = this.y;
        if (!tu1.I) {
            View childAt = tu1.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, tu1.getWidth() - childAt.getRight());
            int max4 = Math.max(0, tu1.getHeight() - childAt.getBottom());
            if (!(max == 0 && max2 == 0 && max3 == 0 && max4 == 0)) {
                return db8.a.q(max, max2, max3, max4);
            }
        }
        return db8;
    }

    public final k68 g(ha8 ha8, k68 k68) {
        tu1 tu1 = this.y;
        if (!tu1.I) {
            View childAt = tu1.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, tu1.getWidth() - childAt.getRight());
            int max4 = Math.max(0, tu1.getHeight() - childAt.getBottom());
            if (!(max == 0 && max2 == 0 && max3 == 0 && max4 == 0)) {
                ad3 b = ad3.b(max, max2, max3, max4);
                int i = b.a;
                int i2 = b.b;
                int i3 = b.c;
                int i4 = b.d;
                return new k68(2, db8.e((ad3) k68.x, i, i2, i3, i4), db8.e((ad3) k68.y, i, i2, i3, i4));
            }
        }
        return k68;
    }
}
