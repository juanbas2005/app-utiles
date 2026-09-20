package defpackage;

/* renamed from: ue4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue4 implements wj4 {
    public wj4[] a;

    public final dw5 a(Class cls) {
        for (wj4 wj4 : this.a) {
            if (wj4.b(cls)) {
                return wj4.a(cls);
            }
        }
        kj6.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public final boolean b(Class cls) {
        for (wj4 b : this.a) {
            if (b.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
