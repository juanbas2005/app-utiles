package defpackage;

import java.util.List;

/* renamed from: s03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class s03 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s03(gs2 gs2, fw0 fw0, gs2 gs22, long j, long j2) {
        this.w = 2;
        this.z = gs2;
        this.A = fw0;
        this.B = gs22;
        this.x = j;
        this.y = j2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                t13.g((String) obj5, (String) obj4, (x83) obj3, this.x, this.y, (yt2) obj, b85.v(1));
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                rj1.d((ml4) obj5, this.x, this.y, (pq6) obj4, (List) obj3, (yt2) obj, b85.v(1));
                return vs7;
            case 2:
                gs2 gs2 = (gs2) obj5;
                fw0 fw0 = (fw0) obj4;
                gs2 gs22 = (gs2) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(1 & intValue, z2)) {
                    t49.c(yf7.a.a(dr7.a(ie1.d0, yt2)), su0.J(969655473, new tw6(gs2, fw0, gs22, dr7.a(ie1.X, yt2), this.x, this.y), yt2), yt2, 56);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                w95.a((String) obj5, this.x, this.y, (am2) obj4, (ea7) obj3, (yt2) obj, b85.v(3505));
                return vs7;
        }
    }

    public /* synthetic */ s03(Object obj, long j, long j2, Object obj2, Object obj3, int i, int i2) {
        this.w = i2;
        this.z = obj;
        this.x = j;
        this.y = j2;
        this.A = obj2;
        this.B = obj3;
    }

    public /* synthetic */ s03(String str, String str2, x83 x83, long j, long j2, int i) {
        this.w = 0;
        this.z = str;
        this.A = str2;
        this.B = x83;
        this.x = j;
        this.y = j2;
    }
}
