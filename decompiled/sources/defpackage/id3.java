package defpackage;

/* renamed from: id3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class id3 implements la5 {
    public final aa8 a;
    public final tp1 b;

    public id3(aa8 aa8, q67 q67) {
        this.a = aa8;
        this.b = q67;
    }

    public final float a() {
        aa8 aa8 = this.a;
        tp1 tp1 = this.b;
        return tp1.P(aa8.c(tp1));
    }

    public final float b(ey3 ey3) {
        aa8 aa8 = this.a;
        tp1 tp1 = this.b;
        return tp1.P(aa8.d(tp1, ey3));
    }

    public final float c(ey3 ey3) {
        aa8 aa8 = this.a;
        tp1 tp1 = this.b;
        return tp1.P(aa8.b(tp1, ey3));
    }

    public final float d() {
        aa8 aa8 = this.a;
        tp1 tp1 = this.b;
        return tp1.P(aa8.a(tp1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id3)) {
            return false;
        }
        id3 id3 = (id3) obj;
        if (!sg3.e(this.a, id3.a) || !sg3.e(this.b, id3.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
