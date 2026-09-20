package defpackage;

/* renamed from: ju5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ju5 {
    public final hu5 a;
    public final boolean b;
    public final ux6 c;
    public final vr2 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public ju5(hu5 hu5, Object obj, boolean z, ux6 ux6, vr2 vr2, boolean z2) {
        this.a = hu5;
        this.b = z;
        this.c = ux6;
        this.d = vr2;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        ey0.b("Unexpected form of a provided value");
        ta1.e();
        return null;
    }
}
