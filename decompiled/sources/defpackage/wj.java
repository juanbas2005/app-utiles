package defpackage;

/* renamed from: wj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wj extends wx3 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ fw0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int x = 0;
    public final /* synthetic */ ml4 y;
    public final /* synthetic */ vr2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj(cw1 cw1, ml4 ml4, vr2 vr2, jb jbVar, String str, vr2 vr22, fw0 fw0, int i) {
        super(2);
        this.E = cw1;
        this.y = ml4;
        this.z = vr2;
        this.A = jbVar;
        this.F = str;
        this.B = vr22;
        this.C = fw0;
        this.D = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.x;
        vs7 vs7 = vs7.a;
        int i2 = this.D;
        Object obj3 = this.F;
        Object obj4 = this.A;
        Object obj5 = this.B;
        Object obj6 = this.E;
        switch (i) {
            case b85.b:
                ((Number) obj2).intValue();
                String str = (String) obj3;
                vr2 vr2 = (vr2) obj5;
                int v = b85.v(i2 | 1);
                cw1 cw1 = (cw1) obj6;
                jb jbVar = (jb) obj4;
                fd1.b(cw1, this.y, this.z, jbVar, str, vr2, this.C, (yt2) obj, v);
                return vs7;
            case 1:
                ((Number) obj2).intValue();
                int v2 = b85.v(i2 | 1);
                ml4 ml4 = this.y;
                vr2 vr22 = this.z;
                ml4 ml42 = ml4;
                vr2 vr23 = vr22;
                fd1.d((mm7) obj6, ml42, vr23, (jb) obj4, (vr2) obj5, (vr2) obj3, this.C, (yt2) obj, v2);
                return vs7;
            default:
                ((Number) obj2).intValue();
                int v3 = b85.v(i2 | 1);
                vr2 vr24 = this.z;
                ml4 ml43 = this.y;
                ie1.a((mm7) obj6, vr24, ml43, (n52) obj5, (x82) obj4, (gs2) obj3, this.C, (yt2) obj, v3);
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj(mm7 mm7, vr2 vr2, ml4 ml4, n52 n52, x82 x82, gs2 gs2, fw0 fw0, int i) {
        super(2);
        this.E = mm7;
        this.z = vr2;
        this.y = ml4;
        this.B = n52;
        this.A = x82;
        this.F = gs2;
        this.C = fw0;
        this.D = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj(mm7 mm7, ml4 ml4, vr2 vr2, jb jbVar, vr2 vr22, vr2 vr23, fw0 fw0, int i) {
        super(2);
        this.E = mm7;
        this.y = ml4;
        this.z = vr2;
        this.A = jbVar;
        this.B = vr22;
        this.F = vr23;
        this.C = fw0;
        this.D = i;
    }
}
