package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: gp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gp2 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ np2 x;

    public /* synthetic */ gp2(np2 np2, int i) {
        this.w = i;
        this.x = np2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    public Object a(u5 u5Var, f61 f61) {
        ip2 ip2;
        int i;
        boolean booleanValue;
        Object value;
        is7 is7;
        mo2 mo2;
        boolean z;
        f61 f612 = f61;
        np2 np2 = this.x;
        d37 d37 = np2.e;
        if (f612 instanceof ip2) {
            ip2 = (ip2) f612;
            int i2 = ip2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ip2.B = i2 - Integer.MIN_VALUE;
                Object obj = ip2.z;
                i = ip2.B;
                if (i != 0) {
                    o85.q(obj);
                    boolean z2 = ((mo2) ((is7) d37.getValue()).a).e;
                    if (u5Var != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    while (true) {
                        Object value2 = d37.getValue();
                        is7 is72 = (is7) value2;
                        mo2 mo22 = (mo2) is72.a;
                        mo22.getClass();
                        if (d37.i(value2, is7.a(is72, mo2.a(mo22, (ArrayList) null, (List) null, (String) null, (String) null, z, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16367), false, (hv2) null, 6))) {
                            break;
                        }
                    }
                    if (z2 != z) {
                        sn2 sn2 = np2.b;
                        ip2.B = 1;
                        lo2 lo2 = (lo2) sn2;
                        obj = ar7.e0(lo2.b, new ju1(lo2, (f61) null, 6), ip2);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    }
                    return vs7.a;
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                do {
                    value = d37.getValue();
                    is7 = (is7) value;
                    mo2 = (mo2) is7.a;
                    mo2.getClass();
                } while (!d37.i(value, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, booleanValue, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16351), false, (hv2) null, 6)));
                np2.g();
                return vs7.a;
            }
        }
        ip2 = new ip2(this, f612);
        Object obj2 = ip2.z;
        i = ip2.B;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        do {
            value = d37.getValue();
            is7 = (is7) value;
            mo2 = (mo2) is7.a;
            mo2.getClass();
        } while (!d37.i(value, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, booleanValue, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16351), false, (hv2) null, 6)));
        np2.g();
        return vs7.a;
    }

    public final Object k(Object obj, f61 f61) {
        switch (this.w) {
            case b85.b:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                d37 d37 = this.x.e;
                while (true) {
                    Object value = d37.getValue();
                    is7 is7 = (is7) value;
                    mo2 mo2 = (mo2) is7.a;
                    mo2.getClass();
                    Object obj2 = value;
                    d37 d372 = d37;
                    d37 d373 = d372;
                    if (d373.i(obj2, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, bool, (Map) null, false, false, 15359), false, (hv2) null, 6))) {
                        return vs7.a;
                    }
                    d37 = d373;
                }
            default:
                return a((u5) obj, f61);
        }
    }
}
