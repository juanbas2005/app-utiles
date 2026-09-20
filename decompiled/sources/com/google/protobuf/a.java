package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a {
    protected int memoizedHashCode;

    public static void g(Iterable iterable, List list) {
        Charset charset = rf3.a;
        iterable.getClass();
        if (iterable instanceof e44) {
            List b = ((e44) iterable).b();
            e44 e44 = (e44) list;
            int size = list.size();
            for (Object next : b) {
                if (next == null) {
                    String str = "Element at index " + (e44.size() - size) + " is null.";
                    for (int size2 = e44.size() - 1; size2 >= size; size2--) {
                        e44.remove(size2);
                    }
                    ku4.j(str);
                    return;
                } else if (next instanceof yf0) {
                    e44.e((yf0) next);
                } else {
                    e44.add((String) next);
                }
            }
        } else if (iterable instanceof fe3) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    ku4.j(str2);
                    return;
                }
                list.add(next2);
            }
        }
    }

    public abstract int h(og6 og6);

    public abstract void i(vs0 vs0);
}
