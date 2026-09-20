package defpackage;

import java.util.List;

/* renamed from: gk6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gk6 {
    public final ak6 a;
    public final zo4 b;

    public gk6(fk6 fk6, me3 me3) {
        this.a = fk6.d;
        List j = fk6.j(4, fk6);
        this.b = new zo4(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            fk6 fk62 = (fk6) j.get(i);
            if (me3.a(fk62.f)) {
                this.b.a(fk62.f);
            }
        }
    }
}
