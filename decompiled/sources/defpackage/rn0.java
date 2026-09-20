package defpackage;

/* renamed from: rn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rn0 {
    public static final qn0 b = new Object();
    public final Object a;

    public /* synthetic */ rn0(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (!(obj instanceof qn0)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rn0)) {
            return false;
        }
        if (!sg3.e(this.a, ((rn0) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof pn0) {
            return ((pn0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
