package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: qs  reason: default package */
public abstract class qs extends bb0 {
    public static al6 E0(Object[] objArr) {
        if (objArr.length == 0) {
            return f42.a;
        }
        return new ts(0, objArr);
    }

    public static boolean F0(Object obj, Object[] objArr) {
        objArr.getClass();
        if (c1(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean G0(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (i == iArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean H0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (!(objArr == null || objArr2 == null || objArr.length != objArr2.length)) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object[] objArr3 = objArr[i];
                Object[] objArr4 = objArr2[i];
                if (objArr3 != objArr4) {
                    if (!(objArr3 == null || objArr4 == null)) {
                        if (!(objArr3 instanceof Object[]) || !(objArr4 instanceof Object[])) {
                            if (!(objArr3 instanceof byte[]) || !(objArr4 instanceof byte[])) {
                                if (!(objArr3 instanceof short[]) || !(objArr4 instanceof short[])) {
                                    if (!(objArr3 instanceof int[]) || !(objArr4 instanceof int[])) {
                                        if (!(objArr3 instanceof long[]) || !(objArr4 instanceof long[])) {
                                            if (!(objArr3 instanceof float[]) || !(objArr4 instanceof float[])) {
                                                if (!(objArr3 instanceof double[]) || !(objArr4 instanceof double[])) {
                                                    if (!(objArr3 instanceof char[]) || !(objArr4 instanceof char[])) {
                                                        if (!(objArr3 instanceof boolean[]) || !(objArr4 instanceof boolean[])) {
                                                            if (!(objArr3 instanceof gr7) || !(objArr4 instanceof gr7)) {
                                                                if (!(objArr3 instanceof cs7) || !(objArr4 instanceof cs7)) {
                                                                    if (!(objArr3 instanceof mr7) || !(objArr4 instanceof mr7)) {
                                                                        if (!(objArr3 instanceof rr7) || !(objArr4 instanceof rr7)) {
                                                                            if (!objArr3.equals(objArr4)) {
                                                                            }
                                                                        } else if (!Arrays.equals(((rr7) objArr3).w, ((rr7) objArr4).w)) {
                                                                        }
                                                                    } else if (!Arrays.equals(((mr7) objArr3).w, ((mr7) objArr4).w)) {
                                                                    }
                                                                } else if (!Arrays.equals(((cs7) objArr3).w, ((cs7) objArr4).w)) {
                                                                }
                                                            } else if (!Arrays.equals(((gr7) objArr3).w, ((gr7) objArr4).w)) {
                                                            }
                                                        } else if (!Arrays.equals((boolean[]) objArr3, (boolean[]) objArr4)) {
                                                        }
                                                    } else if (!Arrays.equals((char[]) objArr3, (char[]) objArr4)) {
                                                    }
                                                } else if (!Arrays.equals((double[]) objArr3, (double[]) objArr4)) {
                                                }
                                            } else if (!Arrays.equals((float[]) objArr3, (float[]) objArr4)) {
                                            }
                                        } else if (!Arrays.equals((long[]) objArr3, (long[]) objArr4)) {
                                        }
                                    } else if (!Arrays.equals((int[]) objArr3, (int[]) objArr4)) {
                                    }
                                } else if (!Arrays.equals((short[]) objArr3, (short[]) objArr4)) {
                                }
                            } else if (!Arrays.equals((byte[]) objArr3, (byte[]) objArr4)) {
                            }
                        } else if (!H0(objArr3, objArr4)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void I0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void J0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void K0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void L0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void M0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        J0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void N0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        K0(0, i, i2, objArr, objArr2);
    }

    public static /* synthetic */ void O0(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        I0(i, i2, i3, bArr, bArr2);
    }

    public static byte[] P0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        bb0.a0(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] Q0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        bb0.a0(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static List R0(int i, Object[] objArr) {
        objArr.getClass();
        if (i >= 0) {
            int length = objArr.length - i;
            if (length < 0) {
                length = 0;
            }
            if (length < 0) {
                h.j(pb4.i(length, "Requested element count ", " is less than zero."));
                return null;
            } else if (length == 0) {
                return a42.w;
            } else {
                int length2 = objArr.length;
                if (length >= length2) {
                    return p1(objArr);
                }
                if (length == 1) {
                    return sg3.D(objArr[length2 - 1]);
                }
                List asList = Arrays.asList(Q0(objArr, length2 - length, length2));
                asList.getClass();
                return asList;
            }
        } else {
            h.j(pb4.i(i, "Requested element count ", " is less than zero."));
            return null;
        }
    }

    public static void S0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void T0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList V0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object W0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        kj6.i("Array is empty.");
        return null;
    }

    public static Object X0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [re3, pe3] */
    public static re3 Y0(int[] iArr) {
        return new pe3(0, iArr.length - 1, 1);
    }

    public static int Z0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer a1(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object b1(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int c1(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void d1(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, vr2 vr2) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            g75.f(sb, obj, vr2);
        }
        sb.append(charSequence3);
    }

    public static String e1(byte[] bArr, String str, int i) {
        String str2;
        e7 e7Var = e7.x;
        String str3 = "";
        if ((i & 2) != 0) {
            str2 = str3;
        } else {
            str2 = "[";
        }
        if ((i & 4) == 0) {
            str3 = "]";
        }
        if ((i & 32) != 0) {
            e7Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append(str);
            }
            if (e7Var != null) {
                sb.append((CharSequence) e7Var.y(Byte.valueOf(b)));
            } else {
                sb.append(String.valueOf(b));
            }
        }
        sb.append(str3);
        return sb.toString();
    }

    public static String f1(Object[] objArr, String str, String str2, String str3, vr2 vr2, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            vr2 = null;
        }
        StringBuilder sb = new StringBuilder();
        d1(objArr, sb, str6, str4, str5, "...", vr2);
        return sb.toString();
    }

    public static Object g1(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        kj6.i("Array is empty.");
        return null;
    }

    public static Object[] h1(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static char i1(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            kj6.i("Array is empty.");
            return 0;
        } else if (length == 1) {
            return cArr[0];
        } else {
            h.q("Array has more than one element.");
            return 0;
        }
    }

    public static Object j1(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            kj6.i("Array is empty.");
            return null;
        } else if (length == 1) {
            return objArr[0];
        } else {
            h.q("Array has more than one element.");
            return null;
        }
    }

    public static final void k1(Object[] objArr, LinkedHashSet linkedHashSet) {
        objArr.getClass();
        for (Object add : objArr) {
            linkedHashSet.add(add);
        }
    }

    public static List l1(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return sg3.D(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List m1(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return sg3.D(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List n1(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return sg3.D(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List o1(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return sg3.D(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List p1(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return sg3.D(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static List q1(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return sg3.D(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    public static Set r1(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return g42.w;
        }
        if (length == 1) {
            return wn6.w(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(tf4.F(objArr.length));
        k1(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList s1(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new yb5(objArr[i], objArr2[i]));
        }
        return arrayList;
    }
}
