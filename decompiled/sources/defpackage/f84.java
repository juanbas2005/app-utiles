package defpackage;

import android.widget.AbsListView;

/* renamed from: f84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f84 implements AbsListView.OnScrollListener {
    public final /* synthetic */ h84 a;

    public f84(h84 h84) {
        this.a = h84;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        h84 h84 = this.a;
        d84 d84 = h84.N;
        fp fpVar = h84.V;
        if (i == 1 && fpVar.getInputMethodMode() != 2 && fpVar.getContentView() != null) {
            h84.R.removeCallbacks(d84);
            d84.run();
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
