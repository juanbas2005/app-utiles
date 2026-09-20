package defpackage;

/* renamed from: fi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fi1 extends a97 implements gs2 {
    public int A;
    public final /* synthetic */ s34 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ ik2 D;
    public final /* synthetic */ int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fi1(s34 s34, int i, ik2 ik2, int i2, f61 f61) {
        super(2, f61);
        this.B = s34;
        this.C = i;
        this.D = ik2;
        this.E = i2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((fi1) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new fi1(this.B, this.C, this.D, this.E, f61);
    }

    public final Object s(Object obj) {
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            s34 s34 = this.B;
            this.A = 1;
            Object f = s34.f(s34.h() + this.C, this);
            p81 p81 = p81.w;
            if (f == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ((lk2) this.D).h(this.E, true);
        return vs7.a;
    }
}
