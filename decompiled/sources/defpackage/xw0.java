package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.concurrent.CancellationException;

/* renamed from: xw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xw0 implements gs2 {
    public final /* synthetic */ int w;

    public /* synthetic */ xw0(int i) {
        this.w = i;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        ju0 ju0;
        int i = this.w;
        boolean z2 = true;
        vs7 vs7 = vs7.a;
        boolean z3 = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (yt2.V(intValue & 1, z3)) {
                    yf7.b(l55.u(R.string.report_dialog_notes_hint, yt2), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 262142);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                if (!yt22.V(intValue2 & 1, z3)) {
                    yt22.Y();
                }
                return vs7;
            case 2:
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                if (!yt23.V(intValue3 & 1, z3)) {
                    yt23.Y();
                }
                return vs7;
            case 3:
                yt2 yt24 = (yt2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                if (!yt24.V(intValue4 & 1, z3)) {
                    yt24.Y();
                }
                return vs7;
            case 4:
                yt2 yt25 = (yt2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                }
                if (!yt25.V(intValue5 & 1, z3)) {
                    yt25.Y();
                }
                return vs7;
            case 5:
                yt2 yt26 = (yt2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                }
                if (yt26.V(intValue6 & 1, z3)) {
                    xi6.a.a(6, yt26);
                } else {
                    yt26.Y();
                }
                return vs7;
            case 6:
                yt2 yt27 = (yt2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z3 = true;
                }
                if (yt27.V(intValue7 & 1, z3)) {
                    x83 x83 = x91.o;
                    if (x83 == null) {
                        w83 w83 = new w83("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i2 = e38.a;
                        ky6 ky6 = new ky6(jt0.b);
                        be5 f = b81.f(19.0f, 6.41f, 17.59f, 5.0f);
                        f.h(12.0f, 10.59f);
                        f.h(6.41f, 5.0f);
                        f.h(5.0f, 6.41f);
                        f.h(10.59f, 12.0f);
                        f.h(5.0f, 17.59f);
                        f.h(6.41f, 19.0f);
                        f.h(12.0f, 13.41f);
                        f.h(17.59f, 19.0f);
                        f.h(19.0f, 17.59f);
                        f.h(13.41f, 12.0f);
                        f.c();
                        w83.a(w83, f.a, ky6, 14336);
                        x83 = w83.b();
                        x91.o = x83;
                    }
                    d83.a(x83, l55.u(R.string.dismiss_dialog_button_text, yt27), (ml4) null, 0, yt27, 0, 12);
                } else {
                    yt27.Y();
                }
                return vs7;
            case 7:
                yt2 yt28 = (yt2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z3 = true;
                }
                if (yt28.V(intValue8 & 1, z3)) {
                    yf7.b(l55.u(R.string.placeholder_imei_digits, yt28), (ml4) null, uq3.d(4288391618L), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt28, 384, 0, 262138);
                } else {
                    yt28.Y();
                }
                return vs7;
            case 8:
                yt2 yt29 = (yt2) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z3 = true;
                }
                if (yt29.V(intValue9 & 1, z3)) {
                    x83 x832 = w95.c;
                    if (x832 == null) {
                        w83 w832 = new w83("Rounded.SimCard", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i3 = e38.a;
                        ky6 ky62 = new ky6(jt0.b);
                        be5 e = pb4.e(19.99f, 4.0f);
                        e.e(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
                        e.g(-7.17f);
                        e.e(-0.53f, 0.0f, -1.04f, 0.21f, -1.42f, 0.59f);
                        e.h(4.59f, 7.41f);
                        e.d(4.21f, 7.79f, 4.0f, 8.3f, 4.0f, 8.83f);
                        e.h(4.0f, 20.0f);
                        e.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        e.g(12.01f);
                        e.e(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                        e.i(-0.01f, -16.0f);
                        e.c();
                        e.j(8.0f, 19.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        e.l(0.45f, -1.0f, 1.0f, -1.0f);
                        e.l(1.0f, 0.45f, 1.0f, 1.0f);
                        e.l(-0.45f, 1.0f, -1.0f, 1.0f);
                        e.c();
                        e.j(16.0f, 19.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        e.l(0.45f, -1.0f, 1.0f, -1.0f);
                        e.l(1.0f, 0.45f, 1.0f, 1.0f);
                        e.l(-0.45f, 1.0f, -1.0f, 1.0f);
                        e.c();
                        e.j(8.0f, 15.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        e.n(-2.0f);
                        e.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        e.l(1.0f, 0.45f, 1.0f, 1.0f);
                        e.n(2.0f);
                        e.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        e.c();
                        e.j(12.0f, 19.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        e.n(-2.0f);
                        e.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        e.l(1.0f, 0.45f, 1.0f, 1.0f);
                        e.n(2.0f);
                        e.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        e.c();
                        e.j(12.0f, 13.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        e.l(0.45f, -1.0f, 1.0f, -1.0f);
                        e.l(1.0f, 0.45f, 1.0f, 1.0f);
                        e.l(-0.45f, 1.0f, -1.0f, 1.0f);
                        e.c();
                        e.j(16.0f, 15.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        e.n(-2.0f);
                        e.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        e.l(1.0f, 0.45f, 1.0f, 1.0f);
                        e.n(2.0f);
                        e.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        e.c();
                        w83.a(w832, e.a, ky62, 14336);
                        x832 = w832.b();
                        w95.c = x832;
                    }
                    x83 x833 = x832;
                    String u = l55.u(R.string.fill_device_imei, yt29);
                    int i4 = y08.a;
                    d83.a(x833, u, (ml4) null, y08.c(uq3.d(4279658664L), uq3.d(4284131291L)), yt29, 0, 4);
                } else {
                    yt29.Y();
                }
                return vs7;
            case 9:
                yt2 yt210 = (yt2) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt210.V(intValue10 & 1, z)) {
                    jl4 jl4 = jl4.w;
                    ml4 h = b96.h(we.f(yu6.l(jl4, 52.0f), q96.a(26.0f)), uq3.d(3861522986L), gr8.h);
                    lh4 d = mb0.d(xb4.C, false);
                    int hashCode = Long.hashCode(yt210.T);
                    vf5 m = yt210.m();
                    ml4 E = gw8.E(yt210, h);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt210.i0();
                    if (yt210.S) {
                        yt210.l(vy0);
                    } else {
                        yt210.r0();
                    }
                    g75.Q(tx0.f, yt210, d);
                    g75.Q(tx0.e, yt210, m);
                    g75.Q(tx0.g, yt210, Integer.valueOf(hashCode));
                    g75.O(yt210, tx0.h);
                    g75.Q(tx0.d, yt210, E);
                    d83.a(bb0.m0(), (String) null, yu6.l(jl4, 28.0f), uq3.d(4293874512L), yt210, 3504, 0);
                    yt210.r(true);
                } else {
                    yt210.Y();
                }
                return vs7;
            case 10:
                yt2 yt211 = (yt2) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z3 = true;
                }
                if (yt211.V(intValue11 & 1, z3)) {
                    yf7.b(l55.u(R.string.spot_nick_label, yt211), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt211, 0, 0, 262142);
                } else {
                    yt211.Y();
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                yt2 yt212 = (yt2) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z3 = true;
                }
                if (yt212.V(intValue12 & 1, z3)) {
                    yf7.b(l55.u(R.string.spot_address_label, yt212), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt212, 0, 0, 262142);
                } else {
                    yt212.Y();
                }
                return vs7;
            case 12:
                yt2 yt213 = (yt2) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z3 = true;
                }
                if (yt213.V(intValue13 & 1, z3)) {
                    yf7.b(l55.u(R.string.spot_province_label, yt213), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt213, 0, 0, 262142);
                } else {
                    yt213.Y();
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                yt2 yt214 = (yt2) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z3 = true;
                }
                if (yt214.V(intValue14 & 1, z3)) {
                    yf7.b(l55.u(R.string.spot_note_label, yt214), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt214, 0, 0, 262142);
                } else {
                    yt214.Y();
                }
                return vs7;
            case 14:
                yt2 yt215 = (yt2) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z3 = true;
                }
                if (yt215.V(intValue15 & 1, z3)) {
                    yf7.b(l55.u(R.string.spot_delete_title, yt215), (ml4) null, q17.j(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt215, 1572864, 0, 262074);
                } else {
                    yt215.Y();
                }
                return vs7;
            case h75.g:
                yt2 yt216 = (yt2) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z3 = true;
                }
                if (yt216.V(intValue16 & 1, z3)) {
                    d83.a(pv8.G(), l55.u(R.string.spot_add, yt216), (ml4) null, 0, yt216, 0, 12);
                } else {
                    yt216.Y();
                }
                return vs7;
            case 16:
                yt2 yt217 = (yt2) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z3 = true;
                }
                if (yt217.V(intValue17 & 1, z3)) {
                    yf7.b(l55.u(R.string.spot_filter_all, yt217), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt217, 0, 0, 262142);
                } else {
                    yt217.Y();
                }
                return vs7;
            case 17:
                yt2 yt218 = (yt2) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z3 = true;
                }
                if (yt218.V(intValue18 & 1, z3)) {
                    yf7.b(l55.u(R.string.spot_add_title, yt218), (ml4) null, q17.j(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt218, 1572864, 0, 262074);
                } else {
                    yt218.Y();
                }
                return vs7;
            case 18:
                yt2 yt219 = (yt2) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z3 = true;
                }
                if (yt219.V(intValue19 & 1, z3)) {
                    kl8.c((ml4) null, 0.0f, 0, yt219, 0, 7);
                } else {
                    yt219.Y();
                }
                return vs7;
            case 19:
                yt2 yt220 = (yt2) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z3 = true;
                }
                if (!yt220.V(intValue20 & 1, z3)) {
                    yt220.Y();
                }
                return vs7;
            case 20:
                yt2 yt221 = (yt2) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z3 = true;
                }
                if (!yt221.V(intValue21 & 1, z3)) {
                    yt221.Y();
                }
                return vs7;
            case 21:
                yt2 yt222 = (yt2) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z3 = true;
                }
                if (!yt222.V(intValue22 & 1, z3)) {
                    yt222.Y();
                }
                return vs7;
            case 22:
                yt2 yt223 = (yt2) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z3 = true;
                }
                if (yt223.V(intValue23 & 1, z3)) {
                    d83.a(x91.A(), l55.u(R.string.back, yt223), (ml4) null, 0, yt223, 0, 12);
                } else {
                    yt223.Y();
                }
                return vs7;
            case 23:
                yt2 yt224 = (yt2) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z3 = true;
                }
                if (yt224.V(intValue24 & 1, z3)) {
                    d83.a(gl0.T(), (String) null, (ml4) null, z08.k(), yt224, 48, 4);
                } else {
                    yt224.Y();
                }
                return vs7;
            case 24:
                e81 e81 = (e81) obj;
                c81 c81 = (c81) obj2;
                e81.getClass();
                c81.getClass();
                e81 L = e81.L(c81.getKey());
                x32 x32 = x32.w;
                if (L == x32) {
                    return c81;
                }
                hz2 hz2 = hz2.z;
                h81 h81 = (h81) L.a0(hz2);
                if (h81 == null) {
                    ju0 = new ju0(c81, L);
                } else {
                    e81 L2 = L.L(hz2);
                    if (L2 == x32) {
                        return new ju0(h81, c81);
                    }
                    ju0 = new ju0(h81, new ju0(c81, L2));
                }
                return ju0;
            case 25:
                c81 c812 = (c81) obj2;
                if (!((Boolean) obj).booleanValue() && !(c812 instanceof tr8)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 26:
                e81 e812 = (e81) obj;
                c81 c813 = (c81) obj2;
                if (c813 instanceof tr8) {
                    return e812.X(new tr8(((tr8) c813).x, sp8.a));
                }
                return e812.X(c813);
            case 27:
                vj4 vj4 = (vj4) obj;
                Throwable th = (Throwable) obj2;
                vj4.getClass();
                xu0 xu0 = vj4.b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                xu0.c0(new av0(th, false));
                return vs7;
            case 28:
                ne6 ne6 = (ne6) obj;
                hi1 hi1 = (hi1) obj2;
                Long b = hi1.b();
                Long valueOf = Long.valueOf(((yh0) hi1.e.getValue()).e);
                re3 re3 = hi1.a;
                return sg3.E(b, valueOf, Integer.valueOf(re3.w), Integer.valueOf(re3.x), Integer.valueOf(hi1.a()));
            default:
                ne6 ne62 = (ne6) obj;
                um1 um1 = (um1) obj2;
                return sg3.E(Integer.valueOf(um1.k()), Float.valueOf(z65.o(um1.l(), -0.5f, 0.5f)), Integer.valueOf(um1.n()));
        }
    }
}
