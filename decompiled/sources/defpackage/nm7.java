package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: nm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nm7 {
    public final gb2 a;
    public final dv6 b;
    public final cn0 c;
    public final xf6 d;
    public final boolean e;
    public final Map f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ nm7(gb2 gb2, dv6 dv6, cn0 cn0, xf6 xf6, LinkedHashMap linkedHashMap, int i) {
        this(gb2, dv6, cn0, xf6, r0, (i & 64) != 0 ? b42.w : linkedHashMap);
        boolean z;
        gb2 = (i & 1) != 0 ? null : gb2;
        dv6 = (i & 2) != 0 ? null : dv6;
        cn0 = (i & 4) != 0 ? null : cn0;
        xf6 = (i & 8) != 0 ? null : xf6;
        if ((i & 32) != 0) {
            z = false;
        } else {
            z = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm7)) {
            return false;
        }
        nm7 nm7 = (nm7) obj;
        if (sg3.e(this.a, nm7.a) && sg3.e(this.b, nm7.b) && sg3.e(this.c, nm7.c) && sg3.e(this.d, nm7.d) && this.e == nm7.e && sg3.e(this.f, nm7.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        gb2 gb2 = this.a;
        if (gb2 == null) {
            i = 0;
        } else {
            i = gb2.hashCode();
        }
        int i5 = i * 31;
        dv6 dv6 = this.b;
        if (dv6 == null) {
            i2 = 0;
        } else {
            i2 = dv6.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        cn0 cn0 = this.c;
        if (cn0 == null) {
            i3 = 0;
        } else {
            i3 = cn0.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        xf6 xf6 = this.d;
        if (xf6 != null) {
            i4 = xf6.hashCode();
        }
        return this.f.hashCode() + hl6.i((i7 + i4) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public nm7(gb2 gb2, dv6 dv6, cn0 cn0, xf6 xf6, boolean z, Map map) {
        this.a = gb2;
        this.b = dv6;
        this.c = cn0;
        this.d = xf6;
        this.e = z;
        this.f = map;
    }
}
