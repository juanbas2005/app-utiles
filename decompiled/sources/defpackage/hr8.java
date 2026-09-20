package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: hr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hr8 extends Thread {
    public final WeakReference w;
    public final long x;
    public final CountDownLatch y = new CountDownLatch(1);
    public boolean z = false;

    public hr8(da daVar, long j) {
        this.w = new WeakReference(daVar);
        this.x = j;
        start();
    }

    public final void run() {
        da daVar;
        WeakReference weakReference = this.w;
        try {
            if (!this.y.await(this.x, TimeUnit.MILLISECONDS) && (daVar = (da) weakReference.get()) != null) {
                daVar.b();
                this.z = true;
            }
        } catch (InterruptedException unused) {
            da daVar2 = (da) weakReference.get();
            if (daVar2 != null) {
                daVar2.b();
                this.z = true;
            }
        }
    }
}
