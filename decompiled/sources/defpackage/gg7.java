package defpackage;

/* renamed from: gg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gg7 {
    public final yy6 a;
    public final yy6 b;
    public final yy6 c;
    public final yy6 d;

    public gg7(yy6 yy6, yy6 yy62, yy6 yy63, yy6 yy64) {
        this.a = yy6;
        this.b = yy62;
        this.c = yy63;
        this.d = yy64;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gg7)) {
            return false;
        }
        gg7 gg7 = (gg7) obj;
        if (sg3.e(this.a, gg7.a) && sg3.e(this.b, gg7.b) && sg3.e(this.c, gg7.c) && sg3.e(this.d, gg7.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        yy6 yy6 = this.a;
        if (yy6 != null) {
            i = yy6.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        yy6 yy62 = this.b;
        if (yy62 != null) {
            i2 = yy62.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        yy6 yy63 = this.c;
        if (yy63 != null) {
            i3 = yy63.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        yy6 yy64 = this.d;
        if (yy64 != null) {
            i4 = yy64.hashCode();
        }
        return i7 + i4;
    }
}
