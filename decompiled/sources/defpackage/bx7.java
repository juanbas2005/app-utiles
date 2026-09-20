package defpackage;

/* renamed from: bx7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bx7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ dy7 C;
    public final /* synthetic */ int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx7(dy7 dy7, int i, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.C = dy7;
        this.D = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((bx7) o(f61, o81)).s(vs7);
            default:
                return ((bx7) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        int i2 = this.D;
        dy7 dy7 = this.C;
        switch (i) {
            case b85.b:
                return new bx7(dy7, i2, f61, 0);
            default:
                return new bx7(dy7, i2, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        int i2 = this.D;
        dy7 dy7 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    qe1 qe1 = dy7.a;
                    j05 j05 = new j05(i2, (f61) null, 1);
                    this.B = 1;
                    Object a = qe1.a(j05, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    qe1 qe12 = dy7.a;
                    j05 j052 = new j05(i2, (f61) null, 2);
                    this.B = 1;
                    Object a2 = qe12.a(j052, this);
                    if (a2 == p81) {
                        return p81;
                    }
                    return a2;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
