package defpackage;

/* renamed from: zt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zt2 implements my0 {
    public final jy0 w;

    public zt2(jy0 jy0) {
        this.w = jy0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zt2)) {
            return false;
        }
        if (this.w.equals(((zt2) obj).w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() * 31;
    }
}
