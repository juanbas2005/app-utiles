package defpackage;

import cu.lestebang.utiletecsa.feature.settings.service.CallAlertActivity;
import java.lang.ref.WeakReference;

/* renamed from: ai0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ai0 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ai0(String str, String str2, vr2 vr2, boolean z2, int i) {
        this.w = 11;
        this.y = str;
        this.z = str2;
        this.A = vr2;
        this.x = z2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        xw2 xw2;
        long j;
        boolean z4;
        ck ckVar;
        long j2;
        long j3;
        boolean z5;
        long j4;
        int i = this.w;
        Object obj3 = ay0.a;
        boolean z6 = this.x;
        boolean z7 = false;
        vs7 vs7 = vs7.a;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case b85.b /*0*/:
                String str = (String) obj6;
                String str2 = (String) obj5;
                CallAlertActivity callAlertActivity = (CallAlertActivity) obj4;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                WeakReference weakReference = CallAlertActivity.R;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    boolean z8 = !((Boolean) u55.f(fi0.d, yt2).getValue()).booleanValue();
                    boolean i2 = yt2.i(callAlertActivity) | yt2.g(str);
                    Object Q = yt2.Q();
                    if (i2 || Q == obj3) {
                        Q = new bi0(callAlertActivity, str, 0);
                        yt2.o0(Q);
                    }
                    sr2 sr2 = (sr2) Q;
                    boolean i3 = yt2.i(callAlertActivity) | yt2.g(str);
                    Object Q2 = yt2.Q();
                    if (i3 || Q2 == obj3) {
                        Q2 = new bi0(callAlertActivity, str, 1);
                        yt2.o0(Q2);
                    }
                    sr2 sr22 = (sr2) Q2;
                    boolean i4 = yt2.i(callAlertActivity);
                    Object Q3 = yt2.Q();
                    if (i4 || Q3 == obj3) {
                        Q3 = new yd(0, callAlertActivity, CallAlertActivity.class, "finish", "finish()V", 0, 0, 1);
                        yt2.o0(Q3);
                    }
                    sr2 sr23 = (sr2) ((zq3) Q3);
                    boolean i5 = yt2.i(callAlertActivity);
                    Object Q4 = yt2.Q();
                    if (i5 || Q4 == obj3) {
                        Q4 = new gg0(12, (Object) callAlertActivity);
                        yt2.o0(Q4);
                    }
                    String str3 = str;
                    String str4 = str2;
                    String str5 = str3;
                    tf4.b(z8, str5, str4, this.x, sr2, sr22, sr23, (vr2) Q4, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                fd1.g(this.x, (vr2) obj6, (ml4) obj5, (fw0) obj4, (yt2) obj, b85.v(3121));
                return vs7;
            case 2:
                gs2 gs2 = (gs2) obj6;
                aq4 aq4 = (aq4) obj5;
                aq4 aq42 = (aq4) obj4;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z7 = true;
                }
                if (yt22.V(intValue2 & 1, z7)) {
                    boolean g = yt22.g(gs2);
                    Object Q5 = yt22.Q();
                    if (g || Q5 == obj3) {
                        Q5 = new v20(gs2, aq4, aq42, 1);
                        yt22.o0(Q5);
                    }
                    gw8.e((sr2) Q5, (ml4) null, this.x, (pq6) null, (xd0) null, (la5) null, rj1.n, yt22, 805306368, 506);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 3:
                sk3 sk3 = (sk3) obj6;
                aq4 aq43 = (aq4) obj5;
                k98 k98 = (k98) obj4;
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt23.V(intValue3 & 1, z3)) {
                    if (z6) {
                        yt23.e0(-1683592109);
                        xw2 = (xw2) yt23.k(yw2.a);
                        yt23.r(false);
                    } else {
                        yt23.e0(-1683527970);
                        yt23.r(false);
                        xw2 = new xw2(0, 7);
                    }
                    r16.b((ml4) null, xw2, su0.J(-1364017278, new y30((Object) sk3, aq43, (Object) k98, 23), yt23), yt23, 384);
                } else {
                    yt23.Y();
                }
                return vs7;
            case 4:
                ((Integer) obj2).getClass();
                rs4.b(this.x, (sr2) obj6, (sr2) obj5, (sr2) obj4, (yt2) obj, b85.v(3073));
                return vs7;
            case 5:
                cv4 cv4 = (cv4) obj6;
                je2 je2 = (je2) obj5;
                gs2 gs22 = (gs2) obj4;
                yt2 yt24 = (yt2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z7 = true;
                }
                if (yt24.V(intValue4 & 1, z7)) {
                    tg7 a = dr7.a(r16.n, yt24);
                    if (z6) {
                        j = cv4.b;
                    } else {
                        j = cv4.e;
                    }
                    yt2 yt25 = yt24;
                    a35.a(((jt0) ru6.a(j, je2, (String) null, yt25, 0, 12).getValue()).a, a, gs22, yt25, 0);
                } else {
                    yt24.Y();
                }
                return vs7;
            case 6:
                gs2 gs23 = (gs2) obj6;
                ml1 ml1 = (ml1) obj5;
                fw0 fw0 = (fw0) obj4;
                yt2 yt26 = (yt2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt26.V(intValue5 & 1, z4)) {
                    jl4 jl4 = jl4.w;
                    ml4 O = x91.O(jl4, 16.0f, 0.0f, 24.0f, 0.0f, 10);
                    ea6 a2 = ca6.a(wr.a, xb4.I, yt26, 48);
                    int hashCode = Long.hashCode(yt26.T);
                    vf5 m = yt26.m();
                    ml4 E = gw8.E(yt26, O);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt26.i0();
                    if (yt26.S) {
                        yt26.l(vy0);
                    } else {
                        yt26.r0();
                    }
                    ck ckVar2 = tx0.f;
                    g75.Q(ckVar2, yt26, a2);
                    ck ckVar3 = tx0.e;
                    g75.Q(ckVar3, yt26, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar4 = tx0.g;
                    g75.Q(ckVar4, yt26, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt26, ceVar);
                    ck ckVar5 = tx0.d;
                    g75.Q(ckVar5, yt26, E);
                    if (gs23 != null) {
                        yt26.e0(-2013920011);
                        yt26.e0(1141354218);
                        ckVar = ckVar3;
                        if (z6) {
                            j3 = ml1.a;
                        } else {
                            j3 = ml1.b;
                        }
                        aq4 v = u55.v(new jt0(j3), yt26);
                        yt26.r(false);
                        t49.c(b81.g(((jt0) v.getValue()).a, j41.a), gs23, yt26, 8);
                        k75.a(yt26, yu6.p(jl4, 12.0f));
                        yt26.r(false);
                    } else {
                        ckVar = ckVar3;
                        yt26.e0(-2013707630);
                        yt26.r(false);
                    }
                    lz3 lz3 = new lz3(1.0f, true);
                    lh4 d = mb0.d(xb4.y, false);
                    int hashCode2 = Long.hashCode(yt26.T);
                    vf5 m2 = yt26.m();
                    ml4 E2 = gw8.E(yt26, lz3);
                    yt26.i0();
                    if (yt26.S) {
                        yt26.l(vy0);
                    } else {
                        yt26.r0();
                    }
                    g75.Q(ckVar2, yt26, d);
                    g75.Q(ckVar, yt26, m2);
                    f21.s(hashCode2, yt26, ckVar4, yt26, ceVar);
                    g75.Q(ckVar5, yt26, E2);
                    yt26.e0(1275109558);
                    if (z6) {
                        j2 = ml1.c;
                    } else {
                        j2 = ml1.d;
                    }
                    aq4 v2 = u55.v(new jt0(j2), yt26);
                    yt26.r(false);
                    t49.c(b81.g(((jt0) v2.getValue()).a, j41.a), fw0, yt26, 8);
                    yt26.r(true);
                    yt26.e0(-2013238414);
                    yt26.r(false);
                    yt26.r(true);
                } else {
                    yt26.Y();
                }
                return vs7;
            case 7:
                ((Integer) obj2).getClass();
                int v3 = b85.v(1);
                pd8.c((bw4) obj6, this.x, (sr2) obj5, (sr2) obj4, (yt2) obj, v3);
                return vs7;
            case 8:
                fw4 fw4 = (fw4) obj6;
                gs2 gs24 = (gs2) obj5;
                a37 a37 = (a37) obj4;
                yt2 yt27 = (yt2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z7 = true;
                }
                if (yt27.V(intValue6 & 1, z7)) {
                    hj8.l(this.x, (tg7) a37.getValue(), fw4, gs24, yt27, 0);
                } else {
                    yt27.Y();
                }
                return vs7;
            case 9:
                gs2 gs25 = (gs2) obj6;
                fw0 fw02 = (fw0) obj5;
                gs2 gs26 = (gs2) obj4;
                yt2 yt28 = (yt2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (yt28.V(intValue7 & 1, z5)) {
                    ea6 a3 = ca6.a(new ur(6.0f, true, new h(2)), xb4.I, yt28, 54);
                    int hashCode3 = Long.hashCode(yt28.T);
                    vf5 m3 = yt28.m();
                    ml4 E3 = gw8.E(yt28, jl4.w);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt28.i0();
                    if (yt28.S) {
                        yt28.l(vy02);
                    } else {
                        yt28.r0();
                    }
                    g75.Q(tx0.f, yt28, a3);
                    g75.Q(tx0.e, yt28, m3);
                    g75.Q(tx0.g, yt28, Integer.valueOf(hashCode3));
                    g75.O(yt28, tx0.h);
                    g75.Q(tx0.d, yt28, E3);
                    if (z6) {
                        yt28.e0(46950050);
                        gs25.H(yt28, 0);
                    } else {
                        yt28.e0(46950682);
                        fw02.H(yt28, 0);
                    }
                    yt28.r(false);
                    if (!z6 || gs26 == null) {
                        yt28.e0(1455571150);
                        yt28.r(false);
                    } else {
                        yt28.e0(1455525983);
                        gs26.H(yt28, 0);
                        yt28.r(false);
                    }
                    yt28.r(true);
                } else {
                    yt28.Y();
                }
                return vs7;
            case 10:
                rw4 rw4 = (rw4) obj6;
                je2 je22 = (je2) obj5;
                gs2 gs27 = (gs2) obj4;
                yt2 yt29 = (yt2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z7 = true;
                }
                if (yt29.V(intValue8 & 1, z7)) {
                    tg7 a4 = dr7.a(gr8.g, yt29);
                    if (z6) {
                        j4 = rw4.b;
                    } else {
                        j4 = rw4.e;
                    }
                    yt2 yt210 = yt29;
                    a35.a(((jt0) ru6.a(j4, je22, (String) null, yt210, 0, 12).getValue()).a, a4, gs27, yt210, 0);
                } else {
                    yt29.Y();
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((Integer) obj2).getClass();
                int v4 = b85.v(3073);
                bb0.R((String) obj6, (String) obj5, (vr2) obj4, this.x, (yt2) obj, v4);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                q17.b((o11) obj6, this.x, (gs2) obj5, (sr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ ai0(Object obj, boolean z2, ds2 ds2, sr2 sr2, int i, int i2) {
        this.w = i2;
        this.y = obj;
        this.x = z2;
        this.z = ds2;
        this.A = sr2;
    }

    public /* synthetic */ ai0(Object obj, boolean z2, Object obj2, Object obj3, int i) {
        this.w = i;
        this.y = obj;
        this.x = z2;
        this.z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ ai0(Object obj, Object obj2, boolean z2, Object obj3, int i) {
        this.w = i;
        this.y = obj;
        this.z = obj2;
        this.x = z2;
        this.A = obj3;
    }

    public /* synthetic */ ai0(boolean z2, ds2 ds2, Object obj, ds2 ds22, int i, int i2) {
        this.w = i2;
        this.x = z2;
        this.y = ds2;
        this.z = obj;
        this.A = ds22;
    }

    public /* synthetic */ ai0(boolean z2, Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = z2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
