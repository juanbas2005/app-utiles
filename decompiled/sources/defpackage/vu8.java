package defpackage;

import java.util.Iterator;

/* renamed from: vu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vu8 extends rt8 {
    public final transient Object C;

    public vu8(Object obj) {
        super(2);
        this.C = obj;
    }

    public final boolean contains(Object obj) {
        return this.C.equals(obj);
    }

    public final int d(Object[] objArr) {
        objArr[0] = this.C;
        return 1;
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zt8(this.C);
    }

    public final at7 n() {
        return new zt8(this.C);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return f21.h("[", this.C.toString(), "]");
    }

    public final mt8 v() {
        Object[] objArr = {this.C};
        int i = 0;
        while (i < 1) {
            vs8 vs8 = mt8.A;
            if (objArr[i] != null) {
                i++;
            } else {
                ku4.j(hl6.k(i, "at index "));
                return null;
            }
        }
        return mt8.x(1, objArr);
    }
}
