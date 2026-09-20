package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: z42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class z42 {
    public static final String a = bc4.p("EnqueueRunnable");

    public static void a(cd8 cd8) {
        boolean z;
        nd8 nd8 = cd8.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(cd8.e);
        HashSet b = cd8.b(cd8);
        Iterator it = hashSet.iterator();
        while (true) {
            if (it.hasNext()) {
                if (b.contains((String) it.next())) {
                    z = true;
                    break;
                }
            } else {
                hashSet.removeAll(cd8.e);
                z = false;
                break;
            }
        }
        if (!z) {
            WorkDatabase workDatabase = nd8.c;
            f01 f01 = nd8.b;
            workDatabase.b();
            try {
                mp7.R(workDatabase, f01, cd8);
                boolean b2 = b(cd8);
                workDatabase.p();
                if (b2) {
                    mg6.b(f01, nd8.c, nd8.e);
                }
            } finally {
                workDatabase.f();
            }
        } else {
            rf2.h(cd8, ")", "WorkContinuation has cycles (");
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object[]] */
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
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016e, code lost:
        if (r17 != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0170, code lost:
        r0 = r22.w();
        r2 = r0.f(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0180, code lost:
        if (r2.hasNext() == false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0182, code lost:
        r0.c(((defpackage.zd8) r2.next()).a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018e, code lost:
        r16 = false;
        r17 = false;
        r15 = java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b5  */
    public static boolean b(defpackage.cd8 r25) {
        /*
            r0 = r25
            java.util.HashSet r1 = defpackage.cd8.b(r0)
            nd8 r2 = r0.a
            java.util.List r3 = r0.d
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r5)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r5 = r0.b
            w82 r6 = r0.c
            f01 r7 = r2.b
            z53 r7 = r7.d
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r9 = r2.c
            if (r1 == 0) goto L_0x002b
            int r11 = r1.length
            if (r11 <= 0) goto L_0x002b
            r11 = 1
            goto L_0x002c
        L_0x002b:
            r11 = r4
        L_0x002c:
            kd8 r12 = defpackage.kd8.y
            kd8 r13 = defpackage.kd8.B
            kd8 r14 = defpackage.kd8.z
            if (r11 == 0) goto L_0x0085
            int r15 = r1.length
            r16 = r4
            r17 = r16
            r18 = 1
        L_0x003b:
            if (r4 >= r15) goto L_0x0082
            r10 = r1[r4]
            r19 = r3
            fe8 r3 = r9.w()
            be8 r3 = r3.e(r10)
            if (r3 != 0) goto L_0x006b
            bc4 r1 = defpackage.bc4.k()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Prerequisite "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = a
            r1.h(r3, r2)
        L_0x0067:
            r4 = 0
            r10 = 1
            goto L_0x0272
        L_0x006b:
            kd8 r3 = r3.b
            if (r3 != r12) goto L_0x0071
            r10 = 1
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            r18 = r18 & r10
            if (r3 != r14) goto L_0x0079
            r17 = 1
            goto L_0x007d
        L_0x0079:
            if (r3 != r13) goto L_0x007d
            r16 = 1
        L_0x007d:
            int r4 = r4 + 1
            r3 = r19
            goto L_0x003b
        L_0x0082:
            r19 = r3
            goto L_0x008c
        L_0x0085:
            r16 = 0
            r17 = 0
            r18 = 1
            goto L_0x0082
        L_0x008c:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            kd8 r4 = defpackage.kd8.w
            if (r3 != 0) goto L_0x01a3
            if (r11 != 0) goto L_0x01a3
            fe8 r10 = r9.w()
            java.util.List r10 = r10.f(r5)
            boolean r15 = r10.isEmpty()
            if (r15 != 0) goto L_0x01a3
            w82 r15 = defpackage.w82.y
            r20 = r3
            w82 r3 = defpackage.w82.z
            if (r6 == r15) goto L_0x0100
            if (r6 != r3) goto L_0x00af
            goto L_0x0100
        L_0x00af:
            w82 r3 = defpackage.w82.x
            if (r6 != r3) goto L_0x00cc
            java.util.Iterator r3 = r10.iterator()
        L_0x00b7:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r6 = r3.next()
            zd8 r6 = (defpackage.zd8) r6
            kd8 r6 = r6.b
            if (r6 == r4) goto L_0x0067
            kd8 r12 = defpackage.kd8.x
            if (r6 != r12) goto L_0x00b7
            goto L_0x0067
        L_0x00cc:
            r9.getClass()
            ti r3 = new ti
            r6 = 1
            r3.<init>(r9, r5, r2, r6)
            hx4 r6 = new hx4
            r12 = 13
            r6.<init>(r12, r3)
            r9.o(r6)
            fe8 r3 = r9.w()
            java.util.Iterator r6 = r10.iterator()
        L_0x00e7:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00f9
            java.lang.Object r10 = r6.next()
            zd8 r10 = (defpackage.zd8) r10
            java.lang.String r10 = r10.a
            r3.c(r10)
            goto L_0x00e7
        L_0x00f9:
            r24 = r2
            r22 = r9
            r0 = 1
            goto L_0x01aa
        L_0x0100:
            cq1 r11 = r9.r()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x010d:
            boolean r21 = r10.hasNext()
            if (r21 == 0) goto L_0x0166
            java.lang.Object r21 = r10.next()
            r22 = r9
            r9 = r21
            zd8 r9 = (defpackage.zd8) r9
            r21 = r10
            java.lang.String r10 = r9.a
            r11.getClass()
            r10.getClass()
            a96 r0 = r11.a
            r23 = r11
            cb r11 = new cb
            r24 = r2
            r2 = 8
            r11.<init>((java.lang.String) r10, (int) r2)
            r2 = 0
            r10 = 1
            java.lang.Object r0 = defpackage.sg3.O(r0, r10, r2, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x015b
            kd8 r0 = r9.b
            if (r0 != r12) goto L_0x0148
            r2 = 1
            goto L_0x0149
        L_0x0148:
            r2 = 0
        L_0x0149:
            r2 = r18 & r2
            if (r0 != r14) goto L_0x0150
            r17 = 1
            goto L_0x0154
        L_0x0150:
            if (r0 != r13) goto L_0x0154
            r16 = 1
        L_0x0154:
            java.lang.String r0 = r9.a
            r15.add(r0)
            r18 = r2
        L_0x015b:
            r0 = r25
            r10 = r21
            r9 = r22
            r11 = r23
            r2 = r24
            goto L_0x010d
        L_0x0166:
            r24 = r2
            r22 = r9
            if (r6 != r3) goto L_0x0194
            if (r16 != 0) goto L_0x0170
            if (r17 == 0) goto L_0x0194
        L_0x0170:
            fe8 r0 = r22.w()
            java.util.List r2 = r0.f(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x017c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018e
            java.lang.Object r3 = r2.next()
            zd8 r3 = (defpackage.zd8) r3
            java.lang.String r3 = r3.a
            r0.c(r3)
            goto L_0x017c
        L_0x018e:
            java.util.List r15 = java.util.Collections.EMPTY_LIST
            r16 = 0
            r17 = 0
        L_0x0194:
            java.lang.Object[] r0 = r15.toArray(r1)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L_0x01a0
            r11 = 1
            goto L_0x01a1
        L_0x01a0:
            r11 = 0
        L_0x01a1:
            r0 = 0
            goto L_0x01aa
        L_0x01a3:
            r24 = r2
            r20 = r3
            r22 = r9
            goto L_0x01a1
        L_0x01aa:
            java.util.Iterator r2 = r19.iterator()
            r6 = r0
        L_0x01af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x026e
            java.lang.Object r0 = r2.next()
            xd8 r0 = (defpackage.xd8) r0
            be8 r3 = r0.b
            java.util.UUID r9 = r0.a
            if (r11 == 0) goto L_0x01d2
            if (r18 != 0) goto L_0x01d2
            if (r17 == 0) goto L_0x01c8
            r3.b = r14
            goto L_0x01d4
        L_0x01c8:
            if (r16 == 0) goto L_0x01cd
            r3.b = r13
            goto L_0x01d4
        L_0x01cd:
            kd8 r10 = defpackage.kd8.A
            r3.b = r10
            goto L_0x01d4
        L_0x01d2:
            r3.n = r7
        L_0x01d4:
            kd8 r10 = r3.b
            if (r10 != r4) goto L_0x01d9
            r6 = 1
        L_0x01d9:
            fe8 r10 = r22.w()
            r12 = r24
            java.util.List r15 = r12.e
            be8 r3 = defpackage.mp7.o0(r15, r3)
            r10.getClass()
            a96 r15 = r10.a
            r19 = r2
            de8 r2 = new de8
            r21 = r4
            r4 = 0
            r2.<init>(r10, r3, r4)
            r10 = 1
            defpackage.sg3.O(r15, r4, r10, r2)
            if (r11 == 0) goto L_0x022c
            int r2 = r1.length
            r3 = 0
        L_0x01fc:
            if (r3 >= r2) goto L_0x022c
            r4 = r1[r3]
            yp1 r10 = new yp1
            java.lang.String r15 = r9.toString()
            r15.getClass()
            r10.<init>(r15, r4)
            cq1 r4 = r22.r()
            r4.getClass()
            a96 r15 = r4.a
            r23 = r1
            m0 r1 = new m0
            r24 = r2
            r2 = 16
            r1.<init>(r2, r4, r10)
            r2 = 0
            r10 = 1
            defpackage.sg3.O(r15, r2, r10, r1)
            int r3 = r3 + 1
            r1 = r23
            r2 = r24
            goto L_0x01fc
        L_0x022c:
            r23 = r1
            he8 r1 = r22.x()
            java.lang.String r2 = r9.toString()
            r2.getClass()
            java.util.Set r0 = r0.c
            r1.a(r2, r0)
            if (r20 != 0) goto L_0x0262
            td8 r0 = r22.u()
            rd8 r1 = new rd8
            java.lang.String r2 = r9.toString()
            r2.getClass()
            r1.<init>(r5, r2)
            r0.getClass()
            a96 r2 = r0.a
            k77 r3 = new k77
            r4 = 20
            r3.<init>((int) r4, (java.lang.Object) r0, (java.lang.Object) r1)
            r4 = 0
            r10 = 1
            defpackage.sg3.O(r2, r4, r10, r3)
            goto L_0x0264
        L_0x0262:
            r4 = 0
            r10 = 1
        L_0x0264:
            r24 = r12
            r2 = r19
            r4 = r21
            r1 = r23
            goto L_0x01af
        L_0x026e:
            r10 = 1
            r0 = r25
            r4 = r6
        L_0x0272:
            r0.g = r10
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z42.b(cd8):boolean");
    }
}
