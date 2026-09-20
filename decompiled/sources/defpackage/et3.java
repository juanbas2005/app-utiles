package defpackage;

/* renamed from: et3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class et3 {
    public final Float a;
    public i12 b;

    public et3(Float f, i12 i12) {
        this.a = f;
        this.b = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof et3)) {
            return false;
        }
        et3 et3 = (et3) obj;
        if (!et3.a.equals(this.a) || !sg3.e(et3.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + f21.e(0, this.a.hashCode() * 31, 31);
    }
}
