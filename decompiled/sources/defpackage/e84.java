package defpackage;

import android.database.DataSetObserver;

/* renamed from: e84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e84 extends DataSetObserver {
    public final /* synthetic */ h84 a;

    public e84(h84 h84) {
        this.a = h84;
    }

    public final void onChanged() {
        h84 h84 = this.a;
        if (h84.V.isShowing()) {
            h84.g();
        }
    }

    public final void onInvalidated() {
        this.a.dismiss();
    }
}
