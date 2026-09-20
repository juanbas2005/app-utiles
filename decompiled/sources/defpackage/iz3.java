package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: iz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iz3 implements jx0 {
    public int A;
    public final tp4 B = new tp4();
    public final tp4 C = new tp4();
    public final cz3 D = new cz3(this);
    public final zy3 E = new zy3(this);
    public final tp4 F = new tp4();
    public final r67 G = new r67();
    public final tp4 H = new tp4();
    public final eq4 I = new eq4(new Object[16]);
    public int J;
    public int K;
    public final String L = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    public final uy3 w;
    public ky0 x;
    public s67 y;
    public int z;

    public iz3(uy3 uy3, s67 s67) {
        this.w = uy3;
        this.y = s67;
        long[] jArr = bg6.a;
    }

    public static final void c(iz3 iz3, Object obj) {
        uy3 uy3 = iz3.w;
        iz3.h();
        uy3 uy32 = (uy3) iz3.F.k(obj);
        if (uy32 != null) {
            if (iz3.K <= 0) {
                yb3.b("No pre-composed items to dispose");
            }
            int i = ((eq4) ((jp4) uy3.o()).x).i(uy32);
            if (i < ((eq4) ((jp4) uy3.o()).x).y - iz3.K) {
                yb3.b("Item is not in pre-composed item range");
            }
            iz3.J++;
            iz3.K--;
            az3 az3 = (az3) iz3.B.g(uy32);
            if (az3 != null) {
                e(az3);
            }
            int i2 = (((eq4) ((jp4) uy3.o()).x).y - iz3.K) - iz3.J;
            iz3.j(i, i2);
            iz3.g(i2);
        }
        if (iz3.I.h(obj)) {
            uy3.Z(uy3, true, 6);
        }
    }

    public static void e(az3 az3) {
        up4 up4;
        ze5 ze5 = az3.f;
        if (ze5 != null) {
            ze5.h.set(bf5.x);
            u36 u36 = ze5.k;
            if (u36.d.h()) {
                up4 = u36.d;
                up4 up42 = cg6.a;
                u36.d = new up4();
                u36.c.g();
            } else {
                up4 = null;
            }
            u36.b();
            py0 py0 = ze5.a;
            py0.M = null;
            if (up4 != null) {
                py0.Q.k = up4;
                py0.S = 2;
            }
            az3.f = null;
            py0 py02 = az3.c;
            if (py02 != null) {
                py02.o();
            }
            az3.c = null;
        }
    }

    public final void a() {
        py0 py0;
        uy3 uy3 = this.w;
        uy3.L = true;
        tp4 tp4 = this.B;
        Object[] objArr = tp4.c;
        long[] jArr = tp4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (py0 = ((az3) objArr[(i << 3) + i3]).c) != null) {
                            py0.o();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        uy3.T();
        uy3.L = false;
        tp4.a();
        this.C.a();
        this.K = 0;
        this.J = 0;
        this.F.a();
        h();
    }

    public final void b() {
        i(true);
    }

    public final void d(az3 az3, boolean z2) {
        vr2 vr2;
        ze5 ze5 = az3.f;
        if (ze5 != null) {
            ix6 h = j45.h();
            if (h != null) {
                vr2 = h.e();
            } else {
                vr2 = null;
            }
            ix6 j = j45.j(h);
            try {
                uy3 uy3 = this.w;
                uy3.L = true;
                if (z2) {
                    while (!ze5.c()) {
                        ze5.e(new rf2(21));
                    }
                }
                ze5.a();
                az3.f = null;
                uy3.L = false;
                j45.m(h, j, vr2);
            } catch (Throwable th) {
                j45.m(h, j, vr2);
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, n67] */
    public final n67 f(Object obj) {
        if (!this.w.J()) {
            return new Object();
        }
        return new gz3(this, obj);
    }

    public final void g(int i) {
        boolean z2;
        vr2 vr2;
        boolean z3 = false;
        this.J = 0;
        List o = this.w.o();
        jp4 jp4 = (jp4) o;
        int i2 = (((eq4) jp4.x).y - this.K) - 1;
        if (i <= i2) {
            this.G.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.B.g((uy3) jp4.get(i3));
                    g.getClass();
                    ((mp4) this.G.x).a(((az3) g).a);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.y.a(this.G);
            ix6 h = j45.h();
            if (h != null) {
                vr2 = h.e();
            } else {
                vr2 = null;
            }
            ix6 j = j45.j(h);
            z2 = false;
            while (i2 >= i) {
                try {
                    uy3 uy3 = (uy3) ((jp4) o).get(i2);
                    Object g2 = this.B.g(uy3);
                    g2.getClass();
                    az3 az3 = (az3) g2;
                    Object obj = az3.a;
                    if (((mp4) this.G.x).c(obj)) {
                        this.J++;
                        if (((Boolean) az3.g.getValue()).booleanValue()) {
                            yy3 yy3 = uy3.b0;
                            kh4 kh4 = yy3.p;
                            sy3 sy3 = sy3.y;
                            kh4.H = sy3;
                            jd4 jd4 = yy3.q;
                            if (jd4 != null) {
                                jd4.F = sy3;
                            }
                            l(az3, false);
                            if (az3.h) {
                                z2 = true;
                            }
                        }
                    } else {
                        uy3 uy32 = this.w;
                        uy32.L = true;
                        this.B.k(uy3);
                        py0 py0 = az3.c;
                        if (py0 != null) {
                            py0.o();
                        }
                        this.w.U(i2, 1);
                        uy32.L = false;
                    }
                    this.C.k(obj);
                    i2--;
                } catch (Throwable th) {
                    j45.m(h, j, vr2);
                    throw th;
                }
            }
            j45.m(h, j, vr2);
        } else {
            z2 = false;
        }
        if (z2) {
            synchronized (nx6.c) {
                up4 up4 = nx6.j.h;
                if (up4 != null && up4.h()) {
                    z3 = true;
                }
            }
            if (z3) {
                nx6.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((eq4) ((jp4) this.w.o()).x).y;
        int i2 = this.B.e;
        if (i2 != i) {
            yb3.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.J;
        int i4 = this.K;
        if ((i - i3) - i4 < 0) {
            StringBuilder p = pb4.p("Incorrect state. Total children ", i, ". Reusable children ", i3, ". Precomposed children ");
            p.append(i4);
            yb3.a(p.toString());
        }
        int i5 = this.F.e;
        int i6 = this.K;
        if (i5 != i6) {
            yb3.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
        }
    }

    public final void i(boolean z2) {
        vr2 vr2;
        int i = 0;
        this.K = 0;
        this.F.a();
        List o = this.w.o();
        int i2 = ((eq4) ((jp4) o).x).y;
        if (this.J != i2) {
            this.J = i2;
            ix6 h = j45.h();
            if (h != null) {
                vr2 = h.e();
            } else {
                vr2 = null;
            }
            ix6 j = j45.j(h);
            while (i < i2) {
                try {
                    uy3 uy3 = (uy3) ((jp4) o).get(i);
                    az3 az3 = (az3) this.B.g(uy3);
                    if (az3 != null && ((Boolean) az3.g.getValue()).booleanValue()) {
                        yy3 yy3 = uy3.b0;
                        kh4 kh4 = yy3.p;
                        sy3 sy3 = sy3.y;
                        kh4.H = sy3;
                        jd4 jd4 = yy3.q;
                        if (jd4 != null) {
                            jd4.F = sy3;
                        }
                        l(az3, z2);
                        az3.a = m67.a;
                    }
                    i++;
                } catch (Throwable th) {
                    j45.m(h, j, vr2);
                    throw th;
                }
            }
            j45.m(h, j, vr2);
            this.C.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        uy3 uy3 = this.w;
        uy3.L = true;
        uy3.N(i, i2, 1);
        uy3.L = false;
    }

    public final void k(Object obj, gs2 gs2, boolean z2) {
        uy3 uy3 = this.w;
        if (uy3.J()) {
            h();
            if (!this.C.c(obj)) {
                this.H.k(obj);
                tp4 tp4 = this.F;
                Object g = tp4.g(obj);
                if (g == null) {
                    g = n(obj);
                    if (g != null) {
                        j(((eq4) ((jp4) uy3.o()).x).i(g), ((eq4) ((jp4) uy3.o()).x).y);
                        this.K++;
                    } else {
                        int i = ((eq4) ((jp4) uy3.o()).x).y;
                        uy3 uy32 = new uy3(2);
                        uy3.L = true;
                        uy3.B(i, uy32);
                        uy3.L = false;
                        this.K++;
                        g = uy32;
                    }
                    tp4.m(obj, g);
                }
                m((uy3) g, obj, z2, gs2);
            }
        }
    }

    public final void l(az3 az3, boolean z2) {
        py0 py0;
        if (z2 || !az3.h) {
            az3.g = u55.p(Boolean.FALSE);
        } else {
            az3.g.setValue(Boolean.FALSE);
        }
        if (az3.f != null) {
            e(az3);
        } else if (z2) {
            py0 py02 = az3.c;
            if (py02 != null) {
                py02.n();
            }
        } else {
            f85 outOfFrameExecutor = ((je) xy3.a(this.w)).getOutOfFrameExecutor();
            if (outOfFrameExecutor != null) {
                ((je) outOfFrameExecutor).E(new kh(9, az3));
            } else if (!az3.h && (py0 = az3.c) != null) {
                py0.n();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, az3] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bb A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec A[Catch:{ all -> 0x0089 }] */
    public final void m(uy3 uy3, Object obj, boolean z2, gs2 gs2) {
        boolean z3;
        boolean z4;
        py0 py0;
        tp4 tp4 = this.B;
        Object g = tp4.g(uy3);
        vr2 vr2 = null;
        Object obj2 = g;
        if (g == null) {
            fw0 fw0 = yw0.a;
            ? obj3 = new Object();
            obj3.a = obj;
            obj3.b = fw0;
            obj3.c = null;
            obj3.g = u55.p(Boolean.TRUE);
            tp4.m(uy3, obj3);
            obj2 = obj3;
        }
        az3 az3 = (az3) obj2;
        if (az3.b != gs2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (az3.f != null) {
            if (z3) {
                e(az3);
            } else if (!z2) {
                d(az3, true);
            } else {
                return;
            }
        }
        py0 py02 = az3.c;
        if (py02 != null) {
            synchronized (py02.z) {
                if (py02.J.e > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
        } else {
            z4 = true;
        }
        if (z3 || z4 || az3.d) {
            az3.b = gs2;
            if (az3.f != null) {
                yb3.a("new subcompose call while paused composition is still active");
            }
            ix6 h = j45.h();
            if (h != null) {
                vr2 = h.e();
            }
            ix6 j = j45.j(h);
            try {
                uy3 uy32 = this.w;
                uy32.L = true;
                py0 py03 = az3.c;
                ky0 ky0 = this.x;
                if (ky0 != null) {
                    if (py03 != null) {
                        if (py03.x()) {
                        }
                        az3.c = py03;
                        gs2 gs22 = az3.b;
                        if (((je) xy3.a(this.w)).getOutOfFrameExecutor() == null) {
                            az3.h = false;
                        } else {
                            az3.h = true;
                            gs22 = new fw0(1524156494, new af(2, (Object) az3, (Object) gs22), true);
                        }
                        if (!z2) {
                            if (az3.e) {
                                py03.k();
                                py03.t();
                                az3.f = py03.m(true, gs22);
                            } else {
                                az3.f = py03.m(py03.k(), gs22);
                            }
                        } else if (az3.e) {
                            py03.k();
                            py03.t();
                            yt2 yt2 = py03.R;
                            yt2.z = 0;
                            yt2.y = true;
                            py03.w.a(py03, gs22);
                            if (yt2.F || yt2.z != 0) {
                                vm5.a("Cannot disable reuse from root if it was caused by other groups");
                            }
                            yt2.z = -1;
                            yt2.y = false;
                        } else {
                            py03.C(gs22);
                        }
                        az3.e = false;
                        uy32.L = false;
                        j45.m(h, j, vr2);
                        az3.d = false;
                        return;
                    }
                    if (z2) {
                        ViewGroup.LayoutParams layoutParams = bf8.a;
                        py0 = new py0(ky0, new gs7(uy3));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = bf8.a;
                        py0 = new py0(ky0, new gs7(uy3));
                    }
                    py03 = py0;
                    az3.c = py03;
                    gs2 gs222 = az3.b;
                    if (((je) xy3.a(this.w)).getOutOfFrameExecutor() == null) {
                    }
                    if (!z2) {
                    }
                    az3.e = false;
                    uy32.L = false;
                    j45.m(h, j, vr2);
                    az3.d = false;
                    return;
                }
                yb3.c("parent composition reference not set");
                throw new RuntimeException();
            } catch (Throwable th) {
                j45.m(h, j, vr2);
                throw th;
            }
        }
    }

    public final uy3 n(Object obj) {
        tp4 tp4;
        int i;
        az3 az3;
        if (this.J == 0) {
            return null;
        }
        jp4 jp4 = (jp4) this.w.o();
        int i2 = ((eq4) jp4.x).y - this.K;
        int i3 = i2 - this.J;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            tp4 = this.B;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object g = tp4.g((uy3) jp4.get(i5));
            g.getClass();
            if (sg3.e(((az3) g).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object g2 = tp4.g((uy3) jp4.get(i4));
                g2.getClass();
                az3 = (az3) g2;
                Object obj2 = az3.a;
                if (obj2 == m67.a || this.y.c(obj, obj2)) {
                    az3.a = obj;
                    i5 = i4;
                    i = i5;
                } else {
                    i4--;
                }
            }
            az3.a = obj;
            i5 = i4;
            i = i5;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.J--;
        uy3 uy3 = (uy3) jp4.get(i3);
        Object g3 = tp4.g(uy3);
        g3.getClass();
        az3 az32 = (az3) g3;
        az32.g = u55.p(Boolean.TRUE);
        az32.e = true;
        az32.d = true;
        return uy3;
    }
}
