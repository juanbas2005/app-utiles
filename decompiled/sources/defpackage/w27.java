package defpackage;

/* renamed from: w27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w27 extends a97 implements hs2 {
    public int A;
    public /* synthetic */ fi2 B;
    public /* synthetic */ int C;
    public final /* synthetic */ x27 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w27(x27 x27, f61 f61) {
        super(3, f61);
        this.D = x27;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r4.k(defpackage.hs6.w, r0) == r13) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (defpackage.t49.G(r14, r0) == r13) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r4.k(defpackage.hs6.x, r0) == r13) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (defpackage.t49.G(r2, r0) == r13) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        if (r4.k(defpackage.hs6.y, r0) != r13) goto L_0x008b;
     */
    public final Object s(Object obj) {
        x27 x27 = this.D;
        long j = x27.b;
        fi2 fi2 = this.B;
        int i = this.C;
        int i2 = this.A;
        p81 p81 = p81.w;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    o85.q(obj);
                } else if (i2 == 3) {
                    o85.q(obj);
                    this.B = fi2;
                    this.C = i;
                    this.A = 4;
                } else if (i2 == 4) {
                    o85.q(obj);
                    this.B = null;
                    this.C = i;
                    this.A = 5;
                } else if (i2 != 5) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o85.q(obj);
            return vs7.a;
        }
        o85.q(obj);
        if (i > 0) {
            this.B = null;
            this.C = i;
            this.A = 1;
        } else {
            long j2 = x27.a;
            this.B = fi2;
            this.C = i;
            this.A = 2;
        }
        return p81;
        if (j > 0) {
            this.B = fi2;
            this.C = i;
            this.A = 3;
        }
        this.B = null;
        this.C = i;
        this.A = 5;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        w27 w27 = new w27(this.D, (f61) obj3);
        w27.B = (fi2) obj;
        w27.C = intValue;
        return w27.s(vs7.a);
    }
}
