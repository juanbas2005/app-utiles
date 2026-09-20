package defpackage;

import java.util.Arrays;

/* renamed from: z09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z09 extends d19 {
    public final String w;

    public z09(String str) {
        this.w = str;
    }

    public final int a() {
        return d19.d((byte) 96);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        d19 d19 = (d19) obj;
        int a = d19.a();
        int d = d19.d((byte) 96);
        if (d != a) {
            return d - d19.a();
        }
        String str = ((z09) d19).w;
        int length = str.length();
        String str2 = this.w;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z09.class == obj.getClass()) {
            return this.w.equals(((z09) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d19.d((byte) 96)), this.w});
    }

    public final String toString() {
        return f21.l(new StringBuilder("\""), this.w, "\"");
    }
}
