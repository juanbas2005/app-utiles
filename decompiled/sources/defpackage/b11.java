package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b11 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public b11(boolean z) {
        this.b = z;
    }

    public final Thread newThread(Runnable runnable) {
        String str;
        runnable.getClass();
        if (this.b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder o = b81.o(str);
        o.append(this.a.incrementAndGet());
        return new Thread(runnable, o.toString());
    }
}
