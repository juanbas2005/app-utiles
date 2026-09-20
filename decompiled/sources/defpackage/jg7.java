package defpackage;

/* renamed from: jg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jg7 {
    public static final jg7 c = new jg7(2, false);
    public static final jg7 d = new jg7(1, true);
    public final int a;
    public final boolean b;

    public jg7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jg7) r5;
     */
    public final boolean equals(Object obj) {
        jg7 jg7;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jg7) && this.a == jg7.a && this.b == jg7.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        if (equals(d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
