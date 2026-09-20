package com.google.firebase.perf.session.gauges;

import android.content.Context;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final rg logger = rg.d();
    private jr applicationProcessState;
    private final b01 configResolver;
    private final oz3 cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final oz3 gaugeManagerExecutor;
    private iu2 gaugeMetadataManager;
    private final oz3 memoryGaugeCollector;
    private String sessionId;
    private final hn7 transportManager;

    private GaugeManager() {
        this(new oz3(new aw0(5)), hn7.O, b01.e(), (iu2) null, new oz3(new aw0(6)), new oz3(new aw0(7)));
    }

    private static void collectGaugeMetricOnce(c91 c91, pi4 pi4, ui7 ui7) {
        synchronized (c91) {
            try {
                c91.b.schedule(new b91(c91, ui7, 1), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                rg rgVar = c91.g;
                rgVar.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        synchronized (pi4) {
            try {
                pi4.a.schedule(new oi4(pi4, ui7, 1), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                rg rgVar2 = pi4.f;
                rgVar2.f("Unable to collect Memory Metric: " + e2.getMessage());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [t01, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [s01, java.lang.Object] */
    private long getCpuGaugeCollectionFrequencyMs(jr jrVar) {
        long j;
        t01 t01;
        s01 s01;
        int ordinal = jrVar.ordinal();
        if (ordinal == 1) {
            b01 b01 = this.configResolver;
            b01.getClass();
            synchronized (t01.class) {
                try {
                    if (t01.G == null) {
                        t01.G = new Object();
                    }
                    t01 = t01.G;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            n75 i = b01.i(t01);
            if (!i.b() || !b01.m(((Long) i.a()).longValue())) {
                n75 n75 = b01.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (!n75.b() || !b01.m(((Long) n75.a()).longValue())) {
                    n75 c = b01.c(t01);
                    if (c.b() && b01.m(((Long) c.a()).longValue())) {
                        j = ((Long) c.a()).longValue();
                    } else if (b01.a.isLastFetchFailed()) {
                        j = 300;
                    } else {
                        j = 100;
                    }
                } else {
                    b01.c.d(((Long) n75.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    j = ((Long) n75.a()).longValue();
                }
            } else {
                j = ((Long) i.a()).longValue();
            }
        } else if (ordinal != 2) {
            j = -1;
        } else {
            b01 b012 = this.configResolver;
            b012.getClass();
            synchronized (s01.class) {
                try {
                    if (s01.G == null) {
                        s01.G = new Object();
                    }
                    s01 = s01.G;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            n75 i2 = b012.i(s01);
            if (!i2.b() || !b01.m(((Long) i2.a()).longValue())) {
                n75 n752 = b012.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (!n752.b() || !b01.m(((Long) n752.a()).longValue())) {
                    n75 c2 = b012.c(s01);
                    if (!c2.b() || !b01.m(((Long) c2.a()).longValue())) {
                        j = 0;
                    } else {
                        j = ((Long) c2.a()).longValue();
                    }
                } else {
                    b012.c.d(((Long) n752.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    j = ((Long) n752.a()).longValue();
                }
            } else {
                j = ((Long) i2.a()).longValue();
            }
        }
        rg rgVar = c91.g;
        if (j <= 0) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j;
    }

    private hu2 getGaugeMetadata() {
        gu2 x = hu2.x();
        int G = jb5.G((hl6.d(5) * this.gaugeMetadataManager.c.totalMem) / 1024);
        x.h();
        hu2.u((hu2) x.x, G);
        int G2 = jb5.G((hl6.d(5) * this.gaugeMetadataManager.a.maxMemory()) / 1024);
        x.h();
        hu2.s((hu2) x.x, G2);
        int G3 = jb5.G((hl6.d(3) * ((long) this.gaugeMetadataManager.b.getMemoryClass())) / 1024);
        x.h();
        hu2.t((hu2) x.x, G3);
        return (hu2) x.g();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [w01, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [v01, java.lang.Object] */
    private long getMemoryGaugeCollectionFrequencyMs(jr jrVar) {
        long j;
        w01 w01;
        v01 v01;
        int ordinal = jrVar.ordinal();
        if (ordinal == 1) {
            b01 b01 = this.configResolver;
            b01.getClass();
            synchronized (w01.class) {
                try {
                    if (w01.G == null) {
                        w01.G = new Object();
                    }
                    w01 = w01.G;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            n75 i = b01.i(w01);
            if (!i.b() || !b01.m(((Long) i.a()).longValue())) {
                n75 n75 = b01.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (!n75.b() || !b01.m(((Long) n75.a()).longValue())) {
                    n75 c = b01.c(w01);
                    if (c.b() && b01.m(((Long) c.a()).longValue())) {
                        j = ((Long) c.a()).longValue();
                    } else if (b01.a.isLastFetchFailed()) {
                        j = 300;
                    } else {
                        j = 100;
                    }
                } else {
                    b01.c.d(((Long) n75.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    j = ((Long) n75.a()).longValue();
                }
            } else {
                j = ((Long) i.a()).longValue();
            }
        } else if (ordinal != 2) {
            j = -1;
        } else {
            b01 b012 = this.configResolver;
            b012.getClass();
            synchronized (v01.class) {
                try {
                    if (v01.G == null) {
                        v01.G = new Object();
                    }
                    v01 = v01.G;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            n75 i2 = b012.i(v01);
            if (!i2.b() || !b01.m(((Long) i2.a()).longValue())) {
                n75 n752 = b012.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (!n752.b() || !b01.m(((Long) n752.a()).longValue())) {
                    n75 c2 = b012.c(v01);
                    if (!c2.b() || !b01.m(((Long) c2.a()).longValue())) {
                        j = 0;
                    } else {
                        j = ((Long) c2.a()).longValue();
                    }
                } else {
                    b012.c.d(((Long) n752.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    j = ((Long) n752.a()).longValue();
                }
            } else {
                j = ((Long) i2.a()).longValue();
            }
        }
        rg rgVar = pi4.f;
        if (j <= 0) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c91 lambda$new$0() {
        return new c91();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pi4 lambda$new$1() {
        return new pi4();
    }

    private boolean startCollectingCpuMetrics(long j, ui7 ui7) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        c91 c91 = (c91) this.cpuGaugeCollector.get();
        long j2 = c91.d;
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = c91.e;
        if (scheduledFuture == null) {
            c91.a(j, ui7);
            return true;
        } else if (c91.f == j) {
            return true;
        } else {
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                c91.e = null;
                c91.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
            }
            c91.a(j, ui7);
            return true;
        }
    }

    private boolean startCollectingMemoryMetrics(long j, ui7 ui7) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        pi4 pi4 = (pi4) this.memoryGaugeCollector.get();
        rg rgVar = pi4.f;
        if (j <= 0) {
            pi4.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = pi4.d;
        if (scheduledFuture == null) {
            pi4.a(j, ui7);
            return true;
        } else if (pi4.e == j) {
            return true;
        } else {
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                pi4.d = null;
                pi4.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
            }
            pi4.a(j, ui7);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, jr jrVar) {
        ju2 C = ku2.C();
        while (!((c91) this.cpuGaugeCollector.get()).a.isEmpty()) {
            C.h();
            ku2.v((ku2) C.x, (e91) ((c91) this.cpuGaugeCollector.get()).a.poll());
        }
        while (!((pi4) this.memoryGaugeCollector.get()).b.isEmpty()) {
            C.h();
            ku2.t((ku2) C.x, (tg) ((pi4) this.memoryGaugeCollector.get()).b.poll());
        }
        C.h();
        ku2.s((ku2) C.x, str);
        hn7 hn7 = this.transportManager;
        hn7.E.execute(new ti(hn7, (ku2) C.g(), jrVar, 10));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new iu2(context);
    }

    public boolean logGaugeMetadata(String str, jr jrVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        ju2 C = ku2.C();
        C.h();
        ku2.s((ku2) C.x, str);
        hu2 gaugeMetadata = getGaugeMetadata();
        C.h();
        ku2.u((ku2) C.x, gaugeMetadata);
        hn7 hn7 = this.transportManager;
        hn7.E.execute(new ti(hn7, (ku2) C.g(), jrVar, 10));
        return true;
    }

    public void startCollectingGauges(sf5 sf5, jr jrVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(jrVar, sf5.x);
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = sf5.w;
        this.sessionId = str;
        this.applicationProcessState = jrVar;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new fu2(this, str, jrVar, 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            rg rgVar = logger;
            rgVar.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            jr jrVar = this.applicationProcessState;
            c91 c91 = (c91) this.cpuGaugeCollector.get();
            ScheduledFuture scheduledFuture = c91.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                c91.e = null;
                c91.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
            }
            pi4 pi4 = (pi4) this.memoryGaugeCollector.get();
            ScheduledFuture scheduledFuture2 = pi4.d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                pi4.d = null;
                pi4.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
            }
            ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture3 != null) {
                scheduledFuture3.cancel(false);
            }
            ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new fu2(this, str, jrVar, 0), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = jr.x;
        }
    }

    public GaugeManager(oz3 oz3, hn7 hn7, b01 b01, iu2 iu2, oz3 oz32, oz3 oz33) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = jr.x;
        this.gaugeManagerExecutor = oz3;
        this.transportManager = hn7;
        this.configResolver = b01;
        this.gaugeMetadataManager = iu2;
        this.cpuGaugeCollector = oz32;
        this.memoryGaugeCollector = oz33;
    }

    private long startCollectingGauges(jr jrVar, ui7 ui7) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(jrVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, ui7)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(jrVar);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, ui7)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }

    public void collectGaugeMetricOnce(ui7 ui7) {
        collectGaugeMetricOnce((c91) this.cpuGaugeCollector.get(), (pi4) this.memoryGaugeCollector.get(), ui7);
    }
}
