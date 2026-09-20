package defpackage;

/* renamed from: xn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xn5 extends o75 {
    public final Object w;

    public xn5(Object obj) {
        this.w = obj;
    }

    public final Object a() {
        return this.w;
    }

    public final boolean b() {
        return true;
    }

    public final Object c() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xn5) {
            return this.w.equals(((xn5) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.w);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
