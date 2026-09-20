package defpackage;

/* renamed from: d94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d94 extends e94 implements q54 {
    public final t54 A;
    public final /* synthetic */ bp4 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d94(bp4 bp4, t54 t54, g35 g35) {
        super(bp4, g35);
        this.B = bp4;
        this.A = t54;
    }

    public final void c() {
        this.A.k().M0(this);
    }

    public final boolean d(t54 t54) {
        if (this.A == t54) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.A.k().G0().compareTo(k54.z) >= 0) {
            return true;
        }
        return false;
    }

    public final void o(t54 t54, j54 j54) {
        t54 t542 = this.A;
        k54 G0 = t542.k().G0();
        if (G0 == k54.w) {
            this.B.h(this.w);
            return;
        }
        k54 k54 = null;
        while (k54 != G0) {
            b(e());
            k54 = G0;
            G0 = t542.k().G0();
        }
    }
}
