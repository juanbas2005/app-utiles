package defpackage;

import android.net.ConnectivityManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: g20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class g20 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g20(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public final Object b() {
        int i;
        int i2;
        ly5 ly5;
        boolean z2;
        long j;
        Integer num;
        String str;
        boolean z3;
        r11 r11 = null;
        switch (this.w) {
            case b85.b:
                ((h20) this.x).a();
                yt ytVar = (yt) ((o9) this.y).z;
                int i3 = ((f06) this.z).w;
                do {
                    i = ytVar.get();
                    if (((i >>> 27) & 15) == i3) {
                        i2 = i - 1;
                    } else {
                        i2 = i;
                    }
                } while (!ytVar.compareAndSet(i, i2));
                return vs7.a;
            case 1:
                ek7 ek7 = (ek7) this.x;
                o81 o81 = (o81) this.y;
                aq4 aq4 = (aq4) this.z;
                if (ek7.b()) {
                    ar7.H(o81, (e81) null, (r81) null, new f70(ek7, (f61) null, 0), 3);
                    aq4.setValue(Boolean.FALSE);
                }
                return vs7.a;
            case 2:
                cc0 cc0 = (cc0) this.x;
                ly5 V0 = cc0.V0(cc0, (xz4) this.y, (ae) this.z);
                if (V0 == null) {
                    return null;
                }
                s41 s41 = cc0.K;
                if (we3.a(s41.R, -1)) {
                    bc3.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return V0.i(s41.Z0(V0, s41.W0(), 0) ^ -9223372034707292160L);
            case 3:
                x91 x91 = ((sm0) this.x).b;
                x91.getClass();
                return x91.p(((v9) this.z).h.d, ((jy2) this.y).a());
            case 4:
                s41 s412 = (s41) this.x;
                fu7 fu7 = (fu7) this.y;
                fc0 fc0 = (fc0) this.z;
                vs7 vs7 = vs7.a;
                f96 f96 = s412.P;
                while (true) {
                    eq4 eq4 = (eq4) f96.x;
                    int i4 = eq4.y;
                    if (i4 != 0) {
                        if (i4 != 0) {
                            ly5 ly52 = (ly5) ((q41) eq4.w[i4 - 1]).a.b();
                            if (ly52 == null) {
                                z2 = true;
                            } else {
                                z2 = s41.X0(s412, ly52, 0, 0, 3);
                            }
                            if (z2) {
                                eq4 eq42 = (eq4) f96.x;
                                ((q41) eq42.l(eq42.y - 1)).b.f(vs7);
                            }
                        } else {
                            kj6.i("MutableVector is empty.");
                            return null;
                        }
                    }
                }
                if (s412.Q && (ly5 = (ly5) s412.O.b()) != null && s41.X0(s412, ly5, 0, 0, 3)) {
                    s412.Q = false;
                }
                fu7.e = s41.V0(s412, fc0, 0);
                return vs7;
            case 5:
                vr2 vr2 = (vr2) this.x;
                String str2 = ((qm2) this.z).a;
                if (!sg3.e((String) this.y, str2)) {
                    r11 = str2;
                }
                vr2.y(r11);
                return vs7.a;
            case 6:
                ((aq4) this.z).setValue((Object) null);
                ((vr2) this.x).y(((en2) this.y).a);
                return vs7.a;
            case 7:
                ((aq4) this.z).setValue((Object) null);
                ((vr2) this.x).y(((tm2) this.y).a);
                return vs7.a;
            case 8:
                ((aq4) this.y).setValue(((qm2) this.x).a);
                ((aq4) this.z).setValue(Boolean.FALSE);
                return vs7.a;
            case 9:
                ((vr2) this.x).y(new no2((vr2) this.y, (aq4) this.z, 1));
                return vs7.a;
            case 10:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.y;
                db3 db3 = (db3) this.z;
                if (((d06) this.x).w) {
                    bc4.k().e(bd8.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(db3);
                }
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new ab5((is2) ((aq4) this.x).getValue(), (vr2) ((aq4) this.y).getValue(), ((Number) ((sr2) this.z).b()).intValue());
            case 12:
                s34 s34 = (s34) this.y;
                h34 h34 = (h34) ((oq1) this.x).getValue();
                return new i34(s34, h34, (r04) this.z, new ig((re3) s34.e.f.getValue(), (uq3) h34));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                vr2 vr22 = (vr2) this.x;
                sr2 sr2 = (sr2) this.y;
                Long w0 = k57.w0((String) ((aq4) this.z).getValue());
                if (w0 != null) {
                    j = w0.longValue();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    vr22.y(Long.valueOf(j));
                    sr2.b();
                }
                return vs7.a;
            case 14:
                sr2 sr22 = (sr2) this.z;
                int size = ((ArrayList) this.x).size() - ((eg6) this.y).b().size();
                for (int i5 = 0; i5 < size; i5++) {
                    sr22.b();
                }
                return vs7.a;
            case h75.g /*15*/:
                st2 st2 = (st2) this.x;
                jv6 jv6 = (jv6) this.y;
                f75 f75 = (f75) this.z;
                if (st2 != null) {
                    jv6.a(jv6.c(st2) - jv6.t);
                }
                List v = gr8.v(jv6, (Integer) null, jv6.t, (Integer) null);
                sx0 sx0 = (sx0) dt0.H0(v);
                if (sx0 != null) {
                    num = sx0.b;
                } else {
                    num = null;
                }
                List A = f75.A(num);
                if (num != null && !A.isEmpty()) {
                    A = dt0.M0(sg3.D(new sx0(((sx0) dt0.w0(A)).a, (g75) null, num)), dt0.s0(1, A));
                }
                return new qx0(dt0.M0(v, A), f75.N());
            case 16:
                Object obj = this.x;
                Object obj2 = this.y;
                StringBuilder sb = new StringBuilder("Attempting to assign conflicting values '");
                sb.append(obj);
                sb.append("' and '");
                sb.append(obj2);
                sb.append("' to field '");
                return hl6.o(sb, ((cr4) ((br4) this.z).x).c, '\'');
            case 17:
                sr2 sr23 = (sr2) this.x;
                sr2 sr24 = (sr2) this.y;
                if (((bd5) this.z).d() == 0) {
                    sr23.b();
                } else {
                    sr24.b();
                }
                return vs7.a;
            case 18:
                ((vr2) this.x).y((jy7) this.y);
                ((aq4) this.z).setValue(Boolean.FALSE);
                return vs7.a;
            case 19:
                vr2 vr23 = (vr2) this.x;
                r11 r112 = (r11) this.y;
                r11 r113 = (r11) this.z;
                if (r112 != r113) {
                    r11 = r113;
                }
                vr23.y(r11);
                return vs7.a;
            case 20:
                ((aq4) this.z).setValue((Object) null);
                ((vr2) this.x).y(((o11) this.y).a);
                return vs7.a;
            default:
                nd8 nd8 = (nd8) this.x;
                String str3 = (String) this.y;
                xd8 xd8 = (xd8) this.z;
                fe8 w2 = nd8.c.w();
                List f = w2.f(str3);
                if (f.size() <= 1) {
                    zd8 zd8 = (zd8) dt0.y0(f);
                    if (zd8 == null) {
                        z42.a(new cd8(nd8, str3, w82.x, sg3.D(xd8), 0));
                    } else {
                        String str4 = zd8.a;
                        be8 e = w2.e(str4);
                        if (e == null) {
                            h.s(pb4.m("WorkSpec with ", str4, ", that matches a name \"", str3, "\", wasn't found"));
                            return null;
                        } else if (!e.c()) {
                            kj6.n("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                            return null;
                        } else if (zd8.b == kd8.B) {
                            w2.c(str4);
                            z42.a(new cd8(nd8, str3, w82.x, sg3.D(xd8), 0));
                        } else {
                            be8 b = be8.b(xd8.b, zd8.a, (kd8) null, (String) null, (ce1) null, 0, 0, 0, 0, 0, 0, 33554430);
                            lp5 lp5 = nd8.f;
                            lp5.getClass();
                            WorkDatabase workDatabase = nd8.c;
                            workDatabase.getClass();
                            f01 f01 = nd8.b;
                            f01.getClass();
                            List<jg6> list = nd8.e;
                            list.getClass();
                            Set set = xd8.c;
                            String str5 = "OneTime";
                            String str6 = b.a;
                            be8 e2 = workDatabase.w().e(str6);
                            if (e2 == null) {
                                h.q(f21.h("Worker with ", str6, " doesn't exist"));
                                return null;
                            } else if (!e2.b.a()) {
                                if (!(e2.c() ^ b.c())) {
                                    synchronized (lp5.k) {
                                        if (lp5.c(str6) != null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    if (!z3) {
                                        for (jg6 d : list) {
                                            d.d(str6);
                                        }
                                    }
                                    WorkDatabase workDatabase2 = workDatabase;
                                    List list2 = list;
                                    WorkDatabase workDatabase3 = workDatabase2;
                                    List list3 = list2;
                                    workDatabase3.o(new hx4(13, new je8(workDatabase2, e2, b, list2, str6, set, z3)));
                                    if (!z3) {
                                        mg6.b(f01, workDatabase3, list3);
                                    }
                                } else {
                                    be8 be8 = b;
                                    StringBuilder sb2 = new StringBuilder("Can't update ");
                                    if (e2.c()) {
                                        str = "Periodic";
                                    } else {
                                        str = str5;
                                    }
                                    sb2.append(str);
                                    sb2.append(" Worker to ");
                                    if (be8.c()) {
                                        str5 = "Periodic";
                                    }
                                    throw new UnsupportedOperationException(f21.l(sb2, str5, " Worker. Update operation must preserve worker's type."));
                                }
                            }
                        }
                    }
                    return vs7.a;
                }
                kj6.n("Can't apply UPDATE policy to the chains of work.");
                return null;
        }
    }
}
