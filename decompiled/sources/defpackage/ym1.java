package defpackage;

import io.ktor.http.Url;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ym1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ym1 extends a97 implements hs2 {
    public final /* synthetic */ int A = 1;
    public /* synthetic */ Object B;
    public /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym1(zm1 zm1, f61 f61) {
        super(3, f61);
        this.C = zm1;
    }

    public final Object s(Object obj) {
        Set set;
        boolean z;
        switch (this.A) {
            case b85.b:
                yg5 yg5 = (yg5) this.B;
                o85.q(obj);
                String yr7 = ((y53) yg5.w).a.toString();
                xm1 xm1 = new xm1();
                y53 y53 = (y53) yg5.w;
                dz2 dz2 = y53.c;
                dz2 dz22 = xm1.a;
                o55.b(dz22, dz2);
                Map map = (Map) dz22.w;
                gz2 d1 = dz22.d1();
                ((zm1) this.C).a.y(xm1);
                for (Map.Entry entry : d1.l()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    List v = dz22.v(str);
                    if (v == null) {
                        dz22.L(str, list);
                    } else if (!v.equals(list) && !str.equals("Cookie")) {
                        map.remove(str);
                        dz22.L(str, list);
                        List list2 = (List) map.get(str);
                        if (list2 != null) {
                            set = dt0.g1(list2);
                        } else {
                            set = g42.w;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object next : v) {
                            if (!set.contains((String) next)) {
                                arrayList.add(next);
                            }
                        }
                        dz22.L(str, arrayList);
                    }
                }
                Url b = xm1.b.b();
                td0 td0 = zm1.b;
                yr7 yr72 = y53.a;
                if (yr72.d == null) {
                    yr72.d = b.getProtocolOrNull();
                }
                if (yr72.a.length() <= 0) {
                    yr7 d = j45.d(b);
                    d.d = yr72.d;
                    int i = yr72.c;
                    if (i != 0) {
                        d.e(i);
                    }
                    List list3 = d.h;
                    List list4 = yr72.h;
                    if (!list4.isEmpty()) {
                        if (!list3.isEmpty() && ((CharSequence) dt0.w0(list4)).length() != 0) {
                            n74 n74 = new n74((list4.size() + list3.size()) - 1);
                            int size = list3.size() - 1;
                            for (int i2 = 0; i2 < size; i2++) {
                                n74.add(list3.get(i2));
                            }
                            n74.addAll(list4);
                            list3 = sg3.i(n74);
                        } else {
                            list3 = list4;
                        }
                    }
                    list3.getClass();
                    d.h = list3;
                    if (yr72.g.length() > 0) {
                        String str2 = yr72.g;
                        str2.getClass();
                        d.g = str2;
                    }
                    dz2 dz23 = new dz2(1);
                    o55.b(dz23, d.i);
                    wc5 wc5 = yr72.i;
                    wc5.getClass();
                    d.i = wc5;
                    d.j = new v70(wc5);
                    for (Map.Entry entry2 : dz23.l()) {
                        String str3 = (String) entry2.getKey();
                        List list5 = (List) entry2.getValue();
                        if (!d.i.contains(str3)) {
                            d.i.L(str3, list5);
                        }
                    }
                    j45.u(yr72, d);
                }
                iz0 iz0 = xm1.c;
                for (au auVar : dt0.b1(iz0.c().keySet())) {
                    iz0 iz02 = y53.f;
                    iz02.getClass();
                    auVar.getClass();
                    if (!iz02.c().containsKey(auVar)) {
                        y53.f.e(auVar, iz0.b(auVar));
                    }
                }
                y53.c.clear();
                y53.c.y0(dz22.d1());
                cc4 cc4 = an1.a;
                StringBuilder q = b81.q("Applied DefaultRequest to ", yr7, ". New url: ");
                q.append(y53.a);
                cc4.h(q.toString());
                return vs7.a;
            default:
                o85.q(obj);
                zr6 zr6 = (zr6) this.B;
                pp4 pp4 = (pp4) this.C;
                Iterable<in5> keySet = pp4.a().keySet();
                ArrayList arrayList2 = new ArrayList(et0.e0(keySet, 10));
                for (in5 in5 : keySet) {
                    arrayList2.add(in5.a);
                }
                Map<String, ?> all = zr6.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry next2 : all.entrySet()) {
                    String str4 = (String) next2.getKey();
                    Set set2 = zr6.b;
                    if (set2 != null) {
                        z = set2.contains(str4);
                    } else {
                        z = true;
                    }
                    if (z) {
                        linkedHashMap.put(next2.getKey(), next2.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    Object key = entry3.getKey();
                    Object value = entry3.getValue();
                    if (value instanceof Set) {
                        value = dt0.g1((Iterable) value);
                    }
                    linkedHashMap2.put(key, value);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                    if (!arrayList2.contains((String) entry4.getKey())) {
                        linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                    }
                }
                pp4 pp42 = new pp4(new LinkedHashMap(pp4.a()), false);
                for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                    String str5 = (String) entry5.getKey();
                    Object value2 = entry5.getValue();
                    if (value2 instanceof Boolean) {
                        str5.getClass();
                        pp42.d(new in5(str5), value2);
                    } else if (value2 instanceof Float) {
                        str5.getClass();
                        pp42.d(new in5(str5), value2);
                    } else if (value2 instanceof Integer) {
                        str5.getClass();
                        pp42.d(new in5(str5), value2);
                    } else if (value2 instanceof Long) {
                        str5.getClass();
                        pp42.d(new in5(str5), value2);
                    } else if (value2 instanceof String) {
                        str5.getClass();
                        pp42.d(new in5(str5), value2);
                    } else if (value2 instanceof Set) {
                        str5.getClass();
                        pp42.d(new in5(str5), (Set) value2);
                    }
                }
                return new pp4(new LinkedHashMap(pp42.a()), true);
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ym1 ym1 = new ym1((zm1) this.C, (f61) obj3);
                ym1.B = (yg5) obj;
                ym1.s(vs7);
                return vs7;
            default:
                ym1 ym12 = new ym1(3, (f61) obj3);
                ym12.B = (zr6) obj;
                ym12.C = (pp4) obj2;
                return ym12.s(vs7);
        }
    }

    public /* synthetic */ ym1(int i, f61 f61) {
        super(i, f61);
    }
}
