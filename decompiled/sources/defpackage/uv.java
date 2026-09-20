package defpackage;

/* renamed from: uv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uv {
    public final boolean a;
    public final f96 b;

    public uv(boolean z, f96 f96) {
        this.a = z;
        this.b = f96;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        uv uvVar = (uv) obj;
        if (this.a == uvVar.a && this.b.equals(uvVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "Auth(requireSession=" + this.a + ", getAccessToken=" + this.b + ", jwtToken=null)";
    }
}
