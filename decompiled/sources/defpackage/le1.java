package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: le1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class le1 implements rw5 {
    public static final r66[] c = new r66[0];
    public static final r66[] d = new r66[0];
    public static final r66[] e = new r66[0];
    public final /* synthetic */ int a;
    public final Object b;

    public le1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ns8(16);
                return;
            case 2:
                this.b = new f96(16);
                return;
            default:
                this.b = new ji8(16);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r14v15, types: [ge2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x096a, code lost:
        if ((r1.Z(r8, r13) + r1.Z(r9, r13)) > (r1.Z(r8, r6) + r1.Z(r9, r6))) goto L_0x096c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0324 A[SYNTHETIC] */
    public final n66 a(qc3 qc3, Map map) {
        r66[] r66Arr;
        fv0 fv0;
        char c2;
        char c3;
        r66 r66;
        char c4;
        int[] iArr;
        byte[] bArr;
        byte[] bArr2;
        String valueOf;
        String str;
        r66[] r66Arr2;
        fv0 fv02;
        int i;
        s66 s66;
        boolean z;
        de2 de2;
        de2 de22;
        de2 de23;
        float f;
        float f2;
        r66 r662;
        float f3;
        float f4;
        float f5;
        r66[] r66Arr3;
        double d2;
        double abs;
        double d3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Map map2 = map;
        int i7 = this.a;
        q66 q66 = q66.y;
        Object obj = this.b;
        int i8 = 0;
        int i9 = 3;
        int i10 = 1;
        switch (i7) {
            case b85.b:
                ji8 ji8 = (ji8) obj;
                if (map2 == null || !map2.containsKey(fk1.x)) {
                    k90 y = qc3.y();
                    jz0 jz0 = new jz0(y, 14);
                    r66[] b2 = ((u88) jz0.y).b();
                    r66 r663 = b2[0];
                    r66 r664 = b2[1];
                    r66 r665 = b2[3];
                    r66 r666 = b2[2];
                    int Z = jz0.Z(r663, r664);
                    int Z2 = jz0.Z(r664, r665);
                    int Z3 = jz0.Z(r665, r666);
                    int Z4 = jz0.Z(r666, r663);
                    r66[] r66Arr4 = {r666, r663, r664, r665};
                    if (Z > Z2) {
                        r66Arr4[0] = r663;
                        r66Arr4[1] = r664;
                        r66Arr4[2] = r665;
                        r66Arr4[3] = r666;
                        Z = Z2;
                    }
                    if (Z > Z3) {
                        r66Arr4[0] = r664;
                        r66Arr4[1] = r665;
                        r66Arr4[2] = r666;
                        r66Arr4[3] = r663;
                    } else {
                        Z3 = Z;
                    }
                    if (Z3 > Z4) {
                        r66Arr4[0] = r665;
                        r66Arr4[1] = r666;
                        r66Arr4[2] = r663;
                        r66Arr4[3] = r664;
                    }
                    r66 r667 = r66Arr4[0];
                    r66 r668 = r66Arr4[1];
                    r66 r669 = r66Arr4[2];
                    r66 r6610 = r66Arr4[3];
                    int Z5 = (jz0.Z(r667, r6610) + 1) << 2;
                    if (jz0.Z(jz0.V(r668, r669, Z5), r667) < jz0.Z(jz0.V(r669, r668, Z5), r6610)) {
                        c2 = 0;
                        r66Arr4[0] = r667;
                        r66Arr4[1] = r668;
                        r66Arr4[2] = r669;
                        c3 = 3;
                        r66Arr4[3] = r6610;
                    } else {
                        c3 = 3;
                        c2 = 0;
                        r66Arr4[0] = r668;
                        r66Arr4[1] = r669;
                        r66Arr4[2] = r6610;
                        r66Arr4[3] = r667;
                    }
                    r66 r6611 = r66Arr4[c2];
                    r66 r6612 = r66Arr4[1];
                    r66 r6613 = r66Arr4[2];
                    r66 r6614 = r66Arr4[c3];
                    int Z6 = jz0.Z(r6611, r6614);
                    r66 V = jz0.V(r6611, r6612, (jz0.Z(r6612, r6614) + 1) << 2);
                    r66 V2 = jz0.V(r6613, r6612, (Z6 + 1) << 2);
                    int Z7 = jz0.Z(V, r6614);
                    int Z8 = jz0.Z(V2, r6614);
                    float f6 = r6614.a;
                    float f7 = r6613.a;
                    int i11 = Z7;
                    float f8 = r6612.a;
                    float f9 = f7 - f8;
                    float f10 = f8;
                    float f11 = (float) (i11 + 1);
                    float f12 = r6614.b;
                    float f13 = r6613.b;
                    float f14 = r6612.b;
                    r66 r6615 = new r66((f9 / f11) + f6, ((f13 - f14) / f11) + f12);
                    float f15 = (float) (Z8 + 1);
                    r66 r6616 = new r66(((r6611.a - f10) / f15) + f6, ((r6611.b - f14) / f15) + f12);
                    if (!jz0.K(r6615)) {
                        if (!jz0.K(r6616)) {
                            r66 = null;
                        }
                        r66 = r6616;
                    } else {
                        if (jz0.K(r6616)) {
                            break;
                        }
                        r66 = r6615;
                    }
                    r66Arr4[3] = r66;
                    if (r66 != null) {
                        r66 r6617 = r66Arr4[0];
                        r66 r6618 = r66Arr4[1];
                        r66 r6619 = r66Arr4[2];
                        r66 V3 = jz0.V(r6617, r6618, (jz0.Z(r6619, r66) + 1) << 2);
                        r66 V4 = jz0.V(r6619, r6618, (jz0.Z(r6617, r66) + 1) << 2);
                        int Z9 = jz0.Z(V3, r66);
                        int i12 = Z9 + 1;
                        int Z10 = jz0.Z(V4, r66);
                        int i13 = Z10 + 1;
                        if ((i12 & 1) == 1) {
                            i12 = Z9 + 2;
                        }
                        if ((i13 & 1) == 1) {
                            i13 = Z10 + 2;
                        }
                        float f16 = (((r6617.a + r6618.a) + r6619.a) + r66.a) / 4.0f;
                        float f17 = (((r6617.b + r6618.b) + r6619.b) + r66.b) / 4.0f;
                        r66 O = jz0.O(r6617, f16, f17);
                        r66 O2 = jz0.O(r6618, f16, f17);
                        r66 O3 = jz0.O(r6619, f16, f17);
                        r66 O4 = jz0.O(r66, f16, f17);
                        int i14 = i13 << 2;
                        int i15 = i12 << 2;
                        r66[] r66Arr5 = {jz0.V(jz0.V(O, O2, i14), O4, i15), jz0.V(jz0.V(O2, O, i14), O3, i15), jz0.V(jz0.V(O3, O4, i14), O2, i15), jz0.V(jz0.V(O4, O3, i14), O, i15)};
                        r66 r6620 = r66Arr5[0];
                        r66 r6621 = r66Arr5[1];
                        r66 r6622 = r66Arr5[2];
                        r66 r6623 = r66Arr5[3];
                        int Z11 = jz0.Z(r6620, r6623);
                        int i16 = Z11 + 1;
                        int Z12 = jz0.Z(r6622, r6623);
                        int i17 = Z12 + 1;
                        if ((i16 & 1) == 1) {
                            i16 = Z11 + 2;
                        }
                        if ((i17 & 1) == 1) {
                            i17 = Z12 + 2;
                        }
                        if (i16 * 4 < i17 * 7 && i17 * 4 < i16 * 7) {
                            i16 = Math.max(i16, i17);
                            i17 = i16;
                        }
                        float f18 = ((float) i16) - 0.5f;
                        float f19 = ((float) i17) - 0.5f;
                        float f20 = r6620.a;
                        float f21 = r6620.b;
                        float f22 = f18;
                        float f23 = f19;
                        float f24 = f21;
                        fv0 = ji8.t(gw8.L(y, i16, i17, lg5.a(0.5f, 0.5f, f18, 0.5f, f22, f19, 0.5f, f23, f20, f24, r6623.a, r6623.b, r6622.a, r6622.b, r6621.a, r6621.b)));
                        r66Arr = new r66[]{r6620, r6621, r6622, r6623};
                    } else {
                        throw NotFoundException.y;
                    }
                } else {
                    k90 y2 = qc3.y();
                    int[] e2 = y2.e();
                    int[] c5 = y2.c();
                    if (e2 == null || c5 == null) {
                        throw NotFoundException.y;
                    }
                    int i18 = y2.w;
                    int i19 = e2[0];
                    int i20 = e2[1];
                    while (i19 < i18 && y2.b(i19, i20)) {
                        i19++;
                    }
                    if (i19 != i18) {
                        int i21 = e2[0];
                        int i22 = i19 - i21;
                        if (i22 != 0) {
                            int i23 = e2[1];
                            int i24 = c5[1];
                            int i25 = ((c5[0] - i21) + 1) / i22;
                            int i26 = ((i24 - i23) + 1) / i22;
                            if (i25 <= 0 || i26 <= 0) {
                                throw NotFoundException.y;
                            }
                            int i27 = i22 / 2;
                            int i28 = i23 + i27;
                            int i29 = i21 + i27;
                            k90 k90 = new k90(i25, i26);
                            for (int i30 = 0; i30 < i26; i30++) {
                                int i31 = (i30 * i22) + i28;
                                for (int i32 = 0; i32 < i25; i32++) {
                                    if (y2.b((i32 * i22) + i29, i31)) {
                                        k90.f(i32, i30);
                                    }
                                }
                            }
                            fv0 = ji8.t(k90);
                            r66Arr = c;
                        } else {
                            throw NotFoundException.y;
                        }
                    } else {
                        throw NotFoundException.y;
                    }
                }
                n66 n66 = new n66(fv0.a, (byte[]) fv0.d, r66Arr, d50.B);
                List list = (List) fv0.e;
                if (list != null) {
                    n66.b(q66.x, list);
                }
                String str2 = (String) fv0.f;
                if (str2 != null) {
                    n66.b(q66, str2);
                }
                return n66;
            case 1:
                k90 y3 = qc3.y();
                int i33 = y3.w;
                int i34 = y3.x;
                int i35 = -1;
                int i36 = i34;
                int i37 = -1;
                int i38 = 0;
                while (i38 < i34) {
                    int i39 = 0;
                    while (true) {
                        int i40 = y3.y;
                        if (i39 < i40) {
                            int i41 = y3.z[(i40 * i38) + i39];
                            if (i41 != 0) {
                                if (i38 < i36) {
                                    i36 = i38;
                                }
                                if (i38 > i37) {
                                    i37 = i38;
                                }
                                int i42 = i39 << 5;
                                if (i42 < i33) {
                                    int i43 = 0;
                                    while ((i41 << (31 - i43)) == 0) {
                                        i43++;
                                    }
                                    int i44 = i43 + i42;
                                    if (i44 < i33) {
                                        i33 = i44;
                                    }
                                }
                                if (i42 + 31 > i35) {
                                    int i45 = 31;
                                    while ((i41 >>> i45) == 0) {
                                        i45--;
                                    }
                                    int i46 = i42 + i45;
                                    if (i46 > i35) {
                                        i35 = i46;
                                    }
                                }
                            }
                            i39++;
                        } else {
                            i38++;
                        }
                    }
                }
                if (i35 < i33 || i37 < i36) {
                    c4 = 1;
                    iArr = null;
                } else {
                    c4 = 1;
                    iArr = new int[]{i33, i36, (i35 - i33) + 1, (i37 - i36) + 1};
                }
                if (iArr != null) {
                    int i47 = iArr[0];
                    int i48 = iArr[c4];
                    int i49 = iArr[2];
                    int i50 = iArr[3];
                    int[] iArr2 = new int[33];
                    for (int i51 = 0; i51 < 33; i51++) {
                        int i52 = (((i50 / 2) + (i51 * i50)) / 33) + i48;
                        for (int i53 = 0; i53 < 30; i53++) {
                            if (y3.b((((((i51 & 1) * i49) / 2) + ((i49 / 2) + (i53 * i49))) / 30) + i47, i52)) {
                                int i54 = (i53 / 32) + i51;
                                iArr2[i54] = iArr2[i54] | (1 << (i53 & 31));
                            }
                        }
                    }
                    ns8 ns8 = (ns8) obj;
                    ns8.getClass();
                    byte[] bArr3 = new byte[144];
                    for (int i55 = 0; i55 < 33; i55++) {
                        int[] iArr3 = pd8.a[i55];
                        for (int i56 = 0; i56 < 30; i56++) {
                            int i57 = iArr3[i56];
                            if (i57 >= 0 && ((iArr2[(i56 / 32) + i55] >>> (i56 & 31)) & 1) != 0) {
                                int i58 = i57 / 6;
                                bArr3[i58] = (byte) (((byte) (1 << (5 - (i57 % 6)))) | bArr3[i58]);
                            }
                        }
                    }
                    byte[] bArr4 = bArr3;
                    ns8.P(bArr4, 0, 10, 10, 0);
                    byte b3 = bArr4[0] & 15;
                    if (b3 == 2 || b3 == 3 || b3 == 4) {
                        ns8.P(bArr4, 20, 84, 40, 1);
                        ns8.P(bArr4, 20, 84, 40, 2);
                        bArr = bArr4;
                        bArr2 = new byte[94];
                    } else if (b3 == 5) {
                        ns8.P(bArr4, 20, 68, 56, 1);
                        ns8.P(bArr4, 20, 68, 56, 2);
                        bArr2 = new byte[78];
                        bArr = bArr4;
                    } else {
                        throw FormatException.a();
                    }
                    System.arraycopy(bArr, 0, bArr2, 0, 10);
                    System.arraycopy(bArr, 20, bArr2, 10, bArr2.length - 10);
                    StringBuilder sb = new StringBuilder(144);
                    byte b4 = 2;
                    if (b3 != 2) {
                        if (b3 != 3) {
                            if (b3 == 4) {
                                sb.append(rd3.y(bArr2, 1, 93));
                            } else if (b3 == 5) {
                                sb.append(rd3.y(bArr2, 1, 77));
                            }
                            String sb2 = sb.toString();
                            valueOf = String.valueOf(b3);
                            n66 n662 = new n66(sb2, bArr2, d, d50.F);
                            if (valueOf != null) {
                                n662.b(q66, valueOf);
                            }
                            return n662;
                        }
                        b4 = 2;
                    }
                    if (b3 == b4) {
                        str = new DecimalFormat("0000000000".substring(0, rd3.w(bArr2, new byte[]{39, 40, 41, 42, 31, 32}))).format((long) rd3.w(bArr2, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
                    } else {
                        String[] strArr = rd3.h;
                        str = String.valueOf(new char[]{strArr[0].charAt(rd3.w(bArr2, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(rd3.w(bArr2, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(rd3.w(bArr2, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(rd3.w(bArr2, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(rd3.w(bArr2, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(rd3.w(bArr2, new byte[]{9, 10, 11, 12, 1, 2}))});
                    }
                    DecimalFormat decimalFormat = new DecimalFormat("000");
                    String format = decimalFormat.format((long) rd3.w(bArr2, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
                    String format2 = decimalFormat.format((long) rd3.w(bArr2, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
                    sb.append(rd3.y(bArr2, 10, 84));
                    if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                        sb.insert(9, str + 29 + format + 29 + format2 + 29);
                    } else {
                        sb.insert(0, str + 29 + format + 29 + format2 + 29);
                    }
                    String sb22 = sb.toString();
                    valueOf = String.valueOf(b3);
                    n66 n6622 = new n66(sb22, bArr2, d, d50.F);
                    if (valueOf != null) {
                    }
                    return n6622;
                }
                throw NotFoundException.y;
            default:
                f96 f96 = (f96) obj;
                if (map2 == null || !map2.containsKey(fk1.x)) {
                    k90 y4 = qc3.y();
                    jz0 jz02 = new jz0(y4, 15);
                    if (map2 == null) {
                        s66 = null;
                    } else {
                        s66 = (s66) map2.get(fk1.F);
                    }
                    jz02.y = s66;
                    ? obj2 = new Object();
                    obj2.b = y4;
                    obj2.c = new ArrayList();
                    obj2.d = new int[5];
                    obj2.e = s66;
                    ArrayList arrayList = (ArrayList) obj2.c;
                    if (map2 == null || !map2.containsKey(fk1.z)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int i59 = y4.x;
                    int i60 = y4.w;
                    int i61 = (i59 * 3) / 388;
                    if (i61 < 3 || z) {
                        i61 = 3;
                    }
                    int[] iArr4 = new int[5];
                    int i62 = i61 - 1;
                    boolean z2 = false;
                    while (i62 < i59 && !z2) {
                        Arrays.fill(iArr4, i8);
                        int i63 = i9;
                        int i64 = i8;
                        while (i64 < i60) {
                            if (y4.b(i64, i62)) {
                                if ((i8 & 1) == i10) {
                                    i8++;
                                }
                                iArr4[i8] = iArr4[i8] + i10;
                                i3 = i2;
                                int i65 = i10;
                            } else if ((i8 & 1) != 0) {
                                i3 = i2;
                                int i66 = i10;
                                iArr4[i8] = iArr4[i8] + 1;
                            } else if (i8 == 4) {
                                if (!ge2.b(iArr4)) {
                                    i4 = i2;
                                    int i67 = i10;
                                    iArr4[0] = iArr4[2];
                                    iArr4[i67] = iArr4[i63];
                                    iArr4[2] = iArr4[4];
                                    iArr4[i63] = i67;
                                    iArr4[4] = 0;
                                } else if (obj2.c(i62, i64, iArr4)) {
                                    if (obj2.a) {
                                        z2 = obj2.d();
                                        i3 = i2;
                                        i5 = 2;
                                    } else {
                                        if (arrayList.size() <= i10) {
                                            i3 = i2;
                                            i6 = 0;
                                            i5 = 2;
                                        } else {
                                            Iterator it = arrayList.iterator();
                                            de2 de24 = null;
                                            while (true) {
                                                if (it.hasNext()) {
                                                    de2 de25 = (de2) it.next();
                                                    i3 = i2;
                                                    if (de25.d < 2) {
                                                        i2 = i3;
                                                    } else if (de24 == null) {
                                                        i2 = i3;
                                                        de24 = de25;
                                                    } else {
                                                        obj2.a = true;
                                                        i5 = 2;
                                                        i6 = ((int) (Math.abs(de24.a - de25.a) - Math.abs(de24.b - de25.b))) / 2;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    i5 = 2;
                                                    i6 = 0;
                                                }
                                            }
                                        }
                                        int i68 = iArr4[i5];
                                        if (i6 > i68) {
                                            i62 += (i6 - i68) - 2;
                                            i64 = i60 - 1;
                                        }
                                    }
                                    Arrays.fill(iArr4, 0);
                                    i8 = 0;
                                    i61 = i5;
                                } else {
                                    i4 = i2;
                                    iArr4[0] = iArr4[2];
                                    iArr4[1] = iArr4[i63];
                                    iArr4[2] = iArr4[4];
                                    iArr4[i63] = 1;
                                    iArr4[4] = 0;
                                }
                                i8 = i63;
                            } else {
                                i3 = i2;
                                int i69 = i10;
                                int i70 = i8 + 1;
                                iArr4[i70] = iArr4[i70] + 1;
                                i8 = i70;
                            }
                            i64++;
                            i59 = i3;
                            i10 = 1;
                        }
                        int i71 = i2;
                        if (ge2.b(iArr4) && obj2.c(i62, i60, iArr4)) {
                            int i72 = iArr4[0];
                            if (obj2.a) {
                                i61 = i72;
                                z2 = obj2.d();
                            } else {
                                i61 = i72;
                            }
                        }
                        i62 += i61;
                        i59 = i71;
                        i9 = i63;
                        i8 = 0;
                        i10 = 1;
                    }
                    int i73 = i9;
                    if (arrayList.size() >= i73) {
                        arrayList.sort(ge2.f);
                        de2[] de2Arr = new de2[i73];
                        int i74 = 0;
                        double d4 = Double.MAX_VALUE;
                        while (i74 < arrayList.size() - 2) {
                            de2 de26 = (de2) arrayList.get(i74);
                            float f25 = de26.c;
                            i74++;
                            int i75 = i74;
                            while (i75 < arrayList.size() - 1) {
                                de2 de27 = (de2) arrayList.get(i75);
                                double f26 = ge2.f(de26, de27);
                                i75++;
                                int i76 = i75;
                                while (i76 < arrayList.size()) {
                                    de2 de28 = (de2) arrayList.get(i76);
                                    de2[] de2Arr2 = de2Arr;
                                    if (de28.c <= 1.4f * f25) {
                                        double f27 = ge2.f(de27, de28);
                                        double f28 = ge2.f(de26, de28);
                                        if (f26 < f27) {
                                            if (f27 <= f28) {
                                                double d5 = f28;
                                                f28 = f27;
                                                f27 = d5;
                                            } else if (f26 >= f28) {
                                                d2 = f28;
                                            }
                                            d2 = f26;
                                            abs = Math.abs(f27 - (d2 * 2.0d)) + Math.abs(f27 - (f28 * 2.0d));
                                            if (abs < d4) {
                                                de2Arr2[0] = de26;
                                                de2Arr2[1] = de27;
                                                de2Arr2[2] = de28;
                                                d4 = abs;
                                            }
                                        } else {
                                            if (f27 >= f28) {
                                                d3 = f28;
                                                f28 = f27;
                                            } else if (f26 < f28) {
                                                d2 = f27;
                                                f27 = f28;
                                            } else {
                                                d3 = f27;
                                            }
                                            f27 = f26;
                                            abs = Math.abs(f27 - (d2 * 2.0d)) + Math.abs(f27 - (f28 * 2.0d));
                                            if (abs < d4) {
                                            }
                                        }
                                        f28 = f26;
                                        abs = Math.abs(f27 - (d2 * 2.0d)) + Math.abs(f27 - (f28 * 2.0d));
                                        if (abs < d4) {
                                        }
                                    }
                                    i76++;
                                    de2Arr = de2Arr2;
                                }
                            }
                        }
                        de2[] de2Arr3 = de2Arr;
                        if (d4 != Double.MAX_VALUE) {
                            float a2 = r66.a(de2Arr3[0], de2Arr3[1]);
                            float a3 = r66.a(de2Arr3[1], de2Arr3[2]);
                            float a4 = r66.a(de2Arr3[0], de2Arr3[2]);
                            if (a3 >= a2 && a3 >= a4) {
                                de23 = de2Arr3[0];
                                de22 = de2Arr3[1];
                                de2 = de2Arr3[2];
                            } else if (a4 < a3 || a4 < a2) {
                                de23 = de2Arr3[2];
                                de22 = de2Arr3[0];
                                de2 = de2Arr3[1];
                            } else {
                                de23 = de2Arr3[1];
                                de22 = de2Arr3[0];
                                de2 = de2Arr3[2];
                            }
                            float f29 = de23.a;
                            float f30 = de23.b;
                            if (((de22.b - f30) * (de2.a - f29)) - ((de22.a - f29) * (de2.b - f30)) < 0.0f) {
                                de2 de29 = de2;
                                de2 = de22;
                                de22 = de29;
                            }
                            de2Arr3[0] = de22;
                            de2Arr3[1] = de23;
                            de2Arr3[2] = de2;
                            float i77 = jz02.i(de23, de2);
                            float f31 = de23.a;
                            float f32 = de2.b;
                            float f33 = de2.a;
                            float i78 = jz02.i(de23, de22);
                            float f34 = de22.b;
                            float f35 = de22.a;
                            float f36 = (i78 + i77) / 2.0f;
                            if (f36 >= 1.0f) {
                                int w0 = (bb0.w0(r66.a(de23, de22) / f36) + bb0.w0(r66.a(de23, de2) / f36)) / 2;
                                int i79 = w0 + 7;
                                float f37 = f32;
                                int i80 = i79 & 3;
                                if (i80 == 0) {
                                    i79 = w0 + 8;
                                } else if (i80 == 2) {
                                    i79 = w0 + 6;
                                } else if (i80 == 3) {
                                    throw NotFoundException.y;
                                }
                                int i81 = i79;
                                int[] iArr5 = f48.e;
                                float f38 = f33;
                                if (i81 % 4 == 1) {
                                    try {
                                        f48 c6 = f48.c((i81 - 17) / 4);
                                        int i82 = (c6.a * 4) + 10;
                                        if (c6.b.length > 0) {
                                            f2 = f34;
                                            float f39 = 1.0f - (3.0f / ((float) i82));
                                            int d6 = (int) b81.d((f38 - f31) + f35, f31, f39, f31);
                                            int d7 = (int) b81.d((f37 - f30) + f2, f30, f39, f30);
                                            f = f30;
                                            int i83 = 4;
                                            while (true) {
                                                if (i83 <= 16) {
                                                    try {
                                                        r662 = jz02.G(f36, d6, d7, (float) i83);
                                                    } catch (NotFoundException unused) {
                                                        i83 <<= 1;
                                                    }
                                                }
                                            }
                                            float f40 = ((float) i81) - 3.5f;
                                            if (r662 == null) {
                                                f3 = r662.a;
                                                f4 = r662.b;
                                                f5 = f40 - 3.0f;
                                            } else {
                                                f3 = (f38 - f31) + f35;
                                                f4 = (f37 - f) + f2;
                                                f5 = f40;
                                            }
                                            k90 L = gw8.L(y4, i81, i81, lg5.a(3.5f, 3.5f, f40, 3.5f, f5, f5, 3.5f, f40, de23.a, de23.b, de2.a, de2.b, f3, f4, de22.a, de22.b));
                                            if (r662 != null) {
                                                i9 = 3;
                                                r66Arr3 = new r66[]{de22, de23, de2};
                                            } else {
                                                i9 = 3;
                                                r66Arr3 = new r66[]{de22, de23, de2, r662};
                                            }
                                            fv02 = f96.q(L, map2);
                                            r66Arr2 = r66Arr3;
                                        } else {
                                            f = f30;
                                            f2 = f34;
                                        }
                                        r662 = null;
                                        float f402 = ((float) i81) - 3.5f;
                                        if (r662 == null) {
                                        }
                                        k90 L2 = gw8.L(y4, i81, i81, lg5.a(3.5f, 3.5f, f402, 3.5f, f5, f5, 3.5f, f402, de23.a, de23.b, de2.a, de2.b, f3, f4, de22.a, de22.b));
                                        if (r662 != null) {
                                        }
                                        fv02 = f96.q(L2, map2);
                                        r66Arr2 = r66Arr3;
                                    } catch (IllegalArgumentException unused2) {
                                        throw FormatException.a();
                                    }
                                } else {
                                    throw FormatException.a();
                                }
                            } else {
                                throw NotFoundException.y;
                            }
                        } else {
                            throw NotFoundException.y;
                        }
                    } else {
                        throw NotFoundException.y;
                    }
                } else {
                    k90 y5 = qc3.y();
                    int[] e3 = y5.e();
                    int i84 = y5.w;
                    int[] c7 = y5.c();
                    if (e3 == null || c7 == null) {
                        throw NotFoundException.y;
                    }
                    int i85 = y5.x;
                    int i86 = e3[0];
                    int i87 = e3[1];
                    int i88 = 0;
                    boolean z3 = true;
                    while (i86 < i84 && i87 < i85) {
                        if (z3 != y5.b(i86, i87)) {
                            int i89 = i88 + 1;
                            if (i89 != 5) {
                                z3 = !z3;
                                i88 = i89;
                            }
                        }
                        i86++;
                        i87++;
                    }
                    if (i86 == i84 || i87 == i85) {
                        throw NotFoundException.y;
                    }
                    int i90 = e3[0];
                    float f41 = ((float) (i86 - i90)) / 7.0f;
                    int i91 = e3[1];
                    int i92 = c7[1];
                    int i93 = c7[0];
                    if (i90 >= i93 || i91 >= i92) {
                        throw NotFoundException.y;
                    }
                    int i94 = i92 - i91;
                    if (i94 == i93 - i90 || (i93 = i90 + i94) < i84) {
                        int round = Math.round(((float) ((i93 - i90) + 1)) / f41);
                        int round2 = Math.round(((float) (i94 + 1)) / f41);
                        if (round <= 0 || round2 <= 0) {
                            throw NotFoundException.y;
                        } else if (round2 == round) {
                            int i95 = (int) (f41 / 2.0f);
                            int i96 = i91 + i95;
                            int i97 = i90 + i95;
                            int i98 = (((int) (((float) (round - 1)) * f41)) + i97) - i93;
                            if (i98 > 0) {
                                if (i98 <= i95) {
                                    i97 -= i98;
                                } else {
                                    throw NotFoundException.y;
                                }
                            }
                            int i99 = (((int) (((float) (round2 - 1)) * f41)) + i96) - i92;
                            if (i99 > 0) {
                                if (i99 <= i95) {
                                    i96 -= i99;
                                } else {
                                    throw NotFoundException.y;
                                }
                            }
                            k90 k902 = new k90(round, round2);
                            for (int i100 = 0; i100 < round2; i100++) {
                                int i101 = ((int) (((float) i100) * f41)) + i96;
                                for (int i102 = 0; i102 < round; i102++) {
                                    if (y5.b(((int) (((float) i102) * f41)) + i97, i101)) {
                                        k902.f(i102, i100);
                                    }
                                }
                            }
                            fv02 = f96.q(k902, map2);
                            r66Arr2 = e;
                        } else {
                            throw NotFoundException.y;
                        }
                    } else {
                        throw NotFoundException.y;
                    }
                }
                int i103 = fv02.b;
                if ((fv02.g instanceof xu5) && r66Arr2.length >= i9) {
                    r66 r6624 = r66Arr2[0];
                    r66Arr2[0] = r66Arr2[2];
                    r66Arr2[2] = r6624;
                }
                n66 n663 = new n66(fv02.a, (byte[]) fv02.d, r66Arr2, d50.H);
                List list2 = (List) fv02.e;
                if (list2 != null) {
                    n663.b(q66.x, list2);
                }
                String str3 = (String) fv02.f;
                if (str3 != null) {
                    n663.b(q66, str3);
                }
                if (i103 >= 0 && (i = fv02.c) >= 0) {
                    n663.b(q66.E, Integer.valueOf(i));
                    n663.b(q66.F, Integer.valueOf(i103));
                }
                return n663;
        }
    }

    public final void reset() {
        int i = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
