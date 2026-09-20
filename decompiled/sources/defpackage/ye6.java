package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ye6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ye6 {
    public final LinkedHashMap a;
    public final o9 b;

    public ye6() {
        this.a = new LinkedHashMap();
        this.b = new o9((Map) b42.w);
    }

    public final Object a(String str) {
        str.getClass();
        o9 o9Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) o9Var.x;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) o9Var.A;
        try {
            d37 d37 = (d37) linkedHashMap2.get(str);
            if (d37 != null) {
                Object value = d37.getValue();
                if (value != null) {
                    return value;
                }
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) o9Var.z).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void b(String str, Object obj) {
        bp4 bp4;
        if (obj != null) {
            ArrayList arrayList = af6.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            ku4.w(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        ArrayList arrayList2 = af6.a;
        Object obj2 = this.a.get(str);
        if (obj2 instanceof bp4) {
            bp4 = (bp4) obj2;
        } else {
            bp4 = null;
        }
        if (bp4 != null) {
            bp4.i(obj);
        }
        this.b.L(str, obj);
    }

    public ye6(ze4 ze4) {
        this.a = new LinkedHashMap();
        this.b = new o9((Map) ze4);
    }
}
