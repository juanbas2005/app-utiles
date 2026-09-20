package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;

/* renamed from: fu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fu2 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ GaugeManager x;
    public final /* synthetic */ String y;
    public final /* synthetic */ jr z;

    public /* synthetic */ fu2(GaugeManager gaugeManager, String str, jr jrVar, int i) {
        this.w = i;
        this.x = gaugeManager;
        this.y = str;
        this.z = jrVar;
    }

    public final void run() {
        int i = this.w;
        jr jrVar = this.z;
        String str = this.y;
        GaugeManager gaugeManager = this.x;
        switch (i) {
            case b85.b:
                gaugeManager.lambda$stopCollectingGauges$3(str, jrVar);
                return;
            default:
                gaugeManager.lambda$startCollectingGauges$2(str, jrVar);
                return;
        }
    }
}
