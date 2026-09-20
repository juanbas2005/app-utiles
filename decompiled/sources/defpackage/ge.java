package defpackage;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ge  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ge implements Runnable {
    public final /* synthetic */ int w;
    public final Object x;

    public ge(ig8 ig8, qa qaVar) {
        this.w = 21;
        Objects.requireNonNull(ig8);
        this.x = qaVar;
    }

    private final void a() {
        vb7 b;
        Logger logger;
        ac7 ac7;
        boolean isLoggable;
        long j;
        vb7 b2;
        bc7 bc7 = (bc7) this.x;
        synchronized (bc7) {
            bc7.g++;
            b = bc7.b();
        }
        if (b != null) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            while (true) {
                try {
                    currentThread.setName(b.a);
                    logger = ((bc7) this.x).b;
                    ac7 = b.c;
                    ac7.getClass();
                    isLoggable = logger.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = System.nanoTime();
                        p25.c(logger, b, ac7, "starting");
                    } else {
                        j = -1;
                    }
                    long a = b.a();
                    if (isLoggable) {
                        p25.c(logger, b, ac7, "finished run in " + p25.l(System.nanoTime() - j));
                    }
                    bc7 bc72 = (bc7) this.x;
                    synchronized (bc72) {
                        bc7.a(bc72, b, a, true);
                        b2 = bc72.b();
                    }
                    if (b2 == null) {
                        currentThread.setName(name);
                        return;
                    }
                    b = b2;
                } catch (Throwable th) {
                    currentThread.setName(name);
                    throw th;
                }
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.w
            r3 = 4
            r4 = 0
            r6 = 0
            r7 = 2
            r8 = 1
            r9 = 0
            switch(r1) {
                case 0: goto L_0x0522;
                case 1: goto L_0x0512;
                case 2: goto L_0x047e;
                case 3: goto L_0x0458;
                case 4: goto L_0x03e9;
                case 5: goto L_0x03dd;
                case 6: goto L_0x03d3;
                case 7: goto L_0x039b;
                case 8: goto L_0x038b;
                case 9: goto L_0x0382;
                case 10: goto L_0x0361;
                case 11: goto L_0x0247;
                case 12: goto L_0x022d;
                case 13: goto L_0x0225;
                case 14: goto L_0x0221;
                case 15: goto L_0x0212;
                case 16: goto L_0x0202;
                case 17: goto L_0x01fa;
                case 18: goto L_0x01f2;
                case 19: goto L_0x01d2;
                case 20: goto L_0x01c3;
                case 21: goto L_0x01c2;
                case 22: goto L_0x018c;
                case 23: goto L_0x015d;
                case 24: goto L_0x013d;
                case 25: goto L_0x0126;
                case 26: goto L_0x011c;
                case 27: goto L_0x0105;
                case 28: goto L_0x00e9;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Object r0 = r0.x
            f79 r0 = (defpackage.f79) r0
            k68 r1 = r0.y
            java.lang.Object r1 = r1.y
            o79 r1 = (defpackage.o79) r1
            r1.b1()
            java.lang.Object r2 = r1.w
            y19 r2 = (defpackage.y19) r2
            pz8 r3 = r2.B
            android.content.Context r4 = r2.w
            defpackage.y19.g(r3)
            mz8 r5 = r3.I
            java.lang.String r10 = "Application going to the background"
            r5.a(r10)
            q09 r5 = r2.A
            defpackage.y19.e(r5)
            h09 r5 = r5.O
            r5.b(r8)
            r1.b1()
            r1.z = r8
            tp8 r5 = r2.z
            boolean r10 = r5.r1()
            if (r10 != 0) goto L_0x0052
            long r10 = r0.x
            r38 r1 = r1.B
            r1.e(r9, r9, r10)
            java.lang.Object r1 = r1.y
            h79 r1 = (defpackage.h79) r1
            r1.c()
        L_0x0052:
            long r0 = r0.w
            defpackage.y19.g(r3)
            mz8 r9 = r3.H
            java.lang.String r10 = "Application backgrounded at: timestamp_millis"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.b(r10, r0)
            v49 r0 = r2.I
            defpackage.y19.f(r0)
            r0.b1()
            java.lang.Object r1 = r0.w
            y19 r1 = (defpackage.y19) r1
            r0.d1()
            r69 r0 = r1.j()
            r0.b1()
            r0.d1()
            boolean r9 = r0.j1()
            if (r9 != 0) goto L_0x0082
            goto L_0x0094
        L_0x0082:
            java.lang.Object r0 = r0.w
            y19 r0 = (defpackage.y19) r0
            d99 r0 = r0.E
            defpackage.y19.e(r0)
            int r0 = r0.N1()
            r9 = 242600(0x3b3a8, float:3.39955E-40)
            if (r0 < r9) goto L_0x00aa
        L_0x0094:
            r69 r0 = r1.j()
            r0.b1()
            r0.d1()
            z99 r1 = r0.s1(r8)
            v59 r8 = new v59
            r8.<init>(r0, r1, r7)
            r0.q1(r8)
        L_0x00aa:
            ay8 r0 = defpackage.by8.N0
            boolean r0 = r5.n1(r6, r0)
            if (r0 == 0) goto L_0x00e8
            d99 r0 = r2.E
            defpackage.y19.e(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r6 = r5.y
            boolean r0 = r0.H1(r1, r6)
            if (r0 == 0) goto L_0x00c6
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x00d0
        L_0x00c6:
            java.lang.String r0 = r4.getPackageName()
            ay8 r1 = defpackage.by8.E
            long r0 = r5.k1(r0, r1)
        L_0x00d0:
            defpackage.y19.g(r3)
            mz8 r3 = r3.J
            java.lang.String r4 = "[sgtm] Scheduling batch upload with minimum latency in millis"
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r3.b(r4, r5)
            c59 r3 = r2.Q
            defpackage.y19.d(r3)
            c59 r2 = r2.Q
            r2.g1(r0)
        L_0x00e8:
            return
        L_0x00e9:
            java.lang.Object r0 = r0.x
            c49 r0 = (defpackage.c49) r0
            java.lang.Object r0 = r0.y
            m69 r0 = (defpackage.m69) r0
            r69 r0 = r0.y
            java.lang.Object r1 = r0.w
            y19 r1 = (defpackage.y19) r1
            r19 r1 = r1.C
            defpackage.y19.g(r1)
            k69 r2 = new k69
            r2.<init>(r0, r9)
            r1.l1(r2)
            return
        L_0x0105:
            java.lang.Object r0 = r0.x
            m69 r0 = (defpackage.m69) r0
            r69 r0 = r0.y
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Object r2 = r0.w
            y19 r2 = (defpackage.y19) r2
            android.content.Context r2 = r2.w
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            r0.n1(r1)
            return
        L_0x011c:
            java.lang.Object r0 = r0.x
            f09 r0 = (defpackage.f09) r0
            v89 r0 = r0.a
            r0.K()
            return
        L_0x0126:
            java.lang.Object r0 = r0.x
            a09 r0 = (defpackage.a09) r0
            java.lang.Object r1 = r0.y
            monitor-enter(r1)
            java.lang.Object r0 = r0.z     // Catch:{ all -> 0x0137 }
            x45 r0 = (defpackage.x45) r0     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x0139
            r0.f()     // Catch:{ all -> 0x0137 }
            goto L_0x0139
        L_0x0137:
            r0 = move-exception
            goto L_0x013b
        L_0x0139:
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
            return
        L_0x013b:
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x013d:
            java.lang.Object r0 = r0.x
            com.google.android.gms.oss.licenses.OssLicensesActivity r0 = (com.google.android.gms.oss.licenses.OssLicensesActivity) r0
            android.widget.TextView r1 = r0.a0
            android.text.Layout r1 = r1.getLayout()
            int r2 = r0.b0
            int r1 = r1.getLineForOffset(r2)
            android.widget.TextView r2 = r0.a0
            android.text.Layout r2 = r2.getLayout()
            int r1 = r2.getLineTop(r1)
            android.widget.ScrollView r0 = r0.Z
            r0.scrollTo(r9, r1)
            return
        L_0x015d:
            java.lang.Object r0 = r0.x
            r1 = r0
            uq8 r1 = (defpackage.uq8) r1
            android.database.sqlite.SQLiteDatabase r0 = r1.T1()     // Catch:{ SQLiteException -> 0x017a }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x017a }
            r2.<init>()     // Catch:{ SQLiteException -> 0x017a }
            java.lang.String r3 = "elapsed_time"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x017a }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x017a }
            java.lang.String r3 = "raw_events"
            r0.update(r3, r2, r6, r6)     // Catch:{ SQLiteException -> 0x017a }
            goto L_0x018b
        L_0x017a:
            r0 = move-exception
            java.lang.Object r1 = r1.w
            y19 r1 = (defpackage.y19) r1
            pz8 r1 = r1.B
            defpackage.y19.g(r1)
            mz8 r1 = r1.B
            java.lang.String r2 = "Failed to remove elapsed times from raw events table"
            r1.b(r2, r0)
        L_0x018b:
            return
        L_0x018c:
            java.lang.Object r0 = r0.x
            i88 r0 = (defpackage.i88) r0
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            boolean r2 = r0.b()     // Catch:{ all -> 0x019b }
            if (r2 != 0) goto L_0x019d
            monitor-exit(r1)     // Catch:{ all -> 0x019b }
            goto L_0x01bf
        L_0x019b:
            r0 = move-exception
            goto L_0x01c0
        L_0x019d:
            java.lang.String r2 = "WakeLock"
            java.lang.String r3 = r0.j     // Catch:{ all -> 0x019b }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x019b }
            java.lang.String r4 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x019b }
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x019b }
            r0.d()     // Catch:{ all -> 0x019b }
            boolean r2 = r0.b()     // Catch:{ all -> 0x019b }
            if (r2 != 0) goto L_0x01b9
            monitor-exit(r1)     // Catch:{ all -> 0x019b }
            goto L_0x01bf
        L_0x01b9:
            r0.c = r8     // Catch:{ all -> 0x019b }
            r0.e()     // Catch:{ all -> 0x019b }
            monitor-exit(r1)     // Catch:{ all -> 0x019b }
        L_0x01bf:
            return
        L_0x01c0:
            monitor-exit(r1)     // Catch:{ all -> 0x019b }
            throw r0
        L_0x01c2:
            throw r6
        L_0x01c3:
            m11 r1 = new m11
            r1.<init>(r3, r6, r6)
            java.lang.Object r0 = r0.x
            wg8 r0 = (defpackage.wg8) r0
            ge1 r0 = r0.k
            r0.c(r1)
            return
        L_0x01d2:
            java.lang.Object r0 = r0.x
            uy5 r0 = (defpackage.uy5) r0
            java.lang.Object r0 = r0.x
            ng8 r0 = (defpackage.ng8) r0
            iw2 r1 = r0.e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = " disconnecting because it was signed out."
            iw2 r0 = r0.e
            java.lang.String r1 = r1.concat(r2)
            y50 r0 = (defpackage.y50) r0
            r0.d(r1)
            return
        L_0x01f2:
            java.lang.Object r0 = r0.x
            ng8 r0 = (defpackage.ng8) r0
            r0.c()
            return
        L_0x01fa:
            java.lang.Object r0 = r0.x
            i58 r0 = (defpackage.i58) r0
            r0.n(r9)
            return
        L_0x0202:
            java.lang.Object r0 = r0.x
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.ActionMenuView r0 = r0.w
            if (r0 == 0) goto L_0x0211
            d8 r0 = r0.P
            if (r0 == 0) goto L_0x0211
            r0.l()
        L_0x0211:
            return
        L_0x0212:
            java.lang.Object r0 = r0.x
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            p42 r0 = r0.y
            com.google.android.material.internal.CheckableImageButton r0 = r0.C
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L_0x0221:
            r0.a()
            return
        L_0x0225:
            java.lang.Object r0 = r0.x
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.B0()
            return
        L_0x022d:
            java.lang.Object r0 = r0.x
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = (androidx.appcompat.widget.SearchView$SearchAutoComplete) r0
            boolean r1 = r0.B
            if (r1 == 0) goto L_0x0246
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.showSoftInput(r0, r9)
            r0.B = r9
        L_0x0246:
            return
        L_0x0247:
            java.lang.Object r0 = r0.x
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            ty5 r1 = r0.h0
            if (r1 == 0) goto L_0x035d
            jm1 r1 = (defpackage.jm1) r1
            long r10 = r1.d
            java.util.ArrayList r3 = r1.h
            boolean r6 = r3.isEmpty()
            java.util.ArrayList r12 = r1.j
            boolean r13 = r12.isEmpty()
            java.util.ArrayList r14 = r1.k
            boolean r15 = r14.isEmpty()
            r16 = r4
            java.util.ArrayList r4 = r1.i
            boolean r5 = r4.isEmpty()
            if (r6 == 0) goto L_0x0277
            if (r13 == 0) goto L_0x0277
            if (r5 == 0) goto L_0x0277
            if (r15 == 0) goto L_0x0277
            goto L_0x035d
        L_0x0277:
            java.util.Iterator r18 = r3.iterator()
        L_0x027b:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L_0x02b1
            java.lang.Object r19 = r18.next()
            r7 = r19
            lz5 r7 = (defpackage.lz5) r7
            android.view.View r8 = r7.a
            android.view.ViewPropertyAnimator r9 = r8.animate()
            java.util.ArrayList r2 = r1.q
            r2.add(r7)
            android.view.ViewPropertyAnimator r2 = r9.setDuration(r10)
            r22 = r3
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            em1 r3 = new em1
            r3.<init>((defpackage.jm1) r1, (defpackage.lz5) r7, (android.view.ViewPropertyAnimator) r9, (android.view.View) r8)
            android.view.ViewPropertyAnimator r2 = r2.setListener(r3)
            r2.start()
            r3 = r22
            r7 = 2
            r8 = 1
            r9 = 0
            goto L_0x027b
        L_0x02b1:
            r22 = r3
            r22.clear()
            if (r13 != 0) goto L_0x02e3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r12)
            java.util.ArrayList r3 = r1.m
            r3.add(r2)
            r12.clear()
            dm1 r3 = new dm1
            r7 = 0
            r3.<init>(r1, r2, r7)
            if (r6 != 0) goto L_0x02e0
            java.lang.Object r2 = r2.get(r7)
            im1 r2 = (defpackage.im1) r2
            lz5 r2 = r2.a
            android.view.View r2 = r2.a
            java.util.WeakHashMap r7 = defpackage.e58.a
            r2.postOnAnimationDelayed(r3, r10)
            goto L_0x02e3
        L_0x02e0:
            r3.run()
        L_0x02e3:
            if (r15 != 0) goto L_0x0311
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r14)
            java.util.ArrayList r3 = r1.n
            r3.add(r2)
            r14.clear()
            dm1 r3 = new dm1
            r7 = 1
            r3.<init>(r1, r2, r7)
            if (r6 != 0) goto L_0x030e
            r7 = 0
            java.lang.Object r2 = r2.get(r7)
            hm1 r2 = (defpackage.hm1) r2
            lz5 r2 = r2.a
            android.view.View r2 = r2.a
            java.util.WeakHashMap r7 = defpackage.e58.a
            r2.postOnAnimationDelayed(r3, r10)
            goto L_0x0311
        L_0x030e:
            r3.run()
        L_0x0311:
            if (r5 != 0) goto L_0x035b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r4)
            java.util.ArrayList r3 = r1.l
            r3.add(r2)
            r4.clear()
            dm1 r3 = new dm1
            r4 = 2
            r3.<init>(r1, r2, r4)
            if (r6 == 0) goto L_0x0334
            if (r13 == 0) goto L_0x0334
            if (r15 != 0) goto L_0x0330
            goto L_0x0334
        L_0x0330:
            r3.run()
            goto L_0x035b
        L_0x0334:
            if (r6 != 0) goto L_0x0337
            goto L_0x0339
        L_0x0337:
            r10 = r16
        L_0x0339:
            if (r13 != 0) goto L_0x033e
            long r4 = r1.e
            goto L_0x0340
        L_0x033e:
            r4 = r16
        L_0x0340:
            if (r15 != 0) goto L_0x0345
            long r6 = r1.f
            goto L_0x0347
        L_0x0345:
            r6 = r16
        L_0x0347:
            long r4 = java.lang.Math.max(r4, r6)
            long r4 = r4 + r10
            r7 = 0
            java.lang.Object r1 = r2.get(r7)
            lz5 r1 = (defpackage.lz5) r1
            android.view.View r1 = r1.a
            java.util.WeakHashMap r2 = defpackage.e58.a
            r1.postOnAnimationDelayed(r3, r4)
            goto L_0x035e
        L_0x035b:
            r7 = 0
            goto L_0x035e
        L_0x035d:
            r7 = r9
        L_0x035e:
            r0.F0 = r7
            return
        L_0x0361:
            java.lang.Object r1 = r0.x
            bp4 r1 = (defpackage.bp4) r1
            java.lang.Object r1 = r1.a
            monitor-enter(r1)
            java.lang.Object r2 = r0.x     // Catch:{ all -> 0x037f }
            bp4 r2 = (defpackage.bp4) r2     // Catch:{ all -> 0x037f }
            java.lang.Object r2 = r2.f     // Catch:{ all -> 0x037f }
            java.lang.Object r3 = r0.x     // Catch:{ all -> 0x037f }
            bp4 r3 = (defpackage.bp4) r3     // Catch:{ all -> 0x037f }
            java.lang.Object r4 = defpackage.bp4.k     // Catch:{ all -> 0x037f }
            r3.f = r4     // Catch:{ all -> 0x037f }
            monitor-exit(r1)     // Catch:{ all -> 0x037f }
            java.lang.Object r0 = r0.x
            bp4 r0 = (defpackage.bp4) r0
            r0.i(r2)
            return
        L_0x037f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x037f }
            throw r0
        L_0x0382:
            java.lang.Object r0 = r0.x
            rq2 r0 = (defpackage.rq2) r0
            r7 = 1
            r0.A(r7)
            return
        L_0x038b:
            java.lang.Object r0 = r0.x
            bq2 r0 = (defpackage.bq2) r0
            aq2 r1 = r0.f0
            if (r1 == 0) goto L_0x039a
            aq2 r0 = r0.j()
            r0.getClass()
        L_0x039a:
            return
        L_0x039b:
            java.lang.Object r0 = r0.x
            wb2 r0 = (defpackage.wb2) r0
            android.animation.ValueAnimator r1 = r0.z
            int r2 = r0.A
            r7 = 1
            if (r2 == r7) goto L_0x03aa
            r4 = 2
            if (r2 == r4) goto L_0x03ae
            goto L_0x03d2
        L_0x03aa:
            r4 = 2
            r1.cancel()
        L_0x03ae:
            r2 = 3
            r0.A = r2
            java.lang.Object r0 = r1.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float[] r2 = new float[r4]
            r20 = 0
            r2[r20] = r0
            r19 = 1
            r21 = 0
            r2[r19] = r21
            r1.setFloatValues(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            r1.start()
        L_0x03d2:
            return
        L_0x03d3:
            java.lang.Object r0 = r0.x
            e02 r0 = (defpackage.e02) r0
            r0.H = r6
            r0.drawableStateChanged()
            return
        L_0x03dd:
            java.lang.Object r0 = r0.x
            ou1 r0 = (defpackage.ou1) r0
            mu1 r1 = r0.w0
            android.app.Dialog r0 = r0.E0
            r1.onDismiss(r0)
            return
        L_0x03e9:
            java.lang.Object r0 = r0.x
            r1 = r0
            a01 r1 = (defpackage.a01) r1
            monitor-enter(r1)
            boolean r0 = r1.a()     // Catch:{ all -> 0x0455 }
            if (r0 == 0) goto L_0x03fe
            monitor-enter(r1)     // Catch:{ all -> 0x0455 }
            r7 = 1
            r1.b = r7     // Catch:{ all -> 0x03fb }
            monitor-exit(r1)     // Catch:{ all -> 0x0455 }
            goto L_0x03fe
        L_0x03fb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03fb }
            throw r0     // Catch:{ all -> 0x0455 }
        L_0x03fe:
            monitor-exit(r1)
            if (r0 != 0) goto L_0x0402
            goto L_0x0454
        L_0x0402:
            d01 r0 = r1.q
            c01 r0 = r0.c()
            java.util.Date r2 = new java.util.Date
            xb4 r4 = r1.p
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            r2.<init>(r4)
            java.util.Date r0 = r0.b
            boolean r0 = r2.before(r0)
            if (r0 == 0) goto L_0x0422
            r1.h()
            goto L_0x0454
        L_0x0422:
            we2 r0 = r1.k
            ve2 r0 = (defpackage.ve2) r0
            yb9 r2 = r0.d()
            yb9 r0 = r0.c()
            yb9[] r4 = new defpackage.yb9[]{r2, r0}
            yb9 r4 = defpackage.b35.B(r4)
            java.util.concurrent.ScheduledExecutorService r5 = r1.h
            yz0 r6 = new yz0
            r7 = 0
            r6.<init>(r1, r2, r0, r7)
            yb9 r0 = r4.g(r5, r6)
            yb9[] r2 = new defpackage.yb9[]{r0}
            yb9 r2 = defpackage.b35.B(r2)
            java.util.concurrent.ScheduledExecutorService r4 = r1.h
            yv0 r5 = new yv0
            r5.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r0)
            r2.f(r4, r5)
        L_0x0454:
            return
        L_0x0455:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0455 }
            throw r0
        L_0x0458:
            java.lang.Object r0 = r0.x
            za0 r0 = (defpackage.za0) r0
            r7 = 0
            r0.c = r7
            java.lang.Object r1 = r0.e
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            i58 r2 = r1.O
            if (r2 == 0) goto L_0x0473
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x0473
            int r1 = r0.b
            r0.b(r1)
            goto L_0x047d
        L_0x0473:
            int r2 = r1.N
            r4 = 2
            if (r2 != r4) goto L_0x047d
            int r0 = r0.b
            r1.C(r0)
        L_0x047d:
            return
        L_0x047e:
            r16 = r4
            java.lang.Object r1 = r0.x
            n84 r1 = (defpackage.n84) r1
            e02 r2 = r1.y
            oy r3 = r1.w
            boolean r4 = r1.K
            if (r4 != 0) goto L_0x048e
            goto L_0x0511
        L_0x048e:
            boolean r4 = r1.I
            if (r4 == 0) goto L_0x04a5
            r7 = 0
            r1.I = r7
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r3.e = r4
            r6 = -1
            r3.g = r6
            r3.f = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.h = r4
        L_0x04a5:
            long r4 = r3.g
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x04bb
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r6 = r3.g
            int r8 = r3.i
            long r8 = (long) r8
            long r6 = r6 + r8
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x04bb
        L_0x04b9:
            r7 = 0
            goto L_0x04c2
        L_0x04bb:
            boolean r4 = r1.e()
            if (r4 != 0) goto L_0x04c5
            goto L_0x04b9
        L_0x04c2:
            r1.K = r7
            goto L_0x0511
        L_0x04c5:
            r7 = 0
            boolean r4 = r1.J
            if (r4 == 0) goto L_0x04df
            r1.J = r7
            long r8 = android.os.SystemClock.uptimeMillis()
            r14 = 0
            r15 = 0
            r12 = 3
            r13 = 0
            r10 = r8
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r8, r10, r12, r13, r14, r15)
            r2.onTouchEvent(r4)
            r4.recycle()
        L_0x04df:
            long r4 = r3.f
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x050c
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r6 = r3.a(r4)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r7 = r7 * r6
            float r7 = r7 * r6
            r8 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r8
            float r6 = r6 + r7
            long r7 = r3.f
            long r7 = r4 - r7
            r3.f = r4
            float r4 = (float) r7
            float r4 = r4 * r6
            float r3 = r3.d
            float r4 = r4 * r3
            int r3 = (int) r4
            e02 r1 = r1.M
            r1.scrollListBy(r3)
            java.util.WeakHashMap r1 = defpackage.e58.a
            r2.postOnAnimation(r0)
            goto L_0x0511
        L_0x050c:
            java.lang.String r0 = "Cannot compute scroll delta before calling start()"
            defpackage.rf2.r(r0)
        L_0x0511:
            return
        L_0x0512:
            java.lang.Object r0 = r0.x
            com.google.firebase.perf.metrics.AppStartTrace r0 = (com.google.firebase.perf.metrics.AppStartTrace) r0
            ui7 r1 = r0.E
            if (r1 != 0) goto L_0x0521
            ui7 r1 = new ui7
            r1.<init>()
            r0.F = r1
        L_0x0521:
            return
        L_0x0522:
            r4 = r7
            java.lang.Object r1 = r0.x
            r5 = r1
            je r5 = (defpackage.je) r5
            r5.removeCallbacks(r0)
            android.view.MotionEvent r6 = r5.G0
            if (r6 == 0) goto L_0x0550
            int r0 = r6.getActionMasked()
            r1 = 10
            if (r0 == r1) goto L_0x0550
            r7 = 1
            if (r0 == r7) goto L_0x0550
            r1 = 7
            if (r0 == r1) goto L_0x0549
            r2 = 8
            r3 = 9
            if (r0 == r2) goto L_0x0547
            if (r0 == r3) goto L_0x0549
            r7 = r4
            goto L_0x054a
        L_0x0547:
            r7 = r3
            goto L_0x054a
        L_0x0549:
            r7 = r1
        L_0x054a:
            long r8 = r5.H0
            r10 = 0
            r5.I(r6, r7, r8, r10)
        L_0x0550:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge.run():void");
    }

    public /* synthetic */ ge(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public ge(wg8 wg8) {
        this.w = 20;
        Objects.requireNonNull(wg8);
        this.x = wg8;
    }

    public ge(f09 f09, boolean z) {
        this.w = 26;
        this.x = f09;
    }
}
