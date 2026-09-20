package defpackage;

/* renamed from: cw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cw1 {
    public final int a;

    public /* synthetic */ cw1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cw1) && this.a == ((cw1) obj).a) {
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
            return "Picker";
        }
        if (i == 1) {
            return "Input";
        }
        return "Unknown";
    }
}
