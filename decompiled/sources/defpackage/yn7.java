package defpackage;

import android.database.SQLException;
import java.util.Set;

/* renamed from: yn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yn7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ do7 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn7(do7 do7, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = do7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((yn7) o((f61) obj2, (rd5) obj)).s(vs7);
            default:
                return ((yn7) o((f61) obj2, (kl7) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        do7 do7 = this.D;
        switch (i) {
            case b85.b:
                yn7 yn7 = new yn7(do7, f61, 0);
                yn7.C = obj;
                return yn7;
            default:
                yn7 yn72 = new yn7(do7, f61, 1);
                yn72.C = obj;
                return yn72;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kl7} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        kl7 kl7;
        int i = this.A;
        do7 do7 = this.D;
        Object obj2 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object a = do7.a(do7, (rd5) this.C, this);
                    if (a == obj2) {
                        return obj2;
                    }
                    return a;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    kl7 = this.C;
                    this.C = kl7;
                    this.B = 1;
                    obj = kl7.b(this);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else if (i3 == 1) {
                    kl7 = (kl7) this.C;
                    o85.q(obj);
                } else if (i3 == 2) {
                    try {
                        o85.q(obj);
                        return (Set) obj;
                    } catch (SQLException unused) {
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!((Boolean) obj).booleanValue()) {
                    jl7 jl7 = jl7.x;
                    yn7 yn7 = new yn7(do7, (f61) null, 0);
                    this.C = null;
                    this.B = 2;
                    obj = kl7.a(jl7, yn7, this);
                    if (obj == obj2) {
                        return obj2;
                    }
                    return (Set) obj;
                }
                return g42.w;
        }
    }
}
