package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dx4 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ dx4(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String str;
        lg7 lg7;
        boolean z11;
        boolean z12;
        int i = this.w;
        uc7 uc7 = null;
        Object obj3 = ay0.a;
        jl4 jl4 = jl4.w;
        vs7 vs7 = vs7.a;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (i) {
            case b85.b:
                vs7 vs72 = vs7;
                a37 a37 = (a37) obj5;
                String str2 = (String) obj4;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    eq4 eq4 = ((kx4) a37.getValue()).a;
                    Object[] objArr = eq4.w;
                    int i2 = eq4.y;
                    for (int i3 = 0; i3 < i2; i3++) {
                        yw4 yw4 = (yw4) objArr[i3];
                        ml4 ml4 = yw4.d;
                        boolean z13 = yw4.a;
                        f5 f5Var = yw4.b;
                        fw0 fw0 = yw4.c;
                        gs2 gs2 = yw4.e;
                        cf4 cf4 = yw4.f;
                        if (cf4 == null) {
                            yt2.e0(-1318161508);
                            cf4 = gr8.P(yt2);
                            z2 = false;
                        } else {
                            z2 = false;
                            yt2.e0(-1318162655);
                        }
                        yt2.r(z2);
                        fx4.d(str2, z13, f5Var, fw0, gs2, ml4, cf4, yt2, 805306374);
                    }
                } else {
                    yt2.Y();
                }
                return vs72;
            case 1:
                vs7 vs73 = vs7;
                e06 e06 = (e06) obj5;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                e06.w += ((o34) obj4).b.a(floatValue - e06.w);
                return vs73;
            case 2:
                vs7 vs74 = vs7;
                ((Integer) obj2).getClass();
                fd1.j((bc5) obj5, (vr2) obj4, (yt2) obj, b85.v(1));
                return vs74;
            case 3:
                sr2 sr2 = (sr2) obj5;
                sr2 sr22 = (sr2) obj4;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(intValue2 & 1, z3)) {
                    ml4 K = x91.K(jl4, 16.0f);
                    au0 a = zt0.a(wr.c, xb4.K, yt22, 0);
                    int hashCode = Long.hashCode(yt22.T);
                    vf5 m = yt22.m();
                    ml4 E = gw8.E(yt22, K);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt22, a);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt22, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt22, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt22, ceVar);
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt22, E);
                    yt2 yt23 = yt22;
                    yf7.b(l55.u(R.string.label_consumption_rate, yt22), (ml4) null, v08.d(), ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262058);
                    yf7.b(pb4.j(jl4, 10.0f, yt22, R.string.body_consumption_rate_description, yt22), (ml4) null, v08.b(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(19), 0, false, 0, 0, (tg7) null, yt23, 24576, 48, 260074);
                    k75.a(yt22, yu6.d(jl4, 14.0f));
                    kl8.c((ml4) null, 0.0f, v08.c(), yt22, 0, 3);
                    k75.a(yt22, yu6.d(jl4, 14.0f));
                    ea6 a2 = ca6.a(new ur(12.0f, true, new h(2)), xb4.H, yt22, 6);
                    vs7 vs75 = vs7;
                    int hashCode2 = Long.hashCode(yt22.T);
                    vf5 m2 = yt22.m();
                    ml4 E2 = gw8.E(yt22, jl4);
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(ckVar, yt22, a2);
                    g75.Q(ckVar2, yt22, m2);
                    f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                    g75.Q(ckVar4, yt22, E2);
                    o96 a3 = q96.a(12.0f);
                    pa5 pa5 = yd0.a;
                    xd0 f2 = yd0.f(v08.a(), yt22);
                    float f3 = 1.0f;
                    if (((double) 1.0f) <= 0.0d) {
                        wb3.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    gw8.b(sr2, yu6.d(new lz3(f, true), 44.0f), false, a3, f2, (ua0) null, (la5) null, mp7.B, yt22, 805306368, 484);
                    o96 a4 = q96.a(12.0f);
                    xd0 f4 = yd0.f(v08.a(), yt22);
                    if (((double) 1.0f) <= 0.0d) {
                        wb3.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f3 = Float.MAX_VALUE;
                    }
                    gw8.b(sr22, yu6.d(new lz3(f3, true), 44.0f), false, a4, f4, (ua0) null, (la5) null, mp7.C, yt22, 805306368, 484);
                    yt22.r(true);
                    yt22.r(true);
                    return vs75;
                }
                vs7 vs76 = vs7;
                yt22.Y();
                return vs76;
            case 4:
                ((Integer) obj2).getClass();
                yi5.l((is2) obj5, (dj5) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 5:
                ((Integer) obj2).getClass();
                mp7.E((is2) obj5, (lq5) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 6:
                ((Integer) obj2).getClass();
                xz5.i((is2) obj5, (a06) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 7:
                List list = (List) obj5;
                bd5 bd5 = (bd5) obj4;
                yt2 yt24 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt24.V(intValue3 & 1, z4)) {
                    int i4 = 0;
                    for (Object next : list) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            String str3 = (String) next;
                            if (bd5.d() == i4) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean e = yt24.e(i4);
                            Object Q = yt24.Q();
                            if (e || Q == obj3) {
                                Q = new ti5(bd5, i4);
                                yt24.o0(Q);
                            }
                            va7.b(z5, (sr2) Q, (ml4) null, false, su0.J(-1428783023, new dj7((Object) str3, (Object) bd5, i4, 15), yt24), (gs2) null, 0, 0, yt24, 24576, 492);
                            i4 = i5;
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                } else {
                    yt24.Y();
                }
                return vs7;
            case 8:
                ((Integer) obj2).getClass();
                d36.m((q26) obj5, (gs2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 9:
                ((Integer) obj2).getClass();
                d36.b((mi0) obj5, (sr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 10:
                ((Integer) obj2).getClass();
                d36.j((yv6) obj5, (sr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                vr2 vr2 = (vr2) obj5;
                hi1 hi1 = (hi1) obj4;
                yt2 yt25 = (yt2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (yt25.V(intValue4 & 1, z6)) {
                    boolean g = yt25.g(vr2) | yt25.g(hi1);
                    Object Q2 = yt25.Q();
                    if (g || Q2 == obj3) {
                        Q2 = new qm3(21, (Object) vr2, (Object) hi1);
                        yt25.o0(Q2);
                    }
                    gw8.e((sr2) Q2, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, ag8.b, yt25, 805306368, 510);
                } else {
                    yt25.Y();
                }
                return vs7;
            case 12:
                fw0 fw02 = (fw0) obj5;
                uf6 uf6 = (uf6) obj4;
                yt2 yt26 = (yt2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (yt26.V(intValue5 & 1, z7)) {
                    fw02.u(uf6, yt26, 6);
                } else {
                    yt26.Y();
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((Integer) obj2).getClass();
                em6.b((is2) obj5, (gm6) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 14:
                aa8 aa8 = (aa8) obj5;
                gs2 gs22 = (gs2) obj4;
                yt2 yt27 = (yt2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (yt27.V(intValue6 & 1, z8)) {
                    ml4 o = j45.o(yu6.b(x91.T(jl4, aa8), 0.0f, r16.e, 1));
                    pf pfVar = new pf(11);
                    int hashCode3 = Long.hashCode(yt27.T);
                    vf5 m3 = yt27.m();
                    ml4 E3 = gw8.E(yt27, o);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt27.i0();
                    if (yt27.S) {
                        yt27.l(vy02);
                    } else {
                        yt27.r0();
                    }
                    g75.Q(tx0.f, yt27, pfVar);
                    g75.Q(tx0.e, yt27, m3);
                    g75.Q(tx0.g, yt27, Integer.valueOf(hashCode3));
                    g75.O(yt27, tx0.h);
                    g75.Q(tx0.d, yt27, E3);
                    gs22.H(yt27, 0);
                    yt27.r(true);
                } else {
                    yt27.Y();
                }
                return vs7;
            case h75.g /*15*/:
                ((Integer) obj2).getClass();
                dw6.e((is2) obj5, (hw6) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 16:
                fw0 fw03 = (fw0) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                yt2 yt28 = (yt2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (yt28.V(intValue7 & 1, z9)) {
                    fw03.u(arrayList, yt28, 0);
                } else {
                    yt28.Y();
                }
                return vs7;
            case 17:
                ((Integer) obj2).getClass();
                ((xb4) obj5).a((Drawable) obj4, (yt2) obj, b85.v(49));
                return vs7;
            case 18:
                hs2 hs2 = (hs2) obj5;
                ee7 ee7 = (ee7) obj4;
                yt2 yt29 = (yt2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (yt29.V(intValue8 & 1, z10)) {
                    hs2.u(ee7, yt29, 6);
                } else {
                    yt29.Y();
                }
                return vs7;
            case 19:
                ze7 ze7 = (ze7) obj5;
                o81 o81 = (o81) obj4;
                wc7 wc7 = (wc7) obj;
                Context context = (Context) obj2;
                boolean j = ze7.j();
                vl m4 = ze7.m();
                if (m4 != null) {
                    str = m4.x;
                } else {
                    str = null;
                }
                lg7 lg72 = ze7.w;
                if (lg72 != null) {
                    long j2 = lg72.a;
                    v35 v35 = ze7.b;
                    lg7 = new lg7(i95.a(v35.p((int) (j2 >> 32)), v35.p((int) (j2 & 4294967295L))));
                } else {
                    lg7 = null;
                }
                wj5 wj5 = ze7.j;
                h17 h17 = new h17(ze7, o81, context);
                t37 t37 = xj5.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || lg7 == null || wj5 == null || !(wj5 instanceof wj5)) {
                    h17.y(wc7);
                    if (!(str == null || lg7 == null)) {
                        z85.d(wc7, context, j, str, lg7.a);
                    }
                } else {
                    long j3 = lg7.a;
                    Object obj6 = wj5.h;
                    qq4 qq4 = wj5.e;
                    if (qq4.g()) {
                        uc7 uc72 = (uc7) wj5.g.getValue();
                        if (uc72 == null || !lg7.b(j3, uc72.b) || !sg3.e(str, uc72.a)) {
                            uc72 = null;
                        }
                        qq4.k((Object) null);
                        uc7 = uc72;
                    }
                    if (uc7 == null) {
                        h17.y(wc7);
                    } else {
                        ArrayList arrayList2 = uc7.d;
                        TextClassification textClassification = uc7.c;
                        if (!textClassification.getActions().isEmpty()) {
                            wc7.a.a(new nd7(obj6, textClassification, 0, (Drawable) arrayList2.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && !(textClassification.getIntent() == null && textClassification.getOnClickListener() == null)) {
                            wc7.a.a(new nd7(obj6, textClassification, -1, textClassification.getIcon()));
                        }
                        h17.y(wc7);
                        List d = textClassification.getActions();
                        int size = d.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            pa4.u(d.get(i6));
                            if (i6 > 0) {
                                wc7.a.a(new nd7(obj6, textClassification, i6, (Drawable) arrayList2.get(i6)));
                            }
                        }
                    }
                    z85.d(wc7, context, j, str, lg7.a);
                }
                return vs7;
            case 20:
                qt0 qt0 = (qt0) obj5;
                fw0 fw04 = (fw0) obj4;
                yt2 yt210 = (yt2) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (yt210.V(intValue9 & 1, z11)) {
                    ch4.a(qt0, np7.a, fw04, yt210, 0);
                } else {
                    yt210.Y();
                }
                return vs7;
            default:
                aq4 aq4 = (aq4) obj5;
                fw0 fw05 = (fw0) obj4;
                yt2 yt211 = (yt2) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (yt211.V(intValue10 & 1, z12)) {
                    Object Q3 = yt211.Q();
                    if (Q3 == obj3) {
                        Q3 = new t46(aq4, 15);
                        yt211.o0(Q3);
                    }
                    ml4 I = h49.I(jl4, (vr2) Q3);
                    lh4 d2 = mb0.d(xb4.y, false);
                    int hashCode4 = Long.hashCode(yt211.T);
                    vf5 m5 = yt211.m();
                    ml4 E4 = gw8.E(yt211, I);
                    ux0.d.getClass();
                    vy0 vy03 = tx0.b;
                    yt211.i0();
                    if (yt211.S) {
                        yt211.l(vy03);
                    } else {
                        yt211.r0();
                    }
                    g75.Q(tx0.f, yt211, d2);
                    g75.Q(tx0.e, yt211, m5);
                    g75.Q(tx0.g, yt211, Integer.valueOf(hashCode4));
                    g75.O(yt211, tx0.h);
                    g75.Q(tx0.d, yt211, E4);
                    f21.r(0, fw05, yt211, true);
                } else {
                    yt211.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ dx4(Object obj, Object obj2, int i, int i2) {
        this.w = i2;
        this.x = obj;
        this.y = obj2;
    }
}
