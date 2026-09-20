package defpackage;

import java.util.Objects;

/* renamed from: xs8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xs8 implements Runnable {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ long x;
    public final /* synthetic */ cx8 y;

    public xs8(ev8 ev8, long j) {
        this.x = j;
        Objects.requireNonNull(ev8);
        this.y = ev8;
    }

    public final void run() {
        int i = this.w;
        long j = this.x;
        cx8 cx8 = this.y;
        switch (i) {
            case b85.b:
                ((ev8) cx8).i1(j);
                return;
            default:
                l59 l59 = (l59) cx8;
                ev8 ev8 = ((y19) l59.w).J;
                y19.d(ev8);
                ev8.f1(j);
                l59.A = null;
                return;
        }
    }

    public xs8(l59 l59, long j) {
        this.x = j;
        Objects.requireNonNull(l59);
        this.y = l59;
    }
}
