package defpackage;

/* renamed from: ve4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ve4 implements xj4 {
    public xj4[] a;

    public final ew5 a(Class cls) {
        for (xj4 xj4 : this.a) {
            if (xj4.b(cls)) {
                return xj4.a(cls);
            }
        }
        kj6.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public final boolean b(Class cls) {
        for (xj4 b : this.a) {
            if (b.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
