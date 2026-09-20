package defpackage;

import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;

/* renamed from: or4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class or4 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ NautaOverlayService C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or4(NautaOverlayService nautaOverlayService, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = nautaOverlayService;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                ((or4) o(f61, o81)).s(vs7);
                return p81.w;
            case 1:
                return ((or4) o(f61, o81)).s(vs7);
            default:
                return ((or4) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        NautaOverlayService nautaOverlayService = this.C;
        switch (i) {
            case b85.b:
                return new or4(nautaOverlayService, f61, 0);
            case 1:
                return new or4(nautaOverlayService, f61, 1);
            default:
                return new or4(nautaOverlayService, f61, 2);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        NautaOverlayService nautaOverlayService = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        o85.q(obj);
                        ta1.e();
                    }
                    return null;
                }
                o85.q(obj);
                d37 d37 = nautaOverlayService.J;
                nr4 nr4 = new nr4(nautaOverlayService, 0);
                this.B = 1;
                d37.a(nr4, this);
                return p81;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    ur4 ur4 = nautaOverlayService.z;
                    if (ur4 != null) {
                        di2 g = ((gs4) ur4).g();
                        nr4 nr42 = new nr4(nautaOverlayService, 1);
                        this.B = 1;
                        if (g.a(nr42, this) == p81) {
                            return p81;
                        }
                        return vs7;
                    }
                    sg3.a0("nautaRepository");
                    throw null;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    ur4 ur42 = nautaOverlayService.z;
                    if (ur42 != null) {
                        di2 h = ((gs4) ur42).h();
                        nr4 nr43 = new nr4(nautaOverlayService, 2);
                        this.B = 1;
                        if (h.a(nr43, this) == p81) {
                            return p81;
                        }
                        return vs7;
                    }
                    sg3.a0("nautaRepository");
                    throw null;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
