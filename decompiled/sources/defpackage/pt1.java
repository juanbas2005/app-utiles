package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pt1 {
    public static final /* synthetic */ yr3[] j;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final fb4 d;
    public final fb4 e;
    public final m70 f;
    public final ib4 g;
    public final ib4 h;
    public final /* synthetic */ qt1 i;

    static {
        Class<pt1> cls = pt1.class;
        j = new yr3[]{new gr5(cls, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new gr5(cls, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    }

    /* JADX WARNING: type inference failed for: r5v30, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r5v32, types: [ib4, hb4] */
    public pt1(qt1 qt1, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.i = qt1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            uq4 P = t49.P((vq4) qt1.b.b, ((js5) ((k2) next)).B);
            Object obj = linkedHashMap.get(P);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(P, obj);
            }
            ((List) obj).add(next);
        }
        this.a = a(linkedHashMap);
        qt1 qt12 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next2 : list2) {
            uq4 P2 = t49.P((vq4) qt12.b.b, ((qs5) ((k2) next2)).B);
            Object obj2 = linkedHashMap2.get(P2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(P2, obj2);
            }
            ((List) obj2).add(next2);
        }
        this.b = a(linkedHashMap2);
        ((ws1) this.i.b.a).c.getClass();
        qt1 qt13 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object next3 : list3) {
            uq4 P3 = t49.P((vq4) qt13.b.b, ((dt5) ((k2) next3)).A);
            Object obj3 = linkedHashMap3.get(P3);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap3.put(P3, obj3);
            }
            ((List) obj3).add(next3);
        }
        this.c = a(linkedHashMap3);
        this.d = ((ws1) this.i.b.a).a.b(new nt1(this, 0));
        this.e = ((ws1) this.i.b.a).a.b(new nt1(this, 1));
        this.f = ((ws1) this.i.b.a).a.c(new nt1(this, 2));
        qt1 qt14 = this.i;
        kb4 kb4 = ((ws1) qt14.b.a).a;
        ot1 ot1 = new ot1(this, qt14, 0);
        kb4.getClass();
        this.g = new hb4(kb4, ot1);
        qt1 qt15 = this.i;
        kb4 kb42 = ((ws1) qt15.b.a).a;
        ot1 ot12 = new ot1(this, qt15, 1);
        kb42.getClass();
        this.h = new hb4(kb42, ot12);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<k2> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
            for (k2 k2Var : iterable) {
                int c2 = k2Var.c();
                int p = xs0.p(c2) + c2;
                if (p > 4096) {
                    p = 4096;
                }
                xs0 G = xs0.G(byteArrayOutputStream, p);
                G.f0(c2);
                k2Var.f(G);
                G.R();
                arrayList.add(vs7.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
