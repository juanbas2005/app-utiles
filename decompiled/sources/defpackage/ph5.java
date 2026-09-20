package defpackage;

/* renamed from: ph5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ph5 {
    public final String a;
    public final String b;

    public ph5(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph5)) {
            return false;
        }
        ph5 ph5 = (ph5) obj;
        if (sg3.e(this.a, ph5.a) && this.b.equals(ph5.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return pb4.m("PlanOption(description=", this.a, ", price=", this.b, ")");
    }
}
