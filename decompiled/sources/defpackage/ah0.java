package defpackage;

/* renamed from: ah0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ah0 {
    public static final ah0 n = new ah0(true, false, -1, -1, false, false, false, -1, -1, false, false, false, (String) null);
    public static final ah0 o;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    static {
        xb4 xb4 = u02.x;
        int i2 = Integer.MAX_VALUE;
        y02 y02 = y02.SECONDS;
        long j2 = u02.j(gl0.e0(Integer.MAX_VALUE, y02), y02);
        if (j2 >= 0) {
            if (j2 <= 2147483647L) {
                i2 = (int) j2;
            }
            o = new ah0(false, false, -1, -1, false, false, false, i2, -1, true, false, false, (String) null);
            return;
        }
        h.j(f21.f(j2, "maxStale < 0: "));
    }

    public ah0(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i2;
        this.d = i3;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i4;
        this.i = i5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i2 = this.c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.d;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i4 = this.h;
        if (i4 != -1) {
            sb.append("max-stale=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.i;
        if (i5 != -1) {
            sb.append("min-fresh=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String sb2 = sb.toString();
        this.m = sb2;
        return sb2;
    }
}
