package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ck  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ck extends wx3 implements gs2 {
    public static final ck A = new ck(2, 2);
    public static final ck B = new ck(2, 3);
    public static final ck C = new ck(2, 4);
    public static final ck D = new ck(2, 5);
    public static final ck E = new ck(2, 6);
    public static final ck F = new ck(2, 7);
    public static final ck G = new ck(2, 8);
    public static final ck H = new ck(2, 9);
    public static final ck I = new ck(2, 10);
    public static final ck J = new ck(2, 11);
    public static final ck K = new ck(2, 12);
    public static final ck L = new ck(2, 13);
    public static final ck M = new ck(2, 14);
    public static final ck N = new ck(2, 15);
    public static final ck O = new ck(2, 16);
    public static final ck P = new ck(2, 17);
    public static final ck Q = new ck(2, 18);
    public static final ck R = new ck(2, 19);
    public static final ck S = new ck(2, 20);
    public static final ck T = new ck(2, 21);
    public static final ck U = new ck(2, 22);
    public static final ck V = new ck(2, 23);
    public static final ck W = new ck(2, 24);
    public static final ck X = new ck(2, 25);
    public static final ck Y = new ck(2, 26);
    public static final ck Z = new ck(2, 27);
    public static final ck a0 = new ck(2, 28);
    public static final ck b0 = new ck(2, 29);
    public static final ck y = new ck(2, 0);
    public static final ck z = new ck(2, 1);
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck(int i, int i2) {
        super(i);
        this.x = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.x;
        boolean z2 = false;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                long j = ((we3) obj).a;
                long j2 = ((we3) obj2).a;
                Map map = l78.a;
                return kl8.M(0.0f, 400.0f, new we3(4294967297L), 1);
            case 1:
                a52 a52 = (a52) obj2;
                if (((a52) obj) == a52 && a52 == a52.y) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                String str = (String) obj;
                kl4 kl4 = (kl4) obj2;
                if (str.length() == 0) {
                    return kl4.toString();
                }
                return str + ", " + kl4;
            case 3:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (!yt2.V(intValue & 1, z2)) {
                    yt2.Y();
                }
                return vs7;
            case 4:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (!yt22.V(intValue2 & 1, z2)) {
                    yt22.Y();
                }
                return vs7;
            case 5:
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (!yt23.V(intValue3 & 1, z2)) {
                    yt23.Y();
                }
                return vs7;
            case 6:
                yt2 yt24 = (yt2) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                if (!yt24.V(intValue4 & 1, z2)) {
                    yt24.Y();
                }
                return vs7;
            case 7:
                ((Number) obj2).intValue();
                ((uy3) ((ux0) obj)).getClass();
                return vs7;
            case 8:
                ((uy3) ((ux0) obj)).g0((lh4) obj2);
                return vs7;
            case 9:
                ((uy3) ((ux0) obj)).h0((ml4) obj2);
                return vs7;
            case 10:
                ty0 ty0 = (ty0) obj2;
                uy3 uy3 = (uy3) ((ux0) obj);
                uy3.W = ty0;
                o00 o00 = uy3.a0;
                t37 t37 = xy0.h;
                vf5 vf5 = (vf5) ty0;
                vf5.getClass();
                uy3.d0((tp1) rc9.G0(vf5, t37));
                vf5 vf52 = (vf5) ty0;
                ey3 ey3 = (ey3) rc9.G0(vf52, xy0.n);
                if (uy3.U != ey3) {
                    uy3.U = ey3;
                    uy3.G();
                    uy3 v = uy3.v();
                    if (v != null) {
                        v.D();
                    } else {
                        p95 p95 = uy3.J;
                        if (p95 != null) {
                            ((je) p95).invalidate();
                        }
                    }
                    uy3.E();
                    for (ll4 ll4 = (ll4) o00.g; ll4 != null; ll4 = ll4.B) {
                        ll4.R();
                    }
                }
                uy3.i0((g58) rc9.G0(vf52, xy0.u));
                ll4 ll42 = (ll4) o00.g;
                if ((ll42.z & 32768) != 0) {
                    while (ll42 != null) {
                        if ((ll42.y & 32768) != 0) {
                            ll4 ll43 = ll42;
                            eq4 eq4 = null;
                            while (ll43 != null) {
                                if (ll43 instanceof ry0) {
                                    ll4 ll44 = ((ll4) ((ry0) ll43)).w;
                                    if (ll44.J) {
                                        yz4.c(ll44);
                                    } else {
                                        ll44.F = true;
                                    }
                                } else if ((ll43.y & 32768) != 0 && (ll43 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll45 = ((wo1) ll43).L; ll45 != null; ll45 = ll45.B) {
                                        if ((ll45.y & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll43 = ll45;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll43 != null) {
                                                    eq4.b(ll43);
                                                    ll43 = null;
                                                }
                                                eq4.b(ll45);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll43 = rc9.j(eq4);
                            }
                        }
                        if ((ll42.z & 32768) != 0) {
                            ll42 = ll42.B;
                        }
                    }
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = a42.w;
                }
                return dt0.M0(collection, list);
            case 12:
                cf cfVar = (cf) obj2;
                return (cf) obj;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 14:
                r51 r51 = (r51) obj2;
                return (r51) obj;
            case h75.g /*15*/:
                ag agVar = (ag) obj2;
                return (ag) obj;
            case 16:
                vs7 vs72 = (vs7) obj2;
                return (vs7) obj;
            case 17:
                vs7 vs73 = (vs7) obj2;
                return (vs7) obj;
            case 18:
                vs7 vs74 = (vs7) obj;
                vs7 vs75 = (vs7) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 19:
                vs7 vs76 = (vs7) obj;
                vs7 vs77 = (vs7) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 20:
                vs7 vs78 = (vs7) obj2;
                return (vs7) obj;
            case 21:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 22:
                s86 s86 = (s86) obj;
                int i3 = ((s86) obj2).a;
                return s86;
            case 23:
                pq6 pq6 = (pq6) obj2;
                return (pq6) obj;
            case 24:
                String str4 = (String) obj2;
                return (String) obj;
            case 25:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 26:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 27:
                String str5 = (String) obj2;
                return (String) obj;
            case 28:
                if (!(obj == null && obj2 == null)) {
                    ku4.a();
                }
                return null;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
