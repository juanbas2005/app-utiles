package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* renamed from: ug6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ug6 {
    public static final rg a = rg.d();

    public static void a(Trace trace, er2 er2) {
        int i = er2.a;
        int i2 = er2.c;
        int i3 = er2.b;
        if (i > 0) {
            trace.putMetric("_fr_tot", (long) i);
        }
        if (i3 > 0) {
            trace.putMetric("_fr_slo", (long) i3);
        }
        if (i2 > 0) {
            trace.putMetric("_fr_fzn", (long) i2);
        }
        a.a("Screen trace: " + trace.z + " _fr_tot:" + er2.a + " _fr_slo:" + i3 + " _fr_fzn:" + i2);
    }
}
