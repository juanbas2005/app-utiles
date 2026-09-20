package kotlinx.datetime;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g extends w94 {
    public static final g z = new w94(new LocalDate(1970, 1, 2), new LocalDate(1970, 1, 1));

    public final boolean isEmpty() {
        if (this.x.compareTo(this.y) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.x + ".." + this.y;
    }
}
