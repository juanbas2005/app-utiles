package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: n13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n13 implements is2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ n13(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [mk1, java.lang.Object] */
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        Object obj5 = this.y;
        Object obj6 = this.x;
        switch (i2) {
            case b85.b:
                List list = (List) obj6;
                hj hjVar = (hj) obj5;
                int intValue = ((Integer) obj2).intValue();
                yt2 yt2 = (yt2) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((eb5) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    if (yt2.e(intValue)) {
                        i = 32;
                    } else {
                        i = 16;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 145) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue2 & 1, z)) {
                    uq5 uq5 = (uq5) list.get(intValue);
                    r83 r83 = new r83((Context) yt2.k(ye.b));
                    r83.c = uq5.a;
                    r83.f = new Object();
                    r83.h = new ic1(100);
                    s83 a = r83.a();
                    ml4 i3 = uq3.i(yu6.a, 1.4754099f, false);
                    boolean i4 = yt2.i(hjVar) | yt2.i(uq5);
                    Object Q = yt2.Q();
                    if (i4 || Q == ay0.a) {
                        Q = new f5(23, hjVar, uq5);
                        yt2.o0(Q);
                    }
                    wn6.b(a, h49.u(i3, false, (String) null, (sr2) Q, 15), i51.b, yt2, 1572912);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                ((Integer) obj4).getClass();
                ((fk) obj).getClass();
                ((zs4) obj2).getClass();
                h49.i((ru4) obj6, (is2) obj5, (rh3) null, (yt2) obj3, 0);
                return vs7;
            case 2:
                ((Integer) obj4).getClass();
                ((fk) obj).getClass();
                ((zs4) obj2).getClass();
                fd1.k((ru4) obj6, (is2) obj5, (ic5) null, (yt2) obj3, 0);
                return vs7;
            case 3:
                ((Integer) obj4).getClass();
                ((fk) obj).getClass();
                ((zs4) obj2).getClass();
                b88.c((ru4) obj6, (is2) obj5, (e88) null, (yt2) obj3, 0);
                return vs7;
            case 4:
                ((Integer) obj4).getClass();
                ((fk) obj).getClass();
                ((zs4) obj2).getClass();
                mp7.n((ru4) obj6, (is2) obj5, (ku1) null, (yt2) obj3, 0);
                return vs7;
            case 5:
                ((Integer) obj4).getClass();
                ((fk) obj).getClass();
                ((zs4) obj2).getClass();
                d36.i((xa7) obj6, (is2) obj5, (g36) null, (yt2) obj3, 0);
                return vs7;
            default:
                ((Integer) obj4).getClass();
                ((fk) obj).getClass();
                ((zs4) obj2).getClass();
                fd1.f((ru4) obj6, (is2) obj5, (e41) null, (yt2) obj3, 0);
                return vs7;
        }
    }
}
