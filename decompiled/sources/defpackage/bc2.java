package defpackage;

import java.util.List;

/* renamed from: bc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc2 extends dc2 {
    public final dc2 a(jk5 jk5) {
        n74 m = sg3.m();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m.add(((qc1) list.get(i)).e(jk5));
        }
        n74 i2 = sg3.i(m);
        i2.getClass();
        return new dc2(i2);
    }

    public final String toString() {
        return "Edge";
    }
}
