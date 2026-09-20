package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: cz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cz0 implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ cz0(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setPriority(10);
        return thread;
    }
}
