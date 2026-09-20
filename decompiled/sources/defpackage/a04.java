package defpackage;

import java.util.List;

/* renamed from: a04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a04 {
    public final hv2 a;
    public final int b;
    public final int c;
    public final zz3 d;
    public final j04 e;
    public final /* synthetic */ hv2 f;

    public a04(hv2 hv2, int i, int i2, zz3 zz3, j04 j04) {
        this.f = hv2;
        this.a = hv2;
        this.b = i;
        this.c = i2;
        this.d = zz3;
        this.e = j04;
    }

    public final long a(int i, int i2) {
        int i3;
        hv2 hv2 = this.a;
        int[] iArr = (int[]) hv2.x;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) hv2.y;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            ac3.a("width must be >= 0");
        }
        return m31.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public final f04 b(int i) {
        int i2;
        cm2 b2 = this.e.b(i);
        int i3 = b2.a;
        int size = b2.b.size();
        int i4 = 0;
        if (size == 0 || i3 + size == this.b) {
            i2 = 0;
        } else {
            i2 = this.c;
        }
        e04[] e04Arr = new e04[size];
        int i5 = 0;
        int i6 = i2;
        while (true) {
            List list = b2.b;
            if (i4 < size) {
                int i7 = (int) ((px2) list.get(i4)).a;
                int i8 = i6;
                e04 d1 = this.d.d1(i3 + i4, i5, i7, i8, a(i5, i7));
                i6 = i8;
                i5 += i7;
                e04Arr[i4] = d1;
                i4++;
            } else {
                return new f04(i, e04Arr, this.f, list, i6);
            }
        }
    }
}
