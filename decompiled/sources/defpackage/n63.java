package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: n63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n63 implements ds0, es0, fs8 {
    public static final /* synthetic */ n63 A = new n63(20);
    public static final /* synthetic */ n63 B = new n63(21);
    public static final /* synthetic */ n63 C = new n63(23);
    public static final /* synthetic */ n63 D = new n63(24);
    public static final /* synthetic */ n63 E = new n63(25);
    public static final /* synthetic */ n63 F = new n63(26);
    public static final /* synthetic */ n63 G = new n63(27);
    public static final /* synthetic */ n63 H = new n63(28);
    public static final /* synthetic */ n63 I = new n63(29);
    public static final /* synthetic */ n63 x = new n63(17);
    public static final /* synthetic */ n63 y = new n63(18);
    public static final /* synthetic */ n63 z = new n63(19);
    public final /* synthetic */ int w;

    public n63(kb4 kb4) {
        this.w = 8;
        String str = kb4.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static final nj d(int i, String str) {
        WeakHashMap weakHashMap = ib8.w;
        return new nj(i, str);
    }

    public static final int e(int i) {
        int i2 = b57.i;
        int i3 = i - 1;
        int i4 = i3 | (i3 >>> 1);
        int i5 = i4 | (i4 >>> 2);
        int i6 = i5 | (i5 >>> 4);
        int i7 = i6 | (i6 >>> 8);
        int i8 = i7 | (i7 >>> 16);
        if (i8 < 4) {
            return 4;
        }
        return i8 + 1;
    }

    public static final d28 f(int i, String str) {
        WeakHashMap weakHashMap = ib8.w;
        return new d28(new jd3(0, 0, 0, 0), str);
    }

    public static zs4 g(tb1 tb1, qt4 qt4, Bundle bundle, k54 k54, it4 it4) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        qt4.getClass();
        k54.getClass();
        return new zs4(tb1, qt4, bundle, k54, it4, uuid, (Bundle) null);
    }

    public static ib8 h(yt2 yt2) {
        View view = (View) yt2.k(ye.f);
        ib8 j = j(view);
        boolean i = yt2.i(j) | yt2.i(view);
        Object Q = yt2.Q();
        if (i || Q == ay0.a) {
            Q = new k77(19, (Object) j, (Object) view);
            yt2.o0(Q);
        }
        t49.e(j, (vr2) Q, yt2);
        return j;
    }

    public static s96 i(n63 n63, List list, int i, int i2) {
        boolean z2;
        char c;
        long j;
        List<vg4> list2;
        long j2;
        float f;
        ArrayList arrayList;
        float f2;
        float f3;
        float f4;
        List list3 = list;
        int i3 = i;
        char c2 = ' ';
        long j3 = 4294967295L;
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
        int i4 = 0;
        if ((i2 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        float f5 = 360.0f;
        if (z2) {
            n74 m = sg3.m();
            ArrayList arrayList2 = new ArrayList(list3.size());
            int size = list3.size();
            int i5 = 0;
            while (i5 < size) {
                char c3 = c2;
                n63 n632 = wg4.a;
                long j4 = j3;
                long d = l35.d(((vg4) list3.get(i5)).a, floatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2((double) Float.intBitsToFloat((int) (d & j4)), (double) Float.intBitsToFloat((int) (d >> c3)))) * 180.0f) / 3.1415927f));
                i5++;
                c2 = c3;
                j3 = j4;
            }
            c = c2;
            j = j3;
            float f6 = 2.0f;
            float f7 = 3.1415927f;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList3.add(Float.valueOf(l35.c(l35.d(((vg4) list3.get(i6)).a, floatToRawIntBits))));
            }
            int i7 = i3 * 2;
            float f8 = 360.0f / ((float) i7);
            int i8 = 0;
            while (i8 < i7) {
                Iterator it = sg3.v(list3).iterator();
                while (((qe3) it).y) {
                    int nextInt = ((je3) it).nextInt();
                    int i9 = i8 % 2;
                    if (i9 != 0) {
                        nextInt = (list3.size() - 1) - nextInt;
                    }
                    if (nextInt > 0 || i9 == 0) {
                        n63 n633 = wg4.a;
                        f2 = f6;
                        float f9 = ((float) i8) * f8;
                        if (i9 == 0) {
                            f4 = ((Number) arrayList2.get(nextInt)).floatValue();
                        } else {
                            f4 = (((Number) arrayList2.get(i4)).floatValue() * f2) + (f8 - ((Number) arrayList2.get(nextInt)).floatValue());
                        }
                        f3 = f5;
                        arrayList = arrayList2;
                        double d2 = (double) (((f9 + f4) / f5) * f2 * f7);
                        f = f7;
                        m.add(new vg4(l35.e(l35.f(((Number) arrayList3.get(nextInt)).floatValue(), (((long) Float.floatToRawIntBits((float) Math.sin(d2))) & j) | (((long) Float.floatToRawIntBits((float) Math.cos(d2))) << c)), floatToRawIntBits), ((vg4) list3.get(nextInt)).b));
                    } else {
                        f2 = f6;
                        f = f7;
                        f3 = f5;
                        arrayList = arrayList2;
                    }
                    f5 = f3;
                    f6 = f2;
                    arrayList2 = arrayList;
                    f7 = f;
                    i4 = 0;
                }
                float f10 = f6;
                float f11 = f7;
                float f12 = f5;
                ArrayList arrayList4 = arrayList2;
                i8++;
                i4 = 0;
            }
            list2 = sg3.i(m);
        } else {
            c = ' ';
            j = 4294967295L;
            int size3 = list3.size();
            re3 V = z65.V(0, size3 * i3);
            ArrayList arrayList5 = new ArrayList(et0.e0(V, 10));
            Iterator it2 = V.iterator();
            while (((qe3) it2).y) {
                int nextInt2 = ((je3) it2).nextInt();
                n63 n634 = wg4.a;
                int i10 = nextInt2 % size3;
                long d3 = l35.d(((vg4) list3.get(i10)).a, floatToRawIntBits);
                int i11 = (int) (d3 >> 32);
                double d4 = (double) ((((((float) (nextInt2 / size3)) * 360.0f) / ((float) i3)) / 360.0f) * 2.0f * 3.1415927f);
                int i12 = (int) (d3 & 4294967295L);
                long floatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i11) * ((float) Math.cos(d4))) - (Float.intBitsToFloat(i12) * ((float) Math.sin(d4))))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i12) * ((float) Math.cos(d4))) + (Float.intBitsToFloat(i11) * ((float) Math.sin(d4))))) & 4294967295L);
                long j5 = floatToRawIntBits;
                arrayList5.add(new vg4(l35.e(floatToRawIntBits2, j5), ((vg4) list3.get(i10)).b));
                floatToRawIntBits = j5;
                size3 = size3;
            }
            list2 = arrayList5;
        }
        long j6 = floatToRawIntBits;
        int size4 = list2.size() * 2;
        float[] fArr = new float[size4];
        for (int i13 = 0; i13 < size4; i13++) {
            long j7 = ((vg4) list2.get(i13 / 2)).a;
            if (i13 % 2 == 0) {
                j2 = j7 >> c;
            } else {
                j2 = j7 & j;
            }
            fArr[i13] = Float.intBitsToFloat((int) j2);
        }
        n74 m2 = sg3.m();
        for (vg4 vg4 : list2) {
            m2.add(vg4.b);
        }
        return a35.b(fArr, y71.b, sg3.i(m2), Float.intBitsToFloat((int) (j6 >> c)), Float.intBitsToFloat((int) (j6 & j)));
    }

    public static ib8 j(View view) {
        ib8 ib8;
        WeakHashMap weakHashMap = ib8.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new ib8(view);
                    weakHashMap.put(view, obj);
                }
                ib8 = (ib8) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ib8;
    }

    public static final hm8 l(Object obj, Object obj2) {
        hm8 hm8 = (hm8) obj;
        hm8 hm82 = (hm8) obj2;
        if (!hm82.isEmpty()) {
            if (!hm8.w) {
                hm8 = hm8.a();
            }
            hm8.c();
            if (!hm82.isEmpty()) {
                hm8.putAll(hm82);
            }
        }
        return hm8;
    }

    public Object a() {
        switch (this.w) {
            case 17:
                zn8 zn8 = (zn8) un8.x.w.w;
                return new Boolean(((Boolean) zn8.a.get()).booleanValue());
            case 18:
                List list = by8.a;
                do8 do8 = (do8) co8.x.w.w;
                return (String) do8.a.get();
            case 19:
                List list2 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 20:
                List list3 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(43, 21600000, "measurement.sgtm.batch.retry_max_wait").get();
            case 21:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(5, 86400000, "measurement.config.cache_time").get();
            case 23:
                List list5 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(76, 6, "measurement.upload.retry_count").get()).longValue());
            case 24:
                List list6 = by8.a;
                uo8.x.get();
                return (String) vo8.a.u(5, "measurement.test.string_flag", "---").get();
            case 25:
                List list7 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(19, 500, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 26:
                List list8 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 27:
                List list9 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(57, 864000000, "measurement.rb.attribution.max_queue_time").get();
            case 28:
                List list10 = by8.a;
                qn8.x.get();
                return (Boolean) rn8.a.n(10, "measurement.config.default_flag_values", true).get();
            default:
                List list11 = by8.a;
                pp8 pp8 = (pp8) op8.x.w.w;
                return (Boolean) pp8.a.get();
        }
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public qd3 c() {
        qd3 qd3 = qd3.y;
        return tz2.h(System.currentTimeMillis());
    }

    public s96 k() {
        s96 s96 = wg4.m;
        if (s96 != null) {
            return s96;
        }
        s96 b = i(this, sg3.E(new vg4((((long) Float.floatToRawIntBits(0.193f)) << 32) | (((long) Float.floatToRawIntBits(0.277f)) & 4294967295L), new y71(2, 0.053f)), new vg4((((long) Float.floatToRawIntBits(0.176f)) << 32) | (((long) Float.floatToRawIntBits(0.055f)) & 4294967295L), new y71(2, 0.053f))), 10, 12).b();
        wg4.m = b;
        return b;
    }

    public /* synthetic */ n63(int i) {
        this.w = i;
    }
}
