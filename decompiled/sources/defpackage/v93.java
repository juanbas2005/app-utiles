package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: v93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class v93 extends s93 implements NavigableSet, Iterable {
    public static final /* synthetic */ int B = 0;
    public transient v93 A;
    public final transient Comparator z;

    public v93(Comparator comparator) {
        this.z = comparator;
    }

    public final Comparator comparator() {
        return this.z;
    }

    public final NavigableSet descendingSet() {
        v93 v93 = this.A;
        if (v93 == null) {
            p36 p36 = (p36) this;
            Comparator reverseOrder = Collections.reverseOrder(p36.z);
            if (!p36.isEmpty()) {
                v93 = new p36(p36.C.x(), reverseOrder);
            } else if (er4.w != reverseOrder) {
                v93 = new p36(i36.A, reverseOrder);
            } else {
                v93 = p36.D;
            }
            this.A = v93;
            v93.A = this;
        }
        return v93;
    }

    public final NavigableSet headSet(Object obj, boolean z2) {
        obj.getClass();
        p36 p36 = (p36) this;
        return p36.x(0, p36.y(obj, z2));
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        p36 p36 = (p36) this;
        return p36.x(p36.z(obj, true), p36.C.size());
    }

    /* renamed from: w */
    public final p36 subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        boolean z4;
        obj.getClass();
        obj2.getClass();
        if (this.z.compare(obj, obj2) <= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        g75.h(z4);
        p36 p36 = (p36) this;
        p36 x = p36.x(p36.z(obj, z2), p36.C.size());
        return x.x(0, x.y(obj2, z3));
    }

    public final SortedSet headSet(Object obj) {
        obj.getClass();
        p36 p36 = (p36) this;
        return p36.x(0, p36.y(obj, false));
    }

    public final NavigableSet tailSet(Object obj, boolean z2) {
        obj.getClass();
        p36 p36 = (p36) this;
        return p36.x(p36.z(obj, z2), p36.C.size());
    }
}
