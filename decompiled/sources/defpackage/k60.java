package defpackage;

/* renamed from: k60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k60 implements e05 {
    public final mc2 a;

    public k60(mc2 mc2) {
        this.a = mc2;
    }

    public final bz0 a() {
        return this.a.a();
    }

    public final qd5 b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k60)) {
            return false;
        }
        if (this.a.equals(((k60) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
