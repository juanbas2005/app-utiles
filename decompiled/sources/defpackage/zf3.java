package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: zf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zf3 extends ct0 {
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf3(boolean z, int i) {
        super(z);
        this.q = i;
    }

    public final Object a(String str, Bundle bundle) {
        int i = this.q;
        ga0 ga0 = bv4.n;
        ArrayList arrayList = null;
        switch (i) {
            case b85.b:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                i95.x(str);
                throw null;
            case 1:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return qs.l1(doubleArray2);
                }
                i95.x(str);
                throw null;
            case 2:
                if (!b81.x(str, str, bundle) || z85.t(str, bundle)) {
                    return null;
                }
                String[] p = z85.p(str, bundle);
                ArrayList arrayList2 = new ArrayList(p.length);
                for (String c : p) {
                    arrayList2.add((String) ga0.c(c));
                }
                return (String[]) arrayList2.toArray(new String[0]);
            default:
                if (b81.x(str, str, bundle) && !z85.t(str, bundle)) {
                    List<String> p1 = qs.p1(z85.p(str, bundle));
                    arrayList = new ArrayList(et0.e0(p1, 10));
                    for (String c2 : p1) {
                        arrayList.add((String) ga0.c(c2));
                    }
                }
                return arrayList;
        }
    }

    public final String b() {
        switch (this.q) {
            case b85.b:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    public final Object c(String str) {
        int i = this.q;
        ga0 ga0 = bv4.n;
        switch (i) {
            case b85.b:
                return new double[]{Double.parseDouble(str)};
            case 1:
                return sg3.D(Double.valueOf(Double.parseDouble(str)));
            case 2:
                return new String[]{ga0.c(str)};
            default:
                return sg3.D(ga0.c(str));
        }
    }

    public final Object d(String str, Object obj) {
        int i = this.q;
        ga0 ga0 = bv4.n;
        switch (i) {
            case b85.b:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    double[] dArr2 = {Double.parseDouble(str)};
                    int length = dArr.length;
                    double[] copyOf = Arrays.copyOf(dArr, length + 1);
                    System.arraycopy(dArr2, 0, copyOf, length, 1);
                    return copyOf;
                }
                return new double[]{Double.parseDouble(str)};
            case 1:
                List list = (List) obj;
                if (list != null) {
                    return dt0.M0(list, sg3.D(Double.valueOf(Double.parseDouble(str))));
                }
                return sg3.D(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    return (String[]) qs.h1(strArr, new String[]{ga0.c(str)});
                }
                return new String[]{ga0.c(str)};
            default:
                List list2 = (List) obj;
                if (list2 != null) {
                    return dt0.M0(list2, sg3.D(ga0.c(str)));
                }
                return sg3.D(ga0.c(str));
        }
    }

    public final void e(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.q) {
            case b85.b:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, (String) null);
                    return;
                } else {
                    bundle.putDoubleArray(str, dArr);
                    return;
                }
            case 1:
                List<Number> list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, (String) null);
                    return;
                }
                double[] dArr2 = new double[list.size()];
                for (Number doubleValue : list) {
                    dArr2[i] = doubleValue.doubleValue();
                    i++;
                }
                bundle.putDoubleArray(str, dArr2);
                return;
            case 2:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, (String) null);
                    return;
                }
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str2 : strArr) {
                    if (str2 == null) {
                        str2 = "null";
                    }
                    arrayList.add(str2);
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                strArr2.getClass();
                bundle.putStringArray(str, strArr2);
                return;
            default:
                List<String> list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, (String) null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList(et0.e0(list2, 10));
                for (String str3 : list2) {
                    if (str3 == null) {
                        str3 = "null";
                    }
                    arrayList2.add(str3);
                }
                String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                strArr3.getClass();
                bundle.putStringArray(str, strArr3);
                return;
        }
    }

    public final Object g() {
        int i = this.q;
        a42 a42 = a42.w;
        switch (i) {
            case b85.b:
                return new double[0];
            case 1:
                return a42;
            case 2:
                return new String[0];
            default:
                return a42;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final List h(Object obj) {
        String str;
        String str2;
        int i = this.q;
        a42 a42 = a42.w;
        switch (i) {
            case b85.b:
                double[] dArr = (double[]) obj;
                a42 a422 = a42;
                if (dArr != null) {
                    List<Number> l1 = qs.l1(dArr);
                    ArrayList arrayList = new ArrayList(et0.e0(l1, 10));
                    for (Number doubleValue : l1) {
                        arrayList.add(String.valueOf(doubleValue.doubleValue()));
                    }
                    a422 = arrayList;
                }
                return a422;
            case 1:
                List<Number> list = (List) obj;
                a42 a423 = a42;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                    for (Number doubleValue2 : list) {
                        arrayList2.add(String.valueOf(doubleValue2.doubleValue()));
                    }
                    a423 = arrayList2;
                }
                return a423;
            case 2:
                String[] strArr = (String[]) obj;
                a42 a424 = a42;
                if (strArr != null) {
                    ArrayList arrayList3 = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        if (str3 != null) {
                            str = Uri.encode(str3, (String) null);
                            str.getClass();
                        } else {
                            str = "null";
                        }
                        arrayList3.add(str);
                    }
                    a424 = arrayList3;
                }
                return a424;
            default:
                List<String> list2 = (List) obj;
                a42 a425 = a42;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(et0.e0(list2, 10));
                    for (String str4 : list2) {
                        if (str4 != null) {
                            str2 = Uri.encode(str4, (String) null);
                            str2.getClass();
                        } else {
                            str2 = "null";
                        }
                        arrayList4.add(str2);
                    }
                    a425 = arrayList4;
                }
                return a425;
        }
    }
}
