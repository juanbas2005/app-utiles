package defpackage;

import java.util.LinkedHashMap;

/* renamed from: ib1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ib1 {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(hb1 hb1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof ib1)) {
            return false;
        }
        if (sg3.e(this.a, ((ib1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
