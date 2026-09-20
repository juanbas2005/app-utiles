package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: l2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class l2 extends AbstractList implements List, cr3 {
    public abstract int f();

    public abstract Object g(int i);

    public final /* bridge */ Object remove(int i) {
        return g(i);
    }

    public final /* bridge */ int size() {
        return f();
    }
}
