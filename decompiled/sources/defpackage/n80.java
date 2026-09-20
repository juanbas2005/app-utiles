package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class n80 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public n80(int... iArr) {
        int i;
        int i2;
        List list;
        this.a = iArr;
        Integer a1 = qs.a1(iArr, 0);
        int i3 = -1;
        if (a1 != null) {
            i = a1.intValue();
        } else {
            i = -1;
        }
        this.b = i;
        Integer a12 = qs.a1(iArr, 1);
        if (a12 != null) {
            i2 = a12.intValue();
        } else {
            i2 = -1;
        }
        this.c = i2;
        Integer a13 = qs.a1(iArr, 2);
        this.d = a13 != null ? a13.intValue() : i3;
        if (iArr.length <= 3) {
            list = a42.w;
        } else if (iArr.length <= 1024) {
            list = dt0.b1(new g2(new rs(iArr), 3, iArr.length));
        } else {
            h.q(f21.j(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            throw null;
        }
        this.e = list;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.d >= i3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r3 = (defpackage.n80) r3;
     */
    public final boolean equals(Object obj) {
        n80 n80;
        if (obj == null || !getClass().equals(obj.getClass()) || this.b != n80.b || this.c != n80.c || this.d != n80.d || !sg3.e(this.e, n80.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return dt0.E0(arrayList, ".", (String) null, (String) null, (vr2) null, 62);
    }
}
