package defpackage;

/* renamed from: xt0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xt0 implements kf7 {
    public final long a;

    public xt0(long j) {
        this.a = j;
        if (j == 16) {
            zb3.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    public final float a() {
        return jt0.d(this.a);
    }

    public final long b() {
        return this.a;
    }

    public final kc0 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xt0) && jt0.c(this.a, ((xt0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f21.h("ColorStyle(value=", jt0.i(this.a), ")");
    }
}
