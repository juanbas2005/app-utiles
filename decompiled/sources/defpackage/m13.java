package defpackage;

import cu.lestebang.utiletecsa.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: m13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m13 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ m13(sl5 sl5, fw0 fw0, ek7 ek7, fw0 fw02, int i) {
        this.w = 1;
        this.y = sl5;
        this.z = fw0;
        this.A = ek7;
        this.B = fw02;
        this.x = i;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        float f;
        boolean z4;
        float f2;
        int i = this.w;
        Object obj3 = this.z;
        Object obj4 = this.B;
        Object obj5 = this.A;
        vs7 vs7 = vs7.a;
        int i2 = this.x;
        Object obj6 = this.y;
        switch (i) {
            case b85.b:
                ArrayList arrayList = (ArrayList) obj6;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                List list = (List) obj5;
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) obj4;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                h80 h80 = xb4.H;
                g80 g80 = xb4.K;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    au0 a = zt0.a(wr.c, g80, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    jl4 jl4 = jl4.w;
                    ml4 E = gw8.E(yt2, jl4);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt2, a);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt2, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt2, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt2, ceVar);
                    List<c92> list2 = list;
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt2, E);
                    sd2 sd2 = yu6.a;
                    vs7 vs72 = vs7;
                    rr rrVar = wr.a;
                    g80 g802 = g80;
                    jl4 jl42 = jl4;
                    ea6 a2 = ca6.a(rrVar, h80, yt2, 0);
                    ce ceVar2 = ceVar;
                    int hashCode2 = Long.hashCode(yt2.T);
                    vf5 m2 = yt2.m();
                    ml4 E2 = gw8.E(yt2, sd2);
                    yt2.i0();
                    SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(ckVar, yt2, a2);
                    g75.Q(ckVar2, yt2, m2);
                    f21.s(hashCode2, yt2, ckVar3, yt2, ceVar2);
                    g75.Q(ckVar4, yt2, E2);
                    yt2.e0(25545756);
                    for (String b : sg3.E("D", "L", "M", "X", "J", "V", "S")) {
                        yt2 yt22 = yt2;
                        g80 g803 = g802;
                        jl4 jl43 = jl42;
                        yf7.b(b, new lz3(1.0f, true), z08.e(), ya5.k(12), am2.B, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 261032);
                        yt2 = yt22;
                    }
                    g80 g804 = g802;
                    float f3 = 1.0f;
                    boolean z5 = false;
                    jl4 jl44 = jl42;
                    yt2.r(false);
                    yt2.r(true);
                    k75.a(yt2, yu6.d(jl44, 6.0f));
                    yt2.e0(2075728884);
                    Iterator it = dt0.p0(7, arrayList).iterator();
                    while (it.hasNext()) {
                        List<Number> list3 = (List) it.next();
                        sd2 sd22 = yu6.a;
                        ea6 a3 = ca6.a(rrVar, h80, yt2, z5 ? 1 : 0);
                        h80 h802 = h80;
                        int hashCode3 = Long.hashCode(yt2.T);
                        vf5 m3 = yt2.m();
                        ml4 E3 = gw8.E(yt2, sd22);
                        ux0.d.getClass();
                        vy0 vy02 = tx0.b;
                        yt2.i0();
                        if (yt2.S) {
                            yt2.l(vy02);
                        } else {
                            yt2.r0();
                        }
                        g75.Q(tx0.f, yt2, a3);
                        g75.Q(tx0.e, yt2, m3);
                        g75.Q(tx0.g, yt2, Integer.valueOf(hashCode3));
                        g75.O(yt2, tx0.h);
                        g75.Q(tx0.d, yt2, E3);
                        yt2.e0(-1783028395);
                        for (Number intValue2 : list3) {
                            int intValue3 = intValue2.intValue();
                            if (intValue3 == i2) {
                                z4 = true;
                            } else {
                                z4 = z5;
                            }
                            List list4 = (List) linkedHashMap.get(Integer.valueOf(intValue3));
                            if (list4 == null) {
                                list4 = a42.w;
                            }
                            String str = "invalid weight; must be greater than zero";
                            if (((double) f3) <= 0.0d) {
                                wb3.a(str);
                            }
                            boolean z6 = z4;
                            if (f3 > Float.MAX_VALUE) {
                                f2 = Float.MAX_VALUE;
                            } else {
                                f2 = f3;
                            }
                            t13.j(intValue3, z6, list4, new lz3(f2, true), yt2, 0);
                            f3 = 1.0f;
                        }
                        float f4 = f3;
                        String str2 = "invalid weight; must be greater than zero";
                        yt2.r(z5);
                        yt2.e0(-1783016630);
                        int size = 7 - list3.size();
                        int i3 = z5;
                        while (i3 < size) {
                            jl4 jl45 = jl44;
                            if (((double) f4) <= 0.0d) {
                                wb3.a(str2);
                            }
                            if (f4 > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            } else {
                                f = f4;
                            }
                            k75.a(yt2, new lz3(f, true));
                            i3++;
                            jl44 = jl45;
                            z5 = false;
                        }
                        yt2.r(z5);
                        yt2.r(true);
                        f3 = f4;
                        jl44 = jl44;
                        h80 = h802;
                    }
                    jl4 jl46 = jl44;
                    yt2.r(z5);
                    k75.a(yt2, yu6.d(jl44, 8.0f));
                    kl8.c((ml4) null, 0.0f, z08.h(), yt2, 0, 3);
                    k75.a(yt2, yu6.d(jl44, 6.0f));
                    au0 a4 = zt0.a(new ur(6.0f, true, new h(2)), g804, yt2, 6);
                    int hashCode4 = Long.hashCode(yt2.T);
                    vf5 m4 = yt2.m();
                    ml4 E4 = gw8.E(yt2, jl44);
                    ux0.d.getClass();
                    vy0 vy03 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy03);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, a4);
                    g75.Q(tx0.e, yt2, m4);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode4));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E4);
                    if (list2.isEmpty()) {
                        yt2.e0(-1206664329);
                        yt2 yt23 = yt2;
                        yf7.b(l55.u(R.string.calendar_empty, yt2), (ml4) null, z08.e(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 24576, 0, 262122);
                        yt2 = yt23;
                        yt2.r(false);
                        z3 = true;
                    } else {
                        yt2.e0(-1206407308);
                        for (c92 c92 : list2) {
                            long j = c92.c;
                            String str3 = c92.a;
                            String format = simpleDateFormat2.format(c92.b.getTime());
                            format.getClass();
                            t13.k(j, pb4.l(str3, " · ", d57.l1(format, '.')), yt2, 0);
                        }
                        z3 = true;
                        yt2.r(false);
                    }
                    yt2.r(z3);
                    yt2.r(z3);
                    return vs72;
                }
                vs7 vs73 = vs7;
                yt2.Y();
                return vs73;
            case 1:
                ((Integer) obj2).getClass();
                rc9.a((sl5) obj6, (fw0) obj3, (ek7) obj5, (fw0) obj4, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                ((fw0) obj6).l(this.z, this.A, this.B, (yt2) obj, b85.v(i2) | 1);
                return vs7;
            case 3:
                ((Integer) obj2).getClass();
                tf4.h((ArrayList) obj6, (List) obj5, (Set) obj3, (Set) obj4, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 4:
                ((Integer) obj2).getClass();
                h49.k((Boolean) obj6, this.z, (t54) obj5, (vr2) obj4, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 5:
                ((Integer) obj2).intValue();
                d36.n((Long) obj6, (vr2) obj3, (sr2) obj5, (sr2) obj4, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 6:
                ((Integer) obj2).intValue();
                dw6.a((String) obj6, (vr2) obj3, (sr2) obj5, (vr2) obj4, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            default:
                ((Integer) obj2).getClass();
                j45.a((sr2) obj6, (ru4) obj3, (ml4) obj5, (fk7) obj4, (yt2) obj, b85.v(i2 | 1));
                return vs7;
        }
    }

    public /* synthetic */ m13(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.w = i2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.x = i;
    }

    public /* synthetic */ m13(ArrayList arrayList, int i, LinkedHashMap linkedHashMap, List list, SimpleDateFormat simpleDateFormat) {
        this.w = 0;
        this.y = arrayList;
        this.x = i;
        this.z = linkedHashMap;
        this.A = list;
        this.B = simpleDateFormat;
    }

    public /* synthetic */ m13(ArrayList arrayList, List list, Set set, Set set2, int i) {
        this.w = 3;
        this.y = arrayList;
        this.A = list;
        this.z = set;
        this.B = set2;
        this.x = i;
    }
}
