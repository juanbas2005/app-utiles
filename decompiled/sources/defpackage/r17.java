package defpackage;

import java.util.List;

/* renamed from: r17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r17 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ t17 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r17(t17 t17, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = t17;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((r17) o(f61, o81)).s(vs7);
            default:
                return ((r17) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        t17 t17 = this.C;
        switch (i) {
            case b85.b:
                return new r17(t17, f61, 0);
            default:
                return new r17(t17, f61, 1);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object value;
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        t17 t17 = this.C;
        switch (i) {
            case b85.b:
                d37 d37 = t17.c;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    d17 d17 = t17.b;
                    this.B = 1;
                    obj2 = ar7.e0(d17.c, new k05((Object) d17, (f61) null, 21), this);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                yh7.a.getClass();
                hr2.m(new Object[0]);
                do {
                    value = d37.getValue();
                } while (!d37.i(value, new is7(6, e17.a((e17) ((is7) value).a, (List) null, (r11) null, (String) null, (String) null, booleanValue, (hv2) null, 47))));
                if (((is7) d37.getValue()).b) {
                    return vs7;
                }
                ar7.H(u58.a(t17), (e81) null, (r81) null, new ii3(d37, (f61) null, (r58) t17, 27), 3);
                return vs7;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    c6 c6Var = new c6(((dy7) t17.b.b).d(), 13);
                    lg lgVar = new lg(14, t17);
                    this.B = 1;
                    if (c6Var.a(lgVar, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
