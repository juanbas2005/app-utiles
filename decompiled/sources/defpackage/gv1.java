package defpackage;

import java.util.concurrent.Executor;

/* renamed from: gv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv1 implements Executor {
    public static final /* synthetic */ gv1 A = new gv1(4);
    public static final gv1 x = new gv1(0);
    public static final /* synthetic */ gv1 y = new gv1(2);
    public static final /* synthetic */ gv1 z = new gv1(3);
    public final /* synthetic */ int w;

    public /* synthetic */ gv1(int i) {
        this.w = i;
    }

    public final void execute(Runnable runnable) {
        switch (this.w) {
            case b85.b:
                runnable.run();
                return;
            case 1:
                new Thread(runnable).start();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
