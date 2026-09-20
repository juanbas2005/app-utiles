package defpackage;

/* renamed from: ki6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ki6 extends a97 implements gs2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ oi6 E;
    public final /* synthetic */ mm7 F;
    public final /* synthetic */ float G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ki6(Object obj, Object obj2, oi6 oi6, mm7 mm7, float f, f61 f61) {
        super(2, f61);
        this.C = obj;
        this.D = obj2;
        this.E = oi6;
        this.F = mm7;
        this.G = f;
    }

    public final Object H(Object obj, Object obj2) {
        return ((ki6) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        ki6 ki6 = new ki6(this.C, this.D, this.E, this.F, this.G, f61);
        ki6.B = obj;
        return ki6;
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        oi6 oi6 = this.E;
        if (i == 0) {
            o85.q(obj);
            o81 o81 = (o81) this.B;
            Object obj2 = this.C;
            Object obj3 = this.D;
            if (!sg3.e(obj2, obj3)) {
                oi6.d1(oi6);
            } else {
                oi6.K = null;
                if (sg3.e(oi6.y.getValue(), obj2)) {
                    return vs7;
                }
            }
            boolean e = sg3.e(obj2, obj3);
            float f = this.G;
            if (!e) {
                mm7 mm7 = this.F;
                mm7.q(obj2);
                mm7.o(0);
                oi6.x.setValue(obj2);
                mm7.k(f);
            }
            oi6.n1(f);
            if (oi6.J.i()) {
                ar7.H(o81, (e81) null, (r81) null, new ot(oi6, (f61) null, 27), 3);
            } else {
                oi6.I = Long.MIN_VALUE;
            }
            this.A = 1;
            Object g1 = oi6.g1(oi6, this);
            p81 p81 = p81.w;
            if (g1 == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi6.m1();
        return vs7;
    }
}
