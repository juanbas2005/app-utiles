package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.Arrays;

/* renamed from: vh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vh1 implements is2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ok2 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ vr2 D;
    public final /* synthetic */ kg1 E;
    public final /* synthetic */ ig1 F;
    public final /* synthetic */ re3 w;
    public final /* synthetic */ vh0 x;
    public final /* synthetic */ sr2 y;
    public final /* synthetic */ sr2 z;

    public /* synthetic */ vh1(re3 re3, vh0 vh0, sr2 sr2, sr2 sr22, int i, ok2 ok2, int i2, vr2 vr2, kg1 kg1, ig1 ig1) {
        this.w = re3;
        this.x = vh0;
        this.y = sr2;
        this.z = sr22;
        this.A = i;
        this.B = ok2;
        this.C = i2;
        this.D = vr2;
        this.E = kg1;
        this.F = ig1;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        yz3 yz3 = (yz3) obj;
        int intValue = ((Integer) obj2).intValue();
        yt2 yt2 = (yt2) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        if ((intValue2 & 48) == 0) {
            if (yt2.e(intValue)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue2 |= i;
        }
        if ((intValue2 & 145) != 144) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue2 & 1, z2)) {
            int i2 = intValue + this.w.w;
            String a = uh0.a(i2, this.x.a);
            float f = h03.Q;
            float f2 = h03.P;
            ml4 ml4 = jl4.w;
            ml4 i3 = yu6.i(ml4, f, f2);
            sr2 sr2 = this.y;
            boolean g = yt2.g(sr2);
            sr2 sr22 = this.z;
            boolean g2 = g | yt2.g(sr22);
            Object Q = yt2.Q();
            Object obj5 = ay0.a;
            if (g2 || Q == obj5) {
                Q = new e3(6, (Object) sr2, (Object) sr22);
                yt2.o0(Q);
            }
            ml4 U = t49.U(i3, (vr2) Q);
            int i4 = this.A;
            if (i2 == i4) {
                ml4 = uq3.s(ml4, this.B);
            }
            ml4 d = U.d(ml4);
            if (i2 == i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i2 == this.C) {
                z4 = true;
            } else {
                z4 = false;
            }
            vr2 vr2 = this.D;
            boolean g3 = yt2.g(vr2) | yt2.e(i2);
            Object Q2 = yt2.Q();
            if (g3 || Q2 == obj5) {
                Q2 = new yh1(i2, 0, vr2);
                yt2.o0(Q2);
            }
            this.E.getClass();
            gi1.m(a, d, z3, z4, (sr2) Q2, String.format(h75.i(R.string.m3c_date_picker_navigate_to_year_description, yt2), Arrays.copyOf(new Object[]{a}, 1)), this.F, yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
