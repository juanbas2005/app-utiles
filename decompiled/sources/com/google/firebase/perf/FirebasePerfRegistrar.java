package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v0, types: [ef2, java.lang.Object] */
    /* access modifiers changed from: private */
    public static ef2 lambda$getComponents$0(av5 av5, tv0 tv0) {
        AppStartTrace appStartTrace;
        boolean z;
        oe2 oe2 = (oe2) tv0.a(oe2.class);
        o10 o10 = (o10) tv0.h(o10.class).get();
        Executor executor = (Executor) tv0.s(av5);
        ? obj = new Object();
        oe2.a();
        Context context = oe2.a;
        b01 e = b01.e();
        e.getClass();
        b01.d.b = jb5.u(context);
        e.c.c(context);
        wq a = wq.a();
        synchronized (a) {
            try {
                if (!a.L) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof Application) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(a);
                        a.L = true;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Object obj2 = new Object();
        synchronized (a.C) {
            try {
                a.C.add(obj2);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (o10 != null) {
            if (AppStartTrace.V != null) {
                appStartTrace = AppStartTrace.V;
            } else {
                hn7 hn7 = hn7.O;
                g22 g22 = new g22(23);
                if (AppStartTrace.V == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.V == null) {
                                AppStartTrace.V = new AppStartTrace(hn7, g22, b01.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.T, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                appStartTrace = AppStartTrace.V;
            }
            synchronized (appStartTrace) {
                try {
                    if (!appStartTrace.w) {
                        gp5.E.B.x0(appStartTrace);
                        Context applicationContext2 = context.getApplicationContext();
                        if (applicationContext2 instanceof Application) {
                            ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                            if (!appStartTrace.R) {
                                if (!AppStartTrace.d((Application) applicationContext2)) {
                                    z = false;
                                    appStartTrace.R = z;
                                    appStartTrace.w = true;
                                    appStartTrace.A = (Application) applicationContext2;
                                }
                            }
                            z = true;
                            appStartTrace.R = z;
                            appStartTrace.w = true;
                            appStartTrace.A = (Application) applicationContext2;
                        }
                    }
                } catch (Throwable th4) {
                    while (true) {
                        throw th4;
                    }
                }
            }
            executor.execute(new ge(1, (Object) appStartTrace));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return obj;
    }

    /* access modifiers changed from: private */
    public static if2 providesFirebasePerformance(tv0 tv0) {
        tv0.a(ef2.class);
        am6 am6 = new am6((oe2) tv0.a(oe2.class), (we2) tv0.a(we2.class), tv0.h(b46.class), tv0.h(cn7.class), 13);
        return (if2) ((cx1) cx1.a(new lf2(new kf2(am6, 0), new kf2(am6, 2), new kf2(am6, 1), new kf2(am6, 3), new qd1(am6, 2), new qd1(am6, 1), new qd1(am6, 3)))).get();
    }

    public List<gv0> getComponents() {
        av5 av5 = new av5(js7.class, Executor.class);
        fv0 b = gv0.b(if2.class);
        b.a = LIBRARY_NAME;
        Class<oe2> cls = oe2.class;
        b.a(zp1.c(cls));
        b.a(new zp1(1, 1, b46.class));
        b.a(zp1.c(we2.class));
        b.a(new zp1(1, 1, cn7.class));
        Class<ef2> cls2 = ef2.class;
        b.a(zp1.c(cls2));
        b.g = new ta1(28);
        gv0 b2 = b.b();
        fv0 b3 = gv0.b(cls2);
        b3.a = EARLY_LIBRARY_NAME;
        b3.a(zp1.c(cls));
        b3.a(zp1.a(o10.class));
        b3.a(new zp1(av5, 1, 0));
        b3.c(2);
        b3.g = new ul1(av5, 2);
        return Arrays.asList(new gv0[]{b2, b3.b(), gw8.q(LIBRARY_NAME, "22.0.5")});
    }
}
