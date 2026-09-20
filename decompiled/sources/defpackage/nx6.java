package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nx6 {
    public static final nf6 a = new nf6(23);
    public static final cf4 b = new cf4(18);
    public static final Object c = new Object();
    public static mx6 d;
    public static long e;
    public static final gk4 f;
    public static final ig g;
    public static List h;
    public static List i;
    public static final ew2 j;
    public static final yt k = new AtomicInteger(0);

    /* JADX WARNING: type inference failed for: r0v4, types: [gk4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r2v2, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [ew2, ix6, yp4] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.concurrent.atomic.AtomicInteger, yt] */
    static {
        mx6 mx6 = mx6.A;
        d = mx6;
        e = 2;
        ? obj = new Object();
        obj.c = new long[16];
        obj.d = new int[16];
        ? r2 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            r2[i2] = i3;
            i2 = i3;
        }
        obj.e = r2;
        f = obj;
        ig igVar = new ig(10, (byte) 0);
        igVar.c = new int[16];
        igVar.d = new o88[16];
        g = igVar;
        a42 a42 = a42.w;
        h = a42;
        i = a42;
        long j2 = e;
        e = 1 + j2;
        ? yp4 = new yp4(j2, mx6, (vr2) null, new vd2(7));
        d = d.n(yp4.b);
        j = yp4;
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, yp4 yp4, mx6 mx6) {
        mx6 mx62;
        long[] jArr;
        mx6 mx63;
        long[] jArr2;
        int i2;
        int i3;
        p37 s;
        up4 x = yp4.x();
        if (x != null) {
            long g2 = yp4.g();
            mx6 l = yp4.d().n(g2).l(yp4.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                n37 n37 = (n37) objArr[(i4 << 3) + i7];
                                p37 firstStateRecord = n37.getFirstStateRecord();
                                jArr2 = jArr3;
                                i3 = i5;
                                i2 = i7;
                                p37 s2 = s(firstStateRecord, j2, mx6);
                                if (s2 == null || (s = s(firstStateRecord, g2, l)) == null || s2.equals(s)) {
                                    mx63 = l;
                                } else {
                                    mx63 = l;
                                    p37 s3 = s(firstStateRecord, g2, yp4.d());
                                    if (s3 != null) {
                                        p37 mergeRecords = n37.mergeRecords(s, s2, s3);
                                        if (mergeRecords == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s2, mergeRecords);
                                        hashMap = hashMap;
                                    } else {
                                        r();
                                        throw null;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                mx63 = l;
                                i3 = i5;
                                i2 = i7;
                                long j4 = j2;
                            }
                            j3 >>= i3;
                            yp4 yp42 = yp4;
                            i7 = i2 + 1;
                            i5 = i3;
                            jArr3 = jArr2;
                            l = mx63;
                        }
                        jArr = jArr3;
                        mx62 = l;
                        int i8 = i5;
                        long j5 = j2;
                        if (i6 != i8) {
                            return hashMap;
                        }
                    } else {
                        long j6 = j2;
                        jArr = jArr3;
                        mx62 = l;
                    }
                    if (i4 == length) {
                        return hashMap;
                    }
                    i4++;
                    yp4 yp43 = yp4;
                    jArr3 = jArr;
                    l = mx62;
                }
            }
        }
        return null;
    }

    public static final void c(ix6 ix6) {
        yp4 yp4;
        Object obj;
        long j2;
        Long valueOf;
        if (!d.k(ix6.g())) {
            long g2 = ix6.g();
            boolean z = ix6.c;
            if (ix6 instanceof yp4) {
                yp4 = (yp4) ix6;
            } else {
                yp4 = null;
            }
            if (yp4 != null) {
                obj = Boolean.valueOf(yp4.m);
            } else {
                obj = "read-only";
            }
            synchronized (c) {
                gk4 gk4 = f;
                if (gk4.a > 0) {
                    j2 = ((long[]) gk4.c)[0];
                } else {
                    j2 = -1;
                }
                valueOf = Long.valueOf(j2);
            }
            throw new IllegalStateException(("Snapshot is not open: snapshotId=" + g2 + ", disposed=" + z + ", applied=" + obj + ", lowestPin=" + valueOf).toString());
        }
    }

    public static final mx6 d(mx6 mx6, long j2, long j3) {
        while (sg3.l(j2, j3) < 0) {
            mx6 = mx6.n(j2);
            j2++;
        }
        return mx6;
    }

    public static final Object e(vr2 vr2) {
        up4 up4;
        Object v;
        ew2 ew2 = j;
        synchronized (c) {
            try {
                up4 = ew2.h;
                if (up4 != null) {
                    k.addAndGet(1);
                }
                v = v(ew2, vr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (up4 != null) {
            try {
                List list = h;
                dg6 dg6 = new dg6(up4);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((gs2) list.get(i2)).H(dg6, ew2);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (up4 != null) {
                Object[] objArr = up4.b;
                long[] jArr = up4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((n37) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v;
    }

    public static final void f() {
        ig igVar = g;
        int i2 = igVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            o88 o88 = ((o88[]) igVar.d)[i3];
            if (o88 != null) {
                obj = o88.get();
            }
            if (obj != null && p((n37) obj)) {
                if (i4 != i3) {
                    ((o88[]) igVar.d)[i4] = o88;
                    int[] iArr = (int[]) igVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((o88[]) igVar.d)[i5] = null;
            ((int[]) igVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            igVar.b = i4;
        }
    }

    public static final ix6 g(ix6 ix6, vr2 vr2, boolean z) {
        yp4 yp4;
        boolean z2 = ix6 instanceof yp4;
        if (!z2 && ix6 != null) {
            return new zm7(ix6, vr2, false, z);
        }
        if (z2) {
            yp4 = (yp4) ix6;
        } else {
            yp4 = null;
        }
        return new ym7(yp4, vr2, (vr2) null, false, z);
    }

    public static final p37 h(p37 p37) {
        p37 s;
        ix6 j2 = j();
        p37 s2 = s(p37, j2.g(), j2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            ix6 j3 = j();
            s = s(p37, j3.g(), j3.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final p37 i(p37 p37, ix6 ix6) {
        p37 s;
        p37 s2 = s(p37, ix6.g(), ix6.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            s = s(p37, ix6.g(), ix6.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final ix6 j() {
        ix6 ix6 = (ix6) b.f();
        if (ix6 == null) {
            return j;
        }
        return ix6;
    }

    public static final vr2 k(vr2 vr2, vr2 vr22, boolean z) {
        if (!z) {
            vr22 = null;
        }
        if (vr2 != null && vr22 != null && vr2 != vr22) {
            return new m43(vr2, vr22, 1);
        }
        if (vr2 == null) {
            return vr22;
        }
        return vr2;
    }

    public static final vr2 l(vr2 vr2, vr2 vr22) {
        if (vr2 != null && vr22 != null && vr2 != vr22) {
            return new m43(vr2, vr22, 2);
        }
        if (vr2 == null) {
            return vr22;
        }
        return vr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r3 = r0;
     */
    public static final p37 m(p37 p37, n37 n37) {
        p37 firstStateRecord = n37.getFirstStateRecord();
        long j2 = e;
        gk4 gk4 = f;
        if (gk4.a > 0) {
            j2 = ((long[]) gk4.c)[0];
        }
        long j3 = j2 - 1;
        p37 p372 = null;
        p37 p373 = null;
        while (true) {
            if (firstStateRecord == null) {
                break;
            }
            long j4 = firstStateRecord.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && sg3.l(j4, j3) <= 0 && !mx6.A.k(j4)) {
                if (p373 == null) {
                    p373 = firstStateRecord;
                } else if (sg3.l(firstStateRecord.a, p373.a) >= 0) {
                    p372 = p373;
                }
            }
            firstStateRecord = firstStateRecord.b;
        }
        if (p372 != null) {
            p372.a = Long.MAX_VALUE;
            return p372;
        }
        p37 b2 = p37.b(Long.MAX_VALUE);
        b2.b = n37.getFirstStateRecord();
        n37.prependStateRecord(b2);
        return b2;
    }

    public static final void n(ix6 ix6, n37 n37) {
        ix6.t(ix6.h() + 1);
        vr2 i2 = ix6.i();
        if (i2 != null) {
            i2.y(n37);
        }
    }

    public static final p37 o(p37 p37, o37 o37, ix6 ix6, p37 p372) {
        p37 m;
        if (ix6.f()) {
            ix6.n(o37);
        }
        long g2 = ix6.g();
        if (p372.a == g2) {
            return p372;
        }
        synchronized (c) {
            m = m(p37, o37);
        }
        m.a = g2;
        if (p372.a != 1) {
            ix6.n(o37);
        }
        return m;
    }

    public static final boolean p(n37 n37) {
        p37 p37;
        long j2 = e;
        gk4 gk4 = f;
        if (gk4.a > 0) {
            j2 = ((long[]) gk4.c)[0];
        }
        p37 p372 = null;
        p37 p373 = null;
        int i2 = 0;
        for (p37 firstStateRecord = n37.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.b) {
            long j3 = firstStateRecord.a;
            if (j3 != 0) {
                if (sg3.l(j3, j2) >= 0) {
                    i2++;
                } else if (p372 == null) {
                    i2++;
                    p372 = firstStateRecord;
                } else {
                    if (sg3.l(firstStateRecord.a, p372.a) < 0) {
                        p37 = p372;
                        p372 = firstStateRecord;
                    } else {
                        p37 = firstStateRecord;
                    }
                    if (p373 == null) {
                        p373 = n37.getFirstStateRecord();
                        p37 p374 = p373;
                        while (true) {
                            if (p373 == null) {
                                p373 = p374;
                                break;
                            } else if (sg3.l(p373.a, j2) >= 0) {
                                break;
                            } else {
                                if (sg3.l(p374.a, p373.a) < 0) {
                                    p374 = p373;
                                }
                                p373 = p373.b;
                            }
                        }
                    }
                    p372.a = 0;
                    p372.a(p373);
                    p372 = p37;
                }
            }
        }
        if (i2 > 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r7 >= r4) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (((int[]) r0.c)[r7] == r2) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        r4 = -(r7 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r5 = ((defpackage.o88[]) r0.d)[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r5 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        r5 = r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if (r5 != r10) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r4 = -(r0.b + 1);
     */
    public static final void q(n37 n37) {
        Object obj;
        Object obj2;
        if (p(n37)) {
            ig igVar = g;
            int i2 = igVar.b;
            int identityHashCode = System.identityHashCode(n37);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = igVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) igVar.c)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        o88 o88 = ((o88[]) igVar.d)[i6];
                        if (o88 != null) {
                            obj = o88.get();
                        } else {
                            obj = null;
                        }
                        if (n37 != obj) {
                            int i8 = i6 - 1;
                            while (true) {
                                if (-1 >= i8 || ((int[]) igVar.c)[i8] != identityHashCode) {
                                    i6++;
                                    int i9 = igVar.b;
                                } else {
                                    o88 o882 = ((o88[]) igVar.d)[i8];
                                    if (o882 != null) {
                                        obj2 = o882.get();
                                    } else {
                                        obj2 = null;
                                    }
                                    if (obj2 == n37) {
                                        i3 = i8;
                                        break;
                                    }
                                    i8--;
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            o88[] o88Arr = (o88[]) igVar.d;
            int length = o88Arr.length;
            if (i2 == length) {
                int i11 = length * 2;
                o88[] o88Arr2 = new o88[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(o88Arr, i10, o88Arr2, i12, i2 - i10);
                System.arraycopy((o88[]) igVar.d, 0, o88Arr2, 0, i10);
                qs.J0(i12, i10, i2, (int[]) igVar.c, iArr);
                qs.M0(0, i10, 6, (int[]) igVar.c, iArr);
                igVar.d = o88Arr2;
                igVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(o88Arr, i10, o88Arr, i13, i2 - i10);
                int[] iArr2 = (int[]) igVar.c;
                qs.J0(i13, i10, i2, iArr2, iArr2);
            }
            ((o88[]) igVar.d)[i10] = new WeakReference(n37);
            ((int[]) igVar.c)[i10] = identityHashCode;
            igVar.b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final p37 s(p37 p37, long j2, mx6 mx6) {
        p37 p372 = null;
        while (p37 != null) {
            long j3 = p37.a;
            if (j3 != 0 && sg3.l(j3, j2) <= 0 && !mx6.k(j3) && (p372 == null || sg3.l(p372.a, p37.a) < 0)) {
                p372 = p37;
            }
            p37 = p37.b;
        }
        if (p372 != null) {
            return p372;
        }
        return null;
    }

    public static final p37 t(p37 p37, n37 n37) {
        p37 s;
        ix6 j2 = j();
        vr2 e2 = j2.e();
        if (e2 != null) {
            e2.y(n37);
        }
        p37 s2 = s(p37, j2.g(), j2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            ix6 j3 = j();
            p37 firstStateRecord = n37.getFirstStateRecord();
            firstStateRecord.getClass();
            s = s(firstStateRecord, j3.g(), j3.d());
            if (s == null) {
                r();
                throw null;
            }
        }
        return s;
    }

    public static final void u(int i2) {
        gk4 gk4 = f;
        int i3 = ((int[]) gk4.e)[i2];
        gk4.h(i3, gk4.a - 1);
        gk4.a--;
        long[] jArr = (long[]) gk4.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (sg3.l(jArr[i5], j2) <= 0) {
                break;
            }
            gk4.h(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) gk4.c;
        int i6 = gk4.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < gk4.a && sg3.l(jArr2[i7], jArr2[i8]) < 0) {
                if (sg3.l(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                gk4.h(i7, i3);
                i3 = i7;
            } else if (sg3.l(jArr2[i8], jArr2[i3]) >= 0) {
                break;
            } else {
                gk4.h(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) gk4.e)[i2] = gk4.b;
        gk4.b = i2;
    }

    public static final Object v(ew2 ew2, vr2 vr2) {
        long j2 = ew2.b;
        Object y = vr2.y(d.g(j2));
        long j3 = e;
        e = 1 + j3;
        mx6 g2 = d.g(j2);
        d = g2;
        ew2.b = j3;
        ew2.a = g2;
        ew2.g = 0;
        ew2.h = null;
        ew2.o();
        d = d.n(j3);
        return y;
    }

    public static final p37 w(p37 p37, n37 n37, ix6 ix6) {
        p37 s;
        p37 s2;
        if (ix6.f()) {
            ix6.n(n37);
        }
        long g2 = ix6.g();
        p37 s3 = s(p37, g2, ix6.d());
        if (s3 == null) {
            synchronized (c) {
                ix6 j2 = j();
                p37 firstStateRecord = n37.getFirstStateRecord();
                firstStateRecord.getClass();
                s2 = s(firstStateRecord, j2.g(), j2.d());
                if (s2 == null) {
                    r();
                    throw null;
                }
            }
            s3 = s2;
        }
        if (s3.a == ix6.g()) {
            return s3;
        }
        synchronized (c) {
            s = s(n37.getFirstStateRecord(), g2, ix6.d());
            if (s == null) {
                r();
                throw null;
            } else if (s.a != g2) {
                p37 m = m(s, n37);
                m.a(s);
                m.a = ix6.g();
                s = m;
            }
        }
        if (s3.a != 1) {
            ix6.n(n37);
        }
        return s;
    }
}
