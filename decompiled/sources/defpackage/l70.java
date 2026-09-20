package defpackage;

/* renamed from: l70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l70 extends l66 implements gs2 {
    public /* synthetic */ Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l70(ig igVar, zc9 zc9, wd7 wd7, f61 f61) {
        super(2, f61);
        this.y = 2;
        this.B = igVar;
        this.C = zc9;
        this.D = wd7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.y;
        vs7 vs7 = vs7.a;
        g97 g97 = (g97) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                ((l70) o(f61, g97)).s(vs7);
                return p81.w;
            case 1:
                return ((l70) o(f61, g97)).s(vs7);
            case 2:
                return ((l70) o(f61, g97)).s(vs7);
            default:
                return ((l70) o(f61, g97)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.y;
        Object obj2 = this.D;
        switch (i) {
            case b85.b:
                l70 l70 = new l70((o81) this.C, (ek7) obj2, f61);
                l70.A = obj;
                return l70;
            case 1:
                l70 l702 = new l70((Object) (ob5) obj2, f61, 1);
                l702.A = obj;
                return l702;
            case 2:
                l70 l703 = new l70((ig) this.B, (zc9) this.C, (wd7) obj2, f61);
                l703.A = obj;
                return l703;
            default:
                l70 l704 = new l70((Object) (d67) obj2, f61, 3);
                l704.A = obj;
                return l704;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: qk5} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0143  */
    public final java.lang.Object s(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.y
            lk5 r2 = defpackage.lk5.x
            lk5 r3 = defpackage.lk5.w
            r4 = 4
            r5 = 3
            vs7 r6 = defpackage.vs7.a
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p81 r8 = defpackage.p81.w
            r10 = 2
            java.lang.Object r11 = r0.D
            r12 = 1
            switch(r1) {
                case 0: goto L_0x03fc;
                case 1: goto L_0x0359;
                case 2: goto L_0x027a;
                default: goto L_0x0017;
            }
        L_0x0017:
            d67 r11 = (defpackage.d67) r11
            int r1 = r0.z
            if (r1 == 0) goto L_0x0057
            if (r1 == r12) goto L_0x004d
            if (r1 == r10) goto L_0x003a
            if (r1 != r5) goto L_0x0034
            java.lang.Object r1 = r0.C
            qk5 r1 = (defpackage.qk5) r1
            java.lang.Object r2 = r0.A
            g97 r2 = (defpackage.g97) r2
            defpackage.o85.q(r20)
            r4 = r20
            r17 = r6
            goto L_0x023c
        L_0x0034:
            defpackage.h.s(r7)
            r6 = 0
            goto L_0x0279
        L_0x003a:
            java.lang.Object r1 = r0.B
            lk5 r1 = (defpackage.lk5) r1
            java.lang.Object r2 = r0.C
            qk5 r2 = (defpackage.qk5) r2
            java.lang.Object r4 = r0.A
            g97 r4 = (defpackage.g97) r4
            defpackage.o85.q(r20)
            r5 = r20
            goto L_0x00cf
        L_0x004d:
            java.lang.Object r1 = r0.A
            g97 r1 = (defpackage.g97) r1
            defpackage.o85.q(r20)
            r7 = r20
            goto L_0x006a
        L_0x0057:
            defpackage.o85.q(r20)
            java.lang.Object r1 = r0.A
            g97 r1 = (defpackage.g97) r1
            r0.A = r1
            r0.z = r12
            java.lang.Object r7 = defpackage.sb7.a(r1, r12, r3, r0)
            if (r7 != r8) goto L_0x006a
            goto L_0x023a
        L_0x006a:
            qk5 r7 = (defpackage.qk5) r7
            int r14 = r7.i
            long r12 = r7.c
            if (r14 != r5) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            if (r14 != r4) goto L_0x0275
        L_0x0075:
            r20 = 32
            long r4 = r12 >> r20
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            r16 = 0
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x00b4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            h97 r5 = r1.B
            long r14 = r5.T
            long r14 = r14 >> r20
            int r5 = (int) r14
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r4
            int r12 = (int) r12
            float r13 = java.lang.Float.intBitsToFloat(r12)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 < 0) goto L_0x00b4
            float r12 = java.lang.Float.intBitsToFloat(r12)
            h97 r13 = r1.B
            long r13 = r13.T
            long r4 = r4 & r13
            int r4 = (int) r4
            float r4 = (float) r4
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b4
            r4 = 1
            goto L_0x00b5
        L_0x00b4:
            r4 = 0
        L_0x00b5:
            boolean r5 = r11.N
            if (r5 != 0) goto L_0x00bb
            if (r4 == 0) goto L_0x00bc
        L_0x00bb:
            r2 = r3
        L_0x00bc:
            r4 = r1
            r1 = r2
            r2 = r7
        L_0x00bf:
            r0.A = r4
            r0.C = r2
            r0.B = r1
            r0.z = r10
            java.lang.Object r5 = r4.c(r1, r0)
            if (r5 != r8) goto L_0x00cf
            goto L_0x023a
        L_0x00cf:
            kk5 r5 = (defpackage.kk5) r5
            java.util.List r7 = r5.a
            int r12 = r7.size()
            r13 = 0
        L_0x00d8:
            if (r13 >= r12) goto L_0x0106
            java.lang.Object r15 = r7.get(r13)
            r14 = r15
            qk5 r14 = (defpackage.qk5) r14
            boolean r16 = r14.c()
            if (r16 != 0) goto L_0x00fa
            long r9 = r14.a
            r17 = r6
            r20 = r7
            long r6 = r2.a
            boolean r6 = defpackage.a35.i(r9, r6)
            if (r6 == 0) goto L_0x00fe
            boolean r6 = r14.d
            if (r6 == 0) goto L_0x00fe
            goto L_0x0109
        L_0x00fa:
            r17 = r6
            r20 = r7
        L_0x00fe:
            int r13 = r13 + 1
            r7 = r20
            r6 = r17
            r10 = 2
            goto L_0x00d8
        L_0x0106:
            r17 = r6
            r15 = 0
        L_0x0109:
            qk5 r15 = (defpackage.qk5) r15
            if (r15 != 0) goto L_0x010e
            goto L_0x0125
        L_0x010e:
            long r6 = r15.b
            long r9 = r2.b
            long r6 = r6 - r9
            g58 r9 = r4.g()
            long r9 = r9.b()
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            int r5 = r5.c
            r6 = 2
            if (r5 != r6) goto L_0x0127
        L_0x0125:
            r15 = 0
            goto L_0x013f
        L_0x0127:
            long r5 = r15.c
            long r9 = r2.c
            long r5 = defpackage.l35.d(r5, r9)
            float r5 = defpackage.l35.c(r5)
            g58 r6 = r4.g()
            float r6 = r6.c()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0270
        L_0x013f:
            if (r15 != 0) goto L_0x0143
            goto L_0x0277
        L_0x0143:
            boolean r1 = r11.N
            if (r1 != 0) goto L_0x0220
            ll4 r1 = r11.w
            r5 = 0
        L_0x014a:
            r6 = 16
            if (r1 == 0) goto L_0x0196
            boolean r7 = r1 instanceof defpackage.vk2
            if (r7 == 0) goto L_0x0159
            vk2 r1 = (defpackage.vk2) r1
            boolean unused = r1.c1(7)
            goto L_0x0220
        L_0x0159:
            int r7 = r1.y
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0191
            boolean r7 = r1 instanceof defpackage.wo1
            if (r7 == 0) goto L_0x0191
            r7 = r1
            wo1 r7 = (defpackage.wo1) r7
            ll4 r7 = r7.L
            r9 = 0
        L_0x0169:
            if (r7 == 0) goto L_0x018d
            int r10 = r7.y
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x018a
            int r9 = r9 + 1
            r10 = 1
            if (r9 != r10) goto L_0x0178
            r1 = r7
            goto L_0x018a
        L_0x0178:
            if (r5 != 0) goto L_0x0181
            eq4 r5 = new eq4
            ll4[] r10 = new defpackage.ll4[r6]
            r5.<init>(r10)
        L_0x0181:
            if (r1 == 0) goto L_0x0187
            r5.b(r1)
            r1 = 0
        L_0x0187:
            r5.b(r7)
        L_0x018a:
            ll4 r7 = r7.B
            goto L_0x0169
        L_0x018d:
            r10 = 1
            if (r9 != r10) goto L_0x0191
            goto L_0x014a
        L_0x0191:
            ll4 r1 = defpackage.rc9.j(r5)
            goto L_0x014a
        L_0x0196:
            ll4 r1 = r11.w
            boolean r1 = r1.J
            if (r1 != 0) goto L_0x01a1
            java.lang.String r1 = "visitChildren called on an unattached node"
            defpackage.yb3.b(r1)
        L_0x01a1:
            eq4 r1 = new eq4
            ll4[] r5 = new defpackage.ll4[r6]
            r1.<init>(r5)
            ll4 r5 = r11.w
            ll4 r7 = r5.B
            if (r7 != 0) goto L_0x01b2
            defpackage.rc9.h(r1, r5)
            goto L_0x01b5
        L_0x01b2:
            r1.b(r7)
        L_0x01b5:
            int r5 = r1.y
            if (r5 == 0) goto L_0x0220
            int r5 = r5 + -1
            java.lang.Object r5 = r1.l(r5)
            ll4 r5 = (defpackage.ll4) r5
            int r7 = r5.z
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 != 0) goto L_0x01cb
            defpackage.rc9.h(r1, r5)
            goto L_0x01b5
        L_0x01cb:
            if (r5 == 0) goto L_0x01b5
            int r7 = r5.y
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x021d
            r7 = 0
        L_0x01d4:
            if (r5 == 0) goto L_0x01b5
            boolean r9 = r5 instanceof defpackage.vk2
            if (r9 == 0) goto L_0x01e0
            vk2 r5 = (defpackage.vk2) r5
            boolean unused = r5.c1(7)
            goto L_0x0220
        L_0x01e0:
            int r9 = r5.y
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0218
            boolean r9 = r5 instanceof defpackage.wo1
            if (r9 == 0) goto L_0x0218
            r9 = r5
            wo1 r9 = (defpackage.wo1) r9
            ll4 r9 = r9.L
            r10 = 0
        L_0x01f0:
            if (r9 == 0) goto L_0x0214
            int r12 = r9.y
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0211
            int r10 = r10 + 1
            r12 = 1
            if (r10 != r12) goto L_0x01ff
            r5 = r9
            goto L_0x0211
        L_0x01ff:
            if (r7 != 0) goto L_0x0208
            eq4 r7 = new eq4
            ll4[] r12 = new defpackage.ll4[r6]
            r7.<init>(r12)
        L_0x0208:
            if (r5 == 0) goto L_0x020e
            r7.b(r5)
            r5 = 0
        L_0x020e:
            r7.b(r9)
        L_0x0211:
            ll4 r9 = r9.B
            goto L_0x01f0
        L_0x0214:
            r12 = 1
            if (r10 != r12) goto L_0x0218
            goto L_0x01d4
        L_0x0218:
            ll4 r5 = defpackage.rc9.j(r7)
            goto L_0x01d4
        L_0x021d:
            ll4 r5 = r5.B
            goto L_0x01cb
        L_0x0220:
            sr2 r1 = r11.M
            r1.b()
            r15.a()
            r1 = r2
            r2 = r4
        L_0x022a:
            r0.A = r2
            r0.C = r1
            r15 = 0
            r0.B = r15
            r14 = 3
            r0.z = r14
            java.lang.Object r4 = r2.c(r3, r0)
            if (r4 != r8) goto L_0x023c
        L_0x023a:
            r6 = r8
            goto L_0x0279
        L_0x023c:
            kk5 r4 = (defpackage.kk5) r4
            java.util.List r4 = r4.a
            int r5 = r4.size()
            r6 = 0
        L_0x0245:
            if (r6 >= r5) goto L_0x0266
            java.lang.Object r7 = r4.get(r6)
            r9 = r7
            qk5 r9 = (defpackage.qk5) r9
            boolean r10 = r9.c()
            if (r10 != 0) goto L_0x0263
            long r10 = r9.a
            long r12 = r1.a
            boolean r10 = defpackage.a35.i(r10, r12)
            if (r10 == 0) goto L_0x0263
            boolean r9 = r9.d
            if (r9 == 0) goto L_0x0263
            goto L_0x0267
        L_0x0263:
            int r6 = r6 + 1
            goto L_0x0245
        L_0x0266:
            r7 = 0
        L_0x0267:
            qk5 r7 = (defpackage.qk5) r7
            if (r7 != 0) goto L_0x026c
            goto L_0x0277
        L_0x026c:
            r7.a()
            goto L_0x022a
        L_0x0270:
            r6 = r17
            r10 = 2
            goto L_0x00bf
        L_0x0275:
            r17 = r6
        L_0x0277:
            r6 = r17
        L_0x0279:
            return r6
        L_0x027a:
            r17 = r6
            java.lang.Object r1 = r0.B
            ig r1 = (defpackage.ig) r1
            int r2 = r0.z
            if (r2 == 0) goto L_0x02a5
            r10 = 1
            if (r2 == r10) goto L_0x029b
            r6 = 2
            if (r2 == r6) goto L_0x0296
            r14 = 3
            if (r2 == r14) goto L_0x0296
            if (r2 != r4) goto L_0x0290
            goto L_0x0296
        L_0x0290:
            defpackage.h.s(r7)
            r6 = 0
            goto L_0x0358
        L_0x0296:
            defpackage.o85.q(r20)
            goto L_0x0356
        L_0x029b:
            java.lang.Object r2 = r0.A
            g97 r2 = (defpackage.g97) r2
            defpackage.o85.q(r20)
            r3 = r20
            goto L_0x02b9
        L_0x02a5:
            defpackage.o85.q(r20)
            java.lang.Object r2 = r0.A
            g97 r2 = (defpackage.g97) r2
            r0.A = r2
            r10 = 1
            r0.z = r10
            java.lang.Object r3 = defpackage.l55.a(r2, r0)
            if (r3 != r8) goto L_0x02b9
            goto L_0x0354
        L_0x02b9:
            kk5 r3 = (defpackage.kk5) r3
            java.lang.Object r5 = r1.c
            g58 r5 = (defpackage.g58) r5
            java.lang.Object r6 = r1.d
            qk5 r6 = (defpackage.qk5) r6
            java.util.List r7 = r3.a
            r9 = 0
            java.lang.Object r7 = r7.get(r9)
            qk5 r7 = (defpackage.qk5) r7
            if (r6 == 0) goto L_0x02f8
            long r9 = r7.b
            long r12 = r6.b
            long r9 = r9 - r12
            long r12 = r5.a()
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x02f8
            int r9 = r6.i
            float r5 = defpackage.my1.h(r5, r9)
            long r9 = r6.c
            long r12 = r7.c
            long r9 = defpackage.l35.d(r9, r12)
            float r6 = defpackage.l35.c(r9)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x02f8
            int r5 = r1.b
            r10 = 1
            int r5 = r5 + r10
            r1.b = r5
            goto L_0x02fb
        L_0x02f8:
            r10 = 1
            r1.b = r10
        L_0x02fb:
            r1.d = r7
            boolean r5 = defpackage.sj6.a(r3)
            if (r5 == 0) goto L_0x0333
            int r6 = r3.d
            r6 = r6 & 33
            if (r6 == 0) goto L_0x0333
            java.util.List r6 = r3.a
            int r7 = r6.size()
            r9 = 0
        L_0x0310:
            if (r9 >= r7) goto L_0x0322
            java.lang.Object r10 = r6.get(r9)
            qk5 r10 = (defpackage.qk5) r10
            boolean r10 = r10.c()
            if (r10 == 0) goto L_0x031f
            goto L_0x0333
        L_0x031f:
            int r9 = r9 + 1
            goto L_0x0310
        L_0x0322:
            java.lang.Object r4 = r0.C
            zc9 r4 = (defpackage.zc9) r4
            r15 = 0
            r0.A = r15
            r6 = 2
            r0.z = r6
            java.lang.Object r0 = defpackage.l55.s(r2, r4, r1, r3, r0)
            if (r0 != r8) goto L_0x0356
            goto L_0x0354
        L_0x0333:
            if (r5 != 0) goto L_0x0356
            int r1 = r1.b
            wd7 r11 = (defpackage.wd7) r11
            r10 = 1
            if (r1 != r10) goto L_0x0349
            r15 = 0
            r0.A = r15
            r14 = 3
            r0.z = r14
            java.lang.Object r0 = defpackage.l55.y(r2, r11, r3, r0)
            if (r0 != r8) goto L_0x0356
            goto L_0x0354
        L_0x0349:
            r15 = 0
            r0.A = r15
            r0.z = r4
            java.lang.Object r0 = defpackage.l55.b(r2, r11, r3, r1, r0)
            if (r0 != r8) goto L_0x0356
        L_0x0354:
            r6 = r8
            goto L_0x0358
        L_0x0356:
            r6 = r17
        L_0x0358:
            return r6
        L_0x0359:
            r17 = r6
            ob5 r11 = (defpackage.ob5) r11
            int r1 = r0.z
            if (r1 == 0) goto L_0x038a
            r10 = 1
            if (r1 == r10) goto L_0x0380
            r6 = 2
            if (r1 != r6) goto L_0x037a
            java.lang.Object r1 = r0.C
            qk5 r1 = (defpackage.qk5) r1
            java.lang.Object r2 = r0.B
            qk5 r2 = (defpackage.qk5) r2
            java.lang.Object r4 = r0.A
            g97 r4 = (defpackage.g97) r4
            defpackage.o85.q(r20)
            r13 = r1
            r1 = r20
            goto L_0x03c1
        L_0x037a:
            defpackage.h.s(r7)
            r6 = 0
            goto L_0x03fb
        L_0x0380:
            java.lang.Object r1 = r0.A
            g97 r1 = (defpackage.g97) r1
            defpackage.o85.q(r20)
            r2 = r20
            goto L_0x039e
        L_0x038a:
            defpackage.o85.q(r20)
            java.lang.Object r1 = r0.A
            g97 r1 = (defpackage.g97) r1
            r0.A = r1
            r10 = 1
            r0.z = r10
            r9 = 0
            java.lang.Object r2 = defpackage.sb7.a(r1, r9, r3, r0)
            if (r2 != r8) goto L_0x039e
            goto L_0x03bf
        L_0x039e:
            qk5 r2 = (defpackage.qk5) r2
            ed5 r4 = r11.c
            l35 r5 = new l35
            r6 = 0
            r5.<init>(r6)
            r4.setValue(r5)
            r4 = r1
            r13 = 0
        L_0x03ae:
            if (r13 != 0) goto L_0x03e7
            r0.A = r4
            r0.B = r2
            r0.C = r13
            r6 = 2
            r0.z = r6
            java.lang.Object r1 = r4.c(r3, r0)
            if (r1 != r8) goto L_0x03c1
        L_0x03bf:
            r6 = r8
            goto L_0x03fb
        L_0x03c1:
            kk5 r1 = (defpackage.kk5) r1
            java.util.List r5 = r1.a
            int r6 = r5.size()
            r7 = 0
        L_0x03ca:
            if (r7 >= r6) goto L_0x03dc
            java.lang.Object r9 = r5.get(r7)
            qk5 r9 = (defpackage.qk5) r9
            boolean r9 = defpackage.ub5.c(r9)
            if (r9 != 0) goto L_0x03d9
            goto L_0x03ae
        L_0x03d9:
            int r7 = r7 + 1
            goto L_0x03ca
        L_0x03dc:
            java.util.List r1 = r1.a
            r9 = 0
            java.lang.Object r1 = r1.get(r9)
            r13 = r1
            qk5 r13 = (defpackage.qk5) r13
            goto L_0x03ae
        L_0x03e7:
            long r0 = r13.c
            long r2 = r2.c
            long r0 = defpackage.l35.d(r0, r2)
            ed5 r2 = r11.c
            l35 r3 = new l35
            r3.<init>(r0)
            r2.setValue(r3)
            r6 = r17
        L_0x03fb:
            return r6
        L_0x03fc:
            ek7 r11 = (defpackage.ek7) r11
            int r1 = r0.z
            if (r1 == 0) goto L_0x0418
            r10 = 1
            if (r1 != r10) goto L_0x0413
            java.lang.Object r1 = r0.B
            lk5 r1 = (defpackage.lk5) r1
            java.lang.Object r2 = r0.A
            g97 r2 = (defpackage.g97) r2
            defpackage.o85.q(r20)
            r3 = r20
            goto L_0x0432
        L_0x0413:
            defpackage.h.s(r7)
            r8 = 0
            goto L_0x0431
        L_0x0418:
            defpackage.o85.q(r20)
            java.lang.Object r1 = r0.A
            g97 r1 = (defpackage.g97) r1
            r18 = r2
            r2 = r1
            r1 = r18
        L_0x0424:
            r0.A = r2
            r0.B = r1
            r10 = 1
            r0.z = r10
            java.lang.Object r3 = r2.c(r1, r0)
            if (r3 != r8) goto L_0x0432
        L_0x0431:
            return r8
        L_0x0432:
            kk5 r3 = (defpackage.kk5) r3
            java.util.List r5 = r3.a
            r9 = 0
            java.lang.Object r5 = r5.get(r9)
            qk5 r5 = (defpackage.qk5) r5
            int r5 = r5.i
            r6 = 2
            if (r5 != r6) goto L_0x0463
            int r3 = r3.f
            if (r3 != r4) goto L_0x0456
            java.lang.Object r3 = r0.C
            o81 r3 = (defpackage.o81) r3
            g70 r5 = new g70
            r10 = 1
            r15 = 0
            r5.<init>(r11, r15, r10)
            r14 = 3
            defpackage.ar7.H(r3, r15, r15, r5, r14)
            goto L_0x0424
        L_0x0456:
            r10 = 1
            r14 = 3
            r15 = 0
            r5 = 5
            if (r3 != r5) goto L_0x0424
            r11.getClass()
            r11.a()
            goto L_0x0424
        L_0x0463:
            r10 = 1
            r14 = 3
            r15 = 0
            goto L_0x0424
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l70.s(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l70(o81 o81, ek7 ek7, f61 f61) {
        super(2, f61);
        this.y = 0;
        this.C = o81;
        this.D = ek7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l70(Object obj, f61 f61, int i) {
        super(2, f61);
        this.y = i;
        this.D = obj;
    }
}
