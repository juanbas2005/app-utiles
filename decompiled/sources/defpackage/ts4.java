package defpackage;

import java.util.List;

/* renamed from: ts4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ts4 extends a97 implements ks2 {
    public /* synthetic */ boolean A;
    public /* synthetic */ String B;
    public /* synthetic */ String C;
    public /* synthetic */ List D;
    public /* synthetic */ Long E;

    public ts4(f61 f61) {
        super(6, f61);
    }

    public final Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ts4 ts4 = new ts4((f61) obj6);
        ts4.A = booleanValue;
        ts4.B = (String) obj2;
        ts4.C = (String) obj3;
        ts4.D = (List) obj4;
        ts4.E = (Long) obj5;
        return ts4.s(vs7.a);
    }

    public final Object s(Object obj) {
        boolean z = this.A;
        String str = this.B;
        String str2 = this.C;
        List list = this.D;
        Long l = this.E;
        o85.q(obj);
        return new hs4(z, str, str2, list, l, 32);
    }
}
