package defpackage;

/* renamed from: mf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mf7 {
    public static final mf7 c = new mf7(ya5.k(0), ya5.k(0));
    public final long a;
    public final long b;

    public mf7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf7)) {
            return false;
        }
        mf7 mf7 = (mf7) obj;
        if (wg7.a(this.a, mf7.a) && wg7.a(this.b, mf7.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        xg7[] xg7Arr = wg7.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pb4.m("TextIndent(firstLine=", wg7.d(this.a), ", restLine=", wg7.d(this.b), ")");
    }
}
