package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: of6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class of6 implements gs2 {
    public final /* synthetic */ int w;

    public /* synthetic */ of6(int i) {
        this.w = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i;
        Object obj3 = obj;
        int i2 = this.w;
        z53 z53 = wl6.a;
        boolean z = false;
        Integer num = null;
        switch (i2) {
            case b85.b:
                ne6 ne6 = (ne6) obj3;
                nc5 nc5 = (nc5) obj2;
                Object a = qf6.a(new hc7(nc5.a), qf6.s, ne6);
                Object a2 = qf6.a(new ud7(nc5.b), qf6.t, ne6);
                Object a3 = qf6.a(new wg7(nc5.c), qf6.x, ne6);
                mf7 mf7 = nc5.d;
                mf7 mf72 = mf7.c;
                Object a4 = qf6.a(mf7, qf6.m, ne6);
                Object a5 = qf6.a(nc5.e, rf6.a, ne6);
                m64 m64 = nc5.f;
                m64 m642 = m64.d;
                return sg3.f(a, a2, a3, a4, a5, qf6.a(m64, qf6.C, ne6), qf6.a(new g64(nc5.g), rf6.c, ne6), qf6.a(new i73(nc5.h), qf6.u, ne6), qf6.a(nc5.i, rf6.d, ne6));
            case 1:
                ne6 ne62 = (ne6) obj3;
                return ((uu7) obj2).a;
            case 2:
                ne6 ne63 = (ne6) obj3;
                yy6 yy6 = (yy6) obj2;
                jt0 jt0 = new jt0(yy6.a.b());
                pf6 pf6 = qf6.r;
                Object a6 = qf6.a(jt0, pf6, ne63);
                wg7 wg7 = new wg7(yy6.b);
                pf6 pf62 = qf6.x;
                Object a7 = qf6.a(wg7, pf62, ne63);
                am2 am2 = yy6.c;
                am2 am22 = am2.x;
                Object a8 = qf6.a(am2, qf6.n, ne63);
                Object a9 = qf6.a(yy6.d, qf6.v, ne63);
                Object a10 = qf6.a(yy6.e, qf6.w, ne63);
                String str = yy6.g;
                Object a11 = qf6.a(new wg7(yy6.h), pf62, ne63);
                Object a12 = qf6.a(yy6.i, qf6.o, ne63);
                Object a13 = qf6.a(yy6.j, qf6.l, ne63);
                ya4 ya4 = yy6.k;
                ya4 ya42 = ya4.y;
                Object a14 = qf6.a(ya4, qf6.A, ne63);
                Object a15 = qf6.a(new jt0(yy6.l), pf6, ne63);
                Object a16 = qf6.a(yy6.m, qf6.k, ne63);
                lq6 lq6 = yy6.n;
                lq6 lq62 = lq6.d;
                return sg3.f(a6, a7, a8, a9, a10, -1, str, a11, a12, a13, a14, a15, a16, qf6.a(lq6, qf6.q, ne63));
            case 3:
                ne6 ne64 = (ne6) obj3;
                gg7 gg7 = (gg7) obj2;
                yy6 yy62 = gg7.a;
                kg5 kg5 = qf6.i;
                return sg3.f(qf6.a(yy62, kg5, ne64), qf6.a(gg7.b, kg5, ne64), qf6.a(gg7.c, kg5, ne64), qf6.a(gg7.d, kg5, ne64));
            case 4:
                qj5 qj5 = (qj5) obj2;
                Boolean valueOf = Boolean.valueOf(qj5.a);
                kg5 kg52 = qf6.a;
                return sg3.f(valueOf, qf6.a(new k32(qj5.b), rf6.b, (ne6) obj3));
            case 5:
                ne6 ne65 = (ne6) obj3;
                return Integer.valueOf(((k32) obj2).a);
            case 6:
                ne6 ne66 = (ne6) obj3;
                return Integer.valueOf(((g64) obj2).a);
            case 7:
                jg7 jg7 = (jg7) obj2;
                return sg3.f(qf6.a(new ig7(jg7.a), rf6.e, (ne6) obj3), Boolean.valueOf(jg7.b));
            case 8:
                ne6 ne67 = (ne6) obj3;
                return Integer.valueOf(((ig7) obj2).a);
            case 9:
                ne6 ne68 = (ne6) obj3;
                return Integer.valueOf(((gh6) obj2).a.d());
            case 10:
                gq3 gq3 = (gq3) obj3;
                List list = (List) obj2;
                gq3.getClass();
                list.getClass();
                ArrayList G = i95.G(z53, list, true);
                G.getClass();
                return i95.z(gq3, G, new tm1(4, list));
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                gq3 gq32 = (gq3) obj3;
                List list2 = (List) obj2;
                gq32.getClass();
                list2.getClass();
                ArrayList G2 = i95.G(z53, list2, true);
                G2.getClass();
                zr3 z2 = i95.z(gq32, G2, new tm1(5, list2));
                if (z2 != null) {
                    return hj8.x(z2);
                }
                return null;
            case 12:
                ne6 ne69 = (ne6) obj3;
                se7 se7 = (se7) obj2;
                Float valueOf2 = Float.valueOf(se7.a.d());
                if (((z75) se7.f.getValue()) == z75.w) {
                    z = true;
                }
                return sg3.E(valueOf2, Boolean.valueOf(z));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ne6 ne610 = (ne6) obj3;
                hf7 hf7 = (hf7) obj2;
                return sg3.f(qf6.a(hf7.a, qf6.a, ne610), qf6.a(new lg7(hf7.b), qf6.p, ne610));
            case 14:
                c81 c81 = (c81) obj2;
                if (!(c81 instanceof fh7)) {
                    return obj3;
                }
                if (obj3 instanceof Integer) {
                    num = (Integer) obj3;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i == 0) {
                    return c81;
                }
                return Integer.valueOf(i + 1);
            case h75.g:
                fh7 fh7 = (fh7) obj3;
                c81 c812 = (c81) obj2;
                if (fh7 != null) {
                    return fh7;
                }
                if (c812 instanceof fh7) {
                    return (fh7) c812;
                }
                return null;
            case 16:
                mh7 mh7 = (mh7) obj3;
                c81 c813 = (c81) obj2;
                if (c813 instanceof fh7) {
                    fh7 fh72 = (fh7) c813;
                    Object h0 = fh72.h0(mh7.a);
                    Object[] objArr = mh7.b;
                    int i3 = mh7.d;
                    objArr[i3] = h0;
                    fh7[] fh7Arr = mh7.c;
                    mh7.d = i3 + 1;
                    fh7Arr[i3] = fh72;
                }
                return mh7;
            case 17:
                yt2 yt2 = (yt2) obj3;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    yf7.b(l55.u(R.string.jetpack, yt2), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 262142);
                } else {
                    yt2.Y();
                }
                return vs7.a;
            default:
                ne6 ne611 = (ne6) obj3;
                if (((Number) ((c98) obj2).a.e.getValue()).floatValue() == 1.0f) {
                    return d98.x;
                }
                return d98.w;
        }
    }
}
