package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: s6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ p7 C;
    public final /* synthetic */ String D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(p7 p7Var, String str, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = p7Var;
        this.D = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((s6) o(f61, o81)).s(vs7);
            default:
                return ((s6) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        String str = this.D;
        p7 p7Var = this.C;
        switch (i) {
            case b85.b:
                return new s6(p7Var, str, f61, 0);
            default:
                return new s6(p7Var, str, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        Object obj2 = vs7.a;
        String str = this.D;
        p7 p7Var = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    r6 r6Var = new r6(p7Var, str, (f61) null, 0);
                    this.B = 1;
                    if (p7.a(p7Var, r6Var, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        obj2 = new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj2);
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    r6 r6Var2 = new r6(p7Var, str, (f61) null, 1);
                    this.B = 1;
                    if (p7.a(p7Var, r6Var2, this) == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        obj2 = new m66(e4);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new o66(obj2);
        }
    }
}
