package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: u64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u64 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b2;
        int size = this.k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((lz5) this.k.get(i3)).a;
            yy5 yy5 = (yy5) view3.getLayoutParams();
            if (view3 != view && !yy5.a.h() && (b2 = (yy5.a.b() - this.d) * this.e) >= 0 && b2 < i2) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                }
                i2 = b2;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((yy5) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(dz5 dz5) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((lz5) this.k.get(i2)).a;
                yy5 yy5 = (yy5) view.getLayoutParams();
                if (!yy5.a.h() && this.d == yy5.a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d2 = dz5.d(this.d);
        this.d += this.e;
        return d2;
    }
}
