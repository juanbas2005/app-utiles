package defpackage;

import java.util.Set;

/* renamed from: zo7  reason: default package */
public final class zo7 implements vr2 {
    public final /* synthetic */ int w;
    public final bk7 x;

    public /* synthetic */ zo7(bk7 bk7, int i) {
        this.w = i;
        this.x = bk7;
    }

    public final Object y(Object obj) {
        int i = this.w;
        bk7 bk7 = this.x;
        switch (i) {
            case b85.b:
                int intValue = ((Number) obj).intValue();
                z00 z00 = (z00) bk7.b;
                gq0 J = t49.J((vq4) z00.b, intValue);
                boolean z = J.c;
                ws1 ws1 = (ws1) z00.a;
                if (!z) {
                    return r16.z(ws1.b, J);
                }
                eq0 eq0 = ws1.t;
                Set set = eq0.c;
                return eq0.a(J, (xp0) null);
            case 1:
                int intValue2 = ((Number) obj).intValue();
                z00 z002 = (z00) bk7.b;
                gq0 J2 = t49.J((vq4) z002.b, intValue2);
                if (J2.c) {
                    return null;
                }
                sl4 sl4 = ((ws1) z002.a).b;
                sl4.getClass();
                vq0 z2 = r16.z(sl4, J2);
                if (z2 instanceof ut1) {
                    return (ut1) z2;
                }
                return null;
            default:
                bt5 bt5 = (bt5) obj;
                bt5.getClass();
                return p25.w(bt5, (wv1) ((z00) bk7.b).d);
        }
    }
}
