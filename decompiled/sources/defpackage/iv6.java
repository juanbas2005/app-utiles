package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* renamed from: iv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class iv6 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int e = e(arrayList, i, i2);
        if (e >= 0) {
            return e;
        }
        return -(e + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & -67108864);
    }

    public static final gv6 d(gv6 gv6) {
        if (!(gv6 instanceof gv6)) {
            gv6 = null;
        }
        if (gv6 != null) {
            return gv6;
        }
        ey0.b("Inconsistent composition");
        ta1.e();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((st2) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int k = sg3.k(i5, i);
            if (k < 0) {
                i3 = i4 + 1;
            } else if (k <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
