package defpackage;

/* renamed from: s0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ ap4 C;
    public final /* synthetic */ eo5 D;
    public final /* synthetic */ v0 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(ap4 ap4, eo5 eo5, v0 v0Var, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = ap4;
        this.D = eo5;
        this.E = v0Var;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((s0) o(f61, o81)).s(vs7);
            default:
                return ((s0) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                f61 f612 = f61;
                return new s0(this.C, this.D, this.E, f612, 0);
            default:
                return new s0(this.C, this.D, this.E, f61, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (defpackage.t49.G(r4, r10) == r6) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r3.b(r9, r10) == r6) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (defpackage.t49.G(r4, r10) == r6) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r3.b(r9, r10) == r6) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r6;
     */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        v0 v0Var = this.E;
        ap4 ap4 = this.C;
        p81 p81 = p81.w;
        eo5 eo5 = this.D;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    long j = pr0.a;
                    this.B = 1;
                    break;
                } else if (i2 == 1) {
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    v0Var.c0 = eo5;
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                break;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    long j2 = pr0.a;
                    this.B = 1;
                    break;
                } else if (i3 == 1) {
                    o85.q(obj);
                } else if (i3 == 2) {
                    o85.q(obj);
                    v0Var.Y = eo5;
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                break;
        }
    }
}
