package defpackage;

import java.util.List;

/* renamed from: rj2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rj2 implements in4, aa6 {
    public final tr a;
    public final vr b;
    public final float c;
    public final ec1 d;
    public final float e;
    public final pj2 f;

    public rj2(tr trVar, vr vrVar, float f2, ec1 ec1, float f3, pj2 pj2) {
        this.a = trVar;
        this.b = vrVar;
        this.c = f2;
        this.d = ec1;
        this.e = f3;
        this.f = pj2;
    }

    public static int k(List list, int i, int i2, int i3, pj2 pj2) {
        int i4;
        int i5;
        boolean z;
        ie3 ie3;
        int i6;
        boolean z2;
        ie3 ie32;
        int i7;
        boolean z3;
        int i8;
        List list2 = list;
        int i9 = i;
        long a2 = ie3.a(0, 0);
        if (!list2.isEmpty()) {
            int i10 = Integer.MAX_VALUE;
            mj2 mj2 = new mj2(pj2, m31.a(0, i9, 0, Integer.MAX_VALUE), i2, i3);
            gh4 gh4 = (gh4) dt0.z0(0, list2);
            if (gh4 != null) {
                i4 = gh4.W(i9);
            } else {
                i4 = 0;
            }
            if (gh4 != null) {
                i5 = gh4.l(i4);
            } else {
                i5 = 0;
            }
            boolean z4 = true;
            if (list2.size() > 1) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            long a3 = ie3.a(i9, Integer.MAX_VALUE);
            long j = a2;
            if (gh4 == null) {
                ie3 = null;
            } else {
                ie3 = new ie3(ie3.a(i5, i4));
            }
            int i11 = 0;
            if (mj2.b(z4, 0, a3, ie3, 0, 0, 0, false, false).b) {
                pj2.getClass();
                a2 = j;
            } else {
                int size = list2.size();
                int i12 = i9;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    int i18 = i12 - i5;
                    int i19 = i15 + 1;
                    int max = Math.max(i14, i4);
                    gh4 gh42 = (gh4) dt0.z0(i19, list2);
                    if (gh42 != null) {
                        i8 = gh42.W(i9);
                    } else {
                        i8 = 0;
                    }
                    if (gh42 != null) {
                        i6 = gh42.l(i4) + i2;
                    } else {
                        i6 = 0;
                    }
                    if (i15 + 2 < list2.size()) {
                        i15 = i19;
                        z2 = z;
                    } else {
                        i15 = i19;
                        z2 = false;
                    }
                    int i20 = i15 - i17;
                    int i21 = i13;
                    long a4 = ie3.a(i18, i10);
                    if (gh42 == null) {
                        ie32 = null;
                    } else {
                        ie32 = new ie3(ie3.a(i6, i4));
                    }
                    int i22 = i6;
                    int i23 = i20;
                    lj2 b2 = mj2.b(z2, i23, a4, ie32, i21, i11, max, false, false);
                    if (b2.a) {
                        int i24 = max + i3 + i11;
                        int i25 = i21;
                        int i26 = i23;
                        if (gh42 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        mj2.a(b2, z3, i25, i24, i18, i26);
                        int i27 = i22 - i2;
                        i13 = i25 + 1;
                        if (b2.b) {
                            i16 = i15;
                            i11 = i24;
                            break;
                        }
                        i12 = i9;
                        i17 = i15;
                        i7 = i27;
                        i11 = i24;
                        i14 = 0;
                    } else {
                        int i28 = i18;
                        i7 = i22;
                        i12 = i28;
                        i13 = i21;
                        i14 = max;
                    }
                    i16 = i15;
                    i10 = Integer.MAX_VALUE;
                    z = true;
                }
                a2 = ie3.a(i11 - i3, i16);
            }
        }
        return (int) (a2 >> 32);
    }

    public final int a(kg3 kg3, List list, int i) {
        gh4 gh4;
        List list2 = (List) dt0.z0(1, list);
        gh4 gh42 = null;
        if (list2 != null) {
            gh4 = (gh4) dt0.y0(list2);
        } else {
            gh4 = null;
        }
        List list3 = (List) dt0.z0(2, list);
        if (list3 != null) {
            gh42 = (gh4) dt0.y0(list3);
        }
        this.f.a(gh4, gh42, m31.b(0, 0, 0, i, 7));
        List list4 = (List) dt0.y0(list);
        if (list4 == null) {
            list4 = a42.w;
        }
        int r0 = kg3.r0(this.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int v = ((gh4) list4.get(i2)).v(i) + r0;
            int i6 = i2 + 1;
            if (i6 - i4 == Integer.MAX_VALUE || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + v) - r0);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += v;
            }
            i2 = i6;
        }
        return i3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x03c3: MOVE  (r15v1 int) = (r56v4 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03ab A[LOOP:1: B:112:0x03a9->B:113:0x03ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0133 A[SYNTHETIC, Splitter:B:34:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0268 A[SYNTHETIC, Splitter:B:67:0x0268] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x031b  */
    public final defpackage.mh4 b(defpackage.oh4 r53, java.util.List r54, long r55) {
        /*
            r52 = this;
            r0 = r52
            r6 = r53
            r1 = r54
            r2 = r55
            r4 = r1
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            r5 = 20
            b42 r13 = defpackage.b42.w
            r14 = 0
            if (r4 != 0) goto L_0x0021
            int r4 = defpackage.k31.g(r2)
            pj2 r7 = r0.f
            if (r4 != 0) goto L_0x0024
            r7.getClass()
        L_0x0021:
            r1 = r13
            goto L_0x0488
        L_0x0024:
            java.lang.Object r4 = defpackage.dt0.w0(r1)
            java.util.List r4 = (java.util.List) r4
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x003a
            vd2 r0 = new vd2
            r0.<init>((int) r5)
            mh4 r0 = r6.d0(r14, r14, r13, r0)
            return r0
        L_0x003a:
            r15 = 1
            java.lang.Object r5 = defpackage.dt0.z0(r15, r1)
            java.util.List r5 = (java.util.List) r5
            r16 = 0
            if (r5 == 0) goto L_0x004c
            java.lang.Object r5 = defpackage.dt0.y0(r5)
            gh4 r5 = (defpackage.gh4) r5
            goto L_0x004e
        L_0x004c:
            r5 = r16
        L_0x004e:
            r8 = 2
            java.lang.Object r1 = defpackage.dt0.z0(r8, r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = defpackage.dt0.y0(r1)
            gh4 r1 = (defpackage.gh4) r1
            goto L_0x0060
        L_0x005e:
            r1 = r16
        L_0x0060:
            r4.size()
            r7.getClass()
            jz3 r7 = defpackage.jz3.w
            long r9 = defpackage.b85.i(r2, r7)
            r11 = 10
            long r9 = defpackage.b85.j(r9, r11)
            long r9 = defpackage.b85.t(r9)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            if (r5 == 0) goto L_0x00a6
            ba6 r17 = defpackage.c35.i(r5)
            float r17 = defpackage.c35.j(r17)
            int r17 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r17 != 0) goto L_0x009c
            defpackage.c35.i(r5)
            eh5 r5 = r5.y(r9)
            r5.b0()
            r5.Z()
            r5.b0()
            r5.Z()
            goto L_0x00a6
        L_0x009c:
            r17 = r8
            int r8 = r5.l(r11)
            r5.W(r8)
            goto L_0x00a8
        L_0x00a6:
            r17 = r8
        L_0x00a8:
            if (r1 == 0) goto L_0x00d1
            ba6 r5 = defpackage.c35.i(r1)
            float r5 = defpackage.c35.j(r5)
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x00ca
            defpackage.c35.i(r1)
            eh5 r1 = r1.y(r9)
            r1.b0()
            r1.Z()
            r1.b0()
            r1.Z()
            goto L_0x00d1
        L_0x00ca:
            int r5 = r1.l(r11)
            r1.W(r5)
        L_0x00d1:
            java.util.Iterator r1 = r4.iterator()
            long r20 = defpackage.b85.i(r2, r7)
            eq4 r2 = new eq4
            r3 = 16
            mh4[] r4 = new defpackage.mh4[r3]
            r2.<init>(r4)
            int r4 = defpackage.k31.h(r20)
            int r5 = defpackage.k31.j(r20)
            int r7 = defpackage.k31.g(r20)
            yo4 r8 = defpackage.ne3.a
            yo4 r8 = new yo4
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            float r10 = r0.c
            float r10 = r6.e0(r10)
            r54 = r12
            r29 = r13
            double r12 = (double) r10
            double r12 = java.lang.Math.ceil(r12)
            float r10 = (float) r12
            int r10 = (int) r10
            float r12 = r0.e
            float r12 = r6.e0(r12)
            double r12 = (double) r12
            double r12 = java.lang.Math.ceil(r12)
            float r12 = (float) r12
            int r12 = (int) r12
            r23 = r12
            long r11 = defpackage.m31.a(r14, r4, r14, r7)
            r13 = 14
            long r18 = defpackage.b85.j(r11, r13)
            r31 = r15
            long r14 = defpackage.b85.t(r18)
            boolean r13 = r1.hasNext()
            if (r13 != 0) goto L_0x0133
        L_0x0130:
            r13 = r16
            goto L_0x0139
        L_0x0133:
            java.lang.Object r13 = r1.next()     // Catch:{ IndexOutOfBoundsException -> 0x0130 }
            gh4 r13 = (defpackage.gh4) r13     // Catch:{ IndexOutOfBoundsException -> 0x0130 }
        L_0x0139:
            if (r13 == 0) goto L_0x017f
            ba6 r18 = defpackage.c35.i(r13)
            float r18 = defpackage.c35.j(r18)
            int r18 = (r18 > r54 ? 1 : (r18 == r54 ? 0 : -1))
            if (r18 != 0) goto L_0x0161
            defpackage.c35.i(r13)
            eh5 r18 = r13.y(r14)
            int r3 = r18.b0()
            r32 = r1
            int r1 = r18.Z()
            long r24 = defpackage.ie3.a(r3, r1)
        L_0x015c:
            r33 = r2
            r1 = r24
            goto L_0x0177
        L_0x0161:
            r32 = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r13.l(r1)
            r1 = r13
            int r13 = r1.W(r3)
            long r24 = defpackage.ie3.a(r3, r13)
            r13 = r1
            r18 = r16
            goto L_0x015c
        L_0x0177:
            ie3 r3 = new ie3
            r3.<init>(r1)
            r1 = r18
            goto L_0x0186
        L_0x017f:
            r32 = r1
            r33 = r2
            r1 = r16
            r3 = r1
        L_0x0186:
            r45 = r1
            r46 = 32
            if (r3 == 0) goto L_0x0196
            long r1 = r3.a
            long r1 = r1 >> r46
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0198
        L_0x0196:
            r1 = r16
        L_0x0198:
            r47 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r49 = r1
            if (r3 == 0) goto L_0x01af
            long r1 = r3.a
            long r1 = r1 & r47
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r56 = r1
        L_0x01ac:
            r2 = 16
            goto L_0x01b2
        L_0x01af:
            r56 = r16
            goto L_0x01ac
        L_0x01b2:
            int[] r1 = new int[r2]
            int[] r2 = new int[r2]
            r50 = r13
            zo4 r13 = new zo4
            r13.<init>()
            mj2 r34 = new mj2
            r51 = r1
            pj2 r1 = r0.f
            r19 = r1
            r22 = r10
            r18 = r34
            r18.<init>(r19, r20, r22, r23)
            r1 = r5
            r5 = r22
            r10 = r23
            boolean r35 = r32.hasNext()
            long r37 = defpackage.ie3.a(r4, r7)
            r43 = 0
            r44 = 0
            r36 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r39 = r3
            lj2 r3 = r34.b(r35, r36, r37, r39, r40, r41, r42, r43, r44)
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x0206
            if (r39 == 0) goto L_0x01f4
            r24 = r31
            goto L_0x01f6
        L_0x01f4:
            r24 = 0
        L_0x01f6:
            r26 = 0
            r28 = 0
            r25 = -1
            r23 = r3
            r27 = r4
            r22 = r34
            r22.a(r23, r24, r25, r26, r27, r28)
            goto L_0x0208
        L_0x0206:
            r23 = r3
        L_0x0208:
            r0 = r5
            r5 = r1
            r1 = r23
            r23 = r0
            r0 = r2
            r22 = r4
            r25 = r7
            r26 = r10
            r28 = r13
            r2 = r45
            r18 = r49
            r6 = r50
            r3 = r51
            r10 = 0
            r13 = 0
            r24 = 0
            r27 = 0
            r37 = 0
            r41 = 0
            r49 = r11
            r7 = 0
            r12 = 0
            r11 = r25
        L_0x022f:
            boolean r1 = r1.b
            if (r1 != 0) goto L_0x03a0
            if (r6 == 0) goto L_0x03a0
            r18.getClass()
            int r1 = r18.intValue()
            r56.getClass()
            r18 = r1
            int r1 = r56.intValue()
            r56 = r13
            int r13 = r24 + r18
            int r42 = java.lang.Math.max(r7, r1)
            int r1 = r22 - r18
            int r7 = r10 + 1
            r19.getClass()
            r9.add(r6)
            r8.i(r10, r2)
            r6.B()
            int r36 = r7 - r27
            boolean r2 = r32.hasNext()
            if (r2 != 0) goto L_0x0268
            r6 = r16
            goto L_0x0272
        L_0x0268:
            java.lang.Object r2 = r32.next()     // Catch:{ IndexOutOfBoundsException -> 0x026f }
            gh4 r2 = (defpackage.gh4) r2     // Catch:{ IndexOutOfBoundsException -> 0x026f }
            goto L_0x0271
        L_0x026f:
            r2 = r16
        L_0x0271:
            r6 = r2
        L_0x0272:
            if (r6 == 0) goto L_0x02b8
            ba6 r2 = defpackage.c35.i(r6)
            float r2 = defpackage.c35.j(r2)
            int r2 = (r2 > r54 ? 1 : (r2 == r54 ? 0 : -1))
            if (r2 != 0) goto L_0x029d
            defpackage.c35.i(r6)
            eh5 r2 = r6.y(r14)
            int r10 = r2.b0()
            r18 = r2
            int r2 = r18.Z()
            long r38 = defpackage.ie3.a(r10, r2)
            r22 = r18
            r10 = r7
            r18 = r6
        L_0x029a:
            r6 = r38
            goto L_0x02b2
        L_0x029d:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r10 = r6.l(r2)
            int r2 = r6.W(r10)
            long r38 = defpackage.ie3.a(r10, r2)
            r22 = r16
            r18 = r6
            r10 = r7
            goto L_0x029a
        L_0x02b2:
            ie3 r2 = new ie3
            r2.<init>(r6)
            goto L_0x02bf
        L_0x02b8:
            r18 = r6
            r10 = r7
            r2 = r16
            r22 = r2
        L_0x02bf:
            if (r2 == 0) goto L_0x02cd
            long r6 = r2.a
            long r6 = r6 >> r46
            int r6 = (int) r6
            int r6 = r6 + r23
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x02cf
        L_0x02cd:
            r6 = r16
        L_0x02cf:
            r24 = r6
            if (r2 == 0) goto L_0x02dd
            long r6 = r2.a
            long r6 = r6 & r47
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x02df
        L_0x02dd:
            r6 = r16
        L_0x02df:
            boolean r35 = r32.hasNext()
            r40 = r37
            long r37 = defpackage.ie3.a(r1, r11)
            if (r2 != 0) goto L_0x02f2
            r45 = r1
            r51 = r2
            r39 = r16
            goto L_0x030f
        L_0x02f2:
            r24.getClass()
            int r7 = r24.intValue()
            r6.getClass()
            r45 = r1
            int r1 = r6.intValue()
            r51 = r2
            long r1 = defpackage.ie3.a(r7, r1)
            ie3 r7 = new ie3
            r7.<init>(r1)
            r39 = r7
        L_0x030f:
            r43 = 0
            r44 = 0
            lj2 r1 = r34.b(r35, r36, r37, r39, r40, r41, r42, r43, r44)
            boolean r2 = r1.a
            if (r2 == 0) goto L_0x0386
            int r2 = java.lang.Math.max(r5, r13)
            int r2 = java.lang.Math.min(r2, r4)
            int r38 = r41 + r42
            r37 = r40
            r40 = r36
            if (r51 == 0) goto L_0x0332
            r36 = r31
        L_0x032d:
            r35 = r1
            r39 = r45
            goto L_0x0335
        L_0x0332:
            r36 = 0
            goto L_0x032d
        L_0x0335:
            r34.a(r35, r36, r37, r38, r39, r40)
            r40 = r37
            int r13 = r56 + 1
            int r1 = r0.length
            if (r1 >= r13) goto L_0x034c
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r1 = java.lang.Math.max(r13, r1)
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
        L_0x034c:
            r0[r56] = r42
            int r13 = r56 + 1
            int r7 = r25 - r38
            int r11 = r7 - r26
            int r1 = r12 + 1
            int r5 = r3.length
            if (r5 >= r1) goto L_0x0366
            int r5 = r3.length
            int r5 = r5 * 3
            int r5 = r5 / 2
            int r1 = java.lang.Math.max(r1, r5)
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
        L_0x0366:
            r3[r12] = r10
            int r12 = r12 + 1
            if (r24 == 0) goto L_0x0377
            int r1 = r24.intValue()
            int r1 = r1 - r23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0379
        L_0x0377:
            r1 = r16
        L_0x0379:
            int r37 = r40 + 1
            int r41 = r38 + r26
            r5 = r2
            r45 = r4
            r27 = r10
            r7 = 0
            r24 = 0
            goto L_0x0392
        L_0x0386:
            r35 = r1
            r1 = r24
            r37 = r40
            r7 = r42
            r24 = r13
            r13 = r56
        L_0x0392:
            r56 = r6
            r6 = r18
            r2 = r22
            r22 = r45
            r18 = r1
            r1 = r35
            goto L_0x022f
        L_0x03a0:
            r56 = r13
            int r1 = r9.size()
            eh5[] r2 = new defpackage.eh5[r1]
            r4 = 0
        L_0x03a9:
            if (r4 >= r1) goto L_0x03b4
            java.lang.Object r6 = r8.b(r4)
            r2[r4] = r6
            int r4 = r4 + 1
            goto L_0x03a9
        L_0x03b4:
            int[] r11 = new int[r12]
            int[] r13 = new int[r12]
            r1 = r5
            r7 = r9
            r4 = 0
            r9 = 0
            r14 = 0
        L_0x03bd:
            if (r4 >= r12) goto L_0x0436
            r10 = r3[r4]
            if (r4 < 0) goto L_0x0430
            r15 = r56
            if (r4 >= r15) goto L_0x0430
            r5 = r0[r4]
            r6 = r28
            boolean r8 = r6.c(r4)
            if (r8 == 0) goto L_0x03d6
            r8 = r2
            r17 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x03ec
        L_0x03d6:
            int r5 = defpackage.k31.g(r49)
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r8) goto L_0x03e4
            r5 = r8
            r17 = r5
        L_0x03e2:
            r8 = r2
            goto L_0x03ec
        L_0x03e4:
            int r5 = defpackage.k31.g(r49)
            int r5 = r5 - r14
            r17 = r8
            goto L_0x03e2
        L_0x03ec:
            int r2 = defpackage.k31.i(r49)
            r51 = r3
            int r3 = defpackage.k31.h(r49)
            r18 = r0
            r28 = r6
            r54 = r14
            r19 = r17
            r14 = r33
            r0 = r52
            r6 = r53
            r17 = r12
            r12 = r4
            r4 = r5
            r5 = r23
            mh4 r2 = defpackage.i35.n(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r3 = r2.e()
            int r4 = r2.c()
            r13[r12] = r4
            int r4 = r54 + r4
            int r1 = java.lang.Math.max(r1, r3)
            r14.b(r2)
            int r2 = r12 + 1
            r9 = r10
            r56 = r15
            r12 = r17
            r0 = r18
            r3 = r51
            r14 = r4
            r4 = r2
            r2 = r8
            goto L_0x03bd
        L_0x0430:
            java.lang.String r0 = "Index must be between 0 and size"
            defpackage.h.l(r0)
            return r16
        L_0x0436:
            r0 = r52
            r6 = r53
            r54 = r14
            r14 = r33
            int r2 = r14.y
            if (r2 != 0) goto L_0x0446
            r1 = 0
            r30 = 0
            goto L_0x0448
        L_0x0446:
            r30 = r54
        L_0x0448:
            vr r0 = r0.b
            float r2 = r0.a()
            int r2 = r6.r0(r2)
            int r3 = r14.y
            int r3 = r3 + -1
            int r3 = r3 * r2
            int r3 = r3 + r30
            int r2 = defpackage.k31.i(r20)
            int r4 = defpackage.k31.g(r20)
            if (r3 >= r2) goto L_0x0464
            r3 = r2
        L_0x0464:
            if (r3 <= r4) goto L_0x0467
            goto L_0x0468
        L_0x0467:
            r4 = r3
        L_0x0468:
            r0.s0(r6, r4, r13, r11)
            int r0 = defpackage.k31.j(r20)
            int r2 = defpackage.k31.h(r20)
            if (r1 >= r0) goto L_0x0476
            r1 = r0
        L_0x0476:
            if (r1 <= r2) goto L_0x0479
            goto L_0x047a
        L_0x0479:
            r2 = r1
        L_0x047a:
            gg0 r0 = new gg0
            r1 = 25
            r0.<init>((int) r1, (java.lang.Object) r14)
            r1 = r29
            mh4 r0 = r6.d0(r2, r4, r1, r0)
            return r0
        L_0x0488:
            vd2 r0 = new vd2
            r0.<init>((int) r5)
            r2 = 0
            mh4 r0 = r6.d0(r2, r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj2.b(oh4, java.util.List, long):mh4");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final int c(kg3 kg3, List list, int i) {
        gh4 gh4;
        gh4 gh42;
        int i2;
        List list2;
        int[] iArr;
        pj2 pj2;
        int[] iArr2;
        long j;
        int i3;
        int i4;
        boolean z;
        ie3 ie3;
        int i5;
        int i6;
        boolean z2;
        ie3 ie32;
        int i7;
        boolean z3;
        kg3 kg32 = kg3;
        List list3 = list;
        int i8 = i;
        int i9 = 1;
        List list4 = (List) dt0.z0(1, list3);
        if (list4 != null) {
            gh4 = (gh4) dt0.y0(list4);
        } else {
            gh4 = null;
        }
        char c2 = 2;
        List list5 = (List) dt0.z0(2, list3);
        if (list5 != null) {
            gh42 = (gh4) dt0.y0(list5);
        } else {
            gh42 = null;
        }
        this.f.a(gh4, gh42, m31.b(0, 0, 0, i8, 7));
        List list6 = (List) dt0.y0(list3);
        if (list6 == null) {
            list6 = a42.w;
        }
        int r0 = kg32.r0(this.c);
        int r02 = kg32.r0(this.e);
        long a2 = ie3.a(0, 0);
        if (list6.isEmpty()) {
            return 0;
        }
        int size = list6.size();
        int[] iArr3 = new int[size];
        int size2 = list6.size();
        int[] iArr4 = new int[size2];
        int size3 = list6.size();
        int i10 = 0;
        while (i10 < size3) {
            gh4 gh43 = (gh4) list6.get(i10);
            char c3 = c2;
            int l = gh43.l(i8);
            iArr3[i10] = l;
            iArr4[i10] = gh43.W(l);
            i10++;
            c2 = c3;
        }
        char c4 = c2;
        int size4 = list6.size();
        pj2 pj22 = this.f;
        if (Integer.MAX_VALUE < size4) {
            pj22.getClass();
        }
        if (Integer.MAX_VALUE >= list6.size()) {
            pj22.getClass();
        }
        int min = Math.min(Integer.MAX_VALUE, list6.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr3[i12];
        }
        int size5 = ((list6.size() - 1) * r0) + i11;
        if (size2 != 0) {
            int i13 = iArr4[0];
            int i14 = size2 - 1;
            if (1 <= i14) {
                int i15 = 1;
                i2 = 0;
                while (true) {
                    int i16 = iArr4[i15];
                    if (i13 < i16) {
                        i13 = i16;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            } else {
                i2 = 0;
            }
            if (size != 0) {
                int i17 = iArr3[i2];
                int i18 = size - 1;
                if (1 <= i18) {
                    int i19 = 1;
                    while (true) {
                        int i20 = iArr3[i19];
                        if (i17 < i20) {
                            i17 = i20;
                        }
                        if (i19 == i18) {
                            break;
                        }
                        i19++;
                    }
                }
                int i21 = size5;
                while (i17 <= i21 && i13 != i8) {
                    int i22 = (i17 + i21) / 2;
                    if (list6.isEmpty()) {
                        list2 = list6;
                        iArr2 = iArr3;
                        j = a2;
                        iArr = iArr4;
                        pj2 = pj22;
                    } else {
                        int i23 = i2;
                        iArr = iArr4;
                        pj2 = pj22;
                        int i24 = i23;
                        mj2 mj2 = new mj2(pj2, m31.a(i23, i22, i23, Integer.MAX_VALUE), r0, r02);
                        gh4 gh44 = (gh4) dt0.z0(i24, list6);
                        if (gh44 != null) {
                            i3 = iArr[i24];
                        } else {
                            i3 = i24;
                        }
                        if (gh44 != null) {
                            i4 = iArr3[i24];
                        } else {
                            i4 = 0;
                        }
                        if (list6.size() > i9) {
                            z = i9;
                        } else {
                            z = 0;
                        }
                        long a3 = ie3.a(i22, Integer.MAX_VALUE);
                        if (gh44 == null) {
                            iArr2 = iArr3;
                            ie3 = null;
                        } else {
                            iArr2 = iArr3;
                            ie3 = new ie3(ie3.a(i4, i3));
                        }
                        int i25 = 0;
                        if (mj2.b(z, 0, a3, ie3, 0, 0, 0, false, false).b) {
                            pj2.getClass();
                            list2 = list6;
                            j = a2;
                        } else {
                            int size6 = list6.size();
                            int i26 = i22;
                            int i27 = i4;
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = i3;
                            int i33 = 0;
                            while (true) {
                                if (i31 >= size6) {
                                    list2 = list6;
                                    break;
                                }
                                int i34 = i26 - i27;
                                int i35 = size6;
                                int i36 = i31 + 1;
                                int max = Math.max(i29, i32);
                                gh4 gh45 = (gh4) dt0.z0(i36, list6);
                                if (gh45 != null) {
                                    i32 = iArr[i36];
                                } else {
                                    i32 = 0;
                                }
                                if (gh45 != null) {
                                    i5 = i36;
                                    i6 = iArr2[i36] + r0;
                                } else {
                                    i5 = i36;
                                    i6 = 0;
                                }
                                list2 = list6;
                                if (i31 + 2 < list2.size()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i37 = i5 - i30;
                                int i38 = i28;
                                long a4 = ie3.a(i34, Integer.MAX_VALUE);
                                if (gh45 == null) {
                                    ie32 = null;
                                } else {
                                    ie32 = new ie3(ie3.a(i6, i32));
                                }
                                lj2 b2 = mj2.b(z2, i37, a4, ie32, i38, i25, max, false, false);
                                if (b2.a) {
                                    int i39 = max + r02 + i25;
                                    int i40 = i38;
                                    int i41 = i37;
                                    if (gh45 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    lj2 lj2 = b2;
                                    mj2.a(lj2, z3, i40, i39, i34, i41);
                                    int i42 = i6 - r0;
                                    i28 = i40 + 1;
                                    if (lj2.b) {
                                        i25 = i39;
                                        i33 = i5;
                                        break;
                                    }
                                    i27 = i42;
                                    i26 = i22;
                                    i25 = i39;
                                    i7 = i5;
                                    i29 = 0;
                                } else {
                                    i27 = i6;
                                    i26 = i34;
                                    i28 = i38;
                                    i29 = max;
                                    i7 = i30;
                                }
                                int i43 = i;
                                i30 = i7;
                                size6 = i35;
                                i31 = i5;
                                i33 = i31;
                                list6 = list2;
                            }
                            j = ie3.a(i25 - r02, i33);
                        }
                    }
                    i13 = (int) (j >> 32);
                    int i44 = (int) (j & 4294967295L);
                    i8 = i;
                    if (i13 > i8 || i44 < min) {
                        i17 = i22 + 1;
                        if (i17 > i21) {
                            return i17;
                        }
                    } else if (i13 >= i8) {
                        return i22;
                    } else {
                        i21 = i22 - 1;
                    }
                    size5 = i22;
                    iArr3 = iArr2;
                    pj22 = pj2;
                    iArr4 = iArr;
                    list6 = list2;
                    i9 = 1;
                    i2 = 0;
                }
                return size5;
            }
            rf2.c();
            return 0;
        }
        rf2.c();
        return 0;
    }

    public final int d(kg3 kg3, List list, int i) {
        gh4 gh4;
        List list2 = (List) dt0.z0(1, list);
        gh4 gh42 = null;
        if (list2 != null) {
            gh4 = (gh4) dt0.y0(list2);
        } else {
            gh4 = null;
        }
        List list3 = (List) dt0.z0(2, list);
        if (list3 != null) {
            gh42 = (gh4) dt0.y0(list3);
        }
        long b2 = m31.b(0, i, 0, 0, 13);
        pj2 pj2 = this.f;
        pj2.a(gh4, gh42, b2);
        List list4 = (List) dt0.y0(list);
        if (list4 == null) {
            list4 = a42.w;
        }
        return k(list4, i, kg3.r0(this.c), kg3.r0(this.e), pj2);
    }

    public final int e(kg3 kg3, List list, int i) {
        gh4 gh4;
        List list2 = (List) dt0.z0(1, list);
        gh4 gh42 = null;
        if (list2 != null) {
            gh4 = (gh4) dt0.y0(list2);
        } else {
            gh4 = null;
        }
        List list3 = (List) dt0.z0(2, list);
        if (list3 != null) {
            gh42 = (gh4) dt0.y0(list3);
        }
        long b2 = m31.b(0, i, 0, 0, 13);
        pj2 pj2 = this.f;
        pj2.a(gh4, gh42, b2);
        List list4 = (List) dt0.y0(list);
        if (list4 == null) {
            list4 = a42.w;
        }
        return k(list4, i, kg3.r0(this.c), kg3.r0(this.e), pj2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj2)) {
            return false;
        }
        rj2 rj2 = (rj2) obj;
        if (this.a.equals(rj2.a) && this.b.equals(rj2.b) && lx1.b(this.c, rj2.c) && this.d.equals(rj2.d) && lx1.b(this.e, rj2.e) && sg3.e(this.f, rj2.f)) {
            return true;
        }
        return false;
    }

    public final void f(int i, int[] iArr, int[] iArr2, oh4 oh4) {
        oh4 oh42 = oh4;
        this.a.u(oh42, i, iArr, oh4.getLayoutDirection(), iArr2);
    }

    public final long g(int i, int i2, int i3, boolean z) {
        ea6 ea6 = ca6.a;
        if (!z) {
            return m31.a(i, i2, 0, i3);
        }
        return x91.x(i, i2, 0, i3);
    }

    public final mh4 h(eh5[] eh5Arr, oh4 oh4, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        eh5[] eh5Arr2 = eh5Arr;
        int i7 = i3;
        int[] iArr3 = iArr2;
        int i8 = i4;
        int i9 = i5;
        int i10 = i6;
        return oh4.d0(i2, i7, b42.w, new qj2(iArr3, i8, i9, i10, eh5Arr2, this, i7, ey3.w, i, iArr));
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        return this.f.hashCode() + f21.e(Integer.MAX_VALUE, f21.e(Integer.MAX_VALUE, f21.d(this.e, f21.d(-1.0f, f21.d(this.c, (hashCode2 + ((hashCode + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final int i(eh5 eh5) {
        return eh5.Z();
    }

    public final int j(eh5 eh5) {
        return eh5.b0();
    }

    public final String toString() {
        String c2 = lx1.c(this.c);
        String c3 = lx1.c(this.e);
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + c2 + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + c3 + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
