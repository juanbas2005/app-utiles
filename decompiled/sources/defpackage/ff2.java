package defpackage;

/* renamed from: ff2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ff2 extends pf5 {
    public final ku2 b;

    public ff2(ku2 ku2) {
        this.b = ku2;
    }

    public final boolean a() {
        ku2 ku2 = this.b;
        if (!ku2.B()) {
            return false;
        }
        if (ku2.x() > 0 || ku2.w() > 0) {
            return true;
        }
        if (!ku2.A() || !ku2.z().w()) {
            return false;
        }
        return true;
    }
}
