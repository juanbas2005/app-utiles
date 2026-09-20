package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rm3 {
    public static final xb4 a = new xb4(26);

    public static final int a(ll6 ll6, pl3 pl3, String str) {
        Object obj;
        ll6.getClass();
        pl3.getClass();
        str.getClass();
        d(pl3, ll6);
        int d = ll6.d(str);
        if (d != -3 || !pl3.a.i) {
            return d;
        }
        f96 f96 = pl3.c;
        qm3 qm3 = new qm3(0, (Object) ll6, (Object) pl3);
        f96.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f96.x;
        Map map = (Map) concurrentHashMap.get(ll6);
        xb4 xb4 = a;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(xb4);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = qm3.b();
            Object obj3 = concurrentHashMap.get(ll6);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(ll6, obj3);
            }
            ((Map) obj3).put(xb4, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(ll6 ll6, pl3 pl3, String str, String str2) {
        ll6.getClass();
        pl3.getClass();
        str.getClass();
        int a2 = a(ll6, pl3, str);
        if (a2 != -3) {
            return a2;
        }
        String a3 = ll6.a();
        throw new IllegalArgumentException(a3 + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(pl3 pl3, ll6 ll6) {
        ll6.getClass();
        pl3.getClass();
        if (pl3.a.b) {
            return true;
        }
        List<Annotation> annotations = ll6.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        for (Annotation annotation : annotations) {
            if (annotation instanceof jm3) {
                return true;
            }
        }
        return false;
    }

    public static final void d(pl3 pl3, ll6 ll6) {
        ll6.getClass();
        pl3.getClass();
        sg3.e(ll6.u(), n57.l);
    }
}
