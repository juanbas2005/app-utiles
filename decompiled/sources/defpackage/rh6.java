package defpackage;

/* renamed from: rh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rh6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ th6 C;
    public /* synthetic */ long D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh6(th6 th6, long j, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = th6;
        this.D = j;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((rh6) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((rh6) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((rh6) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                long j = ((l35) obj).a;
                rh6 rh6 = new rh6(this.C, (f61) obj2);
                rh6.D = j;
                return rh6.s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                long j = this.D;
                return new rh6(this.C, j, f61, 0);
            case 1:
                long j2 = this.D;
                return new rh6(this.C, j2, f61, 1);
            case 2:
                return new rh6(this.C, this.D, f61, 2);
            default:
                rh6 rh6 = new rh6(this.C, f61);
                rh6.D = ((l35) obj).a;
                return rh6;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        th6 th6 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    zh6 zh6 = th6.j0;
                    qh6 qh6 = new qh6(this.D, (f61) null, 0);
                    this.B = 1;
                    if (zh6.g(hq4.x, qh6, this) == p81) {
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
                    zh6 zh62 = th6.j0;
                    long j = this.D;
                    this.B = 1;
                    if (zh62.c(j, false, this) == p81) {
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
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    zh6 zh63 = th6.j0;
                    long j2 = this.D;
                    this.B = 1;
                    if (zh63.c(j2, true, this) == p81) {
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
            default:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    long j3 = this.D;
                    zh6 zh64 = th6.j0;
                    this.B = 1;
                    Object a = mh6.a(zh64, j3, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh6(th6 th6, f61 f61) {
        super(2, f61);
        this.A = 3;
        this.C = th6;
    }
}
