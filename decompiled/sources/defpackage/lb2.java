package defpackage;

import java.util.HashMap;

/* renamed from: lb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lb2 {
    public final HashMap a;
    public final boolean b;
    public final boolean c;

    public lb2(HashMap hashMap, boolean z, boolean z2) {
        this.a = hashMap;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb2)) {
            return false;
        }
        lb2 lb2 = (lb2) obj;
        if (this.a.equals(lb2.a) && this.b == lb2.b && this.c == lb2.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hl6.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FakeOverrideMembers(members=" + this.a + ", containsInheritedStatics=" + this.b + ", containsPackagePrivate=" + this.c + ')';
    }
}
