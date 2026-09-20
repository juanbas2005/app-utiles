package defpackage;

/* renamed from: gr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gr6 {
    public final o96 a;
    public final o96 b;
    public final o96 c;
    public final o96 d;
    public final o96 e;
    public final o96 f;
    public final o96 g;
    public final o96 h;

    public gr6() {
        o96 o96 = uq6.a;
        o96 o962 = uq6.b;
        o96 o963 = uq6.c;
        o96 o964 = uq6.d;
        o96 o965 = uq6.f;
        o96 o966 = uq6.e;
        o96 o967 = uq6.g;
        o96 o968 = uq6.h;
        this.a = o96;
        this.b = o962;
        this.c = o963;
        this.d = o964;
        this.e = o965;
        this.f = o966;
        this.g = o967;
        this.h = o968;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr6)) {
            return false;
        }
        gr6 gr6 = (gr6) obj;
        if (sg3.e(this.a, gr6.a) && sg3.e(this.b, gr6.b) && sg3.e(this.c, gr6.c) && sg3.e(this.d, gr6.d) && sg3.e(this.e, gr6.e) && sg3.e(this.f, gr6.f) && sg3.e(this.g, gr6.g) && sg3.e(this.h, gr6.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.g.hashCode();
        return this.h.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ")";
    }
}
