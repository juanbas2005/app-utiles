package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: zf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zf2 {
    public static final zf2 a = new Object();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static xf2 a(nn6 nn6) {
        Map map = b;
        map.getClass();
        Object obj = map.get(nn6);
        if (obj != null) {
            return (xf2) obj;
        }
        rf2.h(nn6, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object b(h61 h61) {
        yf2 yf2;
        int i;
        Object obj;
        Map map;
        Iterator it;
        nn6 nn6;
        Map map2;
        h91 h91;
        if (h61 instanceof yf2) {
            yf2 = (yf2) h61;
            int i2 = yf2.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yf2.G = i2 - Integer.MIN_VALUE;
                Object obj2 = yf2.E;
                i = yf2.G;
                if (i != 0) {
                    o85.q(obj2);
                    Map map3 = b;
                    map3.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(map3.size()));
                    it = map3.entrySet().iterator();
                    map2 = linkedHashMap;
                } else if (i == 1) {
                    obj = yf2.D;
                    map2 = yf2.C;
                    nn6 = yf2.B;
                    it = yf2.A;
                    map = yf2.z;
                    o85.q(obj2);
                    nn6.getClass();
                    h91 = a(nn6).b;
                    if (h91 == null) {
                        map2.put(obj, h91);
                        map2 = map;
                    }
                    rf2.h(nn6, " has not been registered.", "Subscriber ");
                    return null;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    obj = entry.getKey();
                    nn6 = (nn6) entry.getKey();
                    zh zhVar = new zh(16, (Object) (xf2) entry.getValue());
                    Map map4 = map2;
                    yf2.z = map4;
                    yf2.A = it;
                    yf2.B = nn6;
                    yf2.C = map4;
                    yf2.D = obj;
                    yf2.G = 1;
                    Object N = h49.N(zhVar, yf2);
                    p81 p81 = p81.w;
                    if (N == p81) {
                        return p81;
                    }
                    map = map2;
                    nn6.getClass();
                    h91 = a(nn6).b;
                    if (h91 == null) {
                        rf2.h(nn6, " has not been registered.", "Subscriber ");
                    }
                    rf2.h(nn6, " has not been registered.", "Subscriber ");
                    return null;
                    return p81;
                }
                return map2;
            }
        }
        yf2 = new yf2(this, h61);
        Object obj22 = yf2.E;
        i = yf2.G;
        if (i != 0) {
        }
        if (!it.hasNext()) {
            return map2;
        }
        return map2;
    }
}
