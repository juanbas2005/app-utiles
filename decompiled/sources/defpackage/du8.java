package defpackage;

/* renamed from: du8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class du8 {
    public final String a;
    public final Class b;
    public final boolean c;

    public du8(String str, Class cls, boolean z, int i) {
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            h.q("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char charAt2 = str.charAt(i2);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                h.q("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        System.identityHashCode(this);
        for (int i3 = 0; i3 < 5; i3++) {
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        f21.v(sb, name, "/", str, "[");
        return f21.l(sb, name2, "]");
    }
}
