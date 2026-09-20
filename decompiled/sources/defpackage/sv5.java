package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: sv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sv5 extends s2 {
    public static final int[] k = {7, 5, 4, 3, 1};
    public static final int[] l = {4, 20, 52, 104, 204};
    public static final int[] m = {0, 348, 1388, 2948, 3988};
    public static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    public static final int[][] o;
    public static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    public final ArrayList g = new ArrayList(11);
    public final ArrayList h = new ArrayList();
    public final int[] i = new int[2];
    public boolean j;

    static {
        int[] iArr = {76, 17, 51, 153, 37, 111, 122, 155};
        int[] iArr2 = {20, 60, 180, 118, 143, 7, 21, 63};
        int[] iArr3 = {189, 145, 13, 39, 117, 140, 209, 205};
        int[] iArr4 = {193, 157, 49, 147, 19, 57, 171, 91};
        int[] iArr5 = {62, 186, 136, 197, 169, 85, 44, 132};
        int[] iArr6 = {ModuleDescriptor.MODULE_VERSION, 133, 188, 142, 4, 12, 36, 108};
        int[] iArr7 = {113, 128, 173, 97, 80, 29, 87, 50};
        int[] iArr8 = {109, 116, 137, 200, 178, 112, 125, 164};
        o = new int[][]{new int[]{1, 3, 9, 27, 81, 32, 96, 77}, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, iArr, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, iArr8, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    }

    public static n66 m(List list) {
        f1 f1Var;
        int size = list.size() << 1;
        int i2 = size - 1;
        if (((y82) list.get(list.size() - 1)).b == null) {
            i2 = size - 2;
        }
        i90 i90 = new i90(i2 * 12);
        int i3 = ((y82) list.get(0)).b.a;
        int i4 = 0;
        for (int i5 = 11; i5 >= 0; i5--) {
            if (((1 << i5) & i3) != 0) {
                i90.f(i4);
            }
            i4++;
        }
        for (int i6 = 1; i6 < list.size(); i6++) {
            y82 y82 = (y82) list.get(i6);
            int i7 = y82.a.a;
            for (int i8 = 11; i8 >= 0; i8--) {
                if (((1 << i8) & i7) != 0) {
                    i90.f(i4);
                }
                i4++;
            }
            fe1 fe1 = y82.b;
            if (fe1 != null) {
                int i9 = fe1.a;
                for (int i10 = 11; i10 >= 0; i10--) {
                    if (((1 << i10) & i9) != 0) {
                        i90.f(i4);
                    }
                    i4++;
                }
            }
        }
        if (i90.a(1)) {
            f1Var = new k(i90, 2);
        } else if (!i90.a(2)) {
            f1Var = new f1(i90);
        } else {
            int C = wr0.C(1, 4, i90);
            if (C == 4) {
                f1Var = new j(i90, 0);
            } else if (C != 5) {
                int C2 = wr0.C(1, 5, i90);
                if (C2 == 12) {
                    f1Var = new k(i90, 0);
                } else if (C2 != 13) {
                    switch (wr0.C(1, 7, i90)) {
                        case 56:
                            f1Var = new l(i90, "310", "11");
                            break;
                        case 57:
                            f1Var = new l(i90, "320", "11");
                            break;
                        case 58:
                            f1Var = new l(i90, "310", "13");
                            break;
                        case 59:
                            f1Var = new l(i90, "320", "13");
                            break;
                        case 60:
                            f1Var = new l(i90, "310", "15");
                            break;
                        case 61:
                            f1Var = new l(i90, "320", "15");
                            break;
                        case 62:
                            f1Var = new l(i90, "310", "17");
                            break;
                        case 63:
                            f1Var = new l(i90, "320", "17");
                            break;
                        default:
                            h.s("unknown decoder: ".concat(String.valueOf(i90)));
                            return null;
                    }
                } else {
                    f1Var = new k(i90, 1);
                }
            } else {
                f1Var = new j(i90, 1);
            }
        }
        String p2 = f1Var.p();
        r66[] r66Arr = ((y82) list.get(0)).c.c;
        r66[] r66Arr2 = ((y82) list.get(list.size() - 1)).c.c;
        return new n66(p2, (byte[]) null, new r66[]{r66Arr[0], r66Arr[1], r66Arr2[0], r66Arr2[1]}, d50.J);
    }

    public final n66 b(int i2, i90 i90, Map map) {
        ArrayList arrayList = this.g;
        arrayList.clear();
        this.j = false;
        try {
            return m(o(i90, i2));
        } catch (NotFoundException unused) {
            arrayList.clear();
            this.j = true;
            return m(o(i90, i2));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.g;
        y82 y82 = (y82) arrayList.get(0);
        fe1 fe1 = y82.a;
        fe1 fe12 = y82.b;
        if (fe12 != null) {
            int i2 = fe12.b;
            int i3 = 2;
            for (int i4 = 1; i4 < arrayList.size(); i4++) {
                y82 y822 = (y82) arrayList.get(i4);
                i2 += y822.a.b;
                int i5 = i3 + 1;
                fe1 fe13 = y822.b;
                if (fe13 != null) {
                    i2 += fe13.b;
                    i3 += 2;
                } else {
                    i3 = i5;
                }
            }
            if (((i3 - 4) * 211) + (i2 % 211) == fe1.a) {
                return true;
            }
        }
        return false;
    }

    public final List k(int i2, ArrayList arrayList) {
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i2 < arrayList2.size()) {
                z82 z82 = (z82) arrayList2.get(i2);
                ArrayList arrayList3 = this.g;
                arrayList3.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.addAll(((z82) it.next()).a);
                }
                arrayList3.addAll(z82.a);
                for (int i3 = 0; i3 < 10; i3++) {
                    int[] iArr = p[i3];
                    if (arrayList3.size() <= iArr.length) {
                        int i4 = 0;
                        while (i4 < arrayList3.size()) {
                            if (((y82) arrayList3.get(i4)).c.a == iArr[i4]) {
                                i4++;
                            }
                        }
                        if (j()) {
                            return arrayList3;
                        }
                        ArrayList arrayList4 = new ArrayList(arrayList);
                        arrayList4.add(z82);
                        try {
                            return k(i2 + 1, arrayList4);
                        } catch (NotFoundException unused) {
                        }
                    }
                }
                i2++;
            } else {
                throw NotFoundException.y;
            }
        }
    }

    public final List l(boolean z) {
        ArrayList arrayList = this.h;
        List list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(arrayList);
        }
        try {
            list = k(0, new ArrayList());
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    public final fe1 n(i90 i90, ee2 ee2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        int[][] iArr;
        i90 i902 = i90;
        ee2 ee22 = ee2;
        int[] iArr2 = this.b;
        Arrays.fill(iArr2, 0);
        if (z2) {
            m55.f(ee22.b[0], i902, iArr2);
        } else {
            m55.e(ee22.b[1], i902, iArr2);
            int i3 = 0;
            for (int length = iArr2.length - 1; i3 < length; length--) {
                int i4 = iArr2[i3];
                iArr2[i3] = iArr2[length];
                iArr2[length] = i4;
                i3++;
            }
        }
        float z0 = ((float) bb0.z0(iArr2)) / 17.0f;
        int[] iArr3 = ee22.b;
        int i5 = ee22.a;
        float f = ((float) (iArr3[1] - iArr3[0])) / 15.0f;
        if (Math.abs(z0 - f) / f <= 0.3f) {
            int i6 = 0;
            while (true) {
                int length2 = iArr2.length;
                float[] fArr = this.d;
                float[] fArr2 = this.c;
                int[] iArr4 = this.f;
                int[] iArr5 = this.e;
                if (i6 < length2) {
                    float f2 = (((float) iArr2[i6]) * 1.0f) / z0;
                    int i7 = (int) (0.5f + f2);
                    if (i7 <= 0) {
                        if (f2 >= 0.3f) {
                            i7 = 1;
                        } else {
                            throw NotFoundException.y;
                        }
                    } else if (i7 > 8) {
                        if (f2 <= 8.7f) {
                            i7 = 8;
                        } else {
                            throw NotFoundException.y;
                        }
                    }
                    int i8 = i6 / 2;
                    if ((i6 & 1) == 0) {
                        iArr5[i8] = i7;
                        fArr2[i8] = f2 - ((float) i7);
                    } else {
                        iArr4[i8] = i7;
                        fArr[i8] = f2 - ((float) i7);
                    }
                    i6++;
                } else {
                    int z02 = bb0.z0(iArr5);
                    int z03 = bb0.z0(iArr4);
                    if (z02 > 13) {
                        z4 = false;
                        z3 = true;
                    } else if (z02 < 4) {
                        z3 = false;
                        z4 = true;
                    } else {
                        z4 = false;
                        z3 = false;
                    }
                    if (z03 > 13) {
                        z6 = false;
                        z5 = true;
                    } else if (z03 < 4) {
                        z5 = false;
                        z6 = true;
                    } else {
                        z6 = false;
                        z5 = false;
                    }
                    int i9 = (z02 + z03) - 17;
                    if ((z02 & 1) == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((z03 & 1) == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i9 != -1) {
                        if (i9 != 0) {
                            if (i9 != 1) {
                                throw NotFoundException.y;
                            } else if (z7) {
                                if (!z8) {
                                    z3 = true;
                                } else {
                                    throw NotFoundException.y;
                                }
                            } else if (z8) {
                                z5 = true;
                            } else {
                                throw NotFoundException.y;
                            }
                        } else if (z7) {
                            if (!z8) {
                                throw NotFoundException.y;
                            } else if (z02 < z03) {
                                z4 = true;
                                z5 = true;
                            } else {
                                z3 = true;
                                z6 = true;
                            }
                        } else if (z8) {
                            throw NotFoundException.y;
                        }
                    } else if (z7) {
                        if (!z8) {
                            z4 = true;
                        } else {
                            throw NotFoundException.y;
                        }
                    } else if (z8) {
                        z6 = true;
                    } else {
                        throw NotFoundException.y;
                    }
                    if (z4) {
                        if (!z3) {
                            s2.h(iArr5, fArr2);
                        } else {
                            throw NotFoundException.y;
                        }
                    }
                    if (z3) {
                        s2.g(iArr5, fArr2);
                    }
                    if (z6) {
                        if (!z5) {
                            s2.h(iArr4, fArr2);
                        } else {
                            throw NotFoundException.y;
                        }
                    }
                    if (z5) {
                        s2.g(iArr4, fArr);
                    }
                    int i10 = i5 * 4;
                    if (z) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                    int i11 = ((i10 + i2) + (z2 ^ true ? 1 : 0)) - 1;
                    int length3 = iArr5.length - 1;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        iArr = o;
                        if (length3 < 0) {
                            break;
                        }
                        if (i5 != 0 || !z || !z2) {
                            i12 += iArr5[length3] * iArr[i11][length3 * 2];
                        }
                        i13 += iArr5[length3];
                        length3--;
                    }
                    int i14 = 0;
                    for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                        if (i5 != 0 || !z || !z2) {
                            i14 += iArr4[length4] * iArr[i11][(length4 * 2) + 1];
                        }
                    }
                    int i15 = i12 + i14;
                    if ((i13 & 1) != 0 || i13 > 13 || i13 < 4) {
                        throw NotFoundException.y;
                    }
                    int i16 = (13 - i13) / 2;
                    int i17 = k[i16];
                    int i18 = 9 - i17;
                    return new fe1((l55.o(iArr5, i17, true) * l[i16]) + l55.o(iArr4, i18, false) + m[i16], i15);
                }
            }
        } else {
            throw NotFoundException.y;
        }
    }

    public final List o(i90 i90, int i2) {
        boolean z;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.g;
            if (!z2) {
                try {
                    arrayList.add(p(i90, arrayList, i2));
                } catch (NotFoundException e) {
                    if (!arrayList.isEmpty()) {
                        z2 = true;
                    } else {
                        throw e;
                    }
                }
            } else if (j()) {
                return arrayList;
            } else {
                ArrayList arrayList2 = this.h;
                boolean isEmpty = arrayList2.isEmpty();
                int i3 = 0;
                boolean z3 = false;
                while (true) {
                    if (i3 >= arrayList2.size()) {
                        z = false;
                        break;
                    }
                    z82 z82 = (z82) arrayList2.get(i3);
                    int i4 = z82.b;
                    ArrayList arrayList3 = z82.a;
                    if (i4 > i2) {
                        z = arrayList3.equals(arrayList);
                        break;
                    }
                    z3 = arrayList3.equals(arrayList);
                    i3++;
                }
                if (!z && !z3) {
                    Iterator it = arrayList2.iterator();
                    loop2:
                    while (true) {
                        if (it.hasNext()) {
                            z82 z822 = (z82) it.next();
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break loop2;
                                }
                                y82 y82 = (y82) it2.next();
                                Iterator it3 = z822.a.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (y82.equals((y82) it3.next())) {
                                        }
                                    }
                                }
                            }
                        } else {
                            arrayList2.add(i3, new z82(i2, arrayList));
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                z82 z823 = (z82) it4.next();
                                if (z823.a.size() != arrayList.size()) {
                                    Iterator it5 = z823.a.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            if (!arrayList.contains((y82) it5.next())) {
                                                break;
                                            }
                                        } else {
                                            it4.remove();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!isEmpty) {
                    List l2 = l(false);
                    if (l2 != null) {
                        return l2;
                    }
                    List l3 = l(true);
                    if (l3 != null) {
                        return l3;
                    }
                }
                throw NotFoundException.y;
            }
        }
    }

    public final y82 p(i90 i90, ArrayList arrayList, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int c;
        int i8;
        ee2 ee2;
        int i9;
        i90 i902 = i90;
        ArrayList arrayList2 = arrayList;
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        if (arrayList2.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.j) {
            z = !z;
        }
        int i13 = -1;
        boolean z2 = true;
        while (true) {
            int[] iArr = this.a;
            iArr[i11] = i11;
            iArr[i12] = i11;
            iArr[i10] = i11;
            int i14 = 3;
            iArr[3] = i11;
            int i15 = i902.x;
            if (i13 >= 0) {
                i3 = i13;
            } else if (arrayList2.isEmpty()) {
                i3 = i11;
            } else {
                i3 = ((y82) b81.k(i12, arrayList2)).c.b[i12];
            }
            if (arrayList2.size() % i10 != 0) {
                i4 = i12;
            } else {
                i4 = i11;
            }
            if (this.j) {
                i4 ^= 1;
            }
            boolean z3 = i11;
            while (true) {
                if (i3 >= i15) {
                    break;
                }
                boolean a = i902.a(i3);
                boolean z4 = !a;
                if (a) {
                    z3 = z4;
                    break;
                }
                i3++;
                z3 = z4;
            }
            int i16 = i10;
            int i17 = i11;
            int i18 = z3;
            int i19 = i3;
            while (i3 < i15) {
                int i20 = i11;
                if (i902.a(i3) != i18) {
                    iArr[i17] = iArr[i17] + i12;
                    i5 = i12;
                    i6 = i14;
                } else {
                    if (i17 == i14) {
                        if (i4 != 0) {
                            int length = iArr.length;
                            i6 = i14;
                            int i21 = i20;
                            while (true) {
                                i7 = i12;
                                if (i21 >= length / 2) {
                                    break;
                                }
                                int i22 = iArr[i21];
                                int i23 = (length - i21) - 1;
                                iArr[i21] = iArr[i23];
                                iArr[i23] = i22;
                                i21++;
                                i12 = i7;
                            }
                        } else {
                            i7 = i12;
                            i6 = i14;
                        }
                        if (s2.i(iArr)) {
                            int[] iArr2 = this.i;
                            iArr2[i20] = i19;
                            iArr2[i7] = i3;
                            if (z) {
                                int i24 = i19 - 1;
                                while (i24 >= 0 && !i902.a(i24)) {
                                    i24--;
                                }
                                i19 = i24 + 1;
                                i8 = iArr2[i20] - i19;
                                c = iArr2[i7];
                            } else {
                                c = i902.c(i3 + 1);
                                i8 = c - iArr2[i7];
                            }
                            int i25 = c;
                            int i26 = i19;
                            int i27 = i20;
                            System.arraycopy(iArr, i27, iArr, i7, iArr.length - 1);
                            iArr[i27] = i8;
                            fe1 fe1 = null;
                            try {
                                int[][] iArr3 = n;
                                int i28 = 0;
                                while (i28 < 6) {
                                    if (m55.d(iArr, iArr3[i28], 0.45f) < 0.2f) {
                                        ee2 = new ee2(i28, i26, i25, i2, new int[]{i26, i25});
                                        if (ee2 == null) {
                                            int i29 = iArr2[0];
                                            if (i902.a(i29)) {
                                                i9 = i902.b(i902.c(i29));
                                            } else {
                                                i9 = i902.c(i902.b(i29));
                                            }
                                            i13 = i9;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            fe1 n2 = n(i902, ee2, z, true);
                                            if (arrayList2.isEmpty() || ((y82) b81.k(1, arrayList2)).b != null) {
                                                try {
                                                    fe1 = n(i902, ee2, z, false);
                                                } catch (NotFoundException unused) {
                                                }
                                                return new y82(n2, fe1, ee2);
                                            }
                                            throw NotFoundException.y;
                                        }
                                        i10 = i16;
                                        i11 = 0;
                                        i12 = 1;
                                    } else {
                                        i28++;
                                    }
                                }
                                throw NotFoundException.y;
                            } catch (NotFoundException unused2) {
                                ee2 = null;
                            }
                        } else {
                            if (i4 != 0) {
                                int length2 = iArr.length;
                                for (int i30 = 0; i30 < length2 / 2; i30++) {
                                    int i31 = iArr[i30];
                                    int i32 = (length2 - i30) - 1;
                                    iArr[i30] = iArr[i32];
                                    iArr[i32] = i31;
                                }
                            }
                            i5 = 1;
                            i20 = 0;
                            i19 += iArr[0] + iArr[1];
                            iArr[0] = iArr[i16];
                            iArr[1] = iArr[i6];
                            iArr[i16] = 0;
                            iArr[i6] = 0;
                            i17--;
                        }
                    } else {
                        i5 = i12;
                        i6 = i14;
                        i17++;
                    }
                    iArr[i17] = i5;
                    i18 ^= 1;
                }
                i3++;
                i11 = i20;
                i14 = i6;
                i12 = i5;
            }
            throw NotFoundException.y;
        }
    }

    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
