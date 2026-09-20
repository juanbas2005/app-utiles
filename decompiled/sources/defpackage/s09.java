package defpackage;

import java.util.Arrays;

/* renamed from: s09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s09 extends d19 {
    public final qz8 w;

    public s09(qz8 qz8) {
        this.w = qz8;
    }

    public final int a() {
        return d19.d((byte) 64);
    }

    public final int compareTo(Object obj) {
        d19 d19 = (d19) obj;
        int a = d19.a();
        int d = d19.d((byte) 64);
        if (d != a) {
            return d - d19.a();
        }
        qz8 qz8 = ((s09) d19).w;
        qz8 qz82 = this.w;
        byte[] bArr = qz82.x;
        int length = bArr.length;
        byte[] bArr2 = qz8.x;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return dz8.a.compare(qz82.s(), qz8.s());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s09.class == obj.getClass()) {
            return this.w.equals(((s09) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d19.d((byte) 64)), this.w});
    }

    public final String toString() {
        jy8 jy8;
        int i;
        boolean z;
        my8 my8 = py8.d;
        py8 py8 = my8.c;
        if (py8 == null) {
            jy8 jy82 = my8.a;
            char[] cArr = jy82.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    jy8 = jy82;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i4 = 0; i4 < cArr.length; i4++) {
                            char c3 = cArr[i4];
                            if (c3 >= 'a' && c3 <= 'z') {
                                c3 ^= ' ';
                            }
                            cArr2[i4] = (char) c3;
                        }
                        jy8 = new jy8(jy82.a.concat(".upperCase()"), cArr2);
                        byte[] bArr = jy8.g;
                        if (jy82.h && !jy8.h) {
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            for (i = 65; i <= 90; i++) {
                                int i5 = i | 32;
                                byte b = bArr[i];
                                byte b2 = bArr[i5];
                                if (b == -1) {
                                    copyOf[i] = b2;
                                } else {
                                    char c4 = (char) i;
                                    char c5 = (char) i5;
                                    if (b2 == -1) {
                                        copyOf[i5] = b;
                                    } else {
                                        h.s(h75.J("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                        return null;
                                    }
                                }
                            }
                            jy8 = new jy8(jy8.a.concat(".ignoreCase()"), jy8.b, copyOf, true);
                        }
                    } else {
                        h.s("Cannot call upperCase() on a mixed-case alphabet");
                        return null;
                    }
                }
            }
            if (jy8 == jy82) {
                py8 = my8;
            } else {
                py8 = new my8(jy8);
            }
            my8.c = py8;
        }
        byte[] s = this.w.s();
        return f21.h("h'", py8.c(s.length, s), "'");
    }
}
