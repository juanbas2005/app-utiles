package defpackage;

/* renamed from: z59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z59 extends xq8 {
    public final /* synthetic */ int e;
    public final /* synthetic */ r69 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z59(r69 r69, y19 y19, int i) {
        super(y19);
        this.e = i;
        this.f = r69;
    }

    public final void a() {
        int i = this.e;
        r69 r69 = this.f;
        switch (i) {
            case b85.b:
                r69.b1();
                if (r69.t1()) {
                    pz8 pz8 = ((y19) r69.w).B;
                    y19.g(pz8);
                    pz8.J.a("Inactivity, disconnecting from the service");
                    r69.k1();
                    return;
                }
                return;
            default:
                pz8 pz82 = ((y19) r69.w).B;
                y19.g(pz82);
                pz82.E.a("Tasks have been queued for a long time");
                return;
        }
    }
}
