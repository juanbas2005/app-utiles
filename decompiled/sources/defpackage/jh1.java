package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;

/* renamed from: jh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jh1 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ jh1(sr2 sr2, boolean z2, sr2 sr22, ml4 ml4, boolean z3) {
        this.z = sr2;
        this.x = z2;
        this.A = sr22;
        this.B = ml4;
        this.y = z3;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        vs7 vs7;
        int i = this.w;
        vs7 vs72 = vs7.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.B;
        switch (i) {
            case b85.b:
                sr2 sr2 = (sr2) obj4;
                sr2 sr22 = (sr2) obj3;
                ml4 ml4 = (ml4) obj5;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    ea6 a = ca6.a(wr.a, xb4.H, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, jl4.w);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, a);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    x83 x83 = rc9.s;
                    if (x83 != null) {
                        vs7 = vs72;
                    } else {
                        w83 w83 = new w83("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, true, 96);
                        int i2 = e38.a;
                        vs7 = vs72;
                        ky6 ky6 = new ky6(jt0.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new ie5(15.41f, 16.59f));
                        arrayList.add(new he5(10.83f, 12.0f));
                        arrayList.add(new pe5(4.58f, -4.59f));
                        arrayList.add(new he5(14.0f, 6.0f));
                        arrayList.add(new pe5(-6.0f, 6.0f));
                        arrayList.add(new pe5(6.0f, 6.0f));
                        arrayList.add(new pe5(1.41f, -1.41f));
                        arrayList.add(ee5.c);
                        w83.a(w83, arrayList, ky6, 14336);
                        x83 = w83.b();
                        rc9.s = x83;
                    }
                    gi1.h(sr2, x83, h75.i(R.string.m3c_date_picker_switch_to_previous_month, yt2), (ml4) null, this.x, yt2, 0, 8);
                    x83 x832 = rc9.t;
                    if (x832 == null) {
                        w83 w832 = new w83("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, true, 96);
                        int i3 = e38.a;
                        ky6 ky62 = new ky6(jt0.b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new ie5(8.59f, 16.59f));
                        arrayList2.add(new he5(13.17f, 12.0f));
                        arrayList2.add(new he5(8.59f, 7.41f));
                        arrayList2.add(new he5(10.0f, 6.0f));
                        arrayList2.add(new pe5(6.0f, 6.0f));
                        arrayList2.add(new pe5(-6.0f, 6.0f));
                        arrayList2.add(new pe5(-1.41f, -1.41f));
                        arrayList2.add(ee5.c);
                        w83.a(w832, arrayList2, ky62, 14336);
                        x832 = w832.b();
                        rc9.t = x832;
                    }
                    ml4 ml42 = ml4;
                    yt2 yt22 = yt2;
                    gi1.h(sr22, x832, h75.i(R.string.m3c_date_picker_switch_to_next_month, yt2), ml42, this.y, yt22, 0, 0);
                    yt22.r(true);
                    return vs7;
                }
                vs7 vs73 = vs72;
                yt2.Y();
                return vs73;
            case 1:
                ((Integer) obj2).getClass();
                rs4.c((String) obj4, this.x, this.y, (String) obj3, (vr2) obj5, (yt2) obj, b85.v(1));
                return vs72;
            default:
                ((Integer) obj2).getClass();
                mp7.x((byte[]) obj5, this.x, this.y, (sr2) obj4, (sr2) obj3, (yt2) obj, b85.v(24577));
                return vs72;
        }
    }

    public /* synthetic */ jh1(String str, boolean z2, boolean z3, String str2, vr2 vr2, int i) {
        this.z = str;
        this.x = z2;
        this.y = z3;
        this.A = str2;
        this.B = vr2;
    }

    public /* synthetic */ jh1(byte[] bArr, boolean z2, boolean z3, sr2 sr2, sr2 sr22, int i) {
        this.B = bArr;
        this.x = z2;
        this.y = z3;
        this.z = sr2;
        this.A = sr22;
    }
}
