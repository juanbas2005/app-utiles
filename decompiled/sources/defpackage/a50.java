package defpackage;

/* renamed from: a50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a50 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ c50 C;
    public final /* synthetic */ String D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a50(c50 c50, String str, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = c50;
        this.D = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b /*0*/:
                return ((a50) o(f61, o81)).s(vs7);
            default:
                return ((a50) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        String str = this.D;
        c50 c50 = this.C;
        switch (i) {
            case b85.b /*0*/:
                return new a50(c50, str, f61, 0);
            default:
                return new a50(c50, str, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        String str = this.D;
        c50 c50 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.B;
                vs7 vs7 = vs7.a;
                if (i2 == 0) {
                    o85.q(obj);
                    ol7 ol7 = c50.d;
                    this.B = 1;
                    ml7 ml7 = ol7.a;
                    Object P = sg3.P(this, ml7.a, false, true, new k77(8, (Object) ml7, (Object) new nl7(str)));
                    if (P != p81) {
                        P = vs7;
                    }
                    if (P == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    ol7 ol72 = c50.d;
                    this.B = 1;
                    Object P2 = sg3.P(this, ol72.a.a, true, false, new cb(str, 26));
                    if (P2 == p81) {
                        return p81;
                    }
                    return P2;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
