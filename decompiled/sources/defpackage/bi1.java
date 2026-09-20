package defpackage;

/* renamed from: bi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bi1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi1(Object obj, int i, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.D = obj;
        this.C = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((bi1) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((bi1) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((bi1) o((f61) obj2, (eh6) obj)).s(vs7);
            default:
                return ((bi1) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        int i2 = this.C;
        Object obj2 = this.D;
        switch (i) {
            case b85.b:
                return new bi1((s34) obj2, i2, f61, 0);
            case 1:
                return new bi1((d34) obj2, i2, f61, 1);
            case 2:
                return new bi1((ob5) obj2, i2, f61, 2);
            default:
                return new bi1((um1) obj2, i2, f61, 3);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        int i2 = this.C;
        Object obj2 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                s34 s34 = (s34) obj2;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    if (s34.j.a() || s34.h() == i2) {
                        return vs7;
                    }
                    this.B = 1;
                    if (s34.l(s34, i2, this) == p81) {
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
            case 1:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    x24 x24 = ((d34) obj2).L;
                    this.B = 1;
                    if (x24.e(i2, this) == p81) {
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
            case 2:
                ob5 ob5 = (ob5) obj2;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (ob5.i(this) == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ob5.t(ob5.j(i2), 0.0f, true);
                return vs7;
            default:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((um1) obj2).f(i2, kl8.M(0.0f, 0.0f, (Object) null, 7), this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i6 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
