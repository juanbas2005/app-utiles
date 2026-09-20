package defpackage;

/* renamed from: xe1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xe1 extends a97 implements hs2 {
    public final /* synthetic */ int A = 1;
    public int B;
    public /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xe1(jf1 jf1, f61 f61) {
        super(3, f61);
        this.C = jf1;
    }

    public final Object s(Object obj) {
        int i = this.A;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (jf1.c((jf1) this.C, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    fd2 fd2 = (fd2) this.C;
                    this.B = 1;
                    if (!fd2.c.get()) {
                        Object d = sg3.d(fd2.a, new xc(fd2, (f61) null, 5), this);
                        if (d == p81) {
                            return p81;
                        }
                        return d;
                    }
                    h.s("This scope has already been closed.");
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                fi2 fi2 = (fi2) obj;
                Throwable th = (Throwable) obj2;
                return new xe1((jf1) this.C, (f61) obj3).s(vs7);
            default:
                ((Boolean) obj2).getClass();
                xe1 xe1 = new xe1(3, (f61) obj3);
                xe1.C = (fd2) obj;
                return xe1.s(vs7);
        }
    }

    public /* synthetic */ xe1(int i, f61 f61) {
        super(i, f61);
    }
}
