package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f {
    public static final Class a;
    public static final g b;
    public static final ys7 c = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, ys7] */
    static {
        Class<?> cls;
        Class<?> cls2;
        g gVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                gVar = (g) cls2.getConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Throwable unused3) {
            }
        }
        b = gVar;
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fe3) {
            fe3 fe3 = (fe3) list;
            int i2 = 0;
            while (i < size) {
                i2 += vs0.a(fe3.k(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += vs0.a(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vs0.c(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vs0.c(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fe3) {
            fe3 fe3 = (fe3) list;
            int i2 = 0;
            while (i < size) {
                i2 += vs0.a(fe3.k(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += vs0.a(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += vs0.e(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fe3) {
            fe3 fe3 = (fe3) list;
            int i2 = 0;
            while (i < size) {
                int k = fe3.k(i);
                i2 += vs0.d((k >> 31) ^ (k << 1));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += vs0.d((intValue >> 31) ^ (intValue << 1));
            i++;
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += vs0.e((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fe3) {
            fe3 fe3 = (fe3) list;
            int i2 = 0;
            while (i < size) {
                i2 += vs0.d(fe3.k(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += vs0.d(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += vs0.e(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void j(g gVar, Object obj, Object obj2) {
        ((ys7) gVar).getClass();
        b bVar = (b) obj;
        h hVar = bVar.unknownFields;
        h hVar2 = ((b) obj2).unknownFields;
        h hVar3 = h.f;
        if (!hVar3.equals(hVar2)) {
            if (hVar3.equals(hVar)) {
                int i = hVar.a + hVar2.a;
                int[] copyOf = Arrays.copyOf(hVar.b, i);
                System.arraycopy(hVar2.b, 0, copyOf, hVar.a, hVar2.a);
                Object[] copyOf2 = Arrays.copyOf(hVar.c, i);
                System.arraycopy(hVar2.c, 0, copyOf2, hVar.a, hVar2.a);
                hVar = new h(i, copyOf, copyOf2, true);
            } else {
                hVar.getClass();
                if (!hVar2.equals(hVar3)) {
                    if (hVar.e) {
                        int i2 = hVar.a;
                        int i3 = hVar2.a + i2;
                        int[] iArr = hVar.b;
                        if (i3 > iArr.length) {
                            int i4 = (i2 / 2) + i2;
                            if (i4 < i3) {
                                i4 = i3;
                            }
                            if (i4 < 8) {
                                i4 = 8;
                            }
                            hVar.b = Arrays.copyOf(iArr, i4);
                            hVar.c = Arrays.copyOf(hVar.c, i4);
                        }
                        System.arraycopy(hVar2.b, 0, hVar.b, hVar.a, hVar2.a);
                        System.arraycopy(hVar2.c, 0, hVar.c, hVar.a, hVar2.a);
                        hVar.a = i3;
                    } else {
                        ku4.p();
                        return;
                    }
                }
            }
        }
        bVar.unknownFields = hVar;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static void l(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            if (z) {
                vs0.o(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Boolean) list.get(i3)).getClass();
                    Logger logger = vs0.e;
                    i2++;
                }
                vs0.p(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    vs0.f(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : 0);
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                vs0.o(i, 0);
                vs0.f(booleanValue ? (byte) 1 : 0);
            }
        }
    }

    public static void m(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    Logger logger = vs0.e;
                    i3 += 8;
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.l(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                vs0.getClass();
                vs0.k(Double.doubleToRawLongBits(doubleValue), i);
                i2++;
            }
        }
    }

    public static void n(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            if (z) {
                vs0.o(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += vs0.a(((Integer) list.get(i3)).intValue());
                }
                vs0.p(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    vs0.m(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                vs0.o(i, 0);
                vs0.m(intValue);
            }
        }
    }

    public static void o(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = vs0.e;
                    i3 += 4;
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.j(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                vs0.i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = vs0.e;
                    i3 += 8;
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.l(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                vs0.k(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void q(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    Logger logger = vs0.e;
                    i3 += 4;
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.j(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                vs0.getClass();
                vs0.i(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void r(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            if (z) {
                vs0.o(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += vs0.a(((Integer) list.get(i3)).intValue());
                }
                vs0.p(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    vs0.m(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                vs0.o(i, 0);
                vs0.m(intValue);
            }
        }
    }

    public static void s(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += vs0.e(((Long) list.get(i4)).longValue());
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.r(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                vs0.q(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void t(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = vs0.e;
                    i3 += 4;
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.j(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                vs0.i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = vs0.e;
                    i3 += 8;
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.l(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                vs0.k(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void v(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            if (z) {
                vs0.o(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    i2 += vs0.d((intValue >> 31) ^ (intValue << 1));
                }
                vs0.p(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    vs0.p((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                vs0.o(i, 0);
                vs0.p((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void w(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += vs0.e((longValue >> 63) ^ (longValue << 1));
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    vs0.r((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                vs0.q((longValue3 >> 63) ^ (longValue3 << 1), i);
                i2++;
            }
        }
    }

    public static void x(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            if (z) {
                vs0.o(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += vs0.d(((Integer) list.get(i3)).intValue());
                }
                vs0.p(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    vs0.p(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                vs0.o(i, 0);
                vs0.p(intValue);
            }
        }
    }

    public static void y(int i, List list, wv2 wv2, boolean z) {
        if (list != null && !list.isEmpty()) {
            vs0 vs0 = (vs0) wv2.x;
            int i2 = 0;
            if (z) {
                vs0.o(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += vs0.e(((Long) list.get(i4)).longValue());
                }
                vs0.p(i3);
                while (i2 < list.size()) {
                    vs0.r(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                vs0.q(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }
}
