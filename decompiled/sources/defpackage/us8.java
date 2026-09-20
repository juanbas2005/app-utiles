package defpackage;

import java.util.Iterator;

/* renamed from: us8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class us8 extends os8 {
    public final transient n36 B;
    public final transient it8 C;

    public us8(n36 n36, it8 it8) {
        super(1);
        this.B = n36;
        this.C = it8;
    }

    public final boolean contains(Object obj) {
        if (this.B.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.C.listIterator(0);
    }

    public final int o(Object[] objArr) {
        return this.C.o(objArr);
    }

    public final int size() {
        return this.B.z;
    }

    public final at7 v() {
        return this.C.listIterator(0);
    }
}
