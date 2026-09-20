package defpackage;

/* renamed from: o52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o52 extends l66 implements gs2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public long E;
    public int F;
    public /* synthetic */ Object G;
    public Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ int y;
    public long[] z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o52(Object obj, f61 f61, int i) {
        super(2, f61);
        this.y = i;
        this.I = obj;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.y;
        vs7 vs7 = vs7.a;
        bl6 bl6 = (bl6) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((o52) o(f61, bl6)).s(vs7);
            case 1:
                return ((o52) o(f61, bl6)).s(vs7);
            case 2:
                return ((o52) o(f61, bl6)).s(vs7);
            default:
                return ((o52) o(f61, bl6)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.y;
        Object obj2 = this.I;
        switch (i) {
            case b85.b:
                o52 o52 = new o52((p52) obj2, f61, 0);
                o52.G = obj;
                return o52;
            case 1:
                o52 o522 = new o52((p52) obj2, f61, 1);
                o522.G = obj;
                return o522;
            case 2:
                o52 o523 = new o52((dg6) obj2, f61, 2);
                o523.G = obj;
                return o523;
            default:
                o52 o524 = new o52((r67) obj2, f61, 3);
                o524.G = obj;
                return o524;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a5  */
    public final java.lang.Object s(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.y
            vs7 r2 = defpackage.vs7.a
            java.lang.Object r8 = r0.I
            r9 = 0
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p81 r11 = defpackage.p81.w
            r12 = 8
            r16 = 128(0x80, double:6.3E-322)
            r3 = 1
            switch(r1) {
                case 0: goto L_0x01d6;
                case 1: goto L_0x0144;
                case 2: goto L_0x00b2;
                default: goto L_0x0015;
            }
        L_0x0015:
            int r1 = r0.F
            if (r1 == 0) goto L_0x0043
            if (r1 != r3) goto L_0x003d
            int r1 = r0.D
            int r4 = r0.C
            long r8 = r0.E
            int r10 = r0.B
            r18 = 255(0xff, double:1.26E-321)
            int r5 = r0.A
            long[] r6 = r0.z
            r20 = 7
            java.lang.Object r7 = r0.H
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.Object r13 = r0.G
            bl6 r13 = (defpackage.bl6) r13
            defpackage.o85.q(r26)
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00a2
        L_0x003d:
            defpackage.h.s(r10)
            r2 = r9
            goto L_0x00b1
        L_0x0043:
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            defpackage.o85.q(r26)
            java.lang.Object r1 = r0.G
            bl6 r1 = (defpackage.bl6) r1
            r67 r8 = (defpackage.r67) r8
            java.lang.Object r4 = r8.x
            tp4 r4 = (defpackage.tp4) r4
            java.lang.Object[] r5 = r4.c
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x00b1
            r7 = 0
        L_0x005e:
            r8 = r4[r7]
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = ~r8
            long r13 = r14 << r20
            long r13 = r13 & r8
            long r13 = r13 & r21
            int r10 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r10 == 0) goto L_0x00ac
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r13 = r6
            r6 = r4
            r4 = r10
            r10 = r7
            r7 = r5
            r5 = r13
            r13 = r1
            r1 = 0
        L_0x007e:
            if (r1 >= r4) goto L_0x00a5
            long r14 = r8 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a2
            int r2 = r10 << 3
            int r2 = r2 + r1
            r2 = r7[r2]
            r0.G = r13
            r0.H = r7
            r0.z = r6
            r0.A = r5
            r0.B = r10
            r0.E = r8
            r0.C = r4
            r0.D = r1
            r0.F = r3
            r13.c(r0, r2)
            r2 = r11
            goto L_0x00b1
        L_0x00a2:
            long r8 = r8 >> r12
            int r1 = r1 + r3
            goto L_0x007e
        L_0x00a5:
            if (r4 != r12) goto L_0x00b1
            r4 = r6
            r1 = r13
            r6 = r5
            r5 = r7
            r7 = r10
        L_0x00ac:
            if (r7 == r6) goto L_0x00b1
            int r7 = r7 + 1
            goto L_0x005e
        L_0x00b1:
            return r2
        L_0x00b2:
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            int r1 = r0.F
            if (r1 == 0) goto L_0x00df
            if (r1 != r3) goto L_0x00d9
            int r1 = r0.D
            int r4 = r0.C
            long r5 = r0.E
            int r7 = r0.B
            int r8 = r0.A
            long[] r9 = r0.z
            java.lang.Object r10 = r0.H
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r13 = r0.G
            bl6 r13 = (defpackage.bl6) r13
            defpackage.o85.q(r26)
            goto L_0x0135
        L_0x00d9:
            defpackage.h.s(r10)
            r2 = r9
            goto L_0x0143
        L_0x00df:
            defpackage.o85.q(r26)
            java.lang.Object r1 = r0.G
            bl6 r1 = (defpackage.bl6) r1
            dg6 r8 = (defpackage.dg6) r8
            up4 r4 = r8.w
            java.lang.Object[] r5 = r4.b
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0143
            r7 = 0
        L_0x00f4:
            r8 = r4[r7]
            long r13 = ~r8
            long r13 = r13 << r20
            long r13 = r13 & r8
            long r13 = r13 & r21
            int r10 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r10 == 0) goto L_0x013e
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r13 = r1
            r1 = 0
            r23 = r8
            r9 = r4
            r8 = r6
            r4 = r10
            r10 = r5
            r5 = r23
        L_0x0111:
            if (r1 >= r4) goto L_0x0138
            long r14 = r5 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0135
            int r2 = r7 << 3
            int r2 = r2 + r1
            r2 = r10[r2]
            r0.G = r13
            r0.H = r10
            r0.z = r9
            r0.A = r8
            r0.B = r7
            r0.E = r5
            r0.C = r4
            r0.D = r1
            r0.F = r3
            r13.c(r0, r2)
            r2 = r11
            goto L_0x0143
        L_0x0135:
            long r5 = r5 >> r12
            int r1 = r1 + r3
            goto L_0x0111
        L_0x0138:
            if (r4 != r12) goto L_0x0143
            r6 = r8
            r4 = r9
            r5 = r10
            r1 = r13
        L_0x013e:
            if (r7 == r6) goto L_0x0143
            int r7 = r7 + 1
            goto L_0x00f4
        L_0x0143:
            return r2
        L_0x0144:
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            int r1 = r0.F
            if (r1 == 0) goto L_0x0171
            if (r1 != r3) goto L_0x016b
            int r1 = r0.D
            int r4 = r0.C
            long r5 = r0.E
            int r7 = r0.B
            int r8 = r0.A
            long[] r9 = r0.z
            java.lang.Object r10 = r0.H
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r13 = r0.G
            bl6 r13 = (defpackage.bl6) r13
            defpackage.o85.q(r26)
            goto L_0x01c7
        L_0x016b:
            defpackage.h.s(r10)
            r2 = r9
            goto L_0x01d5
        L_0x0171:
            defpackage.o85.q(r26)
            java.lang.Object r1 = r0.G
            bl6 r1 = (defpackage.bl6) r1
            p52 r8 = (defpackage.p52) r8
            tp4 r4 = r8.x
            java.lang.Object[] r5 = r4.b
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x01d5
            r7 = 0
        L_0x0186:
            r8 = r4[r7]
            long r13 = ~r8
            long r13 = r13 << r20
            long r13 = r13 & r8
            long r13 = r13 & r21
            int r10 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r10 == 0) goto L_0x01d0
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r13 = r1
            r1 = 0
            r23 = r8
            r9 = r4
            r8 = r6
            r4 = r10
            r10 = r5
            r5 = r23
        L_0x01a3:
            if (r1 >= r4) goto L_0x01ca
            long r14 = r5 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x01c7
            int r2 = r7 << 3
            int r2 = r2 + r1
            r2 = r10[r2]
            r0.G = r13
            r0.H = r10
            r0.z = r9
            r0.A = r8
            r0.B = r7
            r0.E = r5
            r0.C = r4
            r0.D = r1
            r0.F = r3
            r13.c(r0, r2)
            r2 = r11
            goto L_0x01d5
        L_0x01c7:
            long r5 = r5 >> r12
            int r1 = r1 + r3
            goto L_0x01a3
        L_0x01ca:
            if (r4 != r12) goto L_0x01d5
            r6 = r8
            r4 = r9
            r5 = r10
            r1 = r13
        L_0x01d0:
            if (r7 == r6) goto L_0x01d5
            int r7 = r7 + 1
            goto L_0x0186
        L_0x01d5:
            return r2
        L_0x01d6:
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            int r1 = r0.F
            if (r1 == 0) goto L_0x0204
            if (r1 != r3) goto L_0x01fe
            int r1 = r0.D
            int r4 = r0.C
            long r5 = r0.E
            int r7 = r0.B
            int r8 = r0.A
            long[] r9 = r0.z
            java.lang.Object r10 = r0.H
            p52 r10 = (defpackage.p52) r10
            java.lang.Object r13 = r0.G
            bl6 r13 = (defpackage.bl6) r13
            defpackage.o85.q(r26)
            goto L_0x0266
        L_0x01fe:
            defpackage.h.s(r10)
            r2 = r9
            goto L_0x0275
        L_0x0204:
            defpackage.o85.q(r26)
            java.lang.Object r1 = r0.G
            bl6 r1 = (defpackage.bl6) r1
            p52 r8 = (defpackage.p52) r8
            tp4 r4 = r8.x
            long[] r4 = r4.a
            int r5 = r4.length
            int r5 = r5 + -2
            if (r5 < 0) goto L_0x0275
            r6 = 0
        L_0x0217:
            r9 = r4[r6]
            long r13 = ~r9
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r13 = r13 & r21
            int r7 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r7 == 0) goto L_0x0270
            int r7 = r6 - r5
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r13 = r1
            r1 = 0
            r23 = r9
            r9 = r4
            r4 = r7
            r10 = r8
            r8 = r5
            r7 = r6
            r5 = r23
        L_0x0235:
            if (r1 >= r4) goto L_0x0269
            long r14 = r5 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0266
            int r2 = r7 << 3
            int r2 = r2 + r1
            bf4 r12 = new bf4
            tp4 r14 = r10.x
            java.lang.Object[] r15 = r14.b
            r15 = r15[r2]
            java.lang.Object[] r14 = r14.c
            r2 = r14[r2]
            r12.<init>(r3, r15, r2)
            r0.G = r13
            r0.H = r10
            r0.z = r9
            r0.A = r8
            r0.B = r7
            r0.E = r5
            r0.C = r4
            r0.D = r1
            r0.F = r3
            r13.c(r0, r12)
            r2 = r11
            goto L_0x0275
        L_0x0266:
            long r5 = r5 >> r12
            int r1 = r1 + r3
            goto L_0x0235
        L_0x0269:
            if (r4 != r12) goto L_0x0275
            r6 = r7
            r5 = r8
            r4 = r9
            r8 = r10
            r1 = r13
        L_0x0270:
            if (r6 == r5) goto L_0x0275
            int r6 = r6 + 1
            goto L_0x0217
        L_0x0275:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o52.s(java.lang.Object):java.lang.Object");
    }
}
