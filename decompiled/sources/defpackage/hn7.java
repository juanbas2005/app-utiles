package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.b;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: hn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hn7 implements vq {
    public static final rg N = rg.d();
    public static final hn7 O = new hn7();
    public if2 A;
    public we2 B;
    public nu5 C;
    public dh2 D;
    public final ThreadPoolExecutor E = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public Context F;
    public b01 G;
    public bw5 H;
    public wq I;
    public fr J;
    public String K;
    public String L;
    public boolean M = false;
    public final ConcurrentHashMap w;
    public final ConcurrentLinkedQueue x = new ConcurrentLinkedQueue();
    public final AtomicBoolean y = new AtomicBoolean(false);
    public oe2 z;

    public hn7() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.w = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(of5 of5) {
        long j;
        String str;
        if (of5.b()) {
            yk7 c = of5.c();
            long G2 = c.G();
            Locale locale = Locale.ENGLISH;
            return pb4.m("trace metric: ", c.H(), " (duration: ", new DecimalFormat("#.####").format(((double) G2) / 1000.0d), "ms)");
        } else if (of5.d()) {
            ry4 e = of5.e();
            if (e.W()) {
                j = e.N();
            } else {
                j = 0;
            }
            if (e.S()) {
                str = String.valueOf(e.I());
            } else {
                str = "UNKNOWN";
            }
            Locale locale2 = Locale.ENGLISH;
            String P = e.P();
            return f21.l(f21.o("network request trace: ", P, " (responseCode: ", str, ", responseTime: "), new DecimalFormat("#.####").format(((double) j) / 1000.0d), "ms)");
        } else if (!of5.a()) {
            return "log";
        } else {
            ku2 f = of5.f();
            Locale locale3 = Locale.ENGLISH;
            boolean A2 = f.A();
            int x2 = f.x();
            int w2 = f.w();
            StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
            sb.append(A2);
            sb.append(", cpuGaugeCount: ");
            sb.append(x2);
            sb.append(", memoryGaugeCount: ");
            return hl6.n(sb, w2, ")");
        }
    }

    public final void b(nf5 nf5) {
        if (nf5.b()) {
            this.I.b("_fstec");
        } else if (nf5.d()) {
            this.I.b("_fsntc");
        }
    }

    public final void c(yk7 yk7, jr jrVar) {
        this.E.execute(new ti(this, yk7, jrVar, 11));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v37, resolved type: qu2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: fr} */
    /* JADX WARNING: type inference failed for: r8v7, types: [o01, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, j01] */
    /* JADX WARNING: type inference failed for: r8v26, types: [a11, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0302, code lost:
        if (defpackage.bw5.a(r14.c().I()) != false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x035d, code lost:
        if (defpackage.b01.o(r9) != false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03d4, code lost:
        if (defpackage.bw5.a(r14.c().I()) == false) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0478, code lost:
        if (defpackage.bw5.a(r14.e().J()) != false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x047a, code lost:
        b(r14);
        N.e("Event dropped due to device sampling - %s", a(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b3  */
    public final void d(mf5 mf5, jr jrVar) {
        fr frVar;
        String str;
        boolean b;
        o01 o01;
        j01 j01;
        double d;
        a11 a11;
        double d2;
        boolean n;
        if2 if2;
        Map map;
        String str2;
        boolean z2 = true;
        if (!this.y.get()) {
            ConcurrentHashMap concurrentHashMap = this.w;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int intValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int intValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int intValue3 = num3.intValue();
            if (mf5.b() && intValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            } else if (mf5.d() && intValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            } else if (!mf5.a() || intValue3 <= 0) {
                N.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", a(mf5), num, num2, num3);
                return;
            } else {
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            }
            N.b("Transport is not initialized yet, %s will be queued for to be dispatched later", a(mf5));
            this.x.add(new kf5(mf5, jrVar));
            return;
        }
        rg rgVar = N;
        if (this.G.n() && (!((ir) this.J.x).A() || this.M)) {
            try {
                str2 = (String) b35.c(((ve2) this.B).c(), 60000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException e) {
                rgVar.c("Unable to retrieve Installation Id: %s", e.getMessage());
            } catch (InterruptedException e2) {
                rgVar.c("Task to retrieve Installation Id is interrupted: %s", e2.getMessage());
            } catch (TimeoutException e3) {
                rgVar.c("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
            }
            if (TextUtils.isEmpty(str2)) {
                fr frVar2 = this.J;
                frVar2.h();
                ir.v((ir) frVar2.x, str2);
            } else {
                rgVar.f("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            }
        }
        frVar = this.J;
        frVar.h();
        ir.t((ir) frVar.x, jrVar);
        if (mf5.b() || mf5.d()) {
            qu2 qu2 = (qu2) frVar.w.k(5);
            n = frVar.x.n();
            b bVar = frVar.x;
            if (n) {
                bVar.getClass();
                au5 au5 = au5.c;
                au5.getClass();
                au5.a(bVar.getClass()).b(bVar);
                bVar.o();
                bVar = frVar.x;
            }
            qu2.x = bVar;
            frVar = qu2;
            if (this.A == null && this.y.get()) {
                rg rgVar2 = if2.b;
                this.A = (if2) oe2.c().b(if2.class);
            }
            if2 = this.A;
            if (if2 == null) {
                map = new HashMap(if2.a);
            } else {
                map = Collections.EMPTY_MAP;
            }
            frVar.h();
            ir.u((ir) frVar.x).putAll(map);
        }
        mf5.h();
        nf5.s((nf5) mf5.x, (ir) frVar.g());
        nf5 nf5 = (nf5) mf5.g();
        if (this.G.n()) {
            N.e("Performance collection is not enabled, dropping %s", a(nf5));
            return;
        } else if (!nf5.w().A()) {
            N.g("App Instance ID is null or empty, dropping %s", a(nf5));
            return;
        } else {
            Context context = this.F;
            Pattern pattern = pf5.a;
            ArrayList arrayList = new ArrayList();
            if (nf5.b()) {
                arrayList.add(new hf2(nf5.c()));
            }
            if (nf5.d()) {
                arrayList.add(new gf2(nf5.e(), context));
            }
            if (nf5.x()) {
                arrayList.add(new df2(nf5.w()));
            }
            if (nf5.a()) {
                arrayList.add(new ff2(nf5.f()));
            }
            if (arrayList.isEmpty()) {
                rg.d().a("No validators found for PerfMetric.");
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((pf5) it.next()).a()) {
                    }
                }
                bw5 bw5 = this.H;
                bw5.getClass();
                double d3 = 1.0d;
                if (nf5.b()) {
                    b01 b01 = bw5.a;
                    b01.getClass();
                    synchronized (a11.class) {
                        try {
                            if (a11.G == null) {
                                a11.G = new Object();
                            }
                            a11 = a11.G;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    RemoteConfigManager remoteConfigManager = b01.a;
                    a11.getClass();
                    n75 n75 = remoteConfigManager.getDouble("fpr_vc_trace_sampling_rate");
                    if (!n75.b() || !b01.o(((Double) n75.a()).doubleValue())) {
                        n75 b2 = b01.b(a11);
                        if (b2.b() && b01.o(((Double) b2.a()).doubleValue())) {
                            d2 = ((Double) b2.a()).doubleValue();
                        } else if (b01.a.isLastFetchFailed()) {
                            d2 = 0.001d;
                        } else {
                            d2 = 1.0d;
                        }
                    } else {
                        b01.c.e("com.google.firebase.perf.TraceSamplingRate", ((Double) n75.a()).doubleValue());
                        d2 = ((Double) n75.a()).doubleValue();
                    }
                    if (bw5.b >= d2) {
                    }
                }
                if (nf5.b() && nf5.c().H().startsWith("_st_") && nf5.c().B()) {
                    b01 b012 = bw5.a;
                    b012.getClass();
                    synchronized (j01.class) {
                        try {
                            if (j01.G == null) {
                                j01.G = new Object();
                            }
                            j01 = j01.G;
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                    n75 h = b012.h(j01);
                    if (h.b()) {
                        d = ((Double) h.a()).doubleValue() / 100.0d;
                    }
                    n75 n752 = b012.a.getDouble("fpr_vc_fragment_sampling_rate");
                    if (!n752.b() || !b01.o(((Double) n752.a()).doubleValue())) {
                        n75 b3 = b012.b(j01);
                        if (!b3.b() || !b01.o(((Double) b3.a()).doubleValue())) {
                            d = 0.0d;
                        } else {
                            d = ((Double) b3.a()).doubleValue();
                        }
                        if (bw5.c >= d) {
                        }
                    } else {
                        b012.c.e("com.google.firebase.perf.FragmentSamplingRate", ((Double) n752.a()).doubleValue());
                        d = ((Double) n752.a()).doubleValue();
                        if (bw5.c >= d) {
                        }
                    }
                }
                if (nf5.d()) {
                    b01 b013 = bw5.a;
                    b013.getClass();
                    synchronized (o01.class) {
                        try {
                            if (o01.G == null) {
                                o01.G = new Object();
                            }
                            o01 = o01.G;
                        } catch (Throwable th3) {
                            while (true) {
                                throw th3;
                            }
                        }
                    }
                    RemoteConfigManager remoteConfigManager2 = b013.a;
                    o01.getClass();
                    n75 n753 = remoteConfigManager2.getDouble("fpr_vc_network_request_sampling_rate");
                    if (!n753.b() || !b01.o(((Double) n753.a()).doubleValue())) {
                        n75 b4 = b013.b(o01);
                        if (b4.b() && b01.o(((Double) b4.a()).doubleValue())) {
                            d3 = ((Double) b4.a()).doubleValue();
                        } else if (b013.a.isLastFetchFailed()) {
                            d3 = 0.001d;
                        }
                    } else {
                        b013.c.e("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) n753.a()).doubleValue());
                        d3 = ((Double) n753.a()).doubleValue();
                    }
                    if (bw5.b >= d3) {
                    }
                }
                bw5 bw52 = this.H;
                bw52.getClass();
                if ((!nf5.b() || ((!nf5.c().H().equals("_fs") && !nf5.c().H().equals("_bs")) || nf5.c().C() <= 0)) && !nf5.a()) {
                    if (nf5.d()) {
                        b = bw52.e.b();
                    } else if (nf5.b()) {
                        b = bw52.d.b();
                    }
                    z2 = true ^ b;
                } else {
                    z2 = false;
                }
                if (z2) {
                    b(nf5);
                    N.e("Rate limited (per device) - %s", a(nf5));
                    return;
                }
                rg rgVar3 = N;
                if (nf5.b()) {
                    String a = a(nf5);
                    String H2 = nf5.c().H();
                    boolean startsWith = H2.startsWith("_st_");
                    String str3 = this.L;
                    String str4 = this.K;
                    if (startsWith) {
                        str = gl0.W(str3, str4) + "/troubleshooting/trace/SCREEN_TRACE/" + H2 + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                    } else {
                        str = gl0.W(str3, str4) + "/troubleshooting/trace/DURATION_TRACE/" + H2 + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                    }
                    rgVar3.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", a, str);
                } else {
                    rgVar3.e("Logging %s", a(nf5));
                }
                dh2 dh2 = this.D;
                rg rgVar4 = dh2.d;
                if (dh2.c == null) {
                    cn7 cn7 = (cn7) dh2.b.get();
                    if (cn7 != null) {
                        dh2.c = ((dn7) cn7).a(dh2.a, new m42("proto"), new rf2(3));
                    } else {
                        rgVar4.f("Flg TransportFactory is not available at the moment");
                    }
                }
                o9 o9Var = dh2.c;
                if (o9Var != null) {
                    o9Var.K(new n00(nf5, to5.w, (h10) null), new kj6(16));
                } else {
                    rgVar4.f("Unable to dispatch event because Flg Transport is not available");
                }
                SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                return;
            }
            N.g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", a(nf5));
            return;
        }
        str2 = null;
        if (TextUtils.isEmpty(str2)) {
        }
        frVar = this.J;
        frVar.h();
        ir.t((ir) frVar.x, jrVar);
        qu2 qu22 = (qu2) frVar.w.k(5);
        n = frVar.x.n();
        b bVar2 = frVar.x;
        if (n) {
        }
        qu22.x = bVar2;
        frVar = qu22;
        rg rgVar22 = if2.b;
        this.A = (if2) oe2.c().b(if2.class);
        if2 = this.A;
        if (if2 == null) {
        }
        frVar.h();
        ir.u((ir) frVar.x).putAll(map);
        mf5.h();
        nf5.s((nf5) mf5.x, (ir) frVar.g());
        nf5 nf52 = (nf5) mf5.g();
        if (this.G.n()) {
        }
    }

    public final void onUpdateAppState(jr jrVar) {
        boolean z2;
        if (jrVar == jr.y) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.M = z2;
        if (this.y.get()) {
            this.E.execute(new gn7(this, 0));
        }
    }
}
