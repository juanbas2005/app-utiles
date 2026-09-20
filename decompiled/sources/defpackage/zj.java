package defpackage;

/* renamed from: zj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zj extends wx3 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.x = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public final Object y(Object obj) {
        boolean z2;
        gz1 gz1;
        int i = this.x;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                kw1 kw1 = (kw1) obj;
                return new i5((Object) (yx6) obj4, obj3, (Object) (mk) obj2, 1);
            case 1:
                ln7 ln7 = (ln7) obj;
                ux1 ux1 = (ux1) ln7;
                if (!((tf) ((je) rc9.P0((ux1) obj3)).getDragAndDropManager()).b.contains(ux1) || !gw8.f(ux1, h49.C((f96) obj2))) {
                    return kn7.w;
                }
                ((h06) obj4).w = ln7;
                return kn7.y;
            case 2:
                vk2 vk2 = (vk2) obj;
                if (sg3.e(vk2, (vk2) obj4)) {
                    z2 = false;
                } else if (!sg3.e(vk2, ((lk2) obj3).c)) {
                    z2 = ((Boolean) ((vr2) obj2).y(vk2)).booleanValue();
                } else {
                    h.s("Focus search landed at the root.");
                    return null;
                }
                return Boolean.valueOf(z2);
            default:
                hz1 hz1 = (hz1) obj;
                wy3 wy3 = (wy3) obj4;
                tk0 tk0 = wy3.w;
                gz1 gz12 = wy3.x;
                wy3.x = (gz1) obj3;
                try {
                    tp1 H = hz1.j0().H();
                    ey3 J = hz1.j0().J();
                    qk0 D = hz1.j0().D();
                    long L = hz1.j0().L();
                    cx2 cx2 = (cx2) hz1.j0().y;
                    vr2 vr2 = (vr2) obj2;
                    tp1 H2 = tk0.x.H();
                    ey3 J2 = tk0.x.J();
                    qk0 D2 = tk0.x.D();
                    long L2 = tk0.x.L();
                    wr0 wr0 = tk0.x;
                    gz1 gz13 = gz12;
                    try {
                        cx2 cx22 = (cx2) wr0.y;
                        wr0.c0(H);
                        wr0.d0(J);
                        wr0.b0(D);
                        wr0.e0(L);
                        wr0.y = cx2;
                        D.h();
                        try {
                            vr2.y(wy3);
                            D.p();
                            wr0 wr02 = tk0.x;
                            wr02.c0(H2);
                            wr02.d0(J2);
                            wr02.b0(D2);
                            wr02.e0(L2);
                            wr02.y = cx22;
                            wy3.x = gz13;
                            return vs7.a;
                        } catch (Throwable th) {
                            th = th;
                            wy3.x = gz1;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gz1 = gz13;
                        wy3.x = gz1;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gz1 = gz12;
                    wy3.x = gz1;
                    throw th;
                }
        }
    }
}
