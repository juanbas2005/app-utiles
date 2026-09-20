package defpackage;

import android.util.Log;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.Time;
import java.util.Map;

/* renamed from: ea  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ea extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ Object C;
    public Object D;
    public Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ea(sy1 sy1, vc vcVar, f61 f61) {
        super(3, f61);
        this.A = 1;
        this.D = sy1;
        this.E = vcVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0328, code lost:
        if (r1 == r8) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r0 == r8) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        if (r1 == r8) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0185, code lost:
        if (r1 == r8) goto L_0x01a1;
     */
    public final Object s(Object obj) {
        Object obj2;
        iz0 iz0;
        Object obj3;
        Object obj4;
        Throwable th;
        Object obj5;
        Object obj6;
        fp7 fp7;
        Object obj7;
        int i = this.A;
        Object obj8 = vs7.a;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                yg5 yg5 = (yg5) this.C;
                yl1 yl1 = (yl1) this.D;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.C = yg5;
                    this.D = null;
                    this.B = 1;
                    obj2 = ((gs2) this.E).H(yl1, this);
                    break;
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = obj;
                } else if (i2 == 2) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yl1 yl12 = (yl1) obj2;
                if (yl12 == null) {
                    return obj8;
                }
                this.C = null;
                this.D = null;
                this.B = 2;
                if (yg5.d(this, yl12) != p81) {
                    return obj8;
                }
                return p81;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    m0 m0Var = new m0(2, (vc) this.E, (ad) this.C);
                    this.B = 1;
                    if (((sy1) this.D).H(m0Var, this) == p81) {
                        return p81;
                    }
                    return obj8;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                yg5 yg52 = (yg5) this.C;
                yl1 yl13 = (yl1) this.D;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 == 1) {
                        iz0 iz02 = (iz0) this.E;
                        try {
                            o85.q(obj);
                            iz0 = iz02;
                            obj3 = obj;
                        } catch (Throwable th2) {
                            obj8 = new m66(th2);
                            break;
                        }
                    } else if (i4 == 2) {
                        o85.q(obj);
                        return obj8;
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    l43 V = yl13.V();
                    iz0 = V.getAttributes();
                    au auVar = hx1.a;
                    iz0.getClass();
                    auVar.getClass();
                    if (iz0.c().containsKey(auVar)) {
                        cc4 a = hx1.a();
                        a.getClass();
                        if (!a.e()) {
                            return obj8;
                        }
                        a.h("Skipping body saving for " + V.c().D());
                        return obj8;
                    }
                    cc4 a2 = hx1.a();
                    a2.getClass();
                    if (a2.e()) {
                        a2.h("Saving body for " + V.c().D());
                    }
                    this.C = yg52;
                    this.D = yl13;
                    this.E = iz0;
                    this.B = 1;
                    obj3 = n85.n(V, this);
                    if (obj3 == p81) {
                        return p81;
                    }
                }
                yl1 d = ((l43) obj3).d();
                try {
                    t49.w(yl13.b());
                    obj4 = obj8;
                } catch (Throwable th3) {
                    obj4 = new m66(th3);
                }
                Throwable a3 = o66.a(obj4);
                if (a3 != null) {
                    hx1.a().f("Failed to cancel response body", a3);
                }
                iz0.e(hx1.b, obj8);
                this.C = null;
                this.D = null;
                this.E = null;
                this.B = 2;
                if (yg52.d(this, d) != p81) {
                    return obj8;
                }
                return p81;
            case 3:
                yg5 yg53 = (yg5) this.C;
                Object obj9 = this.D;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    if (obj9 instanceof l43) {
                        s53 s53 = ((j43) this.E).C;
                        yl1 d2 = ((l43) obj9).d();
                        this.C = yg53;
                        this.D = obj9;
                        this.B = 1;
                        obj5 = s53.a(obj8, d2, this);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder("Error: HttpClientCall expected, but found ");
                        sb.append(obj9);
                        gq3 b = b26.a.b(obj9.getClass());
                        sb.append('(');
                        sb.append(b);
                        sb.append(").");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                    obj5 = obj;
                } else if (i5 == 2) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yl1 yl14 = (yl1) obj5;
                l43 l43 = (l43) obj9;
                l43.getClass();
                yl14.getClass();
                l43.y = yl14;
                this.C = null;
                this.D = null;
                this.B = 2;
                if (yg53.d(this, obj9) != p81) {
                    return obj8;
                }
                return p81;
            case 4:
                wk6 wk6 = (wk6) this.C;
                y53 y53 = (y53) this.D;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    this.C = wk6;
                    this.D = y53;
                    this.B = 1;
                    obj6 = wk6.w.a(y53, this);
                    break;
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj6 = obj;
                } else if (i6 == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l43 l432 = (l43) obj6;
                if (!w53.a.contains(l432.c().getMethod())) {
                    return l432;
                }
                j43 j43 = ((vr0) this.E).a;
                this.C = null;
                this.D = null;
                this.B = 2;
                Object a4 = w53.a(wk6, y53, l432, j43, this);
                if (a4 != p81) {
                    return a4;
                }
                return p81;
            case 5:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    SessionData sessionData = new SessionData(((es6) this.E).b.a((SessionDetails) null), (Time) null, (Map) null, 4, (hl1) null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + ((Throwable) this.D).getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.C = null;
                    this.B = 1;
                    if (((fi2) this.C).k(sessionData, this) == p81) {
                        return p81;
                    }
                    return obj8;
                } else if (i7 == 1) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                yg5 yg54 = (yg5) this.C;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    h63 h63 = (h63) yg54.b();
                    fp7 = h63.a;
                    Object obj10 = h63.b;
                    if (obj10 instanceof hf0) {
                        Object obj11 = new Object();
                        yl1 d3 = ((l43) yg54.w).d();
                        this.C = yg54;
                        this.D = fp7;
                        this.B = 1;
                        obj7 = ((js2) this.E).K(obj11, d3, obj10, fp7, this);
                        break;
                    } else {
                        return obj8;
                    }
                } else if (i8 == 1) {
                    o85.q(obj);
                    fp7 = (fp7) this.D;
                    obj7 = obj;
                    if (obj7 == null) {
                        return obj8;
                    }
                    if ((obj7 instanceof m15) || fp7.a.L(obj7)) {
                        h63 h632 = new h63(fp7, obj7);
                        this.C = null;
                        this.D = null;
                        this.B = 2;
                        if (yg54.d(this, h632) != p81) {
                            return obj8;
                        }
                        return p81;
                    }
                    ku4.l("transformResponseBody returned ", obj7, " but expected value of type ", fp7);
                } else if (i8 == 2) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
        Throwable a5 = o66.a(obj8);
        if (a5 != null) {
            hx1.a().f("Failed to cancel response body", a5);
        }
        throw th;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ea eaVar = new ea((Object) (gs2) this.E, (f61) obj3, 0);
                eaVar.C = (yg5) obj;
                eaVar.D = (yl1) obj2;
                return eaVar.s(vs7);
            case 1:
                ll1 ll1 = (ll1) obj2;
                ea eaVar2 = new ea((sy1) this.D, (vc) this.E, (f61) obj3);
                eaVar2.C = (ad) obj;
                return eaVar2.s(vs7);
            case 2:
                ea eaVar3 = new ea(3, (f61) obj3);
                eaVar3.C = (yg5) obj;
                eaVar3.D = (yl1) obj2;
                return eaVar3.s(vs7);
            case 3:
                ea eaVar4 = new ea((Object) (j43) this.E, (f61) obj3, 3);
                eaVar4.C = (yg5) obj;
                eaVar4.D = obj2;
                return eaVar4.s(vs7);
            case 4:
                ea eaVar5 = new ea((Object) (vr0) this.E, (f61) obj3, 4);
                eaVar5.C = (wk6) obj;
                eaVar5.D = (y53) obj2;
                return eaVar5.s(vs7);
            case 5:
                ea eaVar6 = new ea((Object) (es6) this.E, (f61) obj3, 5);
                eaVar6.C = (fi2) obj;
                eaVar6.D = (Throwable) obj2;
                return eaVar6.s(vs7);
            default:
                h63 h63 = (h63) obj2;
                ea eaVar7 = new ea((Object) (js2) this.E, (f61) obj3, 6);
                eaVar7.C = (yg5) obj;
                return eaVar7.s(vs7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(int i, f61 f61) {
        super(i, f61);
        this.A = 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(Object obj, f61 f61, int i) {
        super(3, f61);
        this.A = i;
        this.E = obj;
    }
}
