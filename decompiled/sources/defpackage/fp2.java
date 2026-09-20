package defpackage;

import java.util.List;

/* renamed from: fp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fp2 implements is2 {
    public final /* synthetic */ is2 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ gs2 C;
    public final /* synthetic */ vr2 D;
    public final /* synthetic */ vr2 E;
    public final /* synthetic */ aq4 F;
    public final /* synthetic */ aq4 G;
    public final /* synthetic */ List w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ mo2 y;
    public final /* synthetic */ o81 z;

    public fp2(List list, aq4 aq4, mo2 mo2, o81 o81, is2 is2, String str, gs2 gs2, vr2 vr2, vr2 vr22, aq4 aq42, aq4 aq43) {
        this.w = list;
        this.x = aq4;
        this.y = mo2;
        this.z = o81;
        this.A = is2;
        this.B = str;
        this.C = gs2;
        this.D = vr2;
        this.E = vr22;
        this.F = aq42;
        this.G = aq43;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z2;
        int i2;
        int i3;
        r04 r04 = (r04) obj;
        int intValue = ((Number) obj2).intValue();
        yt2 yt2 = (yt2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (yt2.g(r04)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (yt2.e(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        boolean z3 = true;
        if ((i & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i & 1, z2)) {
            en2 en2 = (en2) this.w.get(intValue);
            yt2.e0(-763682196);
            String str = en2.a;
            Boolean valueOf = Boolean.valueOf(en2.g);
            String str2 = en2.e;
            boolean i4 = yt2.i(en2);
            aq4 aq4 = this.x;
            boolean g = i4 | yt2.g(aq4);
            Object Q = yt2.Q();
            Object obj5 = ay0.a;
            if (g || Q == obj5) {
                Q = new tc1(en2, aq4, (f61) null, 2);
                yt2.o0(Q);
            }
            t49.i(str, valueOf, str2, (gs2) Q, yt2);
            mo2 mo2 = this.y;
            am5 am5 = (am5) mo2.l.get(en2.a);
            if (!en2.n && !mo2.f) {
                z3 = false;
            }
            boolean g2 = yt2.g(mo2) | yt2.i(this.z) | yt2.i(this.A) | yt2.g(this.B) | yt2.g(this.C) | yt2.i(en2);
            Object Q2 = yt2.Q();
            if (g2 || Q2 == obj5) {
                dp2 dp2 = new dp2(this.C, en2, this.y, this.z, this.A, this.B);
                yt2.o0(dp2);
                Q2 = dp2;
            }
            vr2 vr2 = (vr2) Q2;
            vr2 vr22 = this.D;
            boolean g3 = yt2.g(vr22) | yt2.i(en2);
            Object Q3 = yt2.Q();
            if (g3 || Q3 == obj5) {
                Q3 = new p3(vr22, false, en2, 8);
                yt2.o0(Q3);
            }
            sr2 sr2 = (sr2) Q3;
            boolean i5 = yt2.i(en2);
            vr2 vr23 = this.E;
            boolean g4 = i5 | yt2.g(vr23);
            Object Q4 = yt2.Q();
            if (g4 || Q4 == obj5) {
                Q4 = new o3(en2, vr23, this.F, 2);
                yt2.o0(Q4);
            }
            sr2 sr22 = (sr2) Q4;
            boolean i6 = yt2.i(en2);
            Object Q5 = yt2.Q();
            if (i6 || Q5 == obj5) {
                Q5 = new p3(en2, false, this.G, 9);
                yt2.o0(Q5);
            }
            r16.n(en2, am5, z3, vr2, sr2, sr22, (sr2) Q5, yt2, 0);
            yt2.r(false);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
