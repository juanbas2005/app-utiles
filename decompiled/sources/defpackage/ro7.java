package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ro7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ro7 implements Iterable, ar3 {
    public static final kg5 x = new kg5(24);
    public static final ro7 y = new ro7(a42.w);
    public final is w = t32.w;

    /* JADX WARNING: type inference failed for: r5v0, types: [ls, java.lang.Object, is] */
    public ro7(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            um umVar = (um) it.next();
            umVar.getClass();
            String l = b26.a.b(um.class).l();
            l.getClass();
            int v = x.v(l);
            int f = this.w.f();
            if (f != 0) {
                if (f == 1) {
                    is isVar = this.w;
                    try {
                        isVar.getClass();
                        p55 p55 = (p55) isVar;
                        int i = p55.x;
                        if (i == v) {
                            this.w = new p55(v, umVar);
                        } else {
                            ? obj = new Object();
                            obj.w = new Object[20];
                            obj.x = 0;
                            obj.g(i, p55.w);
                            this.w = obj;
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException(f(isVar, 1, "OneElementArrayMap"), e);
                    }
                }
                this.w.g(v, umVar);
            } else {
                is isVar2 = this.w;
                if (isVar2 instanceof t32) {
                    this.w = new p55(v, umVar);
                } else {
                    h.s(f(isVar2, 0, "EmptyArrayMap"));
                    throw null;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static String f(is isVar, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append(10);
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(isVar.getClass());
        sb.append(sb2.toString());
        sb.append(10);
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) x.x;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(et0.e0(isVar, 10));
        int i2 = 0;
        for (Object next : isVar) {
            int i3 = i2 + 1;
            Map.Entry entry = null;
            if (i2 >= 0) {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    if (((Number) next2.getValue()).intValue() == i2) {
                        entry = next2;
                        break;
                    }
                }
                sb3.append("  " + entry + '[' + i2 + "]: " + next);
                sb3.append(10);
                arrayList.add(sb3);
                i2 = i3;
            } else {
                sg3.Z();
                throw null;
            }
        }
        sb3.append("]");
        sb3.append(10);
        sb.append("Content: ".concat(sb3.toString()));
        sb.append(10);
        return sb.toString();
    }

    public final boolean isEmpty() {
        if (this.w.f() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.w.iterator();
    }
}
