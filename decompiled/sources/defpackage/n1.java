package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: n1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n1 implements Runnable {
    public final x1 w;
    public final ListenableFuture x;

    public n1(x1 x1Var, ListenableFuture listenableFuture) {
        this.w = x1Var;
        this.x = listenableFuture;
    }

    public final void run() {
        if (this.w.w == this) {
            if (x1.B.n(this.w, this, x1.h(this.x))) {
                x1.e(this.w);
            }
        }
    }
}
