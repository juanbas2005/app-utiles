package defpackage;

import java.util.Objects;

/* renamed from: i59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i59 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ l59 x;

    public i59(l59 l59, int i) {
        this.w = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(l59);
                this.x = l59;
                return;
            default:
                Objects.requireNonNull(l59);
                this.x = l59;
                return;
        }
    }

    public final void run() {
        int i = this.w;
        l59 l59 = this.x;
        switch (i) {
            case b85.b:
                l59.A = l59.F;
                return;
            default:
                l59.F = null;
                return;
        }
    }
}
