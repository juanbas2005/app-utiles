package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: v61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v61 implements vr2 {
    public static final v61 A = new v61(3);
    public static final v61 B = new v61(4);
    public static final v61 C = new v61(5);
    public static final v61 D = new v61(6);
    public static final v61 E = new v61(7);
    public static final v61 F = new v61(8);
    public static final v61 G = new v61(9);
    public static final v61 H = new v61(10);
    public static final v61 I = new v61(11);
    public static final v61 J = new v61(12);
    public static final v61 K = new v61(13);
    public static final v61 L = new v61(14);
    public static final v61 M = new v61(15);
    public static final v61 N = new v61(16);
    public static final v61 O = new v61(17);
    public static final v61 P = new v61(18);
    public static final v61 Q = new v61(19);
    public static final v61 R = new v61(20);
    public static final v61 S = new v61(21);
    public static final v61 T = new v61(22);
    public static final v61 U = new v61(23);
    public static final v61 V = new v61(24);
    public static final v61 W = new v61(25);
    public static final v61 X = new v61(26);
    public static final v61 Y = new v61(27);
    public static final v61 Z = new v61(28);
    public static final v61 a0 = new v61(29);
    public static final v61 x = new v61(0);
    public static final v61 y = new v61(1);
    public static final v61 z = new v61(2);
    public final /* synthetic */ int w;

    public /* synthetic */ v61(int i) {
        this.w = i;
    }

    public final Object y(Object obj) {
        gq3 gq3;
        vw3 b;
        boolean z2 = true;
        switch (this.w) {
            case b85.b:
                if (((Character) obj).charValue() != ':') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 1:
                if (((Character) obj).charValue() != ':') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 2:
                return Boolean.valueOf(tf4.E(((Character) obj).charValue()));
            case 3:
                char charValue = ((Character) obj).charValue();
                if (charValue < 0 || charValue >= 256) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case 5:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case 6:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case 7:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case 8:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case 9:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case 10:
                return Boolean.valueOf(tf4.E(((Character) obj).charValue()));
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                char charValue2 = ((Character) obj).charValue();
                if (charValue2 < 0 || charValue2 >= 256) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 12:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            case 14:
                vw3 vw3 = (vw3) obj;
                ms1 ms1 = ms1.c;
                vw3.getClass();
                return vw3;
            case h75.g:
                h28 h28 = (h28) obj;
                ms1 ms12 = ms1.c;
                return "";
            case 16:
                vw3 vw32 = (vw3) obj;
                yr3[] yr3Arr = ps1.Z;
                vw32.getClass();
                return vw32;
            case 17:
                yr3[] yr3Arr2 = ps1.Z;
                ((h28) obj).getClass();
                return "...";
            case 18:
                vj1 vj1 = (vj1) obj;
                int i = ts1.a;
                vj1.getClass();
                return vj1.r();
            case 19:
                return ((h28) obj).b();
            case 20:
                p16 p16 = (p16) obj;
                wu0 wu0 = mb2.a;
                p16.getClass();
                yq3 yq3 = ((q16) p16).w.d;
                if (yq3 == null) {
                    yq3 = p16.B();
                }
                if (yq3 instanceof gq3) {
                    gq3 = (gq3) yq3;
                } else {
                    gq3 = null;
                }
                if (gq3 == null || !kl8.u(gq3).isInterface()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 21:
                p16 p162 = (p16) obj;
                wu0 wu02 = mb2.a;
                p162.getClass();
                yq3 yq32 = ((q16) p162).w.d;
                if (yq32 == null) {
                    yq32 = p162.B();
                }
                return Boolean.valueOf(sg3.e(yq32, b26.a.b(Object.class)));
            case 22:
                ((gq0) obj).getClass();
                return 0;
            case 23:
                yb5 yb5 = (yb5) obj;
                yb5.getClass();
                return dt0.E0((Iterable) yb5.x, ",", (String) null, (String) null, new b0(15, yb5), 30);
            case 24:
                return Boolean.TRUE;
            case 25:
                vw3 vw33 = (vw3) obj;
                vw33.getClass();
                return vw33.toString();
            case 26:
                vw3 vw34 = (vw3) obj;
                vw34.getClass();
                return vw34.toString();
            case 27:
                t16 t16 = (t16) obj;
                t16.getClass();
                return m06.b(kl8.u(rj1.v(t16.y())));
            case 28:
                sl4 sl4 = (sl4) obj;
                Map map = di3.a;
                sl4.getClass();
                h28 q = rj1.q(bi3.b, sl4.g().j(m27.t));
                if (q == null || (b = q.b()) == null) {
                    return z62.c(x62.Y, new String[0]);
                }
                return b;
            default:
                sl4 sl42 = (sl4) obj;
                hr2 hr2 = rn3.d;
                sl42.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object next : (List) p25.q(sl42.k0(rn3.f).A, v34.D[0])) {
                    if (next instanceof rd0) {
                        arrayList.add(next);
                    }
                }
                return (vj1) dt0.w0(arrayList);
        }
    }
}
