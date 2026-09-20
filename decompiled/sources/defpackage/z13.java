package defpackage;

/* renamed from: z13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z13 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ d37 C;
    public final /* synthetic */ c23 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z13(d37 d37, f61 f61, c23 c23, int i) {
        super(2, f61);
        this.A = i;
        this.C = d37;
        this.D = c23;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((z13) o(f61, o81)).s(vs7);
            case 1:
                return ((z13) o(f61, o81)).s(vs7);
            default:
                return ((z13) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        c23 c23 = this.D;
        d37 d37 = this.C;
        switch (i) {
            case b85.b:
                return new z13(d37, f61, c23, 0);
            case 1:
                return new z13(d37, f61, c23, 1);
            default:
                return new z13(d37, f61, c23, 2);
        }
    }

    public final Object s(Object obj) {
        Object value;
        Object f;
        Object value2;
        Object value3;
        Object value4;
        Object h;
        Object value5;
        Object value6;
        Object value7;
        Object i;
        Object value8;
        Object value9;
        int i2 = this.A;
        vs7 vs7 = vs7.a;
        c23 c23 = this.D;
        p81 p81 = p81.w;
        d37 d37 = this.C;
        switch (i2) {
            case b85.b:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    do {
                        value = d37.getValue();
                    } while (!d37.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
                    o03 o03 = (o03) ((is7) d37.getValue()).a;
                    k40 k40 = c23.c;
                    this.B = 1;
                    f = ((c50) k40).f(this);
                    if (f == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    f = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = f;
                if (!(obj2 instanceof m66)) {
                    do {
                        value3 = d37.getValue();
                    } while (!d37.i(value3, is7.a((is7) value3, (Object) null, false, (hv2) null, 5)));
                    return vs7;
                }
                do {
                    value2 = d37.getValue();
                } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) o66.a(obj2)), 1)));
                return vs7;
            case 1:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    do {
                        value4 = d37.getValue();
                    } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
                    o03 o032 = (o03) ((is7) d37.getValue()).a;
                    k40 k402 = c23.c;
                    this.B = 1;
                    h = ((c50) k402).h(this);
                    if (h == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                    h = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = h;
                if (!(obj3 instanceof m66)) {
                    do {
                        value6 = d37.getValue();
                    } while (!d37.i(value6, is7.a((is7) value6, (Object) null, false, (hv2) null, 5)));
                    return vs7;
                }
                do {
                    value5 = d37.getValue();
                } while (!d37.i(value5, is7.a((is7) value5, (Object) null, false, new hv2(25, (Object) o66.a(obj3)), 1)));
                return vs7;
            default:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    do {
                        value7 = d37.getValue();
                    } while (!d37.i(value7, b81.h((Object) null, (is7) value7, (Object) null, true, 1)));
                    o03 o033 = (o03) ((is7) d37.getValue()).a;
                    k40 k403 = c23.c;
                    this.B = 1;
                    i = ((c50) k403).i(this);
                    if (i == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                    i = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj4 = i;
                if (!(obj4 instanceof m66)) {
                    do {
                        value9 = d37.getValue();
                    } while (!d37.i(value9, is7.a((is7) value9, (Object) null, false, (hv2) null, 5)));
                    return vs7;
                }
                do {
                    value8 = d37.getValue();
                } while (!d37.i(value8, is7.a((is7) value8, (Object) null, false, new hv2(25, (Object) o66.a(obj4)), 1)));
                return vs7;
        }
    }
}
