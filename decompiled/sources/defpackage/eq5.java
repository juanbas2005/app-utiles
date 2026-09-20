package defpackage;

/* renamed from: eq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class eq5 implements gs2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ mv1 z;

    public /* synthetic */ eq5(int i, int i2, mv1 mv1) {
        this.x = i;
        this.y = i2;
        this.z = mv1;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        mv1 mv1 = this.z;
        int i2 = this.y;
        int i3 = this.x;
        yt2 yt2 = (yt2) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case b85.b:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    mp7.B(i3, i2, mv1, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                num.getClass();
                mp7.B(i3, i2, mv1, yt2, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ eq5(int i, int i2, mv1 mv1, int i3) {
        this.x = i;
        this.y = i2;
        this.z = mv1;
    }
}
