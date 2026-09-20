package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: eu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eu2 implements Runnable {
    public static final ThreadLocal A = new ThreadLocal();
    public static final a91 B = new a91(14);
    public ArrayList w;
    public long x;
    public long y;
    public ArrayList z;

    public static lz5 c(RecyclerView recyclerView, int i, long j) {
        int N = recyclerView.A.N();
        for (int i2 = 0; i2 < N; i2++) {
            lz5 I = RecyclerView.I(recyclerView.A.M(i2));
            if (I.c == i && !I.f()) {
                return null;
            }
        }
        dz5 dz5 = recyclerView.x;
        try {
            recyclerView.P();
            lz5 j2 = dz5.j(j, i);
            if (j2 != null) {
                if (!j2.e() || j2.f()) {
                    dz5.a(j2, false);
                } else {
                    dz5.g(j2.a);
                }
            }
            return j2;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.M && this.x == 0) {
            this.x = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        tt2 tt2 = recyclerView.y0;
        tt2.b = i;
        tt2.c = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: du2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: du2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: du2} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void b(long j) {
        du2 du2;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        du2 du22;
        boolean z2;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            tt2 tt2 = recyclerView3.y0;
            if (windowVisibility == 0) {
                tt2.c(recyclerView3, false);
                i += tt2.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                tt2 tt22 = recyclerView4.y0;
                int abs = Math.abs(tt22.c) + Math.abs(tt22.b);
                for (int i5 = 0; i5 < tt22.d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        du22 = obj;
                    } else {
                        du22 = (du2) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) tt22.e;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    du22.a = z2;
                    du22.b = abs;
                    du22.c = i6;
                    du22.d = recyclerView4;
                    du22.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, B);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = du2.d) != null; i7++) {
            if ((du2 = (du2) arrayList.get(i7)).a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            lz5 c = c(recyclerView, du2.e, j2);
            if (!(c == null || c.b == null || !c.e() || c.f() || (recyclerView2 = (RecyclerView) c.b.get()) == null)) {
                if (recyclerView2.V && recyclerView2.A.N() != 0) {
                    dz5 dz5 = recyclerView2.x;
                    ty5 ty5 = recyclerView2.h0;
                    if (ty5 != null) {
                        ty5.e();
                    }
                    xy5 xy5 = recyclerView2.H;
                    if (xy5 != null) {
                        xy5.h0(dz5);
                        recyclerView2.H.i0(dz5);
                    }
                    dz5.a.clear();
                    dz5.e();
                }
                tt2 tt23 = recyclerView2.y0;
                tt23.c(recyclerView2, true);
                if (tt23.d != 0) {
                    try {
                        int i8 = uk7.a;
                        Trace.beginSection("RV Nested Prefetch");
                        iz5 iz5 = recyclerView2.z0;
                        py5 py5 = recyclerView2.G;
                        iz5.d = 1;
                        iz5.e = py5.a();
                        iz5.g = false;
                        iz5.h = false;
                        iz5.i = false;
                        for (int i9 = 0; i9 < tt23.d * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) tt23.e)[i9], j);
                        }
                        long j3 = j;
                        Trace.endSection();
                        du2.a = false;
                        du2.b = 0;
                        du2.c = 0;
                        du2.d = null;
                        du2.e = 0;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        int i10 = uk7.a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            long j4 = j;
            du2.a = false;
            du2.b = 0;
            du2.c = 0;
            du2.d = null;
            du2.e = 0;
        }
    }

    public final void run() {
        ArrayList arrayList = this.w;
        try {
            int i = uk7.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.y);
                }
            }
            this.x = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.x = 0;
            int i3 = uk7.a;
            Trace.endSection();
            throw th;
        }
    }
}
