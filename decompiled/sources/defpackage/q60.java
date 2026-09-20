package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: q60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class q60 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ q60(aq4 aq4, me7 me7, la5 la5, fw0 fw0) {
        this.w = 13;
        this.y = aq4;
        this.x = me7;
        this.A = la5;
        this.z = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        int i = this.w;
        int i2 = 0;
        vs7 vs7 = vs7.a;
        Object obj3 = this.z;
        Object obj4 = this.A;
        Object obj5 = this.x;
        Object obj6 = this.y;
        switch (i) {
            case b85.b:
                ml4 ml4 = (ml4) obj5;
                aq4 aq4 = (aq4) obj6;
                fw0 fw0 = (fw0) obj3;
                p60 p60 = (p60) obj4;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    Object Q = yt2.Q();
                    d63 d63 = ay0.a;
                    if (Q == d63) {
                        Q = new xi(aq4, 2);
                        yt2.o0(Q);
                    }
                    ml4 I = h49.I(ml4, (vr2) Q);
                    lh4 d = mb0.d(xb4.y, true);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, I);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, d);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    fw0.H(yt2, 0);
                    Object Q2 = yt2.Q();
                    if (Q2 == d63) {
                        Q2 = new wi(aq4, 17);
                        yt2.o0(Q2);
                    }
                    p60.b((sr2) Q2, yt2, 6);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                sr2 sr2 = (sr2) obj4;
                fd1.h((sr2) obj6, (sr2) obj3, sr2, (ml4) obj5, (yt2) obj, b85.v(1));
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                b96.b((sr2) obj6, (ml4) obj5, (t24) obj3, (i24) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 3:
                ((Integer) obj2).getClass();
                ch4.c((qt0) obj5, (gr6) obj6, (br7) obj4, (fw0) obj3, (yt2) obj, b85.v(1));
                return vs7;
            case 4:
                ((Integer) obj2).getClass();
                rs4.l((List) obj5, (vr2) obj6, (vr2) obj3, (vr2) obj4, (yt2) obj, b85.v(3073));
                return vs7;
            case 5:
                ((Integer) obj2).getClass();
                rs4.a((String) obj5, (sr2) obj6, (sr2) obj3, (sr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 6:
                ((Integer) obj2).getClass();
                mp7.t((vr2) obj6, (ml4) obj5, (k98) obj4, (fw0) obj3, (yt2) obj, b85.v(3073));
                return vs7;
            case 7:
                ((Integer) obj2).getClass();
                fx4.g((fw0) obj3, (String) obj5, (ix4) obj6, (fw0) obj4, (yt2) obj, b85.v(3079));
                return vs7;
            case 8:
                ((Integer) obj2).getClass();
                fx4.c((ml4) obj5, (String) obj6, (xw4) obj3, (vr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 9:
                ((Integer) obj2).getClass();
                mp7.r((if7) obj5, (vr2) obj6, (sr2) obj3, (sr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case 10:
                ((Integer) obj2).getClass();
                em6.a((String) obj5, (String) obj6, (bm6) obj3, (sr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                String[] strArr = (String[]) obj5;
                se4 se4 = (se4) obj3;
                Context context = (Context) obj4;
                aq4 aq42 = (aq4) obj6;
                vr2 vr2 = (vr2) obj;
                Boolean bool = (Boolean) obj2;
                boolean booleanValue = bool.booleanValue();
                vr2.getClass();
                if (booleanValue) {
                    int length = strArr.length;
                    while (true) {
                        if (i2 < length) {
                            if (!sg3.A(context, strArr[i2])) {
                                aq42.setValue(new zg1(20, vr2));
                                se4.d0(strArr);
                            } else {
                                i2++;
                            }
                        }
                    }
                    return vs7;
                }
                vr2.y(bool);
                return vs7;
            case 12:
                ((Integer) obj2).getClass();
                dw6.b((String) obj6, (nu0) obj3, (sr2) obj4, (ml4) obj5, (yt2) obj, b85.v(1));
                return vs7;
            default:
                aq4 aq43 = (aq4) obj6;
                me7 me7 = (me7) obj5;
                la5 la5 = (la5) obj4;
                fw0 fw02 = (fw0) obj3;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(intValue2 & 1, z3)) {
                    ml4 z4 = pv8.z(rc9.w0(jl4.w, "Container"), new g5((Object) new ji1(aq43, aq4.class, "value", "getValue()Ljava/lang/Object;", 0), (Object) la5, (Object) me7.a, 23));
                    lh4 d2 = mb0.d(xb4.y, true);
                    int hashCode2 = Long.hashCode(yt22.T);
                    vf5 m2 = yt22.m();
                    ml4 E2 = gw8.E(yt22, z4);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy02);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(tx0.f, yt22, d2);
                    g75.Q(tx0.e, yt22, m2);
                    g75.Q(tx0.g, yt22, Integer.valueOf(hashCode2));
                    g75.O(yt22, tx0.h);
                    g75.Q(tx0.d, yt22, E2);
                    f21.r(0, fw02, yt22, true);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ q60(fw0 fw0, String str, ix4 ix4, fw0 fw02, int i) {
        this.w = 7;
        this.z = fw0;
        this.x = str;
        this.y = ix4;
        this.A = fw02;
    }

    public /* synthetic */ q60(sr2 sr2, ml4 ml4, t24 t24, i24 i24, int i) {
        this.w = 2;
        this.y = sr2;
        this.x = ml4;
        this.z = t24;
        this.A = i24;
    }

    public /* synthetic */ q60(vr2 vr2, ml4 ml4, k98 k98, fw0 fw0, int i) {
        this.w = 6;
        this.y = vr2;
        this.x = ml4;
        this.A = k98;
        this.z = fw0;
    }

    public /* synthetic */ q60(ml4 ml4, aq4 aq4, fw0 fw0, p60 p60) {
        this.w = 0;
        this.x = ml4;
        this.y = aq4;
        this.z = fw0;
        this.A = p60;
    }

    public /* synthetic */ q60(qt0 qt0, gr6 gr6, br7 br7, fw0 fw0, int i) {
        this.w = 3;
        this.x = qt0;
        this.y = gr6;
        this.A = br7;
        this.z = fw0;
    }

    public /* synthetic */ q60(Object obj, Object obj2, sr2 sr2, ml4 ml4, int i, int i2) {
        this.w = i2;
        this.y = obj;
        this.z = obj2;
        this.A = sr2;
        this.x = ml4;
    }

    public /* synthetic */ q60(Object obj, Object obj2, Object obj3, ds2 ds2, int i, int i2) {
        this.w = i2;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = ds2;
    }

    public /* synthetic */ q60(String[] strArr, se4 se4, Context context, aq4 aq4) {
        this.w = 11;
        this.x = strArr;
        this.z = se4;
        this.A = context;
        this.y = aq4;
    }
}
