package defpackage;

/* renamed from: kd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kd1 extends a97 implements gs2 {
    public final /* synthetic */ int A = 0;
    public int B;
    public final /* synthetic */ a96 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ vr2 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kd1(f61 f61, a96 a96, boolean z, boolean z2, vr2 vr2) {
        super(2, f61);
        this.C = a96;
        this.D = z;
        this.E = z2;
        this.F = vr2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((kd1) o(f61, o81)).s(vs7);
            default:
                return ((kd1) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new kd1(this.C, this.D, this.E, this.F, f61);
            default:
                return new kd1(f61, this.C, this.D, this.E, this.F);
        }
    }

    public final Object s(Object obj) {
        boolean z;
        int i = this.A;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    a96 a96 = this.C;
                    if ((!a96.k() || !a96.l()) && this.D) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = this.E;
                    a96 a962 = this.C;
                    jd1 jd1 = new jd1(z, z2, a962, (f61) null, this.F, 0);
                    this.B = 1;
                    Object q = a962.q(z2, jd1, this);
                    if (q == p81) {
                        return p81;
                    }
                    return q;
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
                    vr2 vr2 = this.F;
                    boolean z3 = this.E;
                    boolean z4 = this.D;
                    a96 a963 = this.C;
                    jd1 jd12 = new jd1(z3, z4, a963, (f61) null, vr2, 1);
                    this.B = 1;
                    Object q2 = a963.q(z4, jd12, this);
                    if (q2 == p81) {
                        return p81;
                    }
                    return q2;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kd1(a96 a96, boolean z, boolean z2, vr2 vr2, f61 f61) {
        super(2, f61);
        this.C = a96;
        this.D = z;
        this.E = z2;
        this.F = vr2;
    }
}
