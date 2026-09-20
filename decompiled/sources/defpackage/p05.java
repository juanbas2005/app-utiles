package defpackage;

import java.util.List;

/* renamed from: p05  reason: default package */
public final class p05 implements vr2 {
    public final /* synthetic */ int w;
    public final am6 x;

    public /* synthetic */ p05(am6 am6, int i) {
        this.w = i;
        this.x = am6;
    }

    public final Object y(Object obj) {
        lq0 lq0;
        int i = this.w;
        int i2 = 0;
        am6 am6 = this.x;
        switch (i) {
            case b85.b:
                up2 up2 = (up2) obj;
                up2.getClass();
                return new c42((sl4) am6.y, up2, 0);
            default:
                q05 q05 = (q05) obj;
                q05.getClass();
                gq0 gq0 = q05.a;
                List list = q05.b;
                if (!gq0.c) {
                    gq0 e = gq0.e();
                    if (e != null) {
                        lq0 = am6.E(e, dt0.s0(1, list));
                    } else {
                        lq0 = (lq0) ((fb4) am6.z).y(gq0.a);
                    }
                    lq0 lq02 = lq0;
                    boolean g = gq0.g();
                    kb4 kb4 = (kb4) am6.x;
                    uq4 f = gq0.f();
                    Integer num = (Integer) dt0.y0(list);
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    return new r05(kb4, lq02, f, g, i2);
                }
                kj6.k("Unresolved local class: ", gq0);
                return null;
        }
    }
}
