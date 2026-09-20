package defpackage;

/* renamed from: n00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n00 {
    public final Object a;
    public final to5 b;
    public final h10 c;

    public n00(Object obj, to5 to5, h10 h10) {
        this.a = obj;
        this.b = to5;
        this.c = h10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00 = (n00) obj;
        if (!this.a.equals(n00.a) || !this.b.equals(n00.b)) {
            return false;
        }
        h10 h10 = n00.c;
        h10 h102 = this.c;
        if (h102 == null) {
            if (h10 == null) {
                return true;
            }
            return false;
        } else if (h102.equals(h10)) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        h10 h10 = this.c;
        if (h10 == null) {
            i = 0;
        } else {
            i = h10.hashCode();
        }
        return (i ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
