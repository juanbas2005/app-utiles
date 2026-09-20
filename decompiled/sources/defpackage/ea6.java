package defpackage;

import java.util.List;

/* renamed from: ea6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ea6 implements lh4, aa6 {
    public final tr a;
    public final h80 b;

    public ea6(tr trVar, h80 h80) {
        this.a = trVar;
        this.b = h80;
    }

    public final int a(kg3 kg3, List list, int i) {
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
            int v = gh4.v(i);
            if (j == 0.0f) {
                i3 += v;
            } else if (j > 0.0f) {
                f += j;
                i2 = Math.max(i2, Math.round(((float) v) / j));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(((float) i2) * f) + i3;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        return i35.n(this, k31.j(j), k31.i(j), k31.h(j), k31.g(j), oh4.r0(this.a.a()), oh4, list, new eh5[list.size()], 0, list.size(), (int[]) null, 0);
    }

    public final int c(kg3 kg3, List list, int i) {
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
            int l = gh4.l(i);
            if (j == 0.0f) {
                i3 += l;
            } else if (j > 0.0f) {
                f += j;
                i2 = Math.max(i2, Math.round(((float) l) / j));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(((float) i2) * f) + i3;
    }

    public final int d(kg3 kg3, List list, int i) {
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
                int min2 = Math.min(gh4.v(Integer.MAX_VALUE), i4);
                min += min2;
                i5 = Math.max(i5, gh4.c(min2));
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
                i5 = Math.max(i5, gh42.c(i3));
            }
        }
        return i5;
    }

    public final int e(kg3 kg3, List list, int i) {
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
                int min2 = Math.min(gh4.v(Integer.MAX_VALUE), i4);
                min += min2;
                i5 = Math.max(i5, gh4.W(min2));
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
                i5 = Math.max(i5, gh42.W(i3));
            }
        }
        return i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea6)) {
            return false;
        }
        ea6 ea6 = (ea6) obj;
        if (sg3.e(this.a, ea6.a) && sg3.e(this.b, ea6.b)) {
            return true;
        }
        return false;
    }

    public final void f(int i, int[] iArr, int[] iArr2, oh4 oh4) {
        oh4 oh42 = oh4;
        this.a.u(oh42, i, iArr, oh4.getLayoutDirection(), iArr2);
    }

    public final long g(int i, int i2, int i3, boolean z) {
        if (!z) {
            return m31.a(i, i2, 0, i3);
        }
        return x91.x(i, i2, 0, i3);
    }

    public final mh4 h(eh5[] eh5Arr, oh4 oh4, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return oh4.d0(i2, i3, b42.w, new da6(eh5Arr, this, i3, i, iArr));
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final int i(eh5 eh5) {
        return eh5.x;
    }

    public final int j(eh5 eh5) {
        return eh5.w;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
