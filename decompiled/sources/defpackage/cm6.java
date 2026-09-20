package defpackage;

/* renamed from: cm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cm6 {
    public final String a;
    public final String b;

    public cm6(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm6)) {
            return false;
        }
        cm6 cm6 = (cm6) obj;
        if (sg3.e(this.a, cm6.a) && sg3.e(this.b, cm6.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return pb4.m("ServicioUtilItem(name=", this.a, ", number=", this.b, ")");
    }
}
