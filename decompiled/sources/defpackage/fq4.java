package defpackage;

import java.util.List;

/* renamed from: fq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fq4 {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(List list, int i, int i2) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(pb4.k("Index ", i, " is out of bounds. The list has ", i2, " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(pb4.i(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException(pb4.k("toIndex (", i, ") is more than than the list size (", i2, ")"));
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(pb4.k("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
    }
}
