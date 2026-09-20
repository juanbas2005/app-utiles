package defpackage;

import java.util.List;

/* renamed from: ac2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ac2 extends dc2 {
    public final long b;
    public final long c;
    public final boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac2(List list, long j, long j2, boolean z) {
        super(list);
        list.getClass();
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final dc2 a(jk5 jk5) {
        n74 m = sg3.m();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m.add(((qc1) list.get(i)).e(jk5));
        }
        return new ac2(sg3.i(m), jb5.I(this.b, jk5), jb5.I(this.c, jk5), this.d);
    }

    public final String toString() {
        return "Corner: vertex=" + mh2.b(this.b) + ", center=" + mh2.b(this.c) + ", convex=" + this.d;
    }
}
