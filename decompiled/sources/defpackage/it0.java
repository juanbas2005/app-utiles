package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: it0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class it0 extends ht0 {
    public static void h0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static void i0(List list, vr2 vr2) {
        int size;
        list.getClass();
        vr2.getClass();
        if (list instanceof RandomAccess) {
            int size2 = list.size() - 1;
            int i = 0;
            if (size2 >= 0) {
                int i2 = 0;
                while (true) {
                    Object obj = list.get(i);
                    if (!((Boolean) vr2.y(obj)).booleanValue()) {
                        if (i2 != i) {
                            list.set(i2, obj);
                        }
                        i2++;
                    }
                    if (i == size2) {
                        break;
                    }
                    i++;
                }
                i = i2;
            }
            if (i < list.size() && i <= (size = list.size() - 1)) {
                while (true) {
                    list.remove(size);
                    if (size != i) {
                        size--;
                    } else {
                        return;
                    }
                }
            }
        } else if (!(list instanceof ar3) || (list instanceof br3)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) vr2.y(it.next())).booleanValue()) {
                    it.remove();
                }
            }
        } else {
            mp7.l0("kotlin.collections.MutableIterable", list);
            throw null;
        }
    }

    public static Object j0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        kj6.i("List is empty.");
        return null;
    }

    public static Object k0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        kj6.i("List is empty.");
        return null;
    }

    public static Object l0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
