package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ps0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ps0 extends m55 {
    public static final int[][] a;

    static {
        int[] iArr = {2, 1, 1, 4, 1, 2};
        int[] iArr2 = {2, 1, 2, 2, 2, 2};
        int[] iArr3 = {1, 1, 3, 2, 2, 2};
        int[] iArr4 = {1, 2, 3, 1, 2, 2};
        int[] iArr5 = {1, 2, 3, 2, 2, 1};
        int[] iArr6 = {2, 2, 3, 2, 1, 1};
        int[] iArr7 = {2, 2, 1, 1, 3, 2};
        int[] iArr8 = {2, 2, 1, 2, 3, 1};
        int[] iArr9 = {2, 1, 3, 2, 1, 2};
        int[] iArr10 = {2, 2, 3, 1, 1, 2};
        int[] iArr11 = {3, 1, 2, 1, 3, 1};
        int[] iArr12 = {3, 1, 1, 2, 2, 2};
        int[] iArr13 = {3, 2, 1, 1, 2, 2};
        int[] iArr14 = {3, 2, 1, 2, 2, 1};
        int[] iArr15 = {3, 1, 2, 2, 1, 2};
        int[] iArr16 = {3, 2, 2, 1, 1, 2};
        int[] iArr17 = {3, 2, 2, 2, 1, 1};
        int[] iArr18 = {2, 1, 2, 1, 2, 3};
        int[] iArr19 = {2, 1, 2, 3, 2, 1};
        int[] iArr20 = {2, 3, 2, 1, 2, 1};
        int[] iArr21 = {1, 1, 1, 3, 2, 3};
        int[] iArr22 = {1, 3, 1, 1, 2, 3};
        int[] iArr23 = {1, 3, 1, 3, 2, 1};
        int[] iArr24 = {1, 1, 2, 3, 1, 3};
        int[] iArr25 = {1, 3, 2, 1, 1, 3};
        int[] iArr26 = {1, 3, 2, 3, 1, 1};
        int[] iArr27 = {2, 1, 1, 3, 1, 3};
        int[] iArr28 = {2, 3, 1, 1, 1, 3};
        int[] iArr29 = {2, 3, 1, 3, 1, 1};
        int[] iArr30 = {1, 1, 2, 1, 3, 3};
        int[] iArr31 = {1, 1, 2, 3, 3, 1};
        int[] iArr32 = {1, 3, 2, 1, 3, 1};
        int[] iArr33 = {1, 1, 3, 1, 2, 3};
        int[] iArr34 = {1, 1, 3, 3, 2, 1};
        int[] iArr35 = {1, 3, 3, 1, 2, 1};
        int[] iArr36 = {3, 1, 3, 1, 2, 1};
        int[] iArr37 = {2, 1, 1, 3, 3, 1};
        int[] iArr38 = {2, 3, 1, 1, 3, 1};
        int[] iArr39 = {2, 1, 3, 1, 1, 3};
        int[] iArr40 = {2, 1, 3, 3, 1, 1};
        int[] iArr41 = {2, 1, 3, 1, 3, 1};
        int[] iArr42 = {3, 1, 1, 1, 2, 3};
        int[] iArr43 = {3, 1, 1, 3, 2, 1};
        int[] iArr44 = {3, 3, 1, 1, 2, 1};
        int[] iArr45 = {3, 1, 2, 1, 1, 3};
        int[] iArr46 = {3, 1, 2, 3, 1, 1};
        int[] iArr47 = {3, 3, 2, 1, 1, 1};
        int[] iArr48 = {3, 1, 4, 1, 1, 1};
        int[] iArr49 = {2, 2, 1, 4, 1, 1};
        int[] iArr50 = {4, 3, 1, 1, 1, 1};
        int[] iArr51 = {1, 1, 1, 2, 2, 4};
        int[] iArr52 = {1, 1, 1, 4, 2, 2};
        int[] iArr53 = {1, 2, 1, 1, 2, 4};
        int[] iArr54 = {1, 2, 1, 4, 2, 1};
        int[] iArr55 = {1, 4, 1, 1, 2, 2};
        int[] iArr56 = {1, 4, 1, 2, 2, 1};
        int[] iArr57 = {1, 1, 2, 2, 1, 4};
        int[] iArr58 = {1, 1, 2, 4, 1, 2};
        int[] iArr59 = {1, 2, 2, 1, 1, 4};
        int[] iArr60 = {1, 2, 2, 4, 1, 1};
        int[] iArr61 = {1, 4, 2, 1, 1, 2};
        int[] iArr62 = {1, 4, 2, 2, 1, 1};
        int[] iArr63 = {2, 4, 1, 2, 1, 1};
        int[] iArr64 = {2, 2, 1, 1, 1, 4};
        int[] iArr65 = {4, 1, 3, 1, 1, 1};
        int[] iArr66 = {2, 4, 1, 1, 1, 2};
        int[] iArr67 = {1, 3, 4, 1, 1, 1};
        int[] iArr68 = {1, 1, 1, 2, 4, 2};
        int[] iArr69 = {1, 2, 1, 1, 4, 2};
        int[] iArr70 = {1, 2, 1, 2, 4, 1};
        int[] iArr71 = {1, 1, 4, 2, 1, 2};
        int[] iArr72 = {1, 2, 4, 1, 1, 2};
        int[] iArr73 = {1, 2, 4, 2, 1, 1};
        int[] iArr74 = {4, 1, 1, 2, 1, 2};
        int[] iArr75 = {4, 2, 1, 1, 1, 2};
        int[] iArr76 = {4, 2, 1, 2, 1, 1};
        int[] iArr77 = {2, 1, 2, 1, 4, 1};
        int[] iArr78 = {2, 1, 4, 1, 2, 1};
        int[] iArr79 = {4, 1, 2, 1, 2, 1};
        int[] iArr80 = {1, 1, 1, 1, 4, 3};
        int[] iArr81 = {1, 1, 1, 3, 4, 1};
        int[] iArr82 = {1, 3, 1, 1, 4, 1};
        int[] iArr83 = {1, 1, 4, 1, 1, 3};
        int[] iArr84 = {1, 1, 4, 3, 1, 1};
        int[] iArr85 = {4, 1, 1, 1, 1, 3};
        int[] iArr86 = {4, 1, 1, 3, 1, 1};
        int[] iArr87 = {1, 1, 3, 1, 4, 1};
        int[] iArr88 = {1, 1, 4, 1, 3, 1};
        int[] iArr89 = {3, 1, 1, 1, 4, 1};
        int[] iArr90 = {4, 1, 1, 1, 3, 1};
        int[] iArr91 = iArr;
        a = new int[][]{iArr2, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, iArr13, iArr14, iArr15, iArr16, iArr17, iArr18, iArr19, iArr20, iArr21, iArr22, iArr23, iArr24, iArr25, iArr26, iArr27, iArr28, iArr29, iArr30, iArr31, iArr32, iArr33, iArr34, iArr35, iArr36, iArr37, iArr38, iArr39, iArr40, iArr41, iArr42, iArr43, iArr44, iArr45, iArr46, iArr47, iArr48, iArr49, iArr50, iArr51, iArr52, iArr53, iArr54, iArr55, iArr56, iArr57, iArr58, iArr59, iArr60, iArr61, iArr62, iArr63, iArr64, iArr65, iArr66, iArr67, iArr68, iArr69, iArr70, iArr71, iArr72, iArr73, iArr74, iArr75, iArr76, iArr77, iArr78, iArr79, iArr80, iArr81, iArr82, iArr83, iArr84, iArr85, iArr86, iArr87, iArr88, iArr89, iArr90, iArr91, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a9, code lost:
        r3 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ab, code lost:
        r4 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b5, code lost:
        if (r14 != 0) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f6, code lost:
        if (r20 == 0) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f8, code lost:
        if (r4 != 'e') goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fa, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01fc, code lost:
        r4 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01fd, code lost:
        r3 = r21;
        r21 = r10;
        r10 = r3;
        r20 = r6;
        r3 = r9;
        r9 = r24;
        r11 = 0.7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0115, code lost:
        r6 = r18;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0118, code lost:
        r3 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0150, code lost:
        r15 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0155, code lost:
        if (r14 != 0) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0157, code lost:
        r6 = r18;
        r14 = r6;
        r15 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015c, code lost:
        r14 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015e, code lost:
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0163, code lost:
        r3 = 'd';
        r4 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0169, code lost:
        r6 = r18;
        r3 = 'd';
        r4 = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0174, code lost:
        r19 = r26;
     */
    public final n66 b(int i, i90 i90, Map map) {
        boolean z;
        int i2;
        int i3;
        float f;
        int[][] iArr;
        char c;
        int i4;
        char c2;
        int i5;
        i90 i902 = i90;
        Map map2 = map;
        int i6 = i902.x;
        int i7 = 1;
        int i8 = 0;
        if (map2 == null || !map2.containsKey(fk1.D)) {
            z = false;
        } else {
            z = true;
        }
        int b = i902.b(0);
        int i9 = 6;
        int[] iArr2 = new int[6];
        boolean z2 = false;
        int i10 = 0;
        int i11 = b;
        while (b < i6) {
            if (i902.a(b) != z2) {
                iArr2[i10] = iArr2[i10] + i7;
                int i12 = i;
                i2 = i7;
                i3 = i8;
            } else {
                if (i10 == 5) {
                    i2 = i7;
                    int i13 = 103;
                    int i14 = -1;
                    float f2 = 0.25f;
                    while (true) {
                        f = 0.7f;
                        iArr = a;
                        if (i13 > 105) {
                            break;
                        }
                        float d = m55.d(iArr2, iArr[i13], 0.7f);
                        if (d < f2) {
                            f2 = d;
                            i14 = i13;
                        }
                        i13++;
                    }
                    if (i14 < 0 || !i902.d(Math.max(i8, i11 - ((b - i11) / 2)), i11)) {
                        int i15 = i;
                        int i16 = i8;
                        i11 += iArr2[i16] + iArr2[i2];
                        int i17 = i10 - 1;
                        i3 = i16;
                        System.arraycopy(iArr2, 2, iArr2, i3, i17);
                        iArr2[i17] = i3;
                        iArr2[i10] = i3;
                        i10--;
                    } else {
                        int[] iArr3 = {i11, b, i14};
                        int i18 = iArr3[2];
                        ArrayList arrayList = new ArrayList(20);
                        arrayList.add(Byte.valueOf((byte) i18));
                        switch (i18) {
                            case 103:
                                c = 'e';
                                break;
                            case 104:
                                c = 'd';
                                break;
                            case 105:
                                c = 'c';
                                break;
                            default:
                                throw FormatException.a();
                        }
                        StringBuilder sb = new StringBuilder(20);
                        int i19 = iArr3[i8];
                        int[] iArr4 = new int[i9];
                        int i20 = i2;
                        int i21 = i8;
                        int i22 = i21;
                        int i23 = i22;
                        int i24 = i23;
                        int i25 = i24;
                        int i26 = i25;
                        int i27 = i26;
                        char c3 = c;
                        int i28 = i19;
                        int i29 = iArr3[i2];
                        int i30 = i27;
                        while (i24 == 0) {
                            m55.e(i29, i902, iArr4);
                            int i31 = -1;
                            float f3 = 0.25f;
                            for (int i32 = i30; i32 < 107; i32++) {
                                float d2 = m55.d(iArr4, iArr[i32], f);
                                if (d2 < f3) {
                                    i31 = i32;
                                    f3 = d2;
                                }
                            }
                            if (i31 >= 0) {
                                arrayList.add(Byte.valueOf((byte) i31));
                                if (i31 != 106) {
                                    i20 = i2;
                                }
                                if (i31 != 106) {
                                    i27++;
                                    i18 = (i27 * i31) + i18;
                                }
                                int i33 = i29;
                                for (int i34 = i30; i34 < 6; i34++) {
                                    i33 += iArr4[i34];
                                }
                                switch (i31) {
                                    case 103:
                                    case 104:
                                    case 105:
                                        throw FormatException.a();
                                    default:
                                        switch (c3) {
                                            case 'c':
                                                c2 = 'd';
                                                if (i31 >= 100) {
                                                    if (i31 != 106) {
                                                        i20 = i30;
                                                    }
                                                    if (i31 == 106) {
                                                        i24 = i2;
                                                        break;
                                                    } else {
                                                        switch (i31) {
                                                            case 100:
                                                                c3 = 'd';
                                                                break;
                                                            case 101:
                                                                i5 = i30;
                                                                break;
                                                            case 102:
                                                                if (z) {
                                                                    if (sb.length() != 0) {
                                                                        sb.append(29);
                                                                        break;
                                                                    } else {
                                                                        sb.append("]C1");
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                } else {
                                                    if (i31 < 10) {
                                                        sb.append('0');
                                                    }
                                                    sb.append(i31);
                                                    break;
                                                }
                                            case 'd':
                                                if (i31 < 96) {
                                                    if (i22 != i23) {
                                                        sb.append((char) (i31 + 160));
                                                        break;
                                                    } else {
                                                        sb.append((char) (i31 + 32));
                                                        break;
                                                    }
                                                } else {
                                                    if (i31 != 106) {
                                                        i20 = i30;
                                                    }
                                                    if (i31 != 106) {
                                                        switch (i31) {
                                                            case 98:
                                                                i5 = i2;
                                                                break;
                                                            case 99:
                                                                break;
                                                            case 100:
                                                                if (i23 != 0 || i22 == 0) {
                                                                    if (i23 != 0) {
                                                                    }
                                                                }
                                                                break;
                                                            case 101:
                                                                i5 = i30;
                                                                break;
                                                            case 102:
                                                                if (z) {
                                                                    if (sb.length() != 0) {
                                                                        sb.append(29);
                                                                        break;
                                                                    } else {
                                                                        sb.append("]C1");
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 'e':
                                                if (i31 >= 64) {
                                                    if (i31 < 96) {
                                                        if (i22 != i23) {
                                                            sb.append((char) (i31 + 64));
                                                            break;
                                                        } else {
                                                            sb.append((char) (i31 - 64));
                                                            break;
                                                        }
                                                    } else {
                                                        if (i31 != 106) {
                                                            i20 = i30;
                                                        }
                                                        if (i31 != 106) {
                                                            switch (i31) {
                                                                case 98:
                                                                    i4 = i2;
                                                                    break;
                                                                case 99:
                                                                    break;
                                                                case 100:
                                                                    i4 = i30;
                                                                    break;
                                                                case 101:
                                                                    if (i23 != 0 || i22 == 0) {
                                                                        if (i23 != 0) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case 102:
                                                                    if (z) {
                                                                        if (sb.length() != 0) {
                                                                            sb.append(29);
                                                                            break;
                                                                        } else {
                                                                            sb.append("]C1");
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                } else if (i22 != i23) {
                                                    sb.append((char) (i31 + 160));
                                                    break;
                                                } else {
                                                    sb.append((char) (i31 + 32));
                                                    break;
                                                }
                                                break;
                                            default:
                                                c2 = 'd';
                                                break;
                                        }
                                }
                            } else {
                                throw NotFoundException.y;
                            }
                        }
                        int i35 = i29 - i28;
                        int c4 = i902.c(i29);
                        if (!i902.d(c4, Math.min(i6, ((c4 - i28) / 2) + c4))) {
                            throw NotFoundException.y;
                        } else if ((i18 - (i27 * i21)) % 103 == i21) {
                            int length = sb.length();
                            if (length != 0) {
                                if (length > 0 && i20 != 0) {
                                    if (c3 == 'c') {
                                        sb.delete(length - 2, length);
                                    } else {
                                        sb.delete(length - 1, length);
                                    }
                                }
                                float f4 = ((float) (iArr3[i2] + iArr3[i30])) / 2.0f;
                                float f5 = (((float) i35) / 2.0f) + ((float) i28);
                                int size = arrayList.size();
                                byte[] bArr = new byte[size];
                                for (int i36 = i30; i36 < size; i36++) {
                                    bArr[i36] = ((Byte) arrayList.get(i36)).byteValue();
                                }
                                float f6 = (float) i;
                                return new n66(sb.toString(), bArr, new r66[]{new r66(f4, f6), new r66(f5, f6)}, d50.A);
                            }
                            throw NotFoundException.y;
                        } else {
                            throw ChecksumException.a();
                        }
                    }
                } else {
                    int i37 = i;
                    i2 = i7;
                    i3 = i8;
                    i10++;
                }
                iArr2[i10] = i2;
                z2 = !z2;
            }
            b++;
            i9 = 6;
            i7 = i2;
            i8 = i3;
        }
        throw NotFoundException.y;
    }
}
