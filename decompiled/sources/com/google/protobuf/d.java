package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d implements og6 {
    public static final int[] j = new int[0];
    public static final Unsafe k = st7.j();
    public final int[] a;
    public final Object[] b;
    public final a c;
    public final int[] d;
    public final int e;
    public final fz4 f;
    public final r74 g;
    public final g h;
    public final kf4 i;

    public d(int[] iArr, Object[] objArr, a aVar, int[] iArr2, int i2, fz4 fz4, r74 r74, g gVar, aa2 aa2, kf4 kf4) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i2;
        this.f = fz4;
        this.g = r74;
        this.h = gVar;
        this.c = aVar;
        this.i = kf4;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b) {
            return ((b) obj).n();
        }
        return true;
    }

    public static d q(dw5 dw5, fz4 fz4, r74 r74, g gVar, aa2 aa2, kf4 kf4) {
        if (dw5 instanceof dw5) {
            return r(dw5, fz4, r74, gVar, aa2, kf4);
        }
        ku4.a();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0363  */
    public static d r(dw5 dw5, fz4 fz4, r74 r74, g gVar, aa2 aa2, kf4 kf4) {
        int i2;
        char c2;
        int[] iArr;
        int i3;
        char c3;
        char c4;
        char c5;
        int i4;
        int i5;
        int i6;
        int[] iArr2;
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Field u;
        char charAt;
        int i16;
        int i17;
        Object obj;
        Field u2;
        Object obj2;
        Field field;
        int i18;
        int i19;
        char charAt2;
        int i20;
        char charAt3;
        int i21;
        char charAt4;
        int i22;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        char charAt7;
        int i25;
        char charAt8;
        int i26;
        int i27;
        int i28;
        char charAt9;
        int i29;
        char charAt10;
        int i30;
        char charAt11;
        dw5 dw52 = dw5;
        String str2 = dw52.b;
        int length = str2.length();
        char c6 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i2 = i31 + 1;
                if (str2.charAt(i31) < 55296) {
                    break;
                }
                i31 = i2;
            }
        } else {
            i2 = 1;
        }
        int i32 = i2 + 1;
        char charAt12 = str2.charAt(i2);
        if (charAt12 >= 55296) {
            char c7 = charAt12 & 8191;
            int i33 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt11 = str2.charAt(i32);
                if (charAt11 < 55296) {
                    break;
                }
                c7 |= (charAt11 & 8191) << i33;
                i33 += 13;
                i32 = i30;
            }
            charAt12 = c7 | (charAt11 << i33);
            i32 = i30;
        }
        if (charAt12 == 0) {
            c4 = 0;
            c3 = 0;
            i3 = 0;
            c2 = 0;
            iArr = j;
            c5 = 0;
        } else {
            int i34 = i32 + 1;
            char charAt13 = str2.charAt(i32);
            if (charAt13 >= 55296) {
                char c8 = charAt13 & 8191;
                int i35 = 13;
                while (true) {
                    i29 = i34 + 1;
                    charAt10 = str2.charAt(i34);
                    if (charAt10 < 55296) {
                        break;
                    }
                    c8 |= (charAt10 & 8191) << i35;
                    i35 += 13;
                    i34 = i29;
                }
                charAt13 = c8 | (charAt10 << i35);
                i34 = i29;
            }
            int i36 = i34 + 1;
            char charAt14 = str2.charAt(i34);
            if (charAt14 >= 55296) {
                char c9 = charAt14 & 8191;
                int i37 = 13;
                while (true) {
                    i28 = i36 + 1;
                    charAt9 = str2.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    c9 |= (charAt9 & 8191) << i37;
                    i37 += 13;
                    i36 = i28;
                }
                charAt14 = c9 | (charAt9 << i37);
                i36 = i28;
            }
            int i38 = i36 + 1;
            if (str2.charAt(i36) >= 55296) {
                while (true) {
                    i27 = i38 + 1;
                    if (str2.charAt(i38) < 55296) {
                        break;
                    }
                    i38 = i27;
                }
                i38 = i27;
            }
            int i39 = i38 + 1;
            if (str2.charAt(i38) >= 55296) {
                while (true) {
                    i26 = i39 + 1;
                    if (str2.charAt(i39) < 55296) {
                        break;
                    }
                    i39 = i26;
                }
                i39 = i26;
            }
            int i40 = i39 + 1;
            c4 = str2.charAt(i39);
            if (c4 >= 55296) {
                char c10 = c4 & 8191;
                int i41 = 13;
                while (true) {
                    i25 = i40 + 1;
                    charAt8 = str2.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    c10 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i40 = i25;
                }
                c4 = c10 | (charAt8 << i41);
                i40 = i25;
            }
            int i42 = i40 + 1;
            c3 = str2.charAt(i40);
            if (c3 >= 55296) {
                char c11 = c3 & 8191;
                int i43 = 13;
                while (true) {
                    i24 = i42 + 1;
                    charAt7 = str2.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    c11 |= (charAt7 & 8191) << i43;
                    i43 += 13;
                    i42 = i24;
                }
                c3 = c11 | (charAt7 << i43);
                i42 = i24;
            }
            int i44 = i42 + 1;
            char charAt15 = str2.charAt(i42);
            if (charAt15 >= 55296) {
                char c12 = charAt15 & 8191;
                int i45 = 13;
                while (true) {
                    i23 = i44 + 1;
                    charAt6 = str2.charAt(i44);
                    if (charAt6 < 55296) {
                        break;
                    }
                    c12 |= (charAt6 & 8191) << i45;
                    i45 += 13;
                    i44 = i23;
                }
                charAt15 = c12 | (charAt6 << i45);
                i44 = i23;
            }
            int i46 = i44 + 1;
            char charAt16 = str2.charAt(i44);
            if (charAt16 >= 55296) {
                char c13 = charAt16 & 8191;
                int i47 = 13;
                while (true) {
                    i22 = i46 + 1;
                    charAt5 = str2.charAt(i46);
                    if (charAt5 < 55296) {
                        break;
                    }
                    c13 |= (charAt5 & 8191) << i47;
                    i47 += 13;
                    i46 = i22;
                }
                charAt16 = c13 | (charAt5 << i47);
                i46 = i22;
            }
            int i48 = (charAt13 * 2) + charAt14;
            c5 = charAt13;
            i32 = i46;
            iArr = new int[(charAt16 + c3 + charAt15)];
            i3 = i48;
            c2 = charAt16;
        }
        Unsafe unsafe = k;
        Object[] objArr = dw52.c;
        Class<?> cls = dw52.a.getClass();
        int[] iArr3 = new int[(c4 * 3)];
        Object[] objArr2 = new Object[(c4 * 2)];
        int i49 = c3 + c2;
        char c14 = c2;
        int i50 = 0;
        int i51 = 0;
        while (i32 < length) {
            int i52 = i32 + 1;
            char charAt17 = str2.charAt(i32);
            if (charAt17 >= c6) {
                char c15 = charAt17 & 8191;
                int i53 = i52;
                int i54 = 13;
                while (true) {
                    i21 = i53 + 1;
                    charAt4 = str2.charAt(i53);
                    if (charAt4 < c6) {
                        break;
                    }
                    c15 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i53 = i21;
                }
                charAt17 = c15 | (charAt4 << i54);
                i4 = i21;
            } else {
                i4 = i52;
            }
            int i55 = i4 + 1;
            char charAt18 = str2.charAt(i4);
            if (charAt18 >= c6) {
                char c16 = charAt18 & 8191;
                int i56 = i55;
                int i57 = 13;
                while (true) {
                    i20 = i56 + 1;
                    charAt3 = str2.charAt(i56);
                    i5 = length;
                    if (charAt3 < 55296) {
                        break;
                    }
                    c16 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i56 = i20;
                    length = i5;
                }
                charAt18 = c16 | (charAt3 << i57);
                i6 = i20;
            } else {
                i5 = length;
                i6 = i55;
            }
            char c17 = charAt18 & 255;
            int i58 = charAt17;
            if ((charAt18 & 1024) != 0) {
                iArr[i50] = i51;
                i50++;
            }
            char c18 = c5;
            if (c17 >= '3') {
                int i59 = i6 + 1;
                char charAt19 = str2.charAt(i6);
                char c19 = 55296;
                if (charAt19 >= 55296) {
                    char c20 = charAt19 & 8191;
                    int i60 = 13;
                    while (true) {
                        i19 = i59 + 1;
                        charAt2 = str2.charAt(i59);
                        if (charAt2 < c19) {
                            break;
                        }
                        c20 |= (charAt2 & 8191) << i60;
                        i60 += 13;
                        i59 = i19;
                        c19 = 55296;
                    }
                    charAt19 = c20 | (charAt2 << i60);
                    i59 = i19;
                }
                int i61 = c17 - '3';
                char c21 = charAt19;
                if (i61 == 9 || i61 == 17) {
                    i18 = i3 + 1;
                    objArr2[((i51 / 3) * 2) + 1] = objArr[i3];
                } else {
                    if (i61 == 12 && (b81.c(dw52.a(), 1) || (charAt18 & 2048) != 0)) {
                        i18 = i3 + 1;
                        objArr2[((i51 / 3) * 2) + 1] = objArr[i3];
                    }
                    int i62 = c21 * 2;
                    obj = objArr[i62];
                    int i63 = i62;
                    if (!(obj instanceof Field)) {
                        u2 = (Field) obj;
                    } else {
                        u2 = u(cls, (String) obj);
                        objArr[i63] = u2;
                    }
                    iArr2 = iArr3;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(u2);
                    int i64 = i63 + 1;
                    obj2 = objArr[i64];
                    int i65 = objectFieldOffset;
                    if (!(obj2 instanceof Field)) {
                        field = (Field) obj2;
                    } else {
                        field = u(cls, (String) obj2);
                        objArr[i64] = field;
                    }
                    i8 = (int) unsafe.objectFieldOffset(field);
                    i9 = i65;
                    i7 = i59;
                    str = str2;
                    i10 = 0;
                }
                i3 = i18;
                int i622 = c21 * 2;
                obj = objArr[i622];
                int i632 = i622;
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(u2);
                int i642 = i632 + 1;
                obj2 = objArr[i642];
                int i652 = objectFieldOffset2;
                if (!(obj2 instanceof Field)) {
                }
                i8 = (int) unsafe.objectFieldOffset(field);
                i9 = i652;
                i7 = i59;
                str = str2;
                i10 = 0;
            } else {
                iArr2 = iArr3;
                int i66 = i3 + 1;
                Field u3 = u(cls, (String) objArr[i3]);
                if (c17 == 9 || c17 == 17) {
                    i16 = i66;
                    objArr2[((i51 / 3) * 2) + 1] = u3.getType();
                } else if (c17 == 27 || c17 == '1') {
                    i17 = i3 + 2;
                    objArr2[((i51 / 3) * 2) + 1] = objArr[i66];
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(u3);
                    if ((charAt18 & 4096) == 0 || c17 > 17) {
                        str = str2;
                        i15 = 1048575;
                        i7 = i6;
                        i14 = 0;
                    } else {
                        int i67 = i6 + 1;
                        char charAt20 = str2.charAt(i6);
                        if (charAt20 >= 55296) {
                            char c22 = charAt20 & 8191;
                            int i68 = 13;
                            while (true) {
                                i7 = i67 + 1;
                                charAt = str2.charAt(i67);
                                if (charAt < 55296) {
                                    break;
                                }
                                c22 |= (charAt & 8191) << i68;
                                i68 += 13;
                                i67 = i7;
                            }
                            charAt20 = c22 | (charAt << i68);
                        } else {
                            i7 = i67;
                        }
                        int i69 = (charAt20 / ' ') + (c18 * 2);
                        Object obj3 = objArr[i69];
                        if (obj3 instanceof Field) {
                            u = (Field) obj3;
                        } else {
                            u = u(cls, (String) obj3);
                            objArr[i69] = u;
                        }
                        str = str2;
                        char c23 = charAt20;
                        i15 = (int) unsafe.objectFieldOffset(u);
                        i14 = c23 % ' ';
                    }
                    if (c17 < 18 || c17 > '1') {
                        int i70 = objectFieldOffset3;
                        i8 = i15;
                        i10 = i14;
                        i9 = i70;
                    } else {
                        int i71 = i49 + 1;
                        iArr[i49] = objectFieldOffset3;
                        int i72 = objectFieldOffset3;
                        i8 = i15;
                        i10 = i14;
                        i9 = i72;
                        i49 = i71;
                    }
                } else if (c17 == 12 || c17 == 30 || c17 == ',') {
                    i16 = i66;
                    if (dw52.a() == 1 || (charAt18 & 2048) != 0) {
                        i17 = i3 + 2;
                        objArr2[((i51 / 3) * 2) + 1] = objArr[i16];
                        int objectFieldOffset32 = (int) unsafe.objectFieldOffset(u3);
                        if ((charAt18 & 4096) == 0 || c17 > 17) {
                        }
                        if (c17 < 18 || c17 > '1') {
                        }
                    }
                } else if (c17 == '2') {
                    int i73 = c14 + 1;
                    iArr[c14] = i51;
                    int i74 = (i51 / 3) * 2;
                    int i75 = i3 + 2;
                    objArr2[i74] = objArr[i66];
                    if ((charAt18 & 2048) != 0) {
                        objArr2[i74 + 1] = objArr[i75];
                        i17 = i3 + 3;
                        c14 = i73;
                    } else {
                        c14 = i73;
                        i17 = i75;
                    }
                    int objectFieldOffset322 = (int) unsafe.objectFieldOffset(u3);
                    if ((charAt18 & 4096) == 0 || c17 > 17) {
                    }
                    if (c17 < 18 || c17 > '1') {
                    }
                } else {
                    i16 = i66;
                }
                i17 = i16;
                int objectFieldOffset3222 = (int) unsafe.objectFieldOffset(u3);
                if ((charAt18 & 4096) == 0 || c17 > 17) {
                }
                if (c17 < 18 || c17 > '1') {
                }
            }
            int i76 = i51 + 1;
            iArr2[i51] = i58;
            int i77 = i51 + 2;
            int i78 = i10;
            if ((charAt18 & 512) != 0) {
                i11 = 536870912;
            } else {
                i11 = 0;
            }
            int i79 = i11;
            if ((charAt18 & 256) != 0) {
                i12 = 268435456;
            } else {
                i12 = 0;
            }
            int i80 = i79 | i12;
            if ((charAt18 & 2048) != 0) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 0;
            }
            iArr2[i76] = i80 | i13 | (c17 << 20) | i9;
            i51 += 3;
            iArr2[i77] = (i78 << 20) | i8;
            str2 = str;
            i32 = i7;
            length = i5;
            c5 = c18;
            iArr3 = iArr2;
            c6 = 55296;
        }
        return new d(iArr3, objArr2, dw52.a, iArr, c2, fz4, r74, gVar, aa2, kf4);
    }

    public static int s(long j2, Object obj) {
        return ((Integer) st7.c.i(j2, obj)).intValue();
    }

    public static long t(long j2, Object obj) {
        return ((Long) st7.c.i(j2, obj)).longValue();
    }

    public static Field u(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder q = b81.q("Field ", str, " for ");
            q.append(cls.getName());
            q.append(" not found. Known fields are ");
            q.append(Arrays.toString(declaredFields));
            throw new RuntimeException(q.toString());
        }
    }

    public static int w(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (m(obj)) {
            obj2.getClass();
            int i2 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i2 < iArr.length) {
                    int x = x(i2);
                    long j2 = (long) (x & 1048575);
                    int i3 = iArr[i2];
                    switch (w(x)) {
                        case b85.b:
                            obj3 = obj;
                            if (!k(i2, obj2)) {
                                break;
                            } else {
                                qt7 qt7 = st7.c;
                                qt7.m(obj3, j2, qt7.e(j2, obj2));
                                v(i2, obj3);
                                continue;
                            }
                        case 1:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                qt7 qt72 = st7.c;
                                qt72.n(obj3, j2, qt72.f(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                qt7 qt73 = st7.c;
                                qt73.p(obj3, j2, qt73.h(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                qt7 qt74 = st7.c;
                                qt74.p(obj3, j2, qt74.h(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.n(st7.c.g(j2, obj2), j2, obj3);
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                qt7 qt75 = st7.c;
                                qt75.p(obj3, j2, qt75.h(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.n(st7.c.g(j2, obj2), j2, obj3);
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                qt7 qt76 = st7.c;
                                qt76.k(obj3, j2, qt76.c(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.o(obj3, j2, st7.c.i(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            obj3 = obj;
                            o(i2, obj3, obj2);
                            continue;
                        case 10:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.o(obj3, j2, st7.c.i(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.n(st7.c.g(j2, obj2), j2, obj3);
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.n(st7.c.g(j2, obj2), j2, obj3);
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.n(st7.c.g(j2, obj2), j2, obj3);
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                qt7 qt77 = st7.c;
                                qt77.p(obj3, j2, qt77.h(j2, obj2));
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case h75.g /*15*/:
                            obj3 = obj;
                            if (k(i2, obj2)) {
                                st7.n(st7.c.g(j2, obj2), j2, obj3);
                                v(i2, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (k(i2, obj2)) {
                                qt7 qt78 = st7.c;
                                obj3 = obj;
                                qt78.p(obj3, j2, qt78.h(j2, obj2));
                                v(i2, obj3);
                                continue;
                            }
                        case 17:
                            o(i2, obj, obj2);
                            obj3 = obj;
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case h75.h /*48*/:
                        case 49:
                            this.g.b(obj, j2, obj2);
                            obj3 = obj;
                            break;
                        case 50:
                            Class cls = f.a;
                            qt7 qt79 = st7.c;
                            Object i4 = qt79.i(j2, obj);
                            Object i5 = qt79.i(j2, obj2);
                            this.i.getClass();
                            if4 if4 = (if4) i4;
                            if4 if42 = (if4) i5;
                            if (!if42.isEmpty()) {
                                if (!if4.w) {
                                    if4 = if4.c();
                                }
                                if4.b();
                                if (!if42.isEmpty()) {
                                    if4.putAll(if42);
                                }
                            }
                            st7.o(obj, j2, if4);
                            obj3 = obj;
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (n(i3, i2, obj2)) {
                                st7.o(obj, j2, st7.c.i(j2, obj2));
                                st7.n(i3, (long) (iArr[i2 + 2] & 1048575), obj);
                            }
                            obj3 = obj;
                            break;
                        case 60:
                            p(i2, obj, obj2);
                            obj3 = obj;
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (n(i3, i2, obj2)) {
                                st7.o(obj, j2, st7.c.i(j2, obj2));
                                st7.n(i3, (long) (iArr[i2 + 2] & 1048575), obj);
                            }
                            obj3 = obj;
                            break;
                        case 68:
                            p(i2, obj, obj2);
                            obj3 = obj;
                            break;
                    }
                    obj3 = obj;
                    i2 += 3;
                    obj = obj3;
                } else {
                    f.j(this.h, obj, obj2);
                    return;
                }
            }
        } else {
            kj6.o("Mutating immutable message: ", obj);
        }
    }

    public final void b(Object obj) {
        if (m(obj)) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                bVar.r(Integer.MAX_VALUE);
                bVar.memoizedHashCode = 0;
                bVar.o();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int x = x(i2);
                long j2 = (long) (1048575 & x);
                int w = w(x);
                if (w != 9) {
                    if (w == 60 || w == 68) {
                        if (n(iArr[i2], i2, obj)) {
                            j(i2).b(k.getObject(obj, j2));
                        }
                    } else {
                        switch (w) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case h75.h /*48*/:
                            case 49:
                                this.g.a(j2, obj);
                                continue;
                            case 50:
                                Unsafe unsafe = k;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.i.getClass();
                                    ((if4) object).w = false;
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (k(i2, obj)) {
                    j(i2).b(k.getObject(obj, j2));
                }
            }
            ((ys7) this.h).getClass();
            h hVar = ((b) obj).unknownFields;
            if (hVar.e) {
                hVar.e = false;
            }
        }
    }

    public final boolean c(Object obj) {
        int i2;
        int i3;
        int i4;
        Object obj2 = obj;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.e) {
            int i8 = this.d[i7];
            int[] iArr = this.a;
            int i9 = iArr[i8];
            int x = x(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = k.getInt(obj2, (long) i11);
                }
                i4 = i8;
                i2 = i6;
                i3 = i11;
            } else {
                int i13 = i6;
                i3 = i5;
                i4 = i8;
                i2 = i13;
            }
            if ((268435456 & x) == 0 || l(obj2, i4, i3, i2, i12)) {
                int w = w(x);
                if (w != 9 && w != 17) {
                    if (w != 27) {
                        if (w == 60 || w == 68) {
                            if (n(i9, i4, obj2)) {
                                if (!j(i4).c(st7.c.i((long) (x & 1048575), obj2))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (w != 49) {
                            if (w != 50) {
                                continue;
                            } else {
                                Object i14 = st7.c.i((long) (x & 1048575), obj2);
                                this.i.getClass();
                                if4 if4 = (if4) i14;
                                if (if4.isEmpty()) {
                                    continue;
                                } else {
                                    if (((qc8) ((df4) this.b[(i4 / 3) * 2]).a.y).w != tc8.E) {
                                        continue;
                                    } else {
                                        og6 og6 = null;
                                        for (Object next : if4.values()) {
                                            if (og6 == null) {
                                                og6 = au5.c.a(next.getClass());
                                            }
                                            if (!og6.c(next)) {
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    List list = (List) st7.c.i((long) (x & 1048575), obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        og6 j2 = j(i4);
                        int i15 = 0;
                        while (i15 < list.size()) {
                            if (j2.c(list.get(i15))) {
                                i15++;
                            }
                        }
                        continue;
                    }
                } else if (l(obj2, i4, i3, i2, i12)) {
                    if (!j(i4).c(st7.c.i((long) (x & 1048575), obj2))) {
                    }
                } else {
                    continue;
                }
                i7++;
                i5 = i3;
                i6 = i2;
            }
            return false;
        }
        return true;
    }

    public final b d() {
        this.f.getClass();
        return (b) ((b) this.c).k(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r4 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0198, code lost:
        r3 = (r3 * 53) + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r3 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0216, code lost:
        if (r4 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0278, code lost:
        r2 = r2 + 3;
     */
    public final int e(b bVar) {
        int i2;
        int a2;
        int i3;
        int[] iArr = this.a;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int x = x(i4);
            int i6 = iArr[i4];
            long j2 = (long) (1048575 & x);
            int i7 = 1237;
            int i8 = 37;
            switch (w(x)) {
                case b85.b:
                    i2 = i5 * 53;
                    a2 = rf3.a(Double.doubleToLongBits(st7.c.e(j2, bVar)));
                case 1:
                    i2 = i5 * 53;
                    a2 = Float.floatToIntBits(st7.c.f(j2, bVar));
                case 2:
                    i2 = i5 * 53;
                    a2 = rf3.a(st7.c.h(j2, bVar));
                case 3:
                    i2 = i5 * 53;
                    a2 = rf3.a(st7.c.h(j2, bVar));
                case 4:
                    i2 = i5 * 53;
                    a2 = st7.c.g(j2, bVar);
                case 5:
                    i2 = i5 * 53;
                    a2 = rf3.a(st7.c.h(j2, bVar));
                case 6:
                    i2 = i5 * 53;
                    a2 = st7.c.g(j2, bVar);
                case 7:
                    i3 = i5 * 53;
                    boolean c2 = st7.c.c(j2, bVar);
                    Charset charset = rf3.a;
                    break;
                case 8:
                    i2 = i5 * 53;
                    a2 = ((String) st7.c.i(j2, bVar)).hashCode();
                case 9:
                    Object i9 = st7.c.i(j2, bVar);
                    if (i9 != null) {
                        i8 = i9.hashCode();
                        break;
                    }
                    break;
                case 10:
                    i2 = i5 * 53;
                    a2 = st7.c.i(j2, bVar).hashCode();
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    i2 = i5 * 53;
                    a2 = st7.c.g(j2, bVar);
                case 12:
                    i2 = i5 * 53;
                    a2 = st7.c.g(j2, bVar);
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    i2 = i5 * 53;
                    a2 = st7.c.g(j2, bVar);
                case 14:
                    i2 = i5 * 53;
                    a2 = rf3.a(st7.c.h(j2, bVar));
                case h75.g /*15*/:
                    i2 = i5 * 53;
                    a2 = st7.c.g(j2, bVar);
                case 16:
                    i2 = i5 * 53;
                    a2 = rf3.a(st7.c.h(j2, bVar));
                case 17:
                    Object i10 = st7.c.i(j2, bVar);
                    if (i10 != null) {
                        i8 = i10.hashCode();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case h75.h /*48*/:
                case 49:
                    i2 = i5 * 53;
                    a2 = st7.c.i(j2, bVar).hashCode();
                case 50:
                    i2 = i5 * 53;
                    a2 = st7.c.i(j2, bVar).hashCode();
                case 51:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = rf3.a(Double.doubleToLongBits(((Double) st7.c.i(j2, bVar)).doubleValue()));
                    }
                case 52:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = Float.floatToIntBits(((Float) st7.c.i(j2, bVar)).floatValue());
                    }
                case 53:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = rf3.a(t(j2, bVar));
                    }
                case 54:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = rf3.a(t(j2, bVar));
                    }
                case 55:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = s(j2, bVar);
                    }
                case 56:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = rf3.a(t(j2, bVar));
                    }
                case 57:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = s(j2, bVar);
                    }
                case 58:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        boolean booleanValue = ((Boolean) st7.c.i(j2, bVar)).booleanValue();
                        Charset charset2 = rf3.a;
                        break;
                    }
                case 59:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = ((String) st7.c.i(j2, bVar)).hashCode();
                    }
                case 60:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = st7.c.i(j2, bVar).hashCode();
                    }
                case 61:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = st7.c.i(j2, bVar).hashCode();
                    }
                case 62:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = s(j2, bVar);
                    }
                case 63:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = s(j2, bVar);
                    }
                case 64:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = s(j2, bVar);
                    }
                case 65:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = rf3.a(t(j2, bVar));
                    }
                case 66:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = s(j2, bVar);
                    }
                case 67:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = rf3.a(t(j2, bVar));
                    }
                case 68:
                    if (!n(i6, i4, bVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        a2 = st7.c.i(j2, bVar).hashCode();
                    }
            }
        }
        ((ys7) this.h).getClass();
        return bVar.unknownFields.hashCode() + (i5 * 53);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0267, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x031a, code lost:
        r7 = r7 + r22;
        r10 = (defpackage.qc8) r10.y;
        r15 = defpackage.vs0.c(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0324, code lost:
        if (r10 != r3) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0326, code lost:
        r15 = r15 * 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x032c, code lost:
        switch(r10.ordinal()) {
            case b85.b :int: goto L_0x0410;
            case 1: goto L_0x0409;
            case 2: goto L_0x03fe;
            case 3: goto L_0x03f3;
            case 4: goto L_0x03e8;
            case 5: goto L_0x03e1;
            case 6: goto L_0x03db;
            case 7: goto L_0x03d3;
            case 8: goto L_0x03bd;
            case 9: goto L_0x03b4;
            case 10: goto L_0x03a7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER :int: goto L_0x038e;
            case 12: goto L_0x0382;
            case ry4.PERF_SESSIONS_FIELD_NUMBER :int: goto L_0x0368;
            case 14: goto L_0x035f;
            case h75.g :int: goto L_0x0356;
            case 16: goto L_0x0345;
            case 17: goto L_0x0333;
            default: goto L_0x032f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032f, code lost:
        defpackage.rf2.r("There is no way to get here, but the compiler thinks otherwise.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0332, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0333, code lost:
        r3 = ((java.lang.Long) r14).longValue();
        r3 = defpackage.vs0.e((r3 << r21) ^ (r3 >> r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0345, code lost:
        r3 = ((java.lang.Integer) r14).intValue();
        r3 = defpackage.vs0.d((r3 >> 31) ^ (r3 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0356, code lost:
        ((java.lang.Long) r14).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x035b, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x035f, code lost:
        ((java.lang.Integer) r14).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0364, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x036a, code lost:
        if ((r14 instanceof defpackage.jr) == false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x036c, code lost:
        r3 = defpackage.vs0.a(((defpackage.jr) r14).w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0376, code lost:
        r3 = defpackage.vs0.a(((java.lang.Integer) r14).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0382, code lost:
        r3 = defpackage.vs0.d(((java.lang.Integer) r14).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0390, code lost:
        if ((r14 instanceof defpackage.yf0) == false) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0392, code lost:
        r3 = ((defpackage.yf0) r14).size();
        r4 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x039c, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x039f, code lost:
        r3 = ((byte[]) r14).length;
        r4 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03a7, code lost:
        r3 = ((com.google.protobuf.b) ((com.google.protobuf.a) r14)).h((defpackage.og6) null);
        r4 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03b4, code lost:
        r3 = ((com.google.protobuf.b) ((com.google.protobuf.a) r14)).h((defpackage.og6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03bf, code lost:
        if ((r14 instanceof defpackage.yf0) == false) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03c1, code lost:
        r3 = ((defpackage.yf0) r14).size();
        r4 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03cc, code lost:
        r3 = defpackage.vs0.b((java.lang.String) r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03d3, code lost:
        ((java.lang.Boolean) r14).getClass();
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03db, code lost:
        ((java.lang.Integer) r14).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03e1, code lost:
        ((java.lang.Long) r14).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03e8, code lost:
        r3 = defpackage.vs0.a(((java.lang.Integer) r14).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03f3, code lost:
        r3 = defpackage.vs0.e(((java.lang.Long) r14).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03fe, code lost:
        r3 = defpackage.vs0.e(((java.lang.Long) r14).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0409, code lost:
        ((java.lang.Float) r14).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0410, code lost:
        ((java.lang.Double) r14).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0417, code lost:
        r3 = (r3 + r15) + r7;
        r13 = defpackage.pb4.a(r3, r3, r8, r13);
        r10 = r20;
        r15 = r21;
        r3 = r23;
        r4 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x042b, code lost:
        r3 = r23;
        r4 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r9 = r9 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0627, code lost:
        r5 = (r5 * r4) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0629, code lost:
        r9 = r9 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x065a, code lost:
        r9 = r9 + r3;
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        r9 = r9 + (r10 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0877, code lost:
        r9 = r9 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0897, code lost:
        r9 = r9 + (r5 + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0899, code lost:
        r0 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x08b6, code lost:
        r9 = r9 + (r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x08c5, code lost:
        r0 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x08c7, code lost:
        r9 = r9 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x08c8, code lost:
        r0 = r30;
        r1 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        r5 = r5 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08da, code lost:
        r0 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        r5 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        r5 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025e, code lost:
        r7 = 8;
     */
    public final int f(b bVar) {
        int i2;
        int c2;
        int c3;
        int c4;
        int e2;
        int c5;
        int a2;
        int c6;
        int b2;
        int i3;
        int c7;
        int i4;
        int i5;
        int i6;
        int c8;
        int size;
        int i7;
        int c9;
        int i8;
        int b3;
        int i9;
        int i10;
        int i11;
        int i12;
        int size2;
        int d2;
        int c10;
        int c11;
        int c12;
        int e3;
        int c13;
        int a3;
        int c14;
        int b4;
        d dVar = this;
        b bVar2 = bVar;
        Unsafe unsafe = k;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = dVar.a;
            if (i15 < iArr.length) {
                int x = dVar.x(i15);
                int w = w(x);
                int i18 = iArr[i15];
                int i19 = iArr[i15 + 2];
                int i20 = i19 & i13;
                int i21 = 1;
                if (w <= 17) {
                    if (i20 != i14) {
                        if (i20 == i13) {
                            i16 = 0;
                        } else {
                            i16 = unsafe.getInt(bVar2, (long) i20);
                        }
                        i14 = i20;
                    }
                    i2 = 1 << (i19 >>> 20);
                } else {
                    i2 = 0;
                }
                long j2 = (long) (x & i13);
                if (w >= rc2.DOUBLE_LIST_PACKED.w) {
                    int i22 = rc2.SINT64_LIST_PACKED.w;
                }
                char c15 = '?';
                switch (w) {
                    case b85.b:
                        if (!dVar.l(bVar2, i15, i14, i16, i2)) {
                            break;
                        } else {
                            c2 = vs0.c(i18) + 8;
                        }
                    case 1:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            c3 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 2:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            long j3 = unsafe.getLong(bVar2, j2);
                            c4 = vs0.c(i18);
                            e2 = vs0.e(j3);
                        }
                        break;
                    case 3:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            long j4 = unsafe.getLong(bVar2, j2);
                            c4 = vs0.c(i18);
                            e2 = vs0.e(j4);
                        }
                        break;
                    case 4:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            int i23 = unsafe.getInt(bVar2, j2);
                            c5 = vs0.c(i18);
                            a2 = vs0.a(i23);
                        }
                        break;
                    case 5:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            c6 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 6:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            c3 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 7:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            int c16 = vs0.c(i18) + 1;
                        }
                        break;
                    case 8:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            Object object = unsafe.getObject(bVar2, j2);
                            if (object instanceof yf0) {
                                int c17 = vs0.c(i18);
                                int size3 = ((yf0) object).size();
                                b2 = pb4.a(size3, size3, c17, i17);
                            } else {
                                b2 = vs0.b((String) object) + vs0.c(i18) + i17;
                            }
                            i17 = b2;
                            break;
                        }
                        break;
                    case 9:
                        if (!dVar.l(bVar2, i15, i14, i16, i2)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(bVar2, j2);
                            og6 j5 = dVar.j(i15);
                            Class cls = f.a;
                            int c18 = vs0.c(i18);
                            int h2 = ((a) object2).h(j5);
                            i17 = pb4.a(h2, h2, c18, i17);
                            break;
                        }
                    case 10:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            int c19 = vs0.c(i18);
                            int size4 = ((yf0) unsafe.getObject(bVar2, j2)).size();
                            i17 = pb4.a(size4, size4, c19, i17);
                            break;
                        }
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            int i24 = unsafe.getInt(bVar2, j2);
                            c5 = vs0.c(i18);
                            a2 = vs0.d(i24);
                        }
                        break;
                    case 12:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            int i25 = unsafe.getInt(bVar2, j2);
                            c5 = vs0.c(i18);
                            a2 = vs0.a(i25);
                        }
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            c3 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 14:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            c6 = vs0.c(i18);
                            break;
                        }
                        break;
                    case h75.g /*15*/:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            int i26 = unsafe.getInt(bVar2, j2);
                            c5 = vs0.c(i18);
                            a2 = vs0.d((i26 >> 31) ^ (i26 << 1));
                        }
                        break;
                    case 16:
                        if (dVar.l(bVar2, i15, i14, i16, i2)) {
                            long j6 = unsafe.getLong(bVar2, j2);
                            c4 = vs0.c(i18);
                            e2 = vs0.e((j6 >> 63) ^ (j6 << 1));
                        }
                        break;
                    case 17:
                        if (!dVar.l(bVar2, i15, i14, i16, i2)) {
                            break;
                        } else {
                            c2 = ((a) unsafe.getObject(bVar2, j2)).h(dVar.j(i15)) + (vs0.c(i18) * 2);
                        }
                    case 18:
                        i3 = i14;
                        int i27 = i16;
                        c7 = f.c(i18, (List) unsafe.getObject(bVar2, j2));
                        break;
                    case 19:
                        i3 = i14;
                        int i28 = i16;
                        c7 = f.b(i18, (List) unsafe.getObject(bVar2, j2));
                        break;
                    case 20:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list = (List) unsafe.getObject(bVar2, j2);
                        Class cls2 = f.a;
                        if (list.size() != 0) {
                            c8 = (vs0.c(i18) * list.size()) + f.e(list);
                            break;
                        }
                    case 21:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list2 = (List) unsafe.getObject(bVar2, j2);
                        Class cls3 = f.a;
                        size = list2.size();
                        if (size != 0) {
                            i7 = f.i(list2);
                            c9 = vs0.c(i18);
                            break;
                        }
                        c8 = i6;
                        break;
                    case 22:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list3 = (List) unsafe.getObject(bVar2, j2);
                        Class cls4 = f.a;
                        size = list3.size();
                        if (size != 0) {
                            i7 = f.d(list3);
                            c9 = vs0.c(i18);
                            break;
                        }
                        c8 = i6;
                        break;
                    case 23:
                        i3 = i14;
                        int i29 = i16;
                        c7 = f.c(i18, (List) unsafe.getObject(bVar2, j2));
                        break;
                    case 24:
                        i3 = i14;
                        int i30 = i16;
                        c7 = f.b(i18, (List) unsafe.getObject(bVar2, j2));
                        break;
                    case 25:
                        i4 = i14;
                        i5 = i16;
                        Class cls5 = f.a;
                        int size5 = ((List) unsafe.getObject(bVar2, j2)).size();
                        if (size5 == 0) {
                            i8 = 0;
                        } else {
                            i8 = (vs0.c(i18) + 1) * size5;
                        }
                        i17 += i8;
                        break;
                    case 26:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list4 = (List) unsafe.getObject(bVar2, j2);
                        Class cls6 = f.a;
                        int size6 = list4.size();
                        if (size6 != 0) {
                            int c20 = vs0.c(i18) * size6;
                            if (!(list4 instanceof e44)) {
                                for (int i31 = 0; i31 < size6; i31++) {
                                    Object obj = list4.get(i31);
                                    if (obj instanceof yf0) {
                                        int size7 = ((yf0) obj).size();
                                        b3 = vs0.d(size7) + size7 + c8;
                                    } else {
                                        b3 = vs0.b((String) obj) + c8;
                                    }
                                }
                                break;
                            } else {
                                e44 e44 = (e44) list4;
                                for (int i32 = 0; i32 < size6; i32++) {
                                    Object u = e44.u(i32);
                                    if (u instanceof yf0) {
                                        int size8 = ((yf0) u).size();
                                        c20 = vs0.d(size8) + size8 + c8;
                                    } else {
                                        c20 = vs0.b((String) u) + c8;
                                    }
                                }
                                break;
                            }
                        }
                    case 27:
                        i4 = i14;
                        i5 = i16;
                        List list5 = (List) unsafe.getObject(bVar2, j2);
                        og6 j7 = dVar.j(i15);
                        Class cls7 = f.a;
                        int size9 = list5.size();
                        if (size9 == 0) {
                            i9 = 0;
                        } else {
                            i9 = vs0.c(i18) * size9;
                            for (int i33 = 0; i33 < size9; i33++) {
                                int h3 = ((a) list5.get(i33)).h(j7);
                                i9 += vs0.d(h3) + h3;
                            }
                        }
                        i17 += i9;
                        break;
                    case 28:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list6 = (List) unsafe.getObject(bVar2, j2);
                        Class cls8 = f.a;
                        int size10 = list6.size();
                        if (size10 != 0) {
                            c8 = vs0.c(i18) * size10;
                            for (int i34 = 0; i34 < list6.size(); i34++) {
                                int size11 = ((yf0) list6.get(i34)).size();
                                c8 += vs0.d(size11) + size11;
                            }
                            break;
                        }
                    case 29:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list7 = (List) unsafe.getObject(bVar2, j2);
                        Class cls9 = f.a;
                        size = list7.size();
                        if (size != 0) {
                            i7 = f.h(list7);
                            c9 = vs0.c(i18);
                            break;
                        }
                        c8 = i6;
                        break;
                    case 30:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list8 = (List) unsafe.getObject(bVar2, j2);
                        Class cls10 = f.a;
                        size = list8.size();
                        if (size != 0) {
                            i7 = f.a(list8);
                            c9 = vs0.c(i18);
                            break;
                        }
                        c8 = i6;
                        break;
                    case 31:
                        i3 = i14;
                        int i35 = i16;
                        c7 = f.b(i18, (List) unsafe.getObject(bVar2, j2));
                        break;
                    case 32:
                        i3 = i14;
                        int i36 = i16;
                        c7 = f.c(i18, (List) unsafe.getObject(bVar2, j2));
                        break;
                    case 33:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list9 = (List) unsafe.getObject(bVar2, j2);
                        Class cls11 = f.a;
                        size = list9.size();
                        if (size != 0) {
                            i7 = f.f(list9);
                            c9 = vs0.c(i18);
                            break;
                        }
                        c8 = i6;
                        break;
                    case 34:
                        i4 = i14;
                        i5 = i16;
                        i6 = 0;
                        List list10 = (List) unsafe.getObject(bVar2, j2);
                        Class cls12 = f.a;
                        size = list10.size();
                        if (size != 0) {
                            i7 = f.g(list10);
                            c9 = vs0.c(i18);
                            break;
                        }
                        c8 = i6;
                        break;
                    case 35:
                        i4 = i14;
                        i5 = i16;
                        Class cls13 = f.a;
                        int size12 = ((List) unsafe.getObject(bVar2, j2)).size() * 8;
                        if (size12 > 0) {
                            i17 = pb4.a(size12, vs0.c(i18), size12, i17);
                            break;
                        }
                        break;
                    case 36:
                        i4 = i14;
                        i5 = i16;
                        Class cls14 = f.a;
                        int size13 = ((List) unsafe.getObject(bVar2, j2)).size() * 4;
                        if (size13 > 0) {
                            i17 = pb4.a(size13, vs0.c(i18), size13, i17);
                            break;
                        }
                        break;
                    case 37:
                        i4 = i14;
                        i5 = i16;
                        int e4 = f.e((List) unsafe.getObject(bVar2, j2));
                        if (e4 > 0) {
                            i17 = pb4.a(e4, vs0.c(i18), e4, i17);
                            break;
                        }
                        break;
                    case 38:
                        i4 = i14;
                        i5 = i16;
                        int i37 = f.i((List) unsafe.getObject(bVar2, j2));
                        if (i37 > 0) {
                            i17 = pb4.a(i37, vs0.c(i18), i37, i17);
                            break;
                        }
                        break;
                    case 39:
                        i4 = i14;
                        i5 = i16;
                        int d3 = f.d((List) unsafe.getObject(bVar2, j2));
                        if (d3 > 0) {
                            i17 = pb4.a(d3, vs0.c(i18), d3, i17);
                            break;
                        }
                        break;
                    case 40:
                        i4 = i14;
                        i5 = i16;
                        Class cls15 = f.a;
                        int size14 = ((List) unsafe.getObject(bVar2, j2)).size() * 8;
                        if (size14 > 0) {
                            i17 = pb4.a(size14, vs0.c(i18), size14, i17);
                            break;
                        }
                        break;
                    case 41:
                        i4 = i14;
                        i5 = i16;
                        Class cls16 = f.a;
                        int size15 = ((List) unsafe.getObject(bVar2, j2)).size() * 4;
                        if (size15 > 0) {
                            i17 = pb4.a(size15, vs0.c(i18), size15, i17);
                            break;
                        }
                        break;
                    case 42:
                        i4 = i14;
                        i5 = i16;
                        Class cls17 = f.a;
                        int size16 = ((List) unsafe.getObject(bVar2, j2)).size();
                        if (size16 > 0) {
                            i17 = pb4.a(size16, vs0.c(i18), size16, i17);
                            break;
                        }
                        break;
                    case 43:
                        i4 = i14;
                        i5 = i16;
                        int h4 = f.h((List) unsafe.getObject(bVar2, j2));
                        if (h4 > 0) {
                            i17 = pb4.a(h4, vs0.c(i18), h4, i17);
                            break;
                        }
                        break;
                    case 44:
                        i4 = i14;
                        i5 = i16;
                        int a4 = f.a((List) unsafe.getObject(bVar2, j2));
                        if (a4 > 0) {
                            i17 = pb4.a(a4, vs0.c(i18), a4, i17);
                            break;
                        }
                        break;
                    case 45:
                        i4 = i14;
                        i5 = i16;
                        Class cls18 = f.a;
                        int size17 = ((List) unsafe.getObject(bVar2, j2)).size() * 4;
                        if (size17 > 0) {
                            i17 = pb4.a(size17, vs0.c(i18), size17, i17);
                            break;
                        }
                        break;
                    case 46:
                        i4 = i14;
                        i5 = i16;
                        Class cls19 = f.a;
                        int size18 = ((List) unsafe.getObject(bVar2, j2)).size() * 8;
                        if (size18 > 0) {
                            i17 = pb4.a(size18, vs0.c(i18), size18, i17);
                            break;
                        }
                        break;
                    case 47:
                        i4 = i14;
                        i5 = i16;
                        int f2 = f.f((List) unsafe.getObject(bVar2, j2));
                        if (f2 > 0) {
                            i17 = pb4.a(f2, vs0.c(i18), f2, i17);
                            break;
                        }
                        break;
                    case h75.h /*48*/:
                        i4 = i14;
                        i5 = i16;
                        int g2 = f.g((List) unsafe.getObject(bVar2, j2));
                        if (g2 > 0) {
                            i17 = pb4.a(g2, vs0.c(i18), g2, i17);
                            break;
                        }
                        break;
                    case 49:
                        i4 = i14;
                        i5 = i16;
                        List list11 = (List) unsafe.getObject(bVar2, j2);
                        og6 j8 = dVar.j(i15);
                        Class cls20 = f.a;
                        int size19 = list11.size();
                        if (size19 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            for (int i38 = 0; i38 < size19; i38++) {
                                i10 += ((a) list11.get(i38)).h(j8) + (vs0.c(i18) * 2);
                            }
                        }
                        i17 += i10;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(bVar2, j2);
                        Object obj2 = dVar.b[(i15 / 3) * 2];
                        dVar.i.getClass();
                        if4 if4 = (if4) object3;
                        df4 df4 = (df4) obj2;
                        if (if4.isEmpty()) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            for (Map.Entry entry : if4.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                df4.getClass();
                                int c21 = vs0.c(i18);
                                char c22 = c15;
                                wr0 wr0 = df4.a;
                                int i39 = i21;
                                qc8 qc8 = (qc8) wr0.x;
                                int i40 = oc2.c;
                                int c23 = vs0.c(i39);
                                int i41 = i14;
                                hc8 hc8 = qc8.GROUP;
                                if (qc8 == hc8) {
                                    c23 *= 2;
                                }
                                int i42 = i16;
                                switch (qc8.ordinal()) {
                                    case b85.b:
                                        ((Double) key).getClass();
                                        break;
                                    case 1:
                                        ((Float) key).getClass();
                                        break;
                                    case 2:
                                        i12 = vs0.e(((Long) key).longValue());
                                        break;
                                    case 3:
                                        i12 = vs0.e(((Long) key).longValue());
                                        break;
                                    case 4:
                                        i12 = vs0.a(((Integer) key).intValue());
                                        break;
                                    case 5:
                                        ((Long) key).getClass();
                                        break;
                                    case 6:
                                        ((Integer) key).getClass();
                                        break;
                                    case 7:
                                        ((Boolean) key).getClass();
                                        i12 = i39;
                                        break;
                                    case 8:
                                        if (!(key instanceof yf0)) {
                                            i12 = vs0.b((String) key);
                                            break;
                                        } else {
                                            size2 = ((yf0) key).size();
                                            d2 = vs0.d(size2);
                                        }
                                    case 9:
                                        i12 = ((b) ((a) key)).h((og6) null);
                                        break;
                                    case 10:
                                        size2 = ((b) ((a) key)).h((og6) null);
                                        d2 = vs0.d(size2);
                                        i12 = size2 + d2;
                                        break;
                                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                                        if (key instanceof yf0) {
                                            size2 = ((yf0) key).size();
                                            d2 = vs0.d(size2);
                                        } else {
                                            size2 = ((byte[]) key).length;
                                            d2 = vs0.d(size2);
                                        }
                                        i12 = size2 + d2;
                                        break;
                                    case 12:
                                        i12 = vs0.d(((Integer) key).intValue());
                                        break;
                                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                                        if (!(key instanceof jr)) {
                                            i12 = vs0.a(((Integer) key).intValue());
                                            break;
                                        } else {
                                            i12 = vs0.a(((jr) key).w);
                                            break;
                                        }
                                    case 14:
                                        ((Integer) key).getClass();
                                        break;
                                    case h75.g /*15*/:
                                        ((Long) key).getClass();
                                        break;
                                    case 16:
                                        int intValue = ((Integer) key).intValue();
                                        i12 = vs0.d((intValue >> 31) ^ (intValue << 1));
                                        break;
                                    case 17:
                                        long longValue = ((Long) key).longValue();
                                        i12 = vs0.e((longValue << i39) ^ (longValue >> c22));
                                        break;
                                    default:
                                        rf2.r("There is no way to get here, but the compiler thinks otherwise.");
                                        return 0;
                                }
                            }
                        }
                        i4 = i14;
                        i5 = i16;
                        i17 += i11;
                        break;
                    case 51:
                        if (dVar.n(i18, i15, bVar2)) {
                            c10 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 52:
                        if (dVar.n(i18, i15, bVar2)) {
                            c11 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 53:
                        if (dVar.n(i18, i15, bVar2)) {
                            long t = t(j2, bVar2);
                            c12 = vs0.c(i18);
                            e3 = vs0.e(t);
                        }
                        break;
                    case 54:
                        if (dVar.n(i18, i15, bVar2)) {
                            long t2 = t(j2, bVar2);
                            c12 = vs0.c(i18);
                            e3 = vs0.e(t2);
                        }
                        break;
                    case 55:
                        if (dVar.n(i18, i15, bVar2)) {
                            int s = s(j2, bVar2);
                            c13 = vs0.c(i18);
                            a3 = vs0.a(s);
                            break;
                        }
                        break;
                    case 56:
                        if (dVar.n(i18, i15, bVar2)) {
                            c10 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 57:
                        if (dVar.n(i18, i15, bVar2)) {
                            c11 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 58:
                        if (dVar.n(i18, i15, bVar2)) {
                            c14 = vs0.c(i18) + 1;
                        }
                        break;
                    case 59:
                        if (dVar.n(i18, i15, bVar2)) {
                            Object object4 = unsafe.getObject(bVar2, j2);
                            if (object4 instanceof yf0) {
                                int c24 = vs0.c(i18);
                                int size20 = ((yf0) object4).size();
                                b4 = pb4.a(size20, size20, c24, i17);
                            } else {
                                b4 = vs0.b((String) object4) + vs0.c(i18) + i17;
                            }
                            i17 = b4;
                            break;
                        }
                        break;
                    case 60:
                        if (dVar.n(i18, i15, bVar2)) {
                            Object object5 = unsafe.getObject(bVar2, j2);
                            og6 j9 = dVar.j(i15);
                            Class cls21 = f.a;
                            int c25 = vs0.c(i18);
                            int h5 = ((a) object5).h(j9);
                            i17 = pb4.a(h5, h5, c25, i17);
                            break;
                        }
                        break;
                    case 61:
                        if (dVar.n(i18, i15, bVar2)) {
                            int c26 = vs0.c(i18);
                            int size21 = ((yf0) unsafe.getObject(bVar2, j2)).size();
                            i17 = pb4.a(size21, size21, c26, i17);
                            break;
                        }
                        break;
                    case 62:
                        if (dVar.n(i18, i15, bVar2)) {
                            int s2 = s(j2, bVar2);
                            c13 = vs0.c(i18);
                            a3 = vs0.d(s2);
                            break;
                        }
                        break;
                    case 63:
                        if (dVar.n(i18, i15, bVar2)) {
                            int s3 = s(j2, bVar2);
                            c13 = vs0.c(i18);
                            a3 = vs0.a(s3);
                            break;
                        }
                        break;
                    case 64:
                        if (dVar.n(i18, i15, bVar2)) {
                            c11 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 65:
                        if (dVar.n(i18, i15, bVar2)) {
                            c10 = vs0.c(i18);
                            break;
                        }
                        break;
                    case 66:
                        if (dVar.n(i18, i15, bVar2)) {
                            int s4 = s(j2, bVar2);
                            c13 = vs0.c(i18);
                            a3 = vs0.d((s4 >> 31) ^ (s4 << 1));
                            break;
                        }
                        break;
                    case 67:
                        if (dVar.n(i18, i15, bVar2)) {
                            long t3 = t(j2, bVar2);
                            c12 = vs0.c(i18);
                            e3 = vs0.e((t3 << 1) ^ (t3 >> 63));
                        }
                        break;
                    case 68:
                        if (dVar.n(i18, i15, bVar2)) {
                            c14 = ((a) unsafe.getObject(bVar2, j2)).h(dVar.j(i15)) + (vs0.c(i18) * 2);
                        }
                        break;
                }
            } else {
                ((ys7) dVar.h).getClass();
                return bVar2.unknownFields.a() + i17;
            }
            i15 += 3;
            i13 = 1048575;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (com.google.protobuf.f.k(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (com.google.protobuf.f.k(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        if (com.google.protobuf.f.k(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        if (com.google.protobuf.f.k(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018a, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019f, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b4, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (com.google.protobuf.f.k(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r4 = false;
     */
    public final boolean g(b bVar, b bVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                int x = x(i2);
                long j2 = (long) (x & 1048575);
                switch (w(x)) {
                    case b85.b:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt7 = st7.c;
                            break;
                        }
                    case 1:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt72 = st7.c;
                            break;
                        }
                    case 2:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt73 = st7.c;
                            break;
                        }
                    case 3:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt74 = st7.c;
                            break;
                        }
                    case 4:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt75 = st7.c;
                            break;
                        }
                    case 5:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt76 = st7.c;
                            break;
                        }
                    case 6:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt77 = st7.c;
                            break;
                        }
                    case 7:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt78 = st7.c;
                            break;
                        }
                    case 8:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt79 = st7.c;
                            break;
                        }
                    case 9:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt710 = st7.c;
                            break;
                        }
                    case 10:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt711 = st7.c;
                            break;
                        }
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt712 = st7.c;
                            break;
                        }
                    case 12:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt713 = st7.c;
                            break;
                        }
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt714 = st7.c;
                            break;
                        }
                    case 14:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt715 = st7.c;
                            break;
                        }
                    case h75.g /*15*/:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt716 = st7.c;
                            break;
                        }
                    case 16:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt717 = st7.c;
                            break;
                        }
                    case 17:
                        if (i(bVar, bVar2, i2)) {
                            qt7 qt718 = st7.c;
                            break;
                        }
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case h75.h /*48*/:
                    case 49:
                        qt7 qt719 = st7.c;
                        z = f.k(qt719.i(j2, bVar), qt719.i(j2, bVar2));
                        break;
                    case 50:
                        qt7 qt720 = st7.c;
                        z = f.k(qt720.i(j2, bVar), qt720.i(j2, bVar2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = (long) (iArr[i2 + 2] & 1048575);
                        qt7 qt721 = st7.c;
                        if (qt721.g(j3, bVar) == qt721.g(j3, bVar2)) {
                            break;
                        }
                }
                if (z) {
                    i2 += 3;
                }
            } else {
                ys7 ys7 = (ys7) this.h;
                ys7.getClass();
                h hVar = bVar.unknownFields;
                ys7.getClass();
                if (!hVar.equals(bVar2.unknownFields)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void h(Object obj, wv2 wv2) {
        wv2.getClass();
        y(obj, wv2);
    }

    public final boolean i(b bVar, b bVar2, int i2) {
        if (k(i2, bVar) == k(i2, bVar2)) {
            return true;
        }
        return false;
    }

    public final og6 j(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.b;
        og6 og6 = (og6) objArr[i3];
        if (og6 != null) {
            return og6;
        }
        og6 a2 = au5.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a2;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110 A[RETURN] */
    public final boolean k(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 == 1048575) {
            int x = x(i2);
            long j3 = (long) (x & 1048575);
            switch (w(x)) {
                case b85.b:
                    if (Double.doubleToRawLongBits(st7.c.e(j3, obj)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(st7.c.f(j3, obj)) != 0) {
                    }
                    break;
                case 2:
                    if (st7.c.h(j3, obj) != 0) {
                    }
                    break;
                case 3:
                    if (st7.c.h(j3, obj) != 0) {
                    }
                    break;
                case 4:
                    if (st7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 5:
                    if (st7.c.h(j3, obj) != 0) {
                    }
                    break;
                case 6:
                    if (st7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 7:
                    return st7.c.c(j3, obj);
                case 8:
                    Object i4 = st7.c.i(j3, obj);
                    if (i4 instanceof String) {
                        return !((String) i4).isEmpty();
                    }
                    if (i4 instanceof yf0) {
                        return !yf0.y.equals(i4);
                    }
                    ku4.v();
                    return false;
                case 9:
                    if (st7.c.i(j3, obj) != null) {
                    }
                    break;
                case 10:
                    return !yf0.y.equals(st7.c.i(j3, obj));
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    if (st7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 12:
                    if (st7.c.g(j3, obj) != 0) {
                    }
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    if (st7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 14:
                    if (st7.c.h(j3, obj) != 0) {
                    }
                    break;
                case h75.g /*15*/:
                    if (st7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 16:
                    if (st7.c.h(j3, obj) != 0) {
                    }
                    break;
                case 17:
                    if (st7.c.i(j3, obj) != null) {
                    }
                    break;
                default:
                    ku4.v();
                    return false;
            }
        } else if (((1 << (i3 >>> 20)) & st7.c.g(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean l(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return k(i2, obj);
        }
        if ((i4 & i5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n(int i2, int i3, Object obj) {
        if (st7.c.g((long) (this.a[i3 + 2] & 1048575), obj) == i2) {
            return true;
        }
        return false;
    }

    public final void o(int i2, Object obj, Object obj2) {
        if (k(i2, obj2)) {
            long x = (long) (x(i2) & 1048575);
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, x);
            if (object != null) {
                og6 j2 = j(i2);
                if (!k(i2, obj)) {
                    if (!m(object)) {
                        unsafe.putObject(obj, x, object);
                    } else {
                        b d2 = j2.d();
                        j2.a(d2, object);
                        unsafe.putObject(obj, x, d2);
                    }
                    v(i2, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, x);
                if (!m(object2)) {
                    b d3 = j2.d();
                    j2.a(d3, object2);
                    unsafe.putObject(obj, x, d3);
                    object2 = d3;
                }
                j2.a(object2, object);
                return;
            }
            kj6.j("Source subfield ", this.a[i2], " is present but null: ", obj2);
        }
    }

    public final void p(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (n(i3, i2, obj2)) {
            long x = (long) (x(i2) & 1048575);
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, x);
            if (object != null) {
                og6 j2 = j(i2);
                if (!n(i3, i2, obj)) {
                    if (!m(object)) {
                        unsafe.putObject(obj, x, object);
                    } else {
                        b d2 = j2.d();
                        j2.a(d2, object);
                        unsafe.putObject(obj, x, d2);
                    }
                    st7.n(i3, (long) (iArr[i2 + 2] & 1048575), obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, x);
                if (!m(object2)) {
                    b d3 = j2.d();
                    j2.a(d3, object2);
                    unsafe.putObject(obj, x, d3);
                    object2 = d3;
                }
                j2.a(object2, object);
                return;
            }
            kj6.j("Source subfield ", iArr[i2], " is present but null: ", obj2);
        }
    }

    public final void v(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            st7.n((1 << (i3 >>> 20)) | st7.c.g(j2, obj), j2, obj);
        }
    }

    public final int x(int i2) {
        return this.a[i2 + 1];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x034e, code lost:
        r4 = r4 + r20;
        r15 = defpackage.vs0.c(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0354, code lost:
        if (r13 != r3) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0356, code lost:
        r15 = r15 * 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x035c, code lost:
        switch(r13.ordinal()) {
            case b85.b :int: goto L_0x0442;
            case 1: goto L_0x043b;
            case 2: goto L_0x0430;
            case 3: goto L_0x0425;
            case 4: goto L_0x041a;
            case 5: goto L_0x0413;
            case 6: goto L_0x040d;
            case 7: goto L_0x0405;
            case 8: goto L_0x03ef;
            case 9: goto L_0x03e5;
            case 10: goto L_0x03d7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER :int: goto L_0x03be;
            case 12: goto L_0x03b2;
            case ry4.PERF_SESSIONS_FIELD_NUMBER :int: goto L_0x0398;
            case 14: goto L_0x038f;
            case h75.g :int: goto L_0x0386;
            case 16: goto L_0x0375;
            case 17: goto L_0x0363;
            default: goto L_0x035f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x035f, code lost:
        defpackage.rf2.r("There is no way to get here, but the compiler thinks otherwise.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0362, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0363, code lost:
        r22 = ((java.lang.Long) r5).longValue();
        r3 = defpackage.vs0.e((r22 << (r16 ? 1 : 0)) ^ (r22 >> 63));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0375, code lost:
        r3 = ((java.lang.Integer) r5).intValue();
        r3 = defpackage.vs0.d((r3 >> 31) ^ (r3 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0386, code lost:
        ((java.lang.Long) r5).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x038b, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x038f, code lost:
        ((java.lang.Integer) r5).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0394, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x039a, code lost:
        if ((r5 instanceof defpackage.jr) == false) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x039c, code lost:
        r3 = defpackage.vs0.a(((defpackage.jr) r5).w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03a6, code lost:
        r3 = defpackage.vs0.a(((java.lang.Integer) r5).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03b2, code lost:
        r3 = defpackage.vs0.d(((java.lang.Integer) r5).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03c0, code lost:
        if ((r5 instanceof defpackage.yf0) == false) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03c2, code lost:
        r3 = ((defpackage.yf0) r5).size();
        r5 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03cc, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03cf, code lost:
        r3 = ((byte[]) r5).length;
        r5 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03d7, code lost:
        r3 = ((com.google.protobuf.b) ((com.google.protobuf.a) r5)).h((defpackage.og6) null);
        r5 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03e5, code lost:
        r3 = ((com.google.protobuf.b) ((com.google.protobuf.a) r5)).h((defpackage.og6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f1, code lost:
        if ((r5 instanceof defpackage.yf0) == false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03f3, code lost:
        r3 = ((defpackage.yf0) r5).size();
        r5 = defpackage.vs0.d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03fe, code lost:
        r3 = defpackage.vs0.b((java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0405, code lost:
        ((java.lang.Boolean) r5).getClass();
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x040d, code lost:
        ((java.lang.Integer) r5).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0413, code lost:
        ((java.lang.Long) r5).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x041a, code lost:
        r3 = defpackage.vs0.a(((java.lang.Integer) r5).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0425, code lost:
        r3 = defpackage.vs0.e(((java.lang.Long) r5).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0430, code lost:
        r3 = defpackage.vs0.e(((java.lang.Long) r5).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x043b, code lost:
        ((java.lang.Float) r5).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0442, code lost:
        ((java.lang.Double) r5).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0449, code lost:
        r14.p((r3 + r15) + r4);
        r3 = r18.getKey();
        r4 = r18.getValue();
        defpackage.oc2.b(r14, r11, r16 ? 1 : 0, r3);
        r3 = r19;
        defpackage.oc2.b(r14, r13, r3, r4);
        r5 = r3;
        r3 = r21;
        r4 = r26;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x046d, code lost:
        r3 = r21;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05b6, code lost:
        r3 = r21;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x078e, code lost:
        r0 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x091b, code lost:
        r2 = r2 + 3;
        r10 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0274, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x028d, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0296, code lost:
        r4 = 4;
     */
    public final void y(Object obj, wv2 wv2) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size;
        int d2;
        int h2;
        d dVar = this;
        Object obj2 = obj;
        wv2 wv22 = wv2;
        int[] iArr = dVar.a;
        int length = iArr.length;
        Unsafe unsafe = k;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int x = dVar.x(i10);
            int i12 = iArr[i10];
            int w = w(x);
            if (w <= 17) {
                int i13 = iArr[i10 + 2];
                z = true;
                int i14 = i13 & i8;
                if (i14 != i9) {
                    if (i14 == i8) {
                        i11 = 0;
                    } else {
                        i11 = unsafe.getInt(obj2, (long) i14);
                    }
                    i9 = i14;
                }
                i2 = 1 << (i13 >>> 20);
            } else {
                z = true;
                i2 = 0;
            }
            long j2 = (long) (x & i8);
            int i15 = 2;
            switch (w) {
                case b85.b:
                    if (!dVar.l(obj2, i10, i9, i11, i2)) {
                        break;
                    } else {
                        double e2 = st7.c.e(j2, obj2);
                        vs0 vs0 = (vs0) wv22.x;
                        vs0.getClass();
                        vs0.k(Double.doubleToRawLongBits(e2), i12);
                        break;
                    }
                case 1:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        float f2 = st7.c.f(j2, obj2);
                        vs0 vs02 = (vs0) wv22.x;
                        vs02.getClass();
                        vs02.i(i12, Float.floatToRawIntBits(f2));
                        break;
                    }
                    break;
                case 2:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        ((vs0) wv22.x).q(unsafe.getLong(obj2, j2), i12);
                        break;
                    }
                    break;
                case 3:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        ((vs0) wv22.x).q(unsafe.getLong(obj2, j2), i12);
                        break;
                    }
                    break;
                case 4:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        int i16 = unsafe.getInt(obj2, j2);
                        vs0 vs03 = (vs0) wv22.x;
                        vs03.o(i12, 0);
                        vs03.m(i16);
                        break;
                    }
                case 5:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        ((vs0) wv22.x).k(unsafe.getLong(obj2, j2), i12);
                    }
                    break;
                case 6:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        ((vs0) wv22.x).i(i12, unsafe.getInt(obj2, j2));
                    }
                    break;
                case 7:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        boolean c2 = st7.c.c(j2, obj2);
                        vs0 vs04 = (vs0) wv22.x;
                        vs04.o(i12, 0);
                        vs04.f(c2 ? (byte) 1 : 0);
                    }
                    break;
                case 8:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        Object object = unsafe.getObject(obj2, j2);
                        if (object instanceof String) {
                            vs0 vs05 = (vs0) wv22.x;
                            vs05.o(i12, 2);
                            vs05.n((String) object);
                        } else {
                            vs0 vs06 = (vs0) wv22.x;
                            vs06.o(i12, 2);
                            vs06.h((yf0) object);
                        }
                    }
                    break;
                case 9:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        wv22.v(i12, unsafe.getObject(obj2, j2), dVar.j(i10));
                    }
                case 10:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        vs0 vs07 = (vs0) wv22.x;
                        vs07.o(i12, 2);
                        vs07.h((yf0) unsafe.getObject(obj2, j2));
                    }
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        int i17 = unsafe.getInt(obj2, j2);
                        vs0 vs08 = (vs0) wv22.x;
                        vs08.o(i12, 0);
                        vs08.p(i17);
                    }
                    break;
                case 12:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        int i18 = unsafe.getInt(obj2, j2);
                        vs0 vs09 = (vs0) wv22.x;
                        vs09.o(i12, 0);
                        vs09.m(i18);
                        break;
                    }
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        ((vs0) wv22.x).i(i12, unsafe.getInt(obj2, j2));
                    }
                    break;
                case 14:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        ((vs0) wv22.x).k(unsafe.getLong(obj2, j2), i12);
                    }
                    break;
                case h75.g /*15*/:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        int i19 = unsafe.getInt(obj2, j2);
                        vs0 vs010 = (vs0) wv22.x;
                        vs010.o(i12, 0);
                        vs010.p((i19 >> 31) ^ (i19 << 1));
                    }
                    break;
                case 16:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        long j3 = unsafe.getLong(obj2, j2);
                        ((vs0) wv22.x).q((j3 >> 63) ^ (j3 << 1), i12);
                    }
                    break;
                case 17:
                    if (dVar.l(obj2, i10, i9, i11, i2)) {
                        wv22.t(i12, unsafe.getObject(obj2, j2), dVar.j(i10));
                    }
                case 18:
                    i3 = i9;
                    i4 = i11;
                    f.m(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 19:
                    i3 = i9;
                    i4 = i11;
                    f.q(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 20:
                    i3 = i9;
                    i4 = i11;
                    f.s(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 21:
                    i3 = i9;
                    i4 = i11;
                    f.y(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 22:
                    i3 = i9;
                    i4 = i11;
                    f.r(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 23:
                    i3 = i9;
                    i4 = i11;
                    f.p(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 24:
                    i3 = i9;
                    i4 = i11;
                    f.o(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 25:
                    i3 = i9;
                    i4 = i11;
                    f.l(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 26:
                    i5 = i9;
                    i6 = i11;
                    int i20 = iArr[i10];
                    List list = (List) unsafe.getObject(obj2, j2);
                    Class cls = f.a;
                    if (list != null && !list.isEmpty()) {
                        vs0 vs011 = (vs0) wv22.x;
                        if (!(list instanceof e44)) {
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                vs011.o(i20, 2);
                                vs011.n((String) list.get(i21));
                            }
                            break;
                        } else {
                            e44 e44 = (e44) list;
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                Object u = e44.u(i22);
                                if (u instanceof String) {
                                    vs011.o(i20, 2);
                                    vs011.n((String) u);
                                } else {
                                    vs011.o(i20, 2);
                                    vs011.h((yf0) u);
                                }
                            }
                            break;
                        }
                    }
                case 27:
                    i5 = i9;
                    i6 = i11;
                    int i23 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj2, j2);
                    og6 j4 = dVar.j(i10);
                    Class cls2 = f.a;
                    if (list2 != null && !list2.isEmpty()) {
                        wv22.getClass();
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            wv22.v(i23, list2.get(i24), j4);
                        }
                        break;
                    }
                case 28:
                    i5 = i9;
                    i6 = i11;
                    int i25 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj2, j2);
                    Class cls3 = f.a;
                    if (list3 != null && !list3.isEmpty()) {
                        wv22.getClass();
                        for (int i26 = 0; i26 < list3.size(); i26++) {
                            vs0 vs012 = (vs0) wv22.x;
                            vs012.o(i25, 2);
                            vs012.h((yf0) list3.get(i26));
                        }
                        break;
                    }
                case 29:
                    i3 = i9;
                    i4 = i11;
                    f.x(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 30:
                    i3 = i9;
                    i4 = i11;
                    f.n(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 31:
                    i3 = i9;
                    i4 = i11;
                    f.t(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 32:
                    i3 = i9;
                    i4 = i11;
                    f.u(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 33:
                    i3 = i9;
                    i4 = i11;
                    f.v(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 34:
                    i3 = i9;
                    i4 = i11;
                    f.w(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, false);
                    break;
                case 35:
                    i5 = i9;
                    i6 = i11;
                    f.m(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 36:
                    i5 = i9;
                    i6 = i11;
                    f.q(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 37:
                    i5 = i9;
                    i6 = i11;
                    f.s(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 38:
                    i5 = i9;
                    i6 = i11;
                    f.y(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 39:
                    i5 = i9;
                    i6 = i11;
                    f.r(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 40:
                    i5 = i9;
                    i6 = i11;
                    f.p(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 41:
                    i5 = i9;
                    i6 = i11;
                    f.o(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 42:
                    i5 = i9;
                    i6 = i11;
                    f.l(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 43:
                    i5 = i9;
                    i6 = i11;
                    f.x(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 44:
                    i5 = i9;
                    i6 = i11;
                    f.n(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 45:
                    i5 = i9;
                    i6 = i11;
                    f.t(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 46:
                    i5 = i9;
                    i6 = i11;
                    f.u(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case 47:
                    i5 = i9;
                    i6 = i11;
                    f.v(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, z);
                    break;
                case h75.h /*48*/:
                    i5 = i9;
                    i6 = i11;
                    f.w(iArr[i10], (List) unsafe.getObject(obj2, j2), wv22, true);
                    break;
                case 49:
                    i5 = i9;
                    i6 = i11;
                    int i27 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj2, j2);
                    og6 j5 = dVar.j(i10);
                    Class cls4 = f.a;
                    if (list4 != null && !list4.isEmpty()) {
                        wv22.getClass();
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            wv22.t(i27, list4.get(i28), j5);
                        }
                        break;
                    }
                case 50:
                    Object object2 = unsafe.getObject(obj2, j2);
                    if (object2 != null) {
                        Object obj3 = dVar.b[(i10 / 3) * 2];
                        dVar.i.getClass();
                        wr0 wr0 = ((df4) obj3).a;
                        qc8 qc8 = (qc8) wr0.y;
                        qc8 qc82 = (qc8) wr0.x;
                        vs0 vs013 = (vs0) wv22.x;
                        vs013.getClass();
                        for (Map.Entry entry : ((if4) object2).entrySet()) {
                            vs013.o(i12, i15);
                            Object key = entry.getKey();
                            int i29 = i15;
                            Object value = entry.getValue();
                            int i30 = oc2.c;
                            int c3 = vs0.c(z ? 1 : 0);
                            int i31 = i9;
                            hc8 hc8 = qc8.GROUP;
                            if (qc82 == hc8) {
                                c3 *= 2;
                            }
                            int i32 = i11;
                            switch (qc82.ordinal()) {
                                case b85.b:
                                    ((Double) key).getClass();
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    break;
                                case 2:
                                    i7 = vs0.e(((Long) key).longValue());
                                    break;
                                case 3:
                                    i7 = vs0.e(((Long) key).longValue());
                                    break;
                                case 4:
                                    i7 = vs0.a(((Integer) key).intValue());
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    i7 = z;
                                    break;
                                case 8:
                                    if (!(key instanceof yf0)) {
                                        i7 = vs0.b((String) key);
                                        break;
                                    } else {
                                        size = ((yf0) key).size();
                                        d2 = vs0.d(size);
                                    }
                                case 9:
                                    h2 = ((b) ((a) key)).h((og6) null);
                                    break;
                                case 10:
                                    int h3 = ((b) ((a) key)).h((og6) null);
                                    h2 = vs0.d(h3) + h3;
                                    break;
                                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                                    if (key instanceof yf0) {
                                        size = ((yf0) key).size();
                                        d2 = vs0.d(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        d2 = vs0.d(size);
                                    }
                                    i7 = size + d2;
                                    break;
                                case 12:
                                    i7 = vs0.d(((Integer) key).intValue());
                                    break;
                                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                                    if (!(key instanceof jr)) {
                                        i7 = vs0.a(((Integer) key).intValue());
                                        break;
                                    } else {
                                        i7 = vs0.a(((jr) key).w);
                                        break;
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    break;
                                case h75.g /*15*/:
                                    ((Long) key).getClass();
                                    break;
                                case 16:
                                    int intValue = ((Integer) key).intValue();
                                    h2 = vs0.d((intValue << 1) ^ (intValue >> 31));
                                    break;
                                case 17:
                                    long longValue = ((Long) key).longValue();
                                    h2 = vs0.e((longValue << z) ^ (longValue >> 63));
                                    break;
                                default:
                                    rf2.r("There is no way to get here, but the compiler thinks otherwise.");
                                    return;
                            }
                        }
                    }
                    i5 = i9;
                    i6 = i11;
                    break;
                case 51:
                    if (dVar.n(i12, i10, obj2)) {
                        double doubleValue = ((Double) st7.c.i(j2, obj2)).doubleValue();
                        vs0 vs014 = (vs0) wv22.x;
                        vs014.getClass();
                        vs014.k(Double.doubleToRawLongBits(doubleValue), i12);
                    }
                case 52:
                    if (dVar.n(i12, i10, obj2)) {
                        float floatValue = ((Float) st7.c.i(j2, obj2)).floatValue();
                        vs0 vs015 = (vs0) wv22.x;
                        vs015.getClass();
                        vs015.i(i12, Float.floatToRawIntBits(floatValue));
                    }
                case 53:
                    if (dVar.n(i12, i10, obj2)) {
                        ((vs0) wv22.x).q(t(j2, obj2), i12);
                    }
                case 54:
                    if (dVar.n(i12, i10, obj2)) {
                        ((vs0) wv22.x).q(t(j2, obj2), i12);
                    }
                case 55:
                    if (dVar.n(i12, i10, obj2)) {
                        int s = s(j2, obj2);
                        vs0 vs016 = (vs0) wv22.x;
                        vs016.o(i12, 0);
                        vs016.m(s);
                    }
                case 56:
                    if (dVar.n(i12, i10, obj2)) {
                        ((vs0) wv22.x).k(t(j2, obj2), i12);
                    }
                case 57:
                    if (dVar.n(i12, i10, obj2)) {
                        ((vs0) wv22.x).i(i12, s(j2, obj2));
                    }
                case 58:
                    if (dVar.n(i12, i10, obj2)) {
                        boolean booleanValue = ((Boolean) st7.c.i(j2, obj2)).booleanValue();
                        vs0 vs017 = (vs0) wv22.x;
                        vs017.o(i12, 0);
                        vs017.f(booleanValue ? (byte) 1 : 0);
                    }
                case 59:
                    if (dVar.n(i12, i10, obj2)) {
                        Object object3 = unsafe.getObject(obj2, j2);
                        if (object3 instanceof String) {
                            vs0 vs018 = (vs0) wv22.x;
                            vs018.o(i12, 2);
                            vs018.n((String) object3);
                        } else {
                            vs0 vs019 = (vs0) wv22.x;
                            vs019.o(i12, 2);
                            vs019.h((yf0) object3);
                        }
                    }
                case 60:
                    if (dVar.n(i12, i10, obj2)) {
                        wv22.v(i12, unsafe.getObject(obj2, j2), dVar.j(i10));
                    }
                case 61:
                    if (dVar.n(i12, i10, obj2)) {
                        vs0 vs020 = (vs0) wv22.x;
                        vs020.o(i12, 2);
                        vs020.h((yf0) unsafe.getObject(obj2, j2));
                    }
                case 62:
                    if (!dVar.n(i12, i10, obj2)) {
                        break;
                    } else {
                        int s2 = s(j2, obj2);
                        vs0 vs021 = (vs0) wv22.x;
                        vs021.o(i12, 0);
                        vs021.p(s2);
                    }
                case 63:
                    if (dVar.n(i12, i10, obj2)) {
                        int s3 = s(j2, obj2);
                        vs0 vs022 = (vs0) wv22.x;
                        vs022.o(i12, 0);
                        vs022.m(s3);
                        break;
                    }
                case 64:
                    if (dVar.n(i12, i10, obj2)) {
                        ((vs0) wv22.x).i(i12, s(j2, obj2));
                    }
                    break;
                case 65:
                    if (dVar.n(i12, i10, obj2)) {
                        ((vs0) wv22.x).k(t(j2, obj2), i12);
                    }
                    break;
                case 66:
                    if (dVar.n(i12, i10, obj2)) {
                        int s4 = s(j2, obj2);
                        vs0 vs023 = (vs0) wv22.x;
                        vs023.o(i12, 0);
                        vs023.p((s4 >> 31) ^ (s4 << 1));
                    }
                    break;
                case 67:
                    if (dVar.n(i12, i10, obj2)) {
                        long t = t(j2, obj2);
                        ((vs0) wv22.x).q((t >> 63) ^ (t << (z ? 1 : 0)), i12);
                    }
                    break;
                case 68:
                    if (dVar.n(i12, i10, obj2)) {
                        wv22.t(i12, unsafe.getObject(obj2, j2), dVar.j(i10));
                    }
                    break;
            }
        }
        ((ys7) dVar.h).getClass();
        ((b) obj2).unknownFields.b(wv22);
    }
}
