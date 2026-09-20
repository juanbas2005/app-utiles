package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: ve1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ve1 extends a97 implements vr2 {
    public Object A;
    public Serializable B;
    public Object C;
    public Object D;
    public Iterator E;
    public int F;
    public int G;
    public final /* synthetic */ jf1 H;
    public final /* synthetic */ am6 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ve1(jf1 jf1, am6 am6, f61 f61) {
        super(1, f61);
        this.H = jf1;
        this.I = am6;
    }

    public final f61 l(f61 f61) {
        return new ve1(this.H, this.I, f61);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: h06} */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Object, java.io.Serializable] */
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
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be A[SYNTHETIC] */
    public final java.lang.Object s(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.G
            am6 r1 = r14.I
            r2 = 4
            r3 = 3
            r4 = 2
            jf1 r5 = r14.H
            r6 = 1
            r7 = 0
            p81 r8 = defpackage.p81.w
            if (r0 == 0) goto L_0x0061
            if (r0 == r6) goto L_0x004d
            if (r0 == r4) goto L_0x0037
            if (r0 == r3) goto L_0x0026
            if (r0 != r2) goto L_0x0020
            int r0 = r14.F
            java.lang.Object r14 = r14.A
            defpackage.o85.q(r15)
            goto L_0x0101
        L_0x0020:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r14)
            return r7
        L_0x0026:
            java.lang.Object r0 = r14.C
            oq4 r0 = (defpackage.oq4) r0
            java.io.Serializable r1 = r14.B
            h06 r1 = (defpackage.h06) r1
            java.lang.Object r3 = r14.A
            d06 r3 = (defpackage.d06) r3
            defpackage.o85.q(r15)
            goto L_0x00da
        L_0x0037:
            java.util.Iterator r0 = r14.E
            java.lang.Object r9 = r14.D
            ue1 r9 = (defpackage.ue1) r9
            java.lang.Object r10 = r14.C
            h06 r10 = (defpackage.h06) r10
            java.io.Serializable r11 = r14.B
            d06 r11 = (defpackage.d06) r11
            java.lang.Object r12 = r14.A
            oq4 r12 = (defpackage.oq4) r12
            defpackage.o85.q(r15)
            goto L_0x009f
        L_0x004d:
            java.lang.Object r0 = r14.D
            h06 r0 = (defpackage.h06) r0
            java.lang.Object r9 = r14.C
            h06 r9 = (defpackage.h06) r9
            java.io.Serializable r10 = r14.B
            d06 r10 = (defpackage.d06) r10
            java.lang.Object r11 = r14.A
            oq4 r11 = (defpackage.oq4) r11
            defpackage.o85.q(r15)
            goto L_0x0086
        L_0x0061:
            defpackage.o85.q(r15)
            qq4 r11 = new qq4
            r11.<init>()
            d06 r10 = new d06
            r10.<init>()
            h06 r0 = new h06
            r0.<init>()
            r14.A = r11
            r14.B = r10
            r14.C = r0
            r14.D = r0
            r14.G = r6
            java.lang.Object r15 = defpackage.jf1.h(r5, r6, r14)
            if (r15 != r8) goto L_0x0085
            goto L_0x00fd
        L_0x0085:
            r9 = r0
        L_0x0086:
            de1 r15 = (defpackage.de1) r15
            java.lang.Object r15 = r15.b
            r0.w = r15
            ue1 r15 = new ue1
            r15.<init>(r11, r10, r9, r5)
            java.lang.Object r0 = r1.z
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00c2
            java.util.Iterator r0 = r0.iterator()
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r15
        L_0x009f:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x00be
            java.lang.Object r15 = r0.next()
            gs2 r15 = (defpackage.gs2) r15
            r14.A = r12
            r14.B = r11
            r14.C = r10
            r14.D = r9
            r14.E = r0
            r14.G = r4
            java.lang.Object r15 = r15.H(r9, r14)
            if (r15 != r8) goto L_0x009f
            goto L_0x00fd
        L_0x00be:
            r9 = r10
            r10 = r11
            r0 = r12
            goto L_0x00c3
        L_0x00c2:
            r0 = r11
        L_0x00c3:
            r1.z = r7
            r14.A = r10
            r14.B = r9
            r14.C = r0
            r14.D = r7
            r14.E = r7
            r14.G = r3
            java.lang.Object r15 = r0.a(r14)
            if (r15 != r8) goto L_0x00d8
            goto L_0x00fd
        L_0x00d8:
            r1 = r9
            r3 = r10
        L_0x00da:
            r3.w = r6     // Catch:{ all -> 0x010d }
            r0.k(r7)
            java.lang.Object r15 = r1.w
            if (r15 == 0) goto L_0x00e8
            int r0 = r15.hashCode()
            goto L_0x00e9
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            cf3 r1 = r5.i()
            r14.A = r15
            r14.B = r7
            r14.C = r7
            r14.F = r0
            r14.G = r2
            java.lang.Object r14 = r1.a(r14)
            if (r14 != r8) goto L_0x00fe
        L_0x00fd:
            return r8
        L_0x00fe:
            r13 = r15
            r15 = r14
            r14 = r13
        L_0x0101:
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            de1 r1 = new de1
            r1.<init>(r0, r15, r14)
            return r1
        L_0x010d:
            r14 = move-exception
            r0.k(r7)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve1.s(java.lang.Object):java.lang.Object");
    }

    public final Object y(Object obj) {
        return ((ve1) l((f61) obj)).s(vs7.a);
    }
}
