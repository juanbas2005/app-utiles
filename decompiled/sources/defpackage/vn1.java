package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: vn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vn1 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public vn1() {
        this.a = 0;
        this.b = new AtomicInteger(0);
    }

    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            case 1:
                Thread newThread = Executors.defaultThreadFactory().newThread(new h82(0, runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = ((ThreadFactory) obj).newThread(runnable);
                newThread2.setName("ScionFrontendApi");
                return newThread2;
        }
    }

    public vn1(yw8 yw8) {
        this.a = 2;
        this.b = Executors.defaultThreadFactory();
    }

    public vn1(AtomicLong atomicLong) {
        this.a = 1;
        this.b = atomicLong;
    }
}
