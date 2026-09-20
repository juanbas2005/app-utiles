package defpackage;

/* renamed from: ei5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ei5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ni5 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei5(ni5 ni5, int i, boolean z, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.C = ni5;
        this.D = i;
        this.E = z;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((ei5) o(f61, o81)).s(vs7);
            case 1:
                return ((ei5) o(f61, o81)).s(vs7);
            default:
                return ((ei5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                boolean z = this.E;
                return new ei5(this.C, this.D, z, f61, 0);
            case 1:
                boolean z2 = this.E;
                return new ei5(this.C, this.D, z2, f61, 1);
            default:
                return new ei5(this.C, this.D, this.E, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        String str = "#";
        boolean z = this.E;
        int i2 = this.D;
        p81 p81 = p81.w;
        ni5 ni5 = this.C;
        switch (i) {
            case b85.b:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7.PAQUETE_DATOS_BASE, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = (String) obj;
                int i4 = i2 + 2;
                if (z) {
                    str = "*1#";
                }
                return str2 + i4 + str;
            case 1:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7.PLAN_SMS_BASE, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = (String) obj;
                int i6 = i2 + 1;
                if (z) {
                    str = "*1#";
                }
                return str3 + i6 + str;
            default:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = ni5.a(ni5, az7.PLAN_VOZ_BASE, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = (String) obj;
                int i8 = i2 + 1;
                if (z) {
                    str = "*1#";
                }
                return str4 + i8 + str;
        }
    }
}
