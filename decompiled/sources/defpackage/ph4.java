package defpackage;

import java.util.List;

/* renamed from: ph4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ph4 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final h80 e;
    public final ey3 f;
    public final boolean g = false;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public ph4(int i2, int i3, List list, long j2, Object obj, h80 h80, ey3 ey3) {
        int i4;
        this.a = i2;
        this.b = list;
        this.c = j2;
        this.d = obj;
        this.e = h80;
        this.f = ey3;
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            eh5 eh5 = (eh5) list.get(i6);
            if (!this.g) {
                i4 = eh5.x;
            } else {
                i4 = eh5.w;
            }
            i5 = Math.max(i5, i4);
        }
        this.h = i5;
        this.i = new int[(this.b.size() * 2)];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i2) {
        this.j += i2;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            boolean z = this.g;
            if ((z && i3 % 2 == 1) || (!z && i3 % 2 == 0)) {
                iArr[i3] = iArr[i3] + i2;
            }
        }
    }

    public final void b(int i2, int i3, int i4) {
        int i5;
        int i6;
        this.j = i2;
        boolean z = this.g;
        if (z) {
            i5 = i4;
        } else {
            i5 = i3;
        }
        this.k = i5;
        List list = this.b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            eh5 eh5 = (eh5) list.get(i7);
            int i8 = i7 * 2;
            int[] iArr = this.i;
            if (z) {
                float f2 = ((float) (i3 - eh5.w)) / 2.0f;
                float f3 = 0.0f;
                if (this.f != ey3.w) {
                    f3 = 0.0f * -1.0f;
                }
                iArr[i8] = Math.round((1.0f + f3) * f2);
                iArr[i8 + 1] = i2;
                i6 = eh5.x;
            } else {
                iArr[i8] = i2;
                int i9 = i8 + 1;
                h80 h80 = this.e;
                if (h80 != null) {
                    iArr[i9] = h80.a(eh5.x, i4);
                    i6 = eh5.w;
                } else {
                    throw f21.p("null verticalAlignment");
                }
            }
            i2 += i6;
        }
    }
}
