package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: pt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pt2 {
    /* JADX WARNING: type inference failed for: r0v1, types: [xj2, h0, f0, java.lang.Runnable] */
    public static f0 a(ListenableFuture listenableFuture, Class cls, dt dtVar, Executor executor) {
        int i = h0.H;
        ? h0Var = new h0(listenableFuture, cls, dtVar);
        listenableFuture.a(h0Var, ag8.E(executor, h0Var));
        return h0Var;
    }

    public static Object b(Future future) {
        Object obj;
        if (future.isDone()) {
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        h.s(u55.o("Future was expected to be done: %s", future));
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [x1, java.lang.Object, e93] */
    public static e93 c(Exception exc) {
        ? obj = new Object();
        obj.m(exc);
        return obj;
    }

    public static f93 d(Object obj) {
        if (obj == null) {
            return f93.x;
        }
        return new f93(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, ot2, java.lang.Runnable] */
    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ? obj = new Object();
        obj.D = listenableFuture;
        listenableFuture.a(obj, fv1.w);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [xj2, j3, i3, java.lang.Runnable] */
    public static i3 f(ListenableFuture listenableFuture, os2 os2, Executor executor) {
        int i = j3.G;
        ? j3Var = new j3(listenableFuture, os2);
        listenableFuture.a(j3Var, ag8.E(executor, j3Var));
        return j3Var;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [xj2, j3, h3, java.lang.Runnable] */
    public static h3 g(ListenableFuture listenableFuture, dt dtVar, Executor executor) {
        int i = j3.G;
        executor.getClass();
        ? j3Var = new j3(listenableFuture, dtVar);
        listenableFuture.a(j3Var, ag8.E(executor, j3Var));
        return j3Var;
    }
}
