package defpackage;

/* renamed from: v16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v16 {
    public final Class a;
    public final hv3 b;

    public v16(Class cls, hv3 hv3) {
        this.a = cls;
        this.b = hv3;
    }

    public final String a() {
        String replace = this.a.getName().replace('.', '/');
        replace.getClass();
        return replace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v16)) {
            return false;
        }
        if (sg3.e(this.a, ((v16) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v16.class.getName() + ": " + this.a;
    }
}
