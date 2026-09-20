package defpackage;

import com.google.firebase.perf.metrics.AppStartTrace;
import java.util.ArrayList;

/* renamed from: tq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tq implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ AppStartTrace x;

    public /* synthetic */ tq(AppStartTrace appStartTrace, int i) {
        this.w = i;
        this.x = appStartTrace;
    }

    public final void run() {
        String str;
        int i = this.w;
        AppStartTrace appStartTrace = this.x;
        switch (i) {
            case b85.b:
                vk7 vk7 = appStartTrace.z;
                if (appStartTrace.M == null) {
                    appStartTrace.M = new ui7();
                    vk7 L = yk7.L();
                    L.m("_experiment_onDrawFoQ");
                    L.k(appStartTrace.c().w);
                    L.l(appStartTrace.c().c(appStartTrace.M));
                    vk7.i((yk7) L.g());
                    if (appStartTrace.C != null) {
                        vk7 L2 = yk7.L();
                        L2.m("_experiment_procStart_to_classLoad");
                        L2.k(appStartTrace.c().w);
                        L2.l(appStartTrace.c().c(appStartTrace.b()));
                        vk7.i((yk7) L2.g());
                    }
                    if (appStartTrace.R) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    vk7.h();
                    yk7.w((yk7) vk7.x).put("systemDeterminedForeground", str);
                    vk7.j((long) appStartTrace.P, "onDrawCount");
                    rf5 a = appStartTrace.N.a();
                    vk7.h();
                    yk7.x((yk7) vk7.x, a);
                    appStartTrace.e(vk7);
                    return;
                }
                return;
            case 1:
                vk7 vk72 = appStartTrace.z;
                if (appStartTrace.K == null) {
                    appStartTrace.K = new ui7();
                    vk72.k(appStartTrace.c().w);
                    vk72.l(appStartTrace.c().c(appStartTrace.K));
                    appStartTrace.e(vk72);
                    return;
                }
                return;
            case 2:
                vk7 vk73 = appStartTrace.z;
                if (appStartTrace.L == null) {
                    appStartTrace.L = new ui7();
                    vk7 L3 = yk7.L();
                    L3.m("_experiment_preDrawFoQ");
                    L3.k(appStartTrace.c().w);
                    L3.l(appStartTrace.c().c(appStartTrace.L));
                    vk73.i((yk7) L3.g());
                    appStartTrace.e(vk73);
                    return;
                }
                return;
            default:
                ui7 ui7 = AppStartTrace.S;
                vk7 L4 = yk7.L();
                L4.m("_as");
                L4.k(appStartTrace.b().w);
                L4.l(appStartTrace.b().c(appStartTrace.H));
                ArrayList arrayList = new ArrayList(3);
                vk7 L5 = yk7.L();
                L5.m("_astui");
                L5.k(appStartTrace.b().w);
                L5.l(appStartTrace.b().c(appStartTrace.E));
                arrayList.add((yk7) L5.g());
                if (appStartTrace.G != null) {
                    vk7 L6 = yk7.L();
                    L6.m("_astfd");
                    L6.k(appStartTrace.E.w);
                    L6.l(appStartTrace.E.c(appStartTrace.G));
                    arrayList.add((yk7) L6.g());
                    vk7 L7 = yk7.L();
                    L7.m("_asti");
                    L7.k(appStartTrace.G.w);
                    L7.l(appStartTrace.G.c(appStartTrace.H));
                    arrayList.add((yk7) L7.g());
                }
                L4.h();
                yk7.v((yk7) L4.x, arrayList);
                rf5 a2 = appStartTrace.N.a();
                L4.h();
                yk7.x((yk7) L4.x, a2);
                appStartTrace.x.c((yk7) L4.g(), jr.A);
                return;
        }
    }
}
