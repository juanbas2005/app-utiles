package defpackage;

import com.google.android.gms.internal.measurement.zzaeg;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: om8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class om8 implements wm8 {
    public static final int[] k = new int[0];
    public static final Unsafe l = jn8.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final pk8 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final xb4 j;

    public om8(int[] iArr, Object[] objArr, int i2, int i3, pk8 pk8, int[] iArr2, int i4, int i5, xb4 xb4, or2 or2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.f = pk8 instanceof nl8;
        this.g = iArr2;
        this.h = i4;
        this.i = i5;
        this.j = xb4;
        this.e = pk8;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            f21.v(sb, "Field ", str, " for ", name);
            ku4.o(f21.l(sb, " not found. Known fields are ", arrays), e2);
            return null;
        }
    }

    public static int l(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof nl8) {
            return ((nl8) obj).g();
        }
        return true;
    }

    public static void n(Object obj) {
        if (!m(obj)) {
            h.q("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int o(long j2, Object obj) {
        return ((Integer) jn8.i(j2, obj)).intValue();
    }

    public static long p(long j2, Object obj) {
        return ((Long) jn8.i(j2, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i2, int i3, mn8 mn8, Class cls, mj2 mj2) {
        mn8 mn82 = mn8.STRING;
        boolean z = false;
        switch (mn8.ordinal()) {
            case b85.b:
                int i4 = i2;
                int i5 = i4 + 8;
                mj2.d = Double.valueOf(Double.longBitsToDouble(ub5.A(i4, bArr)));
                return i5;
            case 1:
                int i6 = i2;
                int i7 = i6 + 4;
                mj2.d = Float.valueOf(Float.intBitsToFloat(ub5.z(i6, bArr)));
                return i7;
            case 2:
            case 3:
                mj2 mj22 = mj2;
                int y = ub5.y(bArr, i2, mj22);
                mj22.d = Long.valueOf(mj22.b);
                return y;
            case 4:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                mj2 mj23 = mj2;
                int u = ub5.u(bArr, i2, mj23);
                mj23.d = Integer.valueOf(mj23.a);
                return u;
            case 5:
            case h75.g:
                int i8 = i2;
                int i9 = i8 + 8;
                mj2.d = Long.valueOf(ub5.A(i8, bArr));
                return i9;
            case 6:
            case 14:
                int i10 = i2;
                int i11 = i10 + 4;
                mj2.d = Integer.valueOf(ub5.z(i10, bArr));
                return i11;
            case 7:
                mj2 mj24 = mj2;
                int y2 = ub5.y(bArr, i2, mj24);
                if (mj24.b != 0) {
                    z = true;
                }
                mj24.d = Boolean.valueOf(z);
                return y2;
            case 8:
                return ub5.B(bArr, i2, mj2);
            case 10:
                wm8 a2 = tm8.c.a(cls);
                nl8 a3 = a2.a();
                mj2 mj25 = mj2;
                int D = ub5.D(a3, a2, bArr, i2, i3, mj25);
                a2.f(a3);
                mj25.d = a3;
                return D;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return ub5.C(bArr, i2, mj2);
            case 16:
                int u2 = ub5.u(bArr, i2, mj2);
                mj2.d = Integer.valueOf(yk8.j(mj2.a));
                return u2;
            case 17:
                int y3 = ub5.y(bArr, i2, mj2);
                mj2.d = Long.valueOf(yk8.k(mj2.b));
                return y3;
            default:
                rf2.r("unsupported field type.");
                return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ab  */
    public static om8 z(vm8 vm8, xb4 xb4, or2 or2) {
        int i2;
        char c2;
        int[] iArr;
        char c3;
        char c4;
        char c5;
        int i3;
        char c6;
        char c7;
        int i4;
        int i5;
        String str;
        int i6;
        char c8;
        Object[] objArr;
        int i7;
        int i8;
        Class<?> cls;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Field A;
        int i15;
        int charAt;
        int i16;
        char c9;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj;
        Field field;
        Object obj2;
        Field field2;
        int i21;
        int i22;
        char charAt2;
        int i23;
        char charAt3;
        int i24;
        int charAt4;
        int i25;
        int charAt5;
        int i26;
        int i27;
        int charAt6;
        int i28;
        int charAt7;
        int i29;
        int charAt8;
        int i30;
        int charAt9;
        int i31;
        int charAt10;
        int i32;
        int charAt11;
        int i33;
        int charAt12;
        vm8 vm82 = vm8;
        if (vm82 instanceof vm8) {
            String str2 = vm82.b;
            int length = str2.length();
            int i34 = 55296;
            if (str2.charAt(0) >= 55296) {
                int i35 = 1;
                while (true) {
                    i2 = i35 + 1;
                    if (str2.charAt(i35) < 55296) {
                        break;
                    }
                    i35 = i2;
                }
            } else {
                i2 = 1;
            }
            int i36 = i2 + 1;
            int charAt13 = str2.charAt(i2);
            if (charAt13 >= 55296) {
                int i37 = charAt13 & 8191;
                int i38 = 13;
                while (true) {
                    i33 = i36 + 1;
                    charAt12 = str2.charAt(i36);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i37 |= (charAt12 & 8191) << i38;
                    i38 += 13;
                    i36 = i33;
                }
                charAt13 = i37 | (charAt12 << i38);
                i36 = i33;
            }
            if (charAt13 == 0) {
                c6 = 0;
                i3 = 0;
                c5 = 0;
                c4 = 0;
                c3 = 0;
                c2 = 0;
                iArr = k;
                c7 = 0;
            } else {
                int i39 = i36 + 1;
                char charAt14 = str2.charAt(i36);
                if (charAt14 >= 55296) {
                    char c10 = charAt14 & 8191;
                    int i40 = 13;
                    while (true) {
                        i32 = i39 + 1;
                        charAt11 = str2.charAt(i39);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c10 |= (charAt11 & 8191) << i40;
                        i40 += 13;
                        i39 = i32;
                    }
                    charAt14 = c10 | (charAt11 << i40);
                    i39 = i32;
                }
                int i41 = i39 + 1;
                int charAt15 = str2.charAt(i39);
                if (charAt15 >= 55296) {
                    int i42 = charAt15 & 8191;
                    int i43 = 13;
                    while (true) {
                        i31 = i41 + 1;
                        charAt10 = str2.charAt(i41);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i42 |= (charAt10 & 8191) << i43;
                        i43 += 13;
                        i41 = i31;
                    }
                    charAt15 = i42 | (charAt10 << i43);
                    i41 = i31;
                }
                int i44 = i41 + 1;
                char charAt16 = str2.charAt(i41);
                if (charAt16 >= 55296) {
                    char c11 = charAt16 & 8191;
                    int i45 = 13;
                    while (true) {
                        i30 = i44 + 1;
                        charAt9 = str2.charAt(i44);
                        if (charAt9 < 55296) {
                            break;
                        }
                        c11 |= (charAt9 & 8191) << i45;
                        i45 += 13;
                        i44 = i30;
                    }
                    charAt16 = c11 | (charAt9 << i45);
                    i44 = i30;
                }
                int i46 = i44 + 1;
                char charAt17 = str2.charAt(i44);
                if (charAt17 >= 55296) {
                    char c12 = charAt17 & 8191;
                    int i47 = 13;
                    while (true) {
                        i29 = i46 + 1;
                        charAt8 = str2.charAt(i46);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c12 |= (charAt8 & 8191) << i47;
                        i47 += 13;
                        i46 = i29;
                    }
                    charAt17 = c12 | (charAt8 << i47);
                    i46 = i29;
                }
                int i48 = i46 + 1;
                c5 = str2.charAt(i46);
                if (c5 >= 55296) {
                    char c13 = c5 & 8191;
                    int i49 = 13;
                    while (true) {
                        i28 = i48 + 1;
                        charAt7 = str2.charAt(i48);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c13 |= (charAt7 & 8191) << i49;
                        i49 += 13;
                        i48 = i28;
                    }
                    c5 = c13 | (charAt7 << i49);
                    i48 = i28;
                }
                int i50 = i48 + 1;
                char charAt18 = str2.charAt(i48);
                if (charAt18 >= 55296) {
                    char c14 = charAt18 & 8191;
                    int i51 = 13;
                    while (true) {
                        i27 = i50 + 1;
                        charAt6 = str2.charAt(i50);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c14 |= (charAt6 & 8191) << i51;
                        i51 += 13;
                        i50 = i27;
                    }
                    charAt18 = c14 | (charAt6 << i51);
                    i50 = i27;
                }
                int i52 = i50 + 1;
                if (str2.charAt(i50) >= 55296) {
                    while (true) {
                        i26 = i52 + 1;
                        if (str2.charAt(i52) < 55296) {
                            break;
                        }
                        i52 = i26;
                    }
                    i52 = i26;
                }
                int i53 = i52 + 1;
                char charAt19 = str2.charAt(i52);
                if (charAt19 >= 55296) {
                    char c15 = charAt19 & 8191;
                    int i54 = 13;
                    while (true) {
                        i25 = i53 + 1;
                        charAt5 = str2.charAt(i53);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c15 |= (charAt5 & 8191) << i54;
                        i54 += 13;
                        i53 = i25;
                    }
                    charAt19 = c15 | (charAt5 << i54);
                    i53 = i25;
                }
                int i55 = charAt14 + charAt14 + charAt15;
                int[] iArr2 = new int[(charAt19 + charAt18 + charAt14)];
                char c16 = charAt18;
                c4 = charAt16;
                c6 = c16;
                iArr = iArr2;
                c7 = charAt14;
                i36 = i53;
                c3 = charAt17;
                i3 = i55;
                c2 = charAt19;
            }
            Unsafe unsafe = l;
            Object[] objArr2 = vm82.c;
            Class<?> cls2 = vm82.a.getClass();
            int i56 = c2 + c6;
            int i57 = c5 + c5;
            int[] iArr3 = new int[(c5 * 3)];
            Object[] objArr3 = new Object[i57];
            int i58 = i56;
            char c17 = c2;
            int i59 = 0;
            int i60 = 0;
            while (i36 < length) {
                int i61 = i36 + 1;
                int charAt20 = str2.charAt(i36);
                if (charAt20 >= i34) {
                    int i62 = charAt20 & 8191;
                    int i63 = i61;
                    int i64 = 13;
                    while (true) {
                        i24 = i63 + 1;
                        charAt4 = str2.charAt(i63);
                        i4 = length;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i62 |= (charAt4 & 8191) << i64;
                        i64 += 13;
                        i63 = i24;
                        length = i4;
                    }
                    charAt20 = i62 | (charAt4 << i64);
                    i5 = i24;
                } else {
                    i4 = length;
                    i5 = i61;
                }
                int i65 = i5 + 1;
                int charAt21 = str2.charAt(i5);
                Object[] objArr4 = objArr2;
                char c18 = 55296;
                if (charAt21 >= 55296) {
                    int i66 = charAt21 & 8191;
                    int i67 = 13;
                    while (true) {
                        i23 = i65 + 1;
                        charAt3 = str2.charAt(i65);
                        if (charAt3 < c18) {
                            break;
                        }
                        i66 |= (charAt3 & 8191) << i67;
                        i67 += 13;
                        i65 = i23;
                        c18 = 55296;
                    }
                    charAt21 = i66 | (charAt3 << i67);
                    i65 = i23;
                }
                if ((charAt21 & 1024) != 0) {
                    iArr[i59] = i60;
                    i59++;
                }
                int i68 = charAt21 & 255;
                int i69 = charAt20;
                int i70 = charAt21 & 2048;
                if (i68 >= 51) {
                    int i71 = i65 + 1;
                    int charAt22 = str2.charAt(i65);
                    int i72 = i71;
                    char c19 = 55296;
                    if (charAt22 >= 55296) {
                        int i73 = i72;
                        int i74 = charAt22 & 8191;
                        int i75 = i73;
                        int i76 = 13;
                        while (true) {
                            i22 = i75 + 1;
                            charAt2 = str2.charAt(i75);
                            if (charAt2 < c19) {
                                break;
                            }
                            i74 |= (charAt2 & 8191) << i76;
                            i76 += 13;
                            i75 = i22;
                            c19 = 55296;
                        }
                        charAt22 = i74 | (charAt2 << i76);
                        i19 = i22;
                    } else {
                        i19 = i72;
                    }
                    int i77 = i19;
                    int i78 = i68 - 51;
                    int i79 = charAt22;
                    if (i78 == 9 || i78 == 17) {
                        i21 = i3 + 1;
                        int i80 = i60 / 3;
                        objArr3[i80 + i80 + 1] = objArr4[i3];
                    } else {
                        if (i78 == 12) {
                            if (vm82.a() == 1 || i70 != 0) {
                                i21 = i3 + 1;
                                int i81 = i60 / 3;
                                objArr3[i81 + i81 + 1] = objArr4[i3];
                            } else {
                                i20 = 0;
                                int i82 = i79 + i79;
                                int i83 = i20;
                                obj = objArr4[i82];
                                int i84 = i82;
                                if (obj instanceof Field) {
                                    field = (Field) obj;
                                } else {
                                    field = A(cls2, (String) obj);
                                    objArr4[i84] = field;
                                    iArr[i58] = i60;
                                    i58++;
                                }
                                int i85 = i84 + 1;
                                int objectFieldOffset = (int) unsafe.objectFieldOffset(field);
                                obj2 = objArr4[i85];
                                int i86 = i85;
                                if (obj2 instanceof Field) {
                                    field2 = (Field) obj2;
                                } else {
                                    field2 = A(cls2, (String) obj2);
                                    objArr4[i86] = field2;
                                }
                                str = str2;
                                i11 = i68;
                                i65 = i77;
                                i6 = objectFieldOffset;
                                i10 = 0;
                                i7 = 55296;
                                objArr = objArr3;
                                c8 = c7;
                                cls = cls2;
                                i8 = (int) unsafe.objectFieldOffset(field2);
                                i9 = i83;
                            }
                        }
                        i20 = i70;
                        int i822 = i79 + i79;
                        int i832 = i20;
                        obj = objArr4[i822];
                        int i842 = i822;
                        if (obj instanceof Field) {
                        }
                        int i852 = i842 + 1;
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(field);
                        obj2 = objArr4[i852];
                        int i862 = i852;
                        if (obj2 instanceof Field) {
                        }
                        str = str2;
                        i11 = i68;
                        i65 = i77;
                        i6 = objectFieldOffset2;
                        i10 = 0;
                        i7 = 55296;
                        objArr = objArr3;
                        c8 = c7;
                        cls = cls2;
                        i8 = (int) unsafe.objectFieldOffset(field2);
                        i9 = i832;
                    }
                    i3 = i21;
                    i20 = i70;
                    int i8222 = i79 + i79;
                    int i8322 = i20;
                    obj = objArr4[i8222];
                    int i8422 = i8222;
                    if (obj instanceof Field) {
                    }
                    int i8522 = i8422 + 1;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(field);
                    obj2 = objArr4[i8522];
                    int i8622 = i8522;
                    if (obj2 instanceof Field) {
                    }
                    str = str2;
                    i11 = i68;
                    i65 = i77;
                    i6 = objectFieldOffset22;
                    i10 = 0;
                    i7 = 55296;
                    objArr = objArr3;
                    c8 = c7;
                    cls = cls2;
                    i8 = (int) unsafe.objectFieldOffset(field2);
                    i9 = i8322;
                } else {
                    int i87 = i3 + 1;
                    Field A2 = A(cls2, (String) objArr4[i3]);
                    objArr = objArr3;
                    if (i68 == 9 || i68 == 17) {
                        c9 = c7;
                        int i88 = i60 / 3;
                        objArr[i88 + i88 + 1] = A2.getType();
                    } else {
                        if (i68 == 27) {
                            c8 = c7;
                            i18 = 1;
                            i17 = i3 + 2;
                            int i89 = i60 / 3;
                            objArr[i89 + i89 + i18] = objArr4[i87];
                        } else if (i68 == 49) {
                            i17 = i3 + 2;
                            c8 = c7;
                            i18 = 1;
                            int i892 = i60 / 3;
                            objArr[i892 + i892 + i18] = objArr4[i87];
                        } else if (i68 == 12 || i68 == 30 || i68 == 44) {
                            c8 = c7;
                            if (vm82.a() == 1 || i70 != 0) {
                                i17 = i3 + 2;
                                int i90 = i60 / 3;
                                objArr[i90 + i90 + 1] = objArr4[i87];
                            } else {
                                cls = cls2;
                                i16 = i87;
                                i70 = 0;
                                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(A2);
                                i8 = 1048575;
                                if ((charAt21 & 4096) == 0 || i68 > 17) {
                                    str = str2;
                                    i11 = i68;
                                    i6 = objectFieldOffset3;
                                    i7 = 55296;
                                    i9 = i70;
                                    i10 = 0;
                                } else {
                                    int i91 = i65 + 1;
                                    int charAt23 = str2.charAt(i65);
                                    if (charAt23 >= 55296) {
                                        int i92 = charAt23 & 8191;
                                        int i93 = 13;
                                        while (true) {
                                            i15 = i91 + 1;
                                            charAt = str2.charAt(i91);
                                            if (charAt < 55296) {
                                                break;
                                            }
                                            i92 |= (charAt & 8191) << i93;
                                            i93 += 13;
                                            i91 = i15;
                                        }
                                        charAt23 = i92 | (charAt << i93);
                                        i91 = i15;
                                    }
                                    int i94 = (charAt23 / 32) + c8 + c8;
                                    Object obj3 = objArr4[i94];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        A = (Field) obj3;
                                    } else {
                                        A = A(cls, (String) obj3);
                                        objArr4[i94] = A;
                                    }
                                    i11 = i68;
                                    i6 = objectFieldOffset3;
                                    i8 = (int) unsafe.objectFieldOffset(A);
                                    i10 = charAt23 % 32;
                                    i65 = i91;
                                    i9 = i70;
                                    i7 = 55296;
                                }
                            }
                        } else if (i68 == 50) {
                            int i95 = i3 + 2;
                            int i96 = c17 + 1;
                            iArr[c17] = i60;
                            int i97 = i60 / 3;
                            int i98 = i97 + i97;
                            objArr[i98] = objArr4[i87];
                            if (i70 != 0) {
                                i16 = i3 + 3;
                                objArr[i98 + 1] = objArr4[i95];
                                cls = cls2;
                                c17 = i96;
                            } else {
                                i16 = i95;
                                cls = cls2;
                                c17 = i96;
                                i70 = 0;
                            }
                            c8 = c7;
                            int objectFieldOffset32 = (int) unsafe.objectFieldOffset(A2);
                            i8 = 1048575;
                            if ((charAt21 & 4096) == 0 || i68 > 17) {
                            }
                        } else {
                            c9 = c7;
                        }
                        cls = cls2;
                        int objectFieldOffset322 = (int) unsafe.objectFieldOffset(A2);
                        i8 = 1048575;
                        if ((charAt21 & 4096) == 0 || i68 > 17) {
                        }
                    }
                    cls = cls2;
                    i16 = i87;
                    int objectFieldOffset3222 = (int) unsafe.objectFieldOffset(A2);
                    i8 = 1048575;
                    if ((charAt21 & 4096) == 0 || i68 > 17) {
                    }
                }
                int i99 = i60 + 1;
                iArr3[i60] = i69;
                int i100 = i60 + 2;
                int i101 = i11;
                if ((charAt21 & 512) != 0) {
                    i12 = 536870912;
                } else {
                    i12 = 0;
                }
                if ((charAt21 & 256) != 0) {
                    i13 = 268435456;
                } else {
                    i13 = 0;
                }
                if (i9 != 0) {
                    i14 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                }
                iArr3[i99] = i12 | i13 | i14 | (i101 << 20) | i6;
                i60 += 3;
                iArr3[i100] = (i10 << 20) | i8;
                i36 = i65;
                cls2 = cls;
                objArr2 = objArr4;
                i34 = i7;
                length = i4;
                objArr3 = objArr;
                c7 = c8;
                str2 = str;
            }
            return new om8(iArr3, objArr3, c4, c3, vm82.a, iArr, c2, i56, xb4, or2);
        }
        ku4.a();
        return null;
    }

    public final void B(int i2, Object obj, Object obj2) {
        if (s(i2, obj2)) {
            Unsafe unsafe = l;
            long k2 = (long) (k(i2) & 1048575);
            Object object = unsafe.getObject(obj2, k2);
            if (object != null) {
                wm8 D = D(i2);
                if (!s(i2, obj)) {
                    if (!m(object)) {
                        unsafe.putObject(obj, k2, object);
                    } else {
                        nl8 a2 = D.a();
                        D.b(a2, object);
                        unsafe.putObject(obj, k2, a2);
                    }
                    t(i2, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, k2);
                if (!m(object2)) {
                    nl8 a3 = D.a();
                    D.b(a3, object2);
                    unsafe.putObject(obj, k2, a3);
                    object2 = a3;
                }
                D.b(object2, object);
                return;
            }
            int i3 = this.a[i2];
            String obj3 = obj2.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
            sb.append("Source subfield ");
            sb.append(i3);
            sb.append(" is present but null: ");
            sb.append(obj3);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void C(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (u(i3, i2, obj2)) {
            Unsafe unsafe = l;
            long k2 = (long) (k(i2) & 1048575);
            Object object = unsafe.getObject(obj2, k2);
            if (object != null) {
                wm8 D = D(i2);
                if (!u(i3, i2, obj)) {
                    if (!m(object)) {
                        unsafe.putObject(obj, k2, object);
                    } else {
                        nl8 a2 = D.a();
                        D.b(a2, object);
                        unsafe.putObject(obj, k2, a2);
                    }
                    v(i3, i2, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, k2);
                if (!m(object2)) {
                    nl8 a3 = D.a();
                    D.b(a3, object2);
                    unsafe.putObject(obj, k2, a3);
                    object2 = a3;
                }
                D.b(object2, object);
                return;
            }
            int i4 = iArr[i2];
            String obj3 = obj2.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 38 + obj3.length());
            sb.append("Source subfield ");
            sb.append(i4);
            sb.append(" is present but null: ");
            sb.append(obj3);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final wm8 D(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        wm8 wm8 = (wm8) objArr[i4];
        if (wm8 != null) {
            return wm8;
        }
        wm8 a2 = tm8.c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a2;
        return a2;
    }

    public final Object E(int i2) {
        int i3 = i2 / 3;
        return this.b[i3 + i3];
    }

    public final kk8 F(int i2) {
        int i3 = i2 / 3;
        return (kk8) this.b[i3 + i3 + 1];
    }

    public final Object G(int i2, Object obj) {
        wm8 D = D(i2);
        int k2 = k(i2) & 1048575;
        if (!s(i2, obj)) {
            return D.a();
        }
        Object object = l.getObject(obj, (long) k2);
        if (m(object)) {
            return object;
        }
        nl8 a2 = D.a();
        if (object != null) {
            D.b(a2, object);
        }
        return a2;
    }

    public final void H(int i2, Object obj, Object obj2) {
        l.putObject(obj, (long) (k(i2) & 1048575), obj2);
        t(i2, obj);
    }

    public final Object I(int i2, int i3, Object obj) {
        wm8 D = D(i3);
        if (!u(i2, i3, obj)) {
            return D.a();
        }
        Object object = l.getObject(obj, (long) (k(i3) & 1048575));
        if (m(object)) {
            return object;
        }
        nl8 a2 = D.a();
        if (object != null) {
            D.b(a2, object);
        }
        return a2;
    }

    public final void J(Object obj, int i2, Object obj2, int i3) {
        l.putObject(obj, (long) (k(i3) & 1048575), obj2);
        v(i2, i3, obj);
    }

    public final Object K(Object obj, int i2, Object obj2, xb4 xb4, Object obj3) {
        kk8 F;
        int i3 = this.a[i2];
        Object i4 = jn8.i((long) (k(i2) & 1048575), obj);
        if (i4 == null || (F = F(i2)) == null) {
            return obj2;
        }
        fm8 fm8 = ((gm8) E(i2)).a;
        Iterator it = ((hm8) i4).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    xb4.getClass();
                    obj2 = xb4.i(obj3);
                }
                int b2 = gm8.b(fm8, entry.getKey(), entry.getValue());
                uk8 uk8 = vk8.x;
                byte[] bArr = new byte[b2];
                boolean z = fl8.b;
                zk8 zk8 = new zk8(bArr, b2);
                try {
                    gm8.a(zk8, fm8, entry.getKey(), entry.getValue());
                    if (zk8.x() > 0) {
                        h.s("Did not write as much data as expected.");
                        return null;
                    } else if (zk8.x() >= 0) {
                        uk8 uk82 = new uk8(bArr);
                        xb4.getClass();
                        ((en8) obj2).d((i3 << 3) | 2, uk82);
                        it.remove();
                    } else {
                        h.s("Wrote more data than expected.");
                        return null;
                    }
                } catch (IOException e2) {
                    rf2.o(e2);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void L(int i2, tt2 tt2, Object obj) {
        boolean z;
        yk8 yk8 = (yk8) tt2.e;
        if ((536870912 & i2) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j2 = (long) (i2 & 1048575);
        if (z) {
            tt2.w(2);
            jn8.j(obj, j2, yk8.x());
        } else if (this.f) {
            tt2.w(2);
            jn8.j(obj, j2, yk8.w());
        } else {
            jn8.j(obj, j2, tt2.E());
        }
    }

    public final nl8 a() {
        return ((nl8) this.e).i();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void b(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int k2 = k(i2);
                int i3 = 1048575 & k2;
                int l2 = l(k2);
                int i4 = iArr[i2];
                long j2 = (long) i3;
                switch (l2) {
                    case b85.b:
                        if (s(i2, obj2)) {
                            in8 in8 = jn8.c;
                            obj3 = obj;
                            in8.c1(obj3, j2, in8.a1(j2, obj2));
                            t(i2, obj3);
                            continue;
                        }
                    case 1:
                        if (s(i2, obj2)) {
                            in8 in82 = jn8.c;
                            in82.Z0(obj, j2, in82.Y0(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 2:
                        if (s(i2, obj2)) {
                            jn8.h(obj, j2, jn8.g(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 3:
                        if (s(i2, obj2)) {
                            jn8.h(obj, j2, jn8.g(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 4:
                        if (s(i2, obj2)) {
                            jn8.f(jn8.e(j2, obj2), j2, obj);
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 5:
                        if (s(i2, obj2)) {
                            jn8.h(obj, j2, jn8.g(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 6:
                        if (s(i2, obj2)) {
                            jn8.f(jn8.e(j2, obj2), j2, obj);
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 7:
                        if (s(i2, obj2)) {
                            in8 in83 = jn8.c;
                            in83.X0(obj, j2, in83.W0(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 8:
                        if (s(i2, obj2)) {
                            jn8.j(obj, j2, jn8.i(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 9:
                        B(i2, obj, obj2);
                        obj3 = obj;
                        break;
                    case 10:
                        if (s(i2, obj2)) {
                            jn8.j(obj, j2, jn8.i(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        if (s(i2, obj2)) {
                            jn8.f(jn8.e(j2, obj2), j2, obj);
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 12:
                        if (s(i2, obj2)) {
                            jn8.f(jn8.e(j2, obj2), j2, obj);
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        if (s(i2, obj2)) {
                            jn8.f(jn8.e(j2, obj2), j2, obj);
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 14:
                        if (s(i2, obj2)) {
                            jn8.h(obj, j2, jn8.g(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case h75.g:
                        if (s(i2, obj2)) {
                            jn8.f(jn8.e(j2, obj2), j2, obj);
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 16:
                        if (s(i2, obj2)) {
                            jn8.h(obj, j2, jn8.g(j2, obj2));
                            t(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 17:
                        B(i2, obj, obj2);
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
                    case h75.h:
                    case 49:
                        zl8 zl8 = (zl8) jn8.i(j2, obj);
                        zl8 zl82 = (zl8) jn8.i(j2, obj2);
                        int size = zl8.size();
                        int size2 = zl82.size();
                        if (size > 0 && size2 > 0) {
                            if (!((qk8) zl8).w) {
                                zl8 = zl8.t(size2 + size);
                            }
                            zl8.addAll(zl82);
                        }
                        if (size > 0) {
                            zl82 = zl8;
                        }
                        jn8.j(obj, j2, zl82);
                        obj3 = obj;
                        break;
                    case 50:
                        xb4 xb4 = xm8.a;
                        jn8.j(obj, j2, n63.l(jn8.i(j2, obj), jn8.i(j2, obj2)));
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
                        if (u(i4, i2, obj2)) {
                            jn8.j(obj, j2, jn8.i(j2, obj2));
                            v(i4, i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 60:
                        C(i2, obj, obj2);
                        obj3 = obj;
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (u(i4, i2, obj2)) {
                            jn8.j(obj, j2, jn8.i(j2, obj2));
                            v(i4, i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 68:
                        C(i2, obj, obj2);
                        obj3 = obj;
                        break;
                }
                obj3 = obj;
                i2 += 3;
                obj = obj3;
            } else {
                xm8.b(obj, obj2);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: nl8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v17, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v18, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v19, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v25, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v26, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v38, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: om8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: om8} */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v43, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v54 */
    /* JADX WARNING: type inference failed for: r15v70 */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x038f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0390, code lost:
        r2 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0394, code lost:
        r18 = r5;
        r17 = r6;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b4, code lost:
        r18 = r2;
        r17 = r5;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04b2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05ba, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05bd, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0796, code lost:
        r1 = r15;
        r5 = r17;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x07ef, code lost:
        r4 = K(r22, r10[r12], r4, r5, r22);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0800, code lost:
        r5.getClass();
        r22.zzc = (defpackage.en8) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x001b, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r15 = r1;
        r18 = r2;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a4, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[ExcHandler: zzaeg (unused com.google.android.gms.internal.measurement.zzaeg), PHI: r1 r5 r6 r15 
      PHI: (r1v64 om8) = (r1v49 om8), (r1v67 om8) binds: [B:145:0x0486, B:110:0x0387] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v15 java.lang.Object) = (r5v14 java.lang.Object), (r5v18 java.lang.Object) binds: [B:145:0x0486, B:110:0x0387] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v6 xb4) = (r6v5 xb4), (r6v7 xb4) binds: [B:145:0x0486, B:110:0x0387] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v43 om8) = (r15v69 om8), (r15v75 om8) binds: [B:145:0x0486, B:110:0x0387] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:110:0x0387] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04b2 A[Catch:{ zzaeg -> 0x07aa, all -> 0x04b2 }, ExcHandler: all (th java.lang.Throwable), PHI: r17 r18 
      PHI: (r17v40 xb4) = (r17v9 xb4), (r17v9 xb4), (r17v28 xb4), (r17v41 xb4) binds: [B:212:0x0790, B:213:?, B:177:0x05a7, B:155:0x04a9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r18v38 java.lang.Object) = (r18v7 java.lang.Object), (r18v7 java.lang.Object), (r18v26 java.lang.Object), (r18v39 java.lang.Object) binds: [B:212:0x0790, B:213:?, B:177:0x05a7, B:155:0x04a9] A[DONT_GENERATE, DONT_INLINE], Splitter:B:155:0x04a9] */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[ExcHandler: zzaeg (unused com.google.android.gms.internal.measurement.zzaeg), PHI: r1 r2 r17 r18 
      PHI: (r1v35 om8) = (r1v17 om8), (r1v17 om8), (r1v36 om8) binds: [B:209:0x0781, B:210:?, B:177:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v33 om8) = (r2v15 om8), (r2v15 om8), (r2v35 om8) binds: [B:209:0x0781, B:210:?, B:177:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v26 xb4) = (r17v9 xb4), (r17v9 xb4), (r17v28 xb4) binds: [B:209:0x0781, B:210:?, B:177:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r18v24 java.lang.Object) = (r18v7 java.lang.Object), (r18v7 java.lang.Object), (r18v26 java.lang.Object) binds: [B:209:0x0781, B:210:?, B:177:0x05a7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:177:0x05a7] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x07ae A[SYNTHETIC, Splitter:B:222:0x07ae] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x07d7  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x07ef A[LOOP:5: B:235:0x07ed->B:236:0x07ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0800  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x07bf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    public final void c(Object obj, tt2 tt2, gl8 gl8) {
        om8 om8;
        Object obj2;
        Object obj3;
        Object obj4;
        xb4 xb4;
        om8 om82;
        om8 om83;
        Object obj5;
        om8 om84;
        int i2;
        om8 om85;
        om8 om86;
        om8 om87;
        Object obj6;
        Object obj7;
        boolean z;
        Object obj8;
        xb4 xb42;
        om8 om88;
        om8 om89;
        zl8 m;
        kk8 F;
        om8 om810;
        om8 om811;
        om8 om812 = this;
        tt2 tt22 = tt2;
        gl8 gl82 = gl8;
        yk8 yk8 = (yk8) tt22.e;
        int[] iArr = om812.g;
        int i3 = om812.i;
        int i4 = om812.h;
        gl82.getClass();
        n(obj);
        xb4 xb43 = om812.j;
        Object obj9 = null;
        while (true) {
            try {
                om8 om813 = om8;
                int D = tt22.D();
                int i5 = 0;
                if (D < om812.c || D > om812.d) {
                    i2 = -1;
                } else {
                    i2 = om812.w(D, 0);
                }
                int i6 = i2;
                if (i6 >= 0) {
                    int k2 = om812.k(i6);
                    try {
                        ? r15 = 3;
                        switch (l(k2)) {
                            case b85.b:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                om83 = obj;
                                int i7 = k2 & 1048575;
                                tt22.w(1);
                                om8 om814 = om87;
                                om85 = om814;
                                jn8.c.c1(om83, (long) i7, yk8.o());
                                om814.t(i6, om83);
                                om86 = om814;
                                om85 = om814;
                                break;
                            case 1:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj10 = obj;
                                tt22.w(5);
                                jn8.c.Z0(obj10, (long) (k2 & 1048575), yk8.p());
                                om87.t(i6, obj10);
                                break;
                            case 2:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj11 = obj;
                                tt22.w(0);
                                jn8.h(obj11, (long) (k2 & 1048575), yk8.r());
                                om87.t(i6, obj11);
                                break;
                            case 3:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj12 = obj;
                                tt22.w(0);
                                jn8.h(obj12, (long) (k2 & 1048575), yk8.q());
                                om87.t(i6, obj12);
                                break;
                            case 4:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj13 = obj;
                                tt22.w(0);
                                jn8.f(yk8.s(), (long) (k2 & 1048575), obj13);
                                om87.t(i6, obj13);
                                break;
                            case 5:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj14 = obj;
                                tt22.w(1);
                                jn8.h(obj14, (long) (k2 & 1048575), yk8.t());
                                om87.t(i6, obj14);
                                break;
                            case 6:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj15 = obj;
                                tt22.w(5);
                                jn8.f(yk8.u(), (long) (k2 & 1048575), obj15);
                                om87.t(i6, obj15);
                                break;
                            case 7:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj16 = obj;
                                tt22.w(0);
                                jn8.c.X0(obj16, (long) (k2 & 1048575), yk8.v());
                                om87.t(i6, obj16);
                                break;
                            case 8:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj17 = obj;
                                om87.L(k2, tt22, obj17);
                                om87.t(i6, obj17);
                                break;
                            case 9:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj18 = obj;
                                pk8 pk8 = (pk8) om87.G(i6, obj18);
                                wm8 D2 = om87.D(i6);
                                tt22.w(2);
                                tt22.x(pk8, D2, gl82);
                                om87.H(i6, obj18, pk8);
                                break;
                            case 10:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj19 = obj;
                                jn8.j(obj19, (long) (k2 & 1048575), tt22.E());
                                om87.t(i6, obj19);
                                break;
                            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj20 = obj;
                                tt22.w(0);
                                jn8.f(yk8.A(), (long) (k2 & 1048575), obj20);
                                om87.t(i6, obj20);
                                break;
                            case 12:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj21 = obj;
                                tt22.w(0);
                                int B = yk8.B();
                                kk8 F2 = om87.F(i6);
                                if (F2 != null) {
                                    if (!F2.a(B)) {
                                        xb4 xb44 = xm8.a;
                                        if (obj3 == null) {
                                            xb4.getClass();
                                            obj7 = xb4.i(obj21);
                                        } else {
                                            obj7 = obj3;
                                        }
                                        xb4.getClass();
                                        ((en8) obj6).d(D << 3, Long.valueOf((long) B));
                                        om812 = om87;
                                        break;
                                    }
                                }
                                jn8.f(B, (long) (k2 & 1048575), obj21);
                                om87.t(i6, obj21);
                                break;
                            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj22 = obj;
                                tt22.w(5);
                                jn8.f(yk8.C(), (long) (k2 & 1048575), obj22);
                                om87.t(i6, obj22);
                                break;
                            case 14:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj23 = obj;
                                tt22.w(1);
                                jn8.h(obj23, (long) (k2 & 1048575), yk8.D());
                                om87.t(i6, obj23);
                                break;
                            case h75.g:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj24 = obj;
                                tt22.w(0);
                                jn8.f(yk8.E(), (long) (k2 & 1048575), obj24);
                                om87.t(i6, obj24);
                                break;
                            case 16:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                Object obj25 = obj;
                                tt22.w(0);
                                jn8.h(obj25, (long) (k2 & 1048575), yk8.F());
                                om87.t(i6, obj25);
                                break;
                            case 17:
                                obj3 = obj9;
                                xb4 = xb43;
                                om87 = om812;
                                om83 = obj;
                                try {
                                    pk8 pk82 = (pk8) om87.G(i6, om83);
                                    wm8 D3 = om87.D(i6);
                                    tt22.w(3);
                                    tt22.y(pk82, D3, gl82);
                                    om87.H(i6, om83, pk82);
                                    break;
                                } catch (zzaeg unused) {
                                } catch (Throwable th) {
                                    th = th;
                                    om8 om815 = om87;
                                    xb43 = xb4;
                                    obj9 = obj3;
                                    obj2 = obj9;
                                    while (i4 < i3) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 18:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.F(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 19:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.G(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 20:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.g(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 21:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.H(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 22:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.h(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 23:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.i(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 24:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.j(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 25:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.k(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 26:
                                om8 om816 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                Object obj26 = obj;
                                if ((536870912 & k2) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    tt22.l(tz2.m((long) (k2 & 1048575), obj26), false);
                                    om86 = om816;
                                    break;
                                } else {
                                    tt22.l(tz2.m((long) (k2 & 1048575), obj26), true);
                                    om86 = om816;
                                    break;
                                }
                            case 27:
                                om8 om817 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.m(tz2.m((long) (k2 & 1048575), obj), om817.D(i6), gl82);
                                om86 = om817;
                                break;
                            case 28:
                                om86 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                tt22.o(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 29:
                                om8 om818 = om812;
                                obj3 = obj9;
                                xb4 = xb43;
                                om83 = obj;
                                try {
                                    om85 = om818;
                                    tt22.p(tz2.m((long) (k2 & 1048575), om83));
                                    om86 = om818;
                                    break;
                                } catch (zzaeg unused2) {
                                    om84 = om85;
                                    obj9 = obj3;
                                    om82 = om84;
                                    if (obj9 == null) {
                                    }
                                    xb4.getClass();
                                    if (!xb4.j(i5, tt22, obj9)) {
                                    }
                                } catch (Throwable th2) {
                                }
                                break;
                            case 30:
                                om8 om819 = om812;
                                xb4 = xb43;
                                om83 = obj;
                                obj8 = obj9;
                                int i8 = D;
                                try {
                                    zl8 m2 = tz2.m((long) (k2 & 1048575), om83);
                                    tt22.q(m2);
                                    kk8 F3 = om819.F(i6);
                                    xb42 = xb4;
                                    om89 = om819;
                                    obj9 = xm8.c(om83, i8, m2, F3, obj8, xb42);
                                    xb4 = xb42;
                                    om812 = om819;
                                    r15 = om819;
                                    break;
                                } catch (zzaeg unused3) {
                                    obj3 = obj8;
                                    om84 = om819;
                                    obj9 = obj3;
                                    om82 = om84;
                                    if (obj9 == null) {
                                    }
                                    xb4.getClass();
                                    if (!xb4.j(i5, tt22, obj9)) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj3 = obj8;
                                    xb43 = xb4;
                                    obj9 = obj3;
                                    obj2 = obj9;
                                    while (i4 < i3) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 31:
                                om88 = om812;
                                tt22.r(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 32:
                                om88 = om812;
                                tt22.s(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 33:
                                om88 = om812;
                                tt22.t(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 34:
                                om88 = om812;
                                tt22.u(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 35:
                                om88 = om812;
                                tt22.F(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 36:
                                om88 = om812;
                                tt22.G(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 37:
                                om88 = om812;
                                tt22.g(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 38:
                                om88 = om812;
                                tt22.H(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 39:
                                om88 = om812;
                                tt22.h(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 40:
                                om88 = om812;
                                tt22.i(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 41:
                                om88 = om812;
                                tt22.j(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 42:
                                om88 = om812;
                                tt22.k(tz2.m((long) (k2 & 1048575), obj));
                                break;
                            case 43:
                                om8 om820 = om812;
                                om812 = obj;
                                try {
                                    om813 = om820;
                                    tt22.p(tz2.m((long) (k2 & 1048575), om812));
                                    om88 = om820;
                                    break;
                                } catch (zzaeg unused4) {
                                    obj3 = obj9;
                                    xb4 = xb43;
                                    om84 = om813;
                                    obj9 = obj3;
                                    om82 = om84;
                                    if (obj9 == null) {
                                        try {
                                            xb4.getClass();
                                            obj9 = xb4.i(om83);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            xb43 = xb4;
                                            obj2 = obj9;
                                            while (i4 < i3) {
                                            }
                                            if (obj2 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    xb4.getClass();
                                    if (!xb4.j(i5, tt22, obj9)) {
                                        Object obj27 = obj9;
                                        om8 om821 = om82;
                                        while (i4 < i3) {
                                            obj27 = om821.K(om83, iArr[i4], obj5, xb4, obj);
                                            i4++;
                                            om821 = this;
                                            om83 = obj;
                                        }
                                        xb43 = xb4;
                                        if (obj4 == null) {
                                        }
                                    } else {
                                        om812 = this;
                                        r15 = om82;
                                        xb43 = xb4;
                                        om8 = r15;
                                    }
                                }
                                break;
                            case 44:
                                xb4 = xb43;
                                om8 om822 = obj;
                                try {
                                    m = tz2.m((long) (k2 & 1048575), om822);
                                    tt22.q(m);
                                    F = om812.F(i6);
                                    om810 = om812;
                                    om83 = om822;
                                    xb42 = xb4;
                                    obj8 = obj9;
                                } catch (zzaeg unused5) {
                                    om84 = om812;
                                    om83 = om822;
                                    obj3 = obj9;
                                    obj9 = obj3;
                                    om82 = om84;
                                    if (obj9 == null) {
                                    }
                                    xb4.getClass();
                                    if (!xb4.j(i5, tt22, obj9)) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    om8 om823 = om812;
                                    om8 om824 = om822;
                                    xb43 = xb4;
                                    obj3 = obj9;
                                    obj9 = obj3;
                                    obj2 = obj9;
                                    while (i4 < i3) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    om89 = om810;
                                    obj9 = xm8.c(om83, D, m, F, obj8, xb42);
                                    xb43 = xb42;
                                    om812 = om810;
                                    om8 = om810;
                                    break;
                                } catch (zzaeg unused6) {
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj3 = obj8;
                                    xb4 = xb42;
                                    xb43 = xb4;
                                    obj9 = obj3;
                                    obj2 = obj9;
                                    while (i4 < i3) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 45:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.r(tz2.m((long) (k2 & 1048575), om811));
                                break;
                            case 46:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.s(tz2.m((long) (k2 & 1048575), om811));
                                break;
                            case 47:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.t(tz2.m((long) (k2 & 1048575), om811));
                                break;
                            case h75.h:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.u(tz2.m((long) (k2 & 1048575), om811));
                                break;
                            case 49:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.n(tz2.m((long) (k2 & 1048575), om811), om812.D(i6), gl82);
                                break;
                            case 50:
                                xb4 = xb43;
                                om811 = obj;
                                Object E = om812.E(i6);
                                long k3 = (long) (om812.k(i6) & 1048575);
                                Object i9 = jn8.i(k3, om811);
                                if (i9 == null) {
                                    i9 = hm8.x.a();
                                    jn8.j(om811, k3, i9);
                                } else if (!((hm8) i9).w) {
                                    Object a2 = hm8.x.a();
                                    n63.l(a2, i9);
                                    jn8.j(om811, k3, a2);
                                    i9 = a2;
                                }
                                tt22.v((hm8) i9, ((gm8) E).c(), gl82);
                                break;
                            case 51:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(1);
                                jn8.j(om811, (long) (k2 & 1048575), Double.valueOf(yk8.o()));
                                om812.v(D, i6, om811);
                                break;
                            case 52:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(5);
                                jn8.j(om811, (long) (k2 & 1048575), Float.valueOf(yk8.p()));
                                om812.v(D, i6, om811);
                                break;
                            case 53:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                jn8.j(om811, (long) (k2 & 1048575), Long.valueOf(yk8.r()));
                                om812.v(D, i6, om811);
                                break;
                            case 54:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                jn8.j(om811, (long) (k2 & 1048575), Long.valueOf(yk8.q()));
                                om812.v(D, i6, om811);
                                break;
                            case 55:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                jn8.j(om811, (long) (k2 & 1048575), Integer.valueOf(yk8.s()));
                                om812.v(D, i6, om811);
                                break;
                            case 56:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(1);
                                jn8.j(om811, (long) (k2 & 1048575), Long.valueOf(yk8.t()));
                                om812.v(D, i6, om811);
                                break;
                            case 57:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(5);
                                jn8.j(om811, (long) (k2 & 1048575), Integer.valueOf(yk8.u()));
                                om812.v(D, i6, om811);
                                break;
                            case 58:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                jn8.j(om811, (long) (k2 & 1048575), Boolean.valueOf(yk8.v()));
                                om812.v(D, i6, om811);
                                break;
                            case 59:
                                xb4 = xb43;
                                om811 = obj;
                                om812.L(k2, tt22, om811);
                                om812.v(D, i6, om811);
                                break;
                            case 60:
                                xb4 = xb43;
                                om811 = obj;
                                pk8 pk83 = (pk8) om812.I(D, i6, om811);
                                wm8 D4 = om812.D(i6);
                                tt22.w(2);
                                tt22.x(pk83, D4, gl82);
                                om812.J(om811, D, pk83, i6);
                                break;
                            case 61:
                                xb4 = xb43;
                                om811 = obj;
                                jn8.j(om811, (long) (k2 & 1048575), tt22.E());
                                om812.v(D, i6, om811);
                                break;
                            case 62:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                jn8.j(om811, (long) (k2 & 1048575), Integer.valueOf(yk8.A()));
                                om812.v(D, i6, om811);
                                break;
                            case 63:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                int B2 = yk8.B();
                                kk8 F4 = om812.F(i6);
                                if (F4 != null) {
                                    if (!F4.a(B2)) {
                                        xb4 xb45 = xm8.a;
                                        if (obj9 == null) {
                                            xb4.getClass();
                                            obj6 = xb4.i(om811);
                                        } else {
                                            obj6 = obj9;
                                        }
                                        xb4.getClass();
                                        ((en8) obj6).d(D << 3, Long.valueOf((long) B2));
                                        break;
                                    }
                                }
                                jn8.j(om811, (long) (k2 & 1048575), Integer.valueOf(B2));
                                om812.v(D, i6, om811);
                                break;
                            case 64:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(5);
                                jn8.j(om811, (long) (k2 & 1048575), Integer.valueOf(yk8.C()));
                                om812.v(D, i6, om811);
                                break;
                            case 65:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(1);
                                jn8.j(om811, (long) (k2 & 1048575), Long.valueOf(yk8.D()));
                                om812.v(D, i6, om811);
                                break;
                            case 66:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                jn8.j(om811, (long) (k2 & 1048575), Integer.valueOf(yk8.E()));
                                om812.v(D, i6, om811);
                                break;
                            case 67:
                                xb4 = xb43;
                                om811 = obj;
                                tt22.w(0);
                                jn8.j(om811, (long) (k2 & 1048575), Long.valueOf(yk8.F()));
                                om812.v(D, i6, om811);
                                break;
                            case 68:
                                xb4 = xb43;
                                om811 = obj;
                                try {
                                    pk8 pk84 = (pk8) om812.I(D, i6, om811);
                                    wm8 D5 = om812.D(i6);
                                    tt22.w(3);
                                    tt22.y(pk84, D5, gl82);
                                    om812.J(om811, D, pk84, i6);
                                    break;
                                } catch (zzaeg unused7) {
                                    om84 = om812;
                                    obj3 = obj9;
                                    om83 = om811;
                                    obj9 = obj3;
                                    om82 = om84;
                                    if (obj9 == null) {
                                    }
                                    xb4.getClass();
                                    if (!xb4.j(i5, tt22, obj9)) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj3 = obj9;
                                    xb43 = xb4;
                                    obj9 = obj3;
                                    obj2 = obj9;
                                    while (i4 < i3) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            default:
                                if (obj9 == null) {
                                    try {
                                        xb43.getClass();
                                        obj9 = xb4.i(obj);
                                    } catch (zzaeg unused8) {
                                        om84 = om812;
                                        obj3 = obj9;
                                        xb4 = xb43;
                                        om83 = obj;
                                        obj9 = obj3;
                                        om82 = om84;
                                        if (obj9 == null) {
                                        }
                                        xb4.getClass();
                                        if (!xb4.j(i5, tt22, obj9)) {
                                        }
                                    }
                                }
                                try {
                                    xb43.getClass();
                                    if (xb4.j(0, tt22, obj9)) {
                                        xb4 = xb43;
                                        Object obj28 = obj;
                                        break;
                                    } else {
                                        obj5 = obj9;
                                        while (i4 < i3) {
                                            Object obj29 = obj;
                                            obj5 = om812.K(obj29, iArr[i4], obj5, xb43, obj);
                                            xb4 xb46 = xb43;
                                            Object obj30 = obj29;
                                            i4++;
                                            xb43 = xb46;
                                        }
                                        xb4 = xb43;
                                        Object obj31 = obj;
                                        break;
                                    }
                                } catch (zzaeg unused9) {
                                    xb4 = xb43;
                                    om82 = om812;
                                    om83 = obj;
                                    if (obj9 == null) {
                                    }
                                    xb4.getClass();
                                    if (!xb4.j(i5, tt22, obj9)) {
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    xb4 = xb43;
                                    Object obj32 = obj;
                                    xb43 = xb4;
                                    obj2 = obj9;
                                    while (i4 < i3) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        om8 om825 = om812;
                        obj3 = obj9;
                        xb4 xb47 = xb43;
                        Object obj33 = obj;
                        obj9 = obj3;
                        obj2 = obj9;
                        while (i4 < i3) {
                        }
                        if (obj2 != null) {
                        }
                        throw th;
                    }
                } else if (D == Integer.MAX_VALUE) {
                    Object obj34 = obj9;
                    while (i4 < i3) {
                        obj34 = om812.K(obj, iArr[i4], obj4, xb43, obj);
                        i4++;
                        om812 = this;
                    }
                } else {
                    if (obj9 == null) {
                        xb43.getClass();
                        obj9 = xb4.i(obj);
                    }
                    try {
                        xb43.getClass();
                        if (!xb4.j(0, tt22, obj9)) {
                            obj4 = obj9;
                            while (i4 < i3) {
                                obj4 = K(obj, iArr[i4], obj4, xb43, obj);
                                i4++;
                            }
                        } else {
                            om812 = this;
                            om8 = om8;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj2 = obj9;
                        while (i4 < i3) {
                        }
                        if (obj2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                obj3 = obj9;
                obj9 = obj3;
                obj2 = obj9;
                while (i4 < i3) {
                }
                if (obj2 != null) {
                }
                throw th;
            }
        }
        xb43 = xb4;
        if (obj4 == null) {
            xb43.getClass();
            ((nl8) obj).zzc = (en8) obj4;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x037b, code lost:
        r8 = (r8 * r7) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x048e, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0498, code lost:
        r9 = r9 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x055a, code lost:
        r5 = r5 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0572, code lost:
        r9 = defpackage.hl6.f(r5, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x057e, code lost:
        r9 = defpackage.hl6.f(r12 << 3, 8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x058c, code lost:
        r9 = defpackage.hl6.f(r12 << 3, 4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05d1, code lost:
        r9 = defpackage.hl6.g(r5, r5, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        r9 = r9 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r9 = r9 + (r7 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        r9 = defpackage.hl6.f(r7, r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        r9 = defpackage.hl6.f(r12 << 3, 8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r9 = defpackage.hl6.f(r12 << 3, 4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0102, code lost:
        r9 = defpackage.hl6.g(r7, r7, r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        r9 = defpackage.hl6.g(r5, r5, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0203, code lost:
        r9 = r9 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0249, code lost:
        r9 = defpackage.hl6.g(r5, r7, r5, r9);
     */
    public final int d(pk8 pk8) {
        int i2;
        int a2;
        int b2;
        int a3;
        int b3;
        int a4;
        int c2;
        int i3;
        int a5;
        int i4;
        int i5;
        int c3;
        int a6;
        int size;
        int s;
        int a7;
        int i6;
        int b4;
        int i7;
        int size2;
        int a8;
        int i8;
        int a9;
        int b5;
        int a10;
        int b6;
        int o;
        int a11;
        om8 om8 = this;
        pk8 pk82 = pk8;
        Unsafe unsafe = l;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = om8.a;
            if (i11 < iArr.length) {
                int k2 = om8.k(i11);
                int l2 = l(k2);
                int i14 = iArr[i11];
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i9;
                if (l2 <= 17) {
                    if (i16 != i10) {
                        if (i16 == i9) {
                            i12 = 0;
                        } else {
                            i12 = unsafe.getInt(pk82, (long) i16);
                        }
                        i10 = i16;
                    }
                    i2 = 1 << (i15 >>> 20);
                } else {
                    i2 = 0;
                }
                int i17 = k2 & i9;
                if (l2 >= jl8.DOUBLE_LIST_PACKED.w) {
                    jl8.SINT64_LIST_PACKED.getClass();
                }
                long j2 = (long) i17;
                switch (l2) {
                    case b85.b:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        }
                    case 1:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        }
                    case 2:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            long j3 = unsafe.getLong(pk82, j2);
                            a2 = fl8.a(i14 << 3);
                            b2 = fl8.b(j3);
                            break;
                        }
                    case 3:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            long j4 = unsafe.getLong(pk82, j2);
                            a2 = fl8.a(i14 << 3);
                            b2 = fl8.b(j4);
                            break;
                        }
                    case 4:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            a2 = fl8.a(i14 << 3);
                            b2 = fl8.b((long) unsafe.getInt(pk82, j2));
                            break;
                        }
                    case 5:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        }
                    case 6:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        }
                    case 7:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            i13 = hl6.f(i14 << 3, 1, i13);
                            break;
                        }
                    case 8:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            int i18 = i14 << 3;
                            Object object = unsafe.getObject(pk82, j2);
                            if (object instanceof vk8) {
                                a3 = fl8.a(i18);
                                b3 = ((vk8) object).f();
                            } else {
                                a3 = fl8.a(i18);
                                b3 = ln8.b((String) object);
                            }
                        }
                    case 9:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(pk82, j2);
                            wm8 D = om8.D(i11);
                            xb4 xb4 = xm8.a;
                            a4 = fl8.a(i14 << 3);
                            c2 = ((pk8) object2).c(D);
                        }
                    case 10:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            a3 = fl8.a(i14 << 3);
                            b3 = ((vk8) unsafe.getObject(pk82, j2)).f();
                        }
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            i3 = unsafe.getInt(pk82, j2);
                            a5 = fl8.a(i14 << 3);
                        }
                    case 12:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            a2 = fl8.a(i14 << 3);
                            b2 = fl8.b((long) unsafe.getInt(pk82, j2));
                            break;
                        }
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        }
                    case 14:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        }
                    case h75.g:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            int i19 = unsafe.getInt(pk82, j2);
                            a5 = fl8.a(i14 << 3);
                            i3 = (i19 >> 31) ^ (i19 + i19);
                        }
                    case 16:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            long j5 = unsafe.getLong(pk82, j2);
                            a2 = fl8.a(i14 << 3);
                            b2 = fl8.b((j5 >> 63) ^ (j5 + j5));
                            break;
                        }
                    case 17:
                        if (!om8.r(pk82, i11, i10, i12, i2)) {
                            break;
                        } else {
                            wm8 D2 = om8.D(i11);
                            xb4 xb42 = xm8.a;
                            int a12 = fl8.a(i14 << 3);
                            i5 = a12 + a12;
                            c3 = ((pk8) unsafe.getObject(pk82, j2)).c(D2);
                            break;
                        }
                    case 18:
                        i4 = xm8.z(i14, (List) unsafe.getObject(pk82, j2));
                        break;
                    case 19:
                        i4 = xm8.y(i14, (List) unsafe.getObject(pk82, j2));
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(pk82, j2);
                        xb4 xb43 = xm8.a;
                        if (list.size() != 0) {
                            a6 = (fl8.a(i14 << 3) * list.size()) + xm8.r(list);
                            break;
                        }
                    case 21:
                        List list2 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb44 = xm8.a;
                        size = list2.size();
                        if (size != 0) {
                            s = xm8.s(list2);
                            a7 = fl8.a(i14 << 3);
                            break;
                        }
                    case 22:
                        List list3 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb45 = xm8.a;
                        size = list3.size();
                        if (size != 0) {
                            s = xm8.v(list3);
                            a7 = fl8.a(i14 << 3);
                            break;
                        }
                    case 23:
                        i4 = xm8.z(i14, (List) unsafe.getObject(pk82, j2));
                        break;
                    case 24:
                        i4 = xm8.y(i14, (List) unsafe.getObject(pk82, j2));
                        break;
                    case 25:
                        xb4 xb46 = xm8.a;
                        int size3 = ((List) unsafe.getObject(pk82, j2)).size();
                        if (size3 != 0) {
                            a6 = (fl8.a(i14 << 3) + 1) * size3;
                            break;
                        }
                    case 26:
                        List list4 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb47 = xm8.a;
                        int size4 = list4.size();
                        if (size4 != 0) {
                            int a13 = fl8.a(i14 << 3) * size4;
                            for (int i20 = 0; i20 < size4; i20++) {
                                Object obj = list4.get(i20);
                                if (obj instanceof vk8) {
                                    b4 = ((vk8) obj).f();
                                } else {
                                    b4 = ln8.b((String) obj);
                                }
                                a13 = hl6.f(b4, b4, i6);
                            }
                            break;
                        }
                    case 27:
                        List list5 = (List) unsafe.getObject(pk82, j2);
                        wm8 D3 = om8.D(i11);
                        xb4 xb48 = xm8.a;
                        int size5 = list5.size();
                        if (size5 == 0) {
                            i7 = 0;
                        } else {
                            i7 = fl8.a(i14 << 3) * size5;
                            for (int i21 = 0; i21 < size5; i21++) {
                                int c4 = ((pk8) list5.get(i21)).c(D3);
                                i7 = hl6.f(c4, c4, i7);
                            }
                        }
                        i13 += i7;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb49 = xm8.a;
                        int size6 = list6.size();
                        if (size6 != 0) {
                            int a14 = fl8.a(i14 << 3) * size6;
                            for (int i22 = 0; i22 < list6.size(); i22++) {
                                int f2 = ((vk8) list6.get(i22)).f();
                                a14 = hl6.f(f2, f2, i6);
                            }
                            break;
                        }
                    case 29:
                        List list7 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb410 = xm8.a;
                        size = list7.size();
                        if (size != 0) {
                            s = xm8.w(list7);
                            a7 = fl8.a(i14 << 3);
                            break;
                        }
                        i6 = 0;
                        break;
                    case 30:
                        List list8 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb411 = xm8.a;
                        size = list8.size();
                        if (size != 0) {
                            s = xm8.u(list8);
                            a7 = fl8.a(i14 << 3);
                            break;
                        }
                        i6 = 0;
                        break;
                    case 31:
                        i4 = xm8.y(i14, (List) unsafe.getObject(pk82, j2));
                        break;
                    case 32:
                        i4 = xm8.z(i14, (List) unsafe.getObject(pk82, j2));
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb412 = xm8.a;
                        size = list9.size();
                        if (size != 0) {
                            s = xm8.x(list9);
                            a7 = fl8.a(i14 << 3);
                            break;
                        }
                        i6 = 0;
                        break;
                    case 34:
                        List list10 = (List) unsafe.getObject(pk82, j2);
                        xb4 xb413 = xm8.a;
                        size = list10.size();
                        if (size != 0) {
                            s = xm8.t(list10);
                            a7 = fl8.a(i14 << 3);
                            break;
                        }
                        i6 = 0;
                        break;
                    case 35:
                        xb4 xb414 = xm8.a;
                        size2 = ((List) unsafe.getObject(pk82, j2)).size() * 8;
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 36:
                        xb4 xb415 = xm8.a;
                        size2 = ((List) unsafe.getObject(pk82, j2)).size() * 4;
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 37:
                        size2 = xm8.r((List) unsafe.getObject(pk82, j2));
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 38:
                        size2 = xm8.s((List) unsafe.getObject(pk82, j2));
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 39:
                        size2 = xm8.v((List) unsafe.getObject(pk82, j2));
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 40:
                        xb4 xb416 = xm8.a;
                        size2 = ((List) unsafe.getObject(pk82, j2)).size() * 8;
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 41:
                        xb4 xb417 = xm8.a;
                        size2 = ((List) unsafe.getObject(pk82, j2)).size() * 4;
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 42:
                        xb4 xb418 = xm8.a;
                        size2 = ((List) unsafe.getObject(pk82, j2)).size();
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 43:
                        size2 = xm8.w((List) unsafe.getObject(pk82, j2));
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 44:
                        size2 = xm8.u((List) unsafe.getObject(pk82, j2));
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 45:
                        xb4 xb419 = xm8.a;
                        size2 = ((List) unsafe.getObject(pk82, j2)).size() * 4;
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 46:
                        xb4 xb420 = xm8.a;
                        size2 = ((List) unsafe.getObject(pk82, j2)).size() * 8;
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 47:
                        size2 = xm8.x((List) unsafe.getObject(pk82, j2));
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case h75.h:
                        size2 = xm8.t((List) unsafe.getObject(pk82, j2));
                        if (size2 <= 0) {
                            break;
                        } else {
                            a8 = fl8.a(i14 << 3);
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(pk82, j2);
                        wm8 D4 = om8.D(i11);
                        xb4 xb421 = xm8.a;
                        int size7 = list11.size();
                        if (size7 == 0) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                            for (int i23 = 0; i23 < size7; i23++) {
                                int a15 = fl8.a(i14 << 3);
                                i8 += ((pk8) list11.get(i23)).c(D4) + a15 + a15;
                            }
                        }
                        i13 += i8;
                        break;
                    case 50:
                        hm8 hm8 = (hm8) unsafe.getObject(pk82, j2);
                        gm8 gm8 = (gm8) om8.E(i11);
                        if (!hm8.isEmpty()) {
                            i6 = 0;
                            for (Map.Entry entry : hm8.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                fm8 fm8 = gm8.a;
                                int a16 = fl8.a(i14 << 3);
                                int b7 = gm8.b(fm8, key, value);
                                i6 = hl6.g(b7, b7, a16, i6);
                            }
                            break;
                        }
                    case 51:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        }
                    case 52:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        }
                    case 53:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            long p = p(j2, pk82);
                            a9 = fl8.a(i14 << 3);
                            b5 = fl8.b(p);
                        }
                    case 54:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            long p2 = p(j2, pk82);
                            a9 = fl8.a(i14 << 3);
                            b5 = fl8.b(p2);
                        }
                    case 55:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            a9 = fl8.a(i14 << 3);
                            b5 = fl8.b((long) o(j2, pk82));
                        }
                    case 56:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        }
                    case 57:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        }
                    case 58:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            i13 = hl6.f(i14 << 3, 1, i13);
                            break;
                        }
                    case 59:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            int i24 = i14 << 3;
                            Object object3 = unsafe.getObject(pk82, j2);
                            if (object3 instanceof vk8) {
                                a10 = fl8.a(i24);
                                b6 = ((vk8) object3).f();
                            } else {
                                a10 = fl8.a(i24);
                                b6 = ln8.b((String) object3);
                            }
                        }
                    case 60:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            Object object4 = unsafe.getObject(pk82, j2);
                            wm8 D5 = om8.D(i11);
                            xb4 xb422 = xm8.a;
                            a4 = fl8.a(i14 << 3);
                            c2 = ((pk8) object4).c(D5);
                        }
                    case 61:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            a10 = fl8.a(i14 << 3);
                            b6 = ((vk8) unsafe.getObject(pk82, j2)).f();
                        }
                    case 62:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            o = o(j2, pk82);
                            a11 = fl8.a(i14 << 3);
                        }
                    case 63:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            a9 = fl8.a(i14 << 3);
                            b5 = fl8.b((long) o(j2, pk82));
                        }
                    case 64:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        }
                    case 65:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        }
                    case 66:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            int o2 = o(j2, pk82);
                            a11 = fl8.a(i14 << 3);
                            o = (o2 >> 31) ^ (o2 + o2);
                        }
                    case 67:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            long p3 = p(j2, pk82);
                            a9 = fl8.a(i14 << 3);
                            b5 = fl8.b((p3 >> 63) ^ (p3 + p3));
                        }
                    case 68:
                        if (!om8.u(i14, i11, pk82)) {
                            break;
                        } else {
                            wm8 D6 = om8.D(i11);
                            xb4 xb423 = xm8.a;
                            int a17 = fl8.a(i14 << 3);
                            i5 = a17 + a17;
                            c3 = ((pk8) unsafe.getObject(pk82, j2)).c(D6);
                            break;
                        }
                }
            } else {
                return ((nl8) pk8).zzc.c() + i13;
            }
            i11 += 3;
            om8 = this;
            pk82 = pk8;
            i9 = 1048575;
        }
    }

    public final boolean e(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.h) {
            int i7 = this.g[i4];
            int k2 = this.k(i7);
            int[] iArr = this.a;
            int i8 = iArr[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = l.getInt(obj, (long) i9);
                }
                i2 = i5;
                i3 = i9;
            } else {
                i3 = i6;
                i2 = i5;
            }
            om8 om8 = this;
            Object obj2 = obj;
            if ((268435456 & k2) == 0 || om8.r(obj2, i7, i3, i2, i10)) {
                int l2 = l(k2);
                if (l2 != 9 && l2 != 17) {
                    if (l2 != 27) {
                        if (l2 == 60 || l2 == 68) {
                            if (om8.u(iArr[i7], i7, obj2) && !om8.D(i7).e(jn8.i((long) (k2 & 1048575), obj2))) {
                            }
                        } else if (l2 != 49) {
                            if (l2 != 50) {
                                continue;
                            } else {
                                hm8 hm8 = (hm8) jn8.i((long) (k2 & 1048575), obj2);
                                if (!hm8.isEmpty() && ((mn8) ((gm8) om8.E(i7)).a.y).w == nn8.E) {
                                    wm8 wm8 = null;
                                    for (Object next : hm8.values()) {
                                        if (wm8 == null) {
                                            wm8 = tm8.c.a(next.getClass());
                                        }
                                        if (!wm8.e(next)) {
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                    List list = (List) jn8.i((long) (k2 & 1048575), obj2);
                    if (!list.isEmpty()) {
                        wm8 D = om8.D(i7);
                        int i11 = 0;
                        while (i11 < list.size()) {
                            if (D.e(list.get(i11))) {
                                i11++;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else if (om8.r(obj2, i7, i3, i2, i10) && !om8.D(i7).e(jn8.i((long) (k2 & 1048575), obj2))) {
                }
                i4++;
                this = om8;
                obj = obj2;
                i6 = i3;
                i5 = i2;
            }
            return false;
        }
        return true;
    }

    public final void f(Object obj) {
        if (m(obj)) {
            if (obj instanceof nl8) {
                nl8 nl8 = (nl8) obj;
                nl8.l();
                nl8.zza = 0;
                nl8.h();
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i2 < iArr.length) {
                    int k2 = k(i2);
                    int i3 = 1048575 & k2;
                    int l2 = l(k2);
                    long j2 = (long) i3;
                    if (l2 != 9) {
                        if (l2 == 60 || l2 == 68) {
                            if (u(iArr[i2], i2, obj)) {
                                D(i2).f(l.getObject(obj, j2));
                            }
                            i2 += 3;
                        } else {
                            switch (l2) {
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
                                case h75.h:
                                case 49:
                                    qk8 qk8 = (qk8) ((zl8) jn8.i(j2, obj));
                                    if (qk8.w) {
                                        qk8.w = false;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 50:
                                    Unsafe unsafe = l;
                                    Object object = unsafe.getObject(obj, j2);
                                    if (object != null) {
                                        ((hm8) object).w = false;
                                        unsafe.putObject(obj, j2, object);
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        }
                    }
                    if (s(i2, obj)) {
                        D(i2).f(l.getObject(obj, j2));
                    }
                    i2 += 3;
                } else {
                    this.j.getClass();
                    en8 en8 = ((nl8) obj).zzc;
                    if (en8.e) {
                        en8.e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2 = r2 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r3 = (int) (r3 ^ (r3 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r2 = r2 + r3;
     */
    public final int g(nl8 nl8) {
        int i2;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int i4;
        int i5;
        int i6 = 0;
        for (int i7 = 0; i7 < this.a.length; i7 += 3) {
            int k2 = k(i7);
            int l2 = l(k2);
            if (l2 <= 50 || l2 >= 69) {
                long j2 = (long) (k2 & 1048575);
                int i8 = 37;
                switch (l2) {
                    case b85.b:
                        i2 = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(jn8.c.a1(j2, nl8));
                        byte[] bArr = xl8.a;
                        break;
                    case 1:
                        i3 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(jn8.c.Y0(j2, nl8));
                        break;
                    case 2:
                        i2 = i6 * 53;
                        doubleToLongBits = jn8.g(j2, nl8);
                        byte[] bArr2 = xl8.a;
                        break;
                    case 3:
                        i2 = i6 * 53;
                        doubleToLongBits = jn8.g(j2, nl8);
                        byte[] bArr3 = xl8.a;
                        break;
                    case 4:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.e(j2, nl8);
                        break;
                    case 5:
                        i2 = i6 * 53;
                        doubleToLongBits = jn8.g(j2, nl8);
                        byte[] bArr4 = xl8.a;
                        break;
                    case 6:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.e(j2, nl8);
                        break;
                    case 7:
                        i2 = i6 * 53;
                        boolean W0 = jn8.c.W0(j2, nl8);
                        byte[] bArr5 = xl8.a;
                        if (!W0) {
                            i4 = 1237;
                            break;
                        } else {
                            i4 = 1231;
                            break;
                        }
                    case 8:
                        i3 = i6 * 53;
                        floatToIntBits = ((String) jn8.i(j2, nl8)).hashCode();
                        break;
                    case 9:
                        i5 = i6 * 53;
                        Object i9 = jn8.i(j2, nl8);
                        if (i9 != null) {
                            i8 = i9.hashCode();
                            break;
                        }
                        break;
                    case 10:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.i(j2, nl8).hashCode();
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.e(j2, nl8);
                        break;
                    case 12:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.e(j2, nl8);
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.e(j2, nl8);
                        break;
                    case 14:
                        i2 = i6 * 53;
                        doubleToLongBits = jn8.g(j2, nl8);
                        byte[] bArr6 = xl8.a;
                        break;
                    case h75.g:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.e(j2, nl8);
                        break;
                    case 16:
                        i2 = i6 * 53;
                        doubleToLongBits = jn8.g(j2, nl8);
                        byte[] bArr7 = xl8.a;
                        break;
                    case 17:
                        i5 = i6 * 53;
                        Object i10 = jn8.i(j2, nl8);
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
                    case h75.h:
                    case 49:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.i(j2, nl8).hashCode();
                        break;
                    case 50:
                        i3 = i6 * 53;
                        floatToIntBits = jn8.i(j2, nl8).hashCode();
                        break;
                }
            }
        }
        int i11 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (!u(0, i12, nl8)) {
                    i6 = jn8.i((long) (k(i12) & 1048575), nl8).hashCode() + (i6 * 53);
                }
                i11++;
            } else {
                return nl8.zzc.hashCode() + (i6 * 53);
            }
        }
    }

    public final void h(Object obj, br4 br4) {
        int[] iArr;
        int i2;
        om8 om8 = this;
        Object obj2 = obj;
        br4 br42 = br4;
        fl8 fl8 = (fl8) br42.x;
        Unsafe unsafe = l;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr2 = om8.a;
            if (i5 < iArr2.length) {
                int k2 = om8.k(i5);
                int l2 = l(k2);
                int i7 = iArr2[i5];
                if (l2 <= 17) {
                    int i8 = iArr2[i5 + 2];
                    int i9 = i8 & i3;
                    if (i9 != i4) {
                        if (i9 == i3) {
                            i6 = 0;
                        } else {
                            i6 = unsafe.getInt(obj2, (long) i9);
                        }
                        i4 = i9;
                    }
                    iArr = iArr2;
                    i2 = 1 << (i8 >>> 20);
                } else {
                    iArr = iArr2;
                    i2 = 0;
                }
                long j2 = (long) (k2 & i3);
                switch (l2) {
                    case b85.b:
                        if (!om8.r(obj2, i5, i4, i6, i2)) {
                            break;
                        } else {
                            fl8.i(Double.doubleToRawLongBits(jn8.c.a1(j2, obj2)), i7);
                            continue;
                        }
                    case 1:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.g(i7, Float.floatToRawIntBits(jn8.c.Y0(j2, obj2)));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.h(unsafe.getLong(obj2, j2), i7);
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.h(unsafe.getLong(obj2, j2), i7);
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.e(i7, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.i(unsafe.getLong(obj2, j2), i7);
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.g(i7, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.j(i7, jn8.c.W0(j2, obj2));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            Object object = unsafe.getObject(obj2, j2);
                            if (!(object instanceof String)) {
                                fl8.l(i7, (vk8) object);
                                break;
                            } else {
                                fl8.k(i7, (String) object);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            br42.Y(i7, unsafe.getObject(obj2, j2), om8.D(i5));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.l(i7, (vk8) unsafe.getObject(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.f(i7, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.e(i7, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.g(i7, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            fl8.i(unsafe.getLong(obj2, j2), i7);
                            break;
                        } else {
                            continue;
                        }
                    case h75.g:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            int i10 = unsafe.getInt(obj2, j2);
                            fl8.f(i7, (i10 >> 31) ^ (i10 + i10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            long j3 = unsafe.getLong(obj2, j2);
                            fl8.h((j3 >> 63) ^ (j3 + j3), i7);
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (om8.r(obj2, i5, i4, i6, i2)) {
                            Object object2 = unsafe.getObject(obj2, j2);
                            fl8.d(i7, 3);
                            om8.D(i5).h((pk8) object2, br42);
                            fl8.d(i7, 4);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        xm8.d(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 19:
                        xm8.e(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 20:
                        xm8.f(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 21:
                        xm8.g(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 22:
                        xm8.k(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 23:
                        xm8.i(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 24:
                        xm8.n(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 25:
                        xm8.q(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 26:
                        int i11 = iArr[i5];
                        List list = (List) unsafe.getObject(obj2, j2);
                        xb4 xb4 = xm8.a;
                        if (list != null && !list.isEmpty()) {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                fl8.k(i11, (String) list.get(i12));
                            }
                            break;
                        }
                    case 27:
                        int i13 = iArr[i5];
                        List list2 = (List) unsafe.getObject(obj2, j2);
                        wm8 D = om8.D(i5);
                        xb4 xb42 = xm8.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i14 = 0; i14 < list2.size(); i14++) {
                                br42.Y(i13, list2.get(i14), D);
                            }
                            break;
                        }
                    case 28:
                        int i15 = iArr[i5];
                        List list3 = (List) unsafe.getObject(obj2, j2);
                        xb4 xb43 = xm8.a;
                        if (list3 != null && !list3.isEmpty()) {
                            for (int i16 = 0; i16 < list3.size(); i16++) {
                                fl8.l(i15, (vk8) list3.get(i16));
                            }
                            break;
                        }
                    case 29:
                        xm8.l(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 30:
                        xm8.p(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 31:
                        xm8.o(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 32:
                        xm8.j(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 33:
                        xm8.m(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 34:
                        xm8.h(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, false);
                        continue;
                    case 35:
                        xm8.d(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 36:
                        xm8.e(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 37:
                        xm8.f(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 38:
                        xm8.g(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 39:
                        xm8.k(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 40:
                        xm8.i(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 41:
                        xm8.n(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 42:
                        xm8.q(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 43:
                        xm8.l(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 44:
                        xm8.p(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 45:
                        xm8.o(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 46:
                        xm8.j(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 47:
                        xm8.m(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case h75.h:
                        xm8.h(iArr[i5], (List) unsafe.getObject(obj2, j2), br42, true);
                        break;
                    case 49:
                        int i17 = iArr[i5];
                        List list4 = (List) unsafe.getObject(obj2, j2);
                        wm8 D2 = om8.D(i5);
                        xb4 xb44 = xm8.a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i18 = 0; i18 < list4.size(); i18++) {
                                fl8.d(i17, 3);
                                D2.h((pk8) list4.get(i18), br42);
                                fl8.d(i17, 4);
                            }
                            break;
                        }
                    case 50:
                        Object object3 = unsafe.getObject(obj2, j2);
                        if (object3 != null) {
                            fm8 fm8 = ((gm8) om8.E(i5)).a;
                            for (Map.Entry entry : ((hm8) object3).entrySet()) {
                                fl8.d(i7, 2);
                                fl8.r(gm8.b(fm8, entry.getKey(), entry.getValue()));
                                gm8.a(fl8, fm8, entry.getKey(), entry.getValue());
                            }
                            break;
                        }
                        break;
                    case 51:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.i(Double.doubleToRawLongBits(((Double) jn8.i(j2, obj2)).doubleValue()), i7);
                            break;
                        }
                        break;
                    case 52:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.g(i7, Float.floatToRawIntBits(((Float) jn8.i(j2, obj2)).floatValue()));
                            break;
                        }
                        break;
                    case 53:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.h(p(j2, obj2), i7);
                            break;
                        }
                        break;
                    case 54:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.h(p(j2, obj2), i7);
                            break;
                        }
                        break;
                    case 55:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.e(i7, o(j2, obj2));
                            break;
                        }
                        break;
                    case 56:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.i(p(j2, obj2), i7);
                            break;
                        }
                        break;
                    case 57:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.g(i7, o(j2, obj2));
                            break;
                        }
                        break;
                    case 58:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.j(i7, ((Boolean) jn8.i(j2, obj2)).booleanValue());
                            break;
                        }
                        break;
                    case 59:
                        if (om8.u(i7, i5, obj2)) {
                            Object object4 = unsafe.getObject(obj2, j2);
                            if (!(object4 instanceof String)) {
                                fl8.l(i7, (vk8) object4);
                                break;
                            } else {
                                fl8.k(i7, (String) object4);
                                break;
                            }
                        }
                        break;
                    case 60:
                        if (om8.u(i7, i5, obj2)) {
                            br42.Y(i7, unsafe.getObject(obj2, j2), om8.D(i5));
                            break;
                        }
                        break;
                    case 61:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.l(i7, (vk8) unsafe.getObject(obj2, j2));
                            break;
                        }
                        break;
                    case 62:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.f(i7, o(j2, obj2));
                            break;
                        }
                        break;
                    case 63:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.e(i7, o(j2, obj2));
                            break;
                        }
                        break;
                    case 64:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.g(i7, o(j2, obj2));
                            break;
                        }
                        break;
                    case 65:
                        if (om8.u(i7, i5, obj2)) {
                            fl8.i(p(j2, obj2), i7);
                            break;
                        }
                        break;
                    case 66:
                        if (om8.u(i7, i5, obj2)) {
                            int o = o(j2, obj2);
                            fl8.f(i7, (o >> 31) ^ (o + o));
                            break;
                        }
                        break;
                    case 67:
                        if (om8.u(i7, i5, obj2)) {
                            long p = p(j2, obj2);
                            fl8.h((p >> 63) ^ (p + p), i7);
                            break;
                        }
                        break;
                    case 68:
                        if (om8.u(i7, i5, obj2)) {
                            Object object5 = unsafe.getObject(obj2, j2);
                            fl8.d(i7, 3);
                            om8.D(i5).h((pk8) object5, br42);
                            fl8.d(i7, 4);
                            break;
                        }
                        break;
                }
                i5 += 3;
                i3 = 1048575;
                om8 = this;
            } else {
                ((nl8) obj2).zzc.b(br42);
                return;
            }
        }
    }

    public final void i(Object obj, byte[] bArr, int i2, int i3, mj2 mj2) {
        y(obj, bArr, i2, i3, 0, mj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01d1, code lost:
        continue;
     */
    public final boolean j(nl8 nl8, nl8 nl82) {
        boolean z;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int k2 = k(i2);
                int l2 = l(k2);
                if (l2 <= 50 || l2 >= 69) {
                    long j2 = (long) (k2 & 1048575);
                    switch (l2) {
                        case b85.b:
                            if (!q(nl8, nl82, i2)) {
                                break;
                            } else {
                                in8 in8 = jn8.c;
                                if (Double.doubleToLongBits(in8.a1(j2, nl8)) != Double.doubleToLongBits(in8.a1(j2, nl82))) {
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 1:
                            if (!q(nl8, nl82, i2)) {
                                break;
                            } else {
                                in8 in82 = jn8.c;
                                if (Float.floatToIntBits(in82.Y0(j2, nl8)) != Float.floatToIntBits(in82.Y0(j2, nl82))) {
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 2:
                            if (q(nl8, nl82, i2) && jn8.g(j2, nl8) == jn8.g(j2, nl82)) {
                                continue;
                            }
                        case 3:
                            if (q(nl8, nl82, i2) && jn8.g(j2, nl8) == jn8.g(j2, nl82)) {
                                continue;
                            }
                        case 4:
                            if (q(nl8, nl82, i2) && jn8.e(j2, nl8) == jn8.e(j2, nl82)) {
                                continue;
                            }
                        case 5:
                            if (q(nl8, nl82, i2) && jn8.g(j2, nl8) == jn8.g(j2, nl82)) {
                                continue;
                            }
                        case 6:
                            if (q(nl8, nl82, i2) && jn8.e(j2, nl8) == jn8.e(j2, nl82)) {
                                continue;
                            }
                        case 7:
                            if (!q(nl8, nl82, i2)) {
                                break;
                            } else {
                                in8 in83 = jn8.c;
                                if (in83.W0(j2, nl8) != in83.W0(j2, nl82)) {
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 8:
                            if (q(nl8, nl82, i2) && xm8.a(jn8.i(j2, nl8), jn8.i(j2, nl82))) {
                                continue;
                            }
                        case 9:
                            if (q(nl8, nl82, i2) && xm8.a(jn8.i(j2, nl8), jn8.i(j2, nl82))) {
                                continue;
                            }
                        case 10:
                            if (q(nl8, nl82, i2) && xm8.a(jn8.i(j2, nl8), jn8.i(j2, nl82))) {
                                continue;
                            }
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                            if (q(nl8, nl82, i2) && jn8.e(j2, nl8) == jn8.e(j2, nl82)) {
                                continue;
                            }
                        case 12:
                            if (q(nl8, nl82, i2) && jn8.e(j2, nl8) == jn8.e(j2, nl82)) {
                                continue;
                            }
                        case ry4.PERF_SESSIONS_FIELD_NUMBER:
                            if (q(nl8, nl82, i2) && jn8.e(j2, nl8) == jn8.e(j2, nl82)) {
                                continue;
                            }
                        case 14:
                            if (q(nl8, nl82, i2) && jn8.g(j2, nl8) == jn8.g(j2, nl82)) {
                                continue;
                            }
                        case h75.g:
                            if (q(nl8, nl82, i2) && jn8.e(j2, nl8) == jn8.e(j2, nl82)) {
                                continue;
                            }
                        case 16:
                            if (q(nl8, nl82, i2) && jn8.g(j2, nl8) == jn8.g(j2, nl82)) {
                                continue;
                            }
                        case 17:
                            if (q(nl8, nl82, i2) && xm8.a(jn8.i(j2, nl8), jn8.i(j2, nl82))) {
                                continue;
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
                        case h75.h:
                        case 49:
                            z = xm8.a(jn8.i(j2, nl8), jn8.i(j2, nl82));
                            break;
                        case 50:
                            z = xm8.a(jn8.i(j2, nl8), jn8.i(j2, nl82));
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
                            if (jn8.e(j3, nl8) == jn8.e(j3, nl82) && xm8.a(jn8.i(j2, nl8), jn8.i(j2, nl82))) {
                                continue;
                            }
                    }
                    if (!z) {
                    }
                }
                i2 += 3;
            } else {
                int i3 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = (long) (iArr[i4 + 2] & 1048575);
                        if (jn8.e(j4, nl8) != jn8.e(j4, nl82)) {
                            return false;
                        }
                        if (!u(0, i4, nl8)) {
                            long k3 = (long) (k(i4) & 1048575);
                            if (!xm8.a(jn8.i(k3, nl8), jn8.i(k3, nl82))) {
                            }
                        }
                        i3++;
                    } else if (!nl8.zzc.equals(nl82.zzc)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int k(int i2) {
        return this.a[i2 + 1];
    }

    public final boolean q(nl8 nl8, nl8 nl82, int i2) {
        if (s(i2, nl8) == s(i2, nl82)) {
            return true;
        }
        return false;
    }

    public final boolean r(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return s(i2, obj);
        }
        if ((i4 & i5) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f5 A[RETURN] */
    public final boolean s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 == 1048575) {
            int k2 = k(i2);
            long j3 = (long) (k2 & 1048575);
            switch (l(k2)) {
                case b85.b:
                    if (Double.doubleToRawLongBits(jn8.c.a1(j3, obj)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(jn8.c.Y0(j3, obj)) != 0) {
                    }
                    break;
                case 2:
                    if (jn8.g(j3, obj) != 0) {
                    }
                    break;
                case 3:
                    if (jn8.g(j3, obj) != 0) {
                    }
                    break;
                case 4:
                    if (jn8.e(j3, obj) != 0) {
                    }
                    break;
                case 5:
                    if (jn8.g(j3, obj) != 0) {
                    }
                    break;
                case 6:
                    if (jn8.e(j3, obj) != 0) {
                    }
                    break;
                case 7:
                    return jn8.c.W0(j3, obj);
                case 8:
                    Object i4 = jn8.i(j3, obj);
                    if (i4 instanceof String) {
                        if (!((String) i4).isEmpty()) {
                        }
                    } else if (!(i4 instanceof vk8)) {
                        ku4.v();
                        return false;
                    } else if (!vk8.x.equals(i4)) {
                    }
                    break;
                case 9:
                    if (jn8.i(j3, obj) != null) {
                    }
                    break;
                case 10:
                    if (!vk8.x.equals(jn8.i(j3, obj))) {
                    }
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                    if (jn8.e(j3, obj) != 0) {
                    }
                    break;
                case 12:
                    if (jn8.e(j3, obj) != 0) {
                    }
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER:
                    if (jn8.e(j3, obj) != 0) {
                    }
                    break;
                case 14:
                    if (jn8.g(j3, obj) != 0) {
                    }
                    break;
                case h75.g:
                    if (jn8.e(j3, obj) != 0) {
                    }
                    break;
                case 16:
                    if (jn8.g(j3, obj) != 0) {
                    }
                    break;
                case 17:
                    if (jn8.i(j3, obj) != null) {
                    }
                    break;
                default:
                    ku4.v();
                    return false;
            }
        } else if (((1 << (i3 >>> 20)) & jn8.e(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            jn8.f((1 << (i3 >>> 20)) | jn8.e(j2, obj), j2, obj);
        }
    }

    public final boolean u(int i2, int i3, Object obj) {
        if (jn8.e((long) (this.a[i3 + 2] & 1048575), obj) == i2) {
            return true;
        }
        return false;
    }

    public final void v(int i2, int i3, Object obj) {
        jn8.f(i2, (long) (this.a[i3 + 2] & 1048575), obj);
    }

    public final int w(int i2, int i3) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: en8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v42, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v60, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v43, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v63, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v44, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v45, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v64, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v65, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v58, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v70, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v60, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v72, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v71, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v74, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v81, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v79, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v85, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v80, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v87, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v88, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v81, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v90, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v91, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v82, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v92, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v83, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v93, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v101, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v94, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v84, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v102, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v85, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v97, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v99, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v108, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v110, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v86, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v100, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v108, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v101, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v87, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v102, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v110, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v113, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v103, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v67, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v104, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v116, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v118, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v119, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v120, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v121, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v105, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v116, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v106, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v119, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v122, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v74, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v75, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v128, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v106, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v128, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v130, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v78, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v130, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v131, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v112, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v132, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v108, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v134, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v116, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v118, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v135, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v118, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v119, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v136, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v120, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v85, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v122, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v137, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v138, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v126, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v127, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v128, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v139, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v129, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v130, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v121, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v140, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v131, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v132, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v133, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v134, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v135, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v136, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v137, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v138, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v155, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v140, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v142, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v142, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v52, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v143, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v144, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v146, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v149, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v54, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v153, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v155, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v156, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v157, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v147, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v158, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v149, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v159, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v101, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v150, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v160, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v59, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v151, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v161, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v60, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v162, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v152, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v153, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v166, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v62, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v94, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v167, resolved type: mj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v169, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v144, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v145, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v170, resolved type: byte} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0699 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:600:0x0699 A[SYNTHETIC] */
    public final int y(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, defpackage.mj2 r41) {
        /*
            r35 = this;
            r0 = r35
            r2 = r36
            r3 = r37
            r5 = r39
            r6 = r41
            n(r2)
            sun.misc.Unsafe r1 = l
            r4 = r38
            r7 = -1
            r8 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
            r15 = 0
        L_0x0018:
            java.lang.String r16 = "Failed to parse the message."
            if (r4 >= r5) goto L_0x0d54
            int r15 = r4 + 1
            byte r4 = r3[r4]
            if (r4 >= 0) goto L_0x0028
            int r15 = defpackage.ub5.w(r4, r3, r15, r6)
            int r4 = r6.a
        L_0x0028:
            r34 = r15
            r15 = r4
            r4 = r34
            r17 = 1048575(0xfffff, float:1.469367E-39)
            int r13 = r15 >>> 3
            int r12 = r0.d
            r38 = 3
            int r11 = r0.c
            if (r13 <= r7) goto L_0x0048
            int r8 = r8 / 3
            if (r13 < r11) goto L_0x0045
            if (r13 > r12) goto L_0x0045
            int r7 = r0.w(r13, r8)
            goto L_0x0046
        L_0x0045:
            r7 = -1
        L_0x0046:
            r11 = r7
            goto L_0x0054
        L_0x0048:
            if (r13 < r11) goto L_0x0052
            if (r13 > r12) goto L_0x0052
            r7 = 0
            int r8 = r0.w(r13, r7)
            goto L_0x0053
        L_0x0052:
            r8 = -1
        L_0x0053:
            r11 = r8
        L_0x0054:
            en8 r8 = defpackage.en8.f
            r12 = -1
            if (r11 != r12) goto L_0x0068
            r7 = r40
            r10 = r8
            r32 = r9
            r11 = r15
            r20 = 0
            r9 = r1
            r8 = r2
            r15 = r13
            r13 = r4
            r4 = r6
            goto L_0x0d20
        L_0x0068:
            r7 = r15 & 7
            int r18 = r11 + 1
            int[] r12 = r0.a
            r3 = r12[r18]
            r18 = r4
            int r4 = l(r3)
            r5 = r3 & r17
            long r5 = (long) r5
            r20 = r5
            r5 = 17
            r22 = 0
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            java.lang.String r6 = ""
            java.lang.String r26 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r27 = r12
            r28 = 1
            if (r4 > r5) goto L_0x036a
            int r5 = r11 + 2
            r5 = r27[r5]
            int r27 = r5 >>> 20
            int r27 = r28 << r27
            r5 = r5 & r17
            if (r5 == r9) goto L_0x00b0
            r12 = r17
            r30 = r13
            if (r9 == r12) goto L_0x00a4
            long r12 = (long) r9
            r1.putInt(r2, r12, r14)
            r12 = 1048575(0xfffff, float:1.469367E-39)
        L_0x00a4:
            if (r5 != r12) goto L_0x00a8
            r9 = 0
            goto L_0x00ad
        L_0x00a8:
            long r12 = (long) r5
            int r9 = r1.getInt(r2, r12)
        L_0x00ad:
            r12 = r5
            r14 = r9
            goto L_0x00b3
        L_0x00b0:
            r30 = r13
            r12 = r9
        L_0x00b3:
            switch(r4) {
                case 0: goto L_0x0331;
                case 1: goto L_0x0309;
                case 2: goto L_0x02ef;
                case 3: goto L_0x02ef;
                case 4: goto L_0x02d0;
                case 5: goto L_0x0292;
                case 6: goto L_0x0268;
                case 7: goto L_0x0242;
                case 8: goto L_0x01ee;
                case 9: goto L_0x01ac;
                case 10: goto L_0x0192;
                case 11: goto L_0x02d0;
                case 12: goto L_0x0148;
                case 13: goto L_0x0268;
                case 14: goto L_0x0292;
                case 15: goto L_0x0128;
                case 16: goto L_0x00f1;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r4 = r38
            if (r7 != r4) goto L_0x00e3
            r14 = r14 | r27
            java.lang.Object r3 = r0.G(r11, r2)
            int r4 = r30 << 3
            r8 = r4 | 4
            wm8 r4 = r0.D(r11)
            r5 = r37
            r7 = r39
            r9 = r41
            r6 = r18
            int r4 = defpackage.ub5.E(r3, r4, r5, r6, r7, r8, r9)
            r13 = r9
            r9 = r5
            r0.H(r11, r2, r3)
        L_0x00d9:
            r5 = r39
        L_0x00db:
            r3 = r9
            r8 = r11
            r9 = r12
            r6 = r13
        L_0x00df:
            r7 = r30
            goto L_0x0018
        L_0x00e3:
            r13 = r37
            r9 = r41
            r38 = r12
            r5 = r18
            r12 = r1
            r1 = r2
            r18 = r14
            goto L_0x0357
        L_0x00f1:
            r9 = r37
            r13 = r41
            r4 = r18
            if (r7 != 0) goto L_0x0116
            r14 = r14 | r27
            int r7 = defpackage.ub5.y(r9, r4, r13)
            long r3 = r13.b
            long r5 = defpackage.yk8.k(r3)
            r3 = r20
            r1.putLong(r2, r3, r5)
            r34 = r2
            r2 = r1
            r1 = r34
            r3 = r2
            r2 = r1
            r1 = r3
            r5 = r39
            r4 = r7
            goto L_0x00db
        L_0x0116:
            r34 = r2
            r2 = r1
            r1 = r34
        L_0x011b:
            r38 = r13
            r13 = r9
            r9 = r38
            r5 = r4
            r38 = r12
            r18 = r14
            r12 = r2
            goto L_0x0357
        L_0x0128:
            r4 = r2
            r2 = r1
            r1 = r4
            r9 = r37
            r13 = r41
            r4 = r18
            r5 = r20
            if (r7 != 0) goto L_0x011b
            r14 = r14 | r27
            int r4 = defpackage.ub5.u(r9, r4, r13)
            int r3 = r13.a
            int r3 = defpackage.yk8.j(r3)
            r2.putInt(r1, r5, r3)
        L_0x0144:
            r3 = r2
            r2 = r1
            r1 = r3
            goto L_0x00d9
        L_0x0148:
            r4 = r2
            r2 = r1
            r1 = r4
            r9 = r37
            r13 = r41
            r4 = r18
            r5 = r20
            if (r7 != 0) goto L_0x011b
            int r4 = defpackage.ub5.u(r9, r4, r13)
            int r7 = r13.a
            r38 = r4
            kk8 r4 = r0.F(r11)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r16
            if (r3 == 0) goto L_0x018c
            if (r4 == 0) goto L_0x018c
            boolean r3 = r4.a(r7)
            if (r3 == 0) goto L_0x0170
            goto L_0x018c
        L_0x0170:
            r3 = r1
            nl8 r3 = (defpackage.nl8) r3
            en8 r4 = r3.zzc
            if (r4 != r8) goto L_0x017d
            en8 r4 = defpackage.en8.a()
            r3.zzc = r4
        L_0x017d:
            long r5 = (long) r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4.d(r15, r3)
        L_0x0185:
            r3 = r2
            r2 = r1
            r1 = r3
            r4 = r38
            goto L_0x00d9
        L_0x018c:
            r14 = r14 | r27
            r2.putInt(r1, r5, r7)
            goto L_0x0185
        L_0x0192:
            r3 = r2
            r2 = r1
            r1 = r3
            r9 = r37
            r13 = r41
            r4 = r18
            r5 = r20
            r3 = 2
            if (r7 != r3) goto L_0x011b
            r14 = r14 | r27
            int r4 = defpackage.ub5.C(r9, r4, r13)
            java.lang.Object r3 = r13.d
            r2.putObject(r1, r5, r3)
            goto L_0x0144
        L_0x01ac:
            r3 = r2
            r2 = r1
            r1 = r3
            r9 = r37
            r13 = r41
            r4 = r18
            r3 = 2
            if (r7 != r3) goto L_0x01dd
            r14 = r14 | r27
            r3 = r1
            java.lang.Object r1 = r0.G(r11, r3)
            r5 = r2
            wm8 r2 = r0.D(r11)
            r6 = r9
            r9 = r3
            r3 = r6
            r6 = r13
            r13 = r5
            r5 = r39
            int r4 = defpackage.ub5.D(r1, r2, r3, r4, r5, r6)
            r2 = r3
            r3 = r1
            r1 = r2
            r2 = r6
            r0.H(r11, r9, r3)
            r3 = r1
            r2 = r9
            r8 = r11
            r9 = r12
            r1 = r13
            goto L_0x00df
        L_0x01dd:
            r5 = r9
            r9 = r1
            r1 = r5
            r5 = r13
            r13 = r2
            r2 = r5
            r5 = r4
            r38 = r12
            r12 = r13
            r18 = r14
        L_0x01e9:
            r13 = r1
            r1 = r9
            r9 = r2
            goto L_0x0357
        L_0x01ee:
            r13 = r1
            r9 = r2
            r38 = r12
            r5 = r18
            r1 = r37
            r2 = r41
            r12 = r3
            r18 = r14
            r3 = r20
            r14 = 2
            if (r7 != r14) goto L_0x0240
            r7 = r12 & r24
            if (r7 == 0) goto L_0x020c
            r6 = r18 | r27
            int r5 = defpackage.ub5.B(r1, r5, r2)
            r14 = r6
            goto L_0x0227
        L_0x020c:
            int r5 = defpackage.ub5.u(r1, r5, r2)
            int r7 = r2.a
            if (r7 < 0) goto L_0x023a
            r8 = r18 | r27
            if (r7 != 0) goto L_0x021c
            r2.d = r6
        L_0x021a:
            r14 = r8
            goto L_0x0227
        L_0x021c:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8
            r6.<init>(r1, r5, r7, r12)
            r2.d = r6
            int r5 = r5 + r7
            goto L_0x021a
        L_0x0227:
            java.lang.Object r6 = r2.d
            r13.putObject(r9, r3, r6)
        L_0x022c:
            r3 = r1
            r6 = r2
            r4 = r5
            r2 = r9
            r8 = r11
            r1 = r13
        L_0x0232:
            r7 = r30
            r9 = r38
            r5 = r39
            goto L_0x0018
        L_0x023a:
            defpackage.zz8.b(r26)
            r19 = 0
            return r19
        L_0x0240:
            r12 = r13
            goto L_0x01e9
        L_0x0242:
            r13 = r1
            r9 = r2
            r38 = r12
            r5 = r18
            r3 = r20
            r1 = r37
            r2 = r41
            r18 = r14
            if (r7 != 0) goto L_0x0240
            r14 = r18 | r27
            int r5 = defpackage.ub5.y(r1, r5, r2)
            long r6 = r2.b
            int r6 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r6 == 0) goto L_0x0261
            r6 = r28
            goto L_0x0262
        L_0x0261:
            r6 = 0
        L_0x0262:
            in8 r7 = defpackage.jn8.c
            r7.X0(r9, r3, r6)
            goto L_0x022c
        L_0x0268:
            r13 = r1
            r9 = r2
            r38 = r12
            r5 = r18
            r3 = r20
            r6 = 5
            r1 = r37
            r2 = r41
            r18 = r14
            if (r7 != r6) goto L_0x0240
            int r6 = r5 + 4
            r14 = r18 | r27
            int r5 = defpackage.ub5.z(r5, r1)
            r13.putInt(r9, r3, r5)
            r5 = r39
            r3 = r1
            r4 = r6
            r8 = r11
            r1 = r13
            r7 = r30
            r6 = r2
            r2 = r9
        L_0x028e:
            r9 = r38
            goto L_0x0018
        L_0x0292:
            r13 = r1
            r9 = r2
            r38 = r12
            r5 = r18
            r3 = r20
            r6 = r28
            r1 = r37
            r2 = r41
            r18 = r14
            if (r7 != r6) goto L_0x02c2
            int r7 = r5 + 8
            r14 = r18 | r27
            long r5 = defpackage.ub5.A(r5, r1)
            r34 = r13
            r13 = r1
            r1 = r34
            r34 = r9
            r9 = r2
            r2 = r34
            r1.putLong(r2, r3, r5)
        L_0x02b9:
            r5 = r39
            r4 = r7
            r6 = r9
            r8 = r11
        L_0x02be:
            r3 = r13
            r7 = r30
            goto L_0x028e
        L_0x02c2:
            r34 = r13
            r13 = r1
            r1 = r34
            r34 = r9
            r9 = r2
            r2 = r34
        L_0x02cc:
            r12 = r1
        L_0x02cd:
            r1 = r2
            goto L_0x0357
        L_0x02d0:
            r13 = r37
            r9 = r41
            r38 = r12
            r5 = r18
            r3 = r20
            r18 = r14
            if (r7 != 0) goto L_0x02cc
            r14 = r18 | r27
            int r5 = defpackage.ub5.u(r13, r5, r9)
            int r6 = r9.a
            r1.putInt(r2, r3, r6)
            r4 = r5
            r6 = r9
            r8 = r11
            r3 = r13
            goto L_0x0232
        L_0x02ef:
            r13 = r37
            r9 = r41
            r38 = r12
            r5 = r18
            r3 = r20
            r18 = r14
            if (r7 != 0) goto L_0x02cc
            r14 = r18 | r27
            int r7 = defpackage.ub5.y(r13, r5, r9)
            long r5 = r9.b
            r1.putLong(r2, r3, r5)
            goto L_0x02b9
        L_0x0309:
            r13 = r37
            r9 = r41
            r38 = r12
            r5 = r18
            r3 = r20
            r6 = 5
            r12 = r1
            r18 = r14
            if (r7 != r6) goto L_0x02cd
            int r1 = r5 + 4
            r14 = r18 | r27
            int r5 = defpackage.ub5.z(r5, r13)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            in8 r6 = defpackage.jn8.c
            r6.Z0(r2, r3, r5)
            r5 = r39
            r4 = r1
        L_0x032d:
            r6 = r9
            r8 = r11
            r1 = r12
            goto L_0x02be
        L_0x0331:
            r13 = r37
            r9 = r41
            r38 = r12
            r5 = r18
            r3 = r20
            r6 = r28
            r12 = r1
            r18 = r14
            if (r7 != r6) goto L_0x02cd
            int r7 = r5 + 8
            r14 = r18 | r27
            long r5 = defpackage.ub5.A(r5, r13)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            in8 r1 = defpackage.jn8.c
            r1.c1(r2, r3, r5)
            r5 = r39
            r4 = r7
            goto L_0x032d
        L_0x0357:
            r32 = r38
            r7 = r40
            r10 = r8
            r4 = r9
            r20 = r11
            r9 = r12
            r3 = r13
            r11 = r15
            r14 = r18
            r15 = r30
            r8 = r1
            r13 = r5
            goto L_0x0d20
        L_0x036a:
            r5 = r2
            r2 = r1
            r1 = r5
            r12 = r3
            r30 = r13
            r5 = r18
            r18 = r14
            r13 = r20
            r3 = 27
            r20 = r5
            if (r4 != r3) goto L_0x03da
            r3 = 2
            if (r7 != r3) goto L_0x03c0
            java.lang.Object r3 = r2.getObject(r1, r13)
            zl8 r3 = (defpackage.zl8) r3
            r4 = r3
            qk8 r4 = (defpackage.qk8) r4
            boolean r4 = r4.w
            if (r4 != 0) goto L_0x039e
            int r4 = r3.size()
            if (r4 != 0) goto L_0x0395
            r5 = 10
            goto L_0x0397
        L_0x0395:
            int r5 = r4 + r4
        L_0x0397:
            zl8 r3 = r3.t(r5)
            r2.putObject(r1, r13, r3)
        L_0x039e:
            r6 = r3
            wm8 r1 = r0.D(r11)
            r3 = r37
            r5 = r39
            r7 = r41
            r12 = r2
            r2 = r15
            r4 = r20
            r15 = r36
            int r4 = defpackage.ub5.H(r1, r2, r3, r4, r5, r6, r7)
            r1 = r2
            r6 = r41
            r8 = r11
            r2 = r15
            r14 = r18
            r7 = r30
            r15 = r1
            r1 = r12
            goto L_0x0018
        L_0x03c0:
            r34 = r15
            r15 = r1
            r1 = r34
            r3 = r37
            r4 = r41
            r26 = r2
            r33 = r8
            r32 = r9
            r8 = r15
            r9 = r20
            r15 = r30
            r20 = r1
        L_0x03d6:
            r5 = r39
            goto L_0x0a98
        L_0x03da:
            r3 = r15
            r15 = r1
            r1 = r3
            r3 = r20
            r5 = 49
            java.lang.String r21 = "Protocol message had invalid UTF-8."
            java.lang.String r31 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            if (r4 > r5) goto L_0x0963
            r32 = r9
            long r9 = (long) r12
            java.lang.Object r5 = r2.getObject(r15, r13)
            zl8 r5 = (defpackage.zl8) r5
            r12 = r5
            qk8 r12 = (defpackage.qk8) r12
            boolean r12 = r12.w
            if (r12 != 0) goto L_0x03fe
            zl8 r5 = defpackage.hl6.r(r5)
            r2.putObject(r15, r13, r5)
        L_0x03fe:
            r12 = r5
            switch(r4) {
                case 18: goto L_0x0923;
                case 19: goto L_0x0900;
                case 20: goto L_0x08ab;
                case 21: goto L_0x08ab;
                case 22: goto L_0x087e;
                case 23: goto L_0x07d8;
                case 24: goto L_0x0738;
                case 25: goto L_0x071a;
                case 26: goto L_0x063c;
                case 27: goto L_0x060d;
                case 28: goto L_0x058d;
                case 29: goto L_0x087e;
                case 30: goto L_0x053d;
                case 31: goto L_0x0738;
                case 32: goto L_0x07d8;
                case 33: goto L_0x04e4;
                case 34: goto L_0x046e;
                case 35: goto L_0x0923;
                case 36: goto L_0x0900;
                case 37: goto L_0x08ab;
                case 38: goto L_0x08ab;
                case 39: goto L_0x087e;
                case 40: goto L_0x07d8;
                case 41: goto L_0x0738;
                case 42: goto L_0x071a;
                case 43: goto L_0x087e;
                case 44: goto L_0x053d;
                case 45: goto L_0x0738;
                case 46: goto L_0x07d8;
                case 47: goto L_0x04e4;
                case 48: goto L_0x046e;
                default: goto L_0x0402;
            }
        L_0x0402:
            r4 = 3
            if (r7 != r4) goto L_0x045b
            r4 = r1 & -8
            r6 = r4 | 4
            r13 = r2
            wm8 r2 = r0.D(r11)
            r4 = r1
            nl8 r1 = r2.a()
            r5 = r39
            r7 = r41
            r9 = r4
            r4 = r3
            r3 = r37
            int r10 = defpackage.ub5.E(r1, r2, r3, r4, r5, r6, r7)
            r14 = r4
            r4 = r1
            r1 = r6
            r6 = r7
            r2.f(r4)
            r6.d = r4
            r12.add(r4)
        L_0x042b:
            if (r10 >= r5) goto L_0x044c
            int r4 = defpackage.ub5.u(r3, r10, r6)
            int r7 = r6.a
            if (r9 != r7) goto L_0x044c
            r6 = r1
            nl8 r1 = r2.a()
            r7 = r41
            int r10 = defpackage.ub5.E(r1, r2, r3, r4, r5, r6, r7)
            r4 = r1
            r1 = r6
            r6 = r7
            r2.f(r4)
            r6.d = r4
            r12.add(r4)
            goto L_0x042b
        L_0x044c:
            r2 = r5
            r33 = r8
            r1 = r10
            r38 = r13
            r4 = r14
            r8 = r15
            r15 = r30
            r19 = 0
            r10 = r6
            goto L_0x093b
        L_0x045b:
            r10 = r41
            r9 = r1
            r38 = r2
            r4 = r3
            r33 = r8
            r8 = r15
            r15 = r30
            r19 = 0
            r3 = r37
            r2 = r39
            goto L_0x093a
        L_0x046e:
            r5 = r39
            r6 = r41
            r9 = r1
            r13 = r2
            r14 = r3
            r1 = 2
            r3 = r37
            if (r7 != r1) goto L_0x04ad
            dm8 r12 = (defpackage.dm8) r12
            int r1 = defpackage.ub5.u(r3, r14, r6)
            int r2 = r6.a
            int r2 = r2 + r1
        L_0x0483:
            if (r1 >= r2) goto L_0x0497
            int r1 = defpackage.ub5.y(r3, r1, r6)
            r33 = r8
            long r7 = r6.b
            long r7 = defpackage.yk8.k(r7)
            r12.k(r7)
            r8 = r33
            goto L_0x0483
        L_0x0497:
            r33 = r8
            if (r1 != r2) goto L_0x04a7
        L_0x049b:
            r2 = r5
            r10 = r6
            r38 = r13
            r4 = r14
            r8 = r15
            r15 = r30
        L_0x04a3:
            r19 = 0
            goto L_0x093b
        L_0x04a7:
            defpackage.zz8.b(r31)
            r19 = 0
            return r19
        L_0x04ad:
            r33 = r8
            if (r7 != 0) goto L_0x04d8
            dm8 r12 = (defpackage.dm8) r12
            int r1 = defpackage.ub5.y(r3, r14, r6)
            long r7 = r6.b
            long r7 = defpackage.yk8.k(r7)
            r12.k(r7)
        L_0x04c0:
            if (r1 >= r5) goto L_0x049b
            int r2 = defpackage.ub5.u(r3, r1, r6)
            int r4 = r6.a
            if (r9 != r4) goto L_0x049b
            int r1 = defpackage.ub5.y(r3, r2, r6)
            long r7 = r6.b
            long r7 = defpackage.yk8.k(r7)
            r12.k(r7)
            goto L_0x04c0
        L_0x04d8:
            r2 = r5
            r10 = r6
            r38 = r13
            r4 = r14
            r8 = r15
            r15 = r30
        L_0x04e0:
            r19 = 0
            goto L_0x093a
        L_0x04e4:
            r5 = r39
            r6 = r41
            r9 = r1
            r13 = r2
            r14 = r3
            r33 = r8
            r1 = 2
            r3 = r37
            if (r7 != r1) goto L_0x0514
            ol8 r12 = (defpackage.ol8) r12
            int r1 = defpackage.ub5.u(r3, r14, r6)
            int r2 = r6.a
            int r2 = r2 + r1
        L_0x04fb:
            if (r1 >= r2) goto L_0x050b
            int r1 = defpackage.ub5.u(r3, r1, r6)
            int r4 = r6.a
            int r4 = defpackage.yk8.j(r4)
            r12.k(r4)
            goto L_0x04fb
        L_0x050b:
            if (r1 != r2) goto L_0x050e
            goto L_0x049b
        L_0x050e:
            defpackage.zz8.b(r31)
            r19 = 0
            return r19
        L_0x0514:
            if (r7 != 0) goto L_0x04d8
            ol8 r12 = (defpackage.ol8) r12
            int r1 = defpackage.ub5.u(r3, r14, r6)
            int r2 = r6.a
            int r2 = defpackage.yk8.j(r2)
            r12.k(r2)
        L_0x0525:
            if (r1 >= r5) goto L_0x049b
            int r2 = defpackage.ub5.u(r3, r1, r6)
            int r4 = r6.a
            if (r9 != r4) goto L_0x049b
            int r1 = defpackage.ub5.u(r3, r2, r6)
            int r2 = r6.a
            int r2 = defpackage.yk8.j(r2)
            r12.k(r2)
            goto L_0x0525
        L_0x053d:
            r5 = r39
            r6 = r41
            r9 = r1
            r13 = r2
            r14 = r3
            r33 = r8
            r1 = 2
            r3 = r37
            if (r7 != r1) goto L_0x0556
            int r1 = defpackage.ub5.G(r3, r14, r12, r6)
            r7 = r1
            r8 = r5
            r5 = r12
            r12 = r9
            r9 = r3
        L_0x0554:
            r10 = r6
            goto L_0x0565
        L_0x0556:
            if (r7 != 0) goto L_0x0581
            r2 = r3
            r4 = r5
            r1 = r9
            r5 = r12
            r3 = r14
            int r7 = defpackage.ub5.F(r1, r2, r3, r4, r5, r6)
            r12 = r1
            r9 = r2
            r8 = r4
            goto L_0x0554
        L_0x0565:
            kk8 r4 = r0.F(r11)
            r3 = r5
            r5 = 0
            xb4 r6 = r0.j
            r1 = r15
            r2 = r30
            defpackage.xm8.c(r1, r2, r3, r4, r5, r6)
            r15 = r2
            r1 = r7
            r2 = r8
            r3 = r9
            r9 = r12
            r38 = r13
            r4 = r14
            r19 = 0
        L_0x057d:
            r8 = r36
            goto L_0x093b
        L_0x0581:
            r12 = r9
            r15 = r30
            r8 = r36
            r2 = r5
            r10 = r6
        L_0x0588:
            r38 = r13
            r4 = r14
            goto L_0x04e0
        L_0x058d:
            r9 = r37
            r10 = r41
            r13 = r2
            r14 = r3
            r33 = r8
            r5 = r12
            r15 = r30
            r8 = r39
            r12 = r1
            r1 = 2
            if (r7 != r1) goto L_0x0601
            int r1 = defpackage.ub5.u(r9, r14, r10)
            int r2 = r10.a
            if (r2 < 0) goto L_0x05fb
            int r3 = r9.length
            int r3 = r3 - r1
            if (r2 > r3) goto L_0x05f5
            if (r2 != 0) goto L_0x05b2
            uk8 r2 = defpackage.vk8.x
            r5.add(r2)
            goto L_0x05ba
        L_0x05b2:
            uk8 r3 = defpackage.vk8.p(r9, r1, r2)
            r5.add(r3)
        L_0x05b9:
            int r1 = r1 + r2
        L_0x05ba:
            if (r1 >= r8) goto L_0x05ec
            int r2 = defpackage.ub5.u(r9, r1, r10)
            int r3 = r10.a
            if (r12 != r3) goto L_0x05ec
            int r1 = defpackage.ub5.u(r9, r2, r10)
            int r2 = r10.a
            if (r2 < 0) goto L_0x05e6
            int r3 = r9.length
            int r3 = r3 - r1
            if (r2 > r3) goto L_0x05e0
            if (r2 != 0) goto L_0x05d8
            uk8 r2 = defpackage.vk8.x
            r5.add(r2)
            goto L_0x05ba
        L_0x05d8:
            uk8 r3 = defpackage.vk8.p(r9, r1, r2)
            r5.add(r3)
            goto L_0x05b9
        L_0x05e0:
            defpackage.zz8.b(r31)
            r19 = 0
            return r19
        L_0x05e6:
            r19 = 0
            defpackage.zz8.b(r26)
            return r19
        L_0x05ec:
            r19 = 0
            r2 = r8
            r3 = r9
            r9 = r12
            r38 = r13
            r4 = r14
            goto L_0x057d
        L_0x05f5:
            r19 = 0
            defpackage.zz8.b(r31)
            return r19
        L_0x05fb:
            r19 = 0
            defpackage.zz8.b(r26)
            return r19
        L_0x0601:
            r2 = r8
            r3 = r9
            r9 = r12
            r38 = r13
            r4 = r14
            r19 = 0
            r8 = r36
            goto L_0x093a
        L_0x060d:
            r9 = r37
            r10 = r41
            r13 = r2
            r14 = r3
            r33 = r8
            r5 = r12
            r15 = r30
            r8 = r39
            r12 = r1
            r1 = 2
            if (r7 != r1) goto L_0x0634
            wm8 r1 = r0.D(r11)
            r6 = r5
            r5 = r8
            r3 = r9
            r7 = r10
            r2 = r12
            r4 = r14
            r8 = r36
            int r1 = defpackage.ub5.H(r1, r2, r3, r4, r5, r6, r7)
            r9 = r2
            r2 = r5
        L_0x0630:
            r38 = r13
            goto L_0x04a3
        L_0x0634:
            r5 = r8
            r8 = r36
            r2 = r5
            r3 = r9
            r9 = r12
            goto L_0x0588
        L_0x063c:
            r5 = r39
            r13 = r2
            r4 = r3
            r33 = r8
            r14 = r12
            r8 = r15
            r15 = r30
            r3 = r37
            r2 = r41
            r12 = r1
            r1 = 2
            if (r7 != r1) goto L_0x0711
            r24 = 536870912(0x20000000, double:2.65249474E-315)
            long r9 = r9 & r24
            int r1 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r1 != 0) goto L_0x06a8
            int r1 = defpackage.ub5.u(r3, r4, r2)
            int r7 = r2.a
            if (r7 < 0) goto L_0x06a2
            if (r7 != 0) goto L_0x0665
            r14.add(r6)
            goto L_0x0670
        L_0x0665:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            r9.<init>(r3, r1, r7, r10)
            r14.add(r9)
        L_0x066f:
            int r1 = r1 + r7
        L_0x0670:
            if (r1 >= r5) goto L_0x0699
            int r7 = defpackage.ub5.u(r3, r1, r2)
            int r9 = r2.a
            if (r12 != r9) goto L_0x0699
            int r1 = defpackage.ub5.u(r3, r7, r2)
            int r7 = r2.a
            if (r7 < 0) goto L_0x0693
            if (r7 != 0) goto L_0x0688
            r14.add(r6)
            goto L_0x0670
        L_0x0688:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            r9.<init>(r3, r1, r7, r10)
            r14.add(r9)
            goto L_0x066f
        L_0x0693:
            defpackage.zz8.b(r26)
            r19 = 0
            return r19
        L_0x0699:
            r19 = 0
            r10 = r2
            r2 = r5
            r9 = r12
            r38 = r13
            goto L_0x093b
        L_0x06a2:
            r19 = 0
            defpackage.zz8.b(r26)
            return r19
        L_0x06a8:
            int r1 = defpackage.ub5.u(r3, r4, r2)
            int r7 = r2.a
            if (r7 < 0) goto L_0x070b
            if (r7 != 0) goto L_0x06b6
            r14.add(r6)
            goto L_0x06cc
        L_0x06b6:
            int r9 = r1 + r7
            boolean r10 = defpackage.ln8.a(r3, r1, r9)
            if (r10 == 0) goto L_0x0705
            java.lang.String r10 = new java.lang.String
            r38 = r9
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r10.<init>(r3, r1, r7, r9)
            r14.add(r10)
        L_0x06ca:
            r1 = r38
        L_0x06cc:
            if (r1 >= r5) goto L_0x0699
            int r7 = defpackage.ub5.u(r3, r1, r2)
            int r9 = r2.a
            if (r12 != r9) goto L_0x0699
            int r1 = defpackage.ub5.u(r3, r7, r2)
            int r7 = r2.a
            if (r7 < 0) goto L_0x06ff
            if (r7 != 0) goto L_0x06e4
            r14.add(r6)
            goto L_0x06cc
        L_0x06e4:
            int r9 = r1 + r7
            boolean r10 = defpackage.ln8.a(r3, r1, r9)
            if (r10 == 0) goto L_0x06f9
            java.lang.String r10 = new java.lang.String
            r38 = r9
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r10.<init>(r3, r1, r7, r9)
            r14.add(r10)
            goto L_0x06ca
        L_0x06f9:
            defpackage.zz8.b(r21)
            r19 = 0
            return r19
        L_0x06ff:
            r19 = 0
            defpackage.zz8.b(r26)
            return r19
        L_0x0705:
            r19 = 0
            defpackage.zz8.b(r21)
            return r19
        L_0x070b:
            r19 = 0
            defpackage.zz8.b(r26)
            return r19
        L_0x0711:
            r19 = 0
        L_0x0713:
            r10 = r2
            r2 = r5
            r9 = r12
            r38 = r13
            goto L_0x093a
        L_0x071a:
            r5 = r39
            r12 = r1
            r13 = r2
            r4 = r3
            r33 = r8
            r8 = r15
            r15 = r30
            r1 = 2
            r19 = 0
            r3 = r37
            r2 = r41
            if (r7 == r1) goto L_0x0734
            if (r7 == 0) goto L_0x0730
            goto L_0x0713
        L_0x0730:
            defpackage.ku4.a()
            return r19
        L_0x0734:
            defpackage.ku4.a()
            return r19
        L_0x0738:
            r5 = r39
            r13 = r2
            r4 = r3
            r33 = r8
            r14 = r12
            r8 = r15
            r15 = r30
            r3 = r37
            r2 = r41
            r12 = r1
            r1 = 2
            if (r7 != r1) goto L_0x07ab
            r1 = r14
            ol8 r1 = (defpackage.ol8) r1
            int r6 = defpackage.ub5.u(r3, r4, r2)
            int r7 = r2.a
            int r9 = r6 + r7
            int r10 = r3.length
            if (r9 > r10) goto L_0x07a5
            int r10 = r1.y
            int r7 = r7 / 4
            int r7 = r7 + r10
            int[] r10 = r1.x
            int r10 = r10.length
            if (r7 > r10) goto L_0x0763
            goto L_0x078b
        L_0x0763:
            if (r10 == 0) goto L_0x0781
        L_0x0765:
            if (r10 >= r7) goto L_0x0778
            int r10 = r10 * 3
            r29 = 2
            int r10 = r10 / 2
            r28 = 1
            int r10 = r10 + 1
            r14 = 10
            int r10 = java.lang.Math.max(r10, r14)
            goto L_0x0765
        L_0x0778:
            int[] r7 = r1.x
            int[] r7 = java.util.Arrays.copyOf(r7, r10)
            r1.x = r7
            goto L_0x078b
        L_0x0781:
            r14 = 10
            int r7 = java.lang.Math.max(r7, r14)
            int[] r7 = new int[r7]
            r1.x = r7
        L_0x078b:
            if (r6 >= r9) goto L_0x0797
            int r7 = defpackage.ub5.z(r6, r3)
            r1.k(r7)
            int r6 = r6 + 4
            goto L_0x078b
        L_0x0797:
            if (r6 != r9) goto L_0x079f
            r10 = r2
            r2 = r5
            r1 = r6
        L_0x079c:
            r9 = r12
            goto L_0x0630
        L_0x079f:
            defpackage.zz8.b(r31)
            r19 = 0
            return r19
        L_0x07a5:
            r19 = 0
            defpackage.zz8.b(r31)
            return r19
        L_0x07ab:
            r6 = 5
            if (r7 != r6) goto L_0x07d1
            int r1 = r4 + 4
            r6 = r14
            ol8 r6 = (defpackage.ol8) r6
            int r7 = defpackage.ub5.z(r4, r3)
            r6.k(r7)
        L_0x07ba:
            if (r1 >= r5) goto L_0x07ce
            int r7 = defpackage.ub5.u(r3, r1, r2)
            int r9 = r2.a
            if (r12 != r9) goto L_0x07ce
            int r1 = defpackage.ub5.z(r7, r3)
            r6.k(r1)
            int r1 = r7 + 4
            goto L_0x07ba
        L_0x07ce:
            r10 = r2
            r2 = r5
            goto L_0x079c
        L_0x07d1:
            r10 = r2
            r2 = r5
            r9 = r12
            r38 = r13
            goto L_0x04e0
        L_0x07d8:
            r5 = r39
            r13 = r2
            r4 = r3
            r33 = r8
            r14 = r12
            r8 = r15
            r15 = r30
            r3 = r37
            r2 = r41
            r12 = r1
            r1 = 2
            if (r7 != r1) goto L_0x0851
            r1 = r14
            dm8 r1 = (defpackage.dm8) r1
            int r6 = defpackage.ub5.u(r3, r4, r2)
            int r7 = r2.a
            int r9 = r6 + r7
            int r10 = r3.length
            if (r9 > r10) goto L_0x084b
            int r10 = r1.y
            int r7 = r7 / 8
            int r7 = r7 + r10
            long[] r10 = r1.x
            int r10 = r10.length
            if (r7 > r10) goto L_0x0803
            goto L_0x082b
        L_0x0803:
            if (r10 == 0) goto L_0x0821
        L_0x0805:
            if (r10 >= r7) goto L_0x0818
            int r10 = r10 * 3
            r29 = 2
            int r10 = r10 / 2
            r28 = 1
            int r10 = r10 + 1
            r14 = 10
            int r10 = java.lang.Math.max(r10, r14)
            goto L_0x0805
        L_0x0818:
            long[] r7 = r1.x
            long[] r7 = java.util.Arrays.copyOf(r7, r10)
            r1.x = r7
            goto L_0x082b
        L_0x0821:
            r14 = 10
            int r7 = java.lang.Math.max(r7, r14)
            long[] r7 = new long[r7]
            r1.x = r7
        L_0x082b:
            if (r6 >= r9) goto L_0x083b
            r38 = r13
            long r13 = defpackage.ub5.A(r6, r3)
            r1.k(r13)
            int r6 = r6 + 8
            r13 = r38
            goto L_0x082b
        L_0x083b:
            r38 = r13
            if (r6 != r9) goto L_0x0845
            r10 = r2
            r2 = r5
            r1 = r6
        L_0x0842:
            r9 = r12
            goto L_0x04a3
        L_0x0845:
            defpackage.zz8.b(r31)
            r19 = 0
            return r19
        L_0x084b:
            r19 = 0
            defpackage.zz8.b(r31)
            return r19
        L_0x0851:
            r38 = r13
            r6 = 1
            if (r7 != r6) goto L_0x0879
            int r1 = r4 + 8
            r6 = r14
            dm8 r6 = (defpackage.dm8) r6
            long r9 = defpackage.ub5.A(r4, r3)
            r6.k(r9)
        L_0x0862:
            if (r1 >= r5) goto L_0x0876
            int r7 = defpackage.ub5.u(r3, r1, r2)
            int r9 = r2.a
            if (r12 != r9) goto L_0x0876
            long r9 = defpackage.ub5.A(r7, r3)
            r6.k(r9)
            int r1 = r7 + 8
            goto L_0x0862
        L_0x0876:
            r10 = r2
            r2 = r5
            goto L_0x0842
        L_0x0879:
            r10 = r2
            r2 = r5
            r9 = r12
            goto L_0x04e0
        L_0x087e:
            r5 = r39
            r38 = r2
            r4 = r3
            r33 = r8
            r14 = r12
            r8 = r15
            r15 = r30
            r3 = r37
            r2 = r41
            r12 = r1
            r1 = 2
            if (r7 != r1) goto L_0x0896
            int r1 = defpackage.ub5.G(r3, r4, r14, r2)
            goto L_0x0876
        L_0x0896:
            if (r7 != 0) goto L_0x0879
            r6 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r1 = r12
            r5 = r14
            int r5 = defpackage.ub5.F(r1, r2, r3, r4, r5, r6)
            r9 = r3
            r3 = r2
            r2 = r4
            r4 = r9
            r9 = r1
            r10 = r6
            r1 = r5
            goto L_0x04a3
        L_0x08ab:
            r10 = r41
            r9 = r1
            r38 = r2
            r4 = r3
            r33 = r8
            r5 = r12
            r8 = r15
            r15 = r30
            r1 = 2
            r3 = r37
            r2 = r39
            if (r7 != r1) goto L_0x08de
            r12 = r5
            dm8 r12 = (defpackage.dm8) r12
            int r1 = defpackage.ub5.u(r3, r4, r10)
            int r5 = r10.a
            int r5 = r5 + r1
        L_0x08c8:
            if (r1 >= r5) goto L_0x08d4
            int r1 = defpackage.ub5.y(r3, r1, r10)
            long r6 = r10.b
            r12.k(r6)
            goto L_0x08c8
        L_0x08d4:
            if (r1 != r5) goto L_0x08d8
            goto L_0x04a3
        L_0x08d8:
            defpackage.zz8.b(r31)
            r19 = 0
            return r19
        L_0x08de:
            if (r7 != 0) goto L_0x04e0
            r12 = r5
            dm8 r12 = (defpackage.dm8) r12
            int r1 = defpackage.ub5.y(r3, r4, r10)
            long r5 = r10.b
            r12.k(r5)
        L_0x08ec:
            if (r1 >= r2) goto L_0x04a3
            int r5 = defpackage.ub5.u(r3, r1, r10)
            int r6 = r10.a
            if (r9 != r6) goto L_0x04a3
            int r1 = defpackage.ub5.y(r3, r5, r10)
            long r5 = r10.b
            r12.k(r5)
            goto L_0x08ec
        L_0x0900:
            r10 = r41
            r9 = r1
            r38 = r2
            r4 = r3
            r33 = r8
            r8 = r15
            r15 = r30
            r1 = 2
            r3 = r37
            r2 = r39
            if (r7 == r1) goto L_0x091d
            r6 = 5
            if (r7 == r6) goto L_0x0917
            goto L_0x04e0
        L_0x0917:
            defpackage.ku4.a()
            r19 = 0
            return r19
        L_0x091d:
            r19 = 0
            defpackage.ku4.a()
            return r19
        L_0x0923:
            r10 = r41
            r9 = r1
            r38 = r2
            r4 = r3
            r33 = r8
            r8 = r15
            r15 = r30
            r1 = 2
            r19 = 0
            r3 = r37
            r2 = r39
            if (r7 == r1) goto L_0x095f
            r6 = 1
            if (r7 == r6) goto L_0x095b
        L_0x093a:
            r1 = r4
        L_0x093b:
            if (r1 == r4) goto L_0x094c
            r4 = r1
            r5 = r2
            r2 = r8
            r6 = r10
            r8 = r11
            r7 = r15
            r14 = r18
            r1 = r38
            r15 = r9
        L_0x0948:
            r9 = r32
            goto L_0x0018
        L_0x094c:
            r7 = r40
            r13 = r1
            r4 = r10
            r20 = r11
            r14 = r18
            r10 = r33
            r11 = r9
            r9 = r38
            goto L_0x0d20
        L_0x095b:
            defpackage.ku4.a()
            return r19
        L_0x095f:
            defpackage.ku4.a()
            return r19
        L_0x0963:
            r10 = r41
            r5 = r3
            r33 = r8
            r32 = r9
            r8 = r15
            r15 = r30
            r3 = r37
            r9 = r1
            r1 = r2
            r2 = 50
            if (r4 != r2) goto L_0x0aa1
            r2 = 2
            if (r7 != r2) goto L_0x0a90
            java.lang.Object r2 = r0.E(r11)
            java.lang.Object r4 = r1.getObject(r8, r13)
            r7 = r4
            hm8 r7 = (defpackage.hm8) r7
            boolean r7 = r7.w
            if (r7 != 0) goto L_0x0994
            hm8 r7 = defpackage.hm8.x
            hm8 r7 = r7.a()
            defpackage.n63.l(r7, r4)
            r1.putObject(r8, r13, r7)
            r4 = r7
        L_0x0994:
            gm8 r2 = (defpackage.gm8) r2
            fm8 r7 = r2.a
            r12 = r4
            hm8 r12 = (defpackage.hm8) r12
            int r2 = defpackage.ub5.u(r3, r5, r10)
            int r4 = r10.a
            if (r4 < 0) goto L_0x0a8a
            int r13 = r39 - r2
            if (r4 > r13) goto L_0x0a8a
            int r13 = r2 + r4
            java.lang.Object r14 = r7.z
            r4 = r14
        L_0x09ac:
            if (r2 >= r13) goto L_0x0a54
            r20 = r1
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x09bc
            int r1 = defpackage.ub5.w(r2, r3, r1, r10)
            int r2 = r10.a
        L_0x09bc:
            r34 = r2
            r2 = r1
            r1 = r34
            r38 = r2
            int r2 = r1 >>> 3
            r3 = r1 & 7
            r21 = r4
            r4 = 1
            if (r2 == r4) goto L_0x0a21
            r4 = 2
            if (r2 == r4) goto L_0x09e0
            r3 = r37
            r2 = r38
            r4 = r10
            r26 = r20
            r10 = r6
            r20 = r9
            r6 = r21
            r9 = r5
            r5 = r39
            goto L_0x0a4b
        L_0x09e0:
            java.lang.Object r2 = r7.y
            r4 = r2
            mn8 r4 = (defpackage.mn8) r4
            int r2 = r4.x
            if (r3 != r2) goto L_0x0a0d
            r3 = r5
            java.lang.Class r5 = r14.getClass()
            r1 = r10
            r10 = r6
            r6 = r1
            r1 = r37
            r2 = r38
            r26 = r20
            r20 = r9
            r9 = r3
            r3 = r39
            int r2 = x(r1, r2, r3, r4, r5, r6)
            java.lang.Object r4 = r6.d
            r1 = r10
            r10 = r6
            r6 = r1
            r3 = r37
        L_0x0a07:
            r5 = r9
            r9 = r20
        L_0x0a0a:
            r1 = r26
            goto L_0x09ac
        L_0x0a0d:
            r26 = r10
            r10 = r6
            r6 = r26
            r26 = r20
            r20 = r9
            r9 = r5
            r3 = r37
            r2 = r38
        L_0x0a1b:
            r5 = r39
            r4 = r6
            r6 = r21
            goto L_0x0a4b
        L_0x0a21:
            r2 = r10
            r10 = r6
            r6 = r2
            r2 = r38
            r26 = r20
            r20 = r9
            r9 = r5
            java.lang.Object r4 = r7.x
            mn8 r4 = (defpackage.mn8) r4
            int r5 = r4.x
            if (r3 != r5) goto L_0x0a48
            r5 = 0
            r1 = r37
            r3 = r39
            int r2 = x(r1, r2, r3, r4, r5, r6)
            r5 = r3
            r4 = r6
            r3 = r1
            java.lang.Object r6 = r4.d
            r10 = r4
            r5 = r9
            r9 = r20
            r4 = r21
            goto L_0x0a0a
        L_0x0a48:
            r3 = r37
            goto L_0x0a1b
        L_0x0a4b:
            int r2 = defpackage.ub5.J(r1, r3, r2, r5, r4)
            r1 = r10
            r10 = r4
            r4 = r6
            r6 = r1
            goto L_0x0a07
        L_0x0a54:
            r20 = r6
            r6 = r4
            r4 = r10
            r10 = r20
            r26 = r1
            r20 = r9
            r9 = r5
            r5 = r39
            if (r2 != r13) goto L_0x0a84
            r12.put(r10, r6)
            if (r13 == r9) goto L_0x0a75
            r6 = r4
            r2 = r8
            r8 = r11
            r4 = r13
            r7 = r15
            r14 = r18
            r15 = r20
            r1 = r26
            goto L_0x0948
        L_0x0a75:
            r7 = r20
            r20 = r11
            r11 = r7
            r7 = r40
        L_0x0a7c:
            r14 = r18
            r9 = r26
            r10 = r33
            goto L_0x0d20
        L_0x0a84:
            defpackage.zz8.b(r16)
            r19 = 0
            return r19
        L_0x0a8a:
            r19 = 0
            defpackage.zz8.b(r31)
            return r19
        L_0x0a90:
            r26 = r1
            r20 = r9
            r4 = r10
            r9 = r5
            goto L_0x03d6
        L_0x0a98:
            r7 = r20
            r20 = r11
            r11 = r7
            r7 = r40
            r13 = r9
            goto L_0x0a7c
        L_0x0aa1:
            r26 = r1
            r20 = r9
            r9 = r5
            r5 = r39
            int r1 = r11 + 2
            r1 = r27[r1]
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r17
            long r1 = (long) r1
            switch(r4) {
                case 51: goto L_0x0ce2;
                case 52: goto L_0x0cbe;
                case 53: goto L_0x0c9f;
                case 54: goto L_0x0c9f;
                case 55: goto L_0x0c7f;
                case 56: goto L_0x0c5e;
                case 57: goto L_0x0c3d;
                case 58: goto L_0x0c16;
                case 59: goto L_0x0bd1;
                case 60: goto L_0x0ba3;
                case 61: goto L_0x0b8a;
                case 62: goto L_0x0c7f;
                case 63: goto L_0x0b35;
                case 64: goto L_0x0c3d;
                case 65: goto L_0x0c5e;
                case 66: goto L_0x0b19;
                case 67: goto L_0x0aeb;
                case 68: goto L_0x0ac3;
                default: goto L_0x0ab5;
            }
        L_0x0ab5:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
        L_0x0abf:
            r10 = r33
            goto L_0x0d06
        L_0x0ac3:
            r4 = 3
            if (r7 != r4) goto L_0x0ab5
            r1 = r20 & -8
            r6 = r1 | 4
            java.lang.Object r1 = r0.I(r15, r11, r8)
            wm8 r2 = r0.D(r11)
            r7 = r41
            r4 = r9
            int r2 = defpackage.ub5.E(r1, r2, r3, r4, r5, r6, r7)
            r6 = r7
            r0.J(r8, r15, r1, r11)
            r0 = r20
            r20 = r11
            r11 = r0
            r0 = r2
            r12 = r4
            r4 = r6
            r9 = r26
        L_0x0ae7:
            r10 = r33
            goto L_0x0d07
        L_0x0aeb:
            r6 = r41
            r4 = r9
            if (r7 != 0) goto L_0x0b0f
            int r5 = defpackage.ub5.y(r3, r4, r6)
            long r9 = r6.b
            long r9 = defpackage.yk8.k(r9)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r9 = r26
            r9.putObject(r8, r13, r7)
            r9.putInt(r8, r1, r15)
        L_0x0b06:
            r0 = r20
            r20 = r11
            r11 = r0
            r12 = r4
            r0 = r5
            r4 = r6
            goto L_0x0ae7
        L_0x0b0f:
            r9 = r26
        L_0x0b11:
            r10 = r20
            r20 = r11
            r11 = r10
            r12 = r4
            r4 = r6
            goto L_0x0abf
        L_0x0b19:
            r6 = r41
            r4 = r9
            r9 = r26
            if (r7 != 0) goto L_0x0b11
            int r5 = defpackage.ub5.u(r3, r4, r6)
            int r7 = r6.a
            int r7 = defpackage.yk8.j(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.putObject(r8, r13, r7)
            r9.putInt(r8, r1, r15)
            goto L_0x0b06
        L_0x0b35:
            r6 = r41
            r4 = r9
            r9 = r26
            if (r7 != 0) goto L_0x0b7f
            int r5 = defpackage.ub5.u(r3, r4, r6)
            int r7 = r6.a
            kk8 r10 = r0.F(r11)
            if (r10 == 0) goto L_0x0b4e
            boolean r10 = r10.a(r7)
            if (r10 == 0) goto L_0x0b53
        L_0x0b4e:
            r12 = r20
            r10 = r33
            goto L_0x0b6d
        L_0x0b53:
            r1 = r8
            nl8 r1 = (defpackage.nl8) r1
            en8 r2 = r1.zzc
            r10 = r33
            if (r2 != r10) goto L_0x0b62
            en8 r2 = defpackage.en8.a()
            r1.zzc = r2
        L_0x0b62:
            long r12 = (long) r7
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r12 = r20
            r2.d(r12, r1)
            goto L_0x0b77
        L_0x0b6d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.putObject(r8, r13, r7)
            r9.putInt(r8, r1, r15)
        L_0x0b77:
            r0 = r5
            r20 = r11
            r11 = r12
            r12 = r4
            r4 = r6
            goto L_0x0d07
        L_0x0b7f:
            r10 = r33
            r12 = r20
        L_0x0b83:
            r20 = r11
            r11 = r12
            r12 = r4
            r4 = r6
            goto L_0x0d06
        L_0x0b8a:
            r6 = r41
            r4 = r9
            r12 = r20
            r9 = r26
            r10 = r33
            r5 = 2
            if (r7 != r5) goto L_0x0b83
            int r5 = defpackage.ub5.C(r3, r4, r6)
            java.lang.Object r7 = r6.d
            r9.putObject(r8, r13, r7)
            r9.putInt(r8, r1, r15)
            goto L_0x0b77
        L_0x0ba3:
            r6 = r41
            r4 = r9
            r12 = r20
            r9 = r26
            r10 = r33
            r5 = 2
            if (r7 != r5) goto L_0x0bc9
            java.lang.Object r1 = r0.I(r15, r11, r8)
            wm8 r2 = r0.D(r11)
            r5 = r39
            int r2 = defpackage.ub5.D(r1, r2, r3, r4, r5, r6)
            r14 = r4
            r4 = r6
            r0.J(r8, r15, r1, r11)
            r0 = r2
            r20 = r11
            r11 = r12
            r12 = r14
            goto L_0x0d07
        L_0x0bc9:
            r14 = r4
            r4 = r6
            r20 = r11
            r11 = r12
            r12 = r14
            goto L_0x0d06
        L_0x0bd1:
            r38 = r20
            r20 = r11
            r11 = r38
            r4 = r41
            r38 = r12
            r10 = r33
            r5 = 2
            r12 = r9
            r9 = r26
            if (r7 != r5) goto L_0x0d06
            int r5 = defpackage.ub5.u(r3, r12, r4)
            int r7 = r4.a
            if (r7 != 0) goto L_0x0bef
            r9.putObject(r8, r13, r6)
            goto L_0x0c10
        L_0x0bef:
            int r6 = r5 + r7
            r22 = r38 & r24
            if (r22 == 0) goto L_0x0bfb
            boolean r22 = defpackage.ln8.a(r3, r5, r6)
            if (r22 == 0) goto L_0x0bfe
        L_0x0bfb:
            r38 = r6
            goto L_0x0c04
        L_0x0bfe:
            defpackage.zz8.b(r21)
            r19 = 0
            return r19
        L_0x0c04:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r6.<init>(r3, r5, r7, r0)
            r9.putObject(r8, r13, r6)
            r5 = r38
        L_0x0c10:
            r9.putInt(r8, r1, r15)
            r0 = r5
            goto L_0x0d07
        L_0x0c16:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
            r10 = r33
            if (r7 != 0) goto L_0x0d06
            int r0 = defpackage.ub5.y(r3, r12, r4)
            long r5 = r4.b
            int r5 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r5 == 0) goto L_0x0c30
            r7 = 1
            goto L_0x0c31
        L_0x0c30:
            r7 = 0
        L_0x0c31:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r9.putObject(r8, r13, r5)
            r9.putInt(r8, r1, r15)
            goto L_0x0d07
        L_0x0c3d:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
            r10 = r33
            r6 = 5
            if (r7 != r6) goto L_0x0d06
            int r0 = r12 + 4
            int r5 = defpackage.ub5.z(r12, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.putObject(r8, r13, r5)
            r9.putInt(r8, r1, r15)
            goto L_0x0d07
        L_0x0c5e:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
            r10 = r33
            r6 = 1
            if (r7 != r6) goto L_0x0d06
            int r0 = r12 + 8
            long r5 = defpackage.ub5.A(r12, r3)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r9.putObject(r8, r13, r5)
            r9.putInt(r8, r1, r15)
            goto L_0x0d07
        L_0x0c7f:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
            r10 = r33
            if (r7 != 0) goto L_0x0d06
            int r0 = defpackage.ub5.u(r3, r12, r4)
            int r5 = r4.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.putObject(r8, r13, r5)
            r9.putInt(r8, r1, r15)
            goto L_0x0d07
        L_0x0c9f:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
            r10 = r33
            if (r7 != 0) goto L_0x0d06
            int r0 = defpackage.ub5.y(r3, r12, r4)
            long r5 = r4.b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r9.putObject(r8, r13, r5)
            r9.putInt(r8, r1, r15)
            goto L_0x0d07
        L_0x0cbe:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
            r10 = r33
            r6 = 5
            if (r7 != r6) goto L_0x0d06
            int r0 = r12 + 4
            int r5 = defpackage.ub5.z(r12, r3)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r9.putObject(r8, r13, r5)
            r9.putInt(r8, r1, r15)
            goto L_0x0d07
        L_0x0ce2:
            r4 = r20
            r20 = r11
            r11 = r4
            r4 = r41
            r12 = r9
            r9 = r26
            r10 = r33
            r6 = 1
            if (r7 != r6) goto L_0x0d06
            int r0 = r12 + 8
            long r5 = defpackage.ub5.A(r12, r3)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r9.putObject(r8, r13, r5)
            r9.putInt(r8, r1, r15)
            goto L_0x0d07
        L_0x0d06:
            r0 = r12
        L_0x0d07:
            if (r0 == r12) goto L_0x0d1b
            r5 = r39
            r6 = r4
            r2 = r8
            r1 = r9
            r7 = r15
            r14 = r18
            r8 = r20
            r9 = r32
            r4 = r0
            r15 = r11
        L_0x0d17:
            r0 = r35
            goto L_0x0018
        L_0x0d1b:
            r7 = r40
            r13 = r0
            r14 = r18
        L_0x0d20:
            if (r11 != r7) goto L_0x0d2d
            if (r7 == 0) goto L_0x0d2d
            r6 = r39
            r15 = r11
        L_0x0d27:
            r0 = r32
            r12 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0d5f
        L_0x0d2d:
            r0 = r8
            nl8 r0 = (defpackage.nl8) r0
            en8 r1 = r0.zzc
            if (r1 != r10) goto L_0x0d3a
            en8 r1 = defpackage.en8.a()
            r0.zzc = r1
        L_0x0d3a:
            r5 = r1
            r2 = r3
            r6 = r4
            r1 = r11
            r3 = r13
            r4 = r39
            int r0 = defpackage.ub5.I(r1, r2, r3, r4, r5, r6)
            r3 = r37
            r6 = r41
            r5 = r4
            r2 = r8
            r7 = r15
            r8 = r20
            r4 = r0
            r15 = r1
            r1 = r9
            r9 = r32
            goto L_0x0d17
        L_0x0d54:
            r7 = r40
            r8 = r2
            r6 = r5
            r32 = r9
            r18 = r14
            r9 = r1
            r13 = r4
            goto L_0x0d27
        L_0x0d5f:
            if (r0 == r12) goto L_0x0d65
            long r0 = (long) r0
            r9.putInt(r8, r0, r14)
        L_0x0d65:
            r0 = 0
            r1 = r35
            int r2 = r1.h
            r3 = r0
            r9 = r2
        L_0x0d6c:
            int r0 = r1.i
            if (r9 >= r0) goto L_0x0d87
            xb4 r4 = r1.j
            int[] r0 = r1.g
            r2 = r0[r9]
            r5 = r36
            r0 = r1
            r1 = r8
            java.lang.Object r2 = r0.K(r1, r2, r3, r4, r5)
            r3 = r2
            en8 r3 = (defpackage.en8) r3
            int r9 = r9 + 1
            r8 = r36
            r1 = r0
            goto L_0x0d6c
        L_0x0d87:
            r0 = r1
            if (r3 == 0) goto L_0x0d95
            xb4 r0 = r0.j
            r0.getClass()
            r0 = r36
            nl8 r0 = (defpackage.nl8) r0
            r0.zzc = r3
        L_0x0d95:
            if (r7 != 0) goto L_0x0da0
            if (r13 != r6) goto L_0x0d9a
            goto L_0x0da6
        L_0x0d9a:
            defpackage.zz8.b(r16)
            r19 = 0
            return r19
        L_0x0da0:
            r19 = 0
            if (r13 > r6) goto L_0x0da7
            if (r15 != r7) goto L_0x0da7
        L_0x0da6:
            return r13
        L_0x0da7:
            defpackage.zz8.b(r16)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om8.y(java.lang.Object, byte[], int, int, int, mj2):int");
    }
}
