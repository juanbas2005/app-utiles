package defpackage;

import android.app.RemoteAction;
import android.view.MenuItem;

/* renamed from: vg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vg7 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ RemoteAction a;

    public /* synthetic */ vg7(RemoteAction remoteAction) {
        this.a = remoteAction;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        j45.p(this.a.getActionIntent());
        return true;
    }
}
