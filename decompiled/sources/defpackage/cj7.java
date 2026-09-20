package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: cj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cj7 implements Runnable {
    public final /* synthetic */ int w;
    public final ListenableFuture x;
    public final kk0 y;

    public /* synthetic */ cj7(ListenableFuture listenableFuture, kk0 kk0, int i) {
        this.w = i;
        this.x = listenableFuture;
        this.y = kk0;
    }

    public final void run() {
        int i = this.w;
        kk0 kk0 = this.y;
        ListenableFuture listenableFuture = this.x;
        switch (i) {
            case b85.b:
                if (listenableFuture.isCancelled()) {
                    kk0.a((Throwable) null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        Object obj = listenableFuture.get();
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        kk0.f(obj);
                        return;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        cause.getClass();
                        kk0.f(new m66(cause));
                        return;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
            default:
                if (listenableFuture.isCancelled()) {
                    kk0.a((Throwable) null);
                    return;
                }
                try {
                    kk0.f(z2.g(listenableFuture));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        kk0.f(new m66(cause2));
                        return;
                    }
                    NullPointerException nullPointerException = new NullPointerException();
                    sg3.S(nullPointerException, sg3.class.getName());
                    throw nullPointerException;
                }
        }
    }
}
