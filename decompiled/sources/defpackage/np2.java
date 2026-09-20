package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnp2;", "Lr58;", "forum"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: np2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class np2 extends r58 {
    public final sn2 b;
    public final p7 c;
    public final dv7 d;
    public final d37 e;
    public final xw5 f;
    public h27 g;
    public h27 h;
    public h27 i;

    public np2(sn2 sn2, p7 p7Var, dv7 dv7) {
        sn2.getClass();
        p7Var.getClass();
        dv7.getClass();
        this.b = sn2;
        this.c = p7Var;
        this.d = dv7;
        d37 a = e37.a(new is7(6, new mo2()));
        this.e = a;
        this.f = kl8.N(a, new is7(6, new mo2()), u58.a(this));
        ar7.H(u58.a(this), (e81) null, (r81) null, new hp2(this, (f61) null, 0), 3);
        ar7.H(u58.a(this), (e81) null, (r81) null, new hp2(this, (f61) null, 1), 3);
        ar7.H(u58.a(this), (e81) null, (r81) null, new hp2(this, (f61) null, 2), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1 A[LOOP:2: B:25:0x00c1->B:26:0x00f4, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    public static final Object e(np2 np2, String str, h61 h61) {
        kp2 kp2;
        int i2;
        Object obj;
        Throwable a;
        Object value;
        is7 is7;
        mo2 mo2;
        Object value2;
        is7 is72;
        mo2 mo22;
        np2 np22 = np2;
        h61 h612 = h61;
        d37 d37 = np22.e;
        if (h612 instanceof kp2) {
            kp2 = (kp2) h612;
            int i3 = kp2.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kp2.B = i3 - Integer.MIN_VALUE;
                Object obj2 = kp2.z;
                i2 = kp2.B;
                if (i2 != 0) {
                    o85.q(obj2);
                    while (true) {
                        Object value3 = d37.getValue();
                        is7 is73 = (is7) value3;
                        mo2 mo23 = (mo2) is73.a;
                        mo23.getClass();
                        if (d37.i(value3, is7.a(is73, mo2.a(mo23, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, true, (Boolean) null, (Map) null, false, false, 15871), false, (hv2) null, 6))) {
                            break;
                        }
                        String str2 = str;
                    }
                    sn2 sn2 = np22.b;
                    kp2.B = 1;
                    obj = ((lo2) sn2).n(str, kp2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj2);
                    obj = ((o66) obj2).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (obj instanceof m66) {
                    List list = (List) obj;
                    do {
                        value2 = d37.getValue();
                        is72 = (is7) value2;
                        mo22 = (mo2) is72.a;
                        mo22.getClass();
                    } while (!d37.i(value2, is7.a(is72, mo2.a(mo22, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, list, false, (Boolean) null, (Map) null, false, false, 15615), false, (hv2) null, 6)));
                }
                a = o66.a(obj);
                if (a != null) {
                    do {
                        value = d37.getValue();
                        is7 = (is7) value;
                        mo2 = (mo2) is7.a;
                        mo2.getClass();
                    } while (!d37.i(value, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 15871), false, (hv2) null, 6)));
                    np22.f(a);
                }
                return vs7.a;
            }
        }
        kp2 = new kp2(np22, h612);
        Object obj22 = kp2.z;
        i2 = kp2.B;
        if (i2 != 0) {
        }
        if (obj instanceof m66) {
            a = o66.a(obj);
        }
        a = o66.a(obj);
        if (a != null) {
        }
        return vs7.a;
    }

    public final void f(Throwable th) {
        d37 d37;
        Object value;
        do {
            d37 = this.e;
            value = d37.getValue();
        } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) th), 3)));
    }

    public final void g() {
        h27 h27 = this.g;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        h27 h272 = this.h;
        if (h272 != null) {
            h272.o((CancellationException) null);
        }
        this.g = ar7.H(u58.a(this), (e81) null, (r81) null, new hp2(this, (f61) null, 4), 3);
    }

    public final void h(vr2 vr2) {
        d37 d37;
        Object value;
        is7 is7;
        do {
            d37 = this.e;
            value = d37.getValue();
            is7 = (is7) value;
        } while (!d37.i(value, is7.a(is7, vr2.y(is7.a), false, (hv2) null, 6)));
    }
}
