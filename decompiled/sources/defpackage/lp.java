package defpackage;

/* renamed from: lp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lp extends qp2 {
    public final /* synthetic */ sp F;
    public final /* synthetic */ vp G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lp(vp vpVar, vp vpVar2, sp spVar) {
        super(vpVar2);
        this.G = vpVar;
        this.F = spVar;
    }

    public final qs6 b() {
        return this.F;
    }

    public final boolean c() {
        vp vpVar = this.G;
        if (vpVar.getInternalPopup().b()) {
            return true;
        }
        vpVar.B.o(vpVar.getTextDirection(), vpVar.getTextAlignment());
        return true;
    }
}
