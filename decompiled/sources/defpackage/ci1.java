package defpackage;

/* renamed from: ci1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ci1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ s34 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ci1(s34 s34, int i, f61 f61) {
        super(2, f61);
        this.A = 2;
        this.C = s34;
        this.B = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((ci1) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((ci1) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                ((ci1) o((f61) obj2, (eh6) obj)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        s34 s34 = this.C;
        switch (i) {
            case b85.b:
                return new ci1(s34, f61, 0);
            case 1:
                return new ci1(s34, f61, 1);
            default:
                return new ci1(s34, this.B, f61);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        s34 s34 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (s34.f(s34.h() + 1, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (s34.f(s34.h() - 1, this) == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                    } catch (IllegalArgumentException unused2) {
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            default:
                o85.q(obj);
                s34.m(this.B);
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci1(s34 s34, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = s34;
    }
}
