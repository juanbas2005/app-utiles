package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tn5 implements s24 {
    public final int a;
    public final cf4 b;
    public final vr2 c;
    public k31 d;
    public n67 e;
    public hz3 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public sn5 l;
    public boolean m;
    public long n;
    public long o;
    public long p = wl4.a();
    public boolean q;
    public final /* synthetic */ l90 r;

    public tn5(l90 l90, int i2, cf4 cf4, vr2 vr2) {
        this.r = l90;
        this.a = i2;
        this.b = cf4;
        this.c = vr2;
    }

    public final void a() {
        this.m = true;
    }

    public final void b() {
        ze5 ze5;
        hz3 hz3 = this.f;
        if (hz3 != null) {
            switch (hz3.a) {
                case b85.b:
                    break;
                default:
                    az3 b2 = hz3.b();
                    if (b2 != null) {
                        ze5 = b2.f;
                    } else {
                        ze5 = null;
                    }
                    if (ze5 != null) {
                        iz3.c(hz3.b, hz3.c);
                        break;
                    }
                    break;
            }
        }
        this.f = null;
        n67 n67 = this.e;
        if (n67 != null) {
            n67.b();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(xh xhVar) {
        boolean z;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                z = d(xhVar);
            } finally {
                Trace.endSection();
            }
        } else {
            z = d(xhVar);
        }
        ag8.L(-1, "compose:lazy:prefetch:execute:item");
        return z;
    }

    public final void cancel() {
        if (!this.h) {
            this.h = true;
            b();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r9v15, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r9v30, types: [d20, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0201 A[SYNTHETIC, Splitter:B:122:0x0201] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x01fd A[SYNTHETIC] */
    public final boolean d(xh xhVar) {
        long j2;
        int i2;
        boolean z;
        tn5 tn5;
        List list;
        sn5 sn5;
        n67 n67;
        int i3 = this.a;
        long j3 = (long) i3;
        ag8.L(j3, "compose:lazy:prefetch:execute:item");
        h24 h24 = (h24) ((g24) this.r.b).b.b();
        if (!this.h) {
            int a2 = h24.a();
            if (i3 >= 0 && i3 < a2) {
                Object b2 = h24.b(i3);
                Object obj = this.j;
                if (obj == null || b2.equals(obj)) {
                    Object c2 = h24.c(i3);
                    cf4 cf4 = this.b;
                    d20 d20 = (d20) cf4.y;
                    if (cf4.z != c2 || d20 == null) {
                        tp4 tp4 = (tp4) cf4.x;
                        Object g2 = tp4.g(c2);
                        Object obj2 = g2;
                        if (g2 == null) {
                            ? obj3 = new Object();
                            obj3.e = -1;
                            tp4.m(c2, obj3);
                            obj2 = obj3;
                        }
                        d20 = (d20) obj2;
                        cf4.z = c2;
                        cf4.y = d20;
                    }
                    e();
                    long a3 = xhVar.a();
                    this.n = a3;
                    this.p = wl4.a();
                    this.o = 0;
                    ag8.L(a3, "compose:lazy:prefetch:available_time_nanos");
                    if (!e()) {
                        j2 = 0;
                        if (g(this.n, d20.a + d20.b)) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                f(b2, c2, d20);
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (!e()) {
                            return true;
                        }
                    } else {
                        j2 = 0;
                    }
                    if (this.f != null) {
                        if (!g(this.n, d20.c)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            hz3 hz3 = this.f;
                            if (hz3 != null) {
                                switch (hz3.a) {
                                    case b85.b:
                                        n67 = hz3.b.f(hz3.c);
                                        break;
                                    default:
                                        iz3 iz3 = hz3.b;
                                        az3 b3 = hz3.b();
                                        if (b3 != null) {
                                            iz3.d(b3, false);
                                        }
                                        n67 = iz3.f(hz3.c);
                                        break;
                                }
                                this.e = n67;
                                this.f = null;
                                this.i = true;
                                Trace.endSection();
                                h();
                                d20.c = d20.a(this.o, d20.c);
                            } else {
                                throw new IllegalArgumentException("Nothing to apply!");
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!this.k) {
                        if (this.n <= j2) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            n67 n672 = this.e;
                            if (n672 != null) {
                                ? obj4 = new Object();
                                n672.a(new mr0(2, obj4));
                                List list2 = (List) obj4.w;
                                if (list2 != null) {
                                    sn5 = new sn5(this, list2);
                                } else {
                                    sn5 = null;
                                }
                                this.l = sn5;
                                this.k = true;
                            } else {
                                throw f21.p("Should precompose before resolving nested prefetch states");
                            }
                        } finally {
                            Trace.endSection();
                        }
                    }
                    sn5 sn52 = this.l;
                    if (sn52 != null) {
                        int i4 = d20.e;
                        boolean z2 = this.m;
                        List[] listArr = sn52.b;
                        int i5 = sn52.c;
                        List list3 = sn52.a;
                        if (i5 < list3.size()) {
                            if (sn52.f.h) {
                                bc3.c("Should not execute nested prefetch on canceled request");
                            }
                            Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                            try {
                                int size = list3.size();
                                for (int i6 = 0; i6 < size; i6++) {
                                    ((t24) list3.get(i6)).d = i4;
                                }
                                Trace.endSection();
                                Trace.beginSection("compose:lazy:prefetch:nested");
                                while (sn52.c < list3.size()) {
                                    try {
                                        if (listArr[sn52.c] == null) {
                                            if (xhVar.a() <= j2) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i7 = sn52.c;
                                            t24 t24 = (t24) list3.get(i7);
                                            vr2 vr2 = t24.a;
                                            if (vr2 == null) {
                                                list = a42.w;
                                            } else {
                                                r24 r24 = new r24(t24, t24.d);
                                                vr2.y(r24);
                                                ArrayList arrayList = r24.b;
                                                t24.f = arrayList.size();
                                                list = arrayList;
                                            }
                                            listArr[i7] = list;
                                        }
                                        List list4 = listArr[sn52.c];
                                        list4.getClass();
                                        while (sn52.d < list4.size()) {
                                            tn5 tn52 = (tn5) list4.get(sn52.d);
                                            if (z2) {
                                                if (tn52 != null) {
                                                    tn5 = tn52;
                                                } else {
                                                    tn5 = null;
                                                }
                                                if (tn5 != null) {
                                                    z = true;
                                                    tn5.m = true;
                                                    sn52.e = z;
                                                    if (!tn52.c(xhVar)) {
                                                        return z;
                                                    }
                                                    sn52.d += z ? 1 : 0;
                                                }
                                            }
                                            z = true;
                                            sn52.e = z;
                                            if (!tn52.c(xhVar)) {
                                            }
                                        }
                                        xh xhVar2 = xhVar;
                                        sn52.d = 0;
                                        sn52.c++;
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                Trace.endSection();
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                    }
                    sn5 sn53 = this.l;
                    if (sn53 != null && sn53.e) {
                        h();
                        ag8.L(j3, "compose:lazy:prefetch:execute:item");
                        sn5 sn54 = this.l;
                        if (sn54 != null) {
                            sn54.e = false;
                        }
                    }
                    k31 k31 = this.d;
                    if (!this.g && k31 != null) {
                        if (!g(this.n, d20.d)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            long j4 = k31.a;
                            if (this.h) {
                                bc3.a("Callers should check whether the request is still valid before calling performMeasure()");
                            }
                            if (this.g) {
                                bc3.a("Request was already measured!");
                            }
                            this.g = true;
                            n67 n673 = this.e;
                            if (n673 != null) {
                                int d2 = n673.d();
                                for (int i8 = 0; i8 < d2; i8++) {
                                    n673.e(j4, i8);
                                }
                                Trace.endSection();
                                h();
                                d20.d = d20.a(this.o, d20.d);
                                vr2 vr22 = this.c;
                                if (vr22 != null) {
                                    vr22.y(this);
                                }
                            } else {
                                throw f21.p("performComposition() must be called before performMeasure()");
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    sn5 sn55 = this.l;
                    if (this.g && this.k && sn55 != null) {
                        List list5 = sn55.a;
                        int size2 = list5.size();
                        int i9 = Integer.MAX_VALUE;
                        for (int i10 = 0; i10 < size2; i10++) {
                            i9 = Math.min(i9, ((t24) list5.get(i10)).e);
                        }
                        if (i9 == Integer.MAX_VALUE) {
                            i9 = 0;
                        }
                        int i11 = d20.e;
                        if (i11 == -1) {
                            i2 = i9;
                        } else {
                            i2 = ((i11 * 3) + i9) / 4;
                        }
                        d20.e = i2;
                        int size3 = list5.size();
                        int i12 = Integer.MAX_VALUE;
                        for (int i13 = 0; i13 < size3; i13++) {
                            i12 = Math.min(i12, ((t24) list5.get(i13)).f);
                        }
                        if (i12 == Integer.MAX_VALUE) {
                            i12 = 0;
                        }
                        if (i12 < i9) {
                            d20.d = j2;
                        }
                    }
                    return false;
                }
                b();
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        hz3 hz3;
        if (this.i || ((hz3 = this.f) != null && hz3.c())) {
            return true;
        }
        return false;
    }

    public final void f(Object obj, Object obj2, d20 d20) {
        ze5 ze5;
        hz3 hz3;
        hz3 hz32 = this.f;
        if (hz32 == null) {
            l90 l90 = this.r;
            gs2 a2 = ((g24) l90.b).a(this.a, obj, obj2);
            iz3 a3 = ((p67) l90.c).a();
            if (!a3.w.J()) {
                hz3 = new hz3(a3, obj, 0);
            } else {
                a3.k(obj, a2, true);
                hz3 = new hz3(a3, obj, 1);
            }
            hz32 = hz3;
            this.f = hz32;
            this.j = obj;
        }
        this.q = false;
        while (!hz32.c() && !this.q) {
            yv0 yv0 = new yv0(12, (Object) this, (Object) d20);
            switch (hz32.a) {
                case b85.b:
                    break;
                default:
                    az3 b2 = hz32.b();
                    vr2 vr2 = null;
                    if (b2 != null) {
                        ze5 = b2.f;
                    } else {
                        ze5 = null;
                    }
                    if (ze5 != null && !ze5.c()) {
                        ix6 h2 = j45.h();
                        if (h2 != null) {
                            vr2 = h2.e();
                        }
                        ix6 j2 = j45.j(h2);
                        try {
                            ze5.e(yv0);
                            j45.m(h2, j2, vr2);
                            break;
                        } catch (Throwable th) {
                            j45.m(h2, j2, vr2);
                            throw th;
                        }
                    }
            }
        }
        h();
        boolean z = this.q;
        long j3 = this.o;
        if (z) {
            d20.b = d20.a(j3, d20.b);
        } else {
            d20.a = d20.a(j3, d20.a);
        }
    }

    public final boolean g(long j2, long j3) {
        if (this.m) {
            j3 = 0;
        }
        if (j2 > j3) {
            return true;
        }
        return false;
    }

    public final void h() {
        long j2;
        long a2 = wl4.a();
        long j3 = this.p;
        long j4 = Long.MAX_VALUE;
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            if (a2 == j3) {
                xb4 xb4 = u02.x;
                j2 = 0;
            } else {
                j2 = u02.l(r16.V(j3));
            }
        } else if ((1 | (a2 - 1)) == Long.MAX_VALUE) {
            j2 = r16.V(a2);
        } else {
            j2 = r16.e0(a2, j3);
        }
        long j5 = j2 >> 1;
        xb4 xb42 = u02.x;
        if ((((int) j2) & 1) == 0) {
            j4 = j5;
        } else if (j5 <= 9223372036854L) {
            if (j5 < -9223372036854L) {
                j4 = Long.MIN_VALUE;
            } else {
                j4 = j5 * 1000000;
            }
        }
        this.o = j4;
        long j6 = this.n - j4;
        this.n = j6;
        this.p = a2;
        ag8.L(j6, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        k31 k31 = this.d;
        boolean e2 = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(k31);
        sb.append(", isComposed = ");
        pb4.s(sb, e2, ", isMeasured = ", z, ", isCanceled = ");
        sb.append(z2);
        sb.append(" }");
        return sb.toString();
    }
}
