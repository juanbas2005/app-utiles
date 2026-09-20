package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: yp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class yp4 extends ix6 {
    public static final int[] n = new int[0];
    public final vr2 e;
    public final vr2 f;
    public int g;
    public up4 h;
    public ArrayList i;
    public mx6 j = mx6.A;
    public int[] k = n;
    public int l = 1;
    public boolean m;

    public yp4(long j2, mx6 mx6, vr2 vr2, vr2 vr22) {
        super(j2, mx6);
        this.e = vr2;
        this.f = vr22;
    }

    public final void A(long j2) {
        synchronized (nx6.c) {
            this.j = this.j.n(j2);
        }
    }

    public void B(up4 up4) {
        this.h = up4;
    }

    /* JADX INFO: finally extract failed */
    public yp4 C(vr2 vr2, vr2 vr22) {
        rx4 rx4;
        if (this.c) {
            vm5.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            vm5.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = nx6.c;
        synchronized (obj) {
            try {
                long j2 = nx6.e;
                nx6.e = j2 + 1;
                nx6.d = nx6.d.n(j2);
                mx6 d = d();
                r(d.n(j2));
                rx4 = new rx4(j2, nx6.d(d, g() + 1, j2), nx6.k(vr2, e(), true), nx6.l(vr22, i()), this);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.m || this.c) {
            return rx4;
        }
        long g2 = g();
        synchronized (obj) {
            try {
                long j3 = nx6.e;
                nx6.e = j3 + 1;
                s(j3);
                nx6.d = nx6.d.n(g());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r(nx6.d(d(), g2 + 1, g()));
        return rx4;
    }

    public final void b() {
        nx6.d = nx6.d.g(g()).f(this.j);
    }

    public void c() {
        if (!this.c) {
            this.c = true;
            synchronized (nx6.c) {
                o();
            }
            l();
        }
    }

    public boolean f() {
        return false;
    }

    public int h() {
        return this.g;
    }

    public vr2 i() {
        return this.f;
    }

    public void k() {
        this.l++;
    }

    public void l() {
        if (this.l <= 0) {
            vm5.a("no pending nested snapshots");
        }
        int i2 = this.l - 1;
        this.l = i2;
        if (i2 == 0 && !this.m) {
            up4 x = x();
            if (x != null) {
                if (this.m) {
                    vm5.b("Unsupported operation on a snapshot that has been applied");
                }
                B((up4) null);
                long g2 = g();
                Object[] objArr = x.b;
                long[] jArr = x.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    for (p37 firstStateRecord = ((n37) objArr[(i3 << 3) + i5]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.b) {
                                        long j3 = firstStateRecord.a;
                                        if (j3 == g2 || dt0.q0(this.j, Long.valueOf(j3))) {
                                            nf6 nf6 = nx6.a;
                                            firstStateRecord.a = 0;
                                        }
                                    }
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
            a();
        }
    }

    public void m() {
        if (!this.m && !this.c) {
            v();
        }
    }

    public void n(n37 n37) {
        up4 x = x();
        if (x == null) {
            up4 up4 = cg6.a;
            x = new up4();
            B(x);
        }
        x.a(n37);
    }

    public final void p() {
        for (int u : this.k) {
            nx6.u(u);
        }
        o();
    }

    public void t(int i2) {
        this.g = i2;
    }

    /* JADX INFO: finally extract failed */
    public ix6 u(vr2 vr2) {
        sx4 sx4;
        if (this.c) {
            vm5.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            vm5.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g2 = g();
        A(g());
        Object obj = nx6.c;
        synchronized (obj) {
            try {
                long j2 = nx6.e;
                nx6.e = j2 + 1;
                nx6.d = nx6.d.n(j2);
                sx4 = new sx4(j2, nx6.d(d(), g2 + 1, j2), nx6.k(vr2, e(), true), this);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.m || this.c) {
            return sx4;
        }
        long g3 = g();
        synchronized (obj) {
            try {
                long j3 = nx6.e;
                nx6.e = j3 + 1;
                s(j3);
                nx6.d = nx6.d.n(g());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r(nx6.d(d(), g3 + 1, g()));
        return sx4;
    }

    public final void v() {
        A(g());
        if (!this.m && !this.c) {
            long g2 = g();
            synchronized (nx6.c) {
                long j2 = nx6.e;
                nx6.e = j2 + 1;
                s(j2);
                nx6.d = nx6.d.n(g());
            }
            r(nx6.d(d(), g2 + 1, g()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r0.m = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r1 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r5 = new defpackage.dg6(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r1.g() != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        r7 = r2.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r8 >= r7) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        ((defpackage.gs2) r2.get(r8)).H(r5, r0);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r3 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (r3.h() == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        r5 = new defpackage.dg6(r3);
        r7 = r2.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (r8 >= r7) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        ((defpackage.gs2) r2.get(r8)).H(r5, r0);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r2 = defpackage.nx6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        p();
        defpackage.nx6.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (r1 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r14 = r1.b;
        r1 = r1.a;
        r15 = r1.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r15 < 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r4 = 0;
        r16 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r7 = r1[r4];
        r18 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        if (((((~r7) << 7) & r7) & -9187201950435737472L) == -9187201950435737472L) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
        r9 = 8 - ((~(r4 - r15)) >>> 31);
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        if (r10 >= r9) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f0, code lost:
        if ((r7 & 255) >= 128) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
        defpackage.nx6.q((defpackage.n37) r14[(r4 << 3) + r10]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        r7 = r7 >> 8;
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0104, code lost:
        if (r9 != 8) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
        if (r4 == r15) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0108, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010b, code lost:
        r16 = 128;
        r18 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010f, code lost:
        if (r3 == null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0111, code lost:
        r1 = r3.b;
        r3 = r3.a;
        r4 = r3.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0118, code lost:
        if (r4 < 0) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011a, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011b, code lost:
        r8 = r3[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0123, code lost:
        if (((((~r8) << 7) & r8) & -9187201950435737472L) == -9187201950435737472L) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0125, code lost:
        r10 = 8 - ((~(r7 - r4)) >>> 31);
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012d, code lost:
        if (r14 >= r10) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0133, code lost:
        if ((r8 & r18) >= r16) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0135, code lost:
        defpackage.nx6.q((defpackage.n37) r1[(r7 << 3) + r14]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013f, code lost:
        r8 = r8 >> 8;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0143, code lost:
        if (r10 != 8) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0145, code lost:
        if (r7 == r4) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0147, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014a, code lost:
        r1 = r0.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014c, code lost:
        if (r1 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014e, code lost:
        r3 = r1.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0153, code lost:
        if (r4 >= r3) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0155, code lost:
        defpackage.nx6.q((defpackage.n37) r1.get(r4));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        r0.i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0163, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0166, code lost:
        return defpackage.kx6.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0168, code lost:
        throw r0;
     */
    public f55 w() {
        HashMap hashMap;
        List list;
        up4 up4;
        up4 x = x();
        if (x != null) {
            long j2 = nx6.j.b;
            hashMap = nx6.b(j2, this, nx6.d.g(j2));
        } else {
            hashMap = null;
        }
        a42 a42 = a42.w;
        synchronized (nx6.c) {
            try {
                nx6.c(this);
                if (x != null) {
                    if (x.d != 0) {
                        ew2 ew2 = nx6.j;
                        f55 z = z(nx6.e, x, hashMap, nx6.d.g(ew2.b));
                        if (!z.equals(kx6.i)) {
                            return z;
                        }
                        b();
                        up4 = ew2.h;
                        nx6.v(ew2, nx6.a);
                        B((up4) null);
                        ew2.h = null;
                        list = nx6.h;
                    }
                }
                b();
                ew2 ew22 = nx6.j;
                up4 up42 = ew22.h;
                nx6.v(ew22, nx6.a);
                if (up42 == null || !up42.h()) {
                    list = a42;
                    up4 = null;
                } else {
                    list = nx6.h;
                    up4 = up42;
                }
            } finally {
            }
        }
    }

    public up4 x() {
        return this.h;
    }

    /* renamed from: y */
    public vr2 e() {
        return this.e;
    }

    public final f55 z(long j2, up4 up4, HashMap hashMap, mx6 mx6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        mx6 mx62;
        Object[] objArr;
        long[] jArr;
        mx6 mx63;
        long j3;
        int i2;
        Object[] objArr2;
        long[] jArr2;
        ArrayList arrayList4;
        p37 p37;
        yb5 yb5;
        ArrayList arrayList5;
        long j4 = j2;
        up4 up42 = up4;
        HashMap hashMap2 = hashMap;
        mx6 l2 = d().n(g()).l(this.j);
        Object[] objArr3 = up42.b;
        long[] jArr3 = up42.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            arrayList2 = null;
            arrayList = null;
            while (true) {
                long j5 = jArr3[i3];
                if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            objArr2 = objArr3;
                            n37 n37 = (n37) objArr3[(i3 << 3) + i5];
                            jArr2 = jArr3;
                            p37 firstStateRecord = n37.getFirstStateRecord();
                            i2 = i5;
                            ArrayList arrayList6 = arrayList2;
                            p37 s = nx6.s(firstStateRecord, j4, mx6);
                            if (s == null) {
                                arrayList4 = arrayList;
                                j3 = j5;
                            } else {
                                arrayList4 = arrayList;
                                j3 = j5;
                                p37 s2 = nx6.s(firstStateRecord, g(), l2);
                                if (!(s2 == null || s2.a == 1 || s.equals(s2))) {
                                    mx63 = l2;
                                    p37 s3 = nx6.s(firstStateRecord, g(), d());
                                    if (s3 != null) {
                                        if (hashMap2 == null || (p37 = (p37) hashMap2.get(s)) == null) {
                                            p37 = n37.mergeRecords(s2, s, s3);
                                        }
                                        if (p37 == null) {
                                            return new jx6(this);
                                        }
                                        if (!p37.equals(s3)) {
                                            if (p37.equals(s)) {
                                                if (arrayList6 == null) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList6;
                                                }
                                                arrayList5.add(new yb5(n37, s.b(g())));
                                                if (arrayList4 == null) {
                                                    arrayList = new ArrayList();
                                                } else {
                                                    arrayList = arrayList4;
                                                }
                                                arrayList.add(n37);
                                                arrayList2 = arrayList5;
                                            } else {
                                                if (arrayList6 == null) {
                                                    arrayList2 = new ArrayList();
                                                } else {
                                                    arrayList2 = arrayList6;
                                                }
                                                if (!p37.equals(s2)) {
                                                    yb5 = new yb5(n37, p37);
                                                } else {
                                                    yb5 = new yb5(n37, s2.b(g()));
                                                }
                                                arrayList2.add(yb5);
                                                arrayList = arrayList4;
                                            }
                                        }
                                        arrayList2 = arrayList6;
                                        arrayList = arrayList4;
                                    } else {
                                        nx6.r();
                                        throw null;
                                    }
                                }
                            }
                            mx63 = l2;
                            arrayList2 = arrayList6;
                            arrayList = arrayList4;
                        } else {
                            mx63 = l2;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i2 = i5;
                            ArrayList arrayList7 = arrayList2;
                            ArrayList arrayList8 = arrayList;
                            j3 = j5;
                            mx6 mx64 = mx6;
                        }
                        j5 = j3 >> 8;
                        i5 = i2 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        l2 = mx63;
                    }
                    mx6 mx65 = mx6;
                    mx62 = l2;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList9 = arrayList2;
                    ArrayList arrayList10 = arrayList;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    mx6 mx66 = mx6;
                    mx62 = l2;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 == length) {
                    arrayList3 = arrayList2;
                    break;
                }
                i3++;
                jArr3 = jArr;
                objArr3 = objArr;
                l2 = mx62;
            }
        } else {
            arrayList3 = null;
            arrayList = null;
        }
        arrayList2 = arrayList3;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                yb5 yb52 = (yb5) arrayList2.get(i6);
                n37 n372 = (n37) yb52.w;
                p37 p372 = (p37) yb52.x;
                p372.a = j4;
                synchronized (nx6.c) {
                    p372.b = n372.getFirstStateRecord();
                    n372.prependStateRecord(p372);
                }
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                up42.l((n37) arrayList.get(i7));
            }
            ArrayList arrayList11 = this.i;
            if (arrayList11 != null) {
                arrayList = dt0.M0(arrayList11, arrayList);
            }
            this.i = arrayList;
        }
        return kx6.i;
    }
}
