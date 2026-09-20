package defpackage;

import java.util.List;

/* renamed from: yp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yp7 implements as3 {
    public final vq3 w;
    public final List x;
    public final int y;

    public yp7(vq3 vq3, List list, int i) {
        vq3.getClass();
        list.getClass();
        this.w = vq3;
        this.x = list;
        this.y = i;
    }

    public final List I() {
        return this.x;
    }

    public final vq3 J() {
        return this.w;
    }

    public final String b(boolean z) {
        gq3 gq3;
        String str;
        String str2;
        vq3 vq3 = this.w;
        Class cls = null;
        if (vq3 instanceof gq3) {
            gq3 = (gq3) vq3;
        } else {
            gq3 = null;
        }
        if (gq3 != null) {
            cls = kl8.u(gq3);
        }
        if (cls == null) {
            str = vq3.toString();
        } else if ((this.y & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (cls.equals(boolean[].class)) {
                str = "kotlin.BooleanArray";
            } else if (cls.equals(char[].class)) {
                str = "kotlin.CharArray";
            } else if (cls.equals(byte[].class)) {
                str = "kotlin.ByteArray";
            } else if (cls.equals(short[].class)) {
                str = "kotlin.ShortArray";
            } else if (cls.equals(int[].class)) {
                str = "kotlin.IntArray";
            } else if (cls.equals(float[].class)) {
                str = "kotlin.FloatArray";
            } else if (cls.equals(long[].class)) {
                str = "kotlin.LongArray";
            } else if (cls.equals(double[].class)) {
                str = "kotlin.DoubleArray";
            } else {
                str = "kotlin.Array";
            }
        } else if (!z || !cls.isPrimitive()) {
            str = cls.getName();
        } else {
            str = kl8.v((gq3) vq3).getName();
        }
        String str3 = "";
        if (this.x.isEmpty()) {
            str2 = str3;
        } else {
            str2 = dt0.E0(this.x, ", ", "<", ">", new ha7(this), 24);
        }
        if (v()) {
            str3 = "?";
        }
        return pb4.l(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yp7)) {
            return false;
        }
        yp7 yp7 = (yp7) obj;
        if (!sg3.e(this.w, yp7.w) || !sg3.e(this.x, yp7.x) || this.y != yp7.y) {
            return false;
        }
        return true;
    }

    public final List getAnnotations() {
        return a42.w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + hl6.j(this.x, this.w.hashCode() * 31, 31);
    }

    public final String toString() {
        return b(false).concat(" (Kotlin reflection is not available)");
    }

    public final boolean v() {
        if ((this.y & 1) != 0) {
            return true;
        }
        return false;
    }
}
