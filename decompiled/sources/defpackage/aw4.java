package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aw4 {
    public final d37 a = e37.a(cw4.a);
    public final d37 b;
    public final xw5 c;
    public final as d;
    public final as e;
    public tv4 f;
    public int g;
    public zv4 h;
    public final mp4 i;
    public final mp4 j;
    public final mp4 k;
    public boolean l;
    public boolean m;
    public boolean n;

    public aw4() {
        d37 a2 = e37.a(new wv4());
        this.b = a2;
        this.c = gr8.t(a2);
        this.d = new as();
        this.e = new as();
        this.i = x75.a();
        this.j = x75.a();
        this.k = x75.a();
    }

    public final void a(rv4 rv4, zv4 zv4, int i2) {
        mp4 mp4;
        boolean z;
        rv4.getClass();
        if (zv4.a == null) {
            if (i2 == 0) {
                mp4 = this.k;
            } else if (i2 != 1) {
                mp4 = this.i;
            } else {
                mp4 = this.j;
            }
            mp4.g(zv4);
            zv4.a = rv4;
            ((wv4) this.c.w.getValue()).getClass();
            if (i2 == 0) {
                z = this.m;
            } else if (i2 != 1) {
                z = this.n;
            } else {
                z = this.l;
            }
            zv4.b(z);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(zv4);
        rv4 rv42 = zv4.a;
        sb.append("' is already added to dispatcher ");
        sb.append(rv42);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

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
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x000c A[EDGE_INSN: B:60:0x000c->B:4:0x000c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0035 A[EDGE_INSN: B:64:0x0035->B:17:0x0035 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    public final void b() {
        /*
            r15 = this;
            r0 = 1
            r1 = 0
            as r2 = r15.d
            if (r2 == 0) goto L_0x000e
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x000e
        L_0x000c:
            r2 = r1
            goto L_0x002b
        L_0x000e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0012:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r2.next()
            tv4 r3 = (defpackage.tv4) r3
            boolean r4 = r3.a()
            if (r4 != 0) goto L_0x002a
            boolean r3 = r3.b()
            if (r3 == 0) goto L_0x0012
        L_0x002a:
            r2 = r0
        L_0x002b:
            as r3 = r15.e
            if (r3 == 0) goto L_0x0037
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0037
        L_0x0035:
            r3 = r1
            goto L_0x0054
        L_0x0037:
            java.util.Iterator r3 = r3.iterator()
        L_0x003b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0035
            java.lang.Object r4 = r3.next()
            tv4 r4 = (defpackage.tv4) r4
            boolean r5 = r4.a()
            if (r5 != 0) goto L_0x0053
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x003b
        L_0x0053:
            r3 = r0
        L_0x0054:
            if (r2 != 0) goto L_0x005b
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r4 = r1
            goto L_0x005c
        L_0x005b:
            r4 = r0
        L_0x005c:
            boolean r5 = r15.m
            if (r5 == r2) goto L_0x0062
            r5 = r0
            goto L_0x0063
        L_0x0062:
            r5 = r1
        L_0x0063:
            boolean r6 = r15.l
            if (r6 == r3) goto L_0x0069
            r6 = r0
            goto L_0x006a
        L_0x0069:
            r6 = r1
        L_0x006a:
            boolean r7 = r15.n
            if (r7 == r4) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r1
        L_0x0070:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r9 = 31
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == 0) goto L_0x0092
            mp4 r5 = r15.k
            java.lang.Object[] r11 = r5.b
            long[] r12 = r5.c
            int r5 = r5.e
        L_0x0082:
            if (r5 == r10) goto L_0x0092
            r13 = r12[r5]
            long r13 = r13 >> r9
            long r13 = r13 & r7
            int r13 = (int) r13
            r5 = r11[r5]
            zv4 r5 = (defpackage.zv4) r5
            r5.b(r2)
            r5 = r13
            goto L_0x0082
        L_0x0092:
            if (r6 == 0) goto L_0x00ac
            mp4 r5 = r15.j
            java.lang.Object[] r6 = r5.b
            long[] r11 = r5.c
            int r5 = r5.e
        L_0x009c:
            if (r5 == r10) goto L_0x00ac
            r12 = r11[r5]
            long r12 = r12 >> r9
            long r12 = r12 & r7
            int r12 = (int) r12
            r5 = r6[r5]
            zv4 r5 = (defpackage.zv4) r5
            r5.b(r3)
            r5 = r12
            goto L_0x009c
        L_0x00ac:
            if (r0 == 0) goto L_0x00c6
            mp4 r0 = r15.i
            java.lang.Object[] r5 = r0.b
            long[] r6 = r0.c
            int r0 = r0.e
        L_0x00b6:
            if (r0 == r10) goto L_0x00c6
            r11 = r6[r0]
            long r11 = r11 >> r9
            long r11 = r11 & r7
            int r11 = (int) r11
            r0 = r5[r0]
            zv4 r0 = (defpackage.zv4) r0
            r0.b(r4)
            r0 = r11
            goto L_0x00b6
        L_0x00c6:
            r15.m = r2
            r15.l = r3
            r15.n = r4
            tv4 r0 = r15.f
            if (r0 != 0) goto L_0x00d4
            tv4 r0 = r15.c(r1)
        L_0x00d4:
            r15.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw4.b():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: tv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: tv4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00a4 A[EDGE_INSN: B:71:0x00a4->B:42:0x00a4 ?: BREAK  , SYNTHETIC] */
    public final tv4 c(int i2) {
        Object obj;
        Object obj2;
        Object obj3;
        as asVar = this.e;
        as asVar2 = this.d;
        tv4 tv4 = null;
        if (i2 == -1) {
            Iterator it = asVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((tv4) obj).a()) {
                    break;
                }
            }
            tv4 tv42 = (tv4) obj;
            if (tv42 != null) {
                return tv42;
            }
            Iterator it2 = asVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (next.a()) {
                    tv4 = next;
                    break;
                }
            }
            return tv4;
        } else if (i2 == 0) {
            Iterator it3 = asVar2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                tv4 tv43 = (tv4) obj2;
                if (!tv43.a()) {
                    if (tv43.b()) {
                        break;
                    }
                } else {
                    break;
                }
            }
            tv4 tv44 = (tv4) obj2;
            if (tv44 != null) {
                return tv44;
            }
            Iterator it4 = asVar.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    Object next2 = it4.next();
                    tv4 tv45 = next2;
                    if (tv45.a() || tv45.b()) {
                        tv4 = next2;
                    }
                    if (!it4.hasNext()) {
                        break;
                    }
                }
            }
            return tv4;
        } else if (i2 == 1) {
            Iterator it5 = asVar2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it5.next();
                if (((tv4) obj3).b()) {
                    break;
                }
            }
            tv4 tv46 = (tv4) obj3;
            if (tv46 != null) {
                return tv46;
            }
            Iterator it6 = asVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next3 = it6.next();
                if (next3.b()) {
                    tv4 = next3;
                    break;
                }
            }
            return tv4;
        } else {
            throw new IllegalStateException(("Unsupported direction: '" + i2 + "'.").toString());
        }
    }

    public final void d(tv4 tv4) {
        wv4 wv4;
        tv4 tv42 = this.f;
        if (tv42 == null) {
            tv42 = c(0);
        }
        if (sg3.e(tv42, tv4)) {
            if (tv42 == null) {
                wv4 = new wv4();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    tv4 tv43 = (tv4) it.next();
                    if (tv43.a() && !tv43.b.isEmpty()) {
                        arrayList.addAll(tv43.b);
                    }
                }
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    tv4 tv44 = (tv4) it2.next();
                    if (tv44.a() && !tv44.b.isEmpty()) {
                        arrayList.addAll(tv44.b);
                    }
                }
                yv4 yv4 = tv42.a;
                List list = tv42.c;
                yv4.getClass();
                list.getClass();
                wv4 = new wv4(yv4, arrayList, list, arrayList.size());
            }
            d37 d37 = this.b;
            if (!sg3.e((wv4) d37.getValue(), wv4)) {
                d37.l((Object) null, wv4);
                mp4 mp4 = this.k;
                Object[] objArr = mp4.b;
                long[] jArr = mp4.c;
                for (int i2 = mp4.e; i2 != Integer.MAX_VALUE; i2 = (int) (2147483647L & (jArr[i2] >> 31))) {
                    ((zv4) objArr[i2]).getClass();
                }
                mp4 mp42 = this.j;
                Object[] objArr2 = mp42.b;
                long[] jArr2 = mp42.c;
                for (int i3 = mp42.e; i3 != Integer.MAX_VALUE; i3 = (int) ((jArr2[i3] >> 31) & 2147483647L)) {
                    ((zv4) objArr2[i3]).getClass();
                }
                mp4 mp43 = this.i;
                Object[] objArr3 = mp43.b;
                long[] jArr3 = mp43.c;
                for (int i4 = mp43.e; i4 != Integer.MAX_VALUE; i4 = (int) ((jArr3[i4] >> 31) & 2147483647L)) {
                    ((zv4) objArr3[i4]).getClass();
                }
            }
        }
    }
}
