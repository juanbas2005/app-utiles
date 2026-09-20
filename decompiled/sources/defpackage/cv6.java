package defpackage;

/* renamed from: cv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cv6 {
    public final yt2 a;

    public /* synthetic */ cv6(yt2 yt2) {
        this.a = yt2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cv6)) {
            return false;
        }
        if (!sg3.e(this.a, ((cv6) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ")";
    }
}
