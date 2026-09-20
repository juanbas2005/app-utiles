package defpackage;

/* renamed from: lx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lx1 implements Comparable {
    public final float w;

    public /* synthetic */ lx1(float f) {
        this.w = f;
    }

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public final int compareTo(Object obj) {
        return a(this.w, ((lx1) obj).w);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lx1)) {
            return false;
        }
        if (Float.compare(this.w, ((lx1) obj).w) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.w);
    }

    public final String toString() {
        return c(this.w);
    }
}
