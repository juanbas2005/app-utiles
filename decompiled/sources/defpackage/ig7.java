package defpackage;

/* renamed from: ig7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ig7 {
    public final int a;

    public /* synthetic */ ig7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ig7) && this.a == ((ig7) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        if (i == 3) {
            return "Linearity.None";
        }
        return "Invalid";
    }
}
