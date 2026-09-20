package defpackage;

/* renamed from: ql7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ql7 {
    public static final long b = o55.a(0.5f, 0.5f);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ ql7(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static String b(long j) {
        return f21.g(j, "TransformOrigin(packedValue=", ")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ql7)) {
            return false;
        }
        if (this.a != ((ql7) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
