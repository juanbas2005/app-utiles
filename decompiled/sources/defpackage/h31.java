package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: h31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h31 extends g31 {
    public tm0[] A0;
    public tm0[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final m60 K0;
    public ArrayList p0 = new ArrayList();
    public final wr0 q0 = new wr0(this);
    public final dq1 r0;
    public int s0;
    public n21 t0;
    public boolean u0;
    public final x64 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r0v5, types: [m60, java.lang.Object] */
    public h31() {
        dq1 dq1 = new dq1();
        dq1.b = true;
        dq1.c = true;
        dq1.f = new ArrayList();
        new ArrayList();
        dq1.h = null;
        dq1.i = new Object();
        dq1.g = new ArrayList();
        dq1.d = this;
        dq1.e = this;
        this.r0 = dq1;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new x64();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new tm0[4];
        this.B0 = new tm0[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new Object();
    }

    public static void Q(g31 g31, n21 n21, m60 m60) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (n21 != null) {
            int i3 = g31.f0;
            int[] iArr = g31.s;
            if (i3 == 8 || (g31 instanceof zx2) || (g31 instanceof j50)) {
                m60.e = 0;
                m60.f = 0;
                return;
            }
            int[] iArr2 = g31.o0;
            m60.a = iArr2[0];
            m60.b = iArr2[1];
            m60.c = g31.n();
            m60.d = g31.k();
            m60.i = false;
            m60.j = 0;
            if (m60.a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (m60.b == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || g31.V <= 0.0f) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z2 || g31.V <= 0.0f) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z && g31.q(0) && g31.q == 0 && !z3) {
                m60.a = 2;
                if (z2 && g31.r == 0) {
                    m60.a = 1;
                }
                z = false;
            }
            if (z2 && g31.q(1) && g31.r == 0 && !z4) {
                m60.b = 2;
                if (z && g31.q == 0) {
                    m60.b = 1;
                }
                z2 = false;
            }
            if (g31.x()) {
                m60.a = 1;
                z = false;
            }
            if (g31.y()) {
                m60.b = 1;
                z2 = false;
            }
            if (z3) {
                if (iArr[0] == 4) {
                    m60.a = 1;
                } else if (!z2) {
                    if (m60.b == 1) {
                        i2 = m60.d;
                    } else {
                        m60.a = 2;
                        n21.b(g31, m60);
                        i2 = m60.f;
                    }
                    m60.a = 1;
                    m60.c = (int) (g31.V * ((float) i2));
                }
            }
            if (z4) {
                if (iArr[1] == 4) {
                    m60.b = 1;
                } else if (!z) {
                    if (m60.a == 1) {
                        i = m60.c;
                    } else {
                        m60.b = 2;
                        n21.b(g31, m60);
                        i = m60.e;
                    }
                    m60.b = 1;
                    int i4 = g31.W;
                    float f = g31.V;
                    if (i4 == -1) {
                        m60.d = (int) (((float) i) / f);
                    } else {
                        m60.d = (int) (f * ((float) i));
                    }
                }
            }
            n21.b(g31, m60);
            g31.J(m60.e);
            g31.G(m60.f);
            g31.D = m60.h;
            g31.D(m60.g);
            m60.j = 0;
        }
    }

    public final void C(wr0 wr0) {
        super.C(wr0);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((g31) this.p0.get(i)).C(wr0);
        }
    }

    public final void K(boolean z, boolean z2) {
        super.K(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((g31) this.p0.get(i)).K(z, z2);
        }
    }

    public final void M(g31 g31, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            tm0[] tm0Arr = this.B0;
            if (i2 >= tm0Arr.length) {
                this.B0 = (tm0[]) Arrays.copyOf(tm0Arr, tm0Arr.length * 2);
            }
            tm0[] tm0Arr2 = this.B0;
            int i3 = this.y0;
            tm0Arr2[i3] = new tm0(g31, 0, this.u0);
            this.y0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.z0 + 1;
            tm0[] tm0Arr3 = this.A0;
            if (i4 >= tm0Arr3.length) {
                this.A0 = (tm0[]) Arrays.copyOf(tm0Arr3, tm0Arr3.length * 2);
            }
            tm0[] tm0Arr4 = this.A0;
            int i5 = this.z0;
            tm0Arr4[i5] = new tm0(g31, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void N(x64 x64) {
        x64 x642;
        h31 h31;
        int i;
        boolean R = R(64);
        b(x64, R);
        int size = this.p0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            g31 g31 = (g31) this.p0.get(i2);
            boolean[] zArr = g31.R;
            zArr[0] = false;
            zArr[1] = false;
            if (g31 instanceof j50) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                g31 g312 = (g31) this.p0.get(i3);
                if (g312 instanceof j50) {
                    j50 j50 = (j50) g312;
                    for (int i4 = 0; i4 < j50.q0; i4++) {
                        g31 g313 = j50.p0[i4];
                        if (j50.s0 || g313.c()) {
                            int i5 = j50.r0;
                            if (i5 == 0 || i5 == 1) {
                                g313.R[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                g313.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            g31 g314 = (g31) this.p0.get(i6);
            g314.getClass();
            boolean z2 = g314 instanceof ei2;
            if (z2 || (g314 instanceof zx2)) {
                if (z2) {
                    hashSet.add(g314);
                } else {
                    g314.b(x64, R);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ei2 ei2 = (ei2) ((g31) it.next());
                int i7 = 0;
                while (true) {
                    if (i7 < ei2.q0) {
                        if (hashSet.contains(ei2.p0[i7])) {
                            ei2.b(x64, R);
                            hashSet.remove(ei2);
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((g31) it2.next()).b(x64, R);
                }
                hashSet.clear();
            }
        }
        if (x64.p) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                g31 g315 = (g31) this.p0.get(i8);
                g315.getClass();
                if (!(g315 instanceof ei2) && !(g315 instanceof zx2)) {
                    hashSet2.add(g315);
                }
            }
            if (this.o0[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            h31 = this;
            x642 = x64;
            h31.a(this, x642, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                g31 g316 = (g31) it3.next();
                rc9.y(h31, x642, g316);
                g316.b(x642, R);
            }
        } else {
            h31 = this;
            x642 = x64;
            for (int i9 = 0; i9 < size; i9++) {
                g31 g317 = (g31) h31.p0.get(i9);
                if (g317 instanceof h31) {
                    int[] iArr = g317.o0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        g317.H(1);
                    }
                    if (i11 == 2) {
                        g317.I(1);
                    }
                    g317.b(x642, R);
                    if (i10 == 2) {
                        g317.H(i10);
                    }
                    if (i11 == 2) {
                        g317.I(i11);
                    }
                } else {
                    rc9.y(h31, x642, g317);
                    if (!(g317 instanceof ei2) && !(g317 instanceof zx2)) {
                        g317.b(x642, R);
                    }
                }
            }
        }
        if (h31.y0 > 0) {
            ed1.g(h31, x642, (ArrayList) null, 0);
        }
        if (h31.z0 > 0) {
            ed1.g(h31, x642, (ArrayList) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010c A[SYNTHETIC] */
    public final boolean O(int i, boolean z) {
        boolean z2;
        Iterator it;
        Iterator it2;
        dq1 dq1 = this.r0;
        ArrayList arrayList = (ArrayList) dq1.f;
        h31 h31 = (h31) dq1.d;
        boolean z3 = false;
        int j = h31.j(0);
        int j2 = h31.j(1);
        int o = h31.o();
        int p = h31.p();
        if (z && (j == 2 || j2 == 2)) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                h98 h98 = (h98) it3.next();
                if (h98.f == i && !h98.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == 2) {
                    h31.H(1);
                    h31.J(dq1.e(h31, 0));
                    h31.d.e.d(h31.n());
                }
            } else if (z && j2 == 2) {
                h31.I(1);
                h31.G(dq1.e(h31, 1));
                h31.e.e.d(h31.k());
            }
        }
        int[] iArr = h31.o0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int n = h31.n() + o;
                h31.d.i.d(n);
                h31.d.e.d(n - o);
            }
            z2 = false;
            dq1.i();
            it = arrayList.iterator();
            while (it.hasNext()) {
                h98 h982 = (h98) it.next();
                if (h982.f == i && (h982.b != h31 || h982.g)) {
                    h982.e();
                }
            }
            it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z3 = true;
                    break;
                }
                h98 h983 = (h98) it2.next();
                if (h983.f == i && ((z2 || h983.b != h31) && (!h983.h.j || !h983.i.j || (!(h983 instanceof um0) && !h983.e.j)))) {
                    break;
                }
            }
            h31.H(j);
            h31.I(j2);
            return z3;
        }
        int i3 = iArr[1];
        if (i3 == 1 || i3 == 4) {
            int k = h31.k() + p;
            h31.e.i.d(k);
            h31.e.e.d(k - p);
        }
        z2 = false;
        dq1.i();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
            }
        }
        h31.H(j);
        h31.I(j2);
        return z3;
        z2 = true;
        dq1.i();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
            }
        }
        h31.H(j);
        h31.I(j2);
        return z3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: g98} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v23, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v26, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v126, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v36, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r10v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r23v16 */
    /* JADX WARNING: type inference failed for: r6v90, types: [m60, java.lang.Object] */
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
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0651, code lost:
        if (r6 != null) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0654, code lost:
        if (r9 != 2) goto L_0x0669;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x065a, code lost:
        if (r0 >= n()) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x065c, code lost:
        if (r0 <= 0) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x065e, code lost:
        J(r0);
        r1.D0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0665, code lost:
        r0 = n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x066a, code lost:
        if (r8 != 2) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0670, code lost:
        if (r5 >= k()) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0672, code lost:
        if (r5 <= 0) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0674, code lost:
        G(r5);
        r1.E0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x067b, code lost:
        r5 = k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x067f, code lost:
        r2 = r0;
        r0 = true;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x05e0, code lost:
        r23 = r23;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0625  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x07d7  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0814  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x083b A[LOOP:34: B:492:0x0839->B:493:0x083b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x08a0  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x08ac  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x08bf  */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x08c7  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x08cb  */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x0900  */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0904  */
    /* JADX WARNING: Removed duplicated region for block: B:619:0x0905 A[SYNTHETIC] */
    public final void P() {
        /*
            r33 = this;
            r1 = r33
            boolean[] r2 = defpackage.rc9.o
            r3 = 0
            r1.X = r3
            r1.Y = r3
            r1.D0 = r3
            r1.E0 = r3
            java.util.ArrayList r0 = r1.p0
            int r4 = r0.size()
            int r0 = r1.n()
            int r0 = java.lang.Math.max(r3, r0)
            int r5 = r1.k()
            int r5 = java.lang.Math.max(r3, r5)
            int[] r6 = r1.o0
            r7 = 1
            r8 = r6[r7]
            r9 = r6[r3]
            int r10 = r1.s0
            h21 r12 = r1.I
            h21 r13 = r1.H
            if (r10 != 0) goto L_0x0261
            int r10 = r1.C0
            boolean r10 = defpackage.rc9.I(r10, r7)
            if (r10 == 0) goto L_0x0261
            n21 r10 = r1.t0
            r15 = r6[r3]
            r11 = r6[r7]
            r1.B()
            java.util.ArrayList r14 = r1.p0
            int r3 = r14.size()
            r7 = 0
        L_0x004a:
            if (r7 >= r3) goto L_0x0058
            java.lang.Object r18 = r14.get(r7)
            g31 r18 = (defpackage.g31) r18
            r18.B()
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0058:
            boolean r7 = r1.u0
            r18 = r2
            r2 = 1
            if (r15 != r2) goto L_0x0068
            int r2 = r1.n()
            r15 = 0
            r1.E(r15, r2)
            goto L_0x006e
        L_0x0068:
            r15 = 0
            r13.l(r15)
            r1.X = r15
        L_0x006e:
            r2 = 0
            r15 = 0
            r19 = 0
        L_0x0072:
            r20 = 1056964608(0x3f000000, float:0.5)
            if (r2 >= r3) goto L_0x00dd
            java.lang.Object r21 = r14.get(r2)
            r22 = r2
            r2 = r21
            g31 r2 = (defpackage.g31) r2
            r21 = r6
            boolean r6 = r2 instanceof defpackage.zx2
            if (r6 == 0) goto L_0x00c6
            zx2 r2 = (defpackage.zx2) r2
            int r6 = r2.t0
            r23 = r15
            r15 = 1
            if (r6 != r15) goto L_0x00c3
            int r6 = r2.q0
            r15 = -1
            if (r6 == r15) goto L_0x0098
            r2.M(r6)
            goto L_0x00c1
        L_0x0098:
            int r6 = r2.r0
            if (r6 == r15) goto L_0x00ad
            boolean r6 = r1.x()
            if (r6 == 0) goto L_0x00ad
            int r6 = r1.n()
            int r15 = r2.r0
            int r6 = r6 - r15
            r2.M(r6)
            goto L_0x00c1
        L_0x00ad:
            boolean r6 = r1.x()
            if (r6 == 0) goto L_0x00c1
            float r6 = r2.p0
            int r15 = r1.n()
            float r15 = (float) r15
            float r6 = r6 * r15
            float r6 = r6 + r20
            int r6 = (int) r6
            r2.M(r6)
        L_0x00c1:
            r23 = 1
        L_0x00c3:
            r15 = r23
            goto L_0x00d8
        L_0x00c6:
            r23 = r15
            boolean r6 = r2 instanceof defpackage.j50
            if (r6 == 0) goto L_0x00c3
            j50 r2 = (defpackage.j50) r2
            int r2 = r2.P()
            if (r2 != 0) goto L_0x00c3
            r15 = r23
            r19 = 1
        L_0x00d8:
            int r2 = r22 + 1
            r6 = r21
            goto L_0x0072
        L_0x00dd:
            r21 = r6
            r23 = r15
            if (r23 == 0) goto L_0x0106
            r2 = 0
        L_0x00e4:
            if (r2 >= r3) goto L_0x0106
            java.lang.Object r6 = r14.get(r2)
            g31 r6 = (defpackage.g31) r6
            boolean r15 = r6 instanceof defpackage.zx2
            if (r15 == 0) goto L_0x0100
            zx2 r6 = (defpackage.zx2) r6
            int r15 = r6.t0
            r22 = r2
            r2 = 1
            if (r15 != r2) goto L_0x00fe
            r15 = 0
            defpackage.pd8.u(r15, r10, r6, r7)
            goto L_0x0103
        L_0x00fe:
            r15 = 0
            goto L_0x0103
        L_0x0100:
            r22 = r2
            goto L_0x00fe
        L_0x0103:
            int r2 = r22 + 1
            goto L_0x00e4
        L_0x0106:
            r15 = 0
            defpackage.pd8.u(r15, r10, r1, r7)
            if (r19 == 0) goto L_0x0130
            r2 = 0
        L_0x010d:
            if (r2 >= r3) goto L_0x0130
            java.lang.Object r6 = r14.get(r2)
            g31 r6 = (defpackage.g31) r6
            boolean r15 = r6 instanceof defpackage.j50
            if (r15 == 0) goto L_0x012c
            j50 r6 = (defpackage.j50) r6
            int r15 = r6.P()
            if (r15 != 0) goto L_0x012c
            boolean r15 = r6.O()
            if (r15 == 0) goto L_0x012c
            r15 = 1
            defpackage.pd8.u(r15, r10, r6, r7)
            goto L_0x012d
        L_0x012c:
            r15 = 1
        L_0x012d:
            int r2 = r2 + 1
            goto L_0x010d
        L_0x0130:
            r15 = 1
            if (r11 != r15) goto L_0x013c
            int r2 = r1.k()
            r15 = 0
            r1.F(r15, r2)
            goto L_0x0142
        L_0x013c:
            r15 = 0
            r12.l(r15)
            r1.Y = r15
        L_0x0142:
            r2 = 0
            r6 = 0
            r11 = 0
        L_0x0145:
            if (r2 >= r3) goto L_0x019e
            java.lang.Object r15 = r14.get(r2)
            g31 r15 = (defpackage.g31) r15
            r19 = r2
            boolean r2 = r15 instanceof defpackage.zx2
            if (r2 == 0) goto L_0x018d
            zx2 r15 = (defpackage.zx2) r15
            int r2 = r15.t0
            if (r2 != 0) goto L_0x019b
            int r2 = r15.q0
            r6 = -1
            if (r2 == r6) goto L_0x0162
            r15.M(r2)
            goto L_0x018b
        L_0x0162:
            int r2 = r15.r0
            if (r2 == r6) goto L_0x0177
            boolean r2 = r1.y()
            if (r2 == 0) goto L_0x0177
            int r2 = r1.k()
            int r6 = r15.r0
            int r2 = r2 - r6
            r15.M(r2)
            goto L_0x018b
        L_0x0177:
            boolean r2 = r1.y()
            if (r2 == 0) goto L_0x018b
            float r2 = r15.p0
            int r6 = r1.k()
            float r6 = (float) r6
            float r2 = r2 * r6
            float r2 = r2 + r20
            int r2 = (int) r2
            r15.M(r2)
        L_0x018b:
            r6 = 1
            goto L_0x019b
        L_0x018d:
            boolean r2 = r15 instanceof defpackage.j50
            if (r2 == 0) goto L_0x019b
            j50 r15 = (defpackage.j50) r15
            int r2 = r15.P()
            r15 = 1
            if (r2 != r15) goto L_0x019b
            r11 = 1
        L_0x019b:
            int r2 = r19 + 1
            goto L_0x0145
        L_0x019e:
            if (r6 == 0) goto L_0x01ba
            r2 = 0
        L_0x01a1:
            if (r2 >= r3) goto L_0x01ba
            java.lang.Object r6 = r14.get(r2)
            g31 r6 = (defpackage.g31) r6
            boolean r15 = r6 instanceof defpackage.zx2
            if (r15 == 0) goto L_0x01b7
            zx2 r6 = (defpackage.zx2) r6
            int r15 = r6.t0
            if (r15 != 0) goto L_0x01b7
            r15 = 1
            defpackage.pd8.Q(r15, r10, r6)
        L_0x01b7:
            int r2 = r2 + 1
            goto L_0x01a1
        L_0x01ba:
            r15 = 0
            defpackage.pd8.Q(r15, r10, r1)
            if (r11 == 0) goto L_0x01e2
            r2 = 0
        L_0x01c1:
            if (r2 >= r3) goto L_0x01e2
            java.lang.Object r6 = r14.get(r2)
            g31 r6 = (defpackage.g31) r6
            boolean r11 = r6 instanceof defpackage.j50
            if (r11 == 0) goto L_0x01df
            j50 r6 = (defpackage.j50) r6
            int r11 = r6.P()
            r15 = 1
            if (r11 != r15) goto L_0x01df
            boolean r11 = r6.O()
            if (r11 == 0) goto L_0x01df
            defpackage.pd8.Q(r15, r10, r6)
        L_0x01df:
            int r2 = r2 + 1
            goto L_0x01c1
        L_0x01e2:
            r2 = 0
        L_0x01e3:
            if (r2 >= r3) goto L_0x021b
            java.lang.Object r6 = r14.get(r2)
            g31 r6 = (defpackage.g31) r6
            boolean r11 = r6.w()
            if (r11 == 0) goto L_0x0218
            boolean r11 = defpackage.pd8.j(r6)
            if (r11 == 0) goto L_0x0218
            m60 r11 = defpackage.pd8.f
            Q(r6, r10, r11)
            boolean r11 = r6 instanceof defpackage.zx2
            if (r11 == 0) goto L_0x0211
            r11 = r6
            zx2 r11 = (defpackage.zx2) r11
            int r11 = r11.t0
            if (r11 != 0) goto L_0x020c
            r15 = 0
            defpackage.pd8.Q(r15, r10, r6)
            goto L_0x0218
        L_0x020c:
            r15 = 0
            defpackage.pd8.u(r15, r10, r6, r7)
            goto L_0x0218
        L_0x0211:
            r15 = 0
            defpackage.pd8.u(r15, r10, r6, r7)
            defpackage.pd8.Q(r15, r10, r6)
        L_0x0218:
            int r2 = r2 + 1
            goto L_0x01e3
        L_0x021b:
            r2 = 0
        L_0x021c:
            if (r2 >= r4) goto L_0x0265
            java.util.ArrayList r3 = r1.p0
            java.lang.Object r3 = r3.get(r2)
            g31 r3 = (defpackage.g31) r3
            boolean r6 = r3.w()
            if (r6 == 0) goto L_0x025e
            boolean r6 = r3 instanceof defpackage.zx2
            if (r6 != 0) goto L_0x025e
            boolean r6 = r3 instanceof defpackage.j50
            if (r6 != 0) goto L_0x025e
            boolean r6 = r3 instanceof defpackage.ei2
            if (r6 != 0) goto L_0x025e
            boolean r6 = r3.E
            if (r6 != 0) goto L_0x025e
            r15 = 0
            int r6 = r3.j(r15)
            r15 = 1
            int r7 = r3.j(r15)
            r10 = 3
            if (r6 != r10) goto L_0x0254
            int r6 = r3.q
            if (r6 == r15) goto L_0x0254
            if (r7 != r10) goto L_0x0254
            int r6 = r3.r
            if (r6 == r15) goto L_0x0254
            goto L_0x025e
        L_0x0254:
            m60 r6 = new m60
            r6.<init>()
            n21 r7 = r1.t0
            Q(r3, r7, r6)
        L_0x025e:
            int r2 = r2 + 1
            goto L_0x021c
        L_0x0261:
            r18 = r2
            r21 = r6
        L_0x0265:
            r3 = 2
            x64 r7 = r1.v0
            if (r4 <= r3) goto L_0x026f
            if (r9 == r3) goto L_0x0273
            if (r8 != r3) goto L_0x026f
            goto L_0x0273
        L_0x026f:
            r25 = r13
            goto L_0x0682
        L_0x0273:
            int r10 = r1.C0
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = defpackage.rc9.I(r10, r11)
            if (r10 == 0) goto L_0x026f
            n21 r10 = r1.t0
            java.util.ArrayList r11 = r1.p0
            int r14 = r11.size()
            r15 = 0
        L_0x0286:
            if (r15 >= r14) goto L_0x02b8
            java.lang.Object r19 = r11.get(r15)
            r2 = r19
            g31 r2 = (defpackage.g31) r2
            r16 = 0
            r3 = r21[r16]
            r17 = 1
            r6 = r21[r17]
            r23 = r15
            int[] r15 = r2.o0
            r24 = r15
            r15 = r24[r16]
            r25 = r13
            r13 = r24[r17]
            boolean r3 = defpackage.su0.S(r3, r6, r15, r13)
            if (r3 != 0) goto L_0x02ac
            goto L_0x0682
        L_0x02ac:
            boolean r2 = r2 instanceof defpackage.ei2
            if (r2 == 0) goto L_0x02b2
            goto L_0x0682
        L_0x02b2:
            int r15 = r23 + 1
            r13 = r25
            r3 = 2
            goto L_0x0286
        L_0x02b8:
            r25 = r13
            r2 = 0
            r3 = 0
            r6 = 0
            r13 = 0
            r15 = 0
            r23 = 0
            r24 = 0
        L_0x02c3:
            if (r2 >= r14) goto L_0x03e2
            java.lang.Object r26 = r11.get(r2)
            r27 = r2
            r2 = r26
            g31 r2 = (defpackage.g31) r2
            r26 = r3
            r16 = 0
            r3 = r21[r16]
            r28 = r6
            r17 = 1
            r6 = r21[r17]
            r29 = r13
            int[] r13 = r2.o0
            r30 = r13
            r13 = r30[r16]
            r31 = r15
            r15 = r30[r17]
            boolean r3 = defpackage.su0.S(r3, r6, r13, r15)
            if (r3 != 0) goto L_0x02f2
            m60 r3 = r1.K0
            Q(r2, r10, r3)
        L_0x02f2:
            boolean r3 = r2 instanceof defpackage.zx2
            if (r3 == 0) goto L_0x0325
            r6 = r2
            zx2 r6 = (defpackage.zx2) r6
            int r13 = r6.t0
            if (r13 != 0) goto L_0x030b
            if (r29 != 0) goto L_0x0305
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto L_0x0307
        L_0x0305:
            r13 = r29
        L_0x0307:
            r13.add(r6)
            goto L_0x030d
        L_0x030b:
            r13 = r29
        L_0x030d:
            int r15 = r6.t0
            r30 = r3
            r3 = 1
            if (r15 != r3) goto L_0x0322
            if (r26 != 0) goto L_0x031c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x031e
        L_0x031c:
            r3 = r26
        L_0x031e:
            r3.add(r6)
            goto L_0x032b
        L_0x0322:
            r3 = r26
            goto L_0x032b
        L_0x0325:
            r30 = r3
            r3 = r26
            r13 = r29
        L_0x032b:
            boolean r6 = r2 instanceof defpackage.pz2
            if (r6 == 0) goto L_0x038d
            boolean r6 = r2 instanceof defpackage.j50
            if (r6 == 0) goto L_0x036b
            r6 = r2
            j50 r6 = (defpackage.j50) r6
            int r15 = r6.P()
            if (r15 != 0) goto L_0x034c
            if (r28 != 0) goto L_0x0344
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            goto L_0x0346
        L_0x0344:
            r15 = r28
        L_0x0346:
            r15.add(r6)
        L_0x0349:
            r26 = r3
            goto L_0x034f
        L_0x034c:
            r15 = r28
            goto L_0x0349
        L_0x034f:
            int r3 = r6.P()
            r32 = r10
            r10 = 1
            if (r3 != r10) goto L_0x0367
            if (r31 != 0) goto L_0x0360
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x0362
        L_0x0360:
            r3 = r31
        L_0x0362:
            r3.add(r6)
            r31 = r3
        L_0x0367:
            r6 = r15
        L_0x0368:
            r15 = r31
            goto L_0x0394
        L_0x036b:
            r26 = r3
            r32 = r10
            r3 = r2
            pz2 r3 = (defpackage.pz2) r3
            if (r28 != 0) goto L_0x037a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L_0x037c
        L_0x037a:
            r6 = r28
        L_0x037c:
            r6.add(r3)
            if (r31 != 0) goto L_0x0387
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            goto L_0x0389
        L_0x0387:
            r15 = r31
        L_0x0389:
            r15.add(r3)
            goto L_0x0394
        L_0x038d:
            r26 = r3
            r32 = r10
            r6 = r28
            goto L_0x0368
        L_0x0394:
            h21 r3 = r2.H
            h21 r3 = r3.f
            if (r3 != 0) goto L_0x03b4
            h21 r3 = r2.J
            h21 r3 = r3.f
            if (r3 != 0) goto L_0x03b4
            if (r30 != 0) goto L_0x03b4
            boolean r3 = r2 instanceof defpackage.j50
            if (r3 != 0) goto L_0x03b4
            if (r23 != 0) goto L_0x03ad
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
        L_0x03ad:
            r3 = r23
            r3.add(r2)
            r23 = r3
        L_0x03b4:
            h21 r3 = r2.I
            h21 r3 = r3.f
            if (r3 != 0) goto L_0x03da
            h21 r3 = r2.K
            h21 r3 = r3.f
            if (r3 != 0) goto L_0x03da
            h21 r3 = r2.L
            h21 r3 = r3.f
            if (r3 != 0) goto L_0x03da
            if (r30 != 0) goto L_0x03da
            boolean r3 = r2 instanceof defpackage.j50
            if (r3 != 0) goto L_0x03da
            if (r24 != 0) goto L_0x03d3
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
        L_0x03d3:
            r3 = r24
            r3.add(r2)
            r24 = r3
        L_0x03da:
            int r2 = r27 + 1
            r3 = r26
            r10 = r32
            goto L_0x02c3
        L_0x03e2:
            r26 = r3
            r28 = r6
            r29 = r13
            r31 = r15
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r26 == 0) goto L_0x0407
            java.util.Iterator r3 = r26.iterator()
        L_0x03f5:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0407
            java.lang.Object r6 = r3.next()
            zx2 r6 = (defpackage.zx2) r6
            r10 = 0
            r15 = 0
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x03f5
        L_0x0407:
            r10 = 0
            r15 = 0
            if (r28 == 0) goto L_0x0428
            java.util.Iterator r3 = r28.iterator()
        L_0x040f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0428
            java.lang.Object r6 = r3.next()
            pz2 r6 = (defpackage.pz2) r6
            g98 r13 = defpackage.su0.n(r6, r15, r2, r10)
            r6.M(r15, r13, r2)
            r13.a(r2)
            r10 = 0
            r15 = 0
            goto L_0x040f
        L_0x0428:
            r3 = 2
            h21 r6 = r1.i(r3)
            java.util.HashSet r3 = r6.a
            if (r3 == 0) goto L_0x0449
            java.util.Iterator r3 = r3.iterator()
        L_0x0435:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0449
            java.lang.Object r6 = r3.next()
            h21 r6 = (defpackage.h21) r6
            g31 r6 = r6.d
            r10 = 0
            r15 = 0
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x0435
        L_0x0449:
            r3 = 4
            h21 r3 = r1.i(r3)
            java.util.HashSet r3 = r3.a
            if (r3 == 0) goto L_0x046a
            java.util.Iterator r3 = r3.iterator()
        L_0x0456:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x046a
            java.lang.Object r6 = r3.next()
            h21 r6 = (defpackage.h21) r6
            g31 r6 = r6.d
            r10 = 0
            r15 = 0
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x0456
        L_0x046a:
            r3 = 7
            h21 r6 = r1.i(r3)
            java.util.HashSet r6 = r6.a
            if (r6 == 0) goto L_0x048b
            java.util.Iterator r6 = r6.iterator()
        L_0x0477:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x048b
            java.lang.Object r10 = r6.next()
            h21 r10 = (defpackage.h21) r10
            g31 r10 = r10.d
            r13 = 0
            r15 = 0
            defpackage.su0.n(r10, r15, r2, r13)
            goto L_0x0477
        L_0x048b:
            r13 = 0
            r15 = 0
            if (r23 == 0) goto L_0x04a3
            java.util.Iterator r6 = r23.iterator()
        L_0x0493:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x04a3
            java.lang.Object r10 = r6.next()
            g31 r10 = (defpackage.g31) r10
            defpackage.su0.n(r10, r15, r2, r13)
            goto L_0x0493
        L_0x04a3:
            if (r29 == 0) goto L_0x04ba
            java.util.Iterator r6 = r29.iterator()
        L_0x04a9:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x04ba
            java.lang.Object r10 = r6.next()
            zx2 r10 = (defpackage.zx2) r10
            r15 = 1
            defpackage.su0.n(r10, r15, r2, r13)
            goto L_0x04a9
        L_0x04ba:
            r15 = 1
            if (r31 == 0) goto L_0x04db
            java.util.Iterator r6 = r31.iterator()
        L_0x04c1:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x04db
            java.lang.Object r10 = r6.next()
            pz2 r10 = (defpackage.pz2) r10
            g98 r3 = defpackage.su0.n(r10, r15, r2, r13)
            r10.M(r15, r3, r2)
            r3.a(r2)
            r3 = 7
            r13 = 0
            r15 = 1
            goto L_0x04c1
        L_0x04db:
            r10 = 3
            h21 r3 = r1.i(r10)
            java.util.HashSet r3 = r3.a
            if (r3 == 0) goto L_0x04fc
            java.util.Iterator r3 = r3.iterator()
        L_0x04e8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x04fc
            java.lang.Object r6 = r3.next()
            h21 r6 = (defpackage.h21) r6
            g31 r6 = r6.d
            r10 = 0
            r15 = 1
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x04e8
        L_0x04fc:
            r3 = 6
            h21 r3 = r1.i(r3)
            java.util.HashSet r3 = r3.a
            if (r3 == 0) goto L_0x051d
            java.util.Iterator r3 = r3.iterator()
        L_0x0509:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x051d
            java.lang.Object r6 = r3.next()
            h21 r6 = (defpackage.h21) r6
            g31 r6 = r6.d
            r10 = 0
            r15 = 1
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x0509
        L_0x051d:
            r3 = 5
            h21 r6 = r1.i(r3)
            java.util.HashSet r3 = r6.a
            if (r3 == 0) goto L_0x053e
            java.util.Iterator r3 = r3.iterator()
        L_0x052a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x053e
            java.lang.Object r6 = r3.next()
            h21 r6 = (defpackage.h21) r6
            g31 r6 = r6.d
            r10 = 0
            r15 = 1
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x052a
        L_0x053e:
            r3 = 7
            h21 r3 = r1.i(r3)
            java.util.HashSet r3 = r3.a
            if (r3 == 0) goto L_0x055f
            java.util.Iterator r3 = r3.iterator()
        L_0x054b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x055f
            java.lang.Object r6 = r3.next()
            h21 r6 = (defpackage.h21) r6
            g31 r6 = r6.d
            r10 = 0
            r15 = 1
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x054b
        L_0x055f:
            r10 = 0
            r15 = 1
            if (r24 == 0) goto L_0x0577
            java.util.Iterator r3 = r24.iterator()
        L_0x0567:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0577
            java.lang.Object r6 = r3.next()
            g31 r6 = (defpackage.g31) r6
            defpackage.su0.n(r6, r15, r2, r10)
            goto L_0x0567
        L_0x0577:
            r3 = 0
        L_0x0578:
            if (r3 >= r14) goto L_0x05e6
            java.lang.Object r6 = r11.get(r3)
            g31 r6 = (defpackage.g31) r6
            int[] r10 = r6.o0
            r16 = 0
            r13 = r10[r16]
            r17 = r15
            r15 = 3
            if (r13 != r15) goto L_0x05dc
            r10 = r10[r17]
            if (r10 != r15) goto L_0x05dc
            int r10 = r6.m0
            int r13 = r2.size()
            r15 = 0
        L_0x0596:
            if (r15 >= r13) goto L_0x05b0
            java.lang.Object r23 = r2.get(r15)
            r24 = r3
            r3 = r23
            g98 r3 = (defpackage.g98) r3
            r23 = r11
            int r11 = r3.b
            if (r10 != r11) goto L_0x05a9
            goto L_0x05b5
        L_0x05a9:
            int r15 = r15 + 1
            r11 = r23
            r3 = r24
            goto L_0x0596
        L_0x05b0:
            r24 = r3
            r23 = r11
            r3 = 0
        L_0x05b5:
            int r6 = r6.n0
            int r10 = r2.size()
            r11 = 0
        L_0x05bc:
            if (r11 >= r10) goto L_0x05cc
            java.lang.Object r13 = r2.get(r11)
            g98 r13 = (defpackage.g98) r13
            int r15 = r13.b
            if (r6 != r15) goto L_0x05c9
            goto L_0x05cd
        L_0x05c9:
            int r11 = r11 + 1
            goto L_0x05bc
        L_0x05cc:
            r13 = 0
        L_0x05cd:
            if (r3 == 0) goto L_0x05e0
            if (r13 == 0) goto L_0x05e0
            r15 = 0
            r3.c(r15, r13)
            r6 = 2
            r13.c = r6
            r2.remove(r3)
            goto L_0x05e0
        L_0x05dc:
            r24 = r3
            r23 = r11
        L_0x05e0:
            int r3 = r24 + 1
            r11 = r23
            r15 = 1
            goto L_0x0578
        L_0x05e6:
            int r3 = r2.size()
            r15 = 1
            if (r3 > r15) goto L_0x05ef
            goto L_0x0682
        L_0x05ef:
            r3 = 0
            r6 = r21[r3]
            r10 = 2
            if (r6 != r10) goto L_0x061f
            java.util.Iterator r6 = r2.iterator()
            r10 = r3
            r11 = 0
        L_0x05fb:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0616
            java.lang.Object r13 = r6.next()
            g98 r13 = (defpackage.g98) r13
            int r14 = r13.c
            if (r14 != r15) goto L_0x060c
            goto L_0x05fb
        L_0x060c:
            int r14 = r13.b(r7, r3)
            if (r14 <= r10) goto L_0x0614
            r11 = r13
            r10 = r14
        L_0x0614:
            r3 = 0
            goto L_0x05fb
        L_0x0616:
            if (r11 == 0) goto L_0x061f
            r1.H(r15)
            r1.J(r10)
            goto L_0x0620
        L_0x061f:
            r11 = 0
        L_0x0620:
            r3 = r21[r15]
            r6 = 2
            if (r3 != r6) goto L_0x064e
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r6 = 0
        L_0x062b:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0645
            java.lang.Object r10 = r2.next()
            g98 r10 = (defpackage.g98) r10
            int r13 = r10.c
            if (r13 != 0) goto L_0x063c
            goto L_0x062b
        L_0x063c:
            int r13 = r10.b(r7, r15)
            if (r13 <= r3) goto L_0x062b
            r6 = r10
            r3 = r13
            goto L_0x062b
        L_0x0645:
            if (r6 == 0) goto L_0x064e
            r1.I(r15)
            r1.G(r3)
            goto L_0x064f
        L_0x064e:
            r6 = 0
        L_0x064f:
            if (r11 != 0) goto L_0x0653
            if (r6 == 0) goto L_0x0682
        L_0x0653:
            r6 = 2
            if (r9 != r6) goto L_0x0669
            int r2 = r1.n()
            if (r0 >= r2) goto L_0x0665
            if (r0 <= 0) goto L_0x0665
            r1.J(r0)
            r15 = 1
            r1.D0 = r15
            goto L_0x0669
        L_0x0665:
            int r0 = r1.n()
        L_0x0669:
            r6 = 2
            if (r8 != r6) goto L_0x067f
            int r2 = r1.k()
            if (r5 >= r2) goto L_0x067b
            if (r5 <= 0) goto L_0x067b
            r1.G(r5)
            r15 = 1
            r1.E0 = r15
            goto L_0x067f
        L_0x067b:
            int r5 = r1.k()
        L_0x067f:
            r2 = r0
            r0 = 1
            goto L_0x0684
        L_0x0682:
            r2 = r0
            r0 = 0
        L_0x0684:
            r3 = 64
            boolean r6 = r1.R(r3)
            if (r6 != 0) goto L_0x0697
            r6 = 128(0x80, float:1.8E-43)
            boolean r6 = r1.R(r6)
            if (r6 == 0) goto L_0x0695
            goto L_0x0697
        L_0x0695:
            r6 = 0
            goto L_0x0698
        L_0x0697:
            r6 = 1
        L_0x0698:
            r7.getClass()
            r15 = 0
            r7.g = r15
            int r10 = r1.C0
            if (r10 == 0) goto L_0x06a8
            if (r6 == 0) goto L_0x06a8
            r10 = 1
            r7.g = r10
            goto L_0x06a9
        L_0x06a8:
            r10 = 1
        L_0x06a9:
            java.util.ArrayList r6 = r1.p0
            r11 = r21[r15]
            r13 = 2
            if (r11 == r13) goto L_0x06b7
            r11 = r21[r10]
            if (r11 != r13) goto L_0x06b5
            goto L_0x06b7
        L_0x06b5:
            r10 = r15
            goto L_0x06b8
        L_0x06b7:
            r10 = 1
        L_0x06b8:
            r1.y0 = r15
            r1.z0 = r15
            r11 = 0
        L_0x06bd:
            if (r11 >= r4) goto L_0x06d3
            java.util.ArrayList r13 = r1.p0
            java.lang.Object r13 = r13.get(r11)
            g31 r13 = (defpackage.g31) r13
            boolean r14 = r13 instanceof defpackage.h31
            if (r14 == 0) goto L_0x06d0
            h31 r13 = (defpackage.h31) r13
            r13.P()
        L_0x06d0:
            int r11 = r11 + 1
            goto L_0x06bd
        L_0x06d3:
            boolean r11 = r1.R(r3)
            r13 = r0
            r0 = 0
            r14 = 1
        L_0x06da:
            if (r14 == 0) goto L_0x090e
            r17 = 1
            int r15 = r0 + 1
            r7.t()     // Catch:{ Exception -> 0x06fc }
            r3 = 0
            r1.y0 = r3     // Catch:{ Exception -> 0x06fc }
            r1.z0 = r3     // Catch:{ Exception -> 0x06fc }
            r1.g(r7)     // Catch:{ Exception -> 0x06fc }
            r0 = 0
        L_0x06ec:
            if (r0 >= r4) goto L_0x0703
            java.util.ArrayList r3 = r1.p0     // Catch:{ Exception -> 0x06fc }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x06fc }
            g31 r3 = (defpackage.g31) r3     // Catch:{ Exception -> 0x06fc }
            r3.g(r7)     // Catch:{ Exception -> 0x06fc }
            int r0 = r0 + 1
            goto L_0x06ec
        L_0x06fc:
            r0 = move-exception
            r23 = r10
            r3 = 0
            r10 = 5
            goto L_0x07bd
        L_0x0703:
            r1.N(r7)     // Catch:{ Exception -> 0x06fc }
            java.lang.ref.WeakReference r0 = r1.F0     // Catch:{ Exception -> 0x0731 }
            if (r0 == 0) goto L_0x0735
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0731 }
            if (r0 == 0) goto L_0x0735
            java.lang.ref.WeakReference r0 = r1.F0     // Catch:{ Exception -> 0x0731 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0731 }
            h21 r0 = (defpackage.h21) r0     // Catch:{ Exception -> 0x0731 }
            ly6 r3 = r7.k(r12)     // Catch:{ Exception -> 0x0731 }
            ly6 r0 = r7.k(r0)     // Catch:{ Exception -> 0x0731 }
            r23 = r10
            r10 = 0
            r14 = 5
            r7.f(r0, r3, r10, r14)     // Catch:{ Exception -> 0x072b }
            r10 = 0
            r1.F0 = r10     // Catch:{ Exception -> 0x072b }
            goto L_0x0737
        L_0x072b:
            r0 = move-exception
        L_0x072c:
            r3 = 0
            r10 = 5
        L_0x072e:
            r14 = 1
            goto L_0x07bd
        L_0x0731:
            r0 = move-exception
            r23 = r10
            goto L_0x072c
        L_0x0735:
            r23 = r10
        L_0x0737:
            java.lang.ref.WeakReference r0 = r1.H0     // Catch:{ Exception -> 0x072b }
            if (r0 == 0) goto L_0x075b
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x072b }
            if (r0 == 0) goto L_0x075b
            java.lang.ref.WeakReference r0 = r1.H0     // Catch:{ Exception -> 0x072b }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x072b }
            h21 r0 = (defpackage.h21) r0     // Catch:{ Exception -> 0x072b }
            h21 r3 = r1.K     // Catch:{ Exception -> 0x072b }
            ly6 r3 = r7.k(r3)     // Catch:{ Exception -> 0x072b }
            ly6 r0 = r7.k(r0)     // Catch:{ Exception -> 0x072b }
            r10 = 0
            r14 = 5
            r7.f(r3, r0, r10, r14)     // Catch:{ Exception -> 0x072b }
            r10 = 0
            r1.H0 = r10     // Catch:{ Exception -> 0x072b }
        L_0x075b:
            java.lang.ref.WeakReference r0 = r1.G0     // Catch:{ Exception -> 0x072b }
            if (r0 == 0) goto L_0x0786
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x072b }
            if (r0 == 0) goto L_0x0786
            java.lang.ref.WeakReference r0 = r1.G0     // Catch:{ Exception -> 0x072b }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x072b }
            h21 r0 = (defpackage.h21) r0     // Catch:{ Exception -> 0x072b }
            r3 = r25
            ly6 r10 = r7.k(r3)     // Catch:{ Exception -> 0x0782 }
            ly6 r0 = r7.k(r0)     // Catch:{ Exception -> 0x0782 }
            r25 = r3
            r3 = 0
            r14 = 5
            r7.f(r0, r10, r3, r14)     // Catch:{ Exception -> 0x072b }
            r10 = 0
            r1.G0 = r10     // Catch:{ Exception -> 0x072b }
            goto L_0x0786
        L_0x0782:
            r0 = move-exception
            r25 = r3
            goto L_0x072c
        L_0x0786:
            java.lang.ref.WeakReference r0 = r1.I0     // Catch:{ Exception -> 0x072b }
            if (r0 == 0) goto L_0x07b4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x072b }
            if (r0 == 0) goto L_0x07b4
            java.lang.ref.WeakReference r0 = r1.I0     // Catch:{ Exception -> 0x072b }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x072b }
            h21 r0 = (defpackage.h21) r0     // Catch:{ Exception -> 0x072b }
            h21 r3 = r1.J     // Catch:{ Exception -> 0x072b }
            ly6 r3 = r7.k(r3)     // Catch:{ Exception -> 0x072b }
            ly6 r0 = r7.k(r0)     // Catch:{ Exception -> 0x07b1 }
            r10 = 5
            r14 = 0
            r7.f(r3, r0, r14, r10)     // Catch:{ Exception -> 0x07ad }
            r3 = 0
            r1.I0 = r3     // Catch:{ Exception -> 0x07ab }
            goto L_0x07b6
        L_0x07ab:
            r0 = move-exception
            goto L_0x072e
        L_0x07ad:
            r0 = move-exception
        L_0x07ae:
            r3 = 0
            goto L_0x072e
        L_0x07b1:
            r0 = move-exception
            r10 = 5
            goto L_0x07ae
        L_0x07b4:
            r3 = 0
            r10 = 5
        L_0x07b6:
            r7.p()     // Catch:{ Exception -> 0x07ab }
            r24 = r12
            r14 = 1
            goto L_0x07d5
        L_0x07bd:
            r0.printStackTrace()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r24 = r12
            java.lang.String r12 = "EXCEPTION : "
            r10.<init>(r12)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r3.println(r0)
        L_0x07d5:
            if (r14 == 0) goto L_0x0814
            r16 = 0
            r19 = 2
            r18[r19] = r16
            r3 = 64
            boolean r0 = r1.R(r3)
            r1.L(r7, r0)
            java.util.ArrayList r10 = r1.p0
            int r10 = r10.size()
            r12 = 0
            r14 = 0
        L_0x07ee:
            if (r12 >= r10) goto L_0x0812
            java.util.ArrayList r3 = r1.p0
            java.lang.Object r3 = r3.get(r12)
            g31 r3 = (defpackage.g31) r3
            r3.L(r7, r0)
            r26 = r0
            int r0 = r3.h
            r27 = r10
            r10 = -1
            if (r0 != r10) goto L_0x0808
            int r0 = r3.i
            if (r0 == r10) goto L_0x0809
        L_0x0808:
            r14 = 1
        L_0x0809:
            int r12 = r12 + 1
            r0 = r26
            r10 = r27
            r3 = 64
            goto L_0x07ee
        L_0x0812:
            r10 = -1
            goto L_0x082a
        L_0x0814:
            r10 = -1
            r1.L(r7, r11)
            r0 = 0
        L_0x0819:
            if (r0 >= r4) goto L_0x0829
            java.util.ArrayList r3 = r1.p0
            java.lang.Object r3 = r3.get(r0)
            g31 r3 = (defpackage.g31) r3
            r3.L(r7, r11)
            int r0 = r0 + 1
            goto L_0x0819
        L_0x0829:
            r14 = 0
        L_0x082a:
            r0 = 8
            if (r23 == 0) goto L_0x0890
            if (r15 >= r0) goto L_0x0890
            r19 = 2
            boolean r3 = r18[r19]
            if (r3 == 0) goto L_0x0890
            r3 = 0
            r10 = 0
            r12 = 0
        L_0x0839:
            if (r3 >= r4) goto L_0x0861
            java.util.ArrayList r0 = r1.p0
            java.lang.Object r0 = r0.get(r3)
            g31 r0 = (defpackage.g31) r0
            r27 = r3
            int r3 = r0.X
            int r28 = r0.n()
            int r3 = r28 + r3
            int r12 = java.lang.Math.max(r12, r3)
            int r3 = r0.Y
            int r0 = r0.k()
            int r0 = r0 + r3
            int r10 = java.lang.Math.max(r10, r0)
            int r3 = r27 + 1
            r0 = 8
            goto L_0x0839
        L_0x0861:
            int r0 = r1.a0
            int r0 = java.lang.Math.max(r0, r12)
            int r3 = r1.b0
            int r3 = java.lang.Math.max(r3, r10)
            r10 = 2
            if (r9 != r10) goto L_0x087f
            int r12 = r1.n()
            if (r12 >= r0) goto L_0x087f
            r1.J(r0)
            r16 = 0
            r21[r16] = r10
            r13 = 1
            r14 = 1
        L_0x087f:
            if (r8 != r10) goto L_0x0890
            int r0 = r1.k()
            if (r0 >= r3) goto L_0x0890
            r1.G(r3)
            r17 = 1
            r21[r17] = r10
            r13 = 1
            r14 = 1
        L_0x0890:
            int r0 = r1.a0
            int r3 = r1.n()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r1.n()
            if (r0 <= r3) goto L_0x08ac
            r1.J(r0)
            r10 = 1
            r16 = 0
            r21[r16] = r10
            r14 = r10
            r17 = r14
            goto L_0x08af
        L_0x08ac:
            r10 = 1
            r17 = r13
        L_0x08af:
            int r0 = r1.b0
            int r3 = r1.k()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r1.k()
            if (r0 <= r3) goto L_0x08c7
            r1.G(r0)
            r21[r10] = r10
            r0 = r10
            r14 = r0
            goto L_0x08c9
        L_0x08c7:
            r0 = r17
        L_0x08c9:
            if (r0 != 0) goto L_0x0900
            r16 = 0
            r3 = r21[r16]
            r13 = 2
            if (r3 != r13) goto L_0x08e3
            if (r2 <= 0) goto L_0x08e3
            int r3 = r1.n()
            if (r3 <= r2) goto L_0x08e3
            r1.D0 = r10
            r21[r16] = r10
            r1.J(r2)
            r0 = r10
            r14 = r0
        L_0x08e3:
            r3 = r21[r10]
            r12 = 2
            if (r3 != r12) goto L_0x08fc
            if (r5 <= 0) goto L_0x08fc
            int r3 = r1.k()
            if (r3 <= r5) goto L_0x08fc
            r1.E0 = r10
            r21[r10] = r10
            r1.G(r5)
            r0 = 8
            r13 = 1
            r14 = 1
            goto L_0x0902
        L_0x08fc:
            r13 = r0
            r0 = 8
            goto L_0x0902
        L_0x0900:
            r12 = 2
            goto L_0x08fc
        L_0x0902:
            if (r15 <= r0) goto L_0x0905
            r14 = 0
        L_0x0905:
            r0 = r15
            r10 = r23
            r12 = r24
            r3 = 64
            goto L_0x06da
        L_0x090e:
            r1.p0 = r6
            if (r13 == 0) goto L_0x091a
            r16 = 0
            r21[r16] = r9
            r17 = 1
            r21[r17] = r8
        L_0x091a:
            wr0 r0 = r7.l
            r1.C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h31.P():void");
    }

    public final boolean R(int i) {
        if ((this.C0 & i) == i) {
            return true;
        }
        return false;
    }

    public final void z() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.z();
    }
}
