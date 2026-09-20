package defpackage;

/* renamed from: ay8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ay8 {
    public static final Object f = new Object();
    public final String a;
    public final fs8 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ ay8(String str, Object obj, fs8 fs8) {
        this.a = str;
        this.c = obj;
        this.b = fs8;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0046 */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            ts2 r4 = defpackage.z85.c
            if (r4 != 0) goto L_0x000e
            java.lang.Object r3 = r3.c
            return r3
        L_0x000e:
            java.lang.Object r4 = f
            monitor-enter(r4)
            boolean r0 = defpackage.ts2.o()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.e     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0020
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r3 = move-exception
            goto L_0x0064
        L_0x0020:
            java.lang.Object r3 = r3.e     // Catch:{ all -> 0x001e }
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            return r3
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            java.util.List r4 = defpackage.by8.a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            ay8 r0 = (defpackage.ay8) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = defpackage.ts2.o()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            fs8 r2 = r0.b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r1 = r2.a()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.e = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
            fs8 r4 = r3.b
            if (r4 != 0) goto L_0x005f
        L_0x005c:
            java.lang.Object r3 = r3.c
            goto L_0x0063
        L_0x005f:
            java.lang.Object r3 = r4.a()     // Catch:{ IllegalStateException | SecurityException -> 0x005c }
        L_0x0063:
            return r3
        L_0x0064:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            throw r3
        L_0x0066:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay8.a(java.lang.Object):java.lang.Object");
    }
}
