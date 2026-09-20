package defpackage;

import java.util.Map;

/* renamed from: x20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x20 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ String C;
    public final /* synthetic */ aq4 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x20(String str, aq4 aq4, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = str;
        this.D = aq4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((x20) o(f61, o81)).s(vs7);
            default:
                return ((x20) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        aq4 aq4 = this.D;
        String str = this.C;
        switch (i) {
            case b85.b:
                return new x20(str, aq4, f61, 0);
            default:
                return new x20(str, aq4, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        jw6 jw6 = jw6.x;
        String str = this.C;
        aq4 aq4 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    int i3 = b30.g;
                    this.B = 1;
                    if (((is2) aq4.getValue()).C(str, jw6, (Object) null, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    Map map = q17.a;
                    this.B = 1;
                    if (((is2) aq4.getValue()).C(str, jw6, (Object) null, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
