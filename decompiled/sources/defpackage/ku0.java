package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: ku0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ku0 extends fg3 {
    public final /* synthetic */ int A;
    public final /* synthetic */ lu0 B;
    public final Object C;
    public final Executor y;
    public final /* synthetic */ lu0 z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ku0(lu0 lu0, Callable callable) {
        this(lu0, (Executor) fv1.w);
        this.A = 1;
        this.B = lu0;
        this.C = callable;
    }

    public final void a(Throwable th) {
        lu0 lu0 = this.z;
        lu0.J = null;
        if (th instanceof ExecutionException) {
            lu0.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            lu0.cancel(false);
        } else {
            lu0.m(th);
        }
    }

    public final void b(Object obj) {
        this.z.J = null;
        int i = this.A;
        lu0 lu0 = this.B;
        switch (i) {
            case b85.b:
                lu0.n((ListenableFuture) obj);
                return;
            default:
                lu0.l(obj);
                return;
        }
    }

    public final boolean d() {
        return this.z.isDone();
    }

    public final Object e() {
        int i = this.A;
        Object obj = this.C;
        switch (i) {
            case b85.b:
                return ((kc9) obj).call();
            default:
                return ((Callable) obj).call();
        }
    }

    public final String f() {
        int i = this.A;
        Object obj = this.C;
        switch (i) {
            case b85.b:
                return ((kc9) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ku0(lu0 lu0, kc9 kc9, Executor executor) {
        this(lu0, executor);
        this.A = 0;
        this.B = lu0;
        this.C = kc9;
    }

    public ku0(lu0 lu0, Executor executor) {
        this.z = lu0;
        executor.getClass();
        this.y = executor;
    }
}
