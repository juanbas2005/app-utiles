package defpackage;

import java.util.Locale;

/* renamed from: xy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xy2 {
    public final String a;
    public final String b;

    public xy2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xy2)) {
            return false;
        }
        xy2 xy2 = (xy2) obj;
        if (!k57.n0(xy2.a, this.a, true) || !k57.n0(xy2.b, this.b, true)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.a.toLowerCase(locale);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.b.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return f21.l(sb, this.b, ", escapeValue=false)");
    }
}
