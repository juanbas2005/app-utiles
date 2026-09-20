package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i {
    public static final Class a;
    public static final j b;
    public static final l c = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.l, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        bu5 bu5 = bu5.c;
        j jVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            bu5 bu52 = bu5.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                jVar = (j) cls2.getConstructor((Class[]) null).newInstance((Object[]) null);
            }
        } catch (Throwable unused3) {
        }
        b = jVar;
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ws0.j((long) ((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ws0.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ws0.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ws0.j((long) ((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ws0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += ws0.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += ws0.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ws0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ws0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(j jVar, Object obj, Object obj2) {
        ((l) jVar).getClass();
        e eVar = (e) obj;
        k kVar = eVar.unknownFields;
        k kVar2 = ((e) obj2).unknownFields;
        k kVar3 = k.f;
        if (!kVar3.equals(kVar2)) {
            if (kVar3.equals(kVar)) {
                int i = kVar.a + kVar2.a;
                int[] copyOf = Arrays.copyOf(kVar.b, i);
                System.arraycopy(kVar2.b, 0, copyOf, kVar.a, kVar2.a);
                Object[] copyOf2 = Arrays.copyOf(kVar.c, i);
                System.arraycopy(kVar2.c, 0, copyOf2, kVar.a, kVar2.a);
                kVar = new k(i, copyOf, copyOf2, true);
            } else {
                kVar.getClass();
                if (!kVar2.equals(kVar3)) {
                    if (kVar.e) {
                        int i2 = kVar.a + kVar2.a;
                        kVar.a(i2);
                        System.arraycopy(kVar2.b, 0, kVar.b, kVar.a, kVar2.a);
                        System.arraycopy(kVar2.c, 0, kVar.c, kVar.a, kVar2.a);
                        kVar.a = i2;
                    } else {
                        ku4.p();
                        return;
                    }
                }
            }
        }
        eVar.unknownFields = kVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static void m(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    Logger logger = ws0.f;
                    i3++;
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    Logger logger = ws0.f;
                    i3 += 8;
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                ws0.getClass();
                ws0.t(Double.doubleToRawLongBits(doubleValue), i);
                i2++;
            }
        }
    }

    public static void o(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += ws0.j((long) ((Integer) list.get(i4)).intValue());
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = ws0.f;
                    i3 += 4;
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void q(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = ws0.f;
                    i3 += 8;
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.t(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void r(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    Logger logger = ws0.f;
                    i3 += 4;
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                ws0.getClass();
                ws0.r(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void s(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += ws0.j((long) ((Integer) list.get(i4)).intValue());
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += ws0.j(((Long) list.get(i4)).longValue());
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.E(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void u(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = ws0.f;
                    i3 += 4;
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = ws0.f;
                    i3 += 8;
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.t(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void w(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += ws0.i((intValue >> 31) ^ (intValue << 1));
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    ws0.D((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                ws0.C(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void x(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += ws0.j((longValue >> 63) ^ (longValue << 1));
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    ws0.F((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                ws0.E((longValue3 >> 63) ^ (longValue3 << 1), i);
                i2++;
            }
        }
    }

    public static void y(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += ws0.i(((Integer) list.get(i4)).intValue());
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.D(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void z(int i, List list, ji8 ji8, boolean z) {
        if (list != null && !list.isEmpty()) {
            ws0 ws0 = (ws0) ji8.x;
            int i2 = 0;
            if (z) {
                ws0.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += ws0.j(((Long) list.get(i4)).longValue());
                }
                ws0.D(i3);
                while (i2 < list.size()) {
                    ws0.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ws0.E(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static Object j(Object obj, int i, qf3 qf3, Object obj2, j jVar) {
        return obj2;
    }
}
