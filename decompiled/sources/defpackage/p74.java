package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: p74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p74 extends r74 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public final void a(long j, Object obj) {
        Object obj2;
        List list = (List) st7.c.i(j, obj);
        if (list instanceof e44) {
            obj2 = ((e44) list).c();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof fe3) || !(list instanceof pf3)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                r2 r2Var = (r2) ((pf3) list);
                boolean z = r2Var.w;
                if (z && z) {
                    r2Var.w = false;
                    return;
                }
                return;
            }
        } else {
            return;
        }
        st7.o(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: d44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: d44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: d44} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void b(Object obj, long j, Object obj2) {
        List list;
        qt7 qt7 = st7.c;
        List list2 = (List) qt7.i(j, obj2);
        int size = list2.size();
        List list3 = (List) qt7.i(j, obj);
        if (list3.isEmpty()) {
            if (list3 instanceof e44) {
                list3 = new d44(size);
            } else if (!(list3 instanceof fe3) || !(list3 instanceof pf3)) {
                list3 = new ArrayList(size);
            } else {
                list3 = ((pf3) list3).j(size);
            }
            st7.o(obj, j, list3);
        } else {
            if (c.isAssignableFrom(list3.getClass())) {
                ArrayList arrayList = new ArrayList(list3.size() + size);
                arrayList.addAll(list3);
                st7.o(obj, j, arrayList);
                list = arrayList;
            } else if (list3 instanceof et7) {
                et7 et7 = (et7) list3;
                d44 d44 = new d44(et7.size() + size);
                d44.addAll(et7);
                st7.o(obj, j, d44);
                list = d44;
            } else if ((list3 instanceof fe3) && (list3 instanceof pf3)) {
                pf3 pf3 = (pf3) list3;
                if (!((r2) pf3).w) {
                    list3 = pf3.j(list3.size() + size);
                    st7.o(obj, j, list3);
                }
            }
            list3 = list;
        }
        int size2 = list3.size();
        int size3 = list2.size();
        if (size2 > 0 && size3 > 0) {
            list3.addAll(list2);
        }
        if (size2 > 0) {
            list2 = list3;
        }
        st7.o(obj, j, list2);
    }
}
