package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: vw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vw0 implements gs2 {
    public final /* synthetic */ int w;

    public /* synthetic */ vw0(int i) {
        this.w = i;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        char charAt;
        int i = this.w;
        jl4 jl4 = jl4.w;
        boolean z2 = false;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    ml4 Z = t49.Z(yu6.a, t49.Y(yt2), true);
                    au0 a = zt0.a(wr.c, xb4.K, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, Z);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, a);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    yf7.b(l55.u(R.string.transfer_id_info_message, yt2), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 262142);
                    mp7.J(R.drawable.transfer_id_example_transfermovil, pb4.j(jl4, 12.0f, yt2, R.string.transfer_id_info_example_transfermovil, yt2), yt2, 0);
                    mp7.J(R.drawable.transfer_id_example_enzona, pb4.j(jl4, 12.0f, yt2, R.string.transfer_id_info_example_enzona, yt2), yt2, 0);
                    mp7.J(R.drawable.transfer_id_example_saldo, pb4.j(jl4, 12.0f, yt2, R.string.transfer_id_info_example_saldo, yt2), yt2, 0);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                charAt = charSequence.charAt(intValue2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                b30.g(b85.v(1), (yt2) obj);
                return vs7;
            case 3:
                ((Integer) obj2).getClass();
                b30.j(b85.v(1), (yt2) obj);
                return vs7;
            case 4:
                i53 i53 = (i53) obj;
                int intValue3 = ((Integer) obj2).intValue();
                i53.getClass();
                charAt = i53.a.charAt(intValue3);
                break;
            case 5:
                String str = (String) obj;
                c81 c81 = (c81) obj2;
                str.getClass();
                c81.getClass();
                if (str.length() == 0) {
                    return c81.toString();
                }
                return str + ", " + c81;
            case 6:
                yt2 yt22 = (yt2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                if (!yt22.V(intValue4 & 1, z2)) {
                    yt22.Y();
                }
                return vs7;
            case 7:
                yt2 yt23 = (yt2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                }
                if (!yt23.V(intValue5 & 1, z2)) {
                    yt23.Y();
                }
                return vs7;
            case 8:
                yt2 yt24 = (yt2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z2 = true;
                }
                if (yt24.V(intValue6 & 1, z2)) {
                    yf7.b(l55.u(R.string.feedback_message_label, yt24), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 0, 0, 262142);
                } else {
                    yt24.Y();
                }
                return vs7;
            case 9:
                yt2 yt25 = (yt2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z2 = true;
                }
                if (yt25.V(intValue7 & 1, z2)) {
                    yf7.b(l55.u(R.string.link_all_ussd, yt25), (ml4) null, b30.p(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 1572864, 0, 262074);
                } else {
                    yt25.Y();
                }
                return vs7;
            case 10:
                yt2 yt26 = (yt2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z2 = true;
                }
                if (yt26.V(intValue8 & 1, z2)) {
                    yf7.b(l55.u(R.string.donate_dialog_title, yt26), (ml4) null, b30.p(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt26, 1572864, 0, 262074);
                } else {
                    yt26.Y();
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                yt2 yt27 = (yt2) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z2 = true;
                }
                if (yt27.V(intValue9 & 1, z2)) {
                    yf7.b(l55.u(R.string.feedback_dialog_title, yt27), (ml4) null, b30.p(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt27, 1572864, 0, 262074);
                } else {
                    yt27.Y();
                }
                return vs7;
            case 12:
                yt2 yt28 = (yt2) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z2 = true;
                }
                if (yt28.V(intValue10 & 1, z2)) {
                    yf7.b(l55.u(R.string.feedback_type_error, yt28), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt28, 0, 0, 262142);
                } else {
                    yt28.Y();
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                yt2 yt29 = (yt2) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z2 = true;
                }
                if (yt29.V(intValue11 & 1, z2)) {
                    yf7.b(l55.u(R.string.feedback_type_suggestion, yt29), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt29, 0, 0, 262142);
                } else {
                    yt29.Y();
                }
                return vs7;
            case 14:
                yt2 yt210 = (yt2) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z2 = true;
                }
                if (yt210.V(intValue12 & 1, z2)) {
                    yf7.b(l55.u(R.string.title_contact_info, yt210), (ml4) null, jt0.c, 0, am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt210, 1573248, 0, 262074);
                } else {
                    yt210.Y();
                }
                return vs7;
            case h75.g:
                yt2 yt211 = (yt2) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z2 = true;
                }
                if (yt211.V(intValue13 & 1, z2)) {
                    d83.a(x91.A(), (String) null, (ml4) null, jt0.c, yt211, 3120, 4);
                } else {
                    yt211.Y();
                }
                return vs7;
            case 16:
                yt2 yt212 = (yt2) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z2 = true;
                }
                if (yt212.V(intValue14 & 1, z2)) {
                    d83.a(p25.o(), (String) null, yu6.l(jl4, 24.0f), 0, yt212, 432, 8);
                } else {
                    yt212.Y();
                }
                return vs7;
            case 17:
                yt2 yt213 = (yt2) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z2 = true;
                }
                if (yt213.V(intValue15 & 1, z2)) {
                    yf7.b("*99", (ml4) null, 0, ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt213, 1597446, 0, 262062);
                } else {
                    yt213.Y();
                }
                return vs7;
            case 18:
                yt2 yt214 = (yt2) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z2 = true;
                }
                if (yt214.V(intValue16 & 1, z2)) {
                    d83.a(r16.G(), (String) null, yu6.l(jl4, 24.0f), 0, yt214, 432, 8);
                } else {
                    yt214.Y();
                }
                return vs7;
            case 19:
                yt2 yt215 = (yt2) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z2 = true;
                }
                if (yt215.V(intValue17 & 1, z2)) {
                    d83.a(gl0.T(), (String) null, (ml4) null, z08.k(), yt215, 48, 4);
                } else {
                    yt215.Y();
                }
                return vs7;
            case 20:
                yt2 yt216 = (yt2) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z2 = true;
                }
                if (yt216.V(intValue18 & 1, z2)) {
                    x83 x83 = hj8.r;
                    if (x83 == null) {
                        w83 w83 = new w83("AutoMirrored.Rounded.Backspace", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, true, 96);
                        int i2 = e38.a;
                        ky6 ky6 = new ky6(jt0.b);
                        be5 f = b81.f(22.0f, 3.0f, 7.0f, 3.0f);
                        f.e(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
                        f.h(0.37f, 11.45f);
                        f.e(-0.22f, 0.34f, -0.22f, 0.77f, 0.0f, 1.11f);
                        f.i(5.04f, 7.56f);
                        f.e(0.36f, 0.52f, 0.9f, 0.88f, 1.59f, 0.88f);
                        f.g(15.0f);
                        f.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        f.h(24.0f, 5.0f);
                        f.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        f.c();
                        f.j(18.3f, 16.3f);
                        f.e(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
                        f.h(14.0f, 13.41f);
                        f.i(-2.89f, 2.89f);
                        f.e(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
                        f.e(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
                        f.h(12.59f, 12.0f);
                        f.h(9.7f, 9.11f);
                        f.e(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
                        f.e(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
                        f.h(14.0f, 10.59f);
                        f.i(2.89f, -2.89f);
                        f.e(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
                        f.e(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
                        f.h(15.41f, 12.0f);
                        f.i(2.89f, 2.89f);
                        f.e(0.38f, 0.38f, 0.38f, 1.02f, 0.0f, 1.41f);
                        f.c();
                        w83.a(w83, f.a, ky6, 14336);
                        x83 = w83.b();
                        hj8.r = x83;
                    }
                    d83.a(x83, (String) null, yu6.l(jl4, 24.0f), z08.e(), yt216, 432, 0);
                } else {
                    yt216.Y();
                }
                return vs7;
            case 21:
                yt2 yt217 = (yt2) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z2 = true;
                }
                if (yt217.V(intValue19 & 1, z2)) {
                    yf7.b(l55.u(R.string.forum_search_hint, yt217), (ml4) null, r16.L(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt217, 0, 0, 262138);
                } else {
                    yt217.Y();
                }
                return vs7;
            case 22:
                yt2 yt218 = (yt2) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z2 = true;
                }
                if (yt218.V(intValue20 & 1, z2)) {
                    d83.a(b35.r(), (String) null, yu6.l(jl4, 18.0f), r16.L(), yt218, 432, 0);
                } else {
                    yt218.Y();
                }
                return vs7;
            case 23:
                yt2 yt219 = (yt2) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z2 = true;
                }
                if (yt219.V(intValue21 & 1, z2)) {
                    yf7.b(l55.u(R.string.forum_delete_comment_title, yt219), (ml4) null, r16.P(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt219, 1572864, 0, 262074);
                } else {
                    yt219.Y();
                }
                return vs7;
            case 24:
                yt2 yt220 = (yt2) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z2 = true;
                }
                if (yt220.V(intValue22 & 1, z2)) {
                    yf7.b(l55.u(R.string.forum_delete_comment_message, yt220), (ml4) null, r16.L(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt220, 24576, 0, 262122);
                } else {
                    yt220.Y();
                }
                return vs7;
            case 25:
                yt2 yt221 = (yt2) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z2 = true;
                }
                if (yt221.V(intValue23 & 1, z2)) {
                    yf7.b(l55.u(R.string.forum_comment_hint, yt221), (ml4) null, r16.L(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt221, 24576, 0, 262122);
                } else {
                    yt221.Y();
                }
                return vs7;
            case 26:
                yt2 yt222 = (yt2) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z2 = true;
                }
                if (yt222.V(intValue24 & 1, z2)) {
                    d83.a(pv8.G(), l55.u(R.string.forum_add, yt222), (ml4) null, 0, yt222, 0, 12);
                } else {
                    yt222.Y();
                }
                return vs7;
            case 27:
                yt2 yt223 = (yt2) obj;
                int intValue25 = ((Integer) obj2).intValue();
                if ((intValue25 & 3) != 2) {
                    z2 = true;
                }
                if (yt223.V(intValue25 & 1, z2)) {
                    yf7.b(l55.u(R.string.forum_delete_title, yt223), (ml4) null, r16.P(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt223, 1572864, 0, 262074);
                } else {
                    yt223.Y();
                }
                return vs7;
            case 28:
                yt2 yt224 = (yt2) obj;
                int intValue26 = ((Integer) obj2).intValue();
                if ((intValue26 & 3) != 2) {
                    z2 = true;
                }
                if (yt224.V(intValue26 & 1, z2)) {
                    yf7.b(l55.u(R.string.forum_filter_all, yt224), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt224, 0, 0, 262142);
                } else {
                    yt224.Y();
                }
                return vs7;
            default:
                yt2 yt225 = (yt2) obj;
                int intValue27 = ((Integer) obj2).intValue();
                if ((intValue27 & 3) != 2) {
                    z2 = true;
                }
                if (yt225.V(intValue27 & 1, z2)) {
                    yf7.b(l55.u(R.string.forum_title_label, yt225), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt225, 0, 0, 262142);
                } else {
                    yt225.Y();
                }
                return vs7;
        }
        return Character.valueOf(charAt);
    }

    public /* synthetic */ vw0(int i, int i2) {
        this.w = i2;
    }
}
