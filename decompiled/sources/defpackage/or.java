package defpackage;

import java.util.concurrent.Executor;

/* renamed from: or  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class or implements Executor {
    public final /* synthetic */ int w;

    public /* synthetic */ or(int i) {
        this.w = i;
    }

    public final void execute(Runnable runnable) {
        switch (this.w) {
            case b85.b:
                pr.K().c.d.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
