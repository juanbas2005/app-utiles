package defpackage;

import java.util.Map;

/* renamed from: lt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lt3 {
    public final String a;
    public final Map b;

    public lt3(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt3)) {
            return false;
        }
        lt3 lt3 = (lt3) obj;
        if (!sg3.e(this.a, lt3.a) || !this.b.equals(lt3.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String E0 = dt0.E0(sf4.Z(this.b), (String) null, (String) null, (String) null, jo3.H, 31);
        return "@" + this.a + '(' + E0 + ')';
    }
}
