package defpackage;

import io.github.jan.supabase.auth.a;

/* renamed from: o6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o6 extends a97 implements vr2 {
    public int A;
    public final /* synthetic */ p7 B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o6(p7 p7Var, String str, String str2, String str3, String str4, f61 f61) {
        super(1, f61);
        this.B = p7Var;
        this.C = str;
        this.D = str2;
        this.E = str3;
        this.F = str4;
    }

    public final f61 l(f61 f61) {
        return new o6(this.B, this.C, this.D, this.E, this.F, f61);
    }

    public final Object s(Object obj) {
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            uu t = rg3.t(this.B.a);
            n6 n6Var = new n6(this.C, this.D, this.E, this.F);
            this.A = 1;
            a aVar = (a) t;
            aVar.c.getClass();
            Object a = fl1.a(r22.a, aVar.b, new n0(aVar, (f61) null, 9), n6Var, this);
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

    public final Object y(Object obj) {
        return ((o6) l((f61) obj)).s(vs7.a);
    }
}
