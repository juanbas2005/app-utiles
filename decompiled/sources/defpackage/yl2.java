package defpackage;

/* renamed from: yl2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yl2 {
    public final int a;

    public /* synthetic */ yl2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof yl2) && this.a == ((yl2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}
