package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g implements pg6 {
    public static final int[] n = new int[0];
    public static final Unsafe o = tt7.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final gz4 j;
    public final s74 k;
    public final j l;
    public final lf4 m;

    public g(int[] iArr, Object[] objArr, int i2, int i3, a aVar, int[] iArr2, int i4, int i5, gz4 gz4, s74 s74, j jVar, ba2 ba2, lf4 lf4) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.f = aVar instanceof e;
        this.g = iArr2;
        this.h = i4;
        this.i = i5;
        this.j = gz4;
        this.k = s74;
        this.l = jVar;
        this.e = aVar;
        this.m = lf4;
    }

    public static Field F(Class cls, String str) {
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

    public static int K(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof e) {
            return ((e) obj).g();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0398  */
    public static g w(ew5 ew5, gz4 gz4, s74 s74, j jVar, ba2 ba2, lf4 lf4) {
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
        int i6;
        char c8;
        Class<?> cls;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Field field;
        char charAt;
        int i15;
        Object obj;
        Field field2;
        Object obj2;
        Field field3;
        int i16;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        char charAt10;
        int i26;
        char charAt11;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        ew5 ew52 = ew5;
        String str = ew52.b;
        int length = str.length();
        char c9 = 55296;
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i2 = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i2;
            }
        } else {
            i2 = 1;
        }
        int i30 = i2 + 1;
        char charAt14 = str.charAt(i2);
        if (charAt14 >= 55296) {
            char c10 = charAt14 & 8191;
            int i31 = 13;
            while (true) {
                i28 = i30 + 1;
                charAt13 = str.charAt(i30);
                if (charAt13 < 55296) {
                    break;
                }
                c10 |= (charAt13 & 8191) << i31;
                i31 += 13;
                i30 = i28;
            }
            charAt14 = c10 | (charAt13 << i31);
            i30 = i28;
        }
        if (charAt14 == 0) {
            c6 = 0;
            i3 = 0;
            c5 = 0;
            c4 = 0;
            c3 = 0;
            c2 = 0;
            iArr = n;
            c7 = 0;
        } else {
            int i32 = i30 + 1;
            char charAt15 = str.charAt(i30);
            if (charAt15 >= 55296) {
                char c11 = charAt15 & 8191;
                int i33 = 13;
                while (true) {
                    i27 = i32 + 1;
                    charAt12 = str.charAt(i32);
                    if (charAt12 < 55296) {
                        break;
                    }
                    c11 |= (charAt12 & 8191) << i33;
                    i33 += 13;
                    i32 = i27;
                }
                charAt15 = c11 | (charAt12 << i33);
                i32 = i27;
            }
            int i34 = i32 + 1;
            char charAt16 = str.charAt(i32);
            if (charAt16 >= 55296) {
                char c12 = charAt16 & 8191;
                int i35 = 13;
                while (true) {
                    i26 = i34 + 1;
                    charAt11 = str.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    c12 |= (charAt11 & 8191) << i35;
                    i35 += 13;
                    i34 = i26;
                }
                charAt16 = c12 | (charAt11 << i35);
                i34 = i26;
            }
            int i36 = i34 + 1;
            char charAt17 = str.charAt(i34);
            if (charAt17 >= 55296) {
                char c13 = charAt17 & 8191;
                int i37 = 13;
                while (true) {
                    i25 = i36 + 1;
                    charAt10 = str.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    c13 |= (charAt10 & 8191) << i37;
                    i37 += 13;
                    i36 = i25;
                }
                charAt17 = c13 | (charAt10 << i37);
                i36 = i25;
            }
            int i38 = i36 + 1;
            char charAt18 = str.charAt(i36);
            if (charAt18 >= 55296) {
                char c14 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i24 = i38 + 1;
                    charAt9 = str.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    c14 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i38 = i24;
                }
                charAt18 = c14 | (charAt9 << i39);
                i38 = i24;
            }
            int i40 = i38 + 1;
            c5 = str.charAt(i38);
            if (c5 >= 55296) {
                char c15 = c5 & 8191;
                int i41 = 13;
                while (true) {
                    i23 = i40 + 1;
                    charAt8 = str.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    c15 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i40 = i23;
                }
                c5 = c15 | (charAt8 << i41);
                i40 = i23;
            }
            int i42 = i40 + 1;
            char charAt19 = str.charAt(i40);
            if (charAt19 >= 55296) {
                char c16 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i22 = i42 + 1;
                    charAt7 = str.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    c16 |= (charAt7 & 8191) << i43;
                    i43 += 13;
                    i42 = i22;
                }
                charAt19 = c16 | (charAt7 << i43);
                i42 = i22;
            }
            int i44 = i42 + 1;
            char charAt20 = str.charAt(i42);
            if (charAt20 >= 55296) {
                char c17 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i21 = i44 + 1;
                    charAt6 = str.charAt(i44);
                    if (charAt6 < 55296) {
                        break;
                    }
                    c17 |= (charAt6 & 8191) << i45;
                    i45 += 13;
                    i44 = i21;
                }
                charAt20 = c17 | (charAt6 << i45);
                i44 = i21;
            }
            int i46 = i44 + 1;
            char charAt21 = str.charAt(i44);
            if (charAt21 >= 55296) {
                char c18 = charAt21 & 8191;
                int i47 = 13;
                while (true) {
                    i20 = i46 + 1;
                    charAt5 = str.charAt(i46);
                    if (charAt5 < 55296) {
                        break;
                    }
                    c18 |= (charAt5 & 8191) << i47;
                    i47 += 13;
                    i46 = i20;
                }
                charAt21 = c18 | (charAt5 << i47);
                i46 = i20;
            }
            int i48 = (charAt15 * 2) + charAt16;
            char c19 = charAt19;
            c4 = charAt17;
            c6 = c19;
            c7 = charAt15;
            i30 = i46;
            iArr = new int[(charAt21 + charAt19 + charAt20)];
            c3 = charAt18;
            i3 = i48;
            c2 = charAt21;
        }
        Unsafe unsafe = o;
        Object[] objArr = ew52.c;
        Class<?> cls2 = ew52.a.getClass();
        int[] iArr2 = new int[(c5 * 3)];
        Object[] objArr2 = new Object[(c5 * 2)];
        int i49 = c2 + c6;
        int i50 = i49;
        char c20 = c2;
        int i51 = 0;
        int i52 = 0;
        while (i30 < length) {
            int i53 = i30 + 1;
            char charAt22 = str.charAt(i30);
            if (charAt22 >= c9) {
                char c21 = charAt22 & 8191;
                int i54 = i53;
                int i55 = 13;
                while (true) {
                    i19 = i54 + 1;
                    charAt4 = str.charAt(i54);
                    i4 = length;
                    if (charAt4 < 55296) {
                        break;
                    }
                    c21 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i54 = i19;
                    length = i4;
                }
                charAt22 = c21 | (charAt4 << i55);
                i5 = i19;
            } else {
                i4 = length;
                i5 = i53;
            }
            int i56 = i5 + 1;
            char charAt23 = str.charAt(i5);
            Object[] objArr3 = objArr;
            char c22 = 55296;
            if (charAt23 >= 55296) {
                char c23 = charAt23 & 8191;
                int i57 = 13;
                while (true) {
                    i18 = i56 + 1;
                    charAt3 = str.charAt(i56);
                    if (charAt3 < c22) {
                        break;
                    }
                    c23 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i56 = i18;
                    c22 = 55296;
                }
                charAt23 = c23 | (charAt3 << i57);
                i56 = i18;
            }
            char c24 = charAt23 & 255;
            int i58 = charAt22;
            if ((charAt23 & 1024) != 0) {
                iArr[i51] = i52;
                i51++;
            }
            int[] iArr3 = iArr2;
            if (c24 >= '3') {
                int i59 = i56 + 1;
                char charAt24 = str.charAt(i56);
                char c25 = 55296;
                if (charAt24 >= 55296) {
                    char c26 = charAt24 & 8191;
                    int i60 = 13;
                    while (true) {
                        i17 = i59 + 1;
                        charAt2 = str.charAt(i59);
                        if (charAt2 < c25) {
                            break;
                        }
                        c26 |= (charAt2 & 8191) << i60;
                        i60 += 13;
                        i59 = i17;
                        c25 = 55296;
                    }
                    charAt24 = c26 | (charAt2 << i60);
                    i59 = i17;
                }
                int i61 = c24 - '3';
                int i62 = i59;
                if (i61 == 9 || i61 == 17) {
                    i16 = i3 + 1;
                    objArr2[((i52 / 3) * 2) + 1] = objArr3[i3];
                } else {
                    if (i61 == 12 && (b81.c(ew52.a(), 1) || (charAt23 & 2048) != 0)) {
                        i16 = i3 + 1;
                        objArr2[((i52 / 3) * 2) + 1] = objArr3[i3];
                    }
                    int i63 = charAt24 * 2;
                    obj = objArr3[i63];
                    if (!(obj instanceof Field)) {
                        field2 = (Field) obj;
                    } else {
                        field2 = F(cls2, (String) obj);
                        objArr3[i63] = field2;
                    }
                    int i64 = i63 + 1;
                    obj2 = objArr3[i64];
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(field2);
                    if (!(obj2 instanceof Field)) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = F(cls2, (String) obj2);
                        objArr3[i64] = field3;
                    }
                    char c27 = c7;
                    i7 = (int) unsafe.objectFieldOffset(field3);
                    i10 = objectFieldOffset;
                    c8 = c27;
                    i9 = i3;
                    i6 = i62;
                    i8 = 0;
                    cls = cls2;
                }
                i3 = i16;
                int i632 = charAt24 * 2;
                obj = objArr3[i632];
                if (!(obj instanceof Field)) {
                }
                int i642 = i632 + 1;
                obj2 = objArr3[i642];
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(field2);
                if (!(obj2 instanceof Field)) {
                }
                char c272 = c7;
                i7 = (int) unsafe.objectFieldOffset(field3);
                i10 = objectFieldOffset2;
                c8 = c272;
                i9 = i3;
                i6 = i62;
                i8 = 0;
                cls = cls2;
            } else {
                Field F = F(cls2, (String) objArr3[i3]);
                int i65 = i3 + 1;
                if (c24 == 9 || c24 == 17) {
                    c8 = c7;
                    objArr2[((i52 / 3) * 2) + 1] = F.getType();
                } else {
                    if (c24 == 27 || c24 == '1') {
                        c8 = c7;
                        i15 = i3 + 2;
                        objArr2[((i52 / 3) * 2) + 1] = objArr3[i65];
                    } else if (c24 == 12 || c24 == 30 || c24 == ',') {
                        c8 = c7;
                        if (ew52.a() == 1 || (charAt23 & 2048) != 0) {
                            i15 = i3 + 2;
                            objArr2[((i52 / 3) * 2) + 1] = objArr3[i65];
                        }
                    } else if (c24 == '2') {
                        int i66 = c20 + 1;
                        iArr[c20] = i52;
                        int i67 = (i52 / 3) * 2;
                        int i68 = i3 + 2;
                        objArr2[i67] = objArr3[i65];
                        int i69 = i66;
                        if ((charAt23 & 2048) != 0) {
                            i14 = i3 + 3;
                            objArr2[i67 + 1] = objArr3[i68];
                            c8 = c7;
                            cls = cls2;
                            c20 = i69;
                        } else {
                            cls = cls2;
                            i14 = i68;
                            c20 = i69;
                            c8 = c7;
                        }
                        int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F);
                        if ((charAt23 & 4096) == 0 || c24 > 17) {
                            i7 = 1048575;
                            i6 = i56;
                            i8 = 0;
                        } else {
                            int i70 = i56 + 1;
                            char charAt25 = str.charAt(i56);
                            if (charAt25 >= 55296) {
                                char c28 = charAt25 & 8191;
                                int i71 = 13;
                                while (true) {
                                    i6 = i70 + 1;
                                    charAt = str.charAt(i70);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    c28 |= (charAt & 8191) << i71;
                                    i71 += 13;
                                    i70 = i6;
                                }
                                charAt25 = c28 | (charAt << i71);
                            } else {
                                i6 = i70;
                            }
                            int i72 = (charAt25 / ' ') + (c8 * 2);
                            Object obj3 = objArr3[i72];
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = F(cls, (String) obj3);
                                objArr3[i72] = field;
                            }
                            i7 = (int) unsafe.objectFieldOffset(field);
                            i8 = charAt25 % ' ';
                        }
                        if (c24 < 18 || c24 > '1') {
                            int i73 = objectFieldOffset3;
                            i9 = i14;
                            i10 = i73;
                        } else {
                            int i74 = i50 + 1;
                            iArr[i50] = objectFieldOffset3;
                            int i75 = objectFieldOffset3;
                            i9 = i14;
                            i10 = i75;
                            i50 = i74;
                        }
                    } else {
                        c8 = c7;
                    }
                    i14 = i15;
                    cls = cls2;
                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F);
                    if ((charAt23 & 4096) == 0 || c24 > 17) {
                    }
                    if (c24 < 18 || c24 > '1') {
                    }
                }
                cls = cls2;
                i14 = i65;
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(F);
                if ((charAt23 & 4096) == 0 || c24 > 17) {
                }
                if (c24 < 18 || c24 > '1') {
                }
            }
            int i76 = i52 + 1;
            iArr3[i52] = i58;
            int i77 = i52 + 2;
            String str2 = str;
            if ((charAt23 & 512) != 0) {
                i11 = 536870912;
            } else {
                i11 = 0;
            }
            int i78 = i11;
            if ((charAt23 & 256) != 0) {
                i12 = 268435456;
            } else {
                i12 = 0;
            }
            int i79 = i78 | i12;
            if ((charAt23 & 2048) != 0) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 0;
            }
            iArr3[i76] = i79 | i13 | (c24 << 20) | i10;
            i52 += 3;
            iArr3[i77] = (i8 << 20) | i7;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i4;
            c7 = c8;
            i30 = i6;
            c9 = 55296;
            i3 = i9;
            iArr2 = iArr3;
        }
        return new g(iArr2, objArr2, c4, c3, ew52.a, iArr, c2, i49, gz4, s74, jVar, ba2, lf4);
    }

    public static long x(int i2) {
        return (long) (i2 & 1048575);
    }

    public static int y(long j2, Object obj) {
        return ((Integer) tt7.c.h(j2, obj)).intValue();
    }

    public static long z(long j2, Object obj) {
        return ((Long) tt7.c.h(j2, obj)).longValue();
    }

    public final int A(int i2) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i3 = 0;
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

    public final void B(Object obj, long j2, d dVar, pg6 pg6, z92 z92) {
        int z;
        this.k.getClass();
        qf3 a2 = s74.a(j2, obj);
        us0 us0 = dVar.a;
        int i2 = dVar.b;
        if ((i2 & 7) == 3) {
            do {
                e d2 = pg6.d();
                dVar.b(d2, pg6, z92);
                pg6.b(d2);
                ((du5) a2).add(d2);
                if (!us0.c() && dVar.d == 0) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == i2);
            dVar.d = z;
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void C(Object obj, int i2, d dVar, pg6 pg6, z92 z92) {
        int z;
        this.k.getClass();
        qf3 a2 = s74.a((long) (i2 & 1048575), obj);
        us0 us0 = dVar.a;
        int i3 = dVar.b;
        if ((i3 & 7) == 2) {
            do {
                e d2 = pg6.d();
                dVar.c(d2, pg6, z92);
                pg6.b(d2);
                ((du5) a2).add(d2);
                if (!us0.c() && dVar.d == 0) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == i3);
            dVar.d = z;
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void D(int i2, d dVar, Object obj) {
        if ((536870912 & i2) != 0) {
            dVar.w(2);
            tt7.o(obj, (long) (i2 & 1048575), dVar.a.y());
        } else if (this.f) {
            dVar.w(2);
            tt7.o(obj, (long) (i2 & 1048575), dVar.a.x());
        } else {
            tt7.o(obj, (long) (i2 & 1048575), dVar.e());
        }
    }

    public final void E(int i2, d dVar, Object obj) {
        boolean z;
        if ((536870912 & i2) != 0) {
            z = true;
        } else {
            z = false;
        }
        s74 s74 = this.k;
        if (z) {
            s74.getClass();
            dVar.s(s74.a((long) (i2 & 1048575), obj), true);
            return;
        }
        s74.getClass();
        dVar.s(s74.a((long) (i2 & 1048575), obj), false);
    }

    public final void G(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            tt7.m((1 << (i3 >>> 20)) | tt7.c.f(j2, obj), j2, obj);
        }
    }

    public final void H(int i2, int i3, Object obj) {
        tt7.m(i2, (long) (this.a[i3 + 2] & 1048575), obj);
    }

    public final void I(Object obj, int i2, a aVar) {
        o.putObject(obj, (long) (L(i2) & 1048575), aVar);
        G(i2, obj);
    }

    public final void J(Object obj, int i2, int i3, a aVar) {
        o.putObject(obj, (long) (L(i3) & 1048575), aVar);
        H(i2, i3, obj);
    }

    public final int L(int i2) {
        return this.a[i2 + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0354, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0355, code lost:
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04dd, code lost:
        r0 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x064b, code lost:
        r2 = r2 + 3;
        r10 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0249, code lost:
        r3 = r19;
     */
    public final void M(Object obj, ji8 ji8) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        g gVar = this;
        Object obj2 = obj;
        ji8 ji82 = ji8;
        int[] iArr = gVar.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int L = gVar.L(i8);
            int i10 = iArr[i8];
            int K = K(L);
            if (K <= 17) {
                int i11 = iArr[i8 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    if (i12 == i6) {
                        i9 = 0;
                    } else {
                        i9 = unsafe.getInt(obj2, (long) i12);
                    }
                    i7 = i12;
                }
                i2 = L;
                i3 = 1 << (i11 >>> 20);
            } else {
                i2 = L;
                i3 = 0;
            }
            long j2 = (long) (i2 & i6);
            switch (K) {
                case b85.b /*0*/:
                    if (!gVar.o(obj2, i8, i7, i9, i3)) {
                        break;
                    } else {
                        double d2 = tt7.c.d(j2, obj2);
                        ws0 ws0 = (ws0) ji82.x;
                        ws0.getClass();
                        ws0.t(Double.doubleToRawLongBits(d2), i10);
                        break;
                    }
                case 1:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        float e2 = tt7.c.e(j2, obj2);
                        ws0 ws02 = (ws0) ji82.x;
                        ws02.getClass();
                        ws02.r(i10, Float.floatToRawIntBits(e2));
                        break;
                    }
                    break;
                case 2:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).E(unsafe.getLong(obj2, j2), i10);
                        break;
                    }
                    break;
                case 3:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).E(unsafe.getLong(obj2, j2), i10);
                        break;
                    }
                    break;
                case 4:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).v(i10, unsafe.getInt(obj2, j2));
                        break;
                    }
                    break;
                case 5:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).t(unsafe.getLong(obj2, j2), i10);
                        break;
                    }
                    break;
                case 6:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).r(i10, unsafe.getInt(obj2, j2));
                        break;
                    }
                    break;
                case 7:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).o(i10, tt7.c.c(j2, obj2));
                        break;
                    }
                    break;
                case 8:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        Object object = unsafe.getObject(obj2, j2);
                        if (!(object instanceof String)) {
                            ((ws0) ji82.x).p(i10, (zf0) object);
                            break;
                        } else {
                            ((ws0) ji82.x).z(i10, (String) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (!gVar.o(obj2, i8, i7, i9, i3)) {
                        break;
                    } else {
                        ((ws0) ji82.x).y(i10, (a) unsafe.getObject(obj2, j2), gVar.m(i8));
                        break;
                    }
                case 10:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).p(i10, (zf0) unsafe.getObject(obj2, j2));
                        break;
                    }
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).C(i10, unsafe.getInt(obj2, j2));
                        break;
                    }
                    break;
                case 12:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).v(i10, unsafe.getInt(obj2, j2));
                        break;
                    }
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).r(i10, unsafe.getInt(obj2, j2));
                        break;
                    }
                    break;
                case 14:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        ((ws0) ji82.x).t(unsafe.getLong(obj2, j2), i10);
                        break;
                    }
                    break;
                case h75.g /*15*/:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        int i13 = unsafe.getInt(obj2, j2);
                        ((ws0) ji82.x).C(i10, (i13 >> 31) ^ (i13 << 1));
                        break;
                    }
                    break;
                case 16:
                    if (gVar.o(obj2, i8, i7, i9, i3)) {
                        long j3 = unsafe.getLong(obj2, j2);
                        ((ws0) ji82.x).E((j3 >> 63) ^ (j3 << 1), i10);
                        break;
                    }
                    break;
                case 17:
                    if (!gVar.o(obj2, i8, i7, i9, i3)) {
                        break;
                    } else {
                        ji82.H(i10, unsafe.getObject(obj2, j2), gVar.m(i8));
                        break;
                    }
                case 18:
                    i4 = i7;
                    i.n(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 19:
                    i4 = i7;
                    i.r(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 20:
                    i4 = i7;
                    i.t(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 21:
                    i4 = i7;
                    i.z(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 22:
                    i4 = i7;
                    i.s(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 23:
                    i4 = i7;
                    i.q(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 24:
                    i4 = i7;
                    i.p(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 25:
                    i4 = i7;
                    i.m(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 26:
                    i5 = i7;
                    int i14 = iArr[i8];
                    List list = (List) unsafe.getObject(obj2, j2);
                    Class cls = i.a;
                    if (list != null && !list.isEmpty()) {
                        ji82.getClass();
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            ((ws0) ji82.x).z(i14, (String) list.get(i15));
                        }
                        break;
                    }
                case 27:
                    i5 = i7;
                    int i16 = iArr[i8];
                    List list2 = (List) unsafe.getObject(obj2, j2);
                    pg6 m2 = gVar.m(i8);
                    Class cls2 = i.a;
                    if (list2 != null && !list2.isEmpty()) {
                        ji82.getClass();
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            ((ws0) ji82.x).y(i16, (a) list2.get(i17), m2);
                        }
                        break;
                    }
                case 28:
                    i5 = i7;
                    int i18 = iArr[i8];
                    List list3 = (List) unsafe.getObject(obj2, j2);
                    Class cls3 = i.a;
                    if (list3 != null && !list3.isEmpty()) {
                        ji82.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((ws0) ji82.x).p(i18, (zf0) list3.get(i19));
                        }
                        break;
                    }
                case 29:
                    i4 = i7;
                    z = false;
                    i.y(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 30:
                    i4 = i7;
                    z = false;
                    i.o(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 31:
                    i4 = i7;
                    z = false;
                    i.u(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 32:
                    i4 = i7;
                    z = false;
                    i.v(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 33:
                    i4 = i7;
                    z = false;
                    i.w(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 34:
                    i4 = i7;
                    z = false;
                    i.x(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, false);
                    break;
                case 35:
                    i5 = i7;
                    i.n(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 36:
                    i5 = i7;
                    i.r(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 37:
                    i5 = i7;
                    i.t(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 38:
                    i5 = i7;
                    i.z(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 39:
                    i5 = i7;
                    i.s(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 40:
                    i5 = i7;
                    i.q(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 41:
                    i5 = i7;
                    i.p(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 42:
                    i5 = i7;
                    i.m(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 43:
                    i5 = i7;
                    i.y(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 44:
                    i5 = i7;
                    i.o(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 45:
                    i5 = i7;
                    i.u(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 46:
                    i5 = i7;
                    i.v(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 47:
                    i5 = i7;
                    i.w(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case h75.h /*48*/:
                    i5 = i7;
                    i.x(iArr[i8], (List) unsafe.getObject(obj2, j2), ji82, true);
                    break;
                case 49:
                    i5 = i7;
                    int i20 = iArr[i8];
                    List list4 = (List) unsafe.getObject(obj2, j2);
                    pg6 m3 = gVar.m(i8);
                    Class cls4 = i.a;
                    if (list4 != null && !list4.isEmpty()) {
                        ji82.getClass();
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            ji82.H(i20, list4.get(i21), m3);
                        }
                        break;
                    }
                case 50:
                    Object object2 = unsafe.getObject(obj2, j2);
                    if (object2 != null) {
                        int i22 = 2;
                        Object obj3 = gVar.b[(i8 / 3) * 2];
                        gVar.m.getClass();
                        cf4 cf4 = ((ef4) obj3).a;
                        ws0 ws03 = (ws0) ji82.x;
                        ws03.getClass();
                        for (Map.Entry entry : ((jf4) object2).entrySet()) {
                            ws03.B(i10, i22);
                            ws03.D(ef4.a(cf4, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            qc2.b(ws03, (sc8) cf4.x, 1, key);
                            i22 = 2;
                            qc2.b(ws03, (sc8) cf4.y, 2, value);
                            i7 = i7;
                        }
                    }
                    i5 = i7;
                    break;
                case 51:
                    if (gVar.q(i10, i8, obj2)) {
                        double doubleValue = ((Double) tt7.c.h(j2, obj2)).doubleValue();
                        ws0 ws04 = (ws0) ji82.x;
                        ws04.getClass();
                        ws04.t(Double.doubleToRawLongBits(doubleValue), i10);
                        break;
                    }
                    break;
                case 52:
                    if (gVar.q(i10, i8, obj2)) {
                        float floatValue = ((Float) tt7.c.h(j2, obj2)).floatValue();
                        ws0 ws05 = (ws0) ji82.x;
                        ws05.getClass();
                        ws05.r(i10, Float.floatToRawIntBits(floatValue));
                        break;
                    }
                    break;
                case 53:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).E(z(j2, obj2), i10);
                        break;
                    }
                    break;
                case 54:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).E(z(j2, obj2), i10);
                        break;
                    }
                    break;
                case 55:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).v(i10, y(j2, obj2));
                        break;
                    }
                    break;
                case 56:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).t(z(j2, obj2), i10);
                        break;
                    }
                    break;
                case 57:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).r(i10, y(j2, obj2));
                        break;
                    }
                    break;
                case 58:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).o(i10, ((Boolean) tt7.c.h(j2, obj2)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (gVar.q(i10, i8, obj2)) {
                        Object object3 = unsafe.getObject(obj2, j2);
                        if (!(object3 instanceof String)) {
                            ((ws0) ji82.x).p(i10, (zf0) object3);
                            break;
                        } else {
                            ((ws0) ji82.x).z(i10, (String) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).y(i10, (a) unsafe.getObject(obj2, j2), gVar.m(i8));
                        break;
                    }
                    break;
                case 61:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).p(i10, (zf0) unsafe.getObject(obj2, j2));
                        break;
                    }
                    break;
                case 62:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).C(i10, y(j2, obj2));
                        break;
                    }
                    break;
                case 63:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).v(i10, y(j2, obj2));
                        break;
                    }
                    break;
                case 64:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).r(i10, y(j2, obj2));
                        break;
                    }
                    break;
                case 65:
                    if (gVar.q(i10, i8, obj2)) {
                        ((ws0) ji82.x).t(z(j2, obj2), i10);
                        break;
                    }
                    break;
                case 66:
                    if (gVar.q(i10, i8, obj2)) {
                        int y = y(j2, obj2);
                        ((ws0) ji82.x).C(i10, (y >> 31) ^ (y << 1));
                        break;
                    }
                    break;
                case 67:
                    if (gVar.q(i10, i8, obj2)) {
                        long z2 = z(j2, obj2);
                        ((ws0) ji82.x).E((z2 << 1) ^ (z2 >> 63), i10);
                        break;
                    }
                    break;
                case 68:
                    if (gVar.q(i10, i8, obj2)) {
                        ji82.H(i10, unsafe.getObject(obj2, j2), gVar.m(i8));
                        break;
                    }
                    break;
            }
        }
        ((l) gVar.l).getClass();
        ((e) obj2).unknownFields.d(ji82);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (p(obj)) {
            obj2.getClass();
            int i2 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i2 < iArr.length) {
                    int L = L(i2);
                    long j2 = (long) (1048575 & L);
                    int i3 = iArr[i2];
                    switch (K(L)) {
                        case b85.b /*0*/:
                            if (n(i2, obj2)) {
                                rt7 rt7 = tt7.c;
                                obj3 = obj;
                                rt7.l(obj3, j2, rt7.d(j2, obj2));
                                G(i2, obj3);
                                continue;
                            }
                        case 1:
                            if (n(i2, obj2)) {
                                rt7 rt72 = tt7.c;
                                rt72.m(obj, j2, rt72.e(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 2:
                            if (n(i2, obj2)) {
                                tt7.n(obj, j2, tt7.c.g(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 3:
                            if (n(i2, obj2)) {
                                tt7.n(obj, j2, tt7.c.g(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 4:
                            if (n(i2, obj2)) {
                                tt7.m(tt7.c.f(j2, obj2), j2, obj);
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 5:
                            if (n(i2, obj2)) {
                                tt7.n(obj, j2, tt7.c.g(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 6:
                            if (n(i2, obj2)) {
                                tt7.m(tt7.c.f(j2, obj2), j2, obj);
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 7:
                            if (n(i2, obj2)) {
                                rt7 rt73 = tt7.c;
                                rt73.j(obj, j2, rt73.c(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 8:
                            if (n(i2, obj2)) {
                                tt7.o(obj, j2, tt7.c.h(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 9:
                            s(i2, obj, obj2);
                            obj3 = obj;
                            break;
                        case 10:
                            if (n(i2, obj2)) {
                                tt7.o(obj, j2, tt7.c.h(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                            if (n(i2, obj2)) {
                                tt7.m(tt7.c.f(j2, obj2), j2, obj);
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 12:
                            if (n(i2, obj2)) {
                                tt7.m(tt7.c.f(j2, obj2), j2, obj);
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                            if (n(i2, obj2)) {
                                tt7.m(tt7.c.f(j2, obj2), j2, obj);
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 14:
                            if (n(i2, obj2)) {
                                tt7.n(obj, j2, tt7.c.g(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case h75.g /*15*/:
                            if (n(i2, obj2)) {
                                tt7.m(tt7.c.f(j2, obj2), j2, obj);
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 16:
                            if (n(i2, obj2)) {
                                tt7.n(obj, j2, tt7.c.g(j2, obj2));
                                G(i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 17:
                            s(i2, obj, obj2);
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
                            this.k.getClass();
                            rt7 rt74 = tt7.c;
                            qf3 qf3 = (qf3) rt74.h(j2, obj);
                            qf3 qf32 = (qf3) rt74.h(j2, obj2);
                            int i4 = ((du5) qf3).y;
                            int i5 = ((du5) qf32).y;
                            if (i4 > 0 && i5 > 0) {
                                if (!((du5) qf3).w) {
                                    qf3 = ((du5) qf3).g(i5 + i4);
                                }
                                ((du5) qf3).addAll(qf32);
                            }
                            if (i4 > 0) {
                                qf32 = qf3;
                            }
                            tt7.o(obj, j2, qf32);
                            obj3 = obj;
                            break;
                        case 50:
                            Class cls = i.a;
                            rt7 rt75 = tt7.c;
                            Object h2 = rt75.h(j2, obj);
                            Object h3 = rt75.h(j2, obj2);
                            this.m.getClass();
                            tt7.o(obj, j2, lf4.a(h2, h3));
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
                            if (q(i3, i2, obj2)) {
                                tt7.o(obj, j2, tt7.c.h(j2, obj2));
                                H(i3, i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 60:
                            t(i2, obj, obj2);
                            obj3 = obj;
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (q(i3, i2, obj2)) {
                                tt7.o(obj, j2, tt7.c.h(j2, obj2));
                                H(i3, i2, obj);
                            }
                            obj3 = obj;
                            break;
                        case 68:
                            t(i2, obj, obj2);
                            obj3 = obj;
                            break;
                    }
                    obj3 = obj;
                    i2 += 3;
                    obj = obj3;
                } else {
                    i.k(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            kj6.o("Mutating immutable message: ", obj);
        }
    }

    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                eVar.k(Integer.MAX_VALUE);
                eVar.memoizedHashCode = 0;
                eVar.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int L = L(i2);
                long j2 = (long) (1048575 & L);
                int K = K(L);
                if (K != 9) {
                    if (K == 60 || K == 68) {
                        if (q(iArr[i2], i2, obj)) {
                            m(i2).b(o.getObject(obj, j2));
                        }
                    } else {
                        switch (K) {
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
                                this.k.getClass();
                                du5 du5 = (du5) ((qf3) tt7.c.h(j2, obj));
                                if (du5.w) {
                                    du5.w = false;
                                    break;
                                } else {
                                    continue;
                                }
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.m.getClass();
                                    ((jf4) object).w = false;
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (n(i2, obj)) {
                    m(i2).b(o.getObject(obj, j2));
                }
            }
            ((l) this.l).getClass();
            k kVar = ((e) obj).unknownFields;
            if (kVar.e) {
                kVar.e = false;
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
        while (i7 < this.h) {
            int i8 = this.g[i7];
            int[] iArr = this.a;
            int i9 = iArr[i8];
            int L = L(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = o.getInt(obj2, (long) i11);
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
            if ((268435456 & L) == 0 || o(obj2, i4, i3, i2, i12)) {
                int K = K(L);
                if (K != 9 && K != 17) {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i9, i4, obj2)) {
                                if (!m(i4).c(tt7.c.h((long) (L & 1048575), obj2))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h2 = tt7.c.h((long) (L & 1048575), obj2);
                                this.m.getClass();
                                jf4 jf4 = (jf4) h2;
                                if (jf4.isEmpty()) {
                                    continue;
                                } else {
                                    if (((sc8) ((ef4) this.b[(i4 / 3) * 2]).a.y).w != vc8.E) {
                                        continue;
                                    } else {
                                        pg6 pg6 = null;
                                        for (Object next : jf4.values()) {
                                            if (pg6 == null) {
                                                pg6 = bu5.c.a(next.getClass());
                                            }
                                            if (!pg6.c(next)) {
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    List list = (List) tt7.c.h((long) (L & 1048575), obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        pg6 m2 = m(i4);
                        int i14 = 0;
                        while (i14 < list.size()) {
                            if (m2.c(list.get(i14))) {
                                i14++;
                            }
                        }
                        continue;
                    }
                } else if (o(obj2, i4, i3, i2, i12)) {
                    if (!m(i4).c(tt7.c.h((long) (L & 1048575), obj2))) {
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

    public final e d() {
        this.j.getClass();
        return ((e) this.e).i();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:113|112|156|157|(0)|160|(0)|165|179|173) */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03e3, code lost:
        r14 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0410, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x069e, code lost:
        r6.k(r9[r11], r2, r12);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x06a8, code lost:
        ((androidx.datastore.preferences.protobuf.l) r8).getClass();
        ((androidx.datastore.preferences.protobuf.e) r2).unknownFields = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        r6 = r1;
        r14 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x0677 */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x067c A[Catch:{ all -> 0x0410 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x069e A[LOOP:5: B:166:0x069c->B:167:0x069e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0687 A[SYNTHETIC] */
    public final void e(Object obj, d dVar, z92 z92) {
        g gVar;
        d dVar2;
        d dVar3;
        g gVar2 = this;
        Object obj2 = obj;
        d dVar4 = dVar;
        z92 z922 = z92;
        z922.getClass();
        if (p(obj2)) {
            j jVar = gVar2.l;
            int[] iArr = gVar2.g;
            int i2 = gVar2.i;
            int i3 = gVar2.h;
            k kVar = null;
            while (true) {
                try {
                    int a2 = dVar4.a();
                    int A = gVar2.A(a2);
                    if (A >= 0) {
                        int L = gVar2.L(A);
                        try {
                            int K = K(L);
                            s74 s74 = gVar2.k;
                            switch (K) {
                                case b85.b /*0*/:
                                    int i4 = A;
                                    d dVar5 = dVar4;
                                    int i5 = L;
                                    gVar = gVar2;
                                    z92 z923 = z922;
                                    long x = x(i5);
                                    dVar5.w(1);
                                    try {
                                        Object obj3 = obj2;
                                        dVar2 = dVar;
                                        try {
                                            tt7.c.l(obj3, x, dVar5.a.m());
                                            obj2 = obj3;
                                            gVar.G(i4, obj2);
                                            break;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            obj2 = obj3;
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            obj2 = obj3;
                                            while (i3 < i2) {
                                            }
                                            if (kVar != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        dVar2 = dVar;
                                        break;
                                    }
                                    break;
                                case 1:
                                    int i6 = A;
                                    dVar3 = dVar4;
                                    int i7 = L;
                                    gVar = gVar2;
                                    z92 z924 = z922;
                                    long x2 = x(i7);
                                    dVar3.w(5);
                                    tt7.c.m(obj2, x2, dVar3.a.q());
                                    gVar.G(i6, obj2);
                                    break;
                                case 2:
                                    int i8 = A;
                                    dVar3 = dVar4;
                                    int i9 = L;
                                    gVar = gVar2;
                                    z92 z925 = z922;
                                    long x3 = x(i9);
                                    dVar3.w(0);
                                    tt7.n(obj2, x3, dVar3.a.s());
                                    gVar.G(i8, obj2);
                                    break;
                                case 3:
                                    int i10 = A;
                                    dVar3 = dVar4;
                                    int i11 = L;
                                    gVar = gVar2;
                                    z92 z926 = z922;
                                    long x4 = x(i11);
                                    dVar3.w(0);
                                    tt7.n(obj2, x4, dVar3.a.B());
                                    gVar.G(i10, obj2);
                                    break;
                                case 4:
                                    int i12 = A;
                                    dVar3 = dVar4;
                                    int i13 = L;
                                    gVar = gVar2;
                                    z92 z927 = z922;
                                    long x5 = x(i13);
                                    dVar3.w(0);
                                    tt7.m(dVar3.a.r(), x5, obj2);
                                    gVar.G(i12, obj2);
                                    break;
                                case 5:
                                    int i14 = A;
                                    dVar3 = dVar4;
                                    int i15 = L;
                                    gVar = gVar2;
                                    z92 z928 = z922;
                                    long x6 = x(i15);
                                    dVar3.w(1);
                                    tt7.n(obj2, x6, dVar3.a.p());
                                    gVar.G(i14, obj2);
                                    break;
                                case 6:
                                    int i16 = A;
                                    dVar3 = dVar4;
                                    int i17 = L;
                                    gVar = gVar2;
                                    z92 z929 = z922;
                                    long x7 = x(i17);
                                    dVar3.w(5);
                                    tt7.m(dVar3.a.o(), x7, obj2);
                                    gVar.G(i16, obj2);
                                    break;
                                case 7:
                                    int i18 = A;
                                    dVar3 = dVar4;
                                    int i19 = L;
                                    gVar = gVar2;
                                    z92 z9210 = z922;
                                    long x8 = x(i19);
                                    dVar3.w(0);
                                    tt7.c.j(obj2, x8, dVar3.a.k());
                                    gVar.G(i18, obj2);
                                    break;
                                case 8:
                                    int i20 = A;
                                    dVar3 = dVar4;
                                    int i21 = L;
                                    gVar = gVar2;
                                    z92 z9211 = z922;
                                    gVar.D(i21, dVar3, obj2);
                                    gVar.G(i20, obj2);
                                    break;
                                case 9:
                                    gVar = gVar2;
                                    int i22 = A;
                                    dVar3 = dVar4;
                                    a aVar = (a) gVar.u(i22, obj2);
                                    pg6 m2 = gVar.m(i22);
                                    dVar3.w(2);
                                    dVar3.c(aVar, m2, z922);
                                    gVar.I(obj2, i22, aVar);
                                    break;
                                case 10:
                                    int i23 = A;
                                    dVar3 = dVar4;
                                    int i24 = L;
                                    gVar = gVar2;
                                    z92 z9212 = z922;
                                    tt7.o(obj2, x(i24), dVar3.e());
                                    gVar.G(i23, obj2);
                                    break;
                                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                                    int i25 = A;
                                    dVar3 = dVar4;
                                    int i26 = L;
                                    gVar = gVar2;
                                    z92 z9213 = z922;
                                    long x9 = x(i26);
                                    dVar3.w(0);
                                    tt7.m(dVar3.a.A(), x9, obj2);
                                    gVar.G(i25, obj2);
                                    break;
                                case 12:
                                    int i27 = A;
                                    dVar3 = dVar4;
                                    int i28 = L;
                                    gVar = gVar2;
                                    z92 z9214 = z922;
                                    dVar3.w(0);
                                    int n2 = dVar3.a.n();
                                    gVar.l(i27);
                                    tt7.m(n2, x(i28), obj2);
                                    gVar.G(i27, obj2);
                                    break;
                                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                                    int i29 = A;
                                    dVar3 = dVar4;
                                    int i30 = L;
                                    gVar = gVar2;
                                    z92 z9215 = z922;
                                    long x10 = x(i30);
                                    dVar3.w(5);
                                    tt7.m(dVar3.a.t(), x10, obj2);
                                    gVar.G(i29, obj2);
                                    break;
                                case 14:
                                    int i31 = A;
                                    dVar3 = dVar4;
                                    int i32 = L;
                                    gVar = gVar2;
                                    z92 z9216 = z922;
                                    long x11 = x(i32);
                                    dVar3.w(1);
                                    tt7.n(obj2, x11, dVar3.a.u());
                                    gVar.G(i31, obj2);
                                    break;
                                case h75.g /*15*/:
                                    int i33 = A;
                                    dVar3 = dVar4;
                                    int i34 = L;
                                    gVar = gVar2;
                                    z92 z9217 = z922;
                                    long x12 = x(i34);
                                    dVar3.w(0);
                                    tt7.m(dVar3.a.v(), x12, obj2);
                                    gVar.G(i33, obj2);
                                    break;
                                case 16:
                                    int i35 = A;
                                    dVar3 = dVar4;
                                    int i36 = L;
                                    gVar = gVar2;
                                    z92 z9218 = z922;
                                    long x13 = x(i36);
                                    dVar3.w(0);
                                    tt7.n(obj2, x13, dVar3.a.w());
                                    gVar.G(i35, obj2);
                                    break;
                                case 17:
                                    gVar = gVar2;
                                    int i37 = A;
                                    dVar3 = dVar4;
                                    a aVar2 = (a) gVar.u(i37, obj2);
                                    pg6 m3 = gVar.m(i37);
                                    dVar3.w(3);
                                    dVar3.b(aVar2, m3, z922);
                                    gVar.I(obj2, i37, aVar2);
                                    break;
                                case 18:
                                    dVar3 = dVar4;
                                    int i38 = L;
                                    gVar = gVar2;
                                    z92 z9219 = z922;
                                    long x14 = x(i38);
                                    s74.getClass();
                                    dVar3.g(s74.a(x14, obj2));
                                    break;
                                case 19:
                                    dVar3 = dVar4;
                                    int i39 = L;
                                    gVar = gVar2;
                                    z92 z9220 = z922;
                                    long x15 = x(i39);
                                    s74.getClass();
                                    dVar3.l(s74.a(x15, obj2));
                                    break;
                                case 20:
                                    dVar3 = dVar4;
                                    int i40 = L;
                                    gVar = gVar2;
                                    z92 z9221 = z922;
                                    long x16 = x(i40);
                                    s74.getClass();
                                    dVar3.n(s74.a(x16, obj2));
                                    break;
                                case 21:
                                    dVar3 = dVar4;
                                    int i41 = L;
                                    gVar = gVar2;
                                    z92 z9222 = z922;
                                    long x17 = x(i41);
                                    s74.getClass();
                                    dVar3.u(s74.a(x17, obj2));
                                    break;
                                case 22:
                                    dVar3 = dVar4;
                                    int i42 = L;
                                    gVar = gVar2;
                                    z92 z9223 = z922;
                                    long x18 = x(i42);
                                    s74.getClass();
                                    dVar3.m(s74.a(x18, obj2));
                                    break;
                                case 23:
                                    dVar3 = dVar4;
                                    int i43 = L;
                                    gVar = gVar2;
                                    z92 z9224 = z922;
                                    long x19 = x(i43);
                                    s74.getClass();
                                    dVar3.k(s74.a(x19, obj2));
                                    break;
                                case 24:
                                    dVar3 = dVar4;
                                    int i44 = L;
                                    gVar = gVar2;
                                    z92 z9225 = z922;
                                    long x20 = x(i44);
                                    s74.getClass();
                                    dVar3.j(s74.a(x20, obj2));
                                    break;
                                case 25:
                                    dVar3 = dVar4;
                                    int i45 = L;
                                    gVar = gVar2;
                                    z92 z9226 = z922;
                                    long x21 = x(i45);
                                    s74.getClass();
                                    dVar3.d(s74.a(x21, obj2));
                                    break;
                                case 26:
                                    dVar3 = dVar4;
                                    int i46 = L;
                                    gVar = gVar2;
                                    z92 z9227 = z922;
                                    try {
                                        gVar.E(i46, dVar3, obj2);
                                        break;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        dVar2 = dVar3;
                                        jVar.getClass();
                                        if (kVar == null) {
                                        }
                                        if (!jVar.b(0, dVar2, kVar)) {
                                        }
                                        z922 = z92;
                                        gVar2 = gVar;
                                        dVar4 = dVar2;
                                    }
                                    break;
                                case 27:
                                    try {
                                        pg6 m4 = gVar2.m(A);
                                        int i47 = L;
                                        z92 z9228 = z92;
                                        try {
                                            gVar2.C(obj2, i47, dVar4, m4, z9228);
                                            z92 z9229 = z9228;
                                            gVar = gVar2;
                                            z92 z9230 = z9229;
                                            dVar3 = dVar4;
                                            break;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            z92 z9231 = z9228;
                                            gVar = gVar2;
                                            z92 z9232 = z9231;
                                            dVar2 = dVar4;
                                            jVar.getClass();
                                            if (kVar == null) {
                                            }
                                            if (!jVar.b(0, dVar2, kVar)) {
                                            }
                                            z922 = z92;
                                            gVar2 = gVar;
                                            dVar4 = dVar2;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        gVar = gVar2;
                                        z92 z9233 = z92;
                                        dVar2 = dVar4;
                                        jVar.getClass();
                                        if (kVar == null) {
                                        }
                                        if (!jVar.b(0, dVar2, kVar)) {
                                        }
                                        z922 = z92;
                                        gVar2 = gVar;
                                        dVar4 = dVar2;
                                    }
                                    break;
                                case 28:
                                    long x22 = x(L);
                                    s74.getClass();
                                    dVar4.f(s74.a(x22, obj2));
                                    break;
                                case 29:
                                    long x23 = x(L);
                                    s74.getClass();
                                    dVar4.t(s74.a(x23, obj2));
                                    break;
                                case 30:
                                    int i48 = A;
                                    long x24 = x(L);
                                    s74.getClass();
                                    qf3 a3 = s74.a(x24, obj2);
                                    dVar4.h(a3);
                                    gVar2.l(i48);
                                    i.j(obj2, a2, a3, kVar, jVar);
                                    break;
                                case 31:
                                    long x25 = x(L);
                                    s74.getClass();
                                    dVar4.o(s74.a(x25, obj2));
                                    break;
                                case 32:
                                    long x26 = x(L);
                                    s74.getClass();
                                    dVar4.p(s74.a(x26, obj2));
                                    break;
                                case 33:
                                    long x27 = x(L);
                                    s74.getClass();
                                    dVar4.q(s74.a(x27, obj2));
                                    break;
                                case 34:
                                    long x28 = x(L);
                                    s74.getClass();
                                    dVar4.r(s74.a(x28, obj2));
                                    break;
                                case 35:
                                    long x29 = x(L);
                                    s74.getClass();
                                    dVar4.g(s74.a(x29, obj2));
                                    break;
                                case 36:
                                    long x30 = x(L);
                                    s74.getClass();
                                    dVar4.l(s74.a(x30, obj2));
                                    break;
                                case 37:
                                    long x31 = x(L);
                                    s74.getClass();
                                    dVar4.n(s74.a(x31, obj2));
                                    break;
                                case 38:
                                    long x32 = x(L);
                                    s74.getClass();
                                    dVar4.u(s74.a(x32, obj2));
                                    break;
                                case 39:
                                    long x33 = x(L);
                                    s74.getClass();
                                    dVar4.m(s74.a(x33, obj2));
                                    break;
                                case 40:
                                    long x34 = x(L);
                                    s74.getClass();
                                    dVar4.k(s74.a(x34, obj2));
                                    break;
                                case 41:
                                    long x35 = x(L);
                                    s74.getClass();
                                    dVar4.j(s74.a(x35, obj2));
                                    break;
                                case 42:
                                    long x36 = x(L);
                                    s74.getClass();
                                    dVar4.d(s74.a(x36, obj2));
                                    break;
                                case 43:
                                    long x37 = x(L);
                                    s74.getClass();
                                    dVar4.t(s74.a(x37, obj2));
                                    break;
                                case 44:
                                    int i49 = A;
                                    long x38 = x(L);
                                    s74.getClass();
                                    qf3 a4 = s74.a(x38, obj2);
                                    dVar4.h(a4);
                                    gVar2.l(i49);
                                    i.j(obj2, a2, a4, kVar, jVar);
                                    break;
                                case 45:
                                    long x39 = x(L);
                                    s74.getClass();
                                    dVar4.o(s74.a(x39, obj2));
                                    break;
                                case 46:
                                    long x40 = x(L);
                                    s74.getClass();
                                    dVar4.p(s74.a(x40, obj2));
                                    break;
                                case 47:
                                    long x41 = x(L);
                                    s74.getClass();
                                    dVar4.q(s74.a(x41, obj2));
                                    break;
                                case h75.h /*48*/:
                                    long x42 = x(L);
                                    s74.getClass();
                                    dVar4.r(s74.a(x42, obj2));
                                    break;
                                case 49:
                                    obj2 = obj;
                                    d dVar6 = dVar;
                                    try {
                                        gVar2.B(obj2, x(L), dVar6, gVar2.m(A), z92);
                                        dVar4 = dVar6;
                                        break;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                        gVar = gVar2;
                                        dVar2 = dVar6;
                                        jVar.getClass();
                                        if (kVar == null) {
                                            kVar = jVar.a(obj2);
                                        }
                                        if (!jVar.b(0, dVar2, kVar)) {
                                            while (i3 < i2) {
                                                gVar.k(iArr[i3], obj2, kVar);
                                                i3++;
                                            }
                                            if (kVar == null) {
                                                return;
                                            }
                                            ((e) obj2).unknownFields = kVar;
                                            return;
                                        }
                                        z922 = z92;
                                        gVar2 = gVar;
                                        dVar4 = dVar2;
                                    }
                                case 50:
                                    try {
                                        gVar2.r(obj2, A, gVar2.b[(A / 3) * 2], z922, dVar4);
                                        obj2 = obj;
                                        dVar2 = dVar;
                                        gVar = gVar2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                        obj2 = obj;
                                        dVar2 = dVar;
                                        gVar = gVar2;
                                        jVar.getClass();
                                        if (kVar == null) {
                                        }
                                        if (!jVar.b(0, dVar2, kVar)) {
                                        }
                                        z922 = z92;
                                        gVar2 = gVar;
                                        dVar4 = dVar2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj;
                                        gVar = gVar2;
                                        while (i3 < i2) {
                                        }
                                        if (kVar != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                case 51:
                                    long x43 = x(L);
                                    dVar4.w(1);
                                    tt7.o(obj2, x43, Double.valueOf(dVar4.a.m()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 52:
                                    long x44 = x(L);
                                    dVar4.w(5);
                                    tt7.o(obj2, x44, Float.valueOf(dVar4.a.q()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 53:
                                    long x45 = x(L);
                                    dVar4.w(0);
                                    tt7.o(obj2, x45, Long.valueOf(dVar4.a.s()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 54:
                                    long x46 = x(L);
                                    dVar4.w(0);
                                    tt7.o(obj2, x46, Long.valueOf(dVar4.a.B()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 55:
                                    long x47 = x(L);
                                    dVar4.w(0);
                                    tt7.o(obj2, x47, Integer.valueOf(dVar4.a.r()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 56:
                                    long x48 = x(L);
                                    dVar4.w(1);
                                    tt7.o(obj2, x48, Long.valueOf(dVar4.a.p()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 57:
                                    long x49 = x(L);
                                    dVar4.w(5);
                                    tt7.o(obj2, x49, Integer.valueOf(dVar4.a.o()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 58:
                                    long x50 = x(L);
                                    dVar4.w(0);
                                    tt7.o(obj2, x50, Boolean.valueOf(dVar4.a.k()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 59:
                                    gVar2.D(L, dVar4, obj2);
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 60:
                                    a aVar3 = (a) gVar2.v(a2, A, obj2);
                                    pg6 m5 = gVar2.m(A);
                                    dVar4.w(2);
                                    dVar4.c(aVar3, m5, z922);
                                    gVar2.J(obj2, a2, A, aVar3);
                                    break;
                                case 61:
                                    tt7.o(obj2, x(L), dVar4.e());
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 62:
                                    long x51 = x(L);
                                    dVar4.w(0);
                                    tt7.o(obj2, x51, Integer.valueOf(dVar4.a.A()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 63:
                                    dVar4.w(0);
                                    int n3 = dVar4.a.n();
                                    gVar2.l(A);
                                    tt7.o(obj2, x(L), Integer.valueOf(n3));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 64:
                                    long x52 = x(L);
                                    dVar4.w(5);
                                    tt7.o(obj2, x52, Integer.valueOf(dVar4.a.t()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 65:
                                    long x53 = x(L);
                                    dVar4.w(1);
                                    tt7.o(obj2, x53, Long.valueOf(dVar4.a.u()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 66:
                                    long x54 = x(L);
                                    dVar4.w(0);
                                    tt7.o(obj2, x54, Integer.valueOf(dVar4.a.v()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 67:
                                    long x55 = x(L);
                                    dVar4.w(0);
                                    tt7.o(obj2, x55, Long.valueOf(dVar4.a.w()));
                                    gVar2.H(a2, A, obj2);
                                    break;
                                case 68:
                                    a aVar4 = (a) gVar2.v(a2, A, obj2);
                                    pg6 m6 = gVar2.m(A);
                                    dVar4.w(3);
                                    dVar4.b(aVar4, m6, z922);
                                    gVar2.J(obj2, a2, A, aVar4);
                                    break;
                                default:
                                    if (kVar == null) {
                                        kVar = jVar.a(obj2);
                                    }
                                    if (!jVar.b(0, dVar4, kVar)) {
                                        while (i3 < i2) {
                                            gVar2.k(iArr[i3], obj2, kVar);
                                            i3++;
                                        }
                                        if (kVar == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                            gVar = gVar2;
                            dVar2 = dVar4;
                            jVar.getClass();
                            if (kVar == null) {
                            }
                            if (!jVar.b(0, dVar2, kVar)) {
                            }
                            z922 = z92;
                            gVar2 = gVar;
                            dVar4 = dVar2;
                        }
                    } else if (a2 == Integer.MAX_VALUE) {
                        while (i3 < i2) {
                            gVar2.k(iArr[i3], obj2, kVar);
                            i3++;
                        }
                        if (kVar != null) {
                            ((l) jVar).getClass();
                        } else {
                            return;
                        }
                    } else {
                        jVar.getClass();
                        if (kVar == null) {
                            kVar = jVar.a(obj2);
                        }
                        if (!jVar.b(0, dVar4, kVar)) {
                            while (i3 < i2) {
                                gVar2.k(iArr[i3], obj2, kVar);
                                i3++;
                            }
                            if (kVar == null) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gVar = gVar2;
                    while (i3 < i2) {
                    }
                    if (kVar != null) {
                    }
                    throw th;
                }
            }
            ((e) obj2).unknownFields = kVar;
            return;
        }
        kj6.o("Mutating immutable message: ", obj2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0396, code lost:
        r10 = (r10 * r7) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0398, code lost:
        r9 = r9 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0561, code lost:
        r9 = r9 + (r5 + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0563, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x057e, code lost:
        r0 = r0 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x057f, code lost:
        r9 = r9 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r9 = r9 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x058b, code lost:
        r0 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x058d, code lost:
        r9 = r9 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x058e, code lost:
        r0 = r16;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x059e, code lost:
        r0 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        r10 = r10 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r9 = r9 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        r5 = r5 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        r5 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        r5 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cd, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0201, code lost:
        r9 = r9 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0248, code lost:
        r10 = r10 + r7;
     */
    public final int f(e eVar) {
        int i2;
        int h2;
        int h3;
        int h4;
        int j2;
        int h5;
        int j3;
        int h6;
        int g2;
        int h7;
        int a2;
        int c2;
        int h8;
        int size;
        int i3;
        int h9;
        int i4;
        int i5;
        int size2;
        int h10;
        int i6;
        int i7;
        int i8;
        int h11;
        int g3;
        g gVar = this;
        e eVar2 = eVar;
        Unsafe unsafe = o;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = gVar.a;
            if (i10 < iArr.length) {
                int L = gVar.L(i10);
                int K = K(L);
                int i13 = iArr[i10];
                int i14 = iArr[i10 + 2];
                int i15 = i14 & 1048575;
                if (K <= 17) {
                    if (i15 != i9) {
                        if (i15 == 1048575) {
                            i11 = 0;
                        } else {
                            i11 = unsafe.getInt(eVar2, (long) i15);
                        }
                        i9 = i15;
                    }
                    i2 = 1 << (i14 >>> 20);
                } else {
                    i2 = 0;
                }
                long j4 = (long) (L & 1048575);
                if (K >= sc2.DOUBLE_LIST_PACKED.w) {
                    int i16 = sc2.SINT64_LIST_PACKED.w;
                }
                switch (K) {
                    case b85.b /*0*/:
                        if (!gVar.o(eVar2, i10, i9, i11, i2)) {
                            break;
                        } else {
                            h2 = ws0.h(i13);
                            break;
                        }
                    case 1:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            h3 = ws0.h(i13);
                            break;
                        }
                        break;
                    case 2:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            long j5 = unsafe.getLong(eVar2, j4);
                            h4 = ws0.h(i13);
                            j2 = ws0.j(j5);
                        }
                        break;
                    case 3:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            long j6 = unsafe.getLong(eVar2, j4);
                            h4 = ws0.h(i13);
                            j2 = ws0.j(j6);
                        }
                        break;
                    case 4:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            int i17 = unsafe.getInt(eVar2, j4);
                            h5 = ws0.h(i13);
                            j3 = ws0.j((long) i17);
                            break;
                        }
                        break;
                    case 5:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            h6 = ws0.h(i13);
                            break;
                        }
                        break;
                    case 6:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            h3 = ws0.h(i13);
                            break;
                        }
                        break;
                    case 7:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            int h12 = ws0.h(i13) + 1;
                        }
                        break;
                    case 8:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            Object object = unsafe.getObject(eVar2, j4);
                            if (object instanceof zf0) {
                                g2 = ws0.f(i13, (zf0) object);
                            } else {
                                g2 = ws0.g((String) object) + ws0.h(i13);
                            }
                            i12 = g2 + i12;
                            break;
                        }
                        break;
                    case 9:
                        if (!gVar.o(eVar2, i10, i9, i11, i2)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(eVar2, j4);
                            pg6 m2 = gVar.m(i10);
                            Class cls = i.a;
                            int h13 = ws0.h(i13);
                            int a3 = ((a) object2).a(m2);
                            i12 += ws0.i(a3) + a3 + h13;
                            break;
                        }
                    case 10:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            int f2 = ws0.f(i13, (zf0) unsafe.getObject(eVar2, j4));
                        }
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            int i18 = unsafe.getInt(eVar2, j4);
                            h5 = ws0.h(i13);
                            j3 = ws0.i(i18);
                            break;
                        }
                        break;
                    case 12:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            int i19 = unsafe.getInt(eVar2, j4);
                            h5 = ws0.h(i13);
                            j3 = ws0.j((long) i19);
                            break;
                        }
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            h3 = ws0.h(i13);
                            break;
                        }
                        break;
                    case 14:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            h6 = ws0.h(i13);
                            break;
                        }
                        break;
                    case h75.g /*15*/:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            int i20 = unsafe.getInt(eVar2, j4);
                            h5 = ws0.h(i13);
                            j3 = ws0.i((i20 >> 31) ^ (i20 << 1));
                            break;
                        }
                        break;
                    case 16:
                        if (gVar.o(eVar2, i10, i9, i11, i2)) {
                            long j7 = unsafe.getLong(eVar2, j4);
                            h4 = ws0.h(i13);
                            j2 = ws0.j((j7 << 1) ^ (j7 >> 63));
                        }
                        break;
                    case 17:
                        if (!gVar.o(eVar2, i10, i9, i11, i2)) {
                            break;
                        } else {
                            pg6 m3 = gVar.m(i10);
                            h7 = ws0.h(i13) * 2;
                            a2 = ((a) unsafe.getObject(eVar2, j4)).a(m3);
                            break;
                        }
                    case 18:
                        c2 = i.c(i13, (List) unsafe.getObject(eVar2, j4));
                    case 19:
                        c2 = i.b(i13, (List) unsafe.getObject(eVar2, j4));
                    case 20:
                        List list = (List) unsafe.getObject(eVar2, j4);
                        Class cls2 = i.a;
                        if (list.size() != 0) {
                            h8 = (ws0.h(i13) * list.size()) + i.e(list);
                            break;
                        }
                    case 21:
                        List list2 = (List) unsafe.getObject(eVar2, j4);
                        Class cls3 = i.a;
                        size = list2.size();
                        if (size != 0) {
                            i3 = i.i(list2);
                            h9 = ws0.h(i13);
                            break;
                        }
                        h8 = 0;
                        break;
                    case 22:
                        List list3 = (List) unsafe.getObject(eVar2, j4);
                        Class cls4 = i.a;
                        size = list3.size();
                        if (size != 0) {
                            i3 = i.d(list3);
                            h9 = ws0.h(i13);
                            break;
                        }
                        h8 = 0;
                        break;
                    case 23:
                        c2 = i.c(i13, (List) unsafe.getObject(eVar2, j4));
                    case 24:
                        c2 = i.b(i13, (List) unsafe.getObject(eVar2, j4));
                    case 25:
                        Class cls5 = i.a;
                        int size3 = ((List) unsafe.getObject(eVar2, j4)).size();
                        if (size3 == 0) {
                            i4 = 0;
                        } else {
                            i4 = (ws0.h(i13) + 1) * size3;
                        }
                        i12 += i4;
                        break;
                    case 26:
                        List list4 = (List) unsafe.getObject(eVar2, j4);
                        Class cls6 = i.a;
                        int size4 = list4.size();
                        if (size4 != 0) {
                            int h14 = ws0.h(i13) * size4;
                            for (int i21 = 0; i21 < size4; i21++) {
                                Object obj = list4.get(i21);
                                if (obj instanceof zf0) {
                                    int size5 = ((zf0) obj).size();
                                    h14 = ws0.i(size5) + size5 + h8;
                                } else {
                                    h14 = ws0.g((String) obj) + h8;
                                }
                            }
                            break;
                        }
                    case 27:
                        List list5 = (List) unsafe.getObject(eVar2, j4);
                        pg6 m4 = gVar.m(i10);
                        Class cls7 = i.a;
                        int size6 = list5.size();
                        if (size6 != 0) {
                            int h15 = ws0.h(i13) * size6;
                            for (int i22 = 0; i22 < size6; i22++) {
                                int a4 = ((a) list5.get(i22)).a(m4);
                                h15 = i5 + ws0.i(a4) + a4;
                            }
                            break;
                        }
                    case 28:
                        List list6 = (List) unsafe.getObject(eVar2, j4);
                        Class cls8 = i.a;
                        int size7 = list6.size();
                        if (size7 != 0) {
                            h8 = ws0.h(i13) * size7;
                            for (int i23 = 0; i23 < list6.size(); i23++) {
                                int size8 = ((zf0) list6.get(i23)).size();
                                h8 += ws0.i(size8) + size8;
                            }
                            break;
                        }
                    case 29:
                        List list7 = (List) unsafe.getObject(eVar2, j4);
                        Class cls9 = i.a;
                        size = list7.size();
                        if (size != 0) {
                            i3 = i.h(list7);
                            h9 = ws0.h(i13);
                            break;
                        }
                        h8 = 0;
                        break;
                    case 30:
                        List list8 = (List) unsafe.getObject(eVar2, j4);
                        Class cls10 = i.a;
                        size = list8.size();
                        if (size != 0) {
                            i3 = i.a(list8);
                            h9 = ws0.h(i13);
                            break;
                        }
                        h8 = 0;
                        break;
                    case 31:
                        c2 = i.b(i13, (List) unsafe.getObject(eVar2, j4));
                    case 32:
                        c2 = i.c(i13, (List) unsafe.getObject(eVar2, j4));
                    case 33:
                        List list9 = (List) unsafe.getObject(eVar2, j4);
                        Class cls11 = i.a;
                        size = list9.size();
                        if (size != 0) {
                            i3 = i.f(list9);
                            h9 = ws0.h(i13);
                            break;
                        }
                        h8 = 0;
                        break;
                    case 34:
                        List list10 = (List) unsafe.getObject(eVar2, j4);
                        Class cls12 = i.a;
                        size = list10.size();
                        if (size != 0) {
                            i3 = i.g(list10);
                            h9 = ws0.h(i13);
                            break;
                        }
                        h8 = 0;
                        break;
                    case 35:
                        Class cls13 = i.a;
                        size2 = ((List) unsafe.getObject(eVar2, j4)).size() * 8;
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 36:
                        Class cls14 = i.a;
                        size2 = ((List) unsafe.getObject(eVar2, j4)).size() * 4;
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 37:
                        size2 = i.e((List) unsafe.getObject(eVar2, j4));
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 38:
                        size2 = i.i((List) unsafe.getObject(eVar2, j4));
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 39:
                        size2 = i.d((List) unsafe.getObject(eVar2, j4));
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 40:
                        Class cls15 = i.a;
                        size2 = ((List) unsafe.getObject(eVar2, j4)).size() * 8;
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 41:
                        Class cls16 = i.a;
                        size2 = ((List) unsafe.getObject(eVar2, j4)).size() * 4;
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 42:
                        Class cls17 = i.a;
                        size2 = ((List) unsafe.getObject(eVar2, j4)).size();
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 43:
                        size2 = i.h((List) unsafe.getObject(eVar2, j4));
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 44:
                        size2 = i.a((List) unsafe.getObject(eVar2, j4));
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 45:
                        Class cls18 = i.a;
                        size2 = ((List) unsafe.getObject(eVar2, j4)).size() * 4;
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 46:
                        Class cls19 = i.a;
                        size2 = ((List) unsafe.getObject(eVar2, j4)).size() * 8;
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 47:
                        size2 = i.f((List) unsafe.getObject(eVar2, j4));
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case h75.h /*48*/:
                        size2 = i.g((List) unsafe.getObject(eVar2, j4));
                        if (size2 <= 0) {
                            break;
                        } else {
                            h10 = ws0.h(i13);
                            i6 = ws0.i(size2);
                            break;
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(eVar2, j4);
                        pg6 m5 = gVar.m(i10);
                        Class cls20 = i.a;
                        int size9 = list11.size();
                        if (size9 == 0) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                            for (int i24 = 0; i24 < size9; i24++) {
                                i8 += ((a) list11.get(i24)).a(m5) + (ws0.h(i13) * 2);
                            }
                        }
                        i12 += i8;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(eVar2, j4);
                        Object obj2 = gVar.b[(i10 / 3) * 2];
                        gVar.m.getClass();
                        jf4 jf4 = (jf4) object3;
                        ef4 ef4 = (ef4) obj2;
                        if (!jf4.isEmpty()) {
                            i5 = 0;
                            for (Map.Entry entry : jf4.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                ef4.getClass();
                                int h16 = ws0.h(i13);
                                int a5 = ef4.a(ef4.a, key, value);
                                i5 += ws0.i(a5) + a5 + h16;
                            }
                            break;
                        }
                    case 51:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            h2 = ws0.h(i13);
                            break;
                        }
                    case 52:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            h11 = ws0.h(i13);
                            break;
                        }
                    case 53:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            long z = z(j4, eVar2);
                            size2 = ws0.h(i13);
                            i7 = ws0.j(z);
                            break;
                        }
                    case 54:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            long z2 = z(j4, eVar2);
                            size2 = ws0.h(i13);
                            i7 = ws0.j(z2);
                            break;
                        }
                    case 55:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            int y = y(j4, eVar2);
                            h7 = ws0.h(i13);
                            a2 = ws0.j((long) y);
                            break;
                        }
                    case 56:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            h2 = ws0.h(i13);
                            break;
                        }
                    case 57:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            h11 = ws0.h(i13);
                            break;
                        }
                    case 58:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            c2 = ws0.h(i13) + 1;
                        }
                    case 59:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            Object object4 = unsafe.getObject(eVar2, j4);
                            if (object4 instanceof zf0) {
                                g3 = ws0.f(i13, (zf0) object4);
                            } else {
                                g3 = ws0.g((String) object4) + ws0.h(i13);
                            }
                            i12 = g3 + i12;
                            break;
                        }
                    case 60:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            Object object5 = unsafe.getObject(eVar2, j4);
                            pg6 m6 = gVar.m(i10);
                            Class cls21 = i.a;
                            int h17 = ws0.h(i13);
                            int a6 = ((a) object5).a(m6);
                            int i25 = ws0.i(a6) + a6 + h17;
                        }
                    case 61:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            c2 = ws0.f(i13, (zf0) unsafe.getObject(eVar2, j4));
                        }
                    case 62:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            int y2 = y(j4, eVar2);
                            h7 = ws0.h(i13);
                            a2 = ws0.i(y2);
                            break;
                        }
                    case 63:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            int y3 = y(j4, eVar2);
                            h7 = ws0.h(i13);
                            a2 = ws0.j((long) y3);
                            break;
                        }
                    case 64:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            h11 = ws0.h(i13);
                            break;
                        }
                    case 65:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            h2 = ws0.h(i13);
                            break;
                        }
                    case 66:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            int y4 = y(j4, eVar2);
                            h7 = ws0.h(i13);
                            a2 = ws0.i((y4 >> 31) ^ (y4 << 1));
                            break;
                        }
                    case 67:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            long z3 = z(j4, eVar2);
                            size2 = ws0.h(i13);
                            i7 = ws0.j((z3 << 1) ^ (z3 >> 63));
                            break;
                        }
                    case 68:
                        if (!gVar.q(i13, i10, eVar2)) {
                            break;
                        } else {
                            c2 = ((a) unsafe.getObject(eVar2, j4)).a(gVar.m(i10)) + (ws0.h(i13) * 2);
                        }
                }
            } else {
                ((l) gVar.l).getClass();
                return eVar2.unknownFields.b() + i12;
            }
            i10 += 3;
        }
    }

    public final void g(Object obj, ji8 ji8) {
        ji8.getClass();
        M(obj, ji8);
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
    public final int h(e eVar) {
        int i2;
        int b2;
        int i3;
        int[] iArr = this.a;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int L = L(i4);
            int i6 = iArr[i4];
            long j2 = (long) (1048575 & L);
            int i7 = 1237;
            int i8 = 37;
            switch (K(L)) {
                case b85.b /*0*/:
                    i2 = i5 * 53;
                    b2 = tf3.b(Double.doubleToLongBits(tt7.c.d(j2, eVar)));
                case 1:
                    i2 = i5 * 53;
                    b2 = Float.floatToIntBits(tt7.c.e(j2, eVar));
                case 2:
                    i2 = i5 * 53;
                    b2 = tf3.b(tt7.c.g(j2, eVar));
                case 3:
                    i2 = i5 * 53;
                    b2 = tf3.b(tt7.c.g(j2, eVar));
                case 4:
                    i2 = i5 * 53;
                    b2 = tt7.c.f(j2, eVar);
                case 5:
                    i2 = i5 * 53;
                    b2 = tf3.b(tt7.c.g(j2, eVar));
                case 6:
                    i2 = i5 * 53;
                    b2 = tt7.c.f(j2, eVar);
                case 7:
                    i3 = i5 * 53;
                    boolean c2 = tt7.c.c(j2, eVar);
                    Charset charset = tf3.a;
                    break;
                case 8:
                    i2 = i5 * 53;
                    b2 = ((String) tt7.c.h(j2, eVar)).hashCode();
                case 9:
                    Object h2 = tt7.c.h(j2, eVar);
                    if (h2 != null) {
                        i8 = h2.hashCode();
                        break;
                    }
                    break;
                case 10:
                    i2 = i5 * 53;
                    b2 = tt7.c.h(j2, eVar).hashCode();
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    i2 = i5 * 53;
                    b2 = tt7.c.f(j2, eVar);
                case 12:
                    i2 = i5 * 53;
                    b2 = tt7.c.f(j2, eVar);
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    i2 = i5 * 53;
                    b2 = tt7.c.f(j2, eVar);
                case 14:
                    i2 = i5 * 53;
                    b2 = tf3.b(tt7.c.g(j2, eVar));
                case h75.g /*15*/:
                    i2 = i5 * 53;
                    b2 = tt7.c.f(j2, eVar);
                case 16:
                    i2 = i5 * 53;
                    b2 = tf3.b(tt7.c.g(j2, eVar));
                case 17:
                    Object h3 = tt7.c.h(j2, eVar);
                    if (h3 != null) {
                        i8 = h3.hashCode();
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
                    b2 = tt7.c.h(j2, eVar).hashCode();
                case 50:
                    i2 = i5 * 53;
                    b2 = tt7.c.h(j2, eVar).hashCode();
                case 51:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tf3.b(Double.doubleToLongBits(((Double) tt7.c.h(j2, eVar)).doubleValue()));
                    }
                case 52:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = Float.floatToIntBits(((Float) tt7.c.h(j2, eVar)).floatValue());
                    }
                case 53:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tf3.b(z(j2, eVar));
                    }
                case 54:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tf3.b(z(j2, eVar));
                    }
                case 55:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = y(j2, eVar);
                    }
                case 56:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tf3.b(z(j2, eVar));
                    }
                case 57:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = y(j2, eVar);
                    }
                case 58:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        boolean booleanValue = ((Boolean) tt7.c.h(j2, eVar)).booleanValue();
                        Charset charset2 = tf3.a;
                        break;
                    }
                case 59:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = ((String) tt7.c.h(j2, eVar)).hashCode();
                    }
                case 60:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tt7.c.h(j2, eVar).hashCode();
                    }
                case 61:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tt7.c.h(j2, eVar).hashCode();
                    }
                case 62:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = y(j2, eVar);
                    }
                case 63:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = y(j2, eVar);
                    }
                case 64:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = y(j2, eVar);
                    }
                case 65:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tf3.b(z(j2, eVar));
                    }
                case 66:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = y(j2, eVar);
                    }
                case 67:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tf3.b(z(j2, eVar));
                    }
                case 68:
                    if (!q(i6, i4, eVar)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        b2 = tt7.c.h(j2, eVar).hashCode();
                    }
            }
        }
        ((l) this.l).getClass();
        return eVar.unknownFields.hashCode() + (i5 * 53);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (androidx.datastore.preferences.protobuf.i.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (androidx.datastore.preferences.protobuf.i.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        if (androidx.datastore.preferences.protobuf.i.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        if (androidx.datastore.preferences.protobuf.i.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018a, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019f, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (androidx.datastore.preferences.protobuf.i.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r4 = false;
     */
    public final boolean i(e eVar, e eVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                int L = L(i2);
                long j2 = (long) (L & 1048575);
                switch (K(L)) {
                    case b85.b /*0*/:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt7 = tt7.c;
                            break;
                        }
                    case 1:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt72 = tt7.c;
                            break;
                        }
                    case 2:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt73 = tt7.c;
                            break;
                        }
                    case 3:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt74 = tt7.c;
                            break;
                        }
                    case 4:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt75 = tt7.c;
                            break;
                        }
                    case 5:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt76 = tt7.c;
                            break;
                        }
                    case 6:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt77 = tt7.c;
                            break;
                        }
                    case 7:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt78 = tt7.c;
                            break;
                        }
                    case 8:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt79 = tt7.c;
                            break;
                        }
                    case 9:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt710 = tt7.c;
                            break;
                        }
                    case 10:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt711 = tt7.c;
                            break;
                        }
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt712 = tt7.c;
                            break;
                        }
                    case 12:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt713 = tt7.c;
                            break;
                        }
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt714 = tt7.c;
                            break;
                        }
                    case 14:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt715 = tt7.c;
                            break;
                        }
                    case h75.g /*15*/:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt716 = tt7.c;
                            break;
                        }
                    case 16:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt717 = tt7.c;
                            break;
                        }
                    case 17:
                        if (j(eVar, eVar2, i2)) {
                            rt7 rt718 = tt7.c;
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
                        rt7 rt719 = tt7.c;
                        z = i.l(rt719.h(j2, eVar), rt719.h(j2, eVar2));
                        break;
                    case 50:
                        rt7 rt720 = tt7.c;
                        z = i.l(rt720.h(j2, eVar), rt720.h(j2, eVar2));
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
                        rt7 rt721 = tt7.c;
                        if (rt721.f(j3, eVar) == rt721.f(j3, eVar2)) {
                            break;
                        }
                }
                if (z) {
                    i2 += 3;
                }
            } else {
                l lVar = (l) this.l;
                lVar.getClass();
                k kVar = eVar.unknownFields;
                lVar.getClass();
                if (!kVar.equals(eVar2.unknownFields)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean j(e eVar, e eVar2, int i2) {
        if (n(i2, eVar) == n(i2, eVar2)) {
            return true;
        }
        return false;
    }

    public final void k(int i2, Object obj, Object obj2) {
        int i3 = this.a[i2];
        if (tt7.c.h((long) (L(i2) & 1048575), obj) != null) {
            l(i2);
        }
    }

    public final void l(int i2) {
        if (this.b[((i2 / 3) * 2) + 1] != null) {
            ku4.a();
        }
    }

    public final pg6 m(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.b;
        pg6 pg6 = (pg6) objArr[i3];
        if (pg6 != null) {
            return pg6;
        }
        pg6 a2 = bu5.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a2;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110 A[RETURN] */
    public final boolean n(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 == 1048575) {
            int L = L(i2);
            long j3 = (long) (L & 1048575);
            switch (K(L)) {
                case b85.b /*0*/:
                    if (Double.doubleToRawLongBits(tt7.c.d(j3, obj)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(tt7.c.e(j3, obj)) != 0) {
                    }
                    break;
                case 2:
                    if (tt7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 3:
                    if (tt7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 4:
                    if (tt7.c.f(j3, obj) != 0) {
                    }
                    break;
                case 5:
                    if (tt7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 6:
                    if (tt7.c.f(j3, obj) != 0) {
                    }
                    break;
                case 7:
                    return tt7.c.c(j3, obj);
                case 8:
                    Object h2 = tt7.c.h(j3, obj);
                    if (h2 instanceof String) {
                        return !((String) h2).isEmpty();
                    }
                    if (h2 instanceof zf0) {
                        return !zf0.y.equals(h2);
                    }
                    ku4.v();
                    return false;
                case 9:
                    if (tt7.c.h(j3, obj) != null) {
                    }
                    break;
                case 10:
                    return !zf0.y.equals(tt7.c.h(j3, obj));
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    if (tt7.c.f(j3, obj) != 0) {
                    }
                    break;
                case 12:
                    if (tt7.c.f(j3, obj) != 0) {
                    }
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    if (tt7.c.f(j3, obj) != 0) {
                    }
                    break;
                case 14:
                    if (tt7.c.g(j3, obj) != 0) {
                    }
                    break;
                case h75.g /*15*/:
                    if (tt7.c.f(j3, obj) != 0) {
                    }
                    break;
                case 16:
                    if (tt7.c.g(j3, obj) != 0) {
                    }
                    break;
                case 17:
                    if (tt7.c.h(j3, obj) != null) {
                    }
                    break;
                default:
                    ku4.v();
                    return false;
            }
        } else if (((1 << (i3 >>> 20)) & tt7.c.f(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return n(i2, obj);
        }
        if ((i4 & i5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i2, int i3, Object obj) {
        if (tt7.c.f((long) (this.a[i3 + 2] & 1048575), obj) == i2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r12.x() != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        throw new java.io.IOException(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
    public final void r(Object obj, int i2, Object obj2, z92 z92, d dVar) {
        long L = (long) (L(i2) & 1048575);
        Object h2 = tt7.c.h(L, obj);
        lf4 lf4 = this.m;
        if (h2 == null) {
            lf4.getClass();
            h2 = jf4.x.b();
            tt7.o(obj, L, h2);
        } else {
            lf4.getClass();
            if (!((jf4) h2).w) {
                Object b2 = jf4.x.b();
                lf4.a(b2, h2);
                tt7.o(obj, L, b2);
                h2 = b2;
            }
        }
        lf4.getClass();
        jf4 jf4 = (jf4) h2;
        cf4 cf4 = ((ef4) obj2).a;
        dVar.w(2);
        us0 us0 = dVar.a;
        int j2 = us0.j(us0.A());
        Object obj3 = cf4.z;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a2 = dVar.a();
                if (a2 == Integer.MAX_VALUE || us0.c()) {
                    jf4.put(obj4, obj5);
                } else {
                    String str = "Unable to parse map entry.";
                    if (a2 == 1) {
                        obj4 = dVar.i((sc8) cf4.x, (Class) null, (z92) null);
                    } else if (a2 == 2) {
                        obj5 = dVar.i((sc8) cf4.y, obj3.getClass(), z92);
                    } else if (!dVar.x()) {
                        throw new IOException(str);
                    }
                }
            } catch (Throwable th) {
                us0.h(j2);
                throw th;
            }
        }
        jf4.put(obj4, obj5);
        us0.h(j2);
    }

    public final void s(int i2, Object obj, Object obj2) {
        if (n(i2, obj2)) {
            long L = (long) (L(i2) & 1048575);
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object != null) {
                pg6 m2 = m(i2);
                if (!n(i2, obj)) {
                    if (!p(object)) {
                        unsafe.putObject(obj, L, object);
                    } else {
                        e d2 = m2.d();
                        m2.a(d2, object);
                        unsafe.putObject(obj, L, d2);
                    }
                    G(i2, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, L);
                if (!p(object2)) {
                    e d3 = m2.d();
                    m2.a(d3, object2);
                    unsafe.putObject(obj, L, d3);
                    object2 = d3;
                }
                m2.a(object2, object);
                return;
            }
            kj6.j("Source subfield ", this.a[i2], " is present but null: ", obj2);
        }
    }

    public final void t(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (q(i3, i2, obj2)) {
            long L = (long) (L(i2) & 1048575);
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object != null) {
                pg6 m2 = m(i2);
                if (!q(i3, i2, obj)) {
                    if (!p(object)) {
                        unsafe.putObject(obj, L, object);
                    } else {
                        e d2 = m2.d();
                        m2.a(d2, object);
                        unsafe.putObject(obj, L, d2);
                    }
                    H(i3, i2, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, L);
                if (!p(object2)) {
                    e d3 = m2.d();
                    m2.a(d3, object2);
                    unsafe.putObject(obj, L, d3);
                    object2 = d3;
                }
                m2.a(object2, object);
                return;
            }
            kj6.j("Source subfield ", iArr[i2], " is present but null: ", obj2);
        }
    }

    public final Object u(int i2, Object obj) {
        pg6 m2 = m(i2);
        long L = (long) (L(i2) & 1048575);
        if (!n(i2, obj)) {
            return m2.d();
        }
        Object object = o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        e d2 = m2.d();
        if (object != null) {
            m2.a(d2, object);
        }
        return d2;
    }

    public final Object v(int i2, int i3, Object obj) {
        pg6 m2 = m(i3);
        if (!q(i2, i3, obj)) {
            return m2.d();
        }
        Object object = o.getObject(obj, (long) (L(i3) & 1048575));
        if (p(object)) {
            return object;
        }
        e d2 = m2.d();
        if (object != null) {
            m2.a(d2, object);
        }
        return d2;
    }
}
