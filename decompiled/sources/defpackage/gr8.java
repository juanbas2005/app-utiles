package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import io.ktor.http.InvalidCookieDateException;
import io.ktor.util.date.GMTDate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: gr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gr8 {
    public static ClassLoader a;
    public static Thread b;
    public static final zu0 c = new zu0(2);
    public static final fw0 d = new fw0(-51699941, new ww0(10), false);
    public static final rt0 e = rt0.G;
    public static final float f = 1.0f;
    public static final cr7 g = cr7.C;
    public static final m23 h = new m23(2);
    public static x83 i;

    public static final Object A(di2 di2, gs2 gs2, a97 a97) {
        int i2 = zi2.a;
        di2 di22 = di2;
        Object a2 = u(new on0(new yi2((Object) gs2, (f61) null, 0), di22, x32.w, -2, vc0.w), 0).a(n05.w, a97);
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        if (a2 != p81) {
            a2 = vs7;
        }
        if (a2 == p81) {
            return a2;
        }
        return vs7;
    }

    public static xw4 B(long j, long j2, long j3, yt2 yt2, int i2, int i3) {
        long j4;
        long j5;
        long j6;
        yt2 yt22 = yt2;
        rt0 rt0 = r16.d;
        long b2 = st0.b(st0.e(rt0, yt22), yt22);
        long e2 = st0.e(rt0, yt22);
        v88 a2 = w88.a(0, yt22);
        if ((i3 & 8) != 0) {
            j4 = st0.e(rt0, yt22);
        } else {
            j4 = j;
        }
        if ((i3 & 16) != 0) {
            j5 = st0.b(j4, yt22);
        } else {
            j5 = j2;
        }
        if ((i3 & 32) != 0) {
            j6 = st0.e(pd8.m, yt22);
        } else {
            j6 = j3;
        }
        long b3 = st0.b(j6, yt22);
        float f2 = tz1.a;
        long e3 = st0.e(b96.q, yt22);
        return new xw4(e2, b2, a2, j4, j5, j6, b3, e3, st0.b(e3, yt22));
    }

    public static final double C(int i2, int i3, int i4, int i5, wf6 wf6) {
        double d2 = ((double) i4) / ((double) i2);
        double d3 = ((double) i5) / ((double) i3);
        int ordinal = wf6.ordinal();
        if (ordinal == 0) {
            return Math.max(d2, d3);
        }
        if (ordinal == 1) {
            return Math.min(d2, d3);
        }
        h.c();
        return 0.0d;
    }

    public static il D(il ilVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) ilVar.x.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((kl) ilVar.y).a;
        }
        return new il(ilVar.w, Float.valueOf(f2), new kl(f3), ilVar.z, ilVar.A, ilVar.B);
    }

    public static final q27 E(ql4 ql4, ql4 ql42) {
        ql4.getClass();
        ql42.getClass();
        ql4.u0().size();
        ql42.u0().size();
        List<qp7> u0 = ql4.u0();
        u0.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(u0, 10));
        for (qp7 n : u0) {
            arrayList.add(n.n());
        }
        List<qp7> u02 = ql42.u0();
        u02.getClass();
        ArrayList arrayList2 = new ArrayList(et0.e0(u02, 10));
        for (qp7 g0 : u02) {
            fu6 g02 = g0.g0();
            g02.getClass();
            arrayList2.add(new p27((vw3) g02));
        }
        return new q27(1, sf4.a0(dt0.i1(arrayList, arrayList2)));
    }

    public static final di2 F(di2 di2) {
        if (!(di2 instanceof b37) && !(di2 instanceof tw1)) {
            return new tw1(di2);
        }
        return di2;
    }

    public static final Integer G(fv6 fv6, ky0 ky0, int i2, int i3) {
        Integer G;
        cu2 cu2;
        v36 v36;
        int[] iArr = fv6.b;
        while (true) {
            vt2 vt2 = null;
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (fv6.j(i2) && fv6.i(i2) == 206 && sg3.e(fv6.p(iArr, i2), ey0.e)) {
                Object h2 = fv6.h(i2, 0);
                if (h2 instanceof cu2) {
                    cu2 = (cu2) h2;
                } else {
                    cu2 = null;
                }
                if (cu2 != null) {
                    v36 = cu2.a;
                } else {
                    v36 = null;
                }
                if (v36 instanceof vt2) {
                    vt2 = (vt2) v36;
                }
                if (vt2 != null && vt2.w == ky0) {
                    return Integer.valueOf(i2);
                }
            }
            if (fv6.d(i2) && (G = G(fv6, ky0, i2 + 1, i4)) != null) {
                return Integer.valueOf(G.intValue());
            }
            i2 = i4;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object H(di2 di2, f61 f61) {
        dj2 dj2;
        int i2;
        Object obj;
        h06 h06;
        Object obj2;
        AbortFlowException e2;
        aj2 aj2;
        h06 h062;
        if (f61 instanceof dj2) {
            dj2 dj22 = (dj2) f61;
            int i3 = dj22.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dj22.C = i3 - Integer.MIN_VALUE;
                dj2 = dj22;
                Object obj3 = dj2.B;
                i2 = dj2.C;
                obj = o15.a;
                if (i2 != 0) {
                    o85.q(obj3);
                    ? obj4 = new Object();
                    obj4.w = obj;
                    aj2 aj22 = new aj2(0, obj4);
                    try {
                        dj2.z = obj4;
                        dj2.A = aj22;
                        dj2.C = 1;
                        Object a2 = di2.a(aj22, dj2);
                        p81 p81 = p81.w;
                        h06 = obj4;
                        if (a2 == p81) {
                            return p81;
                        }
                    } catch (AbortFlowException e3) {
                        aj2 aj23 = aj22;
                        e2 = e3;
                        aj2 = aj23;
                        h062 = obj4;
                        if (e2.w == aj2) {
                            e81 e81 = dj2.x;
                            e81.getClass();
                            r16.x(e81);
                            h06 = h062;
                            obj2 = h06.w;
                            if (obj2 != obj) {
                            }
                        } else {
                            throw e2;
                        }
                    }
                } else if (i2 == 1) {
                    aj2 = dj2.A;
                    h06 h063 = dj2.z;
                    try {
                        o85.q(obj3);
                        h06 = h063;
                    } catch (AbortFlowException e4) {
                        e2 = e4;
                        h062 = h063;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = h06.w;
                if (obj2 != obj) {
                    return obj2;
                }
                kj6.i("Expected at least one element");
                return null;
            }
        }
        dj2 = new h61(f61);
        Object obj32 = dj2.B;
        i2 = dj2.C;
        obj = o15.a;
        if (i2 != 0) {
        }
        obj2 = h06.w;
        if (obj2 != obj) {
        }
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object I(di2 di2, gs2 gs2, h61 h61) {
        ej2 ej2;
        int i2;
        Object obj;
        h06 h06;
        Object obj2;
        AbortFlowException e2;
        cj2 cj2;
        if (h61 instanceof ej2) {
            ej2 ej22 = (ej2) h61;
            int i3 = ej22.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ej22.C = i3 - Integer.MIN_VALUE;
                ej2 = ej22;
                Object obj3 = ej2.B;
                i2 = ej2.C;
                obj = o15.a;
                if (i2 != 0) {
                    o85.q(obj3);
                    ? obj4 = new Object();
                    obj4.w = obj;
                    cj2 cj22 = new cj2(gs2, obj4, 0);
                    try {
                        ej2.z = obj4;
                        ej2.A = cj22;
                        ej2.C = 1;
                        Object a2 = di2.a(cj22, ej2);
                        p81 p81 = p81.w;
                        if (a2 == p81) {
                            return p81;
                        }
                        h06 = obj4;
                    } catch (AbortFlowException e3) {
                        h06 = obj4;
                        e2 = e3;
                        cj2 = cj22;
                        if (e2.w == cj2) {
                            e81 e81 = ej2.x;
                            e81.getClass();
                            r16.x(e81);
                            obj2 = h06.w;
                            if (obj2 != obj) {
                            }
                        } else {
                            throw e2;
                        }
                    }
                } else if (i2 == 1) {
                    cj2 = ej2.A;
                    h06 = ej2.z;
                    try {
                        o85.q(obj3);
                    } catch (AbortFlowException e4) {
                        e2 = e4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = h06.w;
                if (obj2 != obj) {
                    return obj2;
                }
                kj6.i("Expected at least one element matching the predicate");
                return null;
            }
        }
        ej2 = new h61(h61);
        Object obj32 = ej2.B;
        i2 = ej2.C;
        obj = o15.a;
        if (i2 != 0) {
        }
        obj2 = h06.w;
        if (obj2 != obj) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object J(di2 di2, h61 h61) {
        gj2 gj2;
        int i2;
        h06 h06;
        AbortFlowException e2;
        aj2 aj2;
        h06 h062;
        if (h61 instanceof gj2) {
            gj2 gj22 = (gj2) h61;
            int i3 = gj22.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gj22.C = i3 - Integer.MIN_VALUE;
                gj2 = gj22;
                Object obj = gj2.B;
                i2 = gj2.C;
                if (i2 != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    aj2 aj22 = new aj2(1, obj2);
                    try {
                        gj2.z = obj2;
                        gj2.A = aj22;
                        gj2.C = 1;
                        Object a2 = di2.a(aj22, gj2);
                        p81 p81 = p81.w;
                        h06 = obj2;
                        if (a2 == p81) {
                            return p81;
                        }
                    } catch (AbortFlowException e3) {
                        aj2 aj23 = aj22;
                        e2 = e3;
                        aj2 = aj23;
                        h062 = obj2;
                        if (e2.w == aj2) {
                            e81 e81 = gj2.x;
                            e81.getClass();
                            r16.x(e81);
                            h06 = h062;
                            return h06.w;
                        }
                        throw e2;
                    }
                } else if (i2 == 1) {
                    aj2 = gj2.A;
                    h06 h063 = gj2.z;
                    try {
                        o85.q(obj);
                        h06 = h063;
                    } catch (AbortFlowException e4) {
                        e2 = e4;
                        h062 = h063;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return h06.w;
            }
        }
        gj2 = new h61(h61);
        Object obj3 = gj2.B;
        i2 = gj2.C;
        if (i2 != 0) {
        }
        return h06.w;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object K(di2 di2, gs2 gs2, h61 h61) {
        hj2 hj2;
        int i2;
        h06 h06;
        AbortFlowException e2;
        cj2 cj2;
        if (h61 instanceof hj2) {
            hj2 hj22 = (hj2) h61;
            int i3 = hj22.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hj22.C = i3 - Integer.MIN_VALUE;
                hj2 = hj22;
                Object obj = hj2.B;
                i2 = hj2.C;
                if (i2 != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    cj2 cj22 = new cj2(gs2, obj2, 1);
                    try {
                        hj2.z = obj2;
                        hj2.A = cj22;
                        hj2.C = 1;
                        Object a2 = di2.a(cj22, hj2);
                        p81 p81 = p81.w;
                        if (a2 == p81) {
                            return p81;
                        }
                        h06 = obj2;
                    } catch (AbortFlowException e3) {
                        h06 = obj2;
                        e2 = e3;
                        cj2 = cj22;
                        if (e2.w == cj2) {
                            e81 e81 = hj2.x;
                            e81.getClass();
                            r16.x(e81);
                            return h06.w;
                        }
                        throw e2;
                    }
                } else if (i2 == 1) {
                    cj2 = hj2.A;
                    h06 = hj2.z;
                    try {
                        o85.q(obj);
                    } catch (AbortFlowException e4) {
                        e2 = e4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return h06.w;
            }
        }
        hj2 = new h61(h61);
        Object obj3 = hj2.B;
        i2 = hj2.C;
        if (i2 != 0) {
        }
        return h06.w;
    }

    public static final di2 L(di2 di2, e81 e81) {
        if (e81.a0(me6.E) != null) {
            rf2.j("Flow context cannot contain job in it. Had ", e81);
            return null;
        } else if (e81.equals(x32.w)) {
            return di2;
        } else {
            if (di2 instanceof mt2) {
                return mt2.c((mt2) di2, e81, 0, (vc0) null, 6);
            }
            return new kn0(di2, e81, 0, (vc0) null, 12);
        }
    }

    public static Object M(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return y4.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final boolean N(vw3 vw3) {
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (n0 instanceof v62) {
            return true;
        }
        if (!(n0 instanceof zg2) || !(((zg2) n0).w0() instanceof v62)) {
            return false;
        }
        return true;
    }

    public static d37 O() {
        return BalanceNotificationService.E;
    }

    public static cf4 P(yt2 yt2) {
        t37 t37 = ch4.b;
        return new cf4(mp7.W(((zg4) yt2.k(t37)).a), kl8.s(((zg4) yt2.k(t37)).a), iv4.a(0, 0, 0, 0, 0, yt2, 255), 5);
    }

    public static final void Q(di2 di2, o81 o81) {
        ar7.H(o81, (e81) null, (r81) null, new ot(di2, (f61) null, 7), 3);
    }

    public static int R(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        rf2.i(b81.l(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [re3, pe3] */
    /* JADX WARNING: type inference failed for: r1v6, types: [re3, pe3] */
    /* JADX WARNING: type inference failed for: r1v17, types: [re3, pe3] */
    public static GMTDate S(String str) {
        String str2 = str;
        str2.getClass();
        g63 g63 = new g63(str2);
        g63.b(new j5(25));
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        xl4 xl4 = null;
        while (true) {
            if (g63.b >= str2.length()) {
                break;
            } else if (g63.b < str2.length() && tf4.D(str2.charAt(g63.b))) {
                int i2 = g63.b;
                g63.b(new j5(26));
                String substring = str2.substring(i2, g63.b);
                if (num == null || num2 == null || num3 == null) {
                    g63 g632 = new g63(substring);
                    int i3 = g632.b;
                    if (g632.a(v61.B)) {
                        g632.a(v61.C);
                        int parseInt = Integer.parseInt(substring.substring(i3, g632.b));
                        if (g632.a(v61.x)) {
                            int i4 = g632.b;
                            if (g632.a(v61.D)) {
                                g632.a(v61.E);
                                int parseInt2 = Integer.parseInt(substring.substring(i4, g632.b));
                                if (g632.a(v61.y)) {
                                    int i5 = g632.b;
                                    if (g632.a(v61.F)) {
                                        g632.a(v61.G);
                                        int parseInt3 = Integer.parseInt(substring.substring(i5, g632.b));
                                        if (g632.a(v61.z)) {
                                            g632.b(v61.A);
                                        }
                                        Integer valueOf = Integer.valueOf(parseInt);
                                        Integer valueOf2 = Integer.valueOf(parseInt2);
                                        num3 = Integer.valueOf(parseInt3);
                                        num = valueOf;
                                        num2 = valueOf2;
                                        g63.b(new j5(27));
                                    }
                                }
                            }
                        }
                    }
                }
                if (num4 == null) {
                    g63 g633 = new g63(substring);
                    int i6 = g633.b;
                    if (g633.a(e7.Z)) {
                        g633.a(e7.a0);
                        int parseInt4 = Integer.parseInt(substring.substring(i6, g633.b));
                        if (g633.a(e7.X)) {
                            g633.b(e7.Y);
                        }
                        num4 = Integer.valueOf(parseInt4);
                        g63.b(new j5(27));
                    }
                }
                if (xl4 == null && substring.length() >= 3) {
                    w52 w52 = xl4.z;
                    w52.getClass();
                    e2 e2Var = new e2(0, w52);
                    while (true) {
                        if (!e2Var.hasNext()) {
                            break;
                        }
                        xl4 xl42 = (xl4) e2Var.next();
                        if (k57.u0(substring, xl42.w, true)) {
                            xl4 = xl42;
                            break;
                        }
                    }
                    g63.b(new j5(27));
                }
                if (num5 == null) {
                    g63 g634 = new g63(substring);
                    int i7 = g634.b;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= 2) {
                            for (int i9 = 0; i9 < 2; i9++) {
                                g634.a(v61.K);
                            }
                            int parseInt5 = Integer.parseInt(g634.a.substring(i7, g634.b));
                            if (g634.a(v61.H)) {
                                g634.b(v61.I);
                            }
                            num5 = Integer.valueOf(parseInt5);
                        } else if (!g634.a(v61.J)) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                g63.b(new j5(27));
            }
        }
        ? pe3 = new pe3(70, 99, 1);
        if (num5 == null || !pe3.f(num5.intValue())) {
            ? pe32 = new pe3(0, 69, 1);
            if (num5 != null && pe32.f(num5.intValue())) {
                num5 = Integer.valueOf(num5.intValue() + 2000);
            }
        } else {
            num5 = Integer.valueOf(num5.intValue() + 1900);
        }
        y(str2, "day-of-month", num4);
        y(str2, "month", xl4);
        y(str2, "year", num5);
        y(str2, "time", num);
        y(str2, "time", num2);
        y(str2, "time", num3);
        if (!new pe3(1, 31, 1).f(num4.intValue())) {
            throw new InvalidCookieDateException(str2, "day-of-month not in [1,31]");
        } else if (num5.intValue() < 1601) {
            throw new InvalidCookieDateException(str2, "year >= 1601");
        } else if (num.intValue() > 23) {
            throw new InvalidCookieDateException(str2, "hours > 23");
        } else if (num2.intValue() > 59) {
            throw new InvalidCookieDateException(str2, "minutes > 59");
        } else if (num3.intValue() <= 59) {
            return eg1.a(num3.intValue(), num2.intValue(), num.intValue(), num4.intValue(), xl4, num5.intValue());
        } else {
            throw new InvalidCookieDateException(str2, "seconds > 59");
        }
    }

    public static final long T(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((float) ((int) (j2 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((float) ((int) (j2 & 4294967295L))))) & 4294967295L);
    }

    public static final String[] U(Metadata metadata) {
        String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 != null) {
            return d1;
        }
        throw new IllegalArgumentException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", (Throwable) null);
    }

    public static final long V(long j) {
        int round = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) round) << 32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = (defpackage.gn0) r7;
     */
    public static final xw5 W(di2 di2, o81 o81, x27 x27, Object obj) {
        kg5 kg5;
        r81 r81;
        gn0 gn0;
        di2 g2;
        en0.c.getClass();
        dn0 dn0 = dn0.a;
        if (!(di2 instanceof gn0) || (g2 = gn0.g()) == null) {
            kg5 = new kg5(15, di2, x32.w);
        } else {
            if (gn0.x != -3) {
            }
            kg5 = new kg5(15, g2, gn0.w);
        }
        d37 a2 = e37.a(obj);
        e81 e81 = (e81) kg5.y;
        di2 di22 = (di2) kg5.x;
        if (x27.equals(is6.a)) {
            r81 = r81.w;
        } else {
            r81 = r81.z;
        }
        return new xw5(a2, ar7.G(o81, e81, r81, new ng(x27, di22, a2, obj, (f61) null)));
    }

    public static final ml4 X(ml4 ml4, kg5 kg5, ne1 ne1, ue7 ue7, o71 o71) {
        return ml4.d(new od7(kg5, ne1, ue7, o71));
    }

    public static final String Y(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (!Float.isInfinite(f2)) {
            int max = Math.max(1, 0);
            float pow = (float) Math.pow(10.0d, (double) max);
            float f3 = f2 * pow;
            int i2 = (int) f3;
            if (f3 - ((float) i2) >= 0.5f) {
                i2++;
            }
            float f4 = ((float) i2) / pow;
            if (max > 0) {
                return String.valueOf(f4);
            }
            return String.valueOf((int) f4);
        } else if (f2 < 0.0f) {
            return "-Infinity";
        } else {
            return "Infinity";
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Integer, code=java.lang.Object, for r9v0, types: [java.lang.Integer] */
    public static final ArrayList Z(fv6 fv6, int i2, Object obj) {
        Object obj2;
        tw5 tw5 = new tw5(fv6);
        int q = fv6.q(i2);
        Object a2 = fv6.a(i2);
        while (i2 >= 0) {
            if (fv6.k(i2)) {
                obj2 = fv6.p(fv6.b, i2);
            } else {
                obj2 = ay0.a;
            }
            tw5.h(fv6.i(i2), obj2, fv6.a.s(i2), obj);
            if (q >= 0) {
                Object obj3 = a2;
                a2 = fv6.a(q);
                i2 = q;
                q = fv6.q(q);
                obj = obj3;
            } else {
                i2 = q;
                obj = a2;
            }
        }
        return tw5.w;
    }

    public static il a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new il(we.v, Float.valueOf(f2), new kl(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static Object a0(fg0 fg0, byte[] bArr, h61 h61) {
        fg0.e().D(bArr.length, bArr);
        Object S = gl0.S(fg0, h61);
        if (S == p81.w) {
            return S;
        }
        return vs7.a;
    }

    public static final void b(int i2, yt2 yt2) {
        boolean z;
        yt2.g0(-1337959379);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            i(l55.u(R.string.title_apn_nauta_config, yt2), h03.l, yt2, 48);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new uz1(i2, 7);
        }
    }

    public static k68 b0(o81 o81, e81 e81, gs2 gs2, int i2) {
        if ((i2 & 1) != 0) {
            e81 = x32.w;
        }
        o81.getClass();
        e81.getClass();
        af0 af0 = new af0();
        h27 H = ar7.H(o81, e81, (r81) null, new w6(gs2, af0, (f61) null), 2);
        H.v(new gg0(0, (Object) af0));
        return new k68(5, af0, H);
    }

    public static final void c(String str, yt2 yt2, int i2) {
        int i3;
        boolean z;
        String str2 = str;
        yt2 yt22 = yt2;
        yt22.g0(1204602856);
        if (yt22.g(str2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            long d2 = uq3.d(4284708234L);
            long d3 = uq3.d(4288656326L);
            if (d18.a()) {
                d2 = za5.k(d3);
            } else if (d18.b()) {
                d2 = d3;
            }
            yf7.b(str2, (ml4) null, d2, ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(20), 0, false, 0, 0, (tg7) null, yt2, (i4 & 14) | 24576, 48, 260074);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new q20(i2, 9, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b0, code lost:
        if (r2 == null) goto L_0x00e5;
     */
    public static synchronized ClassLoader c0() {
        ClassLoader classLoader;
        ut utVar;
        SecurityException e2;
        ThreadGroup threadGroup;
        ut utVar2;
        synchronized (gr8.class) {
            if (a == null) {
                Thread thread = b;
                ClassLoader classLoader2 = null;
                if (thread == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                int activeGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= activeGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i3];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int activeCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[activeCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i2 >= activeCount) {
                                        utVar = null;
                                        break;
                                    }
                                    utVar = threadArr[i2];
                                    if ("GmsDynamite".equals(utVar.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (utVar == null) {
                                    try {
                                        utVar2 = new ut(threadGroup, "GmsDynamite");
                                    } catch (SecurityException e3) {
                                        e2 = e3;
                                        try {
                                            String message = e2.getMessage();
                                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
                                            sb.append("Failed to enumerate thread/threadgroup ");
                                            sb.append(message);
                                            Log.w("DynamiteLoaderV2CL", sb.toString());
                                            thread = utVar;
                                            b = thread;
                                        } catch (Throwable th) {
                                            while (true) {
                                                throw th;
                                            }
                                        }
                                    }
                                    try {
                                        utVar2.setContextClassLoader((ClassLoader) null);
                                        utVar2.start();
                                        utVar = utVar2;
                                    } catch (SecurityException e4) {
                                        e2 = e4;
                                        utVar = utVar2;
                                        String message2 = e2.getMessage();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                        sb2.append("Failed to enumerate thread/threadgroup ");
                                        sb2.append(message2);
                                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        thread = utVar;
                                        b = thread;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e2 = e5;
                                utVar = null;
                                String message22 = e2.getMessage();
                                StringBuilder sb22 = new StringBuilder(String.valueOf(message22).length() + 39);
                                sb22.append("Failed to enumerate thread/threadgroup ");
                                sb22.append(message22);
                                Log.w("DynamiteLoaderV2CL", sb22.toString());
                                thread = utVar;
                                b = thread;
                            }
                        }
                        thread = utVar;
                    }
                    b = thread;
                }
                synchronized (thread) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e6) {
                        String message3 = e6.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message3).length() + 41);
                        sb3.append("Failed to get thread context classloader ");
                        sb3.append(message3);
                        Log.w("DynamiteLoaderV2CL", sb3.toString());
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }

    public static final od d(hg hgVar) {
        Canvas canvas = pd.a;
        od odVar = new od();
        odVar.a = new Canvas(rg3.h(hgVar));
        return odVar;
    }

    public static final void e(fw0 fw0, yt2 yt2, int i2) {
        boolean z;
        yt2 yt22;
        yt2.g0(-1124871286);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            o96 a2 = q96.a(18.0f);
            long d2 = uq3.d(4294967295L);
            long d3 = uq3.d(4279575600L);
            if (d18.a()) {
                d2 = za5.k(d3);
            } else if (d18.b()) {
                d2 = d3;
            }
            yt22 = yt2;
            we.b(yu6.a, a2, rc9.w(d2, yt2, 24576), rc9.x(62, 2.0f), su0.J(1504585084, new ge0(fw0, 3), yt2), yt22, 196614, 16);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new x30(fw0, i2, 5);
        }
    }

    public static final void f(int i2, yt2 yt2) {
        boolean z;
        yt2.g0(-707334626);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            i(l55.u(R.string.title_email_client_config, yt2), h03.n, yt2, 48);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new uz1(i2, 8);
        }
    }

    public static final void g(int i2, yt2 yt2) {
        boolean z;
        int i3 = i2;
        yt2 yt22 = yt2;
        yt22.g0(1705732321);
        if (i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            String u = l55.u(R.string.title_dialing_format, yt22);
            String u2 = l55.u(R.string.marcacion_llamadas_nacionales, yt22);
            String u3 = l55.u(R.string.marcacion_fijo_prefix, yt22);
            String u4 = l55.u(R.string.marcacion_fijo_format, yt22);
            String u5 = l55.u(R.string.marcacion_movil_prefix, yt22);
            String u6 = l55.u(R.string.marcacion_movil_format, yt22);
            String u7 = l55.u(R.string.marcacion_llamadas_internacionales, yt22);
            i(u, su0.J(-1064588107, new pb3(u3, u4, u5, u6, l55.u(R.string.marcacion_intl_fijo_prefix, yt22), l55.u(R.string.marcacion_intl_fijo_format, yt22), l55.u(R.string.marcacion_intl_movil_prefix, yt22), l55.u(R.string.marcacion_intl_movil_format, yt22), l55.u(R.string.marcacion_exterior_cuba_prefix, yt22), l55.u(R.string.marcacion_exterior_cuba_format, yt22), l55.u(R.string.marcacion_sms_format, yt22), u2, u7, l55.u(R.string.marcacion_sms_header, yt22)), yt22), yt22, 48);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new uz1(i3, 12);
        }
    }

    public static final void h(int i2, yt2 yt2) {
        boolean z;
        yt2.g0(1392770432);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            String u = l55.u(R.string.title_important, yt2);
            String u2 = l55.u(R.string.importante_p1a, yt2);
            String u3 = l55.u(R.string.importante_con_texto, yt2);
            String u4 = l55.u(R.string.importante_p2a, yt2);
            String h2 = f21.h(" ", l55.u(R.string.importante_soporta_redes, yt2), " ");
            i(u, su0.J(-291026092, new j17(u2, u3, u4, l55.u(R.string.importante_en_pais_envia, yt2), l55.u(R.string.importante_gratis_al, yt2), l55.u(R.string.importante_con_los, yt2), l55.u(R.string.importante_p2_end, yt2), l55.u(R.string.importante_p3a, yt2), h2, f21.h(" ", l55.u(R.string.importante_8_digitos_imei, yt2), " ")), yt2), yt2, 48);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new uz1(i2, 5);
        }
    }

    public static final void i(String str, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z;
        yt2 yt22;
        yt2.g0(-1335005544);
        if (yt2.g(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i4 & 1, z)) {
            o96 a2 = q96.a(18.0f);
            long d2 = uq3.d(4294967295L);
            long d3 = uq3.d(4279575600L);
            if (d18.a()) {
                d2 = za5.k(d3);
            } else if (d18.b()) {
                d2 = d3;
            }
            yt22 = yt2;
            we.b(yu6.a, a2, rc9.w(d2, yt2, 24576), rc9.x(62, 2.0f), su0.J(-488015990, new gc5(12, (Object) str, (Object) fw0), yt2), yt22, 196614, 16);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new d70(str, fw0, i2);
        }
    }

    public static final void j(is2 is2, qb3 qb3, yt2 yt2, int i2) {
        int i3;
        boolean z;
        is2.getClass();
        yt2.g0(-1686444975);
        if (yt2.g(is2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2 | 16;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i4 & 1, z)) {
            yt2.a0();
            if ((i2 & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    qb3 = (qb3) n85.p(b26.a.b(qb3.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i5 = i4 & -113;
            yt2.s();
            sg3.c((is7) hj8.n(qb3.b, yt2).getValue(), is2, h03.g, yt2, ((i5 << 3) & 112) | 392);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(is2, qb3, i2, 20);
        }
    }

    public static final void k(nb3 nb3, yt2 yt2, int i2) {
        boolean z;
        yt2.g0(1726717040);
        int i3 = i2 & 1;
        if (i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3, z)) {
            ml4 O = x91.O(x91.M(t49.Z(yu6.c, t49.Y(yt2), true), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            au0 a2 = zt0.a(wr.c, xb4.K, yt2, 0);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, O);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, a2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            jl4 jl4 = jl4.w;
            k75.a(yt2, yu6.d(jl4, 8.0f));
            b(0, yt2);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            h(0, yt2);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            p(0, yt2);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            g(0, yt2);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            f(0, yt2);
            i(pb4.j(jl4, 12.0f, yt2, R.string.title_data_consumption_rate, yt2), h03.h, yt2, 48);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            m(0, yt2);
            i(pb4.j(jl4, 12.0f, yt2, R.string.title_internet_rate, yt2), h03.i, yt2, 48);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            n(0, yt2);
            i(pb4.j(jl4, 12.0f, yt2, R.string.title_voicemail_and_transfer, yt2), h03.j, yt2, 48);
            i(pb4.j(jl4, 12.0f, yt2, R.string.title_international_calls_prepaid, yt2), h03.k, yt2, 48);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            o(0, yt2);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            k75.a(yt2, yu6.d(jl4, 60.0f));
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ob3(i2, 0, (Object) nb3);
        }
    }

    public static final void l(fw0 fw0, yt2 yt2, int i2) {
        boolean z;
        yt2.g0(-709502251);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            t37 t37 = te6.a;
            re6 re6 = (re6) yt2.k(t37);
            pe6 q = b85.q(yt2);
            Object[] objArr = {re6};
            kg5 kg5 = new kg5(12, new uz1(17), new w34(0, re6, q));
            boolean i3 = yt2.i(re6) | yt2.i(q);
            Object Q = yt2.Q();
            if (i3 || Q == ay0.a) {
                Q = new qm3(3, (Object) re6, (Object) q);
                yt2.o0(Q);
            }
            x34 x34 = (x34) u55.t(objArr, kg5, (sr2) Q, yt2, 0);
            t49.c(t37.a(x34), su0.J(-412824043, new p13(24, (Object) fw0, (Object) x34), yt2), yt2, 56);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new x30(fw0, i2, 6);
        }
    }

    public static final void m(int i2, yt2 yt2) {
        boolean z;
        yt2.g0(2044272303);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            e(h03.o, yt2, 6);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new uz1(i2, 9);
        }
    }

    public static final void n(int i2, yt2 yt2) {
        boolean z;
        yt2.g0(995171871);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            e(h03.p, yt2, 6);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new uz1(i2, 6);
        }
    }

    public static final void o(int i2, yt2 yt2) {
        boolean z;
        yt2.g0(-773790723);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            e(h03.q, yt2, 6);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new uz1(i2, 11);
        }
    }

    public static final void p(int i2, yt2 yt2) {
        boolean z;
        yt2.g0(1263382669);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            i(l55.u(R.string.title_how_to_connect_wifi, yt2), h03.m, yt2, 48);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new uz1(i2, 10);
        }
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final Exception r(u uVar, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            String concat = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(uVar.a);
            CreateCredentialException createCredentialException = new CreateCredentialException(str, concat);
            if (concat.length() > 0) {
                return createCredentialException;
            }
            h.q("type must not be empty");
            throw null;
        } else if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(uVar, str);
        } else {
            throw new Exception();
        }
    }

    public static final boolean s(float f2) {
        if (Float.isNaN(f2) || Math.abs(f2) < 0.5f) {
            return true;
        }
        return false;
    }

    public static final xw5 t(d37 d37) {
        return new xw5(d37, (h27) null);
    }

    public static di2 u(di2 di2, int i2) {
        vc0 vc0;
        if (i2 >= 0 || i2 == -2 || i2 == -1) {
            if (i2 == -1) {
                i2 = 0;
                vc0 = vc0.x;
            } else {
                vc0 = vc0.w;
            }
            int i3 = i2;
            vc0 vc02 = vc0;
            if (di2 instanceof mt2) {
                return mt2.c((mt2) di2, (e81) null, i3, vc02, 1);
            }
            return new kn0(di2, (e81) null, i3, vc02, 2);
        }
        h.j(hl6.k(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
        return null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC] */
    public static final java.util.List v(defpackage.jv6 r5, java.lang.Object r6, int r7, java.lang.Integer r8) {
        /*
            boolean r0 = r5.w
            if (r0 != 0) goto L_0x009b
            int r0 = r5.p()
            if (r0 == 0) goto L_0x009b
            tw5 r0 = new tw5
            r0.<init>(r5)
            if (r8 == 0) goto L_0x0016
            int r8 = r8.intValue()
            goto L_0x0020
        L_0x0016:
            int r8 = r5.v
            if (r8 >= 0) goto L_0x0020
            int[] r8 = r5.b
            int r8 = r5.G(r8, r7)
        L_0x0020:
            if (r6 != 0) goto L_0x0044
            int r6 = r5.i
            int[] r1 = r5.b
            int r2 = r5.r(r7)
            int r1 = r5.P(r1, r2)
            int r6 = r6 - r1
            yo4 r1 = r5.s
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r1.b(r7)
            lp4 r1 = (defpackage.lp4) r1
            if (r1 == 0) goto L_0x003e
            int r1 = r1.b
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x0044:
            int r1 = r5.r(r7)
            int r1 = r1 * 5
            int[] r2 = r5.b
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0054
            int r1 = r5.s(r7)
            goto L_0x0061
        L_0x0054:
            if (r8 < 0) goto L_0x005b
            int r7 = r5.G(r2, r8)
            goto L_0x005c
        L_0x005b:
            r7 = r8
        L_0x005c:
            int r1 = r5.s(r8)
            goto L_0x0092
        L_0x0061:
            if (r7 < 0) goto L_0x0098
            int r2 = r5.r(r7)
            int[] r3 = r5.b
            int r2 = r2 * 5
            int r2 = r2 + 1
            r2 = r3[r2]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0079
            java.lang.Object r2 = r5.t(r7)
            goto L_0x007b
        L_0x0079:
            d63 r2 = defpackage.ay0.a
        L_0x007b:
            au2 r3 = r5.Q(r7)
            r0.h(r1, r2, r3, r6)
            st2 r6 = r5.b(r7)
            if (r8 < 0) goto L_0x0096
            int[] r7 = r5.b
            int r7 = r5.G(r7, r8)
            int r1 = r5.s(r8)
        L_0x0092:
            r4 = r8
            r8 = r7
            r7 = r4
            goto L_0x0061
        L_0x0096:
            r7 = r8
            goto L_0x0061
        L_0x0098:
            java.util.ArrayList r5 = r0.w
            return r5
        L_0x009b:
            a42 r5 = defpackage.a42.w
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr8.v(jv6, java.lang.Integer, int, java.lang.Integer):java.util.List");
    }

    public static final xi0 w(gs2 gs2) {
        return new xi0(gs2, x32.w, -2, vc0.w);
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v4, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Serializable x(di2 di2, fi2 fi2, h61 h61) {
        si2 si2;
        int i2;
        h06 h06;
        Throwable th;
        CancellationException E;
        if (h61 instanceof si2) {
            si2 si22 = (si2) h61;
            int i3 = si22.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                si22.B = i3 - Integer.MIN_VALUE;
                si2 = si22;
                Object obj = si2.A;
                i2 = si2.B;
                if (i2 != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    try {
                        sw1 sw1 = new sw1(fi2, obj2);
                        si2.z = obj2;
                        si2.B = 1;
                        Object a2 = di2.a(sw1, si2);
                        p81 p81 = p81.w;
                        if (a2 == p81) {
                            return p81;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        h06 = obj2;
                        th = (Throwable) h06.w;
                        e81 e81 = si2.x;
                        e81.getClass();
                        el3 el3 = (el3) e81.a0(me6.E);
                        if (th != null) {
                        }
                    }
                } else if (i2 == 1) {
                    h06 = si2.z;
                    try {
                        o85.q(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        th = (Throwable) h06.w;
                        if (th == null || !th.equals(th)) {
                            e81 e812 = si2.x;
                            e812.getClass();
                            el3 el32 = (el3) e812.a0(me6.E);
                            if (el32 == null || !el32.isCancelled() || (E = el32.E()) == null || !E.equals(th)) {
                                if (th != null) {
                                    return th;
                                }
                                if (th instanceof CancellationException) {
                                    su0.b(th, th);
                                    throw th;
                                }
                                su0.b(th, th);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        si2 = new h61(h61);
        Object obj3 = si2.A;
        i2 = si2.B;
        if (i2 != 0) {
        }
    }

    public static void y(String str, String str2, Object obj) {
        if (obj == null) {
            throw new InvalidCookieDateException(str, "Could not find ".concat(str2));
        }
    }

    public static final void z(fg0 fg0, Throwable th) {
        fg0.getClass();
        if (th == null) {
            o0 o0Var = new o0(1, fg0, fg0.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 2);
            zu0 zu0 = c;
            try {
                tv1.a(rc9.a0(new tg3(o0Var)), vs7.a);
            } catch (Throwable th2) {
                kl8.k(zu0, th2);
                throw null;
            }
        } else {
            fg0.a(th);
        }
    }
}
