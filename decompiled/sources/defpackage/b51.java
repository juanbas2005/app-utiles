package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: b51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b51 extends a97 implements js2 {
    public int A;
    public /* synthetic */ y53 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ List D;
    public final /* synthetic */ Set E;
    public final /* synthetic */ vr0 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b51(vr0 vr0, f61 f61, List list, Set set) {
        super(5, f61);
        this.D = list;
        this.E = set;
        this.F = vr0;
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rl7 rl7 = (rl7) obj;
        fp7 fp7 = (fp7) obj4;
        Set set = this.E;
        b51 b51 = new b51(this.F, (f61) obj5, this.D, set);
        b51.B = (y53) obj2;
        b51.C = obj3;
        return b51.s(vs7.a);
    }

    public final Object s(Object obj) {
        y53 y53 = this.B;
        Object obj2 = this.C;
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            this.B = null;
            this.C = null;
            this.A = 1;
            Object a = f51.a(this.D, this.E, this.F, y53, obj2, this);
            p81 p81 = p81.w;
            if (a == p81) {
                return p81;
            }
            return a;
        } else if (i == 1) {
            o85.q(obj);
            return obj;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
