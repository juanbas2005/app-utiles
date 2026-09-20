package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: y19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y19 implements a39 {
    public static volatile y19 b0;
    public final q09 A;
    public final pz8 B;
    public final r19 C;
    public final o79 D;
    public final d99 E;
    public final fz8 F;
    public final xb4 G;
    public final l59 H;
    public final v49 I;
    public final ev8 J;
    public final b59 K;
    public final String L;
    public cz8 M;
    public r69 N;
    public kr8 O;
    public vy8 P;
    public c59 Q;
    public boolean R = false;
    public Boolean S;
    public long T;
    public volatile Boolean U;
    public volatile boolean V;
    public int W;
    public int X;
    public final AtomicInteger Y = new AtomicInteger(0);
    public final long Z;
    public final long a0;
    public final Context w;
    public final boolean x;
    public final ts2 y;
    public final tp8 z;

    /* JADX WARNING: type inference failed for: r1v4, types: [in8, tp8] */
    /* JADX WARNING: type inference failed for: r4v4, types: [y29, b59] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
        	at java.base/java.util.Objects.checkIndex(Unknown Source)
        	at java.base/java.util.ArrayList.get(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public y19(defpackage.m39 r11) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.R = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r10.Y = r1
            android.content.Context r1 = r11.a
            ts2 r2 = new ts2
            r3 = 16
            r2.<init>(r3)
            r10.y = r2
            defpackage.z85.c = r2
            r10.w = r1
            boolean r2 = r11.e
            r10.x = r2
            java.lang.Boolean r2 = r11.b
            r10.U = r2
            java.lang.String r2 = r11.h
            r10.L = r2
            r2 = 1
            r10.V = r2
            p49 r3 = defpackage.h59.b
            r4 = 0
            if (r3 != 0) goto L_0x0090
            if (r1 != 0) goto L_0x0033
            goto L_0x0090
        L_0x0033:
            java.lang.Object r3 = defpackage.h59.a
            monitor-enter(r3)
            p49 r5 = defpackage.h59.b     // Catch:{ all -> 0x008a }
            if (r5 != 0) goto L_0x008c
            monitor-enter(r3)     // Catch:{ all -> 0x008a }
            p49 r5 = defpackage.h59.b     // Catch:{ all -> 0x004c }
            android.content.Context r6 = r1.getApplicationContext()     // Catch:{ all -> 0x004c }
            if (r6 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r6 = r1
        L_0x0045:
            if (r5 == 0) goto L_0x004e
            android.content.Context r7 = r5.a     // Catch:{ all -> 0x004c }
            if (r7 == r6) goto L_0x0086
            goto L_0x004e
        L_0x004c:
            r10 = move-exception
            goto L_0x0088
        L_0x004e:
            if (r5 == 0) goto L_0x0071
            java.util.concurrent.ConcurrentHashMap r5 = defpackage.q49.a     // Catch:{ all -> 0x004c }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x004c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x004c }
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x004c }
            if (r7 != 0) goto L_0x0064
            defpackage.k59.a()     // Catch:{ all -> 0x004c }
            goto L_0x0071
        L_0x0064:
            java.lang.Object r10 = r5.next()     // Catch:{ all -> 0x004c }
            if (r10 != 0) goto L_0x006b
            throw r4     // Catch:{ all -> 0x004c }
        L_0x006b:
            java.lang.ClassCastException r10 = new java.lang.ClassCastException     // Catch:{ all -> 0x004c }
            r10.<init>()     // Catch:{ all -> 0x004c }
            throw r10     // Catch:{ all -> 0x004c }
        L_0x0071:
            z49 r5 = new z49     // Catch:{ all -> 0x004c }
            r5.<init>(r6, r2, r0)     // Catch:{ all -> 0x004c }
            x77 r5 = defpackage.n85.k(r5)     // Catch:{ all -> 0x004c }
            p49 r7 = new p49     // Catch:{ all -> 0x004c }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x004c }
            defpackage.h59.b = r7     // Catch:{ all -> 0x004c }
            java.util.concurrent.atomic.AtomicInteger r5 = defpackage.h59.c     // Catch:{ all -> 0x004c }
            r5.incrementAndGet()     // Catch:{ all -> 0x004c }
        L_0x0086:
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            goto L_0x008c
        L_0x0088:
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            throw r10     // Catch:{ all -> 0x008a }
        L_0x008a:
            r10 = move-exception
            goto L_0x008e
        L_0x008c:
            monitor-exit(r3)     // Catch:{ all -> 0x008a }
            goto L_0x0090
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x008a }
            throw r10
        L_0x0090:
            xb4 r3 = defpackage.xb4.P
            r10.G = r3
            b49 r3 = new b49
            qc3 r5 = defpackage.r39.a
            xm r6 = defpackage.ym.a
            jw2 r7 = defpackage.jw2.c
            r3.<init>(r1, r5, r6, r7)
            java.lang.String r5 = r1.getPackageName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r7 = "com.google.android.gms.measurement#"
            java.lang.String r5 = r7.concat(r5)
            za0 r7 = defpackage.i93.b()
            k68 r8 = new k68
            r9 = 18
            r8.<init>(r9, r5, r6)
            r7.d = r8
            xg8 r5 = r7.a()
            r3.b(r0, r5)
            java.util.concurrent.atomic.AtomicReference r3 = defpackage.x49.k
            java.lang.Object r5 = r3.get()
            if (r5 == 0) goto L_0x00cc
            goto L_0x00f5
        L_0x00cc:
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ NullPointerException -> 0x00d1 }
            goto L_0x00e6
        L_0x00d1:
            defpackage.x49.b()
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            x77 r5 = defpackage.x49.m
            java.lang.Object r5 = r5.get()
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.lang.String r6 = "context.getApplicationContext() yielded NullPointerException"
            java.lang.Object[] r7 = new java.lang.Object[r0]
            defpackage.c35.q(r1, r5, r4, r6, r7)
            r1 = r4
        L_0x00e6:
            if (r1 == 0) goto L_0x00f5
        L_0x00e8:
            boolean r5 = r3.compareAndSet(r4, r1)
            if (r5 == 0) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            java.lang.Object r5 = r3.get()
            if (r5 == 0) goto L_0x00e8
        L_0x00f5:
            java.lang.Long r1 = r11.f
            if (r1 == 0) goto L_0x00fe
            long r3 = r1.longValue()
            goto L_0x0107
        L_0x00fe:
            xb4 r1 = r10.G
            r1.getClass()
            long r3 = java.lang.System.currentTimeMillis()
        L_0x0107:
            r10.Z = r3
            java.lang.Long r1 = r11.g
            if (r1 == 0) goto L_0x0112
            long r3 = r1.longValue()
            goto L_0x011b
        L_0x0112:
            xb4 r1 = r10.G
            r1.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x011b:
            r10.a0 = r3
            tp8 r1 = new tp8
            r1.<init>((defpackage.y19) r10)
            hr2 r3 = defpackage.hr2.z
            r1.z = r3
            r10.z = r1
            q09 r1 = new q09
            r1.<init>(r10)
            r1.f1()
            r10.A = r1
            pz8 r1 = new pz8
            r1.<init>(r10)
            r1.f1()
            r10.B = r1
            d99 r3 = new d99
            r3.<init>(r10)
            r3.f1()
            r10.E = r3
            br4 r3 = new br4
            r4 = 28
            r3.<init>((int) r4, (java.lang.Object) r11, (java.lang.Object) r10)
            fz8 r4 = new fz8
            r4.<init>(r3)
            r10.F = r4
            ev8 r3 = new ev8
            r3.<init>(r10)
            r10.J = r3
            l59 r3 = new l59
            r3.<init>(r10)
            r3.e1()
            r10.H = r3
            v49 r3 = new v49
            r3.<init>(r10)
            r3.e1()
            r10.I = r3
            o79 r4 = new o79
            r4.<init>(r10)
            r4.e1()
            r10.D = r4
            b59 r4 = new b59
            r4.<init>(r10)
            r4.f1()
            r10.K = r4
            r19 r4 = new r19
            r4.<init>(r10)
            r4.f1()
            r10.C = r4
            iv8 r5 = r11.d
            if (r5 == 0) goto L_0x019a
            long r5 = r5.x
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x019a
            r2 = r0
        L_0x019a:
            android.content.Context r5 = r10.w
            android.content.Context r5 = r5.getApplicationContext()
            boolean r5 = r5 instanceof android.app.Application
            if (r5 == 0) goto L_0x01ea
            f(r3)
            java.lang.Object r1 = r3.w
            y19 r1 = (defpackage.y19) r1
            android.content.Context r1 = r1.w
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L_0x01f4
            java.lang.Object r1 = r3.w
            y19 r1 = (defpackage.y19) r1
            android.content.Context r1 = r1.w
            android.content.Context r1 = r1.getApplicationContext()
            android.app.Application r1 = (android.app.Application) r1
            zb2 r5 = r3.y
            if (r5 != 0) goto L_0x01cd
            zb2 r5 = new zb2
            r6 = 2
            r5.<init>(r6, r3)
            r3.y = r5
        L_0x01cd:
            if (r2 == 0) goto L_0x01f4
            zb2 r2 = r3.y
            r1.unregisterActivityLifecycleCallbacks(r2)
            zb2 r2 = r3.y
            r1.registerActivityLifecycleCallbacks(r2)
            java.lang.Object r1 = r3.w
            y19 r1 = (defpackage.y19) r1
            pz8 r1 = r1.B
            g(r1)
            mz8 r1 = r1.J
            java.lang.String r2 = "Registered activity lifecycle callback"
            r1.a(r2)
            goto L_0x01f4
        L_0x01ea:
            g(r1)
            mz8 r1 = r1.E
            java.lang.String r2 = "Application context is not an Application"
            r1.a(r2)
        L_0x01f4:
            nt2 r1 = new nt2
            r2 = 24
            r1.<init>(r10, r0, r11, r2)
            r4.l1(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y19.<init>(m39):void");
    }

    public static final void d(cx8 cx8) {
        if (cx8 == null) {
            h.s("Component not created");
        }
    }

    public static final void e(in8 in8) {
        if (in8 == null) {
            h.s("Component not created");
        }
    }

    public static final void f(fy8 fy8) {
        if (fy8 == null) {
            h.s("Component not created");
        } else if (!fy8.x) {
            h.s("Component not initialized: ".concat(String.valueOf(fy8.getClass())));
        }
    }

    public static final void g(y29 y29) {
        if (y29 == null) {
            h.s("Component not created");
        } else if (!y29.x) {
            h.s("Component not initialized: ".concat(String.valueOf(y29.getClass())));
        }
    }

    public static y19 m(Context context, iv8 iv8, Long l, Long l2) {
        Bundle bundle;
        if (iv8 != null) {
            Bundle bundle2 = iv8.z;
            boolean z2 = iv8.y;
            iv8 = new iv8(iv8.w, iv8.x, z2, bundle2, (String) null);
        }
        z65.k(context);
        z65.k(context.getApplicationContext());
        if (b0 == null) {
            synchronized (y19.class) {
                try {
                    if (b0 == null) {
                        b0 = new y19(new m39(context, iv8, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (!(iv8 == null || (bundle = iv8.z) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            z65.k(b0);
            b0.U = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        z65.k(b0);
        return b0;
    }

    public final ts2 A() {
        return this.y;
    }

    public final pz8 G() {
        pz8 pz8 = this.B;
        g(pz8);
        return pz8;
    }

    public final xb4 Q() {
        return this.G;
    }

    public final boolean a() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final int b() {
        Boolean bool;
        r19 r19 = this.C;
        g(r19);
        r19.b1();
        tp8 tp8 = this.z;
        if (tp8.q1()) {
            return 1;
        }
        g(r19);
        r19.b1();
        if (!this.V) {
            return 8;
        }
        q09 q09 = this.A;
        e(q09);
        q09.b1();
        if (q09.g1().contains("measurement_enabled")) {
            bool = Boolean.valueOf(q09.g1().getBoolean("measurement_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            ts2 ts2 = ((y19) tp8.w).y;
            Boolean p1 = tp8.p1("firebase_analytics_collection_enabled");
            if (p1 != null) {
                if (p1.booleanValue()) {
                    return 0;
                }
                return 4;
            } else if (this.U == null || this.U.booleanValue()) {
                return 0;
            } else {
                return 7;
            }
        } else if (bool.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.T) > 1000) goto L_0x0035;
     */
    public final boolean c() {
        boolean z2 = false;
        if (this.R) {
            r19 r19 = this.C;
            g(r19);
            r19.b1();
            Boolean bool = this.S;
            xb4 xb4 = this.G;
            if (!(bool == null || this.T == 0)) {
                if (!bool.booleanValue()) {
                    xb4.getClass();
                }
                return this.S.booleanValue();
            }
            xb4.getClass();
            this.T = SystemClock.elapsedRealtime();
            d99 d99 = this.E;
            e(d99);
            if (d99.F1("android.permission.INTERNET") && d99.F1("android.permission.ACCESS_NETWORK_STATE")) {
                Context context = this.w;
                if (cf8.a(context).d() || this.z.f1() || (d99.X1(context) && d99.x1(context))) {
                    z2 = true;
                }
            }
            this.S = Boolean.valueOf(z2);
            if (z2) {
                this.S = Boolean.valueOf(d99.i1(l().j1()));
            }
            return this.S.booleanValue();
        }
        h.s("AppMeasurement is not initialized");
        return false;
    }

    public final fz8 h() {
        return this.F;
    }

    public final cz8 i() {
        f(this.M);
        return this.M;
    }

    public final r69 j() {
        f(this.N);
        return this.N;
    }

    public final kr8 k() {
        g(this.O);
        return this.O;
    }

    public final vy8 l() {
        f(this.P);
        return this.P;
    }

    public final r19 n0() {
        r19 r19 = this.C;
        g(r19);
        return r19;
    }

    public final Context o0() {
        return this.w;
    }
}
