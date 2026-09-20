package defpackage;

/* renamed from: wh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wh7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ Object C;
    public /* synthetic */ float D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh7(xh7 xh7, float f, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = xh7;
        this.D = f;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((wh7) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((wh7) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((wh7) o((f61) obj2, Float.valueOf(((Number) obj).floatValue()))).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.C;
        switch (i) {
            case b85.b:
                return new wh7((xh7) obj2, this.D, f61, 0);
            case 1:
                return new wh7((xh7) obj2, this.D, f61, 1);
            default:
                wh7 wh7 = new wh7((ox0) obj2, f61);
                wh7.D = ((Number) obj).floatValue();
                return wh7;
        }
    }

    public final Object s(Object obj) {
        hl hlVar;
        hl hlVar2;
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        Object obj2 = this.C;
        gs2 gs2 = null;
        switch (i) {
            case b85.b:
                xh7 xh7 = (xh7) obj2;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    uj ujVar = xh7.P;
                    if (ujVar == null) {
                        return vs7;
                    }
                    xh7 xh72 = xh7;
                    Float f = new Float(this.D);
                    if (xh72.N) {
                        hlVar = p97.f;
                    } else {
                        hlVar = xh72.M;
                    }
                    hl hlVar3 = hlVar;
                    this.B = 1;
                    obj = uj.c(ujVar, f, hlVar3, (Float) null, (vr2) null, this, 12);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fl flVar = (fl) obj;
                return vs7;
            case 1:
                xh7 xh73 = (xh7) obj2;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    uj ujVar2 = xh73.O;
                    if (ujVar2 == null) {
                        return vs7;
                    }
                    Float f2 = new Float(this.D);
                    if (xh73.N) {
                        hlVar2 = p97.f;
                    } else {
                        hlVar2 = xh73.M;
                    }
                    hl hlVar4 = hlVar2;
                    this.B = 1;
                    obj = uj.c(ujVar2, f2, hlVar4, (Float) null, (vr2) null, this, 12);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fl flVar2 = (fl) obj;
                return vs7;
            default:
                ox0 ox0 = (ox0) obj2;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    float f3 = this.D;
                    ak6 ak6 = ox0.a.d;
                    Object g = ak6.w.g(zj6.e);
                    if (g != null) {
                        gs2 = g;
                    }
                    gs2 gs22 = gs2;
                    if (gs22 != null) {
                        vg6 vg6 = (vg6) ox0.a.d.k(jk6.w);
                        l35 l35 = new l35((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                        this.B = 1;
                        obj = gs22.H(l35, this);
                        if (obj == p81) {
                            return p81;
                        }
                    } else {
                        throw b81.t("Required value was null.");
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new Float(Float.intBitsToFloat((int) (((l35) obj).a & 4294967295L)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh7(ox0 ox0, f61 f61) {
        super(2, f61);
        this.A = 2;
        this.C = ox0;
    }
}
