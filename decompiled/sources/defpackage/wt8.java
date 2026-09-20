package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: wt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wt8 extends rt8 implements NavigableSet, Iterable {
    public final transient Comparator C;
    public transient wt8 D;

    public wt8(Comparator comparator) {
        super(2);
        this.C = comparator;
    }

    public static qu8 z(Comparator comparator) {
        if (hu8.x == comparator) {
            return qu8.F;
        }
        vs8 vs8 = mt8.A;
        return new qu8(nu8.D, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Comparator comparator() {
        return this.C;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    public final SortedSet headSet(Object obj) {
        obj.getClass();
        qu8 qu8 = (qu8) this;
        return qu8.C(0, qu8.A(obj, false));
    }

    public abstract Object last();

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        qu8 qu8 = (qu8) this;
        return qu8.C(qu8.B(obj, true), qu8.E.size());
    }

    /* renamed from: x */
    public final wt8 descendingSet() {
        wt8 wt8 = this.D;
        if (wt8 == null) {
            qu8 qu8 = (qu8) this;
            Comparator reverseOrder = Collections.reverseOrder(qu8.C);
            if (qu8.isEmpty()) {
                wt8 = z(reverseOrder);
            } else {
                wt8 = new qu8(qu8.E.v(), reverseOrder);
            }
            this.D = wt8;
            wt8.D = this;
        }
        return wt8;
    }

    /* renamed from: y */
    public final qu8 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.C.compare(obj, obj2) <= 0) {
            qu8 qu8 = (qu8) this;
            qu8 C2 = qu8.C(qu8.B(obj, z), qu8.E.size());
            return C2.C(0, C2.A(obj2, z2));
        }
        ku4.v();
        return null;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        qu8 qu8 = (qu8) this;
        return qu8.C(0, qu8.A(obj, z));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        qu8 qu8 = (qu8) this;
        return qu8.C(qu8.B(obj, z), qu8.E.size());
    }
}
