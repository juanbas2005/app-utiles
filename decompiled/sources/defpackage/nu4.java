package defpackage;

/* renamed from: nu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nu4 implements vr2 {
    public final /* synthetic */ aq4 A;
    public final /* synthetic */ int w;
    public final /* synthetic */ hx0 x;
    public final /* synthetic */ vr2 y;
    public final /* synthetic */ vr2 z;

    public /* synthetic */ nu4(hx0 hx0, vr2 vr2, vr2 vr22, aq4 aq4, int i) {
        this.w = i;
        this.x = hx0;
        this.y = vr2;
        this.z = vr22;
        this.A = aq4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        aq4 aq4 = this.A;
        vr2 vr2 = this.z;
        vr2 vr22 = this.y;
        hx0 hx0 = this.x;
        gk gkVar = (gk) obj;
        switch (i) {
            case b85.b:
                qt4 qt4 = ((zs4) gkVar.d()).x;
                qt4.getClass();
                gx0 gx0 = (gx0) qt4;
                if (((Boolean) hx0.c.getValue()).booleanValue() || ((Boolean) aq4.getValue()).booleanValue()) {
                    int i2 = qt4.A;
                    for (qt4 qt42 : ie1.I(gx0)) {
                    }
                    return (n52) vr22.y(gkVar);
                }
                int i3 = qt4.A;
                for (qt4 qt43 : ie1.I(gx0)) {
                }
                return (n52) vr2.y(gkVar);
            default:
                qt4 qt44 = ((zs4) gkVar.b()).x;
                qt44.getClass();
                gx0 gx02 = (gx0) qt44;
                if (((Boolean) hx0.c.getValue()).booleanValue() || ((Boolean) aq4.getValue()).booleanValue()) {
                    int i4 = qt4.A;
                    for (qt4 qt45 : ie1.I(gx02)) {
                    }
                    return (x82) vr22.y(gkVar);
                }
                int i5 = qt4.A;
                for (qt4 qt46 : ie1.I(gx02)) {
                }
                return (x82) vr2.y(gkVar);
        }
    }
}
