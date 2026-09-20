package defpackage;

/* renamed from: e64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e64 implements aa8 {
    public final aa8 a;
    public final int b;

    public e64(aa8 aa8, int i) {
        this.a = aa8;
        this.b = i;
    }

    public final int a(tp1 tp1) {
        if ((this.b & 16) != 0) {
            return this.a.a(tp1);
        }
        return 0;
    }

    public final int b(tp1 tp1, ey3 ey3) {
        int i;
        if (ey3 == ey3.w) {
            i = 4;
        } else {
            i = 1;
        }
        if ((i & this.b) != 0) {
            return this.a.b(tp1, ey3);
        }
        return 0;
    }

    public final int c(tp1 tp1) {
        if ((this.b & 32) != 0) {
            return this.a.c(tp1);
        }
        return 0;
    }

    public final int d(tp1 tp1, ey3 ey3) {
        int i;
        if (ey3 == ey3.w) {
            i = 8;
        } else {
            i = 2;
        }
        if ((i & this.b) != 0) {
            return this.a.d(tp1, ey3);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e64)) {
            return false;
        }
        e64 e64 = (e64) obj;
        if (!sg3.e(this.a, e64.a) || this.b != e64.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = h75.c;
        if ((i & i2) == i2) {
            h75.x("Start", sb);
        }
        int i3 = h75.e;
        if ((i & i3) == i3) {
            h75.x("Left", sb);
        }
        if ((i & 16) == 16) {
            h75.x("Top", sb);
        }
        int i4 = h75.d;
        if ((i & i4) == i4) {
            h75.x("End", sb);
        }
        int i5 = h75.f;
        if ((i & i5) == i5) {
            h75.x("Right", sb);
        }
        if ((i & 32) == 32) {
            h75.x("Bottom", sb);
        }
        String h = f21.h("WindowInsetsSides(", sb.toString(), ")");
        return "(" + this.a + " only " + h + ")";
    }
}
