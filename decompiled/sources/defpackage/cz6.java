package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* renamed from: cz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cz6 implements Cloneable {
    public /* synthetic */ boolean w;
    public /* synthetic */ int[] x;
    public /* synthetic */ Object[] y;
    public /* synthetic */ int z;

    public cz6(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.x = new int[i5];
        this.y = new Object[i5];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.z;
        if (i2 == 0 || i > this.x[i2 - 1]) {
            if (this.w && i2 >= this.x.length) {
                rg3.e(this);
            }
            int i3 = this.z;
            if (i3 >= this.x.length) {
                int i4 = (i3 + 1) * 4;
                int i5 = 4;
                while (true) {
                    if (i5 >= 32) {
                        break;
                    }
                    int i6 = (1 << i5) - 12;
                    if (i4 <= i6) {
                        i4 = i6;
                        break;
                    }
                    i5++;
                }
                int i7 = i4 / 4;
                this.x = Arrays.copyOf(this.x, i7);
                this.y = Arrays.copyOf(this.y, i7);
            }
            this.x[i3] = i;
            this.y[i3] = colorStateList;
            this.z = i3 + 1;
            return;
        }
        e(i, colorStateList);
    }

    /* renamed from: b */
    public final cz6 clone() {
        Object clone = super.clone();
        clone.getClass();
        cz6 cz6 = (cz6) clone;
        cz6.x = (int[]) this.x.clone();
        cz6.y = (Object[]) this.y.clone();
        return cz6;
    }

    public final Object c(int i) {
        Object obj;
        int q = ie1.q(this.z, i, this.x);
        if (q < 0 || (obj = this.y[q]) == rg3.j) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.w) {
            rg3.e(this);
        }
        return this.x[i];
    }

    public final void e(int i, Object obj) {
        int q = ie1.q(this.z, i, this.x);
        if (q >= 0) {
            this.y[q] = obj;
            return;
        }
        int i2 = ~q;
        int i3 = this.z;
        if (i2 < i3) {
            Object[] objArr = this.y;
            if (objArr[i2] == rg3.j) {
                this.x[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.w && i3 >= this.x.length) {
            rg3.e(this);
            i2 = ~ie1.q(this.z, i, this.x);
        }
        int i4 = this.z;
        if (i4 >= this.x.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.x = Arrays.copyOf(this.x, i8);
            this.y = Arrays.copyOf(this.y, i8);
        }
        int i9 = this.z;
        if (i9 - i2 != 0) {
            int[] iArr = this.x;
            int i10 = i2 + 1;
            qs.J0(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.y;
            qs.K0(i10, i2, this.z, objArr2, objArr2);
        }
        this.x[i2] = i;
        this.y[i2] = obj;
        this.z++;
    }

    public final int f() {
        if (this.w) {
            rg3.e(this);
        }
        return this.z;
    }

    public final Object g(int i) {
        if (this.w) {
            rg3.e(this);
        }
        Object[] objArr = this.y;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
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
            Object g = g(i2);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
