package defpackage;

/* renamed from: xt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xt4 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public float C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xt4(float f, oi6 oi6, zs4 zs4, f61 f61) {
        super(2, f61);
        this.A = 1;
        this.C = f;
        this.D = oi6;
        this.E = zs4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((xt4) o(f61, o81)).s(vs7);
            case 1:
                return ((xt4) o(f61, o81)).s(vs7);
            case 2:
                return ((xt4) o(f61, o81)).s(vs7);
            default:
                return ((xt4) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.E;
        switch (i) {
            case b85.b:
                return new xt4((oi6) this.D, this.C, (eg6) obj2, f61, 0);
            case 1:
                return new xt4(this.C, (oi6) this.D, (zs4) obj2, f61);
            case 2:
                return new xt4((ai) this.D, this.C, (hl) obj2, f61, 2);
            default:
                xt4 xt4 = new xt4((mm7) obj2, f61);
                xt4.D = obj;
                return xt4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (r0.l1(r9, r0.x.getValue(), r13) == r8) goto L_0x00cd;
     */
    public final Object s(Object obj) {
        o81 o81;
        float f;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj2 = this.E;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((oi6) this.D).l1(this.C, (eg6) obj2, this) == p81) {
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
                oi6 oi6 = (oi6) this.D;
                float f2 = this.C;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    if (f2 > 0.0f) {
                        this.B = 1;
                        break;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else if (i3 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (f2 != 0.0f) {
                    return vs7;
                }
                this.B = 2;
                if (oi6.p1((zs4) obj2, this) != p81) {
                    return vs7;
                }
                return p81;
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    uj ujVar = ((ai) this.D).T;
                    Float f3 = new Float(this.C);
                    this.B = 1;
                    if (uj.c(ujVar, f3, (hl) obj2, (Float) null, (vr2) null, this, 12) == p81) {
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
                    o81 o812 = (o81) this.D;
                    o81 = o812;
                    f = i95.p(o812.k());
                } else if (i5 == 1) {
                    f = this.C;
                    o81 = (o81) this.D;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                while (gl0.X(o81)) {
                    ny1 ny1 = new ny1((mm7) obj2, f, 2);
                    this.D = o81;
                    this.C = f;
                    this.B = 1;
                    e81 e81 = this.x;
                    e81.getClass();
                    if (pd8.s(e81).a(ny1, this) == p81) {
                        return p81;
                    }
                }
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xt4(mm7 mm7, f61 f61) {
        super(2, f61);
        this.A = 3;
        this.E = mm7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt4(Object obj, float f, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.C = f;
        this.E = obj2;
    }
}
