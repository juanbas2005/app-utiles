package defpackage;

/* renamed from: qi2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qi2 implements di2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ di2 x;
    public final /* synthetic */ gs2 y;

    public qi2(gs2 gs2, di2 di2) {
        this.w = 0;
        this.y = gs2;
        this.x = di2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r4.H(r11, r0) == r3) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    public final Object a(fi2 fi2, f61 f61) {
        pi2 pi2;
        int i;
        vd6 vd6;
        int i2;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        gs2 gs2 = this.y;
        di2 di2 = this.x;
        switch (i3) {
            case b85.b:
                if (f61 instanceof pi2) {
                    pi2 = (pi2) f61;
                    int i4 = pi2.A;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pi2.A = i4 - Integer.MIN_VALUE;
                        Object obj = pi2.z;
                        i = pi2.A;
                        if (i != 0) {
                            o85.q(obj);
                            e81 e81 = pi2.x;
                            e81.getClass();
                            vd6 = new vd6(fi2, e81);
                            pi2.C = fi2;
                            pi2.D = vd6;
                            i2 = 0;
                            pi2.E = 0;
                            pi2.A = 1;
                            break;
                        } else if (i == 1) {
                            int i5 = pi2.E;
                            vd6 = pi2.D;
                            fi2 fi22 = pi2.C;
                            try {
                                o85.q(obj);
                                i2 = i5;
                                fi2 = fi22;
                            } catch (Throwable th) {
                                vd6.t();
                                throw th;
                            }
                        } else if (i == 2) {
                            o85.q(obj);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vd6.t();
                        pi2.C = null;
                        pi2.D = null;
                        pi2.E = i2;
                        pi2.A = 2;
                        if (di2.a(fi2, pi2) != p81) {
                            return vs7;
                        }
                        return p81;
                    }
                }
                pi2 = new pi2(this, f61);
                Object obj2 = pi2.z;
                i = pi2.A;
                if (i != 0) {
                }
                vd6.t();
                pi2.C = null;
                pi2.D = null;
                pi2.E = i2;
                pi2.A = 2;
                if (di2.a(fi2, pi2) != p81) {
                }
                return p81;
            case 1:
                Object a = di2.a(new qc(new Object(), fi2, gs2, 3), f61);
                if (a == p81) {
                    return a;
                }
                return vs7;
            default:
                Object a2 = di2.a(new n40(2, fi2, gs2), f61);
                if (a2 == p81) {
                    return a2;
                }
                return vs7;
        }
    }

    public /* synthetic */ qi2(di2 di2, gs2 gs2, int i) {
        this.w = i;
        this.x = di2;
        this.y = gs2;
    }
}
