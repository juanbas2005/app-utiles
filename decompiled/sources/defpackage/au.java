package defpackage;

/* renamed from: au  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class au {
    public final String a;
    public final fp7 b;

    public au(String str, fp7 fp7) {
        this.a = str;
        this.b = fp7;
        if (d57.I0(str)) {
            h.q("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        if (this.a.equals(auVar.a) && this.b.equals(auVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.a);
    }
}
