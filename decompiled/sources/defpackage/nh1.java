package defpackage;

/* renamed from: nh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nh1 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ x83 x;
    public final /* synthetic */ String y;

    public /* synthetic */ nh1(x83 x83, String str, int i) {
        this.w = i;
        this.x = x83;
        this.y = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    d83.a(this.x, this.y, (ml4) null, 0, yt2, 0, 12);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    d83.a(this.x, this.y, (ml4) null, 0, yt22, 0, 12);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
