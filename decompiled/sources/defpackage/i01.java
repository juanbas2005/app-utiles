package defpackage;

/* renamed from: i01  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i01 extends we {
    public static i01 G;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, i01] */
    public static synchronized i01 O() {
        i01 i01;
        synchronized (i01.class) {
            try {
                if (G == null) {
                    G = new Object();
                }
                i01 = G;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return i01;
    }

    public final String r() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    public final String s() {
        return "experiment_app_start_ttid";
    }
}
