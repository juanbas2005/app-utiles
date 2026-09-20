package defpackage;

import java.util.List;

/* renamed from: cl7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cl7 extends i05 {
    public final ad0 f = rj1.c(Integer.MAX_VALUE, 6, (vc0) null);
    public h27 g;

    public cl7(zh6 zh6, ew0 ew0, tp1 tp1) {
        super(zh6, ew0, tp1);
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b8, code lost:
        if (r1.b(r0, r7) == r10) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
        if (r0.H(r3, r7) != r10) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e1, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    public static final Object c(cl7 cl7, zh6 zh6, al7 al7, h61 h61) {
        bl7 bl7;
        int i;
        cl7 cl72 = cl7;
        al7 al72 = al7;
        h61 h612 = h61;
        cl72.getClass();
        jz0 jz0 = cl72.e;
        if (h612 instanceof bl7) {
            bl7 = (bl7) h612;
            int i2 = bl7.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bl7.B = i2 - Integer.MIN_VALUE;
                bl7 bl72 = bl7;
                Object obj = bl72.z;
                i = bl72.B;
                Object obj2 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    ? obj3 = new Object();
                    obj3.w = al72;
                    long j = al72.b;
                    long j2 = al72.a;
                    ((z38) jz0.x).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((z38) jz0.y).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    al7 e = e(cl72.f);
                    if (e != null) {
                        long j3 = e.b;
                        long j4 = e.a;
                        ((z38) jz0.x).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((z38) jz0.y).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        obj3.w = ((al7) obj3.w).a(e);
                    }
                    w6 w6Var = new w6((Object) cl72, (Object) zh6, (Object) obj3, (f61) null, 18);
                    bl72.B = 1;
                } else if (i == 1) {
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gs2 gs2 = cl72.b;
                x38 x38 = new x38(u55.b(((z38) jz0.x).c(Float.MAX_VALUE), ((z38) jz0.y).c(Float.MAX_VALUE)));
                bl72.B = 2;
            }
        }
        bl7 = new bl7(cl72, h612);
        bl7 bl722 = bl7;
        Object obj4 = bl722.z;
        i = bl722.B;
        Object obj22 = p81.w;
        if (i != 0) {
        }
        gs2 gs22 = cl72.b;
        x38 x382 = new x38(u55.b(((z38) jz0.x).c(Float.MAX_VALUE), ((z38) jz0.y).c(Float.MAX_VALUE)));
        bl722.B = 2;
    }

    public static al7 e(ad0 ad0) {
        al7 al7 = null;
        bl6 y = t75.y(new fm2(new zm4(ad0, 1), (f61) null, 2));
        while (y.hasNext()) {
            al7 al72 = (al7) y.next();
            if (al7 != null) {
                al72 = al7.a(al72);
            }
            al7 = al72;
        }
        return al7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae A[RETURN] */
    public final boolean d(kk5 kk5) {
        boolean z;
        boolean z2;
        boolean z3;
        ad0 ad0;
        zh6 zh6;
        boolean z4;
        boolean z5;
        boolean z6;
        kk5 kk52 = kk5;
        qk5 qk5 = (qk5) dt0.y0(kk52.a);
        if (qk5 != null) {
            List b = qk5.b();
            int size = b.size();
            int i = 0;
            z3 = false;
            while (true) {
                ad0 = this.f;
                zh6 = this.a;
                if (i >= size) {
                    break;
                }
                b03 b03 = (b03) b.get(i);
                long j = b03.d ^ -9223372034707292160L;
                if (zh6.j(zh6.f(j)) == 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    if (!(ad0.c(new al7(j, b03.a, false)) instanceof qn0) || z3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                i++;
            }
            z2 = true;
            z = false;
            long j2 = qk5.l ^ -9223372034707292160L;
            if (kk52.f == 12) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (zh6.j(zh6.f(j2)) == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 || z4) {
                if (!(ad0.c(new al7(j2, qk5.b, z4)) instanceof qn0) || z3) {
                    z3 = true;
                }
            }
            if (z3 || this.d) {
                return z2;
            }
            return z;
        }
        z2 = true;
        z = false;
        z3 = z;
        if (z3 || this.d) {
        }
    }
}
