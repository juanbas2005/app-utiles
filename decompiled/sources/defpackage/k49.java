package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: k49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k49 extends vp8 {
    public final cf4 x;

    public k49(cf4 cf4) {
        this.x = cf4;
    }

    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        int hashCode = str.hashCode();
        Object obj = null;
        cf4 cf4 = this.x;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    ya5.x("getEventName", 0, arrayList);
                    return new mq8(((wi8) cf4.y).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    ya5.x("getTimestamp", 0, arrayList);
                    return new wn8(Double.valueOf((double) ((wi8) cf4.y).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    ya5.x("getParamValue", 1, arrayList);
                    String g = ((k68) no7.y).r(no7, (bq8) arrayList.get(0)).g();
                    HashMap hashMap = ((wi8) cf4.y).c;
                    if (hashMap.containsKey(g)) {
                        obj = hashMap.get(g);
                    }
                    return ub5.v(obj);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    ya5.x("getParams", 0, arrayList);
                    HashMap hashMap2 = ((wi8) cf4.y).c;
                    vp8 vp8 = new vp8();
                    for (String str2 : hashMap2.keySet()) {
                        vp8.o(str2, ub5.v(hashMap2.get(str2)));
                    }
                    return vp8;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    ya5.x("setParamValue", 2, arrayList);
                    String g2 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0)).g();
                    bq8 r = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                    Object F = ya5.F(r);
                    HashMap hashMap3 = ((wi8) cf4.y).c;
                    if (F == null) {
                        hashMap3.remove(g2);
                        return r;
                    }
                    hashMap3.put(g2, wi8.b(hashMap3.get(g2), F, g2));
                    return r;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    ya5.x("setEventName", 1, arrayList);
                    bq8 r2 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                    if (bq8.o.equals(r2) || bq8.p.equals(r2)) {
                        h.q("Illegal event name");
                        return null;
                    }
                    ((wi8) cf4.y).a = r2.g();
                    return new mq8(r2.g());
                }
                break;
        }
        return super.k(str, no7, arrayList);
    }
}
