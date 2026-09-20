package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, s54 {
    public static final ui7 S = new ui7();
    public static final long T = 60000000;
    public static final long U = 50000;
    public static volatile AppStartTrace V;
    public static ThreadPoolExecutor W;
    public Application A;
    public boolean B = false;
    public final ui7 C;
    public final ui7 D;
    public ui7 E;
    public ui7 F;
    public ui7 G;
    public ui7 H;
    public ui7 I;
    public ui7 J;
    public ui7 K;
    public ui7 L;
    public ui7 M;
    public sf5 N;
    public boolean O;
    public int P;
    public final uq Q;
    public boolean R;
    public boolean w = false;
    public final hn7 x;
    public final b01 y;
    public final vk7 z;

    public AppStartTrace(hn7 hn7, g22 g22, b01 b01, ThreadPoolExecutor threadPoolExecutor) {
        ui7 ui7 = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = false;
        this.P = 0;
        this.Q = new uq(this);
        this.R = false;
        this.x = hn7;
        this.y = b01;
        W = threadPoolExecutor;
        vk7 L2 = yk7.L();
        L2.m("_experiment_app_start_ttid");
        this.z = L2;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.C = new ui7((micros - ui7.a()) + ui7.e(), micros);
        o10 o10 = (o10) oe2.c().b(o10.class);
        if (o10 != null) {
            long micros2 = timeUnit.toMicros(o10.b);
            ui7 = new ui7((micros2 - ui7.a()) + ui7.e(), micros2);
        }
        this.D = ui7;
    }

    public static boolean d(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String n = b81.n(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(n))) {
                return true;
            }
        }
        return false;
    }

    public final ui7 b() {
        ui7 ui7 = this.D;
        if (ui7 != null) {
            return ui7;
        }
        return S;
    }

    public final ui7 c() {
        ui7 ui7 = this.C;
        if (ui7 != null) {
            return ui7;
        }
        return b();
    }

    public final void e(vk7 vk7) {
        if (this.K != null && this.L != null && this.M != null) {
            W.execute(new ga(4, (Object) this, (Object) vk7));
            f();
        }
    }

    public final synchronized void f() {
        if (this.w) {
            gp5.E.B.M0(this);
            this.A.unregisterActivityLifecycleCallbacks(this);
            this.w = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055 A[Catch:{ all -> 0x0034 }] */
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z2;
        try {
            ui7 ui7 = this.F;
            if (ui7 != null) {
                if (Build.VERSION.SDK_INT < 34 || ui7.b() > U) {
                    this.O = true;
                }
                this.F = null;
            }
            if (!this.O) {
                if (this.E == null) {
                    if (!this.R) {
                        if (!d(this.A)) {
                            z2 = false;
                            this.R = z2;
                            new WeakReference(activity);
                            this.E = new ui7();
                            if (c().c(this.E) > T) {
                                this.B = true;
                            }
                        }
                    }
                    z2 = true;
                    this.R = z2;
                    new WeakReference(activity);
                    this.E = new ui7();
                    if (c().c(this.E) > T) {
                    }
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        boolean z2;
        View findViewById;
        if (!this.O && !this.B) {
            b01 b01 = this.y;
            b01.getClass();
            n75 g = b01.g(i01.O());
            if (g.b()) {
                z2 = ((Boolean) g.a()).booleanValue();
            } else {
                z2 = false;
            }
            if (z2 && (findViewById = activity.findViewById(16908290)) != null) {
                findViewById.getViewTreeObserver().removeOnDrawListener(this.Q);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        return;
     */
    public final synchronized void onActivityResumed(Activity activity) {
        boolean z2;
        View findViewById;
        try {
            if (!this.O) {
                if (!this.B) {
                    b01 b01 = this.y;
                    b01.getClass();
                    n75 g = b01.g(i01.O());
                    if (g.b()) {
                        z2 = ((Boolean) g.a()).booleanValue();
                    } else {
                        z2 = false;
                    }
                    if (z2 && (findViewById = activity.findViewById(16908290)) != null) {
                        findViewById.getViewTreeObserver().addOnDrawListener(this.Q);
                        dg2 dg2 = new dg2(findViewById, new tq(this, 0));
                        if (Build.VERSION.SDK_INT < 26) {
                            if (!findViewById.getViewTreeObserver().isAlive() || !findViewById.isAttachedToWindow()) {
                                findViewById.addOnAttachStateChangeListener(new fg(3, dg2));
                                findViewById.getViewTreeObserver().addOnPreDrawListener(new lm5(findViewById, new tq(this, 1), new tq(this, 2)));
                            }
                        }
                        findViewById.getViewTreeObserver().addOnDrawListener(dg2);
                        findViewById.getViewTreeObserver().addOnPreDrawListener(new lm5(findViewById, new tq(this, 1), new tq(this, 2)));
                    }
                    if (this.H == null) {
                        new WeakReference(activity);
                        this.H = new ui7();
                        this.N = SessionManager.getInstance().perfSession();
                        rg.d().a("onResume(): " + activity.getClass().getName() + ": " + b().c(this.H) + " microseconds");
                        W.execute(new tq(this, 3));
                        if (!z2) {
                            f();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        return;
     */
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.O && this.G == null) {
            if (!this.B) {
                this.G = new ui7();
            }
        }
    }

    @g55(j54.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.O && !this.B && this.J == null) {
            this.J = new ui7();
            vk7 L2 = yk7.L();
            L2.m("_experiment_firstBackgrounding");
            L2.k(c().w);
            L2.l(c().c(this.J));
            this.z.i((yk7) L2.g());
        }
    }

    @g55(j54.ON_START)
    public void onAppEnteredForeground() {
        if (!this.O && !this.B && this.I == null) {
            this.I = new ui7();
            vk7 L2 = yk7.L();
            L2.m("_experiment_firstForegrounding");
            L2.k(c().w);
            L2.l(c().c(this.I));
            this.z.i((yk7) L2.g());
        }
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
