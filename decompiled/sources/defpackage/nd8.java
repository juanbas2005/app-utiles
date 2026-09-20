package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* renamed from: nd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nd8 {
    public static nd8 k = null;
    public static nd8 l = null;
    public static final Object m = new Object();
    public final Context a;
    public final f01 b;
    public final WorkDatabase c;
    public final qd8 d;
    public final List e;
    public final lp5 f;
    public final br4 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final zk7 j;

    static {
        bc4.p("WorkManagerImpl");
    }

    public nd8(Context context, f01 f01, qd8 qd8, WorkDatabase workDatabase, List list, lp5 lp5, zk7 zk7) {
        Context applicationContext = context.getApplicationContext();
        if (!applicationContext.isDeviceProtectedStorage()) {
            bc4 bc4 = new bc4(f01.h, 0);
            synchronized (bc4.y) {
                try {
                    if (bc4.z == null) {
                        bc4.z = bc4;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.a = applicationContext;
            this.d = qd8;
            this.c = workDatabase;
            this.f = lp5;
            this.j = zk7;
            this.b = f01;
            this.e = list;
            h81 h81 = qd8.b;
            h81.getClass();
            ig0 E = gl0.E(h81);
            this.g = new br4(5, (Object) workDatabase);
            ol6 ol6 = qd8.a;
            String str = mg6.a;
            lp5.a(new lg6(ol6, list, f01, workDatabase));
            qd8.a.execute(new gm2(applicationContext, this));
            String str2 = rs7.a;
            if (kp5.a(applicationContext, f01)) {
                gr8.Q(new qi2(gr8.F(gr8.u(new o40(1, t49.E(workDatabase.w().a, false, new String[]{"workspec"}, new rb8(7)), new a97(4, (f61) null)), -1)), new h70(applicationContext, (f61) null, 2), 2), E);
                return;
            }
            return;
        }
        h.s("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static defpackage.nd8 c(android.content.Context r2) {
        /*
            java.lang.Object r0 = m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0013 }
            nd8 r1 = k     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            goto L_0x000f
        L_0x000a:
            r2 = move-exception
            goto L_0x0020
        L_0x000c:
            nd8 r1 = l     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
        L_0x000f:
            if (r1 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r1
        L_0x0013:
            r2 = move-exception
            goto L_0x0022
        L_0x0015:
            r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0013 }
            throw r2     // Catch:{ all -> 0x0013 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r2     // Catch:{ all -> 0x0013 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd8.c(android.content.Context):nd8");
    }

    public final g22 a(String str, tf5 tf5) {
        tf5.getClass();
        td0 td0 = this.b.m;
        String concat = "enqueueUniquePeriodic_".concat(str);
        ol6 ol6 = this.d.a;
        ol6.getClass();
        return g75.E(td0, concat, ol6, new g20(this, str, tf5, 21));
    }

    public final void b(String str, w82 w82, s55 s55) {
        s55.getClass();
        new cd8(this, str, w82, sg3.D(s55), 0).a();
    }

    public final di2 d(String str) {
        fe8 w = this.c.w();
        h81 h81 = this.d.b;
        w.getClass();
        h81.getClass();
        return gr8.L(gr8.F(new ze1(7, t49.E(w.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new k77(22, (Object) str, (Object) w)))), h81);
    }

    public final void e() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        td0 td0 = this.b.m;
        fd7 fd7 = new fd7(11, (Object) this);
        td0.getClass();
        boolean p = f55.p();
        if (p) {
            try {
                Trace.beginSection(f55.v("ReschedulingWork"));
            } catch (Throwable th) {
                if (p) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        fd7.b();
        if (p) {
            Trace.endSection();
        }
    }
}
