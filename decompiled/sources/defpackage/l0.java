package defpackage;

/* renamed from: l0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l0 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ v0 x;

    public /* synthetic */ l0(v0 v0Var, int i) {
        this.w = i;
        this.x = v0Var;
    }

    public final Object b() {
        vo1 vo1;
        int i = this.w;
        v0 v0Var = this.x;
        switch (i) {
            case b85.b:
                oa3 oa3 = (oa3) h49.w(v0Var, la3.a);
                if (oa3 == null) {
                    bc3.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + oa3);
                }
                oa3 oa32 = v0Var.U;
                v0Var.U = oa3;
                if (oa32 != null && !sg3.e(oa3, oa32) && ((vo1 = v0Var.X) != null || !v0Var.e0)) {
                    if (vo1 != null) {
                        v0Var.W0(vo1);
                    }
                    v0Var.X = null;
                    v0Var.g1();
                }
                return vs7.a;
            default:
                v0Var.k1();
                return Boolean.TRUE;
        }
    }
}
