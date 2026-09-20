package defpackage;

/* renamed from: o54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o54 implements q54 {
    public final /* synthetic */ a64 w;
    public final /* synthetic */ h06 x;
    public final /* synthetic */ vr2 y;

    public /* synthetic */ o54(a64 a64, h06 h06, vr2 vr2) {
        this.w = a64;
        this.x = h06;
        this.y = vr2;
    }

    public final void o(t54 t54, j54 j54) {
        int i = p54.a[j54.ordinal()];
        h06 h06 = this.x;
        if (i == 1) {
            h06.w = this.y.y(this.w);
        } else if (i == 2) {
            l30 l30 = (l30) h06.w;
            if (l30 != null) {
                l30.a();
            }
            h06.w = null;
        }
    }
}
