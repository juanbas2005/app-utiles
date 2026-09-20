package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.datastore.core.CorruptionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: s63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s63 implements y43, a27, w81, hb1, oo6, g61, fs8, c12 {
    public static final /* synthetic */ s63 A = new s63(19);
    public static final /* synthetic */ s63 B = new s63(20);
    public static final /* synthetic */ s63 C = new s63(21);
    public static final /* synthetic */ s63 D = new s63(22);
    public static final /* synthetic */ s63 E = new s63(23);
    public static final /* synthetic */ s63 F = new s63(24);
    public static final /* synthetic */ s63 G = new s63(25);
    public static final /* synthetic */ s63 H = new s63(26);
    public static final /* synthetic */ s63 I = new s63(27);
    public static final /* synthetic */ s63 J = new s63(28);
    public static final /* synthetic */ s63 x = new s63(15);
    public static final /* synthetic */ s63 y = new s63(17);
    public static final /* synthetic */ s63 z = new s63(18);
    public final /* synthetic */ int w;

    public s63(kh khVar) {
        this.w = 11;
    }

    public static ArrayList d(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((gu5) next) != gu5.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gu5) it.next()).w);
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [sc0, java.lang.Object] */
    public static byte[] j(List list) {
        list.getClass();
        ? obj = new Object();
        Iterator it = d(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.a0(str.length());
            obj.o0(str);
        }
        return obj.D(obj.x);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: rm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e8  */
    public static v k(fu6 fu6, e3 e3Var, int i, vo7 vo7, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        ql4 ql4;
        Boolean bool;
        wo7 wo7;
        Iterator it;
        Boolean bool2;
        int size;
        rm rmVar;
        boolean z6;
        Boolean bool3;
        qa qaVar;
        p27 p27;
        int i2;
        e3 e3Var2 = e3Var;
        vo7 vo72 = vo7;
        boolean z7 = z3;
        boolean z8 = false;
        vo7 vo73 = vo7.y;
        if (vo72 != vo73) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z7 || !z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object obj = null;
        if (!z4 && fu6.G().isEmpty()) {
            return new v((fu6) null, 1, false);
        }
        vq0 u = fu6.L().u();
        if (u == null) {
            return new v((fu6) null, 1, false);
        }
        zj3 zj3 = (zj3) e3Var2.y(Integer.valueOf(i));
        tm tmVar = ep7.a;
        if (vo72 != vo73 && (u instanceof ql4)) {
            if (zj3.b == po4.w && vo72 == vo7.w) {
                ql4 ql42 = (ql4) u;
                String str = tj3.a;
                vp2 f = rs1.f(ql42);
                HashMap hashMap = tj3.j;
                if (hashMap.containsKey(f)) {
                    up2 up2 = (up2) hashMap.get(rs1.f(ql42));
                    if (up2 != null) {
                        ql4 = ts1.e(ql42).j(up2);
                        if (vo72 != vo73) {
                            s15 s15 = zj3.a;
                            if (s15 == null) {
                                i2 = -1;
                            } else {
                                i2 = dp7.a[s15.ordinal()];
                            }
                            if (i2 == 1) {
                                bool = Boolean.TRUE;
                            } else if (i2 == 2) {
                                bool = Boolean.FALSE;
                            }
                            if (ql4 == null || (wo7 = ql4.n()) == null) {
                                wo7 = fu6.L();
                            }
                            int i3222 = i + 1;
                            List G2222 = fu6.G();
                            List parameters222 = wo7.getParameters();
                            parameters222.getClass();
                            it = G2222.iterator();
                            Iterator it2222 = parameters222.iterator();
                            ArrayList arrayList322 = new ArrayList(Math.min(et0.e0(G2222, 10), et0.e0(parameters222, 10)));
                            while (it.hasNext() && it2222.hasNext()) {
                                Object next = it.next();
                                qp7 qp7 = (qp7) it2222.next();
                                xp7 xp7 = (xp7) next;
                                if (!z5) {
                                    bool3 = bool;
                                    qaVar = new qa(z8, 4, obj);
                                } else {
                                    bool3 = bool;
                                    if (!xp7.c()) {
                                        qaVar = l(xp7.b().n0(), e3Var2, i3222, z7);
                                    } else if (((zj3) e3Var2.y(Integer.valueOf(i3222))).a == s15.w) {
                                        du7 n0 = xp7.b().n0();
                                        qaVar = new qa(1, 4, kl8.n(mp7.f0(n0).o0(z8), mp7.n0(n0).o0(true)));
                                    } else {
                                        qaVar = new qa(1, 4, (Object) null);
                                    }
                                }
                                i3222 += qaVar.x;
                                vw3 vw3 = (vw3) qaVar.y;
                                if (vw3 != null) {
                                    k28 a = xp7.a();
                                    a.getClass();
                                    p27 = jb5.e(vw3, a, qp7);
                                } else if (ql4 != null && !xp7.c()) {
                                    vw3 b = xp7.b();
                                    b.getClass();
                                    k28 a2 = xp7.a();
                                    a2.getClass();
                                    p27 = jb5.e(b, a2, qp7);
                                } else if (ql4 != null) {
                                    p27 = iq7.j(qp7);
                                } else {
                                    p27 = null;
                                }
                                arrayList322.add(p27);
                                bool = bool3;
                                z8 = false;
                                obj = null;
                            }
                            bool2 = bool;
                            int i4222 = i3222 - i;
                            if (ql4 == null || bool2 != null) {
                                rm annotations2222 = fu6.getAnnotations();
                                tm tmVar22222 = ep7.b;
                                if (ql4 == null) {
                                    tmVar22222 = null;
                                }
                                tm tmVar32222 = ep7.a;
                                if (bool2 == null) {
                                    tmVar32222 = null;
                                }
                                boolean z92222 = true;
                                ArrayList V02222 = qs.V0(new rm[]{annotations2222, tmVar22222, tmVar32222});
                                size = V02222.size();
                                if (size != 0) {
                                    if (size != 1) {
                                        rmVar = new tm(1, dt0.b1(V02222));
                                    } else {
                                        rmVar = dt0.Q0(V02222);
                                    }
                                    ro7 u2 = b85.u(rmVar);
                                    List G3 = fu6.G();
                                    Iterator it3 = arrayList322.iterator();
                                    Iterator it4 = G3.iterator();
                                    ArrayList arrayList2 = new ArrayList(Math.min(et0.e0(arrayList322, 10), et0.e0(G3, 10)));
                                    while (it3.hasNext() && it4.hasNext()) {
                                        Object next2 = it3.next();
                                        xp7 xp72 = (xp7) it4.next();
                                        xp7 xp73 = (xp7) next2;
                                        if (xp73 != null) {
                                            xp72 = xp73;
                                        }
                                        arrayList2.add(xp72);
                                    }
                                    if (bool2 != null) {
                                        z6 = bool2.booleanValue();
                                    } else {
                                        z6 = fu6.Q();
                                    }
                                    fu6 I2 = kl8.I(u2, wo7, arrayList2, z6);
                                    if (zj3.c) {
                                        I2 = new v05(I2);
                                    }
                                    if (bool2 == null || !zj3.d) {
                                        z92222 = false;
                                    }
                                    return new v(I2, i4222, z92222);
                                }
                                h.s("At least one Annotations object expected");
                                return null;
                            }
                            if (!arrayList322.isEmpty()) {
                                Iterator it5 = arrayList322.iterator();
                                while (it5.hasNext()) {
                                    if (((xp7) it5.next()) != null) {
                                        rm annotations22222 = fu6.getAnnotations();
                                        tm tmVar222222 = ep7.b;
                                        if (ql4 == null) {
                                        }
                                        tm tmVar322222 = ep7.a;
                                        if (bool2 == null) {
                                        }
                                        boolean z922222 = true;
                                        ArrayList V022222 = qs.V0(new rm[]{annotations22222, tmVar222222, tmVar322222});
                                        size = V022222.size();
                                        if (size != 0) {
                                        }
                                    }
                                }
                            }
                            return new v((fu6) null, i4222, false);
                        }
                        bool = null;
                        wo7 = fu6.L();
                        int i32222 = i + 1;
                        List G22222 = fu6.G();
                        List parameters2222 = wo7.getParameters();
                        parameters2222.getClass();
                        it = G22222.iterator();
                        Iterator it22222 = parameters2222.iterator();
                        ArrayList arrayList3222 = new ArrayList(Math.min(et0.e0(G22222, 10), et0.e0(parameters2222, 10)));
                        while (it.hasNext() && it22222.hasNext()) {
                        }
                        bool2 = bool;
                        int i42222 = i32222 - i;
                        if (ql4 == null) {
                        }
                        rm annotations222222 = fu6.getAnnotations();
                        tm tmVar2222222 = ep7.b;
                        if (ql4 == null) {
                        }
                        tm tmVar3222222 = ep7.a;
                        if (bool2 == null) {
                        }
                        boolean z9222222 = true;
                        ArrayList V0222222 = qs.V0(new rm[]{annotations222222, tmVar2222222, tmVar3222222});
                        size = V0222222.size();
                        if (size != 0) {
                        }
                    } else {
                        rf2.q(ql42, " is not a mutable collection", "Given class ");
                        return null;
                    }
                }
            }
            if (zj3.b == po4.x && vo72 == vo7.x) {
                ql4 ql43 = (ql4) u;
                String str2 = tj3.a;
                if (tj3.k.containsKey(rs1.f(ql43))) {
                    ql4 = kw5.j(ql43);
                    if (vo72 != vo73) {
                    }
                    bool = null;
                    wo7 = fu6.L();
                    int i322222 = i + 1;
                    List G222222 = fu6.G();
                    List parameters22222 = wo7.getParameters();
                    parameters22222.getClass();
                    it = G222222.iterator();
                    Iterator it222222 = parameters22222.iterator();
                    ArrayList arrayList32222 = new ArrayList(Math.min(et0.e0(G222222, 10), et0.e0(parameters22222, 10)));
                    while (it.hasNext() && it222222.hasNext()) {
                    }
                    bool2 = bool;
                    int i422222 = i322222 - i;
                    if (ql4 == null) {
                    }
                    rm annotations2222222 = fu6.getAnnotations();
                    tm tmVar22222222 = ep7.b;
                    if (ql4 == null) {
                    }
                    tm tmVar32222222 = ep7.a;
                    if (bool2 == null) {
                    }
                    boolean z92222222 = true;
                    ArrayList V02222222 = qs.V0(new rm[]{annotations2222222, tmVar22222222, tmVar32222222});
                    size = V02222222.size();
                    if (size != 0) {
                    }
                }
            }
        }
        ql4 = null;
        if (vo72 != vo73) {
        }
        bool = null;
        wo7 = fu6.L();
        int i3222222 = i + 1;
        List G2222222 = fu6.G();
        List parameters222222 = wo7.getParameters();
        parameters222222.getClass();
        it = G2222222.iterator();
        Iterator it2222222 = parameters222222.iterator();
        ArrayList arrayList322222 = new ArrayList(Math.min(et0.e0(G2222222, 10), et0.e0(parameters222222, 10)));
        while (it.hasNext() && it2222222.hasNext()) {
        }
        bool2 = bool;
        int i4222222 = i3222222 - i;
        if (ql4 == null) {
        }
        rm annotations22222222 = fu6.getAnnotations();
        tm tmVar222222222 = ep7.b;
        if (ql4 == null) {
        }
        tm tmVar322222222 = ep7.a;
        if (bool2 == null) {
        }
        boolean z922222222 = true;
        ArrayList V022222222 = qs.V0(new rm[]{annotations22222222, tmVar222222222, tmVar322222222});
        size = V022222222.size();
        if (size != 0) {
        }
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
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r3 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r2 = defpackage.kl8.n(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r3.getClass();
        r3 = r3;
     */
    public static defpackage.qa l(defpackage.du7 r10, defpackage.e3 r11, int r12, boolean r13) {
        /*
            boolean r0 = defpackage.gr8.N(r10)
            r1 = 4
            r2 = 0
            if (r0 == 0) goto L_0x000f
            qa r10 = new qa
            r11 = 1
            r10.<init>(r11, r1, r2)
            return r10
        L_0x000f:
            boolean r0 = r10 instanceof defpackage.zg2
            if (r0 == 0) goto L_0x0078
            boolean r7 = r10 instanceof defpackage.jw5
            r0 = r10
            zg2 r0 = (defpackage.zg2) r0
            fu6 r9 = r0.y
            fu6 r3 = r0.x
            vo7 r6 = defpackage.vo7.w
            r4 = r11
            r5 = r12
            r8 = r13
            v r11 = k(r3, r4, r5, r6, r7, r8)
            r12 = r3
            fu6 r3 = r0.y
            vo7 r6 = defpackage.vo7.x
            v r13 = k(r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r13.c
            fu6 r0 = (defpackage.fu6) r0
            java.lang.Object r3 = r11.c
            fu6 r3 = (defpackage.fu6) r3
            if (r3 != 0) goto L_0x003b
            if (r0 != 0) goto L_0x003b
            goto L_0x0070
        L_0x003b:
            boolean r2 = r11.b
            if (r2 != 0) goto L_0x005f
            boolean r13 = r13.b
            if (r13 == 0) goto L_0x0044
            goto L_0x005f
        L_0x0044:
            if (r7 == 0) goto L_0x0053
            jw5 r2 = new jw5
            if (r3 != 0) goto L_0x004b
            r3 = r12
        L_0x004b:
            if (r0 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r9 = r0
        L_0x004f:
            r2.<init>(r3, r9)
            goto L_0x0070
        L_0x0053:
            if (r3 != 0) goto L_0x0056
            r3 = r12
        L_0x0056:
            if (r0 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r9 = r0
        L_0x005a:
            du7 r2 = defpackage.kl8.n(r3, r9)
            goto L_0x0070
        L_0x005f:
            if (r0 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0064
            r3 = r0
        L_0x0064:
            du7 r3 = defpackage.kl8.n(r3, r0)
            goto L_0x006c
        L_0x0069:
            r3.getClass()
        L_0x006c:
            du7 r2 = defpackage.ub5.t(r10, r3)
        L_0x0070:
            qa r10 = new qa
            int r11 = r11.a
            r10.<init>(r11, r1, r2)
            return r10
        L_0x0078:
            r4 = r11
            r5 = r12
            r8 = r13
            boolean r11 = r10 instanceof defpackage.fu6
            if (r11 == 0) goto L_0x009d
            r3 = r10
            fu6 r3 = (defpackage.fu6) r3
            vo7 r6 = defpackage.vo7.y
            r7 = 0
            v r11 = k(r3, r4, r5, r6, r7, r8)
            qa r12 = new qa
            boolean r13 = r11.b
            java.lang.Object r0 = r11.c
            fu6 r0 = (defpackage.fu6) r0
            if (r13 == 0) goto L_0x0097
            du7 r0 = defpackage.ub5.t(r10, r0)
        L_0x0097:
            int r10 = r11.a
            r12.<init>(r10, r1, r0)
            return r12
        L_0x009d:
            defpackage.h.c()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s63.l(du7, e3, int, boolean):qa");
    }

    public Object a() {
        switch (this.w) {
            case 17:
                zn8 zn8 = (zn8) un8.x.w.w;
                return new Boolean(((Boolean) zn8.b.get()).booleanValue());
            case 18:
                List list = by8.a;
                do8 do8 = (do8) co8.x.w.w;
                return (String) do8.b.get();
            case 19:
                List list2 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 20:
                List list3 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(42, 10, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 21:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(63, 43200000, "measurement.upload.backoff_period").get();
            case 22:
                List list5 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(27, 60000, "measurement.alarm_manager.minimum_interval").get();
            case 23:
                List list6 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(73, 518400000, "measurement.upload.max_queue_time").get();
            case 24:
                List list7 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 25:
                List list8 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(3, 100, "measurement.max_bundles_per_iteration").get()).longValue());
            case 26:
                List list9 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 27:
                List list10 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(54, 16, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            default:
                List list11 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(11, 3600000, "45769094").get();
        }
    }

    public int b(Context context, String str, boolean z2) {
        return f12.d(context, str, z2);
    }

    public /* synthetic */ Object c(yb9 yb9) {
        Intent intent = (Intent) ((Bundle) yb9.i()).getParcelable("notification_data");
        if (intent != null) {
            return new ns0(intent);
        }
        return null;
    }

    public int f(Context context, String str) {
        return f12.a(context, str);
    }

    public void g(Object obj, j43 j43) {
        t63 t63 = (t63) obj;
        t63.getClass();
        j43.getClass();
        j43.z.f(s53.n, new r63(t63, j43, (f61) null));
    }

    public au getKey() {
        return t63.c;
    }

    public bo6 h(n63 n63, JSONObject jSONObject) {
        bc4 bc4;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            bc4 = new bc4(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 6);
        } else {
            bc4 = new bc4(new JSONObject().optInt("max_custom_exception_events", 8), 6);
        }
        bc4 bc42 = bc4;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        yn6 yn6 = new yn6(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = (long) optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new bo6(currentTimeMillis, bc42, yn6, optDouble, optDouble2, optInt2);
    }

    public Object i(vr2 vr2) {
        vr2.y(new n63(0));
        return new t63();
    }

    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    public String toString() {
        switch (this.w) {
            case 8:
                int hashCode = hashCode();
                rd3.i(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return pb4.m("CreationExtras.Key@", num, "<", b26.a.b(if6.class).A(), ">");
            case 10:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s63(int i) {
        this.w = i;
    }

    public Object e(CorruptionException corruptionException) {
        throw corruptionException;
    }
}
