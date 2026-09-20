package defpackage;

/* renamed from: fp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fp7 {
    public final gq3 a;
    public final as3 b;

    public fp7(gq3 gq3, as3 as3) {
        gq3.getClass();
        this.a = gq3;
        this.b = as3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp7)) {
            return false;
        }
        as3 as3 = this.b;
        if (as3 == null) {
            fp7 fp7 = (fp7) obj;
            if (fp7.b == null) {
                return sg3.e(this.a, fp7.a);
            }
        }
        return sg3.e(as3, ((fp7) obj).b);
    }

    public final int hashCode() {
        as3 as3 = this.b;
        if (as3 != null) {
            return as3.hashCode();
        }
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
