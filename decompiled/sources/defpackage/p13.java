package defpackage;

import android.content.Context;
import android.os.Build;
import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: p13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p13 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ p13(o03 o03, vr2 vr2, int i) {
        this.w = 19;
        this.y = o03;
        this.x = vr2;
    }

    private final Object a(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        String str;
        vb8 vb8;
        int i;
        MainActivity mainActivity = (MainActivity) this.x;
        ed5 ed5 = (ed5) this.y;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        int i2 = MainActivity.g0;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            aq4 n = hj8.n(mainActivity.v().e, yt2);
            is7 is7 = (is7) n.getValue();
            int i3 = ee4.a;
            if (((UserDataPreferences) is7.a).getId().length() <= 0 && !is7.b) {
                z2 = false;
            } else {
                z2 = true;
            }
            is7 is72 = (is7) n.getValue();
            if (is72.b || is72.c.y != null) {
                str = null;
            } else {
                str = ((UserDataPreferences) is72.a).getProfilePictureUriString();
            }
            yt2.k(ye.a);
            tp1 tp1 = (tp1) yt2.k(xy0.h);
            tb8.a.getClass();
            ub8 ub8 = sb8.b;
            ub8.getClass();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                vb8 = vp1.x;
            } else if (i4 >= 30) {
                vb8 = jb0.x;
            } else {
                vb8 = pe2.Q;
            }
            long p = tp1.p(o85.t(vb8.b(mainActivity, ub8.b).a.c()).c());
            Set set = dc8.x;
            Set set2 = v98.x;
            float b = px1.b(p);
            if (lx1.a(b, 0.0f) < 0) {
                h.q("Width must not be negative");
                return null;
            } else if (!set.isEmpty()) {
                List list = dc8.y;
                int size = list.size();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= size) {
                        i = i6;
                        break;
                    }
                    i = ((dc8) list.get(i5)).w;
                    if (set.contains(new dc8(i))) {
                        if (lx1.a(b, t75.e(i)) >= 0) {
                            break;
                        }
                        i6 = i;
                    }
                    i5++;
                }
                Set set3 = v98.x;
                float a = px1.a(p);
                if (lx1.a(a, 0.0f) < 0) {
                    h.q("Width must not be negative");
                    return null;
                } else if (!set2.isEmpty()) {
                    List list2 = v98.y;
                    int size2 = list2.size();
                    int i7 = 2;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size2) {
                            break;
                        }
                        int i9 = ((v98) list2.get(i8)).w;
                        if (set2.contains(new v98(i9))) {
                            if (lx1.a(a, u55.c(i9)) >= 0) {
                                i7 = i9;
                                break;
                            }
                            i7 = i9;
                        }
                        i8++;
                    }
                    cc8 cc8 = new cc8(i, i7);
                    az4 az4 = mainActivity.b0;
                    if (az4 != null) {
                        f91 f91 = mainActivity.c0;
                        if (f91 != null) {
                            Object Q = yt2.Q();
                            Object obj3 = ay0.a;
                            if (Q == obj3) {
                                Q = t49.D(yt2);
                                yt2.o0(Q);
                            }
                            o81 o81 = (o81) Q;
                            Context context = (Context) yt2.k(ye.b);
                            Object[] copyOf = Arrays.copyOf(new nx4[0], 0);
                            ed5 ed52 = ed5;
                            kg5 kg5 = new kg5(12, new uz1(19), new ju4(context, 0));
                            boolean i10 = yt2.i(context);
                            Object Q2 = yt2.Q();
                            if (i10 || Q2 == obj3) {
                                Q2 = new n20(context, 10);
                                yt2.o0(Q2);
                            }
                            iu4 iu4 = (iu4) u55.u(copyOf, kg5, (sr2) Q2, yt2, 0, 4);
                            boolean h = yt2.h(z2) | yt2.g(str) | yt2.g(iu4) | yt2.g(cc8) | yt2.g(o81) | yt2.g(az4) | yt2.g(f91);
                            Object Q3 = yt2.Q();
                            if (h || Q3 == obj3) {
                                sk3 sk3 = new sk3(str, iu4, cc8, f91, o81, az4);
                                yt2.o0(sk3);
                                Q3 = sk3;
                            }
                            boolean z3 = ((dh7) ed52.getValue()).a;
                            boolean z4 = ((dh7) ed52.getValue()).b;
                            ((dh7) ed52.getValue()).getClass();
                            ch7.a(z3, z4, true, su0.J(65142285, new y30((Object) mainActivity, (Object) (sk3) Q3, n, 24), yt2), yt2, 3072);
                        } else {
                            sg3.a0("crashReporter");
                            throw null;
                        }
                    } else {
                        sg3.a0("networkUtils");
                        throw null;
                    }
                } else {
                    h.q("Must support at least one size class");
                    return null;
                }
            } else {
                h.q("Must support at least one size class");
                return null;
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object obj3 = obj2;
        int i4 = this.w;
        rr rrVar = wr.a;
        ga6 ga6 = ga6.a;
        sr srVar = wr.c;
        jl4 jl4 = jl4.w;
        Object obj4 = ay0.a;
        int i5 = 2;
        boolean z19 = false;
        vs7 vs7 = vs7.a;
        Object obj5 = this.y;
        Object obj6 = this.x;
        switch (i4) {
            case b85.b:
                vs7 vs72 = vs7;
                vr2 vr2 = (vr2) obj6;
                g40 g40 = (g40) obj5;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    au0 a = zt0.a(srVar, xb4.K, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, jl4);
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
                    yt2.e0(-1028226009);
                    Iterator it = g40.z.iterator();
                    while (it.hasNext()) {
                        g40 g402 = (g40) it.next();
                        int ordinal = g402.ordinal();
                        if (ordinal == 0) {
                            z2 = false;
                            i = 289951976;
                            i2 = R.string.bonus_label;
                        } else if (ordinal == 1) {
                            z2 = false;
                            i = 289954599;
                            i2 = R.string.data_label;
                        } else if (ordinal == i5) {
                            z2 = false;
                            i = 289957126;
                            i2 = R.string.sms_label;
                        } else if (ordinal == 3) {
                            i = 289959624;
                            i2 = R.string.voice_label;
                            z2 = false;
                        } else {
                            yt2.e0(289950439);
                            yt2.r(false);
                            h.c();
                            return null;
                        }
                        String l = hl6.l(yt2, i, i2, yt2, z2);
                        h80 h80 = xb4.I;
                        ml4 f = we.f(yu6.a, q96.a(8.0f));
                        boolean g = yt2.g(vr2) | yt2.e(g402.ordinal());
                        Object Q = yt2.Q();
                        if (g || Q == obj4) {
                            z3 = false;
                            Q = new r03(vr2, g402, 0);
                            yt2.o0(Q);
                        } else {
                            z3 = false;
                        }
                        ml4 L = x91.L(h49.u(f, z3, (String) null, (sr2) Q, 15), 4.0f, 5.0f);
                        ea6 a2 = ca6.a(rrVar, h80, yt2, 48);
                        int hashCode2 = Long.hashCode(yt2.T);
                        vf5 m2 = yt2.m();
                        ml4 E2 = gw8.E(yt2, L);
                        ux0.d.getClass();
                        vy0 vy02 = tx0.b;
                        yt2.i0();
                        if (yt2.S) {
                            yt2.l(vy02);
                        } else {
                            yt2.r0();
                        }
                        g75.Q(tx0.f, yt2, a2);
                        g75.Q(tx0.e, yt2, m2);
                        g75.Q(tx0.g, yt2, Integer.valueOf(hashCode2));
                        g75.O(yt2, tx0.h);
                        g75.Q(tx0.d, yt2, E2);
                        if (g402 == g40) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean g2 = yt2.g(vr2) | yt2.e(g402.ordinal());
                        Object Q2 = yt2.Q();
                        if (g2 || Q2 == obj4) {
                            Q2 = new r03(vr2, g402, 1);
                            yt2.o0(Q2);
                        }
                        u55.a(z4, (sr2) Q2, (ml4) null, false, (uv5) null, yt2, 0, 60);
                        k75.a(yt2, yu6.p(jl4, 8.0f));
                        yf7.b(l, (ml4) null, z08.k(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 24576, 0, 262122);
                        yt2.r(true);
                        i5 = 2;
                    }
                    yt2.r(false);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs72;
            case 1:
                vs7 vs73 = vs7;
                aa8 aa8 = (aa8) obj6;
                fw0 fw0 = (fw0) obj5;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (yt22.V(intValue2 & 1, z5)) {
                    ml4 o = j45.o(yu6.b(x91.T(yu6.a, aa8), 0.0f, hv4.a, 1));
                    ea6 a3 = ca6.a(new ur(hv4.b, true, new h(2)), xb4.I, yt22, 54);
                    int hashCode3 = Long.hashCode(yt22.T);
                    vf5 m3 = yt22.m();
                    ml4 E3 = gw8.E(yt22, o);
                    ux0.d.getClass();
                    vy0 vy03 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy03);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(tx0.f, yt22, a3);
                    g75.Q(tx0.e, yt22, m3);
                    g75.Q(tx0.g, yt22, Integer.valueOf(hashCode3));
                    g75.O(yt22, tx0.h);
                    g75.Q(tx0.d, yt22, E3);
                    fw0.u(ga6, yt22, 6);
                    yt22.r(true);
                } else {
                    yt22.Y();
                }
                return vs73;
            case 2:
                vr2 vr22 = (vr2) obj6;
                bd5 bd5 = (bd5) obj5;
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj3).intValue();
                h80 h802 = xb4.I;
                if ((intValue3 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (yt23.V(intValue3 & 1, z6)) {
                    jl4 jl42 = jl4.w;
                    ml4 K = x91.K(jl42, 16.0f);
                    au0 a4 = zt0.a(srVar, xb4.K, yt23, 0);
                    int hashCode4 = Long.hashCode(yt23.T);
                    vf5 m4 = yt23.m();
                    ml4 E4 = gw8.E(yt23, K);
                    ux0.d.getClass();
                    vy0 vy04 = tx0.b;
                    yt23.i0();
                    if (yt23.S) {
                        yt23.l(vy04);
                    } else {
                        yt23.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt23, a4);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt23, m4);
                    Integer valueOf = Integer.valueOf(hashCode4);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt23, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt23, ceVar);
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt23, E4);
                    ea6 a5 = ca6.a(rrVar, h802, yt23, 48);
                    h80 h803 = h802;
                    int hashCode5 = Long.hashCode(yt23.T);
                    vf5 m5 = yt23.m();
                    vs7 vs74 = vs7;
                    ml4 E5 = gw8.E(yt23, jl42);
                    yt23.i0();
                    vr2 vr23 = vr22;
                    if (yt23.S) {
                        yt23.l(vy04);
                    } else {
                        yt23.r0();
                    }
                    g75.Q(ckVar, yt23, a5);
                    g75.Q(ckVar2, yt23, m5);
                    f21.s(hashCode5, yt23, ckVar3, yt23, ceVar);
                    g75.Q(ckVar4, yt23, E5);
                    x83 O = rc9.O();
                    int i6 = v08.a;
                    yi5.d(O, v08.e(uq3.d(4292731888L), uq3.d(4280101440L)), v08.e(uq3.d(4281684093L), uq3.d(4286553289L)), 0, yt23, 0);
                    k75.a(yt23, yu6.p(jl42, 15.0f));
                    yf7.b(l55.u(R.string.label_plan_amigo, yt23), new lz3(1.0f, true), v08.d(), ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262056);
                    yt23.r(true);
                    k75.a(yt23, yu6.d(jl42, 8.0f));
                    List E6 = sg3.E(l55.u(R.string.option_activate, yt23), l55.u(R.string.option_deactivate, yt23), l55.u(R.string.option_check_plan, yt23));
                    yt23.e0(853763510);
                    int i7 = 0;
                    for (Object next : E6) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            String str = (String) next;
                            sd2 sd2 = yu6.a;
                            boolean e = yt23.e(i7);
                            Object Q3 = yt23.Q();
                            if (e || Q3 == obj4) {
                                z8 = false;
                                Q3 = new ti5(i7, bd5, 0);
                                yt23.o0(Q3);
                            } else {
                                z8 = false;
                            }
                            ml4 u = h49.u(sd2, z8, (String) null, (sr2) Q3, 15);
                            h80 h804 = h803;
                            ea6 a6 = ca6.a(rrVar, h804, yt23, 48);
                            int hashCode6 = Long.hashCode(yt23.T);
                            vf5 m6 = yt23.m();
                            ml4 E7 = gw8.E(yt23, u);
                            ux0.d.getClass();
                            vy0 vy05 = tx0.b;
                            yt23.i0();
                            if (yt23.S) {
                                yt23.l(vy05);
                            } else {
                                yt23.r0();
                            }
                            g75.Q(tx0.f, yt23, a6);
                            g75.Q(tx0.e, yt23, m6);
                            g75.Q(tx0.g, yt23, Integer.valueOf(hashCode6));
                            g75.O(yt23, tx0.h);
                            g75.Q(tx0.d, yt23, E7);
                            if (i7 == bd5.d()) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            boolean e2 = yt23.e(i7);
                            Object Q4 = yt23.Q();
                            if (e2 || Q4 == obj4) {
                                Q4 = new ti5(i7, bd5, 1);
                                yt23.o0(Q4);
                            }
                            sr2 sr2 = (sr2) Q4;
                            if (i7 == 0) {
                                int i9 = v08.a;
                                j = v08.e(uq3.d(4279658664L), uq3.d(4284131291L));
                            } else {
                                j = v08.a();
                            }
                            yt2 yt24 = yt23;
                            u55.a(z9, sr2, (ml4) null, false, o55.e(j, v08.b(), yt23), yt24, 0, 44);
                            yt2 yt25 = yt24;
                            yf7.b(str, (ml4) null, v08.d(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 24576, 0, 262122);
                            yt23 = yt25;
                            yt23.r(true);
                            i7 = i8;
                            h803 = h804;
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                    yt23.r(false);
                    jl4 jl43 = jl42;
                    yf7.b(l55.u(R.string.label_activate_cost, yt23), x91.O(jl43, 42.0f, 4.0f, 0.0f, 0.0f, 12), v08.b(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 24624, 0, 262120);
                    k75.a(yt23, yu6.d(jl43, 12.0f));
                    if (bd5.d() >= 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    vr2 vr24 = vr23;
                    boolean g3 = yt23.g(vr24);
                    Object Q5 = yt23.Q();
                    if (g3 || Q5 == obj4) {
                        Q5 = new qm3(14, (Object) vr24, (Object) bd5);
                        yt23.o0(Q5);
                    }
                    yi5.c(z7, (sr2) Q5, yt23, 0);
                    yt23.r(true);
                    return vs74;
                }
                vs7 vs75 = vs7;
                yt23.Y();
                return vs75;
            case 3:
                String str2 = (String) obj6;
                aq4 aq4 = (aq4) obj5;
                yt2 yt26 = (yt2) obj;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (yt26.V(intValue4 & 1, z10)) {
                    au0 a7 = zt0.a(srVar, xb4.K, yt26, 0);
                    int hashCode7 = Long.hashCode(yt26.T);
                    vf5 m7 = yt26.m();
                    ml4 E8 = gw8.E(yt26, jl4);
                    ux0.d.getClass();
                    vy0 vy06 = tx0.b;
                    yt26.i0();
                    if (yt26.S) {
                        yt26.l(vy06);
                    } else {
                        yt26.r0();
                    }
                    g75.Q(tx0.f, yt26, a7);
                    g75.Q(tx0.e, yt26, m7);
                    g75.Q(tx0.g, yt26, Integer.valueOf(hashCode7));
                    g75.O(yt26, tx0.h);
                    g75.Q(tx0.d, yt26, E8);
                    t37 t37 = ch4.b;
                    yf7.b(str2, (ml4) null, ((zg4) yt26.k(t37)).a.w, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 4, 0, ((zg4) yt26.k(t37)).b.l, yt26, 0, 24576, 114682);
                    k75.a(yt26, yu6.d(jl4, 12.0f));
                    String str3 = (String) aq4.getValue();
                    ml4 f2 = yu6.f(yu6.a, 0.0f, 160.0f, 1);
                    Object Q6 = yt26.Q();
                    if (Q6 == obj4) {
                        Q6 = new t46(aq4, 0);
                        yt26.o0(Q6);
                    }
                    z85.b(str3, (vr2) Q6, f2, false, false, (tg7) null, hj8.e, hj8.f, (gs2) null, (gs2) null, (gs2) null, false, (m78) null, (bt3) null, (zs3) null, false, 0, 3, (pq6) null, (yd7) null, yt26, 14156208, 805306368, 0, 7864120);
                    yf7.b(pb4.j(jl4, 8.0f, yt26, R.string.report_dialog_device_info_note, yt26), (ml4) null, ((zg4) yt26.k(t37)).a.s, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt26.k(t37)).b.l, yt26, 0, 0, 131066);
                    yt26.r(true);
                } else {
                    yt26.Y();
                }
                return vs7;
            case 4:
                ((Integer) obj3).getClass();
                b30.b((is2) obj6, (c30) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 5:
                ((Integer) obj3).getClass();
                b30.m((List) obj6, (sr2) obj5, (yt2) obj, b85.v(49));
                return vs7;
            case 6:
                q67 q67 = (q67) obj;
                k31 k31 = (k31) obj3;
                return ((lh4) obj6).b(q67, q67.x(new fw0(-431986394, new p13(7, (Object) (fw0) obj5, (Object) new sb0(q67, k31.a)), true), vs7), k31.a);
            case 7:
                fw0 fw02 = (fw0) obj6;
                sb0 sb0 = (sb0) obj5;
                yt2 yt27 = (yt2) obj;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (yt27.V(intValue5 & 1, z11)) {
                    fw02.u(sb0, yt27, 0);
                } else {
                    yt27.Y();
                }
                return vs7;
            case 8:
                la5 la5 = (la5) obj6;
                hs2 hs2 = (hs2) obj5;
                yt2 yt28 = (yt2) obj;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 3) != 2) {
                    z19 = true;
                }
                if (yt28.V(intValue6 & 1, z19)) {
                    ml4 J = x91.J(yu6.a(jl4, yd0.d, yd0.e()), la5);
                    ea6 a8 = ca6.a(wr.e, xb4.I, yt28, 54);
                    int hashCode8 = Long.hashCode(yt28.T);
                    vf5 m8 = yt28.m();
                    ml4 E9 = gw8.E(yt28, J);
                    ux0.d.getClass();
                    vy0 vy07 = tx0.b;
                    yt28.i0();
                    if (yt28.S) {
                        yt28.l(vy07);
                    } else {
                        yt28.r0();
                    }
                    g75.Q(tx0.f, yt28, a8);
                    g75.Q(tx0.e, yt28, m8);
                    g75.Q(tx0.g, yt28, Integer.valueOf(hashCode8));
                    g75.O(yt28, tx0.h);
                    g75.Q(tx0.d, yt28, E9);
                    hs2.u(ga6, yt28, 6);
                    yt28.r(true);
                } else {
                    yt28.Y();
                }
                return vs7;
            case 9:
                ((Integer) obj3).getClass();
                ((y51) obj6).a((x51) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 10:
                String str4 = (String) obj6;
                ig1 ig1 = (ig1) obj5;
                yt2 yt29 = (yt2) obj;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (yt29.V(intValue7 & 1, z12)) {
                    boolean g4 = yt29.g(str4);
                    Object Q7 = yt29.Q();
                    if (g4 || Q7 == obj4) {
                        Q7 = new cb(str4, 5);
                        yt29.o0(Q7);
                    }
                    yf7.b(str4, ck6.a(jl4, false, (vr2) Q7), ig1.f, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt29, 0, 0, 262136);
                } else {
                    yt29.Y();
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((Integer) obj3).getClass();
                ((rm1) obj6).a((gx4) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 12:
                zc7 zc7 = (zc7) obj6;
                md7 md7 = (md7) obj5;
                yt2 yt210 = (yt2) obj;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (yt210.V(intValue8 & 1, z13)) {
                    boolean g5 = yt210.g(zc7);
                    Object Q8 = yt210.Q();
                    if (g5 || Q8 == obj4) {
                        Q8 = u55.i(new yd(0, zc7, zc7.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 6));
                        yt210.o0(Q8);
                    }
                    zn1.a(md7, (yc7) ((a37) Q8).getValue(), yt210, 0);
                } else {
                    yt210.Y();
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((Integer) obj3).getClass();
                zn1.a((md7) obj6, (yc7) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 14:
                ((Integer) obj3).getClass();
                r16.m((List) obj6, (Collection) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case h75.g:
                ((Integer) obj3).getClass();
                r16.i((is2) obj6, (np2) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 16:
                fn4 fn4 = (fn4) obj6;
                yt2 yt211 = (yt2) obj;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (yt211.V(intValue9 & 1, z14)) {
                    fn4.a.u(obj5, yt211, 0);
                } else {
                    yt211.Y();
                }
                return vs7;
            case 17:
                u36 u36 = (u36) obj6;
                jv6 jv6 = (jv6) obj5;
                int intValue10 = ((Integer) obj).intValue();
                if (obj3 instanceof jx0) {
                    u36.f.b((jx0) obj3);
                } else if (!(obj3 instanceof k76)) {
                    if (obj3 instanceof cu2) {
                        b96.P(jv6, intValue10, obj3);
                        u36.e((cu2) obj3);
                    } else if (obj3 instanceof yx5) {
                        b96.P(jv6, intValue10, obj3);
                        ((yx5) obj3).c();
                    }
                }
                return vs7;
            case 18:
                ((Integer) obj3).getClass();
                t13.t((vr2) obj6, (vr2) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 19:
                ((Integer) obj3).getClass();
                t13.r((o03) obj5, (vr2) obj6, (yt2) obj, b85.v(1));
                return vs7;
            case 20:
                ((Integer) obj3).getClass();
                gr8.j((is2) obj6, (qb3) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 21:
                ox2 ox2 = (ox2) obj6;
                tr trVar = (tr) obj5;
                tp1 tp1 = (tp1) obj;
                k31 k312 = (k31) obj3;
                if (k31.h(k312.a) == Integer.MAX_VALUE) {
                    bc3.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int h = k31.h(k312.a);
                int r0 = tp1.r0(trVar.a());
                int i10 = ox2.a;
                int i11 = h - ((i10 - 1) * r0);
                int i12 = i11 / i10;
                int i13 = i11 % i10;
                ArrayList arrayList = new ArrayList(i10);
                for (int i14 = 0; i14 < i10; i14++) {
                    if (i14 < i13) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    arrayList.add(Integer.valueOf(i3 + i12));
                }
                int[] a1 = dt0.a1(arrayList);
                int[] iArr = new int[a1.length];
                trVar.u(tp1, h, a1, ey3.w, iArr);
                return new hv2(a1, iArr);
            case 22:
                g24 g24 = (g24) obj6;
                f24 f24 = (f24) obj5;
                yt2 yt212 = (yt2) obj;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (yt212.V(intValue11 & 1, z15)) {
                    h24 h24 = (h24) g24.b.b();
                    int i15 = f24.c;
                    Object obj7 = f24.a;
                    if ((i15 >= h24.a() || !h24.b(i15).equals(obj7)) && (i15 = h24.e(obj7)) != -1) {
                        f24.c = i15;
                    }
                    if (i15 != -1) {
                        yt212.e0(-1664741271);
                        dh4.c(h24, g24.a, i15, f24.a, yt212, 0);
                        yt212.r(false);
                    } else {
                        yt212.e0(-1664505826);
                        yt212.r(false);
                    }
                    boolean i16 = yt212.i(f24);
                    Object Q9 = yt212.Q();
                    if (i16 || Q9 == obj4) {
                        Q9 = new h43(9, f24);
                        yt212.o0(Q9);
                    }
                    t49.e(obj7, (vr2) Q9, yt212);
                } else {
                    yt212.Y();
                }
                return vs7;
            case 23:
                return ((i24) obj5).a(new j24((g24) obj6, (q67) obj), ((k31) obj3).a);
            case 24:
                fw0 fw03 = (fw0) obj6;
                x34 x34 = (x34) obj5;
                yt2 yt213 = (yt2) obj;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (yt213.V(intValue12 & 1, z16)) {
                    fw03.u(x34, yt213, 0);
                } else {
                    yt213.Y();
                }
                return vs7;
            case 25:
                return a(obj, obj2);
            case 26:
                ((Integer) obj3).getClass();
                rs4.g((is2) obj6, (vs4) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 27:
                ((Integer) obj3).getClass();
                x91.h((oe6) obj6, (fw0) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 28:
                a37 a37 = (a37) obj6;
                cv4 cv4 = (cv4) obj5;
                yt2 yt214 = (yt2) obj;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (yt214.V(intValue13 & 1, z17)) {
                    ml4 w0 = rc9.w0(jl4, "indicator");
                    boolean g6 = yt214.g(a37);
                    Object Q10 = yt214.Q();
                    if (g6 || Q10 == obj4) {
                        Q10 = new pn(2, a37);
                        yt214.o0(Q10);
                    }
                    mb0.a(b96.h(mp7.X(w0, (vr2) Q10), cv4.c, hr6.a(r16.i, yt214)), yt214, 0);
                } else {
                    yt214.Y();
                }
                return vs7;
            default:
                pq6 pq6 = (pq6) obj6;
                rf4 rf4 = (rf4) obj5;
                yt2 yt215 = (yt2) obj;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 3) != 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (yt215.V(intValue14 & 1, z18)) {
                    mb0.a(la3.a(we.f(rc9.w0(jl4, "indicatorRipple"), pq6), rf4, d86.a(false, 0.0f, 0, pq6, 247)), yt215, 0);
                } else {
                    yt215.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ p13(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public /* synthetic */ p13(Object obj, Object obj2, int i, int i2) {
        this.w = i2;
        this.x = obj;
        this.y = obj2;
    }
}
