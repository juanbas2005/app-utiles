package defpackage;

import com.google.android.gms.internal.measurement.zzaeg;
import java.util.Arrays;

/* renamed from: en8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class en8 {
    public static final en8 f = new en8(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public en8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static en8 a() {
        return new en8(0, new int[8], new Object[8], true);
    }

    public final void b(br4 br4) {
        fl8 fl8 = (fl8) br4.x;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    fl8.h(((Long) obj).longValue(), i4);
                } else if (i3 == 1) {
                    fl8.i(((Long) obj).longValue(), i4);
                } else if (i3 == 2) {
                    fl8.l(i4, (vk8) obj);
                } else if (i3 == 3) {
                    fl8.d(i4, 3);
                    ((en8) obj).b(br4);
                    fl8.d(i4, 4);
                } else if (i3 == 5) {
                    fl8.g(i4, ((Integer) obj).intValue());
                } else {
                    rf2.o(new zzaeg());
                    return;
                }
            }
        }
    }

    public final int c() {
        int a2;
        int b2;
        int a3;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    a3 = fl8.a(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int a4 = fl8.a(i5 << 3);
                    int f2 = ((vk8) this.c[i3]).f();
                    i2 = hl6.g(f2, f2, a4, i2);
                } else if (i6 == 3) {
                    int a5 = fl8.a(i5 << 3);
                    a2 = a5 + a5;
                    b2 = ((en8) this.c[i3]).c();
                } else if (i6 == 5) {
                    ((Integer) this.c[i3]).getClass();
                    a3 = fl8.a(i5 << 3) + 4;
                } else {
                    throw new IllegalStateException(new zzaeg());
                }
                i2 = a3 + i2;
            } else {
                int i7 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                a2 = fl8.a(i7);
                b2 = fl8.b(longValue);
            }
            i2 = b2 + a2 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (this.e) {
            e(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        ku4.p();
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof en8)) {
            en8 en8 = (en8) obj;
            int i = this.a;
            if (i == en8.a) {
                int[] iArr = this.b;
                int[] iArr2 = en8.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = en8.c;
                        int i3 = this.a;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (objArr[i4].equals(objArr2[i4])) {
                                i4++;
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
