package defpackage;

/* renamed from: nc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nc extends a97 implements is2 {
    public int A;
    public /* synthetic */ ad B;
    public /* synthetic */ ll1 C;
    public /* synthetic */ Object D;
    public final /* synthetic */ bd E;
    public final /* synthetic */ float F;
    public final /* synthetic */ hl G;
    public final /* synthetic */ e06 H;
    public final /* synthetic */ tj1 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nc(bd bdVar, float f, hl hlVar, e06 e06, tj1 tj1, f61 f61) {
        super(4, f61);
        this.E = bdVar;
        this.F = f;
        this.G = hlVar;
        this.H = e06;
        this.I = tj1;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        e06 e06 = this.H;
        tj1 tj1 = this.I;
        nc ncVar = new nc(this.E, this.F, this.G, e06, tj1, (f61) obj4);
        ncVar.B = (ad) obj;
        ncVar.C = (ll1) obj2;
        ncVar.D = obj3;
        return ncVar.s(vs7.a);
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, e06] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        if (defpackage.i95.f(r1, r0, false, r7, r6) == r15) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (defpackage.rc.a(r6.E, r13, r2, r3, r5, r6.G, r6) == r15) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        if (defpackage.rc.a(r6.E, r14, r2, r3, r1, r6.G, r6) == r15) goto L_0x00cc;
     */
    public final Object s(Object obj) {
        float f;
        int i = this.A;
        e06 e06 = this.H;
        if (i == 0) {
            o85.q(obj);
            ad adVar = this.B;
            ll1 ll1 = this.C;
            Object obj2 = this.D;
            float c = ll1.c(obj2);
            if (!Float.isNaN(c)) {
                ? obj3 = new Object();
                bd bdVar = this.E;
                if (Float.isNaN(bdVar.j.d())) {
                    f = 0.0f;
                } else {
                    f = bdVar.j.d();
                }
                obj3.w = f;
                if (f != c) {
                    float f2 = this.F;
                    int i2 = (((c - f) * f2) > 0.0f ? 1 : (((c - f) * f2) == 0.0f ? 0 : -1));
                    Object obj4 = p81.w;
                    if (i2 < 0 || f2 == 0.0f) {
                        Object obj5 = obj2;
                        ad adVar2 = adVar;
                        this.B = null;
                        this.C = null;
                        this.A = 1;
                    } else {
                        tj1 tj1 = this.I;
                        float g = kl8.g(tj1, f, f2);
                        float f3 = this.F;
                        if (f3 <= 0.0f ? g > c : g < c) {
                            ad adVar3 = adVar;
                            this.B = null;
                            this.C = null;
                            this.A = 3;
                        } else {
                            il a = gr8.a(obj3.w, f3, 28);
                            bx6 bx6 = new bx6(c, obj3, adVar, e06, 2);
                            this.B = null;
                            this.C = null;
                            this.A = 2;
                        }
                    }
                    return obj4;
                }
            }
            return vs7.a;
        } else if (i == 1) {
            o85.q(obj);
            e06.w = 0.0f;
            return vs7.a;
        } else if (i == 2) {
            o85.q(obj);
            return vs7.a;
        } else if (i == 3) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e06.w = 0.0f;
        return vs7.a;
    }
}
