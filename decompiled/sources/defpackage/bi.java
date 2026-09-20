package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bi implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ bi(h24 h24, Object obj, int i, Object obj2, int i2) {
        this.w = 11;
        this.z = h24;
        this.A = obj;
        this.y = i;
        this.x = obj2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        int i = this.w;
        int i2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.A;
        vs7 vs7 = vs7.a;
        Object obj5 = this.z;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                r16.k((x35) obj5, (jb) obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                h49.m((ml4) obj5, (hu5) obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                rc9.g((ek7) obj5, (aq4) obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 3:
                ((Integer) obj2).getClass();
                ((fw0) obj3).k(obj5, obj4, (yt2) obj, b85.v(i2) | 1);
                return vs7;
            case 4:
                ((Integer) obj2).getClass();
                a61.b((ml4) obj5, (x51) obj4, (vr2) obj3, (yt2) obj, b85.v(1), this.y);
                return vs7;
            case 5:
                ((Integer) obj2).getClass();
                a61.a((x51) obj5, (ml4) obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 6:
                ((Integer) obj2).getClass();
                gi1.f((ml4) obj5, this.y, (vr2) obj4, (ig1) obj3, (yt2) obj, b85.v(7));
                return vs7;
            case 7:
                ((Integer) obj2).intValue();
                zn1.c((md7) obj5, (zc7) obj4, (sr2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 8:
                ((Integer) obj2).intValue();
                ie1.h((View) obj5, (tp1) obj4, (sr2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 9:
                ((Integer) obj2).getClass();
                r16.j((sr2) obj5, (sr2) obj4, (ml4) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 10:
                ((Integer) obj2).intValue();
                r16.c((String) obj5, (List) obj4, (vr2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((Integer) obj2).getClass();
                dh4.c((h24) obj5, this.A, this.y, this.x, (yt2) obj, b85.v(1));
                return vs7;
            case 12:
                ((Integer) obj2).getClass();
                ((x34) obj5).b(obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((Integer) obj2).intValue();
                h49.l((t54) obj5, (a64) obj4, (vr2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 14:
                ((Integer) obj2).intValue();
                xz5.o((oz5) obj5, (sr2) obj4, (sr2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case h75.g /*15*/:
                ((Integer) obj2).intValue();
                d36.e((Long) obj5, (Long) obj4, (gs2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 16:
                List list = (List) obj5;
                o81 o81 = (o81) obj4;
                um1 um1 = (um1) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    int i3 = 0;
                    for (Object next : list) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            x83 x83 = (x83) next;
                            if (i2 == i3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean i5 = yt2.i(o81) | yt2.g(um1) | yt2.e(i3);
                            Object Q = yt2.Q();
                            if (i5 || Q == ay0.a) {
                                Q = new s52(o81, um1, i3);
                                yt2.o0(Q);
                            }
                            va7.b(z3, (sr2) Q, yu6.d(jl4.w, 40.0f), false, (gs2) null, su0.J(-1430121366, new wz5(i2, i3, x83), yt2), 0, 0, yt2, 196992, 472);
                            i3 = i4;
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                } else {
                    yt2.Y();
                }
                return vs7;
            case 17:
                ((Integer) obj2).getClass();
                ((pe6) obj5).b(obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 18:
                ((Integer) obj2).getClass();
                bb0.G((String) obj5, (az7) obj4, (vr2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 19:
                ((Integer) obj2).getClass();
                sg3.c((is7) obj5, (is2) obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 20:
                ((Integer) obj2).getClass();
                ((fg7) obj5).b((Object[]) obj4, (vr2) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            default:
                ((Integer) obj2).getClass();
                i35.a((ArrayList) obj5, this.y, (vr2) obj4, (ml4) obj3, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ bi(fw0 fw0, Object obj, Object obj2, int i) {
        this.w = 3;
        this.x = fw0;
        this.z = obj;
        this.A = obj2;
        this.y = i;
    }

    public /* synthetic */ bi(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.w = i2;
        this.z = obj;
        this.A = obj2;
        this.x = obj3;
        this.y = i;
    }

    public /* synthetic */ bi(ml4 ml4, x51 x51, vr2 vr2, int i, int i2) {
        this.w = 4;
        this.z = ml4;
        this.A = x51;
        this.x = vr2;
        this.y = i2;
    }

    public /* synthetic */ bi(ek7 ek7, aq4 aq4, fw0 fw0, int i) {
        this.w = 2;
        this.z = ek7;
        this.A = aq4;
        this.x = fw0;
        this.y = i;
    }

    public /* synthetic */ bi(Object obj, int i, vr2 vr2, Object obj2, int i2, int i3) {
        this.w = i3;
        this.z = obj;
        this.y = i;
        this.A = vr2;
        this.x = obj2;
    }

    public /* synthetic */ bi(List list, int i, o81 o81, um1 um1) {
        this.w = 16;
        this.z = list;
        this.y = i;
        this.A = o81;
        this.x = um1;
    }
}
