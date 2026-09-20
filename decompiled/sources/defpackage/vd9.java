package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: vd9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vd9 {
    public static final Locale a = Locale.ROOT;

    public static String a(Object obj) {
        String str;
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String obj2 = obj.toString();
                if (obj2 != null) {
                    return obj2;
                }
                return c("toString() returned null", obj);
            } else if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            } else {
                if (obj instanceof long[]) {
                    return Arrays.toString((long[]) obj);
                }
                if (obj instanceof byte[]) {
                    return Arrays.toString((byte[]) obj);
                }
                if (obj instanceof char[]) {
                    return Arrays.toString((char[]) obj);
                }
                if (obj instanceof short[]) {
                    return Arrays.toString((short[]) obj);
                }
                if (obj instanceof float[]) {
                    return Arrays.toString((float[]) obj);
                }
                if (obj instanceof double[]) {
                    return Arrays.toString((double[]) obj);
                }
                if (obj instanceof boolean[]) {
                    return Arrays.toString((boolean[]) obj);
                }
                return Arrays.toString((Object[]) obj);
            }
        } catch (RuntimeException e) {
            try {
                str = e.toString();
            } catch (RuntimeException e2) {
                str = e2.getClass().getSimpleName();
            }
            return c(str, obj);
        }
    }

    public static void b(StringBuilder sb, long j, boolean z) {
        String str;
        if (j == 0) {
            sb.append("0");
            return;
        }
        if (true != z) {
            str = "0123456789abcdef";
        } else {
            str = "0123456789ABCDEF";
        }
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    public static String c(String str, Object obj) {
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(identityHashCode).length() + 2 + String.valueOf(str).length() + 1);
        sb.append("{");
        sb.append(name);
        sb.append("@");
        sb.append(identityHashCode);
        return f21.m(sb, ": ", str, "}");
    }
}
