package defpackage;

/* renamed from: it6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class it6 {
    public final if7 a;
    public final if7 b;

    public it6() {
        if7 if7 = new if7(new String(), (String) null);
        if7 if72 = new if7(new String(), (String) null);
        this.a = if7;
        this.b = if72;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it6)) {
            return false;
        }
        it6 it6 = (it6) obj;
        if (sg3.e(this.a, it6.a) && sg3.e(this.b, it6.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignInScreenData(email=" + this.a + ", password=" + this.b + ")";
    }
}
