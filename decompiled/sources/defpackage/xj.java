package defpackage;

/* renamed from: xj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xj extends wx3 implements gs2 {
    public final /* synthetic */ ml4 A;
    public final /* synthetic */ fw0 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int x = 0;
    public final /* synthetic */ mm7 y;
    public final /* synthetic */ vr2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xj(mm7 mm7, vr2 vr2, ml4 ml4, n52 n52, x82 x82, fw0 fw0, int i) {
        super(2);
        this.y = mm7;
        this.z = vr2;
        this.A = ml4;
        this.D = n52;
        this.E = x82;
        this.B = fw0;
        this.C = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.x;
        vs7 vs7 = vs7.a;
        int i2 = this.C;
        Object obj3 = this.E;
        Object obj4 = this.D;
        switch (i) {
            case b85.b:
                ((Number) obj2).intValue();
                int v = b85.v(i2 | 1);
                mm7 mm7 = this.y;
                ml4 ml4 = this.A;
                vr2 vr2 = this.z;
                vr2 vr22 = vr2;
                fd1.c(mm7, ml4, vr22, (jb) obj3, (vr2) obj4, this.B, (yt2) obj, v);
                return vs7;
            default:
                ((Number) obj2).intValue();
                int v2 = b85.v(i2 | 1);
                mm7 mm72 = this.y;
                vr2 vr23 = this.z;
                ml4 ml42 = this.A;
                ie1.e(mm72, vr23, ml42, (n52) obj4, (x82) obj3, this.B, (yt2) obj, v2);
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xj(mm7 mm7, ml4 ml4, vr2 vr2, jb jbVar, vr2 vr22, fw0 fw0, int i) {
        super(2);
        this.y = mm7;
        this.A = ml4;
        this.z = vr2;
        this.E = jbVar;
        this.D = vr22;
        this.B = fw0;
        this.C = i;
    }
}
