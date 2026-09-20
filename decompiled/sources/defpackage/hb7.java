package defpackage;

import java.util.Map;

/* renamed from: hb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hb7 {
    public static final hb7 b = new hb7(b42.w);
    public final Map a;

    public hb7(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb7)) {
            return false;
        }
        if (sg3.e(this.a, ((hb7) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.a + ')';
    }
}
