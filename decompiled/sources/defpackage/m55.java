package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: m55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class m55 implements rw5 {
    public static float d(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = (float) i;
        float f4 = f3 / ((float) i2);
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f7 = ((float) iArr2[i4]) * f4;
            float f8 = (float) i5;
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }

    public static void e(int i, i90 i90, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i3 = i90.x;
        if (i < i3) {
            boolean z = !i90.a(i);
            while (i < i3) {
                if (i90.a(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != i3) {
                throw NotFoundException.y;
            }
            return;
        }
        throw NotFoundException.y;
    }

    public static void f(int i, i90 i90, int[] iArr) {
        int length = iArr.length;
        boolean a = i90.a(i);
        while (i > 0 && length >= 0) {
            i--;
            if (i90.a(i) != a) {
                length--;
                a = !a;
            }
        }
        if (length < 0) {
            e(i + 1, i90, iArr);
            return;
        }
        throw NotFoundException.y;
    }

    public n66 a(qc3 qc3, Map map) {
        try {
            return c(qc3, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(fk1.z) || !((vg2) ((am6) qc3.x).x).i()) {
                throw e;
            }
            vg2 j = ((vg2) ((am6) qc3.x).x).j();
            n66 c = c(new qc3(18, (Object) new am6(j)), map);
            Map map2 = c.e;
            q66 q66 = q66.w;
            int i = 270;
            if (map2 != null && map2.containsKey(q66)) {
                i = (((Integer) map2.get(q66)).intValue() + 270) % 360;
            }
            c.b(q66, Integer.valueOf(i));
            r66[] r66Arr = c.c;
            if (r66Arr != null) {
                int i2 = j.c;
                for (int i3 = 0; i3 < r66Arr.length; i3++) {
                    r66 r66 = r66Arr[i3];
                    r66Arr[i3] = new r66((((float) i2) - r66.b) - 1.0f, r66.a);
                }
            }
            return c;
        }
    }

    public abstract n66 b(int i, i90 i90, Map map);

    public final n66 c(qc3 qc3, Map map) {
        boolean z;
        int i;
        int i2;
        Map map2;
        int i3;
        qc3 qc32 = qc3;
        EnumMap enumMap = map;
        vg2 vg2 = (vg2) ((am6) qc32.x).x;
        int i4 = vg2.b;
        int i5 = vg2.c;
        i90 i90 = new i90(i4);
        int i6 = 1;
        if (enumMap == null || !enumMap.containsKey(fk1.z)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 8;
        } else {
            i = 5;
        }
        int max = Math.max(1, i5 >> i);
        if (z) {
            i2 = i5;
        } else {
            i2 = 15;
        }
        int i7 = i5 / 2;
        int i8 = 0;
        while (i8 < i2) {
            int i9 = i8 + 1;
            int i10 = i9 / 2;
            if ((i8 & 1) != 0) {
                i10 = -i10;
            }
            int i11 = (i10 * max) + i7;
            if (i11 < 0 || i11 >= i5) {
                break;
            }
            try {
                i90 = qc32.z(i90, i11);
                int i12 = 0;
                while (i12 < 2) {
                    if (i12 == i6) {
                        i90.e();
                        if (enumMap != null) {
                            fk1 fk1 = fk1.F;
                            if (enumMap.containsKey(fk1)) {
                                EnumMap enumMap2 = new EnumMap(fk1.class);
                                enumMap2.putAll(enumMap);
                                enumMap2.remove(fk1);
                                enumMap = enumMap2;
                            }
                        }
                    }
                    try {
                        n66 b = b(i11, i90, enumMap);
                        if (i12 == i6) {
                            try {
                                b.b(q66.w, 180);
                                r66[] r66Arr = b.c;
                                if (r66Arr != null) {
                                    i3 = i6;
                                    float f = (float) i4;
                                    try {
                                        r66 r66 = r66Arr[0];
                                        map2 = enumMap;
                                        try {
                                            r66Arr[0] = new r66((f - r66.a) - 1.0f, r66.b);
                                            r66 r662 = r66Arr[i3];
                                            r66Arr[i3] = new r66((f - r662.a) - 1.0f, r662.b);
                                        } catch (ReaderException unused) {
                                            continue;
                                        }
                                    } catch (ReaderException unused2) {
                                        map2 = enumMap;
                                        i12++;
                                        qc3 qc33 = qc3;
                                        enumMap = map2;
                                        i6 = i3;
                                    }
                                }
                            } catch (ReaderException unused3) {
                                map2 = enumMap;
                                i3 = i6;
                                i12++;
                                qc3 qc332 = qc3;
                                enumMap = map2;
                                i6 = i3;
                            }
                        }
                        return b;
                    } catch (ReaderException unused4) {
                        map2 = enumMap;
                        i3 = i6;
                        i12++;
                        qc3 qc3322 = qc3;
                        enumMap = map2;
                        i6 = i3;
                    }
                }
                continue;
            } catch (NotFoundException unused5) {
            }
            qc32 = qc3;
            i8 = i9;
            i6 = i6;
        }
        throw NotFoundException.y;
    }

    public void reset() {
    }
}
