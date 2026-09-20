package defpackage;

import android.animation.TimeInterpolator;

/* renamed from: xm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xm4 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return jl.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm4)) {
            return false;
        }
        xm4 xm4 = (xm4) obj;
        if (this.a == xm4.a && this.b == xm4.b && this.d == xm4.d && this.e == xm4.e) {
            return a().getClass().equals(xm4.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(xm4.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return hl6.n(sb, this.e, "}\n");
    }
}
