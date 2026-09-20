package defpackage;

import java.util.List;

/* renamed from: pu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pu1 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ pu1(Object obj, boolean z2, Object obj2, int i) {
        this.w = i;
        this.y = obj;
        this.x = z2;
        this.z = obj2;
    }

    public final Object y(Object obj) {
        float f;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        boolean z2 = this.x;
        switch (i) {
            case b85.b:
                zs4 zs4 = (zs4) obj3;
                kw1 kw1 = (kw1) obj;
                qu1 qu1 = new qu1(z2, (List) obj2, zs4);
                zs4.D.j.x0(qu1);
                return new m30(1, zs4, qu1);
            case 1:
                ob5 ob5 = (ob5) obj3;
                o81 o81 = (o81) obj2;
                ok6 ok6 = (ok6) obj;
                if (z2) {
                    wa5 wa5 = new wa5(ob5, o81, 0);
                    yr3[] yr3Arr = mk6.a;
                    ok6.f(zj6.y, new h4((String) null, wa5));
                    ok6.f(zj6.A, new h4((String) null, new wa5(ob5, o81, 1)));
                } else {
                    wa5 wa52 = new wa5(ob5, o81, 2);
                    yr3[] yr3Arr2 = mk6.a;
                    ok6.f(zj6.z, new h4((String) null, wa52));
                    ok6.f(zj6.B, new h4((String) null, new wa5(ob5, o81, 3)));
                }
                return vs7;
            case 2:
                eh5 eh5 = (eh5) obj2;
                dh5 dh5 = (dh5) obj;
                float floatValue = ((Number) ((a37) obj3).getValue()).floatValue();
                if (z2) {
                    f = 5.0f;
                } else {
                    f = 0.0f;
                }
                dh5.g(eh5, 0, 0, floatValue + f);
                return vs7;
            default:
                String str = (String) obj3;
                nw6 nw6 = (nw6) obj2;
                ok6 ok62 = (ok6) obj;
                if (z2) {
                    mk6.d(ok62, 0);
                }
                mw6 mw6 = new mw6(nw6, 0);
                yr3[] yr3Arr3 = mk6.a;
                ok62.f(zj6.v, new h4((String) null, mw6));
                mk6.e(ok62, str);
                return vs7;
        }
    }

    public /* synthetic */ pu1(boolean z2, Object obj, Object obj2, int i) {
        this.w = i;
        this.x = z2;
        this.y = obj;
        this.z = obj2;
    }
}
