package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: ql1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ql1 extends a97 implements gs2 {
    public final /* synthetic */ int A = 0;
    public e06 B;
    public int C;
    public final /* synthetic */ float D;
    public final /* synthetic */ eh6 E;
    public Object F;
    public final /* synthetic */ Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ql1(ax6 ax6, float f, vr2 vr2, eh6 eh6, f61 f61) {
        super(2, f61);
        this.F = ax6;
        this.D = f;
        this.G = vr2;
        this.E = eh6;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((ql1) o(f61, o81)).s(vs7);
            default:
                return ((ql1) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.G;
        switch (i) {
            case b85.b:
                rl1 rl1 = (rl1) obj2;
                eh6 eh6 = this.E;
                return new ql1(this.D, rl1, eh6, f61);
            default:
                eh6 eh62 = this.E;
                return new ql1((ax6) this.F, this.D, (vr2) obj2, eh62, f61);
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, e06] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007b, code lost:
        if (r1 == r7) goto L_0x00b8;
     */
    public final Object s(Object obj) {
        e06 e06;
        il ilVar;
        e06 e062;
        Object obj2;
        int i = this.A;
        Object obj3 = p81.w;
        float f = this.D;
        Object obj4 = this.G;
        switch (i) {
            case b85.b:
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    if (Math.abs(f) > 1.0f) {
                        ? obj5 = new Object();
                        obj5.w = f;
                        ? obj6 = new Object();
                        il a = gr8.a(0.0f, f, 28);
                        try {
                            rl1 rl1 = (rl1) obj4;
                            tj1 tj1 = rl1.a;
                            g5 g5Var = new g5((e06) obj6, this.E, (e06) obj5, rl1);
                            this.B = obj5;
                            this.F = a;
                            this.C = 1;
                            if (i95.f(a, tj1, false, g5Var, this) == obj3) {
                                return obj3;
                            }
                            e06 = obj5;
                        } catch (CancellationException unused) {
                            e06 = obj5;
                            ilVar = a;
                            e06.w = ((Number) ilVar.b()).floatValue();
                            f = e06.w;
                            return new Float(f);
                        }
                    }
                    return new Float(f);
                } else if (i2 == 1) {
                    ilVar = (il) this.F;
                    e06 = this.B;
                    try {
                        o85.q(obj);
                    } catch (CancellationException unused2) {
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f = e06.w;
                return new Float(f);
            default:
                vr2 vr2 = (vr2) obj4;
                ax6 ax6 = (ax6) this.F;
                fx6 fx6 = ax6.a;
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    float l = fx6.l(f, kl8.g(ax6.b, 0.0f, f));
                    if (Float.isNaN(l)) {
                        bc3.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    ? obj7 = new Object();
                    float signum = Math.signum(f) * Math.abs(l);
                    obj7.w = signum;
                    vr2.y(new Float(signum));
                    float f2 = obj7.w;
                    xw6 xw6 = new xw6(obj7, vr2, 0);
                    this.B = obj7;
                    this.C = 1;
                    obj2 = ax6.b(ax6, this.E, f2, this.D, xw6, this);
                    e062 = obj7;
                    break;
                } else if (i3 == 1) {
                    e06 e063 = this.B;
                    o85.q(obj);
                    e062 = e063;
                    obj2 = obj;
                } else if (i3 == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il ilVar2 = (il) obj2;
                float s = fx6.s(((Number) ilVar2.b()).floatValue());
                if (Float.isNaN(s)) {
                    bc3.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                e062.w = s;
                il D2 = gr8.D(ilVar2, 0.0f, 0.0f, 30);
                hl hlVar = ax6.c;
                xw6 xw62 = new xw6(e062, vr2, 1);
                this.B = null;
                this.C = 2;
                Object e = t35.e(this.E, s, s, D2, hlVar, xw62, this);
                if (e != obj3) {
                    return e;
                }
                return obj3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ql1(float f, rl1 rl1, eh6 eh6, f61 f61) {
        super(2, f61);
        this.D = f;
        this.G = rl1;
        this.E = eh6;
    }
}
