package defpackage;

import java.util.LinkedHashMap;

/* renamed from: n52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n52 {
    public static final n52 b = new n52(new nm7((gb2) null, (dv6) null, (cn0) null, (xf6) null, (LinkedHashMap) null, 127));
    public final nm7 a;

    public n52(nm7 nm7) {
        this.a = nm7;
    }

    public final n52 a(n52 n52) {
        nm7 nm7 = n52.a;
        gb2 gb2 = nm7.a;
        nm7 nm72 = this.a;
        if (gb2 == null) {
            gb2 = nm72.a;
        }
        dv6 dv6 = nm7.b;
        if (dv6 == null) {
            dv6 = nm72.b;
        }
        cn0 cn0 = nm7.c;
        if (cn0 == null) {
            cn0 = nm72.c;
        }
        xf6 xf6 = nm7.d;
        if (xf6 == null) {
            xf6 = nm72.d;
        }
        return new n52(new nm7(gb2, dv6, cn0, xf6, sf4.X(nm72.f, nm7.f), 32));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n52) || !((n52) obj).a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(b)) {
            return "EnterTransition.None";
        }
        nm7 nm7 = this.a;
        gb2 gb2 = nm7.a;
        String str4 = null;
        if (gb2 != null) {
            str = gb2.toString();
        } else {
            str = null;
        }
        dv6 dv6 = nm7.b;
        if (dv6 != null) {
            str2 = dv6.toString();
        } else {
            str2 = null;
        }
        cn0 cn0 = nm7.c;
        if (cn0 != null) {
            str3 = cn0.toString();
        } else {
            str3 = null;
        }
        xf6 xf6 = nm7.d;
        if (xf6 != null) {
            str4 = xf6.toString();
        }
        return f21.m(f21.o("EnterTransition: \nFade - ", str, ",\nSlide - ", str2, ",\nShrink - "), str3, ",\nScale - ", str4);
    }
}
