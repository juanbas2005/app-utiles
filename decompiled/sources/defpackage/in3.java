package defpackage;

import kotlinx.serialization.json.JsonElement;

/* renamed from: in3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class in3 extends l66 implements hs2 {
    public final /* synthetic */ v A;
    public int y;
    public /* synthetic */ xk1 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in3(v vVar, f61 f61) {
        super(3, f61);
        this.A = vVar;
    }

    public final Object s(Object obj) {
        v vVar = this.A;
        z1 z1Var = (z1) vVar.c;
        xk1 xk1 = this.z;
        int i = this.y;
        if (i == 0) {
            o85.q(obj);
            byte z2 = z1Var.z();
            if (z2 == 1) {
                return vVar.l(true);
            }
            if (z2 == 0) {
                return vVar.l(false);
            }
            if (z2 == 6) {
                this.z = null;
                this.y = 1;
                obj = v.d(vVar, xk1, this);
                p81 p81 = p81.w;
                if (obj == p81) {
                    return p81;
                }
            } else if (z2 == 8) {
                return vVar.k();
            } else {
                z1.u(z1Var, "Can't begin reading element, unexpected token", 0, (String) null, 6);
                throw null;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return (JsonElement) obj;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        vs7 vs7 = (vs7) obj2;
        in3 in3 = new in3(this.A, (f61) obj3);
        in3.z = (xk1) obj;
        return in3.s(vs7.a);
    }
}
