package defpackage;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: rv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rv5 extends s2 {
    public static final int[] i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};
    public static final int[] k = {0, 161, 961, 2015, 2715};
    public static final int[] l = {0, 336, 1036, 1516};
    public static final int[] m = {8, 6, 4, 3, 1};
    public static final int[] n = {2, 4, 6, 8};
    public static final int[][] o;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    static {
        int[] iArr = {2, 7, 4, 1};
        o = new int[][]{new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, iArr, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    }

    public static void j(ArrayList arrayList, zb5 zb5) {
        if (zb5 != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zb5 zb52 = (zb5) it.next();
                if (zb52.a == zb5.a) {
                    zb52.d++;
                    return;
                }
            }
            arrayList.add(zb5);
        }
    }

    public final n66 b(int i2, i90 i90, Map map) {
        zb5 l2 = l(i90, false, i2, map);
        ArrayList arrayList = this.g;
        j(arrayList, l2);
        i90.e();
        zb5 l3 = l(i90, true, i2, map);
        ArrayList arrayList2 = this.h;
        j(arrayList2, l3);
        i90.e();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zb5 zb5 = (zb5) it.next();
            int i3 = zb5.d;
            ee2 ee2 = zb5.c;
            if (i3 > 1) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zb5 zb52 = (zb5) it2.next();
                    int i4 = zb52.d;
                    ee2 ee22 = zb52.c;
                    if (i4 > 1) {
                        int i5 = ((zb52.b * 16) + zb5.b) % 79;
                        int i6 = (ee2.a * 9) + ee22.a;
                        if (i6 > 72) {
                            i6--;
                        }
                        if (i6 > 8) {
                            i6--;
                        }
                        if (i5 == i6) {
                            String valueOf = String.valueOf((((long) zb5.a) * 4537077) + ((long) zb52.a));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i7 = 0;
                            for (int i8 = 0; i8 < 13; i8++) {
                                int charAt = sb.charAt(i8) - '0';
                                if ((i8 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i7 += charAt;
                            }
                            int i9 = 10 - (i7 % 10);
                            if (i9 == 10) {
                                i9 = 0;
                            }
                            sb.append(i9);
                            r66[] r66Arr = ee2.c;
                            r66[] r66Arr2 = ee22.c;
                            return new n66(sb.toString(), (byte[]) null, new r66[]{r66Arr[0], r66Arr[1], r66Arr2[0], r66Arr2[1]}, d50.I);
                        }
                    }
                }
                continue;
            }
        }
        throw NotFoundException.y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r3 < 4) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        r16 = false;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r15 = false;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r3 < 4) goto L_0x0094;
     */
    public final fe1 k(i90 i90, ee2 ee2, boolean z) {
        int i2;
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        i90 i902 = i90;
        boolean z8 = z;
        int[] iArr3 = this.b;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = ee2.b;
        if (z8) {
            m55.f(iArr4[0], i902, iArr3);
        } else {
            m55.e(iArr4[1], i902, iArr3);
            int i3 = 0;
            for (int length = iArr3.length - 1; i3 < length; length--) {
                int i4 = iArr3[i3];
                iArr3[i3] = iArr3[length];
                iArr3[length] = i4;
                i3++;
            }
        }
        if (z8) {
            i2 = 16;
        } else {
            i2 = 15;
        }
        float z0 = ((float) bb0.z0(iArr3)) / ((float) i2);
        int i5 = 0;
        while (true) {
            int length2 = iArr3.length;
            fArr = this.d;
            fArr2 = this.c;
            iArr = this.f;
            iArr2 = this.e;
            if (i5 >= length2) {
                break;
            }
            float f = ((float) iArr3[i5]) / z0;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArr2[i7] = i6;
                fArr2[i7] = f - ((float) i6);
            } else {
                iArr[i7] = i6;
                fArr[i7] = f - ((float) i6);
            }
            i5++;
        }
        int z02 = bb0.z0(iArr2);
        int z03 = bb0.z0(iArr);
        if (z8) {
            if (z02 > 12) {
                z3 = false;
                z2 = true;
            } else if (z02 < 4) {
                z2 = false;
                z3 = true;
            } else {
                z3 = false;
                z2 = false;
            }
            if (z03 <= 12) {
            }
        } else {
            if (z02 > 11) {
                z6 = false;
                z7 = true;
            } else if (z02 < 5) {
                z7 = false;
                z6 = true;
            } else {
                z6 = false;
                z7 = false;
            }
            if (z03 <= 10) {
            }
        }
        boolean z9 = false;
        boolean z10 = true;
        int i8 = (z02 + z03) - i2;
        if ((z02 & true) == z8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((z03 & 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    throw NotFoundException.y;
                } else if (z4) {
                    if (!z5) {
                        z2 = true;
                    } else {
                        throw NotFoundException.y;
                    }
                } else if (z5) {
                    z10 = true;
                } else {
                    throw NotFoundException.y;
                }
            } else if (z4) {
                if (!z5) {
                    throw NotFoundException.y;
                } else if (z02 < z03) {
                    z3 = true;
                    z10 = true;
                } else {
                    z2 = true;
                    z9 = true;
                }
            } else if (z5) {
                throw NotFoundException.y;
            }
        } else if (z4) {
            if (!z5) {
                z3 = true;
            } else {
                throw NotFoundException.y;
            }
        } else if (z5) {
            z9 = true;
        } else {
            throw NotFoundException.y;
        }
        if (z3) {
            if (!z2) {
                s2.h(iArr2, fArr2);
            } else {
                throw NotFoundException.y;
            }
        }
        if (z2) {
            s2.g(iArr2, fArr2);
        }
        if (z9) {
            if (!z10) {
                s2.h(iArr, fArr2);
            } else {
                throw NotFoundException.y;
            }
        }
        if (z10) {
            s2.g(iArr, fArr);
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = iArr2.length - 1; length3 >= 0; length3--) {
            int i11 = iArr2[length3];
            i9 = (i9 * 9) + i11;
            i10 += i11;
        }
        int i12 = 0;
        int i13 = 0;
        for (int length4 = iArr.length - 1; length4 >= 0; length4--) {
            int i14 = iArr[length4];
            i12 = (i12 * 9) + i14;
            i13 += i14;
        }
        int i15 = (i12 * 3) + i9;
        if (z8) {
            if ((i10 & 1) != 0 || i10 > 12 || i10 < 4) {
                throw NotFoundException.y;
            }
            int i16 = (12 - i10) / 2;
            int i17 = m[i16];
            int i18 = 9 - i17;
            return new fe1((l55.o(iArr2, i17, false) * i[i16]) + l55.o(iArr, i18, true) + k[i16], i15);
        } else if ((i13 & 1) != 0 || i13 > 10 || i13 < 4) {
            throw NotFoundException.y;
        } else {
            int i19 = (10 - i13) / 2;
            int i20 = n[i19];
            return new fe1((l55.o(iArr, 9 - i20, false) * j[i19]) + l55.o(iArr2, i20, true) + l[i19], i15);
        }
    }

    public final zb5 l(i90 i90, boolean z, int i2, Map map) {
        s66 s66;
        try {
            ee2 n2 = n(i90, i2, z, m(i90, z));
            if (map == null) {
                s66 = null;
            } else {
                s66 = (s66) map.get(fk1.F);
            }
            if (s66 != null) {
                int[] iArr = n2.b;
                float f = ((float) ((iArr[0] + iArr[1]) - 1)) / 2.0f;
                if (z) {
                    f = ((float) (i90.x - 1)) - f;
                }
                s66.a(new r66(f, (float) i2));
            }
            fe1 k2 = k(i90, n2, true);
            fe1 k3 = k(i90, n2, false);
            return new zb5((k2.a * 1597) + k3.a, (k3.b * 4) + k2.b, n2);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final int[] m(i90 i90, boolean z) {
        int[] iArr = this.a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i2 = i90.x;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            z2 = !i90.a(i3);
            if (z == z2) {
                break;
            }
            i3++;
        }
        int i4 = 0;
        int i5 = i3;
        while (i3 < i2) {
            if (i90.a(i3) != z2) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (s2.i(iArr)) {
                    return new int[]{i5, i3};
                } else {
                    i5 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z2 = !z2;
            }
            i3++;
        }
        throw NotFoundException.y;
    }

    public final ee2 n(i90 i90, int i2, boolean z, int[] iArr) {
        int i3;
        int i4;
        boolean a = i90.a(iArr[0]);
        int i5 = iArr[0] - 1;
        while (i5 >= 0 && a != i90.a(i5)) {
            i5--;
        }
        int i6 = i5 + 1;
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = iArr[0] - i6;
        for (int i7 = 0; i7 < 9; i7++) {
            if (m55.d(iArr2, o[i7], 0.45f) < 0.2f) {
                int i8 = iArr[1];
                if (z) {
                    int i9 = i90.x - 1;
                    i3 = i9 - i8;
                    i4 = i9 - i6;
                } else {
                    i3 = i8;
                    i4 = i6;
                }
                return new ee2(i7, i4, i3, i2, new int[]{i6, i8});
            }
            int i10 = i2;
        }
        throw NotFoundException.y;
    }

    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
