package defpackage;

import java.util.Objects;

/* renamed from: d69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d69 implements Comparable {
    public final Object A;
    public final RuntimeException B;
    public final long w;
    public final String x;
    public final int y;
    public final long z;

    public d69(long j, String str, int i, long j2, Object obj) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (j != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (str == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        g75.h(z2 != z3 ? false : z4);
        this.w = j;
        this.x = str;
        this.y = i;
        this.z = j2;
        this.A = obj;
        if (i != 5) {
            this.B = null;
        } else if (obj == null) {
            this.B = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof vk8)) {
            this.B = null;
        } else {
            this.B = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i = this.y;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.z;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.A;
        if (i == 4) {
            obj.getClass();
            return obj;
        } else if (i == 5) {
            obj.getClass();
            try {
                if (obj instanceof byte[]) {
                    return (byte[]) obj;
                }
                return ((vk8) obj).v();
            } catch (Throwable th) {
                RuntimeException runtimeException = this.B;
                if (runtimeException != null) {
                    th.addSuppressed(runtimeException);
                }
                throw th;
            }
        } else {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
    }

    public final int compareTo(Object obj) {
        d69 d69 = (d69) obj;
        long j = d69.w;
        long j2 = this.w;
        int compare = Long.compare(j2, j);
        if (compare != 0) {
            return compare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.x;
        str.getClass();
        String str2 = d69.x;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d69)) {
            return false;
        }
        d69 d69 = (d69) obj;
        if (this.w != d69.w || !Objects.equals(this.x, d69.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.w), this.x});
    }

    public final String toString() {
        String str = this.x;
        if (str == null) {
            str = Long.toString(this.w);
        }
        String valueOf = String.valueOf(a());
        return f21.m(new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length()), str, ":", valueOf);
    }
}
