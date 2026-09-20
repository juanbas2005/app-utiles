package defpackage;

/* renamed from: r63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r63 extends a97 implements hs2 {
    public int A;
    public int B;
    public /* synthetic */ yg5 C;
    public /* synthetic */ Object D;
    public final /* synthetic */ t63 E;
    public final /* synthetic */ j43 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r63(t63 t63, j43 j43, f61 f61) {
        super(3, f61);
        this.E = t63;
        this.F = j43;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        if (r11 != r6) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r0.d(r10, (defpackage.l43) r11) == r6) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081 A[LOOP:0: B:20:0x007b->B:22:0x0081, LOOP_END] */
    public final Object s(Object obj) {
        int i;
        yg5 yg5 = this.C;
        Object obj2 = this.D;
        int i2 = this.B;
        p81 p81 = p81.w;
        if (i2 == 0) {
            o85.q(obj);
            if (obj2 instanceof j85) {
                Object obj3 = yg5.w;
                y53 y53 = (y53) obj3;
                y53.getClass();
                y53.d = obj2;
                y53.b((fp7) null);
                y53 y532 = (y53) obj3;
                Integer num = (Integer) y532.f.d(f63.a);
                t63 t63 = this.E;
                if (num != null) {
                    int intValue = num.intValue();
                    t63.getClass();
                    if (intValue >= 20) {
                        if (num.intValue() < Integer.MAX_VALUE) {
                            i = num.intValue() + 1;
                        } else {
                            i = num.intValue();
                        }
                        yk6 p63 = new p63(i, this.F);
                        for (hs2 q63 : dt0.O0(t63.a)) {
                            p63 = new q63(q63, p63);
                        }
                        this.C = yg5;
                        this.D = null;
                        this.A = i;
                        this.B = 1;
                        obj = p63.a(y532, this);
                    }
                }
                t63.getClass();
                i = 20;
                yk6 p632 = new p63(i, this.F);
                while (r7.hasNext()) {
                }
                this.C = yg5;
                this.D = null;
                this.A = i;
                this.B = 1;
                obj = p632.a(y532, this);
            } else {
                ku4.g(e57.g0("\n|Fail to prepare request body for sending. \n|The body type is: " + b26.a.b(obj2.getClass()) + ", with Content-Type: " + pv8.p((h53) yg5.w) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."));
                return null;
            }
        } else if (i2 == 1) {
            i = this.A;
            o85.q(obj);
        } else if (i2 == 2) {
            o85.q(obj);
            return vs7.a;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this.C = null;
        this.D = null;
        this.A = i;
        this.B = 2;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        r63 r63 = new r63(this.E, this.F, (f61) obj3);
        r63.C = (yg5) obj;
        r63.D = obj2;
        return r63.s(vs7.a);
    }
}
