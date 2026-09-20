package defpackage;

import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: nm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nm3 extends JsonPrimitive {
    public final boolean w;
    public final ll6 x;
    public final String y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nm3(Object obj, boolean z, ll6 ll6) {
        super((hl1) null);
        obj.getClass();
        this.w = z;
        this.x = ll6;
        this.y = obj.toString();
        if (ll6 != null && !ll6.j()) {
            h.q("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nm3.class != obj.getClass()) {
            return false;
        }
        nm3 nm3 = (nm3) obj;
        if (this.w == nm3.w && sg3.e(this.y, nm3.y)) {
            return true;
        }
        return false;
    }

    public final String getContent() {
        return this.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + (Boolean.hashCode(this.w) * 31);
    }

    public final boolean isString() {
        return this.w;
    }

    public final String toString() {
        boolean z = this.w;
        String str = this.y;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        r47.a(str, sb);
        return sb.toString();
    }
}
