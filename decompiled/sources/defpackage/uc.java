package defpackage;

/* renamed from: uc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uc extends a97 implements hs2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ vc C;
    public final /* synthetic */ e06 D;
    public final /* synthetic */ float E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uc(vc vcVar, e06 e06, float f, f61 f61) {
        super(3, f61);
        this.C = vcVar;
        this.D = e06;
        this.E = f;
    }

    public final Object s(Object obj) {
        e06 e06;
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            vc vcVar = this.C;
            tc tcVar = new tc(0, vcVar, (ad) this.B);
            eh2 eh2 = vcVar.h0;
            if (eh2 != null) {
                e06 e062 = this.D;
                this.B = e062;
                this.A = 1;
                obj = eh2.a(tcVar, this.E, this);
                p81 p81 = p81.w;
                if (obj == p81) {
                    return p81;
                }
                e06 = e062;
            } else {
                sg3.a0("resolvedFlingBehavior");
                throw null;
            }
        } else if (i == 1) {
            e06 = (e06) this.B;
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e06.w = ((Number) obj).floatValue();
        return vs7.a;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        ll1 ll1 = (ll1) obj2;
        e06 e06 = this.D;
        float f = this.E;
        uc ucVar = new uc(this.C, e06, f, (f61) obj3);
        ucVar.B = (ad) obj;
        return ucVar.s(vs7.a);
    }
}
