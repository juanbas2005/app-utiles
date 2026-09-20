package defpackage;

/* renamed from: pb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pb7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ hs2 C;
    public final /* synthetic */ co5 D;
    public final /* synthetic */ qk5 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb7(hs2 hs2, co5 co5, qk5 qk5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = hs2;
        this.D = co5;
        this.E = qk5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((pb7) o(f61, o81)).s(vs7);
            default:
                return ((pb7) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                f61 f612 = f61;
                return new pb7(this.C, this.D, this.E, f612, 0);
            default:
                return new pb7(this.C, this.D, this.E, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        qk5 qk5 = this.E;
        co5 co5 = this.D;
        hs2 hs2 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    l35 l35 = new l35(qk5.c);
                    this.B = 1;
                    if (hs2.u(co5, l35, this) == p81) {
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
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    l35 l352 = new l35(qk5.c);
                    this.B = 1;
                    if (hs2.u(co5, l352, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
