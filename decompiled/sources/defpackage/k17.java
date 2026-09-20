package defpackage;

/* renamed from: k17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k17 implements sr2 {
    public final /* synthetic */ aq4 A;
    public final /* synthetic */ aq4 B;
    public final /* synthetic */ aq4 C;
    public final /* synthetic */ aq4 D;
    public final /* synthetic */ aq4 E;
    public final /* synthetic */ vr2 w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ aq4 y;
    public final /* synthetic */ aq4 z;

    public /* synthetic */ k17(vr2 vr2, aq4 aq4, aq4 aq42, aq4 aq43, aq4 aq44, aq4 aq45, aq4 aq46, aq4 aq47, aq4 aq48) {
        this.w = vr2;
        this.x = aq4;
        this.y = aq42;
        this.z = aq43;
        this.A = aq44;
        this.B = aq45;
        this.C = aq46;
        this.D = aq47;
        this.E = aq48;
    }

    public final Object b() {
        Double d;
        Double d2;
        Double d3;
        String str = (String) this.x.getValue();
        r11 r11 = (r11) this.y.getValue();
        q07 q07 = (q07) this.z.getValue();
        String str2 = (String) this.A.getValue();
        String str3 = (String) this.B.getValue();
        String str4 = (String) this.C.getValue();
        aq4 aq4 = this.D;
        yb5 yb5 = (yb5) aq4.getValue();
        if (yb5 != null) {
            d = (Double) yb5.w;
        } else {
            d = null;
        }
        aq4 aq42 = this.E;
        if (!((Boolean) aq42.getValue()).booleanValue()) {
            d = null;
        }
        yb5 yb52 = (yb5) aq4.getValue();
        if (yb52 != null) {
            d2 = (Double) yb52.x;
        } else {
            d2 = null;
        }
        if (((Boolean) aq42.getValue()).booleanValue()) {
            d3 = d2;
        } else {
            d3 = null;
        }
        this.w.y(new dz4(str, r11, q07, str2, str3, str4, d, d3));
        return vs7.a;
    }
}
