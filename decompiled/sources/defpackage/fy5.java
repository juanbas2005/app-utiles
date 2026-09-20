package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: fy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fy5 extends a97 implements hs2 {
    public List A;
    public List B;
    public List C;
    public up4 D;
    public up4 E;
    public up4 F;
    public Set G;
    public up4 H;
    public int I;
    public /* synthetic */ gj J;
    public final /* synthetic */ gy5 K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy5(gy5 gy5, f61 f61) {
        super(3, f61);
        this.K = gy5;
    }

    public static final void v(gy5 gy5, List list, List list2, List list3, up4 up4, up4 up42, up4 up43, up4 up44) {
        long j;
        long j2;
        char c;
        gy5 gy52 = gy5;
        up4 up45 = up4;
        up4 up46 = up42;
        up4 up47 = up44;
        synchronized (gy52.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    py0 py0 = (py0) list3.get(i);
                    py0.a();
                    gy52.P(py0);
                }
                list3.clear();
                Object[] objArr = up45.b;
                long[] jArr = up45.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j2 = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    py0 py02 = (py0) objArr[(i2 << 3) + i4];
                                    py02.a();
                                    gy52.P(py02);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    c = 7;
                    j2 = 255;
                    j = -9187201950435737472L;
                }
                up45.b();
                Object[] objArr2 = up46.b;
                long[] jArr2 = up46.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j) != j) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j2) < 128) {
                                    ((py0) objArr2[(i5 << 3) + i7]).i();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                    }
                }
                up46.b();
                up43.b();
                Object[] objArr3 = up47.b;
                long[] jArr3 = up47.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j) != j) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j2) < 128) {
                                    py0 py03 = (py0) objArr3[(i8 << 3) + i10];
                                    py03.a();
                                    gy52.P(py03);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        }
                        i8++;
                    }
                }
                up47.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void x(List list, gy5 gy5) {
        list.clear();
        synchronized (gy5.c) {
            try {
                ArrayList arrayList = gy5.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((hn4) arrayList.get(i));
                }
                gy5.k.clear();
            } catch (Throwable th) {
                throw th;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object s(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            p81 r1 = defpackage.p81.w
            int r2 = r0.I
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002d
            up4 r2 = r0.H
            java.util.Set r6 = r0.G
            java.util.Set r6 = (java.util.Set) r6
            up4 r7 = r0.F
            up4 r8 = r0.E
            up4 r9 = r0.D
            java.util.List r10 = r0.C
            java.util.List r11 = r0.B
            java.util.List r12 = r0.A
            gj r13 = r0.J
            defpackage.o85.q(r23)
            r21 = r13
            r13 = r2
            r2 = r21
            goto L_0x012c
        L_0x002d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            return r3
        L_0x0033:
            up4 r2 = r0.H
            java.util.Set r6 = r0.G
            java.util.Set r6 = (java.util.Set) r6
            up4 r7 = r0.F
            up4 r8 = r0.E
            up4 r9 = r0.D
            java.util.List r10 = r0.C
            java.util.List r11 = r0.B
            java.util.List r12 = r0.A
            gj r13 = r0.J
            defpackage.o85.q(r23)
            r14 = r9
            r9 = r2
            r2 = r13
            r13 = r10
            r10 = r12
            r12 = r14
        L_0x0050:
            r15 = r6
            r14 = r8
            r8 = r7
            goto L_0x00f5
        L_0x0055:
            defpackage.o85.q(r23)
            gj r2 = r0.J
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            up4 r9 = defpackage.cg6.a
            up4 r9 = new up4
            r9.<init>()
            up4 r10 = new up4
            r10.<init>()
            up4 r11 = new up4
            r11.<init>()
            dg6 r12 = new dg6
            r12.<init>(r11)
            up4 r13 = new up4
            r13.<init>()
            r21 = r12
            r12 = r6
            r6 = r21
            r21 = r11
            r11 = r7
            r7 = r21
            r21 = r10
            r10 = r8
            r8 = r21
        L_0x0093:
            gy5 r14 = r0.K
            java.lang.Object r14 = r14.c
            monitor-enter(r14)
            monitor-exit(r14)
            gy5 r14 = r0.K
            r0.J = r2
            r0.A = r12
            r0.B = r11
            r0.C = r10
            r0.D = r9
            r0.E = r8
            r0.F = r7
            r15 = r6
            java.util.Set r15 = (java.util.Set) r15
            r0.G = r15
            r0.H = r13
            r0.I = r5
            boolean r15 = r14.G()
            if (r15 != 0) goto L_0x00e9
            kk0 r15 = new kk0
            f61 r3 = defpackage.rc9.a0(r0)
            r15.<init>(r5, r3)
            r15.v()
            java.lang.Object r3 = r14.c
            monitor-enter(r3)
            boolean r16 = r14.G()     // Catch:{ all -> 0x00e6 }
            if (r16 == 0) goto L_0x00cf
            r14 = r15
            goto L_0x00d2
        L_0x00cf:
            r14.r = r15     // Catch:{ all -> 0x00e6 }
            r14 = 0
        L_0x00d2:
            monitor-exit(r3)
            if (r14 == 0) goto L_0x00da
            vs7 r3 = defpackage.vs7.a
            r14.f(r3)
        L_0x00da:
            java.lang.Object r3 = r15.t()
            p81 r14 = defpackage.p81.w
            if (r3 != r14) goto L_0x00e3
            goto L_0x00eb
        L_0x00e3:
            vs7 r3 = defpackage.vs7.a
            goto L_0x00eb
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00e9:
            vs7 r3 = defpackage.vs7.a
        L_0x00eb:
            if (r3 != r1) goto L_0x00ee
            goto L_0x0123
        L_0x00ee:
            r14 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r14
            goto L_0x0050
        L_0x00f5:
            gy5 r3 = r0.K
            d37 r6 = defpackage.gy5.z
            boolean r3 = r3.O()
            if (r3 == 0) goto L_0x0221
            gy5 r7 = r0.K
            ey5 r6 = new ey5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.J = r2
            r0.A = r10
            r0.B = r11
            r0.C = r13
            r0.D = r12
            r0.E = r14
            r0.F = r8
            r3 = r15
            java.util.Set r3 = (java.util.Set) r3
            r0.G = r3
            r0.H = r9
            r0.I = r4
            java.lang.Object r3 = r2.a(r6, r0)
            if (r3 != r1) goto L_0x0124
        L_0x0123:
            return r1
        L_0x0124:
            r6 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r6
            r7 = r8
            r8 = r14
            r6 = r15
        L_0x012c:
            gy5 r3 = r0.K
            java.lang.Object r14 = r3.c
            monitor-enter(r14)
            tp4 r15 = r3.l     // Catch:{ all -> 0x018a }
            boolean r15 = r15.j()     // Catch:{ all -> 0x018a }
            if (r15 == 0) goto L_0x0195
            tp4 r15 = r3.l     // Catch:{ all -> 0x018a }
            lp4 r15 = defpackage.co4.d(r15)     // Catch:{ all -> 0x018a }
            tp4 r5 = r3.l     // Catch:{ all -> 0x018a }
            r5.a()     // Catch:{ all -> 0x018a }
            hv2 r5 = r3.m     // Catch:{ all -> 0x018a }
            java.lang.Object r4 = r5.y     // Catch:{ all -> 0x018a }
            tp4 r4 = (defpackage.tp4) r4     // Catch:{ all -> 0x018a }
            r4.a()     // Catch:{ all -> 0x018a }
            java.lang.Object r4 = r5.x     // Catch:{ all -> 0x018a }
            tp4 r4 = (defpackage.tp4) r4     // Catch:{ all -> 0x018a }
            r4.a()     // Catch:{ all -> 0x018a }
            tp4 r4 = r3.o     // Catch:{ all -> 0x018a }
            r4.a()     // Catch:{ all -> 0x018a }
            lp4 r4 = new lp4     // Catch:{ all -> 0x018a }
            int r5 = r15.b     // Catch:{ all -> 0x018a }
            r4.<init>(r5)     // Catch:{ all -> 0x018a }
            java.lang.Object[] r5 = r15.a     // Catch:{ all -> 0x018a }
            int r15 = r15.b     // Catch:{ all -> 0x018a }
            r17 = r1
            r1 = 0
        L_0x0167:
            if (r1 >= r15) goto L_0x018d
            r18 = r5[r1]     // Catch:{ all -> 0x018a }
            r19 = r1
            r1 = r18
            hn4 r1 = (defpackage.hn4) r1     // Catch:{ all -> 0x018a }
            r18 = r2
            tp4 r2 = r3.n     // Catch:{ all -> 0x018a }
            java.lang.Object r2 = r2.g(r1)     // Catch:{ all -> 0x018a }
            r20 = r5
            yb5 r5 = new yb5     // Catch:{ all -> 0x018a }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x018a }
            r4.a(r5)     // Catch:{ all -> 0x018a }
            int r1 = r19 + 1
            r2 = r18
            r5 = r20
            goto L_0x0167
        L_0x018a:
            r0 = move-exception
            goto L_0x021f
        L_0x018d:
            r18 = r2
            tp4 r1 = r3.n     // Catch:{ all -> 0x018a }
            r1.a()     // Catch:{ all -> 0x018a }
            goto L_0x019e
        L_0x0195:
            r17 = r1
            r18 = r2
            lp4 r4 = defpackage.w25.b     // Catch:{ all -> 0x018a }
            r4.getClass()     // Catch:{ all -> 0x018a }
        L_0x019e:
            monitor-exit(r14)
            java.lang.Object[] r1 = r4.a
            int r2 = r4.b
            r3 = 0
        L_0x01a4:
            if (r3 >= r2) goto L_0x01fb
            r4 = r1[r3]
            yb5 r4 = (defpackage.yb5) r4
            java.lang.Object r5 = r4.w
            hn4 r5 = (defpackage.hn4) r5
            java.lang.Object r4 = r4.x
            gn4 r4 = (defpackage.gn4) r4
            if (r4 == 0) goto L_0x01f2
            py0 r5 = r5.c
            u36 r14 = r5.Q
            wp4 r15 = r5.A
            yt2 r5 = r5.R
            ny0 r5 = r5.D()
            r14.g(r15, r5)     // Catch:{ all -> 0x01e4 }
            gv6 r4 = r4.a     // Catch:{ all -> 0x01e4 }
            jv6 r4 = r4.o()     // Catch:{ all -> 0x01e4 }
            int r5 = r4.t     // Catch:{ all -> 0x01e8 }
            yg r15 = new yg     // Catch:{ all -> 0x01e8 }
            r19 = r1
            r1 = 2
            r15.<init>(r1, r14)     // Catch:{ all -> 0x01e8 }
            r4.n(r5, r15)     // Catch:{ all -> 0x01e8 }
            r4.J()     // Catch:{ all -> 0x01e8 }
            r5 = 1
            r4.e(r5)     // Catch:{ all -> 0x01e4 }
            r14.c()     // Catch:{ all -> 0x01e4 }
            r14.a()
            goto L_0x01f6
        L_0x01e4:
            r0 = move-exception
            goto L_0x01ee
        L_0x01e6:
            r1 = 0
            goto L_0x01ea
        L_0x01e8:
            r0 = move-exception
            goto L_0x01e6
        L_0x01ea:
            r4.e(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01ee:
            r14.a()
            throw r0
        L_0x01f2:
            r19 = r1
            r1 = 2
            r5 = 1
        L_0x01f6:
            int r3 = r3 + 1
            r1 = r19
            goto L_0x01a4
        L_0x01fb:
            r1 = 2
            r5 = 1
            gy5 r2 = r0.K
            cf4 r2 = r2.b
            java.lang.Object r3 = r2.x
            yt r3 = (defpackage.yt) r3
            r4 = 0
            r3.set(r4)
            java.lang.Object r2 = r2.y
            o9 r2 = (defpackage.o9) r2
            ot4 r3 = new ot4
            r4 = 17
            r3.<init>((int) r4)
            r2.w(r3)
            r4 = r1
            r1 = r17
            r2 = r18
        L_0x021c:
            r3 = 0
            goto L_0x0093
        L_0x021f:
            monitor-exit(r14)
            throw r0
        L_0x0221:
            r3 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r3
            r7 = r8
            r8 = r14
            r6 = r15
            goto L_0x021c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy5.s(java.lang.Object):java.lang.Object");
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        o81 o81 = (o81) obj;
        fy5 fy5 = new fy5(this.K, (f61) obj3);
        fy5.J = (gj) obj2;
        fy5.s(vs7.a);
        return p81.w;
    }
}
