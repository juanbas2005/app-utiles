package defpackage;

/* renamed from: bj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bj5 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ dj5 C;
    public final /* synthetic */ String D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj5(dj5 dj5, String str, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.C = dj5;
        this.D = str;
    }

    public final f61 l(f61 f61) {
        switch (this.A) {
            case b85.b:
                return new bj5(this.C, this.D, f61, 0);
            default:
                return new bj5(this.C, this.D, f61, 1);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A;
        String str = this.D;
        dj5 dj5 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    ni5 ni5 = dj5.b;
                    this.B = 1;
                    obj2 = ni5.c(str, this);
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
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    ni5 ni52 = dj5.b;
                    this.B = 1;
                    obj3 = ni52.g(str, this);
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
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((bj5) l(f61)).s(vs7);
            default:
                return ((bj5) l(f61)).s(vs7);
        }
    }
}
