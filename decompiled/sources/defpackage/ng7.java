package defpackage;

/* renamed from: ng7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ng7 {
    public final long a;
    public final long b;

    public ng7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng7)) {
            return false;
        }
        ng7 ng7 = (ng7) obj;
        if (jt0.c(this.a, ng7.a) && jt0.c(this.b, ng7.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pb4.m("SelectionColors(selectionHandleColor=", jt0.i(this.a), ", selectionBackgroundColor=", jt0.i(this.b), ")");
    }
}
