package defpackage;

import com.google.android.gms.internal.measurement.zzabo;

/* renamed from: ek8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ek8 {
    public static final String a;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L_0x000e;
     */
    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (SecurityException unused) {
        }
        str = "\n";
        a = str;
    }

    public static void a(int i, int i2, String str, StringBuilder sb) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append(str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append(str, i3, i);
                    sb.append(a);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append(str, i3, i2);
        }
    }

    public static int b(int i, String str) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i;
                }
                i += 2;
            } else {
                throw new RuntimeException(zzabo.c(i, -1, "trailing unquoted '%' character", str));
            }
        }
        return -1;
    }
}
