package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wq implements Application.ActivityLifecycleCallbacks {
    public static final rg N = rg.d();
    public static volatile wq O;
    public final HashMap A = new HashMap();
    public final HashSet B = new HashSet();
    public final HashSet C = new HashSet();
    public final AtomicInteger D = new AtomicInteger(0);
    public final hn7 E;
    public final b01 F;
    public final g22 G;
    public final boolean H;
    public ui7 I;
    public ui7 J;
    public jr K = jr.z;
    public boolean L = false;
    public boolean M = true;
    public final WeakHashMap w = new WeakHashMap();
    public final WeakHashMap x = new WeakHashMap();
    public final WeakHashMap y = new WeakHashMap();
    public final WeakHashMap z = new WeakHashMap();

    public wq(hn7 hn7, g22 g22) {
        b01 e = b01.e();
        rg rgVar = fr2.e;
        this.E = hn7;
        this.G = g22;
        this.F = e;
        this.H = true;
    }

    public static wq a() {
        if (O == null) {
            synchronized (wq.class) {
                try {
                    if (O == null) {
                        O = new wq(hn7.O, new g22(23));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O;
    }

    public final void b(String str) {
        synchronized (this.A) {
            try {
                Long l = (Long) this.A.get(str);
                HashMap hashMap = this.A;
                if (l == null) {
                    hashMap.put(str, 1L);
                } else {
                    hashMap.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.C) {
            try {
                Iterator it = this.C.iterator();
                while (it.hasNext()) {
                    if (((jf2) it.next()) != null) {
                        rg rgVar = if2.b;
                        if2 if2 = (if2) oe2.c().b(if2.class);
                    }
                }
            } catch (IllegalStateException e) {
                jf2.a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Activity activity) {
        n75 n75;
        WeakHashMap weakHashMap = this.z;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace != null) {
            weakHashMap.remove(activity);
            fr2 fr2 = (fr2) this.x.get(activity);
            wv2 wv2 = fr2.b;
            HashMap hashMap = fr2.c;
            rg rgVar = fr2.e;
            if (!fr2.d) {
                rgVar.a("Cannot stop because no recording was started");
                n75 = new n75();
            } else {
                if (!hashMap.isEmpty()) {
                    rgVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                    hashMap.clear();
                }
                n75 a = fr2.a();
                try {
                    wv2.r(fr2.a);
                } catch (IllegalArgumentException | NullPointerException e) {
                    if (!(e instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                        rgVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                        a = new n75();
                    } else {
                        throw e;
                    }
                }
                kb9 kb9 = (kb9) wv2.x;
                Object obj = kb9.y;
                kb9.y = new SparseIntArray[9];
                fr2.d = false;
                n75 = a;
            }
            if (!n75.b()) {
                N.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            ug6.a(trace, (er2) n75.a());
            trace.stop();
        }
    }

    public final void e(String str, ui7 ui7, ui7 ui72) {
        if (this.F.n()) {
            vk7 L2 = yk7.L();
            L2.m(str);
            L2.k(ui7.w);
            L2.l(ui7.c(ui72));
            rf5 a = SessionManager.getInstance().perfSession().a();
            L2.h();
            yk7.x((yk7) L2.x, a);
            int andSet = this.D.getAndSet(0);
            synchronized (this.A) {
                try {
                    HashMap hashMap = this.A;
                    L2.h();
                    yk7.t((yk7) L2.x).putAll(hashMap);
                    if (andSet != 0) {
                        L2.j((long) andSet, "_tsns");
                    }
                    this.A.clear();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.E.c((yk7) L2.g(), jr.A);
        }
    }

    public final void f(Activity activity) {
        if (this.H && this.F.n()) {
            fr2 fr2 = new fr2(activity);
            this.x.put(activity, fr2);
            if (activity instanceof eq2) {
                xq2 xq2 = new xq2(this.G, this.E, this, fr2);
                this.y.put(activity, xq2);
                jz0 jz0 = ((eq2) activity).p().o;
                jz0.getClass();
                ((CopyOnWriteArrayList) jz0.y).add(new iq2(xq2));
            }
        }
    }

    public final void g(jr jrVar) {
        this.K = jrVar;
        synchronized (this.B) {
            try {
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    vq vqVar = (vq) ((WeakReference) it.next()).get();
                    if (vqVar != null) {
                        vqVar.onUpdateAppState(this.K);
                    } else {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.x.remove(activity);
        if (this.y.containsKey(activity)) {
            rq2 p = ((eq2) activity).p();
            xq2 xq2 = (xq2) this.y.remove(activity);
            jz0 jz0 = p.o;
            jz0.getClass();
            xq2.getClass();
            synchronized (((CopyOnWriteArrayList) jz0.y)) {
                int size = ((CopyOnWriteArrayList) jz0.y).size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((iq2) ((CopyOnWriteArrayList) jz0.y).get(i)).a == xq2) {
                        ((CopyOnWriteArrayList) jz0.y).remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.w.isEmpty()) {
                this.G.getClass();
                this.I = new ui7();
                this.w.put(activity, Boolean.TRUE);
                if (this.M) {
                    g(jr.y);
                    c();
                    this.M = false;
                } else {
                    e("_bs", this.J, this.I);
                    g(jr.y);
                }
            } else {
                this.w.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.H && this.F.n()) {
                if (!this.x.containsKey(activity)) {
                    f(activity);
                }
                ((fr2) this.x.get(activity)).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.E, this.G, this);
                trace.start();
                this.z.put(activity, trace);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.H) {
                d(activity);
            }
            if (this.w.containsKey(activity)) {
                this.w.remove(activity);
                if (this.w.isEmpty()) {
                    this.G.getClass();
                    ui7 ui7 = new ui7();
                    this.J = ui7;
                    e("_fs", this.I, ui7);
                    g(jr.z);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
