package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* renamed from: go7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class go7 extends fg3 {
    public final Object A;
    public final /* synthetic */ int y = 0;
    public final /* synthetic */ ho7 z;

    public go7(ho7 ho7, Callable callable) {
        this.z = ho7;
        callable.getClass();
        this.A = callable;
    }

    public final void a(Throwable th) {
        int i = this.y;
        ho7 ho7 = this.z;
        switch (i) {
            case b85.b:
                ho7.m(th);
                return;
            default:
                ho7.m(th);
                return;
        }
    }

    public final void b(Object obj) {
        int i = this.y;
        ho7 ho7 = this.z;
        switch (i) {
            case b85.b:
                ho7.n((ListenableFuture) obj);
                return;
            default:
                ho7.l(obj);
                return;
        }
    }

    public final boolean d() {
        int i = this.y;
        ho7 ho7 = this.z;
        switch (i) {
            case b85.b:
                return ho7.isDone();
            default:
                return ho7.isDone();
        }
    }

    public final Object e() {
        int i = this.y;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                ct ctVar = (ct) obj;
                ListenableFuture call = ctVar.call();
                g75.k(call, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ctVar);
                return call;
            default:
                return ((Callable) obj).call();
        }
    }

    public final String f() {
        switch (this.y) {
            case b85.b:
                return ((ct) this.A).toString();
            default:
                return ((Callable) this.A).toString();
        }
    }

    public go7(ho7 ho7, ct ctVar) {
        this.z = ho7;
        this.A = ctVar;
    }
}
