package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: i56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i56 implements ThreadFactory {
    public static final /* synthetic */ i56 b = new i56(1);
    public final /* synthetic */ int a;

    public /* synthetic */ i56(int i) {
        this.a = i;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case b85.b:
                return new h56(runnable);
            default:
                Object obj = x49.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
