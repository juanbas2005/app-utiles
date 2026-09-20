package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: xy1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xy1 {
    public ArrayList a;
    public float[] b;

    public xy1(int i) {
        switch (i) {
            case 1:
                this.b = new float[64];
                return;
            default:
                this.a = new ArrayList();
                float[] fArr = new float[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    fArr[i2] = Float.NaN;
                }
                this.b = fArr;
                return;
        }
    }

    public void a(yz1 yz1, float f) {
        ArrayList arrayList = this.a;
        arrayList.add(yz1);
        if (this.b.length < arrayList.size()) {
            this.b = Arrays.copyOf(this.b, arrayList.size() + 2);
        }
        this.b[arrayList.size() - 1] = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bb A[LOOP:6: B:43:0x00a7->B:48:0x00bb, LOOP_END] */
    public void b(String str, ArrayList arrayList) {
        int i;
        int i2;
        char charAt;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        long j;
        float intBitsToFloat;
        String str2 = str;
        ArrayList arrayList2 = arrayList;
        int length = str2.length();
        int i5 = 0;
        int i6 = 0;
        while (i < length && sg3.k(str2.charAt(i), 32) <= 0) {
            i6 = i + 1;
        }
        while (length > i && sg3.k(str2.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i7 = 0;
        while (i < length) {
            while (true) {
                i2 = i + 1;
                charAt = str2.charAt(i);
                char c = charAt | ' ';
                if ((c - 'z') * (c - 'a') > 0 || c == 'e') {
                    if (i2 >= length) {
                        charAt = i5;
                    } else {
                        i = i2;
                    }
                }
            }
            if (charAt != 0) {
                char c2 = charAt | ' ';
                if (c2 != 'z') {
                    while (i2 < length && sg3.k(str2.charAt(i2), 32) <= 0) {
                        i2++;
                    }
                    if (c2 == 'a') {
                        i4 = 1;
                    } else {
                        i4 = i5;
                    }
                    int i8 = i5;
                    do {
                        if (i4 == 0 || 3 > i8 || i8 >= 5) {
                            j = ed1.v(i2, length, str2);
                        } else {
                            j = ed1.v(i2, Math.min(i2 + 1, length), str2);
                        }
                        i2 = (int) (j >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                        if (!Float.isNaN(intBitsToFloat)) {
                            float[] fArr = this.b;
                            int i9 = i8 + 1;
                            fArr[i8] = intBitsToFloat;
                            if (i9 >= fArr.length) {
                                float[] fArr2 = new float[(i9 * 2)];
                                this.b = fArr2;
                                System.arraycopy(fArr, i5, fArr2, i5, fArr.length);
                            }
                            i8 = i9;
                        }
                        while (i2 < length && (sg3.k(str2.charAt(i2), 32) <= 0 || str2.charAt(i2) == ',')) {
                            i2++;
                        }
                        if (i2 >= length || Float.isNaN(intBitsToFloat)) {
                            i7 = i8;
                        }
                        if (i4 == 0 || 3 > i8 || i8 >= 5) {
                        }
                        i2 = (int) (j >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                        if (!Float.isNaN(intBitsToFloat)) {
                        }
                        while (i2 < length && (sg3.k(str2.charAt(i2), 32) <= 0 || str2.charAt(i2) == ',')) {
                        }
                        i7 = i8;
                    } while (Float.isNaN(intBitsToFloat));
                    i7 = i8;
                }
                float[] fArr3 = this.b;
                int i10 = 2;
                switch (charAt) {
                    case 'A':
                        i3 = i5;
                        int i11 = i7 - 7;
                        for (int i12 = i3; i12 <= i11; i12 += 7) {
                            float f = fArr3[i12];
                            float f2 = fArr3[i12 + 1];
                            float f3 = fArr3[i12 + 2];
                            if (Float.compare(fArr3[i12 + 3], 0.0f) != 0) {
                                z = 1;
                            } else {
                                z = i3;
                            }
                            if (Float.compare(fArr3[i12 + 4], 0.0f) != 0) {
                                z2 = 1;
                            } else {
                                z2 = i3;
                            }
                            arrayList2.add(new de5(f, f2, f3, z, z2, fArr3[i12 + 5], fArr3[i12 + 6]));
                        }
                        break;
                    case 'C':
                        i3 = i5;
                        int i13 = i7 - 6;
                        for (int i14 = i3; i14 <= i13; i14 += 6) {
                            arrayList2.add(new fe5(fArr3[i14], fArr3[i14 + 1], fArr3[i14 + 2], fArr3[i14 + 3], fArr3[i14 + 4], fArr3[i14 + 5]));
                        }
                        break;
                    case 'H':
                        i3 = i5;
                        int i15 = i7 - 1;
                        for (int i16 = i3; i16 <= i15; i16++) {
                            arrayList2.add(new ge5(fArr3[i16]));
                        }
                        break;
                    case 'L':
                        i3 = i5;
                        int i17 = i7 - 2;
                        for (int i18 = i3; i18 <= i17; i18 += 2) {
                            arrayList2.add(new he5(fArr3[i18], fArr3[i18 + 1]));
                        }
                        break;
                    case 'M':
                        i3 = i5;
                        int i19 = i7 - 2;
                        if (i19 >= 0) {
                            arrayList2.add(new ie5(fArr3[i3], fArr3[1]));
                            while (i10 <= i19) {
                                arrayList2.add(new he5(fArr3[i10], fArr3[i10 + 1]));
                                i10 += 2;
                            }
                            break;
                        }
                        break;
                    case 'Q':
                        i3 = i5;
                        int i20 = i7 - 4;
                        for (int i21 = i3; i21 <= i20; i21 += 4) {
                            arrayList2.add(new je5(fArr3[i21], fArr3[i21 + 1], fArr3[i21 + 2], fArr3[i21 + 3]));
                        }
                        break;
                    case 'S':
                        i3 = i5;
                        int i22 = i7 - 4;
                        for (int i23 = i3; i23 <= i22; i23 += 4) {
                            arrayList2.add(new ke5(fArr3[i23], fArr3[i23 + 1], fArr3[i23 + 2], fArr3[i23 + 3]));
                        }
                        break;
                    case 'T':
                        i3 = i5;
                        int i24 = i7 - 2;
                        for (int i25 = i3; i25 <= i24; i25 += 2) {
                            arrayList2.add(new le5(fArr3[i25], fArr3[i25 + 1]));
                        }
                        break;
                    case 'V':
                        i3 = i5;
                        int i26 = i7 - 1;
                        for (int i27 = i3; i27 <= i26; i27++) {
                            arrayList2.add(new ve5(fArr3[i27]));
                        }
                        break;
                    case 'Z':
                    case 'z':
                        i3 = i5;
                        arrayList2.add(ee5.c);
                        break;
                    case 'a':
                        int i28 = i7 - 7;
                        int i29 = i5;
                        while (i29 <= i28) {
                            float f4 = fArr3[i29];
                            float f5 = fArr3[i29 + 1];
                            float f6 = fArr3[i29 + 2];
                            int i30 = i5;
                            if (Float.compare(fArr3[i29 + 3], 0.0f) != 0) {
                                z3 = 1;
                            } else {
                                z3 = i30;
                            }
                            if (Float.compare(fArr3[i29 + 4], 0.0f) != 0) {
                                z4 = 1;
                            } else {
                                z4 = i30;
                            }
                            arrayList2.add(new me5(f4, f5, f6, z3, z4, fArr3[i29 + 5], fArr3[i29 + 6]));
                            i29 += 7;
                            i5 = i30;
                        }
                        break;
                    case 'c':
                        int i31 = i7 - 6;
                        for (int i32 = i5; i32 <= i31; i32 += 6) {
                            arrayList2.add(new ne5(fArr3[i32], fArr3[i32 + 1], fArr3[i32 + 2], fArr3[i32 + 3], fArr3[i32 + 4], fArr3[i32 + 5]));
                        }
                        break;
                    case 'h':
                        int i33 = i7 - 1;
                        for (int i34 = i5; i34 <= i33; i34++) {
                            arrayList2.add(new oe5(fArr3[i34]));
                        }
                        break;
                    case 'l':
                        int i35 = i7 - 2;
                        for (int i36 = i5; i36 <= i35; i36 += 2) {
                            arrayList2.add(new pe5(fArr3[i36], fArr3[i36 + 1]));
                        }
                        break;
                    case 'm':
                        int i37 = i7 - 2;
                        if (i37 >= 0) {
                            arrayList2.add(new qe5(fArr3[i5], fArr3[1]));
                            while (i10 <= i37) {
                                arrayList2.add(new pe5(fArr3[i10], fArr3[i10 + 1]));
                                i10 += 2;
                            }
                            break;
                        }
                        break;
                    case 'q':
                        int i38 = i7 - 4;
                        for (int i39 = i5; i39 <= i38; i39 += 4) {
                            arrayList2.add(new re5(fArr3[i39], fArr3[i39 + 1], fArr3[i39 + 2], fArr3[i39 + 3]));
                        }
                        break;
                    case 's':
                        int i40 = i7 - 4;
                        for (int i41 = i5; i41 <= i40; i41 += 4) {
                            arrayList2.add(new se5(fArr3[i41], fArr3[i41 + 1], fArr3[i41 + 2], fArr3[i41 + 3]));
                        }
                        break;
                    case 't':
                        int i42 = i7 - 2;
                        for (int i43 = i5; i43 <= i42; i43 += 2) {
                            arrayList2.add(new te5(fArr3[i43], fArr3[i43 + 1]));
                        }
                        break;
                    case 'v':
                        int i44 = i7 - 1;
                        for (int i45 = i5; i45 <= i44; i45++) {
                            arrayList2.add(new ue5(fArr3[i45]));
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + charAt);
                }
                i3 = i5;
                i = i2;
                i5 = i3;
            } else {
                i = i2;
            }
        }
    }
}
