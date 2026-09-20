package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: xj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xj8 extends AbstractMap {
    public static final zf8 B = new zf8(4);
    public String A;
    public final Object[] w;
    public final int[] x;
    public final wj8 y;
    public Integer z;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, xj8] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016d, code lost:
        if (r8 < 0) goto L_0x016f;
     */
    public xj8(xj8 xj8, xj8 xj82) {
        xj8 xj83;
        int i;
        int i2;
        Object obj;
        Object[] objArr;
        xj8 xj84 = xj8;
        xj8 xj85 = xj82;
        ? abstractMap = new AbstractMap();
        abstractMap.y = new wj8(abstractMap, -1);
        abstractMap.z = null;
        abstractMap.A = null;
        int size = xj85.size() + xj84.size();
        int i3 = xj84.x[xj84.size()] + xj85.x[xj85.size()];
        int i4 = size + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr = new int[i4];
        int i5 = 0;
        iArr[0] = size;
        Map.Entry c = xj84.c(0);
        Map.Entry c2 = xj85.c(0);
        int i6 = 0;
        int i7 = 0;
        int i8 = size;
        int i9 = 0;
        xj8 xj86 = abstractMap;
        while (true) {
            if (c == null && c2 == null) {
                break;
            }
            int i10 = i9 + 1;
            if (c != null) {
                if (c2 != null) {
                    int compareTo = ((String) c.getKey()).compareTo((String) c2.getKey());
                    if (compareTo == 0) {
                        int i11 = i6 + 1;
                        int i12 = i7 + 1;
                        objArr2[i9] = new AbstractMap.SimpleImmutableEntry((String) c.getKey(), new wj8(xj86, i9));
                        wj8 wj8 = (wj8) c.getValue();
                        wj8 wj82 = (wj8) c2.getValue();
                        int i13 = 0;
                        int i14 = 0;
                        xj8 xj87 = xj86;
                        while (true) {
                            int f = wj8.f();
                            xj8 xj88 = wj8.x;
                            if (i13 >= f - wj8.d() && i14 >= wj82.f() - wj82.d()) {
                                break;
                            }
                            if (i13 == wj8.f() - wj8.d()) {
                                i = 1;
                            } else if (i14 == wj82.f() - wj82.d()) {
                                i = -1;
                            } else {
                                i = 0;
                            }
                            if (i == 0) {
                                zf8 zf8 = yj8.b;
                                i2 = i13;
                                i = yj8.b.compare(xj88.w[wj8.d() + i13], wj82.x.w[wj82.d() + i14]);
                            } else {
                                i2 = i13;
                            }
                            if (i < 0) {
                                i13 = i2 + 1;
                                obj = xj88.w[wj8.d() + i2];
                            } else {
                                int i15 = i14 + 1;
                                Object obj2 = wj82.x.w[wj82.d() + i14];
                                if (i == 0) {
                                    i14 = i15;
                                    obj = obj2;
                                    i13 = i2 + 1;
                                } else {
                                    i14 = i15;
                                    obj = obj2;
                                    i13 = i2;
                                }
                            }
                            objArr2[i8] = obj;
                            xj87 = this;
                            i8++;
                        }
                        iArr[i10] = i8;
                        c = xj84.c(i12);
                        c2 = xj85.c(i11);
                        i7 = i12;
                        i6 = i11;
                        i9 = i10;
                        i5 = 0;
                        xj83 = xj87;
                        xj86 = xj83;
                    }
                }
                i7++;
                i8 = a(c, i9, i8, objArr2, iArr);
                c = xj84.c(i7);
                i9 = i10;
                i5 = 0;
                xj83 = this;
                xj86 = xj83;
            }
            Map.Entry entry = c;
            i6++;
            int a = a(c2, i9, i8, objArr2, iArr);
            c2 = xj85.c(i6);
            i8 = a;
            c = entry;
            i9 = i10;
            i5 = 0;
            xj83 = this;
            xj86 = xj83;
        }
        int i16 = iArr[i5];
        int i17 = i16 - i9;
        if (i17 != 0) {
            for (int i18 = i5; i18 <= i9; i18++) {
                iArr[i18] = iArr[i18] - i17;
            }
            int i19 = iArr[i9];
            int i20 = i19 - i9;
            if (b(i3, i19)) {
                objArr = new Object[i19];
                System.arraycopy(objArr2, i5, objArr, i5, i9);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i16, objArr, i9, i20);
            objArr2 = objArr;
        }
        xj86.w = objArr2;
        int i21 = iArr[i5] + 1;
        xj86.x = b(i4, i21) ? Arrays.copyOf(iArr, i21) : iArr;
    }

    public static boolean b(int i, int i2) {
        if (i <= 16 || i * 9 <= i2 * 10) {
            return false;
        }
        return true;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        wj8 wj8 = (wj8) entry.getValue();
        int f = wj8.f() - wj8.d();
        System.arraycopy(wj8.x.w, wj8.d(), objArr, i2, f);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new wj8(this, i));
        int i3 = i2 + f;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.x[0]) {
            return (Map.Entry) this.w[i];
        }
        return null;
    }

    public final Set entrySet() {
        return this.y;
    }

    public final int hashCode() {
        if (this.z == null) {
            this.z = Integer.valueOf(super.hashCode());
        }
        return this.z.intValue();
    }

    public final String toString() {
        if (this.A == null) {
            this.A = super.toString();
        }
        return this.A;
    }

    public xj8() {
        List list = Collections.EMPTY_LIST;
        this.y = new wj8(this, -1);
        this.z = null;
        this.A = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.w = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.x = iArr;
                return;
            }
            throw pb4.g(it2);
        }
        throw pb4.g(it);
    }
}
