package defpackage;

/* renamed from: m64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m64 {
    public static final m64 d = new m64(j64.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public m64(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m64)) {
            return false;
        }
        m64 m64 = (m64) obj;
        float f = m64.a;
        float f2 = j64.b;
        if (Float.compare(this.a, f) == 0 && this.b == m64.b && this.c == m64.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f = j64.b;
        return Integer.hashCode(this.c) + f21.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String b2 = j64.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i == 0) {
            str = "LineHeightStyle.Trim.None";
        } else {
            str = str2;
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return f21.l(f21.o("LineHeightStyle(alignment=", b2, ", trim=", str, ",mode="), str2, ")");
    }
}
