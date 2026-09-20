package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: iz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iz0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(au auVar, sr2 sr2) {
        auVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(auVar);
        if (obj != null) {
            return obj;
        }
        Object b = sr2.b();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(auVar, b);
        if (putIfAbsent != null) {
            b = putIfAbsent;
        }
        b.getClass();
        return b;
    }

    public final Object b(au auVar) {
        auVar.getClass();
        Object obj = c().get(auVar);
        if (obj != null) {
            return obj;
        }
        ku4.t("No instance for key ", auVar);
        return null;
    }

    public final Map c() {
        return this.a;
    }

    public final Object d(au auVar) {
        auVar.getClass();
        return c().get(auVar);
    }

    public final void e(au auVar, Object obj) {
        auVar.getClass();
        obj.getClass();
        c().put(auVar, obj);
    }
}
