package defpackage;

import android.graphics.Insets;

/* renamed from: ad3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ad3 {
    public static final ad3 e = new ad3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ad3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static ad3 a(ad3 ad3, ad3 ad32) {
        return b(Math.max(ad3.a, ad32.a), Math.max(ad3.b, ad32.b), Math.max(ad3.c, ad32.c), Math.max(ad3.d, ad32.d));
    }

    public static ad3 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new ad3(i, i2, i3, i4);
    }

    public static ad3 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return dn.j(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad3.class != obj.getClass()) {
            return false;
        }
        ad3 ad3 = (ad3) obj;
        if (this.d == ad3.d && this.a == ad3.a && this.c == ad3.c && this.b == ad3.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return f21.j(sb, this.d, '}');
    }
}
