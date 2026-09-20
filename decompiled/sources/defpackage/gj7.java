package defpackage;

import android.app.Activity;

/* renamed from: gj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gj7 implements hs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public gj7(oa3 oa3, ij7 ij7, boolean z2, s86 s86, sr2 sr2) {
        this.y = oa3;
        this.z = ij7;
        this.x = z2;
        this.A = s86;
        this.B = sr2;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.w;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.B;
        Object obj7 = this.A;
        boolean z2 = false;
        Object obj8 = ay0.a;
        switch (i) {
            case b85.b:
                ml4 ml4 = (ml4) obj;
                yt2 yt2 = (yt2) obj2;
                ((Number) obj3).intValue();
                yt2.e0(-1525724089);
                Object Q = yt2.Q();
                if (Q == obj8) {
                    Q = b81.e(yt2);
                }
                ap4 ap4 = (ap4) Q;
                ml4 d = la3.a(jl4.w, ap4, (oa3) obj5).d(new on7((ij7) obj4, ap4, (oa3) null, this.x, (s86) obj7, (sr2) obj6));
                yt2.r(false);
                return d;
            default:
                int intValue = ((Integer) obj3).intValue();
                yt2 yt22 = (yt2) obj2;
                ((m79) obj).getClass();
                int i2 = intValue & 1;
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (yt22.V(i2, z2)) {
                    Activity activity = (Activity) obj7;
                    boolean i3 = yt22.i(activity);
                    Object Q2 = yt22.Q();
                    if (i3 || Q2 == obj8) {
                        Q2 = new xo3(18, activity);
                        yt22.o0(Q2);
                    }
                    sr2 sr2 = (sr2) Q2;
                    Object Q3 = yt22.Q();
                    if (Q3 == obj8) {
                        Q3 = new st6(6, (yx6) obj6);
                        yt22.o0(Q3);
                    }
                    k75.o((bs8) obj5, (String) obj4, sr2, (vr2) Q3, this.x, yt22, 3072);
                } else {
                    yt22.Y();
                }
                return vs7.a;
        }
    }

    public /* synthetic */ gj7(bs8 bs8, String str, Activity activity, boolean z2, yx6 yx6) {
        this.y = bs8;
        this.z = str;
        this.A = activity;
        this.x = z2;
        this.B = yx6;
    }
}
