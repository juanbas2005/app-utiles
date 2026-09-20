package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lq4 extends a97 implements gs2 {
    public oq4 A;
    public Object B;
    public Object C;
    public mq4 D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ hq4 G;
    public final /* synthetic */ mq4 H;
    public final /* synthetic */ gs2 I;
    public final /* synthetic */ Object J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lq4(hq4 hq4, mq4 mq4, gs2 gs2, Object obj, f61 f61) {
        super(2, f61);
        this.G = hq4;
        this.H = mq4;
        this.I = gs2;
        this.J = obj;
    }

    public final Object H(Object obj, Object obj2) {
        return ((lq4) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        lq4 lq4 = new lq4(this.G, this.H, this.I, this.J, f61);
        lq4.F = obj;
        return lq4;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [oq4] */
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
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099 A[Catch:{ all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0090=Splitter:B:19:0x0090, B:31:0x00ab=Splitter:B:31:0x00ab} */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final java.lang.Object s(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.E
            r1 = 2
            r2 = 1
            r3 = 0
            p81 r4 = defpackage.p81.w
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0025
            if (r0 != r1) goto L_0x001f
            java.lang.Object r0 = r8.B
            mq4 r0 = (defpackage.mq4) r0
            oq4 r1 = r8.A
            java.lang.Object r8 = r8.F
            jq4 r8 = (defpackage.jq4) r8
            defpackage.o85.q(r9)     // Catch:{ all -> 0x001c }
            goto L_0x0090
        L_0x001c:
            r9 = move-exception
            goto L_0x00ab
        L_0x001f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r8)
            return r3
        L_0x0025:
            mq4 r0 = r8.D
            java.lang.Object r2 = r8.C
            java.lang.Object r5 = r8.B
            gs2 r5 = (defpackage.gs2) r5
            oq4 r6 = r8.A
            java.lang.Object r7 = r8.F
            jq4 r7 = (defpackage.jq4) r7
            defpackage.o85.q(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L_0x0078
        L_0x003c:
            defpackage.o85.q(r9)
            java.lang.Object r9 = r8.F
            o81 r9 = (defpackage.o81) r9
            jq4 r0 = new jq4
            e81 r9 = r9.k()
            me6 r5 = defpackage.me6.E
            c81 r9 = r9.a0(r5)
            r9.getClass()
            el3 r9 = (defpackage.el3) r9
            hq4 r5 = r8.G
            r0.<init>(r5, r9)
            mq4 r9 = r8.H
            defpackage.mq4.a(r9, r0)
            qq4 r5 = r9.b
            r8.F = r0
            r8.A = r5
            gs2 r6 = r8.I
            r8.B = r6
            java.lang.Object r7 = r8.J
            r8.C = r7
            r8.D = r9
            r8.E = r2
            java.lang.Object r2 = r5.a(r8)
            if (r2 != r4) goto L_0x0077
            goto L_0x008a
        L_0x0077:
            r2 = r7
        L_0x0078:
            r8.F = r0     // Catch:{ all -> 0x00a5 }
            r8.A = r5     // Catch:{ all -> 0x00a5 }
            r8.B = r9     // Catch:{ all -> 0x00a5 }
            r8.C = r3     // Catch:{ all -> 0x00a5 }
            r8.D = r3     // Catch:{ all -> 0x00a5 }
            r8.E = r1     // Catch:{ all -> 0x00a5 }
            java.lang.Object r8 = r6.H(r2, r8)     // Catch:{ all -> 0x00a5 }
            if (r8 != r4) goto L_0x008b
        L_0x008a:
            return r4
        L_0x008b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L_0x0090:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch:{ all -> 0x00a3 }
        L_0x0092:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00a3 }
            if (r2 == r8) goto L_0x0092
        L_0x009f:
            r1.k(r3)
            return r9
        L_0x00a3:
            r8 = move-exception
            goto L_0x00bb
        L_0x00a5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L_0x00ab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch:{ all -> 0x00a3 }
        L_0x00ad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch:{ all -> 0x00a3 }
            if (r2 != 0) goto L_0x00ba
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00a3 }
            if (r2 != r8) goto L_0x00ba
            goto L_0x00ad
        L_0x00ba:
            throw r9     // Catch:{ all -> 0x00a3 }
        L_0x00bb:
            r1.k(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq4.s(java.lang.Object):java.lang.Object");
    }
}
