package defpackage;

/* renamed from: li6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class li6 extends a97 implements vr2 {
    public int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ oi6 D;
    public final /* synthetic */ mm7 E;
    public final /* synthetic */ float F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public li6(Object obj, Object obj2, oi6 oi6, mm7 mm7, float f, f61 f61) {
        super(1, f61);
        this.B = obj;
        this.C = obj2;
        this.D = oi6;
        this.E = mm7;
        this.F = f;
    }

    public final f61 l(f61 f61) {
        return new li6(this.B, this.C, this.D, this.E, this.F, f61);
    }

    public final Object s(Object obj) {
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            ki6 ki6 = new ki6(this.B, this.C, this.D, this.E, this.F, (f61) null);
            this.A = 1;
            Object L = gl0.L(ki6, this);
            p81 p81 = p81.w;
            if (L == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }

    public final Object y(Object obj) {
        return ((li6) l((f61) obj)).s(vs7.a);
    }
}
