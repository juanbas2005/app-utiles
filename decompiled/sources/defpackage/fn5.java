package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fn5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ gs2 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn5(gs2 gs2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = gs2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((fn5) o((f61) obj2, (pp4) obj)).s(vs7);
            case 1:
                return ((fn5) o((f61) obj2, (pp4) obj)).s(vs7);
            default:
                return ((fn5) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        gs2 gs2 = this.D;
        switch (i) {
            case b85.b:
                fn5 fn5 = new fn5(gs2, f61, 0);
                fn5.C = obj;
                return fn5;
            case 1:
                fn5 fn52 = new fn5(gs2, f61, 1);
                fn52.C = obj;
                return fn52;
            default:
                fn5 fn53 = new fn5(gs2, f61, 2);
                fn53.C = obj;
                return fn53;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        gs2 gs2 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = gs2.H((pp4) this.C, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pp4 pp4 = (pp4) obj;
                pp4.getClass();
                ((AtomicBoolean) pp4.b.x).set(true);
                return pp4;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    pp4 pp42 = new pp4(new LinkedHashMap(((pp4) this.C).a()), false);
                    this.C = pp42;
                    this.B = 1;
                    if (gs2.H(pp42, this) == p81) {
                        return p81;
                    }
                    return pp42;
                } else if (i3 == 1) {
                    pp4 pp43 = (pp4) this.C;
                    o85.q(obj);
                    return pp43;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (gs2.H((o81) this.C, this) == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
        }
    }
}
