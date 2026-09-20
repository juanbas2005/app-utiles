package defpackage;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.List;

/* renamed from: my1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class my1 {
    public static final float a = (0.125f / 18.0f);

    /* JADX WARNING: type inference failed for: r15v11, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (defpackage.l35.b(defpackage.ub5.q(r6, true), 0) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object a(g97 g97, long j, h61 h61) {
        fy1 fy1;
        int i;
        g06 g06;
        int size;
        int i2;
        Object obj;
        qk5 qk5;
        g06 g062;
        Object obj2;
        Object c;
        Object obj3;
        if (h61 instanceof fy1) {
            fy1 fy12 = (fy1) h61;
            int i3 = fy12.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fy12.C = i3 - Integer.MIN_VALUE;
                fy1 = fy12;
                Object obj4 = fy1.B;
                i = fy1.C;
                if (i != 0) {
                    o85.q(obj4);
                    if (!g(g97.B.O, j)) {
                        ? obj5 = new Object();
                        obj5.w = j;
                        g062 = obj5;
                    }
                    return null;
                } else if (i == 1) {
                    g06 g063 = fy1.A;
                    g97 g972 = fy1.z;
                    o85.q(obj4);
                    g97 g973 = g972;
                    g06 = g063;
                    g97 = g973;
                    kk5 kk5 = (kk5) obj4;
                    List list = kk5.a;
                    size = list.size();
                    int i4 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i2);
                        if (a35.i(((qk5) obj).a, g06.w)) {
                            break;
                        }
                        i2++;
                    }
                    qk5 = (qk5) obj;
                    if (qk5 != null) {
                        if (ub5.d(qk5)) {
                            List list2 = kk5.a;
                            int size2 = list2.size();
                            while (true) {
                                if (i4 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list2.get(i4);
                                if (((qk5) obj2).d) {
                                    break;
                                }
                                i4++;
                            }
                            qk5 qk52 = (qk5) obj2;
                            if (qk52 != null) {
                                g06.w = qk52.a;
                            }
                        }
                        g062 = g06;
                    } else {
                        qk5 = null;
                    }
                    if (qk5 == null || qk5.c()) {
                        return null;
                    }
                    return qk5;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fy1.z = g97;
                fy1.A = g062;
                fy1.C = 1;
                c = g97.c(lk5.x, fy1);
                obj3 = p81.w;
                if (c != obj3) {
                    return obj3;
                }
                g06 g064 = g062;
                obj4 = c;
                g06 = g064;
                kk5 kk52 = (kk5) obj4;
                List list3 = kk52.a;
                size = list3.size();
                int i42 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                    }
                    i2++;
                }
                qk5 = (qk5) obj;
                if (qk5 != null) {
                }
                if (qk5 == null || qk5.c()) {
                }
                return obj3;
            }
        }
        fy1 = new h61(h61);
        Object obj42 = fy1.B;
        i = fy1.C;
        if (i != 0) {
        }
        fy1.z = g97;
        fy1.A = g062;
        fy1.C = 1;
        c = g97.c(lk5.x, fy1);
        obj3 = p81.w;
        if (c != obj3) {
        }
        return obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: qk5} */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, d06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ PointerEventTimeoutCancellationException -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object b(g97 g97, long j, h61 h61) {
        gy1 gy1;
        int i;
        qk5 qk5;
        h06 h06;
        h06 h062;
        d06 d06;
        Object obj;
        if (h61 instanceof gy1) {
            gy1 gy12 = (gy1) h61;
            int i2 = gy12.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gy12.D = i2 - Integer.MIN_VALUE;
                gy1 = gy12;
                Object obj2 = gy1.C;
                i = gy1.D;
                if (i != 0) {
                    o85.q(obj2);
                    if (!g(g97.B.O, j)) {
                        List list = g97.B.O.a;
                        int size = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            if (a35.i(((qk5) obj).a, j)) {
                                break;
                            }
                            i3++;
                        }
                        qk5 = (qk5) obj;
                        if (qk5 != null) {
                            ? obj3 = new Object();
                            ? obj4 = new Object();
                            obj4.w = qk5;
                            long b = g97.g().b();
                            h06 = obj3;
                            ? obj5 = new Object();
                            hy1 hy1 = new hy1(obj5, obj4, obj3, (f61) null);
                            gy1.z = qk5;
                            gy1.A = obj3;
                            gy1.B = obj5;
                            gy1.D = 1;
                            Object h = g97.h(b, hy1, gy1);
                            p81 p81 = p81.w;
                            if (h == p81) {
                                return p81;
                            }
                            d06 = obj5;
                            h062 = obj3;
                        }
                    }
                    return null;
                } else if (i == 1) {
                    d06 = gy1.B;
                    h06 h063 = gy1.A;
                    qk5 = gy1.z;
                    try {
                        h06 = h063;
                        o85.q(obj2);
                        h06 = h063;
                        h062 = h063;
                    } catch (PointerEventTimeoutCancellationException unused) {
                        qk5 qk52 = (qk5) h06.w;
                        if (qk52 == null) {
                            return qk5;
                        }
                        return qk52;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h06 = h062;
                if (d06.w) {
                    qk5 qk53 = (qk5) h062.w;
                    if (qk53 == null) {
                        return qk5;
                    }
                    return qk53;
                }
                return null;
            }
        }
        gy1 = new h61(h61);
        Object obj22 = gy1.C;
        i = gy1.D;
        if (i != 0) {
        }
        h06 = h062;
        if (d06.w) {
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r3v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    public static final Object c(g97 g97, long j, ph6 ph6, q50 q50) {
        iy1 iy1;
        int i;
        Object obj;
        qk5 qk5;
        char c;
        g06 g06;
        g97 g972;
        long j2;
        float f;
        cp0 cp0;
        int i2;
        qk5 qk52;
        gs2 gs2;
        cp0 cp02;
        float f2;
        g97 g973;
        g06 g062;
        Object c2;
        g06 g063;
        int size;
        int i3;
        Object obj2;
        qk5 qk53;
        long j3;
        Object obj3;
        long j4 = j;
        q50 q502 = q50;
        if (q502 instanceof iy1) {
            iy1 iy12 = (iy1) q502;
            int i4 = iy12.G;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iy12.G = i4 - Integer.MIN_VALUE;
                iy1 = iy12;
                Object obj4 = iy1.F;
                i = iy1.G;
                int i5 = 1;
                qk5 qk54 = null;
                obj = p81.w;
                if (i != 0) {
                    o85.q(obj4);
                    g973 = g97;
                    if (g(g973.B.O, j4)) {
                        return null;
                    }
                    f2 = g973.g().f();
                    ? obj5 = new Object();
                    obj5.w = j4;
                    cp02 = new cp0(2, 0, (Object) null);
                    gs2 = ph6;
                    g062 = obj5;
                    iy1.z = gs2;
                    iy1.A = g973;
                    iy1.B = g062;
                    iy1.C = cp02;
                    iy1.D = qk54;
                    iy1.E = f2;
                    iy1.G = i5;
                    c2 = g973.c(lk5.x, iy1);
                    if (c2 != obj) {
                    }
                    return obj;
                } else if (i == 1) {
                    float f3 = iy1.E;
                    cp02 = iy1.C;
                    g06 g064 = iy1.B;
                    g972 = iy1.A;
                    gs2 gs22 = iy1.z;
                    o85.q(obj4);
                    g063 = g064;
                    f2 = f3;
                    gs2 = gs22;
                } else if (i == 2) {
                    float f4 = iy1.E;
                    qk52 = iy1.D;
                    cp0 = iy1.C;
                    g06 g065 = iy1.B;
                    g97 g974 = iy1.A;
                    gs2 gs23 = iy1.z;
                    o85.q(obj4);
                    g97 g975 = g974;
                    g06 = g065;
                    g972 = g975;
                    c = 2;
                    i2 = 1;
                    qk5 = null;
                    j2 = 0;
                    f = f4;
                    gs2 = gs23;
                    if (!qk52.c()) {
                        return qk5;
                    }
                    qk54 = qk5;
                    i5 = i2;
                    cp02 = cp0;
                    f2 = f;
                    long j5 = j2;
                    g973 = g972;
                    g062 = g06;
                    char c3 = c;
                    iy1.z = gs2;
                    iy1.A = g973;
                    iy1.B = g062;
                    iy1.C = cp02;
                    iy1.D = qk54;
                    iy1.E = f2;
                    iy1.G = i5;
                    c2 = g973.c(lk5.x, iy1);
                    if (c2 != obj) {
                        g063 = g062;
                        g972 = g973;
                        obj4 = c2;
                    }
                    return obj;
                    return qk5;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g06 = g063;
                kk5 kk5 = (kk5) obj4;
                List list = kk5.a;
                size = list.size();
                qk5 = qk54;
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj2 = qk5;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (a35.i(((qk5) obj2).a, g06.w)) {
                        break;
                    }
                    i3++;
                }
                qk53 = (qk5) obj2;
                if (qk53 == null || qk53.c()) {
                    return qk5;
                }
                if (ub5.d(qk53)) {
                    List list2 = kk5.a;
                    int size2 = list2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            obj3 = qk5;
                            break;
                        }
                        obj3 = list2.get(i6);
                        if (((qk5) obj3).d) {
                            break;
                        }
                        i6++;
                    }
                    qk5 qk55 = (qk5) obj3;
                    if (qk55 == null) {
                        return qk5;
                    }
                    g06.w = qk55.a;
                    i2 = 1;
                    j3 = 0;
                    return qk5;
                }
                i2 = 1;
                long e = cp0.e(cp02, ub5.q(qk53, true), f2);
                if ((9223372034707292159L & e) != 9205357640488583168L) {
                    gs2.H(qk53, new l35(e));
                    if (qk53.c()) {
                        return qk53;
                    }
                    j3 = 0;
                    cp02.x = 0;
                    return qk53;
                }
                j2 = 0;
                iy1.z = gs2;
                iy1.A = g972;
                iy1.B = g06;
                iy1.C = cp02;
                iy1.D = qk53;
                iy1.E = f2;
                c = 2;
                iy1.G = 2;
                if (g972.c(lk5.y, iy1) != obj) {
                    float f5 = f2;
                    cp0 = cp02;
                    qk52 = qk53;
                    f = f5;
                    if (!qk52.c()) {
                    }
                    return qk5;
                }
                return obj;
                qk54 = qk5;
                i5 = i2;
                long j6 = j3;
                g973 = g972;
                g062 = g06;
                iy1.z = gs2;
                iy1.A = g973;
                iy1.B = g062;
                iy1.C = cp02;
                iy1.D = qk54;
                iy1.E = f2;
                iy1.G = i5;
                c2 = g973.c(lk5.x, iy1);
                if (c2 != obj) {
                }
                return obj;
                if (ub5.d(qk53)) {
                }
                qk54 = qk5;
                i5 = i2;
                long j62 = j3;
                g973 = g972;
                g062 = g06;
                iy1.z = gs2;
                iy1.A = g973;
                iy1.B = g062;
                iy1.C = cp02;
                iy1.D = qk54;
                iy1.E = f2;
                iy1.G = i5;
                c2 = g973.c(lk5.x, iy1);
                if (c2 != obj) {
                }
                return obj;
            }
        }
        iy1 = new h61(q502);
        Object obj42 = iy1.F;
        i = iy1.G;
        int i52 = 1;
        qk5 qk542 = null;
        obj = p81.w;
        if (i != 0) {
        }
        g06 = g063;
        kk5 kk52 = (kk5) obj42;
        List list3 = kk52.a;
        size = list3.size();
        qk5 = qk542;
        i3 = 0;
        while (true) {
            if (i3 < size) {
            }
            i3++;
        }
        qk53 = (qk5) obj2;
        if (qk53 == null && qk53.c()) {
        }
        if (ub5.d(qk53)) {
        }
        qk542 = qk5;
        i52 = i2;
        long j622 = j3;
        g973 = g972;
        g062 = g06;
        iy1.z = gs2;
        iy1.A = g973;
        iy1.B = g062;
        iy1.C = cp02;
        iy1.D = qk542;
        iy1.E = f2;
        iy1.G = i52;
        c2 = g973.c(lk5.x, iy1);
        if (c2 != obj) {
        }
        return obj;
    }

    public static final Object d(uk5 uk5, vr2 vr2, sr2 sr2, sr2 sr22, gs2 gs2, f61 f61) {
        gs2 gs22 = gs2;
        Object s = fd1.s(uk5, new jy1(new nf1(9), new jk0(1, vr2), gs22, sr22, new sn(1, sr2), (f61) null), f61);
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        if (s != p81) {
            s = vs7;
        }
        if (s == p81) {
            return s;
        }
        return vs7;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object f(g97 g97, long j, vr2 vr2, h61 h61) {
        ky1 ky1;
        Object obj;
        int i;
        qk5 qk5;
        p81 p81;
        if (h61 instanceof ky1) {
            ky1 ky12 = (ky1) h61;
            int i2 = ky12.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ky12.C = i2 - Integer.MIN_VALUE;
                ky1 = ky12;
                obj = ky1.B;
                i = ky1.C;
                if (i != 0) {
                    o85.q(obj);
                } else if (i == 1) {
                    vr2 vr22 = ky1.A;
                    g97 g972 = ky1.z;
                    o85.q(obj);
                    vr2 = vr22;
                    g97 = g972;
                    qk5 = (qk5) obj;
                    if (qk5 != null) {
                        if (!ub5.d(qk5)) {
                            vr2.y(qk5);
                            j = qk5.a;
                        }
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ky1.z = g97;
                ky1.A = vr2;
                ky1.C = 1;
                obj = a(g97, j, ky1);
                p81 = p81.w;
                if (obj == p81) {
                    return p81;
                }
                qk5 = (qk5) obj;
                if (qk5 != null) {
                }
                return Boolean.FALSE;
            }
        }
        ky1 = new h61(h61);
        obj = ky1.B;
        i = ky1.C;
        if (i != 0) {
        }
        ky1.z = g97;
        ky1.A = vr2;
        ky1.C = 1;
        obj = a(g97, j, ky1);
        p81 = p81.w;
        if (obj == p81) {
        }
        qk5 = (qk5) obj;
        if (qk5 != null) {
        }
        return Boolean.FALSE;
    }

    public static final boolean g(kk5 kk5, long j) {
        Object obj;
        List list = kk5.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (a35.i(((qk5) obj).a, j)) {
                break;
            }
            i++;
        }
        qk5 qk5 = (qk5) obj;
        if (qk5 != null && qk5.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float h(g58 g58, int i) {
        if (i == 2) {
            return g58.f() * a;
        }
        return g58.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: qk5} */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r8v14, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r11v25, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r13v38, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r2v27, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x046d, code lost:
        if (((defpackage.qk5) r1.get(r14)).d == false) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x046f, code lost:
        r1 = (defpackage.qk5) defpackage.dt0.y0(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0475, code lost:
        if (r1 == null) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0477, code lost:
        r14 = r1.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0479, code lost:
        r28 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x047c, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x047f, code lost:
        r1 = defpackage.l35.d(r14, r4.c);
        r14 = r4.a;
        r3 = r4.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0491, code lost:
        if (g(r13.B.O, r14) == false) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0493, code lost:
        r1 = r10;
        r10 = r7;
        r7 = r1;
        r2 = r28;
        r1 = r4;
        r4 = r9;
        r3 = r12;
        r12 = r13;
        r9 = r5;
        r13 = r6;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04a1, code lost:
        r3 = h(r13.g(), r3);
        r8 = new java.lang.Object();
        r8.w = r14;
        r14 = new defpackage.cp0(2, r1, r12);
        r2 = r28;
        r1 = r13;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x04b9, code lost:
        r2.z = r1;
        r2.A = r12;
        r2.B = r11;
        r2.C = r10;
        r2.D = r9;
        r2.E = r7;
        r2.F = r4;
        r2.G = r6;
        r2.H = r13;
        r2.I = r8;
        r2.J = r14;
        r2.K = null;
        r2.M = r3;
        r2.O = 5;
        r15 = r22;
        r22 = r1;
        r1 = r13.c(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x04df, code lost:
        if (r1 != r0) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x04e3, code lost:
        r28 = r1;
        r1 = r14;
        r14 = r13;
        r13 = r10;
        r10 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r22;
        r22 = r15;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x04ef, code lost:
        r15 = (defpackage.kk5) r28;
        r23 = r0;
        r0 = r15.a;
        r24 = r5;
        r5 = r0.size();
        r25 = r14;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0500, code lost:
        if (r14 >= r5) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0502, code lost:
        r26 = r0.get(r14);
        r28 = r0;
        r30 = r9;
        r29 = r10;
        r0 = r13;
        r31 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x051b, code lost:
        if (defpackage.a35.i(r26.a, r8.w) == false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x051e, code lost:
        r14 = r31 + 1;
        r10 = r29;
        r9 = r30;
        r13 = r0;
        r0 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0528, code lost:
        r30 = r9;
        r29 = r10;
        r0 = r13;
        r26 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x052f, code lost:
        r5 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0533, code lost:
        if (r5 != null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0535, code lost:
        r1 = r12;
        r12 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r29;
        r4 = r30;
        r13 = r6;
        r10 = r7;
        r9 = r24;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0542, code lost:
        r7 = r0;
        r0 = r23;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x054b, code lost:
        if (r5.c() == false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0552, code lost:
        if (defpackage.ub5.d(r5) == false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0554, code lost:
        r5 = r15.a;
        r9 = r5.size();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x055b, code lost:
        if (r10 >= r9) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x055d, code lost:
        r13 = r5.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0566, code lost:
        if (((defpackage.qk5) r13).d == false) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0569, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x056c, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x056d, code lost:
        r13 = (defpackage.qk5) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x056f, code lost:
        if (r13 != null) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0572, code lost:
        r8.w = r13.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0586, code lost:
        if ((defpackage.cp0.e(r1, defpackage.ub5.q(r5, true), r4) & r18) == 9205357640488583168L) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0588, code lost:
        r5.a();
        r6.w = defpackage.ub5.q(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0596, code lost:
        if (r5.c() == false) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0598, code lost:
        r1 = r12;
        r12 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r29;
        r4 = r30;
        r13 = r6;
        r10 = r7;
        r9 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x05a5, code lost:
        r1.x = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x05a9, code lost:
        r9 = r30;
        r10 = r0;
        r14 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r0 = r23;
        r5 = r24;
        r13 = r25;
        r4 = r29;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x05bb, code lost:
        r3.z = r2;
        r3.A = r12;
        r3.B = r11;
        r3.C = r0;
        r13 = r30;
        r3.D = r13;
        r3.E = r7;
        r14 = r29;
        r3.F = r14;
        r3.G = r6;
        r15 = r25;
        r3.H = r15;
        r3.I = r8;
        r3.J = r1;
        r3.K = r5;
        r3.M = r4;
        r3.O = 6;
        r9 = r24;
        r24 = r0;
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x05ea, code lost:
        if (r15.c(r9, r3) != r0) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x05ee, code lost:
        r10 = r14;
        r14 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r5;
        r5 = r12;
        r12 = r10;
        r10 = r24;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x05fb, code lost:
        if (r3.c() == false) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x05fd, code lost:
        r3 = r12;
        r12 = r1;
        r1 = r3;
        r3 = r10;
        r10 = r7;
        r7 = r3;
        r3 = r5;
        r4 = r13;
        r5 = null;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0607, code lost:
        r27 = r11;
        r11 = r5;
        r5 = r9;
        r9 = r27;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x060f, code lost:
        r3 = r4;
        r4 = r12;
        r12 = r5;
        r5 = r9;
        r9 = r13;
        r13 = r15;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0618, code lost:
        r28 = r2;
        r24 = r5;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0622, code lost:
        r28 = r2;
        r1 = r10;
        r10 = r7;
        r7 = r1;
        r1 = r4;
        r4 = r9;
        r9 = r11;
        r11 = r3;
        r3 = r12;
        r12 = r13;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0632, code lost:
        r24 = r5;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x063a, code lost:
        if (r11 == null) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x063c, code lost:
        r9.u(r1, r11, new defpackage.l35(r13.w));
        r7.H(r11, new defpackage.l35(r13.w));
        r5 = r11.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x065a, code lost:
        if (g(r12.B.O, r5) == false) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x065c, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x065f, code lost:
        r1 = new java.lang.Object();
        r1.w = r5;
        r9 = r4;
        r5 = r10;
        r3 = r12;
        r4 = r3;
        r10 = r7;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x066b, code lost:
        r2.z = r10;
        r2.A = r9;
        r2.B = r5;
        r2.C = r4;
        r2.D = r3;
        r2.E = r1;
        r15 = null;
        r2.F = null;
        r2.G = null;
        r2.H = null;
        r2.I = null;
        r2.J = null;
        r2.K = null;
        r2.O = 7;
        r6 = r22;
        r7 = r3.c(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x068d, code lost:
        if (r7 != r0) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0690, code lost:
        r27 = r2;
        r2 = r1;
        r1 = r7;
        r7 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0699, code lost:
        r1 = (defpackage.kk5) r1;
        r8 = r1.a;
        r11 = r8.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x06a2, code lost:
        if (r12 >= r11) goto L_0x06ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x06a4, code lost:
        r13 = r8.get(r12);
        r28 = r3;
        r29 = r4;
        r30 = r5;
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x06bb, code lost:
        if (defpackage.a35.i(((defpackage.qk5) r13).a, r2.w) == false) goto L_0x06bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x06bd, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x06bf, code lost:
        r12 = r12 + 1;
        r3 = r28;
        r4 = r29;
        r5 = r30;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x06ca, code lost:
        r28 = r3;
        r29 = r4;
        r30 = r5;
        r22 = r6;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x06d3, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x01b9, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x06d5, code lost:
        if (r4 != null) goto L_0x06da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x06d7, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x06de, code lost:
        if (defpackage.ub5.d(r4) == false) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x06e0, code lost:
        r1 = r1.a;
        r3 = r1.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x06e7, code lost:
        if (r5 >= r3) goto L_0x06f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x06e9, code lost:
        r6 = r1.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x06f2, code lost:
        if (((defpackage.qk5) r6).d == false) goto L_0x06f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x06f5, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x06f8, code lost:
        r6 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x06f9, code lost:
        r6 = (defpackage.qk5) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x06fb, code lost:
        if (r6 != null) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x06fe, code lost:
        r2.w = r6.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0710, code lost:
        if (defpackage.l35.c(defpackage.ub5.q(r4, true)) != 0.0f) goto L_0x071c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0712, code lost:
        r3 = r29;
        r4 = r30;
        r1 = r2;
        r5 = r7;
        r2 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x071c, code lost:
        if (r4 != null) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x071e, code lost:
        r10 = r7;
        r4 = r9;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0726, code lost:
        if (r4.c() == false) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x072d, code lost:
        if (defpackage.ub5.d(r4) == false) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x072f, code lost:
        r10 = r7;
        r7 = r4;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0732, code lost:
        if (r7 != null) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0734, code lost:
        r4.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0738, code lost:
        r10.y(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x073c, code lost:
        r10.H(r4, new defpackage.l35(defpackage.ub5.q(r4, false)));
        r4.a();
        r5 = r4.a;
        r2 = r10;
        r10 = r7;
        r7 = r2;
        r2 = r28;
        r12 = r30;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x075a, code lost:
        return defpackage.vs7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02eb, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x052f, code lost:
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0230, code lost:
        r1 = (defpackage.qk5) r1;
        r13 = new java.lang.Object();
        r13.w = 0;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x023b, code lost:
        if (r0 == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x023d, code lost:
        r14 = r1.a;
        r0 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0249, code lost:
        if (g(r12.B.O, r14) == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x024b, code lost:
        r11 = r5;
        r22 = r6;
        r0 = r8;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x024f, code lost:
        r5 = null;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0252, code lost:
        r0 = h(r12.g(), r0);
        r11 = new java.lang.Object();
        r11.w = r14;
        r1 = r1;
        r0 = r0;
        r15 = new defpackage.cp0(2, 0, r3);
        r14 = r13;
        r13 = r12;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0274, code lost:
        r2.z = r13;
        r2.A = r3;
        r2.B = r9;
        r2.C = r7;
        r2.D = r4;
        r2.E = r10;
        r2.F = r1;
        r2.G = r14;
        r2.H = r12;
        r2.I = r11;
        r2.J = r15;
        r28 = r1;
        r2.K = null;
        r2.M = r0;
        r2.O = 2;
        r1 = r12.c(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0298, code lost:
        if (r1 != r8) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x029b, code lost:
        r22 = r10;
        r10 = r28;
        r28 = r1;
        r1 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x02aa, code lost:
        r6 = (defpackage.kk5) r28;
        r23 = r8;
        r8 = r6.a;
        r24 = r5;
        r5 = r8.size();
        r28 = r13;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x02bb, code lost:
        if (r13 >= r5) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02bd, code lost:
        r25 = r8.get(r13);
        r29 = r5;
        r30 = r10;
        r31 = r11;
        r32 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x02d5, code lost:
        if (defpackage.a35.i(r25.a, r12.w) == false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02d8, code lost:
        r13 = r13 + 1;
        r5 = r29;
        r10 = r30;
        r11 = r31;
        r4 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x02e3, code lost:
        r32 = r4;
        r30 = r10;
        r31 = r11;
        r25 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x02eb, code lost:
        r4 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x02ef, code lost:
        if (r4 != null) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x02f1, code lost:
        r1 = r30;
        r10 = r31;
        r4 = r32;
        r12 = r14;
        r13 = r15;
        r0 = r23;
        r11 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0303, code lost:
        if (r4.c() == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x030a, code lost:
        if (defpackage.ub5.d(r4) == false) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x030c, code lost:
        r4 = r6.a;
        r5 = r4.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0313, code lost:
        if (r6 >= r5) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0315, code lost:
        r8 = r4.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x031e, code lost:
        if (((defpackage.qk5) r8).d == false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0321, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0324, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0325, code lost:
        r8 = (defpackage.qk5) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0327, code lost:
        if (r8 != null) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x032a, code lost:
        r12.w = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x032f, code lost:
        r5 = defpackage.cp0.e(r1, defpackage.ub5.q(r4, true), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x033c, code lost:
        if ((r5 & r18) == 9205357640488583168L) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x033e, code lost:
        r4.a();
        r15.w = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0347, code lost:
        if (r4.c() == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0349, code lost:
        r1 = r30;
        r10 = r31;
        r5 = r4;
        r12 = r14;
        r13 = r15;
        r0 = r23;
        r11 = r24;
        r4 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0358, code lost:
        r1.x = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x035c, code lost:
        r10 = r31;
        r4 = r32;
        r11 = r12;
        r13 = r14;
        r14 = r15;
        r6 = r22;
        r8 = r23;
        r5 = r24;
        r12 = r28;
        r15 = r1;
        r1 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0370, code lost:
        r2.z = r14;
        r2.A = r3;
        r2.B = r9;
        r2.C = r7;
        r5 = r32;
        r2.D = r5;
        r10 = r31;
        r2.E = r10;
        r6 = r30;
        r2.F = r6;
        r2.G = r15;
        r8 = r28;
        r2.H = r8;
        r2.I = r12;
        r2.J = r1;
        r2.K = r4;
        r2.M = r0;
        r2.O = 3;
        r11 = r24;
        r24 = r0;
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x039f, code lost:
        if (r8.c(r11, r2) != r0) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x03a3, code lost:
        r13 = r4;
        r4 = r3;
        r3 = r13;
        r13 = r5;
        r5 = r1;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x03ad, code lost:
        if (r3.c() == false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x03af, code lost:
        r3 = r4;
        r4 = r13;
        r12 = r14;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x03b5, code lost:
        if (r5 == null) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x03bb, code lost:
        if (r5.c() == false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x03be, code lost:
        r8 = r0;
        r5 = r11;
        r6 = r22;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x03c4, code lost:
        r27 = r11;
        r11 = r5;
        r5 = r27;
        r2 = r2;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03ca, code lost:
        r3 = r4;
        r4 = r13;
        r13 = r14;
        r14 = r15;
        r6 = r22;
        r15 = r5;
        r5 = r11;
        r11 = r12;
        r12 = r8;
        r8 = r0;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x03d9, code lost:
        r22 = r6;
        r0 = r8;
        r2 = r2;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x03dc, code lost:
        if (r11 != null) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03de, code lost:
        r6 = r12.B.O.a;
        r8 = r6.size();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03e9, code lost:
        if (r14 >= r8) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03f3, code lost:
        if (((defpackage.qk5) r6.get(r14)).d == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03f5, code lost:
        r27 = r4;
        r4 = r1;
        r1 = r12;
        r12 = r3;
        r3 = r11;
        r11 = r9;
        r9 = r27;
        r27 = r10;
        r10 = r7;
        r7 = r27;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0403, code lost:
        r2.z = r1;
        r2.A = r12;
        r2.B = r11;
        r2.C = r10;
        r2.D = r9;
        r2.E = r7;
        r2.F = r4;
        r2.G = r3;
        r2.H = r13;
        r2.I = null;
        r2.J = null;
        r2.K = null;
        r2.O = 4;
        r6 = r1.c(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0423, code lost:
        if (r6 != r0) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0427, code lost:
        r27 = r13;
        r13 = r1;
        r1 = r6;
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x042d, code lost:
        r1 = ((defpackage.kk5) r1).a;
        r8 = r1.size();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0436, code lost:
        if (r14 >= r8) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0442, code lost:
        if (((defpackage.qk5) r1.get(r14)).c() == false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0444, code lost:
        r8 = r1.size();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0449, code lost:
        if (r14 >= r8) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0453, code lost:
        if (((defpackage.qk5) r1.get(r14)).d == false) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0455, code lost:
        r1 = r13;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0458, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x045b, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x045e, code lost:
        r8 = r1.size();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0463, code lost:
        if (r14 >= r8) goto L_0x0622;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    public static final Object i(g97 g97, qk5 qk5, nf1 nf1, jk0 jk0, gs2 gs2, sr2 sr2, sn snVar, q50 q50) {
        ly1 ly1;
        int i;
        sr2 sr22;
        p81 p81;
        lk5 lk5;
        gs2 gs22;
        g97 g972;
        long j;
        hs2 hs2;
        z75 z75;
        qk5 qk52;
        hs2 hs22;
        gs2 gs23;
        vr2 vr2;
        g06 g06;
        float f;
        z75 z752;
        sr2 sr23;
        g06 g062;
        g97 g973;
        g06 g063;
        boolean z;
        vr2 vr22;
        g97 g974 = g97;
        q50 q502 = q50;
        if (q502 instanceof ly1) {
            ly1 ly12 = (ly1) q502;
            int i2 = ly12.O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ly12.O = i2 - Integer.MIN_VALUE;
                ly1 = ly12;
                Object obj = ly1.N;
                i = ly1.O;
                lk5 lk52 = lk5.y;
                lk5 lk53 = lk5.x;
                p81 p812 = p81.w;
                switch (i) {
                    case b85.b:
                        j = 9223372034707292159L;
                        o85.q(obj);
                        nf1.getClass();
                        boolean booleanValue = Boolean.TRUE.booleanValue();
                        if (!booleanValue) {
                            qk5.a();
                        }
                        ly1.z = g974;
                        qk5 qk53 = qk5;
                        ly1.A = qk53;
                        ly1.B = null;
                        hs2 hs23 = jk0;
                        ly1.C = hs23;
                        gs22 = gs2;
                        ly1.D = gs22;
                        sr2 sr24 = sr2;
                        ly1.E = sr24;
                        vr22 = snVar;
                        ly1.F = vr22;
                        ly1.L = booleanValue;
                        ly1.O = 1;
                        Object b = sb7.b(g974, ly1, 2);
                        if (b != p812) {
                            Object obj2 = b;
                            g972 = g974;
                            z = booleanValue;
                            obj = obj2;
                            sr2 sr25 = sr24;
                            hs22 = hs23;
                            sr22 = sr25;
                            qk52 = qk53;
                            z75 = null;
                            break;
                        }
                        break;
                    case 1:
                        j = 9223372034707292159L;
                        z = ly1.L;
                        sr22 = (sr2) ly1.E;
                        gs22 = (gs2) ly1.D;
                        hs22 = (hs2) ly1.C;
                        qk52 = (qk5) ly1.A;
                        g972 = (g97) ly1.z;
                        o85.q(obj);
                        z75 z753 = (z75) ly1.B;
                        vr22 = (vr2) ly1.F;
                        z75 = z753;
                        break;
                    case 2:
                        j = 9223372034707292159L;
                        float f2 = ly1.M;
                        cp0 cp0 = ly1.J;
                        g06 g064 = ly1.I;
                        qk5 qk54 = (qk5) ly1.F;
                        vr2 vr23 = (vr2) ly1.E;
                        o85.q(obj);
                        g97 g975 = (g97) ly1.z;
                        float f3 = f2;
                        Object obj3 = obj;
                        cp0 cp02 = cp0;
                        z75 = (z75) ly1.A;
                        g062 = (g06) ly1.G;
                        hs22 = (hs2) ly1.B;
                        g973 = g975;
                        g063 = g064;
                        sr22 = (sr2) ly1.D;
                        gs2 gs24 = (gs2) ly1.C;
                        g97 g976 = (g97) ly1.H;
                        gs22 = gs24;
                        break;
                    case 3:
                        j = 9223372034707292159L;
                        float f4 = ly1.M;
                        qk5 qk55 = ly1.K;
                        cp0 cp03 = ly1.J;
                        g06 g065 = ly1.I;
                        sr2 sr26 = (sr2) ly1.D;
                        float f5 = f4;
                        z75 z754 = (z75) ly1.A;
                        o85.q(obj);
                        gs2 gs25 = (gs2) ly1.C;
                        g973 = (g97) ly1.z;
                        p81 = p812;
                        g97 g977 = (g97) ly1.H;
                        hs22 = (hs2) ly1.B;
                        g062 = (g06) ly1.G;
                        vr2 vr24 = (vr2) ly1.E;
                        g063 = g065;
                        gs22 = gs25;
                        float f6 = f5;
                        lk5 = lk53;
                        qk5 qk56 = (qk5) ly1.F;
                        lk5 lk54 = lk52;
                        cp0 cp04 = cp03;
                        z75 z755 = z754;
                        break;
                    case 4:
                        j = 9223372034707292159L;
                        qk5 qk57 = (qk5) ly1.G;
                        qk5 qk58 = (qk5) ly1.F;
                        vr2 = (vr2) ly1.E;
                        sr23 = (sr2) ly1.D;
                        gs23 = (gs2) ly1.C;
                        hs2 = (hs2) ly1.B;
                        z752 = (z75) ly1.A;
                        g97 g978 = (g97) ly1.z;
                        o85.q(obj);
                        lk5 = lk53;
                        g06 = (g06) ly1.H;
                        p81 = p812;
                        ly1 ly13 = ly1;
                        break;
                    case 5:
                        j = 9223372034707292159L;
                        float f7 = ly1.M;
                        cp0 cp05 = ly1.J;
                        g06 g066 = ly1.I;
                        qk5 qk59 = (qk5) ly1.F;
                        gs2 gs26 = (gs2) ly1.C;
                        o85.q(obj);
                        g06 g067 = g066;
                        f = f7;
                        Object obj4 = obj;
                        cp0 cp06 = cp05;
                        ly1 ly14 = ly1;
                        g97 g979 = (g97) ly1.z;
                        p81 = p812;
                        g06 g068 = g067;
                        hs2 hs24 = (hs2) ly1.B;
                        g97 g9710 = (g97) ly1.H;
                        vr2 = (vr2) ly1.E;
                        hs2 = hs24;
                        lk5 lk55 = lk53;
                        g06 = (g06) ly1.G;
                        sr23 = (sr2) ly1.D;
                        z752 = (z75) ly1.A;
                        break;
                    case 6:
                        float f8 = ly1.M;
                        qk5 qk510 = ly1.K;
                        cp0 cp07 = ly1.J;
                        j = 9223372034707292159L;
                        g06 g069 = ly1.I;
                        qk5 qk511 = (qk5) ly1.F;
                        float f9 = f8;
                        z75 z756 = (z75) ly1.A;
                        o85.q(obj);
                        g97 g9711 = (g97) ly1.z;
                        lk5 = lk53;
                        p81 p813 = p812;
                        g06 g0610 = g069;
                        g06 = (g06) ly1.G;
                        gs23 = (gs2) ly1.C;
                        cp0 cp08 = cp07;
                        g97 g9712 = (g97) ly1.H;
                        lk5 lk56 = lk52;
                        hs2 = (hs2) ly1.B;
                        vr2 = (vr2) ly1.E;
                        z75 z757 = z756;
                        sr2 sr27 = (sr2) ly1.D;
                        f = f9;
                        ly1 ly15 = ly1;
                        break;
                    case 7:
                        sr2 sr28 = (sr2) ly1.A;
                        gs2 gs27 = (gs2) ly1.z;
                        o85.q(obj);
                        qk5 qk512 = null;
                        vr2 vr25 = (vr2) ly1.B;
                        g97 g9713 = (g97) ly1.C;
                        g97 g9714 = (g97) ly1.D;
                        ly1 ly16 = ly1;
                        g06 g0611 = (g06) ly1.E;
                        p81 = p812;
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ly1 = new h61(q502);
        Object obj5 = ly1.N;
        i = ly1.O;
        lk5 lk522 = lk5.y;
        lk5 lk532 = lk5.x;
        p81 p8122 = p81.w;
        switch (i) {
            case b85.b:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }
}
