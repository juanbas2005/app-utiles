package defpackage;

/* renamed from: ae0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ae0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ef3 C;
    public final /* synthetic */ yx6 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae0(ef3 ef3, yx6 yx6, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ef3;
        this.D = yx6;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b /*0*/:
                return ((ae0) o(f61, o81)).s(vs7);
            case 1:
                return ((ae0) o(f61, o81)).s(vs7);
            default:
                return ((ae0) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b /*0*/:
                return new ae0(this.C, this.D, f61, 0);
            case 1:
                return new ae0(this.C, this.D, f61, 1);
            default:
                return new ae0(this.C, this.D, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        yx6 yx6 = this.D;
        ef3 ef3 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    di2 a = ef3.a();
                    zd0 zd0 = new zd0(yx6, 0);
                    this.B = 1;
                    if (a.a(zd0, this) == p81) {
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
                    di2 a2 = ef3.a();
                    zd0 zd02 = new zd0(yx6, 1);
                    this.B = 1;
                    if (a2.a(zd02, this) == p81) {
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
                    di2 a3 = ef3.a();
                    zd0 zd03 = new zd0(yx6, 2);
                    this.B = 1;
                    if (a3.a(zd03, this) == p81) {
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
}
