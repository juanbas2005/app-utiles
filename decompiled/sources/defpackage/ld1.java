package defpackage;

/* renamed from: ld1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ld1 extends a97 implements gs2 {
    public int A;
    public final /* synthetic */ e81 B;
    public final /* synthetic */ a96 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ vr2 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ld1(e81 e81, a96 a96, boolean z, boolean z2, vr2 vr2, f61 f61) {
        super(2, f61);
        this.B = e81;
        this.C = a96;
        this.D = z;
        this.E = z2;
        this.F = vr2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((ld1) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new ld1(this.B, this.C, this.D, this.E, this.F, f61);
    }

    public final Object s(Object obj) {
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            kd1 kd1 = new kd1(this.C, this.D, this.E, this.F, (f61) null);
            this.A = 1;
            Object e0 = ar7.e0(this.B, kd1, this);
            p81 p81 = p81.w;
            if (e0 == p81) {
                return p81;
            }
            return e0;
        } else if (i == 1) {
            o85.q(obj);
            return obj;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
