package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: g22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class g22 implements up1, du6, m78, ux6, rr0, qj4, xf0, d81, oo6, xx5, ly4 {
    public static final g22 A = new g22(5);
    public static final g22 B = new g22(7);
    public static final g22 C = new g22(8);
    public static final g22 D = new g22(9);
    public static final g22 E = new g22(10);
    public static final y65 F = new y65(1);
    public static final y65 G = new y65(0);
    public static final /* synthetic */ g22 H = new g22(12);
    public static final g22 I = new g22(13);
    public static final g22 J = new g22(14);
    public static final g22 K = new g22(16);
    public static final g22 L = new g22(17);
    public static final kj6 M = new kj6(24);
    public static final g22 x = new g22(1);
    public static final g22 y = new g22(2);
    public static final g22 z = new g22(4);
    public final /* synthetic */ int w;

    public /* synthetic */ g22(int i) {
        this.w = i;
    }

    public static String[] j(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static ps k(List list, sl4 sl4, ro5 ro5) {
        List<Object> b1 = dt0.b1(list);
        ArrayList arrayList = new ArrayList();
        for (Object l : b1) {
            e21 l2 = l((tl4) null, l);
            if (l2 != null) {
                arrayList.add(l2);
            }
        }
        if (sl4 != null) {
            return new lq7(arrayList, sl4.g().r(ro5));
        }
        return new ps(arrayList, new b0(12, ro5));
    }

    public static e21 l(tl4 tl4, Object obj) {
        if (obj instanceof Byte) {
            return new eg0(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new os6(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new ye3(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new wc4(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e21((Character) obj);
        }
        if (obj instanceof Float) {
            return new ka0(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new ka0(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new ka0((Object) (Boolean) obj);
        }
        if (obj instanceof String) {
            return new e21((String) obj);
        }
        boolean z2 = obj instanceof byte[];
        List list = a42.w;
        int i = 0;
        if (z2) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            ArrayList arrayList = list;
            if (length != 0) {
                if (length != 1) {
                    ArrayList arrayList2 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i < length2) {
                        arrayList2.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = sg3.D(Byte.valueOf(bArr[0]));
                }
            }
            return k(arrayList, tl4, ro5.BYTE);
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            ArrayList arrayList3 = list;
            if (length3 != 0) {
                if (length3 != 1) {
                    ArrayList arrayList4 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i < length4) {
                        arrayList4.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                    arrayList3 = arrayList4;
                } else {
                    arrayList3 = sg3.D(Short.valueOf(sArr[0]));
                }
            }
            return k(arrayList3, tl4, ro5.SHORT);
        } else if (obj instanceof int[]) {
            return k(qs.n1((int[]) obj), tl4, ro5.INT);
        } else {
            if (obj instanceof long[]) {
                return k(qs.o1((long[]) obj), tl4, ro5.LONG);
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length5 = cArr.length;
                ArrayList arrayList5 = list;
                if (length5 != 0) {
                    if (length5 != 1) {
                        ArrayList arrayList6 = new ArrayList(cArr.length);
                        int length6 = cArr.length;
                        while (i < length6) {
                            arrayList6.add(Character.valueOf(cArr[i]));
                            i++;
                        }
                        arrayList5 = arrayList6;
                    } else {
                        arrayList5 = sg3.D(Character.valueOf(cArr[0]));
                    }
                }
                return k(arrayList5, tl4, ro5.CHAR);
            } else if (obj instanceof float[]) {
                return k(qs.m1((float[]) obj), tl4, ro5.FLOAT);
            } else {
                if (obj instanceof double[]) {
                    return k(qs.l1((double[]) obj), tl4, ro5.DOUBLE);
                }
                if (obj instanceof boolean[]) {
                    return k(qs.q1((boolean[]) obj), tl4, ro5.BOOLEAN);
                }
                if (obj == null) {
                    return new e21((Object) null);
                }
                return null;
            }
        }
    }

    public static jf1 n(tl6 tl6, br4 br4, ig0 ig0, sr2 sr2) {
        a42 a42 = a42.w;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new jf1(new gd2(tl6, new h43(16, ig0), sr2), sg3.D(new n0(a42, (f61) null, 26)), br4, ig0);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new jf1(new gd2(tl6, new f81(29), sr2), sg3.D(new n0(a42, (f61) null, 26)), br4, ig0);
        }
    }

    public static bo6 p(n63 n63) {
        return new bo6(System.currentTimeMillis() + 3600000, new bc4(8, 6), new yn6(true, false, false), 10.0d, 1.2d, 60);
    }

    public static LinkedHashSet q(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet r(String str, String... strArr) {
        return q("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet s(String str, String... strArr) {
        return q("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static void t(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists() && !parentFile.isDirectory() && sg3.e(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                kj6.p("Failed to delete conflicting file: ", parentFile);
            } else if (!parentFile.isDirectory()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e) {
                        throw new IOException("Failed to create directory: " + parentFile, e);
                    }
                } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    kj6.p("Failed to create directory: ", parentFile);
                }
            }
        }
    }

    public void D0(j43 j43, a97 a97) {
        j43.getClass();
        j43.A.f(s53.q, new ea((Object) (js2) a97, (f61) null, 6));
    }

    public vw3 b() {
        throw new IllegalStateException("This method should not be called");
    }

    public byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public boolean d() {
        return true;
    }

    public tl7 e(vl vlVar) {
        vlVar.getClass();
        String str = vlVar.x;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (i2 == 4 || i2 == 8 || i2 == 12) {
                sb.append(' ');
            }
            sb.append(charAt);
            i++;
            i2 = i3;
        }
        String sb2 = sb.toString();
        return new tl7(new vl(sb2), new yt1(str, sb2));
    }

    public float f(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public boolean g(int i) {
        if (4 <= i || Log.isLoggable("FirebaseCrashlytics", i)) {
            return true;
        }
        return false;
    }

    public bo6 h(n63 n63, JSONObject jSONObject) {
        return p(n63);
    }

    public boolean i(Object obj, Object obj2) {
        return sg3.e(obj, obj2);
    }

    public boolean m(ti4 ti4) {
        return false;
    }

    public void o(String str) {
        if (g(3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public String toString() {
        switch (this.w) {
            case 16:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    public void u(String str) {
        if (g(2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void v(String str, Exception exc) {
        if (g(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    public void lock() {
    }

    public void shutdown() {
    }

    public void unlock() {
    }

    public void a(ti4 ti4, boolean z2) {
    }
}
