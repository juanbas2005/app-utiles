package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: ar4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ar4 implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public ar4(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new ee6(runnable, 3));
        newThread.setName(this.a);
        return newThread;
    }
}
