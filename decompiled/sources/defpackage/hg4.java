package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: hg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hg4 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ kg4 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hg4(kg4 kg4, int i, int i2) {
        super(i);
        this.F = kg4;
        this.E = i2;
    }

    public final void B0(iz5 iz5, int[] iArr) {
        kg4 kg4 = this.F;
        RecyclerView recyclerView = kg4.A0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = kg4.A0.getWidth();
            return;
        }
        iArr[0] = recyclerView.getHeight();
        iArr[1] = kg4.A0.getHeight();
    }

    public final void y0(RecyclerView recyclerView, int i) {
        ul0 ul0 = new ul0(recyclerView.getContext());
        ul0.a = i;
        z0(ul0);
    }
}
