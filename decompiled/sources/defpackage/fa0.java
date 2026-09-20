package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: fa0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fa0 extends ct0 {
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa0(boolean z, int i) {
        super(z);
        this.q = i;
    }

    public static int[] i(String str) {
        return new int[]{((Number) bv4.b.c(str)).intValue()};
    }

    public static long[] j(String str) {
        return new long[]{((Number) bv4.e.c(str)).longValue()};
    }

    public static boolean[] k(String str) {
        return new boolean[]{((Boolean) bv4.k.c(str)).booleanValue()};
    }

    public final Object a(String str, Bundle bundle) {
        switch (this.q) {
            case b85.b:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                i95.x(str);
                throw null;
            case 1:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return qs.q1(booleanArray2);
                }
                i95.x(str);
                throw null;
            case 2:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                i95.x(str);
                throw null;
            case 3:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return qs.m1(floatArray2);
                }
                i95.x(str);
                throw null;
            case 4:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                i95.x(str);
                throw null;
            case 5:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return qs.n1(intArray2);
                }
                i95.x(str);
                throw null;
            case 6:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                i95.x(str);
                throw null;
            case 7:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return qs.o1(longArray2);
                }
                i95.x(str);
                throw null;
            case 8:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                return z85.p(str, bundle);
            default:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                return qs.p1(z85.p(str, bundle));
        }
    }

    public final String b() {
        switch (this.q) {
            case b85.b:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    public final Object c(String str) {
        switch (this.q) {
            case b85.b:
                return k(str);
            case 1:
                return sg3.D(bv4.k.c(str));
            case 2:
                return new float[]{Float.parseFloat(str)};
            case 3:
                return sg3.D(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return i(str);
            case 5:
                return sg3.D(bv4.b.c(str));
            case 6:
                return j(str);
            case 7:
                return sg3.D(bv4.e.c(str));
            case 8:
                return new String[]{str};
            default:
                return sg3.D(str);
        }
    }

    public final Object d(String str, Object obj) {
        switch (this.q) {
            case b85.b:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return k(str);
                }
                boolean[] k = k(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(k, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                ga0 ga0 = bv4.k;
                if (list != null) {
                    return dt0.M0(list, sg3.D(ga0.c(str)));
                }
                return sg3.D(ga0.c(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] fArr2 = {Float.parseFloat(str)};
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                    return copyOf2;
                }
                return new float[]{Float.parseFloat(str)};
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    return dt0.M0(list2, sg3.D(Float.valueOf(Float.parseFloat(str))));
                }
                return sg3.D(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return i(str);
                }
                int[] i = i(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(i, 0, copyOf3, length3, 1);
                return copyOf3;
            case 5:
                List list3 = (List) obj;
                ga0 ga02 = bv4.b;
                if (list3 != null) {
                    return dt0.M0(list3, sg3.D(ga02.c(str)));
                }
                return sg3.D(ga02.c(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return j(str);
                }
                long[] j = j(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(j, 0, copyOf4, length4, 1);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                ga0 ga03 = bv4.e;
                if (list4 != null) {
                    return dt0.M0(list4, sg3.D(ga03.c(str)));
                }
                return sg3.D(ga03.c(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    return (String[]) qs.h1(strArr, new String[]{str});
                }
                return new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return dt0.M0(list5, sg3.D(str));
                }
                return sg3.D(str);
        }
    }

    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case b85.b:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr != null) {
                    bundle.putBooleanArray(str, zArr);
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list != null) {
                    bundle.putBooleanArray(str, dt0.X0(list));
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr != null) {
                    bundle.putFloatArray(str, fArr);
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 != null) {
                    bundle.putFloatArray(str, dt0.Z0(list2));
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr != null) {
                    bundle.putIntArray(str, iArr);
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, dt0.a1(list3));
                    return;
                }
                return;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr != null) {
                    bundle.putLongArray(str, jArr);
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 != null) {
                    bundle.putLongArray(str, dt0.c1(list4));
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr != null) {
                    bundle.putStringArray(str, strArr);
                    return;
                } else {
                    bundle.putString(str, (String) null);
                    return;
                }
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 != null) {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    return;
                }
                bundle.putString(str, (String) null);
                return;
        }
    }

    public final Object g() {
        int i = this.q;
        a42 a42 = a42.w;
        switch (i) {
            case b85.b:
                return new boolean[0];
            case 1:
                return a42;
            case 2:
                return new float[0];
            case 3:
                return a42;
            case 4:
                return new int[0];
            case 5:
                return a42;
            case 6:
                return new long[0];
            case 7:
                return a42;
            case 8:
                return new String[0];
            default:
                return a42;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final List h(Object obj) {
        int i = this.q;
        a42 a42 = a42.w;
        switch (i) {
            case b85.b:
                boolean[] zArr = (boolean[]) obj;
                a42 a422 = a42;
                if (zArr != null) {
                    List<Boolean> q1 = qs.q1(zArr);
                    ArrayList arrayList = new ArrayList(et0.e0(q1, 10));
                    for (Boolean booleanValue : q1) {
                        arrayList.add(String.valueOf(booleanValue.booleanValue()));
                    }
                    a422 = arrayList;
                }
                return a422;
            case 1:
                List<Boolean> list = (List) obj;
                a42 a423 = a42;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                    for (Boolean booleanValue2 : list) {
                        arrayList2.add(String.valueOf(booleanValue2.booleanValue()));
                    }
                    a423 = arrayList2;
                }
                return a423;
            case 2:
                float[] fArr = (float[]) obj;
                a42 a424 = a42;
                if (fArr != null) {
                    List<Number> m1 = qs.m1(fArr);
                    ArrayList arrayList3 = new ArrayList(et0.e0(m1, 10));
                    for (Number floatValue : m1) {
                        arrayList3.add(String.valueOf(floatValue.floatValue()));
                    }
                    a424 = arrayList3;
                }
                return a424;
            case 3:
                List<Number> list2 = (List) obj;
                a42 a425 = a42;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(et0.e0(list2, 10));
                    for (Number floatValue2 : list2) {
                        arrayList4.add(String.valueOf(floatValue2.floatValue()));
                    }
                    a425 = arrayList4;
                }
                return a425;
            case 4:
                int[] iArr = (int[]) obj;
                a42 a426 = a42;
                if (iArr != null) {
                    List<Number> n1 = qs.n1(iArr);
                    ArrayList arrayList5 = new ArrayList(et0.e0(n1, 10));
                    for (Number intValue : n1) {
                        arrayList5.add(String.valueOf(intValue.intValue()));
                    }
                    a426 = arrayList5;
                }
                return a426;
            case 5:
                List<Number> list3 = (List) obj;
                a42 a427 = a42;
                if (list3 != null) {
                    ArrayList arrayList6 = new ArrayList(et0.e0(list3, 10));
                    for (Number intValue2 : list3) {
                        arrayList6.add(String.valueOf(intValue2.intValue()));
                    }
                    a427 = arrayList6;
                }
                return a427;
            case 6:
                long[] jArr = (long[]) obj;
                a42 a428 = a42;
                if (jArr != null) {
                    List<Number> o1 = qs.o1(jArr);
                    ArrayList arrayList7 = new ArrayList(et0.e0(o1, 10));
                    for (Number longValue : o1) {
                        arrayList7.add(String.valueOf(longValue.longValue()));
                    }
                    a428 = arrayList7;
                }
                return a428;
            case 7:
                List<Number> list4 = (List) obj;
                a42 a429 = a42;
                if (list4 != null) {
                    ArrayList arrayList8 = new ArrayList(et0.e0(list4, 10));
                    for (Number longValue2 : list4) {
                        arrayList8.add(String.valueOf(longValue2.longValue()));
                    }
                    a429 = arrayList8;
                }
                return a429;
            case 8:
                String[] strArr = (String[]) obj;
                a42 a4210 = a42;
                if (strArr != null) {
                    ArrayList arrayList9 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        str.getClass();
                        String encode = Uri.encode(str, (String) null);
                        encode.getClass();
                        arrayList9.add(encode);
                    }
                    a4210 = arrayList9;
                }
                return a4210;
            default:
                List<String> list5 = (List) obj;
                a42 a4211 = a42;
                if (list5 != null) {
                    ArrayList arrayList10 = new ArrayList(et0.e0(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String encode2 = Uri.encode(str2, (String) null);
                        encode2.getClass();
                        arrayList10.add(encode2);
                    }
                    a4211 = arrayList10;
                }
                return a4211;
        }
    }
}
