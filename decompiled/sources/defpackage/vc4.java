package defpackage;

import java.util.Arrays;

/* renamed from: vc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vc4 implements Cloneable {
    public /* synthetic */ boolean w;
    public /* synthetic */ long[] x;
    public /* synthetic */ Object[] y;
    public /* synthetic */ int z;

    public vc4(int i) {
        if (i == 0) {
            this.x = ie1.A;
            this.y = ie1.B;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.x = new long[i5];
        this.y = new Object[i5];
    }

    public final void a() {
        int i = this.z;
        Object[] objArr = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.z = 0;
        this.w = false;
    }

    public final Object b(long j) {
        Object obj;
        int r = ie1.r(this.x, this.z, j);
        if (r < 0 || (obj = this.y[r]) == rd3.j) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.w) {
            int i = this.z;
            long[] jArr = this.x;
            Object[] objArr = this.y;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != rd3.j) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.w = false;
            this.z = i2;
        }
        return ie1.r(this.x, this.z, j);
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        vc4 vc4 = (vc4) clone;
        vc4.x = (long[]) this.x.clone();
        vc4.y = (Object[]) this.y.clone();
        return vc4;
    }

    public final long d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.z)) {
            h.q(hl6.k(i, "Expected index to be within 0..size()-1, but was "));
            return 0;
        }
        if (this.w) {
            long[] jArr = this.x;
            Object[] objArr = this.y;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != rd3.j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.w = false;
            this.z = i3;
        }
        return this.x[i];
    }

    public final void e(long j, Object obj) {
        Object obj2 = rd3.j;
        int r = ie1.r(this.x, this.z, j);
        if (r >= 0) {
            this.y[r] = obj;
            return;
        }
        int i = ~r;
        int i2 = this.z;
        if (i < i2) {
            Object[] objArr = this.y;
            if (objArr[i] == obj2) {
                this.x[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.w) {
            long[] jArr = this.x;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.y;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.w = false;
                this.z = i3;
                i = ~ie1.r(this.x, i3, j);
            }
        }
        int i5 = this.z;
        if (i5 >= this.x.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.x = Arrays.copyOf(this.x, i9);
            this.y = Arrays.copyOf(this.y, i9);
        }
        int i10 = this.z;
        if (i10 - i != 0) {
            long[] jArr2 = this.x;
            int i11 = i + 1;
            qs.L0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.y;
            qs.K0(i11, i, this.z, objArr3, objArr3);
        }
        this.x[i] = j;
        this.y[i] = obj;
        this.z++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.y;
     */
    public final void f(long j) {
        Object[] objArr;
        Object obj;
        int r = ie1.r(this.x, this.z, j);
        if (r >= 0 && objArr[r] != (obj = rd3.j)) {
            objArr[r] = obj;
            this.w = true;
        }
    }

    public final int g() {
        if (this.w) {
            int i = this.z;
            long[] jArr = this.x;
            Object[] objArr = this.y;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != rd3.j) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.w = false;
            this.z = i2;
        }
        return this.z;
    }

    public final Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.z)) {
            h.q(hl6.k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.w) {
            long[] jArr = this.x;
            Object[] objArr = this.y;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != rd3.j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.w = false;
            this.z = i3;
        }
        return this.y[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.z * 28);
        sb.append('{');
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ vc4(Object obj) {
        this(10);
    }
}
