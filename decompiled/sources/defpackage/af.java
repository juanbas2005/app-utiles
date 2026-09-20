package defpackage;

/* renamed from: af  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class af extends wx3 implements gs2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(mm7 mm7, sr2 sr2, int i) {
        super(2);
        this.x = 1;
        this.y = mm7;
        this.z = sr2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.x;
        vs7 vs7 = vs7.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case b85.b /*0*/:
                int intValue = ((Number) obj).intValue();
                fk6 fk6 = (fk6) obj2;
                bf bfVar = (bf) obj3;
                if (!((gk6) obj4).b.c(fk6.f)) {
                    bfVar.h(intValue, fk6);
                    bfVar.e();
                }
                return vs7;
            case 1:
                ((Number) obj2).intValue();
                i52.a((mm7) obj4, (sr2) obj3, (yt2) obj, b85.v(1));
                return vs7;
            case 2:
                yt2 yt2 = (yt2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue2 & 1, z2)) {
                    Boolean bool = (Boolean) ((az3) obj4).g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    gs2 gs2 = (gs2) obj3;
                    yt2.h0(bool);
                    boolean h = yt2.h(booleanValue);
                    if (booleanValue) {
                        gs2.H(yt2, 0);
                    } else {
                        if (yt2.l != 0) {
                            ey0.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!yt2.S) {
                            if (!h) {
                                yt2.X();
                            } else {
                                fv6 fv6 = yt2.G;
                                int i2 = fv6.g;
                                int i3 = fv6.h;
                                by0 by0 = yt2.M;
                                by0.getClass();
                                by0.d(false);
                                by0.b.u.s(a65.d);
                                b96.d(yt2.s, i2, i3);
                                yt2.G.t();
                            }
                        }
                    }
                    if (yt2.y && yt2.G.i == yt2.z) {
                        yt2.z = -1;
                        yt2.y = false;
                    }
                    yt2.r(false);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                qk0 qk0 = (qk0) obj;
                cx2 cx2 = (cx2) obj2;
                xz4 xz4 = (xz4) obj4;
                uy3 uy3 = xz4.O;
                if (uy3.K()) {
                    xz4.h0 = qk0;
                    xz4.g0 = cx2;
                    r95 snapshotObserver = ((je) xy3.a(uy3)).getSnapshotObserver();
                    l76 l76 = xz4.m0;
                    snapshotObserver.a.e(xz4, xc4.A, (wz4) obj3);
                    xz4.k0 = false;
                } else {
                    xz4.k0 = true;
                }
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af(int i, Object obj, Object obj2) {
        super(2);
        this.x = i;
        this.y = obj;
        this.z = obj2;
    }
}
