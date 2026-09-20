package defpackage;

/* renamed from: j64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j64 {
    public static final float b = 0.5f;
    public static final float c = -1.0f;
    public static final float d = 1.0f;
    public final float a;

    static {
        a(0.0f);
        a(0.5f);
        a(-1.0f);
        a(1.0f);
    }

    public /* synthetic */ j64(float f) {
        this.a = f;
    }

    public static void a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            zb3.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ")";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j64)) {
            return false;
        }
        if (Float.compare(this.a, ((j64) obj).a) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
