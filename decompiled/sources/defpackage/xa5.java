package defpackage;

/* renamed from: xa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xa5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ob5 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa5(ob5 ob5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ob5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((xa5) o(f61, o81)).s(vs7);
            case 1:
                return ((xa5) o(f61, o81)).s(vs7);
            default:
                return ((xa5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new xa5(this.C, f61, 0);
            case 1:
                return new xa5(this.C, f61, 1);
            default:
                return new xa5(this.C, f61, 2);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A;
        ob5 ob5 = this.C;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    qb5 qb5 = rb5.a;
                    if (ob5.k() - 1 < 0 || (obj2 = ob5.f(ob5.k() - 1, kl8.M(0.0f, 0.0f, (Object) null, 7), this)) != p81) {
                        obj2 = vs7;
                    }
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    qb5 qb52 = rb5.a;
                    if (ob5.k() + 1 >= ob5.n() || (obj3 = ob5.f(ob5.k() + 1, kl8.M(0.0f, 0.0f, (Object) null, 7), this)) != p81) {
                        obj3 = vs7;
                    }
                    if (obj3 == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    bj bjVar = new bj(2, (f61) null, 2);
                    ob5.getClass();
                    Object s = ob5.s(ob5, hq4.w, bjVar, this);
                    if (s != p81) {
                        s = vs7;
                    }
                    if (s == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
        }
    }
}
