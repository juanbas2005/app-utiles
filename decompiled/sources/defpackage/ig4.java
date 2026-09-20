package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ig4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ig4 extends vy5 {
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof kf8) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            kf8 kf8 = (kf8) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            throw null;
        }
    }
}
