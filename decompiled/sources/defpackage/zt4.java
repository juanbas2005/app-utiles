package defpackage;

/* renamed from: zt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zt4 extends a97 implements gs2 {
    public int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ oi6 D;
    public final /* synthetic */ eg6 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zt4(float f, float f2, oi6 oi6, eg6 eg6, f61 f61) {
        super(2, f61);
        this.B = f;
        this.C = f2;
        this.D = oi6;
        this.E = eg6;
    }

    public final Object H(Object obj, Object obj2) {
        return ((zt4) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new zt4(this.B, this.C, this.D, this.E, f61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r1.l1(r2, r1.x.getValue(), r7) == r6) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r1.p1(r7.E, r7) == r6) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return r6;
     */
    public final Object s(Object obj) {
        int i = this.A;
        oi6 oi6 = this.D;
        float f = this.B;
        float f2 = this.C;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            if (f != f2) {
                this.A = 1;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else if (i == 2) {
            o85.q(obj);
            return vs7.a;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (f == f2) {
            this.A = 2;
        }
        return vs7.a;
    }
}
