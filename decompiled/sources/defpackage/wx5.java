package defpackage;

/* renamed from: wx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wx5 extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ yg5 C;
    public final /* synthetic */ hs2 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx5(hs2 hs2, f61 f61, int i) {
        super(3, f61);
        this.A = i;
        this.D = hs2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r0 != r6) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r0 != r6) goto L_0x00c7;
     */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A;
        vs7 vs7 = vs7.a;
        hs2 hs2 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                yg5 yg5 = this.C;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 == 1) {
                        try {
                            o85.q(obj);
                            return vs7;
                        } catch (Throwable th) {
                            x53 c = ((l43) yg5.w).c();
                            this.C = null;
                            this.B = 2;
                            obj2 = hs2.u(c, th, this);
                            break;
                        }
                    } else if (i2 == 2) {
                        o85.q(obj);
                        obj2 = obj;
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    this.C = yg5;
                    this.B = 1;
                    if (yg5.c(this) != p81) {
                        return vs7;
                    }
                    return p81;
                }
                Throwable th2 = (Throwable) obj2;
                if (th2 == null) {
                    return vs7;
                }
                throw th2;
            case 1:
                yg5 yg52 = this.C;
                int i3 = this.B;
                if (i3 != 0) {
                    if (i3 == 1) {
                        try {
                            o85.q(obj);
                            return vs7;
                        } catch (Throwable th3) {
                            cc4 cc4 = g43.a;
                            f43 f43 = new f43((y53) yg52.w);
                            this.C = null;
                            this.B = 2;
                            obj3 = hs2.u(f43, th3, this);
                            break;
                        }
                    } else if (i3 == 2) {
                        o85.q(obj);
                        obj3 = obj;
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    this.C = yg52;
                    this.B = 1;
                    if (yg52.c(this) != p81) {
                        return vs7;
                    }
                    return p81;
                }
                Throwable th4 = (Throwable) obj3;
                if (th4 == null) {
                    return vs7;
                }
                throw th4;
            default:
                yg5 yg53 = this.C;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    Object obj4 = yg53.w;
                    wg6 wg6 = new wg6(1, yg53, yg5.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 1);
                    this.C = null;
                    this.B = 1;
                    if (hs2.u(obj4, wg6, this) == p81) {
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
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        hs2 hs2 = this.D;
        yg5 yg5 = (yg5) obj;
        switch (i) {
            case b85.b:
                h63 h63 = (h63) obj2;
                wx5 wx5 = new wx5(hs2, (f61) obj3, 0);
                wx5.C = yg5;
                return wx5.s(vs7);
            case 1:
                wx5 wx52 = new wx5(hs2, (f61) obj3, 1);
                wx52.C = yg5;
                return wx52.s(vs7);
            default:
                wx5 wx53 = new wx5(hs2, (f61) obj3, 2);
                wx53.C = yg5;
                return wx53.s(vs7);
        }
    }
}
