package defpackage;

import android.graphics.RectF;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.home.navigation.Dialer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: yg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yg implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ yg(int i, int i2, Object obj) {
        this.w = i2;
        this.x = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r1v56, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r14v9, types: [int] */
    /* JADX WARNING: type inference failed for: r14v12 */
    /* JADX WARNING: type inference failed for: r14v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r3 == null) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        char c;
        char c2;
        Object obj3 = obj2;
        char c3 = 7;
        ik0 ik0 = null;
        ? r14 = 0;
        switch (this.w) {
            case b85.b:
                ly5 u = o85.u((RectF) obj);
                ly5 u2 = o85.u((RectF) obj3);
                switch (((kj6) this.x).w) {
                    case 8:
                        z = u.g(u2);
                        break;
                    default:
                        z = u2.a(u.b());
                        break;
                }
                return Boolean.valueOf(z);
            case 1:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.x;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 3) != 2) {
                    r14 = 1;
                }
                if (yt2.V(intValue & 1, r14)) {
                    ml4 f = yu6.f(jl4.w, 0.0f, 420.0f, 1);
                    boolean i2 = yt2.i(linkedHashMap);
                    Object Q = yt2.Q();
                    if (i2 || Q == ay0.a) {
                        Q = new gg0(6, (Object) linkedHashMap);
                        yt2.o0(Q);
                    }
                    x91.a(f, (s34) null, (la5) null, (vr) null, (ib) null, (eh2) null, false, (xf) null, (vr2) Q, yt2, 6, 510);
                } else {
                    yt2.Y();
                }
                return vs7.a;
            case 2:
                u36 u36 = (u36) this.x;
                ((Integer) obj).getClass();
                if (obj3 instanceof jx0) {
                    jx0 jx0 = (jx0) obj3;
                    up4 up4 = u36.h;
                    if (up4 == null) {
                        up4 up42 = cg6.a;
                        up4 = new up4();
                        u36.h = up4;
                    }
                    up4.k(jx0);
                    u36.f.b(jx0);
                }
                if (obj3 instanceof cu2) {
                    u36.e((cu2) obj3);
                }
                if (obj3 instanceof yx5) {
                    ((yx5) obj3).c();
                }
                return vs7.a;
            case 3:
                e41 e41 = (e41) this.x;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj3).intValue();
                Object obj4 = ay0.a;
                if ((intValue2 & 3) != 2) {
                    r14 = 1;
                }
                if (yt22.V(intValue2 & 1, r14)) {
                    boolean i3 = yt22.i(e41);
                    Object Q2 = yt22.Q();
                    if (i3 || Q2 == obj4) {
                        Object ydVar = new yd(0, e41, e41.class, "callContact", "callContact()V", 0, 0, 3);
                        yt22.o0(ydVar);
                        Q2 = ydVar;
                    }
                    sr2 sr2 = (sr2) ((zq3) Q2);
                    boolean i4 = yt22.i(e41);
                    Object Q3 = yt22.Q();
                    if (i4 || Q3 == obj4) {
                        Object ydVar2 = new yd(0, e41, e41.class, "callAsterisco99", "callAsterisco99()V", 0, 0, 4);
                        yt22.o0(ydVar2);
                        Q3 = ydVar2;
                    }
                    sr2 sr22 = (sr2) ((zq3) Q3);
                    boolean i5 = yt22.i(e41);
                    Object Q4 = yt22.Q();
                    if (i5 || Q4 == obj4) {
                        Object ydVar3 = new yd(0, e41, e41.class, "sendSms", "sendSms()V", 0, 0, 5);
                        yt22.o0(ydVar3);
                        Q4 = ydVar3;
                    }
                    fd1.h(sr2, sr22, (sr2) ((zq3) Q4), (ml4) null, yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7.a;
            case 4:
                ((Integer) obj3).getClass();
                fd1.e((y31) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            case 5:
                ((Integer) obj3).getClass();
                fd1.n((g41) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            case 6:
                ((Integer) obj3).getClass();
                pv8.k((ze7) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            case 7:
                we3 we3 = (we3) obj;
                we3 we32 = (we3) obj3;
                return (je2) this.x;
            case 8:
                yt2 yt23 = (yt2) obj;
                ((Integer) obj3).getClass();
                yt23.e0(666084174);
                String str = ((hd7) this.x).b;
                yt23.r(false);
                return str;
            case 9:
                ((Integer) obj3).getClass();
                r16.g((vu1) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            case 10:
                ((Integer) obj3).getClass();
                hj8.d((ml4) this.x, (yt2) obj, b85.v(49));
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                x83 x83 = (x83) this.x;
                yt2 yt24 = (yt2) obj;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 3) != 2) {
                    r14 = 1;
                }
                if (yt24.V(intValue3 & 1, r14)) {
                    d83.a(x83, (String) null, yu6.l(jl4.w, 19.0f), 0, yt24, 432, 8);
                } else {
                    yt24.Y();
                }
                return vs7.a;
            case 12:
                ta2 ta2 = (ta2) this.x;
                yt2 yt25 = (yt2) obj;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 3) != 2) {
                    r14 = 1;
                }
                if (yt25.V(intValue4 & 1, r14)) {
                    d83.a(ta2.a, ta2.b, (ml4) null, 0, yt25, 0, 12);
                } else {
                    yt25.Y();
                }
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                k63 k63 = (k63) obj;
                Integer num = (Integer) obj3;
                num.getClass();
                k63.getClass();
                return Long.valueOf(Math.max(((Number) ((uz1) this.x).H(k63, num)).longValue(), 0));
            case 14:
                ((Integer) obj3).getClass();
                ((lb3) this.x).a(b85.v(1), (yt2) obj);
                return vs7.a;
            case h75.g:
                qk5 qk5 = (qk5) obj;
                ((wd7) this.x).e(((l35) obj3).a);
                return vs7.a;
            case 16:
                fn4 fn4 = (fn4) this.x;
                yt2 yt26 = (yt2) obj;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt26.V(intValue5 & 1, z2)) {
                    yt26.H(fn4, yt26.m(), (Object) null, false);
                } else {
                    yt26.Y();
                }
                return vs7.a;
            case 17:
                bo4 bo4 = (bo4) this.x;
                Set set = (Set) obj;
                ix6 ix6 = (ix6) obj3;
                ? obj5 = new Object();
                synchronized (bo4.w) {
                    tp4 tp4 = bo4.x;
                    g5 g5Var = new g5((Object) set, (Object) bo4, (Object) obj5, 20);
                    mp7.Q(1, g5Var);
                    Object[] objArr = tp4.b;
                    long[] jArr = tp4.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr[i6];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j & 255) < 128) {
                                        g5Var.y(objArr[(i6 << 3) + i8]);
                                    }
                                    j >>= 8;
                                }
                                if (i7 != 8) {
                                }
                            }
                            if (i6 != length) {
                                i6++;
                            }
                        }
                    }
                    List list = (List) obj5.w;
                    if (list != null) {
                        int size = list.size();
                        while (r14 < size) {
                            ((xk6) list.get(r14)).c(vs7.a);
                            r14++;
                        }
                    }
                }
                return vs7.a;
            case 18:
                String str2 = (String) obj;
                String str3 = (String) obj3;
                str2.getClass();
                str3.getClass();
                ((vs4) this.x).g(str2, str3, true, false);
                return vs7.a;
            case 19:
                i98 i98 = (i98) this.x;
                yt2 yt27 = (yt2) obj;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt27.V(intValue6 & 1, z3)) {
                    ur urVar = new ur(10.0f, true, new h(2));
                    ml4 Z = t49.Z(jl4.w, t49.Y(yt27), true);
                    au0 a = zt0.a(urVar, xb4.K, yt27, 6);
                    int hashCode = Long.hashCode(yt27.T);
                    vf5 m = yt27.m();
                    ml4 E = gw8.E(yt27, Z);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt27.i0();
                    if (yt27.S) {
                        yt27.l(vy0);
                    } else {
                        yt27.r0();
                    }
                    g75.Q(tx0.f, yt27, a);
                    g75.Q(tx0.e, yt27, m);
                    g75.Q(tx0.g, yt27, Integer.valueOf(hashCode));
                    g75.O(yt27, tx0.h);
                    g75.Q(tx0.d, yt27, E);
                    rs4.o(l55.u(R.string.wifi_info_ssid, yt27), i98.a, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_bssid, yt27), i98.b, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_signal, yt27), i98.c, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_speed, yt27), i98.d, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_frequency, yt27), i98.e, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_local_ip, yt27), i98.f, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_router_ip, yt27), i98.g, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_dns, yt27), i98.h, yt27, 0);
                    rs4.o(l55.u(R.string.wifi_info_internet_ip, yt27), i98.i, yt27, 0);
                    yt27.r(true);
                } else {
                    yt27.Y();
                }
                return vs7.a;
            case 20:
                eg6 eg6 = (eg6) this.x;
                yt2 yt28 = (yt2) obj;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt28.V(intValue7 & 1, z4)) {
                    eg6.getContent().H(yt28, 0);
                } else {
                    yt28.Y();
                }
                return vs7.a;
            case 21:
                iu4 iu4 = (iu4) this.x;
                String str4 = (String) obj;
                String str5 = (String) obj3;
                str4.getClass();
                str5.getClass();
                iu4.getClass();
                iu4.a(new vd2(9), new Dialer(str4, str5));
                return vs7.a;
            case 22:
                rf4 rf4 = (rf4) this.x;
                yt2 yt29 = (yt2) obj;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (yt29.V(intValue8 & 1, z5)) {
                    vq6 vq6 = r16.i;
                    mb0.a(la3.a(we.f(rc9.w0(jl4.w, "indicatorRipple"), hr6.a(vq6, yt29)), rf4, d86.a(false, 0.0f, 0, hr6.a(vq6, yt29), 247)), yt29, 0);
                } else {
                    yt29.Y();
                }
                return vs7.a;
            case 23:
                ((Integer) obj3).getClass();
                mp7.y((a54) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            case 24:
                cf5 cf5 = (cf5) this.x;
                yt2 yt210 = (yt2) obj;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 3) != 2) {
                    r14 = 1;
                }
                if (yt210.V(intValue9 & 1, r14)) {
                    int ordinal = cf5.ordinal();
                    if (ordinal == 0) {
                        i = R.string.payment_tab_transferencia;
                    } else if (ordinal == 1) {
                        i = R.string.payment_tab_saldo;
                    } else {
                        h.c();
                        return null;
                    }
                    yf7.b(l55.u(i, yt210), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt210, 0, 0, 262142);
                } else {
                    yt210.Y();
                }
                return vs7.a;
            case 25:
                gy5 gy5 = (gy5) this.x;
                Iterable iterable = (Set) obj;
                ix6 ix62 = (ix6) obj3;
                synchronized (gy5.c) {
                    try {
                        if (((dy5) gy5.u.getValue()).compareTo(dy5.A) >= 0) {
                            up4 up43 = gy5.h;
                            if (iterable instanceof dg6) {
                                up4 up44 = ((dg6) iterable).w;
                                Object[] objArr2 = up44.b;
                                long[] jArr2 = up44.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j2 = jArr2[i9];
                                        if ((((~j2) << c3) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            int i11 = 0;
                                            while (i11 < i10) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj6 = objArr2[(i9 << 3) + i11];
                                                    c2 = c3;
                                                    if (!(obj6 instanceof o37) || ((o37) obj6).b(1)) {
                                                        up43.a(obj6);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j2 >>= 8;
                                                i11++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i10 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i9 != length2) {
                                            i9++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object next : iterable) {
                                    if (!(next instanceof o37) || ((o37) next).b(1)) {
                                        up43.a(next);
                                    }
                                }
                            }
                            ik0 = gy5.C();
                        }
                    } finally {
                    }
                }
                if (ik0 != null) {
                    ((kk0) ik0).f(vs7.a);
                }
                return vs7.a;
            case 26:
                ((Integer) obj3).getClass();
                d36.q((pl7) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            case 27:
                ((Integer) obj3).getClass();
                d36.c((oi0) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            case 28:
                ((Integer) obj3).getClass();
                d36.k((ew6) this.x, (yt2) obj, b85.v(1));
                return vs7.a;
            default:
                int intValue10 = ((Integer) obj).intValue();
                c81 c81 = (c81) obj3;
                d81 key = c81.getKey();
                c81 a0 = ((vd6) this.x).A.a0(key);
                if (key == me6.E) {
                    el3 el3 = (el3) a0;
                    el3 el32 = (el3) c81;
                    while (true) {
                        if (el32 == null) {
                            el32 = null;
                        } else if (el32 != el3 && (el32 instanceof sg6)) {
                            ap0 Q5 = ((sg6) el32).Q();
                            if (Q5 != null) {
                                el32 = Q5.getParent();
                            } else {
                                el32 = null;
                            }
                        }
                    }
                    if (el32 != el3) {
                        rf2.l("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", el32, ", expected child of ", el3, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                        return null;
                    }
                } else if (c81 != a0) {
                    intValue10 = Integer.MIN_VALUE;
                    return Integer.valueOf(intValue10);
                }
                intValue10++;
                return Integer.valueOf(intValue10);
        }
    }

    public /* synthetic */ yg(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
