package defpackage;

/* renamed from: dq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dq0 {
    public final gq0 a;
    public final xp0 b;

    public dq0(gq0 gq0, xp0 xp0) {
        gq0.getClass();
        this.a = gq0;
        this.b = xp0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dq0)) {
            return false;
        }
        if (sg3.e(this.a, ((dq0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
