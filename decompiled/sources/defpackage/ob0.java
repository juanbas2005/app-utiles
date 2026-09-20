package defpackage;

import java.util.List;

/* renamed from: ob0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ob0 implements lh4 {
    public final jb a;
    public final boolean b;

    public ob0(jb jbVar, boolean z) {
        this.a = jbVar;
        this.b = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: lb0} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, f06] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, f06] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final mh4 b(oh4 oh4, List list, long j) {
        long j2;
        int i;
        int i2;
        lb0 lb0;
        boolean z;
        lb0 lb02;
        boolean z2;
        boolean z3;
        int j3;
        int i3;
        boolean z4;
        eh5 y;
        oh4 oh42 = oh4;
        List list2 = list;
        boolean isEmpty = list2.isEmpty();
        b42 b42 = b42.w;
        if (isEmpty) {
            return oh42.d0(k31.j(j), k31.i(j), b42, new vd2(20));
        }
        if (this.b) {
            j2 = j;
        } else {
            j2 = j & -8589934589L;
        }
        lb0 lb03 = null;
        boolean z5 = true;
        if (list2.size() == 1) {
            gh4 gh4 = (gh4) list2.get(0);
            Object B = gh4.B();
            if (B instanceof lb0) {
                lb03 = B;
            }
            if (lb03 != null) {
                z3 = lb03.L;
            } else {
                z3 = false;
            }
            if (!z3) {
                y = gh4.y(j2);
                j3 = Math.max(k31.j(j), y.w);
                i3 = Math.max(k31.i(j), y.x);
            } else {
                j3 = k31.j(j);
                i3 = k31.i(j);
                int j4 = k31.j(j);
                int i4 = k31.i(j);
                if (j4 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i4 < 0) {
                    z5 = false;
                }
                if (!z5 || !z4) {
                    ac3.a("width and height must be >= 0");
                }
                y = gh4.y(m31.h(j4, j4, i4, i4));
            }
            int i5 = i3;
            int i6 = j3;
            return oh42.d0(i6, i5, b42, new nb0(y, gh4, oh42, i6, i5, this));
        }
        eh5[] eh5Arr = new eh5[list2.size()];
        ? obj = new Object();
        obj.w = k31.j(j);
        ? obj2 = new Object();
        obj2.w = k31.i(j);
        int size = list2.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            gh4 gh42 = (gh4) list2.get(i7);
            Object B2 = gh42.B();
            if (B2 instanceof lb0) {
                lb02 = (lb0) B2;
            } else {
                lb02 = null;
            }
            if (lb02 != null) {
                z2 = lb02.L;
            } else {
                z2 = false;
            }
            if (!z2) {
                eh5 y2 = gh42.y(j2);
                eh5Arr[i7] = y2;
                obj.w = Math.max(obj.w, y2.w);
                obj2.w = Math.max(obj2.w, y2.x);
            } else {
                z6 = true;
            }
        }
        if (z6) {
            int i8 = obj.w;
            if (i8 != Integer.MAX_VALUE) {
                i = i8;
            } else {
                i = 0;
            }
            int i9 = obj2.w;
            if (i9 != Integer.MAX_VALUE) {
                i2 = i9;
            } else {
                i2 = 0;
            }
            long a2 = m31.a(i, i8, i2, i9);
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                gh4 gh43 = (gh4) list2.get(i10);
                Object B3 = gh43.B();
                if (B3 instanceof lb0) {
                    lb0 = (lb0) B3;
                } else {
                    lb0 = null;
                }
                if (lb0 != null) {
                    z = lb0.L;
                } else {
                    z = false;
                }
                if (z) {
                    eh5Arr[i10] = gh43.y(a2);
                }
            }
        }
        return oh42.d0(obj.w, obj2.w, b42, new na0(eh5Arr, list2, oh42, obj, obj2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0 = (ob0) obj;
        if (sg3.e(this.a, ob0.a) && this.b == ob0.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
