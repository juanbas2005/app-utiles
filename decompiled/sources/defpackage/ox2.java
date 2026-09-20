package defpackage;

/* renamed from: ox2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ox2 {
    public final int a;

    public ox2(int i) {
        this.a = i;
        if (i <= 0) {
            bc3.a("Provided count should be larger than zero");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ox2) || this.a != ((ox2) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -this.a;
    }
}
