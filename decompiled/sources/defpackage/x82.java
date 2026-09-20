package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: x82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x82 {
    public static final x82 b = new x82(new nm7((gb2) null, (dv6) null, (cn0) null, (xf6) null, (LinkedHashMap) null, 127));
    public static final x82 c = new x82(new nm7((gb2) null, (dv6) null, (cn0) null, (xf6) null, (LinkedHashMap) null, 95));
    public final nm7 a;

    public x82(nm7 nm7) {
        this.a = nm7;
    }

    public final x82 a(x82 x82) {
        boolean z;
        nm7 nm7 = x82.a;
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
        if (nm7.e || nm72.e) {
            z = true;
        } else {
            z = false;
        }
        return new x82(new nm7(gb2, dv6, cn0, xf6, z, (Map) sf4.X(nm72.f, nm7.f)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x82) || !((x82) obj).a.equals(this.a)) {
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
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
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
        boolean z = nm7.e;
        StringBuilder o = f21.o("ExitTransition: \nFade - ", str, ",\nSlide - ", str2, ",\nShrink - ");
        f21.v(o, str3, ",\nScale - ", str4, ",\nKeepUntilTransitionsFinished - ");
        o.append(z);
        return o.toString();
    }
}
