package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: cj2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cj2 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ h06 y;

    public /* synthetic */ cj2(gs2 gs2, h06 h06, int i) {
        this.w = i;
        this.x = gs2;
        this.y = h06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    public final Object k(Object obj, f61 f61) {
        bj2 bj2;
        Object obj2;
        int i;
        fj2 fj2;
        Object obj3;
        int i2;
        int i3 = this.w;
        h06 h06 = this.y;
        vs7 vs7 = vs7.a;
        gs2 gs2 = this.x;
        p81 p81 = p81.w;
        switch (i3) {
            case b85.b:
                if (f61 instanceof bj2) {
                    bj2 = (bj2) f61;
                    int i4 = bj2.A;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bj2.A = i4 - Integer.MIN_VALUE;
                        obj2 = bj2.z;
                        i = bj2.A;
                        if (i != 0) {
                            o85.q(obj2);
                            bj2.C = obj;
                            bj2.A = 1;
                            obj2 = gs2.H(obj, bj2);
                            if (obj2 == p81) {
                                return p81;
                            }
                        } else if (i == 1) {
                            obj = bj2.C;
                            o85.q(obj2);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return vs7;
                        }
                        h06.w = obj;
                        throw new AbortFlowException(this);
                    }
                }
                bj2 = new bj2(this, f61);
                obj2 = bj2.z;
                i = bj2.A;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                if (f61 instanceof fj2) {
                    fj2 = (fj2) f61;
                    int i5 = fj2.A;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        fj2.A = i5 - Integer.MIN_VALUE;
                        obj3 = fj2.z;
                        i2 = fj2.A;
                        if (i2 != 0) {
                            o85.q(obj3);
                            fj2.C = obj;
                            fj2.A = 1;
                            obj3 = gs2.H(obj, fj2);
                            if (obj3 == p81) {
                                return p81;
                            }
                        } else if (i2 == 1) {
                            obj = fj2.C;
                            o85.q(obj3);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return vs7;
                        }
                        h06.w = obj;
                        throw new AbortFlowException(this);
                    }
                }
                fj2 = new fj2(this, f61);
                obj3 = fj2.z;
                i2 = fj2.A;
                if (i2 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
        }
    }
}
