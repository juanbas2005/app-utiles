package defpackage;

/* renamed from: ii6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ii6 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ oi6 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ mm7 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii6(oi6 oi6, Object obj, mm7 mm7, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.C = oi6;
        this.D = obj;
        this.E = mm7;
    }

    public final f61 l(f61 f61) {
        switch (this.A) {
            case b85.b:
                f61 f612 = f61;
                return new ii6(this.C, this.D, this.E, f612, 0);
            default:
                return new ii6(this.C, this.D, this.E, f61, 1);
        }
    }

    public final Object s(Object obj) {
        float f;
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    w6 w6Var = new w6((Object) this.C, this.D, (Object) this.E, (f61) null, 15);
                    this.B = 1;
                    if (gl0.L(w6Var, this) == p81) {
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
            default:
                oi6 oi6 = this.C;
                ed5 ed5 = oi6.x;
                int i3 = this.B;
                mm7 mm7 = this.E;
                if (i3 == 0) {
                    o85.q(obj);
                    oi6.j1();
                    oi6.I = Long.MIN_VALUE;
                    oi6.n1(0.0f);
                    Object value = oi6.y.getValue();
                    Object obj2 = this.D;
                    if (sg3.e(obj2, value)) {
                        f = -4.0f;
                    } else if (sg3.e(obj2, ed5.getValue())) {
                        f = -5.0f;
                    } else {
                        f = -3.0f;
                    }
                    mm7.q(obj2);
                    mm7.o(0);
                    ed5.setValue(obj2);
                    oi6.n1(0.0f);
                    oi6.O0(obj2);
                    mm7.k(f);
                    if (f == -3.0f) {
                        this.B = 1;
                        if (oi6.g1(oi6, this) == p81) {
                            return p81;
                        }
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mm7.j();
                return vs7;
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((ii6) l(f61)).s(vs7);
            default:
                return ((ii6) l(f61)).s(vs7);
        }
    }
}
