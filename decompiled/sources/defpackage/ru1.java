package defpackage;

/* renamed from: ru1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ru1 implements gs2 {
    public final /* synthetic */ uu1 A;
    public final /* synthetic */ zs4 w;
    public final /* synthetic */ vu1 x;
    public final /* synthetic */ oe6 y;
    public final /* synthetic */ yx6 z;

    public ru1(zs4 zs4, vu1 vu1, pe6 pe6, yx6 yx6, uu1 uu1) {
        this.w = zs4;
        this.x = vu1;
        this.y = pe6;
        this.z = yx6;
        this.A = uu1;
    }

    public final Object H(Object obj, Object obj2) {
        yt2 yt2 = (yt2) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !yt2.F()) {
            zs4 zs4 = this.w;
            boolean i = yt2.i(zs4);
            vu1 vu1 = this.x;
            boolean i2 = i | yt2.i(vu1);
            Object Q = yt2.Q();
            if (i2 || Q == ay0.a) {
                Q = new g5((Object) this.z, (Object) zs4, (Object) vu1, 13);
                yt2.o0(Q);
            }
            t49.e(zs4, (vr2) Q, yt2);
            x91.c(zs4, this.y, su0.J(-497631156, new qq1(1, (Object) this.A, (Object) zs4), yt2), yt2, 384);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
