package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: xm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xm8 {
    public static final xb4 a = new xb4(18);

    static {
        int i = rk8.a;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        nl8 nl8 = (nl8) obj;
        en8 en8 = nl8.zzc;
        en8 en82 = ((nl8) obj2).zzc;
        en8 en83 = en8.f;
        if (!en83.equals(en82)) {
            if (en83.equals(en8)) {
                int i = en8.a + en82.a;
                int[] copyOf = Arrays.copyOf(en8.b, i);
                System.arraycopy(en82.b, 0, copyOf, en8.a, en82.a);
                Object[] copyOf2 = Arrays.copyOf(en8.c, i);
                System.arraycopy(en82.c, 0, copyOf2, en8.a, en82.a);
                en8 = new en8(i, copyOf, copyOf2, true);
            } else {
                en8.getClass();
                if (!en82.equals(en83)) {
                    if (en8.e) {
                        int i2 = en8.a + en82.a;
                        en8.e(i2);
                        System.arraycopy(en82.b, 0, en8.b, en8.a, en82.a);
                        System.arraycopy(en82.c, 0, en8.c, en8.a, en82.a);
                        en8.a = i2;
                    } else {
                        ku4.p();
                        return;
                    }
                }
            }
        }
        nl8.zzc = en8;
    }

    public static Object c(Object obj, int i, zl8 zl8, kk8 kk8, Object obj2, xb4 xb4) {
        if (kk8 == null) {
            return obj2;
        }
        if (zl8 != null) {
            int size = zl8.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) zl8.get(i3);
                int intValue = num.intValue();
                if (kk8.a(intValue)) {
                    if (i3 != i2) {
                        zl8.set(i2, num);
                    }
                    i2++;
                } else {
                    if (obj2 == null) {
                        xb4.getClass();
                        obj2 = xb4.i(obj);
                    }
                    xb4.getClass();
                    ((en8) obj2).d(i << 3, Long.valueOf((long) intValue));
                }
            }
            if (i2 != size) {
                zl8.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = zl8.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!kk8.a(intValue2)) {
                if (obj2 == null) {
                    xb4.getClass();
                    obj2 = xb4.i(obj);
                }
                xb4.getClass();
                ((en8) obj2).d(i << 3, Long.valueOf((long) intValue2));
                it.remove();
            }
        }
        return obj2;
    }

    public static void d(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (z) {
                fl8.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                fl8.r(i3);
                while (i2 < list.size()) {
                    fl8.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl8.i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()), i);
                i2++;
            }
        }
    }

    public static void e(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (z) {
                fl8.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                fl8.r(i3);
                while (i2 < list.size()) {
                    fl8.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl8.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void f(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof dm8) {
                dm8 dm8 = (dm8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < dm8.y; i4++) {
                        i3 += fl8.b(dm8.f(i4));
                    }
                    fl8.r(i3);
                    while (i2 < dm8.y) {
                        fl8.t(dm8.f(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < dm8.y) {
                    fl8.h(dm8.f(i2), i);
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fl8.b(((Long) list.get(i6)).longValue());
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.t(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.h(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
            }
        }
    }

    public static void g(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof dm8) {
                dm8 dm8 = (dm8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < dm8.y; i4++) {
                        i3 += fl8.b(dm8.f(i4));
                    }
                    fl8.r(i3);
                    while (i2 < dm8.y) {
                        fl8.t(dm8.f(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < dm8.y) {
                    fl8.h(dm8.f(i2), i);
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fl8.b(((Long) list.get(i6)).longValue());
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.t(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.h(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
            }
        }
    }

    public static void h(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof dm8) {
                dm8 dm8 = (dm8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < dm8.y; i4++) {
                        long f = dm8.f(i4);
                        i3 += fl8.b((f >> 63) ^ (f + f));
                    }
                    fl8.r(i3);
                    while (i2 < dm8.y) {
                        long f2 = dm8.f(i2);
                        fl8.t((f2 >> 63) ^ (f2 + f2));
                        i2++;
                    }
                    return;
                }
                while (i2 < dm8.y) {
                    long f3 = dm8.f(i2);
                    fl8.h((f3 >> 63) ^ (f3 + f3), i);
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    long longValue = ((Long) list.get(i6)).longValue();
                    i5 += fl8.b((longValue >> 63) ^ (longValue + longValue));
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    fl8.t((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    long longValue3 = ((Long) list.get(i2)).longValue();
                    fl8.h((longValue3 >> 63) ^ (longValue3 + longValue3), i);
                    i2++;
                }
            }
        }
    }

    public static void i(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof dm8) {
                dm8 dm8 = (dm8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < dm8.y; i4++) {
                        dm8.f(i4);
                        i3 += 8;
                    }
                    fl8.r(i3);
                    while (i2 < dm8.y) {
                        fl8.u(dm8.f(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < dm8.y) {
                    fl8.i(dm8.f(i2), i);
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.i(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
            }
        }
    }

    public static void j(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof dm8) {
                dm8 dm8 = (dm8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < dm8.y; i4++) {
                        dm8.f(i4);
                        i3 += 8;
                    }
                    fl8.r(i3);
                    while (i2 < dm8.y) {
                        fl8.u(dm8.f(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < dm8.y) {
                    fl8.i(dm8.f(i2), i);
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.i(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
            }
        }
    }

    public static void k(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof ol8) {
                ol8 ol8 = (ol8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ol8.y; i4++) {
                        i3 += fl8.b((long) ol8.g(i4));
                    }
                    fl8.r(i3);
                    while (i2 < ol8.y) {
                        fl8.q(ol8.g(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ol8.y) {
                    fl8.e(i, ol8.g(i2));
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fl8.b((long) ((Integer) list.get(i6)).intValue());
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void l(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof ol8) {
                ol8 ol8 = (ol8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ol8.y; i4++) {
                        i3 += fl8.a(ol8.g(i4));
                    }
                    fl8.r(i3);
                    while (i2 < ol8.y) {
                        fl8.r(ol8.g(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ol8.y) {
                    fl8.f(i, ol8.g(i2));
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fl8.a(((Integer) list.get(i6)).intValue());
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.r(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void m(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof ol8) {
                ol8 ol8 = (ol8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ol8.y; i4++) {
                        int g = ol8.g(i4);
                        i3 += fl8.a((g >> 31) ^ (g + g));
                    }
                    fl8.r(i3);
                    while (i2 < ol8.y) {
                        int g2 = ol8.g(i2);
                        fl8.r((g2 >> 31) ^ (g2 + g2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ol8.y) {
                    int g3 = ol8.g(i2);
                    fl8.f(i, (g3 >> 31) ^ (g3 + g3));
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += fl8.a((intValue >> 31) ^ (intValue + intValue));
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    fl8.r((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    int intValue3 = ((Integer) list.get(i2)).intValue();
                    fl8.f(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                    i2++;
                }
            }
        }
    }

    public static void n(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof ol8) {
                ol8 ol8 = (ol8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ol8.y; i4++) {
                        ol8.g(i4);
                        i3 += 4;
                    }
                    fl8.r(i3);
                    while (i2 < ol8.y) {
                        fl8.s(ol8.g(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ol8.y) {
                    fl8.g(i, ol8.g(i2));
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void o(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof ol8) {
                ol8 ol8 = (ol8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ol8.y; i4++) {
                        ol8.g(i4);
                        i3 += 4;
                    }
                    fl8.r(i3);
                    while (i2 < ol8.y) {
                        fl8.s(ol8.g(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ol8.y) {
                    fl8.g(i, ol8.g(i2));
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void p(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (list instanceof ol8) {
                ol8 ol8 = (ol8) list;
                if (z) {
                    fl8.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ol8.y; i4++) {
                        i3 += fl8.b((long) ol8.g(i4));
                    }
                    fl8.r(i3);
                    while (i2 < ol8.y) {
                        fl8.q(ol8.g(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ol8.y) {
                    fl8.e(i, ol8.g(i2));
                    i2++;
                }
            } else if (z) {
                fl8.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fl8.b((long) ((Integer) list.get(i6)).intValue());
                }
                fl8.r(i5);
                while (i2 < list.size()) {
                    fl8.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fl8.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void q(int i, List list, br4 br4, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl8 fl8 = (fl8) br4.x;
            int i2 = 0;
            if (z) {
                fl8.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    i3++;
                }
                fl8.r(i3);
                while (i2 < list.size()) {
                    fl8.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl8.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dm8) {
            dm8 dm8 = (dm8) list;
            int i2 = 0;
            while (i < size) {
                i2 += fl8.b(dm8.f(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fl8.b(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dm8) {
            dm8 dm8 = (dm8) list;
            int i2 = 0;
            while (i < size) {
                i2 += fl8.b(dm8.f(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fl8.b(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dm8) {
            dm8 dm8 = (dm8) list;
            int i2 = 0;
            while (i < size) {
                long f = dm8.f(i);
                i2 += fl8.b((f >> 63) ^ (f + f));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i3 += fl8.b((longValue >> 63) ^ (longValue + longValue));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ol8) {
            ol8 ol8 = (ol8) list;
            int i2 = 0;
            while (i < size) {
                i2 += fl8.b((long) ol8.g(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fl8.b((long) ((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ol8) {
            ol8 ol8 = (ol8) list;
            int i2 = 0;
            while (i < size) {
                i2 += fl8.b((long) ol8.g(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fl8.b((long) ((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ol8) {
            ol8 ol8 = (ol8) list;
            int i2 = 0;
            while (i < size) {
                i2 += fl8.a(ol8.g(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fl8.a(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ol8) {
            ol8 ol8 = (ol8) list;
            int i2 = 0;
            while (i < size) {
                int g = ol8.g(i);
                i2 += fl8.a((g >> 31) ^ (g + g));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += fl8.a((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i3;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fl8.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fl8.a(i << 3) + 8) * size;
    }
}
