package defpackage;

/* renamed from: nt6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nt6 {
    public final if7 a;
    public final if7 b;
    public final if7 c;

    public nt6() {
        if7 if7 = new if7(new String(), (String) null);
        if7 if72 = new if7(new String(), (String) null);
        if7 if73 = new if7(new String(), (String) null);
        this.a = if7;
        this.b = if72;
        this.c = if73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt6)) {
            return false;
        }
        nt6 nt6 = (nt6) obj;
        if (sg3.e(this.a, nt6.a) && sg3.e(this.b, nt6.b) && sg3.e(this.c, nt6.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SignUpScreenData(name=" + this.a + ", email=" + this.b + ", password=" + this.c + ")";
    }
}
