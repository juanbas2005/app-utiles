package defpackage;

import cu.lestebang.utiletecsa.R;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: ww0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ww0 implements hs2 {
    public final /* synthetic */ int w;

    public /* synthetic */ ww0(int i) {
        this.w = i;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.w;
        sr srVar = wr.c;
        int i2 = 2;
        jl4 jl4 = jl4.w;
        vs7 vs7 = vs7.a;
        boolean z4 = true;
        boolean z5 = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z5 = true;
                }
                if (yt2.V(1 & intValue, z5)) {
                    yf7.b(l55.u(R.string.back_to_sign_in, yt2), (ml4) null, ((zg4) yt2.k(ch4.b)).a.a, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 262138);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z5 = true;
                }
                if (yt22.V(1 & intValue2, z5)) {
                    yf7.b(l55.u(R.string.button_grant_permissions, yt22), (ml4) null, jt0.c, 0, am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1573248, 0, 262074);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 2:
                yt2 yt23 = (yt2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((bu0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt23.V(intValue3 & 1, z)) {
                    ml4 K = x91.K(jl4, 16.0f);
                    au0 a = zt0.a(srVar, xb4.K, yt23, 0);
                    int hashCode = Long.hashCode(yt23.T);
                    vf5 m = yt23.m();
                    ml4 E = gw8.E(yt23, K);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt23.i0();
                    if (yt23.S) {
                        yt23.l(vy0);
                    } else {
                        yt23.r0();
                    }
                    g75.Q(tx0.f, yt23, a);
                    g75.Q(tx0.e, yt23, m);
                    g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
                    g75.O(yt23, tx0.h);
                    g75.Q(tx0.d, yt23, E);
                    yt2 yt24 = yt23;
                    yf7.b(l55.u(R.string.label_peak_traffic_hours, yt23), (ml4) null, xz5.w(), ya5.k(14), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 1597440, 0, 262058);
                    yt2 yt25 = yt24;
                    k75.a(yt25, yu6.d(jl4, 4.0f));
                    yf7.b("1:00 pm a 2:00 pm", (ml4) null, xz5.s(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 24582, 0, 262122);
                    yf7.b("9:30 pm a 10:30 pm", (ml4) null, xz5.s(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 24582, 0, 262122);
                    yt25.r(true);
                } else {
                    yt23.Y();
                }
                return vs7;
            case 3:
                yt2 yt26 = (yt2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((bu0) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z5 = true;
                }
                if (yt26.V(1 & intValue4, z5)) {
                    yf7.b(l55.u(R.string.body_imei_info, yt26), x91.K(jl4, 16.0f), xz5.s(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(20), 0, false, 0, 0, (tg7) null, yt26, 24624, 48, 260072);
                } else {
                    yt26.Y();
                }
                return vs7;
            case 4:
                yt2 yt27 = (yt2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((bu0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt27.V(intValue5 & 1, z2)) {
                    ml4 K2 = x91.K(jl4, 16.0f);
                    au0 a2 = zt0.a(srVar, xb4.K, yt27, 0);
                    int hashCode2 = Long.hashCode(yt27.T);
                    vf5 m2 = yt27.m();
                    ml4 E2 = gw8.E(yt27, K2);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt27.i0();
                    if (yt27.S) {
                        yt27.l(vy02);
                    } else {
                        yt27.r0();
                    }
                    g75.Q(tx0.f, yt27, a2);
                    g75.Q(tx0.e, yt27, m2);
                    g75.Q(tx0.g, yt27, Integer.valueOf(hashCode2));
                    g75.O(yt27, tx0.h);
                    g75.Q(tx0.d, yt27, E2);
                    xz5.a("2G", "GPRS, EDGE", "Bandas: 900MHz (B8)", yt27, 438);
                    k75.a(yt27, yu6.d(jl4, 12.0f));
                    xz5.a("3G", "UMTS/WCDMA, HSDPA, HSUPA/HSPA, HSPA+", "Bandas: 900MHz (B8), 2100MHz (B1)", yt27, 438);
                    k75.a(yt27, yu6.d(jl4, 12.0f));
                    xz5.a("4G", "LTE", "Bandas: 1800MHz(B3), 700MHz (B28), 2100MHz (B1), 900MHz (B8)", yt27, 438);
                    yt27.r(true);
                } else {
                    yt27.Y();
                }
                return vs7;
            case 5:
                yt2 yt28 = (yt2) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z5 = true;
                }
                if (yt28.V(1 & intValue6, z5)) {
                    yf7.b(l55.u(R.string.button_grant_permission, yt28), (ml4) null, jt0.c, 0, am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt28, 1573248, 0, 262074);
                } else {
                    yt28.Y();
                }
                return vs7;
            case 6:
                yt2 yt29 = (yt2) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z5 = true;
                }
                if (yt29.V(1 & intValue7, z5)) {
                    yf7.b("OK", (ml4) null, 0, 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt29, 1572870, 0, 262078);
                } else {
                    yt29.Y();
                }
                return vs7;
            case 7:
                yt2 yt210 = (yt2) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z5 = true;
                }
                if (yt210.V(1 & intValue8, z5)) {
                    yf7.b(l55.u(R.string.button_clear_date, yt210), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt210, 0, 0, 262142);
                } else {
                    yt210.Y();
                }
                return vs7;
            case 8:
                yt2 yt211 = (yt2) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z5 = true;
                }
                if (yt211.V(1 & intValue9, z5)) {
                    yf7.b(l55.u(R.string.report_dialog_send, yt211), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt211, 0, 0, 262142);
                } else {
                    yt211.Y();
                }
                return vs7;
            case 9:
                yt2 yt212 = (yt2) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z5 = true;
                }
                if (yt212.V(1 & intValue10, z5)) {
                    yf7.b(l55.u(R.string.report_dialog_cancel, yt212), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt212, 0, 0, 262142);
                } else {
                    yt212.Y();
                }
                return vs7;
            case 10:
                gs2 gs2 = (gs2) obj;
                yt2 yt213 = (yt2) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    if (yt213.i(gs2)) {
                        i2 = 4;
                    }
                    intValue11 |= i2;
                }
                if ((intValue11 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt213.V(intValue11 & 1, z3)) {
                    gs2.H(yt213, Integer.valueOf(intValue11 & 14));
                } else {
                    yt213.Y();
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                yt2 yt214 = (yt2) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z5 = true;
                }
                if (yt214.V(1 & intValue12, z5)) {
                    yf7.b(l55.u(R.string.privacy_policy, yt214), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt214, 0, 0, 262142);
                } else {
                    yt214.Y();
                }
                return vs7;
            case 12:
                yt2 yt215 = (yt2) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue13 & 17) != 16) {
                    z5 = true;
                }
                if (yt215.V(1 & intValue13, z5)) {
                    yf7.b(l55.u(R.string.terms_of_service, yt215), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt215, 0, 0, 262142);
                } else {
                    yt215.Y();
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                yt2 yt216 = (yt2) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue14 & 17) != 16) {
                    z5 = true;
                }
                if (yt216.V(1 & intValue14, z5)) {
                    yf7.b(l55.u(R.string.licenses, yt216), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt216, 0, 0, 262142);
                } else {
                    yt216.Y();
                }
                return vs7;
            case 14:
                yt2 yt217 = (yt2) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue15 & 17) != 16) {
                    z5 = true;
                }
                if (yt217.V(1 & intValue15, z5)) {
                    yf7.b(l55.u(R.string.feedback, yt217), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt217, 0, 0, 262142);
                } else {
                    yt217.Y();
                }
                return vs7;
            case h75.g:
                yt2 yt218 = (yt2) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z5 = true;
                }
                if (yt218.V(1 & intValue16, z5)) {
                    yf7.b(l55.u(R.string.button_confirm, yt218), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt218, 0, 0, 262142);
                } else {
                    yt218.Y();
                }
                return vs7;
            case 16:
                yt2 yt219 = (yt2) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue17 & 17) != 16) {
                    z5 = true;
                }
                if (yt219.V(1 & intValue17, z5)) {
                    yf7.b(l55.u(R.string.button_cancel, yt219), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt219, 0, 0, 262142);
                } else {
                    yt219.Y();
                }
                return vs7;
            case 17:
                yt2 yt220 = (yt2) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue18 & 17) != 16) {
                    z5 = true;
                }
                if (yt220.V(1 & intValue18, z5)) {
                    yt2 yt221 = yt220;
                    d83.a(k75.j(), (String) null, yu6.l(jl4, 16.0f), 0, yt221, 432, 8);
                    yt2 yt222 = yt221;
                    k75.a(yt222, yu6.p(jl4, 6.0f));
                    yf7.b(l55.u(R.string.button_send_sms, yt222), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt222, 0, 0, 262142);
                } else {
                    yt220.Y();
                }
                return vs7;
            case 18:
                nw6 nw6 = (nw6) obj;
                yt2 yt223 = (yt2) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                if ((intValue19 & 6) == 0) {
                    if (yt223.g(nw6)) {
                        i2 = 4;
                    }
                    intValue19 |= i2;
                }
                if ((intValue19 & 19) != 18) {
                    z5 = true;
                }
                if (yt223.V(intValue19 & 1, z5)) {
                    i35.d(nw6, (ml4) null, (pq6) null, 0, 0, 0, 0, 0, yt223, intValue19 & 14);
                } else {
                    yt223.Y();
                }
                return vs7;
            case 19:
                yt2 yt224 = (yt2) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue20 & 17) != 16) {
                    z5 = true;
                }
                if (yt224.V(intValue20 & 1, z5)) {
                    String u = l55.u(R.string.spot_delete_confirm, yt224);
                    Map map = q17.a;
                    yf7.b(u, (ml4) null, q17.n(uq3.d(4291176488L), uq3.d(4293227379L)), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt224, 0, 0, 262138);
                } else {
                    yt224.Y();
                }
                return vs7;
            case 20:
                yt2 yt225 = (yt2) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue21 & 17) != 16) {
                    z5 = true;
                }
                if (yt225.V(intValue21 & 1, z5)) {
                    yf7.b(l55.u(R.string.spot_cancel, yt225), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt225, 0, 0, 262142);
                } else {
                    yt225.Y();
                }
                return vs7;
            case 21:
                yt2 yt226 = (yt2) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue22 & 17) != 16) {
                    z5 = true;
                }
                if (yt226.V(intValue22 & 1, z5)) {
                    yf7.b(l55.u(R.string.spot_publish, yt226), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt226, 0, 0, 262142);
                } else {
                    yt226.Y();
                }
                return vs7;
            case 22:
                yt2 yt227 = (yt2) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue23 & 17) != 16) {
                    z5 = true;
                }
                if (yt227.V(intValue23 & 1, z5)) {
                    yf7.b(l55.u(R.string.spot_cancel, yt227), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt227, 0, 0, 262142);
                } else {
                    yt227.Y();
                }
                return vs7;
            case 23:
                yt2 yt228 = (yt2) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue24 & 17) != 16) {
                    z5 = true;
                }
                if (yt228.V(intValue24 & 1, z5)) {
                    yf7.b(l55.u(R.string.terms_decline, yt228), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt228, 0, 0, 262142);
                } else {
                    yt228.Y();
                }
                return vs7;
            case 24:
                yt2 yt229 = (yt2) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue25 & 17) != 16) {
                    z5 = true;
                }
                if (yt229.V(intValue25 & 1, z5)) {
                    yf7.b(l55.u(R.string.terms_accept, yt229), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt229, 0, 0, 262142);
                } else {
                    yt229.Y();
                }
                return vs7;
            case 25:
                Throwable th = (Throwable) obj3;
                ((m63) obj).getClass();
                ((y53) obj2).getClass();
                th.getClass();
                au auVar = f63.a;
                Throwable U = h49.U(th);
                if ((U instanceof HttpRequestTimeoutException) || (U instanceof ConnectTimeoutException) || (U instanceof SocketTimeoutException) || (th instanceof CancellationException)) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 26:
                yl1 yl1 = (yl1) obj3;
                ((m63) obj).getClass();
                ((x53) obj2).getClass();
                yl1.getClass();
                int i3 = yl1.e().w;
                if (500 > i3 || i3 >= 600) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 27:
                ml4 ml4 = (ml4) obj;
                yt2 yt230 = (yt2) obj2;
                ((Integer) obj3).getClass();
                ml4.getClass();
                yt230.e0(799324973);
                long j = ((zg4) yt230.k(ch4.b)).a.j;
                boolean f = yt230.f(j);
                Object Q = yt230.Q();
                if (f || Q == ay0.a) {
                    Q = new hf(j, 4);
                    yt230.o0(Q);
                }
                ml4 z6 = pv8.z(ml4, (vr2) Q);
                yt230.r(false);
                return z6;
            case 28:
                xk xkVar = (xk) obj;
                ((Integer) obj3).getClass();
                tf4.a.H((yt2) obj2, 0);
                return vs7;
            default:
                yt2 yt231 = (yt2) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue26 & 17) != 16) {
                    z5 = true;
                }
                if (yt231.V(intValue26 & 1, z5)) {
                    yf7.b(l55.u(R.string.save, yt231), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt231, 0, 0, 262142);
                } else {
                    yt231.Y();
                }
                return vs7;
        }
    }
}
