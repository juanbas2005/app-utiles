package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: t95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t95 implements rw5 {
    public static final n66[] b = new n66[0];
    public final /* synthetic */ int a;

    public /* synthetic */ t95(int i) {
        this.a = i;
    }

    public static int b(r66 r66, r66 r662) {
        if (r66 == null || r662 == null) {
            return 0;
        }
        return (int) Math.abs(r66.a - r662.a);
    }

    public static int c(r66 r66, r66 r662) {
        if (r66 == null || r662 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(r66.a - r662.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: wt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: wt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kb9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: wt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v4, resolved type: wt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: wt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v10, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v13, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v14, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v65, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v66, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v64, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v65, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v13, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v14, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v15, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v16, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: kb9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v17, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v6, resolved type: wt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v7, resolved type: wt1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v76, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: kb9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v74, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v75, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v76, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v77, resolved type: e50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v78, resolved type: e50} */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0204, code lost:
        if (r5 != r12.f) goto L_0x0206;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[SYNTHETIC, Splitter:B:18:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c A[LOOP:0: B:32:0x006a->B:33:0x006c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0766 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024c  */
    public final n66 a(qc3 qc3, Map map) {
        wt1 wt1;
        k90 k90;
        n66 n66;
        int i;
        int i2;
        int i3;
        int i4;
        fb0 fb0;
        k90 k902;
        int i5;
        wt1 wt12;
        Iterator it;
        int i6;
        kb9 kb9;
        int i7;
        jz0[] jz0Arr;
        boolean z;
        int i8;
        e50[] e50Arr;
        k90 k903;
        int i9;
        int i10;
        int i11;
        e50[] e50Arr2;
        int i12;
        int i13;
        e50[] e50Arr3;
        jz0 jz0;
        e50 e50;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        k90 k904;
        jz0 jz02;
        int i17;
        int i18;
        int i19;
        e50 e502;
        int i20;
        int i21;
        k90 k905;
        fb0 fb02;
        int i22;
        int i23;
        int i24;
        int i25;
        char c;
        e50 c2;
        int i26;
        boolean z2;
        e50 e503;
        Iterator it2;
        e50 c0;
        e50 c02;
        FormatException formatException;
        NotFoundException notFoundException;
        fv0 fv0;
        r66[] r66Arr;
        r66[] r66Arr2;
        List list;
        String str;
        s66 s66;
        int length;
        r66[] r66Arr3;
        Map map2 = map;
        int i27 = this.a;
        q66 q66 = q66.y;
        int i28 = 0;
        int i29 = 1;
        switch (i27) {
            case b85.b:
                ArrayList arrayList2 = new ArrayList();
                k90 y = qc3.y();
                ArrayList o = b96.o(y);
                char c3 = 2;
                if (o.isEmpty()) {
                    int i30 = y.w;
                    int i31 = y.x;
                    k90 k906 = new k90(i30, i31, y.y, (int[]) y.z.clone());
                    i90 i90 = new i90(i30);
                    i90 i902 = new i90(i30);
                    int i32 = (i31 + 1) / 2;
                    for (int i33 = 0; i33 < i32; i33++) {
                        i90 = k906.d(i90, i33);
                        int i34 = (i31 - 1) - i33;
                        i902 = k906.d(i902, i34);
                        i90.e();
                        i902.e();
                        int[] iArr = i902.w;
                        int i35 = k906.y;
                        int[] iArr2 = k906.z;
                        System.arraycopy(iArr, 0, iArr2, i33 * i35, i35);
                        System.arraycopy(i90.w, 0, iArr2, i34 * i35, i35);
                    }
                    wt1 = null;
                    k90 = k906;
                    o = b96.o(k906);
                } else {
                    wt1 = null;
                    k90 = y;
                }
                Iterator it3 = o.iterator();
                while (it3.hasNext()) {
                    r66[] r66Arr4 = (r66[]) it3.next();
                    r66 r66 = r66Arr4[4];
                    r66 r662 = r66Arr4[5];
                    r66 r663 = r66Arr4[6];
                    r66 r664 = r66Arr4[7];
                    int i36 = i28;
                    int min = Math.min(Math.min(c(r66Arr4[i28], r66), (c(r66Arr4[6], r66Arr4[c3]) * 17) / 18), Math.min(c(r66Arr4[i29], r66Arr4[5]), (c(r66Arr4[7], r66Arr4[3]) * 17) / 18));
                    int max = Math.max(Math.max(b(r66Arr4[i36], r66Arr4[4]), (b(r66Arr4[6], r66Arr4[c3]) * 17) / 18), Math.max(b(r66Arr4[i29], r66Arr4[5]), (b(r66Arr4[7], r66Arr4[3]) * 17) / 18));
                    ji8 ji8 = v95.a;
                    k90 k907 = k90;
                    fb0 fb03 = new fb0(k907, r66, r662, r663, r664);
                    r66 r665 = r663;
                    wt1 wt13 = wt1;
                    wt1 wt14 = wt13;
                    int i37 = i29;
                    while (true) {
                        int i38 = fb03.i;
                        int i39 = fb03.h;
                        if (r66 != null) {
                            int i40 = i38;
                            i = min;
                            i2 = i39;
                            i3 = max;
                            i4 = i40;
                            k90 k908 = k907;
                            fb0 = fb03;
                            k902 = k908;
                            wt13 = v95.d(k902, fb0, r66, true, i, i3);
                        } else {
                            int i41 = i38;
                            i = min;
                            i2 = i39;
                            i3 = max;
                            i4 = i41;
                            k90 k909 = k907;
                            fb0 = fb03;
                            k902 = k909;
                        }
                        r66 r666 = r66;
                        wt12 = wt13;
                        if (r665 != null) {
                            wt14 = v95.d(k902, fb0, r665, false, i5, i3);
                        }
                        if (wt12 == null && wt14 == null) {
                            it = it3;
                            i6 = i29;
                        } else {
                            if (wt12 == null || (c0 = wt12.c0()) == null) {
                                i6 = i29;
                                if (wt14 != null) {
                                    e503 = wt14.c0();
                                    if (e503 != 0) {
                                        it = it3;
                                    } else {
                                        fb0 a2 = v95.a(wt12);
                                        fb0 a3 = v95.a(wt14);
                                        if (a2 == null) {
                                            it2 = it3;
                                            a2 = a3;
                                        } else if (a3 == null) {
                                            it2 = it3;
                                        } else {
                                            k90 k9010 = a2.a;
                                            it2 = it3;
                                            k90 k9011 = k9010;
                                            a2 = new fb0(k9011, a2.b, a2.c, a3.d, a3.e);
                                        }
                                        kb9 = new kb9(e503, a2);
                                        if (kb9 == 0) {
                                            i7 = kb9.x;
                                            jz0Arr = (jz0[]) kb9.z;
                                            fb0 fb04 = (fb0) kb9.A;
                                            if (i37 == 0 || fb04 == null || (fb04.h >= i2 && fb04.i <= i4)) {
                                                kb9.A = fb0;
                                                int i42 = i7 + 1;
                                                jz0Arr[i36] = wt12;
                                                jz0Arr[i42] = wt14;
                                            } else {
                                                k907 = k902;
                                                fb03 = fb04;
                                                min = i5;
                                                max = i3;
                                                i37 = i36;
                                                r66 = r666;
                                                wt13 = wt12;
                                                i29 = i6;
                                                it3 = it;
                                            }
                                        } else {
                                            throw NotFoundException.y;
                                        }
                                    }
                                }
                            } else if (wt14 == null || (c02 = wt14.c0()) == null) {
                                i6 = i29;
                                e503 = c0;
                                if (e503 != 0) {
                                }
                            } else {
                                i6 = i29;
                                int i43 = c0.b;
                                e503 = c0;
                                if (i43 != c02.b) {
                                    int i44 = c0.c;
                                    e503 = c0;
                                    if (i44 != c02.c) {
                                        int i45 = c0.f;
                                        e503 = c0;
                                        break;
                                    }
                                }
                                if (e503 != 0) {
                                }
                            }
                            e503 = wt1;
                            if (e503 != 0) {
                            }
                        }
                        kb9 = wt1;
                        if (kb9 == 0) {
                        }
                    }
                    kb9.A = fb0;
                    int i422 = i7 + 1;
                    jz0Arr[i36] = wt12;
                    jz0Arr[i422] = wt14;
                    if (wt12 != null) {
                        z = i6;
                    } else {
                        z = i36;
                    }
                    int i46 = i6;
                    while (i46 <= i422) {
                        if (z != 0) {
                            i14 = i46;
                        } else {
                            i14 = i422 - i46;
                        }
                        if (jz0Arr[i14] == null) {
                            if (i14 == 0 || i14 == i422) {
                                i15 = i2;
                                k904 = k902;
                                if (i14 == 0) {
                                    z2 = i6;
                                } else {
                                    z2 = i36;
                                }
                                jz02 = new wt1(fb0, z2);
                            } else {
                                i15 = i2;
                                jz02 = new jz0(fb0);
                                k904 = k902;
                            }
                            jz0Arr[i14] = jz02;
                            arrayList = arrayList2;
                            k90 k9012 = k904;
                            int i47 = -1;
                            int i48 = i3;
                            int i49 = i15;
                            while (i49 <= i4) {
                                if (z != 0) {
                                    i17 = i6;
                                } else {
                                    i17 = -1;
                                }
                                int i50 = i14 - i17;
                                if (i50 >= 0) {
                                    i19 = i4;
                                    if (i50 <= i7 + 1) {
                                        jz0 jz03 = jz0Arr[i50];
                                        i18 = i46;
                                        e502 = ((e50[]) jz03.y)[jz03.J(i49)];
                                        if (e502 != 0) {
                                            e50 H = jz0Arr[i14].H(i49);
                                            if (H == null) {
                                                if (i50 >= 0 && i50 <= i7 + 1) {
                                                    H = jz0Arr[i50].H(i49);
                                                }
                                                if (H == null) {
                                                    int i51 = i14;
                                                    int i52 = i36;
                                                    while (true) {
                                                        int i53 = i51 - i17;
                                                        if (i53 < 0 || i53 > i7 + 1) {
                                                            fb0 fb05 = (fb0) kb9.A;
                                                        } else {
                                                            e50[] e50Arr4 = (e50[]) jz0Arr[i53].y;
                                                            int i54 = i53;
                                                            int length2 = e50Arr4.length;
                                                            int i55 = i52;
                                                            int i56 = i36;
                                                            while (i56 < length2) {
                                                                int i57 = length2;
                                                                e50 e504 = e50Arr4[i56];
                                                                if (e504 != null) {
                                                                    int i58 = e504.b;
                                                                    int i59 = e504.c;
                                                                    if (z != 0) {
                                                                        i26 = i59;
                                                                    } else {
                                                                        i26 = i58;
                                                                    }
                                                                    i20 = ((i59 - i58) * i17 * i55) + i26;
                                                                } else {
                                                                    i56++;
                                                                    length2 = i57;
                                                                }
                                                            }
                                                            i52 = i55 + 1;
                                                            i51 = i54;
                                                        }
                                                    }
                                                    fb0 fb052 = (fb0) kb9.A;
                                                    if (z != 0) {
                                                        i20 = fb052.f;
                                                    } else {
                                                        i20 = fb052.g;
                                                    }
                                                } else if (z != 0) {
                                                    i20 = H.c;
                                                } else {
                                                    i20 = H.b;
                                                }
                                            } else if (z != 0) {
                                                i20 = H.b;
                                            } else {
                                                i20 = H.c;
                                            }
                                        } else if (z != 0) {
                                            i20 = e502.c;
                                        } else {
                                            i20 = e502.b;
                                        }
                                        if (i20 < 0 || i20 > fb0.g) {
                                            c = 65535;
                                            if (i47 != -1) {
                                                i25 = i14;
                                                i22 = i5;
                                                i24 = i47;
                                            } else {
                                                fb02 = fb0;
                                                i21 = i14;
                                                i23 = i48;
                                                k905 = k9012;
                                                i22 = i5;
                                                i48 = i23;
                                                i5 = i22;
                                                i49++;
                                                fb0 = fb02;
                                                k9012 = k905;
                                                i14 = i21;
                                                i4 = i19;
                                                i46 = i18;
                                            }
                                        } else {
                                            i25 = i14;
                                            i22 = i5;
                                            i24 = i20;
                                            c = 65535;
                                        }
                                        int i60 = fb0.f;
                                        i21 = i25;
                                        int i61 = fb0.g;
                                        char c4 = c;
                                        fb02 = fb0;
                                        int i62 = i60;
                                        k905 = k9012;
                                        c2 = v95.c(k905, i62, i61, z, i24, i49, i22, i48);
                                        i23 = i48;
                                        if (c2 != null) {
                                            int i63 = c2.b;
                                            int i64 = c2.c;
                                            ((e50[]) jz02.y)[jz02.J(i49)] = c2;
                                            int min2 = Math.min(i22, i64 - i63);
                                            int i65 = i24;
                                            i5 = min2;
                                            i47 = i65;
                                            i48 = Math.max(i23, i64 - i63);
                                            i49++;
                                            fb0 = fb02;
                                            k9012 = k905;
                                            i14 = i21;
                                            i4 = i19;
                                            i46 = i18;
                                        }
                                        i48 = i23;
                                        i5 = i22;
                                        i49++;
                                        fb0 = fb02;
                                        k9012 = k905;
                                        i14 = i21;
                                        i4 = i19;
                                        i46 = i18;
                                    }
                                } else {
                                    i19 = i4;
                                }
                                i18 = i46;
                                e502 = wt1;
                                if (e502 != 0) {
                                }
                                if (i20 < 0 || i20 > fb0.g) {
                                }
                                int i602 = fb0.f;
                                i21 = i25;
                                int i612 = fb0.g;
                                char c42 = c;
                                fb02 = fb0;
                                int i622 = i602;
                                k905 = k9012;
                                c2 = v95.c(k905, i622, i612, z, i24, i49, i22, i48);
                                i23 = i48;
                                if (c2 != null) {
                                }
                                i48 = i23;
                                i5 = i22;
                                i49++;
                                fb0 = fb02;
                                k9012 = k905;
                                i14 = i21;
                                i4 = i19;
                                i46 = i18;
                            }
                            i16 = i46;
                            int i66 = i5;
                            k902 = k9012;
                            i3 = i48;
                        } else {
                            arrayList = arrayList2;
                            i15 = i2;
                            i16 = i46;
                        }
                        i46 = i16 + 1;
                        fb0 = fb0;
                        i2 = i15;
                        arrayList2 = arrayList;
                        i4 = i4;
                    }
                    ArrayList arrayList3 = arrayList2;
                    e50 e505 = (e50) kb9.y;
                    int i67 = e505.f;
                    int[] iArr3 = new int[2];
                    iArr3[i6] = i7 + 2;
                    iArr3[i36] = i67;
                    g50[][] g50Arr = (g50[][]) Array.newInstance(g50.class, iArr3);
                    int i68 = i36;
                    while (i68 < g50Arr.length) {
                        int i69 = i36;
                        while (true) {
                            g50[] g50Arr2 = g50Arr[i68];
                            if (i69 < g50Arr2.length) {
                                g50Arr2[i69] = new g50();
                                i69++;
                            } else {
                                i68++;
                            }
                        }
                    }
                    kb9.a(jz0Arr[i36]);
                    kb9.a(jz0Arr[i422]);
                    int i70 = 928;
                    while (true) {
                        jz0 jz04 = jz0Arr[i36];
                        if (!(jz04 == null || (jz0 = jz0Arr[i422]) == null)) {
                            e50[] e50Arr5 = (e50[]) jz04.y;
                            e50[] e50Arr6 = (e50[]) jz0.y;
                            for (int i71 = i36; i71 < e50Arr5.length; i71++) {
                                e50 e506 = e50Arr5[i71];
                                if (!(e506 == null || (e50 = e50Arr6[i71]) == null || e506.f != e50.f)) {
                                    for (int i72 = i6; i72 <= i7; i72++) {
                                        e50 e507 = ((e50[]) jz0Arr[i72].y)[i71];
                                        if (e507 != null) {
                                            int i73 = e50Arr5[i71].f;
                                            e507.f = i73;
                                            if (!e507.b(i73)) {
                                                ((e50[]) jz0Arr[i72].y)[i71] = wt1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        jz0 jz05 = jz0Arr[i36];
                        if (jz05 == null) {
                            i8 = i36;
                        } else {
                            e50[] e50Arr7 = (e50[]) jz05.y;
                            int i74 = i36;
                            i8 = i74;
                            while (i74 < e50Arr7.length) {
                                e50 e508 = e50Arr7[i74];
                                if (e508 != null) {
                                    int i75 = e508.f;
                                    int i76 = i36;
                                    int i77 = i6;
                                    while (true) {
                                        if (i77 < i422) {
                                            e50Arr = e50Arr7;
                                            if (i76 < 2) {
                                                e50 e509 = ((e50[]) jz0Arr[i77].y)[i74];
                                                k90 k9013 = k902;
                                                if (e509 != null) {
                                                    if (!e509.b(e509.f)) {
                                                        if (e509.b(i75)) {
                                                            e509.f = i75;
                                                            i76 = i36;
                                                        } else {
                                                            i76++;
                                                        }
                                                    }
                                                    if (!e509.b(e509.f)) {
                                                        i8++;
                                                    }
                                                }
                                                i77++;
                                                e50Arr7 = e50Arr;
                                                k902 = k9013;
                                            }
                                        }
                                    }
                                    i74++;
                                    e50Arr7 = e50Arr;
                                    k902 = k902;
                                }
                                e50Arr = e50Arr7;
                                i74++;
                                e50Arr7 = e50Arr;
                                k902 = k902;
                            }
                        }
                        k903 = k902;
                        jz0 jz06 = jz0Arr[i422];
                        if (jz06 == null) {
                            i9 = i36;
                        } else {
                            e50[] e50Arr8 = (e50[]) jz06.y;
                            int i78 = i36;
                            i9 = i78;
                            while (i78 < e50Arr8.length) {
                                e50 e5010 = e50Arr8[i78];
                                if (e5010 != null) {
                                    int i79 = e5010.f;
                                    int i80 = i422;
                                    int i81 = i36;
                                    while (true) {
                                        if (i80 > 0) {
                                            e50Arr3 = e50Arr8;
                                            if (i81 < 2) {
                                                e50 e5011 = ((e50[]) jz0Arr[i80].y)[i78];
                                                int i82 = i78;
                                                if (e5011 != null) {
                                                    if (!e5011.b(e5011.f)) {
                                                        if (e5011.b(i79)) {
                                                            e5011.f = i79;
                                                            i81 = i36;
                                                        } else {
                                                            i81++;
                                                        }
                                                    }
                                                    if (!e5011.b(e5011.f)) {
                                                        i9++;
                                                    }
                                                }
                                                i80--;
                                                e50Arr8 = e50Arr3;
                                                i78 = i82;
                                            }
                                        }
                                    }
                                    i78++;
                                    e50Arr8 = e50Arr3;
                                }
                                e50Arr3 = e50Arr8;
                                i78++;
                                e50Arr8 = e50Arr3;
                            }
                        }
                        int i83 = i8 + i9;
                        if (i83 == 0) {
                            i83 = i36;
                        } else {
                            int i84 = i6;
                            while (i84 < i422) {
                                e50[] e50Arr9 = (e50[]) jz0Arr[i84].y;
                                int i85 = i36;
                                while (i85 < e50Arr9.length) {
                                    e50 e5012 = e50Arr9[i85];
                                    if (e5012 == null || e5012.b(e5012.f)) {
                                        i11 = i84;
                                        i10 = i422;
                                    } else {
                                        e50 e5013 = e50Arr9[i85];
                                        e50[] e50Arr10 = (e50[]) jz0Arr[i84 - 1].y;
                                        jz0 jz07 = jz0Arr[i84 + 1];
                                        if (jz07 != null) {
                                            e50Arr2 = (e50[]) jz07.y;
                                        } else {
                                            e50Arr2 = e50Arr10;
                                        }
                                        i11 = i84;
                                        i10 = i422;
                                        e50[] e50Arr11 = new e50[14];
                                        e50Arr11[2] = e50Arr10[i85];
                                        e50Arr11[3] = e50Arr2[i85];
                                        if (i85 > 0) {
                                            int i86 = i85 - 1;
                                            e50Arr11[i36] = e50Arr9[i86];
                                            e50Arr11[4] = e50Arr10[i86];
                                            e50Arr11[5] = e50Arr2[i86];
                                        }
                                        if (i85 > i6) {
                                            int i87 = i85 - 2;
                                            e50Arr11[8] = e50Arr9[i87];
                                            e50Arr11[10] = e50Arr10[i87];
                                            e50Arr11[11] = e50Arr2[i87];
                                        }
                                        if (i85 < e50Arr9.length - 1) {
                                            int i88 = i85 + 1;
                                            e50Arr11[1] = e50Arr9[i88];
                                            e50Arr11[6] = e50Arr10[i88];
                                            e50Arr11[7] = e50Arr2[i88];
                                        }
                                        if (i85 < e50Arr9.length - 2) {
                                            int i89 = i85 + 2;
                                            e50Arr11[9] = e50Arr9[i89];
                                            e50Arr11[12] = e50Arr10[i89];
                                            e50Arr11[13] = e50Arr2[i89];
                                        }
                                        int i91 = i36;
                                        while (true) {
                                            if (i91 < 14) {
                                                e50 e5014 = e50Arr11[i91];
                                                if (e5014 != null && e5014.b(e5014.f)) {
                                                    i12 = i91;
                                                    if (e5014.d == e5013.d) {
                                                        e5013.f = e5014.f;
                                                    }
                                                } else {
                                                    i12 = i91;
                                                }
                                                i91 = i12 + 1;
                                            }
                                        }
                                    }
                                    i85++;
                                    i84 = i11;
                                    i422 = i10;
                                    i6 = 1;
                                }
                                int i92 = i422;
                                i84++;
                                i6 = 1;
                            }
                        }
                        int i93 = i422;
                        if (i83 <= 0 || i83 >= i70) {
                            int length3 = jz0Arr.length;
                            int i94 = i36;
                            int i95 = i94;
                        } else {
                            i70 = i83;
                            k902 = k903;
                            i422 = i93;
                            i6 = 1;
                        }
                    }
                    int length32 = jz0Arr.length;
                    int i942 = i36;
                    int i952 = i942;
                    while (i942 < length32) {
                        jz0 jz08 = jz0Arr[i942];
                        if (jz08 != null) {
                            e50[] e50Arr12 = (e50[]) jz08.y;
                            int length4 = e50Arr12.length;
                            for (int i96 = i36; i96 < length4; i96++) {
                                e50 e5015 = e50Arr12[i96];
                                if (e5015 != null && (i13 = e5015.f) >= 0 && i13 < g50Arr.length) {
                                    g50Arr[i13][i952].b(e5015.e);
                                }
                            }
                        }
                        i952++;
                        i942++;
                    }
                    g50 g50 = g50Arr[i36][1];
                    int[] a4 = g50.a();
                    int i97 = e505.c;
                    int i98 = i7 * i67;
                    int i99 = i98 - (2 << i97);
                    if (a4.length == 0) {
                        if (i99 <= 0 || i99 > 928) {
                            throw NotFoundException.y;
                        }
                        g50.b(i99);
                    } else if (a4[i36] != i99 && i99 > 0 && i99 <= 928) {
                        g50.b(i99);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int[] iArr4 = new int[i98];
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (int i100 = i36; i100 < i67; i100++) {
                        int i101 = i36;
                        while (i101 < i7) {
                            int i102 = i101 + 1;
                            int[] a5 = g50Arr[i100][i102].a();
                            int i103 = (i100 * i7) + i101;
                            if (a5.length == 0) {
                                arrayList4.add(Integer.valueOf(i103));
                            } else if (a5.length == 1) {
                                iArr4[i103] = a5[i36];
                            } else {
                                arrayList6.add(Integer.valueOf(i103));
                                arrayList5.add(a5);
                            }
                            i101 = i102;
                        }
                    }
                    int size = arrayList5.size();
                    int[][] iArr5 = new int[size][];
                    for (int i104 = i36; i104 < size; i104++) {
                        iArr5[i104] = (int[]) arrayList5.get(i104);
                    }
                    int[] g0 = gl0.g0(arrayList4);
                    int[] g02 = gl0.g0(arrayList6);
                    int length5 = g02.length;
                    int[] iArr6 = new int[length5];
                    int i105 = 100;
                    while (true) {
                        int i106 = i105 - 1;
                        if (i105 > 0) {
                            for (int i107 = i36; i107 < length5; i107++) {
                                iArr4[g02[i107]] = iArr5[i107][iArr6[i107]];
                            }
                            try {
                                fv0 b2 = v95.b(i97, iArr4, g0);
                                byte[] bArr = wt1;
                                n66 n662 = new n66(b2.a, bArr, r66Arr4, d50.G);
                                n662.b(q66, (String) b2.f);
                                u95 u95 = (u95) b2.g;
                                if (u95 != null) {
                                    n662.b(q66.D, u95);
                                }
                                ArrayList arrayList7 = arrayList3;
                                arrayList7.add(n662);
                                wt1 = bArr;
                                arrayList2 = arrayList7;
                                i28 = i36;
                                k90 = k903;
                                c3 = 2;
                                it3 = it;
                                i29 = 1;
                            } catch (ChecksumException unused) {
                                wt1 wt15 = wt1;
                                ArrayList arrayList8 = arrayList3;
                                if (length5 != 0) {
                                    int i108 = i36;
                                    while (true) {
                                        if (i108 < length5) {
                                            int i109 = iArr6[i108];
                                            if (i109 < iArr5[i108].length - 1) {
                                                iArr6[i108] = i109 + 1;
                                            } else {
                                                iArr6[i108] = i36;
                                                if (i108 != length5 - 1) {
                                                    i108++;
                                                } else {
                                                    throw ChecksumException.a();
                                                }
                                            }
                                        }
                                    }
                                    wt1 = wt15;
                                    i105 = i106;
                                    arrayList3 = arrayList8;
                                } else {
                                    throw ChecksumException.a();
                                }
                            }
                        } else {
                            throw ChecksumException.a();
                        }
                    }
                }
                int i110 = i28;
                n66[] n66Arr = (n66[]) arrayList2.toArray(b);
                if (n66Arr.length != 0 && (n66 = n66Arr[i110]) != null) {
                    return n66;
                }
                throw NotFoundException.y;
            default:
                xt1 xt1 = new xt1(qc3.y());
                try {
                    d30 a6 = xt1.a(false);
                    r66Arr3 = a6.b;
                    try {
                        fv0 = new ji8(1, false).r(a6);
                        r66Arr = r66Arr3;
                        notFoundException = null;
                    } catch (NotFoundException e) {
                        e = e;
                        r66[] r66Arr5 = r66Arr3;
                        notFoundException = e;
                        r66Arr = r66Arr5;
                        fv0 = null;
                        formatException = null;
                        if (fv0 == null) {
                        }
                        length = r66Arr2.length;
                        while (i28 < length) {
                        }
                        System.currentTimeMillis();
                        n66 n663 = new n66(fv0.a, (byte[]) fv0.d, r66Arr2, d50.w, 0);
                        list = (List) fv0.e;
                        if (list != null) {
                        }
                        str = (String) fv0.f;
                        if (str != null) {
                        }
                        return n663;
                    } catch (FormatException e2) {
                        e = e2;
                        formatException = e;
                        r66Arr = r66Arr3;
                        fv0 = null;
                        notFoundException = null;
                        if (fv0 == null) {
                        }
                        length = r66Arr2.length;
                        while (i28 < length) {
                        }
                        System.currentTimeMillis();
                        n66 n6632 = new n66(fv0.a, (byte[]) fv0.d, r66Arr2, d50.w, 0);
                        list = (List) fv0.e;
                        if (list != null) {
                        }
                        str = (String) fv0.f;
                        if (str != null) {
                        }
                        return n6632;
                    }
                } catch (NotFoundException e3) {
                    e = e3;
                    r66Arr3 = null;
                    r66[] r66Arr52 = r66Arr3;
                    notFoundException = e;
                    r66Arr = r66Arr52;
                    fv0 = null;
                    formatException = null;
                    if (fv0 == null) {
                    }
                    length = r66Arr2.length;
                    while (i28 < length) {
                    }
                    System.currentTimeMillis();
                    n66 n66322 = new n66(fv0.a, (byte[]) fv0.d, r66Arr2, d50.w, 0);
                    list = (List) fv0.e;
                    if (list != null) {
                    }
                    str = (String) fv0.f;
                    if (str != null) {
                    }
                    return n66322;
                } catch (FormatException e4) {
                    e = e4;
                    r66Arr3 = null;
                    formatException = e;
                    r66Arr = r66Arr3;
                    fv0 = null;
                    notFoundException = null;
                    if (fv0 == null) {
                    }
                    length = r66Arr2.length;
                    while (i28 < length) {
                    }
                    System.currentTimeMillis();
                    n66 n663222 = new n66(fv0.a, (byte[]) fv0.d, r66Arr2, d50.w, 0);
                    list = (List) fv0.e;
                    if (list != null) {
                    }
                    str = (String) fv0.f;
                    if (str != null) {
                    }
                    return n663222;
                }
                formatException = null;
                if (fv0 == null) {
                    try {
                        d30 a7 = xt1.a(true);
                        r66Arr2 = a7.b;
                        fv0 = new ji8(1, false).r(a7);
                    } catch (FormatException | NotFoundException e5) {
                        if (notFoundException != null) {
                            throw notFoundException;
                        } else if (formatException != null) {
                            throw formatException;
                        } else {
                            throw e5;
                        }
                    }
                } else {
                    r66Arr2 = r66Arr;
                }
                if (!(map2 == null || (s66 = (s66) map2.get(fk1.F)) == null)) {
                    length = r66Arr2.length;
                    while (i28 < length) {
                        s66.a(r66Arr2[i28]);
                        i28++;
                    }
                }
                System.currentTimeMillis();
                n66 n6632222 = new n66(fv0.a, (byte[]) fv0.d, r66Arr2, d50.w, 0);
                list = (List) fv0.e;
                if (list != null) {
                    n6632222.b(q66.x, list);
                }
                str = (String) fv0.f;
                if (str != null) {
                    n6632222.b(q66, str);
                }
                return n6632222;
        }
    }

    public final void reset() {
        int i = this.a;
    }

    private final void d() {
    }

    private final void e() {
    }
}
