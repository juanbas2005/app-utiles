package defpackage;

/* renamed from: xi0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xi0 extends hn0 {
    public final gs2 A;

    public xi0(gs2 gs2, e81 e81, int i, vc0 vc0) {
        super(gs2, e81, i, vc0);
        this.A = gs2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object e(op5 op5, f61 f61) {
        wi0 wi0;
        int i;
        if (f61 instanceof wi0) {
            wi0 = (wi0) f61;
            int i2 = wi0.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wi0.C = i2 - Integer.MIN_VALUE;
                Object obj = wi0.A;
                i = wi0.C;
                if (i != 0) {
                    o85.q(obj);
                    wi0.z = op5;
                    wi0.C = 1;
                    Object e = super.e(op5, wi0);
                    p81 p81 = p81.w;
                    if (e == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    op5 = wi0.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!op5.B.E()) {
                    return vs7.a;
                }
                h.s("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        wi0 = new wi0(this, (h61) f61);
        Object obj2 = wi0.A;
        i = wi0.C;
        if (i != 0) {
        }
        if (!op5.B.E()) {
        }
    }

    public final gn0 f(e81 e81, int i, vc0 vc0) {
        return new xi0(this.A, e81, i, vc0);
    }
}
