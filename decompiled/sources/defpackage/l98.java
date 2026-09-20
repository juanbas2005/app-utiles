package defpackage;

/* renamed from: l98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l98 implements nj4 {
    public final e80 a;

    public l98(e80 e80) {
        this.a = e80;
    }

    public final int a(se3 se3, long j, int i, ey3 ey3) {
        return this.a.a(i, (int) (j >> 32), ey3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l98) && this.a.equals(((l98) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ")";
    }
}
