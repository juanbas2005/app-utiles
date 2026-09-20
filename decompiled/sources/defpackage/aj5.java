package defpackage;

/* renamed from: aj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aj5 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ dj5 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj5(int i, f61 f61, dj5 dj5) {
        super(1, f61);
        this.A = i;
        this.C = dj5;
    }

    public final f61 l(f61 f61) {
        switch (this.A) {
            case b85.b /*0*/:
                return new aj5(0, f61, this.C);
            case 1:
                return new aj5(1, f61, this.C);
            case 2:
                return new aj5(2, f61, this.C);
            case 3:
                return new aj5(3, f61, this.C);
            case 4:
                return new aj5(4, f61, this.C);
            default:
                return new aj5(5, f61, this.C);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i = this.A;
        dj5 dj5 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    ni5 ni5 = dj5.b;
                    this.B = 1;
                    obj2 = ni5.b(this);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj2);
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    ni5 ni52 = dj5.b;
                    boolean e = dj5.e(dj5);
                    this.B = 1;
                    obj3 = ni52.d(e, this);
                    if (obj3 == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    obj3 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj3);
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    ni5 ni53 = dj5.b;
                    boolean e2 = dj5.e(dj5);
                    this.B = 1;
                    obj4 = ni53.e(e2, this);
                    if (obj4 == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj4);
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    ni5 ni54 = dj5.b;
                    this.B = 1;
                    obj5 = ni54.f(this);
                    if (obj5 == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                    obj5 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj5);
            case 4:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    ni5 ni55 = dj5.b;
                    boolean e3 = dj5.e(dj5);
                    this.B = 1;
                    obj6 = ni55.i(e3, this);
                    if (obj6 == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj6 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj6);
            default:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    ni5 ni56 = dj5.b;
                    this.B = 1;
                    obj7 = ni56.o(this);
                    if (obj7 == p81) {
                        return p81;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                    obj7 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj7);
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b /*0*/:
                return ((aj5) l(f61)).s(vs7);
            case 1:
                return ((aj5) l(f61)).s(vs7);
            case 2:
                return ((aj5) l(f61)).s(vs7);
            case 3:
                return ((aj5) l(f61)).s(vs7);
            case 4:
                return ((aj5) l(f61)).s(vs7);
            default:
                return ((aj5) l(f61)).s(vs7);
        }
    }
}
