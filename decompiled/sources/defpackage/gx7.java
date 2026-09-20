package defpackage;

/* renamed from: gx7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gx7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ dy7 C;
    public final /* synthetic */ long D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx7(dy7 dy7, long j, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = dy7;
        this.D = j;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((gx7) o(f61, o81)).s(vs7);
            default:
                return ((gx7) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                long j = this.D;
                return new gx7(this.C, j, f61, 0);
            default:
                return new gx7(this.C, this.D, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        long j = this.D;
        dy7 dy7 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    qe1 qe1 = dy7.a;
                    qh6 qh6 = new qh6(j, (f61) null, 1);
                    this.B = 1;
                    Object a = qe1.a(qh6, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    qe1 qe12 = dy7.a;
                    qh6 qh62 = new qh6(j, (f61) null, 2);
                    this.B = 1;
                    Object a2 = qe12.a(qh62, this);
                    if (a2 == p81) {
                        return p81;
                    }
                    return a2;
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
