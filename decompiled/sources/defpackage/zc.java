package defpackage;

import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: zc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zc extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    public final f61 l(f61 f61) {
        int i = this.A;
        Object obj = this.D;
        Object obj2 = this.E;
        Object obj3 = this.C;
        switch (i) {
            case b85.b:
                is2 is2 = (is2) obj2;
                return new zc((bd) obj3, this.D, is2, f61, 0);
            case 1:
                return new zc((a) obj3, (UserSession) obj, (hn6) obj2, f61, 1);
            case 2:
                return new zc((vd5) obj3, (jl7) obj, (gs2) obj2, f61, 2);
            default:
                return new zc((ek7) obj3, (hq4) obj, (ne1) obj2, f61, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (defpackage.b35.C(1500, r12, r11) == r3) goto L_0x0050;
     */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        Object obj2 = this.C;
        Object obj3 = this.D;
        Object obj4 = this.E;
        switch (i) {
            case b85.b:
                bd bdVar = (bd) obj2;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    bdVar.l.setValue(obj3);
                    wc wcVar = new wc(bdVar, 3);
                    p0 p0Var = new p0((Object) (is2) obj4, (Object) bdVar, (f61) null, 6);
                    this.B = 1;
                    if (rc.c(wcVar, p0Var, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!((Boolean) bdVar.a.y(obj3)).booleanValue()) {
                    return vs7;
                }
                bdVar.n.a(bdVar.b().c(obj3), bdVar.k.d());
                bdVar.h.setValue(obj3);
                bdVar.f(obj3);
                return vs7;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (uu.c((a) obj2, (UserSession) obj3, (hn6) obj4, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object e = ((vd5) obj2).e((jl7) obj3, (gs2) obj4, this);
                    if (e == p81) {
                        return p81;
                    }
                    return e;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                ne1 ne1 = (ne1) obj4;
                hq4 hq4 = (hq4) obj3;
                ek7 ek7 = (ek7) obj2;
                int i5 = this.B;
                hq4 hq42 = hq4.y;
                if (i5 == 0) {
                    o85.q(obj);
                    if (hq4 != hq4.x) {
                        gw6 gw6 = new gw6(ne1, (f61) null, 8);
                        this.B = 2;
                        break;
                    } else {
                        this.B = 1;
                        if (ne1.y(this) == p81) {
                        }
                    }
                    return p81;
                } else if (i5 == 1 || i5 == 2) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        if (hq4 != hq42) {
                            ek7.a();
                        }
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (hq4 == hq42) {
                    return vs7;
                }
                ek7.a();
                return vs7;
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((zc) l(f61)).s(vs7);
            case 1:
                return ((zc) l(f61)).s(vs7);
            case 2:
                return ((zc) l(f61)).s(vs7);
            default:
                return ((zc) l(f61)).s(vs7);
        }
    }
}
