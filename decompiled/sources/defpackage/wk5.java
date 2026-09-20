package defpackage;

/* renamed from: wk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wk5 {
    public final int a;

    public /* synthetic */ wk5(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i == 3) {
            return "Stylus";
        }
        if (i != 4) {
            return "Unknown";
        }
        return "Eraser";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wk5) && this.a == ((wk5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
