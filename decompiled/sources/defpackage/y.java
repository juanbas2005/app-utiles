package defpackage;

/* renamed from: y  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y extends o75 {
    public static final y w = new Object();

    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean b() {
        return false;
    }

    public final Object c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
