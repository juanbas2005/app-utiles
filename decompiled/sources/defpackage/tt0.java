package defpackage;

/* renamed from: tt0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tt0 {
    public final String a;
    public final long b;
    public final int c;

    public tt0(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            h.q("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        } else if (i < -1 || i > 63) {
            h.q("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tt0 tt0 = (tt0) obj;
        if (this.c == tt0.c && this.a.equals(tt0.a)) {
            return dh4.m(this.b, tt0.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, tt0 tt0);

    public int hashCode() {
        return pb4.b(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        String H = dh4.H(this.b);
        return this.a + " (id=" + this.c + ", model=" + H + ")";
    }
}
