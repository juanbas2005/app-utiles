package defpackage;

/* renamed from: nl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nl3 {
    public final Integer a;
    public final Object b;

    public nl3(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl3)) {
            return false;
        }
        nl3 nl3 = (nl3) obj;
        if (this.a.equals(nl3.a) && sg3.e(this.b, nl3.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj instanceof Enum) {
            i = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return i + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ")";
    }
}
