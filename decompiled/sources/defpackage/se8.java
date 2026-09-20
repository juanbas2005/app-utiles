package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: se8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class se8 {
    public static final String a = bc4.p("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, t84 t84, a97 a97) {
        boolean z;
        Object obj;
        try {
            z = false;
            if (listenableFuture.isDone()) {
                while (true) {
                    obj = listenableFuture.get();
                    break;
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return obj;
            }
            kk0 kk0 = new kk0(1, rc9.a0(a97));
            kk0.v();
            listenableFuture.a(new cj7(listenableFuture, kk0, 0), ev1.w);
            kk0.x(new e3(22, (Object) t84, (Object) listenableFuture));
            return kk0.t();
        } catch (InterruptedException unused) {
            z = true;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}
