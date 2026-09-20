package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: g31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class g31 {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final h21 H;
    public final h21 I;
    public final h21 J;
    public final h21 K;
    public final h21 L;
    public final h21 M;
    public final h21 N;
    public final h21 O;
    public final h21[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public g31 S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a = false;
    public int a0;
    public um0 b;
    public int b0;
    public um0 c;
    public float c0;
    public n23 d = null;
    public float d0;
    public p48 e = null;
    public View e0;
    public final boolean[] f = {true, true};
    public int f0;
    public boolean g = true;
    public String g0;
    public int h = -1;
    public int h0;
    public int i = -1;
    public int i0;
    public boolean j;
    public final float[] j0;
    public boolean k;
    public final g31[] k0;
    public boolean l;
    public final g31[] l0;
    public boolean m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public int t;
    public int u;
    public float v;
    public int w;
    public int x;
    public float y;
    public int z;

    public g31() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = 0;
        this.u = 0;
        this.v = 1.0f;
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = -1;
        this.A = 1.0f;
        this.B = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        h21 h21 = new h21(this, 2);
        this.H = h21;
        h21 h212 = new h21(this, 3);
        this.I = h212;
        h21 h213 = new h21(this, 4);
        this.J = h213;
        h21 h214 = new h21(this, 5);
        this.K = h214;
        h21 h215 = new h21(this, 6);
        this.L = h215;
        h21 h216 = new h21(this, 8);
        this.M = h216;
        h21 h217 = new h21(this, 9);
        this.N = h217;
        h21 h218 = new h21(this, 7);
        this.O = h218;
        this.P = new h21[]{h21, h213, h212, h214, h215, h218};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new g31[]{null, null};
        this.l0 = new g31[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(h21);
        arrayList.add(h212);
        arrayList.add(h213);
        arrayList.add(h214);
        arrayList.add(h216);
        arrayList.add(h217);
        arrayList.add(h218);
        arrayList.add(h215);
    }

    public final void A() {
        g31 g31 = this.S;
        if (g31 != null && (g31 instanceof h31)) {
            ((h31) g31).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((h21) arrayList.get(i2)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h21 h21 = (h21) arrayList.get(i2);
            h21.c = false;
            h21.b = 0;
        }
    }

    public void C(wr0 wr0) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i2) {
        boolean z2;
        this.Z = i2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.D = z2;
    }

    public final void E(int i2, int i3) {
        if (!this.j) {
            this.H.l(i2);
            this.J.l(i3);
            this.X = i2;
            this.T = i3 - i2;
            this.j = true;
        }
    }

    public final void F(int i2, int i3) {
        if (!this.k) {
            this.I.l(i2);
            this.K.l(i3);
            this.Y = i2;
            this.U = i3 - i2;
            if (this.D) {
                this.L.l(i2 + this.Z);
            }
            this.k = true;
        }
    }

    public final void G(int i2) {
        this.U = i2;
        int i3 = this.b0;
        if (i2 < i3) {
            this.U = i3;
        }
    }

    public final void H(int i2) {
        this.o0[0] = i2;
    }

    public final void I(int i2) {
        this.o0[1] = i2;
    }

    public final void J(int i2) {
        this.T = i2;
        int i3 = this.a0;
        if (i2 < i3) {
            this.T = i3;
        }
    }

    public void K(boolean z2, boolean z3) {
        int i2;
        int i3;
        n23 n23 = this.d;
        boolean z4 = z2 & n23.g;
        p48 p48 = this.e;
        boolean z5 = z3 & p48.g;
        int i4 = n23.h.g;
        int i5 = p48.h.g;
        int i6 = n23.i.g;
        int i7 = p48.i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.X = i4;
        }
        if (z5) {
            this.Y = i5;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z4) {
            if (iArr[0] == 1 && i9 < (i3 = this.T)) {
                i9 = i3;
            }
            this.T = i9;
            int i11 = this.a0;
            if (i9 < i11) {
                this.T = i11;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i10 < (i2 = this.U)) {
                i10 = i2;
            }
            this.U = i10;
            int i12 = this.b0;
            if (i10 < i12) {
                this.U = i12;
            }
        }
    }

    public void L(x64 x64, boolean z2) {
        int i2;
        int i3;
        p48 p48;
        n23 n23;
        x64.getClass();
        int n2 = x64.n(this.H);
        int n3 = x64.n(this.I);
        int n4 = x64.n(this.J);
        int n5 = x64.n(this.K);
        if (z2 && (n23 = this.d) != null) {
            eq1 eq1 = n23.h;
            if (eq1.j) {
                eq1 eq12 = n23.i;
                if (eq12.j) {
                    n2 = eq1.g;
                    n4 = eq12.g;
                }
            }
        }
        if (z2 && (p48 = this.e) != null) {
            eq1 eq13 = p48.h;
            if (eq13.j) {
                eq1 eq14 = p48.i;
                if (eq14.j) {
                    n3 = eq13.g;
                    n5 = eq14.g;
                }
            }
        }
        int i4 = n5 - n3;
        if (n4 - n2 < 0 || i4 < 0 || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE) {
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5 = 0;
        }
        int i5 = n4 - n2;
        int i6 = n5 - n3;
        this.X = n2;
        this.Y = n3;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i7 = iArr[0];
        if (i7 == 1 && i5 < (i3 = this.T)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.U)) {
            i6 = i2;
        }
        this.T = i5;
        this.U = i6;
        int i8 = this.b0;
        if (i6 < i8) {
            this.U = i8;
        }
        int i9 = this.a0;
        if (i5 < i9) {
            this.T = i9;
        }
        int i10 = this.u;
        if (i10 > 0 && i7 == 3) {
            this.T = Math.min(this.T, i10);
        }
        int i11 = this.x;
        if (i11 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i11);
        }
        int i12 = this.T;
        if (i5 != i12) {
            this.h = i12;
        }
        int i13 = this.U;
        if (i6 != i13) {
            this.i = i13;
        }
    }

    public final void a(h31 h31, x64 x64, HashSet hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                rc9.y(h31, x64, this);
                hashSet.remove(this);
                b(x64, h31.R(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((h21) it.next()).d.a(h31, x64, hashSet, i2, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((h21) it2.next()).d.a(h31, x64, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((h21) it3.next()).d.a(h31, x64, hashSet, i2, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((h21) it4.next()).d.a(h31, x64, hashSet, i2, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((h21) it5.next()).d.a(h31, x64, hashSet, i2, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v17, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r17v0 */
    /* JADX WARNING: type inference failed for: r18v4 */
    /* JADX WARNING: type inference failed for: r18v7 */
    /* JADX WARNING: type inference failed for: r17v16 */
    /* JADX WARNING: type inference failed for: r18v18 */
    /* JADX WARNING: type inference failed for: r17v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r12 != 3) goto L_0x0046;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public void b(x64 x64, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        h21 h21;
        boolean[] zArr;
        h21 h212;
        boolean z8;
        boolean z9;
        boolean z10;
        h21 h213;
        int i3;
        boolean z11;
        boolean z12;
        ly6 ly6;
        h21 h214;
        boolean z13;
        int i4;
        int i5;
        int i6;
        h21 h215;
        int i7;
        boolean z14;
        boolean z15;
        boolean z16;
        h21 h216;
        h21 h217;
        ly6 ly62;
        ly6 ly63;
        ly6 ly64;
        ly6 ly65;
        ly6 ly66;
        int[] iArr;
        h21 h218;
        boolean[] zArr2;
        int i8;
        boolean z17;
        boolean z18;
        boolean z19;
        ? r18;
        boolean z20;
        int i9;
        int i10;
        ly6 ly67;
        ly6 ly68;
        ly6 ly69;
        ly6 ly610;
        ly6 ly611;
        boolean z21;
        int i11;
        ly6 ly612;
        p48 p48;
        eq1 eq1;
        g31 g31;
        boolean z22;
        ly6 ly613;
        ly6 ly614;
        n23 n23;
        eq1 eq12;
        int i12;
        h21 h219;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z23;
        boolean z24;
        n23 n232;
        p48 p482;
        boolean z25;
        g31 g312;
        g31 g313;
        boolean z26;
        x64 x642 = x64;
        h21 h2110 = this.H;
        ly6 k2 = x642.k(h2110);
        h21 h2111 = this.J;
        ly6 k3 = x642.k(h2111);
        h21 h2112 = this.I;
        ly6 k4 = x642.k(h2112);
        h21 h2113 = this.K;
        ly6 k5 = x642.k(h2113);
        h21 h2114 = this.L;
        ly6 k6 = x642.k(h2114);
        g31 g314 = this.S;
        if (g314 != null) {
            int[] iArr2 = g314.o0;
            z3 = 0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z26 = true;
            } else {
                z26 = false;
            }
            int i17 = this.p;
            if (i17 != 1) {
                if (i17 == 2) {
                    z4 = false;
                }
                z5 = z26;
            } else {
                z5 = false;
            }
            i2 = this.f0;
            boolean[] zArr3 = this.R;
            boolean z27 = z5;
            if (i2 != 8) {
                ArrayList arrayList = this.Q;
                int size = arrayList.size();
                z6 = z4;
                int i18 = z3;
                while (true) {
                    if (i18 < size) {
                        int i19 = size;
                        HashSet hashSet = ((h21) arrayList.get(i18)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i18++;
                        size = i19;
                    } else if (!zArr3[z3] && !zArr3[1]) {
                        return;
                    }
                }
            } else {
                z6 = z4;
            }
            z7 = this.j;
            if (z7 || this.k) {
                if (z7) {
                    x642.d(k2, this.X);
                    x642.d(k3, this.X + this.T);
                    if (z6 && (g313 = this.S) != null) {
                        h31 h31 = (h31) g313;
                        WeakReference weakReference = h31.G0;
                        if (weakReference == null || weakReference.get() == null || h2110.d() > ((h21) h31.G0.get()).d()) {
                            h31.G0 = new WeakReference(h2110);
                        }
                        WeakReference weakReference2 = h31.I0;
                        if (weakReference2 == null || weakReference2.get() == null || h2111.d() > ((h21) h31.I0.get()).d()) {
                            h31.I0 = new WeakReference(h2111);
                        }
                    }
                }
                if (this.k) {
                    x642.d(k4, this.Y);
                    x642.d(k5, this.Y + this.U);
                    HashSet hashSet2 = h2114.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        x642.d(k6, this.Y + this.Z);
                    }
                    if (z27 && (g312 = this.S) != null) {
                        h31 h312 = (h31) g312;
                        WeakReference weakReference3 = h312.F0;
                        if (weakReference3 == null || weakReference3.get() == null || h2112.d() > ((h21) h312.F0.get()).d()) {
                            h312.F0 = new WeakReference(h2112);
                        }
                        WeakReference weakReference4 = h312.H0;
                        if (weakReference4 == null || weakReference4.get() == null || h2113.d() > ((h21) h312.H0.get()).d()) {
                            h312.H0 = new WeakReference(h2113);
                        }
                    }
                }
                if (this.j && this.k) {
                    boolean z28 = z3;
                    this.j = z28;
                    this.k = z28;
                }
            }
            boolean[] zArr4 = this.f;
            if (!z2 || (n232 = this.d) == null || (p482 = this.e) == null) {
                h21 = h2114;
                zArr = zArr4;
            } else {
                h21 = h2114;
                eq1 eq13 = n232.h;
                zArr = zArr4;
                if (eq13.j && n232.i.j && p482.h.j && p482.i.j) {
                    x642.d(k2, eq13.g);
                    x642.d(k3, this.d.i.g);
                    x642.d(k4, this.e.h.g);
                    x642.d(k5, this.e.i.g);
                    x642.d(k6, this.e.k.g);
                    if (this.S != null) {
                        if (z6 && zArr[0] && !u()) {
                            x642.f(x642.k(this.S.J), k3, 0, 8);
                        }
                        if (z27 && zArr[1] && !v()) {
                            z25 = false;
                            x642.f(x642.k(this.S.K), k5, 0, 8);
                            this.j = z25;
                            this.k = z25;
                            return;
                        }
                    }
                    z25 = false;
                    this.j = z25;
                    this.k = z25;
                    return;
                }
            }
            if (this.S != null) {
                if (t(0)) {
                    ((h31) this.S).M(this, 0);
                    z23 = true;
                    i16 = 1;
                } else {
                    z23 = u();
                    i16 = 1;
                }
                if (t(i16)) {
                    ((h31) this.S).M(this, i16);
                    z24 = true;
                } else {
                    z24 = v();
                }
                if (z23 || !z6 || this.f0 == 8 || h2110.f != null || h2111.f != null) {
                    h212 = h2110;
                } else {
                    h212 = h2110;
                    x642.f(x642.k(this.S.J), k3, 0, 1);
                }
                if (!z24 && z27 && this.f0 != 8 && h2112.f == null && h2113.f == null && h21 == null) {
                    x642.f(x642.k(this.S.K), k5, 0, 1);
                }
                h213 = h2111;
                z10 = z27;
                z8 = z24;
                z9 = z23;
            } else {
                h212 = h2110;
                h213 = h2111;
                z10 = z27;
                z9 = false;
                z8 = false;
            }
            int i20 = this.T;
            int i21 = this.a0;
            if (i20 >= i21) {
                i21 = i20;
            }
            int i22 = this.U;
            h21 h2115 = h213;
            int i23 = this.b0;
            if (i22 < i23) {
                i3 = i23;
            } else {
                i3 = i22;
            }
            int[] iArr3 = this.o0;
            int i24 = iArr3[0];
            boolean z29 = z10;
            if (i24 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            h21 h2116 = h2112;
            int i25 = iArr3[1];
            if (i25 != 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i26 = this.W;
            this.z = i26;
            ly6 ly615 = k4;
            float f2 = this.V;
            this.A = f2;
            float f3 = f2;
            int i27 = this.q;
            int i28 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            int i29 = this.r;
            if (i28 > 0) {
                h214 = h2113;
                if (this.f0 != 8) {
                    if (i24 == 3 && i27 == 0) {
                        i14 = 3;
                    } else {
                        i14 = i27;
                    }
                    if (i25 == 3 && i29 == 0) {
                        ly6 = k5;
                        i15 = 3;
                    } else {
                        ly6 = k5;
                        i15 = i29;
                    }
                    if (i24 == 3 && i25 == 3 && i14 == 3 && i15 == 3) {
                        if (i26 == -1) {
                            if (z11 && !z12) {
                                this.z = 0;
                            } else if (!z11 && z12) {
                                this.z = 1;
                                if (i26 == -1) {
                                    this.A = 1.0f / f3;
                                }
                            }
                        }
                        if (this.z == 0 && (!h2116.h() || !h214.h())) {
                            this.z = 1;
                        } else if (this.z == 1 && (!h212.h() || !h2115.h())) {
                            this.z = 0;
                        }
                        if (this.z == -1 && (!h2116.h() || !h214.h() || !h212.h() || !h2115.h())) {
                            if (h2116.h() && h214.h()) {
                                this.z = 0;
                            } else if (h212.h() && h2115.h()) {
                                this.A = 1.0f / this.A;
                                this.z = 1;
                            }
                        }
                        if (this.z == -1) {
                            int i30 = this.t;
                            if (i30 > 0 && this.w == 0) {
                                this.z = 0;
                            } else if (i30 == 0 && this.w > 0) {
                                this.A = 1.0f / this.A;
                                this.z = 1;
                            }
                        }
                        i6 = i14;
                        h215 = h21;
                        i4 = i3;
                        z13 = true;
                    } else if (i24 == 3 && i14 == 3) {
                        this.z = 0;
                        i21 = (int) (f3 * ((float) i22));
                        if (i25 != 3) {
                            h215 = h21;
                            i4 = i3;
                            i6 = 4;
                            z13 = false;
                        }
                        i6 = i14;
                        h215 = h21;
                        i4 = i3;
                        z13 = true;
                    } else {
                        if (i25 == 3 && i15 == 3) {
                            this.z = 1;
                            if (i26 == -1) {
                                this.A = 1.0f / f3;
                            }
                            i4 = (int) (this.A * ((float) i20));
                            if (i24 != 3) {
                                i13 = i14;
                                h219 = h21;
                                i5 = 4;
                            } else {
                                i6 = i14;
                                h215 = h21;
                                z13 = true;
                            }
                        }
                        i6 = i14;
                        h215 = h21;
                        i4 = i3;
                        z13 = true;
                    }
                    i5 = i15;
                    int[] iArr4 = this.s;
                    iArr4[0] = i6;
                    iArr4[1] = i5;
                    if (!z13) {
                        int i31 = this.z;
                        i7 = -1;
                        if (i31 == 0 || i31 == -1) {
                            z14 = true;
                            if (z13 || !((i12 = this.z) == 1 || i12 == i7)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (iArr3[0] != 2 || !(this instanceof h31)) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if (z16) {
                                i21 = 0;
                            }
                            h21 h2117 = this.O;
                            boolean z30 = !h2117.h();
                            char c2 = 8;
                            boolean z31 = zArr3[0];
                            boolean z32 = zArr3[1];
                            int i32 = this.n;
                            int[] iArr5 = this.B;
                            ly6 ly616 = null;
                            if (i32 != 2 && !this.j) {
                                if (z2 && (n23 = this.d) != null) {
                                    eq12 = n23.h;
                                    if (!eq12.j || !n23.i.j) {
                                        c2 = 8;
                                    } else if (z2) {
                                        x642.d(k2, eq12.g);
                                        x642.d(k3, this.d.i.g);
                                        if (this.S != null && z6 && zArr[0] && !u()) {
                                            x642.f(x642.k(this.S.J), k3, 0, 8);
                                        }
                                    }
                                }
                                g31 g315 = this.S;
                                if (g315 != null) {
                                    ly613 = x642.k(g315.J);
                                } else {
                                    ly613 = null;
                                }
                                g31 g316 = this.S;
                                if (g316 != null) {
                                    ly614 = x642.k(g316.H);
                                } else {
                                    ly614 = null;
                                }
                                ly6 ly617 = k3;
                                boolean z33 = zArr[0];
                                ly6 ly618 = k2;
                                z19 = z6;
                                i8 = i6;
                                ly6 ly619 = ly613;
                                int i33 = iArr3[0];
                                ly6 ly620 = ly617;
                                z17 = z9;
                                int i34 = this.X;
                                char c3 = c2;
                                int i35 = this.a0;
                                h218 = h2117;
                                ly6 ly621 = ly614;
                                int i36 = iArr5[0];
                                float f4 = this.c0;
                                boolean z34 = true;
                                h21 h2118 = h215;
                                if (iArr3[1] != 3) {
                                    z34 = false;
                                }
                                int i37 = this.t;
                                int i38 = this.u;
                                int i39 = i37;
                                iArr = iArr5;
                                boolean z35 = z14;
                                ly66 = ly618;
                                z18 = z29;
                                ly64 = ly615;
                                ly65 = ly620;
                                h217 = h214;
                                ly63 = ly6;
                                h216 = h2118;
                                ly62 = k6;
                                float f5 = this.v;
                                zArr2 = zArr;
                                x642 = x64;
                                d(x642, true, z19, z18, z33, ly621, ly619, i33, z16, this.H, this.J, i34, i21, i35, i36, f4, z35, z34, z17, z8, z31, i8, i5, i39, i38, f5, z30);
                                if (z2 && (p48 = this.e) != null) {
                                    eq1 = p48.h;
                                    if (eq1.j && p48.i.j) {
                                        int i40 = eq1.g;
                                        ly69 = ly64;
                                        x642.d(ly69, i40);
                                        ly68 = ly63;
                                        x642.d(ly68, this.e.i.g);
                                        ly67 = ly62;
                                        x642.d(ly67, this.e.k.g);
                                        g31 = this.S;
                                        if (g31 != null || z8 || !z18) {
                                            i10 = false;
                                            i9 = 8;
                                            z22 = true;
                                        } else {
                                            z22 = true;
                                            if (zArr2[1]) {
                                                i10 = false;
                                                i9 = 8;
                                                x642.f(x642.k(g31.K), ly68, 0, 8);
                                            } else {
                                                i10 = false;
                                                i9 = 8;
                                            }
                                        }
                                        z20 = i10;
                                        r18 = z22;
                                        if (this.o == 2) {
                                            z20 = i10;
                                        }
                                        if (!z20 || this.k) {
                                            ly611 = ly69;
                                            ly610 = ly68;
                                        } else {
                                            if (iArr3[r18] != 2 || !(this instanceof h31)) {
                                                z21 = i10;
                                            } else {
                                                z21 = r18;
                                            }
                                            if (z21) {
                                                i11 = i10;
                                            } else {
                                                i11 = i4;
                                            }
                                            g31 g317 = this.S;
                                            if (g317 != null) {
                                                ly612 = x642.k(g317.K);
                                            } else {
                                                ly612 = null;
                                            }
                                            g31 g318 = this.S;
                                            if (g318 != null) {
                                                ly616 = x642.k(g318.I);
                                            }
                                            int i41 = this.Z;
                                            if (i41 > 0 || this.f0 == i9) {
                                                h21 h2119 = h216;
                                                if (h2119.f != null) {
                                                    x642.e(ly67, ly69, i41, i9);
                                                    x642.e(ly67, x642.k(h2119.f), h2119.e(), i9);
                                                    if (z18) {
                                                        x642.f(ly612, x642.k(h217), i10, 5);
                                                    }
                                                    z30 = i10;
                                                } else if (this.f0 == i9) {
                                                    x642.e(ly67, ly69, h2119.e(), i9);
                                                } else {
                                                    x642.e(ly67, ly69, i41, i9);
                                                }
                                            }
                                            boolean z36 = zArr2[r18];
                                            int i42 = i10;
                                            int i43 = iArr3[r18];
                                            int i44 = this.Y;
                                            int i45 = this.b0;
                                            int i46 = iArr[r18];
                                            float f6 = this.d0;
                                            boolean z37 = r18;
                                            boolean z38 = r18;
                                            if (iArr3[i42] != 3) {
                                                z38 = i42;
                                            }
                                            int i47 = this.w;
                                            int i48 = this.x;
                                            boolean z39 = z37;
                                            boolean z40 = z18;
                                            boolean z41 = z19;
                                            boolean z42 = z40;
                                            boolean z43 = z21;
                                            int i49 = i46;
                                            boolean z44 = z43;
                                            boolean z45 = z8;
                                            boolean z46 = z17;
                                            boolean z47 = z45;
                                            int i50 = i5;
                                            int i51 = i8;
                                            float f7 = this.y;
                                            ly610 = ly68;
                                            ly611 = ly69;
                                            ly6 ly622 = ly616;
                                            x642 = x64;
                                            d(x642, false, z42, z41, z36, ly622, ly612, i43, z44, this.I, this.K, i44, i11, i45, i49, f6, z15, z38, z47, z46, z32, i50, i51, i47, i48, f7, z30);
                                        }
                                        if (z13) {
                                            int i52 = this.z;
                                            float f8 = this.A;
                                            if (i52 == 1) {
                                                ns l2 = x642.l();
                                                l2.d.g(ly610, -1.0f);
                                                l2.d.g(ly611, 1.0f);
                                                l2.d.g(ly65, f8);
                                                l2.d.g(ly66, -f8);
                                                x642.c(l2);
                                            } else {
                                                ns l3 = x642.l();
                                                l3.d.g(ly65, -1.0f);
                                                l3.d.g(ly66, 1.0f);
                                                l3.d.g(ly610, f8);
                                                l3.d.g(ly611, -f8);
                                                x642.c(l3);
                                            }
                                        }
                                        if (h218.h()) {
                                            h21 h2120 = h218;
                                            g31 g319 = h2120.f.d;
                                            int e2 = h2120.e();
                                            ly6 k7 = x642.k(i(2));
                                            ly6 k8 = x642.k(i(3));
                                            ly6 k9 = x642.k(i(4));
                                            ly6 k10 = x642.k(i(5));
                                            ly6 k11 = x642.k(g319.i(2));
                                            ly6 k12 = x642.k(g319.i(3));
                                            ly6 k13 = x642.k(g319.i(4));
                                            ly6 k14 = x642.k(g319.i(5));
                                            ns l4 = x642.l();
                                            double radians = (double) ((float) Math.toRadians((double) (this.C + 90.0f)));
                                            double sin = Math.sin(radians);
                                            double d2 = (double) e2;
                                            l4.d.g(k12, 0.5f);
                                            l4.d.g(k14, 0.5f);
                                            l4.d.g(k8, -0.5f);
                                            l4.d.g(k10, -0.5f);
                                            l4.b = -((float) (sin * d2));
                                            x642.c(l4);
                                            ns l5 = x642.l();
                                            float cos = (float) (Math.cos(radians) * d2);
                                            l5.d.g(k11, 0.5f);
                                            l5.d.g(k13, 0.5f);
                                            l5.d.g(k7, -0.5f);
                                            l5.d.g(k9, -0.5f);
                                            l5.b = -cos;
                                            x642.c(l5);
                                        }
                                        this.j = false;
                                        this.k = false;
                                        return;
                                    }
                                }
                                ly69 = ly64;
                                ly68 = ly63;
                                ly67 = ly62;
                                i10 = false;
                                i9 = 8;
                                r18 = 1;
                                z20 = true;
                                if (this.o == 2) {
                                }
                                if (!z20 || this.k) {
                                }
                                if (z13) {
                                }
                                if (h218.h()) {
                                }
                                this.j = false;
                                this.k = false;
                                return;
                            }
                            h216 = h215;
                            ly66 = k2;
                            ly65 = k3;
                            h218 = h2117;
                            iArr = iArr5;
                            ly62 = k6;
                            z17 = z9;
                            z19 = z6;
                            z18 = z29;
                            ly64 = ly615;
                            h217 = h214;
                            ly63 = ly6;
                            i8 = i6;
                            zArr2 = zArr;
                            eq1 = p48.h;
                            int i402 = eq1.g;
                            ly69 = ly64;
                            x642.d(ly69, i402);
                            ly68 = ly63;
                            x642.d(ly68, this.e.i.g);
                            ly67 = ly62;
                            x642.d(ly67, this.e.k.g);
                            g31 = this.S;
                            if (g31 != null) {
                            }
                            i10 = false;
                            i9 = 8;
                            z22 = true;
                            z20 = i10;
                            r18 = z22;
                            if (this.o == 2) {
                            }
                            if (!z20 || this.k) {
                            }
                            if (z13) {
                            }
                            if (h218.h()) {
                            }
                            this.j = false;
                            this.k = false;
                            return;
                        }
                    } else {
                        i7 = -1;
                    }
                    z14 = false;
                    if (z13) {
                    }
                    z15 = false;
                    if (iArr3[0] != 2 || !(this instanceof h31)) {
                    }
                    if (z16) {
                    }
                    h21 h21172 = this.O;
                    boolean z302 = !h21172.h();
                    char c22 = 8;
                    boolean z312 = zArr3[0];
                    boolean z322 = zArr3[1];
                    int i322 = this.n;
                    int[] iArr52 = this.B;
                    ly6 ly6162 = null;
                    eq12 = n23.h;
                    if (!eq12.j || !n23.i.j) {
                    }
                }
                ly6 = k5;
                h219 = h21;
                i4 = i3;
                i13 = i27;
                i5 = i29;
            } else {
                h214 = h2113;
                ly6 = k5;
                h219 = h21;
                i4 = i3;
                i13 = i27;
                i5 = i29;
            }
            z13 = false;
            int[] iArr42 = this.s;
            iArr42[0] = i6;
            iArr42[1] = i5;
            if (!z13) {
            }
            z14 = false;
            if (z13) {
            }
            z15 = false;
            if (iArr3[0] != 2 || !(this instanceof h31)) {
            }
            if (z16) {
            }
            h21 h211722 = this.O;
            boolean z3022 = !h211722.h();
            char c222 = 8;
            boolean z3122 = zArr3[0];
            boolean z3222 = zArr3[1];
            int i3222 = this.n;
            int[] iArr522 = this.B;
            ly6 ly61622 = null;
            eq12 = n23.h;
            if (!eq12.j || !n23.i.j) {
            }
        } else {
            z3 = false;
        }
        z5 = z3;
        z4 = z5;
        z3 = z3;
        i2 = this.f0;
        boolean[] zArr32 = this.R;
        boolean z272 = z5;
        if (i2 != 8) {
        }
        z7 = this.j;
        if (z7) {
        }
        if (this.k) {
        }
        boolean z282 = z3;
        this.j = z282;
        this.k = z282;
    }

    public boolean c() {
        if (this.f0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x04eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:339:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void d(x64 x64, boolean z2, boolean z3, boolean z4, boolean z5, ly6 ly6, ly6 ly62, int i2, boolean z6, h21 h21, h21 h212, int i3, int i4, int i5, int i6, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i7, int i8, int i9, int i10, float f3, boolean z12) {
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        boolean z16;
        int i12;
        int i13;
        boolean z17;
        h21 h213;
        boolean z18;
        boolean z19;
        h21 h214;
        int i14;
        ly6 ly63;
        ly6 ly64;
        int i15;
        boolean z20;
        boolean z21;
        boolean z22;
        int i16;
        int i17;
        int i18;
        int i19;
        ly6 ly65;
        ly6 ly66;
        ly6 ly67;
        boolean z23;
        int i20;
        int i21;
        g31 g31;
        boolean z24;
        int i22;
        int i23;
        HashSet hashSet;
        h21 h215;
        boolean z25;
        int i24;
        int i25;
        x64 x642;
        ly6 ly68;
        ly6 ly69;
        ly6 ly610;
        ly6 ly611;
        int i26;
        int i27;
        int i28;
        boolean z26;
        boolean z27;
        ly6 ly612;
        x64 x643;
        ly6 ly613;
        ly6 ly614;
        ly6 ly615;
        int i29;
        int i30;
        int i31;
        int i32;
        ly6 ly616;
        ly6 ly617;
        ly6 ly618;
        ly6 ly619;
        int i33;
        int i34;
        boolean z28;
        boolean z29;
        boolean z30;
        int i35;
        boolean z31;
        boolean z32;
        int i36;
        int i37;
        ly6 ly620;
        ly6 ly621;
        x64 x644 = x64;
        h21 h216 = h21;
        h21 h217 = h212;
        int i38 = i5;
        int i39 = i6;
        int i40 = i9;
        int i41 = i10;
        float f4 = f3;
        ly6 k2 = x644.k(h216);
        ly6 k3 = x644.k(h217);
        ly6 k4 = x644.k(h216.f);
        ly6 k5 = x644.k(h217.f);
        boolean h2 = h216.h();
        boolean h3 = h217.h();
        boolean h4 = this.O.h();
        int i42 = h3 ? (h2 ? 1 : 0) + true : h2;
        if (h4) {
            i42++;
        }
        boolean z33 = h4;
        int i43 = i42;
        int i44 = z7 ? 3 : i7;
        int B2 = b81.B(i2);
        ly6 ly622 = k5;
        boolean z34 = (B2 == 0 || B2 == 1 || B2 != 2 || i44 == 4) ? false : true;
        int i45 = this.h;
        if (i45 == -1 || !z2) {
            i45 = i4;
            z13 = z34;
        } else {
            this.h = -1;
            z13 = false;
        }
        int i46 = this.i;
        if (i46 == -1 || z2) {
            z14 = z13;
        } else {
            this.i = -1;
            i45 = i46;
            z14 = false;
        }
        boolean z35 = z14;
        if (this.f0 == 8) {
            z15 = false;
            i11 = 0;
        } else {
            i11 = i45;
            z15 = z35;
        }
        if (z12) {
            if (!h2 && !h3 && !z33) {
                x644.d(k2, i3);
            } else if (h2 && !h3) {
                z16 = z15;
                i12 = 8;
                x644.e(k2, k4, h216.e(), 8);
            }
            z16 = z15;
            i12 = 8;
        } else {
            z16 = z15;
            i12 = 8;
        }
        if (!z16) {
            if (z6) {
                x644.e(k3, k2, 0, 3);
                if (i38 > 0) {
                    x644.f(k3, k2, i38, i12);
                }
                if (i39 < Integer.MAX_VALUE) {
                    x644.g(k3, k2, i39, i12);
                }
            } else {
                x644.e(k3, k2, i11, i12);
            }
        } else if (i43 == 2 || z7 || !(i44 == 1 || i44 == 0)) {
            if (i40 == -2) {
                i40 = i11;
            }
            if (i41 == -2) {
                i41 = i11;
            }
            if (i11 > 0 && i44 != 1) {
                i11 = 0;
            }
            if (i40 > 0) {
                x644.f(k3, k2, i40, 8);
                i11 = Math.max(i11, i40);
            }
            if (i41 > 0) {
                if (!z3 || i44 != 1) {
                    x644.g(k3, k2, i41, 8);
                }
                i11 = Math.min(i11, i41);
            }
            if (i44 != 1) {
                if (i44 == 2) {
                    int i47 = h216.e;
                    if (i47 == 3 || i47 == 5) {
                        ly621 = x644.k(this.S.i(3));
                        ly620 = x644.k(this.S.i(5));
                    } else {
                        ly621 = x644.k(this.S.i(2));
                        ly620 = x644.k(this.S.i(4));
                    }
                    ns l2 = x644.l();
                    int i48 = i40;
                    l2.d.g(k3, -1.0f);
                    l2.d.g(k2, 1.0f);
                    l2.d.g(ly620, f4);
                    l2.d.g(ly621, -f4);
                    x644.c(l2);
                    if (z3) {
                        z16 = false;
                    }
                    z17 = z5;
                    i13 = i48;
                } else {
                    i13 = i40;
                    z17 = true;
                }
                if (z12 || z9) {
                    ly6 ly623 = ly6;
                    ly6 ly624 = ly62;
                    ly6 ly625 = k2;
                    ly6 ly626 = k3;
                    boolean z36 = z17;
                    if (i43 >= 2 && z3 && z36) {
                        x644.f(ly625, ly623, 0, 8);
                        h21 h218 = this.L;
                        boolean z37 = z2 || h218.f == null;
                        if (!z2 && (h213 = h218.f) != null) {
                            g31 g312 = h213.d;
                            if (g312.V != 0.0f) {
                                int[] iArr = g312.o0;
                                if (iArr[0] == 3 && iArr[1] == 3) {
                                    z37 = true;
                                }
                            }
                            z37 = false;
                        }
                        if (z37) {
                            x644.f(ly624, ly626, 0, 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!h2 && !h3 && !z33) {
                    h214 = h212;
                    ly63 = k3;
                    z18 = z17;
                    ly64 = ly622;
                } else if (!h2 || h3) {
                    if (h2 || !h3) {
                        ly6 ly627 = ly6;
                        ly64 = ly622;
                        if (h2 && h3) {
                            g31 g313 = h216.f.d;
                            h21 h219 = h212;
                            g31 g314 = h219.f.d;
                            z18 = z17;
                            g31 g315 = this.S;
                            int i49 = 6;
                            if (z16) {
                                if (i44 == 0) {
                                    if (i41 != 0 || i13 != 0) {
                                        i37 = 5;
                                        i36 = 5;
                                        z32 = true;
                                        z31 = false;
                                        z21 = true;
                                    } else if (!k4.B || !ly64.B) {
                                        i37 = 8;
                                        i36 = 8;
                                        z32 = false;
                                        z31 = true;
                                        z21 = false;
                                    } else {
                                        x644.e(k2, k4, h216.e(), 8);
                                        x644.e(k3, ly64, -h219.e(), 8);
                                        return;
                                    }
                                    if ((g313 instanceof j50) || (g314 instanceof j50)) {
                                        x644 = x64;
                                        i17 = i44;
                                        ly67 = k2;
                                        ly612 = k3;
                                        z20 = z31;
                                        ly66 = ly62;
                                        i19 = i37;
                                        ly65 = k4;
                                        i18 = 6;
                                        z22 = z32;
                                        i16 = 4;
                                        if (z21 || ly65 != ly64 || g313 == g315) {
                                            z23 = true;
                                        } else {
                                            z21 = false;
                                            z23 = false;
                                        }
                                        if (z22) {
                                            if (z16 || z8 || z10 || ly65 != ly627 || ly64 != ly66) {
                                                z19 = z3;
                                                z25 = z23;
                                                i24 = i19;
                                            } else {
                                                i18 = 8;
                                                z19 = false;
                                                i24 = 8;
                                                z25 = false;
                                            }
                                            ly6 ly628 = ly65;
                                            i20 = i13;
                                            i21 = i17;
                                            g31 = g314;
                                            h215 = h212;
                                            x644.b(ly67, ly628, h216.e(), f2, ly64, ly63, h212.e(), i18);
                                            ly65 = ly628;
                                            i19 = i24;
                                            z23 = z25;
                                        } else {
                                            g31 = g314;
                                            i20 = i13;
                                            i21 = i17;
                                            h215 = h212;
                                            z19 = z3;
                                        }
                                        if (this.f0 != 8 || ((hashSet = h214.a) != null && hashSet.size() > 0)) {
                                            if (z21) {
                                                if (z19 && ly65 != ly64 && !z16 && ((g313 instanceof j50) || (g31 instanceof j50))) {
                                                    i19 = 6;
                                                }
                                                x644.f(ly67, ly65, h21.e(), i19);
                                                x644.g(ly63, ly64, -h214.e(), i19);
                                            }
                                            if (!z19 || !z11 || (g313 instanceof j50) || (g31 instanceof j50) || g31 == g315) {
                                                i22 = i16;
                                                z24 = z23;
                                            } else {
                                                i22 = 6;
                                                i19 = 6;
                                                z24 = true;
                                            }
                                            if (z24) {
                                                if (z20 && (!z10 || z4)) {
                                                    if (!(g313 == g315 || g31 == g315)) {
                                                        i49 = i22;
                                                    }
                                                    if ((g313 instanceof zx2) || (g31 instanceof zx2)) {
                                                        i49 = 5;
                                                    }
                                                    if ((g313 instanceof j50) || (g31 instanceof j50)) {
                                                        i49 = 5;
                                                    }
                                                    i22 = Math.max(z10 ? 5 : i49, i22);
                                                }
                                                if (z19) {
                                                    i22 = Math.min(i19, i22);
                                                    if (z7 && !z10 && (g313 == g315 || g31 == g315)) {
                                                        i23 = 4;
                                                        x644.e(ly67, ly65, h21.e(), i23);
                                                        x644.e(ly63, ly64, -h214.e(), i23);
                                                    }
                                                }
                                                i23 = i22;
                                                x644.e(ly67, ly65, h21.e(), i23);
                                                x644.e(ly63, ly64, -h214.e(), i23);
                                            }
                                            if (z19) {
                                                int e2 = ly627 == ly65 ? h21.e() : 0;
                                                if (ly65 != ly627) {
                                                    x644.f(ly67, ly627, e2, 5);
                                                }
                                            }
                                            if (z19 && z16 && i5 == 0 && i20 == 0) {
                                                if (!z16 || i21 != 3) {
                                                    i15 = 5;
                                                    x644.f(ly63, ly67, 0, 5);
                                                    i14 = i15;
                                                    if (!z19 && z18) {
                                                        int e3 = h214.f != null ? h214.e() : 0;
                                                        ly6 ly629 = ly62;
                                                        if (ly64 != ly629) {
                                                            x644.f(ly629, ly63, e3, i14);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                x644.f(ly63, ly67, 0, 8);
                                            }
                                            i15 = 5;
                                            i14 = i15;
                                            if (!z19) {
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    x644 = x64;
                                    ly67 = k2;
                                    ly612 = k3;
                                    z20 = z31;
                                    i19 = i37;
                                    ly65 = k4;
                                    i18 = 6;
                                    z22 = z32;
                                    i16 = i36;
                                    i17 = i44;
                                } else {
                                    if (i44 == 2) {
                                        if ((g313 instanceof j50) || (g314 instanceof j50)) {
                                            x644 = x64;
                                            i17 = i44;
                                            ly67 = k2;
                                            ly612 = k3;
                                            ly65 = k4;
                                            i18 = 6;
                                            i19 = 5;
                                            i16 = 4;
                                        } else {
                                            x644 = x64;
                                            i17 = i44;
                                            ly67 = k2;
                                            ly612 = k3;
                                            ly65 = k4;
                                            i18 = 6;
                                            i19 = 5;
                                            i16 = 5;
                                        }
                                    } else if (i44 == 1) {
                                        x644 = x64;
                                        i17 = i44;
                                        ly67 = k2;
                                        ly612 = k3;
                                        ly65 = k4;
                                        i18 = 6;
                                        i19 = 8;
                                        i16 = 4;
                                    } else if (i44 == 3) {
                                        i17 = i44;
                                        if (this.z != -1) {
                                            if (z7) {
                                                int i50 = i8;
                                                if (i50 == 2 || i50 == 1) {
                                                    i32 = 5;
                                                    i35 = 4;
                                                } else {
                                                    i32 = 8;
                                                    i35 = 5;
                                                }
                                                i34 = i35;
                                                ly617 = k2;
                                                ly618 = k3;
                                                ly619 = k4;
                                                i33 = 6;
                                                z28 = true;
                                                z29 = true;
                                                z30 = true;
                                                ly616 = ly62;
                                            } else if (i41 > 0) {
                                                x643 = x64;
                                                ly66 = ly62;
                                                ly613 = k2;
                                                ly614 = k3;
                                                ly615 = k4;
                                                i29 = 6;
                                                i30 = 5;
                                            } else if (i41 != 0 || i13 != 0) {
                                                x643 = x64;
                                                ly66 = ly62;
                                                ly613 = k2;
                                                ly614 = k3;
                                                ly615 = k4;
                                                i29 = 6;
                                                i30 = 5;
                                                i31 = 4;
                                                z22 = true;
                                                z21 = true;
                                                z20 = true;
                                                if (z21) {
                                                }
                                                z23 = true;
                                                if (z22) {
                                                }
                                                if (this.f0 != 8 || ((hashSet = h214.a) != null && hashSet.size() > 0)) {
                                                }
                                            } else if (!z10) {
                                                x643 = x64;
                                                ly66 = ly62;
                                                ly613 = k2;
                                                ly614 = k3;
                                                ly615 = k4;
                                                i29 = 6;
                                                i30 = 5;
                                                i31 = 8;
                                                z22 = true;
                                                z21 = true;
                                                z20 = true;
                                                if (z21) {
                                                }
                                                z23 = true;
                                                if (z22) {
                                                }
                                                if (this.f0 != 8 || ((hashSet = h214.a) != null && hashSet.size() > 0)) {
                                                }
                                            } else {
                                                i32 = (g313 == g315 || g314 == g315) ? 5 : 4;
                                                ly616 = ly62;
                                                ly617 = k2;
                                                ly618 = k3;
                                                ly619 = k4;
                                                i33 = 6;
                                                i34 = 4;
                                                z28 = true;
                                                z29 = true;
                                                z30 = true;
                                            }
                                            i19 = i32;
                                            x644 = x64;
                                            if (z21) {
                                            }
                                            z23 = true;
                                            if (z22) {
                                            }
                                            if (this.f0 != 8 || ((hashSet = h214.a) != null && hashSet.size() > 0)) {
                                            }
                                        } else if (z10) {
                                            x643 = x64;
                                            ly66 = ly62;
                                            ly613 = k2;
                                            ly614 = k3;
                                            ly615 = k4;
                                            i30 = 8;
                                            i29 = z3 ? 5 : 4;
                                        } else {
                                            x643 = x64;
                                            ly66 = ly62;
                                            ly613 = k2;
                                            ly614 = k3;
                                            ly615 = k4;
                                            i30 = 8;
                                            i29 = 8;
                                        }
                                        i31 = 5;
                                        z22 = true;
                                        z21 = true;
                                        z20 = true;
                                        if (z21) {
                                        }
                                        z23 = true;
                                        if (z22) {
                                        }
                                        if (this.f0 != 8 || ((hashSet = h214.a) != null && hashSet.size() > 0)) {
                                        }
                                    } else {
                                        i25 = i44;
                                        x642 = x64;
                                        ly68 = ly62;
                                        ly69 = k2;
                                        ly610 = k3;
                                        ly611 = k4;
                                        i26 = 6;
                                        i27 = 5;
                                        i28 = 4;
                                        z26 = false;
                                        z27 = false;
                                    }
                                    z22 = true;
                                    z21 = true;
                                    z20 = false;
                                }
                                ly66 = ly62;
                                if (z21) {
                                }
                                z23 = true;
                                if (z22) {
                                }
                                if (this.f0 != 8 || ((hashSet = h214.a) != null && hashSet.size() > 0)) {
                                }
                            } else {
                                i25 = i44;
                                if (!k4.B || !ly64.B) {
                                    x642 = x64;
                                    ly68 = ly62;
                                    ly69 = k2;
                                    ly610 = k3;
                                    ly611 = k4;
                                    i26 = 6;
                                    i27 = 5;
                                    i28 = 4;
                                    z26 = true;
                                    z27 = true;
                                } else {
                                    x64 x645 = x64;
                                    ly6 ly630 = k3;
                                    x645.b(k2, k4, h216.e(), f2, ly64, ly630, h219.e(), 8);
                                    x64 x646 = x645;
                                    ly6 ly631 = ly630;
                                    if (z3 && z18) {
                                        int e4 = h219.f != null ? h219.e() : 0;
                                        ly6 ly632 = ly62;
                                        if (ly64 != ly632) {
                                            x646.f(ly632, ly631, e4, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            z20 = false;
                            if (z21) {
                            }
                            z23 = true;
                            if (z22) {
                            }
                            if (this.f0 != 8 || ((hashSet = h214.a) != null && hashSet.size() > 0)) {
                            }
                        }
                    } else {
                        ly64 = ly622;
                        x644.e(k3, ly64, -h212.e(), 8);
                        if (z3) {
                            x644.f(k2, ly6, 0, 5);
                            h214 = h212;
                            i15 = 5;
                            ly63 = k3;
                            z18 = z17;
                            z19 = z3;
                            i14 = i15;
                            if (!z19) {
                            }
                        }
                    }
                    h214 = h212;
                    ly63 = k3;
                    z18 = z17;
                } else {
                    h214 = h212;
                    ly63 = k3;
                    z18 = z17;
                    ly64 = ly622;
                    z19 = z3;
                    i14 = (!z3 || !(h216.f.d instanceof j50)) ? 5 : 8;
                    if (!z19) {
                    }
                }
                i15 = 5;
                z19 = z3;
                i14 = i15;
                if (!z19) {
                }
            } else if (z3) {
                x644.e(k3, k2, i11, 8);
            } else if (z9) {
                x644.e(k3, k2, i11, 5);
                x644.g(k3, k2, i11, 8);
            } else {
                x644.e(k3, k2, i11, 5);
                x644.g(k3, k2, i11, 8);
            }
        } else {
            int max = Math.max(i40, i11);
            if (i41 > 0) {
                max = Math.min(i41, max);
            }
            x644.e(k3, k2, max, 8);
            z17 = z5;
            i13 = i40;
            z16 = false;
            if (z12) {
            }
            ly6 ly6232 = ly6;
            ly6 ly6242 = ly62;
            ly6 ly6252 = k2;
            ly6 ly6262 = k3;
            boolean z362 = z17;
            if (i43 >= 2) {
                return;
            }
            return;
        }
        z17 = z5;
        i13 = i40;
        if (z12) {
        }
        ly6 ly62322 = ly6;
        ly6 ly62422 = ly62;
        ly6 ly62522 = k2;
        ly6 ly62622 = k3;
        boolean z3622 = z17;
        if (i43 >= 2) {
        }
    }

    public final void e(int i2, g31 g31, int i3, int i4) {
        boolean z2;
        if (i2 == 7) {
            if (i3 == 7) {
                h21 i5 = i(2);
                h21 i6 = i(4);
                h21 i7 = i(3);
                h21 i8 = i(5);
                boolean z3 = true;
                if ((i5 == null || !i5.h()) && (i6 == null || !i6.h())) {
                    e(2, g31, 2, 0);
                    e(4, g31, 4, 0);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i7 == null || !i7.h()) && (i8 == null || !i8.h())) {
                    e(3, g31, 3, 0);
                    e(5, g31, 5, 0);
                } else {
                    z3 = false;
                }
                if (z2 && z3) {
                    i(7).a(g31.i(7), 0);
                } else if (z2) {
                    i(8).a(g31.i(8), 0);
                } else if (z3) {
                    i(9).a(g31.i(9), 0);
                }
            } else if (i3 == 2 || i3 == 4) {
                e(2, g31, i3, 0);
                e(4, g31, i3, 0);
                i(7).a(g31.i(i3), 0);
            } else if (i3 == 3 || i3 == 5) {
                e(3, g31, i3, 0);
                e(5, g31, i3, 0);
                i(7).a(g31.i(i3), 0);
            }
        } else if (i2 == 8 && (i3 == 2 || i3 == 4)) {
            h21 i9 = i(2);
            h21 i10 = g31.i(i3);
            h21 i11 = i(4);
            i9.a(i10, 0);
            i11.a(i10, 0);
            i(8).a(i10, 0);
        } else if (i2 == 9 && (i3 == 3 || i3 == 5)) {
            h21 i12 = g31.i(i3);
            i(3).a(i12, 0);
            i(5).a(i12, 0);
            i(9).a(i12, 0);
        } else if (i2 == 8 && i3 == 8) {
            i(2).a(g31.i(2), 0);
            i(4).a(g31.i(4), 0);
            i(8).a(g31.i(i3), 0);
        } else if (i2 == 9 && i3 == 9) {
            i(3).a(g31.i(3), 0);
            i(5).a(g31.i(5), 0);
            i(9).a(g31.i(i3), 0);
        } else {
            h21 i13 = i(i2);
            h21 i14 = g31.i(i3);
            if (i13.i(i14)) {
                if (i2 == 6) {
                    h21 i15 = i(3);
                    h21 i16 = i(5);
                    if (i15 != null) {
                        i15.j();
                    }
                    if (i16 != null) {
                        i16.j();
                    }
                } else if (i2 == 3 || i2 == 5) {
                    h21 i17 = i(6);
                    if (i17 != null) {
                        i17.j();
                    }
                    h21 i18 = i(7);
                    if (i18.f != i14) {
                        i18.j();
                    }
                    h21 f2 = i(i2).f();
                    h21 i19 = i(9);
                    if (i19.h()) {
                        f2.j();
                        i19.j();
                    }
                } else if (i2 == 2 || i2 == 4) {
                    h21 i20 = i(7);
                    if (i20.f != i14) {
                        i20.j();
                    }
                    h21 f3 = i(i2).f();
                    h21 i21 = i(8);
                    if (i21.h()) {
                        f3.j();
                        i21.j();
                    }
                }
                i13.a(i14, i4);
            }
        }
    }

    public final void f(h21 h21, h21 h212, int i2) {
        if (h21.d == this) {
            e(h21.e, h212.d, h212.e, i2);
        }
    }

    public final void g(x64 x64) {
        x64.k(this.H);
        x64.k(this.I);
        x64.k(this.J);
        x64.k(this.K);
        if (this.Z > 0) {
            x64.k(this.L);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [p48, h98] */
    /* JADX WARNING: type inference failed for: r0v3, types: [h98, n23] */
    public final void h() {
        if (this.d == null) {
            ? h98 = new h98(this);
            h98.h.e = 4;
            h98.i.e = 5;
            h98.f = 0;
            this.d = h98;
        }
        if (this.e == null) {
            ? h982 = new h98(this);
            eq1 eq1 = new eq1(h982);
            h982.k = eq1;
            h982.l = null;
            h982.h.e = 6;
            h982.i.e = 7;
            eq1.e = 8;
            h982.f = 1;
            this.e = h982;
        }
    }

    public h21 i(int i2) {
        switch (b81.B(i2)) {
            case b85.b:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(f21.x(i2));
        }
    }

    public final int j(int i2) {
        int[] iArr = this.o0;
        if (i2 == 0) {
            return iArr[0];
        }
        if (i2 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r1 = r1.K;
     */
    public final g31 l(int i2) {
        h21 h21;
        h21 h212;
        if (i2 == 0) {
            h21 h213 = this.J;
            h21 h214 = h213.f;
            if (h214 == null || h214.f != h213) {
                return null;
            }
            return h214.d;
        } else if (i2 == 1 && (h212 = h21.f) != null && h212.f == h21) {
            return h212.d;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r1 = r1.I;
     */
    public final g31 m(int i2) {
        h21 h21;
        h21 h212;
        if (i2 == 0) {
            h21 h213 = this.H;
            h21 h214 = h213.f;
            if (h214 == null || h214.f != h213) {
                return null;
            }
            return h214.d;
        } else if (i2 == 1 && (h212 = h21.f) != null && h212.f == h21) {
            return h212.d;
        } else {
            return null;
        }
    }

    public final int n() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int o() {
        g31 g31 = this.S;
        if (g31 == null || !(g31 instanceof h31)) {
            return this.X;
        }
        return ((h31) g31).w0 + this.X;
    }

    public final int p() {
        g31 g31 = this.S;
        if (g31 == null || !(g31 instanceof h31)) {
            return this.Y;
        }
        return ((h31) g31).x0 + this.Y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[RETURN] */
    public final boolean q(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == 0) {
            if (this.H.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (this.J.f != null) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (i6 + i7 < 2) {
                return true;
            }
            return false;
        }
        if (this.I.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.K.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i8 = i3 + i4;
        if (this.L.f != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (i8 + i5 < 2) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r2 = r2.K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r2 = r2.J;
     */
    public final boolean r(int i2, int i3) {
        h21 h21;
        h21 h212;
        h21 h213;
        h21 h214;
        if (i2 == 0) {
            h21 h215 = this.H;
            h21 h216 = h215.f;
            if (h216 == null || !h216.c || (h214 = h213.f) == null || !h214.c) {
                return false;
            }
            if ((h214.d() - h213.e()) - (h215.e() + h215.f.d()) >= i3) {
                return true;
            }
            return false;
        }
        h21 h217 = this.I;
        h21 h218 = h217.f;
        if (h218 == null || !h218.c || (h212 = h21.f) == null || !h212.c) {
            return false;
        }
        if ((h212.d() - h21.e()) - (h217.e() + h217.f.d()) >= i3) {
            return true;
        }
        return false;
    }

    public final void s(int i2, int i3, int i4, int i5, g31 g31) {
        i(i2).b(g31.i(i3), i4, i5, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r2[r3 + 1];
     */
    public final boolean t(int i2) {
        h21 h21;
        h21 h212;
        int i3 = i2 * 2;
        h21[] h21Arr = this.P;
        h21 h213 = h21Arr[i3];
        h21 h214 = h213.f;
        if (h214 == null || h214.f == h213 || (h212 = h21.f) == null || h212.f != h21) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str = "";
        StringBuilder o2 = b81.o(str);
        if (this.g0 != null) {
            str = f21.l(new StringBuilder("id: "), this.g0, " ");
        }
        o2.append(str);
        o2.append("(");
        o2.append(this.X);
        o2.append(", ");
        o2.append(this.Y);
        o2.append(") - (");
        o2.append(this.T);
        o2.append(" x ");
        return hl6.n(o2, this.U, ")");
    }

    public final boolean u() {
        h21 h21 = this.H;
        h21 h212 = h21.f;
        if (h212 != null && h212.f == h21) {
            return true;
        }
        h21 h213 = this.J;
        h21 h214 = h213.f;
        if (h214 == null || h214.f != h213) {
            return false;
        }
        return true;
    }

    public final boolean v() {
        h21 h21 = this.I;
        h21 h212 = h21.f;
        if (h212 != null && h212.f == h21) {
            return true;
        }
        h21 h213 = this.K;
        h21 h214 = h213.f;
        if (h214 == null || h214.f != h213) {
            return false;
        }
        return true;
    }

    public final boolean w() {
        if (!this.g || this.f0 == 8) {
            return false;
        }
        return true;
    }

    public boolean x() {
        if (this.j) {
            return true;
        }
        if (!this.H.c || !this.J.c) {
            return false;
        }
        return true;
    }

    public boolean y() {
        if (this.k) {
            return true;
        }
        if (!this.I.c || !this.K.c) {
            return false;
        }
        return true;
    }

    public void z() {
        this.H.j();
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.S = null;
        this.C = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.n = -1;
        this.o = -1;
        int[] iArr2 = this.B;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.q = 0;
        this.r = 0;
        this.v = 1.0f;
        this.y = 1.0f;
        this.u = Integer.MAX_VALUE;
        this.x = Integer.MAX_VALUE;
        this.t = 0;
        this.w = 0;
        this.z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.s;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }
}
