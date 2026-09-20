package defpackage;

import java.util.Set;

/* renamed from: dn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dn7 implements cn7 {
    public final Set a;
    public final u10 b;
    public final in7 c;

    public dn7(Set set, u10 u10, in7 in7) {
        this.a = set;
        this.b = u10;
        this.c = in7;
    }

    public final o9 a(String str, m42 m42, ul7 ul7) {
        Set set = this.a;
        if (set.contains(m42)) {
            return new o9(this.b, str, m42, ul7, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{m42, set}));
    }
}
