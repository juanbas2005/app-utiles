package defpackage;

/* renamed from: wu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wu4 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public wu4(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r4 = (defpackage.wu4) r4;
     */
    public final boolean equals(Object obj) {
        wu4 wu4;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof wu4) && this.a == wu4.a && this.b == wu4.b && this.c == wu4.c && this.d == wu4.d && this.e == wu4.e && this.f == wu4.f && this.g == wu4.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wu4.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.g;
        int i2 = this.f;
        if (!(i2 == -1 && i == -1)) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
