package defpackage;

/* renamed from: b7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b7 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ p7 C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(p7 p7Var, String str, String str2, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.C = p7Var;
        this.D = str;
        this.E = str2;
    }

    public final f61 l(f61 f61) {
        switch (this.A) {
            case b85.b /*0*/:
                String str = this.E;
                return new b7(this.C, this.D, str, f61, 0);
            case 1:
                String str2 = this.E;
                return new b7(this.C, this.D, str2, f61, 1);
            default:
                return new b7(this.C, this.D, this.E, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        String str = this.E;
        String str2 = this.D;
        p7 p7Var = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    uu t = rg3.t(p7Var.a);
                    a7 a7Var = new a7(str2, str, 0);
                    this.B = 1;
                    if (uu.b(t, r22.a, a7Var, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    uu t2 = rg3.t(p7Var.a);
                    a7 a7Var2 = new a7(str2, str, 1);
                    this.B = 1;
                    if (uu.b(t2, m73.a, a7Var2, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    uu t3 = rg3.t(p7Var.a);
                    String obj2 = d57.k1(str).toString();
                    this.B = 1;
                    Object k = uu.k(t3, c85.SIGNUP, str2, obj2, this);
                    if (k == p81) {
                        return p81;
                    }
                    return k;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b /*0*/:
                return ((b7) l(f61)).s(vs7);
            case 1:
                return ((b7) l(f61)).s(vs7);
            default:
                return ((b7) l(f61)).s(vs7);
        }
    }
}
