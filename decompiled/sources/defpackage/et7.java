package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: et7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class et7 extends AbstractList implements e44, RandomAccess {
    public final d44 w;

    public et7(d44 d44) {
        this.w = d44;
    }

    public final List b() {
        return Collections.unmodifiableList(this.w.x);
    }

    public final void e(yf0 yf0) {
        throw new UnsupportedOperationException();
    }

    public final Object get(int i) {
        return (String) this.w.get(i);
    }

    public final Iterator iterator() {
        ct7 ct7 = new ct7(1);
        ct7.x = this.w.iterator();
        return ct7;
    }

    public final ListIterator listIterator(int i) {
        bt7 bt7 = new bt7(1);
        bt7.x = this.w.listIterator(i);
        return bt7;
    }

    public final int size() {
        return this.w.x.size();
    }

    public final Object u(int i) {
        return this.w.x.get(i);
    }

    public final e44 c() {
        return this;
    }
}
