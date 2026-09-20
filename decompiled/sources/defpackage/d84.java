package defpackage;

/* renamed from: d84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d84 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ h84 x;

    public /* synthetic */ d84(h84 h84, int i) {
        this.w = i;
        this.x = h84;
    }

    public final void run() {
        int i = this.w;
        h84 h84 = this.x;
        switch (i) {
            case b85.b:
                e02 e02 = h84.y;
                if (e02 != null) {
                    e02.setListSelectionHidden(true);
                    e02.requestLayout();
                    return;
                }
                return;
            default:
                e02 e022 = h84.y;
                if (e022 != null && e022.isAttachedToWindow() && h84.y.getCount() > h84.y.getChildCount() && h84.y.getChildCount() <= h84.I) {
                    h84.V.setInputMethodMode(2);
                    h84.g();
                    return;
                }
                return;
        }
    }
}
