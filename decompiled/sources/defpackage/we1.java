package defpackage;

/* renamed from: we1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class we1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ jf1 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we1(jf1 jf1, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = jf1;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((we1) o((f61) obj2, (fi2) obj)).s(vs7);
            case 1:
                return ((we1) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((we1) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        jf1 jf1 = this.C;
        switch (i) {
            case b85.b:
                return new we1(jf1, f61, 0);
            case 1:
                return new we1(jf1, f61, 1);
            default:
                return new we1(jf1, f61, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (defpackage.jf1.f(r7, r9) == r6) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r10 == r6) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r10 == r6) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return r6;
     */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        jf1 jf1 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (jf1.e(jf1, this) == p81) {
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
                    am6 am6 = jf1.i;
                    this.B = 1;
                    Object h = ((xu0) am6.y).h(this);
                    if (h != p81) {
                        h = vs7;
                        break;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else if (i3 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                di2 u = gr8.u(jf1.i().e(), -1);
                lg lgVar = new lg(4, jf1);
                this.B = 2;
                if (u.a(lgVar, this) != p81) {
                    return vs7;
                }
                return p81;
            default:
                ji8 ji8 = jf1.h;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    if (!(ji8.w() instanceof be2)) {
                        this.B = 1;
                        break;
                    } else {
                        return ji8.w();
                    }
                } else if (i4 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        return new lw5(th, -1);
                    }
                } else if (i4 == 2) {
                    o85.q(obj);
                    return (y27) obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                obj = jf1.g(jf1, false, this);
                break;
        }
    }
}
