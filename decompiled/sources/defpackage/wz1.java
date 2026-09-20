package defpackage;

/* renamed from: wz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wz1 extends a97 implements is2 {
    public int A;
    public /* synthetic */ ad B;
    public /* synthetic */ ll1 C;
    public /* synthetic */ yz1 D;
    public final /* synthetic */ xz1 E;
    public final /* synthetic */ float F;
    public final /* synthetic */ hl G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wz1(xz1 xz1, float f, hl hlVar, f61 f61) {
        super(4, f61);
        this.E = xz1;
        this.F = f;
        this.G = hlVar;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.F;
        hl hlVar = this.G;
        wz1 wz1 = new wz1(this.E, f, hlVar, (f61) obj4);
        wz1.B = (ad) obj;
        wz1.C = (ll1) obj2;
        wz1.D = (yz1) obj3;
        return wz1.s(vs7.a);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, e06] */
    public final Object s(Object obj) {
        float d;
        bd bdVar = this.E.b;
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            ad adVar = this.B;
            float c = this.C.c(this.D);
            if (!Float.isNaN(c)) {
                ? obj2 = new Object();
                if (Float.isNaN(bdVar.j.d())) {
                    d = 0.0f;
                } else {
                    d = bdVar.j.d();
                }
                float f = d;
                obj2.w = f;
                kc kcVar = new kc(adVar, obj2, 1);
                this.B = null;
                this.C = null;
                this.A = 1;
                Object c2 = i95.c(f, c, this.F, this.G, kcVar, this);
                p81 p81 = p81.w;
                if (c2 == p81) {
                    return p81;
                }
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }
}
