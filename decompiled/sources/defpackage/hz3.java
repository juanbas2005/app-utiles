package defpackage;

/* renamed from: hz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hz3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz3 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hz3(iz3 iz3, Object obj, int i) {
        this.a = i;
        this.b = iz3;
        this.c = obj;
    }

    public az3 b() {
        iz3 iz3 = this.b;
        uy3 uy3 = (uy3) iz3.F.g(this.c);
        if (uy3 != null) {
            return (az3) iz3.B.g(uy3);
        }
        return null;
    }

    public final boolean c() {
        ze5 ze5;
        switch (this.a) {
            case b85.b:
                return true;
            default:
                az3 b2 = b();
                if (b2 == null || (ze5 = b2.f) == null) {
                    return true;
                }
                return ze5.c();
        }
    }

    private final void a() {
    }
}
