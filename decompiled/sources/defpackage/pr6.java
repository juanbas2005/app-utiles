package defpackage;

import java.util.Arrays;

/* renamed from: pr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class pr6 extends c3 implements xp4, di2, mt2 {
    public final int A;
    public final int B;
    public final vc0 C;
    public Object[] D;
    public long E;
    public long F;
    public int G;
    public int H;

    public pr6(int i, int i2, vc0 vc0) {
        this.A = i;
        this.B = i2;
        this.C = vc0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091 A[EDGE_INSN: B:53:0x0091->B:40:0x0091 ?: BREAK  , SYNTHETIC] */
    public static void l(defpackage.pr6 r8, defpackage.fi2 r9, defpackage.f61 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.or6
            if (r0 == 0) goto L_0x0013
            r0 = r10
            or6 r0 = (defpackage.or6) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            or6 r0 = new or6
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.D
            int r1 = r0.F
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L_0x005a
            r8 = 1
            if (r1 == r8) goto L_0x004b
            if (r1 == r3) goto L_0x003f
            if (r1 != r2) goto L_0x0039
            el3 r8 = r0.C
            rr6 r9 = r0.B
            fi2 r1 = r0.A
            pr6 r4 = r0.z
            defpackage.o85.q(r10)     // Catch:{ all -> 0x0036 }
        L_0x0032:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L_0x0073
        L_0x0036:
            r8 = move-exception
            goto L_0x00b3
        L_0x0039:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r8)
            return
        L_0x003f:
            el3 r8 = r0.C
            rr6 r9 = r0.B
            fi2 r1 = r0.A
            pr6 r4 = r0.z
            defpackage.o85.q(r10)     // Catch:{ all -> 0x0036 }
            goto L_0x0076
        L_0x004b:
            rr6 r9 = r0.B
            fi2 r8 = r0.A
            pr6 r1 = r0.z
            defpackage.o85.q(r10)     // Catch:{ all -> 0x0057 }
            r10 = r8
            r8 = r1
            goto L_0x0066
        L_0x0057:
            r8 = move-exception
            r4 = r1
            goto L_0x00b3
        L_0x005a:
            defpackage.o85.q(r10)
            d3 r10 = r8.d()
            rr6 r10 = (defpackage.rr6) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0066:
            e81 r1 = r0.x     // Catch:{ all -> 0x00b0 }
            r1.getClass()     // Catch:{ all -> 0x00b0 }
            me6 r4 = defpackage.me6.E     // Catch:{ all -> 0x00b0 }
            c81 r1 = r1.a0(r4)     // Catch:{ all -> 0x00b0 }
            el3 r1 = (defpackage.el3) r1     // Catch:{ all -> 0x00b0 }
        L_0x0073:
            r4 = r8
            r8 = r1
            r1 = r10
        L_0x0076:
            java.lang.Object r10 = r4.u(r9)     // Catch:{ all -> 0x0036 }
            py2 r5 = defpackage.qr6.a     // Catch:{ all -> 0x0036 }
            p81 r6 = defpackage.p81.w
            if (r10 != r5) goto L_0x0091
            r0.z = r4     // Catch:{ all -> 0x0036 }
            r0.A = r1     // Catch:{ all -> 0x0036 }
            r0.B = r9     // Catch:{ all -> 0x0036 }
            r0.C = r8     // Catch:{ all -> 0x0036 }
            r0.F = r3     // Catch:{ all -> 0x0036 }
            java.lang.Object r10 = r4.i(r9, r0)     // Catch:{ all -> 0x0036 }
            if (r10 != r6) goto L_0x0076
            goto L_0x00af
        L_0x0091:
            if (r8 == 0) goto L_0x009f
            boolean r5 = r8.l()     // Catch:{ all -> 0x0036 }
            if (r5 == 0) goto L_0x009a
            goto L_0x009f
        L_0x009a:
            java.util.concurrent.CancellationException r8 = r8.E()     // Catch:{ all -> 0x0036 }
            throw r8     // Catch:{ all -> 0x0036 }
        L_0x009f:
            r0.z = r4     // Catch:{ all -> 0x0036 }
            r0.A = r1     // Catch:{ all -> 0x0036 }
            r0.B = r9     // Catch:{ all -> 0x0036 }
            r0.C = r8     // Catch:{ all -> 0x0036 }
            r0.F = r2     // Catch:{ all -> 0x0036 }
            java.lang.Object r10 = r1.k(r10, r0)     // Catch:{ all -> 0x0036 }
            if (r10 != r6) goto L_0x0032
        L_0x00af:
            return
        L_0x00b0:
            r10 = move-exception
            r4 = r8
            r8 = r10
        L_0x00b3:
            r4.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr6.l(pr6, fi2, f61):void");
    }

    public final Object a(fi2 fi2, f61 f61) {
        l(this, fi2, f61);
        return p81.w;
    }

    public final di2 b(e81 e81, int i, vc0 vc0) {
        return qr6.c(this, e81, i, vc0);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [rr6, java.lang.Object, d3] */
    public final d3 e() {
        ? obj = new Object();
        obj.a = -1;
        return obj;
    }

    public final d3[] f() {
        return new rr6[2];
    }

    public final Object i(rr6 rr6, or6 or6) {
        kk0 kk0 = new kk0(1, rc9.a0(or6));
        kk0.v();
        synchronized (this) {
            try {
                if (t(rr6) < 0) {
                    rr6.b = kk0;
                } else {
                    kk0.f(vs7.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object t = kk0.t();
        if (t == p81.w) {
            return t;
        }
        return vs7.a;
    }

    public final void j() {
        if (this.B != 0 || this.H > 1) {
            Object[] objArr = this.D;
            objArr.getClass();
            while (this.H > 0) {
                long p = p();
                int i = this.G;
                int i2 = this.H;
                if (objArr[((int) ((p + ((long) (i + i2))) - 1)) & (objArr.length - 1)] == qr6.a) {
                    this.H = i2 - 1;
                    qr6.b(objArr, p() + ((long) (this.G + this.H)), (Object) null);
                } else {
                    return;
                }
            }
        }
    }

    public final Object k(Object obj, f61 f61) {
        Throwable th;
        pr6 pr6;
        nr6 nr6;
        f61[] f61Arr;
        if (r(obj)) {
            return vs7.a;
        }
        kk0 kk0 = new kk0(1, rc9.a0(f61));
        kk0.v();
        f61[] f61Arr2 = bb0.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        kk0.f(vs7.a);
                        f61Arr = o(f61Arr2);
                        nr6 = null;
                        pr6 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        pr6 = this;
                        throw th;
                    }
                } else {
                    try {
                        pr6 = this;
                    } catch (Throwable th3) {
                        pr6 = this;
                        th = th3;
                        throw th;
                    }
                    try {
                        nr6 nr62 = new nr6(pr6, p() + ((long) (this.G + this.H)), obj, kk0);
                        pr6.n(nr62);
                        pr6.H++;
                        if (pr6.B == 0) {
                            f61Arr2 = pr6.o(f61Arr2);
                        }
                        f61Arr = f61Arr2;
                        nr6 = nr62;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                }
                if (nr6 != null) {
                    kk0.y(new fk0(2, nr6));
                }
                for (f61 f612 : f61Arr) {
                    if (f612 != null) {
                        f612.f(vs7.a);
                    }
                }
                Object t = kk0.t();
                p81 p81 = p81.w;
                if (t != p81) {
                    t = vs7.a;
                }
                if (t == p81) {
                    return t;
                }
                return vs7.a;
            } catch (Throwable th5) {
                th = th5;
                pr6 = this;
                th = th;
                throw th;
            }
        }
    }

    public final void m() {
        d3[] d3VarArr;
        Object[] objArr = this.D;
        objArr.getClass();
        qr6.b(objArr, p(), (Object) null);
        this.G--;
        long p = p() + 1;
        if (this.E < p) {
            this.E = p;
        }
        if (this.F < p) {
            if (!(this.x == 0 || (d3VarArr = this.w) == null)) {
                for (d3 d3Var : d3VarArr) {
                    if (d3Var != null) {
                        rr6 rr6 = (rr6) d3Var;
                        long j = rr6.a;
                        if (0 <= j && j < p) {
                            rr6.a = p;
                        }
                    }
                }
            }
            this.F = p;
        }
    }

    public final void n(Object obj) {
        int i = this.G + this.H;
        Object[] objArr = this.D;
        if (objArr == null) {
            objArr = q((Object[]) null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = q(objArr, i, objArr.length * 2);
        }
        qr6.b(objArr, p() + ((long) i), obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: f61[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: f61[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = (defpackage.rr6) r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=f61[], code=java.lang.Object[], for r11v0, types: [f61[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final f61[] o(Object[] objArr) {
        d3[] d3VarArr;
        Object[] objArr2;
        rr6 rr6;
        f61 f61;
        int length = objArr.length;
        if (!(this.x == 0 || (d3VarArr = this.w) == null)) {
            int length2 = d3VarArr.length;
            int i = 0;
            while (i < length2) {
                d3 d3Var = d3VarArr[i];
                if (!(d3Var == null || (f61 = rr6.b) == null || t(rr6) < 0)) {
                    int length3 = objArr.length;
                    Object[] objArr3 = objArr;
                    if (length >= length3) {
                        objArr3 = Arrays.copyOf(objArr, Math.max(2, objArr.length * 2));
                    }
                    ((f61[]) objArr3)[length] = f61;
                    rr6.b = null;
                    length++;
                    objArr2 = objArr3;
                }
                i++;
                objArr = objArr2;
            }
            objArr = objArr;
        }
        return (f61[]) objArr;
    }

    public final long p() {
        return Math.min(this.F, this.E);
    }

    public final Object[] q(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.D = objArr2;
            if (objArr != null) {
                long p = p();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = ((long) i3) + p;
                    qr6.b(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        h.s("Buffer size overflow");
        return null;
    }

    public final boolean r(Object obj) {
        int i;
        boolean z;
        f61[] f61Arr = bb0.a;
        synchronized (this) {
            if (s(obj)) {
                f61Arr = o(f61Arr);
                z = true;
            } else {
                z = false;
            }
        }
        for (f61 f61 : f61Arr) {
            if (f61 != null) {
                f61.f(vs7.a);
            }
        }
        return z;
    }

    public final boolean s(Object obj) {
        int i = this.x;
        int i2 = this.A;
        if (i != 0) {
            int i3 = this.G;
            int i4 = this.B;
            if (i3 >= i4 && this.F <= this.E) {
                int ordinal = this.C.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        h.c();
                        return false;
                    }
                }
            }
            n(obj);
            int i5 = this.G + 1;
            this.G = i5;
            if (i5 > i4) {
                m();
            }
            long p = p() + ((long) this.G);
            long j = this.E;
            if (((int) (p - j)) > i2) {
                v(1 + j, this.F, p() + ((long) this.G), p() + ((long) this.G) + ((long) this.H));
            }
        } else if (i2 != 0) {
            n(obj);
            int i6 = this.G + 1;
            this.G = i6;
            if (i6 > i2) {
                m();
            }
            this.F = p() + ((long) this.G);
            return true;
        }
        return true;
    }

    public final long t(rr6 rr6) {
        long j = rr6.a;
        if (j >= p() + ((long) this.G) && (this.B > 0 || j > p() || this.H == 0)) {
            return -1;
        }
        return j;
    }

    public final Object u(rr6 rr6) {
        Object obj;
        f61[] f61Arr = bb0.a;
        synchronized (this) {
            try {
                long t = t(rr6);
                if (t < 0) {
                    obj = qr6.a;
                } else {
                    long j = rr6.a;
                    Object[] objArr = this.D;
                    objArr.getClass();
                    Object obj2 = objArr[((int) t) & (objArr.length - 1)];
                    if (obj2 instanceof nr6) {
                        obj2 = ((nr6) obj2).y;
                    }
                    rr6.a = t + 1;
                    Object obj3 = obj2;
                    f61Arr = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (f61 f61 : f61Arr) {
            if (f61 != null) {
                f61.f(vs7.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long p = p(); p < min; p++) {
            Object[] objArr = this.D;
            objArr.getClass();
            qr6.b(objArr, p, (Object) null);
        }
        this.E = j;
        this.F = j2;
        this.G = (int) (j3 - min);
        this.H = (int) (j4 - j3);
    }

    public final f61[] w(long j) {
        long j2;
        int i;
        long j3;
        f61[] f61Arr;
        long j4;
        f61[] f61Arr2;
        d3[] d3VarArr;
        f61[] f61Arr3 = bb0.a;
        if (j <= this.F) {
            long p = p();
            long j5 = ((long) this.G) + p;
            int i2 = this.B;
            if (i2 == 0 && this.H > 0) {
                j5++;
            }
            int i3 = 0;
            if (!(this.x == 0 || (d3VarArr = this.w) == null)) {
                for (d3 d3Var : d3VarArr) {
                    if (d3Var != null) {
                        long j6 = ((rr6) d3Var).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.F) {
                long p2 = p() + ((long) this.G);
                int i4 = this.x;
                int i5 = this.H;
                if (i4 > 0) {
                    i5 = Math.min(i5, i2 - ((int) (p2 - j5)));
                }
                long j7 = ((long) this.H) + p2;
                py2 py2 = qr6.a;
                if (i5 > 0) {
                    f61[] f61Arr4 = new f61[i5];
                    j2 = 1;
                    Object[] objArr = this.D;
                    objArr.getClass();
                    j3 = j5;
                    long j8 = p2;
                    while (true) {
                        if (p2 >= j7) {
                            f61Arr2 = f61Arr4;
                            i = i2;
                            break;
                        }
                        f61Arr2 = f61Arr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) p2)];
                        if (obj != py2) {
                            obj.getClass();
                            nr6 nr6 = (nr6) obj;
                            int i6 = i3 + 1;
                            i = i2;
                            f61Arr2[i3] = nr6.z;
                            qr6.b(objArr, p2, py2);
                            qr6.b(objArr, j8, nr6.y);
                            j8++;
                            if (i6 >= i5) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            i = i2;
                        }
                        p2++;
                        f61Arr4 = f61Arr2;
                        i2 = i;
                    }
                    p2 = j8;
                    f61Arr = f61Arr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j2 = 1;
                    f61Arr = f61Arr3;
                }
                long max = Math.max(this.E, Math.max(p, p2 - ((long) this.A)));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.D;
                    objArr2.getClass();
                    if (sg3.e(objArr2[((int) max) & (objArr2.length - 1)], py2)) {
                        p2 += j2;
                        max += j2;
                    }
                }
                long j9 = p2;
                if (this.x == 0) {
                    j4 = j9;
                } else {
                    j4 = j3;
                }
                v(max, j4, j9, j7);
                j();
                if (f61Arr.length == 0) {
                    return f61Arr;
                }
                return o(f61Arr);
            }
        }
        return f61Arr3;
    }
}
