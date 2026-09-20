package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: ot2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ot2 extends q1 implements Runnable {
    public ListenableFuture D;

    public final void c() {
        this.D = null;
    }

    public final String j() {
        ListenableFuture listenableFuture = this.D;
        if (listenableFuture == null) {
            return null;
        }
        String valueOf = String.valueOf(listenableFuture);
        StringBuilder sb = new StringBuilder(valueOf.length() + 11);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        ListenableFuture listenableFuture = this.D;
        if (listenableFuture != null) {
            n(listenableFuture);
        }
    }
}
