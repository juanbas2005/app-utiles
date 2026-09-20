package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cy6 {
    public boolean a;
    public long b;
    public Object c;
    public final Serializable d;
    public final ds2 e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;

    public cy6() {
        this.a = true;
        xb4 xb4 = u02.x;
        this.b = gl0.e0(10, y02.SECONDS);
        this.d = ub4.x;
        this.e = new nf6(25);
        this.f = new f96((pl3) pd8.b(new nf6(26)));
        this.g = kl1.a;
        this.h = (m25) m25.a.getValue();
        this.i = new ArrayList();
        this.j = new LinkedHashMap();
        String str = "realtime/v1";
        if (!d57.x0("https://jbkhreemmiagdyfssfep.supabase.co", str, false)) {
            str = "auth/v1";
            if (!d57.x0("https://jbkhreemmiagdyfssfep.supabase.co", str, false)) {
                str = "storage/v1";
                if (!d57.x0("https://jbkhreemmiagdyfssfep.supabase.co", str, false)) {
                    str = "rest/v1";
                    if (!d57.x0("https://jbkhreemmiagdyfssfep.supabase.co", str, false)) {
                        str = null;
                    }
                }
            }
        }
        if (str != null) {
            ku4.i(str, "), supabase-kt handles the url endpoints. If you want to use a custom url for a module, specify it within their builder but that's not necessary for normal Supabase projects", "The Supabase URL should not contain (");
            throw null;
        } else if (k57.u0("https://jbkhreemmiagdyfssfep.supabase.co", "http://", false)) {
            this.a = false;
        }
    }

    public static void d(cy6 cy6, q77 q77) {
        ot4 ot4 = new ot4(4);
        q77.getClass();
        Object f2 = q77.f(ot4);
        q77.l(cy6, f2);
        ((LinkedHashMap) cy6.j).put(q77.getKey(), new k77(0, (Object) q77, f2));
    }

    public void a() {
        synchronized (this.h) {
            eq4 eq4 = (eq4) this.g;
            Object[] objArr = eq4.w;
            int i2 = eq4.y;
            for (int i3 = 0; i3 < i2; i3++) {
                by6 by6 = (by6) objArr[i3];
                by6.e.a();
                by6.f.a();
                by6.l.a();
                by6.m.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085 A[Catch:{ all -> 0x0090 }] */
    public void b(oi6 oi6) {
        int i2;
        int i3;
        oi6 oi62 = oi6;
        synchronized (this.h) {
            try {
                eq4 eq4 = (eq4) this.g;
                int i4 = eq4.y;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    Object[] objArr = eq4.w;
                    if (i5 < i4) {
                        by6 by6 = (by6) objArr[i5];
                        hp4 hp4 = (hp4) by6.f.k(oi62);
                        if (hp4 != null) {
                            Object[] objArr2 = hp4.b;
                            int[] iArr = hp4.c;
                            long[] jArr = hp4.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j2 = jArr[i7];
                                    i2 = i5;
                                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j2 & 255) < 128) {
                                                int i10 = (i7 << 3) + i9;
                                                i3 = i9;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                by6.c(oi62, obj);
                                            } else {
                                                i3 = i9;
                                            }
                                            j2 >>= 8;
                                            i9 = i3 + 1;
                                        }
                                        if (i8 != 8) {
                                            break;
                                        }
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7++;
                                    i5 = i2;
                                }
                                if (by6.f.j()) {
                                    i6++;
                                } else if (i6 > 0) {
                                    Object[] objArr3 = eq4.w;
                                    objArr3[i2 - i6] = objArr3[i2];
                                }
                                i5 = i2 + 1;
                            }
                        }
                        i2 = i5;
                        if (by6.f.j()) {
                        }
                        i5 = i2 + 1;
                    } else {
                        int i12 = i4 - i6;
                        Arrays.fill(objArr, i12, i4, (Object) null);
                        eq4.y = i12;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    public boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.h) {
            z = this.a;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.d;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        set = list.get(1);
                    } else if (list.size() > 2) {
                        set = list.subList(1, list.size());
                    }
                    set2 = set3;
                    set = set;
                } else {
                    ey0.b("Unexpected notification");
                    ta1.e();
                    return false;
                }
                while (true) {
                    if (atomicReference.compareAndSet(obj, set)) {
                        set = set2;
                        break;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.h) {
                eq4 eq4 = (eq4) this.g;
                Object[] objArr = eq4.w;
                int i2 = eq4.y;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((by6) objArr[i3]).a(set) || z2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: by6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: by6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: eq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: eq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: by6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: eq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: eq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: eq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: eq4} */
    /* JADX WARNING: type inference failed for: r19v4 */
    /* JADX WARNING: type inference failed for: r19v16 */
    /* JADX WARNING: type inference failed for: r19v18 */
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public void e(java.lang.Object r27, defpackage.vr2 r28, defpackage.sr2 r29) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            long r3 = defpackage.jb5.f()
            java.lang.Object r5 = r1.h
            monitor-enter(r5)
            java.lang.Object r6 = r1.g     // Catch:{ all -> 0x022a }
            eq4 r6 = (defpackage.eq4) r6     // Catch:{ all -> 0x022a }
            java.lang.Object[] r7 = r6.w     // Catch:{ all -> 0x022a }
            int r8 = r6.y     // Catch:{ all -> 0x022a }
            r10 = 0
        L_0x0016:
            if (r10 >= r8) goto L_0x0025
            r12 = r7[r10]     // Catch:{ all -> 0x022a }
            r13 = r12
            by6 r13 = (defpackage.by6) r13     // Catch:{ all -> 0x022a }
            vr2 r13 = r13.a     // Catch:{ all -> 0x022a }
            if (r13 != r2) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            int r10 = r10 + 1
            goto L_0x0016
        L_0x0025:
            r12 = 0
        L_0x0026:
            by6 r12 = (defpackage.by6) r12     // Catch:{ all -> 0x022a }
            r7 = 1
            if (r12 != 0) goto L_0x0039
            by6 r12 = new by6     // Catch:{ all -> 0x022a }
            r2.getClass()     // Catch:{ all -> 0x022a }
            defpackage.mp7.Q(r7, r2)     // Catch:{ all -> 0x022a }
            r12.<init>(r2)     // Catch:{ all -> 0x022a }
            r6.b(r12)     // Catch:{ all -> 0x022a }
        L_0x0039:
            java.lang.Object r2 = r1.j     // Catch:{ all -> 0x022a }
            by6 r2 = (defpackage.by6) r2     // Catch:{ all -> 0x022a }
            long r13 = r1.b     // Catch:{ all -> 0x022a }
            monitor-exit(r5)
            r5 = -1
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0072
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x004b
            goto L_0x0072
        L_0x004b:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            java.lang.String r8 = "), currentThread={id="
            java.lang.StringBuilder r6 = defpackage.hl6.q(r13, r6, r8)
            r6.append(r3)
            java.lang.String r8 = ", name="
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.vm5.a(r5)
        L_0x0072:
            java.lang.Object r5 = r1.h     // Catch:{ all -> 0x00a4 }
            monitor-enter(r5)     // Catch:{ all -> 0x00a4 }
            r1.j = r12     // Catch:{ all -> 0x021a }
            r1.b = r3     // Catch:{ all -> 0x021a }
            monitor-exit(r5)     // Catch:{ all -> 0x00a4 }
            java.lang.Object r3 = r1.f     // Catch:{ all -> 0x00a4 }
            ay5 r3 = (defpackage.ay5) r3     // Catch:{ all -> 0x00a4 }
            java.lang.Object r4 = r12.b     // Catch:{ all -> 0x00a4 }
            hp4 r5 = r12.c     // Catch:{ all -> 0x00a4 }
            int r6 = r12.d     // Catch:{ all -> 0x00a4 }
            r12.b = r0     // Catch:{ all -> 0x00a4 }
            tp4 r8 = r12.f     // Catch:{ all -> 0x00a4 }
            java.lang.Object r0 = r8.g(r0)     // Catch:{ all -> 0x00a4 }
            hp4 r0 = (defpackage.hp4) r0     // Catch:{ all -> 0x00a4 }
            r12.c = r0     // Catch:{ all -> 0x00a4 }
            int r0 = r12.d     // Catch:{ all -> 0x00a4 }
            r8 = -1
            if (r0 != r8) goto L_0x00a8
            ix6 r0 = defpackage.nx6.j()     // Catch:{ all -> 0x00a4 }
            long r15 = r0.g()     // Catch:{ all -> 0x00a4 }
            int r0 = java.lang.Long.hashCode(r15)     // Catch:{ all -> 0x00a4 }
            r12.d = r0     // Catch:{ all -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r0 = move-exception
            r6 = r13
            goto L_0x021e
        L_0x00a8:
            xt2 r0 = r12.i     // Catch:{ all -> 0x00a4 }
            eq4 r8 = defpackage.u55.h()     // Catch:{ all -> 0x00a4 }
            r8.b(r0)     // Catch:{ all -> 0x00ba }
            if (r3 != 0) goto L_0x00c0
            r29.b()     // Catch:{ all -> 0x00ba }
            r28 = r12
            goto L_0x0142
        L_0x00ba:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L_0x0210
        L_0x00c0:
            cf4 r0 = defpackage.nx6.b     // Catch:{ all -> 0x00ba }
            java.lang.Object r0 = r0.f()     // Catch:{ all -> 0x00ba }
            r10 = r0
            ix6 r10 = (defpackage.ix6) r10     // Catch:{ all -> 0x00ba }
            boolean r0 = r10 instanceof defpackage.ym7     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x010c
            r0 = r10
            ym7 r0 = (defpackage.ym7) r0     // Catch:{ all -> 0x00ba }
            r28 = r12
            long r11 = r0.t     // Catch:{ all -> 0x00ba }
            long r16 = defpackage.jb5.f()     // Catch:{ all -> 0x00ba }
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x010e
            r0 = r10
            ym7 r0 = (defpackage.ym7) r0     // Catch:{ all -> 0x00ba }
            vr2 r11 = r0.r     // Catch:{ all -> 0x00ba }
            r0 = r10
            ym7 r0 = (defpackage.ym7) r0     // Catch:{ all -> 0x00ba }
            vr2 r12 = r0.s     // Catch:{ all -> 0x00ba }
            r0 = r10
            ym7 r0 = (defpackage.ym7) r0     // Catch:{ all -> 0x0101 }
            vr2 r3 = defpackage.nx6.k(r3, r11, r7)     // Catch:{ all -> 0x0101 }
            r0.r = r3     // Catch:{ all -> 0x0101 }
            r0 = r10
            ym7 r0 = (defpackage.ym7) r0     // Catch:{ all -> 0x0101 }
            r0.s = r12     // Catch:{ all -> 0x0101 }
            r29.b()     // Catch:{ all -> 0x0101 }
            r0 = r10
            ym7 r0 = (defpackage.ym7) r0     // Catch:{ all -> 0x00ba }
            r0.r = r11     // Catch:{ all -> 0x00ba }
            ym7 r10 = (defpackage.ym7) r10     // Catch:{ all -> 0x00ba }
            r10.s = r12     // Catch:{ all -> 0x00ba }
            goto L_0x0142
        L_0x0101:
            r0 = move-exception
            r3 = r10
            ym7 r3 = (defpackage.ym7) r3     // Catch:{ all -> 0x00ba }
            r3.r = r11     // Catch:{ all -> 0x00ba }
            ym7 r10 = (defpackage.ym7) r10     // Catch:{ all -> 0x00ba }
            r10.s = r12     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x010c:
            r28 = r12
        L_0x010e:
            if (r10 == 0) goto L_0x0114
            boolean r0 = r10 instanceof defpackage.yp4     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0116
        L_0x0114:
            r0 = 0
            goto L_0x011c
        L_0x0116:
            ix6 r0 = r10.u(r3)     // Catch:{ all -> 0x00ba }
            r15 = r0
            goto L_0x0135
        L_0x011c:
            ym7 r15 = new ym7     // Catch:{ all -> 0x00ba }
            boolean r11 = r10 instanceof defpackage.yp4     // Catch:{ all -> 0x00ba }
            if (r11 == 0) goto L_0x0128
            r11 = r10
            yp4 r11 = (defpackage.yp4) r11     // Catch:{ all -> 0x00ba }
            r16 = r11
            goto L_0x012a
        L_0x0128:
            r16 = r0
        L_0x012a:
            r19 = 1
            r20 = 0
            r18 = 0
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00ba }
        L_0x0135:
            ix6 r3 = r15.j()     // Catch:{ all -> 0x01fd }
            r29.b()     // Catch:{ all -> 0x0202 }
            defpackage.ix6.q(r3)     // Catch:{ all -> 0x01fd }
            r15.c()     // Catch:{ all -> 0x00ba }
        L_0x0142:
            int r0 = r8.y     // Catch:{ all -> 0x00a4 }
            int r0 = r0 - r7
            r8.l(r0)     // Catch:{ all -> 0x00a4 }
            r12 = r28
            java.lang.Object r0 = r12.b     // Catch:{ all -> 0x00a4 }
            r0.getClass()     // Catch:{ all -> 0x00a4 }
            int r3 = r12.d     // Catch:{ all -> 0x00a4 }
            hp4 r8 = r12.c     // Catch:{ all -> 0x00a4 }
            if (r8 == 0) goto L_0x01de
            long[] r10 = r8.a     // Catch:{ all -> 0x01e1 }
            int r11 = r10.length     // Catch:{ all -> 0x01e1 }
            int r11 = r11 + -2
            if (r11 < 0) goto L_0x01de
            r17 = r10
            r15 = 0
        L_0x015f:
            r9 = r17[r15]     // Catch:{ all -> 0x01e1 }
            r18 = r7
            r19 = r8
            long r7 = ~r9     // Catch:{ all -> 0x01e1 }
            r20 = 7
            long r7 = r7 << r20
            long r7 = r7 & r9
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x01d0
            int r7 = r15 - r11
            int r7 = ~r7     // Catch:{ all -> 0x01e1 }
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r27 = r8
            r8 = 0
        L_0x0182:
            if (r8 >= r7) goto L_0x01c7
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r9 & r20
            r22 = 128(0x80, double:6.3E-322)
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 >= 0) goto L_0x01b3
            int r20 = r15 << 3
            r21 = r8
            int r8 = r20 + r21
            r28 = r9
            r9 = r19
            java.lang.Object[] r10 = r9.b     // Catch:{ all -> 0x01e1 }
            r10 = r10[r8]     // Catch:{ all -> 0x01e1 }
            r19 = r13
            int[] r13 = r9.c     // Catch:{ all -> 0x01f9 }
            r13 = r13[r8]     // Catch:{ all -> 0x01f9 }
            if (r13 == r3) goto L_0x01a7
            r13 = r18
            goto L_0x01a8
        L_0x01a7:
            r13 = 0
        L_0x01a8:
            if (r13 == 0) goto L_0x01ad
            r12.c(r0, r10)     // Catch:{ all -> 0x01f9 }
        L_0x01ad:
            if (r13 == 0) goto L_0x01bb
            r9.f(r8)     // Catch:{ all -> 0x01f9 }
            goto L_0x01bb
        L_0x01b3:
            r21 = r8
            r28 = r9
            r9 = r19
            r19 = r13
        L_0x01bb:
            long r13 = r28 >> r27
            int r8 = r21 + 1
            r24 = r19
            r19 = r9
            r9 = r13
            r13 = r24
            goto L_0x0182
        L_0x01c7:
            r8 = r27
            r9 = r19
            r19 = r13
            if (r7 != r8) goto L_0x01e5
            goto L_0x01d4
        L_0x01d0:
            r9 = r19
            r19 = r13
        L_0x01d4:
            if (r15 == r11) goto L_0x01e5
            int r15 = r15 + 1
            r8 = r9
            r7 = r18
            r13 = r19
            goto L_0x015f
        L_0x01de:
            r19 = r13
            goto L_0x01e5
        L_0x01e1:
            r0 = move-exception
            r19 = r13
            goto L_0x01fa
        L_0x01e5:
            r12.b = r4     // Catch:{ all -> 0x01f9 }
            r12.c = r5     // Catch:{ all -> 0x01f9 }
            r12.d = r6     // Catch:{ all -> 0x01f9 }
            java.lang.Object r3 = r1.h
            monitor-enter(r3)
            r1.j = r2     // Catch:{ all -> 0x01f6 }
            r6 = r19
            r1.b = r6     // Catch:{ all -> 0x01f6 }
            monitor-exit(r3)
            return
        L_0x01f6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01f9:
            r0 = move-exception
        L_0x01fa:
            r6 = r19
            goto L_0x021e
        L_0x01fd:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L_0x020b
        L_0x0202:
            r0 = move-exception
            r18 = r7
            r6 = r13
            defpackage.ix6.q(r3)     // Catch:{ all -> 0x020a }
            throw r0     // Catch:{ all -> 0x020a }
        L_0x020a:
            r0 = move-exception
        L_0x020b:
            r15.c()     // Catch:{ all -> 0x020f }
            throw r0     // Catch:{ all -> 0x020f }
        L_0x020f:
            r0 = move-exception
        L_0x0210:
            int r3 = r8.y     // Catch:{ all -> 0x0218 }
            int r3 = r3 + -1
            r8.l(r3)     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x0218:
            r0 = move-exception
            goto L_0x021e
        L_0x021a:
            r0 = move-exception
            r6 = r13
            monitor-exit(r5)     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x021e:
            java.lang.Object r3 = r1.h
            monitor-enter(r3)
            r1.j = r2     // Catch:{ all -> 0x0227 }
            r1.b = r6     // Catch:{ all -> 0x0227 }
            monitor-exit(r3)
            throw r0
        L_0x0227:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x022a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy6.e(java.lang.Object, vr2, sr2):void");
    }

    public void f() {
        ph6 ph6 = (ph6) this.e;
        nx6.e(nx6.a);
        synchronized (nx6.c) {
            nx6.h = dt0.N0(nx6.h, ph6);
        }
        this.i = new c9(16, ph6);
    }

    public cy6(vr2 vr2) {
        this.c = vr2;
        this.d = new AtomicReference((Object) null);
        this.e = new ph6(9, this);
        this.f = new ay5(16, (Object) this);
        this.g = new eq4(new by6[16]);
        this.h = new Object();
        this.b = -1;
    }
}
