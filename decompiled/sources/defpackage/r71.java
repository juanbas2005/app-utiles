package defpackage;

/* renamed from: r71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r71 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ uk5 C;
    public final /* synthetic */ wd7 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r71(uk5 uk5, wd7 wd7, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = uk5;
        this.D = wd7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((r71) o(f61, o81)).s(vs7);
            case 1:
                return ((r71) o(f61, o81)).s(vs7);
            default:
                return ((r71) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new r71(this.C, this.D, f61, 0);
            case 1:
                return new r71(this.C, this.D, f61, 1);
            default:
                return new r71(this.C, this.D, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        uk5 uk5 = this.C;
        wd7 wd7 = this.D;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object L = gl0.L(new gv(uk5, wd7, (f61) null, 5), this);
                    if (L != p81) {
                        L = vs7;
                    }
                    if (L == p81) {
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
                    Object s = fd1.s(uk5, new fm2(wd7, (f61) null, 1), this);
                    if (s != p81) {
                        s = vs7;
                    }
                    if (s == p81) {
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
                    Object d = my1.d(this.C, new oc4(wd7, 0), new pc4(wd7, 0), new pc4(wd7, 1), new yg(15, wd7), this);
                    if (d != p81) {
                        d = vs7;
                    }
                    if (d == p81) {
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
