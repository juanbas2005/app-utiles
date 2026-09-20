package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j89 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ w89 x;
    public final /* synthetic */ i3 y;

    public /* synthetic */ j89(w89 w89, i3 i3Var, int i) {
        this.w = i;
        this.x = w89;
        this.y = i3Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ ExecutionException -> 0x0029, CancellationException -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0065 A[Catch:{ ExecutionException -> 0x0029, CancellationException -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    public final void run() {
        w89 w89;
        ge2 ge2;
        switch (this.w) {
            case b85.b:
                w89 w892 = this.x;
                try {
                    pt2.b(this.y);
                    return;
                } catch (Exception e) {
                    String str = w892.c;
                    Log.w("FlagStore", f21.m(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e);
                    return;
                }
            default:
                w89 = this.x;
                try {
                    t99 t99 = (t99) pt2.b(this.y);
                    ge2 ge22 = new ge2(t99, new dv5(6, 2, 11));
                    boolean z = w89.e;
                    if (!z) {
                        ge2 = w89.a;
                        if (ge2 == null) {
                        }
                        if (!((n36) ge2.d).equals((n36) ge22.d)) {
                            q99 q99 = (q99) w89.b.e.get();
                            if (q99 != null) {
                                q99.a();
                                return;
                            }
                            return;
                        }
                        if (!w89.e) {
                            x49 x49 = w89.b;
                            a69 a69 = (a69) x49.d.get();
                            String t = t99.t();
                            a69.getClass();
                            t.getClass();
                            f0 b = a69.b(a69.a.c(t));
                            n89 n89 = new n89(0, w89);
                            jm4 a = x49.a();
                            int i = h0.H;
                            h0 h0Var = new h0(b, Throwable.class, n89);
                            b.a(h0Var, ag8.E(a, h0Var));
                            return;
                        }
                        return;
                    }
                    synchronized (w89) {
                        if (!z) {
                            ge2 = w89.a;
                            if (ge2 != null) {
                                if (!((n36) ge2.d).equals((n36) ge22.d)) {
                                }
                            }
                        }
                        w89.a = ge22;
                        ((AtomicInteger) w89.g.x).incrementAndGet();
                    }
                    if (!w89.e) {
                    }
                } catch (ExecutionException e2) {
                    e = e2;
                    break;
                } catch (CancellationException e3) {
                    e = e3;
                    break;
                }
        }
        if (!(e.getCause() instanceof SecurityException)) {
            String str2 = w89.c;
            Log.w("FlagStore", f21.m(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
        }
    }
}
