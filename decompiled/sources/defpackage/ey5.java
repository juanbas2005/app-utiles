package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: ey5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ey5 implements vr2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ up4 B;
    public final /* synthetic */ List C;
    public final /* synthetic */ up4 D;
    public final /* synthetic */ Set E;
    public final /* synthetic */ gy5 w;
    public final /* synthetic */ up4 x;
    public final /* synthetic */ up4 y;
    public final /* synthetic */ List z;

    public /* synthetic */ ey5(gy5 gy5, up4 up4, up4 up42, List list, List list2, up4 up43, List list3, up4 up44, Set set) {
        this.w = gy5;
        this.x = up4;
        this.y = up42;
        this.z = list;
        this.A = list2;
        this.B = up43;
        this.C = list3;
        this.D = up44;
        this.E = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x015e, code lost:
        if (r2 == 8) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01e7, code lost:
        if (r4 == 8) goto L_0x01ee;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:178:0x0235=Splitter:B:178:0x0235, B:162:0x0217=Splitter:B:162:0x0217} */
    public final Object y(Object obj) {
        boolean D2;
        Object[] objArr;
        ix6 ix6;
        ix6 j;
        long j2;
        List list;
        List list2;
        List list3;
        up4 up4;
        Object[] objArr2;
        List list4;
        List list5;
        boolean z2;
        gy5 gy5 = this.w;
        up4 up42 = this.x;
        up4 up43 = this.y;
        List list6 = this.z;
        List list7 = this.A;
        up4 up44 = this.B;
        List list8 = this.C;
        up4 up45 = this.D;
        Set set = this.E;
        long longValue = ((Long) obj).longValue();
        synchronized (gy5.c) {
            D2 = gy5.D();
        }
        boolean z3 = false;
        if (D2) {
            Trace.beginSection("Recomposer:animation");
            try {
                ((o9) gy5.a.y).w(new hf(longValue, 1));
                synchronized (nx6.c) {
                    up4 up46 = nx6.j.h;
                    if (up46 == null || !up46.h()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                if (z2) {
                    nx6.a();
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        Trace.beginSection("Recomposer:recompose");
        try {
            gy5.O();
            synchronized (gy5.c) {
                eq4 eq4 = gy5.i;
                Object[] objArr3 = eq4.w;
                int i = eq4.y;
                for (int i2 = 0; i2 < i; i2++) {
                    list6.add((py0) objArr3[i2]);
                }
                gy5.i.g();
            }
            up42.b();
            up43.b();
            while (true) {
                if (list6.isEmpty()) {
                    if (list7.isEmpty()) {
                        break;
                    }
                }
                try {
                    int size = list6.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        py0 py0 = (py0) list6.get(i3);
                        py0 M = gy5.M(py0, up42);
                        if (M != null) {
                            list8.add(M);
                        }
                        up43.a(py0);
                    }
                    list6.clear();
                    if (up42.h() || gy5.i.y != 0) {
                        synchronized (gy5.c) {
                            List H = gy5.H();
                            int size2 = H.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                py0 py02 = (py0) H.get(i4);
                                if (!up43.c(py02) && py02.y(set)) {
                                    list6.add(py02);
                                }
                            }
                            eq4 eq42 = gy5.i;
                            int i5 = eq42.y;
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                objArr = eq42.w;
                                if (i6 >= i5) {
                                    break;
                                }
                                py0 py03 = (py0) objArr[i6];
                                if (!up43.c(py03) && !list6.contains(py03)) {
                                    list6.add(py03);
                                    i7++;
                                } else if (i7 > 0) {
                                    Object[] objArr4 = eq42.w;
                                    objArr4[i6 - i7] = objArr4[i6];
                                }
                                i6++;
                            }
                            int i8 = i5 - i7;
                            Arrays.fill(objArr, i8, i5, (Object) null);
                            eq42.y = i8;
                        }
                    }
                    if (list6.isEmpty()) {
                        try {
                            fy5.x(list7, gy5);
                            while (!list7.isEmpty()) {
                                List<Object> L = gy5.L(list7, up42);
                                up44.getClass();
                                for (Object k : L) {
                                    up44.k(k);
                                }
                                fy5.x(list7, gy5);
                            }
                        } catch (Throwable th2) {
                            gy5.N(th2, (py0) null);
                            fy5.v(gy5, list6, list7, list8, up44, up45, up42, up43);
                        }
                    }
                    z3 = false;
                } catch (Throwable th3) {
                    list6.clear();
                    throw th3;
                }
            }
            ix6 j3 = nx6.j();
            if (j3 instanceof yp4) {
                ix6 = new ym7((yp4) j3, (vr2) null, (vr2) null, true, false);
            } else {
                ix6 = new zm7(j3, (vr2) null, true, z3);
            }
            try {
                j = ix6.j();
                if (!list8.isEmpty()) {
                    int size3 = list8.size();
                    for (int i9 = z3; i9 < size3; i9++) {
                        up45.a((py0) list8.get(i9));
                    }
                    int size4 = list8.size();
                    for (int i10 = z3; i10 < size4; i10++) {
                        ((py0) list8.get(i10)).e();
                    }
                    list8.clear();
                }
                if (up44.h()) {
                    try {
                        up45.j(up44);
                        Object[] objArr5 = up44.b;
                        long[] jArr = up44.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            j2 = 255;
                            while (true) {
                                long j4 = jArr[i11];
                                list4 = list6;
                                list5 = list7;
                                if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if ((j4 & 255) < 128) {
                                            try {
                                                ((py0) objArr5[(i11 << 3) + i13]).g();
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        j4 >>= 8;
                                    }
                                }
                                if (i11 != length) {
                                    i11++;
                                    list6 = list4;
                                    list7 = list5;
                                }
                            }
                        } else {
                            list4 = list6;
                            list5 = list7;
                            j2 = 255;
                        }
                        up44.b();
                        list6 = list4;
                        list7 = list5;
                        break;
                    } catch (Throwable th5) {
                        th = th5;
                        list4 = list6;
                        list5 = list7;
                        gy5.N(th, (py0) null);
                        fy5.v(gy5, list4, list5, list8, up44, up45, up42, up43);
                        up44.b();
                        ix6.q(j);
                        ix6.c();
                        Trace.endSection();
                        return vs7.a;
                    }
                } else {
                    j2 = 255;
                }
                if (up45.h()) {
                    try {
                        Object[] objArr6 = up45.b;
                        long[] jArr2 = up45.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            list = list6;
                            list2 = list7;
                            int i14 = 0;
                            while (true) {
                                try {
                                    long j5 = jArr2[i14];
                                    list3 = list8;
                                    up4 = up44;
                                    if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j5 & j2) < 128) {
                                                try {
                                                    ((py0) objArr6[(i14 << 3) + i16]).i();
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    gy5.N(th, (py0) null);
                                                    fy5.v(gy5, list, list2, list3, up4, up45, up42, up43);
                                                    up45.b();
                                                    ix6.q(j);
                                                    ix6.c();
                                                    Trace.endSection();
                                                    return vs7.a;
                                                }
                                            }
                                            j5 >>= 8;
                                            i16++;
                                            objArr6 = objArr6;
                                        }
                                        objArr2 = objArr6;
                                    } else {
                                        objArr2 = objArr6;
                                    }
                                    if (i14 != length2) {
                                        i14++;
                                        up44 = up4;
                                        list8 = list3;
                                        objArr6 = objArr2;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    list3 = list8;
                                    up4 = up44;
                                    gy5.N(th, (py0) null);
                                    fy5.v(gy5, list, list2, list3, up4, up45, up42, up43);
                                    up45.b();
                                    ix6.q(j);
                                    ix6.c();
                                    Trace.endSection();
                                    return vs7.a;
                                }
                            }
                        }
                        up45.b();
                    } catch (Throwable th8) {
                        th = th8;
                        list = list6;
                        list2 = list7;
                        list3 = list8;
                        up4 = up44;
                        gy5.N(th, (py0) null);
                        fy5.v(gy5, list, list2, list3, up4, up45, up42, up43);
                        up45.b();
                        ix6.q(j);
                        ix6.c();
                        Trace.endSection();
                        return vs7.a;
                    }
                }
                ix6.q(j);
                ix6.c();
                synchronized (gy5.c) {
                    if (gy5.C() != null) {
                        ey0.a("unexpected to get continuation here");
                    }
                }
                nx6.j().m();
                up43.b();
                up42.b();
                gy5.q = null;
            } catch (Throwable th9) {
                ix6.c();
                throw th9;
            }
            Trace.endSection();
            return vs7.a;
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }
}
