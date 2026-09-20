package defpackage;

/* renamed from: m98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m98 implements oj4 {
    public final h80 a;

    public m98(h80 h80) {
        this.a = h80;
    }

    public final int a(se3 se3, long j, int i) {
        return this.a.a(i, (int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m98) && this.a.equals(((m98) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    public final String toString() {
        return "Vertical(alignment=" + this.a + ")";
    }
}
