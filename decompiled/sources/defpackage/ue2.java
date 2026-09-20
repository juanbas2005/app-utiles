package defpackage;

/* renamed from: ue2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ue2 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ ve2 x;

    public /* synthetic */ ue2(ve2 ve2, int i) {
        this.w = i;
        this.x = ve2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.w
            ve2 r10 = r10.x
            switch(r0) {
                case 0: goto L_0x0116;
                case 1: goto L_0x0112;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = defpackage.ve2.m
            monitor-enter(r0)
            oe2 r1 = r10.a     // Catch:{ all -> 0x0021 }
            r1.a()     // Catch:{ all -> 0x0021 }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x0021 }
            jz0 r1 = defpackage.jz0.c(r1)     // Catch:{ all -> 0x0021 }
            hv2 r2 = r10.c     // Catch:{ all -> 0x0109 }
            g10 r2 = r2.Y0()     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x0024
            r1.T()     // Catch:{ all -> 0x0021 }
            goto L_0x0024
        L_0x0021:
            r10 = move-exception
            goto L_0x0110
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            int r1 = r2.b     // Catch:{ FirebaseInstallationsException -> 0x0047 }
            r3 = 5
            r4 = 0
            r5 = 1
            if (r1 != r3) goto L_0x002e
            r6 = r5
            goto L_0x002f
        L_0x002e:
            r6 = r4
        L_0x002f:
            r7 = 3
            if (r6 != 0) goto L_0x004a
            if (r1 != r7) goto L_0x0036
            r1 = r5
            goto L_0x0037
        L_0x0036:
            r1 = r4
        L_0x0037:
            if (r1 == 0) goto L_0x003a
            goto L_0x004a
        L_0x003a:
            i18 r1 = r10.d     // Catch:{ FirebaseInstallationsException -> 0x0047 }
            boolean r1 = r1.a(r2)     // Catch:{ FirebaseInstallationsException -> 0x0047 }
            if (r1 == 0) goto L_0x0108
            g10 r1 = r10.b(r2)     // Catch:{ FirebaseInstallationsException -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            r0 = move-exception
            goto L_0x0105
        L_0x004a:
            g10 r1 = r10.g(r2)     // Catch:{ FirebaseInstallationsException -> 0x0047 }
        L_0x004e:
            monitor-enter(r0)
            oe2 r6 = r10.a     // Catch:{ all -> 0x0065 }
            r6.a()     // Catch:{ all -> 0x0065 }
            android.content.Context r6 = r6.a     // Catch:{ all -> 0x0065 }
            jz0 r6 = defpackage.jz0.c(r6)     // Catch:{ all -> 0x0065 }
            hv2 r8 = r10.c     // Catch:{ all -> 0x00fc }
            r8.R0(r1)     // Catch:{ all -> 0x00fc }
            if (r6 == 0) goto L_0x0068
            r6.T()     // Catch:{ all -> 0x0065 }
            goto L_0x0068
        L_0x0065:
            r10 = move-exception
            goto L_0x0103
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            monitor-enter(r10)
            int r0 = r1.b     // Catch:{ all -> 0x00c7 }
            r6 = 4
            if (r0 != r6) goto L_0x0071
            r0 = r5
            goto L_0x0072
        L_0x0071:
            r0 = r4
        L_0x0072:
            java.lang.String r8 = r1.a     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x008c
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = r2.a     // Catch:{ all -> 0x00c7 }
            boolean r0 = android.text.TextUtils.equals(r0, r8)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0086
            r4 = r5
            goto L_0x008c
        L_0x0086:
            int r0 = r2.b     // Catch:{ all -> 0x00c7 }
            if (r0 != r6) goto L_0x008b
            r4 = r5
        L_0x008b:
            r4 = r4 ^ r5
        L_0x008c:
            if (r4 == 0) goto L_0x00c9
            java.util.HashSet r0 = r10.k     // Catch:{ all -> 0x00c7 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c7 }
        L_0x0094:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00c7 }
            ye2 r2 = (defpackage.ye2) r2     // Catch:{ all -> 0x00c7 }
            com.google.firebase.messaging.FirebaseMessaging r2 = r2.a     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "FirebaseMessaging"
            md4 r8 = r2.d()     // Catch:{ all -> 0x00c7 }
            if (r8 != 0) goto L_0x00ab
            goto L_0x0094
        L_0x00ab:
            boolean r8 = android.util.Log.isLoggable(r4, r7)     // Catch:{ all -> 0x00c7 }
            if (r8 == 0) goto L_0x00b6
            java.lang.String r8 = "FID Change detected! Triggering re-sync"
            android.util.Log.d(r4, r8)     // Catch:{ all -> 0x00c7 }
        L_0x00b6:
            monitor-enter(r2)     // Catch:{ all -> 0x00c7 }
            boolean r4 = r2.k     // Catch:{ all -> 0x00c1 }
            if (r4 != 0) goto L_0x00c3
            r8 = 0
            r2.g(r8)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c3
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c5
        L_0x00c3:
            monitor-exit(r2)     // Catch:{ all -> 0x00c7 }
            goto L_0x0094
        L_0x00c5:
            monitor-exit(r2)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            goto L_0x00fa
        L_0x00c9:
            monitor-exit(r10)
            int r0 = r1.b
            if (r0 != r6) goto L_0x00d8
            java.lang.String r0 = r1.a
            monitor-enter(r10)
            r10.j = r0     // Catch:{ all -> 0x00d5 }
            monitor-exit(r10)
            goto L_0x00d8
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00d5 }
            throw r0
        L_0x00d8:
            int r0 = r1.b
            if (r0 != r3) goto L_0x00e5
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>()
            r10.h(r0)
            goto L_0x0108
        L_0x00e5:
            r2 = 2
            if (r0 == r2) goto L_0x00ef
            if (r0 != r5) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            r10.i(r1)
            goto L_0x0108
        L_0x00ef:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r0.<init>(r1)
            r10.h(r0)
            goto L_0x0108
        L_0x00fa:
            monitor-exit(r10)     // Catch:{ all -> 0x00c7 }
            throw r0
        L_0x00fc:
            r10 = move-exception
            if (r6 == 0) goto L_0x0102
            r6.T()     // Catch:{ all -> 0x0065 }
        L_0x0102:
            throw r10     // Catch:{ all -> 0x0065 }
        L_0x0103:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r10
        L_0x0105:
            r10.h(r0)
        L_0x0108:
            return
        L_0x0109:
            r10 = move-exception
            if (r1 == 0) goto L_0x010f
            r1.T()     // Catch:{ all -> 0x0021 }
        L_0x010f:
            throw r10     // Catch:{ all -> 0x0021 }
        L_0x0110:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r10
        L_0x0112:
            r10.a()
            return
        L_0x0116:
            r10.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue2.run():void");
    }
}
