package defpackage;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* renamed from: uc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uc9 implements tc9, hd9 {
    public static final String i = new String();
    public final Level a;
    public final long b;
    public yc9 c = null;
    public fd9 d = null;
    public md9 e = null;
    public gj8 f = null;
    public Object[] g = null;
    public final /* synthetic */ ji8 h;

    public uc9(ji8 ji8, Level level) {
        Objects.requireNonNull(ji8);
        this.h = ji8;
        dj8.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        jb5.K("level", level);
        this.a = level;
        this.b = nanos;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, fd9, ed9] */
    public final hd9 a() {
        ? obj = new Object();
        obj.b = 0;
        if (this.d == null) {
            this.d = obj;
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: md9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: nd9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: nd9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: nd9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: nd9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: qc9} */
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
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        if (r10 != 0) goto L_0x00fe;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        if (r4 == r8) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
        r11 = defpackage.md9.b;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
        if (r10 != r11) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        if (r10 == r8) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        if (r4 != r11) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        r4 = new defpackage.kd9(r4, r10);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    public final void b(java.lang.String r19, java.lang.Object[] r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            fd9 r3 = r1.d
            dd9 r4 = defpackage.fd9.a
            if (r3 != 0) goto L_0x001a
            ej8 r3 = defpackage.dj8.a
            ij8 r3 = (defpackage.ij8) r3
            r3.getClass()
            n63 r3 = defpackage.ij8.b
            r3.getClass()
            r1.d = r4
        L_0x001a:
            fd9 r3 = r1.d
            r5 = 0
            r6 = 0
            if (r3 == r4) goto L_0x004b
            yc9 r4 = r1.c
            if (r4 == 0) goto L_0x004c
            int r7 = r4.e
            if (r7 <= 0) goto L_0x004c
            java.lang.String r7 = "logSiteKey"
            defpackage.jb5.K(r7, r3)
            int r7 = r4.e
            r8 = r6
        L_0x0030:
            if (r8 >= r7) goto L_0x004c
            wc9 r9 = defpackage.xc9.f
            id9 r10 = r4.y(r8)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0048
            java.lang.Object r9 = r4.z(r8)
            od9 r10 = new od9
            r10.<init>(r3, r9)
            r3 = r10
        L_0x0048:
            int r8 = r8 + 1
            goto L_0x0030
        L_0x004b:
            r3 = r5
        L_0x004c:
            b85 r4 = r1.d()
            int r7 = r4.w()
            r8 = r6
        L_0x0055:
            if (r8 >= r7) goto L_0x007a
            id9 r9 = r4.y(r8)
            java.lang.String r9 = r9.a
            java.lang.String r10 = "eye3tag"
            if (r9 != r10) goto L_0x0077
            id9 r7 = defpackage.xc9.a
            java.lang.Object r7 = r4.A(r7)
            if (r7 != 0) goto L_0x007a
            id9 r7 = defpackage.xc9.i
            java.lang.Object r4 = r4.A(r7)
            if (r4 != 0) goto L_0x007a
            pd9 r4 = defpackage.pd9.x
            r1.e(r7, r4)
            goto L_0x007a
        L_0x0077:
            int r8 = r8 + 1
            goto L_0x0055
        L_0x007a:
            yc9 r4 = r1.c
            r7 = -1
            jd9 r8 = defpackage.md9.a
            r9 = 1
            if (r4 == 0) goto L_0x01d9
            if (r3 == 0) goto L_0x011b
            int r10 = defpackage.sc9.d
            id9 r10 = defpackage.xc9.d
            java.lang.Object r4 = r4.A(r10)
            if (r4 != 0) goto L_0x0117
            yc9 r4 = r1.c
            pc9 r10 = defpackage.qc9.d
            id9 r10 = defpackage.xc9.b
            java.lang.Object r10 = r4.A(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x009e
            r4 = r5
            goto L_0x00b7
        L_0x009e:
            pc9 r11 = defpackage.qc9.d
            java.lang.Object r4 = r11.V0(r3, r4)
            qc9 r4 = (defpackage.qc9) r4
            java.util.concurrent.atomic.AtomicLong r11 = r4.c
            int r10 = r10.intValue()
            long r12 = (long) r10
            long r10 = r11.incrementAndGet()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r4 = r8
        L_0x00b7:
            yc9 r10 = r1.c
            pc9 r11 = defpackage.nd9.d
            id9 r11 = defpackage.xc9.c
            java.lang.Object r11 = r10.A(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x00f6
            int r12 = r11.intValue()
            if (r12 > 0) goto L_0x00cc
            goto L_0x00f6
        L_0x00cc:
            pc9 r12 = defpackage.nd9.d
            java.lang.Object r10 = r12.V0(r3, r10)
            nd9 r10 = (defpackage.nd9) r10
            int r11 = r11.intValue()
            cj r12 = defpackage.nd9.e
            java.lang.Object r12 = r12.get()
            java.util.Random r12 = (java.util.Random) r12
            int r11 = r12.nextInt(r11)
            java.util.concurrent.atomic.AtomicInteger r12 = r10.c
            if (r11 != 0) goto L_0x00ed
            int r11 = r12.incrementAndGet()
            goto L_0x00f1
        L_0x00ed:
            int r11 = r12.get()
        L_0x00f1:
            if (r11 <= 0) goto L_0x00f4
            goto L_0x00f7
        L_0x00f4:
            r10 = r8
            goto L_0x00f7
        L_0x00f6:
            r10 = r5
        L_0x00f7:
            if (r4 != 0) goto L_0x00fb
        L_0x00f9:
            r4 = r10
            goto L_0x0110
        L_0x00fb:
            if (r10 != 0) goto L_0x00fe
            goto L_0x0110
        L_0x00fe:
            if (r4 == r8) goto L_0x0110
            jd9 r11 = defpackage.md9.b
            if (r10 != r11) goto L_0x0105
            goto L_0x0110
        L_0x0105:
            if (r10 == r8) goto L_0x00f9
            if (r4 != r11) goto L_0x010a
            goto L_0x00f9
        L_0x010a:
            kd9 r11 = new kd9
            r11.<init>(r4, r10)
            r4 = r11
        L_0x0110:
            r1.e = r4
            if (r4 != r8) goto L_0x011b
            r4 = r6
            goto L_0x01e1
        L_0x0117:
            defpackage.ku4.a()
            return
        L_0x011b:
            yc9 r4 = r1.c
            id9 r10 = defpackage.xc9.i
            java.lang.Object r4 = r4.A(r10)
            pd9 r4 = (defpackage.pd9) r4
            if (r4 == 0) goto L_0x01d9
            yc9 r11 = r1.c
            if (r11 == 0) goto L_0x0165
            int r12 = r11.C(r10)
            if (r12 < 0) goto L_0x0165
            int r12 = r12 + r12
            int r13 = r12 + 2
        L_0x0134:
            int r14 = r11.e
            int r15 = r14 + r14
            if (r13 >= r15) goto L_0x0155
            java.lang.Object[] r14 = r11.d
            r14 = r14[r13]
            boolean r15 = r14.equals(r10)
            if (r15 != 0) goto L_0x0152
            java.lang.Object[] r15 = r11.d
            r15[r12] = r14
            int r14 = r12 + 1
            int r16 = r13 + 1
            r16 = r15[r16]
            r15[r14] = r16
            int r12 = r12 + 2
        L_0x0152:
            int r13 = r13 + 2
            goto L_0x0134
        L_0x0155:
            int r10 = r13 - r12
            int r10 = r10 >> r9
            int r14 = r14 - r10
            r11.e = r14
        L_0x015b:
            if (r12 >= r13) goto L_0x0165
            java.lang.Object[] r10 = r11.d
            int r14 = r12 + 1
            r10[r12] = r5
            r12 = r14
            goto L_0x015b
        L_0x0165:
            com.google.android.gms.internal.measurement.zzyg r5 = new com.google.android.gms.internal.measurement.zzyg
            b85 r10 = r1.d()
            id9 r11 = defpackage.xc9.a
            java.lang.Object r10 = r10.A(r11)
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            int r12 = r4.w
            java.lang.String[] r13 = defpackage.fk8.a
            if (r12 > 0) goto L_0x0182
            if (r12 != r7) goto L_0x017c
            goto L_0x0182
        L_0x017c:
            java.lang.String r0 = "invalid maximum depth: 0"
            defpackage.h.q(r0)
            return
        L_0x0182:
            hk8 r13 = defpackage.fk8.b
            r13.getClass()
            if (r12 == r7) goto L_0x018b
            if (r12 <= 0) goto L_0x018d
        L_0x018b:
            r13 = r9
            goto L_0x018e
        L_0x018d:
            r13 = r6
        L_0x018e:
            if (r13 == 0) goto L_0x01db
            java.lang.Throwable r13 = new java.lang.Throwable
            r13.<init>()
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()
            java.lang.Class<uc9> r14 = defpackage.uc9.class
            java.lang.String r14 = r14.getName()
            r15 = 3
            r16 = r6
        L_0x01a2:
            int r9 = r13.length
            if (r15 >= r9) goto L_0x01ba
            r9 = r13[r15]
            java.lang.String r9 = r9.getClassName()
            boolean r9 = r9.equals(r14)
            if (r9 == 0) goto L_0x01b4
            r16 = 1
            goto L_0x01b7
        L_0x01b4:
            if (r16 == 0) goto L_0x01b7
            goto L_0x01bb
        L_0x01b7:
            int r15 = r15 + 1
            goto L_0x01a2
        L_0x01ba:
            r15 = r7
        L_0x01bb:
            if (r15 != r7) goto L_0x01c0
            java.lang.StackTraceElement[] r9 = new java.lang.StackTraceElement[r6]
            goto L_0x01cc
        L_0x01c0:
            int r9 = r13.length
            int r9 = r9 - r15
            if (r12 <= 0) goto L_0x01c6
            if (r12 < r9) goto L_0x01c7
        L_0x01c6:
            r12 = r9
        L_0x01c7:
            java.lang.StackTraceElement[] r9 = new java.lang.StackTraceElement[r12]
            java.lang.System.arraycopy(r13, r15, r9, r6, r12)
        L_0x01cc:
            java.lang.String r4 = r4.toString()
            r5.<init>(r4, r10)
            r5.setStackTrace(r9)
            r1.e(r11, r5)
        L_0x01d9:
            r4 = 1
            goto L_0x01e1
        L_0x01db:
            java.lang.String r0 = "maxDepth must be > 0 or -1"
            defpackage.h.q(r0)
            return
        L_0x01e1:
            md9 r5 = r1.e
            if (r5 == 0) goto L_0x0229
            yc9 r9 = r1.c
            pc9 r10 = defpackage.ld9.c
            java.lang.Object r3 = r10.V0(r3, r9)
            ld9 r3 = (defpackage.ld9) r3
            java.util.concurrent.atomic.AtomicInteger r9 = r3.b
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.a
            int r10 = r9.incrementAndGet()
            if (r5 == r8) goto L_0x0212
            r8 = 1
            boolean r11 = r3.compareAndSet(r6, r8)
            if (r11 != 0) goto L_0x0201
            goto L_0x0212
        L_0x0201:
            r5.a()     // Catch:{ all -> 0x020d }
            r3.set(r6)
            int r3 = -r10
            r9.addAndGet(r3)
            int r7 = r7 + r10
            goto L_0x0212
        L_0x020d:
            r0 = move-exception
            r3.set(r6)
            throw r0
        L_0x0212:
            if (r4 == 0) goto L_0x0223
            if (r7 <= 0) goto L_0x0223
            yc9 r3 = r1.c
            if (r3 == 0) goto L_0x0223
            id9 r5 = defpackage.xc9.e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3.B(r5, r8)
        L_0x0223:
            if (r7 < 0) goto L_0x0227
            r8 = 1
            goto L_0x0228
        L_0x0227:
            r8 = r6
        L_0x0228:
            r4 = r4 & r8
        L_0x0229:
            if (r4 == 0) goto L_0x030a
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            r1.g = r2
        L_0x0232:
            int r3 = r2.length
            if (r6 >= r3) goto L_0x023a
            r3 = r2[r6]
            int r6 = r6 + 1
            goto L_0x0232
        L_0x023a:
            java.lang.String r2 = i
            if (r0 == r2) goto L_0x0247
            gj8 r2 = new gj8
            dk8 r3 = defpackage.dk8.b
            r2.<init>(r0)
            r1.f = r2
        L_0x0247:
            ej8 r0 = defpackage.dj8.a
            ij8 r0 = (defpackage.ij8) r0
            r0.getClass()
            nj8 r0 = defpackage.nj8.b
            yj8 r0 = r0.b()
            xj8 r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x028a
            b85 r2 = r1.d()
            wc9 r3 = defpackage.xc9.h
            java.lang.Object r2 = r2.A(r3)
            yj8 r2 = (defpackage.yj8) r2
            if (r2 == 0) goto L_0x0287
            xj8 r4 = r2.a
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0287
            xj8 r0 = r0.a
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x027c
        L_0x027a:
            r0 = r2
            goto L_0x0287
        L_0x027c:
            yj8 r2 = new yj8
            xj8 r5 = new xj8
            r5.<init>(r0, r4)
            r2.<init>(r5)
            goto L_0x027a
        L_0x0287:
            r1.e(r3, r0)
        L_0x028a:
            ji8 r0 = r1.h
            java.lang.Object r0 = r0.x
            r2 = r0
            f76 r2 = (defpackage.f76) r2
            cj r0 = defpackage.gk8.x     // Catch:{ RuntimeException -> 0x02b8 }
            java.lang.Object r0 = r0.get()     // Catch:{ RuntimeException -> 0x02b8 }
            r3 = r0
            gk8 r3 = (defpackage.gk8) r3     // Catch:{ RuntimeException -> 0x02b8 }
            int r0 = r3.w     // Catch:{ RuntimeException -> 0x02b8 }
            r17 = 1
            int r0 = r0 + 1
            r3.w = r0     // Catch:{ RuntimeException -> 0x02b8 }
            if (r0 == 0) goto L_0x02c3
            r4 = 100
            if (r0 > r4) goto L_0x02af
            r2.b(r1)     // Catch:{ all -> 0x02ac }
            goto L_0x02b4
        L_0x02ac:
            r0 = move-exception
            r4 = r0
            goto L_0x02ba
        L_0x02af:
            java.lang.String r0 = "unbounded recursion in log statement"
            defpackage.ji8.K(r0, r1)     // Catch:{ all -> 0x02ac }
        L_0x02b4:
            r3.close()     // Catch:{ RuntimeException -> 0x02b8 }
            return
        L_0x02b8:
            r0 = move-exception
            goto L_0x02cb
        L_0x02ba:
            r3.close()     // Catch:{ all -> 0x02be }
            goto L_0x02c2
        L_0x02be:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ RuntimeException -> 0x02b8 }
        L_0x02c2:
            throw r4     // Catch:{ RuntimeException -> 0x02b8 }
        L_0x02c3:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ RuntimeException -> 0x02b8 }
            java.lang.String r3 = "Overflow of RecursionDepth (possible error in core library)"
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x02b8 }
            throw r0     // Catch:{ RuntimeException -> 0x02b8 }
        L_0x02cb:
            r2.c(r0, r1)     // Catch:{ zzzg -> 0x0308, RuntimeException -> 0x02cf }
            goto L_0x030a
        L_0x02cf:
            r0 = move-exception
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r0.getMessage()
            int r4 = r2.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r4 = r4 + 2
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r2)
            java.lang.String r2 = ": "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            defpackage.ji8.K(r2, r1)
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ RuntimeException -> 0x030a }
            r0.printStackTrace(r1)     // Catch:{ RuntimeException -> 0x030a }
            goto L_0x030a
        L_0x0308:
            r0 = move-exception
            throw r0
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc9.b(java.lang.String, java.lang.Object[]):void");
    }

    public final hd9 c(Throwable th) {
        id9 id9 = xc9.a;
        jb5.K("metadata key", id9);
        if (th != null) {
            e(id9, th);
        }
        return this;
    }

    public final b85 d() {
        yc9 yc9 = this.c;
        if (yc9 != null) {
            return yc9;
        }
        return wd9.d;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, yc9] */
    public final void e(id9 id9, Object obj) {
        if (this.c == null) {
            ? obj2 = new Object();
            obj2.d = new Object[8];
            obj2.e = 0;
            this.c = obj2;
        }
        this.c.B(id9, obj);
    }
}
