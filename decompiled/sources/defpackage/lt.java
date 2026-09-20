package defpackage;

/* renamed from: lt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lt extends mt {
    public final vb5 a;
    public final f77 b;

    public lt(vb5 vb5, f77 f77) {
        this.a = vb5;
        this.b = f77;
    }

    public final vb5 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        if (this.a.equals(ltVar.a) && this.b.equals(ltVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}
