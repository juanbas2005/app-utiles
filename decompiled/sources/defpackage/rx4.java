package defpackage;

/* renamed from: rx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rx4 extends yp4 {
    public final yp4 o;
    public boolean p;

    public rx4(long j, mx6 mx6, vr2 vr2, vr2 vr22, yp4 yp4) {
        super(j, mx6, vr2, vr22);
        this.o = yp4;
        yp4.k();
    }

    public final void c() {
        if (!this.c) {
            super.c();
            if (!this.p) {
                this.p = true;
                this.o.l();
            }
        }
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final defpackage.f55 w() {
        /*
            r11 = this;
            yp4 r0 = r11.o
            boolean r1 = r0.m
            if (r1 != 0) goto L_0x000a
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x000d
        L_0x000a:
            r2 = r11
            goto L_0x00f8
        L_0x000d:
            up4 r5 = r11.h
            long r8 = r11.b
            r1 = 0
            if (r5 == 0) goto L_0x0024
            long r2 = r0.g()
            yp4 r0 = r11.o
            mx6 r0 = r0.d()
            java.util.HashMap r0 = defpackage.nx6.b(r2, r11, r0)
            r6 = r0
            goto L_0x0025
        L_0x0024:
            r6 = r1
        L_0x0025:
            java.lang.Object r10 = defpackage.nx6.c
            monitor-enter(r10)
            defpackage.nx6.c(r11)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0031
            int r0 = r5.d     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            r2 = r11
            goto L_0x0066
        L_0x0033:
            yp4 r0 = r11.o     // Catch:{ all -> 0x005a }
            long r3 = r0.g()     // Catch:{ all -> 0x005a }
            yp4 r0 = r11.o     // Catch:{ all -> 0x005a }
            mx6 r7 = r0.d()     // Catch:{ all -> 0x005a }
            r2 = r11
            f55 r11 = r2.z(r3, r5, r6, r7)     // Catch:{ all -> 0x005a }
            kx6 r0 = defpackage.kx6.i     // Catch:{ all -> 0x005a }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x004e
            monitor-exit(r10)
            return r11
        L_0x004e:
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            up4 r11 = r11.x()     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x005e
            r11.j(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0069
        L_0x005a:
            r0 = move-exception
            r11 = r0
            goto L_0x00f6
        L_0x005e:
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            r11.B(r5)     // Catch:{ all -> 0x005a }
            r2.h = r1     // Catch:{ all -> 0x005a }
            goto L_0x0069
        L_0x0066:
            r2.a()     // Catch:{ all -> 0x005a }
        L_0x0069:
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            long r0 = r11.g()     // Catch:{ all -> 0x005a }
            int r11 = defpackage.sg3.l(r0, r8)     // Catch:{ all -> 0x005a }
            if (r11 >= 0) goto L_0x007a
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            r11.v()     // Catch:{ all -> 0x005a }
        L_0x007a:
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            mx6 r0 = r11.d()     // Catch:{ all -> 0x005a }
            mx6 r0 = r0.g(r8)     // Catch:{ all -> 0x005a }
            mx6 r1 = r2.j     // Catch:{ all -> 0x005a }
            mx6 r0 = r0.f(r1)     // Catch:{ all -> 0x005a }
            r11.r(r0)     // Catch:{ all -> 0x005a }
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            r11.A(r8)     // Catch:{ all -> 0x005a }
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            int r0 = r2.d     // Catch:{ all -> 0x005a }
            r1 = -1
            r2.d = r1     // Catch:{ all -> 0x005a }
            if (r0 < 0) goto L_0x00ac
            int[] r1 = r11.k     // Catch:{ all -> 0x005a }
            r1.getClass()     // Catch:{ all -> 0x005a }
            int r3 = r1.length     // Catch:{ all -> 0x005a }
            int r4 = r3 + 1
            int[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch:{ all -> 0x005a }
            r1[r3] = r0     // Catch:{ all -> 0x005a }
            r11.k = r1     // Catch:{ all -> 0x005a }
            goto L_0x00af
        L_0x00ac:
            r11.getClass()     // Catch:{ all -> 0x005a }
        L_0x00af:
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            mx6 r0 = r2.j     // Catch:{ all -> 0x005a }
            r11.getClass()     // Catch:{ all -> 0x005a }
            monitor-enter(r10)     // Catch:{ all -> 0x005a }
            mx6 r1 = r11.j     // Catch:{ all -> 0x00f2 }
            mx6 r0 = r1.l(r0)     // Catch:{ all -> 0x00f2 }
            r11.j = r0     // Catch:{ all -> 0x00f2 }
            monitor-exit(r10)     // Catch:{ all -> 0x005a }
            yp4 r11 = r2.o     // Catch:{ all -> 0x005a }
            int[] r0 = r2.k     // Catch:{ all -> 0x005a }
            r11.getClass()     // Catch:{ all -> 0x005a }
            int r1 = r0.length     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x00cb
            goto L_0x00e0
        L_0x00cb:
            int[] r1 = r11.k     // Catch:{ all -> 0x005a }
            int r3 = r1.length     // Catch:{ all -> 0x005a }
            if (r3 != 0) goto L_0x00d1
            goto L_0x00de
        L_0x00d1:
            int r3 = r1.length     // Catch:{ all -> 0x005a }
            int r4 = r0.length     // Catch:{ all -> 0x005a }
            int r5 = r3 + r4
            int[] r1 = java.util.Arrays.copyOf(r1, r5)     // Catch:{ all -> 0x005a }
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r1, r3, r4)     // Catch:{ all -> 0x005a }
            r0 = r1
        L_0x00de:
            r11.k = r0     // Catch:{ all -> 0x005a }
        L_0x00e0:
            monitor-exit(r10)
            r11 = 1
            r2.m = r11
            boolean r0 = r2.p
            if (r0 != 0) goto L_0x00ef
            r2.p = r11
            yp4 r11 = r2.o
            r11.l()
        L_0x00ef:
            kx6 r11 = defpackage.kx6.i
            return r11
        L_0x00f2:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch:{ all -> 0x005a }
            throw r11     // Catch:{ all -> 0x005a }
        L_0x00f6:
            monitor-exit(r10)
            throw r11
        L_0x00f8:
            jx6 r11 = new jx6
            r11.<init>(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx4.w():f55");
    }
}
