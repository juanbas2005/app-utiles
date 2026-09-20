package defpackage;

import java.util.List;

/* renamed from: c43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c43 extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public Throwable B;
    public int C;
    public /* synthetic */ x53 D;
    public /* synthetic */ Throwable E;
    public final /* synthetic */ List F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c43(List list, f61 f61, int i) {
        super(3, f61);
        this.A = i;
        this.F = list;
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        List list = this.F;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                x53 x53 = this.D;
                Throwable th = this.E;
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    Throwable U = h49.U(th);
                    this.D = null;
                    this.E = null;
                    this.B = U;
                    this.C = 1;
                    g43.a(list, U, x53, this);
                    if (vs7 == p81) {
                        return p81;
                    }
                    return U;
                } else if (i2 == 1) {
                    Throwable th2 = this.B;
                    o85.q(obj);
                    return th2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                x53 x532 = this.D;
                Throwable th3 = this.E;
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    Throwable U2 = h49.U(th3);
                    this.D = null;
                    this.E = null;
                    this.B = U2;
                    this.C = 1;
                    g43.a(list, U2, x532, this);
                    if (vs7 == p81) {
                        return p81;
                    }
                    return U2;
                } else if (i3 == 1) {
                    Throwable th4 = this.B;
                    o85.q(obj);
                    return th4;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        List list = this.F;
        x53 x53 = (x53) obj;
        Throwable th = (Throwable) obj2;
        f61 f61 = (f61) obj3;
        switch (i) {
            case b85.b:
                c43 c43 = new c43(list, f61, 0);
                c43.D = x53;
                c43.E = th;
                return c43.s(vs7);
            default:
                c43 c432 = new c43(list, f61, 1);
                c432.D = x53;
                c432.E = th;
                return c432.s(vs7);
        }
    }
}
