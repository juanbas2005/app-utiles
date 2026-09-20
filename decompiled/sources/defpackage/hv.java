package defpackage;

import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: hv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hv extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ boolean C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hv(uj ujVar, boolean z, hl hlVar, sr2 sr2, f61 f61) {
        super(2, f61);
        this.A = 2;
        this.D = ujVar;
        this.C = z;
        this.E = hlVar;
        this.F = sr2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((hv) o(f61, o81)).s(vs7);
            case 1:
                return ((hv) o(f61, o81)).s(vs7);
            case 2:
                return ((hv) o(f61, o81)).s(vs7);
            default:
                return ((hv) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.F;
        Object obj3 = this.E;
        switch (i) {
            case b85.b:
                f61 f612 = f61;
                return new hv(this.C, (a) this.D, (UserSession) obj3, (hn6) obj2, f612, 0);
            case 1:
                f61 f613 = f61;
                return new hv(this.C, (String) this.D, (String) obj3, (aq4) obj2, f613, 1);
            case 2:
                return new hv((uj) this.D, this.C, (hl) obj3, (sr2) obj2, f61);
            default:
                return new hv((aq4) obj3, this.C, (ap4) obj2, f61);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: aq4} */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0180, code lost:
        if (r0 == r9) goto L_0x01a0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        String str;
        float f;
        df3 df3;
        hv hvVar = this;
        int i = hvVar.A;
        Object obj2 = vs7.a;
        Object obj3 = hvVar.F;
        boolean z = hvVar.C;
        Object obj4 = p81.w;
        Object obj5 = hvVar.E;
        switch (i) {
            case b85.b:
                UserSession userSession = (UserSession) obj5;
                a aVar = (a) hvVar.D;
                int i2 = hvVar.B;
                if (i2 == 0) {
                    o85.q(obj);
                    if (z) {
                        hvVar.B = 1;
                        int i3 = a.q;
                        qd3 c = td3.a.c();
                        qd3 expiresAt = userSession.getExpiresAt();
                        xb4 xb4 = u02.x;
                        long expiresIn = userSession.getExpiresIn();
                        y02 y02 = y02.SECONDS;
                        long f0 = gl0.f0(expiresIn, y02);
                        expiresAt.getClass();
                        qd3 b = expiresAt.b(u02.l(f0)).b(u02.i(gl0.f0(userSession.getExpiresIn(), y02), 0.8d));
                        b.getClass();
                        c.getClass();
                        long h = u02.h(gl0.f0(b.w - c.w, y02), gl0.e0(b.x - c.x, y02.NANOSECONDS));
                        aVar.x(b, (qd3) null);
                        cf4 cf4 = aVar.d;
                        ms3 ms3 = (ms3) cf4.z;
                        String str2 = (String) cf4.y;
                        ub4 ub4 = ub4.w;
                        if (ms3.a(ub4)) {
                            ms3.b(ub4, str2, (Throwable) null, "Refreshing session in " + u02.k(h) + '.');
                        }
                        hvVar = this;
                        Object G = t49.G(t49.d0(h), hvVar);
                        if (G != obj4) {
                            G = obj2;
                        }
                        if (G != obj4) {
                            G = obj2;
                            break;
                        }
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    return obj2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc xcVar = new xc(aVar, userSession, (f61) null, 2);
                zc zcVar = new zc(aVar, userSession, (hn6) obj3, (f61) null, 1);
                gv gvVar = new gv(aVar, userSession, (f61) null, 0);
                hvVar.B = 2;
                if (a.m(aVar, xcVar, zcVar, gvVar, hvVar) != obj4) {
                    return obj2;
                }
                return obj4;
            case 1:
                int i4 = hvVar.B;
                if (i4 == 0) {
                    o85.q(obj);
                    is2 is2 = (is2) ((aq4) obj3).getValue();
                    if (z) {
                        str = (String) hvVar.D;
                    } else {
                        str = (String) obj5;
                    }
                    hvVar.B = 1;
                    if (is2.C(str, jw6.x, (Object) null, hvVar) == obj4) {
                        return obj4;
                    }
                    return obj2;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return obj2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                int i5 = hvVar.B;
                if (i5 == 0) {
                    o85.q(obj);
                    uj ujVar = (uj) hvVar.D;
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    Float f2 = new Float(f);
                    hvVar.B = 1;
                    if (uj.c(ujVar, f2, (hl) obj5, (Float) null, (vr2) null, hvVar, 12) == obj4) {
                        return obj4;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ((sr2) obj3).b();
                return obj2;
            default:
                aq4 aq4 = (aq4) obj5;
                int i6 = hvVar.B;
                if (i6 == 0) {
                    o85.q(obj);
                    eo5 eo5 = (eo5) aq4.getValue();
                    if (eo5 == null) {
                        return obj2;
                    }
                    ap4 ap4 = (ap4) obj3;
                    if (z) {
                        df3 = new fo5(eo5);
                    } else {
                        df3 = new do5(eo5);
                    }
                    if (ap4 != null) {
                        hvVar.D = aq4;
                        hvVar.B = 1;
                        if (ap4.b(df3, hvVar) == obj4) {
                            return obj4;
                        }
                    }
                } else if (i6 == 1) {
                    aq4 = hvVar.D;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aq4.setValue((Object) null);
                return obj2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hv(aq4 aq4, boolean z, ap4 ap4, f61 f61) {
        super(2, f61);
        this.A = 3;
        this.E = aq4;
        this.C = z;
        this.F = ap4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv(boolean z, Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = z;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
    }
}
