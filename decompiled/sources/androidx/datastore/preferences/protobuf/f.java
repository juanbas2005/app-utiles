package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            a(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                zf0 zf0 = zf0.y;
                sb.append(n85.e(new zf0(((String) obj).getBytes(tf3.a))));
                sb.append('\"');
            } else if (obj instanceof zf0) {
                sb.append(": \"");
                sb.append(n85.e((zf0) obj));
                sb.append('\"');
            } else if (obj instanceof e) {
                sb.append(" {");
                c((e) obj, sb, i + 2);
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                b(sb, i3, "key", entry.getKey());
                b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0192, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a7, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bd, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    public static void c(e eVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        Method method;
        Method method2;
        e eVar2 = eVar;
        StringBuilder sb2 = sb;
        int i4 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = eVar2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i2 = 3;
            if (i5 >= length) {
                break;
            }
            Method method3 = declaredMethods[i5];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
                if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    b(sb2, i4, substring.substring(0, substring.length() - 3), e.e(method, eVar2, new Object[0]));
                } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring));
                    if (method4 != null) {
                        Object e = e.e(method4, eVar2, new Object[0]);
                        if (method5 == null) {
                            z = true;
                            if (e instanceof Boolean) {
                                z2 = !((Boolean) e).booleanValue();
                            } else {
                                if (!(e instanceof Integer)) {
                                    if (!(e instanceof Float)) {
                                        if (!(e instanceof Double)) {
                                            if (e instanceof String) {
                                                z2 = e.equals("");
                                            } else if (e instanceof zf0) {
                                                z2 = e.equals(zf0.y);
                                            } else {
                                                z2 = !(e instanceof a) ? false : false;
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                            }
                            if (z2) {
                                z = false;
                            }
                        } else {
                            z = ((Boolean) e.e(method5, eVar2, new Object[0])).booleanValue();
                        }
                        if (z) {
                            b(sb2, i4, substring, e);
                        }
                    }
                }
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb2, i4, substring.substring(0, substring.length() - 4), e.e(method2, eVar2, new Object[0]));
                }
                if (substring.endsWith("Map") || !substring.equals("Map") || (method = (Method) entry.getValue()) != null || method.getReturnType().equals(Map.class) || !method.isAnnotationPresent(Deprecated.class) || Modifier.isPublic(method.getModifiers())) {
                }
            }
            i2 = i3;
        }
        int i6 = i2;
        k kVar = eVar2.unknownFields;
        if (kVar != null) {
            for (int i7 = 0; i7 < kVar.a; i7++) {
                b(sb2, i4, String.valueOf(kVar.b[i7] >>> 3), kVar.c[i7]);
            }
        }
    }
}
