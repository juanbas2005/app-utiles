package defpackage;

/* renamed from: uq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uq5 {
    public final String a;
    public final String b;

    public uq5(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq5)) {
            return false;
        }
        uq5 uq5 = (uq5) obj;
        if (sg3.e(this.a, uq5.a) && sg3.e(this.b, uq5.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return pb4.m("PromoBanner(imageUrl=", this.a, ", linkUrl=", this.b, ")");
    }
}
