package defpackage;

/* renamed from: r41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r41 extends a97 implements gs2 {
    public final /* synthetic */ int A = 0;
    public int B;
    public final /* synthetic */ long C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r41(wj5 wj5, String str, long j, lg7 lg7, ze7 ze7, v35 v35, f61 f61) {
        super(2, f61);
        this.D = wj5;
        this.E = str;
        this.C = j;
        this.F = lg7;
        this.G = ze7;
        this.H = v35;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((r41) o((f61) obj2, (xh6) obj)).s(vs7);
            default:
                return ((r41) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        Object obj5 = this.E;
        switch (i) {
            case b85.b:
                r41 r41 = new r41((fu7) obj5, (s41) obj4, (fc0) obj3, this.C, (el3) obj2, f61);
                r41.D = obj;
                return r41;
            default:
                return new r41((wj5) this.D, (String) obj5, this.C, (lg7) obj4, (ze7) obj3, (v35) obj2, f61);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    public final Object s(Object obj) {
        String str;
        Object obj2;
        int i = this.A;
        Object obj3 = this.F;
        p81 p81 = p81.w;
        Object obj4 = this.G;
        Object obj5 = this.E;
        Object obj6 = this.H;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                fc0 fc0 = (fc0) obj4;
                s41 s41 = (s41) obj3;
                fu7 fu7 = (fu7) obj5;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    fu7.e = s41.V0(s41, fc0, this.C);
                    g5 g5Var = new g5(s41, fu7, (el3) obj6, (xh6) this.D);
                    g20 g20 = new g20(s41, fu7, fc0, 4);
                    this.B = 1;
                    if (fu7.a(g5Var, g20, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            default:
                v35 v35 = (v35) obj6;
                String str2 = (String) obj5;
                ze7 ze7 = (ze7) obj4;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    wj5 wj5 = (wj5) this.D;
                    this.B = 1;
                    wj5.getClass();
                    if (str2.length() != 0) {
                        long j = this.C;
                        if (!lg7.c(j)) {
                            str = str2;
                            obj2 = ar7.e0(wj5.a, new ng((Object) wj5, (Object) new vj5(j, (f61) null, wj5, (CharSequence) str2), (f61) null, 13), this);
                            if (obj2 == p81) {
                                return p81;
                            }
                        }
                    }
                    obj2 = null;
                    str = str2;
                    if (obj2 == p81) {
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    obj2 = obj;
                    str = str2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lg7 lg7 = (lg7) obj2;
                if (lg7 != null) {
                    long j2 = lg7.a;
                    long a = i95.a(v35.h((int) (j2 >> 32)), v35.h((int) (j2 & 4294967295L)));
                    if (!lg7.a(a, (lg7) obj3) && sg3.e(ze7.n().a.x, str) && v35 == ze7.b) {
                        ze7.c.y(ze7.e(ze7.n().a, a));
                        ze7.w = new lg7(a);
                    }
                }
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r41(fu7 fu7, s41 s41, fc0 fc0, long j, el3 el3, f61 f61) {
        super(2, f61);
        this.E = fu7;
        this.F = s41;
        this.G = fc0;
        this.C = j;
        this.H = el3;
    }
}
