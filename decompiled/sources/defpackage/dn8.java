package defpackage;

import com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity;

/* renamed from: dn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dn8 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ boolean y;

    public dn8(boolean z, o9 o9Var) {
        this.w = 3;
        this.y = z;
        this.x = o9Var;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        boolean z2 = true;
        vs7 vs7 = vs7.a;
        Object obj3 = this.x;
        boolean z3 = this.y;
        switch (i) {
            case b85.b:
                int intValue = ((Integer) obj2).intValue();
                int i2 = intValue & 3;
                int i3 = intValue & 1;
                yt2 yt2 = (yt2) obj;
                int i4 = OssLicensesMenuActivity.X;
                if (i2 != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(i3, z)) {
                    long j = ((qt0) yt2.k(lr8.a)).n;
                    ml4 W = ar7.W(yu6.c, "LicenseTheme");
                    boolean f = yt2.f(j);
                    Object Q = yt2.Q();
                    if (f || Q == ay0.a) {
                        Q = new sl8(j);
                        yt2.o0(Q);
                    }
                    s87.a(ck6.a(W, false, (vr2) Q), (pq6) null, j, 0, 0.0f, 0.0f, su0.J(-382829429, new dn8(1, (String) obj3, z3), yt2), yt2, 12582912, 122);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = intValue2 & 3;
                int i6 = intValue2 & 1;
                yt2 yt22 = (yt2) obj;
                int i7 = OssLicensesMenuActivity.X;
                if (i5 == 2) {
                    z2 = false;
                }
                if (yt22.V(i6, z2)) {
                    i35.s((bs8) null, (String) obj3, z3, yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                int i8 = intValue3 & 3;
                int i9 = intValue3 & 1;
                yt2 yt23 = (yt2) obj;
                int i10 = OssLicensesMenuActivity.X;
                if (i8 == 2) {
                    z2 = false;
                }
                if (yt23.V(i9, z2)) {
                    lr8.a(false, false, su0.J(-1968053328, new dn8(0, (String) obj3, z3), yt23), yt23, 384);
                } else {
                    yt23.Y();
                }
                return vs7;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                if (!z3 || !str.equals("Content-Length")) {
                    zy2 zy2 = (zy2) ((o9) obj3).z;
                    zy2.getClass();
                    za5.u(str);
                    za5.v(str2, str);
                    za5.m(zy2, str, str2);
                }
                return vs7;
        }
    }

    public /* synthetic */ dn8(int i, String str, boolean z) {
        this.w = i;
        this.x = str;
        this.y = z;
    }
}
