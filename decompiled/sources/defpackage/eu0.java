package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eu0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eu0(d37 d37, f61 f61, fq6 fq6, int i, az7 az7) {
        super(2, f61);
        this.A = 5;
        this.D = d37;
        this.E = fq6;
        this.C = i;
        this.F = az7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((eu0) o(f61, o81)).s(vs7);
            case 1:
                return ((eu0) o(f61, o81)).s(vs7);
            case 2:
                return ((eu0) o(f61, o81)).s(vs7);
            case 3:
                return ((eu0) o(f61, o81)).s(vs7);
            case 4:
                return ((eu0) o(f61, o81)).s(vs7);
            default:
                return ((eu0) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.F;
        Object obj3 = this.E;
        Object obj4 = this.D;
        switch (i) {
            case b85.b:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ad0 ad0 = (ad0) obj2;
                return new eu0((Object) (di2[]) obj4, this.C, (Object) atomicInteger, (Object) ad0, f61, 0);
            case 1:
                re3 re3 = (re3) obj3;
                yh0 yh0 = (yh0) obj2;
                return new eu0((Object) (s34) obj4, this.C, (Object) re3, (Object) yh0, f61, 1);
            case 2:
                String str = (String) obj3;
                String str2 = (String) obj2;
                return new eu0((Object) (np2) obj4, this.C, (Object) str, (Object) str2, f61, 2);
            case 3:
                tm2 tm2 = (tm2) obj2;
                return new eu0((np2) obj4, (String) obj3, this.C, (Object) tm2, f61, 3);
            case 4:
                en2 en2 = (en2) obj2;
                return new eu0((np2) obj4, (String) obj3, this.C, (Object) en2, f61, 4);
            default:
                return new eu0((d37) obj4, f61, (fq6) obj3, this.C, (az7) obj2);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object value;
        is7 is7;
        Object obj3;
        Object obj4;
        Object value2;
        Object p;
        Object value3;
        Object value4;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj5 = this.F;
        int i2 = this.C;
        Object obj6 = this.E;
        p81 p81 = p81.w;
        Object obj7 = this.D;
        switch (i) {
            case b85.b:
                AtomicInteger atomicInteger = (AtomicInteger) obj6;
                ad0 ad0 = (ad0) obj5;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    di2 di2 = ((di2[]) obj7)[i2];
                    du0 du0 = new du0(ad0, i2);
                    this.B = 1;
                    if (di2.a(du0, this) == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            ad0.h((Throwable) null);
                        }
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (atomicInteger.decrementAndGet() != 0) {
                    return vs7;
                }
                ad0.h((Throwable) null);
                return vs7;
            case 1:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (s34.l((s34) obj7, (((i2 - ((re3) obj6).w) * 12) + ((yh0) obj5).b) - 1, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                np2 np2 = (np2) obj7;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj2 = ((lo2) np2.b).p(i2, 10, (String) obj6, (String) obj5, this);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj2 instanceof m66)) {
                    np2.h(new gg0(28, (Object) (pn2) obj2));
                }
                Throwable a = o66.a(obj2);
                if (a == null) {
                    return vs7;
                }
                d37 d37 = np2.e;
                do {
                    value = d37.getValue();
                    is7 = (is7) value;
                } while (!d37.i(value, is7.a(is7, mo2.a((mo2) is7.a, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 12287), false, (hv2) null, 6)));
                np2.f(a);
                return vs7;
            case 3:
                String str = (String) obj6;
                np2 np22 = (np2) obj7;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    sn2 sn2 = np22.b;
                    this.B = 1;
                    obj3 = ((lo2) sn2).s(i2, this, str);
                    if (obj3 == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj3 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tm2 tm2 = (tm2) obj5;
                Throwable a2 = o66.a(obj3);
                if (a2 == null) {
                    return vs7;
                }
                np22.h(new mp2(str, i2, tm2, 0));
                np22.f(a2);
                return vs7;
            case 4:
                String str2 = (String) obj6;
                np2 np23 = (np2) obj7;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    sn2 sn22 = np23.b;
                    this.B = 1;
                    obj4 = ((lo2) sn22).t(i2, this, str2);
                    if (obj4 == p81) {
                        return p81;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                en2 en2 = (en2) obj5;
                Throwable a3 = o66.a(obj4);
                if (a3 == null) {
                    return vs7;
                }
                np23.h(new mp2(str2, i2, en2, 1));
                np23.f(a3);
                return vs7;
            default:
                d37 d372 = (d37) obj7;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    do {
                        value2 = d372.getValue();
                    } while (!d372.i(value2, b81.h((Object) null, (is7) value2, (Object) null, true, 1)));
                    zn6 zn6 = (zn6) ((is7) d372.getValue()).a;
                    this.B = 1;
                    p = ((fq6) obj6).b.p(i2, (az7) obj5, this);
                    if (p == p81) {
                        return p81;
                    }
                } else if (i8 == 1) {
                    o85.q(obj);
                    p = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj8 = p;
                if (!(obj8 instanceof m66)) {
                    do {
                        value4 = d372.getValue();
                    } while (!d372.i(value4, is7.a((is7) value4, (Object) null, false, (hv2) null, 5)));
                    return vs7;
                }
                do {
                    value3 = d372.getValue();
                } while (!d372.i(value3, is7.a((is7) value3, (Object) null, false, new hv2(25, (Object) o66.a(obj8)), 1)));
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu0(np2 np2, String str, int i, Object obj, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.D = np2;
        this.E = str;
        this.C = i;
        this.F = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu0(Object obj, int i, Object obj2, Object obj3, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.D = obj;
        this.C = i;
        this.E = obj2;
        this.F = obj3;
    }
}
