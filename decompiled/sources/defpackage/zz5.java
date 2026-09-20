package defpackage;

/* renamed from: zz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zz5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ a06 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz5(a06 a06, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = a06;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((zz5) o(f61, o81)).s(vs7);
            case 1:
                return ((zz5) o(f61, o81)).s(vs7);
            default:
                return ((zz5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        a06 a06 = this.C;
        switch (i) {
            case b85.b:
                return new zz5(a06, f61, 0);
            case 1:
                return new zz5(a06, f61, 1);
            default:
                return new zz5(a06, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        a06 a06 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    c6 d = a06.d.d();
                    yz5 yz5 = new yz5(a06, 0);
                    this.B = 1;
                    if (d.a(yz5, this) == p81) {
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
                    pm0 pm0 = a06.b.a;
                    pm0.getClass();
                    di2 L = gr8.L(gr8.w(new n0(pm0, (f61) null, 13)), pm0.b);
                    yz5 yz52 = new yz5(a06, 1);
                    this.B = 1;
                    if (L.a(yz52, this) == p81) {
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
                    d07 d07 = a06.c;
                    d07.getClass();
                    di2 L2 = gr8.L(new hn0(new b07(d07, (f61) null), x32.w, -2, vc0.w), d07.a);
                    yz5 yz53 = new yz5(a06, 2);
                    this.B = 1;
                    if (L2.a(yz53, this) == p81) {
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
