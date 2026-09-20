package defpackage;

import java.util.List;

/* renamed from: au0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class au0 implements lh4, aa6 {
    public final vr a;
    public final g80 b;

    public au0(vr vrVar, g80 g80) {
        this.a = vrVar;
        this.b = g80;
    }

    public final int a(kg3 kg3, List list, int i) {
        int i2;
        int i3;
        int i4;
        int r0 = kg3.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * r0, i);
        int size = list.size();
        int i5 = 0;
        float f = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            gh4 gh4 = (gh4) list.get(i6);
            float j = c35.j(c35.i(gh4));
            if (j == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i4 = Integer.MAX_VALUE;
                } else {
                    i4 = i - min;
                }
                int min2 = Math.min(gh4.c(Integer.MAX_VALUE), i4);
                min += min2;
                i5 = Math.max(i5, gh4.v(min2));
            } else if (j > 0.0f) {
                f += j;
            }
        }
        if (f == 0.0f) {
            i2 = 0;
        } else if (i == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = Math.round(((float) Math.max(i - min, 0)) / f);
        }
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            gh4 gh42 = (gh4) list.get(i7);
            float j2 = c35.j(c35.i(gh42));
            if (j2 > 0.0f) {
                if (i2 != Integer.MAX_VALUE) {
                    i3 = Math.round(((float) i2) * j2);
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                i5 = Math.max(i5, gh42.v(i3));
            }
        }
        return i5;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        return i35.n(this, k31.i(j), k31.j(j), k31.g(j), k31.h(j), oh4.r0(this.a.a()), oh4, list, new eh5[list.size()], 0, list.size(), (int[]) null, 0);
    }

    public final int c(kg3 kg3, List list, int i) {
        int i2;
        int i3;
        int i4;
        int r0 = kg3.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * r0, i);
        int size = list.size();
        int i5 = 0;
        float f = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            gh4 gh4 = (gh4) list.get(i6);
            float j = c35.j(c35.i(gh4));
            if (j == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i4 = Integer.MAX_VALUE;
                } else {
                    i4 = i - min;
                }
                int min2 = Math.min(gh4.c(Integer.MAX_VALUE), i4);
                min += min2;
                i5 = Math.max(i5, gh4.l(min2));
            } else if (j > 0.0f) {
                f += j;
            }
        }
        if (f == 0.0f) {
            i2 = 0;
        } else if (i == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = Math.round(((float) Math.max(i - min, 0)) / f);
        }
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            gh4 gh42 = (gh4) list.get(i7);
            float j2 = c35.j(c35.i(gh42));
            if (j2 > 0.0f) {
                if (i2 != Integer.MAX_VALUE) {
                    i3 = Math.round(((float) i2) * j2);
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                i5 = Math.max(i5, gh42.l(i3));
            }
        }
        return i5;
    }

    public final int d(kg3 kg3, List list, int i) {
        int r0 = kg3.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            gh4 gh4 = (gh4) list.get(i4);
            float j = c35.j(c35.i(gh4));
            int c = gh4.c(i);
            if (j == 0.0f) {
                i3 += c;
            } else if (j > 0.0f) {
                f += j;
                i2 = Math.max(i2, Math.round(((float) c) / j));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(((float) i2) * f) + i3;
    }

    public final int e(kg3 kg3, List list, int i) {
        int r0 = kg3.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            gh4 gh4 = (gh4) list.get(i4);
            float j = c35.j(c35.i(gh4));
            int W = gh4.W(i);
            if (j == 0.0f) {
                i3 += W;
            } else if (j > 0.0f) {
                f += j;
                i2 = Math.max(i2, Math.round(((float) W) / j));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(((float) i2) * f) + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au0)) {
            return false;
        }
        au0 au0 = (au0) obj;
        if (this.a.equals(au0.a) && this.b.equals(au0.b)) {
            return true;
        }
        return false;
    }

    public final void f(int i, int[] iArr, int[] iArr2, oh4 oh4) {
        this.a.s0(oh4, i, iArr, iArr2);
    }

    public final long g(int i, int i2, int i3, boolean z) {
        if (!z) {
            return m31.a(0, i3, i, i2);
        }
        return x91.w(0, i3, i, i2);
    }

    public final mh4 h(eh5[] eh5Arr, oh4 oh4, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        int i7 = i3;
        return oh4.d0(i3, i2, b42.w, new nb0(eh5Arr, this, i7, i, oh4, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final int i(eh5 eh5) {
        return eh5.w;
    }

    public final int j(eh5 eh5) {
        return eh5.x;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
