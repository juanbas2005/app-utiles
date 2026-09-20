package defpackage;

/* renamed from: cq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cq6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ d37 C;
    public final /* synthetic */ fq6 D;
    public final /* synthetic */ int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq6(d37 d37, f61 f61, fq6 fq6, int i, int i2) {
        super(2, f61);
        this.A = i2;
        this.C = d37;
        this.D = fq6;
        this.E = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((cq6) o(f61, o81)).s(vs7);
            default:
                return ((cq6) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new cq6(this.C, f61, this.D, this.E, 0);
            default:
                return new cq6(this.C, f61, this.D, this.E, 1);
        }
    }

    public final Object s(Object obj) {
        Object value;
        Object l;
        Object value2;
        Object value3;
        Object value4;
        Object w;
        Object value5;
        Object value6;
        int i = this.A;
        vs7 vs7 = vs7.a;
        int i2 = this.E;
        fq6 fq6 = this.D;
        p81 p81 = p81.w;
        d37 d37 = this.C;
        switch (i) {
            case b85.b:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    do {
                        value = d37.getValue();
                    } while (!d37.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
                    zn6 zn6 = (zn6) ((is7) d37.getValue()).a;
                    vp6 vp6 = fq6.b;
                    this.B = 1;
                    l = vp6.l(i2, this);
                    if (l == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    l = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = l;
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
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    do {
                        value4 = d37.getValue();
                    } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
                    zn6 zn62 = (zn6) ((is7) d37.getValue()).a;
                    vp6 vp62 = fq6.b;
                    this.B = 1;
                    w = vp62.w(i2, this);
                    if (w == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                    w = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = w;
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
        }
    }
}
