package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: ho7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ho7 extends xj2 implements RunnableFuture {
    public volatile fg3 E;

    public ho7(Callable callable) {
        this.E = new go7(this, callable);
    }

    public final void c() {
        fg3 fg3;
        if (p() && (fg3 = this.E) != null) {
            fg3.c();
        }
        this.E = null;
    }

    public final String j() {
        fg3 fg3 = this.E;
        if (fg3 == null) {
            return super.j();
        }
        String valueOf = String.valueOf(fg3);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        fg3 fg3 = this.E;
        if (fg3 != null) {
            fg3.run();
        }
        this.E = null;
    }
}
