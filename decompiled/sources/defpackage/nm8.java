package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: nm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nm8 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        String str2;
        if (obj instanceof List) {
            for (Object a2 : (List) obj) {
                a(sb, i, str, a2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a3 : ((Map) obj).entrySet()) {
                a(sb, i, str, a3);
            }
        } else {
            sb.append(10);
            c(i, sb);
            int i2 = 0;
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i3 = 1; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
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
                String str3 = (String) obj;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (i2 < str3.length()) {
                        char charAt2 = str3.charAt(i2);
                        if (charAt2 < ' ' || charAt2 > '~') {
                            str2 = a35.p(str3.getBytes(StandardCharsets.UTF_8));
                        } else {
                            if (charAt2 == '\"') {
                                z3 = true;
                            } else if (charAt2 == '\'') {
                                z2 = true;
                            } else if (charAt2 == '\\') {
                                z = true;
                            }
                            i2++;
                        }
                    } else {
                        if (z) {
                            str3 = str3.replace("\\", "\\\\");
                        }
                        if (z2) {
                            str2 = str3.replace("'", "\\'");
                        } else {
                            str2 = str3;
                        }
                        if (z3) {
                            str2 = str2.replace("\"", "\\\"");
                        }
                    }
                }
                str2 = a35.p(str3.getBytes(StandardCharsets.UTF_8));
                sb.append(str2);
                sb.append('\"');
            } else if (obj instanceof vk8) {
                sb.append(": \"");
                sb.append(a35.p(((vk8) obj).v()));
                sb.append('\"');
            } else if (obj instanceof nl8) {
                sb.append(" {");
                b((nl8) obj, sb, i + 2);
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i4 = i + 2;
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                a(sb, i4, "key", entry.getKey());
                a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017e, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018e, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a0, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b6, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ce, code lost:
        if (r13 != false) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    public static void b(nl8 nl8, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        Method method;
        Method method2;
        nl8 nl82 = nl8;
        StringBuilder sb2 = sb;
        int i4 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = nl82.getClass().getDeclaredMethods();
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
                    a(sb2, i4, substring.substring(0, substring.length() - 3), nl8.p(method, nl82, new Object[0]));
                } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring));
                    if (method4 != null) {
                        Object p = nl8.p(method4, nl82, new Object[0]);
                        if (method5 == null) {
                            if (!(p instanceof Boolean)) {
                                if (!(p instanceof Integer)) {
                                    if (!(p instanceof Float)) {
                                        if (!(p instanceof Double)) {
                                            if (p instanceof String) {
                                                z2 = p.equals("");
                                            } else if (p instanceof vk8) {
                                                z2 = p.equals(vk8.x);
                                            } else {
                                                z = !(p instanceof pk8) ? true : true;
                                            }
                                        }
                                    }
                                }
                            }
                            z = false;
                        } else {
                            z = ((Boolean) nl8.p(method5, nl82, new Object[0])).booleanValue();
                        }
                        if (z) {
                            a(sb2, i4, substring, p);
                        }
                    }
                }
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i4, substring.substring(0, substring.length() - 4), nl8.p(method2, nl82, new Object[0]));
                }
                if (substring.endsWith("Map") || !substring.equals("Map") || (method = (Method) entry.getValue()) != null || method.getReturnType().equals(Map.class) || !method.isAnnotationPresent(Deprecated.class) || Modifier.isPublic(method.getModifiers())) {
                }
            }
            i2 = i3;
        }
        int i6 = i2;
        en8 en8 = nl82.zzc;
        if (en8 != null) {
            for (int i7 = 0; i7 < en8.a; i7++) {
                a(sb2, i4, String.valueOf(en8.b[i7] >>> 3), en8.c[i7]);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
