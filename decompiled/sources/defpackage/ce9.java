package defpackage;

import java.util.Set;

/* renamed from: ce9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ce9 extends cj8 {
    public final b85 b;
    public final b85 c;
    public final int[] d;
    public final int e;

    public ce9(b85 b85, b85 b852) {
        boolean z;
        int i;
        this.b = b85;
        this.c = b852;
        int w = b852.w();
        if (w <= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr = new int[w];
            this.d = iArr;
            long j = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < w) {
                id9 d2 = d(i2);
                long j2 = d2.e | j;
                if (j2 == j) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            i4 = -1;
                            break;
                        } else if (d2.equals(d(iArr[i4] & 31))) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 != -1) {
                        if (d2.c) {
                            i = iArr[i4] | (1 << (i2 + 4));
                        } else {
                            i = i2;
                        }
                        iArr[i4] = i;
                        i2++;
                        j = j2;
                    }
                }
                iArr[i3] = i2;
                i3++;
                i2++;
                j = j2;
            }
            this.e = i3;
            return;
        }
        h.q("metadata size too large");
        throw null;
    }

    public final void a(zd9 zd9, ud9 ud9) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            id9 d2 = d(i2 & 31);
            if (!d2.c) {
                b85 b85 = this.b;
                int w = b85.w();
                if (i2 >= w) {
                    b85 = this.c;
                    i2 -= w;
                }
                zd9.a(d2, d2.b.cast(b85.z(i2)), ud9);
            } else {
                zd9.b(d2, new be9(this, d2, i2), ud9);
            }
        }
    }

    public final int b() {
        return this.e;
    }

    public final Set c() {
        return new ds(5, this);
    }

    public final id9 d(int i) {
        b85 b85 = this.b;
        int w = b85.w();
        if (i >= w) {
            return this.c.y(i - w);
        }
        return b85.y(i);
    }
}
