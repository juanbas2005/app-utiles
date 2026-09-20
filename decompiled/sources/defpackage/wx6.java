package defpackage;

/* renamed from: wx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wx6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ gs2 D;
    public final /* synthetic */ aq4 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx6(gs2 gs2, aq4 aq4, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = gs2;
        this.E = aq4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((wx6) o(f61, o81)).s(vs7);
            case 1:
                return ((wx6) o(f61, o81)).s(vs7);
            case 2:
                return ((wx6) o(f61, o81)).s(vs7);
            default:
                return ((wx6) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                wx6 wx6 = new wx6(this.D, this.E, f61, 0);
                wx6.C = obj;
                return wx6;
            case 1:
                wx6 wx62 = new wx6(this.D, this.E, f61, 1);
                wx62.C = obj;
                return wx62;
            case 2:
                wx6 wx63 = new wx6(this.D, this.E, f61, 2);
                wx63.C = obj;
                return wx63;
            default:
                wx6 wx64 = new wx6(this.D, this.E, f61, 3);
                wx64.C = obj;
                return wx64;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.E;
        gs2 gs2 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    np5 np5 = new np5(aq4, ((o81) this.C).k());
                    this.B = 1;
                    if (gs2.H(np5, this) == p81) {
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
                    np5 np52 = new np5(aq4, ((o81) this.C).k());
                    this.B = 1;
                    if (gs2.H(np52, this) == p81) {
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
                    np5 np53 = new np5(aq4, ((o81) this.C).k());
                    this.B = 1;
                    if (gs2.H(np53, this) == p81) {
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
                    np5 np54 = new np5(aq4, ((o81) this.C).k());
                    this.B = 1;
                    if (gs2.H(np54, this) == p81) {
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
