package defpackage;

import io.github.jan.supabase.auth.user.UserInfo;
import java.util.concurrent.CancellationException;

/* renamed from: c7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public p7 B;
    public int C;
    public final /* synthetic */ p7 D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(p7 p7Var, String str, String str2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = p7Var;
        this.E = str;
        this.F = str2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((c7) o(f61, o81)).s(vs7);
            default:
                return ((c7) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                f61 f612 = f61;
                return new c7(this.D, this.E, this.F, f612, 0);
            default:
                return new c7(this.D, this.E, this.F, f61, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r14 == r4) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        if (r14 == r4) goto L_0x00be;
     */
    public final Object s(Object obj) {
        p7 p7Var;
        p7 p7Var2;
        int i = this.A;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    p7 p7Var3 = this.D;
                    b7 b7Var = new b7(p7Var3, this.E, this.F, (f61) null, 0);
                    this.B = p7Var3;
                    this.C = 1;
                    if (p7.a(p7Var3, b7Var, this) == p81) {
                        return p81;
                    }
                    p7Var = p7Var3;
                } else if (i2 == 1) {
                    p7Var = this.B;
                    o85.q(obj);
                } else if (i2 == 2) {
                    f61 f61 = (f61) this.B;
                    try {
                        o85.q(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        obj = new m66(e2);
                    }
                    return new o66(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                UserInfo j = rg3.t(p7Var.a).j();
                if (j != null) {
                    this.B = null;
                    this.C = 2;
                    obj = p7Var.l(j, (String) null, this);
                    break;
                } else {
                    throw new IllegalStateException("No se pudo obtener la sesión. Inténtalo de nuevo.");
                }
            default:
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    p7 p7Var4 = this.D;
                    b7 b7Var2 = new b7(p7Var4, this.E, this.F, (f61) null, 2);
                    this.B = p7Var4;
                    this.C = 1;
                    if (p7.a(p7Var4, b7Var2, this) == p81) {
                        return p81;
                    }
                    p7Var2 = p7Var4;
                } else if (i3 == 1) {
                    p7Var2 = this.B;
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
                UserInfo j2 = rg3.t(p7Var2.a).j();
                if (j2 != null) {
                    this.B = null;
                    this.C = 2;
                    obj = p7Var2.l(j2, (String) null, this);
                    break;
                } else {
                    throw new IllegalStateException("No se pudo obtener la sesión. Inténtalo de nuevo.");
                }
        }
    }
}
