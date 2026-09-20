package defpackage;

/* renamed from: r0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ap4 C;
    public final /* synthetic */ eo5 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(eo5 eo5, ap4 ap4, f61 f61) {
        super(2, f61);
        this.A = 0;
        this.D = eo5;
        this.C = ap4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((r0) o(f61, o81)).s(vs7);
            case 1:
                return ((r0) o(f61, o81)).s(vs7);
            default:
                return ((r0) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        eo5 eo5 = this.D;
        ap4 ap4 = this.C;
        switch (i) {
            case b85.b:
                return new r0(eo5, ap4, f61);
            case 1:
                return new r0(ap4, eo5, f61, 1);
            default:
                return new r0(ap4, eo5, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        eo5 eo5 = this.D;
        ap4 ap4 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    fo5 fo5 = new fo5(eo5);
                    this.B = 1;
                    if (ap4.b(fo5, this) == p81) {
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
                    this.B = 1;
                    if (ap4.b(eo5, this) == p81) {
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
                    this.B = 1;
                    if (ap4.b(eo5, this) == p81) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(ap4 ap4, eo5 eo5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ap4;
        this.D = eo5;
    }
}
