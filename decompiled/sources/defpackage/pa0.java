package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pa0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pa0 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ float x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ pa0(float f, List list, hg7 hg7, List list2, tg7 tg7) {
        this.x = f;
        this.y = list;
        this.z = hg7;
        this.A = list2;
        this.B = tg7;
    }

    public final Object y(Object obj) {
        wr0 j0;
        long L;
        float f;
        float f2;
        vs7 vs7;
        float f3;
        float f4;
        float f5;
        bg7 bg7;
        int i;
        bg7 bg72;
        int i2 = this.w;
        float f6 = this.x;
        vs7 vs72 = vs7.a;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        switch (i2) {
            case b85.b:
                float f7 = f6;
                vs7 vs73 = vs72;
                ly5 ly5 = (ly5) obj5;
                k85 k85 = (k85) obj4;
                kc0 kc0 = (kc0) obj3;
                eh ehVar = (eh) obj2;
                hz1 hz1 = (hz1) obj;
                float f8 = -ly5.a;
                float f9 = -ly5.b;
                ((ji8) hz1.j0().x).F(f8, f9);
                try {
                    hz1.U(hz1, k85.l, kc0, 0.0f, new l57(f7 * 2.0f, 0.0f, 0, 0, 30), (lt0) null, 52);
                    float intBitsToFloat = (Float.intBitsToFloat((int) (hz1.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (hz1.e() >> 32));
                    float intBitsToFloat2 = (Float.intBitsToFloat((int) (hz1.e() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (hz1.e() & 4294967295L));
                    long v0 = hz1.v0();
                    j0 = hz1.j0();
                    L = j0.L();
                    j0.D().h();
                    ((ji8) j0.x).E(intBitsToFloat, intBitsToFloat2, v0);
                    hz1.U(hz1, ehVar, kc0, 0.0f, (l57) null, (lt0) null, 28);
                    j0.D().p();
                    j0.e0(L);
                    ((ji8) hz1.j0().x).F(-f8, -f9);
                    return vs73;
                } catch (Throwable th) {
                    ((ji8) hz1.j0().x).F(-f8, -f9);
                    throw th;
                }
            case 1:
                List list = (List) obj5;
                hg7 hg7 = (hg7) obj4;
                List list2 = (List) obj3;
                tg7 tg7 = (tg7) obj2;
                hz1 hz12 = (hz1) obj;
                hz12.getClass();
                float e0 = hz12.e0(18.0f);
                float intBitsToFloat3 = (Float.intBitsToFloat((int) (hz12.e() >> 32)) / 2.0f) - (hz12.e0(26.0f) + e0);
                float intBitsToFloat4 = Float.intBitsToFloat((int) (hz12.e() >> 32)) / 2.0f;
                float intBitsToFloat5 = Float.intBitsToFloat((int) (hz12.e() & 4294967295L)) / 2.0f;
                long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat4 - intBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat5 - intBitsToFloat3)) & 4294967295L);
                float f10 = intBitsToFloat3 * 2.0f;
                float f11 = f6;
                long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                yb5 yb5 = new yb5(Float.valueOf(0.0f), new jt0(uq3.d(4279974492L)));
                yb5 yb52 = new yb5(Float.valueOf(0.125f), new jt0(uq3.d(4279974492L)));
                long j = floatToRawIntBits;
                vs7 vs74 = vs72;
                yb5 yb53 = yb52;
                yb5[] yb5Arr = {yb5, yb53, new yb5(Float.valueOf(0.375f), new jt0(uq3.d(4283410648L))), new yb5(Float.valueOf(0.5f), new jt0(uq3.d(4283410648L))), new yb5(Float.valueOf(0.65f), new jt0(uq3.d(4281298912L))), new yb5(Float.valueOf(0.75f), new jt0(uq3.d(4282219166L))), new yb5(Float.valueOf(0.875f), new jt0(uq3.d(4281684093L))), new yb5(Float.valueOf(1.0f), new jt0(uq3.d(4279974492L)))};
                long floatToRawIntBits3 = (((long) Float.floatToRawIntBits(intBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat5)) & 4294967295L);
                ArrayList arrayList = new ArrayList(8);
                for (int i3 = 0; i3 < 8; i3++) {
                    arrayList.add(new jt0(((jt0) yb5Arr[i3].x).a));
                }
                ArrayList arrayList2 = new ArrayList(8);
                for (int i4 = 0; i4 < 8; i4++) {
                    arrayList2.add(Float.valueOf(((Number) yb5Arr[i4].w).floatValue()));
                }
                l97 l97 = new l97(floatToRawIntBits3, arrayList, arrayList2);
                float f12 = e0;
                hz12.i(jt0.b(0.07f, jt0.c), 135.0f, 270.0f, j, floatToRawIntBits2, new l57(e0, 0.0f, 1, 0, 26));
                float f13 = 135.0f;
                float f14 = 270.0f;
                long j2 = floatToRawIntBits2;
                hz1.t(hz12, l97, 270.0f, j, j2, new l57(f12, 0.0f, 1, 0, 26), 768);
                long j3 = j2;
                if (f11 > 0.005f) {
                    hz1.t(hz12, l97, f11 * 270.0f, j, j3, new l57(f12, 0.0f, 1, 0, 26), 832);
                }
                float f15 = f12 / 2.0f;
                float f16 = intBitsToFloat3 + f15;
                float e02 = hz12.e0(5.0f) + f16;
                float e03 = (intBitsToFloat3 - f15) - hz12.e0(3.0f);
                float e04 = hz12.e0(18.0f) + f16;
                Iterator it = list.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    bg7 bg73 = null;
                    if (i5 >= 0) {
                        double radians = Math.toRadians((double) ((((Number) next).floatValue() * f14) + f13));
                        float f17 = f13;
                        float f18 = f14;
                        float cos = (float) Math.cos(radians);
                        float sin = (float) Math.sin(radians);
                        Iterator it2 = it;
                        float f19 = cos;
                        hz1.q0(hz12, jt0.b(0.3f, jt0.c), (((long) Float.floatToRawIntBits((e03 * cos) + intBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits((e03 * sin) + intBitsToFloat5)) & 4294967295L), (((long) Float.floatToRawIntBits((e02 * f19) + intBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits((e02 * sin) + intBitsToFloat5)) & 4294967295L), hz12.e0(1.5f), 0, 496);
                        long b = m31.b(0, 0, 0, 0, 15);
                        ey3 ey3 = hg7.c;
                        tp1 tp1 = hg7.b;
                        dl2 dl2 = hg7.a;
                        vl vlVar = new vl((String) list2.get(i5));
                        cf4 cf4 = hg7.d;
                        a42 a42 = a42.w;
                        tp1 tp12 = tp1;
                        dl2 dl22 = dl2;
                        ag7 ag7 = new ag7(vlVar, tg7, a42, Integer.MAX_VALUE, true, 1, tp12, ey3, dl22, b);
                        dl2 dl23 = dl22;
                        long j4 = b;
                        if (cf4 != null) {
                            f = sin;
                            jh0 jh0 = new jh0(ag7);
                            f2 = e02;
                            kd4 kd4 = (kd4) cf4.x;
                            if (kd4 != null) {
                                bg72 = (bg7) kd4.h(jh0);
                            } else if (sg3.e((jh0) cf4.y, jh0)) {
                                bg72 = (bg7) cf4.z;
                            }
                            if (bg72 != null && !bg72.b.a.b()) {
                                bg73 = bg72;
                            }
                        } else {
                            f = sin;
                            f2 = e02;
                        }
                        bg7 bg74 = bg73;
                        if (bg74 != null) {
                            pn4 pn4 = bg74.b;
                            vs7 = vs74;
                            bg7 = new bg7(ag7, pn4, m31.d(j4, (((long) ((int) ((float) Math.ceil((double) pn4.e)))) & 4294967295L) | (((long) ((int) ((float) Math.ceil((double) pn4.d)))) << 32)));
                            f4 = e03;
                            f3 = e04;
                            f5 = intBitsToFloat3;
                        } else {
                            vs7 = vs74;
                            o9 o9Var = new o9(vlVar, aa5.k(tg7, ey3), (List) a42, tp12, dl23);
                            int j5 = k31.j(j4);
                            if (k31.d(j4)) {
                                i = k31.h(j4);
                            } else {
                                i = Integer.MAX_VALUE;
                            }
                            if (j5 != i) {
                                i = z65.p((int) ((float) Math.ceil((double) o9Var.e())), j5, i);
                            }
                            pn4 pn42 = new pn4(o9Var, x91.x(0, i, 0, k31.g(j4)), Integer.MAX_VALUE, 1);
                            f4 = e03;
                            f3 = e04;
                            f5 = intBitsToFloat3;
                            bg7 bg75 = new bg7(ag7, pn42, m31.d(j4, (((long) ((int) ((float) Math.ceil((double) pn42.e)))) & 4294967295L) | (((long) ((int) ((float) Math.ceil((double) pn42.d)))) << 32)));
                            if (cf4 != null) {
                                kd4 kd42 = (kd4) cf4.x;
                                if (kd42 != null) {
                                    kd42.l(new jh0(ag7), bg75);
                                } else {
                                    cf4.y = new jh0(ag7);
                                    cf4.z = bg75;
                                }
                            }
                            bg7 = bg75;
                        }
                        long j6 = bg7.c;
                        float f20 = (float) ((int) (j6 >> 32));
                        float f21 = (float) ((int) (j6 & 4294967295L));
                        long floatToRawIntBits4 = (((long) Float.floatToRawIntBits(((f3 * f19) + intBitsToFloat4) - (f20 / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(((f3 * f) + intBitsToFloat5) - (f21 / 2.0f))) & 4294967295L);
                        long j7 = jt0.g;
                        ag7 ag72 = bg7.a;
                        yy6 yy6 = ag72.b.a;
                        lq6 lq6 = yy6.n;
                        float f22 = f21;
                        rd7 rd7 = yy6.m;
                        iz1 iz1 = yy6.p;
                        rd7 rd72 = rd7;
                        wr0 j02 = hz12.j0();
                        iz1 iz12 = iz1;
                        float f23 = f5;
                        long L2 = j02.L();
                        j02.D().h();
                        float f24 = f20;
                        try {
                            ji8 ji8 = (ji8) j02.x;
                            long j8 = floatToRawIntBits4;
                            lq6 lq62 = lq6;
                            ji8.F(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
                            if (bg7.d()) {
                                if (ag72.f != 3) {
                                    ji8.p(0.0f, 0.0f, f24, f22, 1);
                                }
                            }
                            tg7 tg72 = ag72.b;
                            kc0 c = tg72.a.a.c();
                            pn4 pn43 = bg7.b;
                            float f25 = Float.NaN;
                            if (c == null || j7 != 16) {
                                pn4 pn44 = pn43;
                                rd7 rd73 = rd72;
                                lq6 lq63 = lq62;
                                qk0 D = hz12.j0().D();
                                if (j7 == 16) {
                                    j7 = tg72.b();
                                }
                                pn44.i(D, o55.l(Float.NaN, j7), lq63, rd73, iz12);
                            } else {
                                qk0 D2 = hz12.j0().D();
                                if (Float.isNaN(Float.NaN)) {
                                    f25 = tg72.a.a.a();
                                }
                                pn43.j(D2, c, f25, lq62, rd72, iz12);
                            }
                            b81.u(j02, L2);
                            f13 = f17;
                            e03 = f4;
                            e04 = f3;
                            intBitsToFloat3 = f23;
                            e02 = f2;
                            i5 = i6;
                            f14 = f18;
                            it = it2;
                            vs74 = vs7;
                        } catch (Throwable th2) {
                            b81.u(j02, L2);
                            throw th2;
                        }
                    } else {
                        sg3.Z();
                        throw null;
                    }
                }
                vs7 vs75 = vs74;
                double radians2 = Math.toRadians((double) ((f14 * f11) + f13));
                float e05 = intBitsToFloat3 - hz12.e0(8.0f);
                float e06 = hz12.e0(14.0f);
                float cos2 = (((float) Math.cos(radians2)) * e05) + intBitsToFloat4;
                float sin2 = (e05 * ((float) Math.sin(radians2))) + intBitsToFloat5;
                float cos3 = intBitsToFloat4 - (((float) Math.cos(radians2)) * e06);
                float sin3 = intBitsToFloat5 - (e06 * ((float) Math.sin(radians2)));
                long j9 = jt0.c;
                hz1 hz13 = hz12;
                hz1.q0(hz13, jt0.b(0.18f, j9), (((long) Float.floatToRawIntBits(cos3)) << 32) | (((long) Float.floatToRawIntBits(sin3)) & 4294967295L), (((long) Float.floatToRawIntBits(cos2)) << 32) | (((long) Float.floatToRawIntBits(sin2)) & 4294967295L), hz12.e0(7.0f), 1, 480);
                long j10 = j9;
                hz1.q0(hz13, j10, (((long) Float.floatToRawIntBits(cos3)) << 32) | (((long) Float.floatToRawIntBits(sin3)) & 4294967295L), (((long) Float.floatToRawIntBits(cos2)) << 32) | (((long) Float.floatToRawIntBits(sin2)) & 4294967295L), hz12.e0(2.0f), 1, 480);
                hz1.k0(hz13, j10, hz12.e0(3.0f), (((long) Float.floatToRawIntBits(cos2)) << 32) | (((long) Float.floatToRawIntBits(sin2)) & 4294967295L), (iz1) null, 120);
                long j11 = j10;
                long j12 = xz5.c;
                hz1.k0(hz13, j12, hz12.e0(13.0f), (((long) Float.floatToRawIntBits(intBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat5)) & 4294967295L), (iz1) null, 120);
                hz1.k0(hz13, jt0.b(0.85f, j11), hz12.e0(8.0f), (((long) Float.floatToRawIntBits(intBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat5)) & 4294967295L), (iz1) null, 120);
                hz1.k0(hz13, j12, hz12.e0(4.0f), (((long) Float.floatToRawIntBits(intBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat5)) & 4294967295L), (iz1) null, 120);
                return vs75;
            default:
                long longValue = ((Long) obj).longValue();
                Object obj6 = ((h06) obj5).w;
                obj6.getClass();
                i95.m((gl) obj6, longValue, this.x, (zk) obj4, (il) obj3, (vr2) obj2);
                return vs72;
        }
    }

    public /* synthetic */ pa0(ly5 ly5, k85 k85, kc0 kc0, float f, eh ehVar) {
        this.y = ly5;
        this.z = k85;
        this.A = kc0;
        this.x = f;
        this.B = ehVar;
    }

    public /* synthetic */ pa0(h06 h06, float f, zk zkVar, il ilVar, vr2 vr2) {
        this.y = h06;
        this.x = f;
        this.z = zkVar;
        this.A = ilVar;
        this.B = vr2;
    }
}
