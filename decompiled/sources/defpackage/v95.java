package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class v95 {
    public static final ji8 a = new ji8(22);

    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011f  */
    public static fb0 a(wt1 wt1) {
        fb0 fb0;
        int[] iArr;
        r66 r66;
        r66 r662;
        r66 r663;
        r66 r664;
        r66 r665;
        r66 r666;
        int i;
        r66 r667;
        r66 r668;
        int i2;
        int i3;
        wt1 wt12 = wt1;
        if (wt12 == null) {
            return null;
        }
        boolean z = wt12.z;
        fb0 fb02 = (fb0) wt12.x;
        r66 r669 = fb02.e;
        r66 r6610 = fb02.c;
        r66 r6611 = fb02.d;
        r66 r6612 = fb02.b;
        e50[] e50Arr = (e50[]) wt12.y;
        e50 c0 = wt12.c0();
        if (c0 == null) {
            iArr = null;
            fb0 = null;
        } else {
            int i4 = c0.f;
            if (z) {
                r667 = r6612;
            } else {
                r667 = r6611;
            }
            if (z) {
                r668 = r6610;
            } else {
                r668 = r669;
            }
            int J = wt12.J((int) r667.b);
            int J2 = wt12.J((int) r668.b);
            int i5 = 1;
            int i6 = -1;
            int i7 = 0;
            fb0 = null;
            while (J < J2) {
                e50 e50 = e50Arr[J];
                if (e50 != null) {
                    e50.c();
                    int i8 = e50.f;
                    int i9 = i8 - i6;
                    if (i9 == 0) {
                        i7++;
                    } else {
                        i3 = J2;
                        if (i9 == 1) {
                            i5 = Math.max(i5, i7);
                            i6 = e50.f;
                        } else if (i8 >= i4) {
                            e50Arr[J] = null;
                            J++;
                            J2 = i3;
                        } else {
                            i6 = i8;
                        }
                        i7 = 1;
                        J++;
                        J2 = i3;
                    }
                }
                i3 = J2;
                J++;
                J2 = i3;
            }
            iArr = new int[i4];
            for (e50 e502 : e50Arr) {
                if (e502 != null && (i2 = e502.f) < i4) {
                    iArr[i2] = iArr[i2] + 1;
                }
            }
        }
        if (iArr == null) {
            return fb0;
        }
        int i10 = -1;
        for (int max : iArr) {
            i10 = Math.max(i10, max);
        }
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i10 - i12;
            if (i12 > 0) {
                break;
            }
        }
        int i13 = 0;
        while (i11 > 0 && e50Arr[i13] == null) {
            i11--;
            i13++;
        }
        int i14 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i15 = iArr[length];
            i14 += i10 - i15;
            if (i15 > 0) {
                break;
            }
        }
        int length2 = e50Arr.length - 1;
        while (i14 > 0 && e50Arr[length2] == null) {
            i14--;
            length2--;
        }
        if (i11 > 0) {
            if (z) {
                r666 = r6612;
            } else {
                r666 = r6611;
            }
            int i16 = ((int) r666.b) - i11;
            if (i16 < 0) {
                i = 0;
            } else {
                i = i16;
            }
            r66 r6613 = new r66(r666.a, (float) i);
            if (z) {
                r662 = r6613;
                r66 = r6611;
                if (i14 <= 0) {
                    if (z) {
                        r665 = r6610;
                    } else {
                        r665 = r669;
                    }
                    int i17 = ((int) r665.b) + i14;
                    int i18 = fb02.a.x;
                    if (i17 >= i18) {
                        i17 = i18 - 1;
                    }
                    r66 r6614 = new r66(r665.a, (float) i17);
                    if (z) {
                        r663 = r669;
                        r664 = r6614;
                    } else {
                        r664 = r6610;
                        r663 = r6614;
                    }
                } else {
                    r663 = r669;
                    r664 = r6610;
                }
                return new fb0(fb02.a, r662, r664, r66, r663);
            }
            r66 = r6613;
        } else {
            r66 = r6611;
        }
        r662 = r6612;
        if (i14 <= 0) {
        }
        return new fb0(fb02.a, r662, r664, r66, r663);
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [u95, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v8, types: [byte[], java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02fc, code lost:
        r28 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x041a, code lost:
        r8 = new java.io.ByteArrayOutputStream();
        r13 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0428, code lost:
        if (r4 == 901) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x042c, code lost:
        if (r4 == 924) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x042e, code lost:
        r28 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0432, code lost:
        r10 = r7;
        r21 = 0;
        r4 = false;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x043b, code lost:
        if (r10 >= r0[0]) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x043d, code lost:
        if (r4 != false) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x043f, code lost:
        r6 = r10 + 1;
        r11 = r0[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0443, code lost:
        if (r11 >= 900) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0445, code lost:
        r7 = r7 + 1;
        r21 = (r21 * r13) + ((long) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x044c, code lost:
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x044e, code lost:
        if (r11 == 928) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0450, code lost:
        switch(r11) {
            case 900: goto L_0x0457;
            case 901: goto L_0x0457;
            case 902: goto L_0x0457;
            default: goto L_0x0453;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0453, code lost:
        switch(r11) {
            case 922: goto L_0x0457;
            case 923: goto L_0x0457;
            case 924: goto L_0x0457;
            default: goto L_0x0456;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0457, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x045a, code lost:
        if ((r7 % 5) != 0) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x045c, code lost:
        if (r7 <= 0) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x045e, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x045f, code lost:
        if (r6 >= 6) goto L_0x0473;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0461, code lost:
        r8.write((byte) ((int) (r21 >> ((5 - r6) * 8))));
        r6 = r6 + 1;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0473, code lost:
        r23 = r13;
        r21 = 0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0479, code lost:
        r23 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x047b, code lost:
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x047f, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0481, code lost:
        r4 = new int[6];
        r11 = r0[r7];
        r13 = 0;
        r28 = 0;
        r18 = false;
        r7 = r7 + 1;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0492, code lost:
        r10 = r0[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0494, code lost:
        if (r7 >= r10) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0496, code lost:
        if (r18 != false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0498, code lost:
        r4[r6] = r11;
        r22 = r6 + 1;
        r13 = (r13 * 900) + ((long) r11);
        r6 = r7 + 1;
        r11 = r0[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04a6, code lost:
        if (r11 == 928) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04a8, code lost:
        switch(r11) {
            case 900: goto L_0x04d4;
            case 901: goto L_0x04d4;
            case 902: goto L_0x04d4;
            default: goto L_0x04ab;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ab, code lost:
        switch(r11) {
            case 922: goto L_0x04d4;
            case 923: goto L_0x04d4;
            case 924: goto L_0x04d4;
            default: goto L_0x04ae;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04b0, code lost:
        if ((r22 % 5) != 0) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04b2, code lost:
        if (r22 <= 0) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04b4, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04b6, code lost:
        if (r7 >= 6) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04b8, code lost:
        r8.write((byte) ((int) (r13 >> ((5 - r7) * 8))));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04c6, code lost:
        r7 = r6;
        r13 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04ce, code lost:
        r7 = r6;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04d4, code lost:
        r6 = r22;
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04db, code lost:
        if (r7 != r10) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04df, code lost:
        if (r11 >= 900) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04e1, code lost:
        r4[r6] = r11;
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04e6, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04e8, code lost:
        if (r9 >= r6) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04ea, code lost:
        r8.write((byte) r4[r9]);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04f3, code lost:
        r2.append(new java.lang.String(r8.toByteArray(), r3));
        r4 = r7;
     */
    public static fv0 b(int i, int[] iArr, int[] iArr2) {
        int[] iArr3;
        Object obj;
        char c;
        int i2;
        int i3;
        int i4;
        vl4 vl4;
        int i5;
        fv0 fv0;
        hv2 hv2;
        hv2 hv22;
        int i6;
        int i7;
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        if (iArr4.length != 0) {
            int i8 = 1;
            int i9 = 1 << (i + 1);
            if (iArr5.length > (i9 / 2) + 3 || i9 < 0 || i9 > 512) {
                throw ChecksumException.a();
            }
            vl4 vl42 = (vl4) a.x;
            if (iArr4.length != 0) {
                int length = iArr4.length;
                int i10 = 0;
                if (length <= 1 || iArr4[0] != 0) {
                    iArr3 = iArr4;
                } else {
                    int i11 = 1;
                    while (i11 < length && iArr4[i11] == 0) {
                        i11++;
                    }
                    if (i11 == length) {
                        iArr3 = new int[]{0};
                    } else {
                        int i12 = length - i11;
                        int[] iArr6 = new int[i12];
                        System.arraycopy(iArr4, i11, iArr6, 0, i12);
                        iArr3 = iArr6;
                    }
                }
                int[] iArr7 = new int[i9];
                boolean z = false;
                for (int i13 = i9; i13 > 0; i13--) {
                    int i14 = vl42.a[i13];
                    if (i14 == 0) {
                        i6 = iArr3[iArr3.length - 1];
                    } else {
                        if (i14 == 1) {
                            i7 = 0;
                            for (int a2 : iArr3) {
                                i7 = vl42.a(i7, a2);
                            }
                        } else {
                            int i15 = iArr3[0];
                            int length2 = iArr3.length;
                            for (int i16 = 1; i16 < length2; i16++) {
                                i15 = vl42.a(vl42.c(i14, i7), iArr3[i16]);
                            }
                        }
                        i6 = i7;
                    }
                    iArr7[i9 - i13] = i6;
                    if (i6 != 0) {
                        z = true;
                    }
                }
                if (!z) {
                    obj = null;
                } else {
                    hv2 hv23 = vl42.d;
                    hv2 hv24 = vl42.c;
                    for (int length3 : iArr5) {
                        hv23 = hv23.V0(new hv2(vl42, new int[]{(929 - vl42.a[(iArr4.length - 1) - length3]) % 929, 1}));
                    }
                    hv2 hv25 = new hv2(vl42, iArr7);
                    if (i9 >= 0) {
                        int[] iArr8 = new int[(i9 + 1)];
                        iArr8[0] = 1;
                        hv2 hv26 = new hv2(vl42, iArr8);
                        if (hv26.M0() >= hv25.M0()) {
                            hv2 hv27 = hv26;
                            hv26 = hv25;
                            hv25 = hv27;
                        }
                        hv2 hv28 = hv25;
                        hv2 hv29 = hv26;
                        hv2 hv210 = vl42.d;
                        hv2 hv211 = hv24;
                        while (hv29.M0() >= i9 / 2) {
                            if (!hv29.T0()) {
                                int b = vl42.b(hv29.J0(hv29.M0()));
                                hv2 hv212 = hv24;
                                while (hv28.M0() >= hv29.M0() && !hv28.T0()) {
                                    int M0 = hv28.M0() - hv29.M0();
                                    int c2 = vl42.c(hv28.J0(hv28.M0()), b);
                                    if (M0 >= 0) {
                                        if (c2 == 0) {
                                            i5 = i8;
                                            hv2 = hv24;
                                            fv0 = null;
                                        } else {
                                            fv0 = null;
                                            int[] iArr9 = new int[(M0 + 1)];
                                            iArr9[i10] = c2;
                                            i5 = i8;
                                            hv2 = new hv2(vl42, iArr9);
                                        }
                                        hv212 = hv212.f0(hv2);
                                        int[] iArr10 = (int[]) hv29.x;
                                        vl4 vl43 = (vl4) hv29.y;
                                        if (M0 >= 0) {
                                            if (c2 == 0) {
                                                hv22 = vl43.c;
                                            } else {
                                                int length4 = iArr10.length;
                                                int[] iArr11 = new int[(M0 + length4)];
                                                int i17 = 0;
                                                while (i17 < length4) {
                                                    int[] iArr12 = iArr10;
                                                    iArr11[i17] = vl43.c(iArr12[i17], c2);
                                                    i17++;
                                                    iArr10 = iArr12;
                                                }
                                                hv22 = new hv2(vl43, iArr11);
                                            }
                                            hv28 = hv28.a1(hv22);
                                            i8 = i5;
                                            i10 = 0;
                                        } else {
                                            ku4.v();
                                            return fv0;
                                        }
                                    } else {
                                        ku4.v();
                                        return null;
                                    }
                                }
                                int i18 = i8;
                                hv2 a1 = hv212.V0(hv210).a1(hv211);
                                int[] iArr13 = (int[]) a1.x;
                                int length5 = iArr13.length;
                                int[] iArr14 = new int[length5];
                                int i19 = 0;
                                while (true) {
                                    vl4 = (vl4) a1.y;
                                    if (i19 >= length5) {
                                        break;
                                    }
                                    int i20 = iArr13[i19];
                                    vl4.getClass();
                                    iArr14[i19] = (929 - i20) % 929;
                                    i19++;
                                }
                                hv2 hv213 = new hv2(vl4, iArr14);
                                hv2 hv214 = hv28;
                                hv28 = hv29;
                                hv29 = hv214;
                                hv211 = hv210;
                                i10 = 0;
                                hv210 = hv213;
                                i8 = i18;
                            } else {
                                throw ChecksumException.a();
                            }
                        }
                        int i21 = i8;
                        int i22 = i10;
                        obj = null;
                        int J0 = hv210.J0(i22);
                        if (J0 != 0) {
                            int b2 = vl42.b(J0);
                            hv2[] hv2Arr = {hv210.W0(b2), hv29.W0(b2)};
                            hv2 hv215 = hv2Arr[i22];
                            hv2 hv216 = hv2Arr[i21];
                            int M02 = hv215.M0();
                            int[] iArr15 = new int[M02];
                            int i23 = 0;
                            for (int i24 = i21; i24 < 929 && i23 < M02; i24++) {
                                if (hv215.G0(i24) == 0) {
                                    iArr15[i23] = vl42.b(i24);
                                    i23++;
                                }
                            }
                            if (i23 == M02) {
                                int M03 = hv215.M0();
                                int[] iArr16 = new int[M03];
                                for (int i25 = i21; i25 <= M03; i25++) {
                                    iArr16[M03 - i25] = vl42.c(i25, hv215.J0(i25));
                                }
                                if (M03 != 0) {
                                    if (M03 > i21 && iArr16[0] == 0) {
                                        int i26 = 1;
                                        while (i26 < M03 && iArr16[i26] == 0) {
                                            i26++;
                                        }
                                        if (i26 == M03) {
                                            iArr16 = new int[]{0};
                                        } else {
                                            int i27 = M03 - i26;
                                            int[] iArr17 = new int[i27];
                                            System.arraycopy(iArr16, i26, iArr17, 0, i27);
                                            iArr16 = iArr17;
                                        }
                                    }
                                    int[] iArr18 = new int[M02];
                                    for (int i28 = 0; i28 < M02; i28++) {
                                        int b3 = vl42.b(iArr15[i28]);
                                        int G0 = (929 - hv216.G0(b3)) % 929;
                                        if (b3 == 0) {
                                            i4 = iArr16[iArr16.length - 1];
                                        } else if (b3 == 1) {
                                            int i29 = 0;
                                            for (int a3 : iArr16) {
                                                i29 = vl42.a(i29, a3);
                                            }
                                            i4 = i29;
                                        } else {
                                            int i30 = iArr16[0];
                                            int length6 = iArr16.length;
                                            for (int i31 = 1; i31 < length6; i31++) {
                                                i30 = vl42.a(vl42.c(b3, i30), iArr16[i31]);
                                            }
                                            i4 = i30;
                                        }
                                        iArr18[i28] = vl42.c(G0, vl42.b(i4));
                                    }
                                    int i32 = 0;
                                    while (i32 < M02) {
                                        int length7 = iArr4.length - 1;
                                        int i33 = iArr15[i32];
                                        if (i33 != 0) {
                                            int i34 = length7 - vl42.b[i33];
                                            if (i34 >= 0) {
                                                iArr4[i34] = ((iArr4[i34] + 929) - iArr18[i32]) % 929;
                                                i32++;
                                            } else {
                                                throw ChecksumException.a();
                                            }
                                        } else {
                                            ku4.v();
                                            return null;
                                        }
                                    }
                                } else {
                                    ku4.v();
                                    return null;
                                }
                            } else {
                                throw ChecksumException.a();
                            }
                        } else {
                            throw ChecksumException.a();
                        }
                    } else {
                        ku4.v();
                        return null;
                    }
                }
                if (iArr4.length >= 4) {
                    int i35 = iArr4[0];
                    if (i35 <= iArr4.length) {
                        if (i35 == 0) {
                            if (i9 < iArr4.length) {
                                iArr4[0] = iArr4.length - i9;
                            } else {
                                throw FormatException.a();
                            }
                        }
                        String valueOf = String.valueOf(i);
                        char[] cArr = ik1.a;
                        StringBuilder sb = new StringBuilder(iArr4.length << 1);
                        Charset charset = StandardCharsets.ISO_8859_1;
                        int i36 = iArr4[1];
                        ? obj2 = new Object();
                        int i37 = 2;
                        int i38 = 2;
                        char c3 = 0;
                        while (true) {
                            int i39 = iArr4[c3];
                            if (i38 < i39) {
                                if (i36 != 913) {
                                    switch (i36) {
                                        case 900:
                                            c = 0;
                                            i2 = ik1.c(iArr4, i38, sb);
                                            break;
                                        case 901:
                                            break;
                                        case 902:
                                            i2 = ik1.b(iArr4, i38, sb);
                                            break;
                                        default:
                                            switch (i36) {
                                                case 922:
                                                case 923:
                                                    throw FormatException.a();
                                                case 924:
                                                    break;
                                                case 925:
                                                    i2 = i38 + 1;
                                                    break;
                                                case 926:
                                                    i2 = i38 + 2;
                                                    break;
                                                case 927:
                                                    i2 = i38 + 1;
                                                    int i40 = iArr4[i38];
                                                    HashMap hashMap = jo0.y;
                                                    if (i40 >= 0 && i40 < 900) {
                                                        charset = Charset.forName(((jo0) jo0.y.get(Integer.valueOf(i40))).name());
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                    break;
                                                case 928:
                                                    if (i38 + 2 <= i39) {
                                                        int[] iArr19 = new int[i37];
                                                        int i41 = 0;
                                                        while (i41 < i37) {
                                                            iArr19[i41] = iArr4[i38];
                                                            i41++;
                                                            i38++;
                                                        }
                                                        Integer.parseInt(ik1.a(iArr19, i37));
                                                        i2 = ik1.c(iArr4, i38, new StringBuilder());
                                                        if (iArr4[i2] == 923) {
                                                            i3 = i2 + 1;
                                                        } else {
                                                            i3 = -1;
                                                        }
                                                        while (i2 < iArr4[0]) {
                                                            int i42 = iArr4[i2];
                                                            if (i42 == 922) {
                                                                i2++;
                                                                obj2.a = true;
                                                            } else if (i42 == 923) {
                                                                switch (iArr4[i2 + 1]) {
                                                                    case b85.b:
                                                                        i2 = ik1.c(iArr4, i2 + 2, new StringBuilder());
                                                                        break;
                                                                    case 1:
                                                                        StringBuilder sb2 = new StringBuilder();
                                                                        i2 = ik1.b(iArr4, i2 + 2, sb2);
                                                                        Integer.parseInt(sb2.toString());
                                                                        break;
                                                                    case 2:
                                                                        StringBuilder sb3 = new StringBuilder();
                                                                        i2 = ik1.b(iArr4, i2 + 2, sb3);
                                                                        Long.parseLong(sb3.toString());
                                                                        break;
                                                                    case 3:
                                                                        i2 = ik1.c(iArr4, i2 + 2, new StringBuilder());
                                                                        break;
                                                                    case 4:
                                                                        i2 = ik1.c(iArr4, i2 + 2, new StringBuilder());
                                                                        break;
                                                                    case 5:
                                                                        StringBuilder sb4 = new StringBuilder();
                                                                        i2 = ik1.b(iArr4, i2 + 2, sb4);
                                                                        Long.parseLong(sb4.toString());
                                                                        break;
                                                                    case 6:
                                                                        StringBuilder sb5 = new StringBuilder();
                                                                        i2 = ik1.b(iArr4, i2 + 2, sb5);
                                                                        Integer.parseInt(sb5.toString());
                                                                        break;
                                                                    default:
                                                                        throw FormatException.a();
                                                                }
                                                            } else {
                                                                throw FormatException.a();
                                                            }
                                                        }
                                                        if (i3 != -1) {
                                                            int i43 = i2 - i3;
                                                            if (obj2.a) {
                                                                i43--;
                                                            }
                                                            Arrays.copyOfRange(iArr4, i3, i43 + i3);
                                                            break;
                                                        }
                                                    } else {
                                                        throw FormatException.a();
                                                    }
                                                    break;
                                                default:
                                                    i2 = ik1.c(iArr4, i38 - 1, sb);
                                                    break;
                                            }
                                    }
                                } else {
                                    c = 0;
                                    i2 = i38 + 1;
                                    sb.append((char) iArr4[i38]);
                                }
                                if (i2 < iArr4.length) {
                                    i38 = i2 + 1;
                                    i36 = iArr4[i2];
                                    c3 = c;
                                    i37 = 2;
                                } else {
                                    throw FormatException.a();
                                }
                            } else if (sb.length() != 0) {
                                ? r3 = obj;
                                fv0 fv02 = new fv0(r3, sb.toString(), r3, valueOf);
                                fv02.g = obj2;
                                return fv02;
                            } else {
                                throw FormatException.a();
                            }
                        }
                        throw FormatException.a();
                    }
                    throw FormatException.a();
                }
                throw FormatException.a();
            }
            ku4.v();
            return null;
        }
        throw FormatException.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x004f A[EDGE_INSN: B:116:0x004f->B:24:0x004f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    public static e50 c(k90 k90, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        char c;
        int i8;
        int i9;
        int i10;
        int i11;
        e50 e50;
        int i12;
        e50 e502;
        int i13;
        k90 k902 = k90;
        int i14 = i;
        int i15 = i2;
        int i16 = i4;
        int[] iArr = gl0.s;
        int[] iArr2 = gl0.r;
        if (z) {
            i7 = -1;
        } else {
            i7 = 1;
        }
        boolean z2 = z;
        int i17 = i3;
        int i18 = 0;
        loop0:
        while (true) {
            c = 2;
            if (i18 >= 2) {
                break;
            }
            while (true) {
                if (!z2) {
                    if (i17 >= i15) {
                        continue;
                        break;
                    }
                } else if (i17 < i14) {
                    continue;
                    break;
                }
                if (z2 != k902.b(i17, i16)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i17) > 2) {
                    i17 = i3;
                    break loop0;
                } else {
                    i17 += i7;
                }
            }
            i7 = -i7;
            z2 = !z2;
            i18++;
        }
        int[] iArr3 = new int[8];
        if (z) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        boolean z3 = z;
        int i19 = i17;
        int i20 = 0;
        while (true) {
            if (z) {
                if (i19 >= i15) {
                    break;
                }
                if (i20 < 8) {
                    break;
                }
                char c2 = c;
                if (k902.b(i19, i16) == z3) {
                    iArr3[i20] = iArr3[i20] + 1;
                    i19 += i8;
                } else {
                    i20++;
                    z3 = !z3;
                }
                c = c2;
            } else {
                if (i19 < i14) {
                    break;
                }
                if (i20 < 8) {
                }
            }
        }
        char c3 = c;
        if (i20 != 8) {
            if (z) {
                i14 = i15;
            }
            if (!(i19 == i14 && i20 == 7)) {
                iArr3 = null;
            }
        }
        if (iArr3 != null) {
            int z0 = bb0.z0(iArr3);
            if (z) {
                i9 = i17 + z0;
            } else {
                for (int i21 = 0; i21 < iArr3.length / 2; i21++) {
                    int i22 = iArr3[i21];
                    iArr3[i21] = iArr3[(iArr3.length - 1) - i21];
                    iArr3[(iArr3.length - 1) - i21] = i22;
                }
                int i23 = i17;
                i17 -= z0;
                i9 = i23;
            }
            if (i5 - 2 <= z0 && z0 <= i6 + 2) {
                float[][] fArr = s95.a;
                float z02 = (float) bb0.z0(iArr3);
                int[] iArr4 = new int[8];
                int i24 = 0;
                int i25 = 0;
                for (int i26 = 0; i26 < 17; i26++) {
                    float f = ((((float) i26) * z02) / 17.0f) + (z02 / 34.0f);
                    int i27 = iArr3[i25] + i24;
                    if (((float) i27) <= f) {
                        i25++;
                        i24 = i27;
                    }
                    iArr4[i25] = iArr4[i25] + 1;
                }
                long j = 0;
                for (int i28 = 0; i28 < 8; i28++) {
                    for (int i29 = 0; i29 < iArr4[i28]; i29++) {
                        long j2 = j << 1;
                        if (i28 % 2 == 0) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        j = j2 | ((long) i13);
                    }
                }
                int i30 = (int) j;
                int binarySearch = Arrays.binarySearch(iArr2, i30 & 262143);
                if (binarySearch < 0) {
                    i10 = -1;
                } else {
                    i10 = (iArr[binarySearch] - 1) % 929;
                }
                if (i10 == -1) {
                    i30 = -1;
                }
                if (i30 == -1) {
                    int z03 = bb0.z0(iArr3);
                    float[] fArr2 = new float[8];
                    if (z03 > 1) {
                        for (int i31 = 0; i31 < 8; i31++) {
                            fArr2[i31] = ((float) iArr3[i31]) / ((float) z03);
                        }
                    }
                    float f2 = Float.MAX_VALUE;
                    i30 = -1;
                    int i32 = 0;
                    while (true) {
                        float[][] fArr3 = s95.a;
                        if (i32 >= fArr3.length) {
                            break;
                        }
                        float[] fArr4 = fArr3[i32];
                        float f3 = 0.0f;
                        for (int i33 = 0; i33 < 8; i33++) {
                            float f4 = fArr4[i33] - fArr2[i33];
                            f3 += f4 * f4;
                            if (f3 >= f2) {
                                break;
                            }
                        }
                        if (f3 < f2) {
                            i30 = iArr2[i32];
                            f2 = f3;
                        }
                        i32++;
                    }
                }
                int binarySearch2 = Arrays.binarySearch(iArr2, 262143 & i30);
                if (binarySearch2 < 0) {
                    i11 = -1;
                } else {
                    i11 = (iArr[binarySearch2] - 1) % 929;
                }
                if (i11 == -1) {
                    return null;
                }
                int[] iArr5 = new int[8];
                int i34 = 0;
                int i35 = 7;
                while (true) {
                    int i36 = i30 & 1;
                    if (i36 != i34) {
                        i35--;
                        if (i35 >= 0) {
                            e50 e503 = e50;
                            i12 = i11;
                            e502 = e503;
                            i34 = i36;
                        } else {
                            return new e50(i17, i9, ((((iArr5[0] - iArr5[c3]) + iArr5[4]) - iArr5[6]) + 9) % 9, i11, 1);
                        }
                    } else {
                        e50 e504 = e50;
                        i12 = i11;
                        e502 = e504;
                    }
                    iArr5[i35] = iArr5[i35] + 1;
                    i30 >>= 1;
                    int i37 = i12;
                    e50 = e502;
                    i11 = i37;
                }
            }
        }
        return null;
    }

    public static wt1 d(k90 k90, fb0 fb0, r66 r66, boolean z, int i, int i2) {
        int i3;
        int i4;
        boolean z2 = z;
        wt1 wt1 = new wt1(fb0, z);
        int i5 = 0;
        while (i5 < 2) {
            if (i5 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i6 = i3;
            int i7 = (int) r66.a;
            int i8 = (int) r66.b;
            while (i8 <= fb0.i && i8 >= fb0.h) {
                e50 c = c(k90, 0, k90.w, z2, i7, i8, i, i2);
                if (c != null) {
                    ((e50[]) wt1.y)[wt1.J(i8)] = c;
                    if (z) {
                        i4 = c.b;
                    } else {
                        i4 = c.c;
                    }
                    i7 = i4;
                }
                i8 += i6;
                z2 = z;
            }
            i5++;
            z2 = z;
        }
        return wt1;
    }
}
