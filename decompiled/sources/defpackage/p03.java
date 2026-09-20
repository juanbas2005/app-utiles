package defpackage;

/* renamed from: p03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p03 implements sr2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ aq4 z;

    public /* synthetic */ p03(vr2 vr2, String str, aq4 aq4) {
        this.x = vr2;
        this.y = str;
        this.z = aq4;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.z;
        String str = this.y;
        vr2 vr2 = this.x;
        switch (i) {
            case b85.b:
                aq4.setValue(str);
                vr2.y(str);
                return vs7;
            default:
                vr2.y(str);
                aq4.setValue((Object) null);
                return vs7;
        }
    }

    public /* synthetic */ p03(String str, vr2 vr2, aq4 aq4) {
        this.y = str;
        this.x = vr2;
        this.z = aq4;
    }
}
