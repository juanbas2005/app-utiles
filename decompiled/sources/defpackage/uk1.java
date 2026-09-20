package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: uk1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class uk1 implements hs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ uk1(String str, vr2 vr2, yg ygVar, String str2, String str3, aq4 aq4) {
        this.y = str;
        this.z = vr2;
        this.A = ygVar;
        this.B = str2;
        this.C = str3;
        this.x = aq4;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj4 = ay0.a;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.z;
        Object obj8 = this.y;
        switch (i) {
            case b85.b:
                vs7 vs72 = vs7;
                Set set = (Set) obj8;
                Set set2 = (Set) obj7;
                List list = (List) obj6;
                cu4 cu4 = (cu4) obj5;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    boolean i2 = yt2.i(set);
                    Object obj9 = this.A;
                    aq4 aq4 = this.x;
                    boolean i3 = i2 | yt2.i(obj9) | yt2.i(set2) | yt2.g(aq4);
                    Object Q = yt2.Q();
                    if (i3 || Q == obj4) {
                        qj qjVar = new qj((Object) set, obj9, (Object) set2, (Object) aq4, 3);
                        yt2.o0(qjVar);
                        Q = qjVar;
                    }
                    t49.e(obj9, (vr2) Q, yt2);
                    yt2.e0(358947325);
                    if (list instanceof RandomAccess) {
                        up4 up4 = new up4(list.size());
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Object obj10 = list.get(i4);
                            if (up4.a(obj10)) {
                                arrayList2.add(obj10);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = dt0.r0(list);
                    }
                    if (!arrayList.isEmpty()) {
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (listIterator.hasPrevious()) {
                            cu4 = new cu4(cu4, su0.J(-330823412, new gc5(8, (Object) (du4) listIterator.previous(), (Object) cu4), yt2));
                        }
                    }
                    yt2.r(false);
                    cu4.a(0, yt2);
                } else {
                    yt2.Y();
                }
                return vs72;
            default:
                String str = (String) obj8;
                vr2 vr2 = (vr2) obj7;
                yg ygVar = (yg) this.A;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xk) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(intValue2 & 1, z3)) {
                    au0 a = zt0.a(wr.c, xb4.K, yt22, 0);
                    int hashCode = Long.hashCode(yt22.T);
                    vf5 m = yt22.m();
                    jl4 jl4 = jl4.w;
                    ml4 E = gw8.E(yt22, jl4);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(tx0.f, yt22, a);
                    g75.Q(tx0.e, yt22, m);
                    g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                    g75.O(yt22, tx0.h);
                    g75.Q(tx0.d, yt22, E);
                    String u = l55.u(R.string.call_subtitle, yt22);
                    x83 G = r16.G();
                    jl4 jl42 = jl4;
                    long j = z08.j();
                    long i5 = z08.i();
                    gl7 gl7 = new gl7(b96.z());
                    boolean g = yt22.g(vr2);
                    vs7 vs73 = vs7;
                    Object Q2 = yt22.Q();
                    if (g || Q2 == obj4) {
                        Q2 = new zg1(11, vr2);
                        yt22.o0(Q2);
                    }
                    sr2 sr2 = (sr2) Q2;
                    boolean g2 = yt22.g(ygVar) | yt22.g(str);
                    Object Q3 = yt22.Q();
                    if (g2 || Q3 == obj4) {
                        Q3 = new i13(ygVar, str, 0);
                        yt22.o0(Q3);
                    }
                    yt2 yt23 = yt22;
                    t13.a(str, u, G, j, i5, gl7, sr2, (sr2) Q3, (sr2) null, yt23, 0, 256);
                    yt2 yt24 = yt23;
                    String j2 = pb4.j(jl42, 8.0f, yt24, R.string.asterisco_99_subtitle, yt24);
                    x83 x83 = tf4.l;
                    if (x83 == null) {
                        w83 w83 = new w83("Rounded.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i6 = e38.a;
                        ky6 ky6 = new ky6(jt0.b);
                        be5 e = pb4.e(12.0f, 2.0f);
                        e.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        e.l(4.48f, 10.0f, 10.0f, 10.0f);
                        e.l(10.0f, -4.48f, 10.0f, -10.0f);
                        e.k(17.52f, 2.0f, 12.0f, 2.0f);
                        e.c();
                        e.j(12.0f, 13.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        e.h(11.0f, 8.0f);
                        e.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        e.l(1.0f, 0.45f, 1.0f, 1.0f);
                        e.n(4.0f);
                        e.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        e.c();
                        e.j(13.0f, 17.0f);
                        e.g(-2.0f);
                        e.n(-2.0f);
                        e.g(2.0f);
                        e.n(2.0f);
                        e.c();
                        w83.a(w83, e.a, ky6, 14336);
                        x83 = w83.b();
                        tf4.l = x83;
                    }
                    x83 x832 = x83;
                    long l = z08.l(uq3.d(4292667899L), uq3.d(4279644750L));
                    long d = z08.d();
                    boolean g3 = yt24.g(vr2);
                    Object Q4 = yt24.Q();
                    if (g3 || Q4 == obj4) {
                        Q4 = new zg1(12, vr2);
                        yt24.o0(Q4);
                    }
                    sr2 sr22 = (sr2) Q4;
                    boolean g4 = yt24.g(ygVar) | yt24.g(str2);
                    Object Q5 = yt24.Q();
                    if (g4 || Q5 == obj4) {
                        Q5 = new i13(ygVar, str2, 1);
                        yt24.o0(Q5);
                    }
                    sr2 sr23 = (sr2) Q5;
                    Object Q6 = yt24.Q();
                    if (Q6 == obj4) {
                        Q6 = new vo2(this.x, 12);
                        yt24.o0(Q6);
                    }
                    t13.a(str2, j2, x832, l, d, el7.a, sr22, sr23, (sr2) Q6, yt24, 100859904, 0);
                    String j3 = pb4.j(jl42, 8.0f, yt24, R.string.anonymous_call_subtitle, yt24);
                    x83 B2 = g75.B();
                    long l2 = z08.l(uq3.d(4292994295L), uq3.d(4280625997L));
                    long l3 = z08.l(uq3.d(4284181447L), uq3.d(4288127976L));
                    gl7 gl72 = new gl7(b96.z());
                    boolean g5 = yt24.g(vr2);
                    Object Q7 = yt24.Q();
                    if (g5 || Q7 == obj4) {
                        Q7 = new zg1(13, vr2);
                        yt24.o0(Q7);
                    }
                    sr2 sr24 = (sr2) Q7;
                    boolean g6 = yt24.g(ygVar) | yt24.g(str3);
                    Object Q8 = yt24.Q();
                    if (g6 || Q8 == obj4) {
                        Q8 = new i13(ygVar, str3, 2);
                        yt24.o0(Q8);
                    }
                    t13.a(str3, j3, B2, l2, l3, gl72, sr24, (sr2) Q8, (sr2) null, yt24, 0, 256);
                    yt24.r(true);
                    return vs73;
                }
                vs7 vs74 = vs7;
                yt22.Y();
                return vs74;
        }
    }

    public /* synthetic */ uk1(Set set, Object obj, Set set2, aq4 aq4, List list, cu4 cu4) {
        this.y = set;
        this.A = obj;
        this.z = set2;
        this.x = aq4;
        this.B = list;
        this.C = cu4;
    }
}
