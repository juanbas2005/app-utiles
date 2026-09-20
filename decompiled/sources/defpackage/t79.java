package defpackage;

/* renamed from: t79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t79 implements x77 {
    public final String w;
    public final uw2 x;
    public volatile int y = -1;
    public n49 z;

    public t79(String str, uw2 uw2) {
        this.w = str;
        this.x = uw2;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARNING: type inference failed for: r0v17, types: [bn8, java.lang.Exception] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010b A[Catch:{ IOException | IllegalArgumentException -> 0x00fa, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015c A[SYNTHETIC, Splitter:B:67:0x015c] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0176 A[Catch:{ IOException | IllegalArgumentException -> 0x00fa, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0177 A[Catch:{ IOException | IllegalArgumentException -> 0x00fa, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017a A[Catch:{ IOException | IllegalArgumentException -> 0x00fa, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0180 A[Catch:{ IOException | IllegalArgumentException -> 0x00fa, all -> 0x00a4 }] */
    public final java.lang.Object get() {
        /*
            r11 = this;
            bn8 r0 = defpackage.pd8.z
            if (r0 != 0) goto L_0x000d
            java.lang.Object r0 = defpackage.x49.j
            bn8 r0 = new bn8
            r0.<init>()
            defpackage.pd8.z = r0
        L_0x000d:
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.x49.k
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L_0x0194
            x49 r2 = defpackage.x49.l
            r3 = 0
            if (r2 == 0) goto L_0x001e
            goto L_0x007d
        L_0x001e:
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r2 = "Given application context does not implement GeneratedComponentManager: "
            r0.getClass()     // Catch:{ IllegalStateException -> 0x0052 }
            android.content.Context r4 = r0.getApplicationContext()     // Catch:{ IllegalStateException -> 0x0052 }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x0052 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0052 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ IllegalStateException -> 0x0052 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ IllegalStateException -> 0x0052 }
            int r6 = r6.length()     // Catch:{ IllegalStateException -> 0x0052 }
            int r6 = r6 + 72
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0052 }
            r7.<init>(r6)     // Catch:{ IllegalStateException -> 0x0052 }
            r4.toString()     // Catch:{ IllegalStateException -> 0x0052 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IllegalStateException -> 0x0052 }
            java.lang.String r2 = r2.concat(r4)     // Catch:{ IllegalStateException -> 0x0052 }
            r5.<init>(r2)     // Catch:{ IllegalStateException -> 0x0052 }
            throw r5     // Catch:{ IllegalStateException -> 0x0052 }
        L_0x0052:
            java.lang.Object r2 = defpackage.x49.j
            monitor-enter(r2)
            x49 r4 = defpackage.x49.l     // Catch:{ all -> 0x005e }
            if (r4 == 0) goto L_0x0061
            x49 r0 = defpackage.x49.l     // Catch:{ all -> 0x005e }
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
        L_0x005c:
            r2 = r0
            goto L_0x007d
        L_0x005e:
            r11 = move-exception
            goto L_0x0192
        L_0x0061:
            z49 r4 = new z49     // Catch:{ all -> 0x005e }
            r4.<init>(r0, r3, r3)     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x005e }
            x49 r0 = (defpackage.x49) r0     // Catch:{ all -> 0x005e }
            defpackage.x49.l = r0     // Catch:{ all -> 0x005e }
            java.util.logging.Level r4 = java.util.logging.Level.CONFIG     // Catch:{ all -> 0x005e }
            jm4 r5 = r0.a()     // Catch:{ all -> 0x005e }
            java.lang.String r6 = "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info."
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x005e }
            defpackage.c35.q(r4, r5, r1, r6, r7)     // Catch:{ all -> 0x005e }
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x007d:
            int r0 = r11.y
            r4 = -1
            if (r0 == r4) goto L_0x008e
            n49 r5 = r11.z
            java.lang.Object r5 = r5.x
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.get()
            if (r0 >= r5) goto L_0x0188
        L_0x008e:
            monitor-enter(r11)
            int r0 = r11.y     // Catch:{ all -> 0x00a4 }
            if (r0 != r4) goto L_0x00a7
            defpackage.x49.b()     // Catch:{ all -> 0x00a4 }
            r2.getClass()     // Catch:{ all -> 0x00a4 }
            uw2 r4 = r11.x     // Catch:{ all -> 0x00a4 }
            w89 r4 = r4.c(r2)     // Catch:{ all -> 0x00a4 }
            n49 r5 = r4.g     // Catch:{ all -> 0x00a4 }
            r11.z = r5     // Catch:{ all -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r0 = move-exception
            goto L_0x0190
        L_0x00a7:
            r4 = r1
        L_0x00a8:
            n49 r5 = r11.z     // Catch:{ all -> 0x00a4 }
            java.lang.Object r5 = r5.x     // Catch:{ all -> 0x00a4 }
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5     // Catch:{ all -> 0x00a4 }
            int r5 = r5.get()     // Catch:{ all -> 0x00a4 }
            if (r0 >= r5) goto L_0x0187
            defpackage.x49.b()     // Catch:{ all -> 0x00a4 }
            r2.getClass()     // Catch:{ all -> 0x00a4 }
            android.content.Context r0 = r2.b     // Catch:{ all -> 0x00a4 }
            o75 r0 = defpackage.t49.g0(r0)     // Catch:{ all -> 0x00a4 }
            boolean r6 = r0.b()     // Catch:{ all -> 0x00a4 }
            if (r6 == 0) goto L_0x00f1
            java.lang.Object r6 = r0.a()     // Catch:{ all -> 0x00a4 }
            s49 r6 = (defpackage.s49) r6     // Catch:{ all -> 0x00a4 }
            android.net.Uri r7 = defpackage.u49.a()     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = r11.w     // Catch:{ all -> 0x00a4 }
            if (r7 == 0) goto L_0x00e1
            zt6 r6 = r6.a     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x00a4 }
            zt6 r6 = (defpackage.zt6) r6     // Catch:{ all -> 0x00a4 }
            goto L_0x00e5
        L_0x00e1:
            r6.getClass()     // Catch:{ all -> 0x00a4 }
            r6 = r1
        L_0x00e5:
            if (r6 != 0) goto L_0x00e9
            r6 = r1
            goto L_0x00ef
        L_0x00e9:
            java.lang.Object r6 = r6.get(r8)     // Catch:{ all -> 0x00a4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00a4 }
        L_0x00ef:
            if (r6 != 0) goto L_0x00f3
        L_0x00f1:
            r6 = r1
            goto L_0x0109
        L_0x00f3:
            java.lang.String r7 = "Invalid Phenotype flag value for flag "
            java.lang.Object r6 = r11.b(r6)     // Catch:{ IllegalArgumentException -> 0x00fc, IOException -> 0x00fa }
            goto L_0x0109
        L_0x00fa:
            r6 = move-exception
            goto L_0x00fd
        L_0x00fc:
            r6 = move-exception
        L_0x00fd:
            java.lang.String r8 = "FilePhenotypeFlags"
            java.lang.String r9 = r11.w     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = r7.concat(r9)     // Catch:{ all -> 0x00a4 }
            android.util.Log.e(r8, r7, r6)     // Catch:{ all -> 0x00a4 }
            goto L_0x00f1
        L_0x0109:
            if (r4 != 0) goto L_0x0111
            uw2 r4 = r11.x     // Catch:{ all -> 0x00a4 }
            w89 r4 = r4.c(r2)     // Catch:{ all -> 0x00a4 }
        L_0x0111:
            java.lang.String r7 = r4.c     // Catch:{ all -> 0x00a4 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a4 }
            r9 = 26
            if (r8 < r9) goto L_0x0149
            android.content.Context r8 = r2.b     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ all -> 0x00a4 }
            java.lang.String r9 = "com.android.vending"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x00a4 }
            if (r8 != 0) goto L_0x0149
            java.lang.String r8 = "com.google.android.gms.measurement#"
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x00a4 }
            if (r8 != 0) goto L_0x0149
            jm4 r8 = r2.a()     // Catch:{ all -> 0x00a4 }
            c49 r9 = new c49     // Catch:{ all -> 0x00a4 }
            r10 = 12
            r9.<init>(r2, r3, r7, r10)     // Catch:{ all -> 0x00a4 }
            com.google.common.util.concurrent.ListenableFuture r2 = r8.a(r9)     // Catch:{ all -> 0x00a4 }
            m89 r3 = new m89     // Catch:{ all -> 0x00a4 }
            r7 = 2
            r3.<init>((int) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x00a4 }
            fv1 r7 = defpackage.fv1.w     // Catch:{ all -> 0x00a4 }
            r2.a(r3, r7)     // Catch:{ all -> 0x00a4 }
        L_0x0149:
            java.lang.String r2 = "Invalid Phenotype flag value for flag "
            java.lang.String r3 = r11.w     // Catch:{ all -> 0x00a4 }
            ge2 r4 = r4.a()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r4 = r4.d     // Catch:{ all -> 0x00a4 }
            n36 r4 = (defpackage.n36) r4     // Catch:{ all -> 0x00a4 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x00a4 }
            if (r3 != 0) goto L_0x015c
            goto L_0x016f
        L_0x015c:
            java.lang.Object r1 = r11.c(r3)     // Catch:{ ClassCastException -> 0x0163, IOException -> 0x0161 }
            goto L_0x016f
        L_0x0161:
            r3 = move-exception
            goto L_0x0164
        L_0x0163:
            r3 = move-exception
        L_0x0164:
            java.lang.String r4 = "FilePhenotypeFlags"
            java.lang.String r7 = r11.w     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = r2.concat(r7)     // Catch:{ all -> 0x00a4 }
            android.util.Log.e(r4, r2, r3)     // Catch:{ all -> 0x00a4 }
        L_0x016f:
            boolean r0 = r0.b()     // Catch:{ all -> 0x00a4 }
            r2 = 1
            if (r2 != r0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r6 = r1
        L_0x0178:
            if (r6 != 0) goto L_0x017e
            java.lang.Object r6 = r11.a()     // Catch:{ all -> 0x00a4 }
        L_0x017e:
            if (r6 == 0) goto L_0x0185
            r11.e(r6)     // Catch:{ all -> 0x00a4 }
            r11.y = r5     // Catch:{ all -> 0x00a4 }
        L_0x0185:
            monitor-exit(r11)     // Catch:{ all -> 0x00a4 }
            goto L_0x018c
        L_0x0187:
            monitor-exit(r11)     // Catch:{ all -> 0x00a4 }
        L_0x0188:
            java.lang.Object r6 = r11.d()
        L_0x018c:
            r6.getClass()
            return r6
        L_0x0190:
            monitor-exit(r11)     // Catch:{ all -> 0x00a4 }
            throw r0
        L_0x0192:
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            throw r11
        L_0x0194:
            java.lang.Object r11 = defpackage.pd8.x
            monitor-enter(r11)
            monitor-exit(r11)     // Catch:{ all -> 0x019e }
            java.lang.String r11 = "Must call PhenotypeContext.setContext() first"
            defpackage.h.s(r11)
            return r1
        L_0x019e:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x019e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t79.get():java.lang.Object");
    }
}
