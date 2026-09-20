package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.concurrent.TimeUnit;

/* renamed from: aw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aw5 {
    public static final long i = 1000000;
    public ui7 a;
    public zv5 b;
    public long c = 500;
    public double d;
    public final zv5 e;
    public final zv5 f;
    public final long g;
    public final long h;

    static {
        rg.d();
    }

    /* JADX WARNING: type inference failed for: r13v8, types: [java.lang.Object, n01] */
    /* JADX WARNING: type inference failed for: r12v34, types: [java.lang.Object, m01] */
    /* JADX WARNING: type inference failed for: r13v25, types: [java.lang.Object, y01] */
    /* JADX WARNING: type inference failed for: r13v33, types: [java.lang.Object, z01] */
    public aw5(zv5 zv5, g22 g22, b01 b01, String str) {
        long j;
        n01 n01;
        long j2;
        long j3;
        m01 m01;
        long j4;
        y01 y01;
        z01 z01;
        this.b = zv5;
        this.d = 500.0d;
        this.a = new ui7();
        if (str == "Trace") {
            j = b01.j();
        } else {
            j = b01.j();
        }
        long j5 = j;
        if (str == "Trace") {
            synchronized (z01.class) {
                try {
                    if (z01.G == null) {
                        z01.G = new Object();
                    }
                    z01 = z01.G;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            RemoteConfigManager remoteConfigManager = b01.a;
            z01.getClass();
            n75 n75 = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (!n75.b() || !b01.k(((Long) n75.a()).longValue())) {
                n75 c2 = b01.c(z01);
                if (!c2.b() || !b01.k(((Long) c2.a()).longValue())) {
                    j2 = 300;
                } else {
                    j2 = ((Long) c2.a()).longValue();
                }
            } else {
                b01.c.d(((Long) n75.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                j2 = ((Long) n75.a()).longValue();
            }
        } else {
            synchronized (n01.class) {
                try {
                    if (n01.G == null) {
                        n01.G = new Object();
                    }
                    n01 = n01.G;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            RemoteConfigManager remoteConfigManager2 = b01.a;
            n01.getClass();
            n75 n752 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
            if (!n752.b() || !b01.k(((Long) n752.a()).longValue())) {
                n75 c3 = b01.c(n01);
                if (!c3.b() || !b01.k(((Long) c3.a()).longValue())) {
                    j2 = 700;
                } else {
                    j2 = ((Long) c3.a()).longValue();
                }
            } else {
                b01.c.d(((Long) n752.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                j2 = ((Long) n752.a()).longValue();
            }
        }
        long j6 = j2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = new zv5(j6, j5, timeUnit);
        this.g = j6;
        if (str == "Trace") {
            j3 = b01.j();
        } else {
            j3 = b01.j();
        }
        long j7 = j3;
        if (str == "Trace") {
            synchronized (y01.class) {
                try {
                    if (y01.G == null) {
                        y01.G = new Object();
                    }
                    y01 = y01.G;
                } catch (Throwable th3) {
                    while (true) {
                        throw th3;
                    }
                }
            }
            RemoteConfigManager remoteConfigManager3 = b01.a;
            y01.getClass();
            n75 n753 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
            if (!n753.b() || !b01.k(((Long) n753.a()).longValue())) {
                n75 c4 = b01.c(y01);
                if (!c4.b() || !b01.k(((Long) c4.a()).longValue())) {
                    j4 = 30;
                } else {
                    j4 = ((Long) c4.a()).longValue();
                }
            } else {
                b01.c.d(((Long) n753.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                j4 = ((Long) n753.a()).longValue();
            }
        } else {
            synchronized (m01.class) {
                try {
                    if (m01.G == null) {
                        m01.G = new Object();
                    }
                    m01 = m01.G;
                } catch (Throwable th4) {
                    while (true) {
                        throw th4;
                    }
                }
            }
            RemoteConfigManager remoteConfigManager4 = b01.a;
            m01.getClass();
            n75 n754 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
            if (!n754.b() || !b01.k(((Long) n754.a()).longValue())) {
                n75 c5 = b01.c(m01);
                if (!c5.b() || !b01.k(((Long) c5.a()).longValue())) {
                    j4 = 70;
                } else {
                    j4 = ((Long) c5.a()).longValue();
                }
            } else {
                b01.c.d(((Long) n754.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                j4 = ((Long) n754.a()).longValue();
            }
        }
        long j8 = j4;
        this.f = new zv5(j8, j7, timeUnit);
        this.h = j8;
    }

    public final synchronized void a(boolean z) {
        zv5 zv5;
        long j;
        if (z) {
            try {
                zv5 = this.e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        } else {
            zv5 = this.f;
        }
        this.b = zv5;
        if (z) {
            j = this.g;
        } else {
            j = this.h;
        }
        this.c = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078 A[DONT_GENERATE] */
    public final synchronized boolean b() {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        try {
            ui7 ui7 = new ui7();
            ui7 ui72 = this.a;
            ui72.getClass();
            double d7 = (double) (ui7.x - ui72.x);
            zv5 zv5 = this.b;
            long j = zv5.a;
            long j2 = zv5.b;
            int[] iArr = yv5.a;
            TimeUnit timeUnit = zv5.c;
            int i2 = iArr[timeUnit.ordinal()];
            if (i2 == 1) {
                d5 = ((double) j) / ((double) j2);
                d6 = 1.0E9d;
            } else if (i2 == 2) {
                d5 = ((double) j) / ((double) j2);
                d6 = 1000000.0d;
            } else if (i2 != 3) {
                d2 = ((double) j) / ((double) timeUnit.toSeconds(j2));
                d3 = (d7 * d2) / ((double) i);
                if (d3 > 0.0d) {
                    this.d = Math.min(this.d + d3, (double) this.c);
                    this.a = ui7;
                }
                d4 = this.d;
                if (d4 >= 1.0d) {
                    return false;
                }
                this.d = d4 - 1.0d;
                return true;
            } else {
                d5 = ((double) j) / ((double) j2);
                d6 = 1000.0d;
            }
            d2 = d5 * d6;
            d3 = (d7 * d2) / ((double) i);
            if (d3 > 0.0d) {
            }
            d4 = this.d;
            if (d4 >= 1.0d) {
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
