package defpackage;

/* renamed from: c40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c40 {
    public final long a;
    public final float b;

    public c40(float f, long j) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c40)) {
            return false;
        }
        c40 c40 = (c40) obj;
        if (jt0.c(this.a, c40.a) && lx1.b(this.b, c40.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pb4.m("BackgroundTheme(color=", jt0.i(this.a), ", tonalElevation=", lx1.c(this.b), ")");
    }
}
