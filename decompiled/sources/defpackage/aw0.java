package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class aw0 implements nu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ aw0(int i) {
        this.a = i;
    }

    public final Object get() {
        switch (this.a) {
            case b85.b /*0*/:
                return Collections.EMPTY_SET;
            case 1:
                oz3 oz3 = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new dp1(Executors.newFixedThreadPool(4, new zc1("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                oz3 oz32 = ExecutorsRegistrar.a;
                return new dp1(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new zc1("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                oz3 oz33 = ExecutorsRegistrar.a;
                return new dp1(Executors.newCachedThreadPool(new zc1("Firebase Blocking", 11, (StrictMode.ThreadPolicy) null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                oz3 oz34 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new zc1("Firebase Scheduler", 0, (StrictMode.ThreadPolicy) null));
            case 5:
                return Executors.newSingleThreadScheduledExecutor();
            case 6:
                return GaugeManager.lambda$new$0();
            case 7:
                return GaugeManager.lambda$new$1();
            case 8:
                break;
            default:
                Random random = b46.j;
                break;
        }
        return null;
    }
}
