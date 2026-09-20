package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: gm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gm4 implements Executor {
    public final /* synthetic */ Executor w;
    public final /* synthetic */ xj2 x;

    public gm4(Executor executor, xj2 xj2) {
        this.w = executor;
        this.x = xj2;
    }

    public final void execute(Runnable runnable) {
        try {
            this.w.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.x.m(e);
        }
    }
}
