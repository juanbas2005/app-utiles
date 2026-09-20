package defpackage;

/* renamed from: un0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class un0 implements CharSequence {
    public final int w;
    public final int x;
    public String y;
    public final /* synthetic */ wn0 z;

    public un0(wn0 wn0, int i, int i2) {
        this.z = wn0;
        this.w = i;
        this.x = i2;
    }

    public final char charAt(int i) {
        int i2 = this.w + i;
        if (i < 0) {
            h.j(hl6.k(i, "index is negative: "));
            return 0;
        } else if (i2 < this.x) {
            return this.z.c(i2);
        } else {
            StringBuilder o = pb4.o(i, "index (", ") should be less than length (");
            o.append(length());
            o.append(')');
            throw new IllegalArgumentException(o.toString().toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == length()) {
                int length = length();
                for (int i = 0; i < length; i++) {
                    if (this.z.c(this.w + i) != charSequence.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.y;
        if (str != null) {
            return str.hashCode();
        }
        int i = 0;
        for (int i2 = this.w; i2 < this.x; i2++) {
            i = (i * 31) + this.z.c(i2);
        }
        return i;
    }

    public final int length() {
        return this.x - this.w;
    }

    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            h.j(hl6.k(i, "start is negative: "));
            return null;
        } else if (i <= i2) {
            int i3 = this.x;
            int i4 = this.w;
            if (i2 > i3 - i4) {
                ta1.k(length(), 41, "end should be less than length (");
                return null;
            } else if (i == i2) {
                return "";
            } else {
                return new un0(this.z, i + i4, i4 + i2);
            }
        } else {
            h.h(i, i2, ") should be less or equal to end (", "start (");
            return null;
        }
    }

    public final String toString() {
        String str = this.y;
        if (str != null) {
            return str;
        }
        String obj = this.z.b(this.w, this.x).toString();
        this.y = obj;
        return obj;
    }
}
