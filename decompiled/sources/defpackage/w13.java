package defpackage;

/* renamed from: w13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w13 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ c23 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w13(c23 c23, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = c23;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((w13) o(f61, o81)).s(vs7);
            case 1:
                return ((w13) o(f61, o81)).s(vs7);
            default:
                return ((w13) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        c23 c23 = this.C;
        switch (i) {
            case b85.b:
                return new w13(c23, f61, 0);
            case 1:
                return new w13(c23, f61, 1);
            default:
                return new w13(c23, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        c23 c23 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    c50 c50 = (c50) c23.c;
                    c50.getClass();
                    di2 b = c50.b(vz7.a, "fechaVence", "--");
                    u13 u13 = new u13(c23, 29);
                    this.B = 1;
                    if (b.a(u13, this) == p81) {
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
                    c50 c502 = (c50) c23.c;
                    c502.getClass();
                    di2 b2 = c502.b(wz7.a, "fechaNacional", "--");
                    x13 x13 = new x13(c23, 0);
                    this.B = 1;
                    if (b2.a(x13, this) == p81) {
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
                    c50 c503 = (c50) c23.c;
                    c503.getClass();
                    di2 b3 = c503.b(rz7.a, "bonoIlimitado", "");
                    x13 x132 = new x13(c23, 1);
                    this.B = 1;
                    if (b3.a(x132, this) == p81) {
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
