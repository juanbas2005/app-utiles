package defpackage;

/* renamed from: ln0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ln0 extends a97 implements gs2 {
    public final /* synthetic */ int A = 1;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ on0 D;
    public final /* synthetic */ fi2 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ln0(on0 on0, fi2 fi2, Object obj, f61 f61) {
        super(2, f61);
        this.D = on0;
        this.E = fi2;
        this.C = obj;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((ln0) o(f61, o81)).s(vs7);
            default:
                return ((ln0) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        fi2 fi2 = this.E;
        on0 on0 = this.D;
        switch (i) {
            case b85.b:
                return new ln0(on0, fi2, this.C, f61);
            default:
                ln0 ln0 = new ln0(on0, fi2, f61);
                ln0.C = obj;
                return ln0;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    hs2 hs2 = this.D.A;
                    Object obj2 = this.C;
                    this.B = 1;
                    if (hs2.u(this.E, obj2, this) == p81) {
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
            default:
                o81 o81 = (o81) this.C;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    Object obj3 = new Object();
                    on0 on0 = this.D;
                    di2 di2 = on0.z;
                    nn0 nn0 = new nn0(obj3, o81, on0, this.E, 0);
                    this.C = null;
                    this.B = 1;
                    if (di2.a(nn0, this) == p81) {
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
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ln0(on0 on0, fi2 fi2, f61 f61) {
        super(2, f61);
        this.D = on0;
        this.E = fi2;
    }
}
