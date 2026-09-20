package defpackage;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: ud9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ud9 {
    public static final HashSet c = new HashSet(Arrays.asList(new Class[]{Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class}));
    public final StringBuilder a;
    public boolean b = false;

    public ud9(StringBuilder sb) {
        this.a = sb;
    }

    public static int b(int i, String str) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void a(String str, Object obj) {
        boolean z = this.b;
        char c2 = ' ';
        StringBuilder sb = this.a;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                if (sb.length() > 1000 || sb.indexOf("\n") != -1) {
                    c2 = 10;
                }
                sb.append(c2);
            }
            sb.append("[CONTEXT ");
            this.b = true;
        }
        sb.append(str);
        sb.append('=');
        if (obj == null) {
            sb.append(true);
        } else if (c.contains(obj.getClass())) {
            sb.append(obj);
        } else {
            sb.append('\"');
            String obj2 = obj.toString();
            int i = 0;
            while (true) {
                int b2 = b(i, obj2);
                if (b2 != -1) {
                    sb.append(obj2, i, b2);
                    i = b2 + 1;
                    char charAt = obj2.charAt(b2);
                    if (charAt == 9) {
                        charAt = 't';
                    } else if (charAt == 10) {
                        charAt = 'n';
                    } else if (charAt == 13) {
                        charAt = 'r';
                    } else if (!(charAt == '\"' || charAt == '\\')) {
                        sb.append(65533);
                    }
                    sb.append("\\");
                    sb.append(charAt);
                } else {
                    sb.append(obj2, i, obj2.length());
                    sb.append('\"');
                    return;
                }
            }
        }
    }
}
