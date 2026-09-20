package defpackage;

/* renamed from: vh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vh5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ni5 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh5(ni5 ni5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ni5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((vh5) o(f61, o81)).s(vs7);
            case 1:
                return ((vh5) o(f61, o81)).s(vs7);
            case 2:
                return ((vh5) o(f61, o81)).s(vs7);
            case 3:
                return ((vh5) o(f61, o81)).s(vs7);
            case 4:
                return ((vh5) o(f61, o81)).s(vs7);
            default:
                return ((vh5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        ni5 ni5 = this.C;
        switch (i) {
            case b85.b:
                return new vh5(ni5, f61, 0);
            case 1:
                return new vh5(ni5, f61, 1);
            case 2:
                return new vh5(ni5, f61, 2);
            case 3:
                return new vh5(ni5, f61, 3);
            case 4:
                return new vh5(ni5, f61, 4);
            default:
                return new vh5(ni5, f61, 5);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        az7 az7 = az7.PLAN_AMIGO_BASE;
        ni5 ni5 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object a = ni5.a(ni5, az7.TARIFA_CONSUMO_ACTIVAR, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object a2 = ni5.a(ni5, az7.TARIFA_CONSUMO_DESACTIVAR, this);
                    if (a2 == p81) {
                        return p81;
                    }
                    return a2;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj + "1*1#";
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj + "3#";
            case 4:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj + "1*2#";
            default:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj + "3*1*1#";
        }
    }
}
