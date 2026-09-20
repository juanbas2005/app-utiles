package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: x18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x18 implements dj0 {
    public final dj0 a;
    public final boolean b;
    public final cf4 c;

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
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if ((r11 instanceof defpackage.db0) != false) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0156 A[EDGE_INSN: B:134:0x0156->B:83:0x0156 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0186  */
    public x18(defpackage.dj0 r11, defpackage.p16 r12, java.util.List r13, boolean r14) {
        /*
            r10 = this;
            r12.getClass()
            r10.<init>()
            r10.a = r11
            r10.b = r14
            as3 r14 = r12.k()
            boolean r0 = r12 instanceof defpackage.s16
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            r3 = r12
            s16 r3 = (defpackage.s16) r3
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x002b
            as3 r3 = defpackage.g18.s(r14)
            if (r3 == 0) goto L_0x002b
            boolean r3 = defpackage.l55.q(r3)
            if (r3 != r2) goto L_0x002b
        L_0x0029:
            r3 = r1
            goto L_0x004f
        L_0x002b:
            java.lang.Class r14 = defpackage.l55.x(r14)
            if (r14 == 0) goto L_0x0029
            java.lang.String r3 = "box-impl"
            java.lang.reflect.Method r4 = defpackage.l55.n(r14, r12)     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.Class r4 = r4.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.reflect.Method r3 = r14.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0047 }
            r3.getClass()     // Catch:{ NoSuchMethodException -> 0x0047 }
            goto L_0x004f
        L_0x0047:
            java.lang.String r10 = "No box method found in inline class: "
            java.lang.String r11 = " (calling "
            defpackage.h.m(r10, r14, r11, r12)
            throw r1
        L_0x004f:
            boolean r14 = r12 instanceof defpackage.sr3
            r4 = 0
            if (r14 == 0) goto L_0x0071
            r14 = r12
            sr3 r14 = (defpackage.sr3) r14
            yr3 r14 = r14.N()
            r14.getClass()
            u16 r14 = (defpackage.u16) r14
            boolean r14 = defpackage.l55.r(r14)
            if (r14 == 0) goto L_0x0071
            cf4 r11 = new cf4
            re3 r12 = defpackage.re3.z
            java.lang.reflect.Method[] r13 = new java.lang.reflect.Method[r4]
            r11.<init>((defpackage.re3) r12, (java.lang.reflect.Method[]) r13, (java.lang.reflect.Method) r3)
            goto L_0x020a
        L_0x0071:
            boolean r14 = r11 instanceof defpackage.qj0
            qr3 r5 = defpackage.qr3.w
            r6 = -1
            if (r14 == 0) goto L_0x0080
            r14 = r11
            qj0 r14 = (defpackage.qj0) r14
            boolean r14 = r14.f
            if (r14 != 0) goto L_0x0080
            goto L_0x00c6
        L_0x0080:
            boolean r14 = defpackage.r16.a0(r12)
            if (r14 == 0) goto L_0x008d
            boolean r11 = r11 instanceof defpackage.db0
            if (r11 == 0) goto L_0x008b
            goto L_0x00c6
        L_0x008b:
            r6 = r4
            goto L_0x00c6
        L_0x008d:
            java.util.List r11 = r12.getParameters()
            if (r11 == 0) goto L_0x009a
            boolean r14 = r11.isEmpty()
            if (r14 == 0) goto L_0x009a
            goto L_0x008b
        L_0x009a:
            java.util.Iterator r11 = r11.iterator()
        L_0x009e:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x008b
            java.lang.Object r14 = r11.next()
            t16 r14 = (defpackage.t16) r14
            qr3 r14 = r14.u()
            if (r14 != r5) goto L_0x009e
            yq3 r11 = r12.B()
            boolean r14 = r11 instanceof defpackage.oq3
            if (r14 == 0) goto L_0x00bb
            oq3 r11 = (defpackage.oq3) r11
            goto L_0x00bc
        L_0x00bb:
            r11 = r1
        L_0x00bc:
            if (r11 == 0) goto L_0x00c5
            boolean r11 = r11.z()
            if (r11 != r2) goto L_0x00c5
            goto L_0x008b
        L_0x00c5:
            r6 = r2
        L_0x00c6:
            dj0 r11 = r10.a
            r11.b()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            yq3 r14 = r12.B()
            boolean r7 = defpackage.r16.a0(r12)
            if (r7 != 0) goto L_0x00ee
            boolean r7 = r14 instanceof defpackage.gq3
            if (r7 == 0) goto L_0x00ee
            r7 = r14
            gq3 r7 = (defpackage.gq3) r7
            boolean r8 = r7.z()
            if (r8 == 0) goto L_0x00ee
            c2 r7 = defpackage.uq3.p(r7)
            r11.add(r7)
        L_0x00ee:
            boolean r7 = defpackage.r16.a0(r12)
            if (r7 == 0) goto L_0x0106
            boolean r7 = r14 instanceof defpackage.gq3
            if (r7 == 0) goto L_0x00fb
            gq3 r14 = (defpackage.gq3) r14
            goto L_0x00fc
        L_0x00fb:
            r14 = r1
        L_0x00fc:
            if (r14 == 0) goto L_0x0106
            boolean r14 = r14.p()
            if (r14 != r2) goto L_0x0106
            r14 = r2
            goto L_0x0107
        L_0x0106:
            r14 = r4
        L_0x0107:
            java.util.List r7 = r12.a()
            java.util.Iterator r7 = r7.iterator()
        L_0x010f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r7.next()
            t16 r8 = (defpackage.t16) r8
            qr3 r9 = r8.u()
            if (r9 != r5) goto L_0x0123
            if (r14 == 0) goto L_0x010f
        L_0x0123:
            as3 r8 = r8.y()
            r11.add(r8)
            goto L_0x010f
        L_0x012b:
            java.util.List r14 = r12.a()
            if (r14 == 0) goto L_0x0138
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x0138
            goto L_0x0156
        L_0x0138:
            java.util.Iterator r14 = r14.iterator()
        L_0x013c:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0156
            java.lang.Object r5 = r14.next()
            t16 r5 = (defpackage.t16) r5
            qr3 r5 = r5.u()
            qr3 r7 = defpackage.qr3.y
            if (r5 != r7) goto L_0x013c
            int r14 = r11.size()
            int r14 = r14 - r2
            goto L_0x015a
        L_0x0156:
            int r14 = r11.size()
        L_0x015a:
            boolean r5 = r10.b
            if (r5 == 0) goto L_0x0164
            int r14 = r14 + 31
            int r14 = r14 / 32
            int r14 = r14 + r2
            goto L_0x0165
        L_0x0164:
            r14 = r4
        L_0x0165:
            if (r0 == 0) goto L_0x0172
            r0 = r12
            s16 r0 = (defpackage.s16) r0
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0172
            r0 = r2
            goto L_0x0173
        L_0x0172:
            r0 = r4
        L_0x0173:
            int r14 = r14 + r0
            int r0 = r11.size()
            int r0 = r0 + r6
            int r0 = r0 + r14
            boolean r14 = r10.b
            java.util.List r5 = r10.a()
            int r5 = r5.size()
            if (r5 != r0) goto L_0x020d
            int r14 = java.lang.Math.max(r6, r4)
            int r5 = r11.size()
            int r5 = r5 + r6
            re3 r14 = defpackage.z65.V(r14, r5)
            java.lang.reflect.Method[] r5 = new java.lang.reflect.Method[r0]
            r7 = r4
        L_0x0196:
            if (r7 >= r0) goto L_0x01b9
            int r8 = r14.w
            int r9 = r14.x
            if (r7 > r9) goto L_0x01b3
            if (r8 > r7) goto L_0x01b3
            int r8 = r7 - r6
            java.lang.Object r8 = r11.get(r8)
            as3 r8 = (defpackage.as3) r8
            java.lang.Class r8 = defpackage.l55.x(r8)
            if (r8 == 0) goto L_0x01b3
            java.lang.reflect.Method r8 = defpackage.l55.n(r8, r12)
            goto L_0x01b4
        L_0x01b3:
            r8 = r1
        L_0x01b4:
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x0196
        L_0x01b9:
            java.util.Iterator r11 = r13.iterator()
        L_0x01bd:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x01d0
            java.lang.Object r13 = r11.next()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r5[r13] = r1
            goto L_0x01bd
        L_0x01d0:
            yq3 r11 = r12.B()
            boolean r12 = defpackage.r16.a0(r12)
            if (r12 != 0) goto L_0x0205
            boolean r12 = r11 instanceof defpackage.gq3
            if (r12 == 0) goto L_0x0205
            gq3 r11 = (defpackage.gq3) r11
            boolean r11 = r11.z()
            if (r11 == 0) goto L_0x0205
            dj0 r11 = r10.a
            java.lang.reflect.Member r11 = r11.b()
            if (r11 == 0) goto L_0x0205
            java.lang.Class r11 = r11.getDeclaringClass()
            if (r11 != 0) goto L_0x01f6
            r11 = r4
            goto L_0x0201
        L_0x01f6:
            c26 r12 = defpackage.b26.a
            gq3 r11 = r12.b(r11)
            boolean r11 = r11.z()
            r11 = r11 ^ r2
        L_0x0201:
            if (r11 != r2) goto L_0x0205
            r5[r4] = r1
        L_0x0205:
            cf4 r11 = new cf4
            r11.<init>((defpackage.re3) r14, (java.lang.reflect.Method[]) r5, (java.lang.reflect.Method) r3)
        L_0x020a:
            r10.c = r11
            return
        L_0x020d:
            u81 r11 = new u81
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r13.<init>(r1)
            dj0 r1 = r10.a
            java.util.List r1 = r1.a()
            int r1 = r1.size()
            r13.append(r1)
            java.lang.String r1 = " != "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = "\nCalling: "
            r13.append(r0)
            r13.append(r12)
            dj0 r10 = r10.a
            java.util.List r10 = r10.a()
            java.lang.String r12 = "\nParameter types: "
            r13.append(r12)
            r13.append(r10)
            java.lang.String r10 = ")\nDefault: "
            r13.append(r10)
            r13.append(r14)
            java.lang.String r10 = r13.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x18.<init>(dj0, p16, java.util.List, boolean):void");
    }

    public final List a() {
        return this.a.a();
    }

    public final Member b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.a instanceof oj0;
    }

    public final Object d(Object[] objArr) {
        Object invoke;
        Method method;
        cf4 cf4 = this.c;
        re3 re3 = (re3) cf4.x;
        Method[] methodArr = (Method[]) cf4.y;
        Method method2 = (Method) cf4.z;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            int i2 = re3.w;
            if (i <= re3.x && i2 <= i && (method = methodArr[i]) != null) {
                if (obj != null) {
                    obj = method.invoke(obj, (Object[]) null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    obj = g18.f(returnType);
                }
            }
            objArr2[i] = obj;
        }
        Object d = this.a.d(objArr2);
        if (d == p81.w || method2 == null || (invoke = method2.invoke((Object) null, new Object[]{d})) == null) {
            return d;
        }
        return invoke;
    }

    public final Type k() {
        return this.a.k();
    }
}
