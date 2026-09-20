package defpackage;

/* renamed from: s00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s00 extends ra2 {
    public final Integer a;

    public s00(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra2)) {
            return false;
        }
        Integer num = this.a;
        s00 s00 = (s00) ((ra2) obj);
        if (num != null) {
            return num.equals(s00.a);
        }
        if (s00.a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Integer num = this.a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return i ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
