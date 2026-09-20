package defpackage;

/* renamed from: wp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wp7 {
    public final qp7 a;
    public final wj3 b;

    public wp7(qp7 qp7, wj3 wj3) {
        qp7.getClass();
        wj3.getClass();
        this.a = qp7;
        this.b = wj3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wp7)) {
            return false;
        }
        wp7 wp7 = (wp7) obj;
        if (!sg3.e(wp7.a, this.a) || !sg3.e(wp7.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.b.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
