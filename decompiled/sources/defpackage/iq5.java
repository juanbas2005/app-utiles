package defpackage;

/* renamed from: iq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iq5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ lq5 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq5(lq5 lq5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = lq5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((iq5) o(f61, o81)).s(vs7);
            case 1:
                return ((iq5) o(f61, o81)).s(vs7);
            default:
                return ((iq5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        lq5 lq5 = this.C;
        switch (i) {
            case b85.b:
                return new iq5(lq5, f61, 0);
            case 1:
                return new iq5(lq5, f61, 1);
            default:
                return new iq5(lq5, f61, 2);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object value;
        int i = this.A;
        vs7 vs7 = vs7.a;
        lq5 lq5 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    p7 p7Var = lq5.b;
                    this.B = 1;
                    obj2 = p7Var.c(this);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (obj2 instanceof m66) {
                    return vs7;
                }
                int intValue = ((Number) obj2).intValue();
                d37 d37 = lq5.c;
                do {
                    value = d37.getValue();
                } while (!pb4.t(wp5.a((wp5) ((is7) value).a, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, new Integer(intValue), 8191), 6, d37, value));
                return vs7;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    p7 p7Var2 = lq5.b;
                    this.B = 1;
                    if (p7Var2.g(this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    p7 p7Var3 = lq5.b;
                    this.B = 1;
                    if (p7Var3.h(this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
