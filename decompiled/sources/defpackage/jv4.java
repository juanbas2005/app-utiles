package defpackage;

/* renamed from: jv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jv4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ nh2 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ jv4(nh2 nh2, float f, boolean z2, int i) {
        this.w = i;
        this.x = nh2;
        this.y = f;
        this.z = z2;
    }

    public final Object y(Object obj) {
        float f;
        float f2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        float f3 = 0.0f;
        float f4 = 1.0f;
        boolean z2 = this.z;
        float f5 = this.y;
        nh2 nh2 = this.x;
        l76 l76 = (l76) obj;
        switch (i) {
            case b85.b:
                float b = nh2.b();
                if (b > 0.0f) {
                    f = 1.0f / ((b / f5) + 1.0f);
                } else {
                    f = 1.0f;
                }
                l76.l(f);
                if (z2) {
                    f4 = 0.0f;
                }
                l76.w(o55.a(f4, 0.0f));
                return vs7;
            default:
                float b2 = nh2.b();
                if (b2 > 0.0f) {
                    f2 = (b2 / f5) + 1.0f;
                } else {
                    f2 = 1.0f;
                }
                l76.l(f2);
                if (!z2) {
                    f3 = 1.0f;
                }
                l76.w(o55.a(f3, 0.5f));
                return vs7;
        }
    }
}
