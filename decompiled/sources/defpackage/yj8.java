package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: yj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yj8 {
    public static final zf8 b = new zf8(3);
    public static final yj8 c = new yj8(new xj8());
    public final xj8 a;

    static {
        List list = Collections.EMPTY_LIST;
    }

    public yj8(xj8 xj8) {
        this.a = xj8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yj8) || !((yj8) obj).a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
