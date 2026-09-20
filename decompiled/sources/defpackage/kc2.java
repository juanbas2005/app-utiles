package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: kc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kc2 {
    public final String a;
    public final Map b;

    public kc2(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static kc2 a(String str) {
        return new kc2(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc2)) {
            return false;
        }
        kc2 kc2 = (kc2) obj;
        if (!this.a.equals(kc2.a) || !this.b.equals(kc2.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
