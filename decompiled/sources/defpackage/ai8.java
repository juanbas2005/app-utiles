package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ai8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ai8 {
    public int a;
    public h94 b;
    public final Context c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Executor h;
    public volatile tt i;
    public volatile tt j;
    public final /* synthetic */ int k;
    public Object l;
    public final Object m;

    public ai8(Context context) {
        this.d = false;
        this.e = false;
        this.f = true;
        this.g = false;
        this.c = context.getApplicationContext();
    }

    public final void a() {
        if (this.i != null) {
            boolean z = this.d;
            if (!z) {
                if (z) {
                    d();
                } else {
                    this.g = true;
                }
            }
            tt ttVar = this.j;
            tt ttVar2 = this.i;
            if (ttVar != null) {
                ttVar2.getClass();
                this.i = null;
                return;
            }
            ttVar2.getClass();
            tt ttVar3 = this.i;
            ttVar3.y.set(true);
            if (ttVar3.w.cancel(false)) {
                this.j = this.i;
            }
            this.i = null;
        }
    }

    public final void b(Object obj) {
        h94 h94 = this.b;
        if (h94 == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h94.i(obj);
        } else {
            h94.g(obj);
        }
    }

    public final void c() {
        if (this.j == null && this.i != null) {
            this.i.getClass();
            if (this.h == null) {
                this.h = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            tt ttVar = this.i;
            Executor executor = this.h;
            if (ttVar.x != 1) {
                int B = b81.B(ttVar.x);
                if (B == 1) {
                    h.s("Cannot execute task: the task is already running.");
                } else if (B != 2) {
                    h.s("We should never reach this state");
                } else {
                    h.s("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                ttVar.x = 2;
                executor.execute(ttVar.w);
            }
        }
    }

    public final void d() {
        a();
        this.i = new tt(this);
        c();
    }

    public final Object e() {
        int i2 = this.k;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Object obj = this.m;
        switch (i2) {
            case b85.b /*0*/:
                Iterator it = ((Set) obj).iterator();
                if (!it.hasNext()) {
                    try {
                        ((Semaphore) this.l).tryAcquire(0, 5, timeUnit);
                        return null;
                    } catch (InterruptedException e2) {
                        Log.i("GACSignInLoader", "Unexpected InterruptedException", e2);
                        Thread.currentThread().interrupt();
                        return null;
                    }
                } else {
                    ((pg8) it.next()).getClass();
                    ku4.p();
                    return null;
                }
            default:
                ArrayList Y = z65.Y(this.c);
                yf3 yf3 = (yf3) ((k68) obj).x;
                yb9 b2 = yf3.b(0, new xg8(yf3, Y));
                z65.l("Task must not be null", b2);
                z65.l("TimeUnit must not be null", timeUnit);
                br4 br4 = new br4(25, (byte) 0);
                xb7 xb7 = new xb7(br4);
                ph8 ph8 = new ph8(Looper.getMainLooper(), 1);
                ph8.postDelayed(new bj8(1, xb7), 2000);
                b2.b(new cf4(ph8, xb7, br4, 29));
                yb9 yb9 = xb7.a;
                try {
                    b35.b(yb9);
                    if (yb9.k()) {
                        return (List) yb9.i();
                    }
                    return Y;
                } catch (InterruptedException | ExecutionException e3) {
                    Log.w("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e3.getMessage())));
                    return Y;
                }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        return hl6.n(sb, this.a, "}");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ai8(Context context, Set set) {
        this(context);
        this.k = 0;
        this.l = new Semaphore(0);
        this.m = set;
    }

    public final void f() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ai8(Context context, k68 k68) {
        this(context.getApplicationContext());
        this.k = 1;
        this.m = k68;
    }
}
