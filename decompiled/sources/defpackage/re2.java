package defpackage;

import java.util.concurrent.Executor;

/* renamed from: re2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum re2 implements Executor {
    ;

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
