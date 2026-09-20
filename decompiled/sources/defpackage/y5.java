package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: y5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public p7 B;
    public int C;
    public final /* synthetic */ p7 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(p7 p7Var, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = p7Var;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((y5) o(f61, o81)).s(vs7);
            default:
                return ((y5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        p7 p7Var = this.D;
        switch (i) {
            case b85.b:
                return new y5(p7Var, f61, 0);
            default:
                return new y5(p7Var, f61, 1);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        int i = this.A;
        p7 p7Var = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    di2 d = ((dy7) p7Var.c).d();
                    this.B = p7Var;
                    this.C = 1;
                    obj = gr8.H(d, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    p7Var = this.B;
                    o85.q(obj);
                } else if (i2 == 2) {
                    f61 f61 = (f61) this.B;
                    try {
                        o85.q(obj);
                        jm5 jm5 = (jm5) obj;
                        t77 t77 = jm5.b.d;
                        f96 f96 = (f96) t77;
                        obj2 = f96.s(b26.b(Integer.TYPE), jm5.a);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        obj2 = new m66(e2);
                    }
                    return new o66(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String obj3 = d57.k1(((UserDataPreferences) obj).getInvitationCode()).toString();
                if (d57.I0(obj3)) {
                    obj2 = new Integer(0);
                    return new o66(obj2);
                }
                gm5 n = f55.n(p7Var.a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JsonPrimitive b = em3.b(obj3);
                b.getClass();
                JsonElement jsonElement = (JsonElement) linkedHashMap.put("p_code", b);
                JsonObject jsonObject = new JsonObject(linkedHashMap);
                this.B = null;
                this.C = 2;
                bm5 bm5 = n.c;
                mp1 mp1 = new mp1(bm5.u, bm5.v, 1);
                ia6[] ia6Arr = ia6.w;
                mp1.e(i53.c);
                mp1.e = jsonObject;
                obj = h66.a.a(n, "rpc/".concat("count_invitations"), mp1, this);
                if (obj == p81) {
                    return p81;
                }
                jm5 jm52 = (jm5) obj;
                t77 t772 = jm52.b.d;
                f96 f962 = (f96) t772;
                obj2 = f962.s(b26.b(Integer.TYPE), jm52.a);
                return new o66(obj2);
            default:
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    UserInfo j = rg3.t(p7Var.a).j();
                    if (j != null) {
                        String id = j.getId();
                        this.B = p7Var;
                        this.C = 1;
                        if (p7Var.r(id, this) == p81) {
                            return p81;
                        }
                    } else {
                        throw new IllegalStateException("Debes iniciar sesión para comprobar la licencia.");
                    }
                } else if (i3 == 1) {
                    p7Var = this.B;
                    o85.q(obj);
                } else if (i3 == 2) {
                    f61 f612 = (f61) this.B;
                    try {
                        o85.q(obj);
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        obj = new m66(e4);
                    }
                    return new o66(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = null;
                this.C = 2;
                obj = p7Var.s(this);
                if (obj == p81) {
                    return p81;
                }
                return new o66(obj);
        }
    }
}
