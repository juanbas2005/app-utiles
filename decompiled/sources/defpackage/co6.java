package defpackage;

/* renamed from: co6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class co6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ eo6 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co6(eo6 eo6, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = eo6;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((co6) o(f61, o81)).s(vs7);
            default:
                return ((co6) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        eo6 eo6 = this.C;
        switch (i) {
            case b85.b:
                return new co6(eo6, f61, 0);
            default:
                return new co6(eo6, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        eo6 eo6 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    di2 b = eo6.b.b();
                    nt ntVar = new nt(1, eo6.c);
                    this.B = 1;
                    if (b.a(ntVar, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    di2 b2 = eo6.b.b();
                    this.B = 1;
                    Object H = gr8.H(b2, this);
                    if (H == p81) {
                        return p81;
                    }
                    return H;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
