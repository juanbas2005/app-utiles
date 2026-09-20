package defpackage;

/* renamed from: ue1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue1 {
    public final /* synthetic */ oq4 a;
    public final /* synthetic */ d06 b;
    public final /* synthetic */ h06 c;
    public final /* synthetic */ jf1 d;

    public ue1(oq4 oq4, d06 d06, h06 h06, jf1 jf1) {
        this.a = oq4;
        this.b = d06;
        this.c = h06;
        this.d = jf1;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [gs2] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r10.a(r0) == r6) goto L_0x00bf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090 A[Catch:{ all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object a(f7 f7Var, h61 h61) {
        te1 te1;
        int i;
        oq4 oq4;
        h06 h06;
        Object obj;
        jf1 jf1;
        oq4 oq42;
        oq4 oq43;
        h06 h062;
        d06 d06;
        if (h61 instanceof te1) {
            te1 = (te1) h61;
            int i2 = te1.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                te1.G = i2 - Integer.MIN_VALUE;
                Object obj2 = te1.E;
                i = te1.G;
                Object obj3 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    te1.z = f7Var;
                    oq43 = this.a;
                    te1.A = oq43;
                    d06 = this.b;
                    te1.B = d06;
                    h062 = this.c;
                    te1.C = h062;
                    jf1 = this.d;
                    te1.D = jf1;
                    te1.G = 1;
                } else if (i == 1) {
                    jf1 = te1.D;
                    h06 h063 = te1.C;
                    d06 = (d06) te1.B;
                    o85.q(obj2);
                    h062 = h063;
                    f7Var = (gs2) te1.z;
                    oq43 = (oq4) te1.A;
                } else if (i == 2) {
                    jf1 = (jf1) te1.B;
                    h06 = (h06) te1.A;
                    oq42 = (oq4) te1.z;
                    try {
                        o85.q(obj2);
                        if (sg3.e(obj2, h06.w)) {
                            te1.z = oq42;
                            te1.A = h06;
                            te1.B = obj2;
                            te1.G = 3;
                            if (jf1.k(obj2, false, te1) != obj3) {
                                obj = obj2;
                                oq4 = oq42;
                                h06.w = obj;
                                Object obj4 = h06.w;
                                oq4.k((Object) null);
                                return obj4;
                            }
                            return obj3;
                        }
                        oq4 = oq42;
                        Object obj42 = h06.w;
                        oq4.k((Object) null);
                        return obj42;
                    } catch (Throwable th) {
                        th = th;
                        oq4 = oq42;
                    }
                } else if (i == 3) {
                    obj = te1.B;
                    h06 = (h06) te1.A;
                    oq4 = (oq4) te1.z;
                    try {
                        o85.q(obj2);
                        h06.w = obj;
                        Object obj422 = h06.w;
                        oq4.k((Object) null);
                        return obj422;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (d06.w) {
                    Object obj5 = h062.w;
                    te1.z = oq43;
                    te1.A = h062;
                    te1.B = jf1;
                    te1.C = null;
                    te1.D = null;
                    te1.G = 2;
                    Object H = f7Var.H(obj5, te1);
                    if (H != obj3) {
                        oq42 = oq43;
                        obj2 = H;
                        h06 = h062;
                        if (sg3.e(obj2, h06.w)) {
                        }
                    }
                    return obj3;
                }
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
        }
        te1 = new te1(this, h61);
        Object obj22 = te1.E;
        i = te1.G;
        Object obj32 = p81.w;
        if (i != 0) {
        }
        try {
            if (d06.w) {
            }
        } catch (Throwable th3) {
            th = th3;
            oq4 = oq43;
            oq4.k((Object) null);
            throw th;
        }
    }
}
