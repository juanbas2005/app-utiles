package defpackage;

import android.content.Context;

/* renamed from: z78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class z78 implements hs2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ se4 C;
    public final /* synthetic */ aq4 D;
    public final /* synthetic */ ru4 w;
    public final /* synthetic */ se4 x;
    public final /* synthetic */ e88 y;
    public final /* synthetic */ String z;

    public /* synthetic */ z78(ru4 ru4, se4 se4, e88 e88, String str, String str2, Context context, se4 se42, aq4 aq4) {
        this.w = ru4;
        this.x = se4;
        this.y = e88;
        this.z = str;
        this.A = str2;
        this.B = context;
        this.C = se42;
        this.D = aq4;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z2;
        Context context;
        boolean z3;
        int i;
        w78 w78 = (w78) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        w78.getClass();
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                z3 = yt2.g(w78);
            } else {
                z3 = yt2.i(w78);
            }
            if (z3) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        boolean z4 = false;
        if ((intValue & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            se4 se4 = this.x;
            boolean i2 = yt2.i(se4);
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (i2 || Q == d63) {
                Q = new wo2(se4, 3);
                yt2.o0(Q);
            }
            sr2 sr2 = (sr2) Q;
            e88 e88 = this.y;
            boolean i3 = yt2.i(e88);
            Object Q2 = yt2.Q();
            if (i3 || Q2 == d63) {
                xi5 xi5 = new xi5(0, e88, e88.class, "downloadRandomConfig", "downloadRandomConfig()V", 0, 0, 20);
                yt2.o0(xi5);
                Q2 = xi5;
            }
            sr2 sr22 = (sr2) ((zq3) Q2);
            String str = this.z;
            boolean g = yt2.g(str);
            String str2 = this.A;
            boolean g2 = g | yt2.g(str2);
            Context context2 = this.B;
            boolean i4 = g2 | yt2.i(context2);
            Object Q3 = yt2.Q();
            if (i4 || Q3 == d63) {
                Context context3 = context2;
                Q3 = new mm0((Object) str, (Object) str2, (Object) context3, (Object) this.D, 8);
                context = context3;
                yt2.o0(Q3);
            } else {
                context = context2;
            }
            sr2 sr23 = (sr2) Q3;
            boolean i5 = yt2.i(context);
            int i6 = intValue & 14;
            if (i6 == 4 || ((intValue & 8) != 0 && yt2.i(w78))) {
                z4 = true;
            }
            se4 se42 = this.C;
            boolean i7 = i5 | z4 | yt2.i(se42) | yt2.i(e88);
            Object Q4 = yt2.Q();
            if (i7 || Q4 == d63) {
                mm0 mm0 = new mm0((Object) context, (Object) w78, (Object) se42, (Object) e88, 9);
                yt2.o0(mm0);
                Q4 = mm0;
            }
            b88.d(w78, this.w, sr2, sr22, sr23, (sr2) Q4, yt2, i6);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
