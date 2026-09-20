package defpackage;

/* renamed from: wz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wz5 implements gs2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ wz5(int i, int i2, int i3, String str) {
        this.z = str;
        this.x = i;
        this.y = i2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        long f;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.z;
        int i2 = this.y;
        int i3 = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                xz5.l((String) obj3, i3, i2, (yt2) obj, b85.v(1));
                return vs7;
            default:
                x83 x83 = (x83) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    if (i3 == i2) {
                        int i4 = x08.b;
                        f = x08.f(jt0.b, jt0.c);
                    } else {
                        int i5 = x08.b;
                        f = x08.f(jt0.b(0.7f, jt0.b), jt0.b(0.7f, jt0.c));
                    }
                    d83.a(x83, (String) null, yu6.l(jl4.w, 18.0f), f, yt2, 432, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ wz5(int i, int i2, x83 x83) {
        this.x = i;
        this.y = i2;
        this.z = x83;
    }
}
