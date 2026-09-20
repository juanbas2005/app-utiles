package defpackage;

import java.util.concurrent.Executor;

/* renamed from: l1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l1 {
    public static final l1 d = new l1();
    public final Runnable a;
    public final Executor b;
    public l1 c;

    public l1() {
        this.a = null;
        this.b = null;
    }

    public l1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
