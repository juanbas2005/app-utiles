package defpackage;

/* renamed from: be  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class be extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ h06 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be(int i, h06 h06) {
        super(1);
        this.x = i;
        this.y = h06;
    }

    public final Object y(Object obj) {
        boolean z;
        int i = this.x;
        h06 h06 = this.y;
        switch (i) {
            case b85.b:
                h06.w = (vk2) obj;
                return Boolean.TRUE;
            case 1:
                q23 q23 = (q23) obj;
                Object obj2 = h06.w;
                if (obj2 == null && q23.M) {
                    h06.w = q23;
                } else if (obj2 != null) {
                    q23.getClass();
                }
                return Boolean.TRUE;
            default:
                ln7 ln7 = (ln7) obj;
                if (((ll4) ln7).w.J) {
                    h06.w = ln7;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
