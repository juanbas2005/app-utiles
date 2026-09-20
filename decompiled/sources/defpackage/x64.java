package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: x64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x64 {
    public static boolean p = false;
    public static int q = 1000;
    public boolean a;
    public int b;
    public final uo5 c;
    public int d;
    public int e;
    public ns[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final wr0 l;
    public ly6[] m;
    public int n;
    public ns o;

    /* JADX WARNING: type inference failed for: r1v2, types: [ns, uo5] */
    public x64() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new ly6[q];
        this.n = 0;
        this.f = new ns[32];
        s();
        wr0 wr0 = new wr0(11, false);
        wr0.x = new ml5();
        wr0.y = new ml5();
        wr0.z = new ly6[32];
        this.l = wr0;
        ? nsVar = new ns(wr0);
        nsVar.f = new ly6[128];
        nsVar.g = new ly6[128];
        nsVar.h = 0;
        nsVar.i = new kg5((uo5) nsVar);
        this.c = nsVar;
        this.o = new ns(wr0);
    }

    public static int n(Object obj) {
        ly6 ly6 = ((h21) obj).i;
        if (ly6 != null) {
            return (int) (ly6.A + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ly6} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ly6 a(int i2) {
        ml5 ml5 = (ml5) this.l.y;
        int i3 = ml5.b;
        Object obj = null;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = ml5.a;
            Object obj2 = objArr[i4];
            objArr[i4] = null;
            ml5.b = i4;
            obj = obj2;
        }
        ly6 ly6 = (ly6) obj;
        if (ly6 == null) {
            ly6 = new ly6(i2);
            ly6.H = i2;
        } else {
            ly6.c();
            ly6.H = i2;
        }
        int i5 = this.n;
        int i6 = q;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            q = i7;
            this.m = (ly6[]) Arrays.copyOf(this.m, i7);
        }
        ly6[] ly6Arr = this.m;
        int i8 = this.n;
        this.n = i8 + 1;
        ly6Arr[i8] = ly6;
        return ly6;
    }

    public final void b(ly6 ly6, ly6 ly62, int i2, float f2, ly6 ly63, ly6 ly64, int i3, int i4) {
        ns l2 = l();
        if (ly62 == ly63) {
            l2.d.g(ly6, 1.0f);
            l2.d.g(ly64, 1.0f);
            l2.d.g(ly62, -2.0f);
        } else {
            int i5 = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
            bs bsVar = l2.d;
            if (i5 == 0) {
                bsVar.g(ly6, 1.0f);
                l2.d.g(ly62, -1.0f);
                l2.d.g(ly63, -1.0f);
                l2.d.g(ly64, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    l2.b = (float) ((-i2) + i3);
                }
            } else if (f2 <= 0.0f) {
                bsVar.g(ly6, -1.0f);
                l2.d.g(ly62, 1.0f);
                l2.b = (float) i2;
            } else if (f2 >= 1.0f) {
                bsVar.g(ly64, -1.0f);
                l2.d.g(ly63, 1.0f);
                l2.b = (float) (-i3);
            } else {
                float f3 = 1.0f - f2;
                bsVar.g(ly6, f3 * 1.0f);
                l2.d.g(ly62, f3 * -1.0f);
                l2.d.g(ly63, -1.0f * f2);
                l2.d.g(ly64, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    l2.b = (((float) i3) * f2) + (((float) (-i2)) * f3);
                }
            }
        }
        if (i4 != 8) {
            l2.a(this, i4);
        }
        c(l2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
        if (r4.G <= 1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        if (r4.G <= 1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f2, code lost:
        if (r4.G <= 1) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ff, code lost:
        if (r4.G <= 1) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    public final void c(ns nsVar) {
        boolean z;
        boolean z2;
        ly6 ly6;
        ly6 f2;
        ns nsVar2 = nsVar;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (!nsVar2.e) {
            ArrayList arrayList = nsVar2.c;
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int d2 = nsVar2.d.d();
                    for (int i2 = 0; i2 < d2; i2++) {
                        ly6 e2 = nsVar2.d.e(i2);
                        if (e2.y != -1 || e2.B) {
                            arrayList.add(e2);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            ly6 ly62 = (ly6) arrayList.get(i3);
                            if (ly62.B) {
                                nsVar2.h(this, ly62, true);
                            } else {
                                nsVar2.i(this, this.f[ly62.y], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (nsVar2.a != null && nsVar2.d.d() == 0) {
                    nsVar2.e = true;
                    this.a = true;
                }
            }
            if (!nsVar2.e()) {
                float f3 = nsVar2.b;
                float f4 = 0.0f;
                if (f3 < 0.0f) {
                    nsVar2.b = f3 * -1.0f;
                    bs bsVar = nsVar2.d;
                    int i4 = bsVar.h;
                    int i5 = 0;
                    while (i4 != -1 && i5 < bsVar.a) {
                        float[] fArr = bsVar.g;
                        fArr[i4] = fArr[i4] * -1.0f;
                        i4 = bsVar.f[i4];
                        i5++;
                    }
                }
                int d3 = nsVar2.d.d();
                float f5 = 0.0f;
                float f6 = 0.0f;
                ly6 ly63 = null;
                ly6 ly64 = null;
                int i6 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (i6 < d3) {
                    float f7 = nsVar2.d.f(i6);
                    ly6 e3 = nsVar2.d.e(i6);
                    float f8 = f4;
                    if (e3.H == 1) {
                        if (ly63 != null) {
                            if (f5 <= f7) {
                                if (!z4) {
                                    if (e3.G > 1) {
                                    }
                                }
                            }
                            z4 = true;
                            ly63 = e3;
                            f5 = f7;
                        }
                        z4 = false;
                        ly63 = e3;
                        f5 = f7;
                    } else if (ly63 == null && f7 < f8) {
                        if (ly64 != null) {
                            if (f6 <= f7) {
                                if (!z5) {
                                    if (e3.G > 1) {
                                    }
                                }
                            }
                            z5 = true;
                            ly64 = e3;
                            f6 = f7;
                        }
                        z5 = false;
                        ly64 = e3;
                        f6 = f7;
                    }
                    i6++;
                    f4 = f8;
                }
                float f9 = f4;
                if (ly63 == null) {
                    ly63 = ly64;
                }
                if (ly63 == null) {
                    z2 = true;
                } else {
                    nsVar2.g(ly63);
                    z2 = false;
                }
                if (nsVar2.d.d() == 0) {
                    nsVar2.e = true;
                }
                if (z2) {
                    if (this.i + 1 >= this.e) {
                        o();
                    }
                    ly6 a2 = a(3);
                    int i7 = this.b + 1;
                    this.b = i7;
                    this.i++;
                    a2.x = i7;
                    wr0 wr0 = this.l;
                    ((ly6[]) wr0.z)[i7] = a2;
                    nsVar2.a = a2;
                    int i8 = this.j;
                    h(nsVar);
                    if (this.j == i8 + 1) {
                        ns nsVar3 = this.o;
                        nsVar3.a = null;
                        nsVar3.d.b();
                        for (int i9 = 0; i9 < nsVar2.d.d(); i9++) {
                            nsVar3.d.a(nsVar2.d.e(i9), nsVar2.d.f(i9), true);
                        }
                        r(this.o);
                        if (a2.y == -1) {
                            if (nsVar2.a == a2 && (f2 = nsVar2.f((boolean[]) null, a2)) != null) {
                                nsVar2.g(f2);
                            }
                            if (!nsVar2.e) {
                                nsVar2.a.e(this, nsVar2);
                            }
                            ((ml5) wr0.x).b(nsVar2);
                            this.j--;
                        }
                        z = true;
                        ly6 = nsVar2.a;
                        if (ly6 != null) {
                            return;
                        }
                        if (ly6.H != 1 && nsVar2.b < f9) {
                            return;
                        }
                    }
                }
                z = false;
                ly6 = nsVar2.a;
                if (ly6 != null) {
                }
            } else {
                return;
            }
        } else {
            z = false;
        }
        if (!z) {
            h(nsVar);
        }
    }

    public final void d(ly6 ly6, int i2) {
        int i3 = ly6.y;
        if (i3 == -1) {
            ly6.d(this, (float) i2);
            for (int i4 = 0; i4 < this.b + 1; i4++) {
                ly6 ly62 = ((ly6[]) this.l.z)[i4];
            }
        } else if (i3 != -1) {
            ns nsVar = this.f[i3];
            if (nsVar.e) {
                nsVar.b = (float) i2;
            } else if (nsVar.d.d() == 0) {
                nsVar.e = true;
                nsVar.b = (float) i2;
            } else {
                ns l2 = l();
                if (i2 < 0) {
                    l2.b = (float) (i2 * -1);
                    l2.d.g(ly6, 1.0f);
                } else {
                    l2.b = (float) i2;
                    l2.d.g(ly6, -1.0f);
                }
                c(l2);
            }
        } else {
            ns l3 = l();
            l3.a = ly6;
            float f2 = (float) i2;
            ly6.A = f2;
            l3.b = f2;
            l3.e = true;
            c(l3);
        }
    }

    public final void e(ly6 ly6, ly6 ly62, int i2, int i3) {
        if (i3 == 8 && ly62.B && ly6.y == -1) {
            ly6.d(this, ly62.A + ((float) i2));
            return;
        }
        ns l2 = l();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            l2.b = (float) i2;
        }
        bs bsVar = l2.d;
        if (!z) {
            bsVar.g(ly6, -1.0f);
            l2.d.g(ly62, 1.0f);
        } else {
            bsVar.g(ly6, 1.0f);
            l2.d.g(ly62, -1.0f);
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    public final void f(ly6 ly6, ly6 ly62, int i2, int i3) {
        ns l2 = l();
        ly6 m2 = m();
        m2.z = 0;
        l2.b(ly6, ly62, m2, i2);
        if (i3 != 8) {
            l2.d.g(j(i3), (float) ((int) (l2.d.c(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void g(ly6 ly6, ly6 ly62, int i2, int i3) {
        ns l2 = l();
        ly6 m2 = m();
        m2.z = 0;
        l2.c(ly6, ly62, m2, i2);
        if (i3 != 8) {
            l2.d.g(j(i3), (float) ((int) (l2.d.c(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void h(ns nsVar) {
        int i2;
        if (nsVar.e) {
            nsVar.a.d(this, nsVar.b);
        } else {
            ns[] nsVarArr = this.f;
            int i3 = this.j;
            nsVarArr[i3] = nsVar;
            ly6 ly6 = nsVar.a;
            ly6.y = i3;
            this.j = i3 + 1;
            ly6.e(this, nsVar);
        }
        if (this.a) {
            int i4 = 0;
            while (i4 < this.j) {
                if (this.f[i4] == null) {
                    System.out.println("WTF");
                }
                ns nsVar2 = this.f[i4];
                if (nsVar2 != null && nsVar2.e) {
                    nsVar2.a.d(this, nsVar2.b);
                    ((ml5) this.l.x).b(nsVar2);
                    this.f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.j;
                        if (i5 >= i2) {
                            break;
                        }
                        ns[] nsVarArr2 = this.f;
                        int i7 = i5 - 1;
                        ns nsVar3 = nsVarArr2[i5];
                        nsVarArr2[i7] = nsVar3;
                        ly6 ly62 = nsVar3.a;
                        if (ly62.y == i5) {
                            ly62.y = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f[i6] = null;
                    }
                    this.j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < this.j; i2++) {
            ns nsVar = this.f[i2];
            nsVar.a.A = nsVar.b;
        }
    }

    public final ly6 j(int i2) {
        if (this.i + 1 >= this.e) {
            o();
        }
        ly6 a2 = a(4);
        float[] fArr = a2.D;
        int i3 = this.b + 1;
        this.b = i3;
        this.i++;
        a2.x = i3;
        a2.z = i2;
        ((ly6[]) this.l.z)[i3] = a2;
        uo5 uo5 = this.c;
        uo5.i.x = a2;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.z] = 1.0f;
        uo5.j(a2);
        return a2;
    }

    public final ly6 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof h21)) {
            return null;
        }
        h21 h21 = (h21) obj;
        ly6 ly6 = h21.i;
        if (ly6 == null) {
            h21.k();
            ly6 = h21.i;
        }
        int i2 = ly6.x;
        wr0 wr0 = this.l;
        if (i2 != -1 && i2 <= this.b && ((ly6[]) wr0.z)[i2] != null) {
            return ly6;
        }
        if (i2 != -1) {
            ly6.c();
        }
        int i3 = this.b + 1;
        this.b = i3;
        this.i++;
        ly6.x = i3;
        ly6.H = 1;
        ((ly6[]) wr0.z)[i3] = ly6;
        return ly6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: ns} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ns l() {
        Object obj;
        wr0 wr0 = this.l;
        ml5 ml5 = (ml5) wr0.x;
        int i2 = ml5.b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = ml5.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            ml5.b = i3;
            obj = obj2;
        } else {
            obj = null;
        }
        ns nsVar = (ns) obj;
        if (nsVar == null) {
            return new ns(wr0);
        }
        nsVar.a = null;
        nsVar.d.b();
        nsVar.b = 0.0f;
        nsVar.e = false;
        return nsVar;
    }

    public final ly6 m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        ly6 a2 = a(3);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        a2.x = i2;
        ((ly6[]) this.l.z)[i2] = a2;
        return a2;
    }

    public final void o() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f = (ns[]) Arrays.copyOf(this.f, i2);
        wr0 wr0 = this.l;
        wr0.z = (ly6[]) Arrays.copyOf((ly6[]) wr0.z, this.d);
        int i3 = this.d;
        this.h = new boolean[i3];
        this.e = i3;
        this.k = i3;
    }

    public final void p() {
        uo5 uo5 = this.c;
        if (uo5.e()) {
            i();
        } else if (this.g) {
            for (int i2 = 0; i2 < this.j; i2++) {
                if (!this.f[i2].e) {
                    q(uo5);
                    return;
                }
            }
            i();
        } else {
            q(uo5);
        }
    }

    public final void q(uo5 uo5) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.j) {
                break;
            }
            ns nsVar = this.f[i2];
            int i3 = 1;
            if (nsVar.a.H != 1) {
                float f2 = 0.0f;
                if (nsVar.b < 0.0f) {
                    boolean z = false;
                    int i4 = 0;
                    while (!z) {
                        i4 += i3;
                        float f3 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < this.j) {
                            ns nsVar2 = this.f[i7];
                            if (nsVar2.a.H != i3 && !nsVar2.e && nsVar2.b < f2) {
                                int d2 = nsVar2.d.d();
                                int i9 = 0;
                                while (i9 < d2) {
                                    ly6 e2 = nsVar2.d.e(i9);
                                    float c2 = nsVar2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f4 = e2.C[i10] / c2;
                                            if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i6 = e2.x;
                                                i5 = i7;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i9++;
                                    f2 = 0.0f;
                                }
                            }
                            i7++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            ns nsVar3 = this.f[i5];
                            nsVar3.a.y = -1;
                            nsVar3.g(((ly6[]) this.l.z)[i6]);
                            ly6 ly6 = nsVar3.a;
                            ly6.y = i5;
                            ly6.e(this, nsVar3);
                        } else {
                            z = true;
                        }
                        if (i4 > this.i / 2) {
                            z = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        r(uo5);
        i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    public final void r(ns nsVar) {
        boolean z;
        ns nsVar2 = nsVar;
        int i2 = 0;
        for (int i3 = 0; i3 < this.i; i3++) {
            this.h[i3] = false;
        }
        boolean z2 = false;
        int i4 = 0;
        while (!z2) {
            i4++;
            if (i4 < this.i * 2) {
                ly6 ly6 = nsVar2.a;
                if (ly6 != null) {
                    this.h[ly6.x] = true;
                }
                ly6 d2 = nsVar2.d(this.h);
                if (d2 != null) {
                    boolean[] zArr = this.h;
                    int i5 = d2.x;
                    if (!zArr[i5]) {
                        zArr[i5] = true;
                    } else {
                        return;
                    }
                }
                if (d2 != null) {
                    float f2 = Float.MAX_VALUE;
                    int i6 = i2;
                    int i7 = -1;
                    while (i6 < this.j) {
                        ns nsVar3 = this.f[i6];
                        if (nsVar3.a.H != 1 && !nsVar3.e) {
                            bs bsVar = nsVar3.d;
                            int i8 = bsVar.h;
                            if (i8 != -1) {
                                int i9 = i2;
                                while (true) {
                                    if (i8 == -1 || i9 >= bsVar.a) {
                                        break;
                                    } else if (bsVar.e[i8] == d2.x) {
                                        z = true;
                                        break;
                                    } else {
                                        i8 = bsVar.f[i8];
                                        i9++;
                                    }
                                }
                                if (!z) {
                                    float c2 = nsVar3.d.c(d2);
                                    if (c2 < 0.0f) {
                                        float f3 = (-nsVar3.b) / c2;
                                        if (f3 < f2) {
                                            i7 = i6;
                                            f2 = f3;
                                        }
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                        i6++;
                        i2 = 0;
                    }
                    if (i7 > -1) {
                        ns nsVar4 = this.f[i7];
                        nsVar4.a.y = -1;
                        nsVar4.g(d2);
                        ly6 ly62 = nsVar4.a;
                        ly62.y = i7;
                        ly62.e(this, nsVar4);
                    }
                } else {
                    z2 = true;
                }
                i2 = 0;
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i2 = 0; i2 < this.j; i2++) {
            ns nsVar = this.f[i2];
            if (nsVar != null) {
                ((ml5) this.l.x).b(nsVar);
            }
            this.f[i2] = null;
        }
    }

    public final void t() {
        wr0 wr0;
        int i2 = 0;
        while (true) {
            wr0 = this.l;
            ly6[] ly6Arr = (ly6[]) wr0.z;
            if (i2 >= ly6Arr.length) {
                break;
            }
            ly6 ly6 = ly6Arr[i2];
            if (ly6 != null) {
                ly6.c();
            }
            i2++;
        }
        ml5 ml5 = (ml5) wr0.y;
        ly6[] ly6Arr2 = this.m;
        int i3 = this.n;
        ml5.getClass();
        if (i3 > ly6Arr2.length) {
            i3 = ly6Arr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            ly6 ly62 = ly6Arr2[i4];
            int i5 = ml5.b;
            Object[] objArr = ml5.a;
            if (i5 < objArr.length) {
                objArr[i5] = ly62;
                ml5.b = i5 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((ly6[]) wr0.z, (Object) null);
        this.b = 0;
        uo5 uo5 = this.c;
        uo5.h = 0;
        uo5.b = 0.0f;
        this.i = 1;
        for (int i6 = 0; i6 < this.j; i6++) {
            ns nsVar = this.f[i6];
        }
        s();
        this.j = 0;
        this.o = new ns(wr0);
    }
}
