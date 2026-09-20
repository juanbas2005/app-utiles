package defpackage;

import io.github.jan.supabase.auth.a;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: r6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r6 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ p7 C;
    public final /* synthetic */ String D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(p7 p7Var, String str, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.C = p7Var;
        this.D = str;
    }

    public final f61 l(f61 f61) {
        int i = this.A;
        String str = this.D;
        p7 p7Var = this.C;
        switch (i) {
            case b85.b:
                return new r6(p7Var, str, f61, 0);
            default:
                return new r6(p7Var, str, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        String str = this.D;
        p7 p7Var = this.C;
        Object obj2 = p81.w;
        Object obj3 = vs7.a;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    uu t = rg3.t(p7Var.a);
                    this.B = 1;
                    a aVar = (a) t;
                    aVar.c.getClass();
                    aw awVar = aVar.m;
                    vm3 vm3 = new vm3();
                    b96.M(vm3, "type", "signup");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    JsonPrimitive b = em3.b(str);
                    b.getClass();
                    JsonElement jsonElement = (JsonElement) linkedHashMap.put("email", b);
                    l18.a(vm3, new JsonObject(linkedHashMap));
                    Object a = awVar.a("resend", new jv(l51.c, vm3.a(), 1), this);
                    if (a != obj2) {
                        a = obj3;
                    }
                    if (a != obj2) {
                        a = obj3;
                    }
                    if (a == obj2) {
                        return obj2;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj3;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    uu t2 = rg3.t(p7Var.a);
                    this.B = 1;
                    a aVar2 = (a) t2;
                    aVar2.c.getClass();
                    if (!d57.I0(str)) {
                        String q = aVar2.q();
                        vm3 vm32 = new vm3();
                        b96.M(vm32, "email", str);
                        if (q != null) {
                            ag8.C(vm32, q);
                        }
                        Object a2 = aVar2.k.a("recover", new lv(l51.c, vm32.a().toString(), 0), this);
                        if (a2 != obj2) {
                            a2 = obj3;
                        }
                        if (a2 == obj2) {
                            return obj2;
                        }
                    } else {
                        h.q("Email must not be blank");
                        return null;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj3;
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((r6) l(f61)).s(vs7);
            default:
                return ((r6) l(f61)).s(vs7);
        }
    }
}
