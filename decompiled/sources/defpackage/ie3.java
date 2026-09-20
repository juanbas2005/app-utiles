package defpackage;

/* renamed from: ie3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ie3 {
    public final long a;

    public /* synthetic */ ie3(long j) {
        this.a = j;
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ie3)) {
            return false;
        }
        if (this.a != ((ie3) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return f21.j(sb, (int) (j & 4294967295L), ')');
    }
}
