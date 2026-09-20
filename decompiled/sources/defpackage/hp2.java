package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: hp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hp2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ np2 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp2(np2 np2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = np2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((hp2) o(f61, o81)).s(vs7);
            case 1:
                return ((hp2) o(f61, o81)).s(vs7);
            case 2:
                return ((hp2) o(f61, o81)).s(vs7);
            case 3:
                return ((hp2) o(f61, o81)).s(vs7);
            case 4:
                return ((hp2) o(f61, o81)).s(vs7);
            default:
                return ((hp2) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        np2 np2 = this.C;
        switch (i) {
            case b85.b:
                return new hp2(np2, f61, 0);
            case 1:
                return new hp2(np2, f61, 1);
            case 2:
                return new hp2(np2, f61, 2);
            case 3:
                return new hp2(np2, f61, 3);
            case 4:
                return new hp2(np2, f61, 4);
            default:
                return new hp2(np2, f61, 5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0158, code lost:
        if (r5 == r6) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019d, code lost:
        if (r0 == r6) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return r6;
     */
    public final Object s(Object obj) {
        Object obj2;
        Object value;
        is7 is7;
        Object obj3;
        Object value2;
        is7 is72;
        Object obj4;
        Object value3;
        Object value4;
        is7 is73;
        Object value5;
        int i = this.A;
        vs7 vs7 = vs7.a;
        np2 np2 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    dy7 dy7 = (dy7) np2.d;
                    di2 L = gr8.L(new c6(dy7.a.b(), 17), dy7.b);
                    gp2 gp2 = new gp2(np2, 0);
                    this.B = 1;
                    if (L.a(gp2, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    c6 c6Var = new c6(((dy7) np2.c.c).d(), 0);
                    gp2 gp22 = new gp2(np2, 1);
                    this.B = 1;
                    if (c6Var.a(gp22, this) == p81) {
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
                d37 d37 = np2.e;
                sn2 sn2 = np2.b;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    lo2 lo2 = (lo2) sn2;
                    obj3 = ar7.e0(lo2.b, new ju1(lo2, (f61) null, 6), this);
                    break;
                } else if (i4 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else if (i4 == 2) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                    if (!(obj2 instanceof m66)) {
                        List list = (List) obj2;
                        do {
                            value = d37.getValue();
                            is7 = (is7) value;
                        } while (!d37.i(value, is7.a(is7, mo2.a((mo2) is7.a, (ArrayList) null, list, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16381), false, (hv2) null, 6)));
                    }
                    Throwable a = o66.a(obj2);
                    if (a != null) {
                        np2.f(a);
                    }
                    np2.g();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                do {
                    value2 = d37.getValue();
                    is72 = (is7) value2;
                } while (!d37.i(value2, is7.a(is72, mo2.a((mo2) is72.a, (ArrayList) null, (List) null, (String) null, (String) null, false, booleanValue, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16351), false, (hv2) null, 6)));
                this.B = 2;
                obj2 = ((lo2) sn2).m(this);
                break;
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    dv7 dv7 = np2.d;
                    this.B = 1;
                    if (((dy7) dv7).x(this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 4:
                d37 d372 = np2.e;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    do {
                        value5 = d372.getValue();
                    } while (!d372.i(value5, new is7(mo2.a((mo2) ((is7) value5).a, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 12287), true, new hv2(25, (Object) null))));
                    mo2 mo2 = (mo2) ((is7) d372.getValue()).a;
                    sn2 sn22 = np2.b;
                    String str = mo2.c;
                    String str2 = mo2.d;
                    this.B = 1;
                    obj4 = ((lo2) sn22).p(0, 10, str, str2, this);
                    if (obj4 == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj4 instanceof m66)) {
                    pn2 pn2 = (pn2) obj4;
                    do {
                        value4 = d372.getValue();
                        is73 = (is7) value4;
                    } while (!d372.i(value4, is7.a(is73, mo2.a((mo2) is73.a, pn2.a, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, !pn2.b, 4094), false, (hv2) null, 4)));
                }
                Throwable a2 = o66.a(obj4);
                if (a2 == null) {
                    return vs7;
                }
                do {
                    value3 = d372.getValue();
                } while (!d372.i(value3, is7.a((is7) value3, (Object) null, false, new hv2(25, (Object) a2), 1)));
                return vs7;
            default:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (t49.G(400, this) == p81) {
                        return p81;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                np2.g();
                return vs7;
        }
    }
}
