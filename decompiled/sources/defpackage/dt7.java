package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: dt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dt7 extends AbstractList implements RandomAccess, f44 {
    public final c44 w;

    public dt7(c44 c44) {
        this.w = c44;
    }

    public final List b() {
        return Collections.unmodifiableList(this.w.w);
    }

    public final Object get(int i) {
        return (String) this.w.get(i);
    }

    public final Iterator iterator() {
        ct7 ct7 = new ct7(0);
        ct7.x = this.w.iterator();
        return ct7;
    }

    public final ListIterator listIterator(int i) {
        bt7 bt7 = new bt7(0);
        bt7.x = this.w.listIterator(i);
        return bt7;
    }

    public final bg0 q(int i) {
        return this.w.q(i);
    }

    public final void r(b94 b94) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.w.size();
    }

    public final dt7 c() {
        return this;
    }
}
