package defpackage;

import java.util.Iterator;

/* renamed from: id9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class id9 {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public id9(String str, Class cls, boolean z, boolean z2) {
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            h.q("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                h.q("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        this.d = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.e = j;
    }

    public void a(Iterator it, ud9 ud9) {
        while (it.hasNext()) {
            b(it.next(), ud9);
        }
    }

    public void b(Object obj, ud9 ud9) {
        ud9.a(this.a, obj);
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
