package defpackage;

import java.util.List;

/* renamed from: f04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f04 {
    public final int a;
    public final e04[] b;
    public final hv2 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public f04(int i, e04[] e04Arr, hv2 hv2, List list, int i2) {
        this.a = i;
        this.b = e04Arr;
        this.c = hv2;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        int i4 = 0;
        for (e04 e04 : e04Arr) {
            i4 = Math.max(i4, e04.k);
        }
        this.f = i4;
        int i5 = i4 + this.e;
        this.g = i5 >= 0 ? i5 : i3;
    }

    public final e04[] a(int i, int i2, int i3) {
        e04[] e04Arr = this.b;
        int length = e04Arr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            e04 e04 = e04Arr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((px2) this.d.get(i5)).a;
            e04.m(i, ((int[]) this.c.y)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return e04Arr;
    }
}
