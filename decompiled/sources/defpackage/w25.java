package defpackage;

import java.util.List;

/* renamed from: w25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w25 {
    public static final Object[] a = new Object[0];
    public static final lp4 b = new lp4(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            h.l(pb4.k("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            h.q(pb4.k("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
        } else if (i < 0) {
            h.l(pb4.i(i, "fromIndex (", ") is less than 0."));
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }
}
