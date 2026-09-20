package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ex6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ex6 extends az5 {
    public boolean a = false;
    public final /* synthetic */ ib5 b;

    public ex6(ib5 ib5) {
        this.b = ib5;
    }

    public final void a(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
    }
}
