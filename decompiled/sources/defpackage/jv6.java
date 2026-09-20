package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: jv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jv6 {
    public final gv6 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public yo4 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final xe3 p = new xe3();
    public final xe3 q = new xe3();
    public final xe3 r = new xe3();
    public yo4 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public xo4 x;

    public jv6(gv6 gv6) {
        this.a = gv6;
        int[] iArr = gv6.w;
        this.b = iArr;
        Object[] objArr = gv6.y;
        this.c = objArr;
        this.d = gv6.E;
        this.e = gv6.F;
        this.f = gv6.G;
        int i2 = gv6.x;
        this.g = i2;
        this.h = (iArr.length / 5) - i2;
        int i3 = gv6.z;
        this.k = i3;
        this.l = objArr.length - i3;
        this.m = i2;
        this.u = i2;
        this.v = -1;
    }

    public static int i(int i2, int i3, int i4, int i5) {
        if (i2 > i3) {
            return -(((i5 - i4) - i2) + 1);
        }
        return i2;
    }

    public static void z(jv6 jv6) {
        int i2 = jv6.v;
        int r2 = jv6.r(i2);
        int[] iArr = jv6.b;
        int i3 = (r2 * 5) + 1;
        int i4 = iArr[i3];
        if ((i4 & 134217728) == 0) {
            int i5 = (i4 & -134217729) | 134217728;
            iArr[i3] = i5;
            if ((67108864 & i5) == 0) {
                jv6.W(jv6.G(iArr, i2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r1 = r0.w;
     */
    public final void A(gv6 gv6, int i2) {
        int[] iArr;
        int i3;
        gv6 gv62 = gv6;
        if (this.n <= 0) {
            ey0.a("Check failed");
        }
        boolean z = false;
        if (i2 == 0 && this.t == 0 && this.a.x == 0 && iArr[(i2 * 5) + 3] == (i3 = gv62.x)) {
            int[] iArr2 = this.b;
            Object[] objArr = this.c;
            ArrayList arrayList = this.d;
            HashMap hashMap = this.e;
            yo4 yo4 = this.f;
            Object[] objArr2 = gv62.y;
            int i4 = gv62.z;
            HashMap hashMap2 = gv62.F;
            yo4 yo42 = gv62.G;
            this.b = iArr;
            this.c = objArr2;
            this.d = gv62.E;
            this.g = i3;
            this.h = (iArr.length / 5) - i3;
            this.k = i4;
            this.l = objArr2.length - i4;
            this.m = i3;
            this.e = hashMap2;
            this.f = yo42;
            gv62.w = iArr2;
            gv62.x = z ? 1 : 0;
            gv62.y = objArr;
            gv62.z = z;
            gv62.E = arrayList;
            gv62.F = hashMap;
            gv62.G = yo4;
            return;
        }
        jv6 o2 = gv62.o();
        try {
            jb5.B(o2, i2, this, true, true, false);
            z = true;
        } finally {
            o2.e(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r4 = (defpackage.st2) r8.d.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        r4 = (defpackage.st2) r8.d.get(r2);
     */
    public final void B(int i2) {
        int i3;
        int i4;
        st2 st2;
        int i5;
        st2 st22;
        int i6;
        int i7 = this.h;
        int i8 = this.g;
        if (i8 != i2) {
            if (!this.d.isEmpty()) {
                int o2 = o() - this.h;
                ArrayList arrayList = this.d;
                if (i8 < i2) {
                    int a2 = iv6.a(arrayList, i8, o2);
                    while (a2 < this.d.size() && (r5 = st22.a) < 0 && (i6 = r5 + o2) < i2) {
                        st22.a = i6;
                        a2++;
                    }
                } else {
                    int a3 = iv6.a(arrayList, i2, o2);
                    while (a3 < this.d.size() && (i5 = st2.a) >= 0) {
                        st2.a = -(o2 - i5);
                        a3++;
                    }
                }
            }
            if (i7 > 0) {
                int[] iArr = this.b;
                int i9 = i2 * 5;
                int i10 = i7 * 5;
                int i11 = i8 * 5;
                if (i2 < i8) {
                    qs.J0(i10 + i9, i9, i11, iArr, iArr);
                } else {
                    qs.J0(i11, i11 + i10, i9 + i10, iArr, iArr);
                }
            }
            if (i2 < i8) {
                i8 = i2 + i7;
            }
            int o3 = o();
            if (i3 >= o3) {
                ey0.a("Check failed");
            }
            while (i3 < o3) {
                int i12 = (i3 * 5) + 2;
                int i13 = this.b[i12];
                if (i13 > -2) {
                    i4 = i13;
                } else {
                    i4 = (p() + i13) - -2;
                }
                if (i4 >= i2) {
                    i4 = -((p() - i4) - -2);
                }
                if (i4 != i13) {
                    this.b[i12] = i4;
                }
                i3++;
                if (i3 == i2) {
                    i3 += i7;
                }
            }
        }
        this.g = i2;
    }

    public final void C(int i2, int i3) {
        int i4 = this.l;
        int i5 = this.k;
        int i6 = this.m;
        if (i5 != i2) {
            Object[] objArr = this.c;
            if (i2 < i5) {
                System.arraycopy(objArr, i2, objArr, i2 + i4, i5 - i2);
            } else {
                int i7 = i5 + i4;
                System.arraycopy(objArr, i7, objArr, i5, (i2 + i4) - i7);
            }
        }
        int min = Math.min(i3 + 1, p());
        if (i6 != min) {
            int length = this.c.length - i4;
            if (min < i6) {
                int r2 = r(min);
                int r3 = r(i6);
                int i8 = this.g;
                while (r2 < r3) {
                    int i9 = (r2 * 5) + 4;
                    int i10 = this.b[i9];
                    if (i10 < 0) {
                        ey0.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i9] = -((length - i10) + 1);
                    r2++;
                    if (r2 == i8) {
                        r2 += this.h;
                    }
                }
            } else {
                int r4 = r(i6);
                int r5 = r(min);
                while (r4 < r5) {
                    int i11 = (r4 * 5) + 4;
                    int i12 = this.b[i11];
                    if (i12 >= 0) {
                        ey0.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i11] = i12 + length + 1;
                    r4++;
                    if (r4 == this.g) {
                        r4 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i2;
    }

    public final List D(st2 st2, jv6 jv6) {
        int i2;
        if (jv6.n <= 0) {
            ey0.a("Check failed");
        }
        if (this.n != 0) {
            ey0.a("Check failed");
        }
        if (!st2.a()) {
            ey0.a("Check failed");
        }
        boolean z = true;
        int c2 = c(st2) + 1;
        int i3 = this.t;
        if (i3 > c2 || c2 >= this.u) {
            ey0.a("Check failed");
        }
        int G = G(this.b, c2);
        int u2 = u(c2);
        if (y(c2)) {
            i2 = 1;
        } else {
            i2 = F(c2);
        }
        List B = jb5.B(this, c2, jv6, false, false, true);
        W(G);
        if (i2 <= 0) {
            z = false;
        }
        while (G >= i3) {
            int r2 = r(G);
            int[] iArr = this.b;
            int i4 = r2 * 5;
            int i5 = i4 + 3;
            iArr[i5] = iArr[i5] - u2;
            if (z) {
                int i6 = iArr[i4 + 1];
                if ((1073741824 & i6) != 0) {
                    z = false;
                } else {
                    iv6.c(r2, (i6 & 67108863) - i2, iArr);
                }
            }
            G = G(this.b, G);
        }
        if (z) {
            if (this.o < i2) {
                ey0.a("Check failed");
            }
            this.o -= i2;
        }
        return B;
    }

    public final Object E(int i2) {
        int r2 = r(i2);
        int[] iArr = this.b;
        if ((iArr[(r2 * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, r2))];
        }
        return null;
    }

    public final int F(int i2) {
        return this.b[(r(i2) * 5) + 1] & 67108863;
    }

    public final int G(int[] iArr, int i2) {
        int i3 = iArr[(r(i2) * 5) + 2];
        if (i3 > -2) {
            return i3;
        }
        return (p() + i3) - -2;
    }

    public final Object H(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i2 = this.i;
        this.i = i2 + 1;
        Object obj2 = objArr[h(i2)];
        if (this.i > this.j) {
            ey0.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i2;
        int i3;
        xo4 xo4 = this.x;
        if (xo4 != null) {
            while (xo4.b != 0) {
                int o2 = n85.o(xo4);
                int r2 = r(o2);
                int i4 = o2 + 1;
                int u2 = u(o2) + o2;
                while (true) {
                    i2 = 0;
                    if (i4 >= u2) {
                        i3 = 0;
                        break;
                    } else if ((this.b[(r(i4) * 5) + 1] & 201326592) != 0) {
                        i3 = 1;
                        break;
                    } else {
                        i4 += u(i4);
                    }
                }
                int[] iArr = this.b;
                int i5 = (r2 * 5) + 1;
                int i6 = iArr[i5];
                if ((67108864 & i6) != 0) {
                    i2 = 1;
                }
                if (i2 != i3) {
                    iArr[i5] = (i3 << 26) | (-67108865 & i6);
                    int G = G(iArr, o2);
                    if (G >= 0) {
                        n85.c(xo4, G);
                    }
                }
            }
        }
    }

    public final boolean J() {
        if (this.n != 0) {
            ey0.a("Cannot remove group while inserting");
        }
        int i2 = this.t;
        int i3 = this.i;
        int g2 = g(this.b, r(i2));
        int N = N();
        Q(this.v);
        xo4 xo4 = this.x;
        if (xo4 != null) {
            while (true) {
                int i4 = xo4.b;
                if (i4 == 0) {
                    break;
                } else if (i4 != 0) {
                    if (xo4.a[0] < i2) {
                        break;
                    }
                    n85.o(xo4);
                } else {
                    kj6.i("IntList is empty.");
                    return false;
                }
            }
        }
        boolean K = K(i2, this.t - i2);
        L(g2, this.i - g2, i2 - 1);
        this.t = i2;
        this.i = i3;
        this.o -= N;
        return K;
    }

    public final boolean K(int i2, int i3) {
        boolean z = false;
        if (i3 > 0) {
            ArrayList arrayList = this.d;
            B(i2);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i4 = i2 + i3;
                int a2 = iv6.a(this.d, i4, o() - this.h);
                if (a2 >= this.d.size()) {
                    a2--;
                }
                int i5 = a2 + 1;
                int i6 = 0;
                while (a2 >= 0) {
                    st2 st2 = (st2) this.d.get(a2);
                    int c2 = c(st2);
                    if (c2 < i2) {
                        break;
                    }
                    if (c2 < i4) {
                        st2.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            au2 au2 = (au2) hashMap.remove(st2);
                        }
                        if (i6 == 0) {
                            i6 = a2 + 1;
                        }
                        i5 = a2;
                    }
                    a2--;
                }
                if (i5 < i6) {
                    z = true;
                }
                if (z) {
                    this.d.subList(i5, i6).clear();
                }
            }
            this.g = i2;
            this.h += i3;
            int i7 = this.m;
            if (i7 > i2) {
                this.m = Math.max(i2, i7 - i3);
            }
            int i8 = this.u;
            if (i8 >= this.g) {
                this.u = i8 - i3;
            }
            int i9 = this.v;
            if (i9 >= 0 && (this.b[(r(i9) * 5) + 1] & 67108864) != 0) {
                W(i9);
            }
        }
        return z;
    }

    public final void L(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.l;
            int i6 = i2 + i3;
            C(i6, i4);
            this.k = i2;
            this.l = i5 + i3;
            Arrays.fill(this.c, i2, i6, (Object) null);
            int i7 = this.j;
            if (i7 >= i2) {
                this.j = i7 - i3;
            }
        }
    }

    public final Object M(int i2, int i3, Object obj) {
        int P = P(this.b, r(i2));
        int g2 = g(this.b, r(i2 + 1));
        int i4 = P + i3;
        if (i4 < P || i4 >= g2) {
            ey0.a("Write to an invalid slot index " + i3 + " for group " + i2);
        }
        int h2 = h(i4);
        Object[] objArr = this.c;
        Object obj2 = objArr[h2];
        objArr[h2] = obj;
        return obj2;
    }

    public final int N() {
        int r2 = r(this.t);
        int i2 = this.t;
        int[] iArr = this.b;
        int i3 = r2 * 5;
        int i4 = iArr[i3 + 3] + i2;
        this.t = i4;
        this.i = g(iArr, r(i4));
        int i5 = this.b[i3 + 1];
        if ((1073741824 & i5) != 0) {
            return 1;
        }
        return i5 & 67108863;
    }

    public final void O() {
        int i2 = this.u;
        this.t = i2;
        this.i = g(this.b, r(i2));
    }

    public final int P(int[] iArr, int i2) {
        if (i2 >= o()) {
            return this.c.length - this.l;
        }
        int b2 = iv6.b(iArr, i2);
        int i3 = this.l;
        int length = this.c.length;
        if (b2 < 0) {
            return (length - i3) + b2 + 1;
        }
        return b2;
    }

    public final au2 Q(int i2) {
        st2 T;
        HashMap hashMap = this.e;
        if (hashMap == null || (T = T(i2)) == null) {
            return null;
        }
        return (au2) hashMap.get(T);
    }

    public final void R() {
        if (this.n != 0) {
            ey0.a("Key must be supplied when inserting");
        }
        d63 d63 = ay0.a;
        S(d63, false, d63, 0);
    }

    public final void S(Object obj, boolean z, Object obj2, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        int i5 = this.v;
        if (this.n > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.r.c(this.o);
        d63 d63 = ay0.a;
        if (z2) {
            int i6 = this.t;
            int g2 = g(this.b, r(i6));
            w(1);
            this.i = g2;
            this.j = g2;
            int r2 = r(i6);
            if (obj != d63) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z || obj2 == d63) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            int i7 = i(g2, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i6) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = r2 * 5;
            iArr[i9] = i2;
            iArr[i9 + 1] = ((z ? 1 : 0) << true) | ((z3 ? 1 : 0) << true) | (i4 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = z + z3 + i4;
            if (i10 > 0) {
                x(i10, i6);
                Object[] objArr = this.c;
                int i11 = this.i;
                if (z) {
                    objArr[i11] = obj2;
                    i11++;
                }
                if (z3) {
                    objArr[i11] = obj;
                    i11++;
                }
                if (i4 != 0) {
                    objArr[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i3 = i6 + 1;
            this.v = i6;
            this.t = i3;
            if (i5 >= 0) {
                Q(i5);
            }
        } else {
            this.p.c(i5);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int r3 = r(i12);
            if (!sg3.e(obj2, d63)) {
                if (z) {
                    X(this.t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.i = P(this.b, r3);
            this.j = g(this.b, r(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = r3 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i3 = i12 + iArr2[i13 + 3];
        }
        this.u = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r2.d;
     */
    public final st2 T(int i2) {
        ArrayList arrayList;
        int e2;
        if (i2 < 0 || i2 >= p() || (e2 = iv6.e(arrayList, i2, p())) < 0) {
            return null;
        }
        return (st2) arrayList.get(e2);
    }

    public final void U(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            H(obj);
            return;
        }
        yo4 yo4 = this.s;
        if (yo4 == null) {
            new yo4
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: CONSTRUCTOR  (r0v4 ? I:yo4) =  call: yo4.<init>():void type: CONSTRUCTOR in method: jv6.U(java.lang.Object):void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 38 more
                */
            /*
                this = this;
                int r0 = r2.n
                if (r0 <= 0) goto L_0x002b
                int r0 = r2.i
                int r1 = r2.k
                if (r0 == r1) goto L_0x002b
                yo4 r0 = r2.s
                if (r0 != 0) goto L_0x0013
                yo4 r0 = new yo4
                r0.<init>()
            L_0x0013:
                r2.s = r0
                int r2 = r2.v
                java.lang.Object r1 = r0.b(r2)
                if (r1 != 0) goto L_0x0025
                lp4 r1 = new lp4
                r1.<init>()
                r0.i(r2, r1)
            L_0x0025:
                lp4 r1 = (defpackage.lp4) r1
                r1.a(r3)
                return
            L_0x002b:
                r2.H(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jv6.U(java.lang.Object):void");
        }

        public final void V(Object obj) {
            int r2 = r(this.t);
            int i2 = (r2 * 5) + 1;
            if ((this.b[i2] & 268435456) == 0) {
                ey0.a("Updating the data of a group that was not created with a data slot");
            }
            Object[] objArr = this.c;
            int[] iArr = this.b;
            objArr[h(Integer.bitCount(iArr[i2] >> 29) + g(iArr, r2))] = obj;
        }

        public final void W(int i2) {
            if (i2 >= 0) {
                xo4 xo4 = this.x;
                if (xo4 == null) {
                    xo4 = new xo4();
                    this.x = xo4;
                }
                n85.c(xo4, i2);
            }
        }

        public final void X(int i2, Object obj) {
            int r2 = r(i2);
            int[] iArr = this.b;
            if (r2 >= iArr.length || (iArr[(r2 * 5) + 1] & 1073741824) == 0) {
                ey0.a("Updating the node of a group at " + i2 + " that was not created with as a node group");
            }
            this.c[h(g(this.b, r2))] = obj;
        }

        public final void a(int i2) {
            if (i2 < 0) {
                ey0.a("Cannot seek backwards");
            }
            if (this.n > 0) {
                vm5.b("Cannot call seek() while inserting");
            }
            if (i2 != 0) {
                int i3 = this.t + i2;
                int i4 = this.v;
                if (i3 < i4 || i3 > this.u) {
                    int i5 = this.u;
                    ey0.a("Cannot seek outside the current group (" + i4 + "-" + i5 + ")");
                }
                this.t = i3;
                int g2 = g(this.b, r(i3));
                this.i = g2;
                this.j = g2;
            }
        }

        public final st2 b(int i2) {
            ArrayList arrayList = this.d;
            int e2 = iv6.e(arrayList, i2, p());
            if (e2 >= 0) {
                return (st2) arrayList.get(e2);
            }
            if (i2 > this.g) {
                i2 = -(p() - i2);
            }
            st2 st2 = new st2(i2);
            arrayList.add(-(e2 + 1), st2);
            return st2;
        }

        public final int c(st2 st2) {
            int i2 = st2.a;
            if (i2 < 0) {
                return p() + i2;
            }
            return i2;
        }

        public final void d() {
            int i2 = this.n;
            this.n = i2 + 1;
            if (i2 == 0) {
                this.q.c((o() - this.h) - this.u);
            }
        }

        public final void e(boolean z) {
            this.w = true;
            if (z && this.p.b == 0) {
                B(p());
                C(this.c.length - this.l, this.g);
                int i2 = this.k;
                Arrays.fill(this.c, i2, this.l + i2, (Object) null);
                I();
            }
            int[] iArr = this.b;
            int i3 = this.g;
            Object[] objArr = this.c;
            int i4 = this.k;
            ArrayList arrayList = this.d;
            HashMap hashMap = this.e;
            yo4 yo4 = this.f;
            gv6 gv6 = this.a;
            if (!gv6.C) {
                vm5.a("Unexpected writer close()");
            }
            gv6.C = false;
            gv6.w = iArr;
            gv6.x = i3;
            gv6.y = objArr;
            gv6.z = i4;
            gv6.E = arrayList;
            gv6.F = hashMap;
            gv6.G = yo4;
        }

        public final int f(int i2) {
            return g(this.b, r(i2));
        }

        public final int g(int[] iArr, int i2) {
            if (i2 >= o()) {
                return this.c.length - this.l;
            }
            int i3 = iArr[(i2 * 5) + 4];
            int i4 = this.l;
            int length = this.c.length;
            if (i3 < 0) {
                return (length - i4) + i3 + 1;
            }
            return i3;
        }

        public final int h(int i2) {
            int i3;
            int i4 = this.l;
            if (i2 < this.k) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            return (i4 * i3) + i2;
        }

        public final void j() {
            boolean z;
            boolean z2;
            int i2;
            int i3;
            lp4 lp4;
            int i4 = 0;
            if (this.n > 0) {
                z = true;
            } else {
                z = false;
            }
            int i5 = this.t;
            int i6 = this.u;
            int i7 = this.v;
            int r2 = r(i7);
            int i8 = this.o;
            int i9 = i5 - i7;
            int i10 = r2 * 5;
            int i11 = i10 + 1;
            if ((this.b[i11] & 1073741824) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            xe3 xe3 = this.r;
            if (z) {
                yo4 yo4 = this.s;
                if (!(yo4 == null || (lp4 = (lp4) yo4.b(i7)) == null)) {
                    Object[] objArr = lp4.a;
                    int i12 = lp4.b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        H(objArr[i13]);
                    }
                    lp4 lp42 = (lp4) yo4.g(i7);
                }
                int[] iArr = this.b;
                iArr[i10 + 3] = i9;
                iv6.c(r2, i8, iArr);
                int b2 = xe3.b();
                if (z2) {
                    i8 = 1;
                }
                this.o = b2 + i8;
                int G = G(this.b, i7);
                this.v = G;
                if (G < 0) {
                    i3 = p();
                } else {
                    i3 = r(G + 1);
                }
                if (i3 >= 0) {
                    i4 = g(this.b, i3);
                }
                this.i = i4;
                this.j = i4;
                return;
            }
            if (i5 != i6) {
                ey0.a("Expected to be at the end of a group");
            }
            int[] iArr2 = this.b;
            int i14 = i10 + 3;
            int i15 = iArr2[i14];
            int i16 = iArr2[i11] & 67108863;
            iArr2[i14] = i9;
            iv6.c(r2, i8, iArr2);
            int b3 = this.p.b();
            this.u = (o() - this.h) - this.q.b();
            this.v = b3;
            int G2 = G(this.b, i7);
            int b4 = xe3.b();
            this.o = b4;
            if (G2 == b3) {
                if (!z2) {
                    i4 = i8 - i16;
                }
                this.o = b4 + i4;
                return;
            }
            int i17 = i9 - i15;
            if (z2) {
                i2 = 0;
            } else {
                i2 = i8 - i16;
            }
            if (!(i17 == 0 && i2 == 0)) {
                while (G2 != 0 && G2 != b3 && (i2 != 0 || i17 != 0)) {
                    int r3 = r(G2);
                    if (i17 != 0) {
                        int[] iArr3 = this.b;
                        int i18 = (r3 * 5) + 3;
                        iArr3[i18] = iArr3[i18] + i17;
                    }
                    if (i2 != 0) {
                        int[] iArr4 = this.b;
                        iv6.c(r3, (iArr4[(r3 * 5) + 1] & 67108863) + i2, iArr4);
                    }
                    int[] iArr5 = this.b;
                    if ((iArr5[(r3 * 5) + 1] & 1073741824) != 0) {
                        i2 = 0;
                    }
                    G2 = G(iArr5, G2);
                }
            }
            this.o += i2;
        }

        public final void k() {
            if (this.n <= 0) {
                vm5.b("Unbalanced begin/end insert");
            }
            int i2 = this.n - 1;
            this.n = i2;
            if (i2 == 0) {
                if (this.r.b != this.p.b) {
                    ey0.a("startGroup/endGroup mismatch while inserting");
                }
                this.u = (o() - this.h) - this.q.b();
            }
        }

        public final void l(int i2) {
            boolean z;
            boolean z2 = false;
            if (this.n <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ey0.a("Cannot call ensureStarted() while inserting");
            }
            int i3 = this.v;
            if (i3 != i2) {
                if (i2 >= i3 && i2 < this.u) {
                    z2 = true;
                }
                if (!z2) {
                    ey0.a("Started group at " + i2 + " must be a subgroup of the group at " + i3);
                }
                int i4 = this.t;
                int i5 = this.i;
                int i6 = this.j;
                this.t = i2;
                R();
                this.t = i4;
                this.i = i5;
                this.j = i6;
            }
        }

        public final void m(int i2, int i3, int i4) {
            if (i2 >= this.g) {
                i2 = -((p() - i2) + 2);
            }
            while (i4 < i3) {
                this.b[(r(i4) * 5) + 2] = i2;
                int i5 = this.b[(r(i4) * 5) + 3] + i4;
                m(i4, i5, i4 + 1);
                i4 = i5;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:66:0x012b, code lost:
            return;
         */
        public final void n(int i2, gs2 gs2) {
            int i3;
            int i4;
            int i5;
            int i6 = i2;
            gs2 gs22 = gs2;
            int G = G(this.b, i6);
            int p2 = p();
            int u2 = u(i2) + i6;
            int i7 = i6;
            zo4 zo4 = null;
            xo4 xo4 = null;
            loop0:
            while (i7 < u2) {
                int f2 = f(i7);
                int i8 = i7 + 1;
                int f3 = f(i8);
                while (f2 < f3) {
                    Object obj = this.c[h(f2)];
                    if (obj instanceof cu2) {
                        cu2 cu2 = (cu2) obj;
                        if (!(cu2 instanceof cu2)) {
                            cu2 = null;
                        }
                        if (cu2 != null) {
                            int i9 = cu2.b;
                            if (i9 >= 0) {
                                int u3 = u(i7) + i7;
                                int i10 = i8;
                                int i11 = 0;
                                while (i10 < u3 && i11 < i9) {
                                    int r2 = r(i10);
                                    int i12 = G;
                                    int[] iArr = this.b;
                                    int i13 = r2 * 5;
                                    i10 = iArr[i13 + 3] + i10;
                                    if (i10 < u3 && (iArr[i13 + 1] & 536870912) == 0) {
                                        i11++;
                                    }
                                    G = i12;
                                }
                                i5 = G;
                                if (zo4 == null) {
                                    int[] iArr2 = ve3.a;
                                    new zo4
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: CONSTRUCTOR  (r8v5 ? I:zo4) =  call: zo4.<init>():void type: CONSTRUCTOR in method: jv6.n(int, gs2):void, dex: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
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
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v5 ?
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	... 59 more
                                        */
                                    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012b, code lost:
                                        return;
                                     */
                                    /*
                                        this = this;
                                        r0 = r19
                                        r1 = r20
                                        r2 = r21
                                        int[] r3 = r0.b
                                        int r3 = r0.G(r3, r1)
                                        int r4 = r0.p()
                                        int r5 = r19.u(r20)
                                        int r5 = r5 + r1
                                        r7 = r1
                                        r8 = 0
                                        r9 = 0
                                    L_0x0018:
                                        if (r7 >= r5) goto L_0x0149
                                        int r10 = r0.f(r7)
                                        int r11 = r7 + 1
                                        int r12 = r0.f(r11)
                                    L_0x0024:
                                        if (r10 >= r12) goto L_0x00a2
                                        int r14 = r0.h(r10)
                                        java.lang.Object[] r15 = r0.c
                                        r14 = r15[r14]
                                        boolean r15 = r14 instanceof defpackage.cu2
                                        if (r15 == 0) goto L_0x008a
                                        r15 = r14
                                        cu2 r15 = (defpackage.cu2) r15
                                        boolean r6 = r15 instanceof defpackage.cu2
                                        if (r6 == 0) goto L_0x003a
                                        goto L_0x003b
                                    L_0x003a:
                                        r15 = 0
                                    L_0x003b:
                                        if (r15 == 0) goto L_0x008d
                                        int r6 = r15.b
                                        if (r6 < 0) goto L_0x008a
                                        int r14 = r0.u(r7)
                                        int r14 = r14 + r7
                                        r15 = r11
                                        r13 = 0
                                    L_0x0048:
                                        if (r15 >= r14) goto L_0x006e
                                        if (r13 >= r6) goto L_0x006e
                                        int r16 = r0.r(r15)
                                        r17 = r3
                                        int[] r3 = r0.b
                                        int r16 = r16 * 5
                                        int r18 = r16 + 3
                                        r18 = r3[r18]
                                        int r15 = r18 + r15
                                        if (r15 >= r14) goto L_0x006b
                                        int r16 = r16 + 1
                                        r3 = r3[r16]
                                        r16 = 536870912(0x20000000, float:1.0842022E-19)
                                        r3 = r3 & r16
                                        if (r3 == 0) goto L_0x0069
                                        goto L_0x006b
                                    L_0x0069:
                                        int r13 = r13 + 1
                                    L_0x006b:
                                        r3 = r17
                                        goto L_0x0048
                                    L_0x006e:
                                        r17 = r3
                                        if (r8 != 0) goto L_0x0079
                                        int[] r3 = defpackage.ve3.a
                                        zo4 r8 = new zo4
                                        r8.<init>()
                                    L_0x0079:
                                        if (r9 != 0) goto L_0x0080
                                        xo4 r9 = new xo4
                                        r9.<init>()
                                    L_0x0080:
                                        r8.a(r15)
                                        r9.a(r15)
                                        r9.a(r10)
                                        goto L_0x009d
                                    L_0x008a:
                                        r17 = r3
                                        goto L_0x0096
                                    L_0x008d:
                                        java.lang.String r0 = "Inconsistent composition"
                                        defpackage.ey0.b(r0)
                                        defpackage.ta1.e()
                                        return
                                    L_0x0096:
                                        java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                                        r2.H(r3, r14)
                                    L_0x009d:
                                        int r10 = r10 + 1
                                        r3 = r17
                                        goto L_0x0024
                                    L_0x00a2:
                                        r17 = r3
                                        if (r11 >= r4) goto L_0x00ad
                                        int[] r3 = r0.b
                                        int r3 = r0.G(r3, r11)
                                        goto L_0x00ae
                                    L_0x00ad:
                                        r3 = -1
                                    L_0x00ae:
                                        if (r3 == r7) goto L_0x0140
                                        r6 = r17
                                    L_0x00b2:
                                        if (r9 == 0) goto L_0x012c
                                        if (r8 == 0) goto L_0x012c
                                        boolean r10 = r8.f(r7)
                                        if (r10 == 0) goto L_0x012c
                                        int r10 = r9.b
                                        int r12 = r10 / 2
                                        r14 = 0
                                        r15 = 0
                                    L_0x00c2:
                                        if (r14 >= r12) goto L_0x0100
                                        int r13 = r14 * 2
                                        r17 = r4
                                        int r4 = r9.c(r13)
                                        if (r4 != r7) goto L_0x00e4
                                        int r13 = r13 + 1
                                        int r4 = r9.c(r13)
                                        java.lang.Object[] r13 = r0.c
                                        int r18 = r0.h(r4)
                                        r13 = r13[r18]
                                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                                        r2.H(r4, r13)
                                        goto L_0x00f9
                                    L_0x00e4:
                                        if (r13 == r15) goto L_0x00f7
                                        int r2 = r15 + 1
                                        r9.f(r15, r4)
                                        int r15 = r15 + 2
                                        int r13 = r13 + 1
                                        int r4 = r9.c(r13)
                                        r9.f(r2, r4)
                                        goto L_0x00f9
                                    L_0x00f7:
                                        int r15 = r15 + 2
                                    L_0x00f9:
                                        int r14 = r14 + 1
                                        r2 = r21
                                        r4 = r17
                                        goto L_0x00c2
                                    L_0x0100:
                                        r17 = r4
                                        if (r15 == r10) goto L_0x012e
                                        if (r15 < 0) goto L_0x0126
                                        int r2 = r9.b
                                        if (r15 > r2) goto L_0x0126
                                        if (r10 < 0) goto L_0x0126
                                        if (r10 > r2) goto L_0x0126
                                        if (r10 < r15) goto L_0x0120
                                        if (r10 == r15) goto L_0x012e
                                        if (r10 >= r2) goto L_0x0119
                                        int[] r4 = r9.a
                                        defpackage.qs.J0(r15, r10, r2, r4, r4)
                                    L_0x0119:
                                        int r2 = r9.b
                                        int r10 = r10 - r15
                                        int r2 = r2 - r10
                                        r9.b = r2
                                        goto L_0x012e
                                    L_0x0120:
                                        java.lang.String r0 = "The end index must be < start index"
                                        defpackage.h.q(r0)
                                        return
                                    L_0x0126:
                                        java.lang.String r0 = "Index must be between 0 and size"
                                        defpackage.h.l(r0)
                                        return
                                    L_0x012c:
                                        r17 = r4
                                    L_0x012e:
                                        if (r7 == r1) goto L_0x0142
                                        if (r6 == r3) goto L_0x0142
                                        int[] r2 = r0.b
                                        int r2 = r0.G(r2, r6)
                                        r7 = r6
                                        r4 = r17
                                        r6 = r2
                                        r2 = r21
                                        goto L_0x00b2
                                    L_0x0140:
                                        r17 = r4
                                    L_0x0142:
                                        r2 = r21
                                        r7 = r11
                                        r4 = r17
                                        goto L_0x0018
                                    L_0x0149:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.jv6.n(int, gs2):void");
                                }

                                public final int o() {
                                    return this.b.length / 5;
                                }

                                public final int p() {
                                    return o() - this.h;
                                }

                                public final Object q(int i2) {
                                    int r2 = r(i2);
                                    int[] iArr = this.b;
                                    int i3 = (r2 * 5) + 1;
                                    if ((iArr[i3] & 268435456) == 0) {
                                        return ay0.a;
                                    }
                                    return this.c[Integer.bitCount(iArr[i3] >> 29) + g(iArr, r2)];
                                }

                                public final int r(int i2) {
                                    int i3;
                                    int i4 = this.h;
                                    if (i2 < this.g) {
                                        i3 = 0;
                                    } else {
                                        i3 = 1;
                                    }
                                    return (i4 * i3) + i2;
                                }

                                public final int s(int i2) {
                                    return this.b[r(i2) * 5];
                                }

                                public final Object t(int i2) {
                                    int r2 = r(i2);
                                    int[] iArr = this.b;
                                    int i3 = r2 * 5;
                                    int i4 = iArr[i3 + 1];
                                    if ((536870912 & i4) == 0) {
                                        return null;
                                    }
                                    return this.c[Integer.bitCount(i4 >> 30) + iArr[i3 + 4]];
                                }

                                public final String toString() {
                                    int i2 = this.t;
                                    int i3 = this.u;
                                    int p2 = p();
                                    int i4 = this.g;
                                    StringBuilder p3 = pb4.p("SlotWriter(current = ", i2, " end=", i3, " size = ");
                                    p3.append(p2);
                                    p3.append(" gap=");
                                    p3.append(i4);
                                    p3.append("-");
                                    return hl6.n(p3, this.h + i4, ")");
                                }

                                public final int u(int i2) {
                                    return this.b[(r(i2) * 5) + 3];
                                }

                                public final boolean v(int i2, int i3) {
                                    int i4;
                                    int u2;
                                    if (i3 == this.v) {
                                        i4 = this.u;
                                    } else {
                                        xe3 xe3 = this.p;
                                        if (i3 > xe3.a(0)) {
                                            u2 = u(i3);
                                        } else {
                                            int[] iArr = xe3.a;
                                            int min = Math.min(iArr.length, xe3.b);
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= min) {
                                                    i5 = -1;
                                                    break;
                                                } else if (iArr[i5] == i3) {
                                                    break;
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            if (i5 < 0) {
                                                u2 = u(i3);
                                            } else {
                                                i4 = (o() - this.h) - this.q.a[i5];
                                            }
                                        }
                                        i4 = u2 + i3;
                                    }
                                    if (i2 <= i3 || i2 >= i4) {
                                        return false;
                                    }
                                    return true;
                                }

                                public final void w(int i2) {
                                    int i3;
                                    if (i2 > 0) {
                                        int i4 = this.t;
                                        B(i4);
                                        int i5 = this.g;
                                        int i6 = this.h;
                                        int[] iArr = this.b;
                                        int length = iArr.length / 5;
                                        int i7 = length - i6;
                                        int i8 = 0;
                                        if (i6 < i2) {
                                            int max = Math.max(Math.max(length * 2, i7 + i2), 32);
                                            int[] iArr2 = new int[(max * 5)];
                                            int i9 = max - i7;
                                            qs.J0(0, 0, i5 * 5, iArr, iArr2);
                                            qs.J0((i5 + i9) * 5, (i6 + i5) * 5, length * 5, iArr, iArr2);
                                            this.b = iArr2;
                                            i6 = i9;
                                        }
                                        int i10 = this.u;
                                        if (i10 >= i5) {
                                            this.u = i10 + i2;
                                        }
                                        int i11 = i5 + i2;
                                        this.g = i11;
                                        this.h = i6 - i2;
                                        if (i7 > 0) {
                                            i3 = f(i4 + i2);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (this.m >= i5) {
                                            i8 = this.k;
                                        }
                                        int i12 = i(i3, i8, this.l, this.c.length);
                                        for (int i13 = i5; i13 < i11; i13++) {
                                            this.b[(i13 * 5) + 4] = i12;
                                        }
                                        int i14 = this.m;
                                        if (i14 >= i5) {
                                            this.m = i14 + i2;
                                        }
                                    }
                                }

                                public final void x(int i2, int i3) {
                                    if (i2 > 0) {
                                        C(this.i, i3);
                                        int i4 = this.k;
                                        int i5 = this.l;
                                        if (i5 < i2) {
                                            Object[] objArr = this.c;
                                            int length = objArr.length;
                                            int i6 = length - i5;
                                            int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                                            Object[] objArr2 = new Object[max];
                                            for (int i7 = 0; i7 < max; i7++) {
                                                objArr2[i7] = null;
                                            }
                                            int i8 = max - i6;
                                            int i9 = i5 + i4;
                                            System.arraycopy(objArr, 0, objArr2, 0, i4);
                                            System.arraycopy(objArr, i9, objArr2, i4 + i8, length - i9);
                                            this.c = objArr2;
                                            i5 = i8;
                                        }
                                        int i10 = this.j;
                                        if (i10 >= i4) {
                                            this.j = i10 + i2;
                                        }
                                        this.k = i4 + i2;
                                        this.l = i5 - i2;
                                    }
                                }

                                public final boolean y(int i2) {
                                    if ((this.b[(r(i2) * 5) + 1] & 1073741824) != 0) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
