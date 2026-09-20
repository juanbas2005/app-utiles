package defpackage;

/* renamed from: gc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gc implements nj4 {
    public final g80 a;
    public final g80 b;

    public gc(g80 g80, g80 g802) {
        this.a = g80;
        this.b = g802;
    }

    public final int a(se3 se3, long j, int i, ey3 ey3) {
        return se3.a + this.b.a(0, se3.d(), ey3) + (-this.a.a(0, i, ey3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        if (this.a.equals(gcVar.a) && this.b.equals(gcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ")";
    }
}
