package defpackage;

/* renamed from: q90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q90 implements pk1 {
    public final u83 a;
    public final v75 b;
    public final tk6 c;
    public final t82 d;

    public q90(u83 u83, v75 v75, tk6 tk6, t82 t82) {
        this.a = u83;
        this.b = v75;
        this.c = tk6;
        this.d = t82;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r8.b(r0) == r5) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public final Object a(f61 f61) {
        p90 p90;
        int i;
        p81 p81;
        Throwable th;
        tk6 tk6;
        tk6 tk62;
        Object N;
        if (f61 instanceof p90) {
            p90 = (p90) f61;
            int i2 = p90.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p90.D = i2 - Integer.MIN_VALUE;
                Object obj = p90.B;
                i = p90.D;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    p90.z = this;
                    tk62 = this.c;
                    p90.A = tk62;
                    p90.D = 1;
                } else if (i == 1) {
                    tk6 tk63 = p90.A;
                    o85.q(obj);
                    tk62 = tk63;
                    this = (q90) p90.z;
                } else if (i == 2) {
                    tk6 = (tk6) p90.z;
                    try {
                        o85.q(obj);
                        gk1 gk1 = (gk1) obj;
                        tk6.d();
                        return gk1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zh zhVar = new zh(5, (Object) this);
                p90.z = tk62;
                p90.A = null;
                p90.D = 2;
                N = h49.N(zhVar, p90);
                if (N != p81) {
                    tk6 tk64 = tk62;
                    obj = N;
                    tk6 = tk64;
                    gk1 gk12 = (gk1) obj;
                    tk6.d();
                    return gk12;
                }
                return p81;
            }
        }
        p90 = new p90(this, (h61) f61);
        Object obj2 = p90.B;
        i = p90.D;
        p81 = p81.w;
        if (i != 0) {
        }
        try {
            zh zhVar2 = new zh(5, (Object) this);
            p90.z = tk62;
            p90.A = null;
            p90.D = 2;
            N = h49.N(zhVar2, p90);
            if (N != p81) {
            }
            return p81;
        } catch (Throwable th3) {
            tk6 tk65 = tk62;
            th = th3;
            tk6 = tk65;
            tk6.d();
            throw th;
        }
    }
}
