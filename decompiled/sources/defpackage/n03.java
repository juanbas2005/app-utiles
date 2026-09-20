package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: n03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n03 implements i03 {
    public final p94 a;
    public final dv7 b;
    public final t97 c;

    public n03(p94 p94, dv7 dv7, t97 t97) {
        p94.getClass();
        dv7.getClass();
        t97.getClass();
        this.a = p94;
        this.b = dv7;
        this.c = t97;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r10 != r6) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[Catch:{ CancellationException -> 0x0087, Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[Catch:{ CancellationException -> 0x0087, Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public final Object a(gk3 gk3, h61 h61) {
        j03 j03;
        int i;
        p81 p81;
        Object e0;
        if (h61 instanceof j03) {
            j03 = (j03) h61;
            int i2 = j03.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j03.C = i2 - Integer.MIN_VALUE;
                Object obj = j03.A;
                i = j03.C;
                vs7 vs7 = vs7.a;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    j03.z = gk3;
                    j03.C = 1;
                    dy7 dy7 = (dy7) dv7;
                    obj = ar7.e0(dy7.b, new gv7(dy7, (f61) null, 2), j03);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    gk3 = j03.z;
                    o85.q(obj);
                } else if (i == 2) {
                    try {
                        o85.q(obj);
                        this.c.a();
                        return vs7;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p94 p94 = this.a;
                al3 a2 = al3.a(uq3.N(gk3), (String) obj, System.currentTimeMillis());
                j03.z = null;
                j03.C = 2;
                e0 = ar7.e0(p94.b, new ju1(p94, a2, (f61) null, 20), j03);
                if (e0 == p81) {
                    e0 = vs7;
                }
            }
        }
        j03 = new j03(this, h61);
        Object obj2 = j03.A;
        i = j03.C;
        vs7 vs72 = vs7.a;
        p81 = p81.w;
        if (i != 0) {
        }
        p94 p942 = this.a;
        al3 a22 = al3.a(uq3.N(gk3), (String) obj2, System.currentTimeMillis());
        j03.z = null;
        j03.C = 2;
        e0 = ar7.e0(p942.b, new ju1(p942, a22, (f61) null, 20), j03);
        if (e0 == p81) {
        }
    }
}
