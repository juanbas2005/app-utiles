package defpackage;

import androidx.appcompat.widget.Toolbar;

/* renamed from: kj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kj7 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Toolbar x;

    public /* synthetic */ kj7(Toolbar toolbar, int i) {
        this.w = i;
        this.x = toolbar;
    }

    public final void run() {
        yi4 yi4;
        int i = this.w;
        Toolbar toolbar = this.x;
        switch (i) {
            case b85.b:
                mj7 mj7 = toolbar.k0;
                if (mj7 == null) {
                    yi4 = null;
                } else {
                    yi4 = mj7.x;
                }
                if (yi4 != null) {
                    yi4.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.m();
                return;
        }
    }
}
