package defpackage;

/* renamed from: id4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class id4 extends wx3 implements sr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ jd4 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id4(jd4 jd4, int i) {
        super(0);
        this.x = i;
        this.y = jd4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: lp4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: lp4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: dh5} */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14, types: [dh5] */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
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
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final java.lang.Object b() {
        /*
            r11 = this;
            int r0 = r11.x
            r1 = 0
            vs7 r2 = defpackage.vs7.a
            jd4 r11 = r11.y
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x001d;
                default: goto L_0x000a;
            }
        L_0x000a:
            yy3 r0 = r11.B
            xz4 r0 = r0.a()
            fd4 r0 = r0.a1()
            r0.getClass()
            long r3 = r11.U
            r0.y(r3)
            return r2
        L_0x001d:
            yy3 r0 = r11.B
            uy3 r3 = r0.a
            boolean r3 = defpackage.we.B(r3)
            if (r3 != 0) goto L_0x003c
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x003c
            xz4 r3 = r0.a()
            xz4 r3 = r3.Q
            if (r3 == 0) goto L_0x0046
            fd4 r3 = r3.a1()
            if (r3 == 0) goto L_0x0046
            ed4 r1 = r3.L
            goto L_0x0046
        L_0x003c:
            xz4 r3 = r0.a()
            xz4 r3 = r3.Q
            if (r3 == 0) goto L_0x0046
            ed4 r1 = r3.L
        L_0x0046:
            if (r1 != 0) goto L_0x0054
            uy3 r1 = r0.a
            p95 r1 = defpackage.xy3.a(r1)
            je r1 = (defpackage.je) r1
            dh5 r1 = r1.getPlacementScope()
        L_0x0054:
            xz4 r0 = r0.a()
            fd4 r0 = r0.a1()
            r0.getClass()
            long r3 = r11.K
            defpackage.dh5.j(r1, r0, r3)
            return r2
        L_0x0065:
            yy3 r0 = r11.B
            r3 = 0
            r0.h = r3
            uy3 r4 = r0.a
            eq4 r4 = r4.z()
            java.lang.Object[] r5 = r4.w
            int r4 = r4.y
            r6 = r3
        L_0x0075:
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 >= r4) goto L_0x0098
            r8 = r5[r6]
            uy3 r8 = (defpackage.uy3) r8
            yy3 r8 = r8.b0
            jd4 r8 = r8.q
            r8.getClass()
            int r9 = r8.E
            r8.D = r9
            r8.E = r7
            sy3 r7 = r8.F
            sy3 r9 = defpackage.sy3.x
            if (r7 != r9) goto L_0x0095
            sy3 r7 = defpackage.sy3.y
            r8.F = r7
        L_0x0095:
            int r6 = r6 + 1
            goto L_0x0075
        L_0x0098:
            uy3 r4 = r0.a
            uy3 r0 = r0.a
            eq4 r4 = r4.z()
            java.lang.Object[] r5 = r4.w
            int r4 = r4.y
            r6 = r3
        L_0x00a5:
            if (r6 >= r4) goto L_0x00b9
            r8 = r5[r6]
            uy3 r8 = (defpackage.uy3) r8
            yy3 r8 = r8.b0
            jd4 r8 = r8.q
            r8.getClass()
            vy3 r8 = r8.N
            r8.d = r3
            int r6 = r6 + 1
            goto L_0x00a5
        L_0x00b9:
            hc3 r11 = r11.f()
            gc3 r11 = r11.s0
            if (r11 == 0) goto L_0x0174
            java.util.List r4 = r0.n()
            jp4 r4 = (defpackage.jp4) r4
            java.lang.Object r5 = r4.x
            eq4 r5 = (defpackage.eq4) r5
            int r5 = r5.y
            r6 = r3
        L_0x00ce:
            if (r6 >= r5) goto L_0x00f8
            java.lang.Object r8 = r4.get(r6)
            uy3 r8 = (defpackage.uy3) r8
            o00 r9 = r8.a0
            java.lang.Object r9 = r9.e
            xz4 r9 = (defpackage.xz4) r9
            fd4 r9 = r9.a1()
            if (r9 != 0) goto L_0x00e3
            goto L_0x00f5
        L_0x00e3:
            boolean r10 = r9.K
            if (r10 == 0) goto L_0x00f1
            if (r1 != 0) goto L_0x00ee
            lp4 r1 = new lp4
            r1.<init>()
        L_0x00ee:
            r1.a(r8)
        L_0x00f1:
            boolean r8 = r11.K
            r9.K = r8
        L_0x00f5:
            int r6 = r6 + 1
            goto L_0x00ce
        L_0x00f8:
            mh4 r11 = r11.J0()
            r11.b()
            java.util.List r11 = r0.n()
            jp4 r11 = (defpackage.jp4) r11
            java.lang.Object r4 = r11.x
            eq4 r4 = (defpackage.eq4) r4
            int r4 = r4.y
            r5 = r3
        L_0x010c:
            r6 = 1
            if (r5 >= r4) goto L_0x0130
            java.lang.Object r8 = r11.get(r5)
            uy3 r8 = (defpackage.uy3) r8
            if (r1 == 0) goto L_0x011e
            int r9 = r1.g(r8)
            if (r9 < 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r6 = r3
        L_0x011f:
            o00 r8 = r8.a0
            java.lang.Object r8 = r8.e
            xz4 r8 = (defpackage.xz4) r8
            fd4 r8 = r8.a1()
            if (r8 == 0) goto L_0x012d
            r8.K = r6
        L_0x012d:
            int r5 = r5 + 1
            goto L_0x010c
        L_0x0130:
            eq4 r11 = r0.z()
            java.lang.Object[] r1 = r11.w
            int r11 = r11.y
            r4 = r3
        L_0x0139:
            if (r4 >= r11) goto L_0x0154
            r5 = r1[r4]
            uy3 r5 = (defpackage.uy3) r5
            yy3 r5 = r5.b0
            jd4 r5 = r5.q
            r5.getClass()
            int r8 = r5.D
            int r9 = r5.E
            if (r8 == r9) goto L_0x0151
            if (r9 != r7) goto L_0x0151
            r5.p0(r6)
        L_0x0151:
            int r4 = r4 + 1
            goto L_0x0139
        L_0x0154:
            eq4 r11 = r0.z()
            java.lang.Object[] r0 = r11.w
            int r11 = r11.y
        L_0x015c:
            if (r3 >= r11) goto L_0x0172
            r1 = r0[r3]
            uy3 r1 = (defpackage.uy3) r1
            yy3 r1 = r1.b0
            jd4 r1 = r1.q
            r1.getClass()
            vy3 r1 = r1.N
            boolean r4 = r1.d
            r1.e = r4
            int r3 = r3 + 1
            goto L_0x015c
        L_0x0172:
            r1 = r2
            goto L_0x0179
        L_0x0174:
            java.lang.String r11 = "Expected lookahead delegate"
            defpackage.h.s(r11)
        L_0x0179:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id4.b():java.lang.Object");
    }
}
