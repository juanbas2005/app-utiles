package defpackage;

/* renamed from: ih5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ih5 implements pd5 {
    public final String a;

    public ih5(String str) {
        str.getClass();
        this.a = str;
        if (str.length() <= 0) {
            h.q("Empty string is not allowed");
            throw null;
        } else if (fb5.m(str.charAt(0))) {
            h.j(f21.h("String '", str, "' starts with a digit"));
            throw null;
        } else if (fb5.m(str.charAt(str.length() - 1))) {
            h.j(f21.h("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    public final Object a(d71 d71, CharSequence charSequence, int i) {
        charSequence.getClass();
        String str = this.a;
        if (str.length() + i > charSequence.length()) {
            return new ld5(i, new hx4(6, this));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return new ld5(i, new k33(this, charSequence, i, i2));
            }
        }
        return Integer.valueOf(str.length() + i);
    }

    public final String toString() {
        return hl6.o(new StringBuilder("'"), this.a, '\'');
    }
}
