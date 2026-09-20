package defpackage;

import java.util.Arrays;

/* renamed from: w09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w09 extends d19 {
    public final long w;

    public w09(long j) {
        this.w = j;
    }

    public final int a() {
        byte b;
        if (this.w >= 0) {
            b = 0;
        } else {
            b = 32;
        }
        return d19.d(b);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        d19 d19 = (d19) obj;
        if (a() != d19.a()) {
            return a() - d19.a();
        }
        int i = (Math.abs(this.w) > Math.abs(((w09) d19).w) ? 1 : (Math.abs(this.w) == Math.abs(((w09) d19).w) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w09.class == obj.getClass() && this.w == ((w09) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.w)});
    }

    public final String toString() {
        return Long.toString(this.w);
    }
}
