package defpackage;

/* renamed from: pe7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pe7 extends a97 implements hs2 {
    public int A;
    public /* synthetic */ co5 B;
    public /* synthetic */ long C;
    public final /* synthetic */ o81 D;
    public final /* synthetic */ aq4 E;
    public final /* synthetic */ ap4 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe7(o81 o81, aq4 aq4, ap4 ap4, f61 f61) {
        super(3, f61);
        this.D = o81;
        this.E = aq4;
        this.F = ap4;
    }

    public final Object s(Object obj) {
        int i = this.A;
        o81 o81 = this.D;
        if (i == 0) {
            o85.q(obj);
            co5 co5 = this.B;
            ar7.H(o81, (e81) null, (r81) null, new q0((Object) this.E, this.C, (Object) this.F, (f61) null, 4), 3);
            this.A = 1;
            obj = co5.f(this);
            p81 p81 = p81.w;
            if (obj == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ar7.H(o81, (e81) null, (r81) null, new hv(this.E, ((Boolean) obj).booleanValue(), this.F, (f61) null), 3);
        return vs7.a;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        long j = ((l35) obj2).a;
        aq4 aq4 = this.E;
        ap4 ap4 = this.F;
        pe7 pe7 = new pe7(this.D, aq4, ap4, (f61) obj3);
        pe7.B = (co5) obj;
        pe7.C = j;
        return pe7.s(vs7.a);
    }
}
