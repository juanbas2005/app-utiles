package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: dq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dq1 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public dq1(mf1 mf1, t22 t22, yv yvVar) {
        Object obj;
        int i2;
        z86 z86 = mf1.g;
        i87 i87 = mf1.c;
        va6 va6 = mf1.p;
        String str = mf1.b;
        this.d = mf1;
        this.e = t22;
        Object obj2 = mf1.e;
        this.f = obj2 == null ? a42.w : obj2;
        boolean z = true;
        if (va6 != null) {
            this.h = null;
            if (va6.s()) {
                obj = new xd5(new qc3(this, va6), str == null ? ":memory:" : str, yvVar);
            } else if (str == null) {
                obj = new l11(new qc3(this, va6));
            } else {
                qc3 qc3 = new qc3(this, va6);
                int ordinal = z86.ordinal();
                if (ordinal == 1) {
                    i2 = 1;
                } else if (ordinal == 2) {
                    i2 = 4;
                } else {
                    ku4.z("Can't get max number of reader for journal mode '", z86);
                    throw null;
                }
                int ordinal2 = z86.ordinal();
                if (ordinal2 == 1 || ordinal2 == 2) {
                    obj = new l11(qc3, str, i2);
                } else {
                    ku4.z("Can't get max number of writers for journal mode '", z86);
                    throw null;
                }
            }
            this.g = obj;
        } else if (i87 != null) {
            Context context = mf1.a;
            context.getClass();
            j87 i3 = i87.i(new u72(context, str, new qa(this, t22.a), false, false));
            this.h = i3;
            this.g = new xd5(new ay4(i3), str == null ? ":memory:" : str, yvVar);
        } else {
            h.q("SQLiteManager was constructed with both null driver and open helper factory!");
            throw null;
        }
        z = z86 != z86.y ? false : z;
        j87 j87 = (j87) this.h;
        if (j87 != null) {
            j87.setWriteAheadLoggingEnabled(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        defpackage.dh4.f(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        throw r6;
     */
    public static final void a(dq1 dq1, ua6 ua6) {
        vs7 vs7;
        t22 t22 = (t22) dq1.e;
        f(ua6);
        mf1 mf1 = (mf1) dq1.d;
        z86 z86 = mf1.g;
        z86 z862 = z86.y;
        if (z86 == z862) {
            l55.m(ua6, "PRAGMA journal_mode = WAL");
        } else {
            l55.m(ua6, "PRAGMA journal_mode = TRUNCATE");
        }
        if (mf1.g == z862) {
            l55.m(ua6, "PRAGMA synchronous = NORMAL");
        } else {
            l55.m(ua6, "PRAGMA synchronous = FULL");
        }
        ab6 k0 = ua6.k0("PRAGMA user_version");
        k0.i0();
        int i2 = (int) k0.getLong(0);
        dh4.f(k0, (Throwable) null);
        int i3 = t22.a;
        if (i2 != i3) {
            l55.m(ua6, "BEGIN EXCLUSIVE TRANSACTION");
            if (i2 == 0) {
                try {
                    dq1.j(ua6);
                } catch (Throwable th) {
                    vs7 = new m66(th);
                }
            } else {
                dq1.k(ua6, i2, i3);
            }
            l55.m(ua6, "PRAGMA user_version = " + i3);
            vs7 = vs7.a;
            if (!(vs7 instanceof m66)) {
                vs7 vs72 = vs7;
                l55.m(ua6, "END TRANSACTION");
            }
            Throwable a2 = o66.a(vs7);
            if (a2 != null) {
                l55.m(ua6, "ROLLBACK TRANSACTION");
                throw a2;
            }
        }
        dq1.l(ua6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        defpackage.dh4.f(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = move-exception;
     */
    public static void f(ua6 ua6) {
        ab6 k0 = ua6.k0("PRAGMA busy_timeout");
        k0.i0();
        long j = k0.getLong(0);
        dh4.f(k0, (Throwable) null);
        if (j < 3000) {
            l55.m(ua6, "PRAGMA busy_timeout = 3000");
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [pa6, java.lang.Object] */
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
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    public void b(defpackage.eq1 r7, int r8, java.util.ArrayList r9, defpackage.pa6 r10) {
        /*
            r6 = this;
            h98 r7 = r7.d
            pa6 r0 = r7.c
            eq1 r1 = r7.i
            eq1 r2 = r7.h
            if (r0 != 0) goto L_0x00e1
            java.lang.Object r0 = r6.d
            h31 r0 = (defpackage.h31) r0
            n23 r3 = r0.d
            if (r7 == r3) goto L_0x00e1
            p48 r0 = r0.e
            if (r7 != r0) goto L_0x0018
            goto L_0x00e1
        L_0x0018:
            if (r10 != 0) goto L_0x002e
            pa6 r10 = new pa6
            r10.<init>()
            r0 = 0
            r10.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.b = r0
            r10.a = r7
            r9.add(r10)
        L_0x002e:
            r7.c = r10
            java.util.ArrayList r0 = r10.b
            r0.add(r7)
            java.util.ArrayList r0 = r2.k
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0051
            java.lang.Object r3 = r0.next()
            aq1 r3 = (defpackage.aq1) r3
            boolean r4 = r3 instanceof defpackage.eq1
            if (r4 == 0) goto L_0x003b
            eq1 r3 = (defpackage.eq1) r3
            r6.b(r3, r8, r9, r10)
            goto L_0x003b
        L_0x0051:
            java.util.ArrayList r0 = r1.k
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r0.next()
            aq1 r3 = (defpackage.aq1) r3
            boolean r4 = r3 instanceof defpackage.eq1
            if (r4 == 0) goto L_0x0057
            eq1 r3 = (defpackage.eq1) r3
            r6.b(r3, r8, r9, r10)
            goto L_0x0057
        L_0x006d:
            r0 = 1
            if (r8 != r0) goto L_0x0095
            boolean r3 = r7 instanceof defpackage.p48
            if (r3 == 0) goto L_0x0095
            r3 = r7
            p48 r3 = (defpackage.p48) r3
            eq1 r3 = r3.k
            java.util.ArrayList r3 = r3.k
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r3.next()
            aq1 r4 = (defpackage.aq1) r4
            boolean r5 = r4 instanceof defpackage.eq1
            if (r5 == 0) goto L_0x007f
            eq1 r4 = (defpackage.eq1) r4
            r6.b(r4, r8, r9, r10)
            goto L_0x007f
        L_0x0095:
            java.util.ArrayList r2 = r2.l
            java.util.Iterator r2 = r2.iterator()
        L_0x009b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r2.next()
            eq1 r3 = (defpackage.eq1) r3
            r6.b(r3, r8, r9, r10)
            goto L_0x009b
        L_0x00ab:
            java.util.ArrayList r1 = r1.l
            java.util.Iterator r1 = r1.iterator()
        L_0x00b1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c1
            java.lang.Object r2 = r1.next()
            eq1 r2 = (defpackage.eq1) r2
            r6.b(r2, r8, r9, r10)
            goto L_0x00b1
        L_0x00c1:
            if (r8 != r0) goto L_0x00e1
            boolean r0 = r7 instanceof defpackage.p48
            if (r0 == 0) goto L_0x00e1
            p48 r7 = (defpackage.p48) r7
            eq1 r7 = r7.k
            java.util.ArrayList r7 = r7.l
            java.util.Iterator r7 = r7.iterator()
        L_0x00d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r7.next()
            eq1 r0 = (defpackage.eq1) r0
            r6.b(r0, r8, r9, r10)
            goto L_0x00d1
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq1.b(eq1, int, java.util.ArrayList, pa6):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cb, code lost:
        r3 = 1.0f / r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cd, code lost:
        h(r21, r6, r21, (int) ((((float) r6) * r3) + 0.5f), r9);
        r9.d.e.d(r9.n());
        r9.e.e.d(r9.k());
        r9.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f6, code lost:
        r3 = r7;
        r7 = r5;
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fa, code lost:
        if (r10 != 1) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fc, code lost:
        h(r11, 0, r5, 0, r9);
        r9.e.e.m = r9.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0211, code lost:
        r8 = r5;
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0214, code lost:
        if (r10 != 2) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0216, code lost:
        r4 = r2[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0218, code lost:
        if (r4 == r7) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021b, code lost:
        if (r4 != 4) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021e, code lost:
        r4 = r3;
        r12 = r5;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0221, code lost:
        r7 = r8;
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0223, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0226, code lost:
        h(r5, r9.n(), r7, (int) ((r15 * ((float) r0.k())) + 0.5f), r9);
        r9.d.e.d(r9.n());
        r9.e.e.d(r9.k());
        r9.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0253, code lost:
        r12 = r5;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025b, code lost:
        if (r4[2].f == null) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0263, code lost:
        if (r4[3].f != null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0266, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0268, code lost:
        h(r8, 0, r3, 0, r9);
        r9.d.e.d(r9.n());
        r9.e.e.d(r9.k());
        r9.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028c, code lost:
        r4 = r7;
        r7 = r12;
        r3 = 1;
        r12 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0291, code lost:
        if (r12 != r6) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0293, code lost:
        if (r4 != r6) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0295, code lost:
        if (r14 == r3) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0297, code lost:
        if (r10 != r3) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x029b, code lost:
        if (r10 != 2) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x029d, code lost:
        if (r14 != 2) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a1, code lost:
        if (r2[0] != r5) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a5, code lost:
        if (r2[r3] != r5) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a7, code lost:
        h(r5, (int) ((r13 * ((float) r0.n())) + 0.5f), r5, (int) ((r15 * ((float) r0.k())) + 0.5f), r9);
        r9.d.e.d(r9.n());
        r9.e.e.d(r9.k());
        r9.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02da, code lost:
        h(r7, 0, r7, 0, r9);
        r9.d.e.m = r9.n();
        r9.e.e.m = r9.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b1, code lost:
        if (r11 == 2) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ba, code lost:
        if (r3 == 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c5, code lost:
        if (r11 != 3) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c7, code lost:
        if (r3 == r12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ca, code lost:
        if (r3 != 1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cd, code lost:
        r7 = r3;
        r3 = 3;
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d5, code lost:
        if (r14 != 3) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d7, code lost:
        if (r3 != r12) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d9, code lost:
        h(r12, 0, r12, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e2, code lost:
        r8 = r9.k();
        h(1, (int) ((((float) r8) * r9.V) + 0.5f), 1, r8, r9);
        r9.d.e.d(r9.n());
        r9.e.e.d(r9.k());
        r9.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0113, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0116, code lost:
        if (r14 != 1) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0118, code lost:
        h(r5, 0, r3, 0, r9);
        r9.d.e.m = r9.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        r12 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012e, code lost:
        if (r14 != 2) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0130, code lost:
        r5 = r2[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0132, code lost:
        if (r5 == 1) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0135, code lost:
        if (r5 != 4) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0138, code lost:
        r5 = 1;
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013a, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013c, code lost:
        h(1, (int) ((r13 * ((float) r0.n())) + 0.5f), r3, r9.k(), r9);
        r9.d.e.d(r9.n());
        r9.e.e.d(r9.k());
        r9.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016b, code lost:
        r5 = 1;
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0172, code lost:
        if (r4[0].f == null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0178, code lost:
        if (r4[1].f != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017a, code lost:
        h(r12, 0, r7, 0, r9);
        r9.d.e.d(r9.n());
        r9.e.e.d(r9.k());
        r9.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019d, code lost:
        r7 = r3;
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a0, code lost:
        if (r7 != r3) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a2, code lost:
        if (r11 == r12) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a4, code lost:
        if (r11 != r5) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a7, code lost:
        r6 = r3;
        r4 = r7;
        r7 = r12;
        r3 = 1;
        r12 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ae, code lost:
        if (r10 != r3) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b0, code lost:
        if (r11 != r12) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b2, code lost:
        r21 = r5;
        h(r12, 0, r12, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01be, code lost:
        r21 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c0, code lost:
        r6 = r9.n();
        r3 = r9.V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c9, code lost:
        if (r9.W != -1) goto L_0x01cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0328  */
    public void c(h31 h31) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        dq1 dq1;
        h31 h312 = h31;
        ArrayList arrayList = h312.p0;
        int[] iArr = h312.o0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g31 g31 = (g31) it.next();
            int[] iArr2 = g31.o0;
            h21[] h21Arr = g31.P;
            h21 h21 = g31.K;
            h21 h212 = g31.I;
            h21 h213 = g31.J;
            h21 h214 = g31.H;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            if (g31.f0 == 8) {
                g31.a = true;
            } else {
                float f2 = g31.v;
                if (f2 < 1.0f && i10 == 3) {
                    g31.q = 2;
                }
                float f3 = g31.y;
                if (f3 < 1.0f && i11 == 3) {
                    g31.r = 2;
                }
                if (g31.V > 0.0f) {
                    if (i10 == 3 && (i11 == 2 || i11 == 1)) {
                        g31.q = 3;
                    } else if (i11 == 3 && (i10 == 2 || i10 == 1)) {
                        g31.r = 3;
                    } else if (i10 == 3 && i11 == 3) {
                        if (g31.q == 0) {
                            g31.q = 3;
                        }
                        if (g31.r == 0) {
                            g31.r = 3;
                        }
                    }
                }
                if (i10 == 3 && g31.q == 1 && (h214.f == null || h213.f == null)) {
                    i10 = 2;
                }
                if (i11 == 3 && g31.r == 1 && (h212.f == null || h21.f == null)) {
                    i11 = 2;
                }
                n23 n23 = g31.d;
                n23.d = i10;
                int i12 = g31.q;
                n23.a = i12;
                p48 p48 = g31.e;
                p48.d = i11;
                int i13 = g31.r;
                p48.a = i13;
                if (!(i10 == 4 || i10 == 1)) {
                    i2 = 2;
                }
                if (i11 != 4) {
                    if (i11 != 1) {
                        i2 = 2;
                    } else {
                        i5 = i11;
                        i3 = 1;
                        i4 = i10;
                        int n = g31.n();
                        if (i4 == 4) {
                            n = (h312.n() - h214.g) - h213.g;
                            i4 = i3;
                        }
                        int k = g31.k();
                        if (i5 != 4) {
                            i6 = (h312.k() - h212.g) - h21.g;
                            i7 = i3;
                            dq1 = this;
                            i8 = n;
                            i9 = i4;
                        } else {
                            i6 = k;
                            i7 = i5;
                            i8 = n;
                            i9 = i4;
                            dq1 = this;
                        }
                        dq1.h(i9, i8, i7, i6, g31);
                        g31.d.e.d(g31.n());
                        g31.e.e.d(g31.k());
                        g31.a = true;
                    }
                }
                i5 = i11;
                i4 = i10;
                i3 = 1;
                int n2 = g31.n();
                if (i4 == 4) {
                }
                int k2 = g31.k();
                if (i5 != 4) {
                }
                dq1.h(i9, i8, i7, i6, g31);
                g31.d.e.d(g31.n());
                g31.e.e.d(g31.k());
                g31.a = true;
            }
        }
    }

    public void d() {
        h31 h31 = (h31) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        h31 h312 = (h31) this.e;
        h312.d.f();
        h312.e.f();
        arrayList2.add(h312.d);
        arrayList2.add(h312.e);
        Iterator it = h312.p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            g31 g31 = (g31) it.next();
            if (g31 instanceof zx2) {
                h98 h98 = new h98(g31);
                g31.d.f();
                g31.e.f();
                h98.f = ((zx2) g31).t0;
                arrayList2.add(h98);
            } else {
                if (g31.u()) {
                    if (g31.b == null) {
                        g31.b = new um0(g31, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(g31.b);
                } else {
                    arrayList2.add(g31.d);
                }
                if (g31.v()) {
                    if (g31.c == null) {
                        g31.c = new um0(g31, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(g31.c);
                } else {
                    arrayList2.add(g31.e);
                }
                if (g31 instanceof pz2) {
                    arrayList2.add(new h98(g31));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((h98) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            h98 h982 = (h98) it3.next();
            if (h982.b != h312) {
                h982.d();
            }
        }
        arrayList.clear();
        g(h31.d, 0, arrayList);
        g(h31.e, 1, arrayList);
        this.b = false;
    }

    public int e(h31 h31, int i2) {
        ArrayList arrayList;
        int i3;
        long j;
        h98 h98;
        h98 h982;
        float f2;
        long j2;
        h31 h312 = h31;
        int i4 = i2;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i5 = 0;
        long j4 = 0;
        while (i5 < size) {
            h98 h983 = ((pa6) arrayList2.get(i5)).a;
            if (!(h983 instanceof um0) ? i4 != 0 ? (h983 instanceof p48) : (h983 instanceof n23) : ((um0) h983).f == i4) {
                if (i4 == 0) {
                    h98 = h312.d;
                } else {
                    h98 = h312.e;
                }
                eq1 eq1 = h98.h;
                if (i4 == 0) {
                    h982 = h312.d;
                } else {
                    h982 = h312.e;
                }
                eq1 eq12 = h982.i;
                eq1 eq13 = h983.h;
                eq1 eq14 = h983.i;
                boolean contains = eq13.l.contains(eq1);
                boolean contains2 = eq14.l.contains(eq12);
                long j5 = h983.j();
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i3 = i5;
                    if (contains) {
                        j = Math.max(pa6.b(eq13, (long) eq13.f), ((long) eq13.f) + j5);
                    } else if (contains2) {
                        j = Math.max(-pa6.a(eq14, (long) eq14.f), ((long) (-eq14.f)) + j5);
                    } else {
                        j = (h983.j() + ((long) eq13.f)) - ((long) eq14.f);
                    }
                } else {
                    long b2 = pa6.b(eq13, j3);
                    arrayList = arrayList2;
                    long a2 = pa6.a(eq14, j3);
                    long j6 = b2 - j5;
                    int i6 = eq14.f;
                    i3 = i5;
                    if (j6 >= ((long) (-i6))) {
                        j6 += (long) i6;
                    }
                    long j7 = (long) eq13.f;
                    long j8 = ((-a2) - j5) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    g31 g31 = h983.b;
                    if (i4 == 0) {
                        f2 = g31.c0;
                    } else if (i4 == 1) {
                        f2 = g31.d0;
                    } else {
                        g31.getClass();
                        f2 = -1.0f;
                    }
                    if (f2 > 0.0f) {
                        j2 = (long) ((((float) j6) / (1.0f - f2)) + (((float) j8) / f2));
                    } else {
                        j2 = 0;
                    }
                    float f3 = (float) j2;
                    j = (((long) eq13.f) + ((((long) ((f3 * f2) + 0.5f)) + j5) + ((long) b81.d(1.0f, f2, f3, 0.5f)))) - ((long) eq14.f);
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i3 = i5;
            }
            j4 = Math.max(j4, j);
            i5 = i3 + 1;
            arrayList2 = arrayList;
            h312 = h31;
            j3 = 0;
        }
        return (int) j4;
    }

    public void g(h98 h98, int i2, ArrayList arrayList) {
        eq1 eq1 = h98.h;
        eq1 eq12 = h98.i;
        Iterator it = eq1.k.iterator();
        while (it.hasNext()) {
            aq1 aq1 = (aq1) it.next();
            if (aq1 instanceof eq1) {
                b((eq1) aq1, i2, arrayList, (pa6) null);
            } else if (aq1 instanceof h98) {
                b(((h98) aq1).h, i2, arrayList, (pa6) null);
            }
        }
        Iterator it2 = eq12.k.iterator();
        while (it2.hasNext()) {
            aq1 aq12 = (aq1) it2.next();
            if (aq12 instanceof eq1) {
                b((eq1) aq12, i2, arrayList, (pa6) null);
            } else if (aq12 instanceof h98) {
                b(((h98) aq12).i, i2, arrayList, (pa6) null);
            }
        }
        if (i2 == 1) {
            Iterator it3 = ((p48) h98).k.k.iterator();
            while (it3.hasNext()) {
                aq1 aq13 = (aq1) it3.next();
                if (aq13 instanceof eq1) {
                    b((eq1) aq13, i2, arrayList, (pa6) null);
                }
            }
        }
    }

    public void h(int i2, int i3, int i4, int i5, g31 g31) {
        m60 m60 = (m60) this.i;
        m60.a = i2;
        m60.b = i4;
        m60.c = i3;
        m60.d = i5;
        ((n21) this.h).b(g31, m60);
        g31.J(m60.e);
        g31.G(m60.f);
        g31.D = m60.h;
        g31.D(m60.g);
    }

    public void i() {
        boolean z;
        dq1 dq1;
        g60 g60;
        Iterator it = ((h31) this.d).p0.iterator();
        while (it.hasNext()) {
            g31 g31 = (g31) it.next();
            if (!g31.a) {
                int[] iArr = g31.o0;
                boolean z2 = false;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = g31.q;
                int i5 = g31.r;
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 == 2 || (i3 == 3 && i5 == 1)) {
                    z2 = true;
                }
                dv1 dv1 = g31.d.e;
                boolean z3 = dv1.j;
                dv1 dv12 = g31.e.e;
                boolean z4 = dv12.j;
                boolean z5 = z;
                if (z3 && z4) {
                    dq1 = this;
                    dq1.h(1, dv1.g, 1, dv12.g, g31);
                    g31.a = true;
                } else if (!z3 || !z2) {
                    dq1 = this;
                    if (z4 && z5) {
                        dq1.h(2, dv1.g, 1, dv12.g, g31);
                        n23 n23 = g31.d;
                        if (i2 == 3) {
                            n23.e.m = g31.n();
                        } else {
                            n23.e.d(g31.n());
                            g31.a = true;
                        }
                    }
                } else {
                    dq1 = this;
                    dq1.h(1, dv1.g, 2, dv12.g, g31);
                    p48 p48 = g31.e;
                    if (i3 == 3) {
                        p48.e.m = g31.k();
                    } else {
                        p48.e.d(g31.k());
                        g31.a = true;
                    }
                }
                if (g31.a && (g60 = g31.e.l) != null) {
                    g60.d(g31.Z);
                }
                this = dq1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        defpackage.dh4.f(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        throw r9;
     */
    public void j(ua6 ua6) {
        t22 t22 = (t22) this.e;
        ua6.getClass();
        ab6 k0 = ua6.k0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        boolean z = false;
        if (k0.i0() && k0.getLong(0) == 0) {
            z = true;
        }
        dh4.f(k0, (Throwable) null);
        t22.a(ua6);
        if (!z) {
            ca v = t22.v(ua6);
            if (!v.b) {
                ku4.x("Pre-packaged database has an invalid schema: ", v.c);
                return;
            }
        }
        m(ua6);
        t22.r(ua6);
        for (yq0 yq0 : (List) this.f) {
            yq0.getClass();
            if (ua6 instanceof h87) {
                ((h87) ua6).w.getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012b  */
    public void k(ua6 ua6, int i2, int i3) {
        boolean z;
        t22 t22 = (t22) this.e;
        ua6.getClass();
        mf1 mf1 = (mf1) this.d;
        List<vk4> s = b96.s(mf1.d, i2, i3);
        if (s != null) {
            t22.u(ua6);
            for (vk4 b2 : s) {
                b2.b(ua6);
            }
            ca v = t22.v(ua6);
            if (v.b) {
                t22.t(ua6);
                m(ua6);
                return;
            }
            ku4.x("Migration didn't properly handle: ", v.c);
            return;
        }
        mf1.getClass();
        if (i2 <= i3 || !mf1.k) {
            Set set = mf1.l;
            if (mf1.j && (set == null || !set.contains(Integer.valueOf(i2)))) {
                z = true;
                if (z) {
                    if (mf1.o) {
                        ab6 k0 = ua6.k0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                        try {
                            n74 m = sg3.m();
                            while (k0.i0()) {
                                String R = k0.R(0);
                                if (!k57.u0(R, "sqlite_", false)) {
                                    if (!R.equals("android_metadata")) {
                                        m.add(new yb5(R, Boolean.valueOf(sg3.e(k0.R(1), "view"))));
                                    }
                                }
                            }
                            n74 i4 = sg3.i(m);
                            dh4.f(k0, (Throwable) null);
                            ListIterator listIterator = i4.listIterator(0);
                            while (true) {
                                d03 d03 = (d03) listIterator;
                                if (!d03.hasNext()) {
                                    break;
                                }
                                yb5 yb5 = (yb5) d03.next();
                                String str = (String) yb5.w;
                                if (((Boolean) yb5.x).booleanValue()) {
                                    l55.m(ua6, "DROP VIEW IF EXISTS `" + str + '`');
                                } else {
                                    l55.m(ua6, "DROP TABLE IF EXISTS `" + str + '`');
                                }
                            }
                        } catch (Throwable th) {
                            dh4.f(k0, th);
                            throw th;
                        }
                    } else {
                        t22.c(ua6);
                    }
                    for (yq0 yq0 : (List) this.f) {
                        yq0.getClass();
                        if (ua6 instanceof h87) {
                            ((h87) ua6).w.getClass();
                        }
                    }
                    t22.a(ua6);
                    return;
                }
                throw new IllegalStateException(("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        defpackage.dh4.f(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013d, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013e, code lost:
        defpackage.dh4.f(r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0141, code lost:
        throw r11;
     */
    public void l(ua6 ua6) {
        boolean z;
        Object obj;
        String str;
        ua6.getClass();
        t22 t22 = (t22) this.e;
        ab6 k0 = ua6.k0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        if (!k0.i0() || k0.getLong(0) == 0) {
            z = false;
        } else {
            z = true;
        }
        dh4.f(k0, (Throwable) null);
        if (z) {
            ab6 k02 = ua6.k0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            if (k02.i0()) {
                str = k02.R(0);
            } else {
                str = null;
            }
            dh4.f(k02, (Throwable) null);
            if (!((String) t22.b).equals(str) && !((String) t22.c).equals(str)) {
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) t22.b) + ", found: " + str).toString());
            }
        } else {
            l55.m(ua6, "BEGIN EXCLUSIVE TRANSACTION");
            try {
                ca v = t22.v(ua6);
                if (v.b) {
                    t22.t(ua6);
                    m(ua6);
                    obj = vs7.a;
                    if (!(obj instanceof m66)) {
                        vs7 vs7 = (vs7) obj;
                        l55.m(ua6, "END TRANSACTION");
                    }
                    Throwable a2 = o66.a(obj);
                    if (a2 != null) {
                        l55.m(ua6, "ROLLBACK TRANSACTION");
                        throw a2;
                    }
                } else {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + v.c).toString());
                }
            } catch (Throwable th) {
                obj = new m66(th);
            }
        }
        t22.s(ua6);
        for (yq0 yq0 : (List) this.f) {
            yq0.getClass();
            if (ua6 instanceof h87) {
                ir2 ir2 = ((h87) ua6).w;
                int i2 = yq0.a;
                ir2.getClass();
                switch (i2) {
                    case b85.b:
                        ir2.a();
                        try {
                            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                            ((z53) yq0.b).getClass();
                            sb.append(System.currentTimeMillis() - 86400000);
                            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                            ir2.u(sb.toString());
                            ir2.B();
                            break;
                        } finally {
                            ir2.o();
                        }
                    default:
                        ((ay5) yq0.b).y(ir2);
                        break;
                }
            }
        }
        this.b = true;
    }

    public void m(ua6 ua6) {
        l55.m(ua6, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        l55.m(ua6, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((t22) this.e).b) + "')");
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return dt0.E0(arrayList, ", ", "FileMetadata(", ")", (vr2) null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dq1() {
    }

    public dq1(mf1 mf1, b86 b86, yv yvVar) {
        this.d = mf1;
        this.e = new t22(-1, "", "");
        List list = mf1.e;
        a42 a42 = a42.w;
        this.f = list == null ? a42 : list;
        dt0.N0(list == null ? a42 : list, new yq0(new ay5(6, (Object) this)));
        Context context = mf1.a;
        ld4 ld4 = mf1.d;
        Executor executor = mf1.h;
        Executor executor2 = mf1.i;
        List list2 = mf1.m;
        List list3 = mf1.n;
        context.getClass();
        ld4.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new s05(0);
    }

    public dq1(boolean z, boolean z2, ae5 ae5, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = ae5;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = sf4.b0(map);
    }

    public /* synthetic */ dq1(boolean z, boolean z2, ae5 ae5, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, ae5, l, l2, l3, l4, b42.w);
    }
}
