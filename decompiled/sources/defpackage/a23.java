package defpackage;

/* renamed from: a23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a23 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a23(Object obj, boolean z, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.C = z;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b /*0*/:
                return ((a23) o(f61, o81)).s(vs7);
            case 1:
                return ((a23) o(f61, o81)).s(vs7);
            default:
                return ((a23) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        boolean z = this.C;
        Object obj2 = this.D;
        switch (i) {
            case b85.b /*0*/:
                return new a23((c23) obj2, z, f61, 0);
            case 1:
                return new a23((dj5) obj2, z, f61, 1);
            default:
                return new a23((ze7) obj2, z, f61, 2);
        }
    }

    public final Object s(Object obj) {
        bs0 bs0;
        int i = this.A;
        boolean z = this.C;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.D;
        vl vlVar = null;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    vp6 vp6 = ((c23) obj2).d;
                    this.B = 1;
                    if (vp6.z(z, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    ni5 ni5 = ((dj5) obj2).b;
                    this.B = 1;
                    if (ni5.p(z, this) == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            default:
                ze7 ze7 = (ze7) obj2;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    if (!lg7.c(ze7.n().b) && !(ze7.f instanceof zd5)) {
                        vlVar = t75.q(ze7.n());
                        if (z) {
                            int e = lg7.e(ze7.n().b);
                            ze7.c.y(ze7.e(ze7.n().a, i95.a(e, e)));
                            ze7.q(ey2.w);
                        }
                    }
                    if (!(vlVar == null || (bs0 = ze7.h) == null)) {
                        as0 B0 = bb0.B0(vlVar);
                        this.B = 1;
                        ((sd) bs0).a(B0);
                        if (vs7 == p81) {
                            return p81;
                        }
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
        }
    }
}
