package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: xi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xi6 {
    public static final xi6 a = new Object();
    public static final float b = we.o;
    public static final float c = we.t;
    public static final pa5 d;

    /* JADX WARNING: type inference failed for: r0v0, types: [xi6, java.lang.Object] */
    static {
        pa5 pa5 = yd0.a;
        d = new pa5(12.0f, pa5.b, 12.0f, pa5.d);
    }

    public final void a(int i, yt2 yt2) {
        boolean z;
        yt2 yt22;
        yt2.g0(-1273041460);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i & 1, z)) {
            x83 x83 = su0.o;
            if (x83 == null) {
                w83 w83 = new w83("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 224);
                int i2 = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new ie5(9.0f, 16.17f));
                arrayList.add(new he5(4.83f, 12.0f));
                arrayList.add(new pe5(-1.42f, 1.41f));
                arrayList.add(new he5(9.0f, 19.0f));
                arrayList.add(new he5(21.0f, 7.0f));
                arrayList.add(new pe5(-1.41f, -1.41f));
                arrayList.add(ee5.c);
                w83.a(w83, arrayList, ky6, 14336);
                x83 = w83.b();
                su0.o = x83;
            }
            yt22 = yt2;
            d83.a(x83, (String) null, yu6.l(jl4.w, c), 0, yt22, 48, 8);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ph6(i, 1, this);
        }
    }

    public final void b(boolean z, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        fw0 fw0;
        yt2 yt22 = yt2;
        yt22.g0(-657462570);
        boolean z3 = z;
        if (yt22.h(z3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 432;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            fw0 fw02 = tf4.a;
            yt22.e0(-1416240287);
            ie1.c(z3, (ml4) null, i52.e(hj8.H(vm4.y, yt22), 2).a(new n52(new nm7((gb2) null, (dv6) null, (cn0) null, new xf6(0.0f, o55.a(0.0f, 1.0f), hj8.H(vm4.x, yt22)), (LinkedHashMap) null, 119))), x82.b, (String) null, su0.J(2059591811, new ww0(28), yt22), yt22, (i3 & 14) | 196608, 18);
            yt22.r(false);
            fw0 = fw02;
        } else {
            yt22.Y();
            fw0 = gs2;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new j92(i, 5, this, fw0, z);
        }
    }
}
