package defpackage;

import java.net.URL;
import java.util.regex.Pattern;

/* renamed from: gm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gm0 {
    public long a;
    public int b;
    public final Object c;

    public gm0() {
        if (tz2.x == null) {
            Pattern pattern = i18.b;
            tz2.x = new tz2(11);
        }
        tz2 tz2 = tz2.x;
        if (i18.c == null) {
            i18.c = new i18(tz2);
        }
        this.c = i18.c;
    }

    public synchronized boolean a() {
        boolean z;
        if (this.b != 0) {
            ((i18) this.c).a.getClass();
            if (System.currentTimeMillis() <= this.a) {
                z = false;
            }
        }
        z = true;
        return z;
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void b(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 < r0) goto L_0x0009
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 < r0) goto L_0x006a
        L_0x0009:
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x006a
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x0012
            goto L_0x006a
        L_0x0012:
            int r0 = r6.b     // Catch:{ all -> 0x0065 }
            int r0 = r0 + 1
            r6.b = r0     // Catch:{ all -> 0x0065 }
            monitor-enter(r6)     // Catch:{ all -> 0x0065 }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x002b
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x0026
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x0053
        L_0x002b:
            int r7 = r6.b     // Catch:{ all -> 0x0067 }
            double r0 = (double) r7     // Catch:{ all -> 0x0067 }
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = r6.c     // Catch:{ all -> 0x0067 }
            i18 r7 = (defpackage.i18) r7     // Catch:{ all -> 0x0067 }
            r7.getClass()     // Catch:{ all -> 0x0067 }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x0067 }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch:{ all -> 0x0067 }
            double r2 = (double) r2     // Catch:{ all -> 0x0067 }
            double r0 = r0 + r2
            r2 = 4700481752852856832(0x413b774000000000, double:1800000.0)
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0067 }
            long r0 = (long) r0
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
        L_0x0053:
            java.lang.Object r7 = r6.c     // Catch:{ all -> 0x0065 }
            i18 r7 = (defpackage.i18) r7     // Catch:{ all -> 0x0065 }
            tz2 r7 = r7.a     // Catch:{ all -> 0x0065 }
            r7.getClass()     // Catch:{ all -> 0x0065 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0065 }
            long r2 = r2 + r0
            r6.a = r2     // Catch:{ all -> 0x0065 }
            monitor-exit(r6)
            return
        L_0x0065:
            r7 = move-exception
            goto L_0x0074
        L_0x0067:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0067 }
            throw r7     // Catch:{ all -> 0x0065 }
        L_0x006a:
            monitor-enter(r6)     // Catch:{ all -> 0x0065 }
            r7 = 0
            r6.b = r7     // Catch:{ all -> 0x0071 }
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
            monitor-exit(r6)
            return
        L_0x0071:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0071 }
            throw r7     // Catch:{ all -> 0x0065 }
        L_0x0074:
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm0.b(int):void");
    }

    public gm0(int i, URL url, long j) {
        this.b = i;
        this.c = url;
        this.a = j;
    }
}
