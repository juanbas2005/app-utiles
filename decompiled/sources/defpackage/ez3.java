package defpackage;

import java.util.List;

/* renamed from: ez3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ez3 extends ry3 {
    public final /* synthetic */ iz3 b;
    public final /* synthetic */ gs2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ez3(iz3 iz3, gs2 gs2, String str) {
        super(str);
        this.b = iz3;
        this.c = gs2;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        iz3 iz3 = this.b;
        cz3 cz3 = iz3.D;
        cz3.w = oh4.getLayoutDirection();
        cz3.x = oh4.b();
        cz3.y = oh4.Y();
        boolean a0 = oh4.a0();
        gs2 gs2 = this.c;
        if (a0 || iz3.w.D == null) {
            iz3.z = 0;
            mh4 mh4 = (mh4) gs2.H(cz3, new k31(j));
            return new dz3(mh4, iz3, iz3.z, mh4, 1);
        }
        iz3.A = 0;
        mh4 mh42 = (mh4) gs2.H(iz3.E, new k31(j));
        return new dz3(mh42, iz3, iz3.A, mh42, 0);
    }
}
