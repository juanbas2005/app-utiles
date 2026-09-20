package defpackage;

/* renamed from: pr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pr8 implements vr8 {
    public final String a;

    public pr8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pr8) && this.a.equals(((pr8) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return f21.m(new StringBuilder(str.length() + 15), "Error(message=", str, ")");
    }
}
