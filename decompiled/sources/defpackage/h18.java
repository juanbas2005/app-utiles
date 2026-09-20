package defpackage;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: h18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h18 {
    public static final ExecutorService a;

    static {
        vn1 vn1 = new vn1(new AtomicLong(1));
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), vn1, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new h82(1, unconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        a = unconfigurableExecutorService;
    }

    public static void a(yb9 yb9) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        yb9.f(a, new c9(19, countDownLatch));
        Looper mainLooper = Looper.getMainLooper();
        Looper myLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == myLooper) {
            countDownLatch.await(3000, timeUnit);
        } else {
            countDownLatch.await(4000, timeUnit);
        }
        if (yb9.k()) {
            yb9.i();
        } else if (yb9.d) {
            throw new CancellationException("Task is already canceled");
        } else if (yb9.j()) {
            throw new IllegalStateException(yb9.h());
        } else {
            throw new TimeoutException();
        }
    }
}
