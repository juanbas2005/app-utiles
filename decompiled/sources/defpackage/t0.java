package defpackage;

/* renamed from: t0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ v0 C;
    public final /* synthetic */ eo5 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(v0 v0Var, eo5 eo5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = v0Var;
        this.D = eo5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((t0) o(f61, o81)).s(vs7);
            case 1:
                return ((t0) o(f61, o81)).s(vs7);
            case 2:
                return ((t0) o(f61, o81)).s(vs7);
            default:
                return ((t0) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        eo5 eo5 = this.D;
        v0 v0Var = this.C;
        switch (i) {
            case b85.b:
                return new t0(v0Var, eo5, f61, 0);
            case 1:
                return new t0(v0Var, eo5, f61, 1);
            case 2:
                return new t0(v0Var, eo5, f61, 2);
            default:
                return new t0(v0Var, eo5, f61, 3);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        eo5 eo5 = this.D;
        v0 v0Var = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    ap4 ap4 = v0Var.M;
                    if (ap4 == null) {
                        return vs7;
                    }
                    do5 do5 = new do5(eo5);
                    this.B = 1;
                    if (ap4.b(do5, this) == p81) {
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
                    ap4 ap42 = v0Var.M;
                    if (ap42 == null) {
                        return vs7;
                    }
                    do5 do52 = new do5(eo5);
                    this.B = 1;
                    if (ap42.b(do52, this) == p81) {
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
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    ap4 ap43 = v0Var.M;
                    if (ap43 == null) {
                        return vs7;
                    }
                    this.B = 1;
                    if (ap43.b(eo5, this) == p81) {
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
            default:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    ap4 ap44 = v0Var.M;
                    if (ap44 == null) {
                        return vs7;
                    }
                    fo5 fo5 = new fo5(eo5);
                    this.B = 1;
                    if (ap44.b(fo5, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
