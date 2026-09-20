package defpackage;

import java.util.Set;

/* renamed from: tv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface tv0 {
    Object a(Class cls) {
        return s(av5.a(cls));
    }

    Set d(av5 av5) {
        return (Set) n(av5).get();
    }

    nu5 h(Class cls) {
        return r(av5.a(cls));
    }

    nu5 n(av5 av5);

    s75 q(av5 av5);

    nu5 r(av5 av5);

    Object s(av5 av5) {
        nu5 r = r(av5);
        if (r == null) {
            return null;
        }
        return r.get();
    }
}
