package defpackage;

/* renamed from: xv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xv {
    public final vv a;
    public final uv b;
    public final wv c;

    public xv(vv vvVar, uv uvVar, wv wvVar) {
        this.a = vvVar;
        this.b = uvVar;
        this.c = wvVar;
    }

    public static xv a(xv xvVar, vv vvVar, wv wvVar, int i) {
        if ((i & 1) != 0) {
            vvVar = xvVar.a;
        }
        uv uvVar = xvVar.b;
        if ((i & 4) != 0) {
            wvVar = xvVar.c;
        }
        xvVar.getClass();
        return new xv(vvVar, uvVar, wvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        if (this.a.equals(xvVar.a) && this.b.equals(xvVar.b) && this.c.equals(xvVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AuthenticatedApiConfig(context=" + this.a + ", auth=" + this.b + ", request=" + this.c + ')';
    }
}
