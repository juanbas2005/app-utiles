package defpackage;

/* renamed from: zh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zh5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ni5 C;
    public final /* synthetic */ boolean D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh5(ni5 ni5, boolean z, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ni5;
        this.D = z;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((zh5) o(f61, o81)).s(vs7);
            case 1:
                return ((zh5) o(f61, o81)).s(vs7);
            default:
                return ((zh5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        boolean z = this.D;
        ni5 ni5 = this.C;
        switch (i) {
            case b85.b:
                return new zh5(ni5, z, f61, 0);
            case 1:
                return new zh5(ni5, z, f61, 1);
            default:
                return new zh5(ni5, z, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        String str = "#";
        boolean z = this.D;
        p81 p81 = p81.w;
        ni5 ni5 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7.BOLSA_DIARIA_LTE, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (z) {
                    str = "*1#";
                }
                return obj + str;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7.BOLSA_MENSAJERIA, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (z) {
                    str = "*1#";
                }
                return obj + str;
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7.PAQUETE_DATOS_BASE, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = (String) obj;
                if (z) {
                    str = "*1#";
                }
                return pb4.l(str2, "1", str);
        }
    }
}
