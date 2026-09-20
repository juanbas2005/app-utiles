package defpackage;

/* renamed from: bk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bk5 {
    public static final t37 a = new hu5(vy0.L);

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final void a(o44 o44, ng ngVar, h61 h61) {
        zj5 zj5;
        int i;
        if (h61 instanceof zj5) {
            zj5 zj52 = (zj5) h61;
            int i2 = zj52.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zj52.A = i2 - Integer.MIN_VALUE;
                zj5 = zj52;
                Object obj = zj5.z;
                i = zj5.A;
                if (i != 0) {
                    o85.q(obj);
                    if (o44.w.J) {
                        p95 P0 = rc9.P0(o44);
                        vf5 vf5 = (vf5) rc9.O0(o44).W;
                        vf5.getClass();
                        if (rc9.G0(vf5, a) == null) {
                            zj5.A = 1;
                            b(P0, ngVar, zj5);
                            return;
                        }
                        ku4.a();
                        return;
                    }
                    h.q("establishTextInputSession called from an unattached node");
                    return;
                } else if (i != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    o85.q(obj);
                    ta1.e();
                    return;
                }
            }
        }
        zj5 = new h61(h61);
        Object obj2 = zj5.z;
        i = zj5.A;
        if (i != 0) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final void b(p95 p95, gs2 gs2, h61 h61) {
        ak5 ak5;
        int i;
        if (h61 instanceof ak5) {
            ak5 ak52 = (ak5) h61;
            int i2 = ak52.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ak52.A = i2 - Integer.MIN_VALUE;
                ak5 = ak52;
                Object obj = ak5.z;
                i = ak5.A;
                if (i != 0) {
                    o85.q(obj);
                    ak5.A = 1;
                    ((je) p95).J(gs2, ak5);
                    return;
                } else if (i == 1) {
                    o85.q(obj);
                    ta1.e();
                    return;
                } else if (i != 2) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    o85.q(obj);
                    ta1.e();
                    return;
                }
            }
        }
        ak5 = new h61(h61);
        Object obj2 = ak5.z;
        i = ak5.A;
        if (i != 0) {
        }
    }
}
