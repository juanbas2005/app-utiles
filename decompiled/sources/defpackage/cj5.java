package defpackage;

/* renamed from: cj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cj5 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ dj5 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cj5(int i, f61 f61, dj5 dj5) {
        super(1, f61);
        this.A = 1;
        this.C = i;
        this.D = dj5;
    }

    public final f61 l(f61 f61) {
        switch (this.A) {
            case b85.b:
                return new cj5(this.D, this.C, f61, 0);
            case 1:
                return new cj5(this.C, f61, this.D);
            case 2:
                return new cj5(this.D, this.C, f61, 2);
            default:
                return new cj5(this.D, this.C, f61, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r9 == r5) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r9 == r5) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r9 == r5) goto L_0x00a4;
     */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = this.A;
        int i2 = this.C;
        dj5 dj5 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    ni5 ni5 = dj5.b;
                    boolean e = dj5.e(dj5);
                    this.B = 1;
                    obj2 = ni5.h(i2, e, this);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj2);
            case 1:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ni5 ni52 = dj5.b;
                            this.B = 2;
                            obj3 = ni52.l(this);
                            break;
                        } else {
                            ni5 ni53 = dj5.b;
                            this.B = 3;
                            obj3 = ni53.k(this);
                            break;
                        }
                    } else {
                        ni5 ni54 = dj5.b;
                        this.B = 1;
                        obj3 = ni54.j(this);
                        break;
                    }
                    return p81;
                } else if (i4 == 1 || i4 == 2 || i4 == 3) {
                    o85.q(obj);
                    obj3 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj3);
            case 2:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    ni5 ni55 = dj5.b;
                    boolean e2 = dj5.e(dj5);
                    this.B = 1;
                    obj4 = ni55.m(i2, e2, this);
                    if (obj4 == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj4);
            default:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    ni5 ni56 = dj5.b;
                    boolean e3 = dj5.e(dj5);
                    this.B = 1;
                    obj5 = ni56.n(i2, e3, this);
                    if (obj5 == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj5 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj5);
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((cj5) l(f61)).s(vs7);
            case 1:
                return ((cj5) l(f61)).s(vs7);
            case 2:
                return ((cj5) l(f61)).s(vs7);
            default:
                return ((cj5) l(f61)).s(vs7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj5(dj5 dj5, int i, f61 f61, int i2) {
        super(1, f61);
        this.A = i2;
        this.D = dj5;
        this.C = i;
    }
}
