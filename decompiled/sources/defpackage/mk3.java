package defpackage;

/* renamed from: mk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mk3 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ xz1 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk3(xz1 xz1, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = xz1;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((mk3) o(f61, o81)).s(vs7);
            case 1:
                return ((mk3) o(f61, o81)).s(vs7);
            case 2:
                return ((mk3) o(f61, o81)).s(vs7);
            case 3:
                return ((mk3) o(f61, o81)).s(vs7);
            case 4:
                return ((mk3) o(f61, o81)).s(vs7);
            case 5:
                return ((mk3) o(f61, o81)).s(vs7);
            default:
                return ((mk3) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        xz1 xz1 = this.C;
        switch (i) {
            case b85.b:
                return new mk3(xz1, f61, 0);
            case 1:
                return new mk3(xz1, f61, 1);
            case 2:
                return new mk3(xz1, f61, 2);
            case 3:
                return new mk3(xz1, f61, 3);
            case 4:
                return new mk3(xz1, f61, 4);
            case 5:
                return new mk3(xz1, f61, 5);
            default:
                return new mk3(xz1, f61, 6);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        yz1 yz1 = yz1.x;
        vs7 vs7 = vs7.a;
        xz1 xz1 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (xz1.b(this) == p81) {
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
                    if (xz1.b(this) == p81) {
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
                    this.B = 1;
                    Object a = xz1.a(xz1, yz1, xz1.d, this);
                    if (a != p81) {
                        a = vs7;
                    }
                    if (a == p81) {
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
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object a2 = xz1.a(xz1, yz1, xz1.d, this);
                    if (a2 != p81) {
                        a2 = vs7;
                    }
                    if (a2 == p81) {
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
            case 4:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (xz1.b(this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i6 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 5:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (xz1.b(this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i7 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (xz1.b(this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
