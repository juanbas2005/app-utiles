package defpackage;

/* renamed from: kq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kq5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ d37 C;
    public final /* synthetic */ lq5 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq5(d37 d37, f61 f61, lq5 lq5, int i) {
        super(2, f61);
        this.A = i;
        this.C = d37;
        this.D = lq5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((kq5) o(f61, o81)).s(vs7);
            case 1:
                return ((kq5) o(f61, o81)).s(vs7);
            case 2:
                return ((kq5) o(f61, o81)).s(vs7);
            case 3:
                return ((kq5) o(f61, o81)).s(vs7);
            case 4:
                return ((kq5) o(f61, o81)).s(vs7);
            case 5:
                return ((kq5) o(f61, o81)).s(vs7);
            case 6:
                return ((kq5) o(f61, o81)).s(vs7);
            default:
                return ((kq5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new kq5(this.C, f61, this.D, 0);
            case 1:
                return new kq5(this.C, f61, this.D, 1);
            case 2:
                return new kq5(this.C, f61, this.D, 2);
            case 3:
                return new kq5(this.C, f61, this.D, 3);
            case 4:
                return new kq5(this.C, f61, this.D, 4);
            case 5:
                return new kq5(this.C, f61, this.D, 5);
            case 6:
                return new kq5(this.C, f61, this.D, 6);
            default:
                return new kq5(this.C, f61, this.D, 7);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object value3;
        Object obj3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object obj4;
        Object value8;
        Object value9;
        Object value10;
        Object obj5;
        Object value11;
        Object value12;
        Object value13;
        Object obj6;
        Object value14;
        Object value15;
        Object value16;
        Object value17;
        Object obj7;
        Object value18;
        Object value19;
        Object value20;
        Object value21;
        Object obj8;
        Object value22;
        Object value23;
        Object value24;
        Object value25;
        Object obj9;
        Object value26;
        Object value27;
        Object value28;
        Object value29;
        int i = this.A;
        Object obj10 = p81.w;
        d37 d37 = this.C;
        lq5 lq5 = this.D;
        Object obj11 = vs7.a;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    do {
                        value3 = d37.getValue();
                    } while (!d37.i(value3, b81.h((Object) null, (is7) value3, (Object) null, true, 1)));
                    wp5 wp5 = (wp5) ((is7) d37.getValue()).a;
                    p7 p7Var = lq5.b;
                    this.B = 1;
                    obj2 = p7Var.f(this);
                    if (obj2 == obj10) {
                        return obj10;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj2 instanceof m66)) {
                    do {
                        value2 = d37.getValue();
                    } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value = d37.getValue();
                    } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj2)), 1)));
                }
                return obj11;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    do {
                        value7 = d37.getValue();
                    } while (!d37.i(value7, b81.h((Object) null, (is7) value7, (Object) null, true, 1)));
                    wp5 wp52 = (wp5) ((is7) d37.getValue()).a;
                    p7 p7Var2 = lq5.b;
                    String str = wp52.e.a;
                    String str2 = wp52.f.a;
                    String str3 = wp52.g.a;
                    String str4 = wp52.i.a;
                    this.B = 1;
                    obj3 = p7Var2.i(str, str2, str3, str4, this);
                    if (obj3 == obj10) {
                        return obj10;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    obj3 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj3 instanceof m66)) {
                    if (((Boolean) obj3).booleanValue()) {
                        d37 d372 = lq5.c;
                        do {
                            value6 = d372.getValue();
                        } while (!pb4.t(wp5.a((wp5) ((is7) value6).a, (u5) null, (a54) null, (b54) null, rv.y, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16375), 6, d372, value6));
                    }
                    obj3 = obj11;
                }
                if (!(obj3 instanceof m66)) {
                    do {
                        value5 = d37.getValue();
                    } while (!d37.i(value5, is7.a((is7) value5, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value4 = d37.getValue();
                    } while (!d37.i(value4, is7.a((is7) value4, (Object) null, false, new hv2(25, (Object) o66.a(obj3)), 1)));
                }
                return obj11;
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    do {
                        value10 = d37.getValue();
                    } while (!d37.i(value10, b81.h((Object) null, (is7) value10, (Object) null, true, 1)));
                    p7 p7Var3 = lq5.b;
                    String str5 = ((wp5) ((is7) d37.getValue()).a).f.a;
                    this.B = 1;
                    obj4 = p7Var3.m(str5, this);
                    if (obj4 == obj10) {
                        return obj10;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj4 instanceof m66)) {
                    do {
                        value9 = d37.getValue();
                    } while (!d37.i(value9, is7.a((is7) value9, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value8 = d37.getValue();
                    } while (!d37.i(value8, is7.a((is7) value8, (Object) null, false, new hv2(25, (Object) o66.a(obj4)), 1)));
                }
                return obj11;
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    do {
                        value13 = d37.getValue();
                    } while (!d37.i(value13, b81.h((Object) null, (is7) value13, (Object) null, true, 1)));
                    p7 p7Var4 = lq5.b;
                    String str6 = ((wp5) ((is7) d37.getValue()).a).f.a;
                    this.B = 1;
                    obj5 = p7Var4.j(str6, this);
                    if (obj5 == obj10) {
                        return obj10;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                    obj5 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj5 instanceof m66)) {
                    do {
                        value12 = d37.getValue();
                    } while (!d37.i(value12, is7.a((is7) value12, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value11 = d37.getValue();
                    } while (!d37.i(value11, is7.a((is7) value11, (Object) null, false, new hv2(25, (Object) o66.a(obj5)), 1)));
                }
                return obj11;
            case 4:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    do {
                        value17 = d37.getValue();
                    } while (!d37.i(value17, b81.h((Object) null, (is7) value17, (Object) null, true, 1)));
                    wp5 wp53 = (wp5) ((is7) d37.getValue()).a;
                    p7 p7Var5 = lq5.b;
                    String str7 = wp53.f.a;
                    String str8 = wp53.j.a;
                    String str9 = wp53.g.a;
                    this.B = 1;
                    obj6 = p7Var5.k(str7, str8, str9, this);
                    if (obj6 == obj10) {
                        return obj10;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj6 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj6 instanceof m66)) {
                    vs7 vs7 = (vs7) obj6;
                    d37 d373 = lq5.c;
                    do {
                        value16 = d373.getValue();
                    } while (!pb4.t(wp5.a((wp5) ((is7) value16).a, (u5) null, (a54) null, (b54) null, rv.w, (if7) null, (if7) null, new if7(new String(), (String) null), new if7(new String(), (String) null), (if7) null, new if7(new String(), (String) null), (if7) null, (if7) null, false, (Integer) null, 15671), 6, d373, value16));
                    obj6 = obj11;
                }
                if (!(obj6 instanceof m66)) {
                    do {
                        value15 = d37.getValue();
                    } while (!d37.i(value15, is7.a((is7) value15, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value14 = d37.getValue();
                    } while (!d37.i(value14, is7.a((is7) value14, (Object) null, false, new hv2(25, (Object) o66.a(obj6)), 1)));
                }
                return obj11;
            case 5:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    do {
                        value21 = d37.getValue();
                    } while (!d37.i(value21, b81.h((Object) null, (is7) value21, (Object) null, true, 1)));
                    p7 p7Var6 = lq5.b;
                    String str10 = ((wp5) ((is7) d37.getValue()).a).f.a;
                    this.B = 1;
                    obj7 = p7Var6.m(str10, this);
                    if (obj7 == obj10) {
                        return obj10;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                    obj7 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj7 instanceof m66)) {
                    vs7 vs72 = (vs7) obj7;
                    d37 d374 = lq5.c;
                    do {
                        value20 = d374.getValue();
                    } while (!pb4.t(wp5.a((wp5) ((is7) value20).a, (u5) null, (a54) null, (b54) null, rv.A, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16375), 6, d374, value20));
                    obj7 = obj11;
                }
                if (!(obj7 instanceof m66)) {
                    do {
                        value19 = d37.getValue();
                    } while (!d37.i(value19, is7.a((is7) value19, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value18 = d37.getValue();
                    } while (!d37.i(value18, is7.a((is7) value18, (Object) null, false, new hv2(25, (Object) o66.a(obj7)), 1)));
                }
                return obj11;
            case 6:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    do {
                        value25 = d37.getValue();
                    } while (!d37.i(value25, b81.h((Object) null, (is7) value25, (Object) null, true, 1)));
                    wp5 wp54 = (wp5) ((is7) d37.getValue()).a;
                    p7 p7Var7 = lq5.b;
                    this.B = 1;
                    obj8 = p7Var7.p(this);
                    if (obj8 == obj10) {
                        return obj10;
                    }
                } else if (i8 == 1) {
                    o85.q(obj);
                    obj8 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj8 instanceof m66)) {
                    vs7 vs73 = (vs7) obj8;
                    d37 d375 = lq5.c;
                    do {
                        value24 = d375.getValue();
                    } while (!pb4.t(wp5.a((wp5) ((is7) value24).a, (u5) null, (a54) null, (b54) null, rv.w, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16375), 6, d375, value24));
                    obj8 = obj11;
                }
                if (!(obj8 instanceof m66)) {
                    do {
                        value23 = d37.getValue();
                    } while (!d37.i(value23, is7.a((is7) value23, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value22 = d37.getValue();
                    } while (!d37.i(value22, is7.a((is7) value22, (Object) null, false, new hv2(25, (Object) o66.a(obj8)), 1)));
                }
                return obj11;
            default:
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    do {
                        value29 = d37.getValue();
                    } while (!d37.i(value29, b81.h((Object) null, (is7) value29, (Object) null, true, 1)));
                    wp5 wp55 = (wp5) ((is7) d37.getValue()).a;
                    p7 p7Var8 = lq5.b;
                    String str11 = wp55.f.a;
                    String str12 = wp55.j.a;
                    this.B = 1;
                    obj9 = p7Var8.u(str11, str12, this);
                    if (obj9 == obj10) {
                        return obj10;
                    }
                } else if (i9 == 1) {
                    o85.q(obj);
                    obj9 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj9 instanceof m66)) {
                    vs7 vs74 = (vs7) obj9;
                    d37 d376 = lq5.c;
                    do {
                        value28 = d376.getValue();
                    } while (!pb4.t(wp5.a((wp5) ((is7) value28).a, (u5) null, (a54) null, (b54) null, rv.w, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, new if7(new String(), (String) null), (if7) null, (if7) null, false, (Integer) null, 15863), 6, d376, value28));
                    obj9 = obj11;
                }
                if (!(obj9 instanceof m66)) {
                    do {
                        value27 = d37.getValue();
                    } while (!d37.i(value27, is7.a((is7) value27, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value26 = d37.getValue();
                    } while (!d37.i(value26, is7.a((is7) value26, (Object) null, false, new hv2(25, (Object) o66.a(obj9)), 1)));
                }
                return obj11;
        }
    }
}
