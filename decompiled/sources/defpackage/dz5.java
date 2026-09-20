package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: dz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dz5 {
    public final ArrayList a;
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d;
    public int e;
    public int f;
    public cz5 g;
    public final /* synthetic */ RecyclerView h;

    public dz5(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(lz5 lz5, boolean z) {
        k4 k4Var;
        RecyclerView.j(lz5);
        View view = lz5.a;
        RecyclerView recyclerView = this.h;
        nz5 nz5 = recyclerView.G0;
        if (nz5 != null) {
            mz5 mz5 = nz5.A;
            if (mz5 != null) {
                k4Var = (k4) mz5.A.remove(view);
            } else {
                k4Var = null;
            }
            e58.m(view, k4Var);
        }
        if (z) {
            ArrayList arrayList = recyclerView.I;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ku4.a();
                return;
            } else if (recyclerView.z0 != null) {
                recyclerView.B.N(lz5);
            }
        }
        lz5.s = null;
        lz5.r = null;
        cz5 c2 = c();
        c2.getClass();
        int i = lz5.f;
        ArrayList arrayList2 = c2.a(i).a;
        if (((bz5) c2.a.get(i)).b > arrayList2.size()) {
            lz5.m();
            arrayList2.add(lz5);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        iz5 iz5 = recyclerView.z0;
        if (i < 0 || i >= iz5.b()) {
            StringBuilder o = pb4.o(i, "invalid position ", ". State item count is ");
            o.append(iz5.b());
            o.append(recyclerView.y());
            throw new IndexOutOfBoundsException(o.toString());
        } else if (!iz5.g) {
            return i;
        } else {
            return recyclerView.z.v(i, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, cz5] */
    public final cz5 c() {
        if (this.g == null) {
            ? obj = new Object();
            obj.a = new SparseArray();
            obj.b = 0;
            this.g = obj;
        }
        return this.g;
    }

    public final View d(int i) {
        return j(Long.MAX_VALUE, i).a;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.S0;
        tt2 tt2 = this.h.y0;
        int[] iArr2 = (int[]) tt2.e;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        tt2.d = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((lz5) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        lz5 I = RecyclerView.I(view);
        boolean j = I.j();
        RecyclerView recyclerView = this.h;
        if (j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I.i()) {
            I.n.k(I);
        } else if (I.p()) {
            I.j &= -33;
        }
        h(I);
        if (recyclerView.h0 != null && !I.g()) {
            recyclerView.h0.d(I);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ab  */
    public final void h(lz5 lz5) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.h;
        tt2 tt2 = recyclerView.y0;
        boolean i = lz5.i();
        View view = lz5.a;
        boolean z3 = false;
        boolean z4 = true;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(lz5.i());
            sb.append(" isAttached:");
            if (view.getParent() != null) {
                z3 = true;
            }
            sb.append(z3);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        } else if (lz5.j()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(lz5);
            h.n(sb2, recyclerView.y());
        } else if (!lz5.o()) {
            if ((lz5.j & 16) == 0) {
                WeakHashMap weakHashMap = e58.a;
                if (view.hasTransientState()) {
                    z = true;
                    if (!lz5.g()) {
                        if (this.f <= 0 || (lz5.j & 526) != 0) {
                            z2 = false;
                        } else {
                            ArrayList arrayList = this.c;
                            int size = arrayList.size();
                            if (size >= this.f && size > 0) {
                                f(0);
                                size--;
                            }
                            int[] iArr = RecyclerView.S0;
                            if (size > 0) {
                                int i2 = lz5.c;
                                if (((int[]) tt2.e) != null) {
                                    int i3 = tt2.d * 2;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= i3) {
                                            break;
                                        } else if (((int[]) tt2.e)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                }
                                int i5 = size - 1;
                                loop1:
                                while (i5 >= 0) {
                                    int i6 = ((lz5) arrayList.get(i5)).c;
                                    if (((int[]) tt2.e) == null) {
                                        break;
                                    }
                                    int i7 = tt2.d * 2;
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if (((int[]) tt2.e)[i8] == i6) {
                                            i5--;
                                        } else {
                                            i8 += 2;
                                        }
                                    }
                                    break loop1;
                                }
                                size = i5 + 1;
                            }
                            arrayList.add(size, lz5);
                            z2 = true;
                        }
                        if (!z2) {
                            a(lz5, true);
                        } else {
                            z4 = false;
                        }
                        z3 = z2;
                    } else {
                        z4 = false;
                    }
                    recyclerView.B.N(lz5);
                    if (!z3 && !z4 && z) {
                        lz5.s = null;
                        lz5.r = null;
                        return;
                    }
                    return;
                }
            }
            z = false;
            if (!lz5.g()) {
            }
            recyclerView.B.N(lz5);
            if (!z3) {
            }
        } else {
            h.q("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.y()));
        }
    }

    public final void i(View view) {
        ty5 ty5;
        lz5 I = RecyclerView.I(view);
        int i = I.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && I.k() && (ty5 = recyclerView.h0) != null) {
            jm1 jm1 = (jm1) ty5;
            if (I.c().isEmpty() && jm1.g && !I.f()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                I.n = this;
                I.o = true;
                this.b.add(I);
                return;
            }
        }
        if (!I.f() || I.h() || recyclerView.G.b) {
            I.n = this;
            I.o = false;
            this.a.add(I);
            return;
        }
        h.q("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.y()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: lz5} */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bf, code lost:
        if (r10.f != 0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0431, code lost:
        if ((r13 + r11) >= r27) goto L_0x0408;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    public final lz5 j(long j, int i) {
        lz5 lz5;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        yy5 yy5;
        boolean z5;
        k4 k4Var;
        int i2;
        lz5 lz52;
        int i3;
        lz5 lz53;
        View view;
        lz5 lz54;
        int i4;
        boolean z6;
        lz5 lz55;
        int size;
        int v;
        int i5 = i;
        RecyclerView recyclerView = this.h;
        iz5 iz5 = recyclerView.z0;
        if (i5 < 0 || i5 >= iz5.b()) {
            StringBuilder p = pb4.p("Invalid item position ", i5, "(", i5, "). Item count:");
            p.append(iz5.b());
            p.append(recyclerView.y());
            throw new IndexOutOfBoundsException(p.toString());
        }
        if (iz5.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        lz5 = (lz5) this.b.get(i6);
                        if (!lz5.p() && lz5.b() == i5) {
                            lz5.a(32);
                            break;
                        }
                        i6++;
                    } else if (recyclerView.G.b && (v = recyclerView.z.v(i5, 0)) > 0 && v < recyclerView.G.a()) {
                        long b2 = recyclerView.G.b(v);
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                break;
                            }
                            lz5 lz56 = (lz5) this.b.get(i7);
                            if (!lz56.p() && lz56.e == b2) {
                                lz56.a(32);
                                lz5 = lz56;
                                break;
                            }
                            i7++;
                        }
                    }
                }
                if (lz5 != null) {
                    z = true;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (lz5 != null) {
                        int size2 = arrayList2.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                ArrayList arrayList4 = (ArrayList) recyclerView.A.z;
                                int size3 = arrayList4.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size3) {
                                        z2 = true;
                                        view = null;
                                        break;
                                    }
                                    view = (View) arrayList4.get(i9);
                                    lz5 I = RecyclerView.I(view);
                                    z2 = true;
                                    if (I.b() == i5 && !I.f() && !I.h()) {
                                        break;
                                    }
                                    i9++;
                                }
                                if (view == null) {
                                    int size4 = arrayList3.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= size4) {
                                            lz54 = null;
                                            break;
                                        }
                                        lz5 lz57 = (lz5) arrayList3.get(i10);
                                        if (!lz57.f() && lz57.b() == i5 && !lz57.d()) {
                                            arrayList3.remove(i10);
                                            lz54 = lz57;
                                            break;
                                        }
                                        i10++;
                                    }
                                } else {
                                    lz5 I2 = RecyclerView.I(view);
                                    wr0 wr0 = recyclerView.A;
                                    cp0 cp0 = (cp0) wr0.y;
                                    int indexOfChild = ((RecyclerView) ((ay4) wr0.x).x).indexOfChild(view);
                                    if (indexOfChild < 0) {
                                        kj6.o("view is not a child, cannot hide ", view);
                                        return null;
                                    } else if (cp0.d(indexOfChild)) {
                                        cp0.a(indexOfChild);
                                        wr0.i0(view);
                                        wr0 wr02 = recyclerView.A;
                                        cp0 cp02 = (cp0) wr02.y;
                                        int indexOfChild2 = ((RecyclerView) ((ay4) wr02.x).x).indexOfChild(view);
                                        if (indexOfChild2 != -1 && !cp02.d(indexOfChild2)) {
                                            i4 = indexOfChild2 - cp02.b(indexOfChild2);
                                        } else {
                                            i4 = -1;
                                        }
                                        if (i4 != -1) {
                                            recyclerView.A.y(i4);
                                            i(view);
                                            I2.a(8224);
                                            lz54 = I2;
                                        } else {
                                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                            sb.append(I2);
                                            rf2.m(sb, recyclerView.y());
                                            return null;
                                        }
                                    } else {
                                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                    }
                                }
                            } else {
                                lz55 = (lz5) arrayList2.get(i8);
                                if (lz55.p() || lz55.b() != i5 || lz55.f() || (!iz5.g && lz55.h())) {
                                    i8++;
                                }
                            }
                        }
                        lz55.a(32);
                        lz54 = lz55;
                        z2 = true;
                        if (lz5 != null) {
                            if (lz5.h()) {
                                z6 = iz5.g;
                            } else {
                                int i11 = lz5.c;
                                if (i11 < 0 || i11 >= recyclerView.G.a()) {
                                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + lz5 + recyclerView.y());
                                }
                                if (!iz5.g) {
                                    recyclerView.G.getClass();
                                }
                                py5 py5 = recyclerView.G;
                                if (!py5.b || lz5.e == py5.b(lz5.c)) {
                                    z6 = z2;
                                }
                                z6 = false;
                            }
                            if (!z6) {
                                lz5.a(4);
                                if (lz5.i()) {
                                    recyclerView.removeDetachedView(lz5.a, false);
                                    lz5.n.k(lz5);
                                } else if (lz5.p()) {
                                    lz5.j &= -33;
                                }
                                h(lz5);
                                lz5 = null;
                            } else {
                                z = z2;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    if (lz5 != null) {
                        int v2 = recyclerView.z.v(i5, 0);
                        if (v2 >= 0) {
                            j3 = 3;
                            if (v2 < recyclerView.G.a()) {
                                recyclerView.G.getClass();
                                py5 py52 = recyclerView.G;
                                if (py52.b) {
                                    long b3 = py52.b(v2);
                                    int size5 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size5 >= 0) {
                                            j2 = 4;
                                            lz5 lz58 = arrayList2.get(size5);
                                            i3 = v2;
                                            long j4 = lz58.e;
                                            View view2 = lz58.a;
                                            if (j4 == b3 && !lz58.p()) {
                                                if (lz58.f == 0) {
                                                    lz58.a(32);
                                                    if (lz58.h() && !iz5.g) {
                                                        lz58.j = (lz58.j & -15) | 2;
                                                    }
                                                    lz53 = lz58;
                                                } else {
                                                    arrayList2.remove(size5);
                                                    recyclerView.removeDetachedView(view2, false);
                                                    lz5 I3 = RecyclerView.I(view2);
                                                    I3.n = null;
                                                    I3.o = false;
                                                    I3.j &= -33;
                                                    h(I3);
                                                }
                                            }
                                            size5--;
                                            v2 = i3;
                                        } else {
                                            i3 = v2;
                                            j2 = 4;
                                            int size6 = arrayList3.size() - 1;
                                            while (true) {
                                                if (size6 < 0) {
                                                    break;
                                                }
                                                lz5 lz59 = (lz5) arrayList3.get(size6);
                                                if (lz59.e != b3 || lz59.d()) {
                                                    size6--;
                                                } else if (lz59.f == 0) {
                                                    arrayList3.remove(size6);
                                                    lz53 = lz59;
                                                } else {
                                                    f(size6);
                                                }
                                            }
                                            lz53 = null;
                                        }
                                    }
                                    if (lz5 != null) {
                                        lz5.c = i3;
                                        z = z2;
                                    }
                                } else {
                                    j2 = 4;
                                }
                                if (lz5 == null) {
                                    bz5 bz5 = (bz5) c().a.get(0);
                                    if (bz5 != null) {
                                        ArrayList arrayList5 = bz5.a;
                                        if (!arrayList5.isEmpty()) {
                                            int size7 = arrayList5.size() - 1;
                                            while (true) {
                                                if (size7 < 0) {
                                                    break;
                                                } else if (!((lz5) arrayList5.get(size7)).d()) {
                                                    lz52 = (lz5) arrayList5.remove(size7);
                                                    break;
                                                } else {
                                                    size7--;
                                                }
                                            }
                                        }
                                    }
                                    lz52 = null;
                                    if (lz52 != null) {
                                        lz52.m();
                                        int[] iArr = RecyclerView.S0;
                                    }
                                    lz5 = lz52;
                                }
                                if (lz5 == null) {
                                    long nanoTime = recyclerView.getNanoTime();
                                    if (j != Long.MAX_VALUE) {
                                        long j5 = this.g.a(0).c;
                                        if (j5 != 0 && j5 + nanoTime >= j) {
                                            return null;
                                        }
                                    }
                                    py5 py53 = recyclerView.G;
                                    py53.getClass();
                                    try {
                                        int i12 = uk7.a;
                                        Trace.beginSection("RV CreateView");
                                        lz5 = py53.d(recyclerView);
                                        View view3 = lz5.a;
                                        if (view3.getParent() == null) {
                                            lz5.f = 0;
                                            Trace.endSection();
                                            int[] iArr2 = RecyclerView.S0;
                                            RecyclerView D = RecyclerView.D(view3);
                                            if (D != null) {
                                                lz5.b = new WeakReference(D);
                                            }
                                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                            bz5 a2 = this.g.a(0);
                                            long j6 = a2.c;
                                            if (j6 != 0) {
                                                nanoTime2 = (nanoTime2 / j2) + ((j6 / j2) * 3);
                                            }
                                            a2.c = nanoTime2;
                                        } else {
                                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                        }
                                    } catch (Throwable th) {
                                        int i13 = uk7.a;
                                        Trace.endSection();
                                        throw th;
                                    }
                                }
                            }
                        }
                        StringBuilder p2 = pb4.p("Inconsistency detected. Invalid item position ", i5, "(offset:", v2, ").state:");
                        p2.append(iz5.b());
                        p2.append(recyclerView.y());
                        throw new IndexOutOfBoundsException(p2.toString());
                    }
                    j3 = 3;
                    j2 = 4;
                    View view4 = lz5.a;
                    if (z && !iz5.g) {
                        i2 = lz5.j;
                        if ((i2 & 8192) != 0) {
                            lz5.j = i2 & -8193;
                            if (iz5.j) {
                                ty5.b(lz5);
                                ty5 ty5 = recyclerView.h0;
                                lz5.c();
                                ty5.getClass();
                                dv5 dv5 = new dv5(8, (byte) 0);
                                dv5.a(lz5);
                                recyclerView.T(lz5, dv5);
                            }
                        }
                    }
                    if (iz5.g && lz5.e()) {
                        lz5.g = i5;
                    } else if (!lz5.e() || (lz5.j & 2) != 0 || lz5.f()) {
                        int v3 = recyclerView.z.v(i5, 0);
                        lz5.s = null;
                        lz5.r = recyclerView;
                        int i14 = lz5.f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j7 = this.g.a(i14).d;
                            if (j7 != 0) {
                            }
                        }
                        py5 py54 = recyclerView.G;
                        py54.getClass();
                        if (lz5.s == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            lz5.c = v3;
                            if (py54.b) {
                                lz5.e = py54.b(v3);
                            }
                            lz5.j = (lz5.j & -520) | 1;
                            int i15 = uk7.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        lz5.s = py54;
                        lz5.c();
                        py54.c(lz5, v3);
                        if (z5) {
                            ArrayList arrayList6 = lz5.k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            lz5.j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof yy5) {
                                ((yy5) layoutParams2).c = z2;
                            }
                            int i16 = uk7.a;
                            Trace.endSection();
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        bz5 a3 = this.g.a(lz5.f);
                        long j8 = a3.d;
                        if (j8 != 0) {
                            nanoTime4 = (nanoTime4 / j2) + ((j8 / j2) * j3);
                        }
                        a3.d = nanoTime4;
                        AccessibilityManager accessibilityManager = recyclerView.U;
                        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                            z3 = true;
                        } else {
                            WeakHashMap weakHashMap = e58.a;
                            z3 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            nz5 nz5 = recyclerView.G0;
                            if (nz5 != null) {
                                mz5 mz5 = nz5.A;
                                if (mz5 != null) {
                                    View.AccessibilityDelegate d2 = e58.d(view4);
                                    if (d2 == null) {
                                        k4Var = null;
                                    } else if (d2 instanceof j4) {
                                        k4Var = ((j4) d2).a;
                                    } else {
                                        k4Var = new k4(d2);
                                    }
                                    if (!(k4Var == null || k4Var == mz5)) {
                                        mz5.A.put(view4, k4Var);
                                    }
                                }
                                e58.m(view4, mz5);
                            }
                        }
                        if (iz5.g) {
                            lz5.g = i5;
                        }
                        z4 = z3;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams == null) {
                            yy5 = (yy5) recyclerView.generateDefaultLayoutParams();
                            view4.setLayoutParams(yy5);
                        } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                            yy5 = (yy5) recyclerView.generateLayoutParams(layoutParams);
                            view4.setLayoutParams(yy5);
                        } else {
                            yy5 = (yy5) layoutParams;
                        }
                        yy5.a = lz5;
                        if (!z || !z4) {
                            z3 = false;
                        }
                        yy5.d = z3;
                        return lz5;
                    }
                    z4 = false;
                    z3 = z2;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    yy5.a = lz5;
                    z3 = false;
                    yy5.d = z3;
                    return lz5;
                }
            }
            lz5 = null;
            if (lz5 != null) {
            }
        } else {
            lz5 = null;
        }
        z = false;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (lz5 != null) {
        }
        if (lz5 != null) {
        }
        View view42 = lz5.a;
        i2 = lz5.j;
        if ((i2 & 8192) != 0) {
        }
        if (iz5.g || lz5.e()) {
        }
        z4 = false;
        z3 = z2;
        layoutParams = view42.getLayoutParams();
        if (layoutParams == null) {
        }
        yy5.a = lz5;
        z3 = false;
        yy5.d = z3;
        return lz5;
    }

    public final void k(lz5 lz5) {
        if (lz5.o) {
            this.b.remove(lz5);
        } else {
            this.a.remove(lz5);
        }
        lz5.n = null;
        lz5.o = false;
        lz5.j &= -33;
    }

    public final void l() {
        int i;
        xy5 xy5 = this.h.H;
        if (xy5 != null) {
            i = xy5.j;
        } else {
            i = 0;
        }
        this.f = this.e + i;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
