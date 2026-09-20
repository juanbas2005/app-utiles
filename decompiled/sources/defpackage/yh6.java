package defpackage;

/* renamed from: yh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yh6 extends a97 implements gs2 {
    public long A;
    public int B;
    public /* synthetic */ long C;
    public final /* synthetic */ zh6 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yh6(zh6 zh6, f61 f61) {
        super(2, f61);
        this.D = zh6;
    }

    public final Object H(Object obj, Object obj2) {
        long j = ((x38) obj).a;
        yh6 yh6 = new yh6(this.D, (f61) obj2);
        yh6.C = j;
        return yh6.s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        yh6 yh6 = new yh6(this.D, f61);
        yh6.C = ((x38) obj).a;
        return yh6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r15 == r5) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    public final Object s(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.B;
        zh6 zh6 = this.D;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            j3 = this.C;
            am6 am6 = zh6.f;
            this.C = j3;
            this.B = 1;
            obj = am6.t(j3, this);
        } else if (i == 1) {
            j3 = this.C;
            o85.q(obj);
        } else if (i == 2) {
            j4 = this.A;
            j3 = this.C;
            o85.q(obj);
            long j5 = ((x38) obj).a;
            am6 am62 = zh6.f;
            long d = x38.d(j4, j5);
            this.C = j3;
            this.A = j5;
            this.B = 3;
            obj = am62.s(d, j5, this);
            if (obj != p81) {
                j = j3;
                j2 = j5;
                return new x38(x38.d(j, x38.d(j2, ((x38) obj).a)));
            }
            return p81;
        } else if (i == 3) {
            j2 = this.A;
            j = this.C;
            o85.q(obj);
            return new x38(x38.d(j, x38.d(j2, ((x38) obj).a)));
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long d2 = x38.d(j3, ((x38) obj).a);
        this.C = j3;
        this.A = d2;
        this.B = 2;
        obj = zh6.a(d2, this);
        if (obj != p81) {
            j4 = d2;
            long j52 = ((x38) obj).a;
            am6 am622 = zh6.f;
            long d3 = x38.d(j4, j52);
            this.C = j3;
            this.A = j52;
            this.B = 3;
            obj = am622.s(d3, j52, this);
            if (obj != p81) {
            }
        }
        return p81;
    }
}
