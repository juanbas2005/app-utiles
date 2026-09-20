package defpackage;

import java.util.ArrayList;

/* renamed from: bu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bu2 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final yo4 e;
    public final z97 f;

    public bu2(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            vm5.a("Invalid start index");
        }
        this.d = new ArrayList();
        yo4 yo4 = new yo4();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ss3 ss3 = (ss3) this.a.get(i3);
            int i4 = ss3.c;
            int i5 = ss3.d;
            yo4.i(i4, new tx2(i3, i2, i5));
            i2 += i5;
        }
        this.e = yo4;
        this.f = new z97(new k3(21, this));
    }

    public final boolean a(int i, int i2) {
        tx2 tx2;
        int i3;
        int i4;
        int i5 = i2;
        yo4 yo4 = this.e;
        tx2 tx22 = (tx2) yo4.b(i);
        if (tx22 == null) {
            return false;
        }
        int i6 = tx22.b;
        int i7 = i5 - tx22.c;
        tx22.c = i5;
        if (i7 == 0) {
            return true;
        }
        Object[] objArr = yo4.c;
        long[] jArr = yo4.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i8 = 0;
        while (true) {
            long j = jArr[i8];
            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128 && (i3 = tx2.b) >= i6 && (tx2 = (tx2) objArr[(i8 << 3) + i10]) != tx22 && (i4 = i3 + i7) >= 0) {
                        tx2.b = i4;
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return true;
                }
            }
            if (i8 == length) {
                return true;
            }
            i8++;
        }
    }
}
