package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;

/* renamed from: d41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class d41 implements hs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d41(sk3 sk3, qt4 qt4, a37 a37, o81 o81, xz1 xz1) {
        this.w = 2;
        this.x = sk3;
        this.z = qt4;
        this.y = a37;
        this.A = o81;
        this.B = xz1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: e64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: e64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: e64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: gi0} */
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x019e, code lost:
        if (r8 == r10) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01a0, code lost:
        r8 = new defpackage.gi0(4, r15);
        r5.o0(r8);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a9, code lost:
        r26 = r5;
        defpackage.j45.b(r1, r18, r19, r20, (defpackage.ml4) null, r22, r23, (defpackage.sr2) r8, defpackage.rg3.d, r26, 100663296);
        r1 = r26;
        r5 = false;
        r1.r(false);
        r1.e0(561097913);
        r8 = new defpackage.e64(defpackage.n63.h(r1).l, 16);
        r1.r(false);
        r8 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final java.lang.Object u(java.lang.Object r47, java.lang.Object r48, java.lang.Object r49) {
        /*
            r46 = this;
            r0 = r46
            int r1 = r0.w
            sr r2 = defpackage.wr.c
            r3 = 15
            r4 = 18
            r5 = 1098907648(0x41800000, float:16.0)
            r6 = 1094713344(0x41400000, float:12.0)
            r7 = 16
            vs7 r9 = defpackage.vs7.a
            d63 r10 = defpackage.ay0.a
            java.lang.Object r12 = r0.B
            java.lang.Object r13 = r0.A
            java.lang.Object r14 = r0.y
            java.lang.Object r15 = r0.z
            java.lang.Object r0 = r0.x
            r8 = 1
            r11 = 2
            switch(r1) {
                case 0: goto L_0x0275;
                case 1: goto L_0x00cb;
                default: goto L_0x0023;
            }
        L_0x0023:
            sk3 r0 = (defpackage.sk3) r0
            qt4 r15 = (defpackage.qt4) r15
            a37 r14 = (defpackage.a37) r14
            o81 r13 = (defpackage.o81) r13
            xz1 r12 = (defpackage.xz1) r12
            r1 = r47
            bu0 r1 = (defpackage.bu0) r1
            r2 = r48
            yt2 r2 = (defpackage.yt2) r2
            r3 = r49
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            if (r1 == r7) goto L_0x0046
            r1 = r8
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            r3 = r3 & r8
            boolean r1 = r2.V(r3, r1)
            if (r1 == 0) goto L_0x00c5
            ox2 r1 = new ox2
            r1.<init>(r11)
            pa5 r3 = new pa5
            r3.<init>(r6, r5, r6, r5)
            ur r4 = new ur
            h r5 = new h
            r5.<init>(r11)
            r6 = 1090519040(0x41000000, float:8.0)
            r4.<init>(r6, r8, r5)
            ur r5 = new ur
            h r7 = new h
            r7.<init>(r11)
            r5.<init>(r6, r8, r7)
            boolean r6 = r2.g(r0)
            boolean r7 = r2.i(r15)
            r6 = r6 | r7
            boolean r7 = r2.g(r14)
            r6 = r6 | r7
            boolean r7 = r2.i(r13)
            r6 = r6 | r7
            boolean r7 = r2.g(r12)
            r6 = r6 | r7
            java.lang.Object r7 = r2.Q()
            if (r6 != 0) goto L_0x008e
            if (r7 != r10) goto L_0x00a4
        L_0x008e:
            b9 r17 = new b9
            r23 = 4
            r18 = r0
            r21 = r12
            r20 = r13
            r22 = r14
            r19 = r15
            r17.<init>((java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21, (java.lang.Object) r22, (int) r23)
            r7 = r17
            r2.o0(r7)
        L_0x00a4:
            r26 = r7
            vr2 r26 = (defpackage.vr2) r26
            r28 = 1772544(0x1b0c00, float:2.483863E-39)
            r29 = 918(0x396, float:1.286E-42)
            r18 = 0
            r19 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r17 = r1
            r27 = r2
            r20 = r3
            r22 = r4
            r21 = r5
            defpackage.ed1.d(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00ca
        L_0x00c5:
            r27 = r2
            r27.Y()
        L_0x00ca:
            return r9
        L_0x00cb:
            sk3 r0 = (defpackage.sk3) r0
            r23 = r14
            sr2 r23 = (defpackage.sr2) r23
            sr2 r15 = (defpackage.sr2) r15
            qw6 r13 = (defpackage.qw6) r13
            gs2 r12 = (defpackage.gs2) r12
            r1 = r47
            la5 r1 = (defpackage.la5) r1
            r5 = r48
            yt2 r5 = (defpackage.yt2) r5
            r6 = r49
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.getClass()
            r14 = r6 & 6
            if (r14 != 0) goto L_0x00f6
            boolean r14 = r5.g(r1)
            if (r14 == 0) goto L_0x00f5
            r11 = 4
        L_0x00f5:
            r6 = r6 | r11
        L_0x00f6:
            r11 = r6 & 19
            if (r11 == r4) goto L_0x00fc
            r4 = r8
            goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            r6 = r6 & r8
            boolean r4 = r5.V(r6, r4)
            if (r4 == 0) goto L_0x026e
            sd2 r4 = defpackage.yu6.c
            ml4 r4 = defpackage.x91.J(r4, r1)
            ma5 r6 = new ma5
            r6.<init>(r1)
            ml4 r1 = r4.d(r6)
            java.util.WeakHashMap r4 = defpackage.ib8.w
            ib8 r4 = defpackage.n63.h(r5)
            ss7 r4 = r4.l
            e64 r6 = new e64
            r6.<init>(r4, r3)
            ml4 r1 = defpackage.x91.T(r1, r6)
            g80 r3 = defpackage.xb4.K
            r4 = 0
            au0 r2 = defpackage.zt0.a(r2, r3, r5, r4)
            long r3 = r5.T
            int r3 = java.lang.Long.hashCode(r3)
            vf5 r4 = r5.m()
            ml4 r1 = defpackage.gw8.E(r5, r1)
            tx0 r6 = defpackage.ux0.d
            r6.getClass()
            vy0 r6 = defpackage.tx0.b
            r5.i0()
            boolean r11 = r5.S
            if (r11 == 0) goto L_0x014b
            r5.l(r6)
            goto L_0x014e
        L_0x014b:
            r5.r0()
        L_0x014e:
            ck r11 = defpackage.tx0.f
            defpackage.g75.Q(r11, r5, r2)
            ck r2 = defpackage.tx0.e
            defpackage.g75.Q(r2, r5, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            ck r4 = defpackage.tx0.g
            defpackage.g75.Q(r4, r5, r3)
            ce r3 = defpackage.tx0.h
            defpackage.g75.O(r5, r3)
            ck r14 = defpackage.tx0.d
            defpackage.g75.Q(r14, r5, r1)
            r1 = 0
            lk7 r8 = r0.b(r1, r5)
            if (r8 == 0) goto L_0x01d7
            r1 = 560189210(0x2163cf1a, float:7.718469E-19)
            r5.e0(r1)
            int r1 = r8.z
            java.lang.String r8 = r0.a
            r7 = 2131821389(0x7f11034d, float:1.927552E38)
            java.lang.String r19 = defpackage.l55.u(r7, r5)
            r7 = 2131821178(0x7f11027a, float:1.9275092E38)
            java.lang.String r20 = defpackage.l55.u(r7, r5)
            pa5 r7 = defpackage.gk7.a
            r18 = r8
            long r7 = defpackage.jt0.f
            fk7 r22 = defpackage.gk7.c(r7, r5)
            boolean r7 = r5.g(r15)
            java.lang.Object r8 = r5.Q()
            if (r7 != 0) goto L_0x01a0
            if (r8 != r10) goto L_0x01a9
        L_0x01a0:
            gi0 r8 = new gi0
            r7 = 4
            r8.<init>(r7, r15)
            r5.o0(r8)
        L_0x01a9:
            r24 = r8
            sr2 r24 = (defpackage.sr2) r24
            fw0 r25 = defpackage.rg3.d
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            r21 = 0
            r17 = r1
            r26 = r5
            defpackage.j45.b(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r26
            r5 = 0
            r1.r(r5)
            r7 = 561097913(0x2171acb9, float:8.1882573E-19)
            r1.e0(r7)
            ib8 r7 = defpackage.n63.h(r1)
            ss7 r7 = r7.l
            e64 r8 = new e64
            r15 = 16
            r8.<init>(r7, r15)
            r1.r(r5)
            goto L_0x01f0
        L_0x01d7:
            r1 = r5
            r5 = 0
            r7 = 560899389(0x216ea53d, float:8.085623E-19)
            r1.e0(r7)
            r1.r(r5)
            r7 = 561202197(0x21734415, float:8.242171E-19)
            r1.e0(r7)
            r1.r(r5)
            fg2 r8 = new fg2
            r8.<init>()
        L_0x01f0:
            ml4 r7 = defpackage.x91.r(r8)
            i80 r8 = defpackage.xb4.y
            lh4 r8 = defpackage.mb0.d(r8, r5)
            r16 = r9
            r17 = r10
            long r9 = r1.T
            int r5 = java.lang.Long.hashCode(r9)
            vf5 r9 = r1.m()
            ml4 r7 = defpackage.gw8.E(r1, r7)
            r1.i0()
            boolean r10 = r1.S
            if (r10 == 0) goto L_0x0217
            r1.l(r6)
            goto L_0x021a
        L_0x0217:
            r1.r0()
        L_0x021a:
            defpackage.g75.Q(r11, r1, r8)
            defpackage.g75.Q(r2, r1, r9)
            defpackage.f21.s(r5, r1, r4, r1, r3)
            defpackage.g75.Q(r14, r1, r7)
            t37 r2 = defpackage.ye.b
            java.lang.Object r2 = r1.k(r2)
            android.content.Context r2 = (android.content.Context) r2
            boolean r3 = r1.g(r13)
            boolean r4 = r1.i(r2)
            r3 = r3 | r4
            boolean r4 = r1.g(r12)
            r3 = r3 | r4
            java.lang.Object r4 = r1.Q()
            r21 = 0
            if (r3 != 0) goto L_0x024c
            r8 = r17
            if (r4 != r8) goto L_0x0249
            goto L_0x024c
        L_0x0249:
            r2 = r21
            goto L_0x0260
        L_0x024c:
            lk3 r17 = new lk3
            r22 = 1
            r19 = r2
            r20 = r12
            r18 = r13
            r17.<init>(r18, r19, r20, r21, r22)
            r4 = r17
            r2 = r21
            r1.o0(r4)
        L_0x0260:
            is2 r4 = (defpackage.is2) r4
            r5 = 0
            defpackage.rg3.b(r0, r4, r2, r1, r5)
            r0 = 1
            r1.r(r0)
            r1.r(r0)
            goto L_0x0274
        L_0x026e:
            r1 = r5
            r16 = r9
            r1.Y()
        L_0x0274:
            return r16
        L_0x0275:
            r16 = r9
            r8 = r10
            r7 = 4
            e41 r0 = (defpackage.e41) r0
            a37 r14 = (defpackage.a37) r14
            r17 = r15
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r12 = (java.lang.String) r12
            r1 = r47
            la5 r1 = (defpackage.la5) r1
            r9 = r48
            yt2 r9 = (defpackage.yt2) r9
            r10 = r49
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r1.getClass()
            r15 = r10 & 6
            if (r15 != 0) goto L_0x02a5
            boolean r15 = r9.g(r1)
            if (r15 == 0) goto L_0x02a3
            goto L_0x02a4
        L_0x02a3:
            r7 = r11
        L_0x02a4:
            r10 = r10 | r7
        L_0x02a5:
            r7 = r10 & 19
            if (r7 == r4) goto L_0x02ac
            r4 = 1
        L_0x02aa:
            r7 = 1
            goto L_0x02ae
        L_0x02ac:
            r4 = 0
            goto L_0x02aa
        L_0x02ae:
            r10 = r10 & r7
            boolean r4 = r9.V(r10, r4)
            if (r4 == 0) goto L_0x05a0
            sd2 r4 = defpackage.yu6.c
            ml4 r1 = defpackage.x91.J(r4, r1)
            g80 r4 = defpackage.xb4.K
            r7 = 0
            au0 r10 = defpackage.zt0.a(r2, r4, r9, r7)
            long r6 = r9.T
            int r6 = java.lang.Long.hashCode(r6)
            vf5 r7 = r9.m()
            ml4 r1 = defpackage.gw8.E(r9, r1)
            tx0 r18 = defpackage.ux0.d
            r18.getClass()
            r41 = r3
            vy0 r3 = defpackage.tx0.b
            r9.i0()
            boolean r15 = r9.S
            if (r15 == 0) goto L_0x02e4
            r9.l(r3)
            goto L_0x02e7
        L_0x02e4:
            r9.r0()
        L_0x02e7:
            ck r15 = defpackage.tx0.f
            defpackage.g75.Q(r15, r9, r10)
            ck r10 = defpackage.tx0.e
            defpackage.g75.Q(r10, r9, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            ck r7 = defpackage.tx0.g
            defpackage.g75.Q(r7, r9, r6)
            ce r6 = defpackage.tx0.h
            defpackage.g75.O(r9, r6)
            ck r5 = defpackage.tx0.d
            defpackage.g75.Q(r5, r9, r1)
            jl4 r1 = defpackage.jl4.w
            r11 = 1101004800(0x41a00000, float:20.0)
            r42 = r12
            ml4 r12 = defpackage.yu6.d(r1, r11)
            defpackage.k75.a(r9, r12)
            sd2 r12 = defpackage.yu6.a
            r40 = r13
            r13 = 0
            r43 = r8
            r44 = r14
            r8 = 2
            ml4 r14 = defpackage.x91.M(r12, r11, r13, r8)
            h80 r8 = defpackage.xb4.I
            rr r11 = defpackage.wr.a
            r13 = 48
            ea6 r8 = defpackage.ca6.a(r11, r8, r9, r13)
            r13 = r12
            long r11 = r9.T
            int r11 = java.lang.Long.hashCode(r11)
            vf5 r12 = r9.m()
            ml4 r14 = defpackage.gw8.E(r9, r14)
            r9.i0()
            r45 = r13
            boolean r13 = r9.S
            if (r13 == 0) goto L_0x0345
            r9.l(r3)
            goto L_0x0348
        L_0x0345:
            r9.r0()
        L_0x0348:
            defpackage.g75.Q(r15, r9, r8)
            defpackage.g75.Q(r10, r9, r12)
            defpackage.f21.s(r11, r9, r7, r9, r6)
            defpackage.g75.Q(r5, r9, r14)
            r8 = 1115684864(0x42800000, float:64.0)
            ml4 r8 = defpackage.yu6.l(r1, r8)
            o96 r11 = defpackage.q96.a
            ml4 r8 = defpackage.we.f(r8, r11)
            r11 = 4279658664(0xff1668a8, double:2.114432322E-314)
            long r11 = defpackage.uq3.d(r11)
            m23 r13 = defpackage.gr8.h
            ml4 r8 = defpackage.b96.h(r8, r11, r13)
            i80 r11 = defpackage.xb4.C
            r12 = 0
            lh4 r11 = defpackage.mb0.d(r11, r12)
            long r12 = r9.T
            int r12 = java.lang.Long.hashCode(r12)
            vf5 r13 = r9.m()
            ml4 r8 = defpackage.gw8.E(r9, r8)
            r9.i0()
            boolean r14 = r9.S
            if (r14 == 0) goto L_0x038f
            r9.l(r3)
            goto L_0x0392
        L_0x038f:
            r9.r0()
        L_0x0392:
            defpackage.g75.Q(r15, r9, r11)
            defpackage.g75.Q(r10, r9, r13)
            defpackage.f21.s(r12, r9, r7, r9, r6)
            defpackage.g75.Q(r5, r9, r8)
            long r19 = defpackage.jt0.c
            r8 = 26
            long r21 = defpackage.ya5.k(r8)
            am2 r24 = defpackage.am2.B
            r38 = 0
            r39 = 262058(0x3ffaa, float:3.67221E-40)
            r18 = 0
            r23 = r24
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 1597824(0x186180, float:2.239028E-39)
            r36 = r9
            defpackage.yf7.b(r17, r18, r19, r21, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r8 = r36
            r9 = 1
            r8.r(r9)
            r9 = 1098907648(0x41800000, float:16.0)
            ml4 r11 = defpackage.yu6.p(r1, r9)
            defpackage.k75.a(r8, r11)
            r12 = 0
            au0 r2 = defpackage.zt0.a(r2, r4, r8, r12)
            long r11 = r8.T
            int r4 = java.lang.Long.hashCode(r11)
            vf5 r9 = r8.m()
            ml4 r11 = defpackage.gw8.E(r8, r1)
            r8.i0()
            boolean r12 = r8.S
            if (r12 == 0) goto L_0x03fa
            r8.l(r3)
            goto L_0x03fd
        L_0x03fa:
            r8.r0()
        L_0x03fd:
            defpackage.g75.Q(r15, r8, r2)
            defpackage.g75.Q(r10, r8, r9)
            defpackage.f21.s(r4, r8, r7, r8, r6)
            defpackage.g75.Q(r5, r8, r11)
            long r20 = defpackage.x08.e()
            r2 = 20
            long r2 = defpackage.ya5.k(r2)
            r39 = 0
            r18 = r40
            r40 = 262058(0x3ffaa, float:3.67221E-40)
            r19 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 1597440(0x186000, float:2.23849E-39)
            r37 = r8
            r24 = r23
            r22 = r2
            defpackage.yf7.b(r18, r19, r20, r22, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r2 = r24
            long r20 = defpackage.x08.a()
            r3 = 14
            long r22 = defpackage.ya5.k(r3)
            r40 = 262122(0x3ffea, float:3.67311E-40)
            r24 = 0
            r38 = 24576(0x6000, float:3.4438E-41)
            r18 = r42
            defpackage.yf7.b(r18, r19, r20, r22, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r7 = 1
            r8.r(r7)
            r8.r(r7)
            r9 = 1098907648(0x41800000, float:16.0)
            ml4 r4 = defpackage.yu6.d(r1, r9)
            defpackage.k75.a(r8, r4)
            r4 = 4292666861(0xffdce5ed, double:2.120859225E-314)
            long r4 = defpackage.uq3.d(r4)
            r6 = 4281090902(0xff2c4356, double:2.1151399414E-314)
            long r6 = defpackage.uq3.d(r6)
            long r20 = defpackage.x08.f(r4, r6)
            r23 = 0
            r24 = 3
            r18 = 0
            r19 = 0
            r22 = r8
            defpackage.kl8.c(r18, r19, r20, r22, r23, r24)
            r15 = 1094713344(0x41400000, float:12.0)
            ml4 r4 = defpackage.yu6.d(r1, r15)
            defpackage.k75.a(r8, r4)
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0498
            r0 = 2131821554(0x7f1103f2, float:1.9275854E38)
            goto L_0x049b
        L_0x0498:
            r0 = 2131821530(0x7f1103da, float:1.9275806E38)
        L_0x049b:
            java.lang.String r18 = defpackage.l55.u(r0, r8)
            long r20 = defpackage.x08.e()
            long r22 = defpackage.ya5.k(r41)
            r0 = 2
            r4 = 0
            r5 = 1101004800(0x41a00000, float:20.0)
            ml4 r19 = defpackage.x91.M(r1, r5, r4, r0)
            r39 = 0
            r40 = 262056(0x3ffa8, float:3.67219E-40)
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 1597488(0x186030, float:2.238557E-39)
            r24 = r2
            r37 = r8
            defpackage.yf7.b(r18, r19, r20, r22, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0 = 1082130432(0x40800000, float:4.0)
            ml4 r2 = defpackage.yu6.d(r1, r0)
            defpackage.k75.a(r8, r2)
            java.lang.Object r2 = r44.getValue()
            b41 r2 = (defpackage.b41) r2
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x0546
            java.lang.Object r2 = r44.getValue()
            b41 r2 = (defpackage.b41) r2
            java.util.List r2 = r2.a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0546
            java.lang.Object r2 = r44.getValue()
            b41 r2 = (defpackage.b41) r2
            java.util.List r2 = r2.b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0546
            r0 = -168063482(0xfffffffff5fb8e06, float:-6.3776713E32)
            r8.e0(r0)
            r0 = 2131820955(0x7f11019b, float:1.927464E38)
            java.lang.String r18 = defpackage.l55.u(r0, r8)
            long r20 = defpackage.x08.a()
            long r22 = defpackage.ya5.k(r3)
            r5 = 1101004800(0x41a00000, float:20.0)
            r15 = 1094713344(0x41400000, float:12.0)
            ml4 r19 = defpackage.x91.L(r1, r5, r15)
            r39 = 0
            r40 = 262120(0x3ffe8, float:3.67308E-40)
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 24624(0x6030, float:3.4506E-41)
            r37 = r8
            defpackage.yf7.b(r18, r19, r20, r22, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r12 = 0
            r8.r(r12)
        L_0x0544:
            r7 = 1
            goto L_0x059c
        L_0x0546:
            r1 = -167774624(0xfffffffff5fff660, float:-6.489418E32)
            r8.e0(r1)
            lz3 r1 = new lz3
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = 1
            r1.<init>(r2, r7)
            r13 = r45
            ml4 r18 = r13.d(r1)
            pa5 r1 = new pa5
            r2 = 1130102784(0x435c0000, float:220.0)
            r5 = 1101004800(0x41a00000, float:20.0)
            r1.<init>(r5, r0, r5, r2)
            r14 = r44
            boolean r0 = r8.g(r14)
            java.lang.Object r2 = r8.Q()
            if (r0 != 0) goto L_0x0573
            r0 = r43
            if (r2 != r0) goto L_0x057c
        L_0x0573:
            pn r2 = new pn
            r7 = 1
            r2.<init>(r7, r14)
            r8.o0(r2)
        L_0x057c:
            r26 = r2
            vr2 r26 = (defpackage.vr2) r26
            r28 = 0
            r29 = 506(0x1fa, float:7.09E-43)
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r20 = r1
            r27 = r8
            defpackage.x91.a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r12 = 0
            r8.r(r12)
            goto L_0x0544
        L_0x059c:
            r8.r(r7)
            goto L_0x05a4
        L_0x05a0:
            r8 = r9
            r8.Y()
        L_0x05a4:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d41.u(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ d41(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj5;
    }
}
