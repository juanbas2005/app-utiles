package defpackage;

/* renamed from: fe4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fe4 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ne4 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe4(ne4 ne4, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ne4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((fe4) o(f61, o81)).s(vs7);
            case 1:
                return ((fe4) o(f61, o81)).s(vs7);
            default:
                return ((fe4) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        ne4 ne4 = this.C;
        switch (i) {
            case b85.b:
                return new fe4(ne4, f61, 0);
            case 1:
                return new fe4(ne4, f61, 1);
            default:
                return new fe4(ne4, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        ne4 ne4 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    dv7 dv7 = ne4.b;
                    this.B = 1;
                    if (((dy7) dv7).K(this) == p81) {
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
                    dv7 dv72 = ne4.b;
                    this.B = 1;
                    if (((dy7) dv72).A(this) == p81) {
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
                    c6 c6Var = new c6(gr8.F(new c6(((dy7) ne4.b).d(), 10)), 9);
                    lg lgVar = new lg(7, ne4);
                    this.B = 1;
                    if (c6Var.a(lgVar, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
