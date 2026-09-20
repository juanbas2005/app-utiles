package kotlinx.datetime;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i extends tf8 {
    public static final i z = new tf8(new YearMonth(0, 2), new YearMonth(0, 1));

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
